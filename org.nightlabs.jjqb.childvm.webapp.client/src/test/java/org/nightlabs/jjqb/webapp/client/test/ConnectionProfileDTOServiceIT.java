/**
 * 
 */
package org.nightlabs.jjqb.webapp.client.test;

import java.util.Collection;
import java.util.UUID;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Test;
import org.nightlabs.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.JDOConnectionDTO;
import org.nightlabs.jjqb.childvm.shared.JDOConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.JPAConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.webapp.client.testresources.TestResourcesUtil;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public class ConnectionProfileDTOServiceIT extends AbstractJJQBIT {

	public ConnectionProfileDTOServiceIT() {
	}
	
	@Test
	public void testIsOnline() {
		Assert.assertTrue(client.isOnline());
	}
	
	@Test
	public void testPut() {
		JPAConnectionProfileDTO connectionProfileDTO = new JPAConnectionProfileDTO();
		connectionProfileDTO.setProfileID(UUID.randomUUID().toString());
		client.putConnectionProfileDTO(connectionProfileDTO);
		
		Collection<ConnectionProfileDTO> profileDTOs = client.getConnectionProfileDTOs();
		for (ConnectionProfileDTO profileDTO : profileDTOs) {
			Assert.assertEquals(connectionProfileDTO.getProfileID(), profileDTO.getProfileID());
		}
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
