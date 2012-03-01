package org.nightlabs.jjqb.childvm.shared.classloader;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;
import org.nightlabs.util.IOUtil;
import org.nightlabs.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ClassLoaderManager
{
	private static final Logger logger = LoggerFactory.getLogger(ClassLoaderManager.class);

	public static final String PROPERTY_USER_HOME = "user.home";
	public static final String PROPERTY_MAVEN_LOCAL_REPOSITORY = "maven.localRepository";
	public static final String PROPERTY_SYSTEM_TEMP_DIR = "java.io.tmpdir";

	private List<URL> persistenceEngineClasspathURLList;
	private List<URL> persistenceEngineOverlayClasspathURLList = new ArrayList<URL>();
	private List<URL> persistenceEngineOverlayClasspathURLList_readOnly = Collections.unmodifiableList(persistenceEngineOverlayClasspathURLList);

	private File tempDir;
//	private ConnectionProfile connectionProfile;
	private Properties connectionProperties;

	public ClassLoaderManager() {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				File td = tempDir;
				if (td != null)
					IOUtil.deleteDirectoryRecursively(td);
			}
		});
	}

	public static File getMavenLocalRepository()
	{
		return new File(new File(IOUtil.getUserHome(), ".m2"), "repository");
	}

//	public void setConnectionProfile(ConnectionProfile connectionProfile)
//	{
//		if (connectionProfile == null)
//			throw new IllegalArgumentException("connectionProfile == null");
//
//		if (this.connectionProfile == connectionProfile)
//			return;
//
//		if (this.connectionProfile != null)
//			throw new IllegalStateException("this.connectionProfile already assigned! Cannot change!");
//
//		this.connectionProfile =  connectionProfile;
//	}
//
//	public ConnectionProfile getConnectionProfile() {
//		return connectionProfile;
//	}

	public boolean isOpen(){
		return connectionProperties != null;
	}

	protected void assertOpen() {
		if (!isOpen())
			throw new IllegalStateException("ClassLoaderManager is not open!");
	}

	public Properties getConnectionProperties() {
		return connectionProperties;
	}

	public synchronized final void open(Properties connProperties)
	{
//		if (connectionProfile == null)
//			throw new IllegalStateException("this.connectionProfile == null !!! Call setConnectionProfile(...) first!");

		if (connProperties == null)
			throw new IllegalArgumentException("connProperties == null");

		this.connectionProperties = connProperties;

		try {
			File userTempDir = IOUtil.getUserTempDir("jjqb." + ClassLoaderManager.class.getSimpleName() + '.', null);
			tempDir = IOUtil.createUniqueIncrementalFolder(userTempDir, "instance-");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public synchronized final void close()
	{
		persistenceEngineClassLoader = null;
		persistenceEngineClasspathURLList = null;
		connectionProperties = null;
		persistenceEngineClasspathVariables = null;

		if (tempDir != null) {
			IOUtil.deleteDirectoryRecursively(tempDir);
			tempDir = null;
		}
	}

	private Map<String, String> persistenceEngineClasspathVariables = null;

	private Map<String, String> getPersistenceEngineClasspathVariables()
	{
		assertOpen();

		Map<String, String> result = this.persistenceEngineClasspathVariables;
		if (result == null) {
			@SuppressWarnings({ "rawtypes", "unchecked" })
			Map<String, String> m = new HashMap<String, String>((Map)System.getProperties());
			m.put(PROPERTY_MAVEN_LOCAL_REPOSITORY, getMavenLocalRepository().getAbsolutePath());
			result = m;
			this.persistenceEngineClasspathVariables = result;
		}
		return result;
	}

	public List<URL> getPersistenceEngineClasspathURLList() throws IOException
	{
		assertOpen();

		if (this.persistenceEngineClasspathURLList == null) {
			Properties connProperties = getConnectionProperties();
			List<String> persistenceEngineClasspathStringList = PropertiesUtil.getList(connProperties, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);
			List<URL> persistenceEngineClasspathURLList = new ArrayList<URL>(
					persistenceEngineOverlayClasspathURLList.size() + persistenceEngineClasspathStringList.size()
			);

			for (String persistenceEngineClasspathElement : persistenceEngineClasspathStringList) {
				logger.debug("open: adding persistenceEngineClasspathElement: {}", persistenceEngineClasspathElement);
				persistenceEngineClasspathElement = IOUtil.replaceTemplateVariables(
						persistenceEngineClasspathElement, getPersistenceEngineClasspathVariables()
				);
				logger.trace("open: resolved persistenceEngineClasspathElement: {}", persistenceEngineClasspathElement);

				if (persistenceEngineClasspathElement.startsWith("http:"))
					persistenceEngineClasspathURLList.add(new URL(persistenceEngineClasspathElement));
				else if (persistenceEngineClasspathElement.startsWith("https:"))
					persistenceEngineClasspathURLList.add(new URL(persistenceEngineClasspathElement));
				else {
					if (persistenceEngineClasspathElement.startsWith("file:"))
						persistenceEngineClasspathElement = persistenceEngineClasspathElement.substring("file:".length());

					File f = new File(persistenceEngineClasspathElement);
					if (!f.exists())
						throw new IOException("persistenceEngineClasspathElement points to a non-existing file: " + f.getAbsolutePath());

					if (!f.canRead())
						throw new IOException("persistenceEngineClasspathElement points to an existing but non-readable file: " + f.getAbsolutePath());

					populatePersistenceEngineClasspathURLList(persistenceEngineClasspathURLList, f);
				}
			}

			if (logger.isTraceEnabled()) {
				logger.trace("getPersistenceEngineClasspathURLList: Collected classpath entries:");
				for (URL url : persistenceEngineClasspathURLList) {
					logger.trace("getPersistenceEngineClasspathURLList:   * {}", url);
				}
			}

			persistenceEngineClasspathURLList.addAll(0, persistenceEngineOverlayClasspathURLList);
			this.persistenceEngineClasspathURLList = persistenceEngineClasspathURLList;
		}

		return this.persistenceEngineClasspathURLList;
	}

	private ClassLoader persistenceEngineClassLoader;

	private static Comparator<URL> urlComparator = new Comparator<URL>() {
		@Override
		public int compare(URL o1, URL o2) {
			return o1.toExternalForm().compareTo(o2.toExternalForm());
		}
	};

	private boolean isContainerArchive(File file)
	{
		String fn = file.getName();
		String fnLower = fn.toLowerCase();
		return (
				fnLower.endsWith(".ear") ||
				fnLower.endsWith(".rar") ||
				fnLower.endsWith(".sar") ||
				fnLower.endsWith(".war") ||
				fnLower.endsWith(".zip")
		);
	}

	private boolean isNonContainerArchive(File file)
	{
		String fn = file.getName();
		String fnLower = fn.toLowerCase();
		return fnLower.endsWith(".jar");
	}

	private void populatePersistenceEngineClasspathURLList(List<URL> persistenceEngineClasspathURLList, File file)
	throws IOException
	{
		populatePersistenceEngineClasspathURLList(persistenceEngineClasspathURLList, file, true);
	}

	private void populatePersistenceEngineClasspathURLList(List<URL> persistenceEngineClasspathURLList, File file, boolean includeAll)
	throws IOException
	{
		String fn = file.getName();
		if (isContainerArchive(file)) {
			byte[] hash;
			try {
				hash = Util.hash(IOUtil.simplifyPath(file).getBytes(IOUtil.CHARSET_UTF_8), Util.HASH_ALGORITHM_SHA);
			} catch (NoSuchAlgorithmException e) {
				throw new RuntimeException(e);
			}
			String hashStr = Util.encodeHexStr(hash);
			File earDir = new File(tempDir, hashStr + '.' + fn);
			earDir.mkdir();
			IOUtil.unzipArchiveIfModified(file, earDir);

			List<URL> earURLList = new ArrayList<URL>();
			populatePersistenceEngineClasspathURLListRecurseDirs(earURLList, earDir);
			Collections.sort(earURLList, urlComparator);

			persistenceEngineClasspathURLList.addAll(earURLList);
			persistenceEngineClasspathURLList.add(file.toURI().toURL());
		}
		else if (includeAll || isNonContainerArchive(file))
			persistenceEngineClasspathURLList.add(file.toURI().toURL());
	}

	private void populatePersistenceEngineClasspathURLListRecurseDirs(List<URL> persistenceEngineClasspathURLList, File file)
	throws IOException
	{
		if (file.isDirectory()) {
			if (file.getName().endsWith(".war")) {
				File webInfClasses = new File(new File(file, "WEB-INF"), "classes");
				persistenceEngineClasspathURLList.add(webInfClasses.toURI().toURL());
			}

			File[] children = file.listFiles();
			if (children != null) {
				for (File child : children)
					populatePersistenceEngineClasspathURLListRecurseDirs(persistenceEngineClasspathURLList, child);
			}
		}
		else {
			populatePersistenceEngineClasspathURLList(persistenceEngineClasspathURLList, file, false);
		}
	}

// We need a separate class loader for JDBC. Due to that, we decided for this parent-VM-child-VM-architecture.
// see: http://www.szegedi.org/articles/memleak2.html
// "Never, ever, load a JDBC driver through a class loader that is meant to be eventually thrown away.
// Move the JDBC driver classes into a location where a permanent class loader (system or application
// class loader) will pick it up."
//
// For optimization reasons, we should later introduce a separate class-loader for the data model, so that
// we don't need to restart the whole jetty server VM when the data model changes.
	public ClassLoader getPersistenceEngineClassLoader() throws IOException
	{
		assertOpen();

		if (this.persistenceEngineClassLoader == null) {
			List<URL> persistenceEngineClasspathURLList = getPersistenceEngineClasspathURLList();

			PersistenceEngineClassLoader persistenceEngineClassLoader = new PersistenceEngineClassLoader(
					persistenceEngineClasspathURLList.toArray(new URL[persistenceEngineClasspathURLList.size()]),
					this.getClass().getClassLoader()
			);

			this.persistenceEngineClassLoader = persistenceEngineClassLoader;
		}
		return this.persistenceEngineClassLoader;
	}

	public List<URL> getPersistenceEngineOverlayClasspathURLList() {
		if (isOpen())
			return persistenceEngineOverlayClasspathURLList_readOnly;
		else
			return persistenceEngineOverlayClasspathURLList;
	}

	@Override
	protected void finalize() throws Throwable {
		close();
		super.finalize();
	}
}
