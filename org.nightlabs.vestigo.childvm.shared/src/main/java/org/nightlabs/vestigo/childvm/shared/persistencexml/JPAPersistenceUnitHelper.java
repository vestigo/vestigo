package org.nightlabs.jjqb.childvm.shared.persistencexml;

import java.util.Map;

import org.nightlabs.jjqb.childvm.shared.persistencexml.jaxb.Persistence.PersistenceUnit;
import org.nightlabs.jjqb.childvm.shared.persistencexml.jaxb.PersistenceUnitCachingType;
import org.nightlabs.jjqb.childvm.shared.persistencexml.jaxb.PersistenceUnitTransactionType;
import org.nightlabs.jjqb.childvm.shared.persistencexml.jaxb.PersistenceUnitValidationModeType;

public class JPAPersistenceUnitHelper extends PersistenceUnitHelper {

	@Override
	protected void populateSpecialPropertiesFromPersistenceUnit(Map<String, String> toProperties, PersistenceUnit fromPersistenceUnit)
	{
		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.persistence.jtaDataSource", fromPersistenceUnit.getJtaDataSource());
		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.persistence.nonJtaDataSource", fromPersistenceUnit.getNonJtaDataSource());
		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.persistence.provider", fromPersistenceUnit.getProvider());
		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.persistence.sharedCache.mode", fromPersistenceUnit.getSharedCacheMode());
		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.persistence.transactionType", fromPersistenceUnit.getTransactionType());
		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.persistence.validation.mode", fromPersistenceUnit.getValidationMode());
	}

	@Override
	protected void populatePersistenceUnitFromSpecialProperties(PersistenceUnit toPersistenceUnit, Map<String, String> fromProperties)
	{
		boolean[] consumedFlag = new boolean[1];

		String s1 = consumeProperty(fromProperties, "javax.persistence.jtaDataSource", consumedFlag);
		if (consumedFlag[0])
			toPersistenceUnit.setJtaDataSource(s1);

		String s2 = consumeProperty(fromProperties, "javax.persistence.nonJtaDataSource", consumedFlag);
		if (consumedFlag[0])
			toPersistenceUnit.setNonJtaDataSource(s2);

		String s3 = consumeProperty(fromProperties, "javax.persistence.provider", consumedFlag);
		if (consumedFlag[0])
			toPersistenceUnit.setProvider(s3);

		PersistenceUnitCachingType puct = consumeProperty(fromProperties, "javax.persistence.sharedCache.mode", PersistenceUnitCachingType.class, consumedFlag);
		if (consumedFlag[0])
			toPersistenceUnit.setSharedCacheMode(puct);

		PersistenceUnitTransactionType putt = consumeProperty(fromProperties, "javax.persistence.transactionType", PersistenceUnitTransactionType.class, consumedFlag);
		if (consumedFlag[0])
			toPersistenceUnit.setTransactionType(putt);

		PersistenceUnitValidationModeType puvmt = consumeProperty(fromProperties, "javax.persistence.validation.mode", PersistenceUnitValidationModeType.class, consumedFlag);
		if (consumedFlag[0])
			toPersistenceUnit.setValidationMode(puvmt);
	}
}
