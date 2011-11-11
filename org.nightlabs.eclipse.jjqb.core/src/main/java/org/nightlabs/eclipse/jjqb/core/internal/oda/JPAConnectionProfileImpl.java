package org.nightlabs.eclipse.jjqb.core.internal.oda;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.JPAConnectionProfileDTO;

public class JPAConnectionProfileImpl
extends AbstractConnectionProfile
{
	@Override
	protected ConnectionProfileDTO newConnectionProfileDTO() {
		return new JPAConnectionProfileDTO();
	}
}
