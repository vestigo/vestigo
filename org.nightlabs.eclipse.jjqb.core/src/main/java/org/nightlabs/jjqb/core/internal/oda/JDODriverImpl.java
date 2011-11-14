package org.nightlabs.eclipse.jjqb.core.internal.oda;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.core.oda.Connection;
import org.nightlabs.eclipse.jjqb.core.oda.JDODriver;

public class JDODriverImpl extends AbstractDriver implements JDODriver {

	@Override
	protected Connection _getConnection(String connectionClassName) throws OdaException {
		return new JDOConnectionImpl();
	}

}
