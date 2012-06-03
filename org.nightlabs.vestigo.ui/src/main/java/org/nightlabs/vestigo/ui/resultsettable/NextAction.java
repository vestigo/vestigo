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
package org.nightlabs.vestigo.ui.resultsettable;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class NextAction
implements IViewActionDelegate, IMenuCreator
{
	private IAction action;
	private ResultSetTableView view;
	private int lastBunchSize;

	private PropertyChangeListener lastBunchSizeChangedListener = new PropertyChangeListener() {
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			lastBunchSize = ResultSetTableModel.getLastBunchSize();
			if (action != null)
				action.setText(NextBunchAction.getText(lastBunchSize));
		}
	};

	{
		ResultSetTableModel.getProperties().addPropertyChangeListener(ResultSetTableModel.PROPERTY_KEY_LAST_BUNCH_SIZE, lastBunchSizeChangedListener);
	}

	@Override
	public void init(IViewPart view)
	{
		this.view = (ResultSetTableView) view;
	}

	public ResultSetTableView getView() {
		return view;
	}

	@Override
	public void run(IAction action)
	{
		ResultSetTableModel resultSetTableModel = view.getResultSetTableModel();
		if (resultSetTableModel != null) {
			if (resultSetTableModel.isCompletelyLoaded())
				MessageDialog.openInformation(view.getSite().getShell(), "All rows loaded", "All rows are already loaded! There is nothing more to load.");

			resultSetTableModel.loadNextBunch(lastBunchSize);
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection)
	{
		lastBunchSize = ResultSetTableModel.getLastBunchSize();
		action.setText(NextBunchAction.getText(lastBunchSize));

		if (action != this.action) {
			action.setMenuCreator(this);
			this.action = action;
		}

//		resultSetTableModel = view.getResultSetTableModel();
		// We now leave this action enabled all the time in order to be able to switch to a different value BEFORE executing a query.
		// Especially with this being set to "Load all"
//		action.setEnabled(resultSetTableModel != null && !resultSetTableModel.isCompletelyLoaded());
//		if (resultSetTableModel != null)
//			resultSetTableModel.addPropertyChangeListener(ResultSetTableModel.PropertyName.completelyLoaded, completelyLoadedListener);
	}

//	private PropertyChangeListener completelyLoadedListener = new PropertyChangeListener() {
//		@Override
//		public void propertyChange(PropertyChangeEvent evt) {
//			if (action != null)
//				action.setEnabled(false);
//		}
//	};

	private Menu menu;

	@Override
	public void dispose()
	{
		if (menu != null)
			menu.dispose();

//		if (resultSetTableModel != null)
//			resultSetTableModel.removePropertyChangeListener(ResultSetTableModel.PropertyName.completelyLoaded, completelyLoadedListener);
	}

	@Override
	public Menu getMenu(Control parent) {
		if (menu != null && menu.getParent() != parent) {
			menu.dispose();
			menu = null;
		}

		if (menu == null) {
			menu = new Menu(parent);
			addActionToMenu(new NextBunchAction(this,   100));
			addActionToMenu(new NextBunchAction(this,   500));
			addActionToMenu(new NextBunchAction(this,  1000));
			addActionToMenu(new NextBunchAction(this,  5000));
			addActionToMenu(new NextBunchAction(this, 10000));
			addActionToMenu(new NextBunchAction(this, -1)); // means to load ALL
		}

		return menu;
	}

	private void addActionToMenu(IAction action)
  {
    ActionContributionItem item = new ActionContributionItem(action);
    item.fill(menu, -1);
  }

	@Override
	public Menu getMenu(Menu parent) {
		// We have no sub-menus.
		return null;
	}
}
