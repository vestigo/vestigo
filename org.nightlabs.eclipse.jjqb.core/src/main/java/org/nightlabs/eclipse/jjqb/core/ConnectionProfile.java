package org.nightlabs.eclipse.jjqb.core;

import java.util.UUID;

import org.eclipse.datatools.connectivity.oda.OdaException;

public interface ConnectionProfile {

	UUID getProfileID();
	void setProfileID(UUID profileID);

	ClassLoaderManager getClassLoaderManager();

	void preConnectionOpen(Connection connection) throws OdaException;
	void postConnectionOpen(Connection connection) throws OdaException;

	void preConnectionClose(Connection connection) throws OdaException;
	void postConnectionClose(Connection connection) throws OdaException;

}
