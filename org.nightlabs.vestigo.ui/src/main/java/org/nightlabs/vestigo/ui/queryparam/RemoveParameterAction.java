package org.nightlabs.vestigo.ui.queryparam;

import org.eclipse.jface.action.IAction;

public class RemoveParameterAction extends QueryParameterManagerViewAction {

	@Override
	public void run(IAction action) {
		for (QueryParameter queryParameter : selectedQueryParameters)
			getQueryParameterManager().removeQueryParameter(queryParameter);
	}

	@Override
	protected boolean calculateActionEnabled() {
		return super.calculateActionEnabled() && !selectedQueryParameters.isEmpty();
	}
}
