package org.nightlabs.jjqb.ui.oda.property;

public class JDOPersistenceUnitPage extends PersistenceUnitPage {

	public JDOPersistenceUnitPage() {
		setDescription("Please specify the persistence unit name. This is optional for JDO. Leave it empty, if there is none.");
	}

	@Override
	protected String getPersistenceUnitDocumentationURL()
	{ // TODO use a URL on our own web-site! Our code should not contain URLs we cannot control (even though we have limited control over the DN web site, that's not perfect).
		return "http://www.datanucleus.org/products/accessplatform_3_0/jdo/persistence_unit.html";
	}
}
