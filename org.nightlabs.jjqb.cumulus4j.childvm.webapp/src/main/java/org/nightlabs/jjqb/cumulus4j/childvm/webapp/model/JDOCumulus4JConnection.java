/**
 * 
 */
package org.nightlabs.jjqb.cumulus4j.childvm.webapp.model;

import org.nightlabs.jjqb.childvm.webapp.model.Connection;
import org.nightlabs.jjqb.childvm.webapp.model.ConnectionFactory;
import org.nightlabs.jjqb.childvm.webapp.model.JDOConnection;
import org.nightlabs.jjqb.childvm.shared.ConnectionDTO;
import org.nightlabs.jjqb.cumulus4j.childvm.shared.JDOCumulus4JConnectionDTO;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public class JDOCumulus4JConnection extends JDOConnection {
	
	public static class Factory implements ConnectionFactory {

		public boolean canHandle(ConnectionDTO connectionDTO) {
			return connectionDTO != null && connectionDTO.getClass() == JDOCumulus4JConnectionDTO.class;
		}

		public Connection createConnection() {
			return new JDOCumulus4JConnection();
		}
		
	}

	public JDOCumulus4JConnection() {
	}

}
