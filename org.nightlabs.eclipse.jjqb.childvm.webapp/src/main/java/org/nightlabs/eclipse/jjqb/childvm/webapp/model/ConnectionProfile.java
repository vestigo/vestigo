package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import java.util.Map;
import java.util.Properties;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTO;

public abstract class ConnectionProfile
{
	private String profileID;
	private Properties connectionProperties;

	public final synchronized void fromConnectionProfileDTO(ConnectionProfileDTO dto)
	{
		this.profileID = dto.getProfileID();
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
}
