/**
 *
 */
package org.nightlabs.vestigo.childvm.webapp.model;

import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public interface ConnectionProfileFactory {

	boolean canHandle(ConnectionProfileDTO connectionProfileDTO);

	ConnectionProfile createConnectionProfile();

}
