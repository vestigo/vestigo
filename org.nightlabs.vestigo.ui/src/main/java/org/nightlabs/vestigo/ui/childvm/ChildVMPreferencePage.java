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
import org.nightlabs.vestigo.core.LogLevel;
import org.nightlabs.vestigo.core.VestigoCorePlugin;
import org.nightlabs.vestigo.core.childvm.internal.ChildVMServer;
import org.nightlabs.vestigo.ui.preference.MultiLineStringFieldEditor;
import org.nightlabs.vestigo.ui.resource.Messages;

public class ChildVMPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage
{

	public ChildVMPreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench)
	{
		setPreferenceStore(new ScopedPreferenceStore(new InstanceScope(), VestigoCorePlugin.BUNDLE_SYMBOLIC_NAME));
		setDescription(Messages.getString("ChildVMPreferencePage.description")); //$NON-NLS-1$

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
		setTitle(Messages.getString("ChildVMPreferencePage.title")); //$NON-NLS-1$
		super.createControl(parent);
	}

	@Override
	protected void createFieldEditors()
	{
		addHorizontalSeparator(getFieldEditorParent());

		addField(new StringFieldEditor(ChildVMServer.PREFERENCE_KEY_JAVA_COMMAND, Messages.getString("ChildVMPreferencePage.java.command"), getFieldEditorParent())); //$NON-NLS-1$
		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_JAVA_HEAP_MAX_MB, Messages.getString("ChildVMPreferencePage.java.heap.size.max"), getFieldEditorParent())); //$NON-NLS-1$
		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_JAVA_HEAP_MIN_MB, Messages.getString("ChildVMPreferencePage.java.heap.size.min"), getFieldEditorParent())); //$NON-NLS-1$
		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_JAVA_PERM_GEN_MAX_MB, Messages.getString("ChildVMPreferencePage.java.permgen.size.max"), getFieldEditorParent())); //$NON-NLS-1$
		addField(new BooleanFieldEditor(ChildVMServer.PREFERENCE_KEY_JAVA_PERM_GEN_GC_ENABLED, Messages.getString("ChildVMPreferencePage.java.permgen.gc.enabled"), BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent())); //$NON-NLS-1$

		addHorizontalSeparator(getFieldEditorParent());

		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_SERVER_START_TIMEOUT_MS, Messages.getString("ChildVMPreferencePage.serverStartTimeout"), getFieldEditorParent())); //$NON-NLS-1$

		addHorizontalSeparator(getFieldEditorParent());

		final String[][] logLevelNamesAndValues = new String[LogLevel.values().length][];
		for (int i = 0; i < logLevelNamesAndValues.length; i++) {
			LogLevel logLevel = LogLevel.values()[i];
			logLevelNamesAndValues[i] = new String[] { logLevel.getDisplayName(), logLevel.name() };
		}

		addField(new ComboFieldEditor(ChildVMServer.PREFERENCE_KEY_LOG4J_ROOT_LOG_LEVEL, Messages.getString("ChildVMPreferencePage.log4j.rootLogLevel"), logLevelNamesAndValues, getFieldEditorParent())); //$NON-NLS-1$
		addField(new MultiLineStringFieldEditor(ChildVMServer.PREFERENCE_KEY_LOG4J_ADDITIONAL_PROPERTIES, Messages.getString("ChildVMPreferencePage.log4j.additionalProperties"), getFieldEditorParent())); //$NON-NLS-1$

		addHorizontalSeparator(getFieldEditorParent());

		addField(new BooleanFieldEditor(ChildVMServer.PREFERENCE_KEY_DEBUG_MODE_ENABLED, Messages.getString("ChildVMPreferencePage.debugging.enabled"), BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent())); //$NON-NLS-1$
		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_DEBUG_MODE_PORT, Messages.getString("ChildVMPreferencePage.debugging.port"), getFieldEditorParent())); //$NON-NLS-1$
		addField(new BooleanFieldEditor(ChildVMServer.PREFERENCE_KEY_DEBUG_MODE_WAIT_FOR_DEBUGGER, Messages.getString("ChildVMPreferencePage.debugging.waitForDebugger"), BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent())); //$NON-NLS-1$

		addHorizontalSeparator(getFieldEditorParent());

		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_WAC_SOCKET_CONNECT_TIMEOUT_MS, Messages.getString("ChildVMPreferencePage.client.socketConnectTimeout"), getFieldEditorParent())); //$NON-NLS-1$
		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_WAC_SOCKET_READ_TIMEOUT_MS, Messages.getString("ChildVMPreferencePage.client.socketReadTimeout"), getFieldEditorParent())); //$NON-NLS-1$
		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_WAC_ONLINECHECK_SOCKET_CONNECT_TIMEOUT_MS, Messages.getString("ChildVMPreferencePage.client.onlineCheck.socketConnectTimeout"), getFieldEditorParent())); //$NON-NLS-1$
		addField(new IntegerFieldEditor(ChildVMServer.PREFERENCE_KEY_WAC_ONLINECHECK_SOCKET_READ_TIMEOUT_MS, Messages.getString("ChildVMPreferencePage.client.onlineCheck.socketReadTimeout"), getFieldEditorParent())); //$NON-NLS-1$
	}

	private void addHorizontalSeparator(Composite parent)
	{
		Label label = new Label(parent, SWT.HORIZONTAL | SWT.SEPARATOR);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		label.setLayoutData(gd);
	}

}
