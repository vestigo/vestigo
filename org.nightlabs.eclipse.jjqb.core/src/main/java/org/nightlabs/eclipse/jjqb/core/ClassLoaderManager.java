package org.nightlabs.eclipse.jjqb.core;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.OdaException;

public interface ClassLoaderManager
{
	void setConnectionProfile(ConnectionProfile connectionProfile);

	ConnectionProfile getConnectionProfile();

	List<URL> getPersistenceEngineClasspathURLList() throws OdaException;

	URLClassLoader getPersistenceEngineClassLoader() throws OdaException;

	boolean isOpen();

	void open(Properties connProperties) throws OdaException;

	void close() throws OdaException;

	Properties getConnectionProperties();
}
