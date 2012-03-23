/**
 *
 */
package org.nightlabs.vestigo.webapp.client.test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import junit.framework.Assert;

import org.junit.Test;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JPAConnectionProfileDTO;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public class ConnectionProfileDTOServiceIT extends AbstractVestigoIT {

	public ConnectionProfileDTOServiceIT() {
	}

	@Test
	public void testIsOnline() {
		Assert.assertTrue(client.isOnline());
	}

	@Test
	public void testPut() {
		// In real life, one child JVM only has 0 or 1 connection profile,
		// but in this test, there might be multiple (depending on the order of the test method
		// execution, which is random!), hence we excluse all old profiles from our test. Marco :-)
		Set<String> oldProfileIDs = new HashSet<String>();

		{
			Collection<ConnectionProfileDTO> profileDTOs = client.getConnectionProfileDTOs();
			for (ConnectionProfileDTO profileDTO : profileDTOs)
				oldProfileIDs.add(profileDTO.getProfileID());
		}

		JPAConnectionProfileDTO connectionProfileDTO = new JPAConnectionProfileDTO();
		connectionProfileDTO.setProfileID(UUID.randomUUID().toString());
		client.putConnectionProfileDTO(connectionProfileDTO);

		Collection<ConnectionProfileDTO> profileDTOs = client.getConnectionProfileDTOs();
		ConnectionProfileDTO found = null;
		for (ConnectionProfileDTO profileDTO : profileDTOs) {
			if (!oldProfileIDs.contains(profileDTO.getProfileID())) {
				Assert.assertEquals(connectionProfileDTO.getProfileID(), profileDTO.getProfileID());
				if (found != null)
					Assert.fail("There are multiple instances of ConnectionProfileDTO with the same profile ID!");

				found = profileDTO;
			}
		}

		Assert.assertNotNull("profileDTO not returned from server after being put!", found);
	}

	@Test
	public void testPutWithProperties() {
		JPAConnectionProfileDTO connectionProfileDTO = new JPAConnectionProfileDTO();
		String profileID = UUID.randomUUID().toString();
		connectionProfileDTO.setProfileID(profileID);
		connectionProfileDTO.getConnectionProperties().put("test-property", "test-value");
		client.putConnectionProfileDTO(connectionProfileDTO);

		ConnectionProfileDTO profileDTO = client.getConnectionProfileDTO(profileID);
		Assert.assertEquals(connectionProfileDTO.getProfileID(), profileDTO.getProfileID());
		Assert.assertEquals(connectionProfileDTO.getConnectionProperties(), connectionProfileDTO.getConnectionProperties());
//		getResource(client, ConnectionProfileDTO.class).put(connectionProfileDTO);
	}

	@Test
	public void testOverwriteOnMultiplePut() {
		JPAConnectionProfileDTO connectionProfileDTO = new JPAConnectionProfileDTO();
		String profileID = UUID.randomUUID().toString();
		connectionProfileDTO.setProfileID(profileID);
		connectionProfileDTO.getConnectionProperties().put("test-property1", "test-value");
		client.putConnectionProfileDTO(connectionProfileDTO);

		ConnectionProfileDTO profileDTO = client.getConnectionProfileDTO(profileID);
		Assert.assertEquals(connectionProfileDTO.getProfileID(), profileDTO.getProfileID());
		Assert.assertEquals(connectionProfileDTO.getConnectionProperties(), connectionProfileDTO.getConnectionProperties());

		connectionProfileDTO.getConnectionProperties().remove("test-property1");
		connectionProfileDTO.getConnectionProperties().put("test-property2", "test-value");
		client.putConnectionProfileDTO(connectionProfileDTO);

		profileDTO = client.getConnectionProfileDTO(profileID);
		Assert.assertTrue(profileDTO.getConnectionProperties().containsKey("test-property2"));
		Assert.assertFalse(profileDTO.getConnectionProperties().containsKey("test-property1"));
	}

}
