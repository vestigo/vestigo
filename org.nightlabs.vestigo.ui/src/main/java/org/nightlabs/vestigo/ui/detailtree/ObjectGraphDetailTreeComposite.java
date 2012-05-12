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
package org.nightlabs.vestigo.ui.detailtree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeViewerListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeExpansionEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.nightlabs.vestigo.core.LabelTextOption;
import org.nightlabs.vestigo.core.ObjectReferenceChild;
import org.nightlabs.vestigo.core.oda.ResultSet;
import org.nightlabs.vestigo.ui.labeltextoptionaction.LabelTextOptionsContainer;
import org.nightlabs.vestigo.ui.licence.LicenceNotValidDialog;
import org.nightlabs.vestigo.ui.resource.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ObjectGraphDetailTreeComposite
extends Composite
implements LabelTextOptionsContainer, ISelectionProvider
{
	private static final Logger logger = LoggerFactory.getLogger(ObjectGraphDetailTreeComposite.class);

	private TreeViewer treeViewer;
	private MenuManager contextMenuManager;
	private Menu contextMenu;
	private ObjectGraphDetailTreeModel model;
	private EnumSet<LabelTextOption> labelTextOptions = EnumSet.of(LabelTextOption.showPersistentID);

	private Map<String, ExpansionState> objectGraphRootClassName2ExpansionState = new HashMap<String, ExpansionState>();

	public ObjectGraphDetailTreeComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		createTreeViewer();
	}

	@Override
	public Set<LabelTextOption> getLabelTextOptions() {
		if (labelTextOptions == null)
			return null;
		else
			return Collections.unmodifiableSet(labelTextOptions);
	}

	@Override
	public void setLabelTextOptions(Set<LabelTextOption> labelTextOptions) {
		if (labelTextOptions == null)
			this.labelTextOptions = null;
		else {
			EnumSet<LabelTextOption> s = EnumSet.noneOf(LabelTextOption.class);
			s.addAll(labelTextOptions);
			this.labelTextOptions = s;
		}
		treeViewer.refresh(true);
	}

	private void createTreeViewer() {
		treeViewer = new TreeViewer(this, SWT.FULL_SELECTION | SWT.MULTI);
		treeViewer.setUseHashlookup(true);
		ObjectGraphDetailTreeContentProvider treeContentProvider = new ObjectGraphDetailTreeContentProvider();
		treeViewer.setContentProvider(treeContentProvider);
		treeViewer.setLabelProvider(new LabelProvider() {
			@Override
			public Image getImage(Object element) {
				if (element instanceof ObjectGraphDetailTreeNode)
					return ((ObjectGraphDetailTreeNode)element).getLabelImage();
				else
					return super.getImage(element);
			}
			@Override
			public String getText(Object element) {
				if (element instanceof ObjectGraphDetailTreeNode)
					return ((ObjectGraphDetailTreeNode)element).getLabelText(labelTextOptions);
				else
					return super.getText(element);
			}
		});
		treeViewer.addTreeListener(treeViewerListener);
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				SelectionChangedEvent newEvent = new SelectionChangedEvent(ObjectGraphDetailTreeComposite.this, event.getSelection());
				for (Object l : selectionChangedListeners.getListeners())
					((ISelectionChangedListener)l).selectionChanged(newEvent);
			}
		});
		
		contextMenuManager = new MenuManager();
		contextMenuManager.add(copyAction);
		contextMenu = contextMenuManager.createContextMenu(treeViewer.getTree());
		treeViewer.getTree().setMenu(contextMenu);
		treeContentProvider.addChildrenLoadedListener(childrenLoadedListener);
		registerOpenLicenceNotValidDialogListeners();
		registerExpandCollapseKeyAndMouseListeners();
		registerCopyToClipboardKeyListener();
	}
	
	private IAction copyAction = new Action(Messages.getString("ObjectGraphDetailTreeComposite.copyAction.text")) { //$NON-NLS-1$
		@Override
		public void run() {
			IStructuredSelection sel = (IStructuredSelection) getSelection();
			StringBuilder labelTextSB = new StringBuilder();
			for (Object object : sel.toArray()) {
				if (!(object instanceof ObjectGraphDetailTreeNode))
					continue;

				ObjectGraphDetailTreeNode node = (ObjectGraphDetailTreeNode) object;
				String labelText = node.getLabelText(labelTextOptions);
				if (labelTextSB.length() > 0)
					labelTextSB.append('\n');

				labelTextSB.append(labelText);
			}

			Clipboard cb = new Clipboard(getDisplay());
			cb.setContents(new Object[] { labelTextSB.toString() }, new Transfer[]{ TextTransfer.getInstance() });
			cb.dispose();
		}
	};
	
	private void registerCopyToClipboardKeyListener() {
		treeViewer.getTree().addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				logger.debug("keyReleased: keyCode={}", e.keyCode); //$NON-NLS-1$
				if (e.keyCode == 99) // CTRL+C
					copyAction.run();
			}
		});
	}

	private void registerExpandCollapseKeyAndMouseListeners() {
		treeViewer.getTree().addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.character == '\r' || e.character == '\n' || e.character == ' ')
					userToggleExpansionState(true, true);
				else if (e.keyCode == 16777220) // cursor RIGHT
					userToggleExpansionState(true, false);
				else if (e.keyCode == 16777219) // cursor LEFT
					userToggleExpansionState(false, true);
			}
		});

		treeViewer.getTree().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				userToggleExpansionState(true, true);
			}
		});
	}

	private void userToggleExpansionState(boolean expand, boolean collapse)
	{
		ISelection _selection = treeViewer.getSelection();
		if (!(_selection instanceof IStructuredSelection))
			return;

		IStructuredSelection selection = (IStructuredSelection) _selection;

		final List<ObjectGraphDetailTreeNode> expandedOrCollapsedNodes = new LinkedList<ObjectGraphDetailTreeNode>();

		for (Iterator<?> it = selection.iterator(); it.hasNext(); ) {
			Object o = it.next();
			boolean isExpanded = treeViewer.getExpandedState(o);
			if (isExpanded) {
				if (!collapse)
					continue;

				treeViewer.collapseToLevel(o, TreeViewer.ALL_LEVELS);
			}
			else {
				if (!expand)
					continue;

				treeViewer.expandToLevel(o, 1);
			}

			if (o instanceof ObjectGraphDetailTreeNode)
				expandedOrCollapsedNodes.add((ObjectGraphDetailTreeNode) o);
		}

		if (!expandedOrCollapsedNodes.isEmpty()) {
			getDisplay().asyncExec(new Runnable() {
				@Override
				public void run() {
					for (ObjectGraphDetailTreeNode node : expandedOrCollapsedNodes) {
						userExpandedOrCollapsed(node);
					}
				}
			});
		}
	}

	private void registerOpenLicenceNotValidDialogListeners() {
		// We want the dialog to open, if the 'Enter' or the 'Space' key was pressed (while an appropriate item is selected).
		treeViewer.getTree().addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.character == '\r' || e.character == '\n' || e.character == ' ')
					openLicenceNotValidDialogIfLicenceNotValidItemSelected();
			}
		});

		// We want the dialog to open, if the user clicks on an appropriate item.
		treeViewer.getTree().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				openLicenceNotValidDialogIfLicenceNotValidItemSelected();
			}
		});
	}

	private void openLicenceNotValidDialogIfLicenceNotValidItemSelected()
	{
		ISelection _selection = treeViewer.getSelection();
		if (!(_selection instanceof IStructuredSelection))
			return;

		IStructuredSelection selection = (IStructuredSelection) _selection;
		for (Iterator<?> it = selection.iterator(); it.hasNext(); ) {
			Object o = it.next();
			if (o instanceof ObjectGraphDetailTreeNode) {
				ObjectGraphDetailTreeNode n = (ObjectGraphDetailTreeNode) o;
				if (n.getObject() == ResultSet.LICENCE_NOT_VALID) {
					new LicenceNotValidDialog(getShell()).open();
					return;
				}
			}
		}
	}

	private ChildrenLoadedListener childrenLoadedListener = new ChildrenLoadedListener() {
		@Override
		public void childrenLoaded(ChildrenLoadedEvent event) {
			logger.debug("childrenLoadedListener.childrenLoaded: event.parentNode={}", event.getParentNode()); //$NON-NLS-1$

			ObjectGraphDetailTreeNode[] childNodes = event.getParentNode().getChildNodes();
			if (childNodes != null) {
				for (ObjectGraphDetailTreeNode node : childNodes)
					restoreExpansionState(node);
			}
		}
	};

	private ExpansionState getCorrespondingChildExpansionState(ExpansionState parentExpansionState, ObjectGraphDetailTreeNode childTreeNode)
	{
		if (parentExpansionState == null)
			throw new IllegalArgumentException("parentExpansionState == null"); //$NON-NLS-1$

		if (childTreeNode == null)
			throw new IllegalArgumentException("childTreeNode == null"); //$NON-NLS-1$

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
					"getCorrespondingChildExpansionState: parentExpansionState={} childTreeNode={} childExpansionState={}", //$NON-NLS-1$
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
				logger.debug("treeExpandedOrCollapsed: Ignoring element of unknown type: {}", element); //$NON-NLS-1$
				return;
			}

			ObjectGraphDetailTreeNode node = (ObjectGraphDetailTreeNode) element;
			userExpandedOrCollapsed(node);
		}
	};

	private void userExpandedOrCollapsed(ObjectGraphDetailTreeNode node)
	{
		registerExpansionState(node);

		ObjectGraphDetailTreeNode[] childNodes = node.getChildNodes();
		if (childNodes != null) {
			for (ObjectGraphDetailTreeNode childNode : childNodes)
				restoreExpansionState(childNode);
		}
	}

	private void registerExpansionState(ObjectGraphDetailTreeNode node)
	{
		logger.debug("registerExpansionState: node={}", node); //$NON-NLS-1$

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
							"registerExpansionState: treeNode.getObject() returned an object of unknown type: class={} instance={}", //$NON-NLS-1$
							(object == null ? null : object.getClass().getName()),
							object
					);
					return;
				}
			}
			isExpanded = treeViewer.getExpandedState(treeNode);
			expansionState.setExpanded(isExpanded);
			logger.trace("registerExpansionState: expansionState={}", expansionState); //$NON-NLS-1$
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
		logger.debug("restoreExpansionState: node={}", node); //$NON-NLS-1$

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
	
	public MenuManager getContextMenuManager() {
		return contextMenuManager;
	}

	@Override
	public ISelection getSelection() {
		return treeViewer.getSelection();
	}
	
	@Override
	public void setSelection(ISelection selection) {
		treeViewer.setSelection(selection);
	}
	
	private ListenerList selectionChangedListeners = new ListenerList();
	
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}
}
