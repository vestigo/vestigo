package org.nightlabs.jjqb.ui.childvm;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.nightlabs.jjqb.core.JJQBCorePlugin;
import org.nightlabs.jjqb.core.childvm.internal.ChildVMServer;

public class ChildVMPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private Display display;

	public ChildVMPreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench)
	{
		display = workbench.getDisplay();
		setPreferenceStore(new ScopedPreferenceStore(new InstanceScope(), JJQBCorePlugin.BUNDLE_SYMBOLIC_NAME));
		setTitle("Child VM settings");
		setDescription("Settings to control the behaviour of the child VM.");
		getPreferenceStore().setDefault(ChildVMServer.PREFERENCE_KEY_LOG_LEVEL, ChildVMServer.PREFERENCE_DEFAULT_LOG_LEVEL);
		getPreferenceStore().setDefault(ChildVMServer.PREFERENCE_KEY_DEBUG_MODE_PORT, ChildVMServer.PREFERENCE_DEFAULT_DEBUG_MODE_PORT);
	}

	@Override
	protected void createFieldEditors() {
		final String[][] logLevelNamesAndValues = new String[][] {
				{ "ERROR (log only errors)", "ERROR" },
				{ "WARN (log only warnings and errors)", "WARN" },
				{ "INFO (log normally)", "INFO" },
				{ "DEBUG (log a lot)", "DEBUG" },
				{ "TRACE (log everything)", "TRACE" }
		};
		addField(new ComboFieldEditor(ChildVMServer.PREFERENCE_KEY_LOG_LEVEL, "Log level:", logLevelNamesAndValues, getFieldEditorParent()));

		addField(new BooleanFieldEditor(ChildVMServer.PREFERENCE_KEY_DEBUG_MODE_ENABLED, "Debugging: Enabled:", BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent()));
		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_DEBUG_MODE_PORT, "Debugging: Port:", getFieldEditorParent()));
		addField(new BooleanFieldEditor(ChildVMServer.PREFERENCE_KEY_DEBUG_MODE_WAIT_FOR_DEBUGGER, "Debugging: Wait for debugger:", BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent()));
	}

}
