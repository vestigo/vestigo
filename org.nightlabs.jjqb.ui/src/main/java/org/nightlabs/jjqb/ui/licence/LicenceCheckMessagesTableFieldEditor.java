package org.nightlabs.jjqb.ui.licence;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class LicenceCheckMessagesTableFieldEditor extends FieldEditor
{
	private GridData gridDataTable;
//	private GridData gridDataButton;
	private LicenceCheckMessagesTable licenceCheckMessagesTable;
	private Button checkLicenceButton;

	public LicenceCheckMessagesTableFieldEditor(String labelText, Composite parent) {
		super("notUsed", labelText, parent);

		getLabelControl(parent);
		setLabelText(labelText);

		licenceCheckMessagesTable = new LicenceCheckMessagesTable(parent);
		gridDataTable = new GridData(GridData.FILL_BOTH);
		licenceCheckMessagesTable.setLayoutData(gridDataTable);

//		checkLicenceButton = new Button(parent, SWT.PUSH);
//		checkLicenceButton.setText("Check now!");
//		checkLicenceButton.setToolTipText("Check now, whether the given licence information is valid. If it is valid and the licence was not yet activated, it is automatically activated, too.");
//		gridDataButton = new GridData();
//		gridDataButton.horizontalAlignment = SWT.RIGHT;
//		checkLicenceButton.setLayoutData(gridDataButton);
	}

	public LicenceCheckMessagesTable getLicenceCheckMessagesTable() {
		return licenceCheckMessagesTable;
	}

	@Override
	protected void adjustForNumColumns(int numColumns) {
		gridDataTable.horizontalSpan = numColumns;
//		gridDataButton.horizontalSpan = numColumns;
	}

	@Override
	protected void doFillIntoGrid(Composite parent, int numColumns) {
//		GridData gd = new GridData(GridData.FILL_BOTH);
//		parent.setLayoutData()
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
