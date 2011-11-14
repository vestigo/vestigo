package org.nightlabs.jjqb.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.nightlabs.jjqb.ui.detailtree.ObjectGraphDetailTreeView;
import org.nightlabs.jjqb.ui.queryparam.QueryParameterManagerView;
import org.nightlabs.jjqb.ui.resultsettable.ResultSetTableView;

public class JJQBPerspective implements IPerspectiveFactory
{
	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		IFolderLayout leftTop = layout.createFolder("leftTop", IPageLayout.LEFT, 0.4f, IPageLayout.ID_EDITOR_AREA);
		leftTop.addView("org.eclipse.ui.navigator.ProjectExplorer"); // TODO isn't there a constant somewhere
		leftTop.addView(QueryParameterManagerView.class.getName());

		IFolderLayout leftBottom = layout.createFolder("leftBottom", IPageLayout.BOTTOM, 0.5f, "leftTop");
		leftBottom.addView("org.eclipse.datatools.connectivity.DataSourceExplorerNavigator"); // TODO constant
		leftBottom.addView(ObjectGraphDetailTreeView.class.getName());

		layout.addView(ResultSetTableView.class.getName(), IPageLayout.BOTTOM, 0.5f, IPageLayout.ID_EDITOR_AREA);


		layout.addShowViewShortcut("org.eclipse.ui.navigator.ProjectExplorer"); // TODO isn't there a constant somewhere
		layout.addShowViewShortcut(QueryParameterManagerView.class.getName());
		layout.addShowViewShortcut(ObjectGraphDetailTreeView.class.getName());
		layout.addShowViewShortcut(ResultSetTableView.class.getName());
		layout.addShowViewShortcut("org.eclipse.datatools.connectivity.DataSourceExplorerNavigator"); // TODO constant
	}
}
