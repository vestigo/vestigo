package org.nightlabs.vestigo.cumulus4j.ui.oda.wizard;

import org.nightlabs.vestigo.cumulus4j.ui.oda.property.Cumulus4jKeyStorePage;
import org.nightlabs.vestigo.ui.oda.property.JPAClasspathPage;
import org.nightlabs.vestigo.ui.oda.property.JPAPersistencePropertiesPage;
import org.nightlabs.vestigo.ui.oda.property.JPAPersistenceUnitPage;
import org.nightlabs.vestigo.ui.oda.wizard.AbstractDataSourceEditorWizardPage;


public class JPACumulus4jWizardPage extends AbstractDataSourceEditorWizardPage {

	@SuppressWarnings("unchecked")
	public JPACumulus4jWizardPage(String pageName) {
		super(
				pageName,
				JPAClasspathPage.class,
				JPAPersistenceUnitPage.class,
				JPAPersistencePropertiesPage.class,
				Cumulus4jKeyStorePage.class
		);
	}

}
