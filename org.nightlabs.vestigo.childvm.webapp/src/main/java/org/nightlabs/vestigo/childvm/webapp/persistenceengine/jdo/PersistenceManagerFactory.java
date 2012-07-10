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

public class PersistenceManagerFactory extends PersistenceEngineWrapper
{
	private JDOHelper jdoHelper;

	public PersistenceManagerFactory(JDOHelper jdoHelper, Object wrappedPersistenceManagerFactory) {
		super(jdoHelper, wrappedPersistenceManagerFactory);
		this.jdoHelper = jdoHelper;
	}

	public JDOHelper getJDOHelper() {
		return jdoHelper;
	}

	public void close() {
		invoke(1, "close");
	}

	public PersistenceManager getPersistenceManager() {
		Object wrappedPM = invoke(2, "getPersistenceManager");
		if (wrappedPM == null)
			throw new IllegalStateException("getPersistenceManager() returned null! invocationTargetClass=" + getWrappedClassName() + " invocationTargetObject=" + getWrappedObject());

		return new PersistenceManager(this, wrappedPM);
	}
}
