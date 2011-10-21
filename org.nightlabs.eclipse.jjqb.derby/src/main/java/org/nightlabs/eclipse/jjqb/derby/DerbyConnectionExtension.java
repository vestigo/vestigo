package org.nightlabs.eclipse.jjqb.derby;

import java.lang.reflect.Method;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.core.AbstractConnectionExtension;
import org.nightlabs.eclipse.jjqb.core.util.PropertiesUtil;

public class DerbyConnectionExtension extends AbstractConnectionExtension {

	@Override
	public void postClose() throws OdaException {
		// Shut down Derby
		Properties properties = getConnection().getConnectionProperties();
		String connectionURL = null;
		connectionURL = properties.getProperty(PropertiesUtil.PREFIX_PERSISTENCE + "javax.jdo.option.ConnectionURL");
		// TODO it seems there is no standard property defined in JPA :-( => Need yet another extension-point

		if (connectionURL != null && connectionURL.startsWith("jdbc:derby:")) {
			URLClassLoader peClassLoader = getConnection().getPersistenceEngineClassLoader();
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

	private static final void doNothing() { }

	private static Connection driverManager_getConnection(String connectionURL, Properties info, ClassLoader classLoader) throws SQLException
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
}
