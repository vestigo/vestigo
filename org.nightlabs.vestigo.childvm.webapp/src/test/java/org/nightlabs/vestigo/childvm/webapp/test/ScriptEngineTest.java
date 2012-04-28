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

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.junit.Test;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ScriptEngineTest
{
	@Test
	public void getScriptEngineByName()
	{
		ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine scriptEngine = factory.getEngineByName("JavaScript");
        System.out.println(scriptEngine.getFactory().getMimeTypes());
	}

	@Test
	public void getScriptEngineByMimeType()
	{
		ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine scriptEngine = factory.getEngineByMimeType("text/javascript");
        System.out.println(scriptEngine.getFactory().getMimeTypes());
	}
}
