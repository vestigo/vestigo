package org.nightlabs.jjqb.cumulus4j.core.oda.impl;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.core.oda.Connection;
import org.nightlabs.jjqb.core.oda.JPADriver;
import org.nightlabs.jjqb.core.oda.impl.AbstractDriver;
import org.nightlabs.jjqb.core.oda.impl.JPAConnectionImpl;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPACumulus4jDriverImpl extends AbstractDriver implements JPADriver {

	@Override
	protected Connection _getConnection(String connectionClassName) throws OdaException {
		return new JPAConnectionImpl(); // TODO JPA+Cumulus4j!!!
	}

}
