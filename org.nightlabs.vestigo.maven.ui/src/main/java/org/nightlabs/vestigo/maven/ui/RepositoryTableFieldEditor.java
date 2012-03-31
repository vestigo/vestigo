package org.nightlabs.vestigo.maven.ui;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

public class RepositoryTableFieldEditor extends FieldEditor
{
	private GridData gridDataTable;
	private RepositoryTable repositoryTable;

	public RepositoryTableFieldEditor(String name, String labelText, Composite parent) {
		super(name, labelText, parent);

		getLabelControl(parent);
		setLabelText(labelText);

		repositoryTable = new RepositoryTable(parent);
		gridDataTable = new GridData(GridData.FILL_BOTH);
		repositoryTable.setLayoutData(gridDataTable);
	}

	public RepositoryTable getRepositoryTable() {
		return repositoryTable;
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
