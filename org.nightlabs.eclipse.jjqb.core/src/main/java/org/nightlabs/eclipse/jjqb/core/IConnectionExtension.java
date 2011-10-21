package org.nightlabs.eclipse.jjqb.core;

import org.eclipse.datatools.connectivity.oda.OdaException;

public interface IConnectionExtension
{
	void setConnectionExtensionFactory(IConnectionExtensionFactory factory);
	IConnectionExtensionFactory getConnectionExtensionFactory();

	void setConnection(IConnection connection);
	IConnection getConnection();

	void postBind();
	void preOpen() throws OdaException;
	void postOpen() throws OdaException;

	void preClose() throws OdaException;
	void postClose() throws OdaException;
}
