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
