package org.nightlabs.vestigo.cumulus4j.ui.oda.wizard;

import org.nightlabs.vestigo.cumulus4j.ui.oda.property.Cumulus4jKeyStorePage;
import org.nightlabs.vestigo.ui.oda.property.JDOClasspathPage;
import org.nightlabs.vestigo.ui.oda.property.JDOPersistencePropertiesPage;
import org.nightlabs.vestigo.ui.oda.property.JDOPersistenceUnitPage;
import org.nightlabs.vestigo.ui.oda.wizard.AbstractDataSourceEditorWizardPage;


public class JDOCumulus4jWizardPage extends AbstractDataSourceEditorWizardPage {

	@SuppressWarnings("unchecked")
	public JDOCumulus4jWizardPage(String pageName) {
		super(
				pageName,
				JDOClasspathPage.class,
				JDOPersistenceUnitPage.class,
				JDOPersistencePropertiesPage.class,
				Cumulus4jKeyStorePage.class
		);
	}

}
