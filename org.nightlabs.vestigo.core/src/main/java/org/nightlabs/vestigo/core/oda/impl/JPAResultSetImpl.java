package org.nightlabs.jjqb.core.oda.impl;

import org.nightlabs.jjqb.core.oda.JDOResultSet;
import org.nightlabs.jjqb.core.oda.Query;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPAResultSetImpl extends AbstractResultSet implements JDOResultSet
{
	public JPAResultSetImpl(Query query) {
		super(query);
	}
}
