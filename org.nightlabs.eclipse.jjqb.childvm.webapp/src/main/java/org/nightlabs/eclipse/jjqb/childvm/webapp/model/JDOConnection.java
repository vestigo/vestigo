package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import javax.jdo.PersistenceManager;

import org.nightlabs.eclipse.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.JDOConnectionDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDOConnection
extends Connection
{
	private static final Logger logger = LoggerFactory.getLogger(JDOConnection.class);
	private PersistenceManager persistenceManager;

	@Override
	protected ConnectionDTO newConnectionDTO() {
		return new JDOConnectionDTO();
	}

	@Override
	public synchronized void open()
	{
		super.open();

		// create PersistenceManager
		if (persistenceManager == null) {
			JDOConnectionProfile connectionProfile = (JDOConnectionProfile) getConnectionProfile();
			persistenceManager = connectionProfile.getPersistenceManagerFactory().getPersistenceManager();
			persistenceManager.currentTransaction().begin();
		}
	}

	@Override
	public synchronized void close() {
		// rollback and close PersistenceManager
		if (persistenceManager != null) {
			try {
				persistenceManager.currentTransaction().rollback();
			} catch (Exception x) {
				logger.warn("close: persistenceManager.currentTransaction().rollback() failed: " + x, x);
			}
			try {
				persistenceManager.close();
			} catch (Exception x) {
				logger.warn("close: persistenceManager.close() failed: " + x, x);
			}
			persistenceManager = null;
		}

		super.close();
	}

	public PersistenceManager getPersistenceManager() {
		return persistenceManager;
	}
}
