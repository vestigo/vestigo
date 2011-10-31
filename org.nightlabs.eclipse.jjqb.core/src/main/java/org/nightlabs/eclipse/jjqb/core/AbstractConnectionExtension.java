package org.nightlabs.eclipse.jjqb.core;

import org.eclipse.datatools.connectivity.oda.OdaException;

public abstract class AbstractConnectionExtension implements ConnectionExtension {

	private ConnectionExtensionFactory connectionExtensionFactory;
	private Connection connection;

	@Override
	public Connection getConnection() {
		return connection;
	}
	@Override
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public ConnectionExtensionFactory getConnectionExtensionFactory() {
		return connectionExtensionFactory;
	}
	@Override
	public void setConnectionExtensionFactory(ConnectionExtensionFactory connectionExtensionFactory) {
		this.connectionExtensionFactory = connectionExtensionFactory;
	}

	@Override
	public void postBind() { }
	@Override
	public void preOpen() throws OdaException { }
	@Override
	public void postOpen() throws OdaException { }
	@Override
	public void preClose() throws OdaException { }
	@Override
	public void postClose() throws OdaException { }

}
