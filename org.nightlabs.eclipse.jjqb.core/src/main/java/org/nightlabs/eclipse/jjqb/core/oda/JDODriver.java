package org.nightlabs.eclipse.jjqb.core.oda;

import org.eclipse.datatools.connectivity.oda.IConnection;
import org.eclipse.datatools.connectivity.oda.OdaException;

public class JDODriver extends AbstractDriver {

	@Override
	public IConnection getConnection(String connectionClassName) throws OdaException {
		return new JDOConnection();
	}

}
