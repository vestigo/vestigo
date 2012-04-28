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
package org.nightlabs.vestigo.childvm.webapp.script;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Scope
{
	private Map<String, Object> map = new HashMap<String, Object>();
	private Map<String, Object> readOnlyCopy = null;

	public synchronized int size() {
		return map.size();
	}

	public synchronized boolean isEmpty() {
		return map.isEmpty();
	}

	public synchronized Object get(String key) {
		return map.get(key);
	}

	public synchronized boolean containsKey(String key) {
		return map.containsKey(key);
	}

	public synchronized Object put(String key, Object value) {
		readOnlyCopy = null;
		return map.put(key, value);
	}

	public synchronized void putAll(Map<? extends String, ? extends Object> m) {
		readOnlyCopy = null;
		map.putAll(m);
	}

	public synchronized Object remove(String key) {
		readOnlyCopy = null;
		return map.remove(key);
	}

	public synchronized void clear() {
		readOnlyCopy = null;
		map.clear();
	}

	public synchronized boolean containsValue(Object value) {
		return map.containsValue(value);
	}

	public synchronized Set<String> keySet() {
		return getReadOnlyCopy().keySet();
	}

	public synchronized Collection<Object> values() {
		return getReadOnlyCopy().values();
	}

	public synchronized Set<java.util.Map.Entry<String, Object>> entrySet() {
		return getReadOnlyCopy().entrySet();
	}

	@Override
	public synchronized boolean equals(Object o)
	{
		if (o instanceof Scope)
			return map.equals(((Scope)o).map);

		return map.equals(o);
	}

	@Override
	public synchronized int hashCode() {
		return map.hashCode();
	}

	@Override
	public synchronized String toString() {
		return map.toString();
	}

	private synchronized Map<String, Object> getReadOnlyCopy() {
		if (readOnlyCopy == null)
			readOnlyCopy = Collections.unmodifiableMap(new HashMap<String, Object>(map));

		return readOnlyCopy;
	}
}
