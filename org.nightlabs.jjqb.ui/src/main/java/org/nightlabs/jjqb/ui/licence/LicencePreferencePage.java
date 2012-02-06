package org.nightlabs.jjqb.ui.licence;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.nightlabs.jjqb.core.JJQBCorePlugin;
import org.nightlabs.jjqb.core.licence.LicenceManager;

public class LicencePreferencePage
extends FieldEditorPreferencePage
implements IWorkbenchPreferencePage
{
	public LicencePreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench)
	{
		IPreferenceStore preferenceStore = new ScopedPreferenceStore(new ConfigurationScope(), JJQBCorePlugin.BUNDLE_SYMBOLIC_NAME);

//		IPreferencesService preferencesService = Platform.getPreferencesService();
//		IEclipsePreferences preferencesRootNode = preferencesService.getRootNode();
//		final Preferences preferences = preferencesRootNode.node(ConfigurationScope.SCOPE).node(JJQBCorePlugin.BUNDLE_SYMBOLIC_NAME);
//		IPreferenceStore preferenceStore = new PreferenceStore();
//
//		preferenceStore.putValue(LicenceManager.PREFERENCES_KEY_EMAIL, preferences.get(LicenceManager.PREFERENCES_KEY_EMAIL, ""));
//		preferenceStore.putValue(LicenceManager.PREFERENCES_KEY_LICENCE_KEY, preferences.get(LicenceManager.PREFERENCES_KEY_LICENCE_KEY, ""));
//
//		preferenceStore.addPropertyChangeListener(new IPropertyChangeListener() {
//			@Override
//			public void propertyChange(PropertyChangeEvent event) {
//				String key = event.getProperty();
//				Object value = event.getNewValue();
//				if (value == null)
//					preferences.remove(key);
//				else
//					preferences.put(key, value.toString());
//
//				try {
//					preferences.flush();
//				} catch (BackingStoreException e) {
//					throw new RuntimeException(e);
//				}
//			}
//		});

		setPreferenceStore(preferenceStore);
		setTitle("JJQB Licence");
		setDescription("Please put the licence information into the fields below.");
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor(LicenceManager.PREFERENCES_KEY_EMAIL, "E-mail address:", getFieldEditorParent()));
		addField(new StringFieldEditor(LicenceManager.PREFERENCES_KEY_LICENCE_KEY, "Licence key:", getFieldEditorParent()));
	}

	@Override
	public boolean performOk()
	{
		if (!super.performOk())
			return false;

		LicenceManager licenceManager = JJQBCorePlugin.getDefault().getLicenceManager();
		licenceManager.clearCache();
		return licenceManager.isLicenceValid();
	}
}
