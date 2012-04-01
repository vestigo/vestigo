package org.nightlabs.vestigo.maven.ui;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;

public class RepositoryTableFieldEditor extends FieldEditor
{
	private Button addButton;
	private Button removeButton;
	private GridData gridDataTable;
	private RepositoryTable repositoryTable;

	public RepositoryTableFieldEditor(String name, String labelText, Composite parent) {
		super(name, labelText, parent);

		getLabelControl(parent);
		setLabelText(labelText);

		Composite buttonBar = new Composite(parent, SWT.NONE);
		buttonBar.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout buttonBarGridLayout = new GridLayout();
		buttonBarGridLayout.marginHeight = 0;
		buttonBar.setLayout(buttonBarGridLayout);

		new Label(buttonBar, SWT.NONE).setLayoutData(new GridData(GridData.FILL_HORIZONTAL)); // spacer to push the buttons to the right

		addButton = new Button(buttonBar, SWT.PUSH);
		addButton.setImage(VestigoMavenUIPlugin.getDefault().getImage(RepositoryTableFieldEditor.class, "addButton", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16));
		addButton.setToolTipText("Add a Maven repository.");

		removeButton = new Button(buttonBar, SWT.PUSH);
		removeButton.setImage(VestigoMavenUIPlugin.getDefault().getImage(RepositoryTableFieldEditor.class, "removeButton", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16));
		removeButton.setToolTipText("Remove the selected Maven repositories.");
		removeButton.setEnabled(false);

		buttonBarGridLayout.numColumns = buttonBar.getChildren().length;

		repositoryTable = new RepositoryTable(parent);
		gridDataTable = new GridData(GridData.FILL_BOTH);
		gridDataTable.horizontalSpan = 2;
		repositoryTable.setLayoutData(gridDataTable);
		repositoryTable.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				removeButton.setEnabled(!event.getSelection().isEmpty());
			}
		});
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
		return 2;
	}
}
