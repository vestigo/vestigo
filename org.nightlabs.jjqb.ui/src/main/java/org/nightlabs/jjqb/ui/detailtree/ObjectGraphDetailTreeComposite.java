package org.nightlabs.jjqb.ui.detailtree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ITreeViewerListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeExpansionEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.jjqb.core.ObjectReferenceChild;
import org.nightlabs.util.Util;
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

	private Map<String, ExpandedNode> objectGraphRootClassName2ExpansionState = new HashMap<String, ExpandedNode>();

	public ObjectGraphDetailTreeComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		createTreeViewer();
	}

	private void createTreeViewer() {
		treeViewer = new TreeViewer(this, SWT.FULL_SELECTION);
		treeViewer.setUseHashlookup(true);
		ObjectGraphDetailTreeContentProvider treeContentProvider = new ObjectGraphDetailTreeContentProvider();
		treeViewer.setContentProvider(treeContentProvider);
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
		treeContentProvider.addChildrenLoadedListener(childrenLoadedListener);
	}

	private ChildrenLoadedListener childrenLoadedListener = new ChildrenLoadedListener() {
		@Override
		public void childrenLoaded(ChildrenLoadedEvent event) {
			logger.debug("childrenLoadedListener.childrenLoaded: entered: {}", event.getParentNode().getLabelText());

			if (event.getParentNode().getChildNodes() == null)
				return;

			ExpandedNode rootExpandedNode = objectGraphRootClassName2ExpansionState.get(
					event.getParentNode().getRootNode().getReferencedObjectClassName()
			);

			if (rootExpandedNode != null && rootExpandedNode.isExpanded()) {
				for (ObjectGraphDetailTreeNode node : event.getParentNode().getChildNodes()) {
					restoreExpansionState(node);
				}
			}
		}
	};

	private ExpandedNode findCorrespondingExpandedChildNode(ExpandedNode parentNode, ObjectGraphDetailTreeNode childTreeNode)
	{
		for (ExpandedNode childNode : parentNode.getExpandedChildNodes()) {
			Object object = childTreeNode.getObject();
			if (object instanceof ObjectReferenceChild) {
				ObjectReferenceChild objectReferenceChild = (ObjectReferenceChild) object;

				int orc_idx = -1;
				if (childNode.getIndex() >= 0) {
					orc_idx = objectReferenceChild.getOwner().getChildren().indexOf(objectReferenceChild);
				}

				String orc_fn = objectReferenceChild.getFieldDesc() == null ? null : objectReferenceChild.getFieldDesc().getFieldName();
				if (Util.equals(childNode.getFieldName(), orc_fn) && childNode.getIndex() == orc_idx)
					return childNode;
			}
		}
		return null;
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
			registerExpansionState(node);

			ObjectGraphDetailTreeNode[] childNodes = node.getChildNodes();
			if (childNodes != null) {
				for (ObjectGraphDetailTreeNode childNode : childNodes)
					restoreExpansionState(childNode);
			}
		}
	};

	private void registerExpansionState(ObjectGraphDetailTreeNode node)
	{
		String className = node.getRootNode().getReferencedObjectClassName();
		ExpandedNode expandedNode = objectGraphRootClassName2ExpansionState.get(className);
		if (expandedNode == null) {
			expandedNode = new ExpandedNode(null, null, -1);
			objectGraphRootClassName2ExpansionState.put(className, expandedNode);
		}
//		collectExpandedChildNodesRecursively(expansionState, null, rootNode);

		List<ObjectGraphDetailTreeNode> nodeParentChildPath = node.getParentChildPath();

		boolean isExpanded = treeViewer.getExpandedState(nodeParentChildPath.get(0)); // root node
		expandedNode.setExpanded(isExpanded);

		for (ObjectGraphDetailTreeNode treeNode : nodeParentChildPath) {
			if (treeNode.getParentNode() == null)
				continue; // already checked root node => ignore and thus shift the relation from treeNode to expandedNode by one level


			ExpandedNode parent = expandedNode;
			expandedNode = findCorrespondingExpandedChildNode(parent, treeNode);
			if (expandedNode == null) {
				Object object = treeNode.getObject();
				if (object instanceof ObjectReferenceChild) {
					ObjectReferenceChild objectReferenceChild = (ObjectReferenceChild) object;
					String fieldName = objectReferenceChild.getFieldDesc() == null ? null : objectReferenceChild.getFieldDesc().getFieldName();
					int index = -1;
					if (fieldName == null) {
						index = objectReferenceChild.getOwner().getChildren().indexOf(objectReferenceChild);
					}
					expandedNode = new ExpandedNode(parent, fieldName, index);
					parent.getExpandedChildNodes().add(expandedNode);
				}
				else {
					logger.warn(
							"registerExpansionState: treeNode.getObject() returned an object of unknown type: class={} instance={}",
							(object == null ? null : object.getClass().getName()),
							object
					);
					return;
				}
			}
			isExpanded = treeViewer.getExpandedState(treeNode);
			expandedNode.setExpanded(isExpanded);
		}
	}

//	private void collectExpandedChildNodesRecursively(ExpansionState expansionState, ExpandedNode parent, ObjectGraphDetailTreeNode node)
//	{
//		if (expansionState == null)
//			throw new IllegalArgumentException("expansionState == null");
//
//		if (node == null)
//			throw new IllegalArgumentException("node == null");
//
//		boolean isExpanded = treeViewer.getExpandedState(node);
//		if (!isExpanded)
//			return;
//
//		Object object = node.getObject();
//		ExpandedNode expandedNode = null;
//
//		if (object instanceof ObjectReference) {
//			if (parent != null)
//				throw new IllegalStateException("parent != null");
//
//			expandedNode = new ExpandedNode(expansionState, parent, null, -1);
//			if (expansionState.getExpandedNode() != null)
//				throw new IllegalStateException("Why is this already assigned? expansionState.getExpandedNode() != null");
//
//			expansionState.setExpandedNode(expandedNode);
//		}
//		else if (object instanceof ObjectReferenceChild) {
//			if (parent == null)
//				throw new IllegalStateException("parent == null");
//
//			ObjectReferenceChild objectReferenceChild = (ObjectReferenceChild) object;
//			String fieldName = objectReferenceChild.getFieldDesc() == null ? null : objectReferenceChild.getFieldDesc().getFieldName();
//			int index = -1;
//			if (fieldName == null) {
//				index = objectReferenceChild.getOwner().getChildren().indexOf(objectReferenceChild);
//			}
//			expandedNode = new ExpandedNode(expansionState, parent, fieldName, index);
//			parent.getExpandedChildNodes().add(expandedNode);
//		}
//		else {
//			logger.warn(
//					"collectExpandedChildNodesRecursively: node.getObject() returned an object of unknown type: class={} instance={}",
//					(object == null ? null : object.getClass().getName()),
//					object
//			);
//			return;
//		}
//
//		ObjectGraphDetailTreeNode[] childNodes = node.getChildNodes();
//		if (childNodes != null) {
//			for (ObjectGraphDetailTreeNode childNode : childNodes)
//				collectExpandedChildNodesRecursively(expansionState, expandedNode, childNode);
//		}
//	}

	public ObjectGraphDetailTreeModel getInput() {
		return model;
	}

	public final void setInput(ObjectGraphDetailTreeModel model) {
		this.model = model;
		treeViewer.setInput(model == null ? null : model.getTopLevelNodes());
		expandPreviouslyExpandedNodes();
	}

	private void expandPreviouslyExpandedNodes() {
		if (model == null)
			return;

		for (ObjectGraphDetailTreeNode rootNode : model.getTopLevelNodes()) {
			restoreExpansionState(rootNode);
//			String className = rootNode.getReferencedObjectClassName();
//			ExpandedNode expandedNode = objectGraphRootClassName2ExpansionState.get(className);
//			if (expandedNode != null && expandedNode.isExpanded()) {
//				treeViewer.setExpandedState(rootNode, true);
//			}
		}
	}

	private void restoreExpansionState(ObjectGraphDetailTreeNode node)
	{
		ExpandedNode rootExpandedNode = objectGraphRootClassName2ExpansionState.get(
				node.getRootNode().getReferencedObjectClassName()
		);
		ExpandedNode expandedNode = rootExpandedNode;

		List<ObjectGraphDetailTreeNode> nodeParentChildPath = node.getParentChildPath();

		for (ObjectGraphDetailTreeNode treeNode : nodeParentChildPath) {
			if (treeNode.getParentNode() == null)
				continue; // already checked root node => ignore and thus shift the relation from treeNode to expandedNode by one level

			expandedNode = findCorrespondingExpandedChildNode(expandedNode, treeNode);
			if (expandedNode == null || !expandedNode.isExpanded()) {
				expandedNode = null;
				break;
			}
		}

		if (expandedNode != null && expandedNode.isExpanded()) {
//			for (ObjectGraphDetailTreeNode treeNode : nodeParentChildPath)
//				treeViewer.setExpandedState(treeNode, true);
			treeViewer.setExpandedState(node, true);

			ObjectGraphDetailTreeNode[] childNodes = node.getChildNodes();
			if (childNodes != null) {
				for (ObjectGraphDetailTreeNode childNode : childNodes) {
					restoreExpansionState(childNode);
				}
			}
		}
	}
}
