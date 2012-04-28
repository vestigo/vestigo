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
package org.nightlabs.vestigo.childvm.webapp.client.internal;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.nightlabs.util.IOUtil;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryParameter extends RelativePathPart
{
	private String key;
	private String value;

	public QueryParameter() { }

	public QueryParameter(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		try {
			return (
					(key == null ? "" : URLEncoder.encode(key, IOUtil.CHARSET_NAME_UTF_8))
					+ '='
					+ (value == null ? "" : URLEncoder.encode(value, IOUtil.CHARSET_NAME_UTF_8))
			);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
}
