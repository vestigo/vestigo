package org.nightlabs.vestigo.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.nightlabs.licence.manager.LicenceManager;
import org.nightlabs.licence.manager.LicenceManagerOfflineImpl;
import org.nightlabs.util.IOUtil;
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
public class VestigoCorePlugin
implements BundleActivator
{
	private static final Logger logger = LoggerFactory.getLogger(VestigoCorePlugin.class);

	public static final String BUNDLE_SYMBOLIC_NAME = "org.nightlabs.vestigo.core"; //$NON-NLS-1$

	private BundleContext bundleContext;
	private LicenceManager licenceManager;

	// The shared instance
	private static VestigoCorePlugin plugin;

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
		licenceManager = new LicenceManagerOfflineImpl("org.nightlabs.vestigo", version);

		logger.info("start: Started context.bundle.symbolicName={}", context.getBundle().getSymbolicName());

		for (Startup startup : getStartups()) {
			logger.debug("start: Triggering startup {}", startup.getClass().getName());
			startup.startup();
		}
	}

	protected static List<Startup> getStartups()
	{
		List<Startup> result = new ArrayList<Startup>();

		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		if (registry == null)
			throw new IllegalStateException("Platform.getExtensionRegistry() returned null!");

		final String extensionPointId = "org.nightlabs.vestigo.core.startup";
		final IExtensionPoint extensionPoint = registry.getExtensionPoint(extensionPointId);
		if (extensionPoint == null)
			throw new IllegalStateException("Unable to resolve extension-point: " + extensionPointId); //$NON-NLS-1$

		final IExtension[] extensions = extensionPoint.getExtensions();
		for (final IExtension extension : extensions) {
			final IConfigurationElement[] elements = extension.getConfigurationElements();
			for (final IConfigurationElement element : elements) {
				Object executableExtension;
				try {
					executableExtension = element.createExecutableExtension("class");
				} catch (CoreException e) {
					throw new RuntimeException("Could not create executable extension for class \"" + element.getAttribute("class") + "\" declared by extension to point \"" + extensionPointId + "\" in plugin \"" + extension.getContributor().getName() + "\": " + e, e);
				}

				if (!(executableExtension instanceof Startup))
					throw new IllegalStateException("Class \"" + element.getAttribute("class") + "\" declared by extension to point \"" + extensionPointId + "\" in plugin \"" + extension.getContributor().getName() + "\" does not implement \"" + Startup.class.getName() + "\"!");

				result.add((Startup) executableExtension);
			}
		}

		return result;
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
	public static VestigoCorePlugin getDefault() {
		return plugin;
	}

	public LicenceManager getLicenceManager() {
		return licenceManager;
	}

	/**
	 * Get the version from the OSGi bundle and convert it into the Maven-format.
	 * The resulting version is usable in a URL on <code>http://vestigo.nightlabs.com</code>.
	 * @return the mavenized version of the Vestigo-core-OSGi-bundle.
	 * @see #getVersionSpecificURL(String)
	 */
	public String getMavenizedVersion()
	{
		Version version = getBundle().getVersion();
		Version versionWithoutQualifier = new Version(version.getMajor(), version.getMinor(), version.getMicro());

		// Maven appends the "SNAPSHOT" with a '-' while OSGi appends the qualifier with a '.' => transform, if necessary.
		String versionForURL;
		if ("SNAPSHOT".equals(version.getQualifier())) //$NON-NLS-1$
			versionForURL = versionWithoutQualifier.toString() + '-' + version.getQualifier();
		else
			versionForURL = versionWithoutQualifier.toString();

		return versionForURL;
	}

	private static final String[] SUPPORTED_LANGUAGES = {
		Locale.ENGLISH.getLanguage(),
		Locale.GERMAN.getLanguage()
	};
	private static final Set<String> SUPPORTED_LANGUAGE_SET = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(SUPPORTED_LANGUAGES)));

	private volatile Map<String, String> versionSpecificURLVariables = null;

	/**
	 * Get a URL for the currently used version of Vestigo.
	 * Callers usually pass a URL like <code>http://vestigo.nightlabs.com/${version}/download/index.html</code>
	 * and get a URL matching the currently used Vestigo version.
	 * Besides <code>${version}</code>, the variable <code>${versionAndLanguage}</code> is supported.
	 * @param urlWithVariables the raw URL using the variable <code>${version}</code> or <code>${versionAndLanguage}</code>; e.g.:
	 * <code>http://vestigo.nightlabs.com/${version}/download/index.html</code>
	 * @return the versioned URL matching the current Vestigo version; e.g.:
	 * <code>http://vestigo.nightlabs.com/1.3.2-SNAPSHOT/download/index.html</code>
	 * @see #getMavenizedVersion()
	 */
	public String getVersionSpecificURL(String urlWithVariables)
	{
		Map<String, String> variables = this.versionSpecificURLVariables;
		if (variables == null) {
			variables = new HashMap<String, String>(2);
			String mavenizedVersion = getMavenizedVersion();
			Locale locale = Locale.getDefault();
			String language = locale.getLanguage();

			// We support only some languages => check what's supported and form URL accordingly.
			String languageURLPart;
			if (Locale.ENGLISH.getLanguage().equals(language))
				languageURLPart = ""; //$NON-NLS-1$ // English is the default language and doesn't have an infix in the URL!
			else if (SUPPORTED_LANGUAGE_SET.contains(language))
				languageURLPart = '/' + language;
			else
				languageURLPart = ""; //$NON-NLS-1$ // Everything we don't support is mapped to the default language.

			variables.put("version", mavenizedVersion);
			variables.put("versionAndLanguage", mavenizedVersion + languageURLPart);
			variables = Collections.unmodifiableMap(variables);
			this.versionSpecificURLVariables = variables;
		}

		String result = IOUtil.replaceTemplateVariables(urlWithVariables, variables);
		return result;
	}
}
