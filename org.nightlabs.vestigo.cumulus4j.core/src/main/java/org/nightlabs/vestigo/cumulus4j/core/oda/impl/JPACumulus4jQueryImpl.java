package org.nightlabs.vestigo.cumulus4j.core.oda.impl;

import org.nightlabs.vestigo.core.oda.JDOQuery;
import org.nightlabs.vestigo.core.oda.ResultSet;
import org.nightlabs.vestigo.core.oda.impl.AbstractConnection;
import org.nightlabs.vestigo.core.oda.impl.AbstractQuery;

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
