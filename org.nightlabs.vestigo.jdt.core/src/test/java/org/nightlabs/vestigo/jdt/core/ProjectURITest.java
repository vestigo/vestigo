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
	public void fromProjectNameToURIAndBack()
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
