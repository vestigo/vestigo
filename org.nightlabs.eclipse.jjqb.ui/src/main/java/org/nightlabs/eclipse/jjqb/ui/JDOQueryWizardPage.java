/* *****************************************************************************
 *  NightLabs BIRT extensions for JDO                                          *
 *  Copyright (c) 2006 NightLabs, Germany                                      *
 *                                                                             *
 *  All rights reserved. This program and the accompanying materials           *
 *  are made available under the terms of the Eclipse Public License v1.0      *
 *  which accompanies this distribution, and is available at                   *
 *  http://www.eclipse.org/legal/epl-v10.html                                  *
 *                                                                             *
 *  Contributors:                                                              *
 *   Alexander Bieber, NightLabs - initial API and implementation              *
 ******************************************************************************/

package org.nightlabs.eclipse.jjqb.ui;

import org.eclipse.datatools.connectivity.oda.design.DataSetDesign;
import org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSetWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.jdo.jdoqleditor.editor.JDOQLEditorComposite;

/**
 * Simple WizardPage to edit a JDOQLQuery.
 *
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOQueryWizardPage extends DataSetWizardPage {

	private Composite wrapper;
	private JDOQLEditorComposite jdoqlEditor;

	/**
	 * @param pagename
	 */
	public JDOQueryWizardPage(String pagename) {
		super(pagename);
		setTitle("JDOQL Query");
		setMessage("Edit the JDOQL query");
	}


	/* (non-Javadoc)
	 * @see org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSetWizardPage#createPageCustomControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPageCustomControl(Composite parent) {
		wrapper = new Composite(parent, SWT.NONE);
		wrapper.setLayoutData(new GridData(GridData.FILL_BOTH));
		wrapper.setLayout(new GridLayout());
//		Label testLabel = new Label(wrapper, SWT.WRAP);
//		testLabel.setText("Test WizardPage");
		jdoqlEditor = new JDOQLEditorComposite(wrapper, SWT.NONE);
		jdoqlEditor.setLayoutData(new GridData(GridData.FILL_BOTH));
	}


	@Override
	protected void refresh(DataSetDesign design) {
		super.refresh(design);
		String query = design.getQueryText();
		System.out.println("Have query: "+query);
		if (query != null && !jdoqlEditor.isDisposed())
			jdoqlEditor.setDocumentText(query);
	}

	@Override
	protected DataSetDesign collectDataSetDesign(DataSetDesign design) {
		String query = "";
		if (jdoqlEditor != null && !jdoqlEditor.isDisposed())
			query = jdoqlEditor.getDocumentText();
		if (query == null)
			query = "";
		if (query != null && !"".equals(query))
			design.setQueryText(query);
//		System.out.println("Set query: "+query);
		return super.collectDataSetDesign(design);
	}
}
