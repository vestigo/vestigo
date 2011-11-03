package org.nightlabs.eclipse.jjqb.core.childvm;

import java.util.Collection;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTO;

public interface ChildVM {

	void putConnectionProfileDTO(ConnectionProfileDTO connectionProfileDTO);

	Collection<ConnectionProfileDTO> getConnectionProfileDTOs();

	ConnectionProfileDTO getConnectionProfileDTO(String profileID);

}
