package org.nightlabs.vestigo.childvm.webapp.persistenceengine.jdo;

import java.util.Map;

import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapper;

public class Query extends PersistenceEngineWrapper
{
	private PersistenceManager persistenceManager;

	public Query(PersistenceManager persistenceManager, Object wrappedObject) {
		super(persistenceManager, wrappedObject);
		this.persistenceManager = persistenceManager;
	}

	public PersistenceManager getPersistenceManager() {
		return persistenceManager;
	}

	public JDOHelper getJDOHelper() {
		return getPersistenceManager().getJDOHelper();
	}

	public Object executeWithMap(Map<String, Object> parameters) {
		return invoke(1, "executeWithMap", Map.class, parameters);
	}

	public Object executeWithArray(Object[] parameters) {
		return invoke(2, "executeWithArray", Object[].class, parameters);
	}

	public void closeAll() {
		invoke(3, "closeAll");
	}
}
