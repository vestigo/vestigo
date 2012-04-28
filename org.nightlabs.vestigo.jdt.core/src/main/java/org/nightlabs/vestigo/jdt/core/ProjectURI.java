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
package org.nightlabs.vestigo.jdt.core;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.nightlabs.util.IOUtil;
import org.nightlabs.util.Util;

public class ProjectURI implements Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String SCHEME = "project";
	public static final String SCHEME_PREFIX = SCHEME + ':';

	private String projectName;

	public ProjectURI(String projectName)
	{
		if (projectName == null)
			throw new IllegalArgumentException("projectName == null");

		this.projectName = projectName;
	}

	public ProjectURI(URI uri)
	{
		if (uri == null)
			throw new IllegalArgumentException("uri == null");

		if (!SCHEME.equals(uri.getScheme()))
			throw new IllegalArgumentException("uri scheme '" + uri.getScheme() + "' is unsupported! Should be '" + SCHEME + "' instead: " + uri);

		String encodedName = uri.getSchemeSpecificPart();
		try {
			this.projectName = URLDecoder.decode(encodedName, IOUtil.CHARSET_NAME_UTF_8);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	public String getProjectName() {
		return projectName;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		ProjectURI other = (ProjectURI) obj;
		return Util.equals(this.projectName, other.projectName);
	}

	public URI toURI() {
		try {
			return new URI(toString());
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String toString() {
		try {
			return SCHEME_PREFIX + URLEncoder.encode(projectName, IOUtil.CHARSET_NAME_UTF_8);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
}
