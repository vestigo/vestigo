package org.nightlabs.jjqb.core.connectionpropertiesfilter;

import org.nightlabs.jjqb.core.oda.ConnectionProfile;

public abstract class AbstractConnectionPropertiesFilter implements ConnectionPropertiesFilter
{
	private ConnectionProfile connectionProfile;

	@Override
	public ConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}
	@Override
	public void setConnectionProfile(ConnectionProfile connectionProfile) {
		this.connectionProfile = connectionProfile;
	}

}
