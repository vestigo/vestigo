
package org.nightlabs.jjqb.xtext.jpql;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JPQLStandaloneSetup extends JPQLStandaloneSetupGenerated{

	public static void doSetup() {
		new JPQLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

