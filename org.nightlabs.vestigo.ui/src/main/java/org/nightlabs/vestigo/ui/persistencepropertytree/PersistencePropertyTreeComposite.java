package org.nightlabs.vestigo.ui.persistencepropertytree;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class PersistencePropertyTreeComposite extends Composite implements ISelectionProvider
{
	public static enum Property {
		doubleClick
	}

	private Display display;
	private String persistenceAPI;
	private TreeViewer treeViewer;
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	public PersistencePropertyTreeComposite(Composite parent, String persistenceAPI) {
		super(parent, SWT.NONE);
		this.display = getDisplay();
		this.persistenceAPI = persistenceAPI;

		if (persistenceAPI == null)
			throw new IllegalArgumentException("persistenceAPI == null");

		setLayout(new FillLayout());

		createTreeViewer(this);
	}

	private void createTreeViewer(Composite parent)
	{
		treeViewer = new TreeViewer(parent, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		treeViewer.setLabelProvider(new PersistencePropertyTreeLabelProvider());
		treeViewer.setContentProvider(new PersistencePropertyTreeContentProvider());
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				SelectionChangedEvent newEvent = new SelectionChangedEvent(PersistencePropertyTreeComposite.this, event.getSelection());
				for (Object l : selectionChangedListeners.getListeners())
					((ISelectionChangedListener)l).selectionChanged(newEvent);
			}
		});
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				propertyChangeSupport.firePropertyChange(Property.doubleClick.name(), null, event.getSelection());
			}
		});

		treeViewer.setInput(">>> Loading data... <<<");
		Job job = new Job("Loading persistence properties") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				final List<PersistencePropertyCategory> persistencePropertyCategories = getPersistencePropertyCategories();
				display.asyncExec(new Runnable() {
					@Override
					public void run() {
						treeViewer.setInput(persistencePropertyCategories);
					}
				});
				return Status.OK_STATUS;
			}
		};
		job.setPriority(Job.INTERACTIVE);
		job.schedule();
	}

	private void processConfigurationElement(Map<String, PersistencePropertyCategory> id2category, PersistencePropertyCategory category, IConfigurationElement element)
	{
		String id = element.getAttribute("id");
		String orderHintStr = element.getAttribute("orderHint");
		final int orderHintDefault = 500;
		int orderHint = orderHintDefault;
		if (orderHintStr != null) {
			try {
				orderHint = Integer.parseInt(orderHintStr);
			} catch (NumberFormatException x) {
				// ignore
			}
		}

		if ("category".equals(element.getName())) {
			String persistenceAPI = element.getAttribute("persistenceAPI");
			PersistencePropertyCategory cat = id2category.get(id);
			if (cat == null) {
				if (!persistenceAPIMatches(persistenceAPI))
					return; // Skip the new category!

				cat = new PersistencePropertyCategory();
				cat.setId(id);
				cat.setOrderHint(orderHint);
				id2category.put(id, cat);
				cat.setParentCategory(category);
				if (category != null)
					category.getChildCategories().add(cat);
			}

			if (cat.getParentCategory() == null)
				cat.setParentCategory(category);

			if (cat.getPersistenceAPI() == null)
				cat.setPersistenceAPI(persistenceAPI);
			else if (persistenceAPI != null && !persistenceAPI.equals(cat.getPersistenceAPI()))
				throw new IllegalStateException("category '" + id + "' is declared multiple times with different persistenceAPI!");

			if (cat.getName() == null)
				cat.setName(element.getAttribute("name"));

			if (cat.getDescription() == null)
				cat.setDescription(element.getAttribute("description"));

			if (cat.getOrderHint() == orderHintDefault)
				cat.setOrderHint(orderHint);

			for (IConfigurationElement child : element.getChildren())
				processConfigurationElement(id2category, cat, child);
		}
		else if ("property".equals(element.getName())) {
			if (category == null)
				throw new IllegalStateException("category '" + id + "' is declared without a category!");

			PersistenceProperty property = new PersistenceProperty();
			property.setId(id);
			property.setOrderHint(orderHint);
			property.setCategory(category);
			property.setDescription(element.getAttribute("description"));
			category.getPersistenceProperties().add(property);
		}
	}

	private boolean persistenceAPIMatches(String persistenceAPI)
	{
		if (persistenceAPI == null)
			return true;

		String[] persistenceAPIArray = persistenceAPI.split(",");
		for (int i = 0; i < persistenceAPIArray.length; i++) {
			String pa = persistenceAPIArray[i].trim();
			if (this.persistenceAPI.equals(pa))
				return true;
		}

		return false;
	}

	private List<PersistencePropertyCategory> getPersistencePropertyCategories()
	{
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		if (registry == null)
			throw new IllegalStateException("Platform.getExtensionRegistry() returned null!"); //$NON-NLS-1$

		final String extensionPointId = "org.nightlabs.vestigo.ui.persistenceProperty";
		final IExtensionPoint extensionPoint = registry.getExtensionPoint(extensionPointId);
		if (extensionPoint == null)
			throw new IllegalStateException("Unable to resolve extension-point: " + extensionPointId); //$NON-NLS-1$

		Map<String, PersistencePropertyCategory> id2category = new HashMap<String, PersistencePropertyCategory>();
		for (final IExtension extension : extensionPoint.getExtensions()) {
			final IConfigurationElement[] elements = extension.getConfigurationElements();
			for (final IConfigurationElement element : elements) {
				processConfigurationElement(id2category, null, element);
			}
		}

		ArrayList<PersistencePropertyCategory> result = new ArrayList<PersistencePropertyCategory>();
		for (PersistencePropertyCategory category : id2category.values()) {
			if (category.getParentCategory() == null)
				result.add(category);

			Collections.sort(category.getChildCategories());
			Collections.sort(category.getPersistenceProperties());
		}

		Collections.sort(result);

		return result;
	}

	private static class PersistencePropertyTreeLabelProvider extends LabelProvider
	{
		@Override
		public String getText(Object element)
		{
			if (element instanceof PersistenceProperty) {
				PersistenceProperty prop = (PersistenceProperty) element;
				return prop.getId();
			}
			if (element instanceof PersistencePropertyCategory) {
				PersistencePropertyCategory cat = (PersistencePropertyCategory) element;
				return cat.getName();
			}
			return super.getText(element);
		}
	}

	private static class PersistencePropertyTreeContentProvider implements ITreeContentProvider
	{
		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) { }

		@Override
		public Object[] getElements(Object inputElement)
		{
			if (inputElement instanceof Collection<?>)
				return ((Collection<?>)inputElement).toArray();

			if (inputElement instanceof Object[])
				return (Object[])inputElement;

			return new Object[] { inputElement };
		}

		@Override
		public Object[] getChildren(Object parentElement)
		{
			if (parentElement instanceof PersistencePropertyCategory) {
				PersistencePropertyCategory cat = (PersistencePropertyCategory) parentElement;
				List<Object> result = new ArrayList<Object>(cat.getChildCategories().size() + cat.getPersistenceProperties().size());
				result.addAll(cat.getChildCategories());
				result.addAll(cat.getPersistenceProperties());
				return result.toArray();
			}
			return null;
		}

		@Override
		public Object getParent(Object element) {
			if (element instanceof PersistenceProperty) {
				PersistenceProperty prop = (PersistenceProperty) element;
				return prop.getCategory();
			}
			if (element instanceof PersistencePropertyCategory) {
				PersistencePropertyCategory cat = (PersistencePropertyCategory) element;
				return cat.getParentCategory();
			}
			return null;
		}

		@Override
		public boolean hasChildren(Object element)
		{
			if (element instanceof PersistencePropertyCategory) {
				PersistencePropertyCategory cat = (PersistencePropertyCategory) element;
				return cat.getChildCategories().size() + cat.getPersistenceProperties().size() > 0;
			}
			return false;
		}

		@Override
		public void dispose() { }
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

	@Override
	public ISelection getSelection() {
		return treeViewer.getSelection();
	}

	@Override
	public void setSelection(ISelection selection) {
		treeViewer.setSelection(selection);
	}

	public void addPropertyChangeListener(Property property, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(property.name(), listener);
	}

	public void removePropertyChangeListener(Property property, PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(property.name(), listener);
	}
}
