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
package org.nightlabs.vestigo.childvm.webapp.client.testresources.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public class DerbySetup extends AbstractSetup {

	public DerbySetup() {
		super("derby");
	}

	public static String getDefaultJdbcUrl() {
//		
//		return "jdbc:derby:sampleDB;create=true";
//		return "jdbc:derby:" + System.getProperty("java.io.tmpdir", "") + "/vestigo-test-db-derby;create=true;shutdown=true";
		return "jdbc:derby:" + System.getProperty("java.io.tmpdir", "") + "/vestigo-test-db-derby;create=true";
	}
	
	public static String getDefaultJdbcDriver() {
		return "org.apache.derby.jdbc.EmbeddedDriver";
	}
	
	@Override
	public Connection getConnection() throws SQLException {
//		return DriverManager.getConnection("jdbc:hsqldb:mem:vestigo-test; shutdown=true", "sa", "" );
//		return DriverManager.getConnection("jdbc:hsqldb:mem:vestigo-test", "sa", "" );
//		Properties props = new Properties();
//		props.put("create", "true");
//		props.put("shutdown", "true");
		return DriverManager.getConnection(getDefaultJdbcUrl(), "", "");
	}

}
