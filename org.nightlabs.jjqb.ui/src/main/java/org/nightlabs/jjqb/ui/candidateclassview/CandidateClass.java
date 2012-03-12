package org.nightlabs.jjqb.ui.candidateclassview;

public class CandidateClass
{
	private String className;

	public CandidateClass(String className) {
		if (className == null)
			throw new IllegalArgumentException("className == null");

		this.className = className;
	}

	public String getClassName() {
		return className;
	}
}
