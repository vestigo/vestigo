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

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.nightlabs.vestigo.childvm.shared.ResultSetID;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellDTOList;
import org.nightlabs.vestigo.childvm.webapp.model.Connection;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionManager;
import org.nightlabs.vestigo.childvm.webapp.model.ResultSet;
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
