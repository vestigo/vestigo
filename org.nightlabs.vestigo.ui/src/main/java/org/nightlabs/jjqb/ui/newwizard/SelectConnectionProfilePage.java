package org.nightlabs.jjqb.ui.newwizard;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.jjqb.ui.JJQBUIPlugin;
import org.nightlabs.jjqb.ui.oda.ConnectionProfileTreeComposite;
import org.nightlabs.jjqb.ui.wizard.WizardHopPage;

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
				JJQBUIPlugin.getDefault().getImageDescriptor(SelectConnectionProfilePage.class, "title", JJQBUIPlugin.IMAGE_SIZE_75x70)
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
