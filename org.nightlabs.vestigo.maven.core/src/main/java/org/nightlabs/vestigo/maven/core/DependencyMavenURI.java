package org.nightlabs.vestigo.maven.core;

import java.net.URI;

import org.nightlabs.util.Util;

public class DependencyMavenURI extends MavenURI
{
	private static final long serialVersionUID = 1L;

	private String scope;

	public DependencyMavenURI(String... segments) {
		super(segments);
	}

	public DependencyMavenURI(URI uri) {
		super(uri);
	}

	public String getScope() {
		return scope;
	}

	@Override
	protected void init(String... segments) {
		String[] segmentsWithoutScope = new String[segments.length - 1];
		for (int i = 0; i < segmentsWithoutScope.length; i++)
			segmentsWithoutScope[i] = segments[i];

		super.init(segmentsWithoutScope);

		scope = segments[segments.length - 1];
	}

	@Override
	public int hashCode() {
		return super.hashCode() * 31 + ((scope == null) ? 0 : scope.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) && Util.equals(scope, ((DependencyMavenURI)obj).getScope()); // we can cast obj to DependencyMavenURI safely, because if the class does not match, super.equals(...) already returns false and the part after '&&' is not evaluated.
	}

	@Override
	public String toString() {
		return super.toString() + ':' + scope;
	}
}
