package org.nightlabs.vestigo.maven.core;

public abstract class AbstractMavenErrorHandler implements MavenErrorHandler
{
	private String errorMessage;
	private int mavenResultCode;
	private String mavenOutput;

	@Override
	public String getErrorMessage() {
		return errorMessage;
	}
	@Override
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public int getMavenResultCode() {
		return mavenResultCode;
	}
	@Override
	public void setMavenResultCode(int mavenResultCode) {
		this.mavenResultCode = mavenResultCode;
	}

	@Override
	public String getMavenOutput() {
		return mavenOutput;
	}
	@Override
	public void setMavenOutput(String mavenOutput) {
		this.mavenOutput = mavenOutput;
	}
}
