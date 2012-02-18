package org.nightlabs.jjqb.cumulus4j.ui.transientconnectionproperties;

import org.eclipse.jface.preference.FieldEditor;
import org.nightlabs.jjqb.core.oda.ConnectionPropertyMeta;
import org.nightlabs.jjqb.core.transientconnectionproperties.TransientConnectionPropertiesProvider;
import org.nightlabs.jjqb.cumulus4j.childvm.shared.Cumulus4jConnectionProperties;
import org.nightlabs.jjqb.ui.transientconnectionproperties.DefaultPropertiesProviderPreferencePage;

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
