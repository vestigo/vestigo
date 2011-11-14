package org.nightlabs.jjqb.core.oda;

import java.io.Serializable;
import java.util.UUID;

import org.nightlabs.util.Util;

public class QueryID
implements Serializable
{
	private static final long serialVersionUID = 1L;

	public QueryID(UUID connectionID, int queryID)
	{
		if (connectionID == null)
			throw new IllegalArgumentException("connectionID == null");
		if (queryID < 0)
			throw new IllegalArgumentException("queryID < 0");

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
