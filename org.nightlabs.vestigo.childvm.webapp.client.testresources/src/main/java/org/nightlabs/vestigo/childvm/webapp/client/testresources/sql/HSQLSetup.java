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
import java.sql.Statement;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public class HSQLSetup extends AbstractSetup {

	public HSQLSetup() {
		super("hsql");
	}

	public static String getDefaultJdbcUrl() {
//		jdbc:derby:/srv/databases/thisdb
		return "jdbc:hsqldb:file:" + System.getProperty("java.io.tmpdir", "") + "/vestigo-test-db; shutdown=true";
	}
	
	public static String getDefaultJdbcDriver() {
		return "org.hsqldb.jdbcDriver";
	}
	
	
	@Override
	public Connection getConnection() throws SQLException {
//		return DriverManager.getConnection("jdbc:hsqldb:mem:vestigo-test; shutdown=true", "sa", "" );
//		return DriverManager.getConnection("jdbc:hsqldb:mem:vestigo-test", "sa", "" );
		return DriverManager.getConnection(getDefaultJdbcUrl(), "sa", "" );
	}

	@Override
	protected void beforeSetup(Connection connection) throws SQLException {
		dropDefaultSchema(connection);
	}
	
	@Override
	protected void beforeTeardown(Connection connection) throws SQLException {
		dropDefaultSchema(connection);
	}

	private void dropDefaultSchema(Connection connection) throws SQLException {
		Statement stmt = connection.createStatement();
		stmt.execute("DROP SCHEMA PUBLIC CASCADE");
		stmt.close();
	}
}
