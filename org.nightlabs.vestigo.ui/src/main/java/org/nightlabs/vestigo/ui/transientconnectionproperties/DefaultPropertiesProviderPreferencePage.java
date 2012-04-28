/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.ui.transientconnectionproperties;

import java.util.Collection;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.nightlabs.vestigo.core.oda.ConnectionProfile;
import org.nightlabs.vestigo.core.oda.ConnectionPropertyMeta;
import org.nightlabs.vestigo.core.transientconnectionproperties.TransientConnectionPropertiesProvider;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;

public class DefaultPropertiesProviderPreferencePage extends FieldEditorPreferencePage
{
	protected TransientConnectionPropertiesProvider transientConnectionPropertiesProvider;
	protected ConnectionProfile connectionProfile;

	public DefaultPropertiesProviderPreferencePage(TransientConnectionPropertiesProvider transientConnectionPropertiesProvider) {
		super(
				"Transient connection properties",
				VestigoUIPlugin.getDefault().getImageDescriptor(DefaultPropertiesProviderPreferencePage.class, null, AbstractVestigoUIPlugin.IMAGE_SIZE_75x70),
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
