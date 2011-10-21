package org.nightlabs.eclipse.jjqb.core.internal;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.core.IConnection;
import org.nightlabs.eclipse.jjqb.core.IJDODriver;

public class JDODriver extends AbstractDriver implements IJDODriver {

	@Override
	protected IConnection _getConnection(String connectionClassName) throws OdaException {
		return new JDOConnection();
	}

}
