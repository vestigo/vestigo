package org.nightlabs.eclipse.jjqb.core.internal.oda;

import org.nightlabs.eclipse.jjqb.core.oda.JDOQuery;
import org.nightlabs.eclipse.jjqb.core.oda.ResultSet;


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