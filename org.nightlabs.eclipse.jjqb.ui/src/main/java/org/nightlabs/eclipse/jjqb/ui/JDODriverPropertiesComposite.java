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

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.eclipse.jjqb.core.util.PropertiesUtil;

/**
 * Composite to edit JDOConnection attributes like the
 * connectionType and the custom properties for the connection.
 *
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public class JDODriverPropertiesComposite extends Composite
{
	private EditClasspathComposite editClasspathComposite;

	private Properties connectionProperties;
	private EditPropertiesComposite editPropertiesComposite;

	public JDODriverPropertiesComposite(Composite parent, int style) {
		super(parent, style);
		this.setLayout(new GridLayout());

		editClasspathComposite = new EditClasspathComposite(this, SWT.NONE);

		editPropertiesComposite = new EditPropertiesComposite(this, SWT.NONE);
		updatePropertiesEditor();
	}

	private void updatePropertiesEditor() {
		if (connectionProperties != null) {
//			Properties metaProperties = PropertiesUtil.getProperties(connectionProperties, PropertiesUtil.PREFIX_META);
			Properties persistenceProperties = PropertiesUtil.getProperties(connectionProperties, PropertiesUtil.PREFIX_PERSISTENCE);
			editPropertiesComposite.setInput(persistenceProperties);

			List<String> persistenceEngineClasspath = PropertiesUtil.getList(connectionProperties, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);
			editClasspathComposite.setInput(persistenceEngineClasspath);
		}
		this.layout(true, true);
	}

	/**
	 * Init the editor with the given connectionType and custom properties.
	 *
	 * @param connectionProperties The properties for the selected connectionType.
	 */
	public void init(Map<?, ?> connectionProperties) {
		this.connectionProperties = propsFromMap(connectionProperties);
		updatePropertiesEditor();
	}

	private static Properties propsFromMap(Map<?, ?> map)
	{
		Properties properties = new Properties();
		for (Map.Entry<?, ?> me : map.entrySet()) {
			if (me.getKey() != null)
				properties.setProperty(me.getKey().toString(), me.getValue() == null ? "" : me.getValue().toString());
		}
		return properties;
	}

	/**
	 * Set the current connection properties and updates
	 * the current UI associated to the current connectionType
	 * with these values.
	 *
	 * @param props The new properties to set.
	 */
	public void setConnectionPrivateProps(Properties props) {
		connectionProperties = props;
		updatePropertiesEditor();
	}

	/**
	 * Get the current custom connection properties set.
	 * @return The current custom connection properties
	 */
	public Properties getConnectionPrivateProps() {
		Properties persistenceProperties = propsFromMap(editPropertiesComposite.getProperties());
		Properties result = new Properties();
		PropertiesUtil.putAll(persistenceProperties, result, PropertiesUtil.PREFIX_PERSISTENCE);
		PropertiesUtil.putList(editClasspathComposite.getClasspathElements(), result, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);
		return result;
	}
}
