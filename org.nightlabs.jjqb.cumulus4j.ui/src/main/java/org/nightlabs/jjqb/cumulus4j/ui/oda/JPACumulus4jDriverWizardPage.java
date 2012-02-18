package org.nightlabs.jjqb.cumulus4j.ui.oda;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.jjqb.ui.oda.AbstractDriverPropertiesComposite;
import org.nightlabs.jjqb.ui.oda.AbstractDriverPropertiesCompositeWizardPage;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPACumulus4jDriverWizardPage extends AbstractDriverPropertiesCompositeWizardPage
{
	public JPACumulus4jDriverWizardPage(String pageName) {
		super(pageName);
	}

	@Override
	protected AbstractDriverPropertiesComposite createDriverPropertiesComposite(Composite parent) {
		return new Cumulus4jDriverPropertiesComposite(parent, SWT.NONE);
	}
}
