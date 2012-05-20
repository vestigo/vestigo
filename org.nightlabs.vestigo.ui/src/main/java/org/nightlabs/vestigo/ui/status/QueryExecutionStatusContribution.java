package org.nightlabs.vestigo.ui.status;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.menus.WorkbenchWindowControlContribution;
import org.nightlabs.vestigo.childvm.shared.dto.QueryExecutionStatisticSetDTO;
import org.nightlabs.vestigo.core.oda.ResultSet;
import org.nightlabs.vestigo.ui.resultsettable.ResultSetTableModel;
import org.nightlabs.vestigo.ui.resultsettable.ResultSetTableView;

public class QueryExecutionStatusContribution extends WorkbenchWindowControlContribution
{
	private Label statusLabel;

	public QueryExecutionStatusContribution() {
	}

	public QueryExecutionStatusContribution(String id) {
		super(id);
	}

	@Override
	protected Control createControl(Composite parent) {
		getWorkbenchWindow().getSelectionService().addSelectionListener(selectionListener);

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
			emptyStatus += " ";
			updateStatusText(null);
		} while (statusLabel.computeSize(SWT.DEFAULT, SWT.DEFAULT).x < computedSize.x);

		return control;
	}

	private String emptyStatus = "";

	protected ISelectionListener selectionListener = new ISelectionListener() {
		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			if (part instanceof ResultSetTableView) {
				ResultSetTableView resultSetTableView = (ResultSetTableView) part;
				ResultSetTableModel resultSetTableModel = resultSetTableView.getResultSetTableModel();
				if (resultSetTableModel != null) {
					ResultSet resultSet = ResultSet.Helper.getWrappedResultSetOrFail(resultSetTableModel.getResultSet());
					updateStatusText(resultSet.getQueryExecutionStatisticSetDTO());
				}
			}
		}
	};

	protected void updateStatusText(QueryExecutionStatisticSetDTO queryExecutionStatisticSetDTO) {
		if (queryExecutionStatisticSetDTO == null)
			statusLabel.setText(emptyStatus);
		else
			statusLabel.setText(String.format("Query execution took %s ms.", queryExecutionStatisticSetDTO.getQueryExecutionDuration()));

		statusLabel.getParent().layout(true);
	}
}
