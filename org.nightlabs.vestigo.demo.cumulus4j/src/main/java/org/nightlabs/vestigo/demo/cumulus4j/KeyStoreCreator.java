package org.nightlabs.vestigo.demo.cumulus4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.cumulus4j.keystore.DateDependentKeyStrategy;
import org.cumulus4j.keystore.KeyStore;
import org.cumulus4j.keystore.KeyStoreNotEmptyException;

public class KeyStoreCreator {
	private KeyStore keyStore;
	private File keyStoreFile;
	private String userName;
	private char[] password;

	public File getKeyStoreFile() {
		return keyStoreFile;
	}

	public String getUserName() {
		return userName;
	}

	public char[] getPassword() {
		return password;
	}

	public KeyStore getKeyStore() {
		return keyStore;
	}

	protected void createReadme() throws IOException {
		File readmeFile = new File(keyStoreFile.getParentFile(), "README.txt");
		OutputStreamWriter w = new OutputStreamWriter(new FileOutputStream(readmeFile), "UTF-8");
		w.append("keyStoreID: ").append(getKeyStore().getKeyStoreID()).append('\n');
		w.append("userName: ").append(getUserName()).append('\n');
		w.append("password: ").append(new String(getPassword())).append('\n');
		w.close();
	}

	protected void createKeyStore() throws IOException {
		boolean initKeyStore = true;
		if (keyStoreFile.exists()) {
			System.out.println("Key store already exists. Will not override file: " + keyStoreFile.getAbsolutePath());
			initKeyStore = false;
		}

		keyStore = new KeyStore("demo", keyStoreFile);

		if (initKeyStore) {
			DateDependentKeyStrategy dateDependentKeyStrategy = new DateDependentKeyStrategy(keyStore);
			long keyActivityPeriodMSec = 10L * 1000L ;
			try {
				dateDependentKeyStrategy.init(getUserName(), getPassword(), keyActivityPeriodMSec, 100 * keyActivityPeriodMSec);
			} catch (KeyStoreNotEmptyException e) {
				throw new RuntimeException("We just deleted this file, wtf?!!! " + e, e);
			}
		}
	}

	public void init() throws IOException {
		File cumulus4jDir = new File("target", "cumulus4j");
		cumulus4jDir.mkdirs();
		keyStoreFile = new File(cumulus4jDir, "demo.keystore");
		userName = "demo";
		password = "password".toCharArray();
		createKeyStore();
		createReadme();
	}
}
