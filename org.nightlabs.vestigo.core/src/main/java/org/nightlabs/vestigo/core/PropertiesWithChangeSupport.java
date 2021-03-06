/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.core;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
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
		logger.info("[{}]setProperty: key={} value={} previous={}", new Object[] { getInstanceID(), key, value, previous }); //$NON-NLS-1$
		propertyChangeSupport.firePropertyChange(key, previous, value);
		return previous;
	}

	@Override
	public String getProperty(String key) {
		String value = super.getProperty(key);
		logger.info("[{}]getProperty: key={} value={}", new Object[] { getInstanceID(), key, value }); //$NON-NLS-1$
		return value;
	}

	@Override
	public synchronized Object put(Object key, Object value) {
		Object previous = super.put(key, value);
		logger.info("[{}]put: key={} value={} previous={}", new Object[] { getInstanceID(), key, value, previous }); //$NON-NLS-1$
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
