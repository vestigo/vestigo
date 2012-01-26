package org.nightlabs.jjqb.core.oda.internal;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.api.ChildVM;
import org.nightlabs.jjqb.core.childvm.internal.ChildVMServer;
import org.nightlabs.jjqb.core.oda.Connection;
import org.nightlabs.jjqb.core.oda.ConnectionProfile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class AbstractConnectionProfile implements ConnectionProfile
{
	private static final Logger logger = LoggerFactory.getLogger(AbstractConnectionProfile.class);

//	public AbstractConnectionProfile()
//	{
//		classLoaderManager = new ClassLoaderManagerImpl();
//		classLoaderManager.setConnectionProfile(this);
//	}

	private ChildVMServer childVMServer;
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
		return getChildVMServer().getChildVM();
	}

	/**
	 * Get the name of the web-app (without file name suffix).
	 * @return the name of the web-app (without the ".war"-suffix).
	 */
	protected String getWebAppName() {
		return "org.nightlabs.jjqb.childvm.webapp";
	}

	private Properties connectionProperties;

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

	protected void preFirstConnectionOpen(Connection connection) throws OdaException {
		logger.info("preFirstConnectionOpen: profileID={} connection={}", profileID, connection);
		this.connectionProperties = connection.getConnectionProperties();
		try {
			getChildVMServer().open();
		} catch (IOException e) {
			throw new OdaException(e);
		}

		// BEGIN debug test - TODO remove again!
		{
			Collection<ConnectionProfileDTO> connectionProfileDTOs = getChildVMServer().getChildVM().getConnectionProfileDTOs();
			for (ConnectionProfileDTO connectionProfileDTO : connectionProfileDTOs) {
				System.out.println(connectionProfileDTO.getProfileID());
			}
		}
		// END debug test

		getChildVMServer().getChildVM().putConnectionProfileDTO(toConnectionProfileDTO());

		// BEGIN debug test - TODO remove again!
		{
			Collection<ConnectionProfileDTO> connectionProfileDTOs = getChildVMServer().getChildVM().getConnectionProfileDTOs();
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
			getChildVMServer().close();
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
