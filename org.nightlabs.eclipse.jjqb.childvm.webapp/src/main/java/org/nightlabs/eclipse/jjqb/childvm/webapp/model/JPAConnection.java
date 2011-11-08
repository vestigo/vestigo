package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import java.io.IOException;
import java.net.URLClassLoader;
import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.JPAConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.QueryParameterDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JPAConnection
extends Connection
{
	private static final Logger logger = LoggerFactory.getLogger(JPAConnection.class);
	private EntityManager entityManager;

	@Override
	protected ConnectionDTO newConnectionDTO() {
		return new JPAConnectionDTO();
	}

	@Override
	public synchronized void open()
	{
		super.open();

		// create PersistenceManager
		if (entityManager == null) {
			JPAConnectionProfile connectionProfile = (JPAConnectionProfile) getConnectionProfile();

			URLClassLoader persistenceEngineClassLoader;
			try {
				persistenceEngineClassLoader = connectionProfile.getClassLoaderManager().getPersistenceEngineClassLoader();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

			ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
			try {
				Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

				entityManager = connectionProfile.getEntityManagerFactory().createEntityManager();
			} finally {
				Thread.currentThread().setContextClassLoader(backupContextClassLoader);
			}

			entityManager.getTransaction().begin();
		}
	}

	@Override
	public synchronized void close() {
		// rollback and close PersistenceManager
		if (entityManager != null) {
			try {
				entityManager.getTransaction().rollback();
			} catch (Exception x) {
				logger.warn("close: persistenceManager.currentTransaction().rollback() failed: " + x, x);
			}
			try {
				entityManager.close();
			} catch (Exception x) {
				logger.warn("close: persistenceManager.close() failed: " + x, x);
			}
			entityManager = null;
		}

		super.close();
	}

	/**
	 * <p>
	 * Get the {@link EntityManager} of this connection.
	 * </p><p>
	 * <b>You must synchronize on this connection while using the <code>EntityManager</code>!</b>
	 * Otherwise its properties might be modified by multiple threads causing race conditions (Heisenbugs).
	 * </p>
	 * @return the <code>EntityManager</code>.
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public ResultSet doExecuteQuery(String queryText, SortedSet<QueryParameterDTO> parameters) {
		if (queryText == null)
			throw new IllegalArgumentException("queryText == null");

		if (parameters == null)
			parameters = EMPTY_QUERY_PARAMETER_SET;

		assertOpen();
		EntityManager em = getEntityManager();
		if (em == null)
			throw new IllegalStateException("getEntityManager() returned null!");

//		configureFetchPlanForOneLevelAndAllFields(em.getFetchPlan()); // there is no fetch-plan in JPA :-(

		Query query = em.createQuery(queryText);

		for (QueryParameterDTO parameter : parameters) {
			query.setParameter(parameter.getIndex(), parameter.getValue());
		}
		Object queryResult = query.getResultList();

		ResultSet resultSet;
		if (queryResult instanceof Collection<?>)
			resultSet = new JPAResultSet(this, (Collection<?>)queryResult);
		else
			resultSet = new JPAResultSet(this, Collections.singletonList(queryResult));

		return resultSet;
	}
}
