package org.nightlabs.jjqb.cumulus4j.core.oda.impl;

import org.nightlabs.jjqb.core.oda.JDOQuery;
import org.nightlabs.jjqb.core.oda.ResultSet;
import org.nightlabs.jjqb.core.oda.impl.AbstractConnection;
import org.nightlabs.jjqb.core.oda.impl.AbstractQuery;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPACumulus4jQueryImpl extends AbstractQuery implements JDOQuery
{
	public JPACumulus4jQueryImpl(AbstractConnection connection) {
		super(connection);
	}

	@Override
	protected ResultSet newResultSet() {
		return new JPACumulus4jResultSetImpl(this);
	}
}
