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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.datatools.connectivity.oda.IDataSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;
import org.nightlabs.jjqb.childvm.shared.api.ChildVM;
import org.nightlabs.jjqb.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.jjqb.core.oda.Connection;
import org.nightlabs.jjqb.core.oda.ConnectionExtension;
import org.nightlabs.jjqb.core.oda.ConnectionExtensionRegistry;
import org.nightlabs.jjqb.core.oda.ConnectionProfile;
import org.nightlabs.jjqb.core.oda.ConnectionProfileRegistry;
import org.nightlabs.jjqb.core.oda.OdaMultiCauseException;
import org.nightlabs.jjqb.core.oda.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.icu.util.ULocale;

/**
 * Base implementation for a {@link Connection} used in the JDO/JPA data source.
 *
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class AbstractConnection implements Connection
{
	private static final Logger logger = LoggerFactory.getLogger(AbstractConnection.class);

	private UUID connectionID = UUID.randomUUID();
	private ConnectionProfile connectionProfile;
	private Properties connectionProperties;
	private Object appContext;
	private AtomicInteger nextQueryID = new AtomicInteger();
	private Set<Query> queries = new HashSet<Query>();

	public AbstractConnection() { }

	@Override
	public UUID getConnectionID() {
		return connectionID;
	}

	@Override
	public ConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}

	protected int nextQueryID() {
		return nextQueryID.getAndIncrement();
	}

	protected ChildVM getChildVM()
	{
		ConnectionProfile connectionProfile = getConnectionProfile();
		if (connectionProfile == null)
			return null;
		else
			return connectionProfile.getChildVM();
	}

	@Override
	public Properties getConnectionProperties() {
		return connectionProperties;
	}

	@Override
	public synchronized final void open(Properties connProperties) throws OdaException
	{
		if (connProperties == null)
			throw new IllegalArgumentException("connProperties == null");

		this.connectionProperties = connProperties;

		String profileID = PropertiesUtil.getProfileID(connProperties);
		if (profileID == null)
			throw new IllegalStateException("PropertiesUtil.getProfileID(connProperties) returned null!");

		logger.info("open: profileID={}", profileID);

		this.connectionProfile = ConnectionProfileRegistry.sharedInstance().getConnectionProfile(this.getClass(), profileID);

		boolean error = true;
		try {
			connectionProfile.preConnectionOpen(this);
			preOpen();
			doOpen();
			postOpen();
			connectionProfile.postConnectionOpen(this);
			error = false;
		} finally {
			if (error) {
				try {
					close();
				} catch (Throwable t) {
					logger.error("open: Closing connection due to error while opening resulted in another error: " + t, t);
				}
			}
		}
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

	protected void doOpen() throws OdaException
	{
		getChildVM().putConnectionDTO(toConnectionDTO());

		// TODO BEGIN remove this debug stuff
		Collection<ConnectionDTO> connectionDTOs = getChildVM().getConnectionDTOs(null);
		for (ConnectionDTO connectionDTO : connectionDTOs) {
			System.out.println("connectionDTO.connectionID=" + connectionDTO.getConnectionID());
		}
		// TODO END remove this debug stuff
	}

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
	public synchronized final void close() throws OdaException
	{
		logger.info("close: profileID={}", connectionProfile == null ? null : connectionProfile.getProfileID());

		ArrayList<Throwable> errors = new ArrayList<Throwable>();

		if (connectionProfile != null) {
			try {
				connectionProfile.preConnectionClose(this);
			} catch (Exception x) {
				logger.error("close: " + x, x);
				errors.add(x);
			}
		}

		try {
			preClose();
		} catch (Exception x) {
			logger.error("close: " + x, x);
			errors.add(x);
		}

		try {
			doClose();
		} catch (Exception x) {
			logger.error("close: " + x, x);
			errors.add(x);
		}

		try {
			postClose();
		} catch (Exception x) {
			logger.error("close: " + x, x);
			errors.add(x);
		}

		if (connectionProfile != null) {
			try {
				connectionProfile.postConnectionClose(this);
			} catch (Exception x) {
				logger.error("close: " + x, x);
				errors.add(x);
			}
		}

		if (!errors.isEmpty())
			throw new OdaMultiCauseException(errors);

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

		for (Query query : new ArrayList<Query>(queries))
			query.close();
	}

	protected void doClose() throws OdaException
	{
		getChildVM().deleteConnectionDTO(getConnectionID());
	}

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

	public ConnectionDTO toConnectionDTO()
	{
		ConnectionDTO result = newConnectionDTO();
		ConnectionProfile connectionProfile = getConnectionProfile();

		result.setConnectionID(getConnectionID());
		result.setProfileID(connectionProfile == null ? null : connectionProfile.getProfileID());

		return result;
	}

	protected abstract ConnectionDTO newConnectionDTO();

	protected static final void doNothing() { }

	@Override
	public synchronized final Query newQuery(String dataSetType) throws OdaException {
		assertOpen();
		Query query = _newQuery(dataSetType);
		queries.add(query);
		return query;
	}

	public synchronized void onCloseQuery(Query query) {
		queries.remove(query);
	}

	protected abstract Query _newQuery(String dataSetType) throws OdaException;
}
