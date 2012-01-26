package org.nightlabs.jjqb.ui.oda;

import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.eclipse.datatools.connectivity.oda.design.DataSourceDesign;
import org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSourceWizardPage;
import org.eclipse.datatools.connectivity.oda.design.util.DesignUtil;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.jjqb.ui.oda.IPropertyHopPage.PropertyHopPage;
import org.nightlabs.jjqb.ui.wizard.IWizardHop;
import org.nightlabs.jjqb.ui.wizard.WizardHop;
import org.nightlabs.jjqb.ui.wizard.WizardHopPage;
import org.nightlabs.jjqb.ui.wizard.WizardHopPageSupport;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class AbstractDriverWizardPage 
	extends DataSourceWizardPage
	implements IPropertyHopEntryPage, IPropertyEditor
{

	private static class PropertyHopWizardPage extends WizardHopPage {

		PropertyHopPage propertyHopPage;

		public PropertyHopWizardPage(PropertyHopPage propertyHopPage) {
			super(propertyHopPage.getClass().getName(), propertyHopPage.getName());
			this.propertyHopPage = propertyHopPage;
		}

		@Override
		public void createControl(Composite parent) {
			propertyHopPage.createControl(parent);
			setControl(propertyHopPage.getControl());
		}
		
		@Override
		public boolean isPageComplete() {
			return propertyHopPage.isPageComplete();
		}

	}

	private WizardHopPageSupport wizardHopPageSupport;

	private List<IPropertyEditor> propertyEditors = new LinkedList<IPropertyEditor>();

	public AbstractDriverWizardPage(String pageName) {
		super(pageName);
		wizardHopPageSupport = new WizardHopPageSupport(this, new WizardHop(this));
		addPropertyEditor(new IPropertyEditor() {
			@Override
			public void setInitialProperties(Properties properties) {
				setEntryPageInitialProperties(properties);
			}

			@Override
			public Properties collectCustomProperties(Properties oldProperties) {
				return collectEntryPageProperties();
			}
		});
	}

	private void addPropertyEditor(IPropertyEditor propertyEditor) {
		propertyEditors.add(propertyEditor);
	}

	@Override
	public Properties collectCustomProperties(Properties oldProperties) {
		Properties props = new Properties();
		for (IPropertyEditor propertyEditor : propertyEditors) {
			Properties editorProps = propertyEditor.collectCustomProperties(oldProperties);
			if (editorProps != null)
				props.putAll(editorProps);
		}
		return props;
	}

	@Override
	public Properties collectCustomProperties() {
		return collectCustomProperties(null);
	}

	protected abstract Properties collectEntryPageProperties();
	protected abstract void setEntryPageInitialProperties(Properties properties);

	protected abstract AbstractDriverPropertiesComposite createDriverPropertiesComposite(Composite parent);

	@Override
	public void setInitialProperties(Properties props)
	{
		for (IPropertyEditor propertyEditor : propertyEditors) {
			propertyEditor.setInitialProperties(props);
		}
	}

	@Override
	protected DataSourceDesign collectDataSourceDesign(DataSourceDesign design) {
		Properties props = collectCustomProperties();
		design.setPrivateProperties(
				DesignUtil.convertToDesignProperties(
						props
				)
		);
		return design;
	}

	@Override
	public IWizardPage getNextPage() {
		return wizardHopPageSupport.getNextPage();
	}

	@Override
	public final void setWizardHop(IWizardHop wizardHop) {
		// We don't do anything here, we've set the wizardHop already in the constructor
	}

	@Override
	public IWizardHop getWizardHop() {
		return wizardHopPageSupport.getWizardHop();
	}

	public void addPropertyHopPage(PropertyHopPage propertyHopPage) {
		getWizardHop().addHopPage(new PropertyHopWizardPage(propertyHopPage));
		addPropertyEditor(propertyHopPage);
		propertyHopPage.setGlobalPropertyEditor(this);
	}
}
