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
