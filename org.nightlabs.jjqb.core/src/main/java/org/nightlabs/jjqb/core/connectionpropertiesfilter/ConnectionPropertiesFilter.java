package org.nightlabs.jjqb.core.connectionpropertiesfilter;

import java.util.Properties;

import org.nightlabs.jjqb.core.oda.ConnectionProfile;

public interface ConnectionPropertiesFilter
{
	ConnectionProfile getConnectionProfile();

	void setConnectionProfile(ConnectionProfile connectionProfile);

	void filter(Properties connectionProperties);
}
