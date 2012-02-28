package org.nightlabs.jjqb.core;

import java.util.Set;

import org.nightlabs.jjqb.core.oda.ResultSet;

public final class LabelTextUtil {
	private LabelTextUtil() { }

	public static String getSimpleClassName(String qualifiedClassName)
	{
		int lastDotIndex = qualifiedClassName.lastIndexOf('.');
		if (lastDotIndex < 0)
			return qualifiedClassName;

		return qualifiedClassName.substring(lastDotIndex + 1);
	}

	public static String toStringOfSimpleObject(Object object, Set<LabelTextOption> labelTextOptions)
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
					sb.append(object.getClass().getName());
				else
					sb.append(object.getClass().getSimpleName());
			}
			sb.append(") ");
		}

		sb.append(String.valueOf(object));

		return sb.toString();
	}
}
