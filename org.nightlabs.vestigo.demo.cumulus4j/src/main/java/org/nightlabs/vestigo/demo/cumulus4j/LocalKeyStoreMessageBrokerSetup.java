package org.nightlabs.vestigo.demo.cumulus4j;

import java.io.IOException;

import org.cumulus4j.store.crypto.keymanager.messagebroker.MessageBrokerRegistry;
import org.cumulus4j.store.localkeystoremessagebroker.LocalKeyStoreMessageBroker;

public class LocalKeyStoreMessageBrokerSetup {

	public static void init() {
		KeyStoreCreator keyStoreCreator = new KeyStoreCreator();
		try {
			keyStoreCreator.init();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		LocalKeyStoreMessageBroker messageBroker = new LocalKeyStoreMessageBroker();
		messageBroker.setKeyStore(keyStoreCreator.getKeyStore());
		messageBroker.setUserName(keyStoreCreator.getUserName());
		messageBroker.setPassword(keyStoreCreator.getPassword());
		MessageBrokerRegistry.sharedInstance().setActiveMessageBroker(messageBroker);
	}

}
