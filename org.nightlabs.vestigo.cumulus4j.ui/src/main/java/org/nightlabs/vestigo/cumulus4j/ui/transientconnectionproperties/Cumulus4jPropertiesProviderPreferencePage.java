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
