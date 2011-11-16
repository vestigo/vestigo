package org.nightlabs.jjqb.childvm.shared;

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
