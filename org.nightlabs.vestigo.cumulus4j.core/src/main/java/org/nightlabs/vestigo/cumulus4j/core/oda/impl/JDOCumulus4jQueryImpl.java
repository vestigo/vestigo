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
package org.nightlabs.vestigo.cumulus4j.core.oda.impl;

import org.nightlabs.vestigo.core.oda.JDOQuery;
import org.nightlabs.vestigo.core.oda.ResultSet;
import org.nightlabs.vestigo.core.oda.impl.AbstractConnection;
import org.nightlabs.vestigo.core.oda.impl.AbstractQuery;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOCumulus4jQueryImpl extends AbstractQuery implements JDOQuery
{
	public JDOCumulus4jQueryImpl(AbstractConnection connection) {
		super(connection);
	}

	@Override
	protected ResultSet newResultSet() {
		return new JDOCumulus4jResultSetImpl(this);
	}
}
