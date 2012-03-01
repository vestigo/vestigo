package org.nightlabs.jjqb.ui.oda.property;

import org.nightlabs.jjqb.childvm.shared.persistencexml.JDOPersistenceUnitHelper;
import org.nightlabs.jjqb.childvm.shared.persistencexml.PersistenceUnitHelper;

public class JDOPersistencePropertiesPage extends PersistencePropertiesPage {

	public JDOPersistencePropertiesPage() {
		setDescription(
				"Please specify the persistence properties. If you use a persistence unit (which is optional with JDO), you " +
				"can override its settings here.\n\n" +
				"" +
				"For example you should override 'javax.jdo.option.TransactionType' and set it " +
				"to 'RESOURCE_LOCAL', if your persistence unit declares it to use 'JTA' ('JTA' does not work in JJQB).\n\n" +
				"" +
				"Additionally, you very likely have to set 'javax.jdo.option.ConnectionURL', 'javax.jdo.option.ConnectionUserName', " +
				"'javax.jdo.option.ConnectionPassword' and the like to make your database " +
				"coordinates known.\n\n" +
				"" +
				"The special value '_NULL_' overrides a property as if it was not declared in the persistence unit."
		);
	}

	@Override
	protected PersistenceUnitHelper getPersistenceUnitHelper() {
		return new JDOPersistenceUnitHelper();
	}
}
