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
