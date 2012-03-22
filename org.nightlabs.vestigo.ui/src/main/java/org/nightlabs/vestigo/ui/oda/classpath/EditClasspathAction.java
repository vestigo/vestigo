package org.nightlabs.vestigo.ui.oda.classpath;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;

class EditClasspathAction extends Action
{
	private EditClasspathActionDelegate actionDelegate;
	private Button button;

	public EditClasspathAction(EditClasspathActionDelegate actionDelegate, Button button) {
		if (actionDelegate == null)
			throw new IllegalArgumentException("actionDelegate == null");

		if (button == null)
			throw new IllegalArgumentException("button == null");

		this.actionDelegate = actionDelegate;
		this.button = button;
		button.addDisposeListener(buttonDisposeListener);
	}

	private DisposeListener buttonDisposeListener = new DisposeListener() {
		@Override
		public void widgetDisposed(DisposeEvent e) {
			setImageDescriptor(null);
		}
	};

	@Override
	public void run() {
		actionDelegate.run(this);
	}

	@Override
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
		button.setEnabled(enabled);
	}

	@Override
	public void setImageDescriptor(ImageDescriptor newImage) {
		ImageDescriptor oldImageDescriptor = super.getImageDescriptor();
		super.setImageDescriptor(newImage);

		Image oldImage = button.getImage();
		if (oldImage != null) {
			oldImageDescriptor.destroyResource(oldImage);
			button.setImage(null);
		}

		if (newImage != null) {
			final Image image = (Image) newImage.createResource(button.getDisplay());
			button.setImage(image);
			button.setText("");
		}
		else
			button.setText(getText());
	}

	@Override
	public void setText(String text) {
		super.setText(text);
		if (getImageDescriptor() == null)
			button.setText(text);
		else
			button.setText("");
	}

	@Override
	public void setToolTipText(String toolTipText) {
		super.setToolTipText(toolTipText);
		button.setToolTipText(toolTipText);
	}
}
