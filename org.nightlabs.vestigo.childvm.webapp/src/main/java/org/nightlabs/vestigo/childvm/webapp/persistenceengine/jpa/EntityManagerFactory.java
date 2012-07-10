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

import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapper;

public class EntityManagerFactory extends PersistenceEngineWrapper
{
	private Persistence persistence;

	public EntityManagerFactory(Persistence persistence, Object wrappedEntityManagerFactory) {
		super(persistence, wrappedEntityManagerFactory);
		this.persistence = persistence;

		if (wrappedEntityManagerFactory == null)
			throw new IllegalArgumentException("wrappedEntityManagerFactory == null");
	}

	public Persistence getPersistence() {
		return persistence;
	}

	public void close() {
		invoke(1, "close");
	}

	public EntityManager createEntityManager() {
		Object wrappedEM = invoke(2, "createEntityManager");
		if (wrappedEM == null)
			throw new IllegalStateException("createEntityManager() returned null! invocationTargetClass=" + getWrappedClassName() + " invocationTargetObject=" + getWrappedObject());

		return new EntityManager(this, wrappedEM);
	}

	private volatile PersistenceUnitUtil persistenceUnitUtil;

	public PersistenceUnitUtil getPersistenceUnitUtil()
	{
		PersistenceUnitUtil puu = persistenceUnitUtil;
		if (puu == null) {
			synchronized (this) {
				puu = persistenceUnitUtil;
				if (puu == null) {
					Object wrappedPUU = invoke(3, "getPersistenceUnitUtil");
					puu = new PersistenceUnitUtil(this, wrappedPUU);
					persistenceUnitUtil = puu;
				}
			}
		}
		return puu;
	}

}
