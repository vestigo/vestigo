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

public class EntityManager extends PersistenceEngineWrapper
{
	private EntityManagerFactory entityManagerFactory;

	public EntityManager(EntityManagerFactory entityManagerFactory, Object wrappedEntityManager) {
		super(entityManagerFactory, wrappedEntityManager);
		this.entityManagerFactory = entityManagerFactory;

		if (wrappedEntityManager == null)
			throw new IllegalArgumentException("wrappedEntityManager == null");
	}

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public Persistence getPersistence() {
		return getEntityManagerFactory().getPersistence();
	}

	public EntityTransaction getTransaction() {
		Object wrappedTransaction = invoke(1, "getTransaction");
		return new EntityTransaction(this, wrappedTransaction);
	}

	public void close() {
		invoke(2, "close");
	}

	public Query createQuery(String qlString) {
		Object wrappedQuery = invoke(3, "createQuery", String.class, qlString);
		return new Query(this, wrappedQuery);
	}

	public Object find(Class<?> entityClass, Object primaryKey) {
		return invoke(4, "find", Class.class, Object.class, (Object)entityClass, primaryKey);
	}

	public void setProperty(String propertyName, Object value) {
		invoke(5, "setProperty", String.class, Object.class, propertyName, value);
	}

	public void flush() {
		invoke(6, "flush");
	}
}
