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

import org.nightlabs.vestigo.ui.oda.property.AbstractDataSourceEditorPage;
import org.nightlabs.vestigo.ui.wizard.WizardHop;

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
