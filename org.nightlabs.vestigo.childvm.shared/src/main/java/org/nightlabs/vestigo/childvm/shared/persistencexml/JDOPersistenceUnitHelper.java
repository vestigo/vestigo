package org.nightlabs.jjqb.childvm.shared.persistencexml;

import java.util.Map;

import org.nightlabs.jjqb.childvm.shared.persistencexml.jaxb.Persistence.PersistenceUnit;
import org.nightlabs.jjqb.childvm.shared.persistencexml.jaxb.PersistenceUnitTransactionType;

public class JDOPersistenceUnitHelper extends PersistenceUnitHelper {

	@Override
	protected void populateSpecialPropertiesFromPersistenceUnit(Map<String, String> toProperties, PersistenceUnit fromPersistenceUnit)
	{
		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.jdo.option.ConnectionFactoryName", fromPersistenceUnit.getJtaDataSource());
		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.jdo.option.ConnectionFactory2Name", fromPersistenceUnit.getNonJtaDataSource());
		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.jdo.PersistenceManagerFactoryClass", fromPersistenceUnit.getProvider());

//		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.persistence.sharedCache.mode", fromPersistenceUnit.getSharedCacheMode()); // Not in JDO.

		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.jdo.option.TransactionType", fromPersistenceUnit.getTransactionType());

//		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.persistence.validation.mode", fromPersistenceUnit.getValidationMode()); // Not in JDO.

	}

	@Override
	protected void populatePersistenceUnitFromSpecialProperties(PersistenceUnit toPersistenceUnit, Map<String, String> fromProperties)
	{
		boolean[] consumedFlag = new boolean[1];

		String s1 = consumeProperty(fromProperties, "javax.jdo.option.ConnectionFactoryName", consumedFlag);
		if (consumedFlag[0])
			toPersistenceUnit.setJtaDataSource(s1);

		String s2 = consumeProperty(fromProperties, "javax.jdo.option.ConnectionFactory2Name", consumedFlag);
		if (consumedFlag[0])
			toPersistenceUnit.setNonJtaDataSource(s2);

		String s3 = consumeProperty(fromProperties, "javax.jdo.PersistenceManagerFactoryClass", consumedFlag);
		if (consumedFlag[0])
			toPersistenceUnit.setProvider(s3);

		PersistenceUnitTransactionType putt = consumeProperty(fromProperties, "javax.jdo.option.TransactionType", PersistenceUnitTransactionType.class, consumedFlag);
		if (consumedFlag[0])
			toPersistenceUnit.setTransactionType(putt);
	}
}
