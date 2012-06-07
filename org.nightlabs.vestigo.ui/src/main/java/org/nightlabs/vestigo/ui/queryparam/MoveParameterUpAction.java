package org.nightlabs.vestigo.ui.queryparam;

import org.eclipse.jface.action.IAction;

public class MoveParameterUpAction extends QueryParameterManagerViewAction {

	@Override
	public void run(IAction action) {
		for (QueryParameter queryParameter : selectedQueryParameters) {
			if (!getQueryParameterManager().moveQueryParameterUp(queryParameter))
				break;
		}
	}

	@Override
	protected boolean calculateActionEnabled() {
		return super.calculateActionEnabled() && !selectedQueryParameters.isEmpty();
	}
}
