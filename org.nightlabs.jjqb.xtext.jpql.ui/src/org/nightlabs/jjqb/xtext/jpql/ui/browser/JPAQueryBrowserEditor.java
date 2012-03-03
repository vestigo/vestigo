package org.nightlabs.jjqb.xtext.jpql.ui.browser;

import org.nightlabs.jjqb.ui.browser.AbstractQueryBrowserEditor;
import org.nightlabs.jjqb.ui.browser.JPAQueryBrowser;
import org.nightlabs.jjqb.ui.browser.JPAQueryBrowserManager;
import org.nightlabs.jjqb.ui.browser.QueryBrowserManager;

import com.google.inject.Injector;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPAQueryBrowserEditor
extends AbstractQueryBrowserEditor
implements JPAQueryBrowser
{
	@Override
	protected QueryBrowserManager createQueryBrowserManager() {
		return new JPAQueryBrowserManager(this);
	}

	@Override
	protected Injector getInjector() {
		return org.nightlabs.jjqb.xtext.jpql.ui.internal.JPQLActivator.getInstance().getInjector("org.nightlabs.jjqb.xtext.jpql.JPQL");
	}
}
