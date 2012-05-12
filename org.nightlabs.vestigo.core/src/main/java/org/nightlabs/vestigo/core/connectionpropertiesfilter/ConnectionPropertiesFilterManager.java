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
package org.nightlabs.vestigo.core.connectionpropertiesfilter;

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
	private static final String extensionPointId_connectionPropertiesFilter = "org.nightlabs.vestigo.core.connectionPropertiesFilter"; //$NON-NLS-1$

	public void filterConnectionProperties(Properties connectionProperties)
	{
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		if (registry == null)
			throw new IllegalStateException("Platform.getExtensionRegistry() returned null!"); //$NON-NLS-1$

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
					executableExtension = element.createExecutableExtension("class"); //$NON-NLS-1$
				} catch (CoreException e) {
					throw new RuntimeException("Could not create executable extension for class \"" + element.getAttribute("class") + "\"!!! Extension registered in bundle \"" + element.getContributor().getName() + "\". Cause: " + e, e); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				}

				if (!(executableExtension instanceof ConnectionPropertiesFilter))
					throw new RuntimeException("Executable extension of type \"" + element.getAttribute("class") + "\" does not implement \"" + ConnectionPropertiesFilter.class.getName() + "\"!!! Extension registered in bundle \"" + element.getContributor().getName() + "\"."); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$

				ConnectionPropertiesFilter filter = (ConnectionPropertiesFilter) executableExtension;
				sortedFilters.put(filter.getClass().getName(), filter);
//				filter.setConnectionProfile(this);
			}
		}

		for (ConnectionPropertiesFilter filter : sortedFilters.values())
			filter.filter(connectionProperties);
	}
}
