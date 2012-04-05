package org.nightlabs.vestigo.childvm.webapp.persistenceengine.jdo;

import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapperException;

public class JDOObjectNotFoundException extends PersistenceEngineWrapperException
{
	private static final long serialVersionUID = 1L;

	public JDOObjectNotFoundException(Throwable cause) {
		super(cause);
	}
}
