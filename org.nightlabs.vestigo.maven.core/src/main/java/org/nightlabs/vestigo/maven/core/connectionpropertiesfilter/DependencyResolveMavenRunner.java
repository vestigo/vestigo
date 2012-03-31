package org.nightlabs.vestigo.maven.core.connectionpropertiesfilter;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.nightlabs.vestigo.maven.core.DependencyMavenURI;
import org.nightlabs.vestigo.maven.core.MavenRunner;
import org.nightlabs.vestigo.maven.core.VestigoMavenCorePlugin;

public class DependencyResolveMavenRunner extends MavenRunner
{
	public static final String PREFERENCE_KEY_MAVEN_GOAL = "DependencyResolveMavenRunner.maven.goal";
	public static final String PREFERENCE_DEFAULT_MAVEN_GOAL = "org.apache.maven.plugins:maven-dependency-plugin:2.4:resolve";

	private Set<DependencyMavenURI> dependencyMavenURIs;

	public DependencyResolveMavenRunner(File projectDirectory) {
		super(projectDirectory);
	}

	@Override
	public int run() throws IOException, InterruptedException
	{
		dependencyMavenURIs = null;
		int result = super.run();

		if (result == 0) {
			Set<DependencyMavenURI> dependencyMavenURIs = new HashSet<DependencyMavenURI>();

			BufferedReader reader = new BufferedReader(new StringReader(getMavenOutput()));
			String line;
			boolean inDependencyOutput = false;
			while (null != (line = reader.readLine())) {
				line = line.trim();

				if (line.startsWith("[INFO]"))
					line = line.substring("[INFO]".length());

				line = line.trim();

				if (inDependencyOutput && line.startsWith("---")) {
					// end of interesting output => exit loop
					break;
				}

				if (!inDependencyOutput && line.startsWith("---") && line.contains("maven-dependency-plugin:") && line.contains(":resolve")) {
					// start of interesting output
					inDependencyOutput = true;
					continue;
				}

				if (inDependencyOutput) {
					String[] segments = line.split(":");
					if (segments.length >= 4) {
						DependencyMavenURI uri = new DependencyMavenURI(segments);
						dependencyMavenURIs.add(uri);
					}
				}
			}

			this.dependencyMavenURIs = Collections.unmodifiableSet(dependencyMavenURIs);
		}

		return result;
	}

	public Set<DependencyMavenURI> getDependencyMavenURIs() {
		return dependencyMavenURIs;
	}

	@Override
	protected String getMavenGoal() {
		return VestigoMavenCorePlugin.getDefault().getPreferences().get(PREFERENCE_KEY_MAVEN_GOAL, PREFERENCE_DEFAULT_MAVEN_GOAL);
	}
}
