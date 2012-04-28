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
/**
 *
 */
package org.nightlabs.vestigo.cumulus4j.childvm.webapp.model.test;

import junit.framework.Assert;

import org.junit.Test;
import org.nightlabs.vestigo.childvm.shared.dto.JDOConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JPAConnectionDTO;
import org.nightlabs.vestigo.childvm.webapp.model.Connection;
import org.nightlabs.vestigo.childvm.webapp.model.JDOConnection;
import org.nightlabs.vestigo.childvm.webapp.model.JPAConnection;
import org.nightlabs.vestigo.cumulus4j.childvm.shared.JDOCumulus4jConnectionDTO;
import org.nightlabs.vestigo.cumulus4j.childvm.shared.JPACumulus4jConnectionDTO;
import org.nightlabs.vestigo.cumulus4j.childvm.webapp.model.JDOCumulus4jConnection;
import org.nightlabs.vestigo.cumulus4j.childvm.webapp.model.JPACumulus4jConnection;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ConnectionManagerTest extends org.nightlabs.vestigo.childvm.webapp.model.test.ConnectionManagerTest {

	/**
	 * This is to test that the default connection creation still works
	 */
	@Test
	public void testCanStillCreateJDOConnection() {
		Connection connection = putConnection(JDOConnectionDTO.class);
		Assert.assertNotNull(connection);
		Assert.assertEquals("Created connection not of expected type", JDOConnection.class, connection.getClass());
	}

	/**
	 * This is to test that the the service registration mechanism works and the
	 * extensions done in this module are loaded by the ConnectionManager.
	 */
	@Test
	public void testCreateJDOCumulus4JConnection() {
		Connection connection = putConnection(JDOCumulus4jConnectionDTO.class);
		Assert.assertNotNull(connection);
		Assert.assertEquals("Created connection not of expected type", JDOCumulus4jConnection.class, connection.getClass());
	}

	/**
	 * This is to test that the default connection creation still works
	 */
	@Test
	public void testCanStillCreateJPAConnection() {
		Connection connection = putConnection(JPAConnectionDTO.class);
		Assert.assertNotNull(connection);
		Assert.assertEquals("Created connection not of expected type", JPAConnection.class, connection.getClass());
	}

	/**
	 * This is to test that the the service registration mechanism works and the
	 * extensions done in this module are loaded by the ConnectionManager.
	 */
	@Test
	public void testCreateJPACumulus4JConnection() {
		Connection connection = putConnection(JPACumulus4jConnectionDTO.class);
		Assert.assertNotNull(connection);
		Assert.assertEquals("Created connection not of expected type", JPACumulus4jConnection.class, connection.getClass());
	}
}
