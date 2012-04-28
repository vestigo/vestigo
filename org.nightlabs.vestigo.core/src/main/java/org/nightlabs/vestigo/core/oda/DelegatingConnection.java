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
package org.nightlabs.vestigo.core.oda;

import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.IConnection;
import org.eclipse.datatools.connectivity.oda.IDataSetMetaData;
import org.eclipse.datatools.connectivity.oda.IQuery;
import org.eclipse.datatools.connectivity.oda.OdaException;

import com.ibm.icu.util.ULocale;

public class DelegatingConnection
implements IConnection
{
	private IConnection connection;

	public DelegatingConnection(IConnection connection)
	{
		if (connection == null)
			throw new IllegalArgumentException("connection == null");

		this.connection = connection;
	}

	@Override
	public void close() throws OdaException {
		connection.close();
	}

	@Override
	public void commit() throws OdaException {
		connection.commit();
	}

	@Override
	public int getMaxQueries() throws OdaException {
		return connection.getMaxQueries();
	}

	@Override
	public IDataSetMetaData getMetaData(String dataSetType) throws OdaException {
		return connection.getMetaData(dataSetType);
	}

	@Override
	public boolean isOpen() throws OdaException {
		return connection.isOpen();
	}

	@Override
	public IQuery newQuery(String dataSetType) throws OdaException {
		return connection.newQuery(dataSetType);
	}

	@Override
	public void open(Properties connProperties) throws OdaException {
		connection.open(connProperties);
	}

	@Override
	public void rollback() throws OdaException {
		connection.rollback();
	}

	@Override
	public void setAppContext(Object context) throws OdaException {
		connection.setAppContext(context);
	}

	@Override
	public void setLocale(ULocale locale) throws OdaException {
		connection.setLocale(locale);
	}
}
