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
package org.nightlabs.vestigo.core.childprocess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.nightlabs.util.IOUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.icu.util.StringTokenizer;

public class CommandParser {

	private static final Logger logger = LoggerFactory.getLogger(CommandParser.class);

	private Map<String, String> properties = new HashMap<String, String>();

	public Map<String, String> getProperties() {
		return properties;
	}

	private boolean systemPropertiesEnabled = true;

	public boolean isSystemPropertiesEnabled() {
		return systemPropertiesEnabled;
	}
	public void setSystemPropertiesEnabled(boolean systemPropertiesEnabled) {
		this.systemPropertiesEnabled = systemPropertiesEnabled;
	}

	protected String filter(String command) {
		Map<?, ?> props;
		if (properties.isEmpty() && systemPropertiesEnabled)
			props = System.getProperties();
		else if (!properties.isEmpty() && !systemPropertiesEnabled)
			props = properties;
		else {
			Map<Object, Object> m = new HashMap<Object, Object>(properties.size() + System.getProperties().size());
			m.putAll(System.getProperties());
			m.putAll(properties); // our properties have a higher priority and must thus be put afterwards to override sysprops.
			props = m;
		}
		return IOUtil.replaceTemplateVariables(command, props);
	}

	public String[] parse(final String command)
	{
		final String filteredCommand;
		if (!properties.isEmpty() || systemPropertiesEnabled)
			filteredCommand = filter(command);
		else
			filteredCommand = command;

		StringTokenizer st = new StringTokenizer(filteredCommand, " \"\'", true); //$NON-NLS-1$
		List<String> result = new ArrayList<String>();
		boolean isInDoubleQuotes = false;
		boolean isInSingleQuotes = false;
		StringBuilder current = new StringBuilder();
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			if (" ".equals(token)) { //$NON-NLS-1$
				if (isInDoubleQuotes || isInSingleQuotes)
					current.append(token);
				else {
					String cs = current.toString();
					if (!cs.isEmpty()) {
						result.add(cs);
						current.setLength(0);
					}
				}
			}
			else if ("\"".equals(token)) { //$NON-NLS-1$
				if (isInSingleQuotes)
					current.append(token);
				else {
					if (isInDoubleQuotes) {
						result.add(current.toString());
						current.setLength(0);
					}
					isInDoubleQuotes = !isInDoubleQuotes;
				}
			}
			else if ("\'".equals(token)) { //$NON-NLS-1$
				if (isInDoubleQuotes)
					current.append(token);
				else {
					if (isInSingleQuotes) {
						result.add(current.toString());
						current.setLength(0);
					}
					isInSingleQuotes = !isInSingleQuotes;
				}
			}
			else
				current.append(token);
		}

		String cs = current.toString();
		if (!cs.isEmpty()) {
			result.add(cs);
			current.setLength(0);
		}

		logger.debug("parse: input: {}", command); //$NON-NLS-1$
		if (logger.isTraceEnabled()) {
			logger.trace("parse: filtered: {}", filteredCommand); //$NON-NLS-1$
			logger.trace("parse: result:"); //$NON-NLS-1$
			for (String r : result)
				logger.trace("parse:   * {}", r); //$NON-NLS-1$
		}

		return result.toArray(new String[result.size()]);
	}
}
