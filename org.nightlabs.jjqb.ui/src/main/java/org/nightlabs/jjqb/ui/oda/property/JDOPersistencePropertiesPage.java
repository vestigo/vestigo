package org.nightlabs.jjqb.ui.oda.property;

import java.util.Properties;

import org.nightlabs.jjqb.core.persistencexml.jaxb.Persistence.PersistenceUnit;
import org.nightlabs.jjqb.core.persistencexml.jaxb.PersistenceUnitTransactionType;

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
				"coordinates known."
		);
	}

	@Override
	protected void populatePropertiesFromPersistenceUnit(Properties properties, PersistenceUnit persistenceUnit)
	{
		setPropertyIfNotNullAndNotEmpty(properties, "javax.jdo.option.ConnectionFactoryName", persistenceUnit.getJtaDataSource());
		setPropertyIfNotNullAndNotEmpty(properties, "javax.jdo.option.ConnectionFactory2Name", persistenceUnit.getNonJtaDataSource());
		setPropertyIfNotNullAndNotEmpty(properties, "javax.jdo.PersistenceManagerFactoryClass", persistenceUnit.getProvider());

//		setPropertyIfNotNullAndNotEmpty(properties, "javax.persistence.sharedCache.mode", persistenceUnit.getSharedCacheMode()); // Not in JDO.

		setPropertyIfNotNullAndNotEmpty(properties, "javax.jdo.option.TransactionType", persistenceUnit.getTransactionType());

//		setPropertyIfNotNullAndNotEmpty(properties, "javax.persistence.validation.mode", persistenceUnit.getValidationMode()); // Not in JDO.
	}

	@Override
	protected void populatePersistenceUnitFromProperties(PersistenceUnit persistenceUnit, Properties properties) {
		persistenceUnit.setJtaDataSource(removeProperty(properties, "javax.jdo.option.ConnectionFactoryName"));
		persistenceUnit.setNonJtaDataSource(removeProperty(properties, "javax.jdo.option.ConnectionFactory2Name"));
		persistenceUnit.setProvider(removeProperty(properties, "javax.jdo.PersistenceManagerFactoryClass"));
		persistenceUnit.setTransactionType(removeProperty(properties, "javax.jdo.option.TransactionType", PersistenceUnitTransactionType.class));
	}
}
