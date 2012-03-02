package org.nightlabs.jjqb.childvm.webapp.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.nightlabs.jjqb.childvm.shared.ResultSetID;
import org.nightlabs.jjqb.childvm.shared.dto.ResultCellDTO;
import org.nightlabs.jjqb.childvm.shared.dto.ResultCellDTOList;
import org.nightlabs.jjqb.childvm.webapp.model.Connection;
import org.nightlabs.jjqb.childvm.webapp.model.ConnectionManager;
import org.nightlabs.jjqb.childvm.webapp.model.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
@Path("ResultCellDTO")
public class ResultCellDTOService extends AbstractService
{
	private static final Logger logger = LoggerFactory.getLogger(ResultCellDTOService.class);

	{
		logger.debug("<init>: created new instance");
	}

	@GET
	@Path("{resultSetID}/{parentObjectClassName}/{parentObjectID}/children")
	public ResultCellDTOList getChildren(
			@PathParam("resultSetID") ResultSetID resultSetID,
			@PathParam("parentObjectClassName") String parentObjectClassName,
			@PathParam("parentObjectID") String parentObjectID
	)
	{
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		if (parentObjectClassName == null)
			throw new IllegalArgumentException("parentObjectClassName == null");

		if (parentObjectID == null)
			throw new IllegalArgumentException("parentObjectID == null");

		ResultCellDTOList resultCellDTOList = new ResultCellDTOList();

		Connection connection = ConnectionManager.sharedInstance().getConnection(resultSetID.getConnectionID(), true);
		ResultSet resultSet = connection.getResultSet(resultSetID.getResultSetID(), true);
		if (resultSet != null) {
			Object parent = resultSet.getObjectForObjectID(parentObjectClassName, parentObjectID, true);
			List<?> children = resultSet.getChildren(parent);
			for (Object child : children) {
				ResultCellDTO resultCellDTO = resultSet.newResultCellDTO(parent, child);
				resultCellDTOList.getElements().add(resultCellDTO);
			}
		}
		return resultCellDTOList;
	}
}