package org.nightlabs.vestigo.ui.oda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.datatools.connectivity.ICategory;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.ProfileManager;
import org.eclipse.datatools.connectivity.oda.IDriver;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.nightlabs.vestigo.core.oda.DataSourceDriverRegistry;
import org.nightlabs.vestigo.core.oda.Driver;
import org.nightlabs.vestigo.ui.JJQBUIPlugin;
import org.nightlabs.vestigo.ui.editor.QueryEditorManager;

public class ConnectionProfileTreeComposite extends Composite implements ISelectionProvider
{
	private Map<ICategory, Boolean> category2ContainsCompatibleProfile = new HashMap<ICategory, Boolean>();
	private TreeViewer treeViewer;

	public ConnectionProfileTreeComposite(Composite parent)
	{
		super(parent, SWT.NONE);
		setLayout(new FillLayout());
		createTreeViewer(this);
		populateTreeViewer();
		initialSelection();
	}

	private void initialSelection() {
		String connectionProfileInstanceID = QueryEditorManager.getGlobalProperties().getProperty(QueryEditorManager.PROPERTY_LAST_CONNECTION_PROFILE_INSTANCE_ID);
		if (connectionProfileInstanceID != null) {
			IConnectionProfile profile = ProfileManager.getInstance().getProfileByInstanceID(connectionProfileInstanceID);
			setSelection(profile == null ? StructuredSelection.EMPTY : new StructuredSelection(profile));
		}
	}

	private void populateTreeViewer()
	{
		Object[] elements = contentProvider.getElements(ProfileManager.getInstance().getRootCategories());
		while (elements.length == 1 && contentProvider.hasChildren(elements[0]))
			elements = contentProvider.getChildren(elements[0]);

		treeViewer.setInput(elements);
		treeViewer.expandAll();
	}

	private void createTreeViewer(Composite parent)
	{
		treeViewer = new TreeViewer(parent);
		treeViewer.setLabelProvider(labelProvider);
		treeViewer.setContentProvider(contentProvider);
//		treeViewer.setSorter(new ViewerSorter()); // different order than the "Data Source Explorer" view :-(
	}

	private LabelProvider labelProvider = new LabelProvider()
	{
		@Override
		public Image getImage(Object element)
		{
			if (element instanceof ICategory)
				return JJQBUIPlugin.getDefault().getImage(ConnectionProfileTreeComposite.class, "category", JJQBUIPlugin.IMAGE_SIZE_16x16);

			return super.getImage(element);
		}

		@Override
		public String getText(Object element)
		{
			if (element instanceof ICategory)
				return ((ICategory)element).getName();
			else if (element instanceof IConnectionProfile)
				return ((IConnectionProfile)element).getName();
			else
				return super.getText(element);
		}
	};

	private ITreeContentProvider contentProvider = new ITreeContentProvider()
	{
		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) { }

		@Override
		public void dispose() { }

		@Override
		public boolean hasChildren(Object element) {
			if (element instanceof ICategory)
				return containsCompatibleProfile((ICategory)element);

			return false;
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof ICategory) {
				ICategory cat = (ICategory) parentElement;
				return filterChildren(cat.getChildCategories(), cat.getAssociatedProfiles());
			}

			return new Object[0];
		}

		private Object[] filterChildren(Collection<?> ... unfilteredChildrenArray)
		{
			List<Object> result = new ArrayList<Object>();

			for (Collection<?> unfilteredChildren : unfilteredChildrenArray) {
				if (unfilteredChildren == null)
					continue;

				for (Object child : unfilteredChildren) {
					if (child instanceof ICategory) {
						if (containsCompatibleProfile((ICategory)child))
							result.add(child);
					}
					else if (child instanceof IConnectionProfile) {
						if (isConnectionProfileCompatible((IConnectionProfile)child))
							result.add(child);
					}
				}
			}

			// We have to sort this way, because a ViewerSorter causes a different order than the "Data Source Explorer" view.
			Collections.sort(result, new Comparator<Object>() {
				@Override
				public int compare(Object o1, Object o2)
				{
					if ((o1 instanceof ICategory) && !(o2 instanceof ICategory))
						return -1;

					if (!(o1 instanceof ICategory) && (o2 instanceof ICategory))
						return 1;

					return labelProvider.getText(o1).compareTo(labelProvider.getText(o2));
				}
			});

			return result.toArray();
		}

		@Override
		public Object getParent(Object element)
		{
			if (element instanceof ICategory)
				return ((ICategory)element).getParent();

			if (element instanceof IConnectionProfile)
				return ((IConnectionProfile)element).getCategory();

			return null;
		}

		@Override
		public Object[] getElements(Object inputElement)
		{
			if (inputElement instanceof Object[])
				return filterChildren(Arrays.asList((Object[])inputElement));
			else if (inputElement instanceof Collection<?>)
				return filterChildren(((Collection<?>)inputElement));
			else
				return new Object[0];
		}
	};

	private boolean containsCompatibleProfile(ICategory category)
	{
		Boolean b = category2ContainsCompatibleProfile.get(category);

		if (b == null) {
			List<?> profiles = category.getAssociatedProfiles();
			if (profiles != null) {
				for (Object profile : profiles) {
					if (profile instanceof IConnectionProfile && isConnectionProfileCompatible((IConnectionProfile)profile)) {
						b = true;
						break;
					}
				}
			}

			if (b == null) {
				List<?> childCategories = category.getChildCategories();
				if (childCategories != null) {
					for (Object childCat : childCategories) {
						if (childCat instanceof ICategory && containsCompatibleProfile((ICategory)childCat)) {
							b = true;
							break;
						}
					}
				}
			}

			if (b == null)
				b = false;

			category2ContainsCompatibleProfile.put(category, b);
		}

		return b;
	}

	private boolean isConnectionProfileCompatible(IConnectionProfile connectionProfile)
	{
		String providerId = connectionProfile.getProviderId();
		Class<? extends IDriver> driverClass = DataSourceDriverRegistry.sharedInstance().getDriverClassForProviderID(providerId);
		return driverClass != null && Driver.class.isAssignableFrom(driverClass);
	}

	protected void assertUIThread()
	{
		if (Display.getCurrent() != this.getDisplay())
			throw new IllegalStateException("Thread mismatch! This method must be called on the SWT UI thread!");
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		treeViewer.addSelectionChangedListener(listener);
	}
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		treeViewer.removeSelectionChangedListener(listener);
	}
	@Override
	public ISelection getSelection() {
		return treeViewer.getSelection();
	}
	@Override
	public void setSelection(ISelection selection) {
		treeViewer.setSelection(selection);
	}
}
