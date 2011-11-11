package org.nightlabs.eclipse.jjqb.core.internal.oda;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.eclipse.jjqb.core.childvm.ChildVM;
import org.nightlabs.eclipse.jjqb.core.internal.childvm.ChildVMServer;
import org.nightlabs.eclipse.jjqb.core.oda.Connection;
import org.nightlabs.eclipse.jjqb.core.oda.ConnectionProfile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractConnectionProfile implements ConnectionProfile
{
	private static final Logger logger = LoggerFactory.getLogger(AbstractConnectionProfile.class);
	private ChildVMServer childVMServer = new ChildVMServer();

//	public AbstractConnectionProfile()
//	{
//		classLoaderManager = new ClassLoaderManagerImpl();
//		classLoaderManager.setConnectionProfile(this);
//	}

	private String profileID;

	@Override
	public String getProfileID() {
		return profileID;
	}
	@Override
	public void setProfileID(String profileID) {
		logger.info("setProfileID: profileID={}", profileID);
		this.profileID = profileID;
	}

//	private ClassLoaderManager classLoaderManager;
//
//	@Override
//	public ClassLoaderManager getClassLoaderManager() {
//		return classLoaderManager;
//	}

	@Override
	public ChildVM getChildVM() {
		return childVMServer;
	}

	private Properties connectionProperties;

	private Set<Connection> connectionsOpening = new HashSet<Connection>();
	private Set<Connection> connectionsOpened = new HashSet<Connection>();
	private Set<Connection> connectionsClosing = new HashSet<Connection>();

	private Connection firstConnectionOpening;

	protected void preFirstConnectionOpen(Connection connection) throws OdaException {
		logger.info("preFirstConnectionOpen: profileID={} connection={}", profileID, connection);
		this.connectionProperties = connection.getConnectionProperties();
		try {
			childVMServer.open();
		} catch (IOException e) {
			throw new OdaException(e);
		}

		// BEGIN debug test - TODO remove again!
		{
			Collection<ConnectionProfileDTO> connectionProfileDTOs = childVMServer.getConnectionProfileDTOs();
			for (ConnectionProfileDTO connectionProfileDTO : connectionProfileDTOs) {
				System.out.println(connectionProfileDTO.getProfileID());
			}
		}
		// END debug test

		childVMServer.putConnectionProfileDTO(toConnectionProfileDTO());

		// BEGIN debug test - TODO remove again!
		{
			Collection<ConnectionProfileDTO> connectionProfileDTOs = childVMServer.getConnectionProfileDTOs();
			for (ConnectionProfileDTO connectionProfileDTO : connectionProfileDTOs) {
				System.out.println(connectionProfileDTO.getProfileID());
			}
		}
		// END debug test

//			classLoaderManager.open(connection.getConnectionProperties());
	}

	protected void postFirstConnectionOpen(Connection connection) throws OdaException {
		logger.info("postFirstConnectionOpen: profileID={} connection={}", profileID, connection);

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

	public synchronized void postLastConnectionClose(Connection connection) throws OdaException
	{
		logger.info("postLastConnectionClose: profileID={} connection={}", profileID, connection);
		try {
			childVMServer.close();
		} catch (IOException e) {
			throw new OdaException(e);
		}
//			classLoaderManager.close();
	}

	@Override
	public synchronized void postConnectionClose(Connection connection) throws OdaException {
		connectionsClosing.remove(connection);
		if (connectionsOpening.isEmpty() && connectionsOpened.isEmpty() && connectionsClosing.isEmpty()) {
			postLastConnectionClose(connection);
		}
	}

	public ConnectionProfileDTO toConnectionProfileDTO()
	{
		ConnectionProfileDTO result = newConnectionProfileDTO();

		result.setProfileID(getProfileID());

		Map<String, String> dto_connectionProperties = result.getConnectionProperties();
		if (connectionProperties != null) {
			for (Map.Entry<?, ?> me : connectionProperties.entrySet())
				dto_connectionProperties.put(me.getKey() == null ? null : me.getKey().toString(), me.getValue() == null ? null : me.getValue().toString());
		}

		return result;
	}

	protected abstract ConnectionProfileDTO newConnectionProfileDTO();
}
