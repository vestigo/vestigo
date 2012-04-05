package org.nightlabs.vestigo.childvm.webapp.persistenceengine.jpa;

import java.util.List;

import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapper;

public class Query extends PersistenceEngineWrapper
{
	private EntityManager entityManager;

	public Query(EntityManager entityManager, Object wrappedObject) {
		super(entityManager, wrappedObject);
		this.entityManager = entityManager;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public Persistence getPersistence() {
		return getEntityManager().getPersistence();
	}

	public void setParameter(String name, Object value) {
		invoke(1, "setParameter", String.class, Object.class, name, value);
	}

	public void setParameter(int position, Object value) {
		invoke(2, "setParameter", int.class, Object.class, position, value);
	}

	public List<?> getResultList() {
		return (List<?>) invoke(3, "getResultList");
	}

}
