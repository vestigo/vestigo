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
package org.nightlabs.vestigo.childvm.shared.provider;

import javax.ws.rs.core.MediaType;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class MediaTypeConst
{
	public final static String APPLICATION_JAVA_NATIVE = "application/java-native"; //$NON-NLS-1$
	public static final MediaType APPLICATION_JAVA_NATIVE_TYPE = new MediaType("application", "java-native"); //$NON-NLS-1$ //$NON-NLS-2$

	protected MediaTypeConst() { }
}
