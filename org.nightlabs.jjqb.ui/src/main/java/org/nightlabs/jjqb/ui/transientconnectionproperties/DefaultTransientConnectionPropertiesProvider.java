package org.nightlabs.jjqb.ui.transientconnectionproperties;

import java.util.Properties;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.nightlabs.jjqb.core.transientconnectionproperties.AbstractTransientConnectionPropertiesProvider;

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

				PropertiesProviderDialog dialog = createPropertiesProviderDialog(shell);
				if (Dialog.OK == dialog.open()) {
					result[0] = dialog.getProperties();
				}
			}
		});

		if (result[0] == null)
			throw new OperationCanceledException("User cancelled.");

		return result[0];
	}

	protected PropertiesProviderDialog createPropertiesProviderDialog(Shell shell)
	{
		return new PropertiesProviderDialog(shell, DefaultTransientConnectionPropertiesProvider.this, createPreferencePage());
	}

	protected PreferencePage createPreferencePage()
	{
		return new DefaultPropertiesProviderPreferencePage(this);
	}
}
