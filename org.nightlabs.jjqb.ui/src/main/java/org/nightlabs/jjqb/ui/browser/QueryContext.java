package org.nightlabs.jjqb.ui.browser;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.nightlabs.jjqb.ui.queryparam.QueryParameter;
import org.nightlabs.jjqb.ui.queryparam.QueryParameterManager;
import org.nightlabs.util.Util;

public class QueryContext
{
	private IConnectionProfile connectionProfile;
	private String queryText;
	private List<QueryParameter> queryParameters = new ArrayList<QueryParameter>();

	public IConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}
	public void setConnectionProfile(IConnectionProfile connectionProfile) {
		this.connectionProfile = connectionProfile;
	}

	public String getQueryText() {
		return queryText;
	}
	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	public List<QueryParameter> getQueryParameters() {
		return queryParameters;
	}

	/**
	 * Sets the query parameters by cloning the parameters from the given {@link QueryParameterManager}.
	 * Since the parameters are cloned, modifications in the {@link QueryParameterManager} do not affect
	 * this <code>QueryContext</code>.
	 * @param queryParameterManager the manager from which to copy the parameters. Must not be <code>null</code>.
	 */
	public void setQueryParameters(QueryParameterManager queryParameterManager) {
		this.queryParameters.clear();
		for (QueryParameter queryParameter : queryParameterManager.getQueryParameters())
			this.queryParameters.add(Util.cloneSerializable(queryParameter));
	}
}