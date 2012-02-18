package org.nightlabs.jjqb.ui.transientconnectionproperties;

import java.util.Collection;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.nightlabs.jjqb.core.oda.ConnectionProfile;
import org.nightlabs.jjqb.core.oda.ConnectionPropertyMeta;
import org.nightlabs.jjqb.core.transientconnectionproperties.TransientConnectionPropertiesProvider;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;

public class DefaultPropertiesProviderPreferencePage extends FieldEditorPreferencePage
{
	protected TransientConnectionPropertiesProvider transientConnectionPropertiesProvider;
	protected ConnectionProfile connectionProfile;

	public DefaultPropertiesProviderPreferencePage(TransientConnectionPropertiesProvider transientConnectionPropertiesProvider) {
		super(
				"Transient connection properties",
				JJQBUIPlugin.getDefault().getImageDescriptor(DefaultPropertiesProviderPreferencePage.class, "image", JJQBUIPlugin.IMAGE_SIZE_75x70),
				GRID
		);
		this.transientConnectionPropertiesProvider = transientConnectionPropertiesProvider;
		this.connectionProfile = this.transientConnectionPropertiesProvider.getConnectionProfile();

		setMessage("For establishing a connection, the following additional properties are required. The data entered here will not be saved in persistent storage (only kept in memory).");

		noDefaultAndApplyButton();
	}

	@Override
	protected void createFieldEditors() {
		Collection<String> propertyKeys = connectionProfile.getTransientConnectionPropertyKeys();
		for (String propertyKey : propertyKeys) {
			ConnectionPropertyMeta propertyMeta = connectionProfile.getConnectionPropertyMeta(propertyKey);
			addField(
					createFieldEditor(propertyKey, propertyMeta)
			);
		}
	}

	protected FieldEditor createFieldEditor(String propertyKey, ConnectionPropertyMeta propertyMeta)
	{
		return new StringFieldEditor(
				propertyKey,
				String.format("%s:", propertyMeta == null ? propertyKey : (propertyMeta.getDisplayName() == null ? propertyKey : propertyMeta.getDisplayName())),
				getFieldEditorParent()
		);
	}
}
