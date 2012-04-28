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

public class FetchPlan extends PersistenceEngineWrapper
{
	public static final String ALL = "all";
	public static final String DEFAULT = "default";

	public FetchPlan(PersistenceManager persistenceManager, Object wrappedObject) {
		super(persistenceManager, wrappedObject);
	}

	public void setMaxFetchDepth(int maxFetchDepth) {
		invoke(1, "setMaxFetchDepth", int.class, maxFetchDepth);
	}

	public void setGroup(String group) {
		invoke(2, "setGroup", String.class, group);
	}
}
