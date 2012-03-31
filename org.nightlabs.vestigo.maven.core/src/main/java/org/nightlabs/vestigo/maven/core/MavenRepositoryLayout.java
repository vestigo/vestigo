package org.nightlabs.vestigo.maven.core;

import java.util.Locale;

public enum MavenRepositoryLayout
{
	DEFAULT,
	LEGACY;

	public String toPOMString() {
		return name().toLowerCase(Locale.ENGLISH);
	}

	public static MavenRepositoryLayout fromPOMString(String pomString) {
		return MavenRepositoryLayout.valueOf(pomString.toUpperCase(Locale.ENGLISH));
	}

	@Override
	public String toString() {
		return toPOMString();
	}
}
