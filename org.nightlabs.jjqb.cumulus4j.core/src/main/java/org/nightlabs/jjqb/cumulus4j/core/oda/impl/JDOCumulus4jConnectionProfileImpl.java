package org.nightlabs.jjqb.cumulus4j.core.oda.impl;

import org.nightlabs.jjqb.childvm.shared.ConnectionProfileDTO;
import org.nightlabs.jjqb.core.oda.JDOConnectionProfile;
import org.nightlabs.jjqb.core.oda.impl.AbstractConnectionProfile;
import org.nightlabs.jjqb.cumulus4j.childvm.shared.JDOCumulus4jConnectionProfileDTO;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOCumulus4jConnectionProfileImpl
extends AbstractConnectionProfile
implements JDOConnectionProfile
{
	@Override
	protected String getWebAppName() {
		return "org.nightlabs.jjqb.cumulus4j.childvm.webapp";
	}

	@Override
	protected ConnectionProfileDTO newConnectionProfileDTO() {
		return new JDOCumulus4jConnectionProfileDTO();
	}
}
