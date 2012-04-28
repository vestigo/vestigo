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
package org.nightlabs.vestigo.ui.wizard;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;


/**
 * A wizard page to be used within a wizard hop.
 * @see IWizardHop
 * @author Marco Schulze - marco at nightlabs dot de
 * @author Marc Klinger - marc[at]nightlabs[dot]de
 */
public abstract class WizardHopPage extends WizardPage
implements IWizardHopPage
{
	private IWizardHop wizardHop;
	
	/**
	 * Create a new WizardHopPage.
	 * @param pageName The identifier used for the page
	 */
	public WizardHopPage(String pageName)
	{
		super(pageName);
	}

	/**
	 * Create a new WizardHopPage.
	 * @param pageName The identifier used for the page
	 * @param title The title for the page
	 */
	public WizardHopPage(String pageName, String title)
	{
		super(pageName, title, null);
	}

	/**
	 * Create a new WizardHopPage.
	 * @param pageName The identifier used for the page
	 * @param title The title for the page
	 * @param titleImage The title image for the page
	 */
	public WizardHopPage(String pageName, String title, ImageDescriptor titleImage)
	{
		super(pageName, title, titleImage);
	}
	
	/* (non-Javadoc)
	 * @see org.nightlabs.base.ui.wizard.IWizardHopPage#setWizardHop(org.nightlabs.base.ui.wizard.IWizardHop)
	 */
	public void setWizardHop(IWizardHop wizardHop)
	{
		this.wizardHop = wizardHop;
	}

	/* (non-Javadoc)
	 * @see org.nightlabs.base.ui.wizard.IWizardHopPage#getWizardHop()
	 */
	public IWizardHop getWizardHop()
	{
		return wizardHop;
	}

	/**
	 * If this WizardHopPage has a wizardHop set, the hop will be asked for the next
	 * page, otherwise the wizard of this page (if set) will be asked.
	 * 
	 * @see org.eclipse.jface.wizard.WizardPage#getNextPage()
	 */
	@Override
	public IWizardPage getNextPage()
	{
		if (wizardHop != null)
			return wizardHop.getNextPage(this);
		else {
			if (getWizard() != null)
				return getWizard().getNextPage(this);
			else
				throw new IllegalStateException(
						"wizardHop AND wizard are not assigned! If this is the entry-page of a WizardHop, no WizardHop has been created in the constructor! Call 'new WizardHop(this);' in the constructor of " + //$NON-NLS-1$
						this.getClass().getName()+". If this should be used as normal WizardPage, add it to the wizard."); //$NON-NLS-1$
		}
	}

//	/**
//	 * @see org.eclipse.jface.wizard.WizardPage#getPreviousPage()
//	 */
//	public IWizardPage getPreviousPage()
//	{
//		return wizardHop.getPreviousPage(this);
//	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.WizardPage#setWizard(org.eclipse.jface.wizard.IWizard)
	 */
	@Override
	public void setWizard(IWizard newWizard) {
		super.setWizard(newWizard);
		if (wizardHop == null)
			return;
		for (IWizardHopPage hopPage : wizardHop.getHopPages()) {
			if (hopPage != this && hopPage.getWizard() != newWizard)
				hopPage.setWizard(newWizard);
		}
	}
}
