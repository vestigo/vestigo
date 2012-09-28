package bsh.script;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import javax.script.Bindings;

import bsh.NameSpace;

public class BeanShellBindings extends NameSpace implements Bindings {

  public BeanShellBindings(NameSpace parent,String name) {
    super(parent,name);
  }

  @Override
public boolean containsKey(Object key) {
    try {
      return getVariableImpl(key.toString(),true) != null;
    }
    catch(Exception ex) {
//      ex.printStackTrace();
//      return false;
    	throw new RuntimeException(ex); // Modified by Marco: Rethrowing instead of the above.
    }
  }

  @Override
public Object get(Object key) {
    try {
      return getVariable(key.toString());
    }
    catch(Exception ex) {
//      ex.printStackTrace();
//      return null;
    	throw new RuntimeException(ex); // Modified by Marco: Rethrowing instead of the above.
    }
  }

  @Override
public Object put(String name,Object value) {
    Object oval = get(name);
    try {
      setVariable(name,value,false); // Modified by Marco (from true to false), because true makes no sense, IMHO.
      return oval;
    }
    catch(Exception ex) {
//      ex.printStackTrace();
//      return null;
    	throw new RuntimeException(ex); // Modified by Marco: Rethrowing instead of the above.
    }
  }

  @Override
public void putAll(Map<? extends String,? extends Object> toMerge) {
    for(String key : toMerge.keySet())
      put(key,toMerge.get(key));
  }

  @Override
public Object remove(Object key) {
    Object val = get(key);
    unsetVariable(key.toString());
    return val;
  }

  /** Map interface that may not be required { */
  @Override
public void clear() {
  }

  @Override
public boolean containsValue(Object value) {
    return false;
  }

  @Override
public Set entrySet() {
    return null;
  }

  @Override
public boolean isEmpty() {
    return false;
  }

  @Override
public Set keySet() {
    return null;
  }

  @Override
public int size() {
    return 0;
  }

  @Override
public Collection values() {
    return null;
  }
  /** Map interface } */
}
