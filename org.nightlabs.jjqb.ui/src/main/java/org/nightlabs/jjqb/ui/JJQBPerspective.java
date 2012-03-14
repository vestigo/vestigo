package org.nightlabs.jjqb.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.nightlabs.jjqb.ui.candidateclassview.CandidateClassView;
import org.nightlabs.jjqb.ui.detailtree.ObjectGraphDetailTreeView;
import org.nightlabs.jjqb.ui.queryparam.QueryParameterManagerView;
import org.nightlabs.jjqb.ui.resultsettable.ResultSetTableView;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JJQBPerspective implements IPerspectiveFactory
{
	private static final String LEFT_TOP = "leftTop"; //$NON-NLS-1$
	private static final String LEFT_CENTER = "leftCenter"; //$NON-NLS-1$
	private static final String LEFT_BOTTOM = "leftBottom"; //$NON-NLS-1$

	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		IFolderLayout leftTop = layout.createFolder(LEFT_TOP, IPageLayout.LEFT, 0.4f, IPageLayout.ID_EDITOR_AREA);
		leftTop.addView("org.eclipse.datatools.connectivity.DataSourceExplorerNavigator"); // TODO constant //$NON-NLS-1$
		leftTop.addView("org.eclipse.ui.navigator.ProjectExplorer"); // TODO isn't there a constant somewhere //$NON-NLS-1$

		IFolderLayout leftCenter = layout.createFolder(LEFT_CENTER, IPageLayout.BOTTOM, 0.333f, LEFT_TOP);
		leftCenter.addView(CandidateClassView.class.getName());
		leftCenter.addView(QueryParameterManagerView.class.getName());


		IFolderLayout leftBottom = layout.createFolder(LEFT_BOTTOM, IPageLayout.BOTTOM, 0.5f, LEFT_CENTER);
		leftBottom.addView(ObjectGraphDetailTreeView.class.getName());

		layout.addView(ResultSetTableView.class.getName(), IPageLayout.BOTTOM, 0.5f, IPageLayout.ID_EDITOR_AREA);

		layout.addShowViewShortcut("org.eclipse.ui.navigator.ProjectExplorer"); // TODO isn't there a constant somewhere //$NON-NLS-1$
		layout.addShowViewShortcut(CandidateClassView.class.getName());
		layout.addShowViewShortcut(QueryParameterManagerView.class.getName());
		layout.addShowViewShortcut(ObjectGraphDetailTreeView.class.getName());
		layout.addShowViewShortcut(ResultSetTableView.class.getName());
		layout.addShowViewShortcut("org.eclipse.datatools.connectivity.DataSourceExplorerNavigator"); // TODO constant //$NON-NLS-1$
	}
}
