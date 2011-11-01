package org.nightlabs.eclipse.jjqb.core.internal;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.core.ClassLoaderManager;
import org.nightlabs.eclipse.jjqb.core.ConnectionProfile;
import org.nightlabs.eclipse.jjqb.core.util.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassLoaderManagerImpl implements ClassLoaderManager
{
	private static final Logger logger = LoggerFactory.getLogger(ClassLoaderManagerImpl.class);

	private List<URL> persistenceEngineClasspathURLList;

	private ConnectionProfile connectionProfile;
	private Properties connectionProperties;

	@Override
	public void setConnectionProfile(ConnectionProfile connectionProfile)
	{
		if (connectionProfile == null)
			throw new IllegalArgumentException("driver == null");

		if (this.connectionProfile == connectionProfile)
			return;

		if (this.connectionProfile != null)
			throw new IllegalStateException("this.connectionGroup already assigned! Cannot change!");

		this.connectionProfile =  connectionProfile;
	}

	@Override
	public ConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}

	@Override
	public boolean isOpen(){
		return connectionProperties != null;
	}

	protected void assertOpen() throws OdaException {
		if (!isOpen())
			throw new OdaException(new IllegalStateException("Connection is not open!"));
	}

	@Override
	public Properties getConnectionProperties() {
		return connectionProperties;
	}

	@Override
	public final void open(Properties connProperties) throws OdaException
	{
		if (connectionProfile == null)
			throw new IllegalStateException("this.connectionGroup == null !!! Call setConnectionGroup(...) first!");

		if (connProperties == null)
			throw new IllegalArgumentException("connProperties == null");

		this.connectionProperties = connProperties;
	}

	@Override
	public final void close() throws OdaException
	{
		persistenceEngineClassLoader = null;
		persistenceEngineClasspathURLList = null;
		connectionProperties = null;
	}

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

// TODO need a separate class loader for JDBC!!!
// see: http://www.szegedi.org/articles/memleak2.html
// "Never, ever, load a JDBC driver through a class loader that is meant to be eventually thrown away.
// Move the JDBC driver classes into a location where a permanent class loader (system or application
// class loader) will pick it up."
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
}
