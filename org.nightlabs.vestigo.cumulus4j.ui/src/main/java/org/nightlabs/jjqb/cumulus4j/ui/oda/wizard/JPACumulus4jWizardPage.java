package org.nightlabs.jjqb.cumulus4j.ui.oda.wizard;

import org.nightlabs.jjqb.cumulus4j.ui.oda.property.Cumulus4jKeyStorePage;
import org.nightlabs.jjqb.ui.oda.property.JPAClasspathPage;
import org.nightlabs.jjqb.ui.oda.property.JPAPersistencePropertiesPage;
import org.nightlabs.jjqb.ui.oda.property.JPAPersistenceUnitPage;
import org.nightlabs.jjqb.ui.oda.wizard.AbstractDataSourceEditorWizardPage;


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
