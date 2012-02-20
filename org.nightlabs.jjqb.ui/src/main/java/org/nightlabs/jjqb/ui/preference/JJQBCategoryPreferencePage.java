package org.nightlabs.jjqb.ui.preference;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class JJQBCategoryPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {

	public JJQBCategoryPreferencePage() {
		super("JJQB - JDO/JPA Query Browser");
		setDescription("Settings for JJQB.");
	}

	@Override
	public void init(IWorkbench workbench) {
	}

	@Override
	protected Control createContents(Composite parent) {
		Label label = new Label(parent, SWT.WRAP);
		label.setText("The great query browser!");
		return label;
	}

}
