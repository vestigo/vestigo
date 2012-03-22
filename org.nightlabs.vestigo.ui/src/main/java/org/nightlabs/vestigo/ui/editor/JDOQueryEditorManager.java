package org.nightlabs.vestigo.ui.editor;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.oda.IDriver;
import org.nightlabs.vestigo.core.oda.DataSourceDriverRegistry;
import org.nightlabs.vestigo.core.oda.JDODriver;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOQueryEditorManager extends QueryEditorManager
{
	public JDOQueryEditorManager(QueryEditor queryEditor) {
		super(queryEditor);
	}

	@Override
	protected boolean isConnectionProfileCompatible(IConnectionProfile connectionProfile)
	{
		String providerId = connectionProfile.getProviderId();
//		return JDODriver.PROVIDER_ID.equals(providerId);
		Class<? extends IDriver> driverClass = DataSourceDriverRegistry.sharedInstance().getDriverClassForProviderID(providerId);
		return driverClass != null && JDODriver.class.isAssignableFrom(driverClass);
	}

	@Override
	protected String getDefaultQueryTextForCandidateClass(String className) {
		return String.format("SELECT FROM %s", className);
	}
}
