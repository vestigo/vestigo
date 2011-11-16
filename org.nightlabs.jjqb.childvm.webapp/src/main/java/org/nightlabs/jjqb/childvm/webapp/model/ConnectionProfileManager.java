package org.nightlabs.jjqb.childvm.webapp.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.JDOConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.JPAConnectionProfileDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ConnectionProfileManager
{
	private static final Logger logger = LoggerFactory.getLogger(ConnectionProfileManager.class);

	private static final ConnectionProfileManager sharedInstance = new ConnectionProfileManager();

	public static ConnectionProfileManager sharedInstance() { return sharedInstance; }

	private Map<String, ConnectionProfile> profileID2connectionProfile = new HashMap<String, ConnectionProfile>();
	private Collection<ConnectionProfile> connectionProfilesReadOnly = null;

	private ConnectionProfileManager() { }

	public synchronized ConnectionProfile putConnectionProfileDTO(ConnectionProfileDTO connectionProfileDTO)
	{
		logger.debug(
				"putConnectionProfileDTO: entered: this.profileID2connectionProfile.size={} profileID={}",
				this.profileID2connectionProfile.size(),
				(connectionProfileDTO == null ? null : connectionProfileDTO.getProfileID())

		);

		if (connectionProfileDTO == null)
			throw new IllegalArgumentException("connectionProfileDTO == null");

		ConnectionProfile connectionProfile = profileID2connectionProfile.get(connectionProfileDTO.getProfileID());
		if (connectionProfile == null) {
			connectionProfile = newConnectionProfile(connectionProfileDTO.getClass());
			profileID2connectionProfile.put(connectionProfileDTO.getProfileID(), connectionProfile);
		}

		connectionProfile.fromConnectionProfileDTO(connectionProfileDTO);

		connectionProfilesReadOnly = null;

		logger.debug(
				"putConnectionProfileDTO: leaving: this.profileID2connectionProfile.size={}",
				profileID2connectionProfile.size()
		);

		return connectionProfile;
	}

	private ConnectionProfile newConnectionProfile(Class<? extends ConnectionProfileDTO> dtoClass)
	{
		logger.debug(
				"newConnectionProfile: entered: dtoClass={}",
				(dtoClass == null ? null : dtoClass.getName())
		);

		if (dtoClass == null)
			throw new IllegalArgumentException("dtoClass == null");

		if (JDOConnectionProfileDTO.class.isAssignableFrom(dtoClass))
			return new JDOConnectionProfile();

		if (JPAConnectionProfileDTO.class.isAssignableFrom(dtoClass))
			return new JPAConnectionProfile();

		throw new IllegalArgumentException("Unsupported dtoClass: " + dtoClass.getName());
	}

	public ConnectionProfile getConnectionProfile(String profileID, boolean throwExceptionIfNotFound)
	{
		ConnectionProfile result = getConnectionProfile(profileID);
		if (result == null && throwExceptionIfNotFound)
			throw new IllegalArgumentException("There is no ConnectionProfile with profileID=\"" + profileID + "\"!");

		return result;
	}

	public synchronized ConnectionProfile getConnectionProfile(String profileID)
	{
		return profileID2connectionProfile.get(profileID);
	}

	public Collection<ConnectionProfile> getConnectionProfiles()
	{
		Collection<ConnectionProfile> result = connectionProfilesReadOnly;
		if (logger.isDebugEnabled()) {
			synchronized (this) {
				logger.debug(
						"getConnectionProfiles: entered: result.size={} this.connectionProfilesReadOnly.size={} this.profileID2connectionProfile.size={}",
						new Object[] {
								(result == null ? null : result.size()),
								(connectionProfilesReadOnly == null ? null : connectionProfilesReadOnly.size()),
								profileID2connectionProfile.size()
						}
				);
			}
		}
		if (result == null) {
			synchronized (this) {
				result = new ArrayList<ConnectionProfile>(profileID2connectionProfile.values());
			}
			result = Collections.unmodifiableCollection(result);
			connectionProfilesReadOnly = result;
		}
		return result;
	}
}
