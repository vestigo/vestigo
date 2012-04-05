package org.nightlabs.vestigo.childvm.webapp.persistenceengine.jpa;

import java.util.Map;

import org.nightlabs.vestigo.childvm.shared.classloader.ClassLoaderManager;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapper;

public class Persistence extends PersistenceEngineWrapper {

	public Persistence(ClassLoaderManager classLoaderManager) {
		super(classLoaderManager);
	}

	@Override
	protected String getWrappedClassName() {
		return "javax.persistence.Persistence";
	}

	@Override
	protected Object createWrappedObject(Class<?> wrappedClass) {
		throw new UnsupportedOperationException(String.format("The class %s cannot be instantiated! It is solely used in a static way.", getWrappedClassName()));
	}

	public EntityManagerFactory createEntityManagerFactory(String persistenceUnitName) {
		Object wrappedEMF = invokeStatic(1, "createEntityManagerFactory", String.class, persistenceUnitName);
		return new EntityManagerFactory(this, wrappedEMF);
	}

	public EntityManagerFactory createEntityManagerFactory(String persistenceUnitName, Map<String, String> properties) {
		Object wrappedEMF = invokeStatic(2, "createEntityManagerFactory", String.class, Map.class, persistenceUnitName, properties);
		return new EntityManagerFactory(this, wrappedEMF);
	}

}
