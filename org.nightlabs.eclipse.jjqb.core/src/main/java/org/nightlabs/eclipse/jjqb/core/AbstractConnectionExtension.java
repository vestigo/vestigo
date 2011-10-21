package org.nightlabs.eclipse.jjqb.core;

import org.eclipse.datatools.connectivity.oda.OdaException;

public abstract class AbstractConnectionExtension implements IConnectionExtension {

	private IConnectionExtensionFactory connectionExtensionFactory;
	private IConnection connection;

	@Override
	public IConnection getConnection() {
		return connection;
	}
	@Override
	public void setConnection(IConnection connection) {
		this.connection = connection;
	}

	@Override
	public IConnectionExtensionFactory getConnectionExtensionFactory() {
		return connectionExtensionFactory;
	}
	@Override
	public void setConnectionExtensionFactory(IConnectionExtensionFactory connectionExtensionFactory) {
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
