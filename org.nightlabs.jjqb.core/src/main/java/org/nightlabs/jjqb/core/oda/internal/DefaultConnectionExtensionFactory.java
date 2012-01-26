package org.nightlabs.jjqb.core.oda.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.nightlabs.jjqb.core.oda.AbstractConnectionExtensionFactory;
import org.nightlabs.jjqb.core.oda.Connection;
import org.nightlabs.jjqb.core.oda.ConnectionExtension;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
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
