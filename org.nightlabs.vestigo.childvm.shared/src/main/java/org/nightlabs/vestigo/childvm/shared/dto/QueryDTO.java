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
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryDTO
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private UUID connectionID;
	private String queryText;
	private SortedSet<QueryParameterDTO> parameters = new TreeSet<QueryParameterDTO>();

	public UUID getConnectionID() {
		return connectionID;
	}
	public void setConnectionID(UUID connectionID) {
		this.connectionID = connectionID;
	}

	public String getQueryText() {
		return queryText;
	}
	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	public SortedSet<QueryParameterDTO> getParameters() {
		return parameters;
	}
	public void setParameters(SortedSet<QueryParameterDTO> parameters) {
		this.parameters = parameters;
	}
}
