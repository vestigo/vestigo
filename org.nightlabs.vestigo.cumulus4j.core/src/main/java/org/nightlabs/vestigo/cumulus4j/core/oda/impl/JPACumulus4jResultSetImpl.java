package org.nightlabs.vestigo.cumulus4j.core.oda.impl;

import org.nightlabs.vestigo.core.oda.JDOResultSet;
import org.nightlabs.vestigo.core.oda.Query;
import org.nightlabs.vestigo.core.oda.impl.AbstractResultSet;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPACumulus4jResultSetImpl extends AbstractResultSet implements JDOResultSet
{
	public JPACumulus4jResultSetImpl(Query query) {
		super(query);
	}
}
