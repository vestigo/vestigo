package org.nightlabs.jjqb.childvm.shared.classloader;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.nightlabs.jjqb.childvm.shared.PropertiesUtil;
import org.nightlabs.progress.NullProgressMonitor;
import org.nightlabs.progress.OperationCanceledException;
import org.nightlabs.progress.ProgressMonitor;
import org.nightlabs.progress.SubProgressMonitor;
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

	public List<URL> getPersistenceEngineClasspathURLList(ProgressMonitor monitor) throws IOException
	{
		assertOpen();

		if (monitor == null)
			monitor = new NullProgressMonitor();

		final String taskName = "Resolve persistence engine classpath";
		monitor.beginTask(taskName, 100);
		try {
			if (this.persistenceEngineClasspathURLList == null) {
				Properties connProperties = getConnectionProperties();
				List<String> persistenceEngineClasspathStringList = PropertiesUtil.getList(connProperties, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);
				List<URL> persistenceEngineClasspathURLList = new ArrayList<URL>(
						persistenceEngineOverlayClasspathURLList.size() + persistenceEngineClasspathStringList.size()
				);

				monitor.worked(5);

				SubProgressMonitor subMonitor = new SubProgressMonitor(monitor, 93);
				subMonitor.beginTask(taskName, persistenceEngineClasspathStringList.size() * 10);
				try {
					for (String persistenceEngineClasspathElement : persistenceEngineClasspathStringList) {
						if (subMonitor.isCanceled())
							throw new OperationCanceledException();

						String origPersistenceEngineClasspathElement = persistenceEngineClasspathElement;
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

							boolean recurseDirs = false;
							boolean filesOfDir = false;
							if (persistenceEngineClasspathElement.contains("*")) {
								if (persistenceEngineClasspathElement.endsWith("/**")) {
									recurseDirs = true;
									persistenceEngineClasspathElement = persistenceEngineClasspathElement.substring(0, persistenceEngineClasspathElement.length() - 2);
								}
								else if(persistenceEngineClasspathElement.endsWith("/**/*")) {
									recurseDirs = true;
									persistenceEngineClasspathElement = persistenceEngineClasspathElement.substring(0, persistenceEngineClasspathElement.length() - 4);
								}
								else if (persistenceEngineClasspathElement.endsWith("/*")) {
									filesOfDir = true;
									persistenceEngineClasspathElement = persistenceEngineClasspathElement.substring(0, persistenceEngineClasspathElement.length() - 1);
								}

								if (persistenceEngineClasspathElement.contains("*"))
									throw new UnsupportedOperationException("Unsupported use of wildcard '*'! Only '/*' or '/**/*' at the end are allowed! Affected classpath-element makes use of '*' at another location or more than once: " + origPersistenceEngineClasspathElement);
							}

							File f = new File(URLDecoder.decode(persistenceEngineClasspathElement, IOUtil.CHARSET_NAME_UTF_8));
							if (!f.exists())
								throw new IOException("persistenceEngineClasspathElement points to a non-existing file: " + f.getAbsolutePath());

							if (!f.canRead())
								throw new IOException("persistenceEngineClasspathElement points to an existing but non-readable file: " + f.getAbsolutePath());

							if (recurseDirs) {
								if (!f.isDirectory())
									throw new UnsupportedOperationException("persistenceEngineClasspathElement points to a file instead of a directory, which is not allowed when using the wildcard '*': " + f.getAbsolutePath());

								populatePersistenceEngineClasspathURLListRecurseDirs(persistenceEngineClasspathURLList, f, new SubProgressMonitor(subMonitor, 10));
							}
							else if (filesOfDir) {
								if (!f.isDirectory())
									throw new UnsupportedOperationException("persistenceEngineClasspathElement points to a file instead of a directory, which is not allowed when using the wildcard '*': " + f.getAbsolutePath());

								File[] children = f.listFiles();

								monitor.worked(1);

								if (children != null && children.length > 0) {
									SubProgressMonitor subSubMonitor = new SubProgressMonitor(subMonitor, 9);
									subSubMonitor.beginTask(taskName, children.length * 10);

									for (File child : children)
										populatePersistenceEngineClasspathURLList(persistenceEngineClasspathURLList, child, new SubProgressMonitor(subSubMonitor, 10));

									subSubMonitor.done();
								}
							}
							else
								populatePersistenceEngineClasspathURLList(persistenceEngineClasspathURLList, f, new SubProgressMonitor(subMonitor, 10));
						}
					}
				} finally {
					subMonitor.done();
				}

				if (logger.isTraceEnabled()) {
					logger.trace("getPersistenceEngineClasspathURLList: Collected classpath entries:");
					for (URL url : persistenceEngineClasspathURLList) {
						logger.trace("getPersistenceEngineClasspathURLList:   * {}", url);
					}
				}

				persistenceEngineClasspathURLList.addAll(0, persistenceEngineOverlayClasspathURLList);
				this.persistenceEngineClasspathURLList = persistenceEngineClasspathURLList;

				monitor.worked(2);
			}

			return this.persistenceEngineClasspathURLList;
		} finally {
			monitor.done();
		}
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

	private void populatePersistenceEngineClasspathURLList(List<URL> persistenceEngineClasspathURLList, File file, ProgressMonitor monitor)
	throws IOException
	{
		populatePersistenceEngineClasspathURLList(persistenceEngineClasspathURLList, file, true, monitor);
	}

	private void populatePersistenceEngineClasspathURLList(List<URL> persistenceEngineClasspathURLList, File file, boolean includeAll, ProgressMonitor monitor)
	throws IOException
	{
		final String taskName = "Resolve persistence engine classpath";
		monitor.beginTask(taskName, 100);
		try {
			if (monitor.isCanceled())
				throw new OperationCanceledException();

			String fn = file.getName();
			if (isContainerArchive(file)) {
				byte[] hash;
				try {
					hash = Util.hash(IOUtil.simplifyPath(file).getBytes(IOUtil.CHARSET_UTF_8), Util.HASH_ALGORITHM_SHA);
				} catch (NoSuchAlgorithmException e) {
					throw new RuntimeException(e);
				}
				String hashStr = Util.encodeHexStr(hash);

				monitor.worked(5);

				File earDir = new File(tempDir, hashStr + '.' + fn);
				earDir.mkdir();
				IOUtil.unzipArchiveIfModified(file, earDir);

				monitor.worked(35);

				List<URL> earURLList = new ArrayList<URL>();
				populatePersistenceEngineClasspathURLListRecurseDirs(earURLList, earDir, new SubProgressMonitor(monitor, 60));
				Collections.sort(earURLList, urlComparator);

				persistenceEngineClasspathURLList.addAll(earURLList);
				persistenceEngineClasspathURLList.add(file.toURI().toURL());
			}
			else if (includeAll || isNonContainerArchive(file))
				persistenceEngineClasspathURLList.add(file.toURI().toURL());
		} finally {
			monitor.done();
		}
	}

	private void populatePersistenceEngineClasspathURLListRecurseDirs(List<URL> persistenceEngineClasspathURLList, File file, ProgressMonitor monitor)
	throws IOException
	{
		final String taskName = "Resolve persistence engine classpath";
		monitor.beginTask(taskName, 100);
		try {
			if (monitor.isCanceled())
				throw new OperationCanceledException();

			if (file.isDirectory()) {
				if (file.getName().endsWith(".war")) {
					File webInfClasses = new File(new File(file, "WEB-INF"), "classes");
					persistenceEngineClasspathURLList.add(webInfClasses.toURI().toURL());
				}

				File[] children = file.listFiles();

				monitor.worked(10);

				if (children != null) {
					SubProgressMonitor subMonitor = new SubProgressMonitor(monitor, 90);
					subMonitor.beginTask(taskName, children.length * 10);
					for (File child : children)
						populatePersistenceEngineClasspathURLListRecurseDirs(persistenceEngineClasspathURLList, child, new SubProgressMonitor(subMonitor, 10));
				}
			}
			else {
				populatePersistenceEngineClasspathURLList(persistenceEngineClasspathURLList, file, false, new SubProgressMonitor(monitor, 100));
			}
		} finally {
			monitor.done();
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
	public ClassLoader getPersistenceEngineClassLoader(ProgressMonitor monitor) throws IOException
	{
		assertOpen();

		if (monitor == null)
			monitor = new NullProgressMonitor();

		monitor.beginTask("Get persistence engine class loader", 100);
		try {
			if (this.persistenceEngineClassLoader == null) {
				List<URL> persistenceEngineClasspathURLList = getPersistenceEngineClasspathURLList(new SubProgressMonitor(monitor, 98));

				PersistenceEngineClassLoader persistenceEngineClassLoader = new PersistenceEngineClassLoader(
						persistenceEngineClasspathURLList.toArray(new URL[persistenceEngineClasspathURLList.size()]),
						this.getClass().getClassLoader()
				);

				this.persistenceEngineClassLoader = persistenceEngineClassLoader;
				monitor.worked(2);
			}
		} finally {
			monitor.done();
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
