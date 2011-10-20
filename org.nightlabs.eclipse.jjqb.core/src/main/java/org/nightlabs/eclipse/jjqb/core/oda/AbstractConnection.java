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

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.IConnection;
import org.eclipse.datatools.connectivity.oda.IDataSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.icu.util.ULocale;

/**
 * Base implementation for a {@link IConnection} used in the JDO/JPA data source.
 *
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 */
public abstract class AbstractConnection implements IConnection
{
	private static final Logger logger = LoggerFactory.getLogger(AbstractConnection.class);

	private Properties connectionProperties;
	private Object appContext;

	public Properties getConnectionProperties() {
		return connectionProperties;
	}

	@Override
	public void open(Properties connProperties) throws OdaException
	{
		if (connProperties == null)
			throw new IllegalArgumentException("connProperties == null");

		this.connectionProperties = connProperties;
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
	public void close() throws OdaException
	{
		// Shut down Derby - TODO this must be moved into some derby-specific extension (=> need extension-point)
		if (isOpen()) {
			Properties properties = getConnectionProperties();
			String connectionURL = null;
			connectionURL = properties.getProperty(PropertiesUtil.PREFIX_PERSISTENCE + "javax.jdo.option.ConnectionURL");
			// TODO it seems there is no standard property defined in JPA :-( => Need yet another extension-point

			if (connectionURL != null && connectionURL.startsWith("jdbc:derby:")) {
				URLClassLoader peClassLoader = getPersistenceEngineClassLoader();
				try {
					String shutdownConnURL = connectionURL + (connectionURL.endsWith(";") ? "" : ";") + "shutdown=true";
					driverManager_getConnection(shutdownConnURL, null, peClassLoader); // close our DB only
//					driverManager_getConnection("jdbc:derby:;shutdown=true", null, peClassLoader); // closes derby completely - all DBs.
				} catch (SQLException x) {
					// ignore, because this is to be expected according to http://db.apache.org/derby/docs/dev/devguide/tdevdvlp40464.html
					doNothing(); // Remove warning from PMD report.
				}
			}
		}

		persistenceEngineClassLoader = null;
		persistenceEngineClasspathURLList = null;
		connectionProperties = null;
	}

	private static Connection driverManager_getConnection(String connectionURL, Properties info, ClassLoader classLoader)
	throws SQLException
	{
		try {
			Method mGetConnectionWithClassLoader = DriverManager.class.getDeclaredMethod(
					"getConnection", String.class, Properties.class, ClassLoader.class
			);
			mGetConnectionWithClassLoader.setAccessible(true);
			Object result = mGetConnectionWithClassLoader.invoke(null, connectionURL, info, classLoader);
			return (Connection) result;
		} catch (Exception e) {
			Throwable t = e;
			do {
				if (t instanceof SQLException)
					throw (SQLException)t;

				t = t.getCause();
			} while (t != null);

			if (e instanceof RuntimeException)
				throw (RuntimeException)e;
			else
				throw new RuntimeException(e);
		}
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

	private List<URL> persistenceEngineClasspathURLList;

	protected List<URL> getPersistenceEngineClasspathURLList() throws OdaException
	{
		assertOpen();

		if (this.persistenceEngineClasspathURLList == null) {
			Properties connProperties = getConnectionProperties();
			List<String> persistenceEngineClasspathStringList = PropertiesUtil.getList(connProperties, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);
			List<URL> persistenceEngineClasspathURLList = new ArrayList<URL>(persistenceEngineClasspathStringList.size());
			for (String persistenceEngineClasspathElement : persistenceEngineClasspathStringList) {
				logger.debug("open: adding persistenceEngineClasspathElement: " + persistenceEngineClasspathElement);

				File f = new File(persistenceEngineClasspathElement);
				if (!f.exists())
					throw new OdaException(new IOException("persistenceEngineClasspathElement points to a non-existing file: " + f.getAbsolutePath()));

				if (!f.canRead())
					throw new OdaException(new IOException("persistenceEngineClasspathElement points to an existing but non-readable file: " + f.getAbsolutePath()));

				try {
					persistenceEngineClasspathURLList.add(f.toURI().toURL());
				} catch (MalformedURLException e) {
					throw new OdaException(e);
				}
			}
			this.persistenceEngineClasspathURLList = persistenceEngineClasspathURLList;
		}

		return this.persistenceEngineClasspathURLList;
	}

	private URLClassLoader persistenceEngineClassLoader;

	protected URLClassLoader getPersistenceEngineClassLoader() throws OdaException
	{
		assertOpen();

		if (this.persistenceEngineClassLoader == null) {
			List<URL> persistenceEngineClasspathURLList = getPersistenceEngineClasspathURLList();

			URLClassLoader persistenceEngineClassLoader = new URLClassLoader(
					persistenceEngineClasspathURLList.toArray(new URL[persistenceEngineClasspathURLList.size()]),
					this.getClass().getClassLoader()
			);

			this.persistenceEngineClassLoader = persistenceEngineClassLoader;
		}
		return this.persistenceEngineClassLoader;
	}

	protected static final void doNothing() { }
}
