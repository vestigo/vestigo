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

import java.util.Map;
import java.util.Properties;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * Composite to edit JDOConnection attributes like the
 * connectionType and the custom properties for the connection.
 *
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public class EditJDOConnectionAdapterComposite extends Composite
{
	private Properties currProperties;
	private EditPropertiesComposite editPropertiesComposite;

	/**
	 * @param parent
	 * @param style
	 */
	public EditJDOConnectionAdapterComposite(Composite parent, int style) {
		super(parent, style);
		this.setLayout(new GridLayout());

		editPropertiesComposite = new EditPropertiesComposite(this, SWT.NONE);
		updatePropertiesEditor();
	}

	private void updatePropertiesEditor() {
		editPropertiesComposite.setInput(currProperties);
		this.layout(true, true);
	}

	/**
	 * Init the editor with the given connectionType and custom properties.
	 *
	 * @param connectionProperties The properties for the selected connectionType.
	 */
	public void init(Map<?, ?> connectionProperties) {
		this.currProperties = propsFromMap(connectionProperties);
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
		currProperties = props;
		updatePropertiesEditor();
	}

	/**
	 * Get the current custom connection properties set.
	 * @return The current custom connection properties
	 */
	public Properties getConnectionPrivateProps() {
		return propsFromMap(editPropertiesComposite.getProperties());
	}
}
