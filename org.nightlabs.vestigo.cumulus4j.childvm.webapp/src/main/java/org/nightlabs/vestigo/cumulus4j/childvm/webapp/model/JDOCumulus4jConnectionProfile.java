package org.nightlabs.vestigo.cumulus4j.childvm.webapp.model;

import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfile;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfileFactory;
import org.nightlabs.vestigo.childvm.webapp.model.JDOConnectionProfile;
import org.nightlabs.vestigo.cumulus4j.childvm.shared.JDOCumulus4jConnectionProfileDTO;

public class JDOCumulus4jConnectionProfile extends JDOConnectionProfile
{
	public static class Factory implements ConnectionProfileFactory {
		@Override
		public boolean canHandle(ConnectionProfileDTO connectionDTO) {
			return connectionDTO != null && JDOCumulus4jConnectionProfileDTO.class == connectionDTO.getClass();
		}
		@Override
		public ConnectionProfile createConnectionProfile() {
			return new JDOCumulus4jConnectionProfile();
		}
	}
}
