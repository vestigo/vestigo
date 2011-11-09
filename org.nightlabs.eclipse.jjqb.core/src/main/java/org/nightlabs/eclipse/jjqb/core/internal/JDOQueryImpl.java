package org.nightlabs.eclipse.jjqb.core.internal;

import org.nightlabs.eclipse.jjqb.core.JDOQuery;
import org.nightlabs.eclipse.jjqb.core.ResultSet;


public class JDOQueryImpl extends AbstractQuery implements JDOQuery
{
	public JDOQueryImpl(AbstractConnection connection) {
		super(connection);
	}

	@Override
	protected ResultSet newResultSet() {
		return new JDOResultSetImpl(this);
	}
}