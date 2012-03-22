package org.nightlabs.vestigo.childvm.shared.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class ConnectionProfileDTO
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String profileID;
	private Map<String, String> connectionProperties = new HashMap<String, String>();

	public ConnectionProfileDTO() { }

	public String getProfileID() {
		return profileID;
	}
	public void setProfileID(String profileID) {
		this.profileID = profileID;
	}

	public Map<String, String> getConnectionProperties() {
		return connectionProperties;
	}
	public void setConnectionProperties(Map<String, String> connectionProperties) {
		this.connectionProperties = connectionProperties;
	}
}
