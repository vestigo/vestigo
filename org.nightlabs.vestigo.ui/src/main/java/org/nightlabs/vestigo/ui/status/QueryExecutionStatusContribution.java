package org.nightlabs.vestigo.ui.status;

import org.eclipse.jface.action.StatusLineLayoutData;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.menus.WorkbenchWindowControlContribution;

public class QueryExecutionStatusContribution extends
		WorkbenchWindowControlContribution {

	public QueryExecutionStatusContribution() {
	}

	public QueryExecutionStatusContribution(String id) {
		super(id);
	}

	@Override
	protected Control createControl(Composite parent) {
		// TODO Show query execution statistics of currently selected ResultSet!
		// The statistics can be obtained from the ResultSet via:
		// QueryExecutionStatisticSetDTO dto = (QueryExecutionStatisticSetDTO) resultSet.getObject(QueryExecutionStatisticSetDTO.class.getName());
		Label control = new Label(parent, SWT.NONE);
		control.setText("TODO: Show query execution statistics!");
		StatusLineLayoutData statusLineLayoutData = new StatusLineLayoutData();
		statusLineLayoutData.heightHint = 100;
		statusLineLayoutData.widthHint = 200;
		control.setLayoutData(statusLineLayoutData);
		return control;
	}

}
