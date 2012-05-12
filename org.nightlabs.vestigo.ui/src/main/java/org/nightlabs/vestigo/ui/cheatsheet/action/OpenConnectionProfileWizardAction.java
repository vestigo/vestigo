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
package org.nightlabs.vestigo.ui.cheatsheet.action;

import org.eclipse.datatools.connectivity.internal.Category;
import org.eclipse.datatools.connectivity.ui.actions.AddProfileViewAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;

/**
 * 
 * @author abieber
 */
public class OpenConnectionProfileWizardAction extends Action implements IAction, ICheatSheetAction {

	@Override
	public void run(final String[] params, final ICheatSheetManager cheatSheetManager) {
		try {
			final String categoryID = "org.nightlabs.vestigo.core.oda.JPADriver"; //$NON-NLS-1$
			IViewPart dataSourceNavigatorView = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
					.showView("org.eclipse.datatools.connectivity.DataSourceExplorerNavigator"); //$NON-NLS-1$
			Category jpaCategory = new Category(null) {
				@Override
				public String getId() {
					return categoryID;
				}
			};
			ISelectionProvider selectionProvider = dataSourceNavigatorView.getSite().getSelectionProvider();
			selectionProvider.setSelection(new StructuredSelection(jpaCategory));

			AddProfileViewAction addProfileViewAction = new AddProfileViewAction(categoryID);
			addProfileViewAction.run();

		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

}
