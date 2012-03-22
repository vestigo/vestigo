package org.nightlabs.jjqb.core.connectionpropertiesfilter;

import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class ConnectionPropertiesFilterManager
{
	private static final String extensionPointId_connectionPropertiesFilter = "org.nightlabs.jjqb.core.connectionPropertiesFilter";

	public void filterConnectionProperties(Properties connectionProperties)
	{
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		if (registry == null)
			throw new IllegalStateException("Platform.getExtensionRegistry() returned null!");

		final String extensionPointId = extensionPointId_connectionPropertiesFilter;
		final IExtensionPoint extensionPoint = registry.getExtensionPoint(extensionPointId);
		if (extensionPoint == null)
			throw new IllegalStateException("Unable to resolve extension-point: " + extensionPointId); //$NON-NLS-1$

		// We sort the filters to avoid Heisenbugs. We might later add a priority (orderHint), if needed.
		SortedMap<String, ConnectionPropertiesFilter> sortedFilters = new TreeMap<String, ConnectionPropertiesFilter>();
		for (final IExtension extension : extensionPoint.getExtensions()) {
			final IConfigurationElement[] elements = extension.getConfigurationElements();
			for (final IConfigurationElement element : elements) {
				Object executableExtension;
				try {
					executableExtension = element.createExecutableExtension("class");
				} catch (CoreException e) {
					throw new RuntimeException("Could not create executable extension for class \"" + element.getAttribute("class") + "\"!!! Extension registered in bundle \"" + element.getContributor().getName() + "\". Cause: " + e, e);
				}

				if (!(executableExtension instanceof ConnectionPropertiesFilter))
					throw new RuntimeException("Executable extension of type \"" + element.getAttribute("class") + "\" does not implement \"" + ConnectionPropertiesFilter.class.getName() + "\"!!! Extension registered in bundle \"" + element.getContributor().getName() + "\".");

				ConnectionPropertiesFilter filter = (ConnectionPropertiesFilter) executableExtension;
				sortedFilters.put(filter.getClass().getName(), filter);
//				filter.setConnectionProfile(this);
			}
		}

		for (ConnectionPropertiesFilter filter : sortedFilters.values())
			filter.filter(connectionProperties);
	}
}
