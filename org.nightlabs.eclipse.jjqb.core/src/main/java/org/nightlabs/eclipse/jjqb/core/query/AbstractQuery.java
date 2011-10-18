package org.nightlabs.eclipse.jjqb.core.query;

import java.util.Map;

import org.nightlabs.eclipse.jjqb.core.connection.Connection;

public abstract class AbstractQuery implements Query
{
	private Connection connection;
	private Map<String, Object> parameterMap;
	private String queryText;

	public AbstractQuery(Connection connection)
	{
		if (connection == null)
			throw new IllegalArgumentException("connection == null");

		this.connection = connection;
	}

	@Override
	public Connection getConnection() {
		return connection;
	}

	@Override
	public Map<String, Object> getParameterMap() {
		return parameterMap;
	}
	@Override
	public void setParameterMap(Map<String, Object> parameterMap) {
		this.parameterMap = parameterMap;
	}

	@Override
	public String getQueryText() {
		return queryText;
	}
	@Override
	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}
}
