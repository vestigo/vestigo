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
package org.nightlabs.vestigo.core.oda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.datatools.connectivity.oda.OdaException;

public class OdaMultiCauseException extends OdaException
{
	private List<Throwable> causes;

	private static final long serialVersionUID = 1L;

	public OdaMultiCauseException(List<Throwable> causes) {
		super(causes == null ? null : (causes.isEmpty() ? null : causes.get(0)));
		this.causes = Collections.unmodifiableList(causes == null ? new ArrayList<Throwable>(0) : new ArrayList<Throwable>(causes));
	}

	/**
	 * Get the list of causes. If there is no cause, an empty list will be returned.
	 * @return the list of causes. Never <code>null</code>. This list is read-only.
	 */
	public List<Throwable> getCauses() {
		return causes;
	}
}
