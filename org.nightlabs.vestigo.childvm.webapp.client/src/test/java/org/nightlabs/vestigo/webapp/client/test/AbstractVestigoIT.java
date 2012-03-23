package org.nightlabs.vestigo.webapp.client.test;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.nightlabs.vestigo.childvm.shared.api.ChildVM;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.webapp.client.ChildVMWebappClient;
import org.nightlabs.vestigo.childvm.webapp.client.testresources.sql.AbstractSetup;

public class AbstractVestigoIT {

	protected ChildVM client;
	protected Map<AbstractSetup, String> setups = new HashMap<AbstractSetup, String>();

	@Before
	public void acquireClient()
	{
		client = new ChildVMWebappClient("localhost", null, 8080);
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
