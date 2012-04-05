package org.nightlabs.vestigo.childvm.webapp.persistenceengine.jpa;

import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapper;

public class EntityManagerFactory extends PersistenceEngineWrapper
{
	private Persistence persistence;

	public EntityManagerFactory(Persistence persistence, Object wrappedObject) {
		super(persistence, wrappedObject);
		this.persistence = persistence;
	}

	public Persistence getPersistence() {
		return persistence;
	}

	public void close() {
		invoke(1, "close");
	}

	public EntityManager createEntityManager() {
		Object wrappedEM = invoke(2, "createEntityManager");
		return new EntityManager(this, wrappedEM);
	}

	private volatile PersistenceUnitUtil persistenceUnitUtil;

	public PersistenceUnitUtil getPersistenceUnitUtil()
	{
		PersistenceUnitUtil puu = persistenceUnitUtil;
		if (puu == null) {
			synchronized (this) {
				puu = persistenceUnitUtil;
				if (puu == null) {
					Object wrappedPUU = invoke(3, "getPersistenceUnitUtil");
					puu = new PersistenceUnitUtil(this, wrappedPUU);
					persistenceUnitUtil = puu;
				}
			}
		}
		return puu;
	}

}
