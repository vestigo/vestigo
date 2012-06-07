package org.nightlabs.vestigo.ui.queryparam;

import java.util.List;

import org.eclipse.jface.action.IAction;

public class MoveParameterDownAction extends QueryParameterManagerViewAction {

	@Override
	public void run(IAction action) {
		List<QueryParameter> queryParameters = selectedQueryParameters;
		for (int i = queryParameters.size() - 1; i >= 0; --i) {
			QueryParameter queryParameter = queryParameters.get(i);
			if (!getQueryParameterManager().moveQueryParameterDown(queryParameter))
				break;
		}
	}

	@Override
	protected boolean calculateActionEnabled() {
		return super.calculateActionEnabled() && !selectedQueryParameters.isEmpty();
	}
}
