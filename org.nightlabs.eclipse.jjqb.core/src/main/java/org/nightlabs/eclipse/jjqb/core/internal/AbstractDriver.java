package org.nightlabs.eclipse.jjqb.core.internal;

import org.eclipse.datatools.connectivity.oda.IConnection;
import org.eclipse.datatools.connectivity.oda.LogConfiguration;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.core.ConnectionExtensionRegistry;
import org.nightlabs.eclipse.jjqb.core.IDriver;

public abstract class AbstractDriver implements IDriver {

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
	public final IConnection getConnection(String connectionClassName) throws OdaException {
		org.nightlabs.eclipse.jjqb.core.IConnection connection = _getConnection(connectionClassName);
		ConnectionExtensionRegistry.sharedInstance().bind(connection);
		return connection;
	}

	protected abstract org.nightlabs.eclipse.jjqb.core.IConnection _getConnection(String connectionClassName) throws OdaException;
}