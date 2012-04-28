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
package org.nightlabs.vestigo.ui.oda.property;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.Persistence.PersistenceUnit;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class SelectConnectionProfileDialog extends TitleAreaDialog
{
	private Display display;
	private String title;
	private String message;
	private List<IConnectionProfile> connectionProfiles;
	private IConnectionProfile selectedConnectionProfile;
	private ListViewer listViewer;

	private static final ThreadLocal<List<String>> lastSelectedConnectionProfileIDs = new ThreadLocal<List<String>>() {
		@Override
		protected java.util.List<String> initialValue() {
			return new LinkedList<String>();
		}
	};
	private static final int lastSelectedConnectionProfileIDs_maxSize = 10;

	public static List<String> getPersistenceUnitNames(List<PersistenceUnit> persistenceUnits)
	{
		List<String> persistenceUnitNames = new ArrayList<String>(persistenceUnits.size());
		for (PersistenceUnit persistenceUnit : persistenceUnits) {
			persistenceUnitNames.add(persistenceUnit.getName());
		}
		return persistenceUnitNames;
	}

	public SelectConnectionProfileDialog(Shell parentShell, String title, String message, List<IConnectionProfile> connectionProfiles) {
		super(parentShell);

		this.display = Display.getCurrent();
		if (this.display == null)
			throw new IllegalStateException("Thread mismatch! This method must be called on the UI thread!");

		if (connectionProfiles == null)
			throw new IllegalArgumentException("connectionProfiles == null");

		this.title = title; // we cannot call this.setTitle(...) here - defer!
		this.message = message; // we cannot call this.setMessage(...) here - defer!
		this.connectionProfiles = connectionProfiles;

		findLastSelectedProfile: for (String id : lastSelectedConnectionProfileIDs.get()) {
			for (IConnectionProfile connectionProfile : connectionProfiles) {
				if (id.equals(connectionProfile.getInstanceID())) {
					selectedConnectionProfile = connectionProfile;
					break findLastSelectedProfile;
				}
			}
		}
	}

	private static void registerLastSelectedConnectionProfile(IConnectionProfile connectionProfile)
	{
		if (Display.getCurrent() == null)
			throw new IllegalStateException("Thread mismatch! This method must be called on the UI thread!");

		if (connectionProfile == null)
			return;

		String id = connectionProfile.getInstanceID();
		if (id == null)
			return;

		List<String> lastSelectedIDs = lastSelectedConnectionProfileIDs.get();
		lastSelectedIDs.remove(id);
		lastSelectedIDs.add(0, id);
		while (lastSelectedIDs.size() > lastSelectedConnectionProfileIDs_maxSize)
			lastSelectedIDs.remove(lastSelectedIDs.size() - 1);
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitleImage(VestigoUIPlugin.getDefault().getImage(SelectConnectionProfileDialog.class, "title", AbstractVestigoUIPlugin.IMAGE_SIZE_75x70));
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
//		newShell.setImage(VestigoUIPlugin.getDefault().getImage(SelectConnectionProfileDialog.class, "shell", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16)); //$NON-NLS-1$
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
				if (element instanceof IConnectionProfile)
					return ((IConnectionProfile)element).getName();

				return super.getText(element);
			}
		});
		listViewer.setInput(connectionProfiles);

		if (selectedConnectionProfile != null)
			listViewer.setSelection(new StructuredSelection(selectedConnectionProfile));

		listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				if (sel.getFirstElement() instanceof IConnectionProfile)
					selectedConnectionProfile = (IConnectionProfile) sel.getFirstElement();
				else
					selectedConnectionProfile = null;

				getButton(OK).setEnabled(selectedConnectionProfile != null);
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
			button.setEnabled(selectedConnectionProfile != null);

		return button;
	}

	public IConnectionProfile getSelectedConnectionProfile() {
		return selectedConnectionProfile;
	}

	@Override
	protected void okPressed() {
		registerLastSelectedConnectionProfile(selectedConnectionProfile);
		super.okPressed();
	}
}
