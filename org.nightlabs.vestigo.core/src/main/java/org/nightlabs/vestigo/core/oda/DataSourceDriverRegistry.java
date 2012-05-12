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
package org.nightlabs.vestigo.core.oda;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.datatools.connectivity.oda.IDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataSourceDriverRegistry
{
	private static final Logger logger = LoggerFactory.getLogger(DataSourceDriverRegistry.class);

	private static DataSourceDriverRegistry sharedInstance;

	public static synchronized DataSourceDriverRegistry sharedInstance()
	{
		if (sharedInstance == null) {
			DataSourceDriverRegistry r = new DataSourceDriverRegistry();
			r.process();
			sharedInstance = r;
		}
		return sharedInstance;
	}

	private Map<String, Class<? extends IDriver>> providerID2driverClass = new HashMap<String, Class<? extends IDriver>>();

	private DataSourceDriverRegistry() { }

	protected String getExtensionPointID() {
		return "org.eclipse.datatools.connectivity.oda.dataSource"; //$NON-NLS-1$
	}

	private void process()
	{
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		if (registry == null)
			throw new IllegalStateException("Platform.getExtensionRegistry() returned null!"); //$NON-NLS-1$

		final IExtensionPoint extensionPoint = registry.getExtensionPoint(getExtensionPointID());
		if (extensionPoint == null)
			throw new IllegalStateException("Unable to resolve extension-point: " + getExtensionPointID()); //$NON-NLS-1$

		final IExtension[] extensions = extensionPoint.getExtensions();
		// For each extension ...
		for (final IExtension extension : extensions) {
			final IConfigurationElement[] elements = extension.getConfigurationElements();
			// For each member of the extension ...
			for (final IConfigurationElement element : elements) {
				try {
					processElement(extension, element);
				} catch (final Throwable e) { // we must catch Throwable instead of Exception since we often have NoClassDefFoundErrors (during first start or when server's class configuration changes)
					// Only log the error and continue
					logger.error("Error processing extension element. The element is located in an extension in bundle: " + extension.getNamespaceIdentifier(), e); //$NON-NLS-1$
				}
			}
		}
	}

	private void processElement(IExtension extension, IConfigurationElement element) throws Exception
	{
		if ("dataSource".equals(element.getName())) { //$NON-NLS-1$
			String providerID = element.getAttribute("id"); //$NON-NLS-1$
			Object instance = element.createExecutableExtension("driverClass"); //$NON-NLS-1$
			if (! (instance instanceof IDriver))
				throw new IllegalStateException("Class \"" + element.getAttribute("driverClass") + "\" registered as 'driverClass' in plug-in \"" + element.getContributor().getName() + "\" for extension-point \""+ getExtensionPointID() +"\" does not implement interface \"" + IDriver.class.getName() + "\"!"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$

			IDriver driverInstance = (IDriver) instance;
			Class<? extends IDriver> driverClass = driverInstance.getClass();
			providerID2driverClass.put(providerID, driverClass);
		}
	}

	public Class<? extends IDriver> getDriverClassForProviderID(String providerID)
	{
		Class<? extends IDriver> result = providerID2driverClass.get(providerID);
		return result;
	}
}
