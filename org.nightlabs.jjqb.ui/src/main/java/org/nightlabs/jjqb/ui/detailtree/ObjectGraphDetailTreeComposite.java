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
			logger.debug("childrenLoadedListener.childrenLoaded: event.parentNode={}", event.getParentNode());

			ObjectGraphDetailTreeNode[] childNodes = event.getParentNode().getChildNodes();
			if (childNodes != null) {
				for (ObjectGraphDetailTreeNode node : childNodes)
					restoreExpansionState(node);
			}
		}
	};

	private ExpansionState getCorrespondingChildExpansionState(ExpansionState parentExpansionState, ObjectGraphDetailTreeNode childTreeNode)
	{
		String childTreeNode_fieldName = null;
		int childTreeNode_index = -1;

		Object object = childTreeNode.getObject();
		if (object instanceof ObjectReferenceChild) {
			ObjectReferenceChild objectReferenceChild = (ObjectReferenceChild) object;

			childTreeNode_fieldName = objectReferenceChild.getFieldDesc() == null ? null : objectReferenceChild.getFieldDesc().getFieldName();
			if (childTreeNode_fieldName == null)
				childTreeNode_index = objectReferenceChild.getOwner().getChildren().indexOf(objectReferenceChild);
		}

		ExpansionState childExpansionState = parentExpansionState.getChildExpansionState(childTreeNode_fieldName, childTreeNode_index);

		if (logger.isDebugEnabled()) {
			logger.debug(
					"getCorrespondingChildExpansionState: parentExpansionState={} childTreeNode={} childExpansionState={}",
					new Object[] { parentExpansionState, childTreeNode, childExpansionState }
			);
		}

		return childExpansionState;
	}

	private ITreeViewerListener treeViewerListener = new ITreeViewerListener() {

		@Override
		public void treeExpanded(final TreeExpansionEvent event) { treeExpandedOrCollapsed(event); }

		@Override
		public void treeCollapsed(final TreeExpansionEvent event) { treeExpandedOrCollapsed(event); }

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
		logger.debug("registerExpansionState: node={}", node);

		String className = node.getRootNode().getReferencedObjectClassName();
		ExpansionState expansionState = objectGraphRootClassName2ExpansionState.get(className);
		if (expansionState == null) {
			expansionState = new ExpansionState(null, null, -1);
			objectGraphRootClassName2ExpansionState.put(className, expansionState);
		}

		List<ObjectGraphDetailTreeNode> nodeParentChildPath = node.getParentChildPath();

		boolean isExpanded = treeViewer.getExpandedState(nodeParentChildPath.get(0)); // root node (always exists)
		expansionState.setExpanded(isExpanded);

		for (ObjectGraphDetailTreeNode treeNode : nodeParentChildPath) {
			if (treeNode.getParentNode() == null)
				continue; // already checked root node => ignore and thus shift the relation from treeNode to expansionState by one level

			ExpansionState parent = expansionState;
			expansionState = getCorrespondingChildExpansionState(parent, treeNode);
			if (expansionState == null) {
				Object object = treeNode.getObject();
				if (object instanceof ObjectReferenceChild) {
					ObjectReferenceChild objectReferenceChild = (ObjectReferenceChild) object;
					String fieldName = objectReferenceChild.getFieldDesc() == null ? null : objectReferenceChild.getFieldDesc().getFieldName();
					int index = -1;
					if (fieldName == null) {
						index = objectReferenceChild.getOwner().getChildren().indexOf(objectReferenceChild);
					}
					expansionState = new ExpansionState(parent, fieldName, index);
					parent.addChildExpansionState(expansionState);
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
			expansionState.setExpanded(isExpanded);
			logger.trace("registerExpansionState: expansionState={}", expansionState);
		}
	}

	public ObjectGraphDetailTreeModel getInput() {
		return model;
	}

	public final void setInput(ObjectGraphDetailTreeModel model) {
		this.model = model;
		treeViewer.setInput(model == null ? null : model.getTopLevelNodes());
		if (model != null) {
			for (ObjectGraphDetailTreeNode rootNode : model.getTopLevelNodes())
				restoreExpansionState(rootNode);
		}
	}

	private void restoreExpansionState(ObjectGraphDetailTreeNode node)
	{
		logger.debug("restoreExpansionState: node={}", node);

		ExpansionState rootExpansionState = objectGraphRootClassName2ExpansionState.get(
				node.getRootNode().getReferencedObjectClassName()
		);
		ExpansionState expansionState = rootExpansionState;

		List<ObjectGraphDetailTreeNode> nodeParentChildPath = node.getParentChildPath();

		for (ObjectGraphDetailTreeNode treeNode : nodeParentChildPath) {
			if (treeNode.getParentNode() == null)
				continue; // already checked root node => ignore and thus shift the relation from treeNode to expansionState by one level

			expansionState = getCorrespondingChildExpansionState(expansionState, treeNode);
			if (expansionState == null || !expansionState.isExpanded()) {
				expansionState = null;
				break;
			}
		}

		if (expansionState != null && expansionState.isExpanded()) {
			treeViewer.setExpandedState(node, true);

			ObjectGraphDetailTreeNode[] childNodes = node.getChildNodes();
			if (childNodes != null) {
				for (ObjectGraphDetailTreeNode childNode : childNodes)
					restoreExpansionState(childNode);
			}
		}
	}
}
