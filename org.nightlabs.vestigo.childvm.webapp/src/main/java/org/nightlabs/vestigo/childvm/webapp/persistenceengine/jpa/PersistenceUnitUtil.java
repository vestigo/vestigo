package org.nightlabs.vestigo.childvm.webapp.persistenceengine.jpa;

import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapper;

public class PersistenceUnitUtil extends PersistenceEngineWrapper
{
	public PersistenceUnitUtil(EntityManagerFactory entityManagerFactory, Object wrappedObject) {
		super(entityManagerFactory, wrappedObject);
	}

	public Object getIdentifier(Object object) {
		return invoke(1, "getIdentifier", Object.class, object);
	}

}
