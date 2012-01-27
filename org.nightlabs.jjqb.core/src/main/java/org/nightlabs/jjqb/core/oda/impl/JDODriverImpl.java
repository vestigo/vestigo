package org.nightlabs.jjqb.core.oda.impl;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.core.oda.Connection;
import org.nightlabs.jjqb.core.oda.JDODriver;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDODriverImpl extends AbstractDriver implements JDODriver {

	@Override
	protected Connection _getConnection(String connectionClassName) throws OdaException {
		return new JDOConnectionImpl();
	}

}
