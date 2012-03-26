package org.nightlabs.vestigo.jdt.core.connectionpropertiesfilter;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.nightlabs.vestigo.childvm.shared.PropertiesUtil;
import org.nightlabs.vestigo.core.connectionpropertiesfilter.AbstractConnectionPropertiesFilter;
import org.nightlabs.vestigo.jdt.core.ProjectURI;

public class ResolveClasspathContainersConnectionPropertiesFilter extends AbstractConnectionPropertiesFilter
{
	protected IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
	// There is one instance of this class per filtering-process, hence we can savely store the collected
	// URLs here in object-fields. Marco :-)
	protected List<URL> urlList;
	protected Set<String> urlStringSet;

	@Override
	public void filter(Properties connectionProperties)
	{
		List<String> persistenceEngineClasspathStringList = PropertiesUtil.getList(connectionProperties, PropertiesUtil.PREFIX_META_PERSISTENCE_ENGINE_CLASSPATH);
		Map<String, List<String>> replaceClasspathEntries = new HashMap<String, List<String>>();

		urlStringSet = new HashSet<String>(); // used to ignore duplicates in the resolved classpath (shared by all input-classpath-elements).

		for (String peClasspathEntry : persistenceEngineClasspathStringList) {
			if (!peClasspathEntry.startsWith(ProjectURI.SCHEME_PREFIX))
				continue;

			if (replaceClasspathEntries.containsKey(peClasspathEntry))
				continue; // ignore duplicates in the declared classpath

			List<String> newClasspathEntries = new LinkedList<String>();
			replaceClasspathEntries.put(peClasspathEntry, newClasspathEntries);
			try {
				ProjectURI projectURI = new ProjectURI(new URI(peClasspathEntry));
				IProject project = workspaceRoot.getProject(projectURI.getProjectName());
				IJavaProject javaProject = JavaCore.create(project);

				urlList = new LinkedList<URL>(); // use a new list for each input-classpath-element.
				populateClasspathURLs(javaProject);

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
	}

	protected void populateClasspathURLs(IJavaProject javaProject)
	{
		try {
			IClasspathEntry[] resolvedClasspath = javaProject.getResolvedClasspath(true);
			for (IClasspathEntry classpathEntry : resolvedClasspath) {
				switch (classpathEntry.getEntryKind()) {
					case IClasspathEntry.CPE_CONTAINER: {
						throw new IllegalStateException("CPE_CONTAINER should not be in resolved classpath!");
					}
					case IClasspathEntry.CPE_LIBRARY: {
						IPath path = classpathEntry.getPath();
						File file = path.toFile();
						if (!file.exists()) {
							// the javadoc is not clearly saying, if this is absolute or relative => trying both
							path = workspaceRoot.getFile(path).getRawLocation();
							file = path.toFile();
						}

						if (!file.exists())
							throw new IllegalStateException("File exists neither relative to workspace-root, nor absolute: " + classpathEntry.getPath());

						URL url = file.toURI().toURL();
						if (urlStringSet.add(url.toExternalForm()))
							urlList.add(url);
						break;
					}
					case IClasspathEntry.CPE_PROJECT: {
						String projectName = classpathEntry.getPath().segment(0);
						IProject otherProject = workspaceRoot.getProject(projectName);
						IJavaProject otherJavaProject = JavaCore.create(otherProject);
						populateClasspathURLs(otherJavaProject);
					}
					case IClasspathEntry.CPE_SOURCE: {
						IPath outputLocation = classpathEntry.getOutputLocation();
						if (outputLocation == null)
							outputLocation = javaProject.getOutputLocation();

						// is always relative to the workspace root
						IPath path = workspaceRoot.getFile(outputLocation).getRawLocation();
						URL url = path.toFile().toURI().toURL();
						if (urlStringSet.add(url.toExternalForm()))
							urlList.add(url);
						break;
					}
					case IClasspathEntry.CPE_VARIABLE: {
						throw new IllegalStateException("CPE_VARIABLE should not be in resolved classpath!");
					}
					default:
						throw new UnsupportedOperationException("Unknown classpathEntry.entryKind: " + classpathEntry.getEntryKind());
				}
			}
		} catch (JavaModelException x) {
			throw new RuntimeException(x);
		} catch (MalformedURLException x) {
			throw new RuntimeException(x);
		}
	}

}
