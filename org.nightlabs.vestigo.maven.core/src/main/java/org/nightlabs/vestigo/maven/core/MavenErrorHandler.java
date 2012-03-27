package org.nightlabs.vestigo.maven.core;

public interface MavenErrorHandler
{
	String getErrorMessage();

	void setErrorMessage(String errorMessage);

	int getMavenResultCode();

	void setMavenResultCode(int mavenResultCode);

	String getMavenOutput();

	void setMavenOutput(String mavenOutput);

	void handle();
}
