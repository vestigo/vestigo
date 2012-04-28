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
package org.nightlabs.vestigo.cumulus4j.core.oda.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.nightlabs.vestigo.core.oda.ConnectionPropertyMeta;
import org.nightlabs.vestigo.core.oda.impl.AbstractConnectionProfile;
import org.nightlabs.vestigo.cumulus4j.childvm.shared.Cumulus4jConnectionProperties;
import org.nightlabs.vestigo.cumulus4j.core.resource.Messages;

public abstract class AbstractCumulus4jConnectionProfile extends AbstractConnectionProfile
{
	private static volatile Map<String, ConnectionPropertyMeta> propertyKey2ConnectionPropertyMeta;

	private static final String[] PROPERTY_KEYS = {
		Cumulus4jConnectionProperties.KEY_STORE_USER_NAME,
		Cumulus4jConnectionProperties.KEY_STORE_PASSWORD,
//		"test.0000",
//		"test.0001",
//		"test.0002",
//		"test.0003",
//		"test.0004",
//		"test.0005",
//		"test.0006",
//		"test.0007",
//		"test.0008",
//		"test.0009",
//		"test.0010",
//		"test.0011",
//		"test.0012",
//		"test.0013",
//		"test.0014",
//		"test.0015",
//		"test.0016",
//		"test.0017",
//		"test.0018",
//		"test.0019"
	};

	@Override
	protected String getWebAppName() {
		return "org.nightlabs.vestigo.cumulus4j.childvm.webapp"; //$NON-NLS-1$
	}

	@Override
	public Collection<String> getTransientConnectionPropertyKeys() {
		return Arrays.asList(PROPERTY_KEYS);
	}

	@Override
	public ConnectionPropertyMeta getConnectionPropertyMeta(String key) {
		// No need to add synchronized, because this code is thread-safe: It simply creates multiple instances of the map,
		// if multiple threads collide, which is cheap and no harm. Marco :-)
		Map<String, ConnectionPropertyMeta> map = propertyKey2ConnectionPropertyMeta;
		if (map == null) {
			map = new HashMap<String, ConnectionPropertyMeta>();
			for (String c4jKey : PROPERTY_KEYS)
				map.put(c4jKey, new ConnectionPropertyMeta(Messages.getString(c4jKey)));
			propertyKey2ConnectionPropertyMeta = map;
		}
		return map.get(key);
	}
}
