package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.JDOConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.JPAConnectionDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectionManager
{
	private static final Logger logger = LoggerFactory.getLogger(ConnectionManager.class);

	private static final ConnectionManager sharedInstance = new ConnectionManager();

	public static ConnectionManager sharedInstance() { return sharedInstance; }

	private Map<UUID, Connection> connectionID2connection = new HashMap<UUID, Connection>();
	private Collection<Connection> cache_allConnections = null;
	private Map<String, Collection<Connection>> cache_profileID2connections = new HashMap<String, Collection<Connection>>();

	private ConnectionManager() { }

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
			connection = newConnection(connectionDTO.getClass());
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

	private Connection newConnection(Class<? extends ConnectionDTO> dtoClass)
	{
		logger.debug(
				"newConnection: entered: dtoClass={}",
				(dtoClass == null ? null : dtoClass.getName())
		);

		if (dtoClass == null)
			throw new IllegalArgumentException("dtoClass == null");

		if (JDOConnectionDTO.class.isAssignableFrom(dtoClass))
			return new JDOConnection();

		if (JPAConnectionDTO.class.isAssignableFrom(dtoClass))
			return new JPAConnection();

		throw new IllegalArgumentException("Unsupported dtoClass: " + dtoClass.getName());
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

	public Collection<Connection> getConnections()
	{
		Collection<Connection> result = cache_allConnections;
		if (logger.isDebugEnabled()) {
			synchronized (this) {
				logger.debug(
						"getConnections: entered: result.size={} this.connectionsReadOnly.size={} this.connectionID2connection.size={}",
						new Object[] {
								(result == null ? null : result.size()),
								(cache_allConnections == null ? null : cache_allConnections.size()),
								connectionID2connection.size()
						}
				);
			}
		}
		if (result == null) {
			synchronized (this) {
				result = new ArrayList<Connection>(connectionID2connection.values());
			}
			result = Collections.unmodifiableCollection(result);
			cache_allConnections = result;
		}
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
