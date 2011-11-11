package org.nightlabs.eclipse.jjqb.ui.browser;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.eclipse.jjqb.core.oda.JDODriver;

public class JDOQueryBrowserManagementComposite
extends QueryBrowserManagementComposite
{
	public JDOQueryBrowserManagementComposite(Composite parent, int style, JDOQueryBrowser queryBrowser) {
		super(parent, style, queryBrowser);
	}

	@Override
	protected boolean isConnectionProfileCompatible(IConnectionProfile connectionProfile)
	{
		String providerId = connectionProfile.getProviderId();
		return JDODriver.PROVIDER_ID.equals(providerId);
	}
}
