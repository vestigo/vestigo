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
package org.nightlabs.vestigo.ui.candidateclassview;

import org.nightlabs.vestigo.core.oda.PersistableClass;

public class CandidateClass
{
	private PersistableClass persistableClass;
	private String classNameLowerCase;

	public CandidateClass(PersistableClass persistableClass) {
		if (persistableClass == null)
			throw new IllegalArgumentException("persistableClass == null"); //$NON-NLS-1$

		this.persistableClass = persistableClass;
	}

	public PersistableClass getPersistableClass() {
		return persistableClass;
	}

	public String getName() {
		return persistableClass.getName();
	}

	public String getNameLowerCase() {
		if (classNameLowerCase == null)
			classNameLowerCase = getName().toLowerCase();

		return classNameLowerCase;
	}
}
