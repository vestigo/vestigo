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
package org.nightlabs.vestigo.cumulus4j.childvm.webapp.model;

import java.io.IOException;
import java.util.SortedSet;

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

	private Cumulus4jConnectionProfileHelper connectionProfileHelper = new Cumulus4jConnectionProfileHelper(this);

	@Override
	public synchronized SortedSet<String> getQueryableCandidateClasses() throws IOException {
		return connectionProfileHelper.filterQueryableCandidateClasses(super.getQueryableCandidateClasses());
	}
}
