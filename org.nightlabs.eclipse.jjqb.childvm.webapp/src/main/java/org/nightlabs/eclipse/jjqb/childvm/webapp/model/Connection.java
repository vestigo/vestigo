package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import java.util.UUID;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Connection
{
	private static final Logger logger = LoggerFactory.getLogger(Connection.class);

	private UUID connectionID;
	private ConnectionProfile connectionProfile;

	public Connection() {
		logger.debug("[{}].<init>: created new instance.", Long.toHexString(System.identityHashCode(this)));
	}

	public UUID getConnectionID() {
		return connectionID;
	}
	private void setConnectionID(UUID connectionID) {
		logger.debug("[{}].setConnectionID: connectionID={}", Long.toHexString(System.identityHashCode(this)), connectionID);
		this.connectionID = connectionID;
	}

	public ConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}
	public void setConnectionProfile(ConnectionProfile connectionProfile) {
		if (this.connectionProfile != null && !this.connectionProfile.equals(connectionProfile))
			throw new IllegalStateException("this.connectionProfile already assigned! Cannot replace!");

		this.connectionProfile = connectionProfile;
	}

	public final synchronized void fromConnectionDTO(ConnectionDTO connectionDTO)
	{
		if (connectionDTO == null)
			throw new IllegalArgumentException("connectionDTO == null");

		setConnectionID(connectionDTO.getConnectionID());
		setConnectionProfile(ConnectionProfileManager.sharedInstance().getConnectionProfile(connectionDTO.getProfileID(), true));
		_fromConnectionDTO(connectionDTO);
	}

	protected void _fromConnectionDTO(ConnectionDTO connectionDTO) { }

	public synchronized ConnectionDTO toConnectionDTO() {
		ConnectionProfile connectionProfile = getConnectionProfile();
		ConnectionDTO dto = newConnectionDTO();
		dto.setConnectionID(getConnectionID());
		dto.setProfileID(connectionProfile == null ? null : connectionProfile.getProfileID());
		return dto;
	}

	protected abstract ConnectionDTO newConnectionDTO();

	private volatile boolean open = false;

	public boolean isOpen() {
		return open;
	}

	public synchronized void open() {
		logger.debug("[{}].open: connectionID={}", Long.toHexString(System.identityHashCode(this)), connectionID);

		if (isOpen())
			return;

		if (this.connectionProfile == null)
			throw new IllegalStateException("this.connectionProfile == null");

		connectionProfile.onConnectionOpen(this);
		open = true;
	}

	public synchronized void close() {
		logger.debug("[{}].close: connectionID={}", Long.toHexString(System.identityHashCode(this)), connectionID);

		if (!isOpen())
			return;

		if (this.connectionProfile != null)
			connectionProfile.onConnectionClose(this);

		open = false;
	}
}
