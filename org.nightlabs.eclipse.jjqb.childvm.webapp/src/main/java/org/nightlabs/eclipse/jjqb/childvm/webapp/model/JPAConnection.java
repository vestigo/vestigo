package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import java.util.List;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.JPAConnectionDTO;

public class JPAConnection
extends Connection
{
	@Override
	protected ConnectionDTO newConnectionDTO() {
		return new JPAConnectionDTO();
	}

	@Override
	public ResultSet doExecuteQuery(String queryText, List<Object> parameters) {
		throw new UnsupportedOperationException("NYI");
	}
}
