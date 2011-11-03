package org.nightlabs.eclipse.jjqb.core.childvm;

import java.util.Collection;
import java.util.UUID;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTO;

public interface ChildVM {

	void putConnectionProfileDTO(ConnectionProfileDTO connectionProfileDTO);

	Collection<ConnectionProfileDTO> getConnectionProfileDTOs();

	ConnectionProfileDTO getConnectionProfileDTO(String profileID);

	void putConnectionDTO(ConnectionDTO connectionDTO);

	void deleteConnectionDTO(UUID connectionID);

	Collection<ConnectionDTO> getConnectionDTOs(String profileID);
}
