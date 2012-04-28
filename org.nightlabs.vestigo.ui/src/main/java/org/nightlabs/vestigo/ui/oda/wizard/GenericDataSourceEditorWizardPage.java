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
package org.nightlabs.vestigo.ui.oda.wizard;

import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSourceWizardPage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.vestigo.ui.oda.property.AbstractDataSourceEditorPage;
import org.nightlabs.vestigo.ui.oda.property.IDataSourceEditorPageContainer;
import org.nightlabs.vestigo.ui.wizard.IWizardHop;
import org.nightlabs.vestigo.ui.wizard.IWizardHopPage;
import org.nightlabs.vestigo.ui.wizard.WizardHopPageSupport;
import org.nightlabs.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenericDataSourceEditorWizardPage
extends DataSourceWizardPage
implements IWizardHopPage, IDataSourceEditorPageContainer
{
	private static final Logger logger = LoggerFactory.getLogger(GenericDataSourceEditorWizardPage.class);

	private WizardHopPageSupport wizardHopPageSupport = new WizardHopPageSupport(this);
	private AbstractDataSourceEditorPage dataSourceEditorPage;

	public GenericDataSourceEditorWizardPage(String pageName, AbstractDataSourceEditorPage dataSourceEditorPage) {
		super(pageName, dataSourceEditorPage.getTitle(), dataSourceEditorPage.getImageDescriptor());
		this.dataSourceEditorPage = dataSourceEditorPage;
		dataSourceEditorPage.setDataSourceEditorPageContainer(this);

		logger.info("<init>: this.name={} title={}", this.getName(), super.getTitle());

		setDescription(dataSourceEditorPage.getDescription());
		setMessage(dataSourceEditorPage.getMessage(), dataSourceEditorPage.getMessageType());
		setErrorMessage(dataSourceEditorPage.getErrorMessage());
	}

	@Override
	public Properties collectCustomProperties() {
		return dataSourceEditorPage.collectProperties();
	}

	@Override
	public void createPageCustomControl(Composite parent) {
//		setShowAutoConnect(true);
//		setShowAutoConnectOnFinish(true);
		setShowPing(false);
		dataSourceEditorPage.createControl(parent);
		Point shellSize = parent.getShell().getSize();
		Point newShellSize = shellSize;

		Point dsEditorPageSize = dataSourceEditorPage.computeSize();

		if (shellSize.x < dsEditorPageSize.x)
			newShellSize = new Point(dsEditorPageSize.x, newShellSize.y);

		if (shellSize.y < dsEditorPageSize.y)
			newShellSize = new Point(newShellSize.x, dsEditorPageSize.y);

		if (shellSize != newShellSize)
			parent.getShell().setSize(newShellSize);
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);

		// The ODA framework sets the title, but we want to override it. Hence, we set the title here again.
		if (!Util.equals(this.getTitle(), dataSourceEditorPage.getTitle())) {
			setTitle(dataSourceEditorPage.getTitle());
			updateTitle();
		}
	}

//	@Override
//	protected DataSourceDesign collectDataSourceDesign(DataSourceDesign design) {
//		Properties props = collectCustomProperties();
//		design.setPrivateProperties(
//				DesignUtil.convertToDesignProperties(
//						props
//				)
//		);
//		return design;
//	}

	@Override
	public void setInitialProperties(Properties properties) {
		dataSourceEditorPage.setInitialProperties(properties);
	}

	@Override
	public void setWizardHop(IWizardHop wizardHop) {
		wizardHopPageSupport.setWizardHop(wizardHop);
	}

	@Override
	public IWizardHop getWizardHop() {
		return wizardHopPageSupport.getWizardHop();
	}

	@Override
	public IWizardPage getNextPage() {
		return wizardHopPageSupport.getNextPage();
	}

	@Override
	public void setWizard(IWizard newWizard) {
		super.setWizard(newWizard);
		wizardHopPageSupport.setWizard(newWizard);
	}

	@Override
	public IPreferenceStore getPreferenceStore() {
		return new PreferenceStore(); // TODO do I need to get some real preferences here?! Marco ;-)
	}

	@Override
	public void setDescription(String description) {
		String part1 = description;
		String part2 = null;

		int lineBreakIdx = description.indexOf('\n');
		if (lineBreakIdx >= 0) {
			part1 = description.substring(0, lineBreakIdx).trim();
			part2 = description.substring(lineBreakIdx + 1).trim();
		}

		super.setDescription(part1);
		dataSourceEditorPage.setDescription(part2);
	}

	@Override
	public void updateButtons() {
		getContainer().updateButtons();
	}

	@Override
	public void updateMessage() {
		getContainer().updateMessage();
	}

	@Override
	public void setTitle(String title) {
		logger.info("setTitle: this.name={} title={}", this.getName(), title);
		super.setTitle(title);
	}

	@Override
	public String getTitle() {
		String title = super.getTitle();
		logger.info("getTitle: this.name={} title={}", this.getName(), title);
		return title;
	}

	@Override
	public void updateTitle() {
		logger.info("updateTitle: this.name={} title={}", this.getName(), super.getTitle());
		getContainer().updateTitleBar();
		getContainer().updateWindowTitle();
	}

	@Override
	public void testConnection() {
		super.testConnection();
	}
}
