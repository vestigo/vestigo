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
