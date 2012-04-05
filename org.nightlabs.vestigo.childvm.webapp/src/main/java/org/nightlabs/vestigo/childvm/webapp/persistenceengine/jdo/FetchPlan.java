package org.nightlabs.vestigo.childvm.webapp.persistenceengine.jdo;

import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapper;

public class FetchPlan extends PersistenceEngineWrapper
{
	public static final String ALL = "all";
	public static final String DEFAULT = "default";

	public FetchPlan(PersistenceManager persistenceManager, Object wrappedObject) {
		super(persistenceManager, wrappedObject);
	}

	public void setMaxFetchDepth(int maxFetchDepth) {
		invoke(1, "setMaxFetchDepth", int.class, maxFetchDepth);
	}

	public void setGroup(String group) {
		invoke(2, "setGroup", String.class, group);
	}
}
