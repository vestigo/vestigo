package org.nightlabs.jjqb.cumulus4j.core.oda.impl;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.core.oda.Connection;
import org.nightlabs.jjqb.core.oda.impl.AbstractDriver;
import org.nightlabs.jjqb.cumulus4j.core.oda.JPACumulus4jDriver;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPACumulus4jDriverImpl extends AbstractDriver implements JPACumulus4jDriver {

	@Override
	protected Connection _getConnection(String connectionClassName) throws OdaException {
		return new JPACumulus4jConnectionImpl();
	}

}
