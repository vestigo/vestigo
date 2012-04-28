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
package org.nightlabs.vestigo.ui.licence;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

public class LicenceCheckMessagesTableFieldEditor extends FieldEditor
{
	private GridData gridDataTable;
	private LicenceCheckMessagesTable licenceCheckMessagesTable;

	public LicenceCheckMessagesTableFieldEditor(String labelText, Composite parent) {
		super("notUsed", labelText, parent);

		getLabelControl(parent);
		setLabelText(labelText);

		licenceCheckMessagesTable = new LicenceCheckMessagesTable(parent);
		gridDataTable = new GridData(GridData.FILL_BOTH);
		licenceCheckMessagesTable.setLayoutData(gridDataTable);
	}

	public LicenceCheckMessagesTable getLicenceCheckMessagesTable() {
		return licenceCheckMessagesTable;
	}

	@Override
	protected void adjustForNumColumns(int numColumns) {
		gridDataTable.horizontalSpan = numColumns;
	}

	@Override
	protected void doFillIntoGrid(Composite parent, int numColumns) {
		// nothing to do
	}

	@Override
	protected void doLoad() {
		// nothing to do
	}

	@Override
	protected void doLoadDefault() {
		// nothing to do
	}

	@Override
	protected void doStore() {
		// nothing to do
	}

	@Override
	public int getNumberOfControls() {
		return 1;
	}

}
