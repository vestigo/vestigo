package org.nightlabs.eclipse.jjqb.core;

import java.util.Properties;


public interface Connection extends org.eclipse.datatools.connectivity.oda.IConnection
{
	ConnectionProfile getConnectionProfile();

	Properties getConnectionProperties();
}
