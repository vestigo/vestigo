package org.nightlabs.jjqb.ui.detailtree;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.viewers.ITreeViewerListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeExpansionEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.jjqb.core.ObjectReference;
import org.nightlabs.jjqb.core.ObjectReferenceChild;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ObjectGraphDetailTreeComposite
extends Composite
{
	private static final Logger logger = LoggerFactory.getLogger(ObjectGraphDetailTreeComposite.class);

	private TreeViewer treeViewer;
	private ObjectGraphDetailTreeModel model;

	private Map<String, ExpansionState> objectGraphRootClassName2ExpansionState = new HashMap<String, ExpansionState>();

	public ObjectGraphDetailTreeComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		createTreeViewer();
	}

	private void createTreeViewer() {
		treeViewer = new TreeViewer(this, SWT.FULL_SELECTION);
		treeViewer.setUseHashlookup(true);
		treeViewer.setContentProvider(new ObjectGraphDetailTreeContentProvider());
		treeViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof ObjectGraphDetailTreeNode)
					return ((ObjectGraphDetailTreeNode)element).getLabelText();
				else
					return super.getText(element);
			}
		});
		treeViewer.addTreeListener(treeViewerListener);
	}

	private ITreeViewerListener treeViewerListener = new ITreeViewerListener() {

		@Override
		public void treeExpanded(final TreeExpansionEvent event) {
			treeExpandedOrCollapsed(event);
		}

		@Override
		public void treeCollapsed(final TreeExpansionEvent event) {
			treeExpandedOrCollapsed(event);
		}

		private void treeExpandedOrCollapsed(final TreeExpansionEvent event) {
			// We defer this, because we want the NEW expanded states and this event is triggered, before the expanded states of the nodes
			// are updated. This way is easier than to take the exception 'which node is currently about to expand/collapse' into account,
			// while collecting the expansion states. Marco :-)
			getDisplay().asyncExec(new Runnable() {
				@Override
				public void run() {
					treeExpandedOrCollapsedDeferred(event);
				}
			});
		}

		private void treeExpandedOrCollapsedDeferred(TreeExpansionEvent event) {
			if (event.getTreeViewer().getControl().isDisposed())
				return;

			Object element = event.getElement();
			if (!(element instanceof ObjectGraphDetailTreeNode)) {
				logger.debug("treeExpandedOrCollapsed: Ignoring element of unknown type: {}", element);
				return;
			}

			ObjectGraphDetailTreeNode node = (ObjectGraphDetailTreeNode) element;
			ObjectGraphDetailTreeNode rootNode = node;
			while (rootNode.getParentNode() != null)
				rootNode = rootNode.getParentNode();

			registerExpansionState(rootNode);
		}
	};

	private void registerExpansionState(ObjectGraphDetailTreeNode rootNode)
	{
		String className = getClassName(rootNode);
		ExpansionState expansionState = new ExpansionState(className);
		collectExpandedChildNodesRecursively(expansionState, null, rootNode);
		objectGraphRootClassName2ExpansionState.put(className, expansionState);
	}

	private void collectExpandedChildNodesRecursively(ExpansionState expansionState, ExpandedNode parent, ObjectGraphDetailTreeNode node)
	{
		if (expansionState == null)
			throw new IllegalArgumentException("expansionState == null");

		if (node == null)
			throw new IllegalArgumentException("node == null");

		boolean isExpanded = treeViewer.getExpandedState(node);
		if (!isExpanded)
			return;

		Object object = node.getObject();

		if (object instanceof ObjectReferenceChild) {
			ObjectReferenceChild objectReferenceChild = (ObjectReferenceChild) object;
			String fieldName = objectReferenceChild.getFieldDesc().getFieldName();
			ExpandedNode expandedNode = new ExpandedNode(expansionState, parent, fieldName);

			if (parent != null)
				parent.getExpandedChildNodes().add(expandedNode);
			else
				expansionState.getExpandedChildNodes().add(expandedNode);

			ObjectGraphDetailTreeNode[] childNodes = node.getChildNodes();
			if (childNodes != null) {
				for (ObjectGraphDetailTreeNode childNode : childNodes)
					collectExpandedChildNodesRecursively(expansionState, expandedNode, childNode);
			}
		}
	}

	private String getClassName(ObjectGraphDetailTreeNode node)
	{
		Object object = node.getObject();

		if (object instanceof ObjectReferenceChild)
			object = ((ObjectReferenceChild)object).getValue();

		if (object instanceof ObjectReference)
			return ((ObjectReference)object).getObjectClassName();

		if (object == null)
			return String.valueOf(null);

		return object.getClass().getName();
	}

	public ObjectGraphDetailTreeModel getInput() {
		return model;
	}

	public final void setInput(ObjectGraphDetailTreeModel model) {
		this.model = model;
		treeViewer.setInput(model == null ? null : model.getTopLevelNodes());
	}

}
