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

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.IDataSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.core.ConnectionExtensionRegistry;
import org.nightlabs.eclipse.jjqb.core.IConnection;
import org.nightlabs.eclipse.jjqb.core.IConnectionExtension;
import org.nightlabs.eclipse.jjqb.core.util.PropertiesUtil;
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

		preOpen();
		_open();
		postOpen();
	}

	@Override
	public void setAppContext(Object context) throws OdaException {
		this.appContext = context;
	}

	protected void preOpen() throws OdaException
	{
		for (IConnectionExtension extension : getConnectionExtensions())
			extension.preOpen();
	}

	protected abstract void _open() throws OdaException;

	protected void postOpen() throws OdaException
	{
		for (IConnectionExtension extension : getConnectionExtensions())
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
		preClose();
		_close();
		postClose();

		persistenceEngineClassLoader = null;
		persistenceEngineClasspathURLList = null;
		connectionProperties = null;
	}

	public List<? extends IConnectionExtension> getConnectionExtensions()
	{
		return ConnectionExtensionRegistry.sharedInstance().getConnectionExtensions(this);
	}

	protected void preClose() throws OdaException {
		for (IConnectionExtension extension : getConnectionExtensions())
			extension.preClose();
	}

	protected abstract void _close() throws OdaException;

	protected void postClose() throws OdaException {
		for (IConnectionExtension extension : getConnectionExtensions())
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

	private List<URL> persistenceEngineClasspathURLList;

	@Override
	public List<URL> getPersistenceEngineClasspathURLList() throws OdaException
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

//	public URLClassLoader getQueryExecClassLoader() throws OdaException
//	{
//		return getPersistenceEngineClassLoader();
//	}

	@Override
	public URLClassLoader getPersistenceEngineClassLoader() throws OdaException
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
