package org.nightlabs.vestigo.ui.oda.property;

import java.util.ArrayList;
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
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.Persistence.PersistenceUnit;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class SelectPersistenceUnitDialog extends TitleAreaDialog {

	private String title;
	private String message;
	private List<String> persistenceUnitNames;
	private String selectedPersistenceUnitName;
	private ListViewer listViewer;

	public static List<String> getPersistenceUnitNames(List<PersistenceUnit> persistenceUnits)
	{
		List<String> persistenceUnitNames = new ArrayList<String>(persistenceUnits.size());
		for (PersistenceUnit persistenceUnit : persistenceUnits) {
			persistenceUnitNames.add(persistenceUnit.getName());
		}
		return persistenceUnitNames;
	}

	public SelectPersistenceUnitDialog(Shell parentShell, String title, String message, List<String> persistenceUnitNames, String selectedPersistenceUnitName) {
		super(parentShell);

		if (persistenceUnitNames == null)
			throw new IllegalArgumentException("persistenceUnitNames == null");

		this.title = title; // we cannot call this.setTitle(...) here - defer!
		this.message = message; // we cannot call this.setMessage(...) here - defer!
		this.persistenceUnitNames = persistenceUnitNames;
		this.selectedPersistenceUnitName = selectedPersistenceUnitName;
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitleImage(VestigoUIPlugin.getDefault().getImage(SelectPersistenceUnitDialog.class, "title", AbstractVestigoUIPlugin.IMAGE_SIZE_75x70));
		setTitle(title);
		setMessage(message);

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
		newShell.setText(title);
		newShell.setImage(VestigoUIPlugin.getDefault().getImage(SelectPersistenceUnitDialog.class, "shell", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16)); //$NON-NLS-1$
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
