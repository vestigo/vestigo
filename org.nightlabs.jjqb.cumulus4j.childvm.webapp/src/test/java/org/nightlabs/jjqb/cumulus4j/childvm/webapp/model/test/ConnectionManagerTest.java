/**
 * 
 */
package org.nightlabs.jjqb.cumulus4j.childvm.webapp.model.test;

import junit.framework.Assert;

import org.junit.Test;
import org.nightlabs.jjqb.childvm.webapp.model.Connection;
import org.nightlabs.jjqb.childvm.webapp.model.JDOConnection;
import org.nightlabs.jjqb.childvm.shared.JDOConnectionDTO;
import org.nightlabs.jjqb.cumulus4j.childvm.shared.JDOCumulus4JConnectionDTO;
import org.nightlabs.jjqb.cumulus4j.childvm.webapp.model.JDOCumulus4JConnection;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
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
		Connection connection = putConnection(JDOCumulus4JConnectionDTO.class);
		Assert.assertNotNull(connection);
		Assert.assertEquals("Created connection not of expected type", JDOCumulus4JConnection.class, connection.getClass());
	}
}
