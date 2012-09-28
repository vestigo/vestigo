package bsh.script;
import java.util.*;
import javax.script.*;

public class BeanShellScriptEngineFactory implements ScriptEngineFactory {

  public BeanShellScriptEngineFactory() {
    extensions = new ArrayList<String>();
    extensions.add("bsh");
    mimeTypes = new ArrayList<String>();
    mimeTypes.add("text/bsh");
    names = new ArrayList<String>();
    names.add("BeanShell");
    names.add("bsh");
    names.add("beanshell");
  }

  public String getEngineName() {
    return "BeanShell";
  }

  public String getEngineVersion() {
    return "1.0";
  }

  public List getExtensions() {
    return extensions;
  }

  public String getLanguageName() {
    return "BeanShell";
  }

  public String getLanguageVersion() {
    return bsh.Interpreter.VERSION;
  }

  public String getMethodCallSyntax(String obj,String m,String... args) {
    StringBuilder sb = new StringBuilder(obj);
    sb.append('.');
    sb.append(m);
    sb.append('(');
    if(args.length > 0)
      sb.append(args[0]);
    for(int i=1;i<args.length-1;i++) {
      sb.append(',');
      sb.append(args[i]);
    }
    sb.append(')');
    return sb.toString();
  }

  public List<String> getMimeTypes() {
    return mimeTypes;
  }

  public List<String> getNames() {
    return names;
  }

  public String getOutputStatement(String toDisplay) {
    return "print("+toDisplay+")";
  }

  public String getProgram(String... statements) {
    StringBuilder sb = new StringBuilder();
    if(statements.length > 0)
      sb.append(statements[0]);
    for(int i=1;i<statements.length;i++) {
      sb.append(";\n");
      sb.append(statements[i]);
    }
    return sb.toString();
  }

  public Object getParameter(String key) {
    if(key == ScriptEngine.ENGINE)
      return getEngineName();
    if(key == ScriptEngine.ENGINE_VERSION)
      return getEngineVersion();
    if(key == ScriptEngine.NAME)
      return getEngineName();
    if(key == ScriptEngine.LANGUAGE)
      return getLanguageName();
    if(key == ScriptEngine.LANGUAGE_VERSION)
      return getLanguageVersion();
    return null;
  }

  public ScriptEngine getScriptEngine() {
    ScriptContext ctx = new BeanShellScriptContext();
    Bindings engineBindings = new BeanShellBindings(null,"EngineBindings");
    ctx.setBindings(engineBindings,ScriptContext.ENGINE_SCOPE);
    ScriptEngine engine = new BeanShellScriptEngine();
    engine.setContext(ctx);
    return engine;
  }

  protected ArrayList<String> extensions;
  protected ArrayList<String> mimeTypes;
  protected ArrayList<String> names;
}
