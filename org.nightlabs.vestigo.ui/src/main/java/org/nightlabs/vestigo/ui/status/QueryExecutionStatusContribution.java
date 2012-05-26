package org.nightlabs.vestigo.ui.status;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.menus.WorkbenchWindowControlContribution;
import org.nightlabs.vestigo.childvm.shared.dto.QueryExecutionStatisticSetDTO;
import org.nightlabs.vestigo.core.oda.ResultSet;
import org.nightlabs.vestigo.ui.resultsettable.ResultSetTableAdapter;
import org.nightlabs.vestigo.ui.resultsettable.ResultSetTableEvent;
import org.nightlabs.vestigo.ui.resultsettable.ResultSetTableListener;
import org.nightlabs.vestigo.ui.resultsettable.ResultSetTableModel;
import org.nightlabs.vestigo.ui.resultsettable.ResultSetTableView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueryExecutionStatusContribution extends WorkbenchWindowControlContribution
{
	private static final Logger logger = LoggerFactory.getLogger(QueryExecutionStatusContribution.class);

	private Display display;
	private Label statusLabel;
	private ResultSetTableView resultSetTableView;

	public QueryExecutionStatusContribution() {
	}

	public QueryExecutionStatusContribution(String id) {
		super(id);
	}

	@Override
	protected Control createControl(Composite parent) {
		display = parent.getDisplay();

		parent.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent event) {
				setResultSetTableView(null);
				for (IWorkbenchPage page : pages)
					page.removePartListener(partListener);
			}
		});

		Composite control = new Composite(parent, SWT.NONE);
		control.setLayout(new FillLayout());

		statusLabel = new Label(control, SWT.NONE);

		QueryExecutionStatisticSetDTO tmpDTO = new  QueryExecutionStatisticSetDTO();
		tmpDTO.setQueryExecutionDuration(999999);
		tmpDTO.setQueryParameterEvaluationDurationMax(999999);
		tmpDTO.setQueryParameterEvaluationDurationMin(999999);
		tmpDTO.setQueryParameterEvaluationDurationTotal(999999);
		updateStatusText(tmpDTO);

//		StatusLineLayoutData statusLineLayoutData = new StatusLineLayoutData();
//		Point computedSize = statusLabel.computeSize(SWT.DEFAULT, SWT.DEFAULT);
//		statusLineLayoutData.heightHint = computedSize.y;
//		statusLineLayoutData.widthHint = computedSize.x;
//		control.setLayoutData(statusLineLayoutData);
		// Has unfortunately no effect :-(

		Point computedSize = statusLabel.computeSize(SWT.DEFAULT, SWT.DEFAULT);
		do {
			logger.debug("createControl: computedSize.x={} computedSize.y={}", computedSize.x, computedSize.y);
			emptyStatus += " ";
			updateStatusText((QueryExecutionStatisticSetDTO)null);
		} while (statusLabel.computeSize(SWT.DEFAULT, SWT.DEFAULT).x < computedSize.x);

		getWorkbenchWindow().addPageListener(pageListener);
		if (getWorkbenchWindow().getActivePage() != null) {
			getWorkbenchWindow().getActivePage().addPartListener(partListener);
			findResultSetTableView(getWorkbenchWindow().getActivePage());
		}

		return control;
	}

	protected void findResultSetTableView(IWorkbenchPage page) {
		if (resultSetTableView != null)
			return;

		for (IViewReference viewReference : page.getViewReferences()) {
			if (ResultSetTableView.ID.equals(viewReference.getId()))
				setResultSetTableView((ResultSetTableView) viewReference.getPart(true));

			if (resultSetTableView != null)
				break;
		}
	}

	protected IPartListener partListener = new IPartListener() {

		@Override
		public void partActivated(IWorkbenchPart part) { }

		@Override
		public void partBroughtToTop(IWorkbenchPart part) { }

		@Override
		public void partClosed(IWorkbenchPart part) {
			if (resultSetTableView == part) {
				setResultSetTableView(null);
			}
		}

		@Override
		public void partDeactivated(IWorkbenchPart part) { }

		@Override
		public void partOpened(IWorkbenchPart part) {
			if (part instanceof ResultSetTableView)
				setResultSetTableView((ResultSetTableView) part);
		}
	};

	private Set<IWorkbenchPage> pages = new HashSet<IWorkbenchPage>();

	protected IPageListener pageListener = new IPageListener() {
		@Override
		public void pageOpened(IWorkbenchPage page) {
			findResultSetTableView(page);
			page.addPartListener(partListener);
			pages.add(page);
		}
		@Override
		public void pageClosed(IWorkbenchPage page) {
			page.removePartListener(partListener);
			pages.remove(page);
		}
		@Override
		public void pageActivated(IWorkbenchPage page) {
			findResultSetTableView(page);
		}
	};

	protected void assertUiThread() {
		if (display != null && display != Display.getCurrent())
			throw new IllegalStateException("Thread mismatch! This method must be called on the SWT UI thread!");
	}

	protected void setResultSetTableView(ResultSetTableView resultSetTableView) {
		assertUiThread();
		if (this.resultSetTableView != null) {
			this.resultSetTableView.removeResultSetTableListener(resultSetTableListener);
		}

		this.resultSetTableView = resultSetTableView;

		if (resultSetTableView == null)
			updateStatusText((QueryExecutionStatisticSetDTO)null);
		else {
			resultSetTableView.addResultSetTableListener(resultSetTableListener);
			ResultSetTableModel resultSetTableModel = resultSetTableView.getResultSetTableModel();
			updateStatusText(resultSetTableModel);
		}
	}

	protected ResultSetTableListener resultSetTableListener = new ResultSetTableAdapter() {
		@Override
		public void resultSetActivated(ResultSetTableEvent event) {
			ResultSetTableModel resultSetTableModel = event.getResultSetTableModel();
			updateStatusText(resultSetTableModel);
		}
	};

	private String emptyStatus = "";

	protected void updateStatusText(ResultSetTableModel resultSetTableModel) {
		if (resultSetTableModel == null)
			updateStatusText((QueryExecutionStatisticSetDTO)null);
		else {
			ResultSet resultSet = ResultSet.Helper.getWrappedResultSetOrFail(resultSetTableModel.getResultSet());
			updateStatusText(resultSet.getQueryExecutionStatisticSetDTO());
		}
	}

	protected void updateStatusText(QueryExecutionStatisticSetDTO queryExecutionStatisticSetDTO) {
		if (queryExecutionStatisticSetDTO == null) {
			logger.debug("updateStatusText: emptyStatus.length={}", emptyStatus.length());
			statusLabel.setText(emptyStatus);
		}
		else {
			String text = String.format("Query execution took %s ms.", queryExecutionStatisticSetDTO.getQueryExecutionDuration());
			logger.debug("updateStatusText: text={}", text);
			statusLabel.setText(text);
		}

		statusLabel.getParent().layout(true);
	}
}
