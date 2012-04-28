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
