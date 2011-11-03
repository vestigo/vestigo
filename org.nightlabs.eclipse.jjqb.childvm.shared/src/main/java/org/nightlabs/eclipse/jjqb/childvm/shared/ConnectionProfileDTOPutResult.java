package org.nightlabs.eclipse.jjqb.childvm.shared;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConnectionProfileDTOPutResult
{
	private String profileID;

	public ConnectionProfileDTOPutResult() { }

	public String getProfileID() {
		return profileID;
	}
	public void setProfileID(String profileID) {
		this.profileID = profileID;
	}
}
