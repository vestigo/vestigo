package org.nightlabs.jjqb.cumulus4j.core.oda.impl;

import org.nightlabs.jjqb.core.oda.JDOQuery;
import org.nightlabs.jjqb.core.oda.ResultSet;
import org.nightlabs.jjqb.core.oda.impl.AbstractConnection;
import org.nightlabs.jjqb.core.oda.impl.AbstractQuery;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOCumulus4jQueryImpl extends AbstractQuery implements JDOQuery
{
	public JDOCumulus4jQueryImpl(AbstractConnection connection) {
		super(connection);
	}

	@Override
	protected ResultSet newResultSet() {
		return new JDOCumulus4jResultSetImpl(this);
	}
}
