package org.nightlabs.eclipse.jjqb.childvm.shared;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConnectionProfileDTOPutResult
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String profileID;

	public ConnectionProfileDTOPutResult() { }

	public String getProfileID() {
		return profileID;
	}
	public void setProfileID(String profileID) {
		this.profileID = profileID;
	}
}
