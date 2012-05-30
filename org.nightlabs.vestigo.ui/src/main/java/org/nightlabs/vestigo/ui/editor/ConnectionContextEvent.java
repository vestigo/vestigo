package org.nightlabs.vestigo.ui.editor;

import java.util.EventObject;

public class ConnectionContextEvent extends EventObject
{
	private static final long serialVersionUID = 1L;

	public ConnectionContextEvent(ConnectionContext source) {
		super(source);
	}

	@Override
	public ConnectionContext getSource() {
		return (ConnectionContext) super.getSource();
	}
}
