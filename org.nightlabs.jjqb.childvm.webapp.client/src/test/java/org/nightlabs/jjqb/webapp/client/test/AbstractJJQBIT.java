package org.nightlabs.jjqb.webapp.client.test;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.nightlabs.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.api.ChildVM;
import org.nightlabs.jjqb.childvm.webapp.client.ChildVMWebappClient;
import org.nightlabs.jjqb.childvm.webapp.client.testresources.sql.AbstractSetup;

public class AbstractJJQBIT {
	
	protected ChildVM client;
	protected Map<AbstractSetup, String> setups = new HashMap<AbstractSetup, String>();
	
	@Before
	public void acquireClient()
	{
		client = new ChildVMWebappClient("localhost", "/", 8080);
		Assert.assertTrue(client.isOnline());
	}
	
	
	@After
	public void closeAllConnectionsAndDeleteProfiles() {
		Collection<ConnectionDTO> connectionDTOs = client.getConnectionDTOs(null);
		for (ConnectionDTO connectionDTO : connectionDTOs) {
			client.deleteConnectionDTO(connectionDTO.getConnectionID());
		}
		Collection<ConnectionProfileDTO> connectionProfileDTOs = client.getConnectionProfileDTOs();
		for (ConnectionProfileDTO connectionProfileDTO : connectionProfileDTOs) {
		}
		
		for (Map.Entry<AbstractSetup, String> setupEntry : setups.entrySet()) {
			try {
				setupEntry.getKey().teardown(setupEntry.getValue());
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		setups.clear();
	}
	
	protected void setup(AbstractSetup setup, String name) {
		try {
			setup.setup(name);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		setups.put(setup, name);
	}

	
}
