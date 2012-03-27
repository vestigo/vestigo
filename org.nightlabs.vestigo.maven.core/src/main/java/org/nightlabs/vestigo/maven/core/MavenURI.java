package org.nightlabs.vestigo.maven.core;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.nightlabs.util.IOUtil;
import org.nightlabs.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MavenURI implements Serializable
{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(MavenURI.class);

//	mschulze@ganesha:~/workspaces/vestigo.2/org.nightlabs.vestigo.cumulus4j.childvm.webapp$ mvn org.apache.maven.plugins:maven-dependency-plugin:2.4:resolve
//	[INFO] Scanning for projects...
//	[INFO]
//	[INFO] ------------------------------------------------------------------------
//	[INFO] Building org.nightlabs.vestigo.cumulus4j.childvm.webapp 0.2.0-SNAPSHOT
//	[INFO] ------------------------------------------------------------------------
//	[INFO]
//	[INFO] --- maven-dependency-plugin:2.4:resolve (default-cli) @ org.nightlabs.vestigo.cumulus4j.childvm.webapp ---
//	[INFO]
//	[INFO] The following files have been resolved:
//	[INFO]    org.eclipse.persistence:javax.persistence:jar:2.0.0:provided
//	[INFO]    junit:junit:jar:4.10:test
//	[INFO]    org.slf4j:slf4j-api:jar:1.6.1:provided
//	[INFO]    org.nightlabs.vestigo:org.nightlabs.vestigo.childvm.webapp:jar:tests:0.2.0-SNAPSHOT:compile
//	[INFO]    org.hamcrest:hamcrest-core:jar:1.1:test
//	[INFO]    log4j:log4j:jar:1.2.16:compile
//	[INFO]    org.nightlabs.vestigo:org.nightlabs.vestigo.childvm.webapp:war:0.2.0-SNAPSHOT:compile
//	[INFO]    org.nightlabs.vestigo:org.nightlabs.vestigo.childvm.webapp:jar:jar:0.2.0-SNAPSHOT:provided
//	[INFO]    org.nightlabs.vestigo:org.nightlabs.vestigo.childvm.shared:jar:0.2.0-SNAPSHOT:compile
//	[INFO]    org.slf4j:slf4j-log4j12:jar:1.6.1:compile
//	[INFO]    org.slf4j:jul-to-slf4j:jar:1.6.1:compile
//	[INFO]    org.nightlabs:org.nightlabs.util:jar:1.3.0-SNAPSHOT:compile
//	[INFO]    javax.jdo:jdo-api:jar:3.1-SNAPSHOT-20110926:provided
//	[INFO]    javax.servlet:servlet-api:jar:2.5:provided
//	[INFO]    com.sun.jersey:jersey-core:jar:1.9:compile
//	[INFO]    javax.transaction:transaction-api:jar:1.1:provided
//	[INFO]    org.nightlabs:org.nightlabs.progress:jar:1.3.0-SNAPSHOT:compile
//	[INFO]    org.slf4j:jcl-over-slf4j:jar:1.6.1:compile
//	[INFO]    asm:asm:jar:3.1:compile
//	[INFO]    com.sun.jersey:jersey-server:jar:1.9:compile
//	[INFO]    org.nightlabs.vestigo:org.nightlabs.vestigo.cumulus4j.childvm.shared:jar:0.2.0-SNAPSHOT:compile
//
// We're using the syntax (i.e. order) from the above command, i.e. groupId:artifactId[:type[:classifier]]:version
// We do *not* use the scope at the end - only the first 5 fields. Note, that the optional classifier might be missing
// entirely (not an empty "::", but no colon for it at all). This is the case for most of them - ONLY the one line
//
// >>> org.nightlabs.vestigo:org.nightlabs.vestigo.childvm.webapp:jar:tests:0.2.0-SNAPSHOT:compile <<<
//
// has all fields and the classifier "tests" is in the middle :-(
//
// We thus parse it using the assumption that the version must exist and is always the last part.

	public static final String SCHEME = "maven";
	public static final String SCHEME_PREFIX = SCHEME + ':';
	public static final String SYNTAX = SCHEME_PREFIX + "groupId:artifactId[:type[:classifier]]:version";
	public static final String DEFAULT_TYPE = "jar";

	private String groupId;
	private String artifactId;
	private String type;
	private String classifier;
	private String version;

	public MavenURI(String ... segments)
	{
		init(segments);
	}

	public MavenURI(URI uri)
	{
		if (uri == null)
			throw new IllegalArgumentException("uri == null");

		if (!SCHEME.equals(uri.getScheme()))
			throw new IllegalArgumentException("uri scheme '" + uri.getScheme() + "' is unsupported! Should be '" + SCHEME + "' instead: " + uri);

		String schemeSpecificPart = uri.getSchemeSpecificPart();
		if (schemeSpecificPart == null)
			throw new IllegalArgumentException("uri's scheme-specific part is missing: " + uri);

		int questionMarkIndex = schemeSpecificPart.indexOf('?');
		if (questionMarkIndex >= 0) {
			logger.warn("<init>: URI \"{}\" contains reserved but not yet supported character '?'! Ignoring everything after this character.", uri.toString());
			schemeSpecificPart = schemeSpecificPart.substring(0, questionMarkIndex);
		}

		String[] segments = schemeSpecificPart.split(":");
		if (segments.length < 3)
			throw new IllegalArgumentException("uri's scheme-specific part contains less than 3 segments (syntax is '" + SYNTAX + "'): " + uri);

		init(segments);
	}

	protected void init(String ... segments)
	{
		groupId = null;
		artifactId = null;
		type = null;
		classifier = null;
		version = null;

		if (segments == null)
			throw new IllegalArgumentException("segments == null");

		if (segments.length < 3)
			throw new IllegalArgumentException("segments.length < 3");

		try {
			groupId = URLDecoder.decode(segments[0], IOUtil.CHARSET_NAME_UTF_8).trim();
			artifactId = URLDecoder.decode(segments[1], IOUtil.CHARSET_NAME_UTF_8).trim();
			version = URLDecoder.decode(segments[segments.length - 1], IOUtil.CHARSET_NAME_UTF_8).trim();

			int optionalSegmentIndex = 1;

			if (segments.length - 1 /* version at last position */ > ++optionalSegmentIndex)
				type = URLDecoder.decode(segments[optionalSegmentIndex], IOUtil.CHARSET_NAME_UTF_8).trim();

			if (segments.length - 1 /* version at last position */ > ++optionalSegmentIndex)
				classifier = URLDecoder.decode(segments[optionalSegmentIndex], IOUtil.CHARSET_NAME_UTF_8).trim();
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}

		if (groupId != null && groupId.isEmpty())
			throw new IllegalArgumentException("groupId is empty!");

		if (artifactId != null && artifactId.isEmpty())
			throw new IllegalArgumentException("artifactId is empty!");

		if (version != null && version.isEmpty())
			throw new IllegalArgumentException("version is empty!");

		if (type != null && type.isEmpty())
			type = null;

		if (classifier != null && classifier.isEmpty())
			classifier = null;
	}

	public String getGroupId() {
		return groupId;
	}
	public String getArtifactId() {
		return artifactId;
	}
	public String getVersion() {
		return version;
	}
	public String getType() {
		return type;
	}
	public String getClassifier() {
		return classifier;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		result = prime * result + ((artifactId == null) ? 0 : artifactId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((classifier == null) ? 0 : classifier.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
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

		MavenURI other = (MavenURI) obj;
		return (
				Util.equals(this.groupId, other.groupId) &&
				Util.equals(this.artifactId, other.artifactId) &&
				Util.equals(this.type, other.type) &&
				Util.equals(this.classifier, other.classifier) &&
				Util.equals(this.version, other.version)
		);
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
			return SCHEME_PREFIX
					+ URLEncoder.encode(groupId, IOUtil.CHARSET_NAME_UTF_8)
					+ ':' + URLEncoder.encode(artifactId, IOUtil.CHARSET_NAME_UTF_8)
					+ (type == null ? "" : ':' + URLEncoder.encode(type, IOUtil.CHARSET_NAME_UTF_8))
					+ (classifier == null ? "" : ':' + URLEncoder.encode(classifier, IOUtil.CHARSET_NAME_UTF_8))
					+ ':' + URLEncoder.encode(version, IOUtil.CHARSET_NAME_UTF_8);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
}
