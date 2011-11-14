package org.nightlabs.jjqb.core.internal.childvm;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.nightlabs.util.IOUtil;

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
