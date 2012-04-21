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
