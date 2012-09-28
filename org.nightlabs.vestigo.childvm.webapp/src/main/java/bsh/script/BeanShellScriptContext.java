package bsh.script;
import javax.script.*;
import bsh.NameSpace;
import bsh.Variable;
import bsh.UtilEvalError;

public class BeanShellScriptContext extends SimpleScriptContext {

  public void setBindings(Bindings bindings,int scope) {
    super.setBindings(bindings,scope);
    if(scope == GLOBAL_SCOPE) {
      b2ns.setBindings(bindings);
      Bindings engineBindings = getBindings(ENGINE_SCOPE);
      if(engineBindings instanceof NameSpace) {
	NameSpace ens = (NameSpace)engineBindings;
	ens.setParent(b2ns);
      }
    }
  }

  protected bsh.Bindings2NameSpace b2ns = new bsh.Bindings2NameSpace(null);
}
