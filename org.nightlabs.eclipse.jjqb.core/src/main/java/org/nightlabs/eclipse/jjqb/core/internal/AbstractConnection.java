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

package org.nightlabs.eclipse.jjqb.core.internal;

import java.util.List;
import java.util.Properties;
import java.util.UUID;

import org.eclipse.datatools.connectivity.oda.IDataSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.core.Connection;
import org.nightlabs.eclipse.jjqb.core.ConnectionExtension;
import org.nightlabs.eclipse.jjqb.core.ConnectionExtensionRegistry;
import org.nightlabs.eclipse.jjqb.core.ConnectionProfile;
import org.nightlabs.eclipse.jjqb.core.ConnectionProfileRegistry;
import org.nightlabs.eclipse.jjqb.core.util.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.icu.util.ULocale;

/**
 * Base implementation for a {@link Connection} used in the JDO/JPA data source.
 *
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 */
public abstract class AbstractConnection implements Connection
{
	private static final Logger logger = LoggerFactory.getLogger(AbstractConnection.class);

	private ConnectionProfile connectionProfile;
	private Properties connectionProperties;
	private Object appContext;

	public AbstractConnection() { }

	@Override
	public ConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}

	@Override
	public Properties getConnectionProperties() {
		return connectionProperties;
	}

	@Override
	public final void open(Properties connProperties) throws OdaException
	{
		if (connProperties == null)
			throw new IllegalArgumentException("connProperties == null");

		this.connectionProperties = connProperties;

		UUID profileID = PropertiesUtil.getProfileID(connProperties);
		if (profileID == null)
			throw new IllegalStateException("connProperties do not contain entry for key=\"" + PropertiesUtil.PROFILE_ID + "\"!");

		this.connectionProfile = ConnectionProfileRegistry.sharedInstance().getConnectionProfile(this.getClass(), profileID);

		connectionProfile.preConnectionOpen(this);
		preOpen();
		_open();
		postOpen();
		connectionProfile.postConnectionOpen(this);
	}

	@Override
	public void setAppContext(Object context) throws OdaException {
		this.appContext = context;
	}

	protected void preOpen() throws OdaException
	{
		for (ConnectionExtension extension : getConnectionExtensions())
			extension.preOpen();
	}

	protected abstract void _open() throws OdaException;

	protected void postOpen() throws OdaException
	{
		for (ConnectionExtension extension : getConnectionExtensions())
			extension.postOpen();
	}

	/**
	 * Get the appContext previously set by {@link #setAppContext(Object)}
	 */
	public Object getAppContext() {
		return appContext;
	}

	@Override
	public final void close() throws OdaException
	{
		if (connectionProfile != null)
			connectionProfile.preConnectionClose(this);

		preClose();
		_close();
		postClose();

		if (connectionProfile != null)
			connectionProfile.postConnectionClose(this);

		connectionProfile = null;
		connectionProperties = null;
	}

	public List<? extends ConnectionExtension> getConnectionExtensions()
	{
		return ConnectionExtensionRegistry.sharedInstance().getConnectionExtensions(this);
	}

	protected void preClose() throws OdaException {
		for (ConnectionExtension extension : getConnectionExtensions())
			extension.preClose();
	}

	protected abstract void _close() throws OdaException;

	protected void postClose() throws OdaException {
		for (ConnectionExtension extension : getConnectionExtensions())
			extension.postClose();
	}

	@Override
	public boolean isOpen() throws OdaException {
		return connectionProperties != null;
	}

	protected void assertOpen() throws OdaException {
		if (!isOpen())
			throw new OdaException(new IllegalStateException("Connection is not open!"));
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

	protected static final void doNothing() { }
}
