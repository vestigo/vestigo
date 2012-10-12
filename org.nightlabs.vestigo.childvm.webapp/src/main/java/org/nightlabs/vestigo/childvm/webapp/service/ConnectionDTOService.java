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

import java.util.Collection;
import java.util.UUID;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTOList;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTOPutResult;
import org.nightlabs.vestigo.childvm.webapp.model.Connection;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionManager;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfile;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
@Path("ConnectionDTO")
public class ConnectionDTOService extends AbstractService
{
	private static final Logger logger = LoggerFactory.getLogger(ConnectionDTOService.class);

	{
		logger.debug("<init>: created new instance");
	}

	@GET
	public ConnectionDTOList getConnectionDTOList(@QueryParam("profileID") String profileID)
	{
		logger.debug("getConnectionDTOList: entered");

		ConnectionDTOList result = new ConnectionDTOList();
		Collection<Connection> connections = ConnectionManager.sharedInstance().getConnections(profileID);
		for (Connection connection : connections) {
			result.getElements().add(connection.toConnectionDTO());
		}

		logger.debug("getConnectionDTOList: leaving: result.elements.size={}", result.getElements().size());

		return result;
	}

	@GET
	@Path("{connectionID}")
	public ConnectionDTO getConnectionDTO(@PathParam("connectionID") UUID connectionID)
	{
		logger.debug("getConnectionDTO: entered: connectionID={}", connectionID);

		if (connectionID == null)
			throw new IllegalArgumentException("connectionID == null");

		Connection connection = ConnectionManager.sharedInstance().getConnection(connectionID);
		if (connection == null)
			return null;

		return connection.toConnectionDTO();
	}

	@POST
	@Path("{connectionID}/commit")
	public void commit(@PathParam("connectionID") UUID connectionID)
	{
		logger.debug("commit: entered: connectionID={}", connectionID);

		if (connectionID == null)
			throw new IllegalArgumentException("connectionID == null");

		Connection connection = ConnectionManager.sharedInstance().getConnection(connectionID, true);
		connection.commit();
	}

	@POST
	@Path("{connectionID}/rollback")
	public void rollback(@PathParam("connectionID") UUID connectionID)
	{
		logger.debug("rollback: entered: connectionID={}", connectionID);
		if (connectionID == null)
			throw new IllegalArgumentException("connectionID == null");

		Connection connection = ConnectionManager.sharedInstance().getConnection(connectionID, true);
		connection.rollback();
	}

	@PUT
	public ConnectionDTOPutResult putConnectionDTO(ConnectionDTO connectionDTO)
	{
		logger.debug(
				"putConnectionDTO: entered: connectionID={} profileID={}",
				(connectionDTO == null ? null : connectionDTO.getConnectionID()),
				(connectionDTO == null ? null : connectionDTO.getProfileID())
		);

		if (connectionDTO == null)
			throw new IllegalArgumentException("connectionDTO == null");

		if (connectionDTO.getConnectionID() == null)
			throw new IllegalArgumentException("connectionDTO.connectionID == null");

		if (connectionDTO.getProfileID() == null)
			throw new IllegalArgumentException("connectionDTO.profileID == null");

		ConnectionProfile connectionProfile = ConnectionProfileManager.sharedInstance().getConnectionProfile(connectionDTO.getProfileID());
		if (connectionProfile == null)
			throw new IllegalArgumentException("No connectionProfile existing with profileID=\"" + connectionDTO.getProfileID() + "\"!");

		boolean error = true;
		Connection connection = null;
		try {
			connection = ConnectionManager.sharedInstance().putConnectionDTO(connectionDTO);
			connection.open();
			error = false;
		} finally {
			if (error) {
				if (connection != null) {
					try {
						connection.close();
					} catch (Exception x) {
						logger.warn("putConnectionDTO: connection.close() failed: " + x, x);
					}
				}
				ConnectionManager.sharedInstance().deleteConnection(connectionDTO.getConnectionID());
			}
		}

		ConnectionDTOPutResult result = new ConnectionDTOPutResult();
		result.setConnectionID(connectionDTO.getConnectionID());
		return result;
	}

	@DELETE
	@Path("{connectionID}")
	public void deleteConnectionDTO(@PathParam("connectionID") UUID connectionID)
	{
		logger.debug("deleteConnectionDTO: entered: connectionID={}", connectionID);
		Connection connection = ConnectionManager.sharedInstance().getConnection(connectionID);
		if (connection != null)
			connection.close();

		ConnectionManager.sharedInstance().deleteConnection(connectionID);
	}
}
