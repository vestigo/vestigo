package org.nightlabs.vestigo.childvm.webapp.persistenceengine.jpa;

import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapper;

public class EntityTransaction extends PersistenceEngineWrapper {

	public EntityTransaction(EntityManager entityManager, Object wrappedObject) {
		super(entityManager, wrappedObject);
	}

	public void begin() {
		invoke(1, "begin");
	}

	public void commit() {
		invoke(2, "commit");
	}

	public void rollback() {
		invoke(3, "rollback");
	}

}
