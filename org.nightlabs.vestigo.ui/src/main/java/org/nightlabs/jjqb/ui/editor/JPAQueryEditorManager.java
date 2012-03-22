package org.nightlabs.jjqb.ui.editor;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.oda.IDriver;
import org.nightlabs.jjqb.core.oda.DataSourceDriverRegistry;
import org.nightlabs.jjqb.core.oda.JPADriver;


/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPAQueryEditorManager extends QueryEditorManager
{
	public JPAQueryEditorManager(QueryEditor queryEditor) {
		super(queryEditor);
	}

	@Override
	protected boolean isConnectionProfileCompatible(IConnectionProfile connectionProfile)
	{
		String providerId = connectionProfile.getProviderId();
//		return JPADriver.PROVIDER_ID.equals(providerId);
		Class<? extends IDriver> driverClass = DataSourceDriverRegistry.sharedInstance().getDriverClassForProviderID(providerId);
		return driverClass != null && JPADriver.class.isAssignableFrom(driverClass);
	}

	@Override
	protected String getDefaultQueryTextForCandidateClass(String className) {
		return String.format("SELECT this FROM %s this", className);
	}
}
