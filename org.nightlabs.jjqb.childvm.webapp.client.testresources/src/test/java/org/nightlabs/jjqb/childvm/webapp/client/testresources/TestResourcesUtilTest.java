package org.nightlabs.jjqb.childvm.webapp.client.testresources;

import java.util.Map;

import junit.framework.Assert;

import org.junit.Test;

public class TestResourcesUtilTest {

	@Test
	public void testReplaceSystemVar() {
		Map<String, String> loadProperties = TestResourcesUtil.loadProperties("test-replace.properties");
		Assert.assertTrue(loadProperties.containsKey("test.property.user.dir"));
		Assert.assertFalse(loadProperties.get("test.property.user.dir").startsWith("$"));
	}
}
