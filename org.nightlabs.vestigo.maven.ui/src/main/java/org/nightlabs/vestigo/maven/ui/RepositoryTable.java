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
package org.nightlabs.vestigo.maven.ui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.nightlabs.vestigo.maven.core.Repositories;
import org.nightlabs.vestigo.maven.core.Repository;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;

public class RepositoryTable extends Composite implements ISelectionProvider
{
	public static enum Property {
		doubleClick
	}

	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
	private TableViewer tableViewer;

	public RepositoryTable(Composite parent) {
		super(parent, SWT.NONE);
		this.setLayout(new FillLayout());
		tableViewer = new TableViewer(this, SWT.FULL_SELECTION | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.MULTI);
		Table table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		tableViewer.setContentProvider(new RepositoryContentProvider());
		tableViewer.setLabelProvider(new RepositoryLabelProvider());

		TableLayout tableLayout = new TableLayout();
		TableColumn tc = new TableColumn(table, SWT.LEFT);
		tc.setText("Identifier");
		tc.setToolTipText("Optional identifier.");
		tableLayout.addColumnData(new ColumnWeightData(700));

		tc = new TableColumn(table, SWT.LEFT);
		tc.setText("Name");
		tc.setToolTipText("Optional name.");
		tableLayout.addColumnData(new ColumnWeightData(500));

		tc = new TableColumn(table, SWT.LEFT);
		tc.setText("URL");
		tc.setToolTipText("Required URL.");
		tableLayout.addColumnData(new ColumnWeightData(1000));

		tc = new TableColumn(table, SWT.LEFT);
		tc.setText("Releases");
		tc.setToolTipText("Does the repository contain releases?");
		tableLayout.addColumnData(new ColumnPixelData(24));

		tc = new TableColumn(table, SWT.LEFT);
		tc.setText("Snapshots");
		tc.setToolTipText("Does the repository contain snapshots?");
		tableLayout.addColumnData(new ColumnPixelData(24));

		tc = new TableColumn(table, SWT.LEFT);
		tc.setText("Layout");
		tc.setToolTipText("Repository layout.");
		tableLayout.addColumnData(new ColumnPixelData(80));

		table.setLayout(tableLayout);

		tableViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				propertyChangeSupport.firePropertyChange(Property.doubleClick.name(), null, getSelection());
			}
		});
	}

	private static class RepositoryContentProvider implements IStructuredContentProvider
	{
		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// nothing to do
		}

		@Override
		public Object[] getElements(Object inputElement) {
			Repositories repositories = (Repositories) inputElement;
			return repositories.getRepository().toArray();
		}

		@Override
		public void dispose() {
			// nothing to do
		}
	}

	private static class RepositoryLabelProvider extends LabelProvider implements ITableLabelProvider
	{
		@Override
		public Image getColumnImage(Object element, int columnIndex)
		{
			Repository repository = (Repository) element;

			if (columnIndex == 3)
				return VestigoMavenUIPlugin.getDefault().getImage(RepositoryTable.class, "releasesEnabled-" + repository.getReleases().isEnabled(), AbstractVestigoUIPlugin.IMAGE_SIZE_16x16);

			if (columnIndex == 4)
				return VestigoMavenUIPlugin.getDefault().getImage(RepositoryTable.class, "snapshotsEnabled-" + repository.getSnapshots().isEnabled(), AbstractVestigoUIPlugin.IMAGE_SIZE_16x16);

			return null;
		}

		@Override
		public String getColumnText(Object element, int columnIndex) {
			Repository repository = (Repository) element;
			switch (columnIndex) {
				case 0:
					return repository.getId();
				case 1:
					return repository.getName();
				case 2:
					return repository.getUrl();
				case 3:
					return null; // icon instead
				case 4:
					return null; // icon instead
				case 5:
					return repository.getLayout() == null ? null : repository.getLayout().toString();
				default:
					return null;
			}
		}
	}

	public Repositories getInput() {
		return (Repositories) tableViewer.getInput();
	}

	public final void setInput(Repositories repositories) {
		tableViewer.setInput(repositories);
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		tableViewer.addSelectionChangedListener(listener);
	}

	@Override
	public ISelection getSelection() {
		return tableViewer.getSelection();
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		tableViewer.removeSelectionChangedListener(listener);
	}

	@Override
	public void setSelection(ISelection selection) {
		tableViewer.setSelection(selection);
	}

	public void refresh(boolean updateLabels) {
		tableViewer.refresh(updateLabels);
	}

	public void addPropertyChangeListener(Property property, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(property.name(), listener);
	}

	public void removePropertyChangeListener(Property property, PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(property.name(), listener);
	}
}
