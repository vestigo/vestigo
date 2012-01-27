package org.nightlabs.jjqb.cumulus4j.core.oda.impl;

import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.jjqb.core.oda.impl.AbstractConnectionProfile;
import org.nightlabs.jjqb.cumulus4j.childvm.shared.JPACumulus4jConnectionProfileDTO;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPACumulus4jConnectionProfileImpl
extends AbstractConnectionProfile
{
	@Override
	protected ConnectionProfileDTO newConnectionProfileDTO() {
		return new JPACumulus4jConnectionProfileDTO();
	}
}
