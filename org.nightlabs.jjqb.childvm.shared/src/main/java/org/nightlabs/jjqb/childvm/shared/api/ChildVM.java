package org.nightlabs.jjqb.childvm.shared.api;

import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.UUID;

import org.nightlabs.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.QueryParameterDTO;
import org.nightlabs.jjqb.childvm.shared.ResultCellDTO;
import org.nightlabs.jjqb.childvm.shared.ResultCellObjectRefDTO;
import org.nightlabs.jjqb.childvm.shared.ResultRowDTO;
import org.nightlabs.jjqb.childvm.shared.ResultSetID;

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
}
