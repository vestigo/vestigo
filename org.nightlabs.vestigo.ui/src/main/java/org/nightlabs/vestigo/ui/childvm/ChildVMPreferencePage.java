package org.nightlabs.vestigo.ui.childvm;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.nightlabs.vestigo.core.VestigoCorePlugin;
import org.nightlabs.vestigo.core.childvm.LogLevel;
import org.nightlabs.vestigo.core.childvm.internal.ChildVMServer;
import org.nightlabs.vestigo.ui.preference.MultiLineStringFieldEditor;

public class ChildVMPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage
{

	public ChildVMPreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench)
	{
		setPreferenceStore(new ScopedPreferenceStore(new InstanceScope(), VestigoCorePlugin.BUNDLE_SYMBOLIC_NAME));
		setDescription("Settings to control the behaviour of the child VM.");

		getPreferenceStore().setDefault(ChildVMServer.PREFERENCE_KEY_JAVA_COMMAND, ChildVMServer.PREFERENCE_DEFAULT_JAVA_COMMAND);
		getPreferenceStore().setDefault(ChildVMServer.PREFERENCE_KEY_JAVA_HEAP_MAX_MB, ChildVMServer.PREFERENCE_DEFAULT_JAVA_HEAP_MAX_MB);
		getPreferenceStore().setDefault(ChildVMServer.PREFERENCE_KEY_JAVA_HEAP_MIN_MB, ChildVMServer.PREFERENCE_DEFAULT_JAVA_HEAP_MIN_MB);
		getPreferenceStore().setDefault(ChildVMServer.PREFERENCE_KEY_JAVA_PERM_GEN_MAX_MB, ChildVMServer.PREFERENCE_DEFAULT_JAVA_PERM_GEN_MAX_MB);
		getPreferenceStore().setDefault(ChildVMServer.PREFERENCE_KEY_JAVA_PERM_GEN_GC_ENABLED, ChildVMServer.PREFERENCE_DEFAULT_JAVA_PERM_GEN_GC_ENABLED);

		getPreferenceStore().setDefault(ChildVMServer.PREFERENCE_KEY_SERVER_START_TIMEOUT_MS, ChildVMServer.PREFERENCE_DEFAULT_SERVER_START_TIMEOUT_MS);

		getPreferenceStore().setDefault(ChildVMServer.PREFERENCE_KEY_LOG4J_ROOT_LOG_LEVEL, ChildVMServer.PREFERENCE_DEFAULT_LOG4J_ROOT_LOG_LEVEL);
		getPreferenceStore().setDefault(ChildVMServer.PREFERENCE_KEY_LOG4J_ADDITIONAL_PROPERTIES, ChildVMServer.PREFERENCE_DEFAULT_LOG4J_ADDITIONAL_PROPERTIES);
		getPreferenceStore().setDefault(ChildVMServer.PREFERENCE_KEY_DEBUG_MODE_PORT, ChildVMServer.PREFERENCE_DEFAULT_DEBUG_MODE_PORT);

		getPreferenceStore().setDefault(ChildVMServer.PREFERENCE_KEY_WAC_SOCKET_CONNECT_TIMEOUT_MS, ChildVMServer.PREFERENCE_DEFAULT_WAC_SOCKET_CONNECT_TIMEOUT_MS);
		getPreferenceStore().setDefault(ChildVMServer.PREFERENCE_KEY_WAC_SOCKET_READ_TIMEOUT_MS, ChildVMServer.PREFERENCE_DEFAULT_WAC_SOCKET_READ_TIMEOUT_MS);
		getPreferenceStore().setDefault(ChildVMServer.PREFERENCE_KEY_WAC_ONLINECHECK_SOCKET_CONNECT_TIMEOUT_MS, ChildVMServer.PREFERENCE_DEFAULT_WAC_ONLINECHECK_SOCKET_CONNECT_TIMEOUT_MS);
		getPreferenceStore().setDefault(ChildVMServer.PREFERENCE_KEY_WAC_ONLINECHECK_SOCKET_READ_TIMEOUT_MS, ChildVMServer.PREFERENCE_DEFAULT_WAC_ONLINECHECK_SOCKET_READ_TIMEOUT_MS);
	}

	@Override
	public void createControl(Composite parent) {
		setTitle("Vestigo Child VM");
		super.createControl(parent);
	}

	@Override
	protected void createFieldEditors()
	{
		addHorizontalSeparator(getFieldEditorParent());

		addField(new StringFieldEditor(ChildVMServer.PREFERENCE_KEY_JAVA_COMMAND, "Java: Command:", getFieldEditorParent()));
		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_JAVA_HEAP_MAX_MB, "Java: Max heap size (MB):", getFieldEditorParent()));
		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_JAVA_HEAP_MIN_MB, "Java: Min heap size (MB):", getFieldEditorParent()));
		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_JAVA_PERM_GEN_MAX_MB, "Java: Max PermGen size (MB):", getFieldEditorParent()));
		addField(new BooleanFieldEditor(ChildVMServer.PREFERENCE_KEY_JAVA_PERM_GEN_GC_ENABLED, "Java: PermGen garbage collection:", BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent()));

		addHorizontalSeparator(getFieldEditorParent());

		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_SERVER_START_TIMEOUT_MS, "Server start timeout (ms):", getFieldEditorParent()));

		addHorizontalSeparator(getFieldEditorParent());

		final String[][] logLevelNamesAndValues = new String[][] {
				{ "TRACE (log everything)", LogLevel.TRACE.name() },
				{ "DEBUG (log a lot)", LogLevel.DEBUG.name() },
				{ "INFO (log normally)", LogLevel.INFO.name() },
				{ "WARN (log only warnings and errors)", LogLevel.WARN.name() },
				{ "ERROR (log only errors)", LogLevel.ERROR.name() },
				{ "FATAL (log only severe errors)", LogLevel.FATAL.name() }
		};
		addField(new ComboFieldEditor(ChildVMServer.PREFERENCE_KEY_LOG4J_ROOT_LOG_LEVEL, "Log4j: Root log level:", logLevelNamesAndValues, getFieldEditorParent()));
		addField(new MultiLineStringFieldEditor(ChildVMServer.PREFERENCE_KEY_LOG4J_ADDITIONAL_PROPERTIES, "Log4j: Additional properties:", getFieldEditorParent()));

		addHorizontalSeparator(getFieldEditorParent());

		addField(new BooleanFieldEditor(ChildVMServer.PREFERENCE_KEY_DEBUG_MODE_ENABLED, "Debugging: Enabled:", BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent()));
		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_DEBUG_MODE_PORT, "Debugging: Port:", getFieldEditorParent()));
		addField(new BooleanFieldEditor(ChildVMServer.PREFERENCE_KEY_DEBUG_MODE_WAIT_FOR_DEBUGGER, "Debugging: Wait for debugger:", BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent()));

		addHorizontalSeparator(getFieldEditorParent());

		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_WAC_SOCKET_CONNECT_TIMEOUT_MS, "Client: Socket connect timeout:", getFieldEditorParent()));
		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_WAC_SOCKET_READ_TIMEOUT_MS, "Client: Socket read timeout:", getFieldEditorParent()));
		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_WAC_ONLINECHECK_SOCKET_CONNECT_TIMEOUT_MS, "Client: Online-check: Socket connect timeout:", getFieldEditorParent()));
		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_WAC_ONLINECHECK_SOCKET_READ_TIMEOUT_MS, "Client: Online-check: Socket read timeout:", getFieldEditorParent()));
	}

	private void addHorizontalSeparator(Composite parent)
	{
		Label label = new Label(parent, SWT.HORIZONTAL | SWT.SEPARATOR);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		label.setLayoutData(gd);
	}

}
