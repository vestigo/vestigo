package org.nightlabs.vestigo.childvm.webapp.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.nightlabs.vestigo.childvm.shared.ResultSetID;
import org.nightlabs.vestigo.childvm.shared.dto.QueryDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultSetDTO;
import org.nightlabs.vestigo.childvm.webapp.model.Connection;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionManager;
import org.nightlabs.vestigo.childvm.webapp.model.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
@Path("ResultSetDTO")
public class ResultSetDTOService extends AbstractService
{
	private static final Logger logger = LoggerFactory.getLogger(ResultSetDTOService.class);

	{
		logger.debug("<init>: created new instance");
	}

	@POST
	@Path("executeQuery")
	public ResultSetDTO executeQuery(QueryDTO queryDTO)
	{
		logger.debug("executeQuery: entered");

		if (queryDTO == null)
			throw new IllegalArgumentException("queryDTO == null");

		if (queryDTO.getConnectionID() == null)
			throw new IllegalArgumentException("queryDTO.connectionID == null");

		Connection connection = ConnectionManager.sharedInstance().getConnection(queryDTO.getConnectionID(), true);
		ResultSet resultSet = connection.executeQuery(queryDTO.getQueryText(), queryDTO.getParameters());

		logger.debug("executeQuery: leaving");

		return new ResultSetDTO(resultSet.getResultSetID());
	}

	@DELETE
	@Path("{resultSetID}")
	public void deleteResultSetDTO(@PathParam("resultSetID") ResultSetID resultSetID)
	{
		logger.debug("deleteResultSetDTO: entered: resultSetID={}", resultSetID);
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		Connection connection = ConnectionManager.sharedInstance().getConnection(resultSetID.getConnectionID());
		if (connection == null)
			return;

		ResultSet resultSet = connection.getResultSet(resultSetID.getResultSetID(), false);
		if (resultSet == null)
			return;

		resultSet.close();
	}
}
