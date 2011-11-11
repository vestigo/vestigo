package org.nightlabs.eclipse.jjqb.core;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesWithChangeSupport extends Properties
{
	private static final long serialVersionUID = 1L;

	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	public PropertiesWithChangeSupport() { }

	public PropertiesWithChangeSupport(Properties defaults) {
		super(defaults);
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(propertyName, listener);
	}

	@Override
	public synchronized Object setProperty(String key, String value) {
		Object previous = super.setProperty(key, value);
		propertyChangeSupport.firePropertyChange(key, previous, value);
		return previous;
	}

	@Override
	public synchronized Object put(Object key, Object value) {
		Object previous = super.put(key, value);
		propertyChangeSupport.firePropertyChange(String.valueOf(key), previous, value);
		return previous;
	}

	@Override
	public synchronized Object remove(Object key) {
		Object previous = super.remove(key);
		propertyChangeSupport.firePropertyChange(String.valueOf(key), previous, null);
		return previous;
	}

	@Override
	public synchronized void putAll(Map<? extends Object, ? extends Object> t) {
//		super.putAll(t);
		for (Map.Entry<?, ?> me : t.entrySet())
			put(me.getKey(), me.getValue());
	}

	@Override
	public synchronized void clear()
	{
		Map<?, ?> previousMap = new HashMap<Object, Object>(this);

		super.clear();

		for (Map.Entry<?, ?> me : previousMap.entrySet())
			propertyChangeSupport.firePropertyChange(String.valueOf(me.getKey()), me.getValue(), null);
	}
}
