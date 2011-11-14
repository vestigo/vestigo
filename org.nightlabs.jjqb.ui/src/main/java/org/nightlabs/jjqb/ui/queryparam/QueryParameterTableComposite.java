package org.nightlabs.jjqb.ui.queryparam;

import java.util.Collection;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueryParameterTableComposite extends Composite implements ISelectionProvider
{
	private static final Logger logger = LoggerFactory.getLogger(QueryParameterTableComposite.class);

	private TableViewer tableViewer;
	private ListenerList selectionChangedListeners = new ListenerList();

	public QueryParameterTableComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		createTableViewer();
	}

	private void createTableViewer() {
		tableViewer = new TableViewer(this, SWT.FULL_SELECTION | SWT.MULTI);
		Table table = tableViewer.getTable();
		tableViewer.setContentProvider(new ArrayContentProvider());
		tableViewer.getTable().setHeaderVisible(true);
		tableViewer.getTable().setLinesVisible(true);
		tableViewer.setUseHashlookup(true);

		TableLayout layout = new TableLayout();
		createParameterIndexColumn(layout);
		createParameterNameColumn(layout);
		createParameterTypeColumn(layout);
		createParameterValueColumn(layout);
		table.setLayout(layout);
	}

	private void createParameterIndexColumn(TableLayout layout)
	{
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.RIGHT);
		tableViewerColumn.setLabelProvider(new ParameterIndexLabelProvider());
		tableViewerColumn.getColumn().setText("Index");
		layout.addColumnData(new ColumnPixelData(50));
	}

	private void createParameterNameColumn(TableLayout layout)
	{
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.LEFT);
		tableViewerColumn.setLabelProvider(new ParameterNameLabelProvider());
		tableViewerColumn.getColumn().setText("Name");
		layout.addColumnData(new ColumnWeightData(33));
	}

	private void createParameterTypeColumn(TableLayout layout)
	{
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.LEFT);
		tableViewerColumn.setLabelProvider(new ParameterTypeLabelProvider());
		tableViewerColumn.getColumn().setText("Type");
		layout.addColumnData(new ColumnWeightData(33));
	}

	private void createParameterValueColumn(TableLayout layout)
	{
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.LEFT);
		tableViewerColumn.setLabelProvider(new ParameterValueLabelProvider());
		tableViewerColumn.getColumn().setText("Value");
		layout.addColumnData(new ColumnWeightData(33));
	}

	private static class ParameterIndexLabelProvider extends CellLabelProvider
	{
		@Override
		public void update(ViewerCell viewerCell) {
			QueryParameter parameter = (QueryParameter) viewerCell.getElement();
			viewerCell.setText(String.valueOf(parameter.getIndex()));
		}
	}

	private static class ParameterNameLabelProvider extends CellLabelProvider
	{
		@Override
		public void update(ViewerCell viewerCell) {
			QueryParameter parameter = (QueryParameter) viewerCell.getElement();
			viewerCell.setText(parameter.getName());
		}
	}

	private static class ParameterTypeLabelProvider extends CellLabelProvider
	{
		@Override
		public void update(ViewerCell viewerCell) {
			QueryParameter parameter = (QueryParameter) viewerCell.getElement();
			viewerCell.setText(parameter.getType() == null ? "" : parameter.getType().getName());
		}
	}

	private static class ParameterValueLabelProvider extends CellLabelProvider
	{
		@Override
		public void update(ViewerCell viewerCell) {
			QueryParameter parameter = (QueryParameter) viewerCell.getElement();
			viewerCell.setText(parameter.getValue() == null ? "_NULL_" : parameter.getValue().toString());
		}
	}

	@SuppressWarnings("unchecked")
	public Collection<QueryParameter> getInput() {
		return (Collection<QueryParameter>) tableViewer.getInput();
	}

	public final void setInput(Collection<QueryParameter> input) {
		tableViewer.setInput(input);
	}

	public void refresh() {
		tableViewer.refresh();
	}

	@Override
	public IStructuredSelection getSelection() {
		return (IStructuredSelection) tableViewer.getSelection();
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}

	@Override
	public void setSelection(ISelection selection) {
		tableViewer.setSelection(selection);
	}
}
