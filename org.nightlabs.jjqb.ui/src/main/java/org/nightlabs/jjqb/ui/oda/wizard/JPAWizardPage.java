package org.nightlabs.jjqb.ui.oda.wizard;

import org.nightlabs.jjqb.ui.oda.property.JPAClasspathPage;
import org.nightlabs.jjqb.ui.oda.property.JPAPersistencePropertiesPage;
import org.nightlabs.jjqb.ui.oda.property.JPAPersistenceUnitPage;


public class JPAWizardPage extends AbstractDataSourceEditorWizardPage {

	@SuppressWarnings("unchecked")
	public JPAWizardPage(String pageName) {
		super(pageName, JPAClasspathPage.class, JPAPersistenceUnitPage.class, JPAPersistencePropertiesPage.class);
	}

}
