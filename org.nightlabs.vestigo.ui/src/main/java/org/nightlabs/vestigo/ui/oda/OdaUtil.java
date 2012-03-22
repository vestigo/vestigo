package org.nightlabs.vestigo.ui.oda;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.IManagedConnection;

public class OdaUtil
{
	public static final String connectionFactoryID = "org.eclipse.datatools.connectivity.oda.IConnection";

	public static IManagedConnection getManagedConnection(IConnectionProfile connectionProfile)
	{
		if (connectionProfile == null)
			throw new IllegalArgumentException("connectionProfile == null");

		IManagedConnection managedConnection = connectionProfile.getManagedConnection(connectionFactoryID);
		if (managedConnection == null)
			throw new IllegalStateException("connectionProfile.getManagedConnection(\"" + connectionFactoryID + "\") returned null!");

		return managedConnection;
	}

//	public static boolean isConnected(IConnectionProfile connectionProfile)
//	{
//		if (connectionProfile == null)
//			throw new IllegalArgumentException("connectionProfile == null");
//
//		final IManagedConnection managedConnection = getManagedConnection(connectionProfile);
//		return managedConnection.isConnected();
//	}
}
