package org.nightlabs.vestigo.ui.editor;

import java.util.EventObject;

public class QueryContextEvent extends EventObject
{
	private static final long serialVersionUID = 1L;

	public QueryContextEvent(QueryContext source) {
		super(source);
	}

	@Override
	public QueryContext getSource() {
		return (QueryContext) super.getSource();
	}
}
