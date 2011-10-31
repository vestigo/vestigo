package org.nightlabs.eclipse.jjqb.core.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.nightlabs.eclipse.jjqb.core.AbstractConnectionExtensionFactory;
import org.nightlabs.eclipse.jjqb.core.Connection;
import org.nightlabs.eclipse.jjqb.core.ConnectionExtension;

public class DefaultConnectionExtensionFactory extends AbstractConnectionExtensionFactory {

	private IConfigurationElement configurationElement;

	public DefaultConnectionExtensionFactory(IConfigurationElement configurationElement) {
		if (configurationElement == null)
			throw new IllegalArgumentException("configurationElement == null");

		this.configurationElement = configurationElement;
	}

	@Override
	public ConnectionExtension createConnectionExtension(Connection connection) {
		try {
			return (ConnectionExtension) configurationElement.createExecutableExtension("class");
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
	}

}
