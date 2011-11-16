package org.nightlabs.jjqb.childvm.shared;

import java.util.Map;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class MapEntry
{
	private Object key;
	private Object value;

	public MapEntry(Map.Entry<?, ?> mapEntry) {
		this.key = mapEntry.getKey();
		this.value = mapEntry.getValue();
	}

	public Object getKey() {
		return key;
	}
	public Object getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(key) + " => " + String.valueOf(value);
	}
}
