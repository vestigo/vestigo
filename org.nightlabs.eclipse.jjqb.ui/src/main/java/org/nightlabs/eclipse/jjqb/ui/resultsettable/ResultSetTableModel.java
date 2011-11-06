package org.nightlabs.eclipse.jjqb.ui.resultsettable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.jface.viewers.deferred.AbstractConcurrentModel;
import org.eclipse.jface.viewers.deferred.IConcurrentModel;
import org.eclipse.jface.viewers.deferred.IConcurrentModelListener;
import org.eclipse.swt.widgets.Display;

public class ResultSetTableModel
extends AbstractConcurrentModel
implements IConcurrentModel // not necessary - just convenient to see the javadoc when hovering/selecting it
{
	private volatile Object[] rowsLoadedArray;
	private List<ResultSetTableRow> rowsLoaded = new ArrayList<ResultSetTableRow>();
	private IResultSet resultSet;
	private Object mutex = this;
	private boolean initialLoadDone = false;

	/**
	 * @see #isCompletelyLoaded()
	 */
	public static final String PROPERTY_CHANGE_COMPLETELY_LOADED = "completelyLoaded";

	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	public ResultSetTableModel(IResultSet resultSet)
	{
		if (resultSet == null)
			throw new IllegalArgumentException("resultSet == null");

		this.resultSet = resultSet;
	}

	private volatile Display display;

	private void determineDisplay()
	{
		Display d = Display.getCurrent();
		if (d == null)
			throw new IllegalStateException("You must call this method on the SWT UI thread!");

		if (display == null)
			display = d;
		else if (display != d)
			throw new IllegalStateException("You must call this method always on the same SWT UI thread! Now different thread than before!");
	}

	/**
	 * Add a listener that is triggered on the SWT UI thread when a property changes.
	 * @param propertyName
	 * @param listener
	 * @see #PROPERTY_CHANGE_COMPLETELY_LOADED
	 */
	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		determineDisplay();
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		determineDisplay();
		propertyChangeSupport.removePropertyChangeListener(propertyName, listener);
	}

	public IResultSet getResultSet() {
		return resultSet;
	}

	private Object[] getRowsLoadedArray()
	{
		if (rowsLoadedArray == null) {
			synchronized (this) {
				if (rowsLoadedArray == null)
					rowsLoadedArray = rowsLoaded.toArray();
			}
		}
		return rowsLoadedArray;
	}

	@Override
	public void requestUpdate(final IConcurrentModelListener listener)
	{
		synchronized (mutex) {
			if (!initialLoadDone) {
				loadNextBunch();
			}
		}

		listener.setContents(getRowsLoadedArray());
	}

	private volatile Job loadNextBunchJob;

	public synchronized void loadNextBunch()
	{
		if (loadNextBunchJob != null)
			return;

		initialLoadDone = true;

		Job job = new Job("Loading rows...") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					// load 100 first results
					List<ResultSetTableRow> rows = new ArrayList<ResultSetTableRow>(100);
					int counter = 0;
					boolean lastResultSetNextResult = true;
					while (++counter <= 100 && (lastResultSetNextResult = resultSet.next())) {
						int columnCount = resultSet.getMetaData().getColumnCount(); // TODO move up - only testing with call to next first.
						ResultSetTableCell[] cells = new ResultSetTableCell[columnCount];
						for (int columnIndex = 1; columnIndex <= columnCount; ++columnIndex) {
							Object cellContent = resultSet.getObject(columnIndex);
							cells[columnIndex - 1] = new ResultSetTableCell(columnIndex, cellContent);
						}
						rows.add(new ResultSetTableRow(ResultSetTableModel.this, resultSet.getRow(), cells));
					}
					synchronized (mutex) {
						completelyLoaded = lastResultSetNextResult == false;
						rowsLoaded.addAll(rows);
					}
					rowsLoadedArray = null;
					Object[] rowsArray = rows.toArray();
					fireAdd(rowsArray);

					if (lastResultSetNextResult == false) {
						Display d = display;
						if (d != null) {
							display.asyncExec(new Runnable() {
								@Override
								public void run() {
									propertyChangeSupport.firePropertyChange(PROPERTY_CHANGE_COMPLETELY_LOADED, !completelyLoaded, completelyLoaded);
								}
							});
						}
					}

				} catch (Exception x) {
					throw new RuntimeException(x);
				} finally {
					loadNextBunchJob = null;
				}
				return Status.OK_STATUS;
			}
		};
		loadNextBunchJob = job;
		job.schedule();
	}

	private boolean completelyLoaded;

	public boolean isCompletelyLoaded() {
		return completelyLoaded;
	}
}
