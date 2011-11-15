package org.nightlabs.jjqb.ui.queryparam;

public interface ParameterValueStringConverter
{
	String parameterValueObjectToString(Object valueObject);

	Object parameterValueStringToObject(Class<?> parameterType, String valueString);
}
