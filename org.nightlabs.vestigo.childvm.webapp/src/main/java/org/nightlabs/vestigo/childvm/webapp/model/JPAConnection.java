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
package org.nightlabs.vestigo.childvm.webapp.model;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;

import javax.script.ScriptEngine;

import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JPAConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.QueryParameterDTO;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.jpa.EntityManager;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.jpa.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPAConnection
extends Connection
{

	public static class Factory implements ConnectionFactory {
		@Override
		public boolean canHandle(ConnectionDTO connectionDTO) {
			return connectionDTO != null && JPAConnectionDTO.class == connectionDTO.getClass();
		}

		@Override
		public Connection createConnection() {
			return new JPAConnection();
		}

	}

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

			ClassLoader persistenceEngineClassLoader;
			try {
				persistenceEngineClassLoader = connectionProfile.getClassLoaderManager().getPersistenceEngineClassLoader(null);
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
		QueryExecutionStatisticSet queryExecutionStatisticSet = new QueryExecutionStatisticSet();
		EntityManager em = getEntityManager();
		if (em == null)
			throw new IllegalStateException("getEntityManager() returned null!");

		Query query = em.createQuery(queryText);

		boolean allParamsHaveName = true;
		for (QueryParameterDTO parameter : parameters) {
			if (parameter.getName() == null || parameter.getName().trim().isEmpty()) {
				allParamsHaveName = false;
				break;
			}
		}

		for (QueryParameterDTO parameter : parameters)
		{
			long queryParamStart = System.currentTimeMillis();
			Object parameterValue = getQueryParameterValue(parameter);
			queryExecutionStatisticSet.registerQueryParameterEvaluationDuration(System.currentTimeMillis() - queryParamStart);

			if (allParamsHaveName)
				query.setParameter(parameter.getName(), parameterValue);
			else
				query.setParameter(parameter.getIndex(), parameterValue);
		}
		if (parameters.isEmpty()) {
			queryExecutionStatisticSet.setQueryParameterEvaluationDurationMax(0);
			queryExecutionStatisticSet.setQueryParameterEvaluationDurationMin(0);
		}

//		configureFetchPlanForOneLevelAndAllFields(em.getFetchPlan()); // there is no fetch-plan in JPA :-(

		long queryExecutionStart = System.currentTimeMillis();
		List<?> queryResult = query.getResultList();
		queryExecutionStatisticSet.setQueryExecutionDuration(System.currentTimeMillis() - queryExecutionStart);

		ResultSet resultSet = newResultSet(query, queryResult, queryExecutionStatisticSet);
		return resultSet;
	}

	protected ResultSet newResultSet(Query query, Collection<?> queryResult, QueryExecutionStatisticSet queryExecutionStatisticSet)
	{
		return new JPAResultSet(this, query, queryResult, queryExecutionStatisticSet);
	}

	@Override
	protected void prepareScriptEngine(ScriptEngine scriptEngine)
	{
		// We must pass the REAL javax.persistence.EntityManager - not our wrapper, because our wrapper is likely incomplete.
		Object em = getEntityManager().getWrappedObject();

		scriptEngine.put("entityManager", em);
		scriptEngine.put("em", em);
	}
}
