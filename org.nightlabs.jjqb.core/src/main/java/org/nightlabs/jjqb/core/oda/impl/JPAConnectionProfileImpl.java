package org.nightlabs.jjqb.core.oda.impl;

import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.JPAConnectionProfileDTO;
import org.nightlabs.jjqb.core.oda.JPAConnectionProfile;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPAConnectionProfileImpl
extends AbstractConnectionProfile
implements JPAConnectionProfile
{
	@Override
	protected String getWebAppName() {
		return "org.nightlabs.jjqb.childvm.webapp";
	}

	@Override
	protected ConnectionProfileDTO newConnectionProfileDTO() {
		return new JPAConnectionProfileDTO();
	}
}
