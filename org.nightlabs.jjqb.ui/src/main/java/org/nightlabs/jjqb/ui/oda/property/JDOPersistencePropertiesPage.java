package org.nightlabs.jjqb.ui.oda.property;

public class JDOPersistencePropertiesPage extends PersistencePropertiesPage {

	public JDOPersistencePropertiesPage() {
		setDescription(
				"Please specify the persistence properties. If you use a persistence unit (which is optional with JDO), you " +
				"can override its settings here.\n\n" +
				"" +
				"For example you could override 'javax.jdo.option.TransactionType' and set it " +
				"to 'RESOURCE_LOCAL', if your persistence unit declares it to use 'JTA'.\n\n" +
				"" +
				"Additionally, you very likely have to set 'javax.jdo.option.ConnectionURL' in order to make your database " +
				"coordinates known."
		);
	}

}
