package org.nightlabs.vestigo.ui.oda;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class QueryFileExtensionRegistry
{
	private QueryFileExtensionRegistry() { }

	public static String getFileExtension(String providerID) throws CoreException
	{
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		if (registry == null)
			throw new IllegalStateException("Platform.getExtensionRegistry() returned null!");

		final String extensionPointId = "org.nightlabs.vestigo.ui.queryFileExtension";
		final IExtensionPoint extensionPoint = registry.getExtensionPoint(extensionPointId);
		if (extensionPoint == null)
			throw new IllegalStateException("Unable to resolve extension-point: " + extensionPointId); //$NON-NLS-1$

		final IExtension[] extensions = extensionPoint.getExtensions();
		for (final IExtension extension : extensions) {
			final IConfigurationElement[] elements = extension.getConfigurationElements();
			for (final IConfigurationElement element : elements) {
				String extProviderID = element.getAttribute("providerID");
				if (!providerID.equals(extProviderID))
					continue;

				String fileExtension = element.getAttribute("fileExtension");
				if (fileExtension != null && !fileExtension.isEmpty())
					return fileExtension;
			}
		}

		throw new IllegalStateException("There is no extension for extensionPoint='" + extensionPointId + "' and providerID='" + providerID + "'!");
	}
}
