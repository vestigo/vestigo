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
package org.nightlabs.vestigo.maven.core;

import java.util.Locale;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.nightlabs.vestigo.maven.core.RepositoryLayout.RepositoryLayoutAdapter;

@XmlJavaTypeAdapter(RepositoryLayoutAdapter.class)
public enum RepositoryLayout
{
	DEFAULT,
	LEGACY;

	public String toPOMString() {
		return name().toLowerCase(Locale.ENGLISH);
	}

	public static RepositoryLayout fromPOMString(String pomString) {
		return RepositoryLayout.valueOf(pomString.toUpperCase(Locale.ENGLISH));
	}

	@Override
	public String toString() {
		return toPOMString();
	}

	public static class RepositoryLayoutAdapter extends XmlAdapter<String, RepositoryLayout>
	{
		@Override
		public RepositoryLayout unmarshal(String v) throws Exception {
			return RepositoryLayout.fromPOMString(v);
		}

		@Override
		public String marshal(RepositoryLayout v) throws Exception {
			return v.toPOMString();
		}
	}
}
