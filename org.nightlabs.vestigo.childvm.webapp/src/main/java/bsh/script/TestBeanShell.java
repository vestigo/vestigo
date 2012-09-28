package bsh.script;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.script.*;
import bsh.script.*;

public class TestBeanShell {

  public static void main(String[] args) throws Exception {
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("BeanShell");
    manager.put("globalName","dirisala.net");
    engine.eval(new FileReader(new File(args[0])));
    System.out.println(manager.get("globalName"));
    Invocable invocable = (Invocable)engine;
    invocable.invokeFunction("debug","Hello invokeFunction!");
    invocable.invokeFunction("actionPerformed",new ActionEvent(engine,0,"actionPerformed direct"));
    Object scriptObject = engine.eval("scriptObject");
    System.out.println(invocable.invokeMethod(scriptObject,"add",new Integer(4),8));
    ActionListener al = (ActionListener)invocable.getInterface(ActionListener.class);
    al.actionPerformed(new ActionEvent(engine,0,"actionPerformed"));
    al = (ActionListener)invocable.getInterface(scriptObject,ActionListener.class);
    al.actionPerformed(new ActionEvent(engine,0,"actionPerformed"));
  }
}
