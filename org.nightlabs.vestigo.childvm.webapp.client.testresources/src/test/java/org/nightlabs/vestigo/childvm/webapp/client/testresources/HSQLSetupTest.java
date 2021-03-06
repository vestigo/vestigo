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
package org.nightlabs.vestigo.childvm.webapp.client.testresources;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;
import org.nightlabs.vestigo.childvm.webapp.client.testresources.sql.HSQLSetup;

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
