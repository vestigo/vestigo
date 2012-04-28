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
package org.nightlabs.vestigo.log4j.core;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.framework.BundleContext;
import org.osgi.service.prefs.Preferences;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class VestigoLog4jCorePlugin
extends Plugin
//implements BundleActivator
{
	private static final Logger logger = LoggerFactory.getLogger(VestigoLog4jCorePlugin.class);

	public static final String BUNDLE_SYMBOLIC_NAME = "org.nightlabs.vestigo.log4j.core"; //$NON-NLS-1$

//	private BundleContext bundleContext;

	// The shared instance
	private static VestigoLog4jCorePlugin plugin;

//	public Bundle getBundle() {
//		BundleContext bundleContext = this.bundleContext;
//		return bundleContext == null ? null : bundleContext.getBundle();
//	}

	@Override
	public void start(BundleContext context) throws Exception
	{
		logger.info("start: Starting context.bundle.symbolicName={}", context.getBundle().getSymbolicName());

		if (!BUNDLE_SYMBOLIC_NAME.equals(context.getBundle().getSymbolicName()))
			throw new IllegalStateException("BUNDLE_SYMBOLIC_NAME != context.bundle.symbolicName :: " + BUNDLE_SYMBOLIC_NAME + " != " + context.getBundle().getSymbolicName());

		super.start(context);
		plugin = this;
//		this.bundleContext = context;

		logger.info("start: Started context.bundle.symbolicName={}", context.getBundle().getSymbolicName());
	}

	private Preferences preferences;

	public synchronized Preferences getPreferences()
	{
		Preferences preferences = this.preferences;
		if (preferences == null) {
			IPreferencesService preferencesService = Platform.getPreferencesService();
			IEclipsePreferences preferencesRootNode = preferencesService.getRootNode();
			preferences = preferencesRootNode.node(InstanceScope.SCOPE).node(BUNDLE_SYMBOLIC_NAME);
			this.preferences = preferences;
		}
		return preferences;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		logger.info("stop: context.bundle.symbolicName={}", context.getBundle().getSymbolicName());
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static VestigoLog4jCorePlugin getDefault() {
		return plugin;
	}
}
