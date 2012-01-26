package org.nightlabs.jjqb.childvm.webapp.model;

import java.io.IOException;
import java.net.URLClassLoader;
import java.util.Map;
import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.JDOConnectionProfileDTO;
import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOConnectionProfile extends ConnectionProfile
{
	
	private Logger logger = LoggerFactory.getLogger(JDOConnectionProfile.class);
	
	private PersistenceManagerFactory persistenceManagerFactory;

	@Override
	protected ConnectionProfileDTO newConnectionProfileDTO() {
		return new JDOConnectionProfileDTO();
	}

	@Override
	protected void onFirstConnectionOpen(Connection connection) {
		super.onFirstConnectionOpen(connection);
		
		if (logger.isDebugEnabled()) {
			logger.debug(
				"[{}].onFirstConnectionOpen: profileID={} connectionID={}.",
				new Object[] { Long.toHexString(System.identityHashCode(this)), getProfileID(), connection.getConnectionID() });
		}
		

		URLClassLoader persistenceEngineClassLoader;
		try {
			persistenceEngineClassLoader = getClassLoaderManager().getPersistenceEngineClassLoader();
			if (logger.isDebugEnabled()) {
				logger.debug("[{}].onFirstConnectionOpen: created persistenceEngineClassLoader.", Long.toHexString(System.identityHashCode(this)));
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		Properties rawPersistenceProperties = PropertiesUtil.getProperties(getConnectionProperties(), PropertiesUtil.PREFIX_PERSISTENCE);
		Map<String, String> filteredPersistenceProperties = filterPersistenceProperties(rawPersistenceProperties);

		ClassLoader backupContextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(persistenceEngineClassLoader);

			String persistenceUnitName = getPersistenceUnitName();
			if (logger.isDebugEnabled()) {
				logger.debug("[{}].onFirstConnectionOpen: creating persistenceManagerFactory with persistenceUnitName {}.", Long.toHexString(System.identityHashCode(this)), persistenceUnitName);
			}
			if (persistenceUnitName == null || persistenceUnitName.isEmpty()) {
				persistenceManagerFactory = JDOHelper.getPersistenceManagerFactory(filteredPersistenceProperties, persistenceEngineClassLoader);
			}
			else {
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
}
