package org.nightlabs.jjqb.ui.browser;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.nightlabs.jjqb.core.oda.JDODriver;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
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
