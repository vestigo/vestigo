package org.nightlabs.jjqb.childvm.shared;

import java.io.Serializable;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ResultSetDTO
implements Serializable
{
	private static final long serialVersionUID = 1L;

	public ResultSetDTO() { }

	public ResultSetDTO(ResultSetID resultSetID) {
		this.resultSetID = resultSetID;
	}

	private ResultSetID resultSetID;

	public ResultSetID getResultSetID() {
		return resultSetID;
	}
	public void setResultSetID(ResultSetID resultSetID) {
		this.resultSetID = resultSetID;
	}
}
