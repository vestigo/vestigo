package org.nightlabs.jjqb.ui.oda;

import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.design.DataSourceDesign;
import org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSourceWizardPage;
import org.eclipse.datatools.connectivity.oda.design.util.DesignUtil;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractDriverWizardPage extends DataSourceWizardPage
{
	private AbstractDriverPropertiesComposite propertiesComposite;
	private Properties props;

	public AbstractDriverWizardPage(String pageName) {
		super(pageName);
	}

	@Override
	public Properties collectCustomProperties() {
		Properties props = propertiesComposite.getConnectionPrivateProps();
		return props;
	}

	@Override
	public void createPageCustomControl(Composite parent) {
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
	public void setInitialProperties(Properties props)
	{
		this.props = props;

		if (propertiesComposite != null && !propertiesComposite.isDisposed()) {
			propertiesComposite.init(this.props);
		}
	}

	@Override
	protected DataSourceDesign collectDataSourceDesign(DataSourceDesign design) {
		Properties props = propertiesComposite.getConnectionPrivateProps();
		design.setPrivateProperties(
				DesignUtil.convertToDesignProperties(
						props
				)
		);
		return design;
	}
}
