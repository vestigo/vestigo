package org.nightlabs.vestigo.log4j.ui;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.nightlabs.vestigo.core.LogLevel;
import org.nightlabs.vestigo.log4j.core.Log4jConfigurator;
import org.nightlabs.vestigo.log4j.core.VestigoLog4jCorePlugin;
import org.nightlabs.vestigo.ui.preference.MultiLineStringFieldEditor;

public class Log4jPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage
{
	public Log4jPreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench)
	{
		setPreferenceStore(new ScopedPreferenceStore(new InstanceScope(), VestigoLog4jCorePlugin.BUNDLE_SYMBOLIC_NAME));
		setDescription("Settings to control the logging via log4j. Note, that you might have to restart Vestigo (or Eclipse) for certain changes to take effect.");

		getPreferenceStore().setDefault(Log4jConfigurator.PREFERENCE_KEY_ENABLED, Log4jConfigurator.PREFERENCE_DEFAULT_ENABLED);
		getPreferenceStore().setDefault(Log4jConfigurator.PREFERENCE_KEY_CONSOLE_APPENDER_ENABLED, Log4jConfigurator.PREFERENCE_DEFAULT_CONSOLE_APPENDER_ENABLED);
		getPreferenceStore().setDefault(Log4jConfigurator.PREFERENCE_KEY_ROLLING_FILE_APPENDER_ENABLED, Log4jConfigurator.PREFERENCE_DEFAULT_ROLLING_FILE_APPENDER_ENABLED);
		getPreferenceStore().setDefault(Log4jConfigurator.PREFERENCE_KEY_LOG4J_ADDITIONAL_PROPERTIES, Log4jConfigurator.PREFERENCE_DEFAULT_LOG4J_ADDITIONAL_PROPERTIES);
		getPreferenceStore().setDefault(Log4jConfigurator.PREFERENCE_KEY_LOG4J_ROOT_LOG_LEVEL, Log4jConfigurator.PREFERENCE_DEFAULT_LOG4J_ROOT_LOG_LEVEL);
	}

	@Override
	public void createControl(Composite parent) {
		setTitle("Vestigo Log4j");
		super.createControl(parent);
	}

	@Override
	protected void createFieldEditors()
	{
		addHorizontalSeparator(getFieldEditorParent());

		addField(new BooleanFieldEditor(Log4jConfigurator.PREFERENCE_KEY_ENABLED, "Configure log4j:", BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent()));
		addField(new BooleanFieldEditor(Log4jConfigurator.PREFERENCE_KEY_CONSOLE_APPENDER_ENABLED, "Enable console appender:", BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent()));
		addField(new BooleanFieldEditor(Log4jConfigurator.PREFERENCE_KEY_ROLLING_FILE_APPENDER_ENABLED, "Enable rolling file appender:", BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent()));

		addHorizontalSeparator(getFieldEditorParent());

		final String[][] logLevelNamesAndValues = new String[LogLevel.values().length][];
		for (int i = 0; i < logLevelNamesAndValues.length; i++) {
			LogLevel logLevel = LogLevel.values()[i];
			logLevelNamesAndValues[i] = new String[] { logLevel.getDisplayName(), logLevel.name() };
		}

		addField(new ComboFieldEditor(Log4jConfigurator.PREFERENCE_KEY_LOG4J_ROOT_LOG_LEVEL, "Root log level:", logLevelNamesAndValues, getFieldEditorParent()));
		addField(new MultiLineStringFieldEditor(Log4jConfigurator.PREFERENCE_KEY_LOG4J_ADDITIONAL_PROPERTIES, "Additional properties:", getFieldEditorParent()));
	}

	private void addHorizontalSeparator(Composite parent)
	{
		Label label = new Label(parent, SWT.HORIZONTAL | SWT.SEPARATOR);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		label.setLayoutData(gd);
	}

	@Override
	public boolean performOk() {
		boolean result = super.performOk();
		if (result)
			Log4jConfigurator.sharedInstance().configure();

		return result;
	}
}
