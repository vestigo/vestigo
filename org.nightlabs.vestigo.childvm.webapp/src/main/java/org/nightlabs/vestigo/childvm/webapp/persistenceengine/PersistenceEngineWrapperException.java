package org.nightlabs.vestigo.childvm.webapp.persistenceengine;

public class PersistenceEngineWrapperException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public PersistenceEngineWrapperException() { }

	public PersistenceEngineWrapperException(String message) {
		super(message);
	}

	public PersistenceEngineWrapperException(Throwable cause) {
		super(cause);
	}

	public PersistenceEngineWrapperException(String message, Throwable cause) {
		super(message, cause);
	}
}
