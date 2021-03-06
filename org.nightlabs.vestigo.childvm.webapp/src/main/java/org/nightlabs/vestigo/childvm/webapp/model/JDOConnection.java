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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

import javax.script.ScriptEngine;

import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JDOConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.QueryParameterDTO;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.jdo.FetchPlan;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.jdo.PersistenceManager;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.jdo.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOConnection
extends Connection
{
	private static final Logger logger = LoggerFactory.getLogger(JDOConnection.class);
	private PersistenceManager persistenceManager;

	public static class Factory implements ConnectionFactory {
		@Override
		public boolean canHandle(ConnectionDTO connectionDTO) {
			return connectionDTO != null && JDOConnectionDTO.class == connectionDTO.getClass();
		}
		@Override
		public Connection createConnection() {
			return new JDOConnection();
		}
	}

	@Override
	protected ConnectionDTO newConnectionDTO() {
		return new JDOConnectionDTO();
	}

	@Override
	public synchronized void open()
	{
		super.open();

		// create PersistenceManager
		if (persistenceManager == null) {
			JDOConnectionProfile connectionProfile = (JDOConnectionProfile) getConnectionProfile();

			ClassLoader persistenceEngineClassLoader;
			try {
				persistenceEngineClassLoader = connectionProfile.getClassLoaderManager().getPersistenceEngineClassLoader(null);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

			ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
			try {
				Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

				persistenceManager = connectionProfile.getPersistenceManagerFactory().getPersistenceManager();
			} finally {
				Thread.currentThread().setContextClassLoader(backupContextClassLoader);
			}

			persistenceManager.currentTransaction().begin();
		}
	}

	@Override
	public synchronized void close() {
		// rollback and close PersistenceManager
		if (persistenceManager != null) {
			try {
				persistenceManager.currentTransaction().rollback();
			} catch (Exception x) {
				logger.warn("close: persistenceManager.currentTransaction().rollback() failed: " + x, x);
			}
			try {
				persistenceManager.close();
			} catch (Exception x) {
				logger.warn("close: persistenceManager.close() failed: " + x, x);
			}
			persistenceManager = null;
		}

		super.close();
	}

	@Override
	public synchronized void commit() {
		super.commit();
		if (persistenceManager != null) {
			// TODO check, if it is active => extend wrapper!
//			if (persistenceManager.currentTransaction().)
			persistenceManager.currentTransaction().commit();
			persistenceManager.currentTransaction().begin();
		}
	}

	@Override
	public synchronized void rollback() {
		super.rollback();
		if (persistenceManager != null) {
			// TODO check, if it is active => extend wrapper!
//		if (persistenceManager.currentTransaction().)
			persistenceManager.currentTransaction().rollback();
			persistenceManager.currentTransaction().begin();
		}
	}

	/**
	 * <p>
	 * Get the {@link PersistenceManager} of this connection.
	 * </p><p>
	 * <b>You must synchronize on this connection while using the <code>PersistenceManager</code>!</b>
	 * Otherwise the fetch-plan or other properties
	 * might be modified by multiple threads causing race conditions (Heisenbugs).
	 * </p>
	 * @return the <code>PersistenceManager</code>.
	 */
	public PersistenceManager getPersistenceManager() {
		return persistenceManager;
	}

	@Override
	public synchronized ResultSet doExecuteQuery(String queryText, SortedSet<QueryParameterDTO> parameters) // We synchronize on this connection because we use the PersistenceManager.
	{
		if (queryText == null)
			throw new IllegalArgumentException("queryText == null");

		if (parameters == null)
			parameters = EMPTY_QUERY_PARAMETER_SET;

		assertOpen();
		QueryExecutionStatisticSet queryExecutionStatisticSet = new QueryExecutionStatisticSet();
		PersistenceManager pm = getPersistenceManager();
		if (pm == null)
			throw new IllegalStateException("getPersistenceManager() returned null!");

		List<Object> paramList = new ArrayList<Object>(parameters.size());
		Map<String, Object> paramMap = new HashMap<String, Object>(parameters.size());
		for (QueryParameterDTO parameter : parameters) {
			if (parameter.getName() == null || parameter.getName().trim().isEmpty())
				paramMap = null;

			long queryParamStart = System.currentTimeMillis();
			Object parameterValue = getQueryParameterValue(parameter);
			queryExecutionStatisticSet.registerQueryParameterEvaluationDuration(System.currentTimeMillis() - queryParamStart);

			if (paramMap != null)
				paramMap.put(parameter.getName(), parameterValue);

			paramList.add(parameterValue);
		}
		if (parameters.isEmpty()) {
			queryExecutionStatisticSet.setQueryParameterEvaluationDurationMax(0);
			queryExecutionStatisticSet.setQueryParameterEvaluationDurationMin(0);
		}

		// It is important to set the fetch plan *after* all calls to getQueryParameterValue(...),
		// because the formulas might modify the fetch plan.
		configureFetchPlanForOneLevelAndAllFields(pm.getFetchPlan());

		Query query = pm.newQuery(queryText);
		Object queryResult;
		long queryExecutionStart = System.currentTimeMillis();

		if (paramMap != null)
			queryResult = query.executeWithMap(paramMap);
		else
			queryResult = query.executeWithArray(paramList.toArray());

		queryExecutionStatisticSet.setQueryExecutionDuration(System.currentTimeMillis() - queryExecutionStart);

		ResultSet resultSet;
		if (queryResult instanceof Collection<?>)
			resultSet = newResultSet(query, (Collection<?>)queryResult, queryExecutionStatisticSet);
		else
			resultSet = newResultSet(query, Collections.singletonList(queryResult), queryExecutionStatisticSet);

		return resultSet;
	}

	protected ResultSet newResultSet(Query query, Collection<?> queryResult, QueryExecutionStatisticSet queryExecutionStatisticSet)
	{
		return new JDOResultSet(this, query, queryResult, queryExecutionStatisticSet);
	}

	@Override
	protected void prepareScriptEngine(ScriptEngine scriptEngine)
	{
		resetFetchPlanToDefault(getPersistenceManager().getFetchPlan());

		// We must pass the REAL javax.jdo.PersistenceManager - not our wrapper, because our wrapper is likely incomplete.
		Object pm = getPersistenceManager().getWrappedObject();

		scriptEngine.put("persistenceManager", pm);
		scriptEngine.put("pm", pm);
	}

	public void configureFetchPlanForOneLevelAndAllFields(FetchPlan fetchPlan)
	{
		fetchPlan.setMaxFetchDepth(1);
		fetchPlan.setGroup(FetchPlan.ALL);
	}

	public void resetFetchPlanToDefault(FetchPlan fetchPlan)
	{
		fetchPlan.setMaxFetchDepth(1);
		fetchPlan.setGroup(FetchPlan.DEFAULT);
	}

	@Override
	protected List<Field> getFields(Class<?> clazz)
	{
		// Filter all jdo-internal fields (which have been enhanced into the class).
		List<Field> fields = super.getFields(clazz);
		for (Iterator<Field> it = fields.iterator(); it.hasNext(); ) {
			Field field = it.next();
			if (field.getName().startsWith("jdo"))
				it.remove();
		}
		return fields;
	}
}