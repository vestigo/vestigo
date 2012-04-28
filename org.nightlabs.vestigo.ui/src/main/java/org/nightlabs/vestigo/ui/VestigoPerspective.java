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
package org.nightlabs.vestigo.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.nightlabs.vestigo.ui.candidateclassview.CandidateClassView;
import org.nightlabs.vestigo.ui.detailtree.ObjectGraphDetailTreeView;
import org.nightlabs.vestigo.ui.queryparam.QueryParameterManagerView;
import org.nightlabs.vestigo.ui.resultsettable.ResultSetTableView;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class VestigoPerspective implements IPerspectiveFactory
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
