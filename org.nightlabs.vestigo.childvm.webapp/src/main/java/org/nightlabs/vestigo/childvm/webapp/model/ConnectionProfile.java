/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.childvm.webapp.model;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.nightlabs.progress.NullProgressMonitor;
import org.nightlabs.util.IOUtil;
import org.nightlabs.util.Util;
import org.nightlabs.util.reflect.ReflectUtil;
import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;
import org.nightlabs.vestigo.childvm.shared.classloader.ClassLoaderManager;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.PersistablePropertyDTO;
import org.nightlabs.vestigo.childvm.shared.persistencexml.PersistenceUnitHelper;
import org.nightlabs.vestigo.childvm.shared.persistencexml.PersistenceXml;
import org.nightlabs.vestigo.childvm.shared.persistencexml.PersistenceXmlScanner;
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.Persistence;
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.Persistence.PersistenceUnit;
import org.nightlabs.vestigo.childvm.webapp.asm.ClassAnnotationReader;
import org.nightlabs.vestigo.childvm.webapp.script.Scope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class ConnectionProfile
{
	private static final Logger logger = LoggerFactory.getLogger(ConnectionProfile.class);

	private static final String CLASS_SUFFIX = ".class";

	private String profileID;
	private Properties connectionProperties;

	private File tempDir;

	private ClassLoaderManager classLoaderManager = new ClassLoaderManager();
	private String syntheticPersistenceUnitName;

	private Scope connectionProfileScope;

	private SortedSet<String> queryableCandidateClasses;

	public ConnectionProfile() {
		logger.debug("[{}].<init>: created new instance of {}", Long.toHexString(System.identityHashCode(this)), this.getClass().getName());
//		classLoaderManager.setConnectionProfile(this);
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				File td = tempDir;
				if (td != null)
					IOUtil.deleteDirectoryRecursively(td);
			}
		});
	}

	public final synchronized void fromConnectionProfileDTO(ConnectionProfileDTO dto)
	{
		this.profileID = dto.getProfileID();

		logger.debug("[{}].fromConnectionProfileDTO: profileID={}", Long.toHexString(System.identityHashCode(this)), this.profileID);

		this.connectionProperties = new Properties();
		for (Map.Entry<String, String> me : dto.getConnectionProperties().entrySet()) {
			this.connectionProperties.setProperty(me.getKey(), me.getValue());
		}
		_fromConnectionProfileDTO(dto);
	}

	protected void _fromConnectionProfileDTO(ConnectionProfileDTO dto) { }

	public synchronized ConnectionProfileDTO toConnectionProfileDTO() {
		ConnectionProfileDTO dto = newConnectionProfileDTO();
		dto.setProfileID(profileID);
		if (connectionProperties != null) {
			for (Map.Entry<?, ?> me : connectionProperties.entrySet())
				dto.getConnectionProperties().put(me.getKey() == null ? null : me.getKey().toString(), me.getValue() == null ? null : me.getValue().toString());
		}
		return dto;
	}

	public String getProfileID() {
		return profileID;
	}

	public Properties getConnectionProperties() {
		return connectionProperties;
	}

	protected abstract ConnectionProfileDTO newConnectionProfileDTO();

	private Set<Connection> openConnections = new HashSet<Connection>();

	public synchronized void onConnectionOpen(Connection connection)
	{
		logger.debug(
				"[{}].onConnectionOpen: profileID={} connectionID={}",
				new Object[] { Long.toHexString(System.identityHashCode(this)), profileID, connection.getConnectionID() }
		);

		boolean successful = false;
		try {
			if (openConnections.isEmpty()) {
				onFirstConnectionOpen(connection);
			}
			openConnections.add(connection);
			successful = true;
		} finally {
			if (! successful) {
				try {
					onConnectionClose(connection);
				} catch (Throwable closeEx) {
					logger.warn("onConnectionOpen: Closing partially opened connection failed: " + closeEx, closeEx);
				}
			}
		}
	}

	protected void onFirstConnectionOpen(Connection connection) {
		logger.debug(
				"[{}].onFirstConnectionOpen: profileID={} connectionID={}",
				new Object[] { Long.toHexString(System.identityHashCode(this)), profileID, connection.getConnectionID() }
		);

		queryableCandidateClasses = null;
		connectionProfileScope = new Scope();

		try {
			File userTempDir = IOUtil.getUserTempDir("vestigo." + ConnectionProfile.class.getSimpleName() + '.', null);
			tempDir = IOUtil.createUniqueIncrementalFolder(userTempDir, "instance-");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		if (isPersistenceUnitSyntheticOverride()) {
			logger.info(
					"[{}].onFirstConnectionOpen: profileID={} connectionID={}: persistenceUnitSyntheticOverride is active. Creating synthetic PU.",
					new Object[] { Long.toHexString(System.identityHashCode(this)), profileID, connection.getConnectionID() }
			);
			initSyntheticPersistenceUnit();
		}

		classLoaderManager.open(connectionProperties);
		checkConnectionDriverName();
	}

	protected abstract String getConnectionDriverName();

	protected void checkConnectionDriverName()
	{
		String connectionDriverName = getConnectionDriverName();
		if (connectionDriverName == null || connectionDriverName.isEmpty()) {
			logger.debug(
					"[{}].checkConnectionDriverName: No connectionDriverName specified (or not using the standard property). Skipping check.",
					Long.toHexString(System.identityHashCode(this))
			);
			return;
		}

		try {
			ClassLoader persistenceEngineClassLoader = classLoaderManager.getPersistenceEngineClassLoader(new NullProgressMonitor());
			Class<?> connectionDriverClass = Class.forName(connectionDriverName, true, persistenceEngineClassLoader);
			if (!java.sql.Driver.class.isAssignableFrom(connectionDriverClass)) {
				// We do *not* throw an exception, because the connection might not be a JDBC connection
				// (DataNucleus supports e.g. db4o and many other non-JDBC-backends). Thus, we only log a warning.
				logger.warn(
						"[{}].checkConnectionDriverName: {} does not implement {}!",
						new Object[] { Long.toHexString(System.identityHashCode(this)), connectionDriverName, java.sql.Driver.class.getName() }
				);
			}
		} catch (Throwable e) {
			logger.warn("[" + Long.toHexString(System.identityHashCode(this)) + "].checkConnectionDriverName: " + e, e);
		}
	}

	private void initSyntheticPersistenceUnit()
	{
		syntheticPersistenceUnitName = null;
		String persistenceUnitName = getPersistenceUnitName();
		if (persistenceUnitName == null) {
			logger.warn(
					"[{}].initSyntheticPersistenceUnit: profileID={}: persistenceUnitSyntheticOverride is active, but there is no persistenceUnitName specified! Cannot create synthetic PU!",
					new Object[] { Long.toHexString(System.identityHashCode(this)), profileID }
			);
			return;
		}

		PersistenceXmlScanner scanner = new PersistenceXmlScanner();
		scanner.open(connectionProperties);
		try {
			Collection<PersistenceXml> persistenceXmls = scanner.searchPersistenceXmls(null);
			for (PersistenceXml persistenceXml : persistenceXmls) {
				List<PersistenceUnit> persistenceUnits = persistenceXml.getPersistence().getPersistenceUnit();
				for (PersistenceUnit persistenceUnit : persistenceUnits) {
					if (persistenceUnitName.equals(persistenceUnit.getName())) {
						initSyntheticPersistenceUnit(persistenceXml, persistenceUnit);
						return;
					}
				}
			}
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			scanner.close();
		}
	}

	private void initSyntheticPersistenceUnit(PersistenceXml persistenceXml, PersistenceUnit persistenceUnit) throws IOException, JAXBException
	{
		logger.info(
				"[{}].initSyntheticPersistenceUnit: profileID={}: Found original persistenceUnit at classpathURL={}",
				new Object[] { Long.toHexString(System.identityHashCode(this)), profileID, persistenceXml.getClasspathURL() }
		);

		Properties rawPersistenceProperties = PropertiesUtil.getProperties(connectionProperties, PropertiesUtil.PREFIX_PERSISTENCE);
		Map<String, String> filteredPersistenceProperties = filterPersistenceProperties(rawPersistenceProperties);

		Persistence newPersistence = new Persistence();
		newPersistence.setVersion(persistenceXml.getPersistence().getVersion());
		PersistenceUnit newPersistenceUnit = Util.cloneSerializable(persistenceUnit);
		syntheticPersistenceUnitName = newPersistenceUnit.getName() + "_" + Long.toString(System.currentTimeMillis(), 36);
		newPersistenceUnit.setName(syntheticPersistenceUnitName);
		newPersistence.getPersistenceUnit().add(newPersistenceUnit);
		getPersistenceUnitHelper().populatePersistenceUnitFromProperties(newPersistenceUnit, filteredPersistenceProperties);

		File classpathDir = new File(tempDir, "overlay-classpath");
		File metaInfDir = new File(classpathDir, PersistenceXmlScanner.META_INF);
		metaInfDir.mkdirs();
		if (!metaInfDir.isDirectory())
			throw new IOException("Could not create directory: " + metaInfDir.getAbsolutePath());

		File persistenceXmlFile = new File(metaInfDir, PersistenceXmlScanner.PERSISTENCE_XML);

		JAXBContext context = JAXBContext.newInstance(Persistence.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
		marshaller.marshal(newPersistence, persistenceXmlFile);

		if (logger.isDebugEnabled()) {
			String syntheticPersistenceXmlText = IOUtil.readTextFile(persistenceXmlFile).trim();
			logger.debug(
					"[{}].initSyntheticPersistenceUnit: \n********************\n{}\n********************",
					Long.toHexString(System.identityHashCode(this)), syntheticPersistenceXmlText
			);
		}

		classLoaderManager.getPersistenceEngineOverlayClasspathURLList().clear();
		classLoaderManager.getPersistenceEngineOverlayClasspathURLList().add(classpathDir.toURI().toURL());
	}

	protected abstract PersistenceUnitHelper getPersistenceUnitHelper();

	public synchronized void onConnectionClose(Connection connection) {
		logger.debug(
				"[{}].onConnectionClose: profileID={} connectionID={}",
				new Object[] { Long.toHexString(System.identityHashCode(this)), profileID, connection.getConnectionID() }
		);

		openConnections.remove(connection);
		if (openConnections.isEmpty()) {
			onLastConnectionClose(connection);
		}
	}

	protected void onLastConnectionClose(Connection connection) {
		logger.debug(
				"[{}].onLastConnectionClose: profileID={} connectionID={}",
				new Object[] { Long.toHexString(System.identityHashCode(this)), profileID, connection.getConnectionID() }
		);

		connectionProfileScope = null;
		classLoaderManager.close();
		syntheticPersistenceUnitName = null;
		queryableCandidateClasses = null;

		File tempDir = this.tempDir;
		if (tempDir != null) {
			IOUtil.deleteDirectoryRecursively(tempDir);
			this.tempDir = null;
		}
	}

	public ClassLoaderManager getClassLoaderManager() {
		return classLoaderManager;
	}

	protected boolean isPersistenceUnitSyntheticOverride() {
		if (connectionProperties == null)
			return false;

		return Boolean.parseBoolean(connectionProperties.getProperty(PropertiesUtil.PERSISTENCE_UNIT_SYNTHETIC_OVERRIDE));
	}

	protected String getPersistenceUnitName()
	{
		if (syntheticPersistenceUnitName != null)
			return syntheticPersistenceUnitName;

		if (connectionProperties == null)
			return null;

		return connectionProperties.getProperty(PropertiesUtil.PERSISTENCE_UNIT_NAME);
	}

	protected Map<String, String> filterPersistenceProperties(Map<?, ?> rawPersistenceProperties) {
		return PropertiesUtil.filterProperties(rawPersistenceProperties, System.getProperties());
	}

	protected void collectQueryableCandidateClassesInDirectory(Collection<String> classes, ClassLoader classLoader, File classpathDirectory) throws IOException
	{
		collectQueryableCandidateClassesInDirectoryRecursively(classes, classLoader, classpathDirectory, classpathDirectory);
	}

	protected void collectQueryableCandidateClassesInDirectoryRecursively(Collection<String> classes, ClassLoader classLoader, File classpathDirectory, File fileOrDir) throws IOException
	{
		if (fileOrDir.isFile() && fileOrDir.getName().endsWith(CLASS_SUFFIX)) {
			ClassAnnotationReader classAnnotationReader = getClassAnnotationReader();
			classAnnotationReader.read(fileOrDir);
			if (isQueryableCandidateClass(classAnnotationReader)) {
				String className = classAnnotationReader.getClassName();
//				Class<?> clazz = null;
//				try {
//					clazz = classLoader.loadClass(className);
//				} catch (Throwable t) {
//					logger.error("collectQueryableCandidateClassesInDirectoryRecursively: classpathDirectory='" + classpathDirectory.getAbsolutePath() + "' className=" + className + ": " + t, t);
//				}
//				if (clazz != null)
//					classes.add(clazz);
				classes.add(className);
			}
		}
		else {
			File[] children = fileOrDir.listFiles();
			if (children != null) {
				for (File child : children)
					collectQueryableCandidateClassesInDirectoryRecursively(classes, classLoader, classpathDirectory, child);
			}
		}
	}

	protected void collectQueryableCandidateClassesInZip(Collection<String> classes, ClassLoader classLoader, URL url) throws IOException
	{
		InputStream in = url.openStream();
		try {
			ZipInputStream zin = new ZipInputStream(in);
			ZipEntry zipEntry;
			while (null != (zipEntry = zin.getNextEntry())) {
				String name = zipEntry.getName();
				if (!name.endsWith(CLASS_SUFFIX))
					continue;

				ClassAnnotationReader classAnnotationReader = getClassAnnotationReader();
				classAnnotationReader.read(zin);
				if (!isQueryableCandidateClass(classAnnotationReader))
					continue;

				String className = classAnnotationReader.getClassName();

//				Class<?> clazz = null;
//				try {
//					clazz = classLoader.loadClass(className);
//				} catch (Throwable t) {
//					logger.error("collectQueryableCandidateClassesInZip: url=" + url + " className=" + className + ": " + t, t);
//				}
//				if (clazz != null)
//					classes.add(clazz);

				classes.add(className);
			}
		} finally {
			in.close();
		}
	}

	public Scope getConnectionProfileScope() {
		return connectionProfileScope;
	}

	protected ClassAnnotationReader getClassAnnotationReader() {
		return new ClassAnnotationReader();
	}

	protected abstract boolean isQueryableCandidateClass(ClassAnnotationReader classAnnotationReader);

	public synchronized SortedSet<String> getQueryableCandidateClasses() throws IOException
	{
		SortedSet<String> classes = this.queryableCandidateClasses;
		if (classes == null) {
			long startTimestamp = System.currentTimeMillis();
			ClassLoader classLoader = classLoaderManager.getPersistenceEngineClassLoader(null);

			classes = new TreeSet<String>();

			List<URL> classpathURLs = classLoaderManager.getPersistenceEngineClasspathURLList(null);
			for (URL url : classpathURLs) {
				try {
					if ("file".equals(url.getProtocol())) {
						File file = new File(url.toURI());
						if (file.isDirectory()) {
							collectQueryableCandidateClassesInDirectory(classes, classLoader, file);
							continue;
						}
					}

					collectQueryableCandidateClassesInZip(classes,classLoader, url);
				} catch (Exception x) {
					logger.error("getQueryableCandidateClasses: url=" + url + ": " + x, x);
				}
			}

			if (logger.isDebugEnabled())
				logger.debug("getQueryableCandidateClasses: Scanning classpath took {} ms.", System.currentTimeMillis() - startTimestamp);

			classes = Collections.unmodifiableSortedSet(classes);
			this.queryableCandidateClasses = classes;
		}
		return classes;
	}

	protected boolean isPersistableField(Field field) {
		// We check for the prefix 'jdo' in both JDO and JPA, because DataNucleus enhances JPA entities
		// according to the JDO standard (which is allowed in JPA, because JPA does not specify the enhancement
		// (while JDO does)).
		return !field.getName().startsWith("jdo");
	}

	protected Class<? extends Annotation> getAnnotationClass(String name) {
		try {
			ClassLoader peClassLoader = getClassLoaderManager().getPersistenceEngineClassLoader(new NullProgressMonitor());
			@SuppressWarnings("unchecked")
			Class<? extends Annotation> annotationClass = (Class<? extends Annotation>) peClassLoader.loadClass(name);
			return annotationClass;
		} catch (IOException x) {
			throw new RuntimeException(x);
		} catch (ClassNotFoundException x) {
			throw new RuntimeException(x);
		}
	}

	protected Object getAnnotationAttributeValue(Annotation annotation, String annotationAttributeName) {
		return invokeGetter(annotation, annotationAttributeName);
	}

	protected String getAnnotationAttributeEnumName(Annotation annotation, String annotationAttributeName) {
		Object enumInstance = getAnnotationAttributeValue(annotation, annotationAttributeName);
		if (enumInstance == null)
			return null;

		if (!(enumInstance instanceof Enum<?>))
			throw new IllegalStateException("enumInstance is not an instance of Enum! " + enumInstance);

		return (String) invokeGetter(enumInstance, "name");
	}

	protected Object invokeGetter(Object object, String getter) {
		try {
			Method method = object.getClass().getMethod(getter, (Class[]) null);
			Object value = method.invoke(object, (Object[]) null);
			return value;
		} catch (InvocationTargetException x) {
			if (x.getCause() != null)
				throw new RuntimeException(x.getCause());
			else
				throw new RuntimeException(x);
		} catch (SecurityException x) {
			throw new RuntimeException(x);
		} catch (NoSuchMethodException x) {
			throw new RuntimeException(x);
		} catch (IllegalArgumentException x) {
			throw new RuntimeException(x);
		} catch (IllegalAccessException x) {
			throw new RuntimeException(x);
		}
	}

	public Collection<PersistablePropertyDTO> getPersistablePropertyDTOs(Class<?> persistableClass) {
		if (persistableClass == null)
			throw new IllegalArgumentException("persistableClass == null");

		List<PersistablePropertyDTO> result = new ArrayList<PersistablePropertyDTO>();
		List<Field> fields = ReflectUtil.collectAllFields(persistableClass, true);
		for (Field field : fields) {
			if (isPersistableField(field)) {
				PersistablePropertyDTO persistablePropertyDTO = createPersistablePropertyDTO(field);
				if (persistablePropertyDTO == null)
					throw new IllegalStateException(String.format("createPersistablePropertyDTO(field) returned null! Implementation error in %s!", getClass().getName()));

				result.add(persistablePropertyDTO);
			}
		}
		return result;
	}

	protected PersistablePropertyDTO createPersistablePropertyDTO(Field field) {
		PersistablePropertyDTO dto = new PersistablePropertyDTO();
		dto.setName(field.getName());
		dto.setType(field.getType().getName());
		// TODO generic type!
//		Type genericType = field.getGenericType();
		return dto;
	}
}
