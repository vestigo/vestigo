package org.nightlabs.eclipse.jjqb.core.query;

import java.util.Map;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import org.nightlabs.eclipse.jjqb.core.connection.JDOConnection;

public class JDOQuery extends AbstractQuery
{
	private PersistenceManager persistenceManager;

	public JDOQuery(JDOConnection connection) {
		super(connection);
	}

	@Override
	public JDOConnection getConnection() {
		return (JDOConnection) super.getConnection();
	}

	protected PersistenceManager getPersistenceManager()
	{
		PersistenceManager pm = this.persistenceManager;

		if (pm == null || pm.isClosed()) { // re-opening the connection is allowed => re-obtain the PM, if it's closed.
			pm = getConnection().getPersistenceManagerFactory().getPersistenceManager();
			this.persistenceManager = pm;
		}

		return pm;
	}

	@Override
	public Object execute()
	{
		String queryText = getQueryText();
		if (queryText == null)
			throw new IllegalStateException("There is no queryText! Call setQueryText(...) first!");

		Query q = getPersistenceManager().newQuery(queryText);
		Map<String, Object> parameterMap = getParameterMap();
		Object result = q.executeWithMap(parameterMap); // DN allows null as argument here (is treated like an empty map)
		return result;
	}
}
