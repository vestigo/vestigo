
package org.nightlabs.jjqb.xtext.jdoql;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JDOQLStandaloneSetup extends JDOQLStandaloneSetupGenerated{

	public static void doSetup() {
		new JDOQLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

