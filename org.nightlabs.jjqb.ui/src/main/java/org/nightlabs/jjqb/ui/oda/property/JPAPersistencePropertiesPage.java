package org.nightlabs.jjqb.ui.oda.property;

import java.util.Properties;

import org.nightlabs.jjqb.core.persistencexml.jaxb.Persistence.PersistenceUnit;
import org.nightlabs.jjqb.core.persistencexml.jaxb.PersistenceUnitCachingType;
import org.nightlabs.jjqb.core.persistencexml.jaxb.PersistenceUnitTransactionType;
import org.nightlabs.jjqb.core.persistencexml.jaxb.PersistenceUnitValidationModeType;

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
				"coordinates known."
		);
	}

	@Override
	protected void populatePropertiesFromPersistenceUnit(Properties properties, PersistenceUnit persistenceUnit)
	{
		setPropertyIfNotNullAndNotEmpty(properties, "javax.persistence.jtaDataSource", persistenceUnit.getJtaDataSource());
		setPropertyIfNotNullAndNotEmpty(properties, "javax.persistence.nonJtaDataSource", persistenceUnit.getNonJtaDataSource());
		setPropertyIfNotNullAndNotEmpty(properties, "javax.persistence.provider", persistenceUnit.getProvider());
		setPropertyIfNotNullAndNotEmpty(properties, "javax.persistence.sharedCache.mode", persistenceUnit.getSharedCacheMode());
		setPropertyIfNotNullAndNotEmpty(properties, "javax.persistence.transactionType", persistenceUnit.getTransactionType());
		setPropertyIfNotNullAndNotEmpty(properties, "javax.persistence.validation.mode", persistenceUnit.getValidationMode());
	}
	@Override
	protected void populatePersistenceUnitFromProperties(PersistenceUnit persistenceUnit, Properties properties) {
		persistenceUnit.setJtaDataSource(removeProperty(properties, "javax.persistence.jtaDataSource"));
		persistenceUnit.setNonJtaDataSource(removeProperty(properties, "javax.persistence.nonJtaDataSource"));
		persistenceUnit.setProvider(removeProperty(properties, "javax.persistence.provider"));
		persistenceUnit.setSharedCacheMode(removeProperty(properties, "javax.persistence.sharedCache.mode", PersistenceUnitCachingType.class));
		persistenceUnit.setTransactionType(removeProperty(properties, "javax.persistence.transactionType", PersistenceUnitTransactionType.class));
		persistenceUnit.setValidationMode(removeProperty(properties, "javax.persistence.validation.mode", PersistenceUnitValidationModeType.class));
	}
}
