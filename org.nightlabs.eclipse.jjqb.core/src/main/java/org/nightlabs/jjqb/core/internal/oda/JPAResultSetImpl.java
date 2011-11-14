package org.nightlabs.jjqb.core.internal.oda;

import org.nightlabs.jjqb.core.oda.JDOResultSet;
import org.nightlabs.jjqb.core.oda.Query;

public class JPAResultSetImpl extends AbstractResultSet implements JDOResultSet
{
	public JPAResultSetImpl(Query query) {
		super(query);
	}
}
