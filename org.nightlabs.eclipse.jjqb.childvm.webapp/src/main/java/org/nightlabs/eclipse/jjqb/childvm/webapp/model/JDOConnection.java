package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import java.io.IOException;
import java.net.URLClassLoader;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.JDOConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellObjectRefDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellSimpleDTO;
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

	public PersistenceManager getPersistenceManager() {
		return persistenceManager;
	}

	@Override
	public ResultSet doExecuteQuery(String queryText, List<Object> parameters)
	{
		if (queryText == null)
			throw new IllegalArgumentException("queryText == null");

		if (parameters == null)
			parameters = Collections.emptyList();

		assertOpen();
		PersistenceManager pm = getPersistenceManager();
		if (pm == null)
			throw new IllegalStateException("getPersistenceManager() returned null!");

		Query query = pm.newQuery(queryText);
		Object queryResult = query.executeWithArray(parameters.toArray());

		ResultSet resultSet;
		if (queryResult instanceof Collection<?>)
			resultSet = new ResultSet(this, (Collection<?>)queryResult);
		else
			resultSet = new ResultSet(this, Collections.singletonList(queryResult));

		return resultSet;
	}

	@Override
	public ResultCellDTO newResultCellDTO(Object object)
	{
		if (object == null)
			return new ResultCellSimpleDTO();

		Object objectID = JDOHelper.getObjectId(object);
		if (objectID != null)
			return new ResultCellObjectRefDTO(object.getClass(), objectID.toString());

		// TODO DataNucleus supports custom types - we should somehow support custom types (need some extension possibility), too - later.

		return new ResultCellSimpleDTO(object);
	}
}
