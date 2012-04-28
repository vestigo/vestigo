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
package org.nightlabs.vestigo.childvm.webapp.client.testresources;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.nightlabs.util.IOUtil;
import org.nightlabs.vestigo.childvm.webapp.client.testresources.sql.DerbySetup;
import org.nightlabs.vestigo.childvm.webapp.client.testresources.sql.HSQLSetup;

public class TestResourcesUtil {

	public static Map<String, String> loadProperties(String name) {
		Properties props = new Properties();
		try {
			InputStream in = TestResourcesUtil.class.getClassLoader().getResource("vestigo-test-connection-props/" + name).openStream();
			InputStream propsInputStream;
			try {

				setDefaultProperties();

				ByteArrayOutputStream out = new ByteArrayOutputStream();
//				Map<String, String> vars = new HashMap<String, String>();
//				for (Entry<Object, Object> e : System.getProperties().entrySet()) {
//					vars.put((String)e.getKey(), (String)e.getValue());
//				}
				OutputStreamWriter writer = new OutputStreamWriter(out);
				IOUtil.replaceTemplateVariables(writer, new InputStreamReader(in), System.getProperties());
				writer.flush();
				out.flush();
				propsInputStream  = new ByteArrayInputStream(out.toByteArray());
			} finally {
				if (in != null)
					in.close();
			}
			props.load(propsInputStream);

			HashMap<String, String> result = new HashMap<String, String>(props.size());
			for (Entry<Object, Object> e : props.entrySet()) {
				result.put((String)e.getKey(), (String)e.getValue());
			}
			return result;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}


	private static void setDefaultProperties() {
		setSysProp("vestigoTest.jdbc.url.hsql", HSQLSetup.getDefaultJdbcUrl());
		setSysProp("vestigoTest.jdbc.driver.hsql", HSQLSetup.getDefaultJdbcDriver());

		setSysProp("vestigoTest.jdbc.url.derby", DerbySetup.getDefaultJdbcUrl());
		setSysProp("vestigoTest.jdbc.driver.derby", DerbySetup.getDefaultJdbcDriver());
	}


	private static void setSysProp(String name, String value) {
		String existingValue = System.getProperty(name);
		if (existingValue == null || existingValue.isEmpty()) {
			System.setProperty(name, value);
		}

	}
}
