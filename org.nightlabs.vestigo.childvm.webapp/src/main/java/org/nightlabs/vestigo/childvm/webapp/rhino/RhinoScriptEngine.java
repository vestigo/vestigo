//package org.nightlabs.vestigo.childvm.webapp.rhino;
//
//import java.io.IOException;
//import java.io.Reader;
//import java.io.StringReader;
//import java.util.Map;
//
//import javax.script.AbstractScriptEngine;
//import javax.script.Bindings;
//import javax.script.ScriptContext;
//import javax.script.ScriptEngine;
//import javax.script.ScriptEngineFactory;
//import javax.script.ScriptException;
//import javax.script.SimpleBindings;
//
//import org.mozilla.javascript.Context;
//import org.mozilla.javascript.JavaScriptException;
//import org.mozilla.javascript.RhinoException;
//import org.mozilla.javascript.Scriptable;
//import org.mozilla.javascript.ScriptableObject;
//import org.mozilla.javascript.Undefined;
//import org.mozilla.javascript.Wrapper;
//
///**
// *
// * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
// */
//public class RhinoScriptEngine extends AbstractScriptEngine {
//
//	@Override
//	public Object eval(String script, ScriptContext context) throws ScriptException
//	{
//		return eval(new StringReader(script), context);
//	}
//
//	@Override
//	public Object eval(Reader reader, ScriptContext context) throws ScriptException
//	{
//		Object result;
//
//
//		Context cx = Context.enter();
//		try {
//			Scriptable scope = cx.initStandardObjects();
//
//			Bindings bindings = getBindings(ScriptContext.ENGINE_SCOPE);
//			for (Map.Entry<?, ?> me : bindings.entrySet()) {
//				ScriptableObject.putProperty(scope, (String)me.getKey(), Context.javaToJS(me.getValue(), scope));
//			}
//
//			String filename = (String) get(ScriptEngine.FILENAME);
//			filename = filename == null ? "<Unknown source>" : filename;
//
//			result = cx.evaluateReader(scope, reader, filename , 1,  null);
//		} catch (RhinoException re) {
//			int line = (line = re.lineNumber()) == 0 ? -1 : line;
//			String msg;
//			if (re instanceof JavaScriptException) {
//				msg = String.valueOf(((JavaScriptException)re).getValue());
//			} else {
//				msg = re.toString();
//			}
//			ScriptException se = new ScriptException(msg, re.sourceName(), line);
//			se.initCause(re);
//			throw se;
//		} catch (IOException ee) {
//			throw new ScriptException(ee);
//		} finally {
//			Context.exit();
//		}
//
//		if (result instanceof Wrapper)
//			result = ( (Wrapper) result).unwrap();
//
//		return result instanceof Undefined ? null : result;
//	}
//
//	@Override
//	public ScriptEngineFactory getFactory() {
//		throw new UnsupportedOperationException("NYI");
//	}
//
//	@Override
//	public Bindings createBindings() {
//		return new SimpleBindings();
//	}
//}
