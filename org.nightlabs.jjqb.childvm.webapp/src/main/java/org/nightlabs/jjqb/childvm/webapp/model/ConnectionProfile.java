package org.nightlabs.jjqb.childvm.webapp.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;
import org.nightlabs.jjqb.childvm.shared.classloader.ClassLoaderManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class ConnectionProfile
{
	private static final Logger logger = LoggerFactory.getLogger(ConnectionProfile.class);

	private String profileID;
	private Properties connectionProperties;

	private ClassLoaderManager classLoaderManager = new ClassLoaderManager();

	public ConnectionProfile() {
		logger.debug("[{}].<init>: created new instance of {}", Long.toHexString(System.identityHashCode(this)), this.getClass().getName());
//		classLoaderManager.setConnectionProfile(this);
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

		if (openConnections.isEmpty()) {
			onFirstConnectionOpen(connection);
		}
		openConnections.add(connection);
	}

	protected void onFirstConnectionOpen(Connection connection) {
		logger.debug(
				"[{}].onFirstConnectionOpen: profileID={} connectionID={}",
				new Object[] { Long.toHexString(System.identityHashCode(this)), profileID, connection.getConnectionID() }
		);

		if (isPersistenceUnitSyntheticOverride()) {
			// TODO use the PersistenceXmlScanner (which still needs to be moved into the shared project) to read the original
			// persistence unit, apply the properties, store the new persistence unit and make sure it is used (either use a new name
			// or hide all other persistence.xml files from the classpath).
		}

		classLoaderManager.open(connectionProperties);
	}

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
	}

	public ClassLoaderManager getClassLoaderManager() {
		return classLoaderManager;
	}

	protected boolean isPersistenceUnitSyntheticOverride() {
		if (connectionProperties == null)
			return false;

		return Boolean.parseBoolean(connectionProperties.getProperty(PropertiesUtil.PERSISTENCE_UNIT_SYNTHETIC_OVERRIDE));
	}

	protected String getPersistenceUnitName() {
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
}
