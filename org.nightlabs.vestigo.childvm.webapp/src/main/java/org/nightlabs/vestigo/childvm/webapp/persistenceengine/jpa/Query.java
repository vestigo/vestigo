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

import java.util.List;

import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapper;

public class Query extends PersistenceEngineWrapper
{
	private EntityManager entityManager;

	public Query(EntityManager entityManager, Object wrappedObject) {
		super(entityManager, wrappedObject);
		this.entityManager = entityManager;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public Persistence getPersistence() {
		return getEntityManager().getPersistence();
	}

	public void setParameter(String name, Object value) {
		invoke(1, "setParameter", String.class, Object.class, name, value);
	}

	public void setParameter(int position, Object value) {
		invoke(2, "setParameter", int.class, Object.class, position, value);
	}

	public List<?> getResultList() {
		return (List<?>) invoke(3, "getResultList");
	}

}
