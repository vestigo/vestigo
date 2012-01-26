package org.nightlabs.jjqb.ui.oda;

import java.util.Properties;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 */
public abstract class AbstractDriverPropertiesCompositeWizardPage extends AbstractDriverWizardPage
{
	private AbstractDriverPropertiesComposite propertiesComposite;
	private Properties props;

	public AbstractDriverPropertiesCompositeWizardPage(String pageName) {
		super(pageName);
	}

	@Override
	public void createPageCustomControl(Composite parent) {
		setShowAutoConnect(true);
		setShowAutoConnectOnFinish(true);
		setShowPing(true);
		propertiesComposite = createDriverPropertiesComposite(parent);
		Point shellSize = parent.getShell().getSize();
		Point newShellSize = shellSize;

		final int minWidth = 800;
		final int minHeight = 800;

		if (shellSize.x < minWidth)
			newShellSize = new Point(minWidth, newShellSize.y);

		if (shellSize.y < minHeight)
			newShellSize = new Point(newShellSize.x, minHeight);

		if (shellSize != newShellSize)
			parent.getShell().setSize(newShellSize);
	}

	protected abstract AbstractDriverPropertiesComposite createDriverPropertiesComposite(Composite parent);

	@Override
	protected void setEntryPageInitialProperties(Properties properties) {
		propertiesComposite.setConnectionPrivateProps(properties);
	}
	
	@Override
	protected Properties collectEntryPageProperties() {
		return propertiesComposite.getConnectionPrivateProps();
	}
	
}
