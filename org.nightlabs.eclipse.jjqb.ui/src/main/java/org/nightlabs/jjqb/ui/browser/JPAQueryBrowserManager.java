package org.nightlabs.eclipse.jjqb.ui.browser;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.nightlabs.eclipse.jjqb.core.oda.JPADriver;

public class JPAQueryBrowserManager extends QueryBrowserManager
{
	public JPAQueryBrowserManager(QueryBrowser queryBrowser) {
		super(queryBrowser);
	}

	@Override
	protected boolean isConnectionProfileCompatible(IConnectionProfile connectionProfile)
	{
		String providerId = connectionProfile.getProviderId();
		return JPADriver.PROVIDER_ID.equals(providerId);
	}
}
