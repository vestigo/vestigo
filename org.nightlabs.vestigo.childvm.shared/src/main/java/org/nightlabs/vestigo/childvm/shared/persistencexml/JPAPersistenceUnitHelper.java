/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.childvm.shared.persistencexml;

import java.util.Map;

import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.Persistence.PersistenceUnit;
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.PersistenceUnitCachingType;
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.PersistenceUnitTransactionType;
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.PersistenceUnitValidationModeType;

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
