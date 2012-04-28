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
package org.nightlabs.vestigo.ui.transientconnectionproperties;

import java.util.Properties;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.nightlabs.vestigo.core.transientconnectionproperties.AbstractTransientConnectionPropertiesProvider;

public class DefaultTransientConnectionPropertiesProvider extends AbstractTransientConnectionPropertiesProvider
{
	@Override
	public Properties obtainConnectionProperties() throws OperationCanceledException
	{
		if (getConnectionPropertyKeys() == null || getConnectionPropertyKeys().isEmpty())
			return null;

		final Properties[] result = new Properties[1];
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				Shell shell = null;
				if (PlatformUI.getWorkbench() != null && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null)
					shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

				TransientConnectionPropertiesProviderDialog dialog = createPropertiesProviderDialog(shell);
				if (Dialog.OK == dialog.open()) {
					result[0] = dialog.getProperties();
				}
			}
		});

		if (result[0] == null)
			throw new OperationCanceledException("User cancelled.");

		return result[0];
	}

	protected TransientConnectionPropertiesProviderDialog createPropertiesProviderDialog(Shell shell)
	{
		return new TransientConnectionPropertiesProviderDialog(shell, DefaultTransientConnectionPropertiesProvider.this, createPreferencePage());
	}

	protected PreferencePage createPreferencePage()
	{
		return new DefaultPropertiesProviderPreferencePage(this);
	}
}
