package org.nightlabs.jjqb.childvm.shared.classloader;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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

	private List<URL> persistenceEngineClasspathURLList;

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

		if (tempDir != null) {
			IOUtil.deleteDirectoryRecursively(tempDir);
			tempDir = null;
		}
	}

	public List<URL> getPersistenceEngineClasspathURLList() throws IOException
	{
		assertOpen();

		if (this.persistenceEngineClasspathURLList == null) {
			Properties connProperties = getConnectionProperties();
			List<String> persistenceEngineClasspathStringList = PropertiesUtil.getList(connProperties, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);
			List<URL> persistenceEngineClasspathURLList = new ArrayList<URL>(persistenceEngineClasspathStringList.size());
			for (String persistenceEngineClasspathElement : persistenceEngineClasspathStringList) {
				logger.debug("open: adding persistenceEngineClasspathElement: " + persistenceEngineClasspathElement);

				File f = new File(persistenceEngineClasspathElement);
				if (!f.exists())
					throw new IOException("persistenceEngineClasspathElement points to a non-existing file: " + f.getAbsolutePath());

				if (!f.canRead())
					throw new IOException("persistenceEngineClasspathElement points to an existing but non-readable file: " + f.getAbsolutePath());

				populatePersistenceEngineClasspathURLList(persistenceEngineClasspathURLList, f);
			}

			if (logger.isTraceEnabled()) {
				logger.trace("getPersistenceEngineClasspathURLList: Collected classpath entries:");
				for (URL url : persistenceEngineClasspathURLList) {
					logger.trace("getPersistenceEngineClasspathURLList:   * {}", url);
				}
			}

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

	private void populatePersistenceEngineClasspathURLList(List<URL> persistenceEngineClasspathURLList, File file)
	throws IOException
	{
		String fn = file.getName();
		String fnLower = fn.toLowerCase();
		if (fnLower.endsWith(".ear") || fnLower.endsWith(".war") || fnLower.endsWith(".zip")) {
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
		}
		else {
			persistenceEngineClasspathURLList.add(file.toURI().toURL());
		}
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
		else
			persistenceEngineClasspathURLList.add(file.toURI().toURL());
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

	@Override
	protected void finalize() throws Throwable {
		close();
		super.finalize();
	}
}
