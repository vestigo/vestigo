package org.nightlabs.vestigo.core.oda;

import org.eclipse.datatools.connectivity.oda.OdaException;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 * @deprecated Probably not needed - was introduced for derby DB start/stop + classloading problems. Not needed due to new child-VM.
 */
@Deprecated
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
