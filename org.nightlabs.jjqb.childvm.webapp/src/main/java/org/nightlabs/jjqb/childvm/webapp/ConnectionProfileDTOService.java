package org.nightlabs.jjqb.childvm.webapp;

import java.net.MalformedURLException;
import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.nightlabs.jjqb.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.dto.ConnectionProfileDTOList;
import org.nightlabs.jjqb.childvm.shared.dto.ConnectionProfileDTOPutResult;
import org.nightlabs.jjqb.childvm.webapp.model.ConnectionProfile;
import org.nightlabs.jjqb.childvm.webapp.model.ConnectionProfileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
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
	public ConnectionProfileDTOPutResult putConnectionProfile(@Context UriInfo uriInfo, ConnectionProfileDTO connectionProfileDTO)
	{
		logger.debug(
				"putConnectionProfile: entered: profileID={} connectionProfileDTO={}",
				(connectionProfileDTO == null ? null : connectionProfileDTO.getProfileID()),
				connectionProfileDTO
		);

//		logger.debug(
//				"putConnectionProfile: uriInfo.absolutePath={} uriInfo.baseUri={} uriInfo.path={} uriInfo.requestUri={}",
//				new Object[] { uriInfo.getAbsolutePath(), uriInfo.getBaseUri(), uriInfo.getPath(), uriInfo.getRequestUri() }
//		);

		if (connectionProfileDTO == null)
			throw new IllegalArgumentException("connectionProfileDTO == null");

		if (connectionProfileDTO.getProfileID() == null)
			throw new IllegalArgumentException("connectionProfileDTO.profileID == null");

		ConnectionProfileManager connectionProfileManager = ConnectionProfileManager.sharedInstance();

		// uriInfo.baseUri=http://localhost:59324/org.nightlabs.jjqb.cumulus4j.childvm.webapp/ChildVMApp/
		// => cut the final "ChildVMApp/" from it.
		try {
			String baseURL = uriInfo.getBaseUri().toURL().toString();
			final String restAppPath = "ChildVMApp/";
			if (!baseURL.endsWith(restAppPath))
				throw new IllegalStateException("baseURL does not end on \"" + restAppPath + "\"!");

			baseURL = baseURL.substring(0, baseURL.length() - restAppPath.length());
			connectionProfileManager.setBaseURL(baseURL);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}

		ConnectionProfile connectionProfile = connectionProfileManager.putConnectionProfileDTO(connectionProfileDTO);
		ConnectionProfileDTOPutResult result = new ConnectionProfileDTOPutResult();
		result.setProfileID(connectionProfile.getProfileID());
		return result;
	}
}
