package org.nightlabs.vestigo.ui.detailtree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.nightlabs.vestigo.core.ObjectReferenceChild;
import org.nightlabs.vestigo.ui.jface.AbstractContextMenuAction;

public abstract class ObjectGraphDetailTreeContextMenuAction<E, U> extends AbstractContextMenuAction {
	protected final ObjectGraphDetailTreeComposite objectGraphDetailTreeComposite;

	public ObjectGraphDetailTreeContextMenuAction(ObjectGraphDetailTreeComposite objectGraphDetailTreeComposite) {
		if (objectGraphDetailTreeComposite == null)
			throw new IllegalArgumentException("objectGraphDetailTreeComposite == null");

		this.objectGraphDetailTreeComposite = objectGraphDetailTreeComposite;
	}

	@Override
	public void run() {
		final List<ObjectGraphDetailTreeNode> selectedNodes = getSelectedNodes();
		final List<E> selectedObjects = getSelectedObjects();
		if (selectedObjects.isEmpty())
			return;

		final U u = doUserInteractionBeforeJob(selectedNodes, selectedObjects);
		if (u != null) {
			final Display display = Display.getCurrent();
			if (display == null)
				throw new IllegalStateException("This is not invoked on the SWT UI thread!!! Current display is null!");

			Job job = new Job(getJobName()) {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					doInJob(monitor, selectedNodes, selectedObjects, u);
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							objectGraphDetailTreeComposite.refresh(); // TODO maybe better trigger via listeners in the objectReferenceChild?!
						}
					});
					return Status.OK_STATUS;
				}
			};
			job.setUser(true);
			job.schedule();
		}
	}

	protected <T> List<T> getSelectedObjectsOfType(Class<T> clazz) {
		return getObjectsOfType(getSelectedNodes(), clazz);
	}

	protected <T> List<T> getObjectsOfType(List<ObjectGraphDetailTreeNode> nodes, Class<T> clazz) {
		List<T> result = new ArrayList<T>(nodes.size());
		for (ObjectGraphDetailTreeNode node : nodes) {
			Object object = node.getObject();
			if (clazz.isInstance(object))
				result.add(clazz.cast(object));
			else if (object instanceof ObjectReferenceChild) {
				ObjectReferenceChild child = (ObjectReferenceChild) object;
				Object childValue = child.getValue();
				if (clazz.isInstance(childValue))
					result.add(clazz.cast(childValue));
			}
		}
		return result;
	}

	protected List<ObjectGraphDetailTreeNode> getSelectedNodes() {
		IStructuredSelection sel = (IStructuredSelection) objectGraphDetailTreeComposite.getSelection();
		List<ObjectGraphDetailTreeNode> result = new ArrayList<ObjectGraphDetailTreeNode>(sel.size());
		for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
			Object selected = it.next();
			if (selected instanceof ObjectGraphDetailTreeNode)
				result.add((ObjectGraphDetailTreeNode) selected);
		}
		return result;
	}

	protected abstract List<E> getSelectedObjects();

	protected abstract U doUserInteractionBeforeJob(List<ObjectGraphDetailTreeNode> selectedNodes, List<E> selectedObjects);

	protected abstract String getJobName();

	protected abstract void doInJob(IProgressMonitor monitor, List<ObjectGraphDetailTreeNode> selectedNodes, List<E> selectedObjects, U userInteractionResult);
}