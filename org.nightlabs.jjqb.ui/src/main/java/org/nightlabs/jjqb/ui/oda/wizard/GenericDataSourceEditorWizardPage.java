package org.nightlabs.jjqb.ui.oda.wizard;

import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSourceWizardPage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.jjqb.ui.oda.property.AbstractDataSourceEditorPage;
import org.nightlabs.jjqb.ui.oda.property.IDataSourceEditorPageContainer;
import org.nightlabs.jjqb.ui.wizard.IWizardHop;
import org.nightlabs.jjqb.ui.wizard.IWizardHopPage;
import org.nightlabs.jjqb.ui.wizard.WizardHopPageSupport;

public class GenericDataSourceEditorWizardPage
extends DataSourceWizardPage
implements IWizardHopPage, IDataSourceEditorPageContainer
{
	private WizardHopPageSupport wizardHopPageSupport = new WizardHopPageSupport(this);
	private AbstractDataSourceEditorPage dataSourceEditorPage;

	public GenericDataSourceEditorWizardPage(String pageName, AbstractDataSourceEditorPage dataSourceEditorPage) {
		super(pageName, dataSourceEditorPage.getTitle(), dataSourceEditorPage.getImageDescriptor());
		this.dataSourceEditorPage = dataSourceEditorPage;
		dataSourceEditorPage.setDataSourceEditorPageContainer(this);
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
	public void updateButtons() {
		getContainer().updateButtons();
	}

	@Override
	public void updateMessage() {
		getContainer().updateMessage();
	}

	@Override
	public void updateTitle() {
		getContainer().updateTitleBar();
		getContainer().updateWindowTitle();
	}

	@Override
	public void testConnection() {
		super.testConnection();
	}
}
