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
package org.nightlabs.vestigo.childvm.webapp.service;

import java.net.MalformedURLException;
import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTOList;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTOPutResult;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfile;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfileManager;
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

		// uriInfo.baseUri=http://localhost:59324/org.nightlabs.vestigo.cumulus4j.childvm.webapp/ChildVMApp/
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
