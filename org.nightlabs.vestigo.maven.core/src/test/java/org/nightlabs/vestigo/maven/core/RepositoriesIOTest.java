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
		repository1.setLayout(RepositoryLayout.LEGACY);

		Repository repository2 = new Repository();
		repositories.getRepository().add(repository2);
		repository2.setId("id2");
		repository2.setUrl("http://repo2.somecompany.com");
		repository2.getReleases().setEnabled(true);
		repository2.setLayout(RepositoryLayout.DEFAULT);

		RepositoriesIO repositoriesIO = new RepositoriesIO();
		String xml = repositoriesIO.writeToString(repositories);

		System.out.println(xml);

		Repositories deserialised = repositoriesIO.readFromString(xml);
		Assert.assertNotNull(deserialised);
		Assert.assertNotNull(deserialised.getRepository());
		Assert.assertTrue(deserialised.getRepository().size() == 2);

		assertEquals(repository1, deserialised.getRepository().get(0));
		assertEquals(repository2, deserialised.getRepository().get(1));
	}

	private void assertEquals(Repository expected, Repository actual)
	{
		Assert.assertEquals(expected.getId(), actual.getId());
		Assert.assertEquals(expected.getName(), actual.getName());
		Assert.assertEquals(expected.getUrl(), actual.getUrl());
		Assert.assertEquals(expected.getLayout(), actual.getLayout());
		Assert.assertEquals(expected.getReleases().isEnabled(), actual.getReleases().isEnabled());
		Assert.assertEquals(expected.getSnapshots().isEnabled(), actual.getSnapshots().isEnabled());
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
