package org.nightlabs.vestigo.cumulus4j.ui.transientconnectionproperties;

import org.eclipse.jface.preference.PreferencePage;
import org.nightlabs.vestigo.ui.transientconnectionproperties.DefaultTransientConnectionPropertiesProvider;

public class Cumulus4jTransientConnectionPropertiesProvider extends DefaultTransientConnectionPropertiesProvider
{
	@Override
	protected PreferencePage createPreferencePage() {
		return new Cumulus4jPropertiesProviderPreferencePage(this);
	}
}
