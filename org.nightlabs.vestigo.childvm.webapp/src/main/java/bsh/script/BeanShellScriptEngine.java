package bsh.script;
import java.lang.reflect.*;
import java.io.*;
import javax.script.*;
import bsh.NameSpace;
import bsh.Interpreter;
import bsh.BshMethod;

public class BeanShellScriptEngine extends AbstractScriptEngine implements Invocable {

  public Object eval(String script,ScriptContext context) throws ScriptException {
    try {
      Bindings bindings = context.getBindings(ScriptContext.ENGINE_SCOPE);
      return bsh.eval(script,(NameSpace)bindings);
    }
    catch(Exception ex) {
      throw new ScriptException(ex);
    }
  }

  public Object eval(Reader reader,ScriptContext context) throws ScriptException {
    try {
      Bindings bindings = context.getBindings(ScriptContext.ENGINE_SCOPE);
      return bsh.eval(reader,(NameSpace)bindings,null);
    }
    catch(Exception ex) {
      ex.printStackTrace();
      throw new ScriptException(ex);
    }
  }

  public ScriptEngineFactory getFactory() {
    return null;
  }

  public Bindings createBindings() {
    return new BeanShellBindings(null,null);
  }

  public Object invokeFunction(String name,Object... args) throws ScriptException, NoSuchMethodException {
    Class[] argTypes = getArgumentTypes(args);
    Bindings bindings = context.getBindings(ScriptContext.ENGINE_SCOPE);
    NameSpace ns = (NameSpace)bindings;
    try {
      BshMethod m = ns.getMethod(name,argTypes);
      if(m == null) throw new NoSuchMethodException(name);
      return m.invoke(args,bsh);
    }
    catch(Exception ex) {
      throw new ScriptException(ex);
    }
  }

  protected Class[] getArgumentTypes(Object... args) {
    Class[] argTypes = new Class[args.length];
    for(int i=0;i<args.length;i++) {
      argTypes[i] = args[i] != null ? args[i].getClass() : Object.class;
    }
    return argTypes;
  }

  public Object invokeMethod(Object thiz,String name,Object... args) throws ScriptException, NoSuchMethodException {
    Class[] argTypes = getArgumentTypes(args);
    Method m = getDeclaredMethod(thiz.getClass(),name,argTypes);
    if(m == null)
      throw new NoSuchMethodException(name);
    try {
      return m.invoke(thiz,args);
    }
    catch(Exception ex) {
      throw new ScriptException(ex);
    }
  }

  protected boolean isCompatible(Class c1,Class c2) {
    if(c1 == c2) return true;
    return (c1 == Integer.TYPE && c2 == Integer.class) ||
           (c1 == Short.TYPE && c2 == Short.class) ||
           (c1 == Float.TYPE && c2 == Float.class) ||
           (c1 == Long.TYPE && c2 == Long.class) ||
           (c1 == Double.TYPE && c2 == Double.class) ||
           (c1 == Byte.TYPE && c2 == Byte.class) ||
           (c1 == Character.TYPE && c2 == Character.class) ||
	   (c1.isAssignableFrom(c2));
  }

  protected Method getDeclaredMethod(Class cls,String name,Class[] argTypes) {
    Method[] methods = cls.getDeclaredMethods();
    for(Method m : methods) {
      if(!name.equals(m.getName())) continue;
      Class[] ptypes = m.getParameterTypes();
      int i=0;
      for(;i<ptypes.length;i++) {
        if(ptypes[i] != argTypes[i] && !isCompatible(ptypes[i],argTypes[i]))
          break;
      }
      if(i<ptypes.length) continue;
      return m;
    }
    return null;
  }

  public <T> T getInterface(Class<T> clasz) {
    return (T)java.lang.reflect.Proxy.newProxyInstance(getClass().getClassLoader(),new Class[] { clasz },new FunctionProxy());
  }

  public <T> T getInterface(Object thiz,Class<T> clasz) {
    return (T)java.lang.reflect.Proxy.newProxyInstance(getClass().getClassLoader(),new Class[] { clasz },new MethodProxy(thiz));
  }

  Interpreter bsh = new Interpreter();

  class FunctionProxy implements java.lang.reflect.InvocationHandler {
    public Object invoke(Object proxy, Method m,Object[] args) throws Throwable {
      return invokeFunction(m.getName(),args);
    }
  }

  class MethodProxy implements java.lang.reflect.InvocationHandler {
    public MethodProxy(Object scriptObject) {
      this.scriptObject = scriptObject;
    }

    public Object invoke(Object proxy, Method m,Object[] args) throws Throwable {
      return invokeMethod(scriptObject,m.getName(),args);
    }
    protected Object scriptObject;
  }
}
