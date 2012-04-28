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
package org.nightlabs.vestigo.childvm.webapp.persistenceengine.jdo;

import org.nightlabs.vestigo.childvm.webapp.persistenceengine.PersistenceEngineWrapper;

public class Transaction extends PersistenceEngineWrapper
{
//	private PersistenceManager persistenceManager;

	public Transaction(PersistenceManager persistenceManager, Object wrappedObject) {
		super(persistenceManager, wrappedObject);
//		this.persistenceManager = persistenceManager;
	}

//	public PersistenceManager getPersistenceManager() {
//		return persistenceManager;
//	}

	public void begin() {
		invoke(1, "begin");
	}

	public void commit() {
		invoke(2, "commit");
	}

	public void rollback() {
		invoke(3, "rollback");
	}
}
