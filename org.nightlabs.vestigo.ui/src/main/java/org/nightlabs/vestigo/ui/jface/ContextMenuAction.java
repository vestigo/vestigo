package org.nightlabs.vestigo.ui.jface;

import org.eclipse.jface.action.IAction;

public interface ContextMenuAction extends IAction {

	public abstract void updateEnabled();

}
