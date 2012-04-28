/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
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
