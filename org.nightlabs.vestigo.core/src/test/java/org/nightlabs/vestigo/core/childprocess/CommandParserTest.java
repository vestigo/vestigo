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
package org.nightlabs.vestigo.core.childprocess;

import org.junit.Assert;
import org.junit.Test;

public class CommandParserTest {

	@Test
	public void singleCommand()
	{
		String[] commands = new CommandParser().parse("command");
		Assert.assertNotNull(commands);
		Assert.assertArrayEquals(new String[] { "command" }, commands);
	}

	@Test
	public void commandWithArgs()
	{
		String[] commands = new CommandParser().parse("command arg1 -a --long-option");
		Assert.assertNotNull(commands);
		Assert.assertArrayEquals(new String[] { "command", "arg1", "-a", "--long-option" }, commands);
	}

	@Test
	public void commandWithArgsMultiSpacing()
	{
		String[] commands = new CommandParser().parse("command   arg1  -a         --long-option");
		Assert.assertNotNull(commands);
		Assert.assertArrayEquals(new String[] { "command", "arg1", "-a", "--long-option" }, commands);
	}

	@Test
	public void commandWithDoubleQuotedArgs()
	{
		CommandParser commandParser = new CommandParser();
		String[] commands = commandParser.parse("com\\mand \"arg1 \\having spaces\" \" arg2 more spaces \" \"\"\"\" \"\" \"with'otherquots\" \"'otwo'of them\"");
		Assert.assertNotNull(commands);
		Assert.assertArrayEquals(new String[] { "com\\mand", "arg1 \\having spaces", " arg2 more spaces ", "", "", "", "with'otherquots", "'otwo'of them" }, commands);
	}

	@Test
	public void commandWithSingleQuotedArgs()
	{
		CommandParser commandParser = new CommandParser();
		String[] commands = commandParser.parse("com\\mand 'arg1 \\having spaces' ' arg2 more spaces ' '''' '' 'with\"otherquots' '\"otwo\"of them'");
		Assert.assertNotNull(commands);
		Assert.assertArrayEquals(new String[] { "com\\mand", "arg1 \\having spaces", " arg2 more spaces ", "", "", "", "with\"otherquots", "\"otwo\"of them" }, commands);
	}

	@Test
	public void commandWithSystemProperty_enabled()
	{
		String[] commands = new CommandParser().parse("command '${java.io.tmpdir}'");
		Assert.assertNotNull(commands);
		Assert.assertArrayEquals(new String[] { "command", System.getProperty("java.io.tmpdir") }, commands);
	}

	@Test
	public void commandWithSystemProperty_disabled()
	{
		CommandParser commandParser = new CommandParser();
		commandParser.setSystemPropertiesEnabled(false);
		String[] commands = commandParser.parse("command '${java.io.tmpdir}'");
		Assert.assertNotNull(commands);
		Assert.assertArrayEquals(new String[] { "command", "${java.io.tmpdir}" }, commands);
	}

	@Test
	public void commandWithMixedProperties()
	{
		CommandParser commandParser = new CommandParser();
		commandParser.getProperties().put("key1", "value1");
		commandParser.getProperties().put("key2", " value2  with2 spaces2 ");
		commandParser.getProperties().put("key3", " value3  with3 spaces3 ");
		commandParser.getProperties().put("key4", " value4  with4 spaces4 ");
		String[] commands = commandParser.parse("command '${java.io.tmpdir}' ${key1} ${key2} '${key3}' \"${key4}\"");
		Assert.assertNotNull(commands);
		Assert.assertArrayEquals(
				new String[] {
						"command", System.getProperty("java.io.tmpdir"),
						"value1",
						"value2", "with2", "spaces2",
						" value3  with3 spaces3 ",
						" value4  with4 spaces4 "
				},
				commands
		);
	}
}
