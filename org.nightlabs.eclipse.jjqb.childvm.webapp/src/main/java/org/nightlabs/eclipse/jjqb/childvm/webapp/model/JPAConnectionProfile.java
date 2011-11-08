package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import java.io.IOException;
import java.net.URLClassLoader;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.JPAConnectionProfileDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.PropertiesUtil;

public class JPAConnectionProfile extends ConnectionProfile
{
	private EntityManagerFactory entityManagerFactory;

	@Override
	protected ConnectionProfileDTO newConnectionProfileDTO() {
		return new JPAConnectionProfileDTO();
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

		Properties persistenceProperties = PropertiesUtil.getProperties(getConnectionProperties(), PropertiesUtil.PREFIX_PERSISTENCE);

		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

			entityManagerFactory = Persistence.createEntityManagerFactory(getPersistenceUnitName(), persistenceProperties);
		} finally {
			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
		}
	}

	@Override
	protected void onLastConnectionClose(Connection connection) {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
			entityManagerFactory = null;
		}
		super.onLastConnectionClose(connection);
	}

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
}
