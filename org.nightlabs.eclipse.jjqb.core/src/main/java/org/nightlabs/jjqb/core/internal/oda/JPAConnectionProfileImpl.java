package org.nightlabs.jjqb.core.internal.oda;

import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.JPAConnectionProfileDTO;

public class JPAConnectionProfileImpl
extends AbstractConnectionProfile
{
	@Override
	protected ConnectionProfileDTO newConnectionProfileDTO() {
		return new JPAConnectionProfileDTO();
	}
}
