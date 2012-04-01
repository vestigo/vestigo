package org.nightlabs.vestigo.maven.core;

import java.util.Locale;

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
}
