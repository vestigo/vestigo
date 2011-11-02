package org.nightlabs.eclipse.jjqb.childvm.shared;

import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConnectionProfile
{
	private UUID profileID;

	public ConnectionProfile() { }

	public UUID getProfileID() {
		return profileID;
	}
	public void setProfileID(UUID profileID) {
		this.profileID = profileID;
	}
}
