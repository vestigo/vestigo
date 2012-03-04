package org.nightlabs.jjqb.core.oda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ConnectionProfileRegistry
{
	private static ConnectionProfileRegistry sharedInstance = new ConnectionProfileRegistry();

	public static ConnectionProfileRegistry sharedInstance() {
		return sharedInstance;
	}

	// TODO I think we need to remove instances from here again?! This currently prevents garbage collection! Marco :-)
	private Map<String, ConnectionProfile> profileID2connectionProfile = new HashMap<String, ConnectionProfile>();

	public synchronized ConnectionProfile getConnectionProfile(String profileID)
	{
		if (profileID == null)
			throw new IllegalArgumentException("profileID == null");

		return profileID2connectionProfile.get(profileID);
	}

	public synchronized ConnectionProfile getConnectionProfile(Class<? extends Connection> connectionClass, String profileID)
	{
		if (connectionClass == null)
			throw new IllegalArgumentException("connectionClass == null");

		if (profileID == null)
			throw new IllegalArgumentException("profileID == null");

		ConnectionProfile result = profileID2connectionProfile.get(profileID);
		if (result == null) {

			final IExtensionRegistry registry = Platform.getExtensionRegistry();
			if (registry == null)
				throw new IllegalStateException("Platform.getExtensionRegistry() returned null!");

			final String extensionPointId = "org.nightlabs.jjqb.core.connectionProfile";
			final IExtensionPoint extensionPoint = registry.getExtensionPoint(extensionPointId);
			if (extensionPoint == null)
				throw new IllegalStateException("Unable to resolve extension-point: " + extensionPointId); //$NON-NLS-1$

			SortedMap<Integer, List<IConfigurationElement>> priority2configurationElement = new TreeMap<Integer, List<IConfigurationElement>>();

			final IExtension[] extensions = extensionPoint.getExtensions();
			for (final IExtension extension : extensions) {
				final IConfigurationElement[] elements = extension.getConfigurationElements();
				for (final IConfigurationElement element : elements) {
					String extConnectionType = element.getAttribute("connectionType");
					if (!matchesConnectionClass(connectionClass, extConnectionType))
						continue;

					String priorityStr = element.getAttribute("priority");
					Integer priority;
					if (priorityStr == null || priorityStr.isEmpty())
						priority = 500;
					else
						priority = Integer.valueOf(priorityStr);

					List<IConfigurationElement> configurationElements = priority2configurationElement.get(priority);
					if (configurationElements == null) {
						configurationElements = new ArrayList<IConfigurationElement>();
						priority2configurationElement.put(priority, configurationElements);
					}
					configurationElements.add(element);
				}
			}

			if (priority2configurationElement.isEmpty())
				throw new IllegalStateException("There is no plug-in contributing a connectionProfile for the connectionClass \"" + connectionClass.getName() + "\" (extension-point \"" + extensionPointId + "\")!!!");

			Integer highestPriority = priority2configurationElement.lastKey();
			List<IConfigurationElement> configurationElements = priority2configurationElement.get(highestPriority);

			IConfigurationElement element = configurationElements.get(0);

			Object executableExtension;
			try {
				executableExtension = element.createExecutableExtension("class");
			} catch (CoreException e) {
				throw new IllegalStateException("Could not create executable extension for class \"" + element.getAttribute("class") + "\"!!! Extension registered in bundle \"" + element.getContributor().getName() + "\". Cause: " + e, e);
			}

			if (!(executableExtension instanceof ConnectionProfile))
				throw new ClassCastException("Class \"" + element.getAttribute("class") + "\" does not implement interface \"" + ConnectionProfile.class.getName() + "\"!!! Extension registered in bundle \"" + element.getContributor().getName() + "\".");

			result = (ConnectionProfile) executableExtension;
			result.setProfileID(profileID);
			profileID2connectionProfile.put(profileID, result);
		}

		return result;
	}

	private boolean matchesConnectionClass(Class<? extends Connection> connectionClass, String classOrInterfaceToMatch)
	{
		Class<?> c = connectionClass;
		while (c != null)
		{
			if (classOrInterfaceToMatch.equals(c.getName()))
				return true;

			for (Class<?> interfaze: c.getInterfaces()) {
				if (matchesInterface(interfaze, classOrInterfaceToMatch))
					return true;
			}

			c = c.getSuperclass();
		}

		return false;
	}

	private boolean matchesInterface(Class<?> interfaze, String classOrInterfaceToMatch)
	{
		if (classOrInterfaceToMatch.equals(interfaze.getName()))
			return true;

		for (Class<?> i: interfaze.getInterfaces()) {
			if (matchesInterface(i, classOrInterfaceToMatch))
				return true;
		}

		return false;
	}

}
