package org.nightlabs.vestigo.maven.core.connectionpropertiesfilter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.nightlabs.util.IOUtil;
import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;
import org.nightlabs.vestigo.core.connectionpropertiesfilter.AbstractConnectionPropertiesFilter;
import org.nightlabs.vestigo.maven.core.MavenRunner;
import org.nightlabs.vestigo.maven.core.MavenURI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResolveMavenClasspathConnectionPropertiesFilter extends AbstractConnectionPropertiesFilter
{
	private static final Logger logger = LoggerFactory.getLogger(ResolveMavenClasspathConnectionPropertiesFilter.class);

	protected Set<String> urlStringSet;
	protected List<File> filesToDelete = new LinkedList<File>();

	protected String template_pom;
	protected String template_pom_dependency;

	private Thread shutdownHook = new Thread() {
		@Override
		public void run() {
			try {
				for (File file : filesToDelete)
					IOUtil.deleteDirectoryRecursively(file);
			} catch (Exception x) {
				logger.warn("shutdownHook: " + x, x);
			}
		}
	};

	@Override
	public void filter(Properties connectionProperties) {
		List<String> persistenceEngineClasspathStringList = PropertiesUtil.getList(connectionProperties, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);
		Map<String, List<String>> replaceClasspathEntries = new HashMap<String, List<String>>();

		Runtime.getRuntime().addShutdownHook(shutdownHook);

		boolean successful = false;
		try {
			urlStringSet = new HashSet<String>(); // used to ignore duplicates in the resolved classpath (shared by all input-classpath-elements).

			for (String peClasspathEntry : persistenceEngineClasspathStringList) {
				if (!peClasspathEntry.startsWith(MavenURI.SCHEME_PREFIX))
					continue;

				if (replaceClasspathEntries.containsKey(peClasspathEntry))
					continue; // ignore duplicates in the declared classpath

				List<String> newClasspathEntries = new LinkedList<String>();
				replaceClasspathEntries.put(peClasspathEntry, newClasspathEntries);
				try {
					MavenURI mavenURI = new MavenURI(new URI(peClasspathEntry));

					List<URL> urlList = resolveClasspathURLs(mavenURI);

					for (URL url : urlList) {
						newClasspathEntries.add(url.toString());
					}
				} catch (URISyntaxException x) {
					throw new RuntimeException(x);
				}
			}

			if (replaceClasspathEntries.isEmpty())
				return;

			Set<String> alreadyAddedNewClasspathEntries = new HashSet<String>();
			for (Map.Entry<String, List<String>> me : replaceClasspathEntries.entrySet()) {
				String oldClasspathEntry = me.getKey();
				List<String> newClasspathEntries = me.getValue();
				int index = persistenceEngineClasspathStringList.indexOf(oldClasspathEntry);
				if (index < 0)
					throw new IllegalStateException("persistenceEngineClasspathStringList.indexOf(oldClasspathEntry) < 0 :: oldClasspathEntry = " + oldClasspathEntry);

				newClasspathEntries.removeAll(alreadyAddedNewClasspathEntries);

				persistenceEngineClasspathStringList.remove(index);
				persistenceEngineClasspathStringList.addAll(index, newClasspathEntries);

				alreadyAddedNewClasspathEntries.addAll(newClasspathEntries);

				// Remove duplicates, if there are.
				while (persistenceEngineClasspathStringList.remove(oldClasspathEntry));
			}

			for (Iterator<?> it = connectionProperties.keySet().iterator(); it.hasNext(); ) {
				String key = it.next().toString();
				if (key.startsWith(PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH))
					it.remove();
			}

			PropertiesUtil.putList(persistenceEngineClasspathStringList, connectionProperties, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);

			successful = true;
		} finally {
			if (successful) {
				for (File file : filesToDelete)
					IOUtil.deleteDirectoryRecursively(file);

				filesToDelete.clear();
				Runtime.getRuntime().removeShutdownHook(shutdownHook);
			}
		}
	}

	protected void registerFileOrDirectoryToDelete(File fileOrDirectory)
	{
		filesToDelete.add(fileOrDirectory);
	}

	protected List<URL> resolveClasspathURLs(MavenURI mavenURI)
	{
		try {
			File projectDirectory = createDownloaderMavenProject(mavenURI);

			MavenRunner mavenRunner = new MavenRunner(projectDirectory);
			if (mavenRunner.run() != 0)
				throw new IllegalStateException("Running maven failed with code=" + mavenRunner.getMavenResult());

			File mavenLocalRepository = new File(new File(IOUtil.getUserHome(), ".m2"), "repository");
			if (!mavenLocalRepository.isDirectory())
				throw new IllegalStateException("Local maven-repository does not exist or is not an accessible directory or is at unknown location! Expected: " + mavenLocalRepository.getAbsolutePath());

			String groupPath = mavenURI.getGroupId().replace('.', File.separatorChar);
			File mainDependencyDir = new File(new File(new File(mavenLocalRepository, groupPath), mavenURI.getArtifactId()), mavenURI.getVersion());
			if (!mainDependencyDir.isDirectory())
				throw new IllegalStateException("Directory does not exist or is not accessible: " + mainDependencyDir.getAbsolutePath());

			String fileName = mavenURI.getArtifactId() + '-' + mavenURI.getVersion();
			if (mavenURI.getClassifier() != null)
				fileName += '-' + mavenURI.getClassifier();

			if (mavenURI.getType() == null)
				fileName += '.' + MavenURI.DEFAULT_TYPE;
			else
				fileName += '.' + mavenURI.getType();

			File mainDependencyFile = new File(mainDependencyDir,  fileName);
			if (!mainDependencyFile.exists())
				throw new IllegalStateException("File does not exist: " + mainDependencyFile.getAbsolutePath());

			// TODO parse the output of maven and add transitive dependencies (additional to the main dependency)! Marco :-)

			return Collections.singletonList(mainDependencyFile.toURI().toURL());
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	protected File createDownloaderMavenProject(MavenURI mavenURI) throws FileNotFoundException, IOException
	{
		File projectDir = IOUtil.createUniqueRandomFolder(IOUtil.getTempDir(), "vestigo.maven.");
		File pomFile = new File(projectDir, "pom.xml");

		String pom = createDownloaderPOM(mavenURI);
		Writer w = new OutputStreamWriter(new FileOutputStream(pomFile), IOUtil.CHARSET_UTF_8);
		w.write(pom);
		w.close();

		return projectDir;
	}

	protected String createDownloaderPOM(MavenURI mavenURI) throws FileNotFoundException, IOException
	{
		if (template_pom == null)
			template_pom = IOUtil.readTextFile(ResolveMavenClasspathConnectionPropertiesFilter.class.getResourceAsStream("resource/pom.xml"), IOUtil.CHARSET_NAME_UTF_8);

		Map<String, String> variables = new HashMap<String, String>();
		variables.put("generate.groupId", mavenURI.getGroupId());
		variables.put("generate.artifactId", "download." + mavenURI.getArtifactId());
		variables.put("generate.version", mavenURI.getVersion());

		String dependencies = createDownloaderDependency(mavenURI); // currently only one dependency per file - maybe we refactor this later
		variables.put("generate.dependencies", dependencies);

		String result = IOUtil.replaceTemplateVariables(template_pom, variables);
		return result;
	}

	protected String createDownloaderDependency(MavenURI mavenURI) throws FileNotFoundException, IOException
	{
		if (template_pom_dependency == null)
			template_pom_dependency = IOUtil.readTextFile(ResolveMavenClasspathConnectionPropertiesFilter.class.getResourceAsStream("resource/pom-dependency.xml"), IOUtil.CHARSET_NAME_UTF_8);

		Map<String, String> variables = new HashMap<String, String>();
		variables.put("generate.dependency.groupId",    createTag("groupId", mavenURI.getGroupId()));
		variables.put("generate.dependency.artifactId", createTag("artifactId", mavenURI.getArtifactId()));
		variables.put("generate.dependency.version",    createTag("version", mavenURI.getVersion()));
		variables.put("generate.dependency.type",       createTag("type", mavenURI.getType()));
		variables.put("generate.dependency.classifier", createTag("classifier", mavenURI.getClassifier()));

		String result = IOUtil.replaceTemplateVariables(template_pom_dependency, variables);
		return result;
	}

	protected String createTag(String tagName, String content)
	{
		return content == null ? "" : '<' + tagName + "><![CDATA[" + content + "]]></" + tagName + '>';
	}
}
