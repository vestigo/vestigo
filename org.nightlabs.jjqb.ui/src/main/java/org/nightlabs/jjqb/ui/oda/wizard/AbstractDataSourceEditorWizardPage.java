package org.nightlabs.jjqb.ui.oda.wizard;

import org.nightlabs.jjqb.ui.oda.property.AbstractDataSourceEditorPage;
import org.nightlabs.jjqb.ui.wizard.WizardHop;

public abstract class AbstractDataSourceEditorWizardPage
extends GenericDataSourceEditorWizardPage
{
	public AbstractDataSourceEditorWizardPage(String pageName, Class<? extends AbstractDataSourceEditorPage> ... dataSourceEditorPageClasses) {
		this(pageName, instantiate(dataSourceEditorPageClasses));
	}

	private static AbstractDataSourceEditorPage[] instantiate(Class<? extends AbstractDataSourceEditorPage>[] dataSourceEditorPageClasses)
	{
		AbstractDataSourceEditorPage[] result = new AbstractDataSourceEditorPage[dataSourceEditorPageClasses.length];
		for (int i = 0; i < result.length; i++) {
			try {
				result[i] = dataSourceEditorPageClasses[i].newInstance();
			} catch (InstantiationException e) {
				throw new RuntimeException(e);
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}

		return result;
	}

	public AbstractDataSourceEditorWizardPage(String pageName, AbstractDataSourceEditorPage ... dataSourceEditorPages) {
		super(pageName, dataSourceEditorPages[0]);
		setWizardHop(new WizardHop(this));
		for (int i = 1; i < dataSourceEditorPages.length; i++) {
			AbstractDataSourceEditorPage dsePage = dataSourceEditorPages[i];
			GenericDataSourceEditorWizardPage wizardPage = new GenericDataSourceEditorWizardPage(
					pageName + '.' + i, dsePage
			);
			getWizardHop().addHopPage(wizardPage);
		}
	}
}
