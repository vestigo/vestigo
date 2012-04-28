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

import org.eclipse.datatools.connectivity.oda.LogConfiguration;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.vestigo.core.oda.Connection;
import org.nightlabs.vestigo.core.oda.Driver;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class AbstractDriver implements Driver {

	public static final String DRIVER_NAME = "JDO-JPA-DataSource";
	public static final String DRIVER_VERSION = "0.0.1";

	private Object appContext;
	private LogConfiguration logConfiguration;

	public AbstractDriver() { }

	@Override
	public int getMaxConnections() throws OdaException {
		return 0;
	}

	@Override
	public void setAppContext(Object context) throws OdaException {
		this.appContext = context;
	}

	/**
	 * Get the <code>appContext</code> set by {@link #setAppContext(Object)}.
	 */
	public Object getAppContext() {
		return appContext;
	}

	@Override
	public void setLogConfiguration(LogConfiguration logConfiguration) throws OdaException {
		this.logConfiguration = logConfiguration;
	}

	/**
	 * Get the <code>logConfiguration</code> set by {@link #setLogConfiguration(LogConfiguration)}.
	 */
	public LogConfiguration getLogConfiguration() {
		return logConfiguration;
	}

	@Override
	public final Connection getConnection(String connectionClassName) throws OdaException {
		org.nightlabs.vestigo.core.oda.Connection connection = _getConnection(connectionClassName);
		return connection;
	}

	protected abstract Connection _getConnection(String connectionClassName) throws OdaException;
}
