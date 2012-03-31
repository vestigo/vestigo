package org.nightlabs.vestigo.maven.core;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.nightlabs.vestigo.core.childprocess.DumpStreamToFileThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class MavenRunner
{
	private static final Logger logger = LoggerFactory.getLogger(MavenRunner.class);

	public static final String PREFERENCE_KEY_MAVEN_COMMAND = "MavenRunner.maven.command";
	public static final String PREFERENCE_DEFAULT_MAVEN_COMMAND = "mvn";

	public static final String PREFERENCE_KEY_MAVEN_REPOSITORIES = "MavenRunner.maven.repositories";

	private File projectDirectory;
	private File stdOutFile;
	private File stdErrFile;

	private Process mavenProcess;

	private DumpStreamToFileThread dumpInputStreamToFileThread;

	private DumpStreamToFileThread dumpErrorStreamToFileThread;

	private StringBuffer mavenOutput;
	private int mavenResultCode = Integer.MIN_VALUE;

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
		mavenResultCode = Integer.MIN_VALUE;
		try {
			logger.info("launch: projectDirectory=\"{}\"", projectDirectory.getAbsolutePath());

			List<String> commandWithArguments = new LinkedList<String>();
			commandWithArguments.add(getMavenCommand());
			commandWithArguments.add(getMavenGoal());

			mavenOutput = new StringBuffer();
			mavenProcess = new ProcessBuilder()
			.directory(projectDirectory)
			.command(commandWithArguments)
			.start();

			dumpInputStreamToFileThread = new DumpStreamToFileThread(mavenProcess.getInputStream(), stdOutFile);
			dumpInputStreamToFileThread.setOutputStringBuffer(mavenOutput);
			dumpInputStreamToFileThread.start();

			dumpErrorStreamToFileThread = new DumpStreamToFileThread(mavenProcess.getErrorStream(), stdErrFile);
			dumpErrorStreamToFileThread.setOutputStringBuffer(mavenOutput);
			dumpErrorStreamToFileThread.start();

			mavenResultCode = mavenProcess.waitFor();
		} finally {
			dumpInputStreamToFileThread.interrupt();
			dumpErrorStreamToFileThread.interrupt();
			dumpInputStreamToFileThread.join(); // make sure, buffers are written to mavenOutput
			dumpErrorStreamToFileThread.join(); // make sure, buffers are written to mavenOutput
			mavenProcess.destroy();
		}

		if (mavenResultCode != 0)
			delegateToMavenErrorHandler(String.format("Running Maven failed with code %s! Check Maven's output below.", mavenResultCode));

		return mavenResultCode;
	}

	protected void delegateToMavenErrorHandler(String errorMessage) {
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		if (registry == null)
			throw new IllegalStateException("Platform.getExtensionRegistry() returned null!");

		final String extensionPointId = "org.nightlabs.vestigo.maven.core.mavenErrorHandler";
		final IExtensionPoint extensionPoint = registry.getExtensionPoint(extensionPointId);
		if (extensionPoint == null)
			throw new IllegalStateException("Unable to resolve extension-point: " + extensionPointId); //$NON-NLS-1$

		MavenErrorHandler mavenErrorHandler = null;
		int mavenErrorHandlerPriority = 0;
		for (final IExtension extension : extensionPoint.getExtensions()) {
			final IConfigurationElement[] elements = extension.getConfigurationElements();
			for (final IConfigurationElement element : elements) {
				Object executableExtension;
				try {
					executableExtension = element.createExecutableExtension("class");
				} catch (CoreException e) {
					throw new RuntimeException("Could not create executable extension for class \"" + element.getAttribute("class") + "\"!!! Extension registered in bundle \"" + element.getContributor().getName() + "\". Cause: " + e, e);
				}

				if (!(executableExtension instanceof MavenErrorHandler))
					throw new RuntimeException("Executable extension of type \"" + element.getAttribute("class") + "\" does not implement \"" + MavenErrorHandler.class.getName() + "\"!!! Extension registered in bundle \"" + element.getContributor().getName() + "\".");

				MavenErrorHandler handler = (MavenErrorHandler) executableExtension;
				String priorityStr = element.getAttribute("priority");
				int priority;
				try {
					priority = priorityStr == null ? 500 : Integer.parseInt(priorityStr);
				} catch (NumberFormatException x) {
					throw new RuntimeException("Executable extension of type \"" + element.getAttribute("class") + "\" is registered with illegal priority \"" + priorityStr + "\" (not a number)!!! Extension registered in bundle \"" + element.getContributor().getName() + "\".");
				}

				if (mavenErrorHandler == null || mavenErrorHandlerPriority < priority) {
					mavenErrorHandler = handler;
					mavenErrorHandlerPriority = priority;
				}
			}
		}

		if (mavenErrorHandler == null)
			logger.warn("delegateToMavenErrorHandler: There is no extension registered for this extension-point: {}", extensionPointId);
		else {
			mavenErrorHandler.setErrorMessage(errorMessage);
			mavenErrorHandler.setMavenResultCode(getMavenResultCode());
			mavenErrorHandler.setMavenOutput(getMavenOutput());
			mavenErrorHandler.handle();
		}
	}

	public String getMavenOutput() {
		StringBuffer mavenOutput = this.mavenOutput;
		if (mavenOutput == null)
			return "";
		else
			return mavenOutput.toString();
	}

	public int getMavenResultCode() {
		return mavenResultCode;
	}

	protected String getMavenCommand() {
		return VestigoMavenCorePlugin.getDefault().getPreferences().get(PREFERENCE_KEY_MAVEN_COMMAND, PREFERENCE_DEFAULT_MAVEN_COMMAND);
	}

	protected abstract String getMavenGoal();
}
