package org.nightlabs.eclipse.jjqb.core.internal;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.core.Connection;
import org.nightlabs.eclipse.jjqb.core.JDODriver;

public class JDODriverImpl extends AbstractDriver implements JDODriver {

	@Override
	protected Connection _getConnection(String connectionClassName) throws OdaException {
		return new JDOConnectionImpl();
	}

}
