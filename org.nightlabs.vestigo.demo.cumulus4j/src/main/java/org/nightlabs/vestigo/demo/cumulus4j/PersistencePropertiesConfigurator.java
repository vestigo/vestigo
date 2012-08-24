package org.nightlabs.vestigo.demo.cumulus4j;

import java.util.Map;

public class PersistencePropertiesConfigurator {

	public static Map<String, Object> configure(Map<String, Object> properties) {
//		properties.put("datanucleus.storeManagerType", "cumulus4j");
//		properties.put("cumulus4j.cryptoManagerID", "keyManager");

		// Unused, but required and must have proper format:
		// "${cryptoSessionIDPrefix}*${serial}*${random1}"
		//
		// ${cryptoSessionIDPrefix} is: "${keyStoreID}_${random2}"
		// The ${cryptoSessionIDPrefix} is used for routing key-request-messages to the right key manager
		// and for determining the key-store-id.
		properties.put("cumulus4j.cryptoSessionID", "keyStoreID_random2*serial*random1");

		return properties;
	}

}
