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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class enables a wizard to support multiple local hops. A local hop means a
 * locally controlled list of pages where the current page can add/remove other pages.
 * The wizard will show all pages of one hop before going to the next hop. You can use
 * basically every {@link org.eclipse.jface.wizard.Wizard} (and probably even every
 * class implementing {@link org.eclipse.jface.wizard.IWizard} correctly), but it's
 * recommended to use {@link org.nightlabs.base.ui.wizard.IDynamicPathWizard} (or its
 * default implementation {@link org.nightlabs.base.ui.wizard.DynamicPathWizard}).
 * Only if the WizardHop is created detached from a Wizard a
 * IDynamicPathWizard has to be used in combination with
 * hookWizard/unhookWizard methods.
 * </p>
 * It is possible to combine hops with normal pages. The entry page of each top-level
 * hop must be registered in the <tt>Wizard</tt> either as static page or a dynamic
 * page, if using an {@link org.nightlabs.base.ui.wizard.IDynamicPathWizard}. Child-hop
 * do not have to be registered in the Wizard they are linked as exit pages
 * of their parent hops.
 *
 * @author Marco Schulze - marco at nightlabs dot de
 * @author Alexander Bieber <alex[AT]nightlabs[DOT]de>
 */
public class WizardHop implements IWizardHop
{
	private static final Logger logger = LoggerFactory.getLogger(WizardHop.class);

	private IWizardHop parentHop;

	private List<IWizardHopPage> hopPages = new ArrayList<IWizardHopPage>();

	private IWizardHopPage entryPage = null;
	private IWizardHopPage exitPage = null;

	/**
	 * If you use this constructor, you must call {@link #setEntryPage(IWizardHopPage)}
	 * before it is usable. It's recommended to create an instance of this class
	 * in the constructor of the entry page of this <tt>WizardHop</tt> with
	 * the constructor {@link #WizardHop(IWizardHopPage)}.
	 */
	protected WizardHop()
	{
	}

	/**
	 * This creates a new instance of <tt>WizardHop</tt> and registers it in the
	 * <tt>entryPage</tt>. This means, all you need to do to use the hop mechanism
	 * is to call <tt>new WizardHop(this);</tt> in your entry page's constructor.
	 *
	 * @param entryPage The entry page of this hop.
	 */
	public WizardHop(IWizardHopPage entryPage)
	{
		setEntryPage(entryPage);
	}

	/**
	 * @see org.nightlabs.vestigo.ui.wizard.IWizardHop#getParentHop()
	 */
	public IWizardHop getParentHop()
	{
		return parentHop;
	}
	/**
	 * @see org.nightlabs.vestigo.ui.wizard.IWizardHop#setParentHop(org.nightlabs.vestigo.ui.wizard.IWizardHop)
	 */
	public void setParentHop(IWizardHop parentHop)
	{
		this.parentHop = parentHop;
	}

	/**
	 * @return Returns the wizard.
	 */
	public IWizard getWizard()
	{
		if (entryPage == null)
			return null;

		return entryPage.getWizard();
	}

	/**
	 * @param entryPage The entryPage to set.
	 */
	public void setEntryPage(IWizardHopPage entryPage)
	{
		entryPage.setWizardHop(this);
		this.entryPage = entryPage;
	}

	/**
	 * @see org.nightlabs.vestigo.ui.wizard.IWizardHop#getExitPage()
	 */
	public IWizardHopPage getExitPage()
	{
		return exitPage;
	}

	/**
	 * @see org.nightlabs.vestigo.ui.wizard.IWizardHop#setExitPage(org.nightlabs.vestigo.ui.wizard.IWizardHopPage)
	 */
	public void setExitPage(IWizardHopPage exitPage)
	{
		this.exitPage = exitPage;
		if (exitPage != null) {
			exitPage.setWizard(getWizard());

			if (exitPage.getWizardHop() == null)
				throw new NullPointerException("exitPage.getWizardHop() returns null!"); //$NON-NLS-1$

			exitPage.getWizardHop().setParentHop(this);
		}
	}

	/**
	 * @return Returns the entryPage.
	 */
	public IWizardHopPage getEntryPage()
	{
		return entryPage;
	}

	public void addHopPage(IWizardHopPage page)
	{
		// Check, if a page with the same ID already exists. Since this would lead to endless loops later, we already throw an exception here.
		for (IWizardHopPage hopPage : hopPages) {
			if (hopPage.getName().equals(page.getName())) {
//				if (page == hopPage) // the given page already exists => silently exit
//					return;

				throw new IllegalStateException("Another page with the same name (\"" + page.getName() + "\") already exists in this WizardHop!"); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}


		page.setWizard(getWizard());
		if (page.getWizardHop() == null)
			page.setWizardHop(this);
		else {
			if (!page.getWizardHop().equals(this)) {
				// have an other wizard hop for the added page
				if (page.getWizardHop().getParentHop() != null && !page.getWizardHop().getParentHop().equals(this))
					logger.warn("Adding a WizardHopPage with an other WizardHop that already has a parent hop that is not the actual hop. Will overwrite the childs parent hop."); //$NON-NLS-1$
				page.getWizardHop().setParentHop(this);
			}
		}
		hopPages.add(page);
	}

	public void removeAllHopPages()
	{
		hopPages.clear();
	}

	/**
	 * @see org.nightlabs.vestigo.ui.wizard.IWizardHop#removeAllHopPagesAfter(org.nightlabs.vestigo.ui.wizard.IWizardHopPage)
	 */
	public void removeAllHopPagesAfter(IWizardHopPage page)
	{
		int index = hopPages.indexOf(page);
		if (index < 0)
			throw new IllegalArgumentException("page is not known to this hop! hop=" + this + " page=" + page); //$NON-NLS-1$ //$NON-NLS-2$

		while (hopPages.size() - 1 > index)
			hopPages.remove(hopPages.size() - 1);
	}

	public IWizardPage getNextPage(IWizardPage currentPage)
	{
		IWizard wizard = getWizard();
		if (wizard == null)
			return null;

		if (currentPage == entryPage) {
			if (hopPages.isEmpty()) {
				if (getParentHop() != null) {
					return getParentHop().getNextPage(currentPage);
				}

				return wizard.getNextPage(entryPage);
			}

			return hopPages.get(0);
		}

		int currIdx = hopPages.indexOf(currentPage);
		int nextIdx = -1;

		if (currIdx >= 0)
			nextIdx = currIdx + 1;

		if (nextIdx >= 0) {
			if (nextIdx < hopPages.size())
				return hopPages.get(nextIdx);

			if (exitPage != null)
				return exitPage;

			if (getParentHop() != null)
				return getParentHop().getNextPage(entryPage);
		}

		// find out the first entry page of the current branch of hops, which is
		// known to the wizard.
		IWizardHopPage firstEntryPage = entryPage;
		while (firstEntryPage.getWizardHop().getParentHop() != null) {
			firstEntryPage = firstEntryPage.getWizardHop().getParentHop().getEntryPage();
		}

		return wizard.getNextPage(firstEntryPage);
	}

//	public IWizardPage getPreviousPage(IWizardPage currentPage)
//	{
//		IWizard wizard = getWizard();
//		if (wizard == null)
//			return null;
//
////			return wizard.getPreviousPage(entryPage);
//
//		if (currentPage != entryPage) {
//			int currIdx = hopPages.indexOf(currentPage);
//			int previousIdx = -1;
//
//			if (currIdx == 0)
//				return entryPage;
//
//			if (currIdx > 0)
//				previousIdx = currIdx - 1;
//
//			if (previousIdx >= 0)
//				return (IWizardPage) hopPages.get(previousIdx);
//		}
//
//		if (parentHop != null)
//			return parentHop.getLastHopPage();
//
//		IWizardPage previous = wizard.getPreviousPage(entryPage);
//		if (previous instanceof IWizardHopPage) {
//			IWizardHop previousHop = ((IWizardHopPage)previous).getWizardHop();
//			while (previousHop.getExitPage() != null) {
//				// The exitPage of the previousHop is always the entryPage of the following
//				// hop and therefore exitPage.getWizardHop() is always the following hop.
//				previousHop = previousHop.getExitPage().getWizardHop();
//			}
//			IWizardPage p = previousHop.getLastHopPage();
//
//			if (p != null)
//				previous = p;
//		}
//
//		return previous;
//	}

	/**
	 * @see org.nightlabs.vestigo.ui.wizard.IWizardHop#getFirstHopPage()
	 */
	public IWizardHopPage getFirstHopPage()
	{
		if (hopPages.isEmpty())
			return null;

		return hopPages.get(0);
	}

	/**
	 * @see org.nightlabs.vestigo.ui.wizard.IWizardHop#getLastHopPage()
	 */
	public IWizardHopPage getLastHopPage()
	{
		if (hopPages.isEmpty())
			return null;

		return hopPages.get(hopPages.size() - 1);
	}

	/**
	 * @see org.nightlabs.vestigo.ui.wizard.IWizardHop#removeHopPage(org.nightlabs.vestigo.ui.wizard.IWizardHopPage)
	 */
	public boolean removeHopPage(IWizardHopPage page)
	{
		return hopPages.remove(page);
	}

	/**
	 * @see org.nightlabs.vestigo.ui.wizard.IWizardHop#getHopPages()
	 */
	public List<IWizardHopPage> getHopPages()
	{
		return Collections.unmodifiableList(hopPages);
	}

//	protected void setHopPagesWizard(IWizard wizard, IWizardHop wizardHop) {
//		wizardHop.getEntryPage().setWizard(wizard);
//		for (Iterator iter = wizardHop.getHopPages().iterator(); iter.hasNext();) {
//			IWizardHopPage page = (IWizardHopPage) iter.next();
//			page.setWizard(wizard);
//		}
//		if (wizardHop.getExitPage() != null) {
//			wizardHop.getExitPage().setWizard(wizard);
//			setHopPagesWizard(wizard, wizardHop.getExitPage().getWizardHop());
//		}
//	}
}
