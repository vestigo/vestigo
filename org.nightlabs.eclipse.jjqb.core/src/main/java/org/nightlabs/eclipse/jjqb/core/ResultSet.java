package org.nightlabs.eclipse.jjqb.core;

import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultSetID;

public interface ResultSet extends IResultSet
{
	Query getQuery();

	ResultSetID getResultSetID();

	void setResultSetID(ResultSetID resultSetID);
}
