package org.nightlabs.eclipse.jjqb.core.internal.oda;

import org.nightlabs.eclipse.jjqb.core.oda.JDOResultSet;
import org.nightlabs.eclipse.jjqb.core.oda.Query;

public class JPAResultSetImpl extends AbstractResultSet implements JDOResultSet
{
	public JPAResultSetImpl(Query query) {
		super(query);
	}
}
