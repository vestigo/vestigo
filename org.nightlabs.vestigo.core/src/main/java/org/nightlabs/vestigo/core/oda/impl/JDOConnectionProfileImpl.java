package org.nightlabs.vestigo.core.oda.impl;

import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JDOConnectionProfileDTO;
import org.nightlabs.vestigo.core.oda.JDOConnectionProfile;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOConnectionProfileImpl
extends AbstractConnectionProfile
implements JDOConnectionProfile
{
	@Override
	protected String getWebAppName() {
		return "org.nightlabs.vestigo.childvm.webapp";
	}

	@Override
	protected ConnectionProfileDTO newConnectionProfileDTO() {
		return new JDOConnectionProfileDTO();
	}
}
