package org.nightlabs.jjqb.xtext.jdoql.ui.browser;

import org.nightlabs.jjqb.ui.browser.AbstractQueryBrowserEditor;
import org.nightlabs.jjqb.ui.browser.JDOQueryBrowser;
import org.nightlabs.jjqb.ui.browser.JDOQueryBrowserManager;
import org.nightlabs.jjqb.ui.browser.QueryBrowserManager;

import com.google.inject.Injector;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOQueryBrowserEditor
extends AbstractQueryBrowserEditor
implements JDOQueryBrowser
{
	@Override
	protected QueryBrowserManager createQueryBrowserManager() {
		return new JDOQueryBrowserManager(this);
	}

	@Override
	protected Injector getInjector() {
		return org.nightlabs.jjqb.xtext.jdoql.ui.internal.JDOQLActivator.getInstance().getInjector("org.nightlabs.jjqb.xtext.jdoql.JDOQL");
	}
}
