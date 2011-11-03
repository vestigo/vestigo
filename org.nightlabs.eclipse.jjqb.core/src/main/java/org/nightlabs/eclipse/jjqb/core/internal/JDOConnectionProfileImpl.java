package org.nightlabs.eclipse.jjqb.core.internal;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.JDOConnectionProfileDTO;
import org.nightlabs.eclipse.jjqb.core.JDOConnectionProfile;

public class JDOConnectionProfileImpl
extends AbstractConnectionProfile
implements JDOConnectionProfile
{
//	private PersistenceManagerFactory persistenceManagerFactory;
//
//	@Override
//	public PersistenceManagerFactory getPersistenceManagerFactory() {
//		return persistenceManagerFactory;
//	}

	@Override
	protected ConnectionProfileDTO newConnectionProfileDTO() {
		return new JDOConnectionProfileDTO();
	}
}
