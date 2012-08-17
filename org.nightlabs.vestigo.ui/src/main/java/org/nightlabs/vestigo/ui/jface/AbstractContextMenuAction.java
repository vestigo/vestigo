package org.nightlabs.vestigo.ui.jface;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;

public abstract class AbstractContextMenuAction extends Action implements ContextMenuAction
{
	public AbstractContextMenuAction() { }

	public AbstractContextMenuAction(String text) {
		super(text);
	}

	public AbstractContextMenuAction(String text, ImageDescriptor image) {
		super(text, image);
	}

	public AbstractContextMenuAction(String text, int style) {
		super(text, style);
	}
}
