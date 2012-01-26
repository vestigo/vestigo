package org.nightlabs.jjqb.webapp.client.test;

import java.util.List;
import java.util.TreeSet;
import java.util.UUID;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;
import org.nightlabs.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.JDOConnectionDTO;
import org.nightlabs.jjqb.childvm.shared.JDOConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.QueryParameterDTO;
import org.nightlabs.jjqb.childvm.shared.ResultRowDTO;
import org.nightlabs.jjqb.childvm.shared.ResultSetID;
import org.nightlabs.jjqb.childvm.webapp.client.testresources.TestResourcesUtil;
import org.nightlabs.jjqb.childvm.webapp.client.testresources.sql.AbstractSetup;
import org.nightlabs.jjqb.childvm.webapp.client.testresources.sql.HSQLSetup;

public class JDOConnectionIT extends AbstractJJQBIT {
	
	private static final String JDO_DN_WITH_TESTMODEL_PROPERTIES = "jdo-dn-with-testmodel.properties";
	private static final String JDO_DN_STARTUP_ONLY_PROPERTIES = "jdo-dn-startup-only.properties";

	@BeforeClass
	public static void setupTemplateVars() {
//		System.setProperty("jjqb-test-connection-libs", "target/dependency/jjqb-test-connection-libs");
//		System.setProperty("jjqbTest.jdbc.url.hsql", "jdbc:hsqldb:file:/tmp/jjqb-test-db;shutdown=true");
//		System.setProperty("jjqbTest.jdbc.url.derby", "jdbc:derby:/tmp/jjqb-test-db-derby;shutdown=true");
	}
	
	@Test
	public void testOpenJDOConnectionNoModel() {
		openJDOConnection(UUID.randomUUID().toString(), JDO_DN_STARTUP_ONLY_PROPERTIES);
	}

	@Test
	public void testOpenJDOConnectionNoModel2() {
		openJDOConnection(UUID.randomUUID().toString(), JDO_DN_STARTUP_ONLY_PROPERTIES);
	}
	
	@Test
	public void testOpenJDOConnectionQueryWithNoDataInitialized() {
		openJDOConnection(UUID.randomUUID().toString(), JDO_DN_WITH_TESTMODEL_PROPERTIES);
	}	
	
	@Test
	public void testOpenJDOConnectionWithModel() {
		setup(createSetup(), "JDOSimpleEntity-1");
		ConnectionDTO jdoConnection = openJDOConnection(UUID.randomUUID().toString(), JDO_DN_WITH_TESTMODEL_PROPERTIES);
		ResultSetID executeQuery = client.executeQuery(jdoConnection.getConnectionID(), "SELECT this FROM org.nightlabs.jjqb.childvm.webapp.client.testmodel.jdo.JDOSimpleEntity", new TreeSet<QueryParameterDTO>());
		List<ResultRowDTO> nextResultRowDTOList = client.nextResultRowDTOList(executeQuery, 100);
		Assert.assertTrue(nextResultRowDTOList.size() > 0);
	}

	private AbstractSetup createSetup() {
		return new HSQLSetup();
	}	
	
	private ConnectionDTO openJDOConnection(String profileID, String propertiesName) {
		ConnectionProfileDTO connectionProfileDTO = createJDOConnectionProfile(profileID, propertiesName);
		
		ConnectionDTO connectionDTO = new JDOConnectionDTO();
		connectionDTO.setConnectionID(UUID.randomUUID());
		connectionDTO.setProfileID(connectionProfileDTO.getProfileID());
		client.putConnectionDTO(connectionDTO);
		return connectionDTO;
	}

	private ConnectionProfileDTO createJDOConnectionProfile(String profileID, String propertiesName) {
		ConnectionProfileDTO connectionProfileDTO = new JDOConnectionProfileDTO();
		connectionProfileDTO.setProfileID(profileID);
		connectionProfileDTO.setConnectionProperties(TestResourcesUtil.loadProperties(propertiesName));
		
		client.putConnectionProfileDTO(connectionProfileDTO);
		return connectionProfileDTO;
	}
	
}
