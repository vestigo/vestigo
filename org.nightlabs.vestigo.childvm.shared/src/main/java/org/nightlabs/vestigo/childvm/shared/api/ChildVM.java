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
package org.nightlabs.vestigo.childvm.shared.api;

import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.UUID;

import org.nightlabs.vestigo.childvm.shared.ResultSetID;
import org.nightlabs.vestigo.childvm.shared.dto.AddChildrenCommandDTO;
import org.nightlabs.vestigo.childvm.shared.dto.AddChildrenResultDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.PersistablePropertyDTO;
import org.nightlabs.vestigo.childvm.shared.dto.QueryExecutionStatisticSetDTO;
import org.nightlabs.vestigo.childvm.shared.dto.QueryParameterDTO;
import org.nightlabs.vestigo.childvm.shared.dto.RemoveChildFromOwnerCommandDTO;
import org.nightlabs.vestigo.childvm.shared.dto.RemoveChildFromOwnerResultDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ReplaceChildValueCommandDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellObjectRefDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultRowDTO;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public interface ChildVM
{
	boolean isOnline();

	void putConnectionProfileDTO(ConnectionProfileDTO connectionProfileDTO) throws ChildVMException;

	Collection<ConnectionProfileDTO> getConnectionProfileDTOs() throws ChildVMException;

	ConnectionProfileDTO getConnectionProfileDTO(String profileID) throws ChildVMException;

	void putConnectionDTO(ConnectionDTO connectionDTO) throws ChildVMException;

	void deleteConnectionDTO(UUID connectionID) throws ChildVMException;

	Collection<ConnectionDTO> getConnectionDTOs(String profileID) throws ChildVMException;

	/**
	 * Execute a query and return the reference to its result-set.
	 * @param connectionID the identifier of the connection to be used. Must not be <code>null</code>.
	 * @param queryText the actual query text. Must not be <code>null</code>.
	 * @param parameters the parameters to be used in the query. Must not be <code>null</code> (but may be empty).
	 * @return the identifier of the result-set; never <code>null</code>.
	 */
	ResultSetID executeQuery(UUID connectionID, String queryText, SortedSet<QueryParameterDTO> parameters) throws ChildVMException;

	ResultRowDTO nextResultRowDTO(ResultSetID resultSetID) throws ChildVMException;

	List<ResultRowDTO> nextResultRowDTOList(ResultSetID resultSetID, int count) throws ChildVMException;

	void deleteResultSetDTO(ResultSetID resultSetID) throws ChildVMException;

	List<ResultCellDTO> getChildren(ResultSetID resultSetID, ResultCellObjectRefDTO resultCellObjectRefDTO) throws ChildVMException;

	boolean isClassAssignableFrom(String profileID, String targetClass, String candidateClass) throws ChildVMException;

	SortedSet<String> getQueryableCandidateClasses(String profileID) throws ChildVMException;

	QueryExecutionStatisticSetDTO getQueryExecutionStatisticSetDTO(ResultSetID resultSetID) throws ChildVMException;

	Collection<PersistablePropertyDTO> getPersistablePropertyDTOs(String profileID, String persistableClass) throws ChildVMException;

	ResultCellDTO replaceChildValue(ResultSetID resultSetID, ReplaceChildValueCommandDTO replaceChildValueCommandDTO) throws ChildVMException;

	void commitConnection(UUID connectionID) throws ChildVMException;

	void rollbackConnection(UUID connectionID) throws ChildVMException;

	RemoveChildFromOwnerResultDTO removeChildFromOwner(ResultSetID resultSetID, RemoveChildFromOwnerCommandDTO removeChildFromOwnerCommandDTO) throws ChildVMException;

	AddChildrenResultDTO addChildren(ResultSetID resultSetID, AddChildrenCommandDTO addChildrenCommandDTO);
}
