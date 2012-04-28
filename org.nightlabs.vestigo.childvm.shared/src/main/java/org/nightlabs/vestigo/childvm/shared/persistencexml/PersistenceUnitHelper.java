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
package org.nightlabs.vestigo.childvm.shared.persistencexml;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.Persistence;
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.Persistence.PersistenceUnit;
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.Persistence.PersistenceUnit.Properties.Property;

public abstract class PersistenceUnitHelper
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void populatePropertiesFromPersistenceUnit(Properties toProperties, PersistenceUnit fromPersistenceUnit)
	{
		populatePropertiesFromPersistenceUnit((Map)toProperties, fromPersistenceUnit);
	}

	public void populatePropertiesFromPersistenceUnit(Map<String, String> toProperties, PersistenceUnit fromPersistenceUnit)
	{
		if (fromPersistenceUnit.getProperties() != null) {
			for (Property p : fromPersistenceUnit.getProperties().getProperty()) {
				if (p != null && p.getName() != null && p.getValue() != null)
					toProperties.put(p.getName(), p.getValue());
			}
		}

		populateSpecialPropertiesFromPersistenceUnit(toProperties, fromPersistenceUnit);
	}

	public void populatePersistenceUnitFromProperties(PersistenceUnit toPersistenceUnit, Properties fromProperties)
	{
		populatePersistenceUnitFromProperties(toPersistenceUnit, PropertiesUtil.filterProperties(fromProperties));
	}

	public void populatePersistenceUnitFromProperties(PersistenceUnit toPersistenceUnit, Map<String, String> fromProperties)
	{
		if (toPersistenceUnit.getProperties() == null)
			toPersistenceUnit.setProperties(new Persistence.PersistenceUnit.Properties());

		// The implementations of populatePersistenceUnitFromSpecialProperties(...) are supposed to remove
		// all properties they already consumed. Hence we must clone the input in order to prevent modifying it! We should
		// only modify the output - never the input.
		fromProperties = new HashMap<String, String>(fromProperties);

		// Handle special properties (that have their place in the persistence-unit elsewhere) first.
		populatePersistenceUnitFromSpecialProperties(toPersistenceUnit, fromProperties);

		for (Map.Entry<?, ?> me : fromProperties.entrySet()) {
			Object key = me.getKey();
			Object value = me.getValue();

			if (key == null)
				continue; // silently ignore null-keys

			Property property = findProperty(toPersistenceUnit.getProperties(), key.toString());
			if (property == null) {
				if (value == null)
					continue; // the property in the PU does not exist and does not need to be created

				property = new Property();
				property.setName(key.toString());
				toPersistenceUnit.getProperties().getProperty().add(property);
			}

			if (value == null) {
				// the property in the PU does exist and needs to be removed.
				toPersistenceUnit.getProperties().getProperty().remove(property);
			}
			else
				property.setValue(value.toString());
		}
	}

	protected abstract void populateSpecialPropertiesFromPersistenceUnit(Map<String, String> toProperties, PersistenceUnit fromPersistenceUnit);

	protected abstract void populatePersistenceUnitFromSpecialProperties(PersistenceUnit toPersistenceUnit, Map<String, String> fromProperties);

	private Property findProperty(Persistence.PersistenceUnit.Properties persistenceUnitProperties, String key) {
		for (Property property : persistenceUnitProperties.getProperty()) {
			if (key.equals(property.getName()))
				return property;
		}
		return null;
	}

	protected static void setPropertyIfNotNullAndNotEmpty(Map<String, String> properties, String key, String value) {
		if (value != null && !value.trim().isEmpty())
			properties.put(key, value);
	}

	protected static void setPropertyIfNotNullAndNotEmpty(Map<String, String> properties, String key, Enum<?> value) {
		if (value != null)
			setPropertyIfNotNullAndNotEmpty(properties, key, value.name());
	}

	protected static String consumeProperty(Map<String, String> properties, String key, boolean[] consumedFlag)
	{
		if (consumedFlag == null)
			throw new IllegalArgumentException("consumedFlag == null");

		if (consumedFlag.length != 1)
			throw new IllegalArgumentException("consumedFlag.length != 1");

		consumedFlag[0] = false;

		String result = properties.get(key);

		if (properties.containsKey(key)) {
			consumedFlag[0] = true;
			properties.put(key, null);
		}

		return result;
	}

	protected static <E extends Enum<E>> E consumeProperty(Map<String, String> properties, String key, Class<E> e, boolean[] consumedFlag)
	{
		String sval = consumeProperty(properties, key, consumedFlag);
		if (sval == null)
			return null;

		return Enum.valueOf(e, sval);
	}
}
