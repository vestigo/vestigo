package org.nightlabs.vestigo.jdt.ui;

import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class VestigoJDTUIPlugin extends AbstractVestigoUIPlugin
{
	public static final String BUNDLE_SYMBOLIC_NAME = "org.nightlabs.vestigo.jdt.ui";

	// The shared instance
	private static VestigoJDTUIPlugin plugin;

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
	public static VestigoJDTUIPlugin getDefault() {
		return plugin;
	}
}
