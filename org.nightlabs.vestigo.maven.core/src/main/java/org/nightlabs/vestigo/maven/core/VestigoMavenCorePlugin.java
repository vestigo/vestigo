package org.nightlabs.vestigo.maven.core;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.prefs.Preferences;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class VestigoMavenCorePlugin
implements BundleActivator
{
	private static final Logger logger = LoggerFactory.getLogger(VestigoMavenCorePlugin.class);

	public static final String BUNDLE_SYMBOLIC_NAME = "org.nightlabs.vestigo.maven.core"; //$NON-NLS-1$

	private BundleContext bundleContext;

	// The shared instance
	private static VestigoMavenCorePlugin plugin;

	public Bundle getBundle() {
		BundleContext bundleContext = this.bundleContext;
		return bundleContext == null ? null : bundleContext.getBundle();
	}

	@Override
	public void start(BundleContext context) throws Exception
	{
		logger.info("start: Starting context.bundle.symbolicName={}", context.getBundle().getSymbolicName());

		if (!BUNDLE_SYMBOLIC_NAME.equals(context.getBundle().getSymbolicName()))
			throw new IllegalStateException("BUNDLE_SYMBOLIC_NAME != context.bundle.symbolicName :: " + BUNDLE_SYMBOLIC_NAME + " != " + context.getBundle().getSymbolicName());

//		super.start(context);
		plugin = this;
		this.bundleContext = context;

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
//		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static VestigoMavenCorePlugin getDefault() {
		return plugin;
	}
}
