package org.nightlabs.eclipse.jjqb.core.internal;

import org.eclipse.datatools.connectivity.oda.IConnection;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.core.IJDODriver;

public class JDODriver extends AbstractDriver implements IJDODriver {

	@Override
	public IConnection getConnection(String connectionClassName) throws OdaException {
		return new JDOConnection();
	}

}
