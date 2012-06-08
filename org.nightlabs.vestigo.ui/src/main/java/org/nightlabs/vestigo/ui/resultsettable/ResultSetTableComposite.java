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
package org.nightlabs.vestigo.ui.resultsettable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.deferred.DeferredContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.nightlabs.util.Util;
import org.nightlabs.vestigo.core.LabelTextOption;
import org.nightlabs.vestigo.core.LabelTextUtil;
import org.nightlabs.vestigo.core.ObjectReference;
import org.nightlabs.vestigo.core.oda.ResultSet;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;
import org.nightlabs.vestigo.ui.editor.QueryContext;
import org.nightlabs.vestigo.ui.editor.QueryContextAdapter;
import org.nightlabs.vestigo.ui.editor.QueryContextEvent;
import org.nightlabs.vestigo.ui.editor.QueryContextListener;
import org.nightlabs.vestigo.ui.editor.QueryEditorManager;
import org.nightlabs.vestigo.ui.labeltextoptionaction.LabelTextOptionsContainer;
import org.nightlabs.vestigo.ui.licence.LicenceNotValidDialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ResultSetTableComposite extends Composite
implements ISelectionProvider, LabelTextOptionsContainer
{
	private static final Logger logger = LoggerFactory.getLogger(ResultSetTableComposite.class);

	public static final String PREFERENCE_KEY_ONLY_RESULT_SETS_OF_ACTIVE_EDITOR_VISIBLE = "ResultSetTableComposite.onlyResultSetsOfActiveEditorVisible";
	public static final boolean PREFERENCE_DEFAULT_ONLY_RESULT_SETS_OF_ACTIVE_EDITOR_VISIBLE = true;

	public static enum PropertyName {
		queryEditorManager,
		queryContext
	}

	private QueryEditorManager queryEditorManager;
	private QueryContext queryContext;
	private Display display;
	private Set<LabelTextOption> labelTextOptions = EnumSet.of(LabelTextOption.showObjectToString, LabelTextOption.showPersistentID);
	private MenuManager contextMenuManager;
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	private StackLayout stackLayout;
	private Map<String, CTabFolder> stackKey2TabFolder = new HashMap<String, CTabFolder>();
	private Map<QueryContext, QueryContextUI> queryContext2QueryContextUI = new HashMap<QueryContext, QueryContextUI>();
	private Deque<QueryContext> queryContextDeque = new LinkedList<QueryContext>();
	private Deque<QueryContext> queryContextSelectionHistory = new LinkedList<QueryContext>();
	private boolean queryContextSelectionHistoryReadOnly = false;
	private Label noQueryEditorManagerMessageLabel;
	private Label noQueryContextMessageLabel;

	private Boolean lastOnlyResultSetsOfActiveEditorVisible;

	public ResultSetTableComposite(Composite parent, int style) {
		super(parent, style);
		display = parent.getDisplay();
		addDisposeListener(disposeListener);
		setLayout(stackLayout = new StackLayout());
		createNoQueryEditorManagerMessageLabel();
		createNoQueryContextMessageLabel();
		setQueryEditorManager(null);
	}

	private void createNoQueryContextMessageLabel() {
		Composite parent = this;
		noQueryContextMessageLabel = new Label(parent, SWT.WRAP);
		noQueryContextMessageLabel.setText("The active query editor does not have any result set. Please execute a query to see a result set here.");
	}

	private void createNoQueryEditorManagerMessageLabel() {
		Composite parent = this;
		noQueryEditorManagerMessageLabel = new Label(parent, SWT.WRAP);
		noQueryEditorManagerMessageLabel.setText("There is no active query editor. Please open a query editor and execute a query to see a result set here.");
	}

	/**
	 * Flag indicating that the <code>ResultSetTableComposite</code> is currently being disposed.
	 * <p>
	 * This flag differentiates whether {@link QueryContextUI#dispose()} will be called (only, if <code>disposing == false</code>),
	 * or not, when the TabItem's <code>DisposeListener</code> is triggered (which happens after {@link #disposeListener}).
	 * This way, we only {@link QueryContext#close() close the QueryContext}, if the user explicitely closes a TabItem. If he
	 * closes the entire view, we keep the <code>QueryContext</code>s open (thus they become visible again, if the user re-opens the
	 * <code>ResultSetTableView</code>).
	 * <p>
	 * Furthermore, without this flag (and its corresponding checks) there is a {@link NullPointerException} when
	 * the {@link QueryContextUI} tries to dispose its tab-folder and table-viewer. This is IMHO a bug
	 * in Eclipse, but we can easily circumvent it by skipping the disposal of our own UI, if the container-UI
	 * is anyway disposed.
	 */
	private boolean disposing;

	private final DisposeListener disposeListener = new DisposeListener() {
		@Override
		public void widgetDisposed(DisposeEvent event) {
			logger.debug("disposeListener.widgetDisposed: Entered.");
			disposing = true;
			for (QueryContext queryContext : queryContext2QueryContextUI.keySet())
				queryContext.removeQueryContextListener(queryContextListener);
		}
	};

	public boolean isOnlyResultSetsOfActiveEditorVisible() {
		IPreferenceStore preferenceStore = VestigoUIPlugin.getDefault().getPreferenceStore();
		preferenceStore.setDefault(PREFERENCE_KEY_ONLY_RESULT_SETS_OF_ACTIVE_EDITOR_VISIBLE, PREFERENCE_DEFAULT_ONLY_RESULT_SETS_OF_ACTIVE_EDITOR_VISIBLE);
		boolean onlyResultSetsOfActiveEditorVisible = preferenceStore.getBoolean(PREFERENCE_KEY_ONLY_RESULT_SETS_OF_ACTIVE_EDITOR_VISIBLE);
		return onlyResultSetsOfActiveEditorVisible;
	}

// Always using tabs - for now (or ever) ;-) Marco :-)
//	public boolean isUseTabFolder() {
//		return !isOnlyResultSetsOfActiveEditorVisible() || QueryEditorManager.getKeepQueryResultSetQuantity() > 1;
//	}

	protected String getStackKey(QueryContext queryContext) {
		boolean onlyResultSetsOfActiveEditorVisible = isOnlyResultSetsOfActiveEditorVisible();

		if (onlyResultSetsOfActiveEditorVisible) {
			int hashCode = System.identityHashCode(queryContext.getQueryEditorManager());
			return Integer.toString(hashCode, 36);
		}
		else
			return "GLOBAL";
	}

	protected List<ResultSetTableRow> getSelectedRows() {
		QueryContext queryContext = getQueryContext();
		if (queryContext != null) {
			QueryContextUI queryContextUI = getQueryContextUIOrNull(queryContext);
			if (queryContextUI == null)
				logger.warn("getSelectedRows: There is no QueryContextUI for this queryContext: {}", queryContext);
			else
				return queryContextUI.getSelectedRows();
		}
		return Collections.emptyList();
	}

	protected List<ResultSetTableCell> getSelectedCells() {
		QueryContext queryContext = getQueryContext();
		if (queryContext != null) {
			QueryContextUI queryContextUI = getQueryContextUIOrNull(queryContext);
			if (queryContextUI == null)
				logger.warn("getSelectedCells: There is no QueryContextUI for this queryContext: {}", queryContext);
			else
				return queryContextUI.getSelectedCells();
		}
		return Collections.emptyList();
	}

	private IAction copyAction = new Action("Copy") {
		@Override
		public void run() {
			StringBuilder labelTextSB = new StringBuilder();

			for (ResultSetTableRow row : getSelectedRows()) {
				if (labelTextSB.length() > 0)
					labelTextSB.append('\n');

				boolean firstCell = true;
				for (ResultSetTableCell cell : row.getCells()) {
					if (firstCell)
						firstCell = false;
					else
						labelTextSB.append('\t');

					String labelText = getLabelText(cell);
					labelTextSB.append(labelText);
				}
			}

			for (ResultSetTableCell cell : getSelectedCells()) {
				if (labelTextSB.length() > 0)
					labelTextSB.append('\t');

				String labelText = getLabelText(cell);
				labelTextSB.append(labelText);
			}

			Clipboard cb = new Clipboard(getDisplay());
			cb.setContents(new Object[] { labelTextSB.toString() }, new Transfer[]{ TextTransfer.getInstance() });
			cb.dispose();
		}
	};

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
			throw new IllegalArgumentException("labelTextOptions == null");

		EnumSet<LabelTextOption> s = EnumSet.noneOf(LabelTextOption.class);
		s.addAll(labelTextOptions);
		this.labelTextOptions = s;

		QueryContext queryContext = this.queryContext;
		if (queryContext != null) {
			QueryContextUI queryContextUI = getQueryContextUIOrFail(queryContext);
			refresh(queryContextUI.getTableViewer());
		}
	}

	protected void refresh(TableViewer tableViewer)
	{
		if (tableViewer.getInput() == null)
			return; // No need to refresh anything, if the table is empty.

		// tableViewer.refresh();
		// Unfortunately, 'tableViewer.refresh()' causes the table to turn completely blank (until scrolled or clicked)
		// and I have no idea how to prevent this (tried quite a lot already) :-( Probably a bug related to SWT.VIRTUAL :-(
		//
		// But finally this workaround came to my mind and proved functional: Collect visible TableItems and call
		// tableViewer.update(...) on them.
		// Marco :-)

		Table table = tableViewer.getTable();
		Set<TableItem> tableItems = new HashSet<TableItem>();
		for (int y = 0; y < table.getBounds().height; ++y) {
			TableItem item = table.getItem(new Point(1, y));
			if (item == null)
				logger.trace("refresh: item is null!"); // This happens really really often, hence using trace instead of warn.
			else
				tableItems.add(item);
		}

		for (TableItem item : tableItems) {
			if (item.getData() != null) {
				if (item.getData() instanceof ResultSetTableRow)
					logger.trace("refresh: updating row {}", ((ResultSetTableRow)item.getData()).getResultSetTableRowIndex());
				else
					logger.trace("refresh: updating {}", item.getData());

				tableViewer.update(item.getData(), null);
			}
			else {
				// WORKAROUND begin: https://bugs.eclipse.org/bugs/show_bug.cgi?id=146799
				// It's not always only the last item - sometimes it's an item inbetween. Marco :-)
				logger.warn("refresh: item.getData() returned null!");
				int tableItemIndex = -1;
				for (int index = 0; index < table.getItemCount(); ++index) {
					if (table.getItem(index) == item) {
						tableItemIndex = index;
						break;
					}
				}

				if (tableItemIndex < 0)
					logger.warn("refresh: Did not find tableItemIndex!!!");
				else {
//					DeferredContentProvider contentProvider = (DeferredContentProvider) tableViewer.getContentProvider();
//					contentProvider.updateElement(tableItemIndex); // does not work and that's probably exactly the problem

					// TODO maybe this must be refactored when we support multiple resultSets per query browser
					QueryContext queryContext = getQueryContext();
					if (queryContext != null) {
						ResultSetTableModel model = queryContext.getResultSetTableModel();
						Object[] rowsLoadedArray = model.getRowsLoadedArray();
						tableViewer.replace(rowsLoadedArray[tableItemIndex], tableItemIndex);
						logger.debug("refresh: Workaround performed on tableItemIndex={}", tableItemIndex);
					}
				}
				// WORKAROUND END: https://bugs.eclipse.org/bugs/show_bug.cgi?id=146799
			}
		}

		// WORKAROUND begin: https://bugs.eclipse.org/bugs/show_bug.cgi?id=146799
		// It's not always only the last item - sometimes it's an item inbetween. Marco :-)
		table.redraw(0, 0, table.getBounds().width, table.getBounds().height, true);
		// WORKAROUND END: https://bugs.eclipse.org/bugs/show_bug.cgi?id=146799
	}

	private TableViewer createTableViewer(Composite parent) {
		TableViewer tableViewer = new TableViewer(
				parent,
				SWT.VIRTUAL // We definitely need a lazy/virtual table, because our result-set might be large.
				| SWT.FULL_SELECTION // We want the whole line to be displayed as selected.
				| SWT.SINGLE // Right now, we allow only single-line-selections, but this should change later.
		);
		tableViewer.setContentProvider(new DeferredContentProvider(new ComparableComparator<ResultSetTableRow>()));
		tableViewer.getTable().setHeaderVisible(true);
		tableViewer.getTable().setLinesVisible(true);
		tableViewer.setUseHashlookup(true);

//		hookRepairPaintListener(); // I don't have these paint bugs here in the office - only at home - strange (and it makes things really slow, here).
		hookRepairPaintListener(tableViewer); // I have them in the office, too (but not that often) - trying a better implementation to avoid slowliness.
		return tableViewer;
	}

	private void openLicenceNotValidDialogIfLicenceNotValidRowSelected()
	{
		Set<ResultSetTableCell> cells = new HashSet<ResultSetTableCell>();
		for (ResultSetTableRow row : getSelectedRows()) {
			cells.addAll(Arrays.asList(row.getCells()));
		}

		cells.addAll(getSelectedCells());

		for (ResultSetTableCell cell : cells) {
			if (cell.getCellContent() == ResultSet.LICENCE_NOT_VALID) {
				new LicenceNotValidDialog(getShell()).open();
				return;
			}
		}
	}

	private boolean repairPaintEventRedrawTriggered = false;
	private boolean repairPaintEventRunnableQueued = false;

	/**
	 * There is an SWT bug causing missing (white) areas when scrolling through
	 * the LAZY table line by line. This listener fixes them by causing a redraw of the entire table.
	 * As it is deferring the redraw operation, it causes nearly no performance impact (it collects many ordinary
	 * paint events and executes only one additional refresh operation for many of them).
	 */
	private void hookRepairPaintListener(final TableViewer tableViewer) {
		final Table table = tableViewer.getTable();
		tableViewer.getTable().addPaintListener(new PaintListener() {
			@Override
			public void paintControl(final PaintEvent e) {
				logger.debug("paintControl: entered with repairPaintEventRedrawTriggered={} repairPaintEventRunnableQueued={}", repairPaintEventRedrawTriggered, repairPaintEventRunnableQueued);
				if (repairPaintEventRedrawTriggered || repairPaintEventRunnableQueued) {
					repairPaintEventRedrawTriggered = false;
					logger.debug("paintControl: aborting");
					return;
				}

				repairPaintEventRunnableQueued = true;

				logger.debug("paintControl: new Runnable");

				Job job = new Job("Redraw") {
					@Override
					protected IStatus run(IProgressMonitor monitor)
					{
						display.asyncExec(new Runnable() {
							@Override
							public void run() {
								if (table.isDisposed())
									return;

								logger.debug("paintControl.asyncExecRunnable: entered");
								repairPaintEventRunnableQueued = false;
								repairPaintEventRedrawTriggered = true;
//								((Table)e.widget).redraw(0, 0, e.width, e.height, true);
//								tableViewer.refresh(true);
								refresh(tableViewer);
							}
						});
						return Status.OK_STATUS;
					}
				};
				job.setPriority(Job.INTERACTIVE);
				job.setSystem(true);
				job.schedule(300);
				logger.debug("paintControl: leaving");
			}
		});
	}

	private TableCursor createTableCursor(final TableViewer tableViewer) {
		final TableCursor tableCursor = new TableCursor(tableViewer.getTable(), SWT.BORDER);
		tableCursor.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					TableItem row = tableCursor.getRow();
					int column = tableCursor.getColumn();
					Object rowData = row == null ? null : row.getData();
					QueryContextUI queryContextUI = getQueryContextUIOrFail(tableCursor);

					logger.debug(
							"tableCursor.SelectionListener: row={} column={} rowData={}",
							new Object[] { row, column, rowData }
					);

					tableViewer.setSelection(rowData == null ? StructuredSelection.EMPTY : new StructuredSelection(rowData));

					// We propagate only selections of ResultSetTableRow or ResultSetTableCell - no other types (e.g. temporary "loading..." messages, if we ever add them).
					if (rowData instanceof ResultSetTableRow) {
						ResultSetTableRow resultSetTableRow = (ResultSetTableRow) rowData;
						// If we are in the first column (the row-index-column), we select entire rows, otherwise
						// we select individual cells.
						if (column == 0)
							queryContextUI.setSelectedRows(Collections.singletonList(resultSetTableRow));
						else {
							ResultSetTableCell resultSetTableCell = resultSetTableRow.getCells()[column - 1];
							queryContextUI.setSelectedCells(Collections.singletonList(resultSetTableCell));
						}
					}

					fireSelectionChangedEvent();
				}
		});

		Menu contextMenu = getContextMenuManager().createContextMenu(tableCursor);
		tableCursor.setMenu(contextMenu);

		tableCursor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				logger.debug("keyReleased: keyCode={}", e.keyCode);
				if (e.keyCode == 99) // CTRL+C
					copyAction.run();
			}
		});
		return tableCursor;
	}

	private void registerOpenLicenceNotValidDialogListeners(TableViewer tableViewer, TableCursor tableCursor) {
		// We want the dialog to open, if the 'Enter' or the 'Space' key was pressed (while an appropriate line is selected).
		tableCursor.addListener(SWT.KeyUp, new Listener() {
			@Override
			public void handleEvent(Event e) {
				if (e.character == '\r' || e.character == '\n' || e.character == ' ')
					openLicenceNotValidDialogIfLicenceNotValidRowSelected();
			}
		});

		// We need both, the MouseListener in the TableViewer and the Listener in the TableCursor, because the first click
		// only triggers the first listener while all following clicks (on the same cell while it stays selected) solely
		// trigger the second listener. Marco :-)
		tableViewer.getTable().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				openLicenceNotValidDialogIfLicenceNotValidRowSelected();
			}
		});
		tableCursor.addListener(SWT.MouseUp, new Listener() {
			@Override
			public void handleEvent(Event e) {
				openLicenceNotValidDialogIfLicenceNotValidRowSelected();
			}
		});
	}

	private void fireSelectionChangedEvent()
	{
		if (logger.isDebugEnabled())
			logger.debug("fireSelectionChangedEvent: selection={}", getSelection());

		SelectionChangedEvent event = null;
		for (Object listener : selectionListenerList.getListeners()) {
			if (listener == null)
				continue;

			if (event == null)
				event = new SelectionChangedEvent(this, getSelection());

			((ISelectionChangedListener)listener).selectionChanged(event);
		}
	}

	private static class RowIndexLabelProvider extends CellLabelProvider
	{
		@Override
		public void update(ViewerCell viewerCell) {
			ResultSetTableRow row = (ResultSetTableRow) viewerCell.getElement();
			viewerCell.setText(String.valueOf(row.getResultSetTableRowIndex()));
		}
	}

	private class ResultSetTableCellLabelProvider extends CellLabelProvider
	{
		/**
		 * 0-based index of column.
		 */
		private int columnIndex;

		public ResultSetTableCellLabelProvider(int columnIndex) {
			this.columnIndex = columnIndex;
		}

		@Override
		public void update(ViewerCell viewerCell) {
			ResultSetTableRow row = (ResultSetTableRow) viewerCell.getElement();
			ResultSetTableCell[] cells = row.getCells();
			if (columnIndex >= cells.length) {
				logger.warn("ResultSetTableCellLabelProvider.update: columnIndex={} out of range! cells.length={}", columnIndex, cells.length);
				return;
			}

			ResultSetTableCell cell = cells[columnIndex];
			viewerCell.setText(getLabelText(cell));
		}
	}

	private String getLabelText(ResultSetTableCell cell) {
		Object cellContent = cell.getCellContent();

		if (cellContent instanceof ObjectReference)
			return ((ObjectReference)cellContent).getLabelText(labelTextOptions);
		else
			return LabelTextUtil.toStringOfSimpleObject(null, cellContent, labelTextOptions);
	}

// Creating now a *new* TableViewer for every ResultSet => don't need to empty it anymore.
//	private void manuallyEmptyTable(TableViewer tableViewer) {
//		// The virtual tableviewer shows strange artifacts (empty, but selectable lines), if we have a null
//		// or empty input, AFTER we already had another input with quite some lines of real data.
//		// Maybe this bug occurs even in more situations (e.g. in general when a new input has less rows
//		// than an old input). Thus we simply manually delete all table items. This seems to solve the problem.
//		// Marco :-)
//		for (TableItem item : tableViewer.getTable().getItems())
//			item.dispose();
//	}

	public QueryEditorManager getQueryEditorManager() {
		return queryEditorManager;
	}

	public void addQueryContexts(Collection<? extends QueryContext> queryContexts) {
		if (queryContexts == null)
			throw new IllegalArgumentException("queryContexts == null");

		for (QueryContext queryContext : queryContexts) {
			addQueryContext(queryContext);
		}
	}

	protected CTabFolder getTabFolderOrNull(String stackKey) {
		CTabFolder tabFolder = stackKey2TabFolder.get(stackKey);
		return tabFolder;
	}

	protected CTabFolder getTabFolderOrFail(String stackKey) {
		CTabFolder tabFolder = stackKey2TabFolder.get(stackKey);
		if (tabFolder == null)
			throw new IllegalArgumentException("There is no tabFolder for stackKey=" + stackKey);

		return tabFolder;
	}

	protected CTabFolder createTabFolder(String stackKey) {
		CTabFolder tabFolder = stackKey2TabFolder.get(stackKey);
		if (tabFolder == null) {
			tabFolder = new CTabFolder(this, SWT.NONE);
			tabFolder.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					CTabFolder tabFolder = (CTabFolder) e.widget;
					CTabItem tabItem = tabFolder.getSelection();
					if (tabItem != null) {
						QueryContextUI queryContextUI = getQueryContextUIOrFail(tabItem);
						setQueryContext(queryContextUI.getQueryContext());
					}
				}
			});
			stackKey2TabFolder.put(stackKey, tabFolder);
		}
		return tabFolder;
	}

	protected CTabFolder getTabFolderOrFail(QueryContext queryContext) {
		String stackKey = getStackKey(queryContext);
		CTabFolder tabFolder = getTabFolderOrFail(stackKey);
		return tabFolder;
	}

	protected CTabFolder getTabFolderOrNull(QueryContext queryContext) {
		String stackKey = getStackKey(queryContext);
		CTabFolder tabFolder = getTabFolderOrNull(stackKey);
		return tabFolder;
	}

	protected CTabFolder createTabFolder(QueryContext queryContext) {
		String stackKey = getStackKey(queryContext);
		CTabFolder tabFolder = createTabFolder(stackKey);
		return tabFolder;
	}

	protected QueryContextUI getQueryContextUIOrNull(QueryContext queryContext) {
		QueryContextUI queryContextUI = queryContext2QueryContextUI.get(queryContext);
		return queryContextUI;
	}

	protected QueryContextUI getQueryContextUIOrFail(QueryContext queryContext) {
		QueryContextUI queryContextUI = queryContext2QueryContextUI.get(queryContext);
		if (queryContextUI == null)
			throw new IllegalArgumentException("There is no QueryContextUI for queryContext=" + queryContext);

		return queryContextUI;
	}

	protected QueryContextUI createQueryContextUI(QueryContext queryContext) {
		assertUIThread();
		if (queryContext == null)
			throw new IllegalArgumentException("queryContext == null");

		final QueryContextUI[] queryContextUI = new QueryContextUI[1];
		queryContextUI[0] = queryContext2QueryContextUI.get(queryContext);
		if (queryContextUI[0] == null) {
			queryContext.addQueryContextListener(queryContextListener);
			CTabFolder tabFolder = createTabFolder(queryContext);
			final CTabItem tabItem = new CTabItem(tabFolder, SWT.CLOSE);
			tabItem.addDisposeListener(new DisposeListener() {
				@Override
				public void widgetDisposed(DisposeEvent event) {
					if (ResultSetTableComposite.this.disposing) {
						logger.debug("tabItem.disposeListener.widgetDisposed: Skipping, because ResultSetTableComposite.this.disposing == true.");
						return;
					}
					logger.debug("tabItem.disposeListener.widgetDisposed: Disposing.");

					if (queryContextUI[0] != null)
						queryContextUI[0].disposeWithClosingQueryContext();
				}
			});

			tabItem.setText(queryContext.getTitle());

			tabItem.setToolTipText(queryContext.getQueryText());

			if (queryContext.getError() != null) {
				Text errorText = new Text(tabFolder, SWT.BORDER | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.READ_ONLY);
				errorText.setText(Util.getStackTraceAsString(queryContext.getError()));
				tabItem.setImage(VestigoUIPlugin.getDefault().getImage(ResultSetTableComposite.class, "tabItem-error", VestigoUIPlugin.IMAGE_SIZE_16x16));
				tabItem.setControl(errorText);
				queryContextUI[0] = new QueryContextUI(queryContext, null, tabItem);
			}
			else if (queryContext.getResultSetTableModel() != null) {
				tabItem.setImage(VestigoUIPlugin.getDefault().getImage(ResultSetTableComposite.class, "tabItem-table", VestigoUIPlugin.IMAGE_SIZE_16x16));

				TableViewer tableViewer = createTableViewer(tabFolder);
				TableCursor tableCursor = createTableCursor(tableViewer);
				registerOpenLicenceNotValidDialogListeners(tableViewer, tableCursor);

				tabItem.setControl(tableViewer.getTable());
//				tableViewer.getTable().addDisposeListener(new DisposeListener() {
//					@Override
//					public void widgetDisposed(DisposeEvent event) {
//						if (ResultSetTableComposite.this.disposing)
//							return;
//
//						if (queryContextUI[0] != null)
//							queryContextUI[0].dispose();
//					}
//				});

				queryContextUI[0] = new QueryContextUI(queryContext, tableViewer, tabItem);
				tableViewer.setData(QueryContextUI.class.getName(), queryContextUI[0]);
				tableCursor.setData(QueryContextUI.class.getName(), queryContextUI[0]);

				Table table = tableViewer.getTable();
				for (TableColumn column : table.getColumns())
					column.dispose();

				TableLayout layout = new TableLayout();
				IResultSet resultSet = queryContext.getResultSetTableModel().getResultSet();
				try {
					int odaColumnCount = resultSet.getMetaData().getColumnCount();

					createRowIndexTableViewerColumn(tableViewer, layout);

					for (int odaColumnIndex = 1; odaColumnIndex <= odaColumnCount; ++odaColumnIndex)
						createResultSetTableCellTableViewerColumn(tableViewer, resultSet, layout, odaColumnIndex);

				} catch (OdaException e) {
					throw new RuntimeException(e);
				}

				table.setLayout(layout);
				table.layout(true);

				tableViewer.setInput(queryContext == null ? null : queryContext.getResultSetTableModel());
			}

			tabItem.setData(QueryContextUI.class.getName(), queryContextUI[0]);
			queryContext2QueryContextUI.put(queryContext, queryContextUI[0]);
			queryContextDeque.add(queryContext);
		}
		return queryContextUI[0];
	}

	protected QueryContextUI getQueryContextUIOrFail(TableViewer tableViewer) {
		QueryContextUI queryContextUI = (QueryContextUI) tableViewer.getData(QueryContextUI.class.getName());
		if (queryContextUI == null)
			throw new IllegalStateException("tableViewer.getData(QueryContextUI.class.getName()) returned null!");
		return queryContextUI;
	}

	protected QueryContextUI getQueryContextUIOrFail(TableCursor tableCursor) {
		QueryContextUI queryContextUI = (QueryContextUI) tableCursor.getData(QueryContextUI.class.getName());
		if (queryContextUI == null)
			throw new IllegalStateException("tableCursor.getData(QueryContextUI.class.getName()) returned null!");
		return queryContextUI;
	}

	protected QueryContextUI getQueryContextUIOrFail(CTabItem tabItem) {
		QueryContextUI queryContextUI = (QueryContextUI) tabItem.getData(QueryContextUI.class.getName());
		if (queryContextUI == null)
			throw new IllegalStateException("tabItem.getData(QueryContextUI.class.getName()) returned null!");
		return queryContextUI;
	}

	public void addQueryContext(QueryContext queryContext) {
		if (queryContext == null)
			throw new IllegalArgumentException("queryContext == null");

		if (queryContext.getError() == null && queryContext.getResultSetTableModel() == null)
			return; // ignore for now - it will come again when the query is executed.

		createQueryContextUI(queryContext);

//		IConnection connection = queryContext.getConnection();
//		if (connection == null)
//			throw new IllegalArgumentException("queryContext.connection == null");

//		connection. // TODO add close-listener and remove our UI for the QueryContext when it is closed.

//		setQueryEditorManager(queryContext.getQueryEditorManager());
	}

	private QueryContextListener queryContextListener = new QueryContextAdapter() {
		@Override
		public void postClose(final QueryContextEvent event) {
			display.asyncExec(new Runnable() {
				@Override
				public void run() {
					if (ResultSetTableComposite.this.isDisposed())
						return;

					QueryContext queryContext = event.getSource();

					// Here we must *not* respect 'queryContextSelectionHistoryReadOnly', because the actual QueryContext is closed - not only the UI.
					queryContextSelectionHistory.remove(queryContext);
					queryContextDeque.remove(queryContext);
					QueryContextUI queryContextUI = queryContext2QueryContextUI.remove(queryContext);
					if (queryContextUI != null)
						queryContextUI.disposeWithoutClosingQueryContext();

					if (getQueryContext() == queryContext)
						setQueryContext(null);

					// Select another queryContext of the same QueryEditorManager.
//					setQueryEditorManager(queryContext.getQueryEditorManager());
				}
			});
		}
	};

	protected void recreateUIIfNecessary() {
		boolean onlyResultSetsOfActiveEditorVisible = isOnlyResultSetsOfActiveEditorVisible();
		if (lastOnlyResultSetsOfActiveEditorVisible == null) {
			lastOnlyResultSetsOfActiveEditorVisible = onlyResultSetsOfActiveEditorVisible;
			return;
		}

		if (lastOnlyResultSetsOfActiveEditorVisible.booleanValue() == onlyResultSetsOfActiveEditorVisible)
			return;

		queryContextSelectionHistoryReadOnly = true;
		try {
			lastOnlyResultSetsOfActiveEditorVisible = onlyResultSetsOfActiveEditorVisible;

			for (QueryContextUI queryContextUI : queryContext2QueryContextUI.values()) {
				queryContextUI.disposeWithoutClosingQueryContext();
			}
			queryContext2QueryContextUI.clear();

			List<QueryContext> queryContexts = new ArrayList<QueryContext>(queryContextDeque);
			queryContextDeque.clear();

			addQueryContexts(queryContexts);
		} finally {
			queryContextSelectionHistoryReadOnly = false;
		}
	}

	public void setQueryEditorManager(QueryEditorManager queryEditorManager) {
		logger.debug("setQueryEditorManager: queryEditorManager={} this.queryEditorManager={}", queryEditorManager, getQueryEditorManager());
//		if (getQueryEditorManager() == queryEditorManager && getQueryContext() != null)
//			return;
		recreateUIIfNecessary();

		QueryContext queryContext = null;
		if (queryEditorManager != null) {
			// we remembered which was the last used per QueryEditorManager and select the last used one
			for (Iterator<QueryContext> it = queryContextSelectionHistory.descendingIterator(); it.hasNext(); ) {
				QueryContext qc = it.next();
				if (qc.getQueryEditorManager() == queryEditorManager) {
					queryContext = qc;
					break;
				}
			}

			// if there is no history, we select the newest one of the active editor.
			if (queryContext == null) {
				List<QueryContext> queryContexts = queryEditorManager.getQueryContexts();
				if (!queryContexts.isEmpty())
					queryContext = queryContexts.get(queryContexts.size() - 1);
			}
		}

		if (queryContext == null && !isOnlyResultSetsOfActiveEditorVisible() && getQueryContext() != null) {
			internalSetQueryEditorManager(queryEditorManager);
		}
		else {
//			if (queryContext != getQueryContext())
//				internalSetQueryContext(null); // first clear to keep queryEditorManager & queryContext consistent in events fired.

			internalSetQueryEditorManager(queryEditorManager);
			internalSetQueryContext(queryContext);
		}
	}

	private void internalSetQueryEditorManager(QueryEditorManager queryEditorManager) {
		logger.debug("internalSetQueryEditorManager: queryEditorManager={} this.queryEditorManager={}", queryEditorManager, getQueryEditorManager());

		QueryEditorManager oldQueryEditorManager = getQueryEditorManager();
		this.queryEditorManager = queryEditorManager;
		propertyChangeSupport.firePropertyChange(PropertyName.queryEditorManager.name(), oldQueryEditorManager, queryEditorManager);
	}

	public QueryContext getQueryContext() {
		return queryContext;
	}

	protected void setQueryContext(QueryContext queryContext) {
		logger.debug("setQueryContext: queryContext={} this.queryContext={}", queryContext, getQueryContext());

		recreateUIIfNecessary();

		if (!queryContextSelectionHistoryReadOnly && queryContext != null && queryContextSelectionHistory.peekLast() != queryContext) {
			queryContextSelectionHistory.remove(queryContext);
			queryContextSelectionHistory.add(queryContext);
		}

		// TODO rather than nulling it here, we should maybe prevent a closed queryEditor to be set in the first place?!
		// or maybe both?! Currently this is essentially necessary!
		if (queryContext == null && getQueryEditorManager() != null && getQueryEditorManager().getQueryEditor().isClosed())
			internalSetQueryEditorManager(null);

		if (queryContext != null && queryContext.getQueryEditorManager() != getQueryEditorManager()) {
//			internalSetQueryContext(null);
			internalSetQueryEditorManager(queryContext.getQueryEditorManager());
		}

		internalSetQueryContext(queryContext);
	}

	private void internalSetQueryContext(QueryContext queryContext) {
		logger.debug("internalSetQueryContext: queryContext={} this.queryContext={}", queryContext, getQueryContext());

		QueryContext oldQueryContext = getQueryContext();
		this.queryContext = queryContext;

//		if (oldActiveQueryContext != null) { // Creating now a *new* TableViewer for every ResultSet => don't need to empty it anymore.
//			QueryContextUI queryContextUI = getQueryContextUIOrNull(oldActiveQueryContext);
//			if (queryContextUI != null)
//				manuallyEmptyTable(queryContextUI.getTableViewer());
//		}

		if (queryContext == null) {
			if (queryEditorManager == null)
				stackLayout.topControl = noQueryEditorManagerMessageLabel;
			else
				stackLayout.topControl = noQueryContextMessageLabel;
		}
		else {
			CTabFolder tabFolder = getTabFolderOrNull(queryContext);
			if (tabFolder == null)
				logger.warn("internalSetQueryContext: There is no tabFolder for this queryContext yet: {}", queryContext);
			else {
				QueryContextUI queryContextUI = getQueryContextUIOrNull(queryContext);
				if (queryContextUI != null) {
					stackLayout.topControl = tabFolder;
					tabFolder.setSelection(queryContextUI.getTabItem());
				}
			}
		}
		layout(true);

//		clearSelection();
		propertyChangeSupport.firePropertyChange(PropertyName.queryContext.name(), oldQueryContext, queryContext);
		fireSelectionChangedEvent();
	}

	private TableViewerColumn createRowIndexTableViewerColumn(TableViewer tableViewer, TableLayout layout)
	{
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.RIGHT);
		tableViewerColumn.setLabelProvider(new RowIndexLabelProvider());
		tableViewerColumn.getColumn().setText("Row #");

		layout.addColumnData(new ColumnPixelData(50));
		return tableViewerColumn;
	}

	private TableViewerColumn createResultSetTableCellTableViewerColumn(TableViewer tableViewer, IResultSet resultSet, TableLayout layout, int odaColumnIndex)
	throws OdaException
	{
		String columnName = resultSet.getMetaData().getColumnName(odaColumnIndex);
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.LEFT); // TODO use SWT.RIGHT for numbers! Need determine column type correctly.
		tableViewerColumn.setLabelProvider(new ResultSetTableCellLabelProvider(odaColumnIndex - 1));
		tableViewerColumn.getColumn().setText(columnName);

		layout.addColumnData(new ColumnWeightData(10));
		return tableViewerColumn;
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The implementation of this method in <code>ResultSetTableComposite</code> will always return an instance
	 * of {@link IStructuredSelection}, which either is empty or contains instances of {@link ResultSetTableRow}
	 * or {@link ResultSetTableCell}.
	 * </p>
	 */
	@Override
	public ISelection getSelection()
	{
		List<ResultSetTableCell> selectedCells = getSelectedCells();
		if (!selectedCells.isEmpty())
			return new StructuredSelection(selectedCells);
		else
			return new StructuredSelection(getSelectedRows());
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The implementation of this method in <code>ResultSetTableComposite</code> accepts only an instance
	 * of {@link IStructuredSelection}, which either is empty or contains instances of {@link ResultSetTableRow}
	 * or {@link ResultSetTableCell}. Everything else is silently ignored.
	 * </p>
	 */
	@Override
	public void setSelection(ISelection selection)
	{
		logger.warn("setSelection: Currently not supported!", new UnsupportedOperationException("NYI"));
//		if (selection.isEmpty()) {
//			tableViewer.setSelection(StructuredSelection.EMPTY);
//			// TO DO do sth. with the tableCursor (don't know what I can do, because tableCursor.setSelection(row, column)
//			// does not accept invalid values (like row being null).
//			return;
//		}
//
//		if (!(selection instanceof IStructuredSelection)) {
//			logger.warn("setSelection: selection is not an IStructuredSelection! Ignoring it: {}", selection);
//			return;
//		}
//
//		IStructuredSelection structuredSelection = (IStructuredSelection) selection;
//		// We'll probably support MULTI-selection later, but so far, we don't => hence, we pick the first entry.
//		Object element = structuredSelection.getFirstElement();
//		if (element instanceof ResultSetTableRow) {
//			ResultSetTableRow row = (ResultSetTableRow) element;
//			tableViewer.setSelection(new StructuredSelection(row));
//			tableCursor.setSelection(getTableItem(row, true), 0);
//			selectedRows = Collections.singletonList(row);
//		}
//		else if (element instanceof ResultSetTableCell) {
//			ResultSetTableCell cell = (ResultSetTableCell) element;
//			tableViewer.setSelection(new StructuredSelection(cell.getRow()));
//			tableCursor.setSelection(getTableItem(cell.getRow(), true), 0);
//			selectedCells = Collections.singletonList(cell);
//		}
	}

//	private TableItem getTableItem(ResultSetTableRow resultSetTableRow, boolean throwExceptionIfNotFound)
//	{
//		if (resultSetTableRow == null)
//			throw new IllegalArgumentException("resultSetTableRow == null");
//
//		for (TableItem tableItem : tableViewer.getTable().getItems()) {
//			if (resultSetTableRow.equals(tableItem.getData()))
//				return tableItem;
//		}
//
//		if (throwExceptionIfNotFound)
//			throw new IllegalArgumentException("There is no TableItem for this ResultSetTableRow: " + resultSetTableRow);
//
//		return null;
//	}

	private ListenerList selectionListenerList = new ListenerList();
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) { selectionListenerList.add(listener); }
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) { selectionListenerList.remove(listener); }

	private static class ComparableComparator<T extends Comparable<T>> implements Comparator<T>
	{
		@Override
		public int compare(T o1, T o2) {
			return o1.compareTo(o2);
		}
	}

	public MenuManager getContextMenuManager() {
		if (contextMenuManager == null) {
			contextMenuManager = new MenuManager();
			contextMenuManager.add(copyAction);
		}
		return contextMenuManager;
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(PropertyName propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName.name(), listener);
	}

	public void removePropertyChangeListener(PropertyName propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(propertyName.name(), listener);
	}

	private void assertUIThread() {
		if (Display.getCurrent() != display)
			throw new IllegalStateException("Thread mismatch! This method must be called on the SWT UI thread!");
	}
}
