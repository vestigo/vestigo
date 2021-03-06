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
package org.nightlabs.vestigo.core.oda.impl;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.vestigo.childvm.shared.api.ChildVM;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.core.childvm.internal.ChildVMServer;
import org.nightlabs.vestigo.core.connectionpropertiesfilter.ConnectionPropertiesFilterManager;
import org.nightlabs.vestigo.core.oda.Connection;
import org.nightlabs.vestigo.core.oda.ConnectionProfile;
import org.nightlabs.vestigo.core.oda.ConnectionPropertyMeta;
import org.nightlabs.vestigo.core.oda.PersistableClass;
import org.nightlabs.vestigo.core.transientconnectionproperties.TransientConnectionPropertiesProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class AbstractConnectionProfile implements ConnectionProfile
{
	private static final Logger logger = LoggerFactory.getLogger(AbstractConnectionProfile.class);

	private ChildVMServer childVMServer;
	private String profileID;
	private Map<String, Boolean> classesKey2IsClassAssignableFromResult;
	private SortedSet<PersistableClass> queryableCandidateClasses;
	private SortedMap<String, PersistableClass> queryableCandidateClassMap;

	@Override
	public String getProfileID() {
		return profileID;
	}
	@Override
	public void setProfileID(String profileID) {
		logger.info("setProfileID: profileID={}", profileID); //$NON-NLS-1$
		this.profileID = profileID;
	}

	@Override
	public ChildVM getChildVM() {
		return getChildVMServer().getChildVM();
	}

	/**
	 * Get the name of the web-app (without file name suffix). The basic web-app is
	 * <code>"org.nightlabs.vestigo.childvm.webapp"</code>, but depending on the connection
	 * additional libraries might be necessary and thus a different web-app might need to
	 * be used.
	 *
	 * @return the name of the web-app (without the ".war"-suffix).
	 */
	protected abstract String getWebAppName();

	/**
	 * <p>
	 * The properties which are stored in the ODA connection properties.
	 * They are obtained from {@link Connection#getConnectionProperties()}.
	 * </p><p>
	 * These properties are merged with the {@link #transientConnectionProperties}
	 * when passed to the {@link ConnectionProfileDTO} (in {@link #toConnectionProfileDTO()}).
	 * </p>
	 */
	private Properties persistentConnectionProperties;

	/**
	 * <p>
	 * Properties which are not stored in the ODA connection properties. For example passwords
	 * and other things that should not be stored in a persistent way.
	 * </p><p>
	 * These properties are merged with the {@link #persistentConnectionProperties}
	 * when passed to the {@link ConnectionProfileDTO} (in {@link #toConnectionProfileDTO()}).
	 * </p>
	 */
	private Properties transientConnectionProperties = new Properties();

	private Set<Connection> connectionsOpening = new HashSet<Connection>();
	private Set<Connection> connectionsOpened = new HashSet<Connection>();
	private Set<Connection> connectionsClosing = new HashSet<Connection>();

	private Connection firstConnectionOpening;

	protected synchronized ChildVMServer getChildVMServer() {
		if (childVMServer == null) {
			childVMServer = new ChildVMServer(getWebAppName());
		}
		return childVMServer;
	}

	protected  void preFirstConnectionOpen(Connection connection) throws OdaException
	{
		logger.info("preFirstConnectionOpen: profileID={} connection={}", profileID, connection); //$NON-NLS-1$
		this.persistentConnectionProperties = connection.getConnectionProperties();
		this.transientConnectionProperties = obtainTransientConnectionProperties();
		this.classesKey2IsClassAssignableFromResult = new HashMap<String, Boolean>();
		this.queryableCandidateClasses = null;
		this.queryableCandidateClassMap = null;
		try {
			getChildVMServer().open();
		} catch (IOException e) {
			throw new OdaException(e);
		}

//		// BEGIN debug test - TO DO remove again!
//		{
//			Collection<ConnectionProfileDTO> connectionProfileDTOs = getChildVMServer().getChildVM().getConnectionProfileDTOs();
//			for (ConnectionProfileDTO connectionProfileDTO : connectionProfileDTOs) {
//				System.out.println(connectionProfileDTO.getProfileID());
//			}
//		}
//		// END debug test

		getChildVMServer().getChildVM().putConnectionProfileDTO(toConnectionProfileDTO());

//		// BEGIN debug test - TO DO remove again!
//		{
//			Collection<ConnectionProfileDTO> connectionProfileDTOs = getChildVMServer().getChildVM().getConnectionProfileDTOs();
//			for (ConnectionProfileDTO connectionProfileDTO : connectionProfileDTOs) {
//				System.out.println(connectionProfileDTO.getProfileID());
//			}
//		}
//		// END debug test
	}

	private static Map<String, IConfigurationElement> connectionProfileClassName2ConfigurationElementMap = null;

	protected Properties obtainTransientConnectionProperties() throws OperationCanceledException
	{
		IConfigurationElement element = getConfigurationElementForConnectionProfileClass(this.getClass());
		if (element == null) {
			logger.warn(
					"obtainTransientConnectionProperties: There is no extension to point '{}' matching the connectionProfileClass '{}'!", //$NON-NLS-1$
					extensionPointId_transientConnectionPropertiesProvider, this.getClass().getName()
			);
			return null;
		}

		Object executableExtension;
		try {
			executableExtension = element.createExecutableExtension("class"); //$NON-NLS-1$
		} catch (CoreException e) {
			throw new RuntimeException("Could not create executable extension for class \"" + element.getAttribute("class") + "\"!!! Extension registered in bundle \"" + element.getContributor().getName() + "\". Cause: " + e, e); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		}

		if (!(executableExtension instanceof TransientConnectionPropertiesProvider))
			throw new ClassCastException("Class \"" + element.getAttribute("class") + "\" does not implement interface \"" + TransientConnectionPropertiesProvider.class.getName() + "\"!!! Extension registered in bundle \"" + element.getContributor().getName() + "\"."); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$

		TransientConnectionPropertiesProvider provider = (TransientConnectionPropertiesProvider) executableExtension;
		Collection<String> transientConnectionPropertyKeys = getTransientConnectionPropertyKeys();
		provider.setConnectionProfile(this);
		provider.setConnectionPropertyKeys(
				Collections.unmodifiableCollection(transientConnectionPropertyKeys == null ? new LinkedList<String>() : transientConnectionPropertyKeys)
		);
		Properties properties = provider.obtainConnectionProperties();
		return properties;
	}

	@Override
	public Collection<String> getTransientConnectionPropertyKeys() {
		return null;
	}

	@Override
	public ConnectionPropertyMeta getConnectionPropertyMeta(String key) {
		return null;
	}

	protected static IConfigurationElement getConfigurationElementForConnectionProfileClass(Class<?> clazz)
	{
		Map<String, IConfigurationElement> connectionProfileClassName2ConfigurationElementMap = getConnectionProfileClassName2ConfigurationElementMap();
		Class<?> c = clazz;
		IConfigurationElement element = null;
		while (c != null) {
			element = connectionProfileClassName2ConfigurationElementMap.get(c.getName());
			if (element != null)
				return element;

			for (Class<?> iface : c.getInterfaces()) {
				element = getConfigurationElementForConnectionProfileClass(iface);
				if (element != null)
					return element;
			}

			c = c.getSuperclass();
		}
		return element;
	}

	private static final String extensionPointId_transientConnectionPropertiesProvider = "org.nightlabs.vestigo.core.transientConnectionPropertiesProvider"; //$NON-NLS-1$

	protected static synchronized Map<String, IConfigurationElement> getConnectionProfileClassName2ConfigurationElementMap()
	{
		Map<String, IConfigurationElement> map = connectionProfileClassName2ConfigurationElementMap;
		if (map == null) {
			map = new HashMap<String, IConfigurationElement>();

			final IExtensionRegistry registry = Platform.getExtensionRegistry();
			if (registry == null)
				throw new IllegalStateException("Platform.getExtensionRegistry() returned null!"); //$NON-NLS-1$

			final String extensionPointId = extensionPointId_transientConnectionPropertiesProvider;
			final IExtensionPoint extensionPoint = registry.getExtensionPoint(extensionPointId);
			if (extensionPoint == null)
				throw new IllegalStateException("Unable to resolve extension-point: " + extensionPointId); //$NON-NLS-1$

			final IExtension[] extensions = extensionPoint.getExtensions();
			for (final IExtension extension : extensions) {
				final IConfigurationElement[] elements = extension.getConfigurationElements();
				for (final IConfigurationElement element : elements) {
					String connectionProfileClassName = element.getAttribute("connectionProfileClass"); // class or interface //$NON-NLS-1$
					if (connectionProfileClassName == null) {
						logger.warn(
								"getConnectionProfileClassName2ConfigurationElementMap: Extension-element to point '{}' misses attribute 'connectionProfileClass'! Affected plugin: {}", //$NON-NLS-1$
								extensionPointId, extension.getContributor().getName()
						);
						continue;
					}

					IConfigurationElement oldElement = map.put(connectionProfileClassName, element);
					if (oldElement != null) {
						logger.warn(
								"There are multiple plug-ins contributing extensions for extensionPointId='{}' and connectionProfileClass='{}'! Affected plugins: {} and {}", //$NON-NLS-1$
								new Object[] { extensionPointId, connectionProfileClassName, oldElement.getContributor().getName(), element.getContributor().getName()}
						);
					}
				}
			}

			connectionProfileClassName2ConfigurationElementMap = map;
		}
		return map;
	}

	protected void postFirstConnectionOpen(Connection connection) throws OdaException {
		logger.info("postFirstConnectionOpen: profileID={} connection={}", profileID, connection); //$NON-NLS-1$

	}

	@Override
	public synchronized void preConnectionOpen(Connection connection) throws OdaException {
		if (connectionsOpening.isEmpty() && connectionsOpened.isEmpty() && connectionsClosing.isEmpty()) {
			firstConnectionOpening = connection;
			preFirstConnectionOpen(connection);
		}
		connectionsOpening.add(connection);
	}

	@Override
	public synchronized void postConnectionOpen(Connection connection) throws OdaException {
		connectionsOpened.add(connection);
		connectionsOpening.remove(connection);

		if (firstConnectionOpening == connection) {
			firstConnectionOpening = null;
			postFirstConnectionOpen(connection);
		}
	}

	@Override
	public synchronized void preConnectionClose(Connection connection) throws OdaException {
		connectionsClosing.add(connection);
		connectionsOpened.remove(connection);
		connectionsOpening.remove(connection); // in case, the opening process was interrupted.
	}

	protected void postLastConnectionClose(Connection connection) throws OdaException
	{
		logger.info("postLastConnectionClose: profileID={} connection={}", profileID, connection); //$NON-NLS-1$
		try {
			getChildVMServer().close();
		} catch (IOException e) {
			throw new OdaException(e);
		} finally {
			classesKey2IsClassAssignableFromResult = null;
			queryableCandidateClasses = null;
			queryableCandidateClassMap = null;
		}
	}

	@Override
	public synchronized void postConnectionClose(Connection connection) throws OdaException {
		connectionsClosing.remove(connection);
		if (connectionsOpening.isEmpty() && connectionsOpened.isEmpty() && connectionsClosing.isEmpty()) {
			postLastConnectionClose(connection);
		}
	}

	@Override
	public Properties getPersistentConnectionProperties() {
		return persistentConnectionProperties;
	}
	@Override
	public Properties getTransientConnectionProperties() {
		return transientConnectionProperties;
	}

	public ConnectionProfileDTO toConnectionProfileDTO()
	{
		ConnectionProfileDTO result = newConnectionProfileDTO();

		result.setProfileID(getProfileID());

		Properties connectionProperties = new Properties();
		if (persistentConnectionProperties != null) {
			for (Map.Entry<?, ?> me : persistentConnectionProperties.entrySet())
				connectionProperties.setProperty(me.getKey().toString(), me.getValue().toString());
		}

		if (transientConnectionProperties != null) {
			for (Map.Entry<?, ?> me : transientConnectionProperties.entrySet())
				connectionProperties.setProperty(me.getKey().toString(), me.getValue().toString());
		}

		new ConnectionPropertiesFilterManager().filterConnectionProperties(connectionProperties);

		Map<String, String> dto_connectionProperties = result.getConnectionProperties();
		for (Map.Entry<?, ?> me : connectionProperties.entrySet())
			dto_connectionProperties.put(me.getKey().toString(), me.getValue().toString());

		return result;
	}

	protected abstract ConnectionProfileDTO newConnectionProfileDTO();

	private String getClassesKey(String targetClass, String candidateClass)
	{
		if (targetClass == null)
			throw new IllegalArgumentException("targetClass == null"); //$NON-NLS-1$

		if (candidateClass == null)
			throw new IllegalArgumentException("candidateClass == null"); //$NON-NLS-1$

		return targetClass + ':' + candidateClass;
	}

	@Override
	public synchronized boolean isClassAssignableFrom(String targetClass, String candidateClass)
	{
		if (classesKey2IsClassAssignableFromResult == null)
			throw new IllegalStateException("Profile is not open! classesKey2IsClassAssignableFromResult == null"); //$NON-NLS-1$

		String classesKey = getClassesKey(targetClass, candidateClass);
		Boolean result = classesKey2IsClassAssignableFromResult.get(classesKey);
		if (result == null) {
			result = getChildVM().isClassAssignableFrom(profileID, targetClass, candidateClass);
			classesKey2IsClassAssignableFromResult.put(classesKey, result);
		}
		return result;
	}

	@Override
	public synchronized boolean isOpen() {
		return !connectionsOpened.isEmpty();
	}

	@Override
	public synchronized SortedMap<String, PersistableClass> getQueryableCandidateClassMap() {
		if (queryableCandidateClassMap == null)
			getQueryableCandidateClasses();

		if (queryableCandidateClassMap == null)
			throw new IllegalStateException("queryableCandidateClassMap == null");

		return queryableCandidateClassMap;
	}

	@Override
	public synchronized SortedSet<PersistableClass> getQueryableCandidateClasses()
	{
		if (queryableCandidateClasses == null) {
			SortedSet<PersistableClass> classes = new TreeSet<PersistableClass>();
			SortedMap<String, PersistableClass> classMap = new TreeMap<String, PersistableClass>();
			SortedSet<String> classNames = getChildVM().getQueryableCandidateClasses(profileID);
			for (String className : classNames) {
				PersistableClass persistableClass = new PersistableClassImpl(this, className);
				classes.add(persistableClass);
				classMap.put(className, persistableClass);
			}
			queryableCandidateClasses = Collections.unmodifiableSortedSet(classes);
			queryableCandidateClassMap = Collections.unmodifiableSortedMap(classMap);
		}
		return queryableCandidateClasses;
	}
}
