package org.nightlabs.vestigo.childvm.webapp.persistenceengine.jdo;

import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapper;

public class PersistenceManagerFactory extends PersistenceEngineWrapper
{
	private JDOHelper jdoHelper;

	public PersistenceManagerFactory(JDOHelper jdoHelper, Object wrappedPersistenceManagerFactory) {
		super(jdoHelper, wrappedPersistenceManagerFactory);
		this.jdoHelper = jdoHelper;
	}

	public JDOHelper getJDOHelper() {
		return jdoHelper;
	}

	public void close() {
		invoke(1, "close");
	}

	public PersistenceManager getPersistenceManager() {
		Object wrappedPM = invoke(2, "getPersistenceManager");
		return new PersistenceManager(this, wrappedPM);
	}
}
