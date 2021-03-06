/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.ui.oda.property;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;
import org.nightlabs.vestigo.ui.oda.classpath.EditClasspathComposite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ClasspathPage extends AbstractDataSourceEditorPage
{
	private static final Logger logger = LoggerFactory.getLogger(ClasspathPage.class);

	private EditClasspathComposite editClasspathComposite;

	{
		setTitle("Classpath");
	}

	@Override
	public Properties collectCustomProperties(Properties properties) {
		logger.info("collectManagedProperties: entered.");

		Properties oldProps = removePropertiesManagedByThisPage(properties); // Clean first. Otherwise deleted entries never disappear from the properties.
		Properties newProps = new Properties();

		PropertiesUtil.putList(editClasspathComposite.getClasspathElements(), newProps, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);
		properties.putAll(newProps);

		// TODO Report bug and put URL to report here!!! When bug is fixed, remove this workaround!
		// BEGIN WORKAROUND
		// There is a bug in org.eclipse.datatools.connectivity.ui.wizards.ProfilePropertyPage#performOk()
		// which causes it not to recognize changes when only a property was removed. It only iterates all new
		// properties in order to find out, if their value changed. Thus a missing entry in the new properties doesn't
		// cause the 'changed' flag to be set to true. As long as this bug exists, we store the current timestamp
		// to force the changed data to be written. Marco :-)
		if (!oldProps.equals(newProps))
			properties.setProperty(PropertiesUtil.WORKAROUND_TIMESTAMP, Long.toString(System.currentTimeMillis(), 36));
		// END WORKAROUND

		return properties;
	}

	private Properties removePropertiesManagedByThisPage(Properties properties)
	{
		Properties removed = new Properties();

		for (Iterator<? extends Map.Entry<?, ?>> it = properties.entrySet().iterator(); it.hasNext() ;) {
			Map.Entry<?, ?> me = it.next();
			String key = (String) me.getKey();
			if (key.startsWith(PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH)) {
				removed.setProperty(key, (String) me.getValue());
				it.remove();
			}
		}

		return removed;
	}

	@Override
	protected void createCustomControl(final Composite p)
	{
		logger.info("createAndInitCustomControl: entered.");

		final Composite parent = new Composite(p, SWT.NONE);
		GridLayout gridLayout = new GridLayout();
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		parent.setLayout(gridLayout);

//		final Label classpathDescriptionLabel = new Label(parent, SWT.WRAP);
//		classpathDescriptionLabel.setText(getClasspathDescription());
//		classpathDescriptionLabel.setLayoutData(createDescriptionLabelGridData(parent));

//		addHorizontalSeparator(parent);

		editClasspathComposite = new EditClasspathComposite(parent, SWT.NONE);

		editClasspathComposite.addPropertyChangeListener(new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				markDirty();
			}
		});

//		parent.addControlListener(new ControlAdapter() {
//			@Override
//			public void controlResized(ControlEvent e) {
//				classpathDescriptionLabel.setLayoutData(createDescriptionLabelGridData(parent));
//			}
//		});
	}

	@Override
	public void setCustomProperties(Properties properties) {
		List<String> persistenceEngineClasspath = PropertiesUtil.getList(properties, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);
		editClasspathComposite.setInput(persistenceEngineClasspath);
	}

//	protected abstract String getClasspathDescription();
}
