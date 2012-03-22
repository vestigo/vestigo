/* *****************************************************************************
 *  NightLabs BIRT extensions for JDO                                          *
 *  Copyright (c) 2006 NightLabs, Germany                                      *
 *                                                                             *
 *  All rights reserved. This program and the accompanying materials           *
 *  are made available under the terms of the Eclipse Public License v1.0      *
 *  which accompanies this distribution, and is available at                   *
 *  http://www.eclipse.org/legal/epl-v10.html                                  *
 *                                                                             *
 *  Contributors:                                                              *
 *   Alexander Bieber, NightLabs - initial API and implementation              *
 ******************************************************************************/

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
