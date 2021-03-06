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
package org.nightlabs.vestigo.childvm.webapp.client.testresources.sql;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 */
public abstract class AbstractSetup {

	private String dbType;
	
	public AbstractSetup(String dbType) {
		this.dbType = dbType;
	}
	
	public void setup(String name) throws SQLException {
		beforeSetup();
		Connection connection = getConnection();
		try {
			beforeSetup(connection);
			execSript(connection, "setup", name);
		} finally {
			connection.close();
		}
		afterSetup();
	}
	
	protected void beforeSetup(Connection connection) throws SQLException {
	}

	protected void beforeSetup() {
	}
	
	protected void afterSetup() {
	}
	
	public void teardown(String name) throws SQLException {
		beforeTeardown();
		Connection connection = getConnection();
		try {
			beforeTeardown(connection);
			execSript(connection, "teardown", name);
		} finally {
			connection.close();
		}
		afterTeardown();
	}

	protected void beforeTeardown() {
	}
	
	protected void beforeTeardown(Connection connection) throws SQLException {
	}
	
	protected void afterTeardown() {
	}

	protected void execSript(Connection connection, String type, String name) {
		try {
			InputStream in = getScript(type, name);
			if (in == null) {
				System.err.println("Could not find teardown script " + dbType + "-teardown" + "-" + name);
				return;
			}
			try {
				SQLUtil.execSQLScript(in, connection);
			} finally {
				if (in != null)
					in.close();
				if (connection != null) {
					connection.close();
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public String getDbType() {
		return dbType;
	}

	protected InputStream getScript(String type, String name) {
		String resourcePath = "vestigo-test-sql-scripts/" + dbType + "-" + type + "-" + name + ".sql";
		return AbstractSetup.class.getClassLoader().getResourceAsStream(resourcePath);
	}
	
	public abstract Connection getConnection() throws SQLException;

}
