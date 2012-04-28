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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.UUID;

import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ConnectionManager
{
	private static final Logger logger = LoggerFactory.getLogger(ConnectionManager.class);

	private static final ConnectionManager sharedInstance = new ConnectionManager();

	public static ConnectionManager sharedInstance() { return sharedInstance; }


	private Map<UUID, Connection> connectionID2connection = new HashMap<UUID, Connection>();
	private Collection<Connection> cache_allConnections = null;
	private Map<String, Collection<Connection>> cache_profileID2connections = new HashMap<String, Collection<Connection>>();

	private ConnectionProfileManager connectionProfileManager;
	private ServiceLoader<ConnectionFactory> connectionFactories = ServiceLoader.load(ConnectionFactory.class);

	private ConnectionManager() {
		this(ConnectionProfileManager.sharedInstance());
	}

	public ConnectionManager(ConnectionProfileManager connectionProfileManager) {
		this.connectionProfileManager = connectionProfileManager;
	}

	public synchronized Connection putConnectionDTO(ConnectionDTO connectionDTO)
	{
		logger.debug(
				"putConnectionDTO: entered: this.connectionID2connection.size={} connectionID={}",
				this.connectionID2connection.size(),
				(connectionDTO == null ? null : connectionDTO.getConnectionID())

		);

		if (connectionDTO == null)
			throw new IllegalArgumentException("connectionDTO == null");

		if (connectionDTO.getConnectionID() == null)
			throw new IllegalArgumentException("connectionDTO.connectionID == null");

		if (connectionDTO.getProfileID() == null)
			throw new IllegalArgumentException("connectionDTO.profileID == null");

		Connection connection = connectionID2connection.get(connectionDTO.getConnectionID());
		if (connection == null) {
			connection = newConnection(connectionDTO);
			connectionID2connection.put(connectionDTO.getConnectionID(), connection);
		}
		else if (connection.getConnectionProfile() != null)
			cache_profileID2connections.remove(connection.getConnectionProfile().getProfileID());

		connection.fromConnectionDTO(connectionDTO);

		cache_allConnections = null;
		cache_profileID2connections.remove(connection.getConnectionProfile().getProfileID());

		logger.debug(
				"putConnectionDTO: leaving: this.connectionID2connection.size={}",
				connectionID2connection.size()
		);

		return connection;
	}

	public synchronized void deleteConnection(UUID connectionID)
	{
		if (connectionID == null)
			throw new IllegalArgumentException("connectionID == null");

		Connection connection = connectionID2connection.remove(connectionID);
		if (connection != null && connection.getConnectionProfile() != null)
			cache_profileID2connections.remove(connection.getConnectionProfile().getProfileID());

		cache_allConnections = null;
	}

	private Connection newConnection(ConnectionDTO connectionDTO)
	{
		logger.debug(
				"newConnection: entered: connectionDTO.class={}",
				(connectionDTO == null ? null : connectionDTO.getClass().getName())
		);

		if (connectionDTO == null)
			throw new IllegalArgumentException("connectionDTO == null");

		for (ConnectionFactory connectionFactory : connectionFactories) {
			if (connectionFactory.canHandle(connectionDTO)) {
				Connection connection = connectionFactory.createConnection();
				if (connection == null)
					throw new IllegalStateException("connectionFactory.createConnection() returned null! connectionFactory.class=" + connectionFactory.getClass());

				connection.setConnectionProfileManager(connectionProfileManager);

				logger.debug(
						"newConnection: created connection of type {}",
						connection.getClass()
				);

				return connection;
			}
		}

		throw new IllegalArgumentException("Unsupported connectionDTO: " + connectionDTO);
	}

	public synchronized Connection getConnection(UUID connectionID)
	{
		return connectionID2connection.get(connectionID);
	}

	public synchronized Connection getConnection(UUID connectionID, boolean throwExceptionIfNotFound)
	{
		Connection result = connectionID2connection.get(connectionID);
		if (result == null && throwExceptionIfNotFound)
			throw new IllegalArgumentException("There is no connection with connectionID=" + connectionID + "!");

		return result;
	}

	private void getConnections_debugLog(String messagePrefix, Collection<Connection> result)
	{
		if (logger.isDebugEnabled()) {
			synchronized (this) {
				logger.debug(
						messagePrefix + "result.size={} this.cache_allConnections.size={} this.connectionID2connection.size={}",
						new Object[] {
								(result == null ? null : result.size()),
								(cache_allConnections == null ? null : cache_allConnections.size()),
								connectionID2connection.size()
						}
				);
			}
		}
	}

	public Collection<Connection> getConnections()
	{
		Collection<Connection> result = cache_allConnections;

		getConnections_debugLog("getConnections: entered: ", result);

		if (result == null) {
			synchronized (this) {
				result = new ArrayList<Connection>(connectionID2connection.values());
			}
			result = Collections.unmodifiableCollection(result);
			cache_allConnections = result;
		}

		getConnections_debugLog("getConnections: leaving: ", result);

		return result;
	}

	public Collection<Connection> getConnections(String profileID) {
		if (profileID == null)
			return getConnections();

		synchronized (this) {
			Collection<Connection> connections = cache_profileID2connections.get(profileID);
			if (connections == null) {
				connections = new ArrayList<Connection>(connectionID2connection.size());
				for (Connection connection : connectionID2connection.values()) {
					if (connection.getConnectionProfile() != null && profileID.equals(connection.getConnectionProfile().getProfileID()))
						connections.add(connection);
				}

				connections = Collections.unmodifiableCollection(connections);
				cache_profileID2connections.put(profileID, connections);
			}
			return connections;
		}
	}

}
