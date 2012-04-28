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

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;

/**
 * A support that can be used for WizardPages that can not directly sub-class
 * {@link WizardHopPage}.
 * <p>
 * Instantiate this support and delegate the following methods to that instance:
 * </p>
 * <ul>
 * <li>{@link #getNextPage()}: Do not call <code>super.getNextPage()</code>.
 * <li>{@link #setWizard(IWizard)}: Call <code>super.setWizard(IWizard)</code> first! Then delegate.
 * <li>{@link #getWizardHop()}
 * <li>{@link #setWizardHop(IWizardHop)}
 * </ul>
 *
 * @see IWizardHop
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 */
public class WizardHopPageSupport
{
	private IWizardHop wizardHop;
	private WizardPage wizardPage;

	/**
	 * Create a new WizardHopPage.
	 * @param pageName The identifier used for the page
	 */
	public WizardHopPageSupport(WizardPage wizardPage)
	{
		this(wizardPage, null);
	}

	/**
	 * Create a new WizardHopPage.
	 * @param pageName The identifier used for the page
	 */
	public WizardHopPageSupport(WizardPage wizardPage, WizardHop wizardHop)
	{
		this.wizardPage = wizardPage;
		this.wizardHop = wizardHop;
	}

	public void setWizardHop(IWizardHop wizardHop)
	{
		this.wizardHop = wizardHop;
	}

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
	public IWizardPage getNextPage()
	{
		if (wizardHop != null)
			return wizardHop.getNextPage(wizardPage);
		else {
			if (wizardPage.getWizard() != null)
				return wizardPage.getWizard().getNextPage(wizardPage);
			else
				throw new IllegalStateException(
						"wizardHop AND wizard are not assigned! If this is the entry-page of a WizardHop, no WizardHop has been created in the constructor! Call 'new WizardHop(this);' in the constructor of " + //$NON-NLS-1$
						this.getClass().getName()+". If this should be used as normal WizardPage, add it to the wizard."); //$NON-NLS-1$
		}
	}

	public void setWizard(IWizard newWizard) {
		if (wizardPage.getWizard() != newWizard)
			wizardPage.setWizard(newWizard);

		if (wizardHop == null)
			return;
		for (IWizardHopPage hopPage : wizardHop.getHopPages()) {
			if (hopPage != this && hopPage.getWizard() != newWizard)
				hopPage.setWizard(newWizard);
		}
	}
}
