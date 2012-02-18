package org.nightlabs.jjqb.core.transientconnectionproperties;

import java.util.Collection;

import org.nightlabs.jjqb.core.oda.ConnectionProfile;

public abstract class AbstractTransientConnectionPropertiesProvider
implements TransientConnectionPropertiesProvider
{

	private ConnectionProfile connectionProfile;
	Collection<String> connectionPropertyKeys;

	@Override
	public void setConnectionProfile(ConnectionProfile connectionProfile) {
		this.connectionProfile = connectionProfile;
	}

	@Override
	public ConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}

	@Override
	public void setConnectionPropertyKeys(Collection<String> keys) {
		this.connectionPropertyKeys = keys;
	}

	@Override
	public Collection<String> getConnectionPropertyKeys() {
		return connectionPropertyKeys;
	}

}
