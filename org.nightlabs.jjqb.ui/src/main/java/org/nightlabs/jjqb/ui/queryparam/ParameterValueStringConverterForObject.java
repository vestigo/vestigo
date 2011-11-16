package org.nightlabs.jjqb.ui.queryparam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
class ParameterValueStringConverterForObject extends AbstractParameterValueStringConverter
{
	@Override
	public String parameterValueObjectToString(Object valueObject) {
		return valueObject.toString();
	}

	@Override
	public Object parameterValueStringToObject(Class<?> parameterType, String valueString) {
		Object valueObject = null;

		valueObject = parameterValueStringToObject_valueOf(parameterType, valueString);
		if (valueObject != null)
			return valueObject;

		valueObject = parameterValueStringToObject_fromString(parameterType, valueString);
		if (valueObject != null)
			return valueObject;

		valueObject = parameterValueStringToObject_constructor(parameterType, valueString);
		if (valueObject != null)
			return valueObject;

		throw new IllegalStateException("This class provides no known way to create an instance from a string: " + parameterType.getName());

	}

	private static final Object parameterValueStringToObject_constructor(Class<?> parameterType, String valueString)
	{
		Constructor<?> constructor;
		try {
			constructor = parameterType.getConstructor(String.class);
		} catch (NoSuchMethodException e) {
			return null;
		}

		try {
			Object valueObject = constructor.newInstance(valueString);
			return valueObject;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static final Object parameterValueStringToObject_fromString(Class<?> parameterType, String valueString)
	{
		Method method;
		try {
			method = parameterType.getMethod("fromString", String.class);
		} catch (NoSuchMethodException e) {
			return null;
		}

		try {
			Object valueObject = method.invoke(null, valueString);
			return valueObject;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static final Object parameterValueStringToObject_valueOf(Class<?> parameterType, String valueString)
	{
		Method method;
		try {
			method = parameterType.getMethod("valueOf", String.class);
		} catch (NoSuchMethodException e) {
			return null;
		}

		try {
			Object valueObject = method.invoke(null, valueString);
			return valueObject;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}