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
package org.nightlabs.vestigo.core.oda.impl;

import org.eclipse.datatools.connectivity.oda.IDataSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JPAConnectionDTO;
import org.nightlabs.vestigo.core.oda.JPAConnection;
import org.nightlabs.vestigo.core.oda.Query;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPAConnectionImpl extends AbstractConnection implements JPAConnection
{
	public JPAConnectionImpl() { }

	@Override
	public IDataSetMetaData getMetaData(String dataSetType) throws OdaException {
		return super.getMetaData(dataSetType);
	}

	@Override
	protected Query _newQuery(String dataSetType) throws OdaException {
		// We ignore the dataSetType, because our driver supports only one type.
		return new JPAQueryImpl(this);
	}

	@Override
	protected ConnectionDTO newConnectionDTO() {
		return new JPAConnectionDTO();
	}
}
