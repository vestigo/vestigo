package bsh;
import javax.script.*;
import bsh.NameSpace;
import bsh.Variable;

public class Bindings2NameSpace extends NameSpace {

    public Bindings2NameSpace(Bindings bindings) {
      super((NameSpace)null,"Adapter");
      this.bindings = bindings;
    }

    public Object getVariable(String name) {
      return bindings.get(name);
    }

    public Object getVariable(String name,boolean recursive) {
      return bindings.get(name);
    }

    public void setVariable(String name,Object value,boolean strictJava) {
      bindings.put(name,value);
    }

    protected Variable getVariableImpl(String name,boolean recursive) throws UtilEvalError {
      Object val = bindings.get(name);
      if(val == null && !bindings.containsKey(name)) return null;
      Variable var = null;
      /*
       * Since Variable is not accessible from outside bsh package scope, this class has
       * to be in the same package. Also, the NameSpace implementation expects the parent 
       * namespace to have the getVariableImpl impelementation for setVariable/getVariable 
       * which is the reason for this hack.
       *
       * The setVariable of the namespace uses the setValue of the Variable which needs
       * to be overwritten and propagated to the Bindings
       */
      var = new GlobalVariable(name,(Class)null,val,null); 
      return var;
    }

    class GlobalVariable extends Variable {
      public GlobalVariable(String name,Class type,Object value,Modifiers modifiers) throws bsh.UtilEvalError {
	super(name,type,value,modifiers);
      }

      public void setValue(Object value,int context) throws UtilEvalError {
	super.setValue(value,context);
	bindings.put(name,value);
      }
    }

    public void setBindings(Bindings bindings) {
      this.bindings = bindings;
    }

    Bindings bindings;
}
