package org.nightlabs.jjqb.cumulus4j.core.oda.impl;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.core.oda.Connection;
import org.nightlabs.jjqb.core.oda.JDODriver;
import org.nightlabs.jjqb.core.oda.impl.AbstractDriver;
import org.nightlabs.jjqb.core.oda.impl.JDOConnectionImpl;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOCumulus4jDriverImpl extends AbstractDriver implements JDODriver {

	@Override
	protected Connection _getConnection(String connectionClassName) throws OdaException {
		return new JDOConnectionImpl(); // TODO JDO+Cumulus4j!!!
	}

}
