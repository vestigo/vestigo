package org.nightlabs.jjqb.ui.oda.wizard;

import org.nightlabs.jjqb.ui.oda.property.JDOClasspathPage;
import org.nightlabs.jjqb.ui.oda.property.JDOPersistencePropertiesPage;
import org.nightlabs.jjqb.ui.oda.property.JDOPersistenceUnitPage;


public class JDOWizardPage extends AbstractDataSourceEditorWizardPage {

	@SuppressWarnings("unchecked")
	public JDOWizardPage(String pageName) {
		super(pageName, JDOClasspathPage.class, JDOPersistenceUnitPage.class, JDOPersistencePropertiesPage.class);
	}

}
