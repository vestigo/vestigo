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
package org.nightlabs.vestigo.ui.oda.property;

import org.nightlabs.vestigo.childvm.shared.persistencexml.PersistenceXml;
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.Persistence.PersistenceUnit;

final class PersistenceUnitRef
{
	private PersistenceXml persistenceXml;
	private PersistenceUnit persistenceUnit;

	public PersistenceUnitRef(PersistenceXml persistenceXml, PersistenceUnit persistenceUnit) {
		this.persistenceXml = persistenceXml;
		this.persistenceUnit = persistenceUnit;
	}

	public PersistenceXml getPersistenceXml() {
		return persistenceXml;
	}
	public PersistenceUnit getPersistenceUnit() {
		return persistenceUnit;
	}
}