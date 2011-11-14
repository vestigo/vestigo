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

package org.nightlabs.jjqb.core.internal.oda;

import org.eclipse.datatools.connectivity.oda.IDataSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.jjqb.childvm.shared.JDOConnectionDTO;
import org.nightlabs.jjqb.core.oda.JDOConnection;
import org.nightlabs.jjqb.core.oda.Query;

public class JDOConnectionImpl extends AbstractConnection implements JDOConnection
{
	public JDOConnectionImpl() { }

	@Override
	public IDataSetMetaData getMetaData(String dataSetType) throws OdaException {
		return super.getMetaData(dataSetType);
	}

	@Override
	protected Query _newQuery(String dataSetType) throws OdaException {
		// We ignore the dataSetType, because our driver supports only one type.
		return new JDOQueryImpl(this);
	}

	@Override
	protected ConnectionDTO newConnectionDTO() {
		return new JDOConnectionDTO();
	}
}
