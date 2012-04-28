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
package org.nightlabs.vestigo.ui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.preference.IPreferenceStore;
import org.nightlabs.vestigo.core.PropertiesWithChangeSupport;
import org.osgi.framework.BundleContext;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class VestigoUIPlugin extends AbstractVestigoUIPlugin
{
	public static final String BUNDLE_SYMBOLIC_NAME = "org.nightlabs.vestigo.ui"; //$NON-NLS-1$

	// The shared instance
	private static VestigoUIPlugin plugin;

	private Map<String, PropertiesWithChangeSupport> propertiesScope2Properties = new HashMap<String, PropertiesWithChangeSupport>();

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Get the shared instance.
	 * @return the shared instance.
	 */
	public static VestigoUIPlugin getDefault() {
		return plugin;
	}

	public synchronized PropertiesWithChangeSupport getProperties(String propertiesScope)
	{
		PropertiesWithChangeSupport properties = propertiesScope2Properties.get(propertiesScope);
		if (properties != null)
			return properties;

		properties = readPropertiesFromPreferenceStore(propertiesScope);
		propertiesScope2Properties.put(propertiesScope, properties);
		return properties;
	}

	private PropertiesWithChangeSupport readPropertiesFromPreferenceStore(final String preferenceKey)
	{
//		getStateLocation();
		final IPreferenceStore preferenceStore = getPreferenceStore();

		final PropertiesWithChangeSupport properties = readPropertiesFromString(
				preferenceStore.getString(preferenceKey)
		);

		PropertyChangeListener propertyChangeListener = new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				preferenceStore.setValue(
						preferenceKey,
						writePropertiesToString(properties)
				);
			}
		};
		properties.addPropertyChangeListener(propertyChangeListener);

		return properties;
	}

	private PropertiesWithChangeSupport readPropertiesFromString(String data)
	{
		PropertiesWithChangeSupport properties = new PropertiesWithChangeSupport();
		Reader reader = new StringReader(data);
		try {
			properties.load(reader);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return properties;
	}

	private String writePropertiesToString(PropertiesWithChangeSupport properties)
	{
		StringWriter writer = new StringWriter();
		try {
			properties.store(writer, null); // "JDO/JPA Query Browser");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return writer.toString();
	}
}
