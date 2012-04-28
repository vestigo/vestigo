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
package org.nightlabs.vestigo.ui.oda;

import org.eclipse.datatools.connectivity.oda.design.DataSetDesign;
import org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSetWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * Simple WizardPage to edit a JDOQLQuery.
 *
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOQueryWizardPage extends DataSetWizardPage {

	private Composite wrapper;
//	private JDOQLEditorComposite jdoqlEditor;

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
//		jdoqlEditor = new JDOQLEditorComposite(wrapper, SWT.NONE);
//		jdoqlEditor.setLayoutData(new GridData(GridData.FILL_BOTH));
	}


	@Override
	protected void refresh(DataSetDesign design) {
		super.refresh(design);
		String query = design.getQueryText();
		System.out.println("Have query: "+query);
//		if (query != null && !jdoqlEditor.isDisposed())
//			jdoqlEditor.setDocumentText(query);
	}

	@Override
	protected DataSetDesign collectDataSetDesign(DataSetDesign design) {
//		String query = "";
//		if (jdoqlEditor != null && !jdoqlEditor.isDisposed())
//			query = jdoqlEditor.getDocumentText();
//		if (query == null)
//			query = "";
//		if (query != null && !"".equals(query))
//			design.setQueryText(query);
//		System.out.println("Set query: "+query);
		return super.collectDataSetDesign(design);
	}
}
