package org.nightlabs.jjqb.core.connectionpropertiesfilter;

import java.util.Properties;

public interface ConnectionPropertiesFilter
{
//	ConnectionProfile getConnectionProfile();
//
//	void setConnectionProfile(ConnectionProfile connectionProfile);

	void filter(Properties connectionProperties);
}
