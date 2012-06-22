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
package org.nightlabs.vestigo.childvm.webapp.model;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JPAConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.persistencexml.JPAPersistenceUnitHelper;
import org.nightlabs.vestigo.childvm.shared.persistencexml.PersistenceUnitHelper;
import org.nightlabs.vestigo.childvm.webapp.asm.ClassAnnotationReader;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.jpa.EntityManagerFactory;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.jpa.Persistence;
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

			Persistence persistence = new Persistence(getClassLoaderManager());
			if (filteredPersistenceProperties == null)
				entityManagerFactory = persistence.createEntityManagerFactory(persistenceUnitName);
			else
				entityManagerFactory = persistence.createEntityManagerFactory(persistenceUnitName, filteredPersistenceProperties);

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
		return classAnnotations.contains("javax.persistence.Entity") || classAnnotations.contains("javax.persistence.MappedSuperclass");
	}

	@Override
	protected String getConnectionDriverName() {
		return getConnectionProperties().getProperty(PropertiesUtil.PREFIX_PERSISTENCE + "javax.persistence.jdbc.driver");
	}

	@Override
	protected boolean isPersistableField(Field field) {
		if ((field.getModifiers() & Modifier.TRANSIENT) != 0)
			return false;

		if (field.isAnnotationPresent(getAnnotationClass("javax.persistence.Transient")))
			return false;

		// TODO take other meta-data into account - not only annotations!
		// Note, that XML meta-data overrides annotations!!!
		return true;
	}
}
