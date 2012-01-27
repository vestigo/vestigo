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

package org.nightlabs.jjqb.core.oda.impl;

import org.eclipse.datatools.connectivity.oda.IConnection;
import org.eclipse.datatools.connectivity.oda.IDataSetMetaData;
import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.OdaException;

/**
 * Base implementation for a {@link IDataSetMetaData} used in the JDO/JPA data source.
 *
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ConnectionMetaData implements IDataSetMetaData
{
	private IConnection connection;

	public ConnectionMetaData(IConnection connection) {
		this.connection = connection;
	}

	@Override
	public IConnection getConnection() throws OdaException {
		return connection;
	}

	@Override
	public int getDataSourceMajorVersion() throws OdaException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDataSourceMinorVersion() throws OdaException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IResultSet getDataSourceObjects(String catalog, String schema, String object, String version) throws OdaException {
		// TODO Optional method not implemented
		return null;
	}

	@Override
	public String getDataSourceProductName() throws OdaException {
		return AbstractDriver.DRIVER_NAME;
	}

	@Override
	public String getDataSourceProductVersion() throws OdaException {
		return AbstractDriver.DRIVER_VERSION;
	}

	@Override
	public int getSQLStateType() throws OdaException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSortMode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean supportsInParameters() throws OdaException {
		return true;
	}

	@Override
	public boolean supportsMultipleOpenResults() throws OdaException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supportsMultipleResultSets() throws OdaException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supportsNamedParameters() throws OdaException {
		return true;
	}

	@Override
	public boolean supportsNamedResultSets() throws OdaException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supportsOutParameters() throws OdaException {
		// TODO Auto-generated method stub
		return false;
	}
}
