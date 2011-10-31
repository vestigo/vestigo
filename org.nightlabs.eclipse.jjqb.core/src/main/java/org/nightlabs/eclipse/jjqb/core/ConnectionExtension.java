package org.nightlabs.eclipse.jjqb.core;

import org.eclipse.datatools.connectivity.oda.OdaException;

public interface ConnectionExtension
{
	void setConnectionExtensionFactory(ConnectionExtensionFactory factory);
	ConnectionExtensionFactory getConnectionExtensionFactory();

	void setConnection(Connection connection);
	Connection getConnection();

	void postBind();
	void preOpen() throws OdaException;
	void postOpen() throws OdaException;

	void preClose() throws OdaException;
	void postClose() throws OdaException;
}
