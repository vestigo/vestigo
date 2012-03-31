package org.nightlabs.vestigo.maven.ui;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.nightlabs.vestigo.maven.core.MavenRunner;
import org.nightlabs.vestigo.maven.core.VestigoMavenCorePlugin;
import org.nightlabs.vestigo.maven.core.connectionpropertiesfilter.DependencyResolveMavenRunner;

public class VestigoMavenPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage
{

	public VestigoMavenPreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench)
	{
		setPreferenceStore(new ScopedPreferenceStore(new InstanceScope(), VestigoMavenCorePlugin.BUNDLE_SYMBOLIC_NAME));
		setDescription("Settings to control the behaviour of Maven.");

		getPreferenceStore().setDefault(MavenRunner.PREFERENCE_KEY_MAVEN_COMMAND, MavenRunner.PREFERENCE_DEFAULT_MAVEN_COMMAND);
		getPreferenceStore().setDefault(DependencyResolveMavenRunner.PREFERENCE_KEY_MAVEN_GOAL, DependencyResolveMavenRunner.PREFERENCE_DEFAULT_MAVEN_GOAL);
	}

	@Override
	public void createControl(Composite parent) {
		setTitle("Vestigo Maven");
		super.createControl(parent);
	}

	@Override
	protected void createFieldEditors()
	{
		addHorizontalSeparator(getFieldEditorParent());

		addField(new StringFieldEditor(MavenRunner.PREFERENCE_KEY_MAVEN_COMMAND, "Maven command:", getFieldEditorParent()));

		addField(new RepositoryTableFieldEditor(MavenRunner.PREFERENCE_KEY_MAVEN_REPOSITORIES, "Repositories:", getFieldEditorParent()));

		addHorizontalSeparator(getFieldEditorParent());

		addField(new StringFieldEditor(DependencyResolveMavenRunner.PREFERENCE_KEY_MAVEN_GOAL, "Dependency resolve goal:", getFieldEditorParent()));

	}

	private void addHorizontalSeparator(Composite parent)
	{
		Label label = new Label(parent, SWT.HORIZONTAL | SWT.SEPARATOR);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		label.setLayoutData(gd);
	}

}
