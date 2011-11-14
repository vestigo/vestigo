package org.nightlabs.jjqb.ui.oda;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class JDODriverWizardPage extends AbstractDriverWizardPage
{
	public JDODriverWizardPage(String pageName) {
		super(pageName);
	}

	@Override
	protected AbstractDriverPropertiesComposite createDriverPropertiesComposite(Composite parent) {
		return new JDODriverPropertiesComposite(parent, SWT.NONE);
	}
}
