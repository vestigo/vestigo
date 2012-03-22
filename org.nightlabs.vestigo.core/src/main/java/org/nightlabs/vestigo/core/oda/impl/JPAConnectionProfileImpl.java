package org.nightlabs.vestigo.core.oda.impl;

import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JPAConnectionProfileDTO;
import org.nightlabs.vestigo.core.oda.JPAConnectionProfile;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPAConnectionProfileImpl
extends AbstractConnectionProfile
implements JPAConnectionProfile
{
	@Override
	protected String getWebAppName() {
		return "org.nightlabs.vestigo.childvm.webapp";
	}

	@Override
	protected ConnectionProfileDTO newConnectionProfileDTO() {
		return new JPAConnectionProfileDTO();
	}
}
