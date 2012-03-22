package org.nightlabs.vestigo.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.nightlabs.vestigo.core.oda.ResultSet;

public final class LabelTextUtil {
	private LabelTextUtil() { }

	public static String getSimpleClassName(String qualifiedClassName)
	{
		int lastDotIndex = qualifiedClassName.lastIndexOf('.');
		if (lastDotIndex < 0)
			return qualifiedClassName;

		return qualifiedClassName.substring(lastDotIndex + 1);
	}

	public static String toStringOfSimpleObject(FieldDesc fieldDesc, Object object, Set<LabelTextOption> labelTextOptions)
	{
		if (object == ResultSet.LICENCE_NOT_VALID)
			return String.valueOf(object);

		StringBuilder sb = new StringBuilder();
		if (labelTextOptions.contains(LabelTextOption.showInstanceType)) {
			sb.append('(');
			if (object == null)
				sb.append(String.valueOf((String)null));
			else {
				if (labelTextOptions.contains(LabelTextOption.showPackageName))
					sb.append(getPrimitiveIfApplicable(fieldDesc, object.getClass()).getName());
				else
					sb.append(getPrimitiveIfApplicable(fieldDesc, object.getClass()).getSimpleName());
			}
			sb.append(") ");
		}

		sb.append(String.valueOf(object));

		return sb.toString();
	}

	private static final Class<?>[] primitiveClasses = {
		boolean.class,
		char.class,
		byte.class,
		double.class,
		int.class,
		float.class,
		long.class,
		short.class
	};
	private static final Map<String, Class<?>> primitiveClassNames;
	static {
		Map<String, Class<?>> m = new HashMap<String, Class<?>>(primitiveClasses.length);
		for (Class<?> c : primitiveClasses) {
			m.put(c.getName(), c);
		}
		primitiveClassNames = Collections.unmodifiableMap(m);
	}

	private static Class<?> getPrimitiveIfApplicable(FieldDesc fieldDesc, Class<?> clazz)
	{
		if (fieldDesc == null)
			return clazz;

		Class<?> c = primitiveClassNames.get(fieldDesc.getFieldTypeName());
		if (c != null)
			return c;
		else
			return clazz;
	}
}
