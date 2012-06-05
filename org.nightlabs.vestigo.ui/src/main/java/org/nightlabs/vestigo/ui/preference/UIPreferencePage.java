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
package org.nightlabs.vestigo.ui.preference;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;
import org.nightlabs.vestigo.ui.editor.QueryEditorManager;
import org.nightlabs.vestigo.ui.resultsettable.ResultSetTableComposite;

public class UIPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage
{

	public UIPreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench)
	{
		setPreferenceStore(VestigoUIPlugin.getDefault().getPreferenceStore());
		setDescription("Settings to control the behaviour of the user interface.");

		getPreferenceStore().setDefault(QueryEditorManager.PREFERENCE_KEY_KEEP_QUERY_RESULT_SET_QUANTITY, QueryEditorManager.PREFERENCE_DEFAULT_KEEP_QUERY_RESULT_SET_QUANTITY);
		getPreferenceStore().setDefault(ResultSetTableComposite.PREFERENCE_KEY_ONLY_RESULT_SETS_OF_ACTIVE_EDITOR_VISIBLE, ResultSetTableComposite.PREFERENCE_DEFAULT_ONLY_RESULT_SETS_OF_ACTIVE_EDITOR_VISIBLE);
	}

	@Override
	public void createControl(Composite parent) {
		setTitle("User interface");
		super.createControl(parent);
	}

	@Override
	protected void createFieldEditors()
	{
		addHorizontalSeparator(getFieldEditorParent());

		addField(new IntegerFieldEditor(QueryEditorManager.PREFERENCE_KEY_KEEP_QUERY_RESULT_SET_QUANTITY, "# of query result sets to keep per editor:", getFieldEditorParent()));
		addField(new BooleanFieldEditor(ResultSetTableComposite.PREFERENCE_KEY_ONLY_RESULT_SETS_OF_ACTIVE_EDITOR_VISIBLE, "Show only result sets of the active editor:", BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent()));
	}

	private void addHorizontalSeparator(Composite parent)
	{
		Label label = new Label(parent, SWT.HORIZONTAL | SWT.SEPARATOR);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		label.setLayoutData(gd);
	}

}
