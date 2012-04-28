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
package org.nightlabs.vestigo.ui.oda.property;

import org.nightlabs.vestigo.core.VestigoCorePlugin;

public class JPAPersistenceUnitPage extends PersistenceUnitPage
{
	public JPAPersistenceUnitPage() {
		setDescription("Please specify the persistence unit name. This is required for JPA.");
	}

	@Override
	protected String getPersistenceUnitDocumentationURL()
	{
		return VestigoCorePlugin.getDefault().getVersionSpecificURL("http://vestigo.nightlabs.com/${versionAndLanguage}/documentation/jpa/persistence-unit.html");
	}
}
