package org.nightlabs.eclipse.jjqb.core.childvm;

import java.util.Collection;
import java.util.UUID;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTO;

public interface ChildVM
{
	void putConnectionProfileDTO(ConnectionProfileDTO connectionProfileDTO) throws ChildVMException;

	Collection<ConnectionProfileDTO> getConnectionProfileDTOs() throws ChildVMException;

	ConnectionProfileDTO getConnectionProfileDTO(String profileID) throws ChildVMException;

	void putConnectionDTO(ConnectionDTO connectionDTO) throws ChildVMException;

	void deleteConnectionDTO(UUID connectionID) throws ChildVMException;

	Collection<ConnectionDTO> getConnectionDTOs(String profileID) throws ChildVMException;
}
