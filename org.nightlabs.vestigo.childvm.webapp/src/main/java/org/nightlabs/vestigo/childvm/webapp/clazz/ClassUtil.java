package org.nightlabs.vestigo.childvm.webapp.clazz;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ClassUtil {
	static Class<?> getClass(String className, ClassLoader classLoader) throws ClassNotFoundException
	{
		Class<?> result = simpleTypes_className2Class.get(className);
		if (result != null)
			return result;

		return Class.forName(className, true, classLoader);
	}

	private static final Class<?>[] simpleTypes = {
		boolean.class,
		byte.class,
		char.class,
		double.class,
		float.class,
		int.class,
		long.class,
		short.class
	};

	private static final Map<String, Class<?>> simpleTypes_className2Class;
	static {
		Map<String, Class<?>> m = new HashMap<String, Class<?>>(simpleTypes.length);
		for (Class<?> c : simpleTypes) {
			m.put(c.getName(), c);
		}
		simpleTypes_className2Class = Collections.unmodifiableMap(m);
	}

	public static ArrayClassDescriptor getArrayClassDescriptor(final String className)
	{
		if (className.charAt(0) != '[')
			return new ArrayClassDescriptor(className, 0);

		String cn = className;
		int dimensionQty = 0;
		while (!cn.isEmpty() && cn.charAt(0) == '[') {
			++dimensionQty;
			cn = cn.substring(1);
		}

		if (className.isEmpty())
			throw new IllegalArgumentException("className \"" + className + "\" is illegal: It lacks a binary identifier after the last '['!");

		char classBinaryIdentifier = cn.charAt(0);
		cn = cn.substring(1);

		// See javadoc of Class.getName() for the format of the binary identifier.
		switch (classBinaryIdentifier) {
			case 'Z':
				cn = boolean.class.getName();
				break;
			case 'B':
				cn = byte.class.getName();
				break;
			case 'C':
				cn = char.class.getName();
				break;
			case 'D':
				cn = double.class.getName();
				break;
			case 'F':
				cn = float.class.getName();
				break;
			case 'I':
				cn = int.class.getName();
				break;
			case 'J':
				cn = long.class.getName();
				break;
			case 'S':
				cn = short.class.getName();
				break;
			case 'L':
				int colonIndex = cn.indexOf(';');
				cn = cn.substring(0, colonIndex);
				break;
			default:
				throw new IllegalArgumentException("className \"" + className + "\" is illegal: The binary identifier '" + classBinaryIdentifier + "' after the last '[' is unknown!");
		}

		return new ArrayClassDescriptor(cn, dimensionQty);
	}
}
