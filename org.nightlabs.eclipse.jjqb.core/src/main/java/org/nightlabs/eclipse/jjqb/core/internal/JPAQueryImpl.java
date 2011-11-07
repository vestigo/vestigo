package org.nightlabs.eclipse.jjqb.core.internal;

import org.nightlabs.eclipse.jjqb.core.JDOQuery;
import org.nightlabs.eclipse.jjqb.core.ResultSet;


public class JPAQueryImpl extends AbstractQuery implements JDOQuery
{
	public JPAQueryImpl(AbstractConnection connection) {
		super(connection);
	}

	@Override
	protected ResultSet newResultSet() {
		return new JPAResultSetImpl(this);
	}
}
