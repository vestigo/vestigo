///**
// *
// */
//package org.nightlabs.jjqb.ui.oda;
//
//import org.eclipse.datatools.connectivity.oda.OdaException;
//import org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSourceWizardPage;
//import org.eclipse.datatools.connectivity.oda.design.ui.wizards.NewDataSourceWizard;
//import org.nightlabs.jjqb.ui.oda.IPropertyHopPage.PropertyHopPage;
//
///**
// * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
// *
// */
//public abstract class AbstractPropertyHopWizardNewWizard extends NewDataSourceWizard {
//
//	private IPropertyHopEntryPage propertyHopEntryPage;
//
//	public AbstractPropertyHopWizardNewWizard() {
//	}
//
//	public AbstractPropertyHopWizardNewWizard(String odaDataSourceId) throws OdaException {
//		super(odaDataSourceId);
//	}
//
//
//	@Override
//	public void addCustomPages() {
//		super.addCustomPages();
//		addHopPages();
//	}
//
//	protected abstract void addHopPages();
//
//	@Override
//	protected DataSourceWizardPage createWizardPage(String wizardPageClassName, String pageTitle) {
//		DataSourceWizardPage wizardPage = super.createWizardPage(wizardPageClassName, pageTitle);
//		if (!(wizardPage instanceof IPropertyHopEntryPage)) {
//			throw new IllegalStateException(getClass().getName() + " works only with implementations of " + IPropertyHopEntryPage.class.getName() + " as configured wizardPage.");
//		}
//		propertyHopEntryPage = (IPropertyHopEntryPage) wizardPage;
//		return wizardPage;
//	}
//
//	public void addPropertyHopPage(PropertyHopPage wizardPage) {
//		propertyHopEntryPage.addPropertyHopPage(wizardPage);
//	}
//
//}
