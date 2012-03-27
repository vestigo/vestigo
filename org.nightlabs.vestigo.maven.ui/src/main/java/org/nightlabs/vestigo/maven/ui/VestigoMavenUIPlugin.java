package org.nightlabs.vestigo.maven.ui;

import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;
import org.osgi.framework.BundleContext;

public class VestigoMavenUIPlugin extends AbstractVestigoUIPlugin
{
	public static final String BUNDLE_SYMBOLIC_NAME = "org.nightlabs.vestigo.maven.ui";

	// The shared instance
	private static VestigoMavenUIPlugin plugin;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Get the shared instance.
	 * @return the shared instance.
	 */
	public static VestigoMavenUIPlugin getDefault() {
		return plugin;
	}
}
