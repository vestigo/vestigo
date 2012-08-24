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
package org.nightlabs.vestigo.cumulus4j.childvm.webapp.model;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.nightlabs.util.IOUtil;
import org.nightlabs.vestigo.childvm.webapp.model.Connection;
import org.nightlabs.vestigo.cumulus4j.childvm.shared.Cumulus4jConnectionProperties;

public class Cumulus4jConnectionHelper
{
	public static final String PROPERTY_KEY_CRYPTO_SESSION_ID = "cumulus4j.cryptoSessionID";

	private Connection connection;

	public Cumulus4jConnectionHelper(Connection connection)
	{
		if (connection == null)
			throw new IllegalArgumentException("connection == null");

		if (!connection.isOpen())
			throw new IllegalArgumentException("connection.isOpen() returned false!");

		this.connection = connection;

		initLocalKeyStoreMessageBroker();
	}

	public Connection getConnection() {
		return connection;
	}

	private static Object invokeMethod(Object object, String methodName, Class<?> argumentType, Object argument)
			throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
		Method method = object.getClass().getMethod(methodName, argumentType);
		return method.invoke(object, argument);
	}

	public String cryptoSession_acquire()
	{
		// Unused, because of new LocalKeyStoreMessageBroker, but required and must have proper format:
		// "${cryptoSessionIDPrefix}*${serial}*${random1}"
		//
		// ${cryptoSessionIDPrefix} is: "${keyStoreID}_${random2}"
		// The ${cryptoSessionIDPrefix} is used for routing key-request-messages to the right key manager
		// and for determining the key-store-id.
		return "keyStoreID_random2*serial*random1";
	}

	public void cryptoSession_release() { }

	private Class<?> getKeyStoreClass() throws ClassNotFoundException {
		return Thread.currentThread().getContextClassLoader().loadClass("org.cumulus4j.keystore.KeyStore");
	}

	private Class<?> getMessageBrokerClass() throws ClassNotFoundException {
		return Thread.currentThread().getContextClassLoader().loadClass("org.cumulus4j.store.crypto.keymanager.messagebroker.MessageBroker");
	}

	private Object getKeyStore(String keyStoreID, String keyStoreDir) throws Exception
	{
		if (keyStoreID == null)
			throw new IllegalArgumentException("keyStoreID == null");

		File keyStoreDirFile = keyStoreDir == null ? new File(IOUtil.getUserHome(), ".cumulus4j") : new File(keyStoreDir);
		File keyStoreFile = new File(keyStoreDirFile, keyStoreID + ".keystore");

		if (!keyStoreFile.exists()) {
			throw new IllegalStateException(
					String.format(
							"keyStoreID='%s' or keyStoreDir='%s' wrong! keyStoreFile does not exist: %s",
							keyStoreID, keyStoreDir, keyStoreFile.getAbsolutePath()
					)
			);
		}

		Class<?> keyStoreClass = getKeyStoreClass();

		Constructor<?> constructor;
		try {
			constructor = keyStoreClass.getConstructor(String.class, File.class);
			return constructor.newInstance(keyStoreID, keyStoreFile);
		} catch (NoSuchMethodException e) {
			// backwards-compatibility (C4j before 1.0.2 had only 1 argument)
			try {
				constructor = keyStoreClass.getConstructor(File.class);
				return constructor.newInstance(keyStoreFile);
			} catch (NoSuchMethodException e2) {
				throw e; // we throw the original one for the new C4j.
			}
		}
	}

	private void initLocalKeyStoreMessageBroker()
	{
		Properties connectionProperties = connection.getConnectionProfile().getConnectionProperties();

		String keyStoreUserName = connectionProperties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_USER_NAME);
		char[] keyStorePassword = connectionProperties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_PASSWORD).toCharArray();
		String keyStoreID = connectionProperties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_ID);
		String keyStoreDir = connectionProperties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_DIR);

		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			ClassLoader persistenceEngineClassLoader = connection.getConnectionProfile().getClassLoaderManager().getPersistenceEngineClassLoader(null);
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

			Class<?> messageBrokerRegistryClass = persistenceEngineClassLoader.loadClass("org.cumulus4j.store.crypto.keymanager.messagebroker.MessageBrokerRegistry");
			Object messageBrokerRegistry = messageBrokerRegistryClass.getMethod("sharedInstance").invoke(null);

			Class<?> localKeyStoreMessageBrokerClass = persistenceEngineClassLoader.loadClass("org.cumulus4j.store.localkeystoremessagebroker.LocalKeyStoreMessageBroker");
			Object localKeyStoreMessageBroker = localKeyStoreMessageBrokerClass.newInstance();

			Object keyStore = getKeyStore(keyStoreID, keyStoreDir); // result never null
			invokeMethod(localKeyStoreMessageBroker, "setKeyStore", getKeyStoreClass(), keyStore);
			invokeMethod(localKeyStoreMessageBroker, "setUserName", String.class, keyStoreUserName);
			invokeMethod(localKeyStoreMessageBroker, "setPassword", char[].class, keyStorePassword);

			invokeMethod(messageBrokerRegistry, "setActiveMessageBroker", getMessageBrokerClass(), localKeyStoreMessageBroker);
		} catch (Exception e) {
			if (e instanceof RuntimeException)
				throw (RuntimeException)e;
			throw new RuntimeException(e);
		} finally {
			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
		}
	}
}
