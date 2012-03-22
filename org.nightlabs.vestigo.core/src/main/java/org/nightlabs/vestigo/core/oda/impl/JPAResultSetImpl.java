package org.nightlabs.vestigo.core.oda.impl;

import org.nightlabs.vestigo.core.oda.JDOResultSet;
import org.nightlabs.vestigo.core.oda.Query;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPAResultSetImpl extends AbstractResultSet implements JDOResultSet
{
	public JPAResultSetImpl(Query query) {
		super(query);
	}
}
