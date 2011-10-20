package org.nightlabs.eclipse.jjqb.ui;

import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSourceWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class JDODriverWizardPage extends DataSourceWizardPage
{

	private JDODriverPropertiesComposite adapterComposite;
	private Properties props;

	public JDODriverWizardPage(String pageName) {
		super(pageName);
	}

	@Override
	public Properties collectCustomProperties() {
//		Properties props = new Properties();
		Properties props = adapterComposite.getConnectionPrivateProps();
//		String connectionType = adapterComposite.getSelectedConnectionType();
//		if (connectionType != null)
//			props.setProperty(IJDOConnectionAdapter.PROPERTY_NAME_JDO_CONNECTION_TYPE, connectionType);
		return props;
	}

	@Override
	public void createPageCustomControl(Composite parent) {
		adapterComposite = new JDODriverPropertiesComposite(parent, SWT.NONE);
	}

	@Override
	public void setInitialProperties(Properties props)
	{
		this.props = props;

		if (adapterComposite != null && !adapterComposite.isDisposed()) {
			adapterComposite.init(this.props);
		}
	}

//	@Override
//	protected DataSourceDesign collectDataSourceDesign(DataSourceDesign design) {
//		Properties props = adapterComposite.getConnectionPrivateProps();
//		design.setPrivateProperties(
//				DesignUtil.convertToDesignProperties(
//						props
//				)
//		);
//		return design;
//	}

}
