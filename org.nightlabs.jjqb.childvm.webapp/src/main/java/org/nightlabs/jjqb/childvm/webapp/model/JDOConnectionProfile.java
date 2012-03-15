package org.nightlabs.jjqb.childvm.webapp.model;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.annotations.PersistenceCapable;

import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;
import org.nightlabs.jjqb.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.dto.JDOConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.persistencexml.JDOPersistenceUnitHelper;
import org.nightlabs.jjqb.childvm.shared.persistencexml.PersistenceUnitHelper;
import org.nightlabs.jjqb.childvm.webapp.asm.ClassAnnotationReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOConnectionProfile extends ConnectionProfile
{
	private Logger logger = LoggerFactory.getLogger(JDOConnectionProfile.class);

	public static class Factory implements ConnectionProfileFactory {
		@Override
		public boolean canHandle(ConnectionProfileDTO connectionDTO) {
			return connectionDTO != null && JDOConnectionProfileDTO.class == connectionDTO.getClass();
		}
		@Override
		public ConnectionProfile createConnectionProfile() {
			return new JDOConnectionProfile();
		}
	}

	private PersistenceManagerFactory persistenceManagerFactory;

	@Override
	protected ConnectionProfileDTO newConnectionProfileDTO() {
		return new JDOConnectionProfileDTO();
	}

	@Override
	protected void onFirstConnectionOpen(Connection connection)
	{
		super.onFirstConnectionOpen(connection);

		if (logger.isDebugEnabled()) {
			logger.debug(
				"[{}].onFirstConnectionOpen: profileID={} connectionID={}.",
				new Object[] { Long.toHexString(System.identityHashCode(this)), getProfileID(), connection.getConnectionID() });
		}

		ClassLoader persistenceEngineClassLoader;
		try {
			persistenceEngineClassLoader = getClassLoaderManager().getPersistenceEngineClassLoader(null);
			if (logger.isDebugEnabled()) {
				logger.debug("[{}].onFirstConnectionOpen: created persistenceEngineClassLoader.", Long.toHexString(System.identityHashCode(this)));
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		String persistenceUnitName = getPersistenceUnitName();
		if (logger.isDebugEnabled()) {
			logger.debug("[{}].onFirstConnectionOpen: creating PersistenceManagerFactory with persistenceUnitName={}.", Long.toHexString(System.identityHashCode(this)), persistenceUnitName);
		}

		Map<String, String> filteredPersistenceProperties = null;
		if (persistenceUnitName == null || !isPersistenceUnitSyntheticOverride()) {
			Properties rawPersistenceProperties = PropertiesUtil.getProperties(getConnectionProperties(), PropertiesUtil.PREFIX_PERSISTENCE);
			filteredPersistenceProperties = filterPersistenceProperties(rawPersistenceProperties);
		}

		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

			if (persistenceUnitName == null)
				persistenceManagerFactory = JDOHelper.getPersistenceManagerFactory(filteredPersistenceProperties, persistenceEngineClassLoader);
			else {
				if (persistenceUnitName.isEmpty())
					throw new IllegalStateException("persistenceUnitName.isEmpty() should never happen - it should be either null or a non-empty string!");

				if (filteredPersistenceProperties == null)
					persistenceManagerFactory = JDOHelper.getPersistenceManagerFactory(persistenceUnitName, persistenceEngineClassLoader);
				else
					persistenceManagerFactory = JDOHelper.getPersistenceManagerFactory(filteredPersistenceProperties, persistenceUnitName, persistenceEngineClassLoader);
			}

			if (logger.isDebugEnabled()) {
				logger.debug("[{}].onFirstConnectionOpen: created persistenceManagerFactory.", Long.toHexString(System.identityHashCode(this)));
			}
		} finally {
			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
		}
	}

	@Override
	protected void onLastConnectionClose(Connection connection) {
		if (persistenceManagerFactory != null) {
			persistenceManagerFactory.close();
			if (logger.isDebugEnabled()) {
				logger.debug("[{}].onLastConnectionClose: closed persistenceManagerFactory.", Long.toHexString(System.identityHashCode(this)));
			}
			persistenceManagerFactory = null;
		}
		else {
			if (logger.isDebugEnabled()) {
				logger.debug("[{}].onLastConnectionClose: persistenceManagerFactory was null, nothing to close.", Long.toHexString(System.identityHashCode(this)));
			}
		}
		super.onLastConnectionClose(connection);
	}

	public PersistenceManagerFactory getPersistenceManagerFactory() {
		return persistenceManagerFactory;
	}

	@Override
	protected PersistenceUnitHelper getPersistenceUnitHelper() {
		return new JDOPersistenceUnitHelper();
	}

	@Override
	protected boolean isQueryableCandidateClass(ClassAnnotationReader classAnnotationReader) {
		return classAnnotationReader.getClassAnnotations().contains(PersistenceCapable.class.getName());
	}
}
