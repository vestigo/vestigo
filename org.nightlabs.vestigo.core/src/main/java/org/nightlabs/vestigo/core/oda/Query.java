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

import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.OdaException;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public interface Query
extends org.eclipse.datatools.connectivity.oda.IQuery
{
	/**
	 * Get the connection to which this query belongs. Never <code>null</code>.
	 * @return the connection of this query; never <code>null</code>.
	 */
	Connection getConnection();

	/**
	 * Get the unique query identifier. Never <code>null</code>.
	 * @return the unique query identifier; never <code>null</code>.
	 */
	QueryID getQueryID();

	/**
	 * {@inheritDoc}
	 * <p>
	 * Important: This is a potentially long-running operation which should be executed asynchronously (in a job).
	 * </p>
	 */
	@Override
	IResultSet executeQuery() throws OdaException;
}
