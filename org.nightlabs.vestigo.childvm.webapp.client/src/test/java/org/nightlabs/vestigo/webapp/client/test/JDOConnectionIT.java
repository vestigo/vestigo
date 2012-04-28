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
package org.nightlabs.vestigo.webapp.client.test;

import java.util.List;
import java.util.TreeSet;
import java.util.UUID;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;
import org.nightlabs.vestigo.childvm.shared.ResultSetID;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JDOConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JDOConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.QueryParameterDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultRowDTO;
import org.nightlabs.vestigo.childvm.webapp.client.testresources.TestResourcesUtil;
import org.nightlabs.vestigo.childvm.webapp.client.testresources.sql.AbstractSetup;
import org.nightlabs.vestigo.childvm.webapp.client.testresources.sql.HSQLSetup;

public class JDOConnectionIT extends AbstractVestigoIT {
	
	private static final String JDO_DN_WITH_TESTMODEL_PROPERTIES = "jdo-dn-with-testmodel.properties";
	private static final String JDO_DN_STARTUP_ONLY_PROPERTIES = "jdo-dn-startup-only.properties";

	@BeforeClass
	public static void setupTemplateVars() {
//		System.setProperty("vestigo-test-connection-libs", "target/dependency/vestigo-test-connection-libs");
//		System.setProperty("vestigoTest.jdbc.url.hsql", "jdbc:hsqldb:file:/tmp/vestigo-test-db;shutdown=true");
//		System.setProperty("vestigoTest.jdbc.url.derby", "jdbc:derby:/tmp/vestigo-test-db-derby;shutdown=true");
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
		ResultSetID executeQuery = client.executeQuery(jdoConnection.getConnectionID(), "SELECT this FROM org.nightlabs.vestigo.childvm.webapp.client.testmodel.jdo.JDOSimpleEntity", new TreeSet<QueryParameterDTO>());
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
