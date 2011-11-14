package org.nightlabs.jjqb.core.internal.oda;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.core.oda.Connection;
import org.nightlabs.jjqb.core.oda.JDODriver;

public class JDODriverImpl extends AbstractDriver implements JDODriver {

	@Override
	protected Connection _getConnection(String connectionClassName) throws OdaException {
		return new JDOConnectionImpl();
	}

}
