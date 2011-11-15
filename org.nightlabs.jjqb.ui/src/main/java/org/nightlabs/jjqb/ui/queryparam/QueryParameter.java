package org.nightlabs.jjqb.ui.queryparam;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryParameter
implements Serializable, Comparable<QueryParameter>
{
	private static final long serialVersionUID = 1L;

	public enum PropertyName {
		index,
		name,
		type,
		value
	}

	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	private UUID queryParameterID;
	private int index;
	private String name;
	private Class<?> type;
	private Object value;

	public QueryParameter(UUID queryParameterID, int index)
	{
		if (queryParameterID == null)
			throw new IllegalArgumentException("queryParameterID == null");

		this.queryParameterID = queryParameterID;
		this.index = index;
	}

	public UUID getQueryParameterID() {
		return queryParameterID;
	}

	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		int oldIndex = this.index;
		this.index = index;
		propertyChangeSupport.firePropertyChange(PropertyName.index.name(), oldIndex, index);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		String oldName = this.name;
		this.name = name;
		propertyChangeSupport.firePropertyChange(PropertyName.name.name(), oldName, name);
	}
	public Class<?> getType() {
		return type;
	}
	public void setType(Class<?> type) {
		Class<?> oldType = this.type;
		this.type = type;
		propertyChangeSupport.firePropertyChange(PropertyName.type.name(), oldType, type);
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		Object oldValue = this.value;
		this.value = value;
		propertyChangeSupport.firePropertyChange(PropertyName.value.name(), oldValue, value);
	}

	@Override
	public int compareTo(QueryParameter o) {
		int result = this.index < o.index ? -1 : (this.index == o.index ? 0 : 1);
		if (result != 0)
			return result;

		String n1 = this.name == null ? "" : this.name;
		String n2 = o.name == null ? "" : o.name;
		result = n1.compareTo(n2);

		return result;
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(PropertyName propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName.name(), listener);
	}

	public void removePropertyChangeListener(PropertyName propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(propertyName.name(), listener);
	}

	public static final String parameterValueObjectToString(Object value)
	{
		if (value == null)
			return "_NULL_";

		if (value instanceof Calendar) {
			Calendar calendar = (Calendar) value;
			DateFormat dateFormat = getDateFormatWithTimeZone(calendar.getTimeZone());
			synchronized (dateFormat) {
				return dateFormat.format(calendar.getTime()) + ' ' + calendar.getTimeZone().getID();
			}
		}

		if (value instanceof Date) {
			synchronized (DATE_FORMAT_UTC) {
				return DATE_FORMAT_UTC.format((Date)value);
			}
		}

		return value.toString();
	}

	protected static DateFormat getDateFormatWithTimeZone(TimeZone timeZone)
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		dateFormat.setTimeZone(timeZone);
		return dateFormat;
	}

	private static final DateFormat DATE_FORMAT_UTC = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	static {
		DATE_FORMAT_UTC.setTimeZone(TimeZone.getTimeZone("UTC"));
	}

	public static final Object parameterValueStringToObject(Class<?> parameterType, String valueString)
	{
		if (parameterType == null)
			throw new IllegalArgumentException("parameterType == null");

		if (valueString == null)
			return null;

		if ("_NULL_".equals(valueString))
			return null;

		if (parameterType == Calendar.class) {
			TimeZone timeZone = parseTimeZone(valueString);
			DateFormat dateFormat = getDateFormatWithTimeZone(timeZone);
			try {
				synchronized (dateFormat) {
					Date date = dateFormat.parse(parseDateAndTimeWithoutTimeZone(valueString));
					Calendar calendar = Calendar.getInstance(timeZone);
					calendar.setTime(date);
					return calendar;
				}
			} catch (ParseException e) {
				throw new RuntimeException(e);
			}
		}

		if (parameterType == Date.class) {
			try {
				synchronized (DATE_FORMAT_UTC) {
					return DATE_FORMAT_UTC.parse(valueString);
				}
			} catch (ParseException e) {
				throw new RuntimeException(e);
			}
		}

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

	private static String parseDateAndTimeWithoutTimeZone(String valueString) {
		Matcher matcher = Pattern.compile("([^ ]* [^ ]*) [^ ]*").matcher(valueString);
		if (!matcher.matches())
			throw new IllegalArgumentException("valueString \"" + valueString + "\" does not match format pattern.");

		String result = matcher.group(1);
		return result;
	}

	private static TimeZone parseTimeZone(String valueString) {
		Matcher matcher = Pattern.compile("[^ ]* [^ ]* ([^ ]*)").matcher(valueString);
		if (!matcher.matches())
			throw new IllegalArgumentException("valueString \"" + valueString + "\" does not match format pattern.");

		String timeZoneID = matcher.group(1);
		TimeZone timeZone = TimeZone.getTimeZone(timeZoneID);
		return timeZone;
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
