package org.nightlabs.eclipse.jjqb.ui.browser;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.eclipse.jjqb.core.oda.JPADriver;

public class JPAQueryBrowserManagementComposite
extends QueryBrowserManagementComposite
{
	public JPAQueryBrowserManagementComposite(Composite parent, int style, JPAQueryBrowser queryBrowser) {
		super(parent, style, queryBrowser);
	}

	@Override
	protected boolean isConnectionProfileCompatible(IConnectionProfile connectionProfile)
	{
		String providerId = connectionProfile.getProviderId();
		return JPADriver.PROVIDER_ID.equals(providerId);
	}
}
