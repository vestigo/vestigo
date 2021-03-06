/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.eclipse.core.runtime.OperationCanceledException;
import org.nightlabs.util.IOUtil;
import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;
import org.nightlabs.vestigo.core.connectionpropertiesfilter.AbstractConnectionPropertiesFilter;
import org.nightlabs.vestigo.maven.core.DependencyMavenURI;
import org.nightlabs.vestigo.maven.core.MavenRunner;
import org.nightlabs.vestigo.maven.core.MavenURI;
import org.nightlabs.vestigo.maven.core.VestigoMavenCorePlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResolveMavenClasspathConnectionPropertiesFilter extends AbstractConnectionPropertiesFilter
{
	private static final Logger logger = LoggerFactory.getLogger(ResolveMavenClasspathConnectionPropertiesFilter.class);

	protected static Set<File> filesToDeleteByShutdownHook = Collections.synchronizedSet(new HashSet<File>());
	private static Thread shutdownHook = new Thread() {
		@Override
		public void run() {
			try {
				for (File file : filesToDeleteByShutdownHook)
					IOUtil.deleteDirectoryRecursively(file);
			} catch (Exception x) {
				logger.warn("shutdownHook: " + x, x);
			}
		}
	};
	static {
		Runtime.getRuntime().addShutdownHook(shutdownHook);
	}

	protected List<File> filesToDelete = new LinkedList<File>();
	protected Set<String> urlStringSet;

	protected String template_pom;
	protected String template_pom_dependency;

	@Override
	public void filter(Properties connectionProperties) {
		List<String> persistenceEngineClasspathStringList = PropertiesUtil.getList(connectionProperties, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);
		Map<String, List<String>> replaceClasspathEntries = new HashMap<String, List<String>>();


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
				for (File file : filesToDelete) {
					IOUtil.deleteDirectoryRecursively(file);
					filesToDeleteByShutdownHook.remove(file);
				}

				filesToDelete.clear();
				Runtime.getRuntime().removeShutdownHook(shutdownHook);
			}
		}
	}

	protected void registerFileOrDirectoryToDelete(File fileOrDirectory)
	{
		if (fileOrDirectory == null)
			throw new IllegalArgumentException("fileOrDirectory == null");

		filesToDeleteByShutdownHook.add(fileOrDirectory);
		filesToDelete.add(fileOrDirectory);
	}

	protected List<URL> resolveClasspathURLs(MavenURI mavenURI)
	{
		try {
			File projectDirectory = createDownloaderMavenProject(mavenURI);

			DependencyResolveMavenRunner mavenRunner = new DependencyResolveMavenRunner(projectDirectory);
			if (mavenRunner.run() != 0) {
				// an error dialog has already been shown by the MavenRunner itself. But we still abort the process.
				logger.warn("resolveClasspathURLs: Running maven failed! errorCode={} output={}", mavenRunner.getMavenResultCode(), mavenRunner.getMavenOutput());
				throw new OperationCanceledException("Maven error code=" + mavenRunner.getMavenResultCode() + "!");
			}

			List<URL> result = new ArrayList<URL>(mavenRunner.getDependencyMavenURIs().size() + 1);

			File mavenArtifactFile = getMavenArtifactFile(mavenURI);
			URL mavenArtifactURL = mavenArtifactFile.toURI().toURL();
			if (urlStringSet.add(mavenArtifactURL.toExternalForm()))
				result.add(mavenArtifactURL);

			for (DependencyMavenURI dependencyMavenURI : mavenRunner.getDependencyMavenURIs()) {
				mavenArtifactFile = getMavenArtifactFile(dependencyMavenURI);
				mavenArtifactURL = mavenArtifactFile.toURI().toURL();
				if (urlStringSet.add(mavenArtifactURL.toExternalForm()))
					result.add(mavenArtifactURL);
			}

			return result;
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	protected File getMavenArtifactFile(MavenURI mavenURI)
	{
		String groupPath = mavenURI.getGroupId().replace('.', File.separatorChar);
		File dir = new File(new File(new File(getMavenLocalRepository(), groupPath), mavenURI.getArtifactId()), mavenURI.getVersion());
		if (!dir.isDirectory())
			throw new IllegalStateException("Directory does not exist or is not accessible: " + dir.getAbsolutePath());

		String fileName = mavenURI.getArtifactId() + '-' + mavenURI.getVersion();
		if (mavenURI.getClassifier() != null)
			fileName += '-' + mavenURI.getClassifier();

		if (mavenURI.getType() == null)
			fileName += '.' + MavenURI.DEFAULT_TYPE;
		else
			fileName += '.' + mavenURI.getType();

		File file = new File(dir,  fileName);
		if (!file.exists())
			throw new IllegalStateException("File does not exist: " + file.getAbsolutePath());

		return file;
	}

	private File mavenLocalRepository;

	protected File getMavenLocalRepository()
	{
		File mavenLocalRepository = this.mavenLocalRepository;
		if (mavenLocalRepository == null) {
			mavenLocalRepository = new File(new File(IOUtil.getUserHome(), ".m2"), "repository");
			if (!mavenLocalRepository.isDirectory())
				throw new IllegalStateException("Local maven-repository does not exist or is not an accessible directory or is at unknown location! Expected: " + mavenLocalRepository.getAbsolutePath());

			this.mavenLocalRepository = mavenLocalRepository;
		}
		return mavenLocalRepository;
	}

	protected File createDownloaderMavenProject(MavenURI mavenURI) throws FileNotFoundException, IOException
	{
		File baseTempDir = IOUtil.createUserTempDir("vestigo.maven.", null);
		File projectDir = IOUtil.createUniqueIncrementalFolder(baseTempDir, "instance-");
		registerFileOrDirectoryToDelete(projectDir);
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

		String repositories = VestigoMavenCorePlugin.getDefault().getPreferences().get(MavenRunner.PREFERENCE_KEY_MAVEN_REPOSITORIES, null);
		// We force the replacement of the variable, even if there is no repo configured by never passing null.
		variables.put("generate.repositories", repositories == null ? "" : repositories);

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
