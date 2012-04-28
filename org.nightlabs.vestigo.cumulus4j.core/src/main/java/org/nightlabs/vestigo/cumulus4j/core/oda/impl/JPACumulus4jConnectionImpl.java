/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.cumulus4j.core.oda.impl;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.vestigo.core.oda.JPAConnection;
import org.nightlabs.vestigo.core.oda.Query;
import org.nightlabs.vestigo.core.oda.impl.AbstractConnection;
import org.nightlabs.vestigo.cumulus4j.childvm.shared.JPACumulus4jConnectionDTO;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPACumulus4jConnectionImpl extends AbstractConnection implements JPAConnection
{
	public JPACumulus4jConnectionImpl() { }

	@Override
	protected Query _newQuery(String dataSetType) throws OdaException {
		// We ignore the dataSetType, because our driver supports only one type.
		return new JPACumulus4jQueryImpl(this);
	}

	@Override
	protected ConnectionDTO newConnectionDTO() {
		return new JPACumulus4jConnectionDTO();
	}
}
