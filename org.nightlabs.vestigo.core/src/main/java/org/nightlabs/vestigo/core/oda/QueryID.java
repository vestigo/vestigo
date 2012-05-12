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
package org.nightlabs.vestigo.core.oda;

import java.io.Serializable;
import java.util.UUID;

import org.nightlabs.util.Util;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryID
implements Serializable
{
	private static final long serialVersionUID = 1L;

	public QueryID(UUID connectionID, int queryID)
	{
		if (connectionID == null)
			throw new IllegalArgumentException("connectionID == null"); //$NON-NLS-1$
		if (queryID < 0)
			throw new IllegalArgumentException("queryID < 0"); //$NON-NLS-1$

		this.connectionID = connectionID;
		this.queryID = queryID;
	}

	private UUID connectionID;
	private int queryID;

	public UUID getConnectionID() {
		return connectionID;
	}
	public int getQueryID() {
		return queryID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((connectionID == null) ? 0 : connectionID.hashCode());
		result = prime * result + queryID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		QueryID other = (QueryID) obj;
		return (
				Util.equals(this.queryID, other.queryID) &&
				Util.equals(this.connectionID, other.connectionID)
		);
	}

	@Override
	public String toString() {
		return String.valueOf(connectionID) + '.' + Integer.toHexString(queryID);
	}
}
