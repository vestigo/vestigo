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
package org.nightlabs.vestigo.maven.core;

import java.net.URI;
import java.net.URISyntaxException;

import junit.framework.Assert;

import org.junit.Test;
import org.nightlabs.vestigo.maven.core.MavenURI;

public class MavenURITest
{
	@Test
	public void gav() throws URISyntaxException
	{
		MavenURI uri = new MavenURI("org.nightlabs", "org.nightlabs.util", "1.3.0-SNAPSHOT");
		Assert.assertEquals("org.nightlabs", uri.getGroupId());
		Assert.assertEquals("org.nightlabs.util", uri.getArtifactId());
		Assert.assertEquals("1.3.0-SNAPSHOT", uri.getVersion());

		MavenURI uri2 = new MavenURI(new URI(uri.toString()));
		Assert.assertEquals(uri, uri2);
		Assert.assertEquals(uri2, uri);

		uri = null; // ensure we don't use it anymore (copy'n'paste-error)

		Assert.assertEquals("org.nightlabs", uri2.getGroupId());
		Assert.assertEquals("org.nightlabs.util", uri2.getArtifactId());
		Assert.assertEquals("1.3.0-SNAPSHOT", uri2.getVersion());
	}

	@Test
	public void gav_ne() throws URISyntaxException
	{
		MavenURI uri = new MavenURI("org.nightlabs", "org.nightlabs.util", "1.3.0-SNAPSHOT");
		Assert.assertEquals("org.nightlabs", uri.getGroupId());
		Assert.assertEquals("org.nightlabs.util", uri.getArtifactId());
		Assert.assertEquals("1.3.0-SNAPSHOT", uri.getVersion());

		{
			MavenURI uri2 = new MavenURI("org.nightlabs", "org.nightlabs.util", "1.3.0-SNAPSHOTx");
			Assert.assertFalse(uri.equals(uri2));
			Assert.assertFalse(uri2.equals(uri));
		}

		{
			MavenURI uri2 = new MavenURI("org.nightlabs", "org.nightlabs.utilx", "1.3.0-SNAPSHOT");
			Assert.assertFalse(uri.equals(uri2));
			Assert.assertFalse(uri2.equals(uri));
		}

		{
			MavenURI uri2 = new MavenURI("org.nightlabsx", "org.nightlabs.util", "1.3.0-SNAPSHOT");
			Assert.assertFalse(uri.equals(uri2));
			Assert.assertFalse(uri2.equals(uri));
		}

		{
			MavenURI uri2 = new MavenURI("org.nightlabs", "org.nightlabs.util", "jar", "1.3.0-SNAPSHOT");
			Assert.assertFalse(uri.equals(uri2));
			Assert.assertFalse(uri2.equals(uri));
		}

		{
			MavenURI uri2 = new MavenURI("org.nightlabs", "org.nightlabs.util", "jar", "tests", "1.3.0-SNAPSHOT");
			Assert.assertFalse(uri.equals(uri2));
			Assert.assertFalse(uri2.equals(uri));
		}
	}

	@Test
	public void gatv() throws URISyntaxException
	{
		MavenURI uri = new MavenURI("org.nightlabs", "org.nightlabs.util", "jar", "1.3.0-SNAPSHOT");
		Assert.assertEquals("org.nightlabs", uri.getGroupId());
		Assert.assertEquals("org.nightlabs.util", uri.getArtifactId());
		Assert.assertEquals("jar", uri.getType());
		Assert.assertEquals("1.3.0-SNAPSHOT", uri.getVersion());

		MavenURI uri2 = new MavenURI(new URI(uri.toString()));
		Assert.assertEquals(uri, uri2);
		Assert.assertEquals(uri2, uri);

		uri = null; // ensure we don't use it anymore (copy'n'paste-error)

		Assert.assertEquals("org.nightlabs", uri2.getGroupId());
		Assert.assertEquals("org.nightlabs.util", uri2.getArtifactId());
		Assert.assertEquals("jar", uri2.getType());
		Assert.assertEquals("1.3.0-SNAPSHOT", uri2.getVersion());
	}

	@Test
	public void gatv_ne() throws URISyntaxException
	{
		MavenURI uri = new MavenURI("org.nightlabs", "org.nightlabs.util", "jar", "1.3.0-SNAPSHOT");
		Assert.assertEquals("org.nightlabs", uri.getGroupId());
		Assert.assertEquals("org.nightlabs.util", uri.getArtifactId());
		Assert.assertEquals("1.3.0-SNAPSHOT", uri.getVersion());

		{
			MavenURI uri2 = new MavenURI("org.nightlabsx", "org.nightlabs.util", "jar", "1.3.0-SNAPSHOT");
			Assert.assertFalse(uri.equals(uri2));
			Assert.assertFalse(uri2.equals(uri));
		}

		{
			MavenURI uri2 = new MavenURI("org.nightlabs", "org.nightlabs.utilx", "jar", "1.3.0-SNAPSHOT");
			Assert.assertFalse(uri.equals(uri2));
			Assert.assertFalse(uri2.equals(uri));
		}

		{
			MavenURI uri2 = new MavenURI("org.nightlabs", "org.nightlabs.util", "jarx", "1.3.0-SNAPSHOT");
			Assert.assertFalse(uri.equals(uri2));
			Assert.assertFalse(uri2.equals(uri));
		}

		{
			MavenURI uri2 = new MavenURI("org.nightlabs", "org.nightlabs.util", "jar", "1.3.0-SNAPSHOTx");
			Assert.assertFalse(uri.equals(uri2));
			Assert.assertFalse(uri2.equals(uri));
		}

		{
			MavenURI uri2 = new MavenURI("org.nightlabs", "org.nightlabs.util", "jar", "tests", "1.3.0-SNAPSHOT");
			Assert.assertFalse(uri.equals(uri2));
			Assert.assertFalse(uri2.equals(uri));
		}
	}

	@Test
	public void gatcv() throws URISyntaxException
	{
		MavenURI uri = new MavenURI("org.nightlabs", "org.nightlabs.util", "jar", "tests", "1.3.0-SNAPSHOT");
		Assert.assertEquals("org.nightlabs", uri.getGroupId());
		Assert.assertEquals("org.nightlabs.util", uri.getArtifactId());
		Assert.assertEquals("jar", uri.getType());
		Assert.assertEquals("tests", uri.getClassifier());
		Assert.assertEquals("1.3.0-SNAPSHOT", uri.getVersion());

		MavenURI uri2 = new MavenURI(new URI(uri.toString()));
		Assert.assertEquals(uri, uri2);
		Assert.assertEquals(uri2, uri);

		uri = null; // ensure we don't use it anymore (copy'n'paste-error)

		Assert.assertEquals("org.nightlabs", uri2.getGroupId());
		Assert.assertEquals("org.nightlabs.util", uri2.getArtifactId());
		Assert.assertEquals("jar", uri2.getType());
		Assert.assertEquals("tests", uri2.getClassifier());
		Assert.assertEquals("1.3.0-SNAPSHOT", uri2.getVersion());
	}

	@Test
	public void gatcv_ne() throws URISyntaxException
	{
		MavenURI uri = new MavenURI("org.nightlabs", "org.nightlabs.util", "jar", "tests", "1.3.0-SNAPSHOT");
		Assert.assertEquals("org.nightlabs", uri.getGroupId());
		Assert.assertEquals("org.nightlabs.util", uri.getArtifactId());
		Assert.assertEquals("1.3.0-SNAPSHOT", uri.getVersion());

		{
			MavenURI uri2 = new MavenURI("org.nightlabsx", "org.nightlabs.util", "jar", "tests", "1.3.0-SNAPSHOT");
			Assert.assertFalse(uri.equals(uri2));
			Assert.assertFalse(uri2.equals(uri));
		}

		{
			MavenURI uri2 = new MavenURI("org.nightlabs", "org.nightlabs.utilx", "jar", "tests", "1.3.0-SNAPSHOT");
			Assert.assertFalse(uri.equals(uri2));
			Assert.assertFalse(uri2.equals(uri));
		}

		{
			MavenURI uri2 = new MavenURI("org.nightlabs", "org.nightlabs.util", "jarx", "tests", "1.3.0-SNAPSHOT");
			Assert.assertFalse(uri.equals(uri2));
			Assert.assertFalse(uri2.equals(uri));
		}

		{
			MavenURI uri2 = new MavenURI("org.nightlabs", "org.nightlabs.util", "jar", "testsx", "1.3.0-SNAPSHOT");
			Assert.assertFalse(uri.equals(uri2));
			Assert.assertFalse(uri2.equals(uri));
		}

		{
			MavenURI uri2 = new MavenURI("org.nightlabs", "org.nightlabs.util", "jar", "tests", "1.3.0-SNAPSHOTx");
			Assert.assertFalse(uri.equals(uri2));
			Assert.assertFalse(uri2.equals(uri));
		}
	}
}
