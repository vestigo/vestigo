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

package org.nightlabs.eclipse.jjqb.core.oda;

import java.util.Map;
import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.IConnection;
import org.eclipse.datatools.connectivity.oda.IDataSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;

import com.ibm.icu.util.ULocale;

/**
 * Base implementation for a {@link IConnection} used in the JDO/JPA data source.
 *
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 */
public abstract class AbstractConnection implements IConnection {

	private Map currentProperties;
	private Object appContext;

	public Map getConnectionProperties() {
		return currentProperties;
	}

	@Override
	public void open(Properties connProperties) throws OdaException {
		currentProperties = connProperties;
	}

	@Override
	public void setAppContext(Object context) throws OdaException {
		this.appContext = context;
	}

	/**
	 * Get the appContext previously set by {@link #setAppContext(Object)}
	 */
	public Object getAppContext() {
		return appContext;
	}

	@Override
	public void close() throws OdaException {
	}

	@Override
	public boolean isOpen() throws OdaException {
		return currentProperties != null;
	}

	@Override
	public IDataSetMetaData getMetaData(String dataSetType) throws OdaException {
		return new ConnectionMetaData(this);
	}

	@Override
	public int getMaxQueries() throws OdaException {
		return 0;
	}

	@Override
	public void commit() throws OdaException {
		// TODO Auto-generated method stub
	}

	@Override
	public void rollback() throws OdaException {
		// TODO Auto-generated method stub
	}

	@Override
	public void setLocale(ULocale locale) throws OdaException {

	}
}
