/**
 * 
 */
package org.nightlabs.jjqb.childvm.webapp.client.testresources.sql;

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
//		return "jdbc:derby:" + System.getProperty("java.io.tmpdir", "") + "/jjqb-test-db-derby;create=true;shutdown=true";
		return "jdbc:derby:" + System.getProperty("java.io.tmpdir", "") + "/jjqb-test-db-derby;create=true";
	}
	
	public static String getDefaultJdbcDriver() {
		return "org.apache.derby.jdbc.EmbeddedDriver";
	}
	
	@Override
	public Connection getConnection() throws SQLException {
//		return DriverManager.getConnection("jdbc:hsqldb:mem:jjqb-test; shutdown=true", "sa", "" );
//		return DriverManager.getConnection("jdbc:hsqldb:mem:jjqb-test", "sa", "" );
//		Properties props = new Properties();
//		props.put("create", "true");
//		props.put("shutdown", "true");
		return DriverManager.getConnection(getDefaultJdbcUrl(), "", "");
	}

}
