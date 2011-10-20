/* *****************************************************************************
 *  NightLabs BIRT extensions for JDO                                          *
 *  Copyright (c) 2006 NightLabs, Germany                                      *
 *                                                                             *
 *  All rights reserved. This program and the accompanying materials           *
 *  are made available under the terms of the Eclipse Public License v1.0      *
 *  which accompanies this distribution, and is available at                   *
 *  http://www.eclipse.org/legal/epl-v10.html                                  *
 *                                                                             *
 *  Contributors:                                                              *
 *   Alexander Bieber, NightLabs - initial API and implementation              *
 ******************************************************************************/

package org.nightlabs.eclipse.jjqb.ui;

import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.design.DataSourceDesign;
import org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSourceEditorPage;
import org.eclipse.datatools.connectivity.oda.design.util.DesignUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class JDODriverPropertyPage extends DataSourceEditorPage {

	private JDODriverPropertiesComposite propertiesComposite;

	public JDODriverPropertyPage() { }

	@Override
	public Properties collectCustomProperties(Properties oldProperties) {
//		Properties props = new Properties();
		Properties props = propertiesComposite.getConnectionPrivateProps();
//		String connectionType = propertiesComposite.getSelectedConnectionType();
//		if (connectionType != null)
//			props.setProperty(IJDOConnectionAdapter.PROPERTY_NAME_JDO_CONNECTION_TYPE, connectionType);
		return props;
	}

	@Override
	protected void createAndInitCustomControl(Composite parent, Properties properties) {
		propertiesComposite = new JDODriverPropertiesComposite(parent, SWT.NONE);
//		Properties privateProps = JDOQLDriverUtil.prepareForPrivatePropEdit(properties);
//		propertiesComposite.setConnectionPrivateProps(privateProps);
		propertiesComposite.setConnectionPrivateProps(properties);
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
