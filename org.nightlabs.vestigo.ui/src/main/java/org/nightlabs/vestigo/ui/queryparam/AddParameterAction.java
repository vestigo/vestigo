package org.nightlabs.vestigo.ui.queryparam;

import org.eclipse.jface.action.IAction;

public class AddParameterAction extends QueryParameterManagerViewAction {

	@Override
	public void run(IAction action) {
		getQueryParameterManager().addQueryParameter();
	}

}
