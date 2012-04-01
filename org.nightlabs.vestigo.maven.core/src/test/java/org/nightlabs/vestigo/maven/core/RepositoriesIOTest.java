package org.nightlabs.vestigo.maven.core;

import org.junit.Assert;
import org.junit.Test;

public class RepositoriesIOTest
{
	@Test
	public void writeToAndReadFromString()
	throws Exception
	{
		Repositories repositories = new Repositories();
		Repository repository1 = new Repository();
		repositories.getRepository().add(repository1);
		repository1.setId("id1");
		repository1.setUrl("http://repo1.somecompany.com");
		repository1.getReleases().setEnabled(true);
		repository1.getSnapshots().setEnabled(true);

		Repository repository2 = new Repository();
		repositories.getRepository().add(repository2);
		repository2.setId("id2");
		repository2.setUrl("http://repo2.somecompany.com");
		repository2.getReleases().setEnabled(true);

		RepositoriesIO repositoriesIO = new RepositoriesIO();
		String xml = repositoriesIO.writeToString(repositories);
		System.out.println(xml);

		Repositories deserialised = repositoriesIO.readFromString(xml);
		Assert.assertNotNull(deserialised);
		Assert.assertNotNull(deserialised.getRepository());
		Assert.assertTrue(deserialised.getRepository().size() == 2);
	}

	@Test
	public void readRealRepositories() throws Exception
	{
		// The following String was copied from a real repositories declaration.
		String string = "" +
				"<repositories>" +
				"	<repository>" +
				"		<id>dev.nightlabs.org-libs-releases-local</id>" +
				"		<url>http://dev.nightlabs.org/maven-repository/libs-releases-local/</url>" +
				"		<snapshots>" +
				"			<enabled>false</enabled>" +
				"		</snapshots>" +
				"		<releases>" +
				"			<enabled>true</enabled>" +
				"		</releases>" +
				"	</repository>" +
				"	<repository>" +
				"		<id>dev.nightlabs.org-libs-snapshots-local</id>" +
				"		<url>http://dev.nightlabs.org/maven-repository/libs-snapshots-local/</url>" +
				"		<snapshots>" +
				"			<enabled>true</enabled>" +
				"		</snapshots>" +
				"		<releases>" +
				"			<enabled>false</enabled>" +
				"		</releases>" +
				"	</repository>" +
				"</repositories>";

		Repositories repositories = new RepositoriesIO().readFromString(string);
		Assert.assertNotNull(repositories);
		Assert.assertNotNull(repositories.getRepository());
		Assert.assertTrue(repositories.getRepository().size() == 2);

		Repository repository = repositories.getRepository().get(0);
		Assert.assertEquals("dev.nightlabs.org-libs-releases-local", repository.getId());
		Assert.assertEquals("http://dev.nightlabs.org/maven-repository/libs-releases-local/", repository.getUrl());
		Assert.assertFalse(repository.getSnapshots().isEnabled());
		Assert.assertTrue(repository.getReleases().isEnabled());
		Assert.assertNull(repository.getName());
		Assert.assertNull(repository.getLayout());

		repository = repositories.getRepository().get(1);
		Assert.assertEquals("dev.nightlabs.org-libs-snapshots-local", repository.getId());
		Assert.assertEquals("http://dev.nightlabs.org/maven-repository/libs-snapshots-local/", repository.getUrl());
		Assert.assertTrue(repository.getSnapshots().isEnabled());
		Assert.assertFalse(repository.getReleases().isEnabled());
		Assert.assertNull(repository.getName());
		Assert.assertNull(repository.getLayout());
	}
}
