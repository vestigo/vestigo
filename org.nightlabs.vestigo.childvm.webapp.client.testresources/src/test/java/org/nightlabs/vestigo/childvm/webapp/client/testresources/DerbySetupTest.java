/**
 * 
 */
package org.nightlabs.jjqb.childvm.webapp.client.testresources;

import java.sql.SQLException;
import java.sql.Statement;

import junit.framework.Assert;

import org.junit.Test;
import org.nightlabs.jjqb.childvm.webapp.client.testresources.sql.DerbySetup;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public class DerbySetupTest {

	@Test
	public void testSetupJDOEntity() throws SQLException {
		DerbySetup derbySetup = new DerbySetup();
		derbySetup.setup("JDOSimpleEntity-1");
		assertJDOEntityExisting(derbySetup);
		derbySetup.teardown("JDOSimpleEntity-1");
		derbySetup.getConnection().close();
	}

	private void assertJDOEntityExisting(DerbySetup hsqlSetup)
			throws SQLException {
		Statement stmt = hsqlSetup.getConnection().createStatement();
		stmt.execute("SELECT * FROM JDOSIMPLEENTITY");
		Assert.assertTrue(stmt.getResultSet().next());
		stmt.close();
	}
	
}
