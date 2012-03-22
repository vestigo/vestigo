package org.nightlabs.vestigo.ui.oda.wizard;

import org.nightlabs.vestigo.ui.oda.property.JDOClasspathPage;
import org.nightlabs.vestigo.ui.oda.property.JDOPersistencePropertiesPage;
import org.nightlabs.vestigo.ui.oda.property.JDOPersistenceUnitPage;


public class JDOWizardPage extends AbstractDataSourceEditorWizardPage {

	@SuppressWarnings("unchecked")
	public JDOWizardPage(String pageName) {
		super(pageName, JDOClasspathPage.class, JDOPersistenceUnitPage.class, JDOPersistencePropertiesPage.class);
	}

}
