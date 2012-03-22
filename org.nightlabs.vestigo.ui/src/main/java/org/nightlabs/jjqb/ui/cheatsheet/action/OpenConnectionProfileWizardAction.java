package org.nightlabs.jjqb.ui.cheatsheet.action;

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
			final String categoryID = "org.nightlabs.jjqb.core.oda.JPADriver";
			IViewPart dataSourceNavigatorView = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
					.showView("org.eclipse.datatools.connectivity.DataSourceExplorerNavigator");
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
