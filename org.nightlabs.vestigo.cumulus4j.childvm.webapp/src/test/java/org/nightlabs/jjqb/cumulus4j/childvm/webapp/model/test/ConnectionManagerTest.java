/**
 *
 */
package org.nightlabs.jjqb.cumulus4j.childvm.webapp.model.test;

import junit.framework.Assert;

import org.junit.Test;
import org.nightlabs.jjqb.childvm.shared.dto.JDOConnectionDTO;
import org.nightlabs.jjqb.childvm.shared.dto.JPAConnectionDTO;
import org.nightlabs.jjqb.childvm.webapp.model.Connection;
import org.nightlabs.jjqb.childvm.webapp.model.JDOConnection;
import org.nightlabs.jjqb.childvm.webapp.model.JPAConnection;
import org.nightlabs.jjqb.cumulus4j.childvm.shared.JDOCumulus4jConnectionDTO;
import org.nightlabs.jjqb.cumulus4j.childvm.shared.JPACumulus4jConnectionDTO;
import org.nightlabs.jjqb.cumulus4j.childvm.webapp.model.JDOCumulus4jConnection;
import org.nightlabs.jjqb.cumulus4j.childvm.webapp.model.JPACumulus4jConnection;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ConnectionManagerTest extends org.nightlabs.jjqb.childvm.webapp.model.test.ConnectionManagerTest {

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
