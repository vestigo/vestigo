package org.nightlabs.vestigo.ui.resultsettable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.datatools.connectivity.oda.IConnection;
import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.jface.viewers.deferred.AbstractConcurrentModel;
import org.eclipse.jface.viewers.deferred.IConcurrentModel;
import org.eclipse.jface.viewers.deferred.IConcurrentModelListener;
import org.eclipse.swt.widgets.Display;
import org.nightlabs.vestigo.core.PropertiesWithChangeSupport;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ResultSetTableModel
extends AbstractConcurrentModel
implements IConcurrentModel // not necessary - just convenient to see the javadoc when hovering/selecting it
{
	private static final Logger logger = LoggerFactory.getLogger(ResultSetTableModel.class);

	/**
	 * Properties used for the {@link PropertyChangeListener}s. Pass the {@link Enum#name() name} these to
	 * {@link ResultSetTableModel#addPropertyChangeListener(PropertyName, PropertyChangeListener) addPropertyChangeListener(...)}.
	 *
	 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
	 */
	public static enum PropertyName {
		/**
		 * @see #isCompletelyLoaded()
		 */
		completelyLoaded,

		aboutToClose,

		closed
	}

	/**
	 * Property key used in the {@link #getProperties() persistent properties} to
	 * reference the last used <code>bunchSize</code>.
	 * @see #loadNextBunch(int)
	 */
	public static final String PROPERTY_KEY_LAST_BUNCH_SIZE = "lastBunchSize";

	public static PropertiesWithChangeSupport getProperties() {
		return VestigoUIPlugin.getDefault().getProperties(ResultSetTableModel.class.getName());
	}

	public static int getLastBunchSize()
	{
		String s = getProperties().getProperty(PROPERTY_KEY_LAST_BUNCH_SIZE);
		if (s == null)
			return 100;
		else
			return Integer.valueOf(s);
	}

	public static void setLastBunchSize(int lastBunchSize)
	{
		getProperties().setProperty(PROPERTY_KEY_LAST_BUNCH_SIZE, Integer.toString(lastBunchSize));
	}


	private IConnection connection;
	private volatile Object[] rowsLoadedArray;
	private List<ResultSetTableRow> rowsLoaded = new ArrayList<ResultSetTableRow>();
	private IResultSet resultSet;
	private Object mutex = this;
	private boolean initialLoadDone = false;

	private boolean completelyLoaded;

	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	public ResultSetTableModel(IConnection connection, IResultSet resultSet)
	{
		if (connection == null)
			throw new IllegalArgumentException("connection == null");

		if (resultSet == null)
			throw new IllegalArgumentException("resultSet == null");

		this.connection = connection;
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
	 * @see PropertyName
	 */
	public void addPropertyChangeListener(PropertyName propertyName, PropertyChangeListener listener) {
		determineDisplay();
		propertyChangeSupport.addPropertyChangeListener(propertyName.name(), listener);
	}

	public void removePropertyChangeListener(PropertyName propertyName, PropertyChangeListener listener) {
		determineDisplay();
		propertyChangeSupport.removePropertyChangeListener(propertyName.name(), listener);
	}

	public IConnection getConnection() {
		return connection;
	}

	public IResultSet getResultSet() {
		return resultSet;
	}

	protected Object[] getRowsLoadedArray() // should be private but is needed for workaround in ResultSetTableComposite. Marco :-)
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
		loadNextBunch(getLastBunchSize());
	}

	public synchronized void loadNextBunch(int bunchSize)
	{
		if (loadNextBunchJob != null)
			return;

		if (bunchSize < 1)
			bunchSize = Integer.MAX_VALUE;

		setLastBunchSize(bunchSize);

		initialLoadDone = true;

		final int finalBunchSize = bunchSize;
		Job job = new Job("Loading rows...") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					// load 100 first results
					List<ResultSetTableRow> rows = new ArrayList<ResultSetTableRow>(Math.min(finalBunchSize, 10000));
					int counter = 0;
					boolean lastResultSetNextResult = true;
					while (++counter <= finalBunchSize && (lastResultSetNextResult = resultSet.next())) {
						int columnCount = resultSet.getMetaData().getColumnCount(); // TODO move up - only testing with call to next first.
						ResultSetTableCell[] cells = new ResultSetTableCell[columnCount];
						for (int columnIndex = 1; columnIndex <= columnCount; ++columnIndex) {
							Object cellContent = resultSet.getObject(columnIndex);
							cells[columnIndex - 1] = new ResultSetTableCell(columnIndex, cellContent);
						}
						rows.add(new ResultSetTableRow(ResultSetTableModel.this, resultSet.getRow(), cells));
					}
					final boolean _completelyLoaded = lastResultSetNextResult == false;
					synchronized (mutex) {
						completelyLoaded = _completelyLoaded;
						rowsLoaded.addAll(rows);
					}
					rowsLoadedArray = null;
					Object[] rowsArray = rows.toArray();
					fireAdd(rowsArray);

					if (_completelyLoaded) {
						Display d = display;
						if (d != null) {
							d.asyncExec(new Runnable() {
								@Override
								public void run() {
									propertyChangeSupport.firePropertyChange(PropertyName.completelyLoaded.name(), !_completelyLoaded, _completelyLoaded);
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

	public boolean isCompletelyLoaded() {
		return completelyLoaded;
	}

	private volatile boolean closed;

	public boolean isClosed() {
		return closed;
	}

	public void close()
	{
		if (closed)
			return;
		closed = true;

		Display d = display;
		if (d != null) {
			d.syncExec(new Runnable() {
				@Override
				public void run() {
					propertyChangeSupport.firePropertyChange(PropertyName.aboutToClose.name(), null, null);
				}
			});
		}

		try {
			resultSet.close();
		} catch (OdaException e) {
			logger.error("close: " + e, e);
		}

		if (d != null) {
			d.asyncExec(new Runnable() {
				@Override
				public void run() {
					propertyChangeSupport.firePropertyChange(PropertyName.closed.name(), null, null);
				}
			});
		}
	}
}
