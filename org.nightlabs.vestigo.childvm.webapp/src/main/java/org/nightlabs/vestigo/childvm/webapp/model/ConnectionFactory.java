/**
 *
 */
package org.nightlabs.vestigo.childvm.webapp.model;

import org.nightlabs.vestigo.childvm.shared.dto.ConnectionDTO;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public interface ConnectionFactory {

	boolean canHandle(ConnectionDTO connectionDTO);

	Connection createConnection();

}
