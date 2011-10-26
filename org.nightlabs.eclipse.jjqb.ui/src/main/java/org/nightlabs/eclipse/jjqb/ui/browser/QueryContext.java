package org.nightlabs.eclipse.jjqb.ui.browser;

import org.eclipse.datatools.connectivity.IConnectionProfile;

public class QueryContext
{
	private IConnectionProfile connectionProfile;
	private String queryText;

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

}
