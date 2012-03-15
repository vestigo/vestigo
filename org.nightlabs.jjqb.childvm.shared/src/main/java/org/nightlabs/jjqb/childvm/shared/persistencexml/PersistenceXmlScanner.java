package org.nightlabs.jjqb.childvm.shared.persistencexml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.nightlabs.jjqb.childvm.shared.classloader.ClassLoaderManager;
import org.nightlabs.jjqb.childvm.shared.persistencexml.jaxb.Persistence;
import org.nightlabs.progress.NullProgressMonitor;
import org.nightlabs.progress.OperationCanceledException;
import org.nightlabs.progress.ProgressMonitor;
import org.nightlabs.progress.SubProgressMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersistenceXmlScanner {

	public static final String META_INF = "META-INF";
	public static final String PERSISTENCE_XML = "persistence.xml";

	private static final Logger logger = LoggerFactory.getLogger(PersistenceXmlScanner.class);

	private ClassLoaderManager classLoaderManager;

	public PersistenceXmlScanner() {
		classLoaderManager = new ClassLoaderManager();
	}

	public boolean isOpen() {
		return classLoaderManager.isOpen();
	}

	public final void open(Properties connProperties) {
		classLoaderManager.open(connProperties);
	}

	public final void close() {
		classLoaderManager.close();
	}

	public Collection<PersistenceXml> searchPersistenceXmls(ProgressMonitor monitor) throws IOException, JAXBException
	{
		if (monitor == null)
			monitor = new NullProgressMonitor();

		String taskName = "Search persistence.xml files";
		monitor.beginTask(taskName, 100);
		try {
			JAXBContext context = JAXBContext.newInstance(Persistence.class);
			monitor.worked(5);

			List<PersistenceXml> persistenceXmls = new ArrayList<PersistenceXml>();
			List<URL> urlList = classLoaderManager.getPersistenceEngineClasspathURLList(new SubProgressMonitor(monitor, 65));

			SubProgressMonitor subMonitor = new SubProgressMonitor(monitor, 30);
			subMonitor.beginTask(taskName, urlList.size() * 10);
			for (URL url : urlList) {
				if (monitor.isCanceled())
					throw new OperationCanceledException();

				try {
					populatePersistenceXmls(context, persistenceXmls, url, new SubProgressMonitor(subMonitor, 10));
				} catch (Exception e) {
					logger.warn("searchPersistenceXmls: url='" + url + "': " + e, e);
				}
			}
			subMonitor.done();
			return persistenceXmls;
		} finally {
			monitor.done();
		}
	}

	private void populatePersistenceXmls(JAXBContext context, List<PersistenceXml> persistenceXmls, URL url, ProgressMonitor monitor) throws IOException, URISyntaxException, JAXBException
	{
		monitor.beginTask("Search persistence.xml files", 100);
		try {
			if (!"file".equals(url.getProtocol())) {
				logger.warn("populatePersistenceXmls: Ignoring unsupported URL (unknown protocol): {}", url);
				return;
			}

			File file = new File(url.toURI());

			if (!file.exists()) {
				logger.warn("populatePersistenceXmls: File or directory does not exist: {}", file.getAbsolutePath());
				return;
			}

			if (file.isDirectory()) {
				File persistenceXmlFile = new File(new File(file, META_INF), PERSISTENCE_XML);
				if (persistenceXmlFile.exists())
					persistenceXmls.add(loadPersistenceXml(context, url, persistenceXmlFile));
				else
					logger.debug("populatePersistenceXmls: {} not found at location: {}", PERSISTENCE_XML, persistenceXmlFile.getAbsolutePath());
			}

			String fnLower = file.getName().toLowerCase();
			if (!(fnLower.endsWith(".ear") || fnLower.endsWith(".war") || fnLower.endsWith(".jar"))) {
				logger.debug("populatePersistenceXmls: Ignoring non-archive file: {}", file.getAbsolutePath());
				return;
			}

			ZipFile zipFile = new ZipFile(file);
			try {
				ZipEntry zipEntry = zipFile.getEntry(META_INF + '/' + PERSISTENCE_XML);
				if (zipEntry == null) {
					logger.debug("populatePersistenceXmls: {} not found in zip file: {}", META_INF + '/' + PERSISTENCE_XML, file.getAbsolutePath());
					return;
				}

				InputStream in = zipFile.getInputStream(zipEntry);
				persistenceXmls.add(loadPersistenceXml(context, url, in));
				in.close();
			} finally {
				zipFile.close();
			}
		} finally {
			monitor.worked(100);
			monitor.done();
		}
	}

	private PersistenceXml loadPersistenceXml(JAXBContext context, URL classpathURL, File persistenceXmlFile) throws JAXBException
	{
		Object o = context.createUnmarshaller().unmarshal(persistenceXmlFile);
		if (!(o instanceof Persistence))
			throw new IllegalStateException("File '" + persistenceXmlFile.getAbsolutePath() + "' contains an object of type " + o.getClass().getName() + " instead of " + Persistence.class.getName() + "!");

		return new PersistenceXml(classpathURL, (Persistence)o);
	}

	private PersistenceXml loadPersistenceXml(JAXBContext context, URL classpathURL, InputStream persistenceXmlIn) throws JAXBException
	{
		Object o = context.createUnmarshaller().unmarshal(persistenceXmlIn);
		if (!(o instanceof Persistence))
			throw new IllegalStateException(PERSISTENCE_XML + " of URL '" + classpathURL + "' contains an object of type " + o.getClass().getName() + " instead of " + Persistence.class.getName() + "!");

		return new PersistenceXml(classpathURL, (Persistence)o);
	}
}
