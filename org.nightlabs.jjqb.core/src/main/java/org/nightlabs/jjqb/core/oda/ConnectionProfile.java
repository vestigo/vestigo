package org.nightlabs.jjqb.core.oda;

import java.util.Collection;
import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.childvm.shared.api.ChildVM;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public interface ConnectionProfile {

	String getProfileID();
	void setProfileID(String profileID);

	ChildVM getChildVM();

	void preConnectionOpen(Connection connection) throws OdaException;
	void postConnectionOpen(Connection connection) throws OdaException;

	void preConnectionClose(Connection connection) throws OdaException;
	void postConnectionClose(Connection connection) throws OdaException;

	Collection<String> getTransientConnectionPropertyKeys();

	ConnectionPropertyMeta getConnectionPropertyMeta(String key);

	Properties getPersistentConnectionProperties();
	Properties getTransientConnectionProperties();
}
