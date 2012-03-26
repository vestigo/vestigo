package org.nightlabs.vestigo.maven.core;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.nightlabs.vestigo.core.childvm.internal.DumpStreamToFileThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MavenRunner
{
	private static final Logger logger = LoggerFactory.getLogger(MavenRunner.class);

	private File projectDirectory;
	private File stdOutFile;
	private File stdErrFile;

	private Process mavenProcess;

	private DumpStreamToFileThread dumpInputStreamToFileThread;

	private DumpStreamToFileThread dumpErrorStreamToFileThread;

	private int mavenResult = Integer.MIN_VALUE;

	public MavenRunner(File projectDirectory)
	{
		if (projectDirectory == null)
			throw new IllegalArgumentException("projectDirectory == null");

		this.projectDirectory = projectDirectory;
		stdOutFile = new File(projectDirectory, "mvn.out");
		stdErrFile = new File(projectDirectory, "mvn.err");
	}

	public synchronized int run() throws IOException, InterruptedException
	{
		mavenResult = Integer.MIN_VALUE;
		try {
			logger.info("launch: projectDirectory=\"{}\"", projectDirectory.getAbsolutePath());

			List<String> commandWithArguments = new LinkedList<String>();
			commandWithArguments.add(getMavenCommand());
			commandWithArguments.add(getMavenGoal());

			mavenProcess = new ProcessBuilder()
			.directory(projectDirectory)
			.command(commandWithArguments)
			.start();

			dumpInputStreamToFileThread = new DumpStreamToFileThread(mavenProcess.getInputStream(), stdOutFile);
			dumpInputStreamToFileThread.start();

			dumpErrorStreamToFileThread = new DumpStreamToFileThread(mavenProcess.getErrorStream(), stdErrFile);
			dumpErrorStreamToFileThread.start();

			mavenResult = mavenProcess.waitFor();
			return mavenResult;
		} finally {
			dumpInputStreamToFileThread.interrupt();
			dumpErrorStreamToFileThread.interrupt();
			mavenProcess.destroy();
		}
	}

	public int getMavenResult() {
		return mavenResult;
	}

	private String getMavenCommand() {
		return "mvn"; // TODO make configurable!
	}

	private String getMavenGoal() {
		return "org.apache.maven.plugins:maven-dependency-plugin:2.4:resolve"; // TODO make configurable!
	}
}
