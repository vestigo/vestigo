package org.nightlabs.eclipse.jjqb.core.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.nightlabs.eclipse.jjqb.core.AbstractConnectionExtensionFactory;
import org.nightlabs.eclipse.jjqb.core.IConnection;
import org.nightlabs.eclipse.jjqb.core.IConnectionExtension;

public class DefaultConnectionExtensionFactory extends AbstractConnectionExtensionFactory {

	private IConfigurationElement configurationElement;

	public DefaultConnectionExtensionFactory(IConfigurationElement configurationElement) {
		if (configurationElement == null)
			throw new IllegalArgumentException("configurationElement == null");

		this.configurationElement = configurationElement;
	}

	@Override
	public IConnectionExtension createConnectionExtension(IConnection connection) {
		try {
			return (IConnectionExtension) configurationElement.createExecutableExtension("class");
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
	}

}
