package org.nightlabs.vestigo.childvm.webapp.model;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.SortedSet;

import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;
import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JDOConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.persistencexml.JDOPersistenceUnitHelper;
import org.nightlabs.vestigo.childvm.shared.persistencexml.PersistenceUnitHelper;
import org.nightlabs.vestigo.childvm.webapp.asm.ClassAnnotationReader;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.jdo.JDOHelper;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.jdo.PersistenceManager;
import org.nightlabs.vestigo.childvm.webapp.persistenceengine.jdo.PersistenceManagerFactory;
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
				new Object[] { Integer.toHexString(System.identityHashCode(this)), getProfileID(), connection.getConnectionID() });
		}

		ClassLoader persistenceEngineClassLoader;
		try {
			persistenceEngineClassLoader = getClassLoaderManager().getPersistenceEngineClassLoader(null);
			if (logger.isDebugEnabled()) {
				logger.debug("[{}].onFirstConnectionOpen: created persistenceEngineClassLoader.", Integer.toHexString(System.identityHashCode(this)));
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		String persistenceUnitName = getPersistenceUnitName();
		if (logger.isDebugEnabled()) {
			logger.debug("[{}].onFirstConnectionOpen: creating PersistenceManagerFactory with persistenceUnitName={}.", Integer.toHexString(System.identityHashCode(this)), persistenceUnitName);
		}

		Map<String, String> filteredPersistenceProperties = null;
		if (persistenceUnitName == null || !isPersistenceUnitSyntheticOverride()) {
			Properties rawPersistenceProperties = PropertiesUtil.getProperties(getConnectionProperties(), PropertiesUtil.PREFIX_PERSISTENCE);
			filteredPersistenceProperties = filterPersistenceProperties(rawPersistenceProperties);
		}

		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

			JDOHelper jdoHelper = new JDOHelper(getClassLoaderManager());

			if (persistenceUnitName == null)
				persistenceManagerFactory = jdoHelper.getPersistenceManagerFactory(filteredPersistenceProperties);
			else {
				if (persistenceUnitName.isEmpty())
					throw new IllegalStateException("persistenceUnitName.isEmpty() should never happen - it should be either null or a non-empty string!");

				if (filteredPersistenceProperties == null)
					persistenceManagerFactory = jdoHelper.getPersistenceManagerFactory(persistenceUnitName);
				else
					persistenceManagerFactory = jdoHelper.getPersistenceManagerFactory(filteredPersistenceProperties, persistenceUnitName);
			}

			if (logger.isDebugEnabled()) {
				logger.debug("[{}].onFirstConnectionOpen: created persistenceManagerFactory.", Integer.toHexString(System.identityHashCode(this)));
			}

			initialiseMetaDataForQueryableCandidateClasses();
		} finally {
			Thread.currentThread().setContextClassLoader(backupContextClassLoader);
		}
	}

	protected void initialiseMetaDataForQueryableCandidateClasses() {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		SortedSet<String> queryableCandidateClasses;
		try {
			queryableCandidateClasses = getQueryableCandidateClasses();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		PersistenceManager pm = getPersistenceManagerFactory().getPersistenceManager();
		try {
			for (String candidateClassName : queryableCandidateClasses) {
				logger.debug("[{}].initialiseMetaDataForQueryableCandidateClasses: Beginning to initialise meta data for: {}", Integer.toHexString(System.identityHashCode(this)), candidateClassName);
				try {
					Class<?> candidateClass = Class.forName(candidateClassName, true, classLoader);
					pm.getExtent(candidateClass);
					logger.info("[{}].initialiseMetaDataForQueryableCandidateClasses: Successfully initialised meta data for: {}", Integer.toHexString(System.identityHashCode(this)), candidateClassName);
				} catch (Exception x) {
					logger.warn("[" + Integer.toHexString(System.identityHashCode(this)) + "].initialiseMetaDataForQueryableCandidateClasses: Failed to initialise " + candidateClassName + ": " + x, x);
				} catch (NoClassDefFoundError x) {
					logger.warn("[" + Integer.toHexString(System.identityHashCode(this)) + "].initialiseMetaDataForQueryableCandidateClasses: Failed to initialise " + candidateClassName + ": " + x, x);
				}
			}
		} finally {
			pm.close();
		}
	}

	@Override
	protected void onLastConnectionClose(Connection connection) {
		if (persistenceManagerFactory != null) {
			persistenceManagerFactory.close();
			if (logger.isDebugEnabled()) {
				logger.debug("[{}].onLastConnectionClose: closed persistenceManagerFactory.", Integer.toHexString(System.identityHashCode(this)));
			}
			persistenceManagerFactory = null;
		}
		else {
			if (logger.isDebugEnabled()) {
				logger.debug("[{}].onLastConnectionClose: persistenceManagerFactory was null, nothing to close.", Integer.toHexString(System.identityHashCode(this)));
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
		return classAnnotationReader.getClassAnnotations().contains("javax.jdo.annotations.PersistenceCapable");
	}

	@Override
	protected String getConnectionDriverName() {
		return getConnectionProperties().getProperty(PropertiesUtil.PREFIX_PERSISTENCE + "javax.jdo.option.ConnectionDriverName");
	}
}
