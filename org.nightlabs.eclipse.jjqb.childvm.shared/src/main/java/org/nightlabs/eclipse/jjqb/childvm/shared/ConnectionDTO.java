package org.nightlabs.eclipse.jjqb.childvm.shared;

import java.io.Serializable;
import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public abstract class ConnectionDTO
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private UUID connectionID;
	private String profileID;

	public UUID getConnectionID() {
		return connectionID;
	}
	public void setConnectionID(UUID connectionID) {
		this.connectionID = connectionID;
	}

	public String getProfileID() {
		return profileID;
	}
	public void setProfileID(String profileID) {
		this.profileID = profileID;
	}
}
