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

import java.sql.SQLException;
import java.sql.Statement;

import junit.framework.Assert;

import org.junit.Test;
import org.nightlabs.vestigo.childvm.webapp.client.testresources.sql.DerbySetup;

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
