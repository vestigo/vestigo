package org.nightlabs.eclipse.jjqb.core;

import org.eclipse.datatools.connectivity.oda.OdaException;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 * @deprecated Probably not needed - was introduced for derby DB start/stop + classloading problems. Not needed due to new child-VM.
 */
@Deprecated
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
