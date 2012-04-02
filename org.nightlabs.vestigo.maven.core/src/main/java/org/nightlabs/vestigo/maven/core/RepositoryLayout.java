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
