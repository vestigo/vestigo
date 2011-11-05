package org.nightlabs.eclipse.jjqb.core.internal;

import org.nightlabs.eclipse.jjqb.core.JDOQuery;
import org.nightlabs.eclipse.jjqb.core.ResultSet;


public class JDOQueryImpl extends AbstractQuery implements JDOQuery {

	public JDOQueryImpl(AbstractConnection connection) {
		super(connection);
	}

	@Override
	protected ResultSet newResultSet() {
		return new JDOResultSetImpl(this);
	}

//	@Override
//	public IResultSet executeQuery() throws OdaException {
//		Collection<?> resultElements = Collections.emptyList();
//
////		String queryText = getEffectiveQueryText();
////		if (queryText == null)
////			throw new IllegalStateException("prepare(...) was not yet called!");
////
////		Connection connection = getConnection();
////		JDOConnectionImpl jdoConnection = (JDOConnectionImpl) connection;
////		jdoConnection.rollback(); // clean start => new tx
////		PersistenceManager persistenceManager = jdoConnection.getPersistenceManager();
////
////		Object jdoQueryResult;
////		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
////		try {
////			Thread.currentThread().setContextClassLoader(jdoConnection.getConnectionProfile().getClassLoaderManager().getPersistenceEngineClassLoader());
////			Query jdoQuery = persistenceManager.newQuery(queryText);
////
////			Object[] jdoQueryParameters = getParameterID2parameterValue().values().toArray();
////
////			jdoQueryResult = jdoQuery.executeWithArray(jdoQueryParameters);
////		} finally {
////			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
////		}
////
////		Collection<?> resultElements;
////		if (jdoQueryResult instanceof Collection<?>)
////			resultElements = (Collection<?>) jdoQueryResult;
////		else
////			resultElements = Collections.singleton(jdoQueryResult);
//
//		ResultSetMetaData resultSetMetaData = new ResultSetMetaData(new ResultSetMetaData.Column("default")); // TODO correct meta data!
//		CollectionResultSet resultSet = new CollectionResultSet(resultSetMetaData, resultElements);
//		return resultSet;
//	}
}
