package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.JPAConnectionProfileDTO;

public class JPAConnectionProfile extends ConnectionProfile
{
	@Override
	protected ConnectionProfileDTO newConnectionProfileDTO() {
		return new JPAConnectionProfileDTO();
	}
}
