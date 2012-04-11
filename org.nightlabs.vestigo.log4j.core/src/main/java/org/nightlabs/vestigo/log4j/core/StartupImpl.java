package org.nightlabs.vestigo.log4j.core;

import org.nightlabs.vestigo.core.Startup;

public class StartupImpl implements Startup {

	@Override
	public void startup() {
		Log4jConfigurator.sharedInstance().configure();
	}

}
