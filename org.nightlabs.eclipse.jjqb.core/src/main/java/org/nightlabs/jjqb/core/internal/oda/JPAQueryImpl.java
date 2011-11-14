package org.nightlabs.jjqb.core.internal.oda;

import org.nightlabs.jjqb.core.oda.JDOQuery;
import org.nightlabs.jjqb.core.oda.ResultSet;


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
