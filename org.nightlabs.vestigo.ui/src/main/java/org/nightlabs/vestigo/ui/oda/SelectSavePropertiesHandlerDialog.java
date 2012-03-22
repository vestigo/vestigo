package org.nightlabs.vestigo.ui.oda;

import java.util.List;
import java.util.Map;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class SelectSavePropertiesHandlerDialog extends TitleAreaDialog {

	private String title;
	private String message;
	private List<SavePropertiesHandler> savePropertiesHandlers;
	private SavePropertiesHandler selectedSavePropertiesHandler;
	private ListViewer listViewer;

	public SelectSavePropertiesHandlerDialog(Shell parentShell, String title, String message, List<SavePropertiesHandler> savePropertiesHandlers) {
		super(parentShell);

		if (savePropertiesHandlers == null)
			throw new IllegalArgumentException("savePropertiesHandlers == null");

		this.title = title; // we cannot call this.setTitle(...) here - defer!
		this.message = message; // we cannot call this.setMessage(...) here - defer!
		this.savePropertiesHandlers = savePropertiesHandlers;
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitleImage(VestigoUIPlugin.getDefault().getImage(SelectSavePropertiesHandlerDialog.class, "title", VestigoUIPlugin.IMAGE_SIZE_75x70)); //$NON-NLS-1$
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
		newShell.setImage(VestigoUIPlugin.getDefault().getImage(SelectSavePropertiesHandlerDialog.class, "shell", VestigoUIPlugin.IMAGE_SIZE_16x16)); //$NON-NLS-1$
	}

	@Override
	protected Control createDialogArea(Composite dialogAreaParent)
	{
		Composite dialogArea = (Composite) super.createDialogArea(dialogAreaParent);

		listViewer = new ListViewer(dialogArea);
		listViewer.getList().setLayoutData(new GridData(GridData.FILL_BOTH));
		listViewer.setContentProvider(new ArrayContentProvider());
		listViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				Map<String, String> fileNameFilters = ((SavePropertiesHandler)element).getFileNameFilters();
				StringBuilder sb = new StringBuilder();
				for (Map.Entry<String, String> me : fileNameFilters.entrySet()) {
					if (sb.length() > 0)
						sb.append("; "); //$NON-NLS-1$

					sb.append(me.getKey()).append(" (").append(me.getValue()).append(')'); //$NON-NLS-1$
				}
				return sb.toString();
			}
		});
		listViewer.setInput(savePropertiesHandlers);

		listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				selectedSavePropertiesHandler = (SavePropertiesHandler) sel.getFirstElement();
				getButton(OK).setEnabled(selectedSavePropertiesHandler != null);
			}
		});

		listViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				if (getButton(OK).isEnabled())
					okPressed();
			}
		});

		return dialogArea;
	}

	@Override
	protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
		Button button = super.createButton(parent, id, label, defaultButton);

		if (id == OK)
			button.setEnabled(selectedSavePropertiesHandler != null);

		return button;
	}

	public SavePropertiesHandler getSelectedSavePropertiesHandler() {
		return selectedSavePropertiesHandler;
	}
}
