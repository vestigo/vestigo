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

public class CandidateClass
{
	private String className;
	private String classNameLowerCase;

	public CandidateClass(String className) {
		if (className == null)
			throw new IllegalArgumentException("className == null"); //$NON-NLS-1$

		this.className = className;
	}

	public String getClassName() {
		return className;
	}

	public String getClassNameLowerCase() {
		if (classNameLowerCase == null)
			classNameLowerCase = className.toLowerCase();

		return classNameLowerCase;
	}
}
