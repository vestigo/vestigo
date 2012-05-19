package org.nightlabs.vestigo.childvm.webapp.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.nightlabs.vestigo.childvm.shared.ResultSetID;
import org.nightlabs.vestigo.childvm.shared.dto.QueryExecutionStatisticSetDTO;
import org.nightlabs.vestigo.childvm.webapp.model.Connection;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionManager;
import org.nightlabs.vestigo.childvm.webapp.model.QueryExecutionStatisticSet;
import org.nightlabs.vestigo.childvm.webapp.model.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
@Path("QueryExecutionStatisticSetDTO")
public class QueryExecutionStatisticSetDTOService extends AbstractService
{
	private static final Logger logger = LoggerFactory.getLogger(QueryExecutionStatisticSetDTOService.class);

	@GET
	@Path("{resultSetID}")
	public QueryExecutionStatisticSetDTO getQueryExecutionStatisticSetDTO(@PathParam("resultSetID") ResultSetID resultSetID)
	{
		logger.debug("deleteResultSetDTO: entered: resultSetID={}", resultSetID);
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		Connection connection = ConnectionManager.sharedInstance().getConnection(resultSetID.getConnectionID());
		if (connection == null)
			return null;

		ResultSet resultSet = connection.getResultSet(resultSetID.getResultSetID(), false);
		if (resultSet == null)
			return null;

		QueryExecutionStatisticSet queryExecutionStatisticSet = resultSet.getQueryExecutionStatisticSet();
		QueryExecutionStatisticSetDTO dto = new QueryExecutionStatisticSetDTO();
		dto.setQueryExecutionDuration(queryExecutionStatisticSet.getQueryExecutionDuration());
		dto.setQueryParameterEvaluationDurationMax(queryExecutionStatisticSet.getQueryParameterEvaluationDurationMax());
		dto.setQueryParameterEvaluationDurationMin(queryExecutionStatisticSet.getQueryParameterEvaluationDurationMin());
		dto.setQueryParameterEvaluationDurationTotal(queryExecutionStatisticSet.getQueryParameterEvaluationDurationTotal());
		return dto;
	}
}
