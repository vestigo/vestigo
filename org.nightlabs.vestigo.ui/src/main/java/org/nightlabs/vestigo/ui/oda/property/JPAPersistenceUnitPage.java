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
