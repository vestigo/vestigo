/**
 *
 */
package org.nightlabs.jjqb.cumulus4j.childvm.webapp.model;

import org.nightlabs.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.jjqb.childvm.webapp.model.Connection;
import org.nightlabs.jjqb.childvm.webapp.model.ConnectionFactory;
import org.nightlabs.jjqb.childvm.webapp.model.JPAConnection;
import org.nightlabs.jjqb.cumulus4j.childvm.shared.JPACumulus4jConnectionDTO;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPACumulus4jConnection extends JPAConnection
{
	public static class Factory implements ConnectionFactory {

		@Override
		public boolean canHandle(ConnectionDTO connectionDTO) {
			return connectionDTO != null && connectionDTO.getClass() == JPACumulus4jConnectionDTO.class;
		}

		@Override
		public Connection createConnection() {
			return new JPACumulus4jConnection();
		}

	}
}
