package org.nightlabs.jjqb.core.oda.impl;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.core.oda.Connection;
import org.nightlabs.jjqb.core.oda.JPADriver;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPADriverImpl extends AbstractDriver implements JPADriver {

	@Override
	protected Connection _getConnection(String connectionClassName) throws OdaException {
		return new JPAConnectionImpl();
	}

}
