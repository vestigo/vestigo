package org.nightlabs.vestigo.ui.oda.property;

import java.util.EventObject;

import org.eclipse.jface.preference.PreferencePage;

public class PreferencePageDirtyEvent extends EventObject
{
	private static final long serialVersionUID = 1L;

	public PreferencePageDirtyEvent(PreferencePage source) {
		super(source);
	}

	@Override
	public PreferencePage getSource() {
		return (PreferencePage) super.getSource();
	}

}
