package org.nightlabs.jjqb.ui.oda.property;

import org.nightlabs.jjqb.childvm.shared.persistencexml.JPAPersistenceUnitHelper;
import org.nightlabs.jjqb.childvm.shared.persistencexml.PersistenceUnitHelper;

public class JPAPersistencePropertiesPage extends PersistencePropertiesPage {

	public JPAPersistencePropertiesPage() {
		setDescription(
				"Please specify the persistence properties. You can override the settings " +
				"of your persistence unit here.\n\n" +
				"" +
				"For example you should override 'javax.persistence.transactionType' and set it " +
				"to 'RESOURCE_LOCAL', if your persistence unit declares it to use 'JTA' ('JTA' does not work in JJQB).\n\n" +
				"" +
				"Additionally, you very likely have to set 'javax.persistence.jdbc.url', 'javax.persistence.jdbc.user', " +
				"'javax.persistence.jdbc.password' and the like to make your database " +
				"coordinates known.\n\n" +
				"" +
				"The special value '_NULL_' overrides a property as if it was not declared in the persistence unit."
		);
	}

	@Override
	protected PersistenceUnitHelper getPersistenceUnitHelper() {
		return new JPAPersistenceUnitHelper();
	}
}
