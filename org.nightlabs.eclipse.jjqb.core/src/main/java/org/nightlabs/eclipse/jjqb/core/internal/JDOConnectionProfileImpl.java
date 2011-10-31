package org.nightlabs.eclipse.jjqb.core.internal;

import javax.jdo.PersistenceManagerFactory;

import org.nightlabs.eclipse.jjqb.core.JDOConnectionProfile;

public class JDOConnectionProfileImpl
extends AbstractConnectionProfile
implements JDOConnectionProfile
{
	private PersistenceManagerFactory persistenceManagerFactory;

	@Override
	public PersistenceManagerFactory getPersistenceManagerFactory() {
		return persistenceManagerFactory;
	}
}
