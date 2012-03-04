package org.nightlabs.jjqb.ui.editor;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.oda.IDriver;
import org.nightlabs.jjqb.core.oda.DataSourceDriverRegistry;
import org.nightlabs.jjqb.core.oda.JDODriver;

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
}
