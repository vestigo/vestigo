package org.nightlabs.eclipse.jjqb.core.internal;

import org.nightlabs.eclipse.jjqb.core.JDOResultSet;
import org.nightlabs.eclipse.jjqb.core.Query;

public class JPAResultSetImpl extends AbstractResultSet implements JDOResultSet
{
	public JPAResultSetImpl(Query query) {
		super(query);
	}
}
