package org.nightlabs.eclipse.jjqb.core;

import javax.jdo.PersistenceManagerFactory;

public interface JDOConnectionProfile
{
	PersistenceManagerFactory getPersistenceManagerFactory();
}
