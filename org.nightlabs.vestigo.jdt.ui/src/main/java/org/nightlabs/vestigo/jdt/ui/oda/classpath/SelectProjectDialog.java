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
package org.nightlabs.vestigo.jdt.ui.oda.classpath;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.nightlabs.vestigo.childvm.shared.persistencexml.jaxb.Persistence.PersistenceUnit;
import org.nightlabs.vestigo.jdt.ui.VestigoJDTUIPlugin;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class SelectProjectDialog extends TitleAreaDialog
{
	private String title;
	private String message;
	private List<IProject> projects;
	private List<IProject> selectedProjects = Collections.emptyList();
	private TableViewer tableViewer;

	public static List<String> getPersistenceUnitNames(List<PersistenceUnit> persistenceUnits)
	{
		List<String> persistenceUnitNames = new ArrayList<String>(persistenceUnits.size());
		for (PersistenceUnit persistenceUnit : persistenceUnits) {
			persistenceUnitNames.add(persistenceUnit.getName());
		}
		return persistenceUnitNames;
	}

	public SelectProjectDialog(Shell parentShell, String title, String message) {
		super(parentShell);

		this.title = title; // we cannot call this.setTitle(...) here - defer!
		this.message = message; // we cannot call this.setMessage(...) here - defer!

		projects = new ArrayList<IProject>();
		for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			try {
				if (project.isOpen() && project.getNature(JavaCore.NATURE_ID) != null)
					projects.add(project);
			} catch (CoreException e) {
				throw new RuntimeException(e);
//				logger.warn(e.toString(), e);
			}
		}
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitleImage(VestigoJDTUIPlugin.getDefault().getImage(SelectProjectDialog.class, "title", AbstractVestigoUIPlugin.IMAGE_SIZE_75x70));
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
		newShell.setImage(VestigoJDTUIPlugin.getDefault().getImage(SelectProjectDialog.class, "shell", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16)); //$NON-NLS-1$
	}

	@Override
	protected Control createDialogArea(Composite dialogAreaParent)
	{
		Composite dialogArea = (Composite) super.createDialogArea(dialogAreaParent);

		tableViewer = new TableViewer(dialogArea);
		tableViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
		tableViewer.setContentProvider(new ArrayContentProvider());
		tableViewer.setLabelProvider(new LabelProvider() {
			@Override
			public Image getImage(Object element) {
				if (element instanceof IProject)
					return VestigoJDTUIPlugin.getDefault().getImage(SelectProjectDialog.class, "project", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16);

				return super.getImage(element);
			}

			@Override
			public String getText(Object element) {
				if (element instanceof IProject)
					return ((IProject)element).getName();
				return super.getText(element);
			}
		});
		tableViewer.setInput(projects);

		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@SuppressWarnings("unchecked")
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				selectedProjects = Collections.unmodifiableList(sel.toList());
				getButton(OK).setEnabled(!selectedProjects.isEmpty());
			}
		});

		return dialogArea;
	}

	@Override
	protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
		Button button = super.createButton(parent, id, label, defaultButton);

		if (id == OK)
			button.setEnabled(!selectedProjects.isEmpty());

		return button;
	}

	public Collection<IProject> getSelectedProjects() {
		return selectedProjects;
	}

}
