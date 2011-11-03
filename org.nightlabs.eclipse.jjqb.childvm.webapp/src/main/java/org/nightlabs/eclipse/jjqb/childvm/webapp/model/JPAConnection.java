package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.JPAConnectionDTO;

public class JPAConnection
extends Connection
{
	@Override
	protected ConnectionDTO newConnectionDTO() {
		return new JPAConnectionDTO();
	}
}
