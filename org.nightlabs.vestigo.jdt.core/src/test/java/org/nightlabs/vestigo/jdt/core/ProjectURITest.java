package org.nightlabs.vestigo.jdt.core;

import java.net.URI;

import junit.framework.Assert;

import org.junit.Test;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ProjectURITest
{
	@Test
	public void fromProjectNameToURLAndBack()
	{
		String projectName = "Project name with äöüß, หงุ่ยตระกูล, :;. and wite-spaces";
		ProjectURI projectURI = new ProjectURI(projectName);
		System.out.println("projectURL: " + projectURI);
		URI uri = projectURI.toURI();
		System.out.println("uri: " + uri);

		Assert.assertEquals(projectURI.toString(), uri.toString());

		ProjectURI projectURL2 = new ProjectURI(uri);
		String projectName2 = projectURL2.getProjectName();

		Assert.assertEquals(projectName, projectName2);
	}
}
