package org.nightlabs.eclipse.jjqb.childvm.webapp;

import java.lang.reflect.Array;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import org.nightlabs.eclipse.jjqb.childvm.shared.QueryDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultRowDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultRowDTOList;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultSetID;
import org.nightlabs.eclipse.jjqb.childvm.webapp.model.Connection;
import org.nightlabs.eclipse.jjqb.childvm.webapp.model.ConnectionManager;
import org.nightlabs.eclipse.jjqb.childvm.webapp.model.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("ResultRowDTO")
public class ResultRowDTOService extends AbstractService
{
	private static final Logger logger = LoggerFactory.getLogger(ResultRowDTOService.class);

	{
		logger.debug("<init>: created new instance");
	}

	@POST
	@Path("executeQuery")
	public ResultSetID executeQuery(QueryDTO queryDTO)
	{
		logger.debug("executeQuery: entered");

		if (queryDTO == null)
			throw new IllegalArgumentException("queryDTO == null");

		if (queryDTO.getConnectionID() == null)
			throw new IllegalArgumentException("queryDTO.connectionID == null");

		Connection connection = ConnectionManager.sharedInstance().getConnection(queryDTO.getConnectionID(), true);
		ResultSet resultSet = connection.executeQuery(queryDTO.getQueryText(), queryDTO.getParameters());

		logger.debug("executeQuery: leaving");

		return resultSet.getResultSetID();
	}

	@POST
	@Path("{resultSetID}/nextList")
	public ResultRowDTOList nextList(
			@PathParam("resultSetID") ResultSetID resultSetID,
			@QueryParam("count") @DefaultValue("100") int count
	)
	{
		ResultRowDTOList resultList = new ResultRowDTOList();

		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		Connection connection = ConnectionManager.sharedInstance().getConnection(resultSetID.getConnectionID(), true);
		ResultSet resultSet = connection.getResultSet(resultSetID.getResultSetID(), true);
		if (resultSet == null)
			return resultList;

		synchronized (resultSet) {
			ResultRowDTO resultRowDTO;
			while (null != (resultRowDTO = nextResultRowDTO(connection, resultSet))) {
				resultList.getElements().add(resultRowDTO);

				if (count > 0 && resultList.getElements().size() >= count)
					break;
			}
		}

		return resultList;
	}

	@POST
	@Path("{resultSetID}/next")
	public ResultRowDTO next(@PathParam("resultSetID") ResultSetID resultSetID)
	{
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		Connection connection = ConnectionManager.sharedInstance().getConnection(resultSetID.getConnectionID(), true);
		ResultSet resultSet = connection.getResultSet(resultSetID.getResultSetID(), true);
		if (resultSet == null)
			return null;

		return nextResultRowDTO(connection, resultSet);
	}

	private ResultRowDTO nextResultRowDTO(Connection connection, ResultSet resultSet)
	{
		synchronized (resultSet) {
			if (!resultSet.next())
				return null;

			ResultRowDTO resultRowDTO = new ResultRowDTO();
			resultRowDTO.setRowIndex(resultSet.getRowIndex());
			Object row = resultSet.getRow();
			if (row == null)
				resultRowDTO.getCells().add(connection.newResultCellDTO(null));
			else {
				if (row.getClass().isArray()) {
					int arrayLength = Array.getLength(row);
					for (int i = 0; i < arrayLength; ++i) {
						Object arrayElement = Array.get(row, i);
						resultRowDTO.getCells().add(connection.newResultCellDTO(arrayElement));
					}
				}
				else
					resultRowDTO.getCells().add(connection.newResultCellDTO(row));
			}
			return resultRowDTO;
		}
	}

//	@GET
//	@Path("{connectionID}")
//	public ConnectionDTO getConnectionDTO(@PathParam("connectionID") UUID connectionID)
//	{
//		logger.debug("getConnectionDTO: entered: connectionID={}", connectionID);
//
//		if (connectionID == null)
//			throw new IllegalArgumentException("connectionID == null");
//
//		Connection connection = ConnectionManager.sharedInstance().getConnection(connectionID);
//		if (connection == null)
//			return null;
//
//		return connection.toConnectionDTO();
//	}
//
//	@PUT
//	public ConnectionDTOPutResult putConnectionDTO(ConnectionDTO connectionDTO)
//	{
//		logger.debug(
//				"putConnectionDTO: entered: connectionID={} profileID={}",
//				(connectionDTO == null ? null : connectionDTO.getConnectionID()),
//				(connectionDTO == null ? null : connectionDTO.getProfileID())
//		);
//
//		if (connectionDTO == null)
//			throw new IllegalArgumentException("connectionDTO == null");
//
//		if (connectionDTO.getConnectionID() == null)
//			throw new IllegalArgumentException("connectionDTO.connectionID == null");
//
//		if (connectionDTO.getProfileID() == null)
//			throw new IllegalArgumentException("connectionDTO.profileID == null");
//
//		ConnectionProfile connectionProfile = ConnectionProfileManager.sharedInstance().getConnectionProfile(connectionDTO.getProfileID());
//		if (connectionProfile == null)
//			throw new IllegalArgumentException("No connectionProfile existing with profileID=\"" + connectionDTO.getProfileID() + "\"!");
//
//		boolean error = true;
//		Connection connection = null;
//		try {
//			connection = ConnectionManager.sharedInstance().putConnectionDTO(connectionDTO);
//			connection.open();
//			error = false;
//		} finally {
//			if (error) {
//				if (connection != null) {
//					try {
//						connection.close();
//					} catch (Exception x) {
//						logger.warn("putConnectionDTO: connection.close() failed: " + x, x);
//					}
//				}
//				ConnectionManager.sharedInstance().deleteConnection(connectionDTO.getConnectionID());
//			}
//		}
//
//		ConnectionDTOPutResult result = new ConnectionDTOPutResult();
//		result.setConnectionID(connectionDTO.getConnectionID());
//		return result;
//	}
//
//	@DELETE
//	@Path("{connectionID}")
//	public void deleteConnectionDTO(@PathParam("connectionID") UUID connectionID)
//	{
//		logger.debug("deleteConnectionDTO: entered: connectionID={}", connectionID);
//		Connection connection = ConnectionManager.sharedInstance().getConnection(connectionID);
//		if (connection != null)
//			connection.close();
//
//		ConnectionManager.sharedInstance().deleteConnection(connectionID);
//	}
}
