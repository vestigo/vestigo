package org.nightlabs.jjqb.childvm.webapp.model;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;
import org.nightlabs.jjqb.childvm.shared.classloader.ClassLoaderManager;
import org.nightlabs.jjqb.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.persistencexml.PersistenceUnitHelper;
import org.nightlabs.jjqb.childvm.shared.persistencexml.PersistenceXml;
import org.nightlabs.jjqb.childvm.shared.persistencexml.PersistenceXmlScanner;
import org.nightlabs.jjqb.childvm.shared.persistencexml.jaxb.Persistence;
import org.nightlabs.jjqb.childvm.shared.persistencexml.jaxb.Persistence.PersistenceUnit;
import org.nightlabs.util.IOUtil;
import org.nightlabs.util.Util;
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

		try {
			File userTempDir = IOUtil.getUserTempDir("jjqb." + ConnectionProfile.class.getSimpleName() + '.', null);
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
			Collection<PersistenceXml> persistenceXmls = scanner.searchPersistenceXmls();
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

		classLoaderManager.close();
		syntheticPersistenceUnitName = null;

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
		Map<String, String> filteredPersistenceProperties = new HashMap<String, String>();
		for (Map.Entry<?, ?> me : rawPersistenceProperties.entrySet()) {
			String key = String.valueOf(me.getKey());
			String value = String.valueOf(me.getValue());
			if ("_NULL_".equals(value))
				value = null;

			filteredPersistenceProperties.put(key, value);
		}
		return filteredPersistenceProperties;
	}

	protected void collectQueryableCandidateClassesInDirectory(Collection<Class<?>> classes, ClassLoader classLoader, File classpathDirectory) throws IOException
	{

	}

	protected void collectQueryableCandidateClassesInZip(Collection<Class<?>> classes, ClassLoader classLoader, URL url) throws IOException
	{
		InputStream in = url.openStream();
		try {
			ZipInputStream zin = new ZipInputStream(in);
			ZipEntry zipEntry;
			while (null != (zipEntry = zin.getNextEntry())) {
				String name = zipEntry.getName();
				if (!name.endsWith(CLASS_SUFFIX))
					continue;

				String className = name.substring(0, name.length() - CLASS_SUFFIX.length()).replace('/', '.');
				Class<?> clazz;
				try {
					clazz = classLoader.loadClass(className);
				} catch (Throwable t) {
					logger.error("collectQueryableCandidateClassesInZip: className=" + className + ": " + t, t);
					continue;
				}
				if (isQueryableCandidateClass(clazz))
					classes.add(clazz);
			}
		} finally {
			in.close();
		}
	}

	protected boolean isQueryableCandidateClass(Class<?> clazz) {
		Collection<Class<? extends Annotation>> annotationClasses = getAnnotationClassesOfQueryableCandidateClass();
		for (Class<? extends Annotation> annotationClass : annotationClasses) {
			if (clazz.getAnnotation(annotationClass) != null)
				return true;
		}
		return false;
	}

	protected abstract Collection<Class<? extends Annotation>> getAnnotationClassesOfQueryableCandidateClass();

	public Collection<Class<?>> getQueryableCandidateClasses() throws IOException
	{
		ClassLoader classLoader = classLoaderManager.getPersistenceEngineClassLoader();
//		ReflectUtil.listClassesInPackage(packageName, cld, recurse)

		Set<Class<?>> classes = new HashSet<Class<?>>();

		List<URL> classpathURLs = classLoaderManager.getPersistenceEngineClasspathURLList();
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

		return classes;
	}
}
