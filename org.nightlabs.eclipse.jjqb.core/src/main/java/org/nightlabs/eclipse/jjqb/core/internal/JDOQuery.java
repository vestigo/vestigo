package org.nightlabs.eclipse.jjqb.core.internal;

import java.util.Collection;
import java.util.Collections;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.core.IConnection;

public class JDOQuery extends AbstractQuery {

	public JDOQuery(AbstractConnection connection) {
		super(connection);
	}

	@Override
	public IResultSet executeQuery() throws OdaException {
		String queryText = getEffectiveQueryText();
		if (queryText == null)
			throw new IllegalStateException("prepare(...) was not yet called!");

		IConnection connection = getConnection();
		JDOConnection jdoConnection = (JDOConnection) connection;
		jdoConnection.rollback(); // clean start => new tx
		PersistenceManager persistenceManager = jdoConnection.getPersistenceManager();

		Object jdoQueryResult;
		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(jdoConnection.getPersistenceEngineClassLoader());
			Query jdoQuery = persistenceManager.newQuery(queryText);

			Object[] jdoQueryParameters = getParameterID2parameterValue().values().toArray();

			jdoQueryResult = jdoQuery.executeWithArray(jdoQueryParameters);
		} finally {
			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
		}

		Collection<?> resultElements;
		if (jdoQueryResult instanceof Collection<?>)
			resultElements = (Collection<?>) jdoQueryResult;
		else
			resultElements = Collections.singleton(jdoQueryResult);

		ResultSetMetaData resultSetMetaData = new ResultSetMetaData(new ResultSetMetaData.Column("default")); // TODO correct meta data!
		ResultSet resultSet = new ResultSet(resultSetMetaData, resultElements);
		return resultSet;
	}
}
