/**
 *
 */
package org.nightlabs.jjqb.childvm.webapp.model;

import org.nightlabs.jjqb.childvm.shared.dto.ConnectionDTO;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public interface ConnectionFactory {

	boolean canHandle(ConnectionDTO connectionDTO);

	Connection createConnection();

}
