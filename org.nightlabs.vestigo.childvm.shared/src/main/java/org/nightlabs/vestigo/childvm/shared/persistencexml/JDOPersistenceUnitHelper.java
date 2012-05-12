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
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.PersistenceUnitTransactionType;

public class JDOPersistenceUnitHelper extends PersistenceUnitHelper {

	@Override
	protected void populateSpecialPropertiesFromPersistenceUnit(Map<String, String> toProperties, PersistenceUnit fromPersistenceUnit)
	{
		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.jdo.option.ConnectionFactoryName", fromPersistenceUnit.getJtaDataSource()); //$NON-NLS-1$
		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.jdo.option.ConnectionFactory2Name", fromPersistenceUnit.getNonJtaDataSource()); //$NON-NLS-1$
		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.jdo.PersistenceManagerFactoryClass", fromPersistenceUnit.getProvider()); //$NON-NLS-1$

//		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.persistence.sharedCache.mode", fromPersistenceUnit.getSharedCacheMode()); // Not in JDO.

		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.jdo.option.TransactionType", fromPersistenceUnit.getTransactionType()); //$NON-NLS-1$

//		setPropertyIfNotNullAndNotEmpty(toProperties, "javax.persistence.validation.mode", fromPersistenceUnit.getValidationMode()); // Not in JDO.

	}

	@Override
	protected void populatePersistenceUnitFromSpecialProperties(PersistenceUnit toPersistenceUnit, Map<String, String> fromProperties)
	{
		boolean[] consumedFlag = new boolean[1];

		String s1 = consumeProperty(fromProperties, "javax.jdo.option.ConnectionFactoryName", consumedFlag); //$NON-NLS-1$
		if (consumedFlag[0])
			toPersistenceUnit.setJtaDataSource(s1);

		String s2 = consumeProperty(fromProperties, "javax.jdo.option.ConnectionFactory2Name", consumedFlag); //$NON-NLS-1$
		if (consumedFlag[0])
			toPersistenceUnit.setNonJtaDataSource(s2);

		String s3 = consumeProperty(fromProperties, "javax.jdo.PersistenceManagerFactoryClass", consumedFlag); //$NON-NLS-1$
		if (consumedFlag[0])
			toPersistenceUnit.setProvider(s3);

		PersistenceUnitTransactionType putt = consumeProperty(fromProperties, "javax.jdo.option.TransactionType", PersistenceUnitTransactionType.class, consumedFlag); //$NON-NLS-1$
		if (consumedFlag[0])
			toPersistenceUnit.setTransactionType(putt);
	}
}
