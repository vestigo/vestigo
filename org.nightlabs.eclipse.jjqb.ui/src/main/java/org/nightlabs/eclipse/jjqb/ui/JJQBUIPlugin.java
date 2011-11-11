package org.nightlabs.eclipse.jjqb.ui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.nightlabs.eclipse.jjqb.core.PropertiesWithChangeSupport;
import org.osgi.framework.BundleContext;

public class JJQBUIPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "TestProject"; //$NON-NLS-1$

	// The shared instance
	private static JJQBUIPlugin plugin;

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
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static JJQBUIPlugin getDefault() {
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
		JJQBUIPlugin plugin = JJQBUIPlugin.getDefault();
		final IPreferenceStore preferenceStore = plugin.getPreferenceStore();

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
			properties.store(writer, "JDO/JPA Query Browser");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return writer.toString();
	}
}
