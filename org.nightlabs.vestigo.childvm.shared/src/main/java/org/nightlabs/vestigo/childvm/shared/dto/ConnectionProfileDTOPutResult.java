package org.nightlabs.jjqb.childvm.shared.dto;

import java.io.Serializable;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
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
