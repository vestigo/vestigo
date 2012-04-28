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
package org.nightlabs.vestigo.childvm.webapp.model.test;

import java.util.Collection;
import java.util.UUID;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JDOConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JPAConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfile;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfileManager;
import org.nightlabs.vestigo.childvm.webapp.model.JDOConnectionProfile;
import org.nightlabs.vestigo.childvm.webapp.model.JPAConnectionProfile;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public class ConnectionProfileManagerTest {

	private ConnectionProfileManager connectionProfileManager;
	
	@Before
	public void createProfileManager() {
		connectionProfileManager = new ConnectionProfileManager();
	}
	
	@Test
	public void testCreateJDOConnectionProfile() {
		ConnectionProfile connectionProfile = createJDOConnectionProfile();
		Assert.assertNotNull("No connectionProfile was created", connectionProfile);
		Assert.assertEquals("Created ConnectionProfile is not of expected type", JDOConnectionProfile.class, connectionProfile.getClass());
	}

	@Test
	public void testCreateJPAConnectionProfile() {
		ConnectionProfile connectionProfile = createJPAConnectionProfile();
		Assert.assertNotNull("No connectionProfile was created", connectionProfile);
		Assert.assertEquals("Created ConnectionProfile is not of expected type", JPAConnectionProfile.class, connectionProfile.getClass());
	}

	@Test
	public void testPutConnectionProfileMultipleTimes() {
		ConnectionProfile connectionProfile = createJDOConnectionProfile();
		JDOConnectionProfileDTO profileDTO = new JDOConnectionProfileDTO();
		profileDTO.setProfileID(connectionProfile.getProfileID());
		ConnectionProfile connectionProfile2 = connectionProfileManager.putConnectionProfileDTO(profileDTO);
		Assert.assertSame(connectionProfile, connectionProfile2);
	}
	
	@Test
	public void testGetNotExistingConnectionProfile() {
		ConnectionProfile connectionProfile = connectionProfileManager.getConnectionProfile(UUID.randomUUID().toString());
		Assert.assertNull(connectionProfile);
	}

	@Test
	public void testGetExistingConnectionProfile() {
		ConnectionProfile connectionProfile = createJDOConnectionProfile();
		ConnectionProfile connectionProfile2 = connectionProfileManager.getConnectionProfile(connectionProfile.getProfileID());
		Assert.assertSame(connectionProfile, connectionProfile2);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetNotExistingConnectionProfileWithException() {
		connectionProfileManager.getConnectionProfile(UUID.randomUUID().toString(), true);
	}
	
	@Test
	public void testGetConnectionProfiles() {
		createJDOConnectionProfile();
		JDOConnectionProfileDTO profileDTO = new JDOConnectionProfileDTO();
		profileDTO.setProfileID(UUID.randomUUID().toString());
		connectionProfileManager.putConnectionProfileDTO(profileDTO);
		Collection<ConnectionProfile> connectionProfiles = connectionProfileManager.getConnectionProfiles();
		Assert.assertEquals(connectionProfiles.size(), 2);
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testGetConnectionProfilesReturnsUnmodifiableCollection() {
		createJDOConnectionProfile();
		Collection<ConnectionProfile> connectionProfiles = connectionProfileManager.getConnectionProfiles();
		Assert.assertEquals(connectionProfiles.size(), 1);
		connectionProfiles.clear();
	}
	
	private ConnectionProfile createJDOConnectionProfile() {
		JDOConnectionProfileDTO connectionProfileDTO = new JDOConnectionProfileDTO();
		configureDummyProfileDTO(connectionProfileDTO);
		ConnectionProfile connectionProfile = connectionProfileManager.putConnectionProfileDTO(connectionProfileDTO);
		return connectionProfile;
	}

	private ConnectionProfile createJPAConnectionProfile() {
		JPAConnectionProfileDTO connectionProfileDTO = new JPAConnectionProfileDTO();
		configureDummyProfileDTO(connectionProfileDTO);
		ConnectionProfile connectionProfile = connectionProfileManager.putConnectionProfileDTO(connectionProfileDTO);
		return connectionProfile;
	}
	
	private void configureDummyProfileDTO(ConnectionProfileDTO connectionProfileDTO) {
		connectionProfileDTO.setProfileID(UUID.randomUUID().toString());
	}
	
}
