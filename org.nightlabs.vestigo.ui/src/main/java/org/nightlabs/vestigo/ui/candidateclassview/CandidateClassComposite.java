package org.nightlabs.jjqb.ui.candidateclassview;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.SortedSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.datatools.connectivity.ConnectEvent;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.IManagedConnection;
import org.eclipse.datatools.connectivity.IManagedConnectionListener;
import org.eclipse.datatools.connectivity.ManagedConnectionAdapter;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;
import org.nightlabs.jjqb.core.oda.ConnectionProfile;
import org.nightlabs.jjqb.core.oda.ConnectionProfileRegistry;
import org.nightlabs.jjqb.ui.oda.OdaUtil;
import org.nightlabs.jjqb.ui.resource.Messages;

public class CandidateClassComposite extends Composite
{
	private static final String MESSAGE_NO_CONNECTION_PROFILE = Messages.getString("CandidateClassComposite.message[noConnectionProfile]"); //$NON-NLS-1$
	private static final String MESSAGE_CONNECTION_PROFILE_CLOSED = Messages.getString("CandidateClassComposite.message[connectionProfileClosed]"); //$NON-NLS-1$
	private static final String MESSAGE_CONNECTING = Messages.getString("CandidateClassComposite.message[connecting]"); //$NON-NLS-1$
	private static final String MESSAGE_LOADING_DATA = Messages.getString("CandidateClassComposite.message[loadingData]"); //$NON-NLS-1$
	private static final String MESSAGE_ERROR = Messages.getString("CandidateClassComposite.message[error]"); //$NON-NLS-1$

	public enum PropertyName {
		candidateClassDoubleClicked
	}

	private Display display;
	private Text filterText;
	private TableViewer tableViewer;
	private Table table;
	private IConnectionProfile odaConnectionProfile;
	private IManagedConnection managedConnection;
	private ConnectionProfile jjqbConnectionProfile;
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	public CandidateClassComposite(Composite parent, int style) {
		super(parent, style);
		display = parent.getDisplay();
		GridLayout gridLayout = new GridLayout(2, false);
		setLayout(gridLayout);

		new Label(this, SWT.NONE).setText(Messages.getString("CandidateClassComposite.filterLabel.text")); //$NON-NLS-1$
		createFilterText();
		filterText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		createTableViewer();
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = gridLayout.numColumns;
		table.setLayoutData(gd);
		_setConnectionProfile(null);
	}

	protected void assertUIThread()
	{
		if (Display.getCurrent() != display)
			throw new IllegalStateException("This method must be called on the SWT UI thread!"); //$NON-NLS-1$
	}

	private volatile Job searchDelayJob = null;
	private void createFilterText() {
		filterText = new Text(this, SWT.BORDER);
		filterText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				Job job = new Job("Searching") { //$NON-NLS-1$
					@Override
					protected IStatus run(IProgressMonitor monitor)
					{
						final Job thisJob = this;
						if (searchDelayJob != thisJob)
							return Status.CANCEL_STATUS;

						display.asyncExec(new Runnable() {
							@Override
							public void run() {
								if (searchDelayJob != thisJob)
									return;

								if (filterText.isDisposed() || table == null || table.isDisposed())
									return;

								String text = filterText.getText();
								if (text.isEmpty())
									tableViewer.resetFilters();
								else
									tableViewer.setFilters(new ViewerFilter[] { new TextViewerFilter(text) });
							}
						});

						return Status.OK_STATUS;
					}
				};
				job.setPriority(Job.INTERACTIVE);
				job.setSystem(true);
				searchDelayJob = job;
				job.schedule(500);
			}
		});
	}

	private class TextViewerFilter extends ViewerFilter
	{
		private String text;

		public TextViewerFilter(String searchText) {
			if (searchText == null)
				throw new IllegalArgumentException("filterText == null"); //$NON-NLS-1$

			this.text = searchText.toLowerCase();
		}

		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element)
		{
			if (!(element instanceof CandidateClass))
				return true;

			CandidateClass candidateClass = (CandidateClass) element;
			return candidateClass.getClassNameLowerCase().contains(text);
		}
	}

	private void createTableViewer()
	{
		assertUIThread();

		tableViewer = new TableViewer(
				this,
				SWT.FULL_SELECTION // We want the whole line to be displayed as selected.
				| SWT.SINGLE // Right now, we allow only single-line-selections.
		);
		tableViewer.setContentProvider(new ArrayContentProvider());
		tableViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof CandidateClass) {
					CandidateClass candidateClass = (CandidateClass) element;
					return candidateClass.getClassName();
				}
				return super.getText(element);
			}
		});
//		tableViewer.getTable().setHeaderVisible(true); // We have only one column, hence we don't need a header.
		tableViewer.getTable().setLinesVisible(true);
		tableViewer.setUseHashlookup(true);
		table = tableViewer.getTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e)
			{
				if (odaConnectionProfile == null)
					return;

				ISelection sel = tableViewer.getSelection();
				if (sel instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) sel;
					Object firstSelectedElement = selection.getFirstElement();
					if (MESSAGE_CONNECTION_PROFILE_CLOSED == firstSelectedElement)
						connect();
					else if (firstSelectedElement instanceof CandidateClass)
						propertyChangeSupport.firePropertyChange(PropertyName.candidateClassDoubleClicked.name(), null, firstSelectedElement);
				}
			}
		});
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(String propertyName,
			PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(String propertyName,
			PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(propertyName, listener);
	}

	private void connect()
	{
		assertUIThread();

		if (odaConnectionProfile == null)
			throw new IllegalStateException("odaConnectionProfile == null"); //$NON-NLS-1$

		tableViewer.setInput(Collections.singletonList(MESSAGE_CONNECTING));

		odaConnectionProfile.connect(new JobChangeAdapter() { });
	}

	private IManagedConnectionListener connectionListener = new ManagedConnectionAdapter()
	{
		@Override
		public void opened(ConnectEvent event) {
			display.asyncExec(new Runnable() {
				@Override
				public void run() {
					_setConnectionProfile(odaConnectionProfile);
				}
			});
		}

		@Override
		public void closed(ConnectEvent event) {
			display.asyncExec(new Runnable() {
				@Override
				public void run() {
					_setConnectionProfile(odaConnectionProfile);
				}
			});
		}
	};

	public final void setInput(IConnectionProfile input)
	{
		assertUIThread();
		if (this.odaConnectionProfile != input)
			_setConnectionProfile(input);
	}


	protected void _setConnectionProfile(IConnectionProfile connectionProfile)
	{
		if (this.managedConnection != null)
			this.managedConnection.removeConnectionListener(connectionListener);

		this.odaConnectionProfile = connectionProfile;
		this.managedConnection = connectionProfile == null ? null : OdaUtil.getManagedConnection(connectionProfile);
		this.jjqbConnectionProfile = null;
		if (connectionProfile == null)
			tableViewer.setInput(Collections.singletonList(MESSAGE_NO_CONNECTION_PROFILE));
		else {
			managedConnection.addConnectionListener(connectionListener);

			if (!managedConnection.isConnected())
				tableViewer.setInput(Collections.singletonList(MESSAGE_CONNECTION_PROFILE_CLOSED));
			else {
				Properties connectionProperties = odaConnectionProfile.getProperties(odaConnectionProfile.getProviderId());
				String profileID = PropertiesUtil.getProfileID(connectionProperties);
				jjqbConnectionProfile = ConnectionProfileRegistry.sharedInstance().getConnectionProfile(profileID);
				if (jjqbConnectionProfile == null)
					throw new IllegalStateException("jjqbConnectionProfile == null :: profileID == " + profileID); //$NON-NLS-1$

				loadCandidateClasses();
			}
		}
	}

	private void loadCandidateClasses()
	{
		assertUIThread();

		final ConnectionProfile jjqbConnectionProfile = this.jjqbConnectionProfile;
		if (jjqbConnectionProfile == null)
			throw new IllegalStateException("jjqbConnectionProfile == null"); //$NON-NLS-1$

		tableViewer.setInput(Collections.singletonList(MESSAGE_LOADING_DATA));

		Job job = new Job(Messages.getString("CandidateClassComposite.loadCandidateClassesJob.name")) { //$NON-NLS-1$
			@Override
			protected IStatus run(IProgressMonitor monitor)
			{
				try {
					final SortedSet<String> queryableCandidateClasses = jjqbConnectionProfile.getQueryableCandidateClasses();
					final List<CandidateClass> candidateClassesList = new ArrayList<CandidateClass>(queryableCandidateClasses.size());
					for (String className : queryableCandidateClasses)
						candidateClassesList.add(new CandidateClass(className));

					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							tableViewer.setInput(candidateClassesList);
						}
					});
				} catch (final Exception x) {
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							tableViewer.setInput(Collections.singletonList(String.format(MESSAGE_ERROR, x.getLocalizedMessage())));
						}
					});

					if (x instanceof RuntimeException)
						throw (RuntimeException)x;
					else
						throw new RuntimeException(x);
				}
				return Status.OK_STATUS;
			}
		};
		job.setPriority(Job.INTERACTIVE);
		job.setUser(true);
		job.schedule();
	}
}
