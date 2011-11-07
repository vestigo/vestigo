package org.nightlabs.eclipse.jjqb.core.childvm;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultRowDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultSetID;
import org.nightlabs.eclipse.jjqb.core.ObjectReference;

public interface ChildVM
{
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
	ResultSetID executeQuery(UUID connectionID, String queryText, List<Object> parameters) throws ChildVMException;

	ResultRowDTO nextResultRowDTO(ResultSetID resultSetID) throws ChildVMException;

	List<ResultRowDTO> nextResultRowDTOList(ResultSetID resultSetID, int count) throws ChildVMException;

	void deleteResultSetDTO(ResultSetID resultSetID) throws ChildVMException;

	List<ResultCellDTO> getChildren(ObjectReference objectReference) throws ChildVMException;
}
