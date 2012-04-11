package org.nightlabs.vestigo.log4j.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.nightlabs.util.IOUtil;
import org.nightlabs.vestigo.core.LogLevel;
import org.nightlabs.vestigo.core.childvm.internal.ChildVMServer;
import org.nightlabs.vestigo.log4j.core.resource.ResourceHelper;
import org.osgi.service.prefs.Preferences;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4jConfigurator
{
	private static final Logger logger = LoggerFactory.getLogger(Log4jConfigurator.class);

	private static final Log4jConfigurator sharedInstance = new Log4jConfigurator();

	public static Log4jConfigurator sharedInstance() {
		return sharedInstance;
	}

	public static final String PREFERENCE_KEY_ENABLED = "log4jConfigurator.enabled";
	public static final boolean PREFERENCE_DEFAULT_ENABLED = false;

	public static final String PREFERENCE_KEY_CONSOLE_APPENDER_ENABLED = "log4jConfigurator.consoleAppender.enabled";
	public static final boolean PREFERENCE_DEFAULT_CONSOLE_APPENDER_ENABLED = false;

	public static final String PREFERENCE_KEY_ROLLING_FILE_APPENDER_ENABLED = "log4jConfigurator.rollingFileAppender.enabled";
	public static final boolean PREFERENCE_DEFAULT_ROLLING_FILE_APPENDER_ENABLED = true;

	public static final String PREFERENCE_KEY_LOG4J_ROOT_LOG_LEVEL = "log4jConfigurator.rootLogLevel";
	public static final String PREFERENCE_DEFAULT_LOG4J_ROOT_LOG_LEVEL = LogLevel.FATAL.name();

	public static final String PREFERENCE_KEY_LOG4J_ADDITIONAL_PROPERTIES = "log4jConfigurator.additionalProperties";
	//public static final String PREFERENCE_DEFAULT_LOG4J_ADDITIONAL_PROPERTIES = "#log4j.category.mypackage.MyClass=DEBUG\n#log4j.additivity.mypackage.MyClass=false";
//	public static final String PREFERENCE_DEFAULT_LOG4J_ADDITIONAL_PROPERTIES = "#log4j.category.mypackage.MyClass=DEBUG";
	public static final String PREFERENCE_DEFAULT_LOG4J_ADDITIONAL_PROPERTIES = "log4j.category." + ChildVMServer.CHILD_VM_LOGGER_NAME + "=INFO";

	public static final String PREFERENCE_KEY_ROLLING_FILE_APPENDER_MAX_BACKUP_INDEX = "rollingFileAppender.maxBackupIndex";
	public static final int PREFERENCE_DEFAULT_ROLLING_FILE_APPENDER_MAX_BACKUP_INDEX = 9;

	public static final String PREFERENCE_KEY_ROLLING_FILE_APPENDER_MAX_FILE_SIZE_MB = "rollingFileAppender.maxFileSizeMB";
	public static final int PREFERENCE_DEFAULT_ROLLING_FILE_APPENDER_MAX_FILE_SIZE_MB = 5;

	private Preferences preferences = VestigoLog4jCorePlugin.getDefault().getPreferences();
	private IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
	private String workspaceRootAbsolutePath = workspaceRoot.getRawLocation().toFile().getAbsolutePath();
	private File vestigoLog4jCorePluginStateLocation = VestigoLog4jCorePlugin.getDefault().getStateLocation().toFile();
	private File log4jPropertiesFile = new File(vestigoLog4jCorePluginStateLocation, ResourceHelper.LOG4J_PROPERTIES_FILE_NAME);
	private File logFile = new File(vestigoLog4jCorePluginStateLocation, "vestigo.log");

	private boolean log4jPropertyWatchdogRunning = false;

	private Log4jConfigurator() { }

	public synchronized void configure()
	{
		boolean enabled = isEnabled();
		if (enabled == false)
			return;

		try {
			createLog4jPropertiesFile();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		// The method PropertyConfigurator.configureAndWatch(...) configures ASYNCHRONOUSLY, but we want
		// log4j to be configured immediately, hence we always call the normal configure(...) method.
		PropertyConfigurator.configure(log4jPropertiesFile.getAbsolutePath());

		// We prevent multiple watch-dog-threads from being started.
		if (!log4jPropertyWatchdogRunning) {
			PropertyConfigurator.configureAndWatch(log4jPropertiesFile.getAbsolutePath());
			log4jPropertyWatchdogRunning = true;
		}
	}

	public File getLogFile() {
		return logFile;
	}

	private void createLog4jPropertiesFile() throws IOException
	{
		vestigoLog4jCorePluginStateLocation.mkdirs();

		Map<String, String> variables = new HashMap<String, String>();
		variables.put("additionalProperties", getLog4jAdditionalProperties());
		variables.put("commaAndConsoleAppender", isConsoleAppenderEnabled() ? ", AC" : "");
		variables.put("commaAndRollingFileAppender", isRollingFileAppenderEnabled() ? ", AR" : "");
		variables.put("logFile", logFile.getAbsolutePath());
		variables.put("rollingFileAppender.maxFileSizeMB", String.valueOf(getRollingFileAppender_maxFileSizeMB()));
		variables.put("rollingFileAppender.maxBackupIndex", String.valueOf(getRollingFileAppender_maxBackupIndex()));
		variables.put("rootLogLevel", getLog4jRootLogLevel());
		variables.put("vestigoLog4jCorePluginStateLocation", vestigoLog4jCorePluginStateLocation.getAbsolutePath());
		variables.put("workspace", workspaceRootAbsolutePath);

		File tmpFile = new File(log4jPropertiesFile.getParentFile(), "log4j.tmp");

		Reader reader = ResourceHelper.getLog4jPropertiesAsReader();
		try {
			OutputStream out = new FileOutputStream(tmpFile);
			try {
				Writer writer = new OutputStreamWriter(out, ResourceHelper.CHARSET_NAME_ISO_8859_1);
				IOUtil.replaceTemplateVariables(writer, reader, variables);
				writer.close();
			} finally {
				out.close();
			}
		} finally {
			reader.close();
		}

		if (log4jPropertiesFile.exists()) {
			if (!log4jPropertiesFile.delete())
				logger.warn("createLog4jPropertiesFile: Failed to delete file: {}", log4jPropertiesFile.getAbsolutePath());
		}

		if (!tmpFile.renameTo(log4jPropertiesFile))
			throw new IOException("Failed to rename file \"" + tmpFile.getAbsolutePath() + "\" to \"" + log4jPropertiesFile.getAbsolutePath() + "\"!");
	}

	private boolean isEnabled()
	{
		return preferences.getBoolean(PREFERENCE_KEY_ENABLED, PREFERENCE_DEFAULT_ENABLED);
	}

	private String getLog4jRootLogLevel()
	{
		return preferences.get(PREFERENCE_KEY_LOG4J_ROOT_LOG_LEVEL, PREFERENCE_DEFAULT_LOG4J_ROOT_LOG_LEVEL);
	}

	private String getLog4jAdditionalProperties()
	{
		return preferences.get(PREFERENCE_KEY_LOG4J_ADDITIONAL_PROPERTIES, PREFERENCE_DEFAULT_LOG4J_ADDITIONAL_PROPERTIES);
	}

	private boolean isConsoleAppenderEnabled()
	{
		return preferences.getBoolean(PREFERENCE_KEY_CONSOLE_APPENDER_ENABLED, PREFERENCE_DEFAULT_CONSOLE_APPENDER_ENABLED);
	}

	private boolean isRollingFileAppenderEnabled()
	{
		return preferences.getBoolean(PREFERENCE_KEY_ROLLING_FILE_APPENDER_ENABLED, PREFERENCE_DEFAULT_ROLLING_FILE_APPENDER_ENABLED);
	}

	private int getRollingFileAppender_maxBackupIndex() {
		return preferences.getInt(PREFERENCE_KEY_ROLLING_FILE_APPENDER_MAX_BACKUP_INDEX, PREFERENCE_DEFAULT_ROLLING_FILE_APPENDER_MAX_BACKUP_INDEX);
	}

	private int getRollingFileAppender_maxFileSizeMB() {
		return preferences.getInt(PREFERENCE_KEY_ROLLING_FILE_APPENDER_MAX_FILE_SIZE_MB, PREFERENCE_DEFAULT_ROLLING_FILE_APPENDER_MAX_FILE_SIZE_MB);
	}

}
