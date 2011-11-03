package org.nightlabs.eclipse.jjqb.core.internal.childvm;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.nightlabs.util.IOUtil;

public class PathSegment extends RelativePathPart
{
	private String pathSegment;

	public PathSegment() { }

	public PathSegment(String pathSegment) {
		this.pathSegment = pathSegment;
	}

	public String getPathSegment() {
		return pathSegment;
	}
	public void setPathSegment(String pathSegment) {
		this.pathSegment = pathSegment;
	}

	@Override
	public String toString() {
		try {
			return URLEncoder.encode(pathSegment, IOUtil.CHARSET_NAME_UTF_8);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
}
