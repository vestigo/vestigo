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
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.nightlabs.vestigo.childvm.shared.Formula;
import org.nightlabs.vestigo.childvm.shared.ResultSetID;
import org.nightlabs.vestigo.childvm.shared.dto.AddChildrenCommandDTO;
import org.nightlabs.vestigo.childvm.shared.dto.AddChildrenResultDTO;
import org.nightlabs.vestigo.childvm.shared.dto.RemoveChildFromOwnerCommandDTO;
import org.nightlabs.vestigo.childvm.shared.dto.RemoveChildFromOwnerResultDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ReplaceChildValueCommandDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellDTOList;
import org.nightlabs.vestigo.childvm.webapp.model.AddChildrenResult;
import org.nightlabs.vestigo.childvm.webapp.model.Connection;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionManager;
import org.nightlabs.vestigo.childvm.webapp.model.OwnerWithField;
import org.nightlabs.vestigo.childvm.webapp.model.RemoveChildFromOwnerResult;
import org.nightlabs.vestigo.childvm.webapp.model.ResultSet;
import org.nightlabs.vestigo.childvm.webapp.model.TransientObjectContainer;
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
	@Path("{resultSetID}/{objectClassName}/{objectID}/children")
	public ResultCellDTOList getChildren(
			@PathParam("resultSetID") ResultSetID resultSetID,
			@PathParam("objectClassName") String objectClassName,
			@PathParam("objectID") String objectID
	)
	{
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		if (objectClassName == null)
			throw new IllegalArgumentException("objectClassName == null");

		if (objectID == null)
			throw new IllegalArgumentException("objectID == null");

		ResultCellDTOList resultCellDTOList = new ResultCellDTOList();

		Connection connection = ConnectionManager.sharedInstance().getConnection(resultSetID.getConnectionID(), true);
		ResultSet resultSet = connection.getResultSet(resultSetID.getResultSetID(), true);
		Object object = resultSet.getObjectForObjectID(objectClassName, objectID, true);
		List<?> children = resultSet.getChildren(object);
		for (Object child : children) {
			ResultCellDTO resultCellDTO = resultSet.newResultCellDTO(object, child);
			resultCellDTOList.getElements().add(resultCellDTO);
		}
		return resultCellDTOList;
	}

	@POST
	@Path("{resultSetID}/replaceChildValue")
	public ResultCellDTO replaceChildValue(
			@PathParam("resultSetID") ResultSetID resultSetID,
			ReplaceChildValueCommandDTO replaceChildValueCommandDTO
	)
	{
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		if (replaceChildValueCommandDTO == null)
			throw new IllegalArgumentException("replaceChildValueCommandDTO == null");

		String fieldDeclaringClassName = replaceChildValueCommandDTO.getFieldDeclaringClassName();
		String fieldName = replaceChildValueCommandDTO.getFieldName();
		int index = replaceChildValueCommandDTO.getIndex();
		Formula formula = replaceChildValueCommandDTO.getFormula();

		Connection connection = ConnectionManager.sharedInstance().getConnection(resultSetID.getConnectionID(), true);
		ResultSet resultSet = connection.getResultSet(resultSetID.getResultSetID(), true);

		Object object = resultSet.getObjectForObjectID(
				replaceChildValueCommandDTO.getObjectClassName(),
				replaceChildValueCommandDTO.getObjectID(),
				true
		);

		Object oldValue = null;
		if (replaceChildValueCommandDTO.getOldValueObjectClassName() != null) {
			oldValue = resultSet.getObjectForObjectID(
					replaceChildValueCommandDTO.getOldValueObjectClassName(),
					replaceChildValueCommandDTO.getOldValueObjectID(),
					true
			);
		}
		else
			oldValue = replaceChildValueCommandDTO.getOldValue();

		Object newChildValue = resultSet.replaceChildValue(object, fieldDeclaringClassName, fieldName, index, oldValue, formula);
		ResultCellDTO resultCellDTO = resultSet.newResultCellDTO(object, newChildValue);
		return resultCellDTO;
	}

	@POST
	@Path("{resultSetID}/removeChildFromOwner")
	public RemoveChildFromOwnerResultDTO removeChildFromOwner(
			@PathParam("resultSetID") ResultSetID resultSetID,
			RemoveChildFromOwnerCommandDTO removeChildFromOwnerCommandDTO
	)
	{
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		if (removeChildFromOwnerCommandDTO == null)
			throw new IllegalArgumentException("removeChildFromOwnerCommandDTO == null");

		String fieldDeclaringClassName = removeChildFromOwnerCommandDTO.getFieldDeclaringClassName();
		String fieldName = removeChildFromOwnerCommandDTO.getFieldName();
		int index = removeChildFromOwnerCommandDTO.getIndex();

		Connection connection = ConnectionManager.sharedInstance().getConnection(resultSetID.getConnectionID(), true);
		ResultSet resultSet = connection.getResultSet(resultSetID.getResultSetID(), true);

		Object object = resultSet.getObjectForObjectID(
				removeChildFromOwnerCommandDTO.getObjectClassName(),
				removeChildFromOwnerCommandDTO.getObjectID(),
				true
		);

		Object oldValue = null;
		if (removeChildFromOwnerCommandDTO.getOldValueObjectClassName() != null) {
			oldValue = resultSet.getObjectForObjectID(
					removeChildFromOwnerCommandDTO.getOldValueObjectClassName(),
					removeChildFromOwnerCommandDTO.getOldValueObjectID(),
					true
			);
		}
		else
			oldValue = removeChildFromOwnerCommandDTO.getOldValue();

		RemoveChildFromOwnerResultDTO resultDTO = new RemoveChildFromOwnerResultDTO();
		RemoveChildFromOwnerResult removeChildFromOwnerResult = resultSet.removeChildFromOwner(object, fieldDeclaringClassName, fieldName, index, oldValue);
		if (removeChildFromOwnerResult.newOwner != removeChildFromOwnerResult.oldOwner)
			resultDTO.setNewOwnerResultCellDTO(createNewOwnerResultCellDTO(resultSet, removeChildFromOwnerResult.newOwner));

		return resultDTO;
	}

	protected ResultCellDTO createNewOwnerResultCellDTO(ResultSet resultSet, Object newOwner) {
		TransientObjectContainer transientObjectContainer = resultSet.getTransientObjectContainerForTransientObject(newOwner, true);
		ResultCellDTO resultCellDTO = null;
		for (OwnerWithField ownerWithField : transientObjectContainer.getOwnerWithFieldSet()) {
			Object ownerOwner = ownerWithField.getOwner();
			if (resultCellDTO != null)
				throw new IllegalStateException("More than one owner of the owner of the removed child!");

			resultCellDTO = resultSet.newResultCellDTO(ownerOwner, newOwner);
		}

		if (resultCellDTO == null)
			throw new IllegalStateException("No owner of the owner of the removed child!");

		return resultCellDTO;
	}

	@POST
	@Path("{resultSetID}/addChildren")
	public AddChildrenResultDTO addChildren(
			@PathParam("resultSetID") ResultSetID resultSetID,
			AddChildrenCommandDTO addChildrenCommandDTO
	)
	{
		if (resultSetID == null)
			throw new IllegalArgumentException("resultSetID == null");

		if (addChildrenCommandDTO == null)
			throw new IllegalArgumentException("addChildrenCommandDTO == null");

		Formula formula = addChildrenCommandDTO.getFormula();

		Connection connection = ConnectionManager.sharedInstance().getConnection(resultSetID.getConnectionID(), true);
		ResultSet resultSet = connection.getResultSet(resultSetID.getResultSetID(), true);

		Object object = resultSet.getObjectForObjectID(
				addChildrenCommandDTO.getObjectClassName(),
				addChildrenCommandDTO.getObjectID(),
				true
		);

		AddChildrenResultDTO resultDTO = new AddChildrenResultDTO();
		AddChildrenResult addChildrenResult = resultSet.addChildren(object, formula);

		if (addChildrenResult.newOwner != addChildrenResult.oldOwner)
			resultDTO.setNewOwnerResultCellDTO(createNewOwnerResultCellDTO(resultSet, addChildrenResult.newOwner));

		for (Object child : addChildrenResult.newChildren) {
			ResultCellDTO resultCellDTO = resultSet.newResultCellDTO(addChildrenResult.newOwner, child);
			resultDTO.getNewChildrenResultCellDTOs().add(resultCellDTO);
		}
		return resultDTO;
	}

}
