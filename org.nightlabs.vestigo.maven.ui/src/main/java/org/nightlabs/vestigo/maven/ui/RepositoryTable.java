package org.nightlabs.vestigo.maven.ui;

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.nightlabs.licence.manager.Message;
import org.nightlabs.vestigo.maven.core.MavenRepository;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;

public class RepositoryTable extends Composite implements ISelectionProvider
{
	private TableViewer tableViewer;

	public RepositoryTable(Composite parent) {
		super(parent, SWT.NONE);
		this.setLayout(new FillLayout());
		tableViewer = new TableViewer(this, SWT.FULL_SELECTION | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		Table table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		tableViewer.setContentProvider(new ArrayContentProvider());
		tableViewer.setLabelProvider(new RepositoryLabelProvider());

		TableLayout tableLayout = new TableLayout();
		TableColumn tc = new TableColumn(table, SWT.LEFT);
		tc.setText("Identifier");
		tableLayout.addColumnData(new ColumnWeightData(700));

		tc = new TableColumn(table, SWT.LEFT);
		tc.setText("Name");
		tableLayout.addColumnData(new ColumnWeightData(500));

		tc = new TableColumn(table, SWT.LEFT);
		tc.setText("URL");
		tableLayout.addColumnData(new ColumnWeightData(1000));

		tc = new TableColumn(table, SWT.LEFT);
		tc.setText("Releases");
		tableLayout.addColumnData(new ColumnPixelData(24));

		tc = new TableColumn(table, SWT.LEFT);
		tc.setText("Snapshots");
		tableLayout.addColumnData(new ColumnPixelData(24));

		tc = new TableColumn(table, SWT.LEFT);
		tc.setText("Layout");
		tableLayout.addColumnData(new ColumnPixelData(80));

		table.setLayout(tableLayout);
	}

	private class RepositoryLabelProvider extends LabelProvider implements ITableLabelProvider
	{
		@Override
		public Image getColumnImage(Object element, int columnIndex)
		{
			MavenRepository repository = (MavenRepository) element;

			if (columnIndex == 3)
				return VestigoMavenUIPlugin.getDefault().getImage(RepositoryTable.class, "releasesEnabled-" + repository.isReleasesEnabled(), AbstractVestigoUIPlugin.IMAGE_SIZE_16x16);

			if (columnIndex == 4)
				return VestigoMavenUIPlugin.getDefault().getImage(RepositoryTable.class, "snapshotsEnabled-" + repository.isSnapshotsEnabled(), AbstractVestigoUIPlugin.IMAGE_SIZE_16x16);

			return null;
		}

		@Override
		public String getColumnText(Object element, int columnIndex) {
			MavenRepository repository = (MavenRepository) element;
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

	public final void setInput(List<Message> messages) {
		tableViewer.setInput(messages);
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
}
