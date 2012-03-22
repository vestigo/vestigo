package org.nightlabs.vestigo.ui.oda.classpath;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IActionDelegate;

public interface EditClasspathActionDelegate extends IActionDelegate
{
	EditClasspathComposite getEditClasspathComposite();
	void setEditClasspathComposite(EditClasspathComposite editClasspathComposite);

	String getId();
	String getGroup();
	ImageDescriptor getIcon();
	String getLabel();
	int getOrderHint();
	String getTooltip();
}
