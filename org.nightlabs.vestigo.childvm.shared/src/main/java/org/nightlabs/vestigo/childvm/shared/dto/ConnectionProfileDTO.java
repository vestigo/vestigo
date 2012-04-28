/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
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
