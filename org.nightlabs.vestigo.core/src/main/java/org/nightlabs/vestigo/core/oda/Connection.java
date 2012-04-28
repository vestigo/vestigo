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

import java.util.Properties;
import java.util.UUID;

import org.eclipse.datatools.connectivity.oda.OdaException;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public interface Connection extends org.eclipse.datatools.connectivity.oda.IConnection
{
//	public static final class Helper {
//		private Helper() { }
//		public static Connection unwrap(org.eclipse.datatools.connectivity.IConnection odaConnection)
//		{
//			org.eclipse.datatools.connectivity.oda.consumer.helper.OdaConnection rawConnection = (org.eclipse.datatools.connectivity.oda.consumer.helper.OdaConnection) odaConnection.getRawConnection();
//			try {
//				Field realConnectionField = org.eclipse.datatools.connectivity.oda.consumer.helper.OdaConnection.class.getField("m_object");
//				realConnectionField.setAccessible(true);
//				Connection realConnection = (Connection) realConnectionField.get(rawConnection);
//			} catch (Exception e) {
//				throw new RuntimeException(e);
//			}
//		}
//	}

	UUID getConnectionID();

	ConnectionProfile getConnectionProfile();

	Properties getConnectionProperties();

	/**
	 * {@inheritDoc}
	 * <p>
	 * Important: This is a potentially long-running operation which should be executed asynchronously (in a job).
	 * </p>
	 */
	@Override
	void open(Properties connProperties) throws OdaException;

	@Override
	Query newQuery(String dataSetType) throws OdaException;

	/**
	 * {@inheritDoc}
	 * <p>
	 * Important: This is a potentially long-running operation which should be executed asynchronously (in a job).
	 * </p>
	 */
	@Override
	void close() throws OdaException;
}
