package org.nightlabs.jjqb.core.internal.oda;

import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.JDOConnectionProfileDTO;
import org.nightlabs.jjqb.core.oda.JDOConnectionProfile;

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
