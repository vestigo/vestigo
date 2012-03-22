/**
 *
 */
package org.nightlabs.jjqb.childvm.webapp.model;

import org.nightlabs.jjqb.childvm.shared.dto.ConnectionProfileDTO;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public interface ConnectionProfileFactory {

	boolean canHandle(ConnectionProfileDTO connectionProfileDTO);

	ConnectionProfile createConnectionProfile();

}
