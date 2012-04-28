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
package org.nightlabs.vestigo.childvm.shared;

import java.util.Map;
import java.util.Properties;

import junit.framework.Assert;

import org.junit.Test;
import org.nightlabs.util.IOUtil;
import org.nightlabs.util.PropertiesUtil;

/**
 * Test for {@link PropertiesUtil#filterProperties(java.util.Map)}, {@link PropertiesUtil#isNullValue(java.util.Map, String)}
 * and other null-value-related utility-methods.
 * <p>
 * TODO This class must be pushed upstream into org.nightlabs.util as soon as mavenisation is complete and we have a test
 * directory there.
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class PropertiesUtilNullValueAndFilterTest
{
	@Test
	public void fromPropertyKeyToNullMetaAndBack() {
		String propKey = "some.key";
		String metaPropertyKeyNullValue = PropertiesUtil.getMetaPropertyKeyNullValue(propKey);
		System.out.println(propKey + " => " + metaPropertyKeyNullValue);
		Assert.assertNotNull(metaPropertyKeyNullValue);

		String refPropKey = PropertiesUtil.getReferencedPropertyKeyForMetaPropertyKey(metaPropertyKeyNullValue);
		System.out.println(metaPropertyKeyNullValue + " => " + refPropKey);
		Assert.assertEquals(propKey, refPropKey);
		Assert.assertTrue(metaPropertyKeyNullValue.endsWith(PropertiesUtil.SUFFIX_NULL_VALUE));
	}

	@Test
	public void filterPropertiesWithNullValuesWithoutVariables() {
		Properties rawProperties = new Properties();
		rawProperties.setProperty("a.key", "a.value");
		rawProperties.setProperty(PropertiesUtil.getMetaPropertyKeyNullValue("a.key"), Boolean.TRUE.toString());
		rawProperties.setProperty("b.key", "b.value");
		rawProperties.setProperty(PropertiesUtil.getMetaPropertyKeyNullValue("b.key"), Boolean.FALSE.toString());
		rawProperties.setProperty("c.key", "c.value");

		Properties rawPropertiesClone = (Properties) rawProperties.clone();

		Map<String, String> filteredProperties = PropertiesUtil.filterProperties(rawProperties);

		Assert.assertEquals("Input-argument 'rawProperties' was modified!", rawPropertiesClone, rawProperties);

		Assert.assertTrue(filteredProperties.containsKey("a.key"));
		Assert.assertFalse(filteredProperties.containsKey(PropertiesUtil.getMetaPropertyKeyNullValue("a.key")));
		Assert.assertNull(filteredProperties.get("a.key"));

		Assert.assertEquals("b.value", filteredProperties.get("b.key"));
		Assert.assertFalse(filteredProperties.containsKey(PropertiesUtil.getMetaPropertyKeyNullValue("b.key")));

		Assert.assertEquals("c.value", filteredProperties.get("c.key"));

		Assert.assertEquals(3, filteredProperties.size());
	}

	@Test
	public void filterPropertiesWithNullValuesWithVariables() {
		Properties rawProperties = new Properties();
		rawProperties.setProperty("a.key", "file:${java.io.tmpdir}/someDir/a");
		rawProperties.setProperty(PropertiesUtil.getMetaPropertyKeyNullValue("a.key"), Boolean.TRUE.toString());
		rawProperties.setProperty("b.key", "file:${java.io.tmpdir}/someDir/b");
		rawProperties.setProperty(PropertiesUtil.getMetaPropertyKeyNullValue("b.key"), Boolean.FALSE.toString());
		rawProperties.setProperty("c.key", "file:${java.io.tmpdir}/someDir/c");

		Properties rawPropertiesClone = (Properties) rawProperties.clone();

		Map<String, String> filteredProperties = PropertiesUtil.filterProperties(rawProperties, System.getProperties());

		Assert.assertEquals("Input-argument 'rawProperties' was modified!", rawPropertiesClone, rawProperties);

		Assert.assertTrue(filteredProperties.containsKey("a.key"));
		Assert.assertFalse(filteredProperties.containsKey(PropertiesUtil.getMetaPropertyKeyNullValue("a.key")));
		Assert.assertNull(filteredProperties.get("a.key"));

		Assert.assertEquals("file:" + IOUtil.getTempDir().getPath() + "/someDir/b", filteredProperties.get("b.key"));
		Assert.assertFalse(filteredProperties.containsKey(PropertiesUtil.getMetaPropertyKeyNullValue("b.key")));

		Assert.assertEquals("file:" + IOUtil.getTempDir().getPath() + "/someDir/c", filteredProperties.get("c.key"));

		Assert.assertEquals(3, filteredProperties.size());
	}
}
