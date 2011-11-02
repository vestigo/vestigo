package org.nightlabs.eclipse.jjqb.core.internal;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.core.ClassLoaderManager;
import org.nightlabs.eclipse.jjqb.core.Connection;
import org.nightlabs.eclipse.jjqb.core.ConnectionProfile;
import org.nightlabs.eclipse.jjqb.core.internal.childvm.ChildVMServer;

public abstract class AbstractConnectionProfile implements ConnectionProfile
{
	private ChildVMServer childVMServer = new ChildVMServer();

	public AbstractConnectionProfile()
	{
		classLoaderManager = new ClassLoaderManagerImpl();
		classLoaderManager.setConnectionProfile(this);
	}

	private UUID profileID;

	@Override
	public UUID getProfileID() {
		return profileID;
	}
	@Override
	public void setProfileID(UUID profileID) {
		this.profileID = profileID;
	}

	private ClassLoaderManager classLoaderManager;

	@Override
	public ClassLoaderManager getClassLoaderManager() {
		return classLoaderManager;
	}

	private Set<Connection> connectionsOpening = new HashSet<Connection>();
	private Set<Connection> connectionsOpened = new HashSet<Connection>();
	private Set<Connection> connectionsClosing = new HashSet<Connection>();

	@Override
	public synchronized void preConnectionOpen(Connection connection) throws OdaException {
		if (connectionsOpening.isEmpty() && connectionsOpened.isEmpty() && connectionsClosing.isEmpty()) {
			try {
				childVMServer.start();
			} catch (IOException e) {
				throw new OdaException(e);
			}
			classLoaderManager.open(connection.getConnectionProperties());
		}
		connectionsOpening.add(connection);
	}

	@Override
	public synchronized void postConnectionOpen(Connection connection) throws OdaException {
		connectionsOpening.remove(connection);
		connectionsOpened.add(connection);
	}

	@Override
	public synchronized void preConnectionClose(Connection connection) throws OdaException {
		connectionsClosing.add(connection);
		connectionsOpened.remove(connection);
	}

	@Override
	public synchronized void postConnectionClose(Connection connection) throws OdaException {
		connectionsClosing.remove(connection);
		if (connectionsOpening.isEmpty() && connectionsOpened.isEmpty() && connectionsClosing.isEmpty()) {
			try {
				childVMServer.stop();
			} catch (IOException e) {
				throw new OdaException(e);
			}
			classLoaderManager.close();
		}
	}
}
