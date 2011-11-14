package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import java.io.IOException;
import java.net.URLClassLoader;
import java.util.Map;
import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.JDOConnectionProfileDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.PropertiesUtil;

public class JDOConnectionProfile extends ConnectionProfile
{
	private PersistenceManagerFactory persistenceManagerFactory;

	@Override
	protected ConnectionProfileDTO newConnectionProfileDTO() {
		return new JDOConnectionProfileDTO();
	}

	@Override
	protected void onFirstConnectionOpen(Connection connection) {
		super.onFirstConnectionOpen(connection);

		URLClassLoader persistenceEngineClassLoader;
		try {
			persistenceEngineClassLoader = getClassLoaderManager().getPersistenceEngineClassLoader();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		Properties rawPersistenceProperties = PropertiesUtil.getProperties(getConnectionProperties(), PropertiesUtil.PREFIX_PERSISTENCE);
		Map<String, String> filteredPersistenceProperties = filterPersistenceProperties(rawPersistenceProperties);

		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

			String persistenceUnitName = getPersistenceUnitName();
			if (persistenceUnitName == null || persistenceUnitName.isEmpty())
				persistenceManagerFactory = JDOHelper.getPersistenceManagerFactory(filteredPersistenceProperties, persistenceEngineClassLoader);
			else
				persistenceManagerFactory = JDOHelper.getPersistenceManagerFactory(filteredPersistenceProperties, persistenceUnitName, persistenceEngineClassLoader);
		} finally {
			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
		}
	}

	@Override
	protected void onLastConnectionClose(Connection connection) {
		if (persistenceManagerFactory != null) {
			persistenceManagerFactory.close();
			persistenceManagerFactory = null;
		}
		super.onLastConnectionClose(connection);
	}

	public PersistenceManagerFactory getPersistenceManagerFactory() {
		return persistenceManagerFactory;
	}
}
