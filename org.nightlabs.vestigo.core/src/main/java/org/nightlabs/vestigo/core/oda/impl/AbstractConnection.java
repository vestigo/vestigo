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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.datatools.connectivity.oda.IDataSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;
import org.nightlabs.vestigo.childvm.shared.api.ChildVM;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.vestigo.core.oda.Connection;
import org.nightlabs.vestigo.core.oda.ConnectionProfile;
import org.nightlabs.vestigo.core.oda.ConnectionProfileRegistry;
import org.nightlabs.vestigo.core.oda.OdaMultiCauseException;
import org.nightlabs.vestigo.core.oda.Query;
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
			throw new IllegalArgumentException("connProperties == null"); //$NON-NLS-1$

		this.connectionProperties = connProperties;

		String profileID = PropertiesUtil.getProfileID(connProperties);
		if (profileID == null)
			throw new IllegalStateException("PropertiesUtil.getProfileID(connProperties) returned null!"); //$NON-NLS-1$

		logger.info("open: profileID={}", profileID); //$NON-NLS-1$

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
					logger.error("open: Closing connection due to error while opening resulted in another error: " + t, t); //$NON-NLS-1$
				}
			}
		}
	}

	@Override
	public void setAppContext(Object context) throws OdaException {
		this.appContext = context;
	}

	protected void preOpen() throws OdaException { }

	protected void doOpen() throws OdaException
	{
		getChildVM().putConnectionDTO(toConnectionDTO());

		// TODO BEGIN remove this debug stuff
		Collection<ConnectionDTO> connectionDTOs = getChildVM().getConnectionDTOs(null);
		for (ConnectionDTO connectionDTO : connectionDTOs) {
			System.out.println("connectionDTO.connectionID=" + connectionDTO.getConnectionID()); //$NON-NLS-1$
		}
		// TODO END remove this debug stuff
	}

	protected void postOpen() throws OdaException { }

	/**
	 * Get the appContext previously set by {@link #setAppContext(Object)}
	 */
	public Object getAppContext() {
		return appContext;
	}

	@Override
	public synchronized final void close() throws OdaException
	{
		logger.info("close: profileID={}", connectionProfile == null ? null : connectionProfile.getProfileID()); //$NON-NLS-1$

		ArrayList<Throwable> errors = new ArrayList<Throwable>();

		if (connectionProfile != null) {
			try {
				connectionProfile.preConnectionClose(this);
			} catch (Exception x) {
				logger.error("close: " + x, x); //$NON-NLS-1$
				errors.add(x);
			}
		}

		try {
			preClose();
		} catch (Exception x) {
			logger.error("close: " + x, x); //$NON-NLS-1$
			errors.add(x);
		}

		try {
			doClose();
		} catch (Exception x) {
			logger.error("close: " + x, x); //$NON-NLS-1$
			errors.add(x);
		}

		try {
			postClose();
		} catch (Exception x) {
			logger.error("close: " + x, x); //$NON-NLS-1$
			errors.add(x);
		}

		if (connectionProfile != null) {
			try {
				connectionProfile.postConnectionClose(this);
			} catch (Exception x) {
				logger.error("close: " + x, x); //$NON-NLS-1$
				errors.add(x);
			}
		}

		if (!errors.isEmpty())
			throw new OdaMultiCauseException(errors);

		connectionProfile = null;
		connectionProperties = null;
	}

	protected void preClose() throws OdaException
	{
		for (Query query : new ArrayList<Query>(queries))
			query.close();
	}

	protected void doClose() throws OdaException
	{
		getChildVM().deleteConnectionDTO(getConnectionID());
	}

	protected void postClose() throws OdaException { }

	@Override
	public boolean isOpen() throws OdaException {
		return connectionProperties != null;
	}

	protected void assertOpen() throws OdaException {
		if (!isOpen())
			throw new OdaException(new IllegalStateException("Connection is not open!")); //$NON-NLS-1$
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
		getChildVM().commitConnection(getConnectionID());
	}

	@Override
	public void rollback() throws OdaException {
		getChildVM().rollbackConnection(getConnectionID());
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
