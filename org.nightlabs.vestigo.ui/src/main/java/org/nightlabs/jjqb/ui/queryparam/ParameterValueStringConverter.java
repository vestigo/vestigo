package org.nightlabs.jjqb.ui.queryparam;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public interface ParameterValueStringConverter
{
	String parameterValueObjectToString(Object valueObject);

	Object parameterValueStringToObject(Class<?> parameterType, String valueString);
}
