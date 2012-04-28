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

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import org.nightlabs.vestigo.maven.core.DependencyMavenURI;
import org.nightlabs.vestigo.maven.core.MavenRunner;
import org.nightlabs.vestigo.maven.core.VestigoMavenCorePlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DependencyResolveMavenRunner extends MavenRunner
{
	private static final Logger logger = LoggerFactory.getLogger(DependencyResolveMavenRunner.class);
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
				logger.trace("run: inDependencyOutput={} line='{}'", inDependencyOutput, line);
				line = line.trim();

				if (line.startsWith("[INFO]"))
					line = line.substring("[INFO]".length());

				line = line.trim();

				if (inDependencyOutput && line.startsWith("---")) {
					logger.trace("run: found end of interesting dependency output. Exiting loop.");
					// end of interesting output => exit loop
					break;
				}

				if (!inDependencyOutput && line.startsWith("---") && line.contains("maven-dependency-plugin:") && line.contains(":resolve")) {
					// start of interesting output - when using Maven 2 (instead of Maven 3), this trigger line does not exist and we'll never come here.
					logger.trace("run: found beginning of interesting dependency output (rule 1).");
					inDependencyOutput = true;
					continue;
				}

				if (!inDependencyOutput && line.toLowerCase(Locale.ENGLISH).contains("The following files have been resolved".toLowerCase(Locale.ENGLISH))) {
					// start of interesting output - when using Maven 2 (instead of Maven 3), this additional trigger is required
					logger.trace("run: found beginning of interesting dependency output (rule 2).");
					inDependencyOutput = true;
					continue;
				}

				if (inDependencyOutput) {
					String[] segments = line.split(":");
					if (segments.length >= 4) {
						DependencyMavenURI uri = new DependencyMavenURI(segments);
						dependencyMavenURIs.add(uri);
						logger.debug("run: added DependencyMavenURI: {}", uri);
					}
					else
						logger.debug("run: ignoring line, because segments.length does not match expectation.");
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
