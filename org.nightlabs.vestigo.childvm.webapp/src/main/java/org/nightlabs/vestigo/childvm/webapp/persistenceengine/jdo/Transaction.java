package org.nightlabs.vestigo.childvm.webapp.persistenceengine.jdo;

import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapper;

public class Transaction extends PersistenceEngineWrapper
{
//	private PersistenceManager persistenceManager;

	public Transaction(PersistenceManager persistenceManager, Object wrappedObject) {
		super(persistenceManager, wrappedObject);
//		this.persistenceManager = persistenceManager;
	}

//	public PersistenceManager getPersistenceManager() {
//		return persistenceManager;
//	}

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
