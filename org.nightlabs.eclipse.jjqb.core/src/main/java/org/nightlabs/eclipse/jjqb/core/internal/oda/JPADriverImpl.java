package org.nightlabs.eclipse.jjqb.core.internal.oda;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.core.oda.Connection;
import org.nightlabs.eclipse.jjqb.core.oda.JPADriver;

public class JPADriverImpl extends AbstractDriver implements JPADriver {

	@Override
	protected Connection _getConnection(String connectionClassName) throws OdaException {
		return new JPAConnectionImpl();
	}

}