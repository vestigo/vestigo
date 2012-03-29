package org.nightlabs.vestigo.ui.oda.property;

import org.nightlabs.vestigo.core.VestigoCorePlugin;

public class JDOPersistenceUnitPage extends PersistenceUnitPage {

	public JDOPersistenceUnitPage() {
		setDescription("Please specify the persistence unit name. This is optional for JDO. Leave it empty, if there is none.");
	}

	@Override
	protected String getPersistenceUnitDocumentationURL()
	{
		return VestigoCorePlugin.getDefault().getVersionSpecificURL("http://vestigo.nightlabs.com/${versionAndLanguage}/documentation/jdo/persistence-unit.html");
	}
}
