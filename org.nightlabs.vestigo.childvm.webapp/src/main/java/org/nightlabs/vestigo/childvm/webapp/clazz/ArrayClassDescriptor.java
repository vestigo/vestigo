package org.nightlabs.vestigo.childvm.webapp.clazz;

import java.lang.reflect.Array;

public class ArrayClassDescriptor
{
	private String className;
	private int dimensionQty;

	public ArrayClassDescriptor(String className, int dimensionQty) {
		this.className = className;
		this.dimensionQty = dimensionQty;
	}

	public String getClassName() {
		return className;
	}
	public int getDimensionQty() {
		return dimensionQty;
	}

	public Class<?> getClass(ClassLoader classLoader) throws ClassNotFoundException
	{
		Class<?> c = ClassUtil.getClass(getClassName(), classLoader);
		if (getDimensionQty() == 0)
			return c;

		int[] dimensions = new int[getDimensionQty()];
		Object array = Array.newInstance(c, dimensions);
		return array.getClass();
	}
}