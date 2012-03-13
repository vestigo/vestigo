package org.nightlabs.jjqb.jdt.core;

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

	public static final String PROTOCOL = "project";
	public static final String PROTOCOL_PREFIX = PROTOCOL + ':';

	private String projectName;

	public ProjectURI() { }

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

		if (!PROTOCOL.equals(uri.getScheme()))
			throw new IllegalArgumentException("uri scheme '" + uri.getScheme() + "' is unsupported! Should be '" + PROTOCOL + "' instead: " + uri);

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
	public void setProjectName(String projectName) {
		this.projectName = projectName;
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
			return PROTOCOL_PREFIX + URLEncoder.encode(projectName, IOUtil.CHARSET_NAME_UTF_8);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
}
