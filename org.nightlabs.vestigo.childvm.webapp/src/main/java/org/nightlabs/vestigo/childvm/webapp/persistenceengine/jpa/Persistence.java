/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
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
		if (wrappedEMF == null)
			throw new IllegalStateException("createEntityManagerFactory(String) returned null! invocationTargetClass=" + getWrappedClassName());

		return new EntityManagerFactory(this, wrappedEMF);
	}

	public EntityManagerFactory createEntityManagerFactory(String persistenceUnitName, Map<String, String> properties) {
		Object wrappedEMF = invokeStatic(2, "createEntityManagerFactory", String.class, Map.class, persistenceUnitName, properties);
		if (wrappedEMF == null)
			throw new IllegalStateException("createEntityManagerFactory(String, Map) returned null! invocationTargetClass=" + getWrappedClassName());

		return new EntityManagerFactory(this, wrappedEMF);
	}

}
