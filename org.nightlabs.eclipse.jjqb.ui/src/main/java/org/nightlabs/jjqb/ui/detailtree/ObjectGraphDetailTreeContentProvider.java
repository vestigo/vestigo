package org.nightlabs.eclipse.jjqb.ui.detailtree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.nightlabs.eclipse.jjqb.core.ObjectReference;
import org.nightlabs.eclipse.jjqb.core.ObjectReferenceChild;

public class ObjectGraphDetailTreeContentProvider
implements ITreeContentProvider
{
	private TreeViewer viewer;
	private Display display;
	private String loadingMessage = "Loading...";

	@Override
	public void dispose() { }

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
	{
		if (viewer == null)
			throw new IllegalArgumentException("viewer == null");
		if (!(viewer instanceof TreeViewer))
			throw new IllegalArgumentException("viewer is not an instance of TreeViewer!");
		if (viewer.getControl() == null || viewer.getControl().getDisplay() == null)
			throw new IllegalArgumentException("WTF?!???! viewer.control == null || viewer.control.display == null");

		this.viewer = (TreeViewer) viewer;
		this.display = viewer.getControl().getDisplay();
	}

	@Override
	public Object[] getElements(Object inputElement)
	{
		return getChildren(inputElement);
	}

	private Set<ObjectGraphDetailTreeNode> parentNodesLoadingChildren = new HashSet<ObjectGraphDetailTreeNode>();

	@Override
	public Object[] getChildren(Object parentElement)
	{
		if (parentElement instanceof List<?>)
			return ((List<?>)parentElement).toArray();

		if (!(parentElement instanceof ObjectGraphDetailTreeNode))
			throw new IllegalArgumentException("parentElement is neither a List nor an instance of ObjectGraphDetailTreeNode: " + parentElement);

		if (viewer == null)
			throw new IllegalStateException("viewer == null :: inputChanged(...) must be called first!");

		final ObjectGraphDetailTreeNode parentNode = (ObjectGraphDetailTreeNode) parentElement;
		ObjectGraphDetailTreeNode[] childNodes = parentNode.getChildNodes();
		if (childNodes == null) {
			if (parentNodesLoadingChildren.add(parentNode)) {
				Job job = new Job("Loading children") {
					@Override
					protected IStatus run(IProgressMonitor monitor)
					{
						final ObjectGraphDetailTreeNode[] childNodes = loadChildNodes(parentNode, monitor);

						display.asyncExec(new Runnable() {
							@Override
							public void run() {
								if (childNodes == null)
									parentNode.setChildNodes(new ObjectGraphDetailTreeNode[0]);
								else
									parentNode.setChildNodes(childNodes);

								parentNodesLoadingChildren.remove(parentNode);

								viewer.refresh(parentNode);
							}
						});
						return Status.OK_STATUS;
					}
				};
				job.schedule();
			}
			return new Object[] { loadingMessage };
		}

		return childNodes;
	}

	protected ObjectGraphDetailTreeNode[] loadChildNodes(final ObjectGraphDetailTreeNode parentNode, IProgressMonitor monitor)
	{
		try {
			Object object = parentNode.getObject();
			if (object instanceof ObjectReferenceChild)
				object = ((ObjectReferenceChild)object).getValue();

			if (object instanceof ObjectReference) {
				ObjectReference objectReference = (ObjectReference) object;
				Collection<?> children = objectReference.getChildren();
				List<ObjectGraphDetailTreeNode> childNodes = new ArrayList<ObjectGraphDetailTreeNode>(children.size());
				for (Object child : children)
					childNodes.add(new ObjectGraphDetailTreeNode(parentNode, child));

				return childNodes.toArray(new ObjectGraphDetailTreeNode[childNodes.size()]);
			}
			return null;
		} catch (final Exception x) {
			display.asyncExec(new Runnable() {
				@Override
				public void run() {
					parentNodesLoadingChildren.remove(parentNode);
					ObjectGraphDetailTreeNode[] children = new ObjectGraphDetailTreeNode[1];
					children[0] = new ErrorObjectGraphDetailTreeNode(parentNode, "Error: " + x);
					parentNode.setChildNodes(children);

					viewer.refresh(parentNode);
				}
			});

			if (x instanceof RuntimeException)
				throw (RuntimeException)x;

			throw new RuntimeException(x);
		}
	}

	@Override
	public Object getParent(Object element)
	{
		if (!(element instanceof ObjectGraphDetailTreeNode))
			throw new IllegalArgumentException("element is not an instance of ObjectGraphDetailTreeNode: " + element);

		return ((ObjectGraphDetailTreeNode)element).getParentNode();
	}

	@Override
	public boolean hasChildren(Object element)
	{
		if (loadingMessage == element)
			return false;

		if (!(element instanceof ObjectGraphDetailTreeNode))
			throw new IllegalArgumentException("element is not an instance of ObjectGraphDetailTreeNode: " + element);

		ObjectGraphDetailTreeNode node = (ObjectGraphDetailTreeNode) element;
		return node.hasChildren();
	}
}
