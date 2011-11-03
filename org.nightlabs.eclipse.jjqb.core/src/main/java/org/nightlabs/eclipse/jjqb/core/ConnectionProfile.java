package org.nightlabs.eclipse.jjqb.core;


import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.eclipse.jjqb.core.childvm.ChildVM;

public interface ConnectionProfile {

	String getProfileID();
	void setProfileID(String profileID);

	ChildVM getChildVM();
//	ClassLoaderManager getClassLoaderManager();

	void preConnectionOpen(Connection connection) throws OdaException;
	void postConnectionOpen(Connection connection) throws OdaException;

	void preConnectionClose(Connection connection) throws OdaException;
	void postConnectionClose(Connection connection) throws OdaException;

}
