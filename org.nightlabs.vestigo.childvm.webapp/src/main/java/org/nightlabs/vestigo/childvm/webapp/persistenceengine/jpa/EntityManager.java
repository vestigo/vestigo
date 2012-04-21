package org.nightlabs.vestigo.childvm.webapp.persistenceengine.jpa;

import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapper;

public class EntityManager extends PersistenceEngineWrapper
{
	private EntityManagerFactory entityManagerFactory;

	public EntityManager(EntityManagerFactory entityManagerFactory, Object wrappedObject) {
		super(entityManagerFactory, wrappedObject);
		this.entityManagerFactory = entityManagerFactory;
	}

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public Persistence getPersistence() {
		return getEntityManagerFactory().getPersistence();
	}

	public EntityTransaction getTransaction() {
		Object wrappedTransaction = invoke(1, "getTransaction");
		return new EntityTransaction(this, wrappedTransaction);
	}

	public void close() {
		invoke(2, "close");
	}

	public Query createQuery(String qlString) {
		Object wrappedQuery = invoke(3, "createQuery", String.class, qlString);
		return new Query(this, wrappedQuery);
	}

	public Object find(Class<?> entityClass, Object primaryKey) {
		return invoke(4, "find", Class.class, Object.class, (Object)entityClass, primaryKey);
	}

	public void setProperty(String propertyName, Object value) {
		invoke(5, "setProperty", String.class, Object.class, propertyName, value);
	}

}
