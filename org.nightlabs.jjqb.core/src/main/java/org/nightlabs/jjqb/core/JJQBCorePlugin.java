package org.nightlabs.jjqb.core;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.nightlabs.licence.manager.LicenceManager;
import org.nightlabs.licence.manager.LicenceManagerOfflineImpl;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Version;
import org.osgi.service.prefs.Preferences;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JJQBCorePlugin
implements BundleActivator
{
	private static final Logger logger = LoggerFactory.getLogger(JJQBCorePlugin.class);

	public static final String BUNDLE_SYMBOLIC_NAME = "org.nightlabs.jjqb.core"; //$NON-NLS-1$

	private LicenceManager licenceManager;

	// The shared instance
	private static JJQBCorePlugin plugin;

	@Override
	public void start(BundleContext context) throws Exception
	{
		logger.info("start: Starting context.bundle.symbolicName={}", context.getBundle().getSymbolicName());

		if (!BUNDLE_SYMBOLIC_NAME.equals(context.getBundle().getSymbolicName()))
			throw new IllegalStateException("BUNDLE_SYMBOLIC_NAME != context.bundle.symbolicName :: " + BUNDLE_SYMBOLIC_NAME + " != " + context.getBundle().getSymbolicName());

//		super.start(context);
		plugin = this;

		// This activator is triggered when classes are loaded and we therefore
		// start the jersey bundles here, because they are not automatically started.
		List<Bundle> jerseyCoreBundles = new LinkedList<Bundle>();
		List<Bundle> jerseyClientBundles = new LinkedList<Bundle>();
		List<Bundle> jerseyOtherBundles = new LinkedList<Bundle>();
		for (Bundle bundle : context.getBundles()) {
			if (bundle.getSymbolicName().startsWith("com.sun.jersey")) { //$NON-NLS-1$
				if ("com.sun.jersey.jersey-core".equals(bundle.getSymbolicName())) //$NON-NLS-1$
					jerseyCoreBundles.add(bundle);
				else if ("com.sun.jersey.jersey-client".equals(bundle.getSymbolicName())) //$NON-NLS-1$
					jerseyClientBundles.add(bundle);
				else
					jerseyOtherBundles.add(bundle);
			}
		}

		if (jerseyCoreBundles.isEmpty())
			throw new IllegalStateException("No Jersey core bundle found!"); //$NON-NLS-1$

		if (jerseyClientBundles.isEmpty())
			throw new IllegalStateException("No Jersey client bundle found!"); //$NON-NLS-1$

		// There is a very strange bug: If we do not pass the parameter "-clean" to eclipse, the 2nd
		// (and every following) start of eclipse causes the Jersey bundle to be activated already very
		// early (while the splash is still visible) and I get a NullPointerException in MediaType.valueOf(...) later,
		// just as if I had not started the bundle. I can only solve this problem by stopping jersey now and
		// starting it again (or by passing "-clean" to eclipse). Marco :-)

		// BEGIN STOP all jersey bundles
		for (Bundle bundle : jerseyOtherBundles) {
			bundle.stop();
		}
		for (Bundle bundle : jerseyClientBundles) {
			bundle.stop();
		}
		for (Bundle bundle : jerseyCoreBundles) {
			bundle.stop();
		}
		// END STOP all jersey bundles

		// BEGIN START all jersey bundles
		for (Bundle bundle : jerseyCoreBundles) {
			bundle.start();
		}
		for (Bundle bundle : jerseyClientBundles) {
			bundle.start();
		}
		for (Bundle bundle : jerseyOtherBundles) {
			bundle.start();
		}
		// END START all jersey bundles

//		licenceManager = new LicenceManagerOnlineImpl(Long.toString(87920));
		Version version = context.getBundle().getVersion();
		licenceManager = new LicenceManagerOfflineImpl("org.nightlabs.jjqb", version);

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
	public static JJQBCorePlugin getDefault() {
		return plugin;
	}

	public LicenceManager getLicenceManager() {
		return licenceManager;
	}
}
