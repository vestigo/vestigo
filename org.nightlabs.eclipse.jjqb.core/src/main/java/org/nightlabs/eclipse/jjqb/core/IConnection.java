package org.nightlabs.eclipse.jjqb.core;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.OdaException;


public interface IConnection extends org.eclipse.datatools.connectivity.oda.IConnection {

	Properties getConnectionProperties();

	List<URL> getPersistenceEngineClasspathURLList() throws OdaException;

	URLClassLoader getPersistenceEngineClassLoader() throws OdaException;

}
