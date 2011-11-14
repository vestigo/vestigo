package org.nightlabs.jjqb.childvm.webapp.model;

import java.io.IOException;
import java.net.URLClassLoader;
import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;

import javax.jdo.FetchPlan;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import org.nightlabs.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.jjqb.childvm.shared.JDOConnectionDTO;
import org.nightlabs.jjqb.childvm.shared.QueryParameterDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDOConnection
extends Connection
{
	private static final Logger logger = LoggerFactory.getLogger(JDOConnection.class);
	private PersistenceManager persistenceManager;

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

			URLClassLoader persistenceEngineClassLoader;
			try {
				persistenceEngineClassLoader = connectionProfile.getClassLoaderManager().getPersistenceEngineClassLoader();
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
		PersistenceManager pm = getPersistenceManager();
		if (pm == null)
			throw new IllegalStateException("getPersistenceManager() returned null!");

		configureFetchPlanForOneLevelAndAllFields(pm.getFetchPlan());

		Query query = pm.newQuery(queryText);
		Object queryResult = query.executeWithArray(parameters.toArray());

		ResultSet resultSet;
		if (queryResult instanceof Collection<?>)
			resultSet = new JDOResultSet(this, (Collection<?>)queryResult);
		else
			resultSet = new JDOResultSet(this, Collections.singletonList(queryResult));

		return resultSet;
	}

	public void configureFetchPlanForOneLevelAndAllFields(FetchPlan fetchPlan)
	{
		fetchPlan.setMaxFetchDepth(1);
		fetchPlan.setGroup(FetchPlan.ALL);
	}
}
