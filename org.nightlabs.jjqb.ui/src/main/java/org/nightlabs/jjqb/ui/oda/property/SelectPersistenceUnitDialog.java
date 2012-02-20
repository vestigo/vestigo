package org.nightlabs.jjqb.ui.oda.property;

import java.util.List;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;

public class SelectPersistenceUnitDialog extends TitleAreaDialog {

	private List<String> persistenceUnitNames;
	private String selectedPersistenceUnitName;
	private ListViewer listViewer;

	public SelectPersistenceUnitDialog(Shell parentShell, List<String> persistenceUnitNames, String selectedPersistenceUnitName) {
		super(parentShell);

		if (persistenceUnitNames == null)
			throw new IllegalArgumentException("persistenceUnitNames == null");

		this.persistenceUnitNames = persistenceUnitNames;
		this.selectedPersistenceUnitName = selectedPersistenceUnitName;

//		for (int i = 0; i < 50; i++) {
//			persistenceUnitNames.add("Test " + i);
//		}
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitleImage(JJQBUIPlugin.getDefault().getImage(SelectPersistenceUnitDialog.class, "title", JJQBUIPlugin.IMAGE_SIZE_75x70));
		setTitle("Select persistence unit");
		setMessage("The following persistence units have been found in your classpath. Please select the one you wish to use.");

		return contents;
	}

	@Override
	protected int getShellStyle() {
		return super.getShellStyle() | SWT.RESIZE;
	}

	@Override
	protected Point getInitialSize() {
		Point initialSize = super.getInitialSize();
		initialSize.x = Math.max(initialSize.x, 200);
		initialSize.y = Math.max(initialSize.y, 200);
		return initialSize;
	}

	@Override
	protected void configureShell(Shell newShell)
	{
		super.configureShell(newShell);
		newShell.setText("Select persistence unit");
		newShell.setImage(JJQBUIPlugin.getDefault().getImage(SelectPersistenceUnitDialog.class, "shell", JJQBUIPlugin.IMAGE_SIZE_16x16)); //$NON-NLS-1$
	}

	@Override
	protected Control createDialogArea(Composite dialogAreaParent)
	{
		Composite dialogArea = (Composite) super.createDialogArea(dialogAreaParent);

		listViewer = new ListViewer(dialogArea);
		listViewer.getList().setLayoutData(new GridData(GridData.FILL_BOTH));
		listViewer.setContentProvider(new ArrayContentProvider());
		listViewer.setInput(persistenceUnitNames);

		if (selectedPersistenceUnitName != null)
			listViewer.setSelection(new StructuredSelection(selectedPersistenceUnitName));

		listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				selectedPersistenceUnitName = (String) sel.getFirstElement();
				getButton(OK).setEnabled(selectedPersistenceUnitName != null && !selectedPersistenceUnitName.isEmpty());
			}
		});

		return dialogArea;
	}

	@Override
	protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
		Button button = super.createButton(parent, id, label, defaultButton);

		if (id == OK)
			button.setEnabled(selectedPersistenceUnitName != null && !selectedPersistenceUnitName.isEmpty());

		return button;
	}

	public String getSelectedPersistenceUnitName() {
		return selectedPersistenceUnitName;
	}

}
