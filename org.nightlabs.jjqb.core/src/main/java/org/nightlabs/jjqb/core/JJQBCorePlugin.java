package org.nightlabs.jjqb.core;

import java.util.LinkedList;
import java.util.List;

import org.nightlabs.jjqb.core.licence.LicenceManager;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JJQBCorePlugin
implements BundleActivator
{
	public static final String BUNDLE_SYMBOLIC_NAME = "org.nightlabs.jjqb.core";

	private LicenceManager licenceManager;

	// The shared instance
	private static JJQBCorePlugin plugin;

	@Override
	public void start(BundleContext context) throws Exception
	{
//		super.start(context);
		plugin = this;

		// This activator is triggered when classes are loaded and we therefore
		// start the jersey bundles here, because they are not automatically started.
		List<Bundle> jerseyCoreBundles = new LinkedList<Bundle>();
		List<Bundle> jerseyClientBundles = new LinkedList<Bundle>();
		List<Bundle> jerseyOtherBundles = new LinkedList<Bundle>();
		for (Bundle bundle : context.getBundles()) {
			if (bundle.getSymbolicName().startsWith("com.sun.jersey")) {
				if ("com.sun.jersey.jersey-core".equals(bundle.getSymbolicName()))
					jerseyCoreBundles.add(bundle);
				else if ("com.sun.jersey.jersey-client".equals(bundle.getSymbolicName()))
					jerseyClientBundles.add(bundle);
				else
					jerseyOtherBundles.add(bundle);
			}
		}

		if (jerseyCoreBundles.isEmpty())
			throw new IllegalStateException("No Jersey core bundle found!");

		if (jerseyClientBundles.isEmpty())
			throw new IllegalStateException("No Jersey client bundle found!");

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

		licenceManager = new LicenceManager();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
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
