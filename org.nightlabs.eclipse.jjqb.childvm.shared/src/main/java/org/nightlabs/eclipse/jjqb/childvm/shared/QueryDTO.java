package org.nightlabs.eclipse.jjqb.childvm.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class QueryDTO
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private UUID connectionID;
	private String queryText;
	private List<Object> parameters = new ArrayList<Object>();

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

	public List<Object> getParameters() {
		return parameters;
	}
	public void setParameters(List<Object> parameters) {
		this.parameters = parameters;
	}
}
