package org.nightlabs.vestigo.ui.persistencepropertytree;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;

public class PersistencePropertyTreeDialog extends TitleAreaDialog
{
	private String persistenceAPI;
	private String title;
	private String message;
	private PersistencePropertyTreeComposite persistencePropertyTreeComposite;

	public PersistencePropertyTreeDialog(Shell parentShell, String persistenceAPI, String title, String message)
	{
		super(parentShell);

		if (persistenceAPI == null)
			throw new IllegalArgumentException("persistenceAPI == null");

		this.persistenceAPI = persistenceAPI;
		this.title = title; // we cannot call this.setTitle(...) here - defer!
		this.message = message; // we cannot call this.setMessage(...) here - defer!
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitleImage(VestigoUIPlugin.getDefault().getImage(PersistencePropertyTreeDialog.class, "title", AbstractVestigoUIPlugin.IMAGE_SIZE_75x70));
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
		newShell.setImage(VestigoUIPlugin.getDefault().getImage(PersistencePropertyTreeDialog.class, "shell", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16)); //$NON-NLS-1$
	}

	@Override
	protected Control createDialogArea(Composite dialogAreaParent)
	{
		Composite dialogArea = (Composite) super.createDialogArea(dialogAreaParent);

		persistencePropertyTreeComposite = new PersistencePropertyTreeComposite(dialogArea, persistenceAPI);
		persistencePropertyTreeComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

//		listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
//			@Override
//			public void selectionChanged(SelectionChangedEvent event) {
//				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
//				selectedPersistenceUnitName = (String) sel.getFirstElement();
//				getButton(OK).setEnabled(selectedPersistenceUnitName != null && !selectedPersistenceUnitName.isEmpty());
//			}
//		});

		return dialogArea;
	}

	@Override
	protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
		Button button = super.createButton(parent, id, label, defaultButton);

		if (id == OK)
			button.setEnabled(false);

		return button;
	}

	public String getSelectedPropertyName()
	{
		return null; // TODO implement!
	}
}
