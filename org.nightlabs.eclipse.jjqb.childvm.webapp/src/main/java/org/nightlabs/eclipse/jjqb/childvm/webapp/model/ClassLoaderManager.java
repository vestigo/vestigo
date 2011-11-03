package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.nightlabs.eclipse.jjqb.childvm.shared.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassLoaderManager
{
	private static final Logger logger = LoggerFactory.getLogger(ClassLoaderManager.class);

	private List<URL> persistenceEngineClasspathURLList;

	private ConnectionProfile connectionProfile;
	private Properties connectionProperties;

	public void setConnectionProfile(ConnectionProfile connectionProfile)
	{
		if (connectionProfile == null)
			throw new IllegalArgumentException("connectionProfile == null");

		if (this.connectionProfile == connectionProfile)
			return;

		if (this.connectionProfile != null)
			throw new IllegalStateException("this.connectionProfile already assigned! Cannot change!");

		this.connectionProfile =  connectionProfile;
	}

	public ConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}

	public boolean isOpen(){
		return connectionProperties != null;
	}

	protected void assertOpen() {
		if (!isOpen())
			throw new IllegalStateException("ClassLoaderManager is not open!");
	}

	public Properties getConnectionProperties() {
		return connectionProperties;
	}

	public final void open(Properties connProperties)
	{
		if (connectionProfile == null)
			throw new IllegalStateException("this.connectionProfile == null !!! Call setConnectionProfile(...) first!");

		if (connProperties == null)
			throw new IllegalArgumentException("connProperties == null");

		this.connectionProperties = connProperties;
	}

	public final void close()
	{
		persistenceEngineClassLoader = null;
		persistenceEngineClasspathURLList = null;
		connectionProperties = null;
	}

	public List<URL> getPersistenceEngineClasspathURLList() throws IOException
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
					throw new IOException("persistenceEngineClasspathElement points to a non-existing file: " + f.getAbsolutePath());

				if (!f.canRead())
					throw new IOException("persistenceEngineClasspathElement points to an existing but non-readable file: " + f.getAbsolutePath());

				persistenceEngineClasspathURLList.add(f.toURI().toURL());
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
	public URLClassLoader getPersistenceEngineClassLoader() throws IOException
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
