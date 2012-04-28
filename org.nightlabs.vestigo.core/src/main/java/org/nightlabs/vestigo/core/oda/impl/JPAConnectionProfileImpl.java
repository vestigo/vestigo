/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.core.oda.impl;

import org.nightlabs.vestigo.childvm.shared.dto.ConnectionProfileDTO;
import org.nightlabs.vestigo.childvm.shared.dto.JPAConnectionProfileDTO;
import org.nightlabs.vestigo.core.oda.JPAConnectionProfile;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPAConnectionProfileImpl
extends AbstractConnectionProfile
implements JPAConnectionProfile
{
	@Override
	protected String getWebAppName() {
		return "org.nightlabs.vestigo.childvm.webapp";
	}

	@Override
	protected ConnectionProfileDTO newConnectionProfileDTO() {
		return new JPAConnectionProfileDTO();
	}
}
