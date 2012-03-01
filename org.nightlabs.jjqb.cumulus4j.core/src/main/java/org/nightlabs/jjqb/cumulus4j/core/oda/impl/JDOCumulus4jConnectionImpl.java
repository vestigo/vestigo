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

package org.nightlabs.jjqb.cumulus4j.core.oda.impl;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.jjqb.core.oda.JDOConnection;
import org.nightlabs.jjqb.core.oda.Query;
import org.nightlabs.jjqb.core.oda.impl.AbstractConnection;
import org.nightlabs.jjqb.cumulus4j.childvm.shared.JDOCumulus4jConnectionDTO;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOCumulus4jConnectionImpl extends AbstractConnection implements JDOConnection
{
	public JDOCumulus4jConnectionImpl() { }

	@Override
	protected Query _newQuery(String dataSetType) throws OdaException {
		// We ignore the dataSetType, because our driver supports only one type.
		return new JDOCumulus4jQueryImpl(this);
	}

	@Override
	protected ConnectionDTO newConnectionDTO() {
		return new JDOCumulus4jConnectionDTO();
	}
}
