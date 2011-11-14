package org.nightlabs.eclipse.jjqb.core;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertiesWithChangeSupport extends Properties
{
	private static final Logger logger = LoggerFactory.getLogger(PropertiesWithChangeSupport.class);
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

	private String getInstanceID() {
		return Integer.toHexString(System.identityHashCode(this));
	}

	@Override
	public synchronized Object setProperty(String key, String value) {
		Object previous = super.setProperty(key, value);
		logger.info("[{}]setProperty: key={} value={} previous={}", new Object[] { getInstanceID(), key, value, previous });
		propertyChangeSupport.firePropertyChange(key, previous, value);
		return previous;
	}

	@Override
	public String getProperty(String key) {
		String value = super.getProperty(key);
		logger.info("[{}]getProperty: key={} value={}", new Object[] { getInstanceID(), key, value });
		return value;
	}

	@Override
	public synchronized Object put(Object key, Object value) {
		Object previous = super.put(key, value);
		logger.info("[{}]put: key={} value={} previous={}", new Object[] { getInstanceID(), key, value, previous });
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
