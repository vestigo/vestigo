package org.nightlabs.jjqb.childvm.webapp;

import java.util.Collection;
import java.util.UUID;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import org.nightlabs.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.jjqb.childvm.shared.ConnectionDTOList;
import org.nightlabs.jjqb.childvm.shared.ConnectionDTOPutResult;
import org.nightlabs.jjqb.childvm.webapp.model.Connection;
import org.nightlabs.jjqb.childvm.webapp.model.ConnectionManager;
import org.nightlabs.jjqb.childvm.webapp.model.ConnectionProfile;
import org.nightlabs.jjqb.childvm.webapp.model.ConnectionProfileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
