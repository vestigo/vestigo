package org.nightlabs.jjqb.childvm.webapp.model;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.MappedSuperclass;
import javax.persistence.Persistence;

import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;
import org.nightlabs.jjqb.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.dto.JPAConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.persistencexml.JPAPersistenceUnitHelper;
import org.nightlabs.jjqb.childvm.shared.persistencexml.PersistenceUnitHelper;
import org.nightlabs.jjqb.childvm.webapp.asm.ClassAnnotationReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPAConnectionProfile extends ConnectionProfile
{
	private static final Logger logger = LoggerFactory.getLogger(JPAConnectionProfile.class);

	private EntityManagerFactory entityManagerFactory;

	public static class Factory implements ConnectionProfileFactory {
		@Override
		public boolean canHandle(ConnectionProfileDTO connectionDTO) {
			return connectionDTO != null && JPAConnectionProfileDTO.class == connectionDTO.getClass();
		}
		@Override
		public ConnectionProfile createConnectionProfile() {
			return new JPAConnectionProfile();
		}
	}

	@Override
	protected ConnectionProfileDTO newConnectionProfileDTO() {
		return new JPAConnectionProfileDTO();
	}

	@Override
	protected void onFirstConnectionOpen(Connection connection)
	{
		super.onFirstConnectionOpen(connection);

		ClassLoader persistenceEngineClassLoader;
		try {
			persistenceEngineClassLoader = getClassLoaderManager().getPersistenceEngineClassLoader(null);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		String persistenceUnitName = getPersistenceUnitName();
		if (logger.isDebugEnabled()) {
			logger.debug("[{}].onFirstConnectionOpen: creating EntityManagerFactory with persistenceUnitName={}.", Long.toHexString(System.identityHashCode(this)), persistenceUnitName);
		}

		Map<String, String> filteredPersistenceProperties = null;
		if (persistenceUnitName == null || !isPersistenceUnitSyntheticOverride()) {
			Properties rawPersistenceProperties = PropertiesUtil.getProperties(getConnectionProperties(), PropertiesUtil.PREFIX_PERSISTENCE);
			filteredPersistenceProperties = filterPersistenceProperties(rawPersistenceProperties);
		}

		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

			if (filteredPersistenceProperties == null)
				entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
			else
				entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName, filteredPersistenceProperties);

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

	@Override
	protected PersistenceUnitHelper getPersistenceUnitHelper() {
		return new JPAPersistenceUnitHelper();
	}

	@Override
	protected boolean isQueryableCandidateClass(ClassAnnotationReader classAnnotationReader) {
		Set<String> classAnnotations = classAnnotationReader.getClassAnnotations();
		return classAnnotations.contains(Entity.class.getName()) || classAnnotations.contains(MappedSuperclass.class.getName());
	}
}