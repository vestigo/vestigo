/**
 * 
 */
package org.nightlabs.jjqb.childvm.webapp.client.testresources;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;
import org.nightlabs.jjqb.childvm.webapp.client.testresources.sql.HSQLSetup;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public class HSQLSetupTest {

	@Test
	public void testSetupJDOEntity() throws SQLException, InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				doTestSetupJDOEntity();
			}
		});
		t1.start();
		t1.join();

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				doTestSetupJDOEntity();
			}
		});
		t2.start();
		t2.join(); 
	}

	private void doTestSetupJDOEntity() {
		try {
			HSQLSetup hsqlSetup = new HSQLSetup();
			hsqlSetup.setup("JDOSimpleEntity-1");
			assertJDOSimpleEntityExisting(hsqlSetup);
			hsqlSetup.teardown("JDOSimpleEntity-1");
			//			hsqlSetup.getConnection().close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private void assertJDOSimpleEntityExisting(HSQLSetup hsqlSetup)
	throws SQLException {
		Connection connection = hsqlSetup.getConnection();
		Statement stmt = connection.createStatement();
		stmt.execute("SELECT * FROM JDOSIMPLEENTITY");
		Assert.assertTrue(stmt.getResultSet().next());
		stmt.close();
		connection.close();
	}

	@Test
	public void testSetupJDOComplexEntity1() {
		try {
			HSQLSetup hsqlSetup = new HSQLSetup();
			hsqlSetup.setup("JDOComplexEntity-1");
			assertJDOComplexEntityExisting(hsqlSetup);
			hsqlSetup.teardown("JDOComplexEntity-1");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private void assertJDOComplexEntityExisting(HSQLSetup hsqlSetup)
	throws SQLException {
		Connection connection = hsqlSetup.getConnection();
		Statement stmt = connection.createStatement();
		stmt.execute("SELECT * FROM JDOCOMPLEXENTITY");
		Assert.assertTrue(stmt.getResultSet().next());
		stmt.close();
		connection.close();
	}
	
}
