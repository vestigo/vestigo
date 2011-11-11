package org.nightlabs.eclipse.jjqb.ui.browser;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.nightlabs.eclipse.jjqb.core.oda.JDODriver;

public class JDOQueryBrowserManager extends QueryBrowserManager
{
	public JDOQueryBrowserManager(QueryBrowser queryBrowser) {
		super(queryBrowser);
	}

	@Override
	protected boolean isConnectionProfileCompatible(IConnectionProfile connectionProfile)
	{
		String providerId = connectionProfile.getProviderId();
		return JDODriver.PROVIDER_ID.equals(providerId);
	}
}
