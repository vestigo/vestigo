package org.nightlabs.jjqb.ui.oda;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPADriverWizardPage extends AbstractDriverWizardPage
{
	public JPADriverWizardPage(String pageName) {
		super(pageName);
	}

	@Override
	protected AbstractDriverPropertiesComposite createDriverPropertiesComposite(Composite parent) {
		return new JPADriverPropertiesComposite(parent, SWT.NONE);
	}
}
