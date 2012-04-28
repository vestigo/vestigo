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
public class PathSegment extends RelativePathPart
{
	private String pathSegment;

	public PathSegment() { }

	public PathSegment(String pathSegment) {
		this.pathSegment = pathSegment;
	}

	/**
	 * Create a <code>PathSegment</code> with a <code>String</code>-representable object.
	 * The object must be able to be used as path-segment according to REST rules. This means,
	 * it must have a single-<code>String</code>-constructor or a <code>valueOf(String)</code> method
	 * and its {@link Object#toString() toString()} method must produce a <code>String</code> which is
	 * parseable.
	 * @param pathSegment the object to be converted into a <code>String</code> (via {@link Object#toString()}).
	 */
	public PathSegment(Object pathSegment) {
		this.pathSegment = pathSegment == null ? null : pathSegment.toString();
	}

	public String getPathSegment() {
		return pathSegment;
	}
	public void setPathSegment(String pathSegment) {
		this.pathSegment = pathSegment;
	}

	@Override
	public String toString()
	{
		String ps = pathSegment;
		if (ps == null)
			return "";

		try {
			return URLEncoder.encode(ps, IOUtil.CHARSET_NAME_UTF_8);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
}
