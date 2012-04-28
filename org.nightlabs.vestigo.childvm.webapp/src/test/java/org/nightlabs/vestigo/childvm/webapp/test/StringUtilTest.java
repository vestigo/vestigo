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
package org.nightlabs.vestigo.childvm.webapp.test;

import junit.framework.Assert;

import org.junit.Test;
import org.nightlabs.vestigo.childvm.webapp.model.StringUtil;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class StringUtilTest
{
	@Test
	public void removeCommentsAndConvertEOLsToUnixEOLs()
	{
		String queryText = (
				"// comment 1\n" +
				"SELECT FROM org.bla.Bla \"// NOT comment\"\r\n" +
				"// completely commented line\r\r" +
				"WHERE this.bla - this.blubb > :arg // comment 3\r" +
				"\t	&& this.ooo < :arg2\r"
		);

		System.out.println("*************************");
		System.out.println(StringUtil.escapeForJavaSourceCode(queryText));
		System.out.println("*************************");

		String queryTextStripped = StringUtil.removeCommentsAndConvertEOLsToUnixEOLs(queryText);

		System.out.println("*************************");
		System.out.println(queryTextStripped);
		System.out.println("*************************");
		System.out.println(StringUtil.escapeForJavaSourceCode(queryTextStripped));
		System.out.println("*************************");

		System.out.println("*************************");
		System.out.println(StringUtil.toJavaSourceCode(queryTextStripped));
		System.out.println("*************************");

		String expected = (
				"\n" +
				"SELECT FROM org.bla.Bla \"// NOT comment\"\n" +
				"\n" +
				"\n" +
				"WHERE this.bla - this.blubb > :arg \n" +
				"\t\t&& this.ooo < :arg2\n"
		);
		Assert.assertEquals(expected, queryTextStripped);
	}
}
