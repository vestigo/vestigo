package org.nightlabs.jjqb.childvm.webapp.test;

import junit.framework.Assert;

import org.junit.Test;
import org.nightlabs.jjqb.childvm.webapp.model.StringUtil;

public class StringUtilTest
{
	@Test
	public void removeCommentsAndConvertEOLsToUnixEOLs()
	{
		String queryText = (
				"-- comment 1\n" +
				"SELECT FROM org.bla.Bla \"-- NOT comment\"\r\n" +
				"-- completely commented line\r\r" +
				"WHERE this.bla - this.blubb > :arg -- comment 3\r" +
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
				"SELECT FROM org.bla.Bla \"-- NOT comment\"\n" +
				"\n" +
				"\n" +
				"WHERE this.bla - this.blubb > :arg \n" +
				"\t\t&& this.ooo < :arg2\n"
		);
		Assert.assertEquals(expected, queryTextStripped);
	}
}
