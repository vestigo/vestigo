package org.nightlabs.jjqb.ui.queryparam;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryParameter
implements Serializable, Comparable<QueryParameter>
{
	private static final long serialVersionUID = 1L;

	private static Map<Class<?>, ParameterValueStringConverter> queryParameterType2ParameterValueStringConverter;
	static {
		Map<Class<?>, ParameterValueStringConverter> m = new HashMap<Class<?>, ParameterValueStringConverter>();
		m.put(Object.class, new ParameterValueStringConverterForObject());
		m.put(Calendar.class, new ParameterValueStringConverterForCalendar());
		m.put(Date.class, new ParameterValueStringConverterForDate());
		queryParameterType2ParameterValueStringConverter = Collections.unmodifiableMap(m);
	}

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
		if (oldIndex == index)
			return;

		this.index = index;
		propertyChangeSupport.firePropertyChange(PropertyName.index.name(), oldIndex, index);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		String oldName = this.name;
		if (oldName == name)
			return;

		this.name = name;
		propertyChangeSupport.firePropertyChange(PropertyName.name.name(), oldName, name);
	}
	public Class<?> getType() {
		return type;
	}
	public void setType(Class<?> type) {
		Class<?> oldType = this.type;
		if (oldType == type)
			return;

		this.type = type;
		propertyChangeSupport.firePropertyChange(PropertyName.type.name(), oldType, type);
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		Object oldValue = this.value;
		if (oldValue == value)
			return;

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
			return PropertiesUtil.NULL_VALUE;

		ParameterValueStringConverter converter = getParameterValueStringConverter(value.getClass());
		return converter.parameterValueObjectToString(value);
	}

	public static final Object parameterValueStringToObject(Class<?> parameterType, String valueString)
	{
		if (parameterType == null)
			throw new IllegalArgumentException("parameterType == null");

		if (valueString == null)
			return null;

		if (PropertiesUtil.NULL_VALUE.equals(valueString))
			return null;

		ParameterValueStringConverter converter = getParameterValueStringConverter(parameterType);
		return converter.parameterValueStringToObject(parameterType, valueString);
	}

	private static ParameterValueStringConverter getParameterValueStringConverter(Class<?> queryParameterType)
	{
		Class<?> clazz = queryParameterType;
		while (clazz != null) {
			ParameterValueStringConverter converter = queryParameterType2ParameterValueStringConverter.get(clazz);
			if (converter != null)
				return converter;

			for (Class<?> iface : clazz.getInterfaces()) {
				converter = queryParameterType2ParameterValueStringConverter.get(iface);
				if (converter != null)
					return converter;
			}

			clazz = clazz.getSuperclass();
		}
		throw new IllegalArgumentException("There is no CellEditor registered for queryParameterType=" + (queryParameterType == null ? null : queryParameterType.getName()) + " or one of its super-classes or interfaces!");
	}
}
