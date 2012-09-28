package org.nightlabs.vestigo.ui.jface;

import org.nightlabs.vestigo.childvm.shared.BeanShellFormula;
import org.nightlabs.vestigo.childvm.shared.JavaScriptFormula;

public final class DataTypeNameUtil {

	private DataTypeNameUtil() { }

	public static String getDataTypeName(Class<?> paramType) {
		if (paramType == null)
			throw new IllegalArgumentException("paramType == null");

		if (paramType == JavaScriptFormula.class || paramType == BeanShellFormula.class)
			return paramType.getSimpleName();
		else
			return paramType.getName();
	}
}
