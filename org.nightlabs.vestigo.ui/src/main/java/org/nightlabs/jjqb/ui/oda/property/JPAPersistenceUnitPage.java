package org.nightlabs.jjqb.ui.oda.property;

public class JPAPersistenceUnitPage extends PersistenceUnitPage {

	public JPAPersistenceUnitPage() {
		setDescription("Please specify the persistence unit name. This is required for JPA.");
	}

	@Override
	protected String getPersistenceUnitDocumentationURL()
	{ // TODO use a URL on our own web-site! Our code should not contain URLs we cannot control (even though we have limited control over the DN web site, that's not perfect).
		return "http://www.datanucleus.org/products/accessplatform_3_0/jpa/persistence_unit.html";
	}
}
