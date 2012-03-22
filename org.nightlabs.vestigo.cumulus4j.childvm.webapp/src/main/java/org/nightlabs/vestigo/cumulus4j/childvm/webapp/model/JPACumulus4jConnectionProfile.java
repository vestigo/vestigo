package org.nightlabs.vestigo.cumulus4j.childvm.webapp.model;

import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfile;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfileFactory;
import org.nightlabs.vestigo.childvm.webapp.model.JPAConnectionProfile;
import org.nightlabs.vestigo.cumulus4j.childvm.shared.JPACumulus4jConnectionProfileDTO;

public class JPACumulus4jConnectionProfile extends JPAConnectionProfile
{
	public static class Factory implements ConnectionProfileFactory {
		@Override
		public boolean canHandle(ConnectionProfileDTO connectionDTO) {
			return connectionDTO != null && JPACumulus4jConnectionProfileDTO.class == connectionDTO.getClass();
		}
		@Override
		public ConnectionProfile createConnectionProfile() {
			return new JPACumulus4jConnectionProfile();
		}
	}
}
