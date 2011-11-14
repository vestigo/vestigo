package org.nightlabs.jjqb.childvm.webapp;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTOList;
import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTOPutResult;
import org.nightlabs.jjqb.childvm.webapp.model.ConnectionProfile;
import org.nightlabs.jjqb.childvm.webapp.model.ConnectionProfileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("ConnectionProfileDTO")
public class ConnectionProfileDTOService
extends AbstractService
{
	private static final Logger logger = LoggerFactory.getLogger(ConnectionProfileDTOService.class);

	{
		logger.debug("<init>: created new instance");
	}

	@GET
	public ConnectionProfileDTOList getConnectionProfileDTOList()
	{
		logger.debug("getConnectionProfileDTOList: entered");

		ConnectionProfileDTOList result = new ConnectionProfileDTOList();
		Collection<ConnectionProfile> connectionProfiles = ConnectionProfileManager.sharedInstance().getConnectionProfiles();
		for (ConnectionProfile connectionProfile : connectionProfiles) {
			result.getElements().add(connectionProfile.toConnectionProfileDTO());
		}

		logger.debug("getConnectionProfileDTOList: leaving: result.elements.size={}", result.getElements().size());

		return result;
	}

	@GET
	@Path("{profileID}")
	public ConnectionProfileDTO getConnectionProfileDTO(@PathParam("profileID") String profileID)
	{
		logger.debug("getConnectionProfileDTO: entered: profileID={}", profileID);

		if (profileID == null)
			throw new IllegalArgumentException("profileID == null");

		ConnectionProfile connectionProfile = ConnectionProfileManager.sharedInstance().getConnectionProfile(profileID);
		if (connectionProfile == null)
			return null;

		return connectionProfile.toConnectionProfileDTO();
	}

	@PUT
	public ConnectionProfileDTOPutResult putConnectionProfile(ConnectionProfileDTO connectionProfileDTO)
	{
		logger.debug(
				"putConnectionProfile: entered: profileID={} connectionProfileDTO={}",
				(connectionProfileDTO == null ? null : connectionProfileDTO.getProfileID()),
				connectionProfileDTO
		);

		if (connectionProfileDTO == null)
			throw new IllegalArgumentException("connectionProfileDTO == null");

		if (connectionProfileDTO.getProfileID() == null)
			throw new IllegalArgumentException("connectionProfileDTO.profileID == null");

		ConnectionProfileManager.sharedInstance().putConnectionProfileDTO(connectionProfileDTO);
		ConnectionProfileDTOPutResult result = new ConnectionProfileDTOPutResult();
		result.setProfileID(connectionProfileDTO.getProfileID());
		return result;
	}
}
