package org.nightlabs.jjqb.cumulus4j.childvm.webapp.model;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.nightlabs.jjqb.childvm.webapp.model.Connection;
import org.nightlabs.jjqb.childvm.webapp.model.ConnectionProfileManager;
import org.nightlabs.jjqb.cumulus4j.childvm.shared.Cumulus4jConnectionProperties;

public class Cumulus4jConnectionHelper
{
	public static final String PROPERTY_KEY_CRYPTO_SESSION_ID = "cumulus4j.cryptoSessionID";

	private Connection connection;

	private Object cryptoSession;
	private Method method_cryptoSession_acquire;
	private Method method_cryptoSession_release;


	private static Object invokeMethod(Object object, String methodName, Object argument)
			throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
		if (argument == null)
			throw new IllegalArgumentException("argument == null");

		return invokeMethod(object, methodName, argument.getClass(), argument);
	}

	private static Object invokeMethod(Object object, String methodName, Class<?> argumentType, Object argument)
			throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
		Method method = object.getClass().getMethod(methodName, argumentType);
		return method.invoke(object, argument);
	}

	public String cryptoSession_acquire()
	{
		// String cryptoSessionID = cryptoSession.acquire();
		// try {
		//
		//	 accessDataStore(cryptoSessionID);
		//
		// } finally {
		// 	 cryptoSession.release();
		// }

		Object cryptoSession = this.cryptoSession;
		if (cryptoSession == null)
			throw new IllegalStateException("cryptoSession == null");

		try {
			return (String) method_cryptoSession_acquire.invoke(cryptoSession);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			wrapInRuntimeException(e);
			throw new IllegalStateException("WTF! wrapInRuntimeException(...) should have thrown an exception!!!");
		}
	}

	public void cryptoSession_release()
	{
		Object cryptoSession = this.cryptoSession;
		if (cryptoSession == null)
			throw new IllegalStateException("cryptoSession == null");

		try {
			method_cryptoSession_release.invoke(cryptoSession);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			wrapInRuntimeException(e);
		}
	}

	private void wrapInRuntimeException(InvocationTargetException e) {
		if (e.getMessage() == null) {
			Throwable cause = e.getCause();
			while (cause != null) {
				if (cause.getMessage() != null)
					throw new RuntimeException(cause.getMessage(), e);

				cause = cause.getCause();
			}
		}
		throw new RuntimeException(e);
	}

	public Cumulus4jConnectionHelper(Connection connection)
	{
		if (connection == null)
			throw new IllegalArgumentException("connection == null");

		if (!connection.isOpen())
			throw new IllegalArgumentException("connection.isOpen() returned false!");

		this.connection = connection;

		initKeyManagerAPI();
	}

	private void initKeyManagerAPI()
	{
		String keyManagerBackWebAppURL = ConnectionProfileManager.sharedInstance().getBaseURL();

		if (keyManagerBackWebAppURL == null)
			throw new IllegalStateException("ConnectionProfileManager.sharedInstance().getBaseURL() returned null!");

		if (!keyManagerBackWebAppURL.endsWith("/"))
			throw new IllegalStateException("URL returned by ConnectionProfileManager.sharedInstance().getBaseURL() does not end with '/'!");

		keyManagerBackWebAppURL += "org.cumulus4j.keymanager.back.webapp";

		Properties connectionProperties = connection.getConnectionProfile().getConnectionProperties();

		String keyStoreUserName = connectionProperties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_USER_NAME);
		char[] keyStorePassword = connectionProperties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_PASSWORD).toCharArray();
		String keyStoreID = connectionProperties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_ID);
		String keyStoreDir = connectionProperties.getProperty(Cumulus4jConnectionProperties.KEY_STORE_DIR);

		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			ClassLoader persistenceEngineClassLoader = connection.getConnectionProfile().getClassLoaderManager().getPersistenceEngineClassLoader(null);
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

			// KeyManagerAPIConfiguration configuration = new KeyManagerAPIConfiguration();
			// configuration.setAuthUserName(KEY_STORE_USER);
			// configuration.setAuthPassword(KEY_STORE_PASSWORD);
			// configuration.setKeyStoreID("test-" + Long.toString(System.currentTimeMillis(), 36) + '-' + Long.toString(random.nextLong(), 36));
			// configuration.setKeyManagerBaseURL(keyStoreDir.toURI().toString());

			Class<?> keyManagerAPIConfigurationClass = persistenceEngineClassLoader.loadClass("org.cumulus4j.keymanager.api.KeyManagerAPIConfiguration");
			Object keyManagerAPIConfiguration = keyManagerAPIConfigurationClass.newInstance();
			invokeMethod(keyManagerAPIConfiguration, "setAuthUserName", String.class, keyStoreUserName);
			invokeMethod(keyManagerAPIConfiguration, "setAuthPassword", char[].class, keyStorePassword);
			invokeMethod(keyManagerAPIConfiguration, "setKeyStoreID", String.class, keyStoreID);

			if (keyStoreDir != null) {
				String keyManagerBaseURL = new File(keyStoreDir).toURI().toURL().toString();
				invokeMethod(keyManagerAPIConfiguration, "setKeyManagerBaseURL", String.class, keyManagerBaseURL);
			}


			// KeyManagerAPI keyManagerAPI = new DefaultKeyManagerAPI();
			// keyManagerAPI.setConfiguration(configuration);
			Class<?> defaultKeyManagerAPIClass = persistenceEngineClassLoader.loadClass("org.cumulus4j.keymanager.api.DefaultKeyManagerAPI");
			Object keyManagerAPI = defaultKeyManagerAPIClass.newInstance();
			invokeMethod(keyManagerAPI, "setConfiguration", keyManagerAPIConfiguration);

			// CryptoSession cryptoSession = keyManagerAPI.getCryptoSession(keyManagerBackWebAppURL);
			cryptoSession = invokeMethod(keyManagerAPI, "getCryptoSession", String.class, keyManagerBackWebAppURL);
			method_cryptoSession_acquire = cryptoSession.getClass().getMethod("acquire");
			method_cryptoSession_release = cryptoSession.getClass().getMethod("release");

		} catch (Exception e) {
			if (e instanceof RuntimeException)
				throw (RuntimeException)e;
			throw new RuntimeException(e);
		} finally {
			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
		}
	}
}
