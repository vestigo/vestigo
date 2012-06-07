package org.nightlabs.vestigo.ui.queryparam;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public abstract class QueryParameterManagerViewAction implements IViewActionDelegate {

	protected QueryParameterManagerView view;
	protected IAction action;

	protected List<QueryParameter> selectedQueryParameters = Collections.emptyList();

	protected QueryParameterManager getQueryParameterManager() {
		return view == null ? null : view.getQueryParameterManager();
	}

	@Override
	public void init(IViewPart view) {
		this.view = (QueryParameterManagerView) view;
		init(this.view);
	}

	protected void init(QueryParameterManagerView view) {
		if (view == null)
			return;

		view.getQueryParameterManagerComposite().addPropertyChangeListener(
				QueryParameterManagerComposite.PropertyName.queryParameterManager, queryParameterManagerChangeListener);
	}

	private PropertyChangeListener queryParameterManagerChangeListener = new PropertyChangeListener() {
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			if (action != null)
				action.setEnabled(calculateActionEnabled());
		}
	};

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.action = action;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			List<QueryParameter> list = new ArrayList<QueryParameter>(sel.size());
			for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
				Object o = it.next();
				if (o instanceof QueryParameter)
					list.add((QueryParameter) o);
			}
			selectedQueryParameters = Collections.unmodifiableList(list);
		}
		else
			selectedQueryParameters = Collections.emptyList();

		selectionChanged(selectedQueryParameters);
		action.setEnabled(calculateActionEnabled());
	}

	protected boolean calculateActionEnabled() {
		return getQueryParameterManager() != null;
	}

	protected void selectionChanged(List<QueryParameter> selectedQueryParameters) {

	}
}
