package org.nightlabs.jjqb.ui.oda.property;

public class JDOPersistenceUnitPage extends PersistenceUnitPage {

	public JDOPersistenceUnitPage() {
		setDescription("Please specify the persistence unit name. This is optional for JDO. Leave it empty, if there is none.");
	}

//	@Override
//	protected String getPersistenceUnitDescription() {
//		return "Please specify the persistence unit name. This is optional for JDO. Leave it empty, if there is none.";
//	}

	@Override
	protected String getPersistenceUnitDocumentationURL()
	{
		return "http://www.datanucleus.org/products/accessplatform_3_0/jdo/persistence_unit.html";
	}
}
