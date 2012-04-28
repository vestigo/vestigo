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
package org.nightlabs.vestigo.ui.newwizard;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;
import org.nightlabs.vestigo.ui.oda.ConnectionProfileTreeComposite;
import org.nightlabs.vestigo.ui.wizard.WizardHopPage;

public class SelectConnectionProfilePage
extends WizardHopPage
implements ISelectionProvider
{
	private ConnectionProfileTreeComposite connectionProfileTreeComposite;
	private IConnectionProfile selectedConnectionProfile;
	private ListenerList selectionListeners = new ListenerList();

	public SelectConnectionProfilePage() {
		this(SelectConnectionProfilePage.class.getName());
	}

	public SelectConnectionProfilePage(String pageName) {
		super(
				pageName,
				"Select connection profile",
				VestigoUIPlugin.getDefault().getImageDescriptor(SelectConnectionProfilePage.class, "title", AbstractVestigoUIPlugin.IMAGE_SIZE_75x70)
		);

		setDescription("Please select the connection profile for which you want to create a new query.");
	}

	@Override
	public void createControl(Composite parent) {
		connectionProfileTreeComposite = new ConnectionProfileTreeComposite(parent);
		setControl(connectionProfileTreeComposite);

		connectionProfileTreeComposite.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				onSelectionChanged(event.getSelection());
			}
		});

		onSelectionChanged(connectionProfileTreeComposite.getSelection());
	}

	private void onSelectionChanged(ISelection selection)
	{
		selectedConnectionProfile = null;

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			Object firstElement = sel.getFirstElement();
			if (firstElement instanceof IConnectionProfile)
				selectedConnectionProfile = (IConnectionProfile) firstElement;
		}

		setPageComplete(selectedConnectionProfile != null);

		for (Object l : selectionListeners.getListeners()) {
			if (l instanceof ISelectionChangedListener)
				((ISelectionChangedListener)l).selectionChanged(new SelectionChangedEvent(this, getSelection()));
		}
	}

	public IConnectionProfile getSelectedConnectionProfile() {
		return selectedConnectionProfile;
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionListeners.add(listener);
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionListeners.remove(listener);
	}

	@Override
	public ISelection getSelection() {
		if (selectedConnectionProfile == null)
			return StructuredSelection.EMPTY;
		else
			return new StructuredSelection(selectedConnectionProfile);
	}

	@Override
	public void setSelection(ISelection selection) {
		throw new UnsupportedOperationException("NYI");
	}
}
