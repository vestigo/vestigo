package org.nightlabs.eclipse.jjqb.core.query;

import java.util.Map;

import org.nightlabs.eclipse.jjqb.core.connection.Connection;

public interface Query
{
	Connection getConnection();

	String getQueryText();
	void setQueryText(String queryText);

	Map<String, Object> getParameterMap();
	void setParameterMap(Map<String, Object> parameterMap);

	Object execute();
}
