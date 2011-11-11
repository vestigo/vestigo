package org.nightlabs.eclipse.jjqb.core.oda;

import java.util.HashMap;
import java.util.Map;

import org.nightlabs.eclipse.jjqb.core.internal.oda.JDOConnectionProfileImpl;
import org.nightlabs.eclipse.jjqb.core.internal.oda.JPAConnectionProfileImpl;

public class ConnectionProfileRegistry
{
	private static ConnectionProfileRegistry sharedInstance = new ConnectionProfileRegistry();

	public static ConnectionProfileRegistry sharedInstance() {
		return sharedInstance;
	}

	private Map<String, ConnectionProfile> profileID2connectionProfile = new HashMap<String, ConnectionProfile>();

	public synchronized ConnectionProfile getConnectionProfile(Class<? extends Connection> connectionClass, String profileID)
	{
		if (profileID == null)
			throw new IllegalArgumentException("profileID == null");

		ConnectionProfile result = profileID2connectionProfile.get(profileID);
		if (result == null) {
			// TODO need extension point for implementations of ConnectionProfile
			if (JDOConnection.class.isAssignableFrom(connectionClass))
				result = new JDOConnectionProfileImpl();
			else if (JPAConnection.class.isAssignableFrom(connectionClass))
				result = new JPAConnectionProfileImpl();
			else
				throw new IllegalArgumentException("Unsupported connectionClass: " + connectionClass);

			result.setProfileID(profileID);
			profileID2connectionProfile.put(profileID, result);
		}

		return result;
	}
}