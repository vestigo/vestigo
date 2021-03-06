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

import java.lang.reflect.Array;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import org.nightlabs.vestigo.childvm.shared.ResultSetID;
import org.nightlabs.vestigo.childvm.shared.dto.ResultRowDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultRowDTOList;
import org.nightlabs.vestigo.childvm.webapp.model.Connection;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionManager;
import org.nightlabs.vestigo.childvm.webapp.model.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
@Path("ResultRowDTO")
public class ResultRowDTOService extends AbstractService
{
	private static final Logger logger = LoggerFactory.getLogger(ResultRowDTOService.class);

	{
		logger.debug("<init>: created new instance");
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

			Object owner = null; // In the initial result-set, there is no owner - everything is top-level.
			ResultRowDTO resultRowDTO = new ResultRowDTO();
			resultRowDTO.setRowIndex(resultSet.getRowIndex());
			Object row = resultSet.getRow();
			if (row == null)
				resultRowDTO.getCells().add(resultSet.newResultCellDTO(owner, null));
			else {
				if (row.getClass().isArray()) {
					int arrayLength = Array.getLength(row);
					for (int i = 0; i < arrayLength; ++i) {
						Object arrayElement = Array.get(row, i);
						resultRowDTO.getCells().add(resultSet.newResultCellDTO(owner, arrayElement));
					}
				}
				else
					resultRowDTO.getCells().add(resultSet.newResultCellDTO(owner, row));
			}
			return resultRowDTO;
		}
	}
}
