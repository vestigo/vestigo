package org.nightlabs.eclipse.jjqb.ui.browser;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.nightlabs.eclipse.jjqb.ui.resultsettable.ResultSetTableComposite;
import org.nightlabs.eclipse.jjqb.ui.resultsettable.ResultSetTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JPAQueryBrowserEditor
extends TextEditor
implements JPAQueryBrowser
{
	private static final Logger logger = LoggerFactory.getLogger(JPAQueryBrowserEditor.class);

	private SashForm partControl;

	private QueryBrowserManagementComposite managementComposite;

	private Composite queryEditorComposite;
	private ResultSetTableComposite resultSetTableComposite;
	private ResultSetTableModel resultSetTableModel;

	@Override
	public void createPartControl(Composite parent)
	{
		partControl = new SashForm(parent, SWT.VERTICAL);
		queryEditorComposite = new Composite(partControl, SWT.BORDER);
		queryEditorComposite.setLayout(new GridLayout());

		super.createPartControl(queryEditorComposite);

		managementComposite = new JPAQueryBrowserManagementComposite(queryEditorComposite, SWT.BORDER);
		managementComposite.setQueryBrowser(this);

		for (Control c : queryEditorComposite.getChildren()) {
			if (c != managementComposite)
				c.setLayoutData(new GridData(GridData.FILL_BOTH));
		}

		resultSetTableComposite = new ResultSetTableComposite(partControl, SWT.BORDER);
		getSite().setSelectionProvider(resultSetTableComposite); // TODO do I need a proxy to support query-text-selections and result-set-selections at the same time?
	}

	@Override
	public ExecuteQueryCallback getExecuteQueryCallback() {
		return executeQueryCallback;
	}

	private ExecuteQueryCallback executeQueryCallback = new AbstractExecuteQueryCallback() {
		@Override
		public String getQueryText() {
			return getDocumentProvider().getDocument(getEditorInput()).get();
		}

		@Override
		public void preExecuteQuery() {
			resultSetTableComposite.setInput(null);
		}

		@Override
		public void postExecuteQuery(QueryContext queryContext, IResultSet rs) {
			resultSetTableModel = new ResultSetTableModel(rs);
			resultSetTableModel.addPropertyChangeListener(ResultSetTableModel.PROPERTY_CHANGE_COMPLETELY_LOADED, new PropertyChangeListener() {
				@Override
				public void propertyChange(PropertyChangeEvent evt) {
					managementComposite.setLoadNextActionEnabled((Boolean)evt.getNewValue() == false);
				}
			});
			resultSetTableComposite.setInput(resultSetTableModel);
		}
	};

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException
	{
//		this.display = site.getShell().getDisplay();
		super.init(site, input);
	}

	@Override
	public void loadNextActionTriggered(LoadNextActionEvent loadNextActionEvent) {
		ResultSetTableModel model = resultSetTableModel;
		if (model != null)
			model.loadNextBunch();
	}
}
