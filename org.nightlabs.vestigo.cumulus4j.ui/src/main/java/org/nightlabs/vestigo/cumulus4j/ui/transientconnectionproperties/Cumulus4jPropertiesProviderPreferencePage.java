package org.nightlabs.vestigo.cumulus4j.ui.transientconnectionproperties;

import org.eclipse.jface.preference.FieldEditor;
import org.nightlabs.vestigo.core.oda.ConnectionPropertyMeta;
import org.nightlabs.vestigo.core.transientconnectionproperties.TransientConnectionPropertiesProvider;
import org.nightlabs.vestigo.cumulus4j.childvm.shared.Cumulus4jConnectionProperties;
import org.nightlabs.vestigo.ui.preference.PasswordFieldEditor;
import org.nightlabs.vestigo.ui.transientconnectionproperties.DefaultPropertiesProviderPreferencePage;

public class Cumulus4jPropertiesProviderPreferencePage extends DefaultPropertiesProviderPreferencePage {

	public Cumulus4jPropertiesProviderPreferencePage(TransientConnectionPropertiesProvider transientConnectionPropertiesProvider) {
		super(transientConnectionPropertiesProvider);
		setTitle("Cumulus4j key store authentication");
		setMessage("Please enter the data needed to authenticate at the Cumulus4j key store.");
	}

	@Override
	protected FieldEditor createFieldEditor(String propertyKey, ConnectionPropertyMeta propertyMeta) {
		if (Cumulus4jConnectionProperties.KEY_STORE_PASSWORD.equals(propertyKey)) {
			return new PasswordFieldEditor(
					propertyKey,
					String.format("%s:", propertyMeta == null ? propertyKey : (propertyMeta.getDisplayName() == null ? propertyKey : propertyMeta.getDisplayName())),
					getFieldEditorParent()
			);
		}

		return super.createFieldEditor(propertyKey, propertyMeta);
	}

}
