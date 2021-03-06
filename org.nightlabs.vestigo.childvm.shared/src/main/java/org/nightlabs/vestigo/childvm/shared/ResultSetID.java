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
package org.nightlabs.vestigo.childvm.shared;

import java.io.Serializable;
import java.util.UUID;

import org.nightlabs.util.Util;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ResultSetID
implements Serializable
{
	private static final long serialVersionUID = 1L;

//	public ResultSetID() { } // not needed anymore - we don't use JAXB anymore

	public ResultSetID(String resultSetIDString)
	{
		if (resultSetIDString == null)
			throw new IllegalArgumentException("resultSetIDString == null"); //$NON-NLS-1$

		int dotIndex = resultSetIDString.lastIndexOf('.');
		if (dotIndex < 0)
			throw new IllegalArgumentException("resultSetIDString does not contain a '.' (dot): " + resultSetIDString); //$NON-NLS-1$

		String s1 = resultSetIDString.substring(0, dotIndex);
		String s2 = resultSetIDString.substring(dotIndex + 1);

		this.connectionID = UUID.fromString(s1);
		this.resultSetID = Integer.parseInt(s2, 16);
	}

	public ResultSetID(UUID connectionID, int resultSetID)
	{
		if (connectionID == null)
			throw new IllegalArgumentException("connectionID == null"); //$NON-NLS-1$
		if (resultSetID < 0)
			throw new IllegalArgumentException("resultSetID < 0"); //$NON-NLS-1$

		this.connectionID = connectionID;
		this.resultSetID = resultSetID;
	}

	private UUID connectionID;
	private int resultSetID = -1;

	public UUID getConnectionID() {
		return connectionID;
	}
//	public void setConnectionID(UUID connectionID) { // not needed anymore - we don't use JAXB anymore
//		if (this.connectionID != null && this.connectionID.equals(connectionID))
//			return;
//
//		if (this.connectionID != null)
//			throw new IllegalStateException("this.connectionID already assigned! Cannot modify!");
//
//		this.connectionID = connectionID;
//	}
	public int getResultSetID() {
		return resultSetID;
	}
//	public void setResultSetID(int resultSetID) { // not needed anymore - we don't use JAXB anymore
//		if (this.resultSetID == resultSetID)
//			return;
//
//		if (this.resultSetID >= 0)
//			throw new IllegalStateException("this.resultSetID already assigned! Cannot modify!");
//
//		this.resultSetID = resultSetID;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((connectionID == null) ? 0 : connectionID.hashCode());
		result = prime * result + resultSetID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		ResultSetID other = (ResultSetID) obj;
		return (
				Util.equals(this.resultSetID, other.resultSetID) &&
				Util.equals(this.connectionID, other.connectionID)
		);
	}

	@Override
	public String toString() {
		return String.valueOf(connectionID) + '.' + Integer.toHexString(resultSetID);
	}
}
