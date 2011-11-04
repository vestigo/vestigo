package org.nightlabs.eclipse.jjqb.core.childvm;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultRowDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultSetID;

public interface ChildVM
{
	void putConnectionProfileDTO(ConnectionProfileDTO connectionProfileDTO) throws ChildVMException;

	Collection<ConnectionProfileDTO> getConnectionProfileDTOs() throws ChildVMException;

	ConnectionProfileDTO getConnectionProfileDTO(String profileID) throws ChildVMException;

	void putConnectionDTO(ConnectionDTO connectionDTO) throws ChildVMException;

	void deleteConnectionDTO(UUID connectionID) throws ChildVMException;

	Collection<ConnectionDTO> getConnectionDTOs(String profileID) throws ChildVMException;

	ResultSetID executeQuery(UUID connectionID, String queryText, List<Object> parameters);

	ResultRowDTO nextResultRowDTO(ResultSetID resultSetID);

	List<ResultRowDTO> nextResultRowDTOList(ResultSetID resultSetID, int count);
}
