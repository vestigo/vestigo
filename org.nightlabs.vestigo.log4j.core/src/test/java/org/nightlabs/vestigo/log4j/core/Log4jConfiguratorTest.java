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
package org.nightlabs.vestigo.log4j.core;

import org.eclipse.core.internal.preferences.DefaultPreferences;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Log4jConfiguratorTest {

	@BeforeClass
	public static void beforeClass() {
		Log4jConfigurator.testPreferences = new DefaultPreferences();
	}

	@Test
	public void getEscapedPath() {
		String escapedFilePath = Log4jConfigurator.getEscapedFilePath("C:\\Some path with spaces\\sub 1\\sub2\\file.txt");
		Assert.assertEquals("C:\\\\Some path with spaces\\\\sub 1\\\\sub2\\\\file.txt", escapedFilePath);
	}
}
