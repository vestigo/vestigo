package org.nightlabs.jjqb.ui.licence;

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
