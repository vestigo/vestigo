package org.nightlabs.vestigo.cumulus4j.ui.internal;

/**
 * Dummy that forces the maven-bundle-plugin to additionally import neccessary
 * packages, that are only referenced in non-java files like the plugin.xml.
 *
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public class PackageImporterDummy {

	org.eclipse.datatools.connectivity.oda.profile.OdaConnectionFactory odaConnectionFactory;
	org.eclipse.datatools.connectivity.oda.design.ui.wizards.NewDataSourceWizard newDataSourceWizard;

}
