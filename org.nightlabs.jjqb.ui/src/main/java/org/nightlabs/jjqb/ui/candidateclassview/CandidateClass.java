package org.nightlabs.jjqb.ui.candidateclassview;

public class CandidateClass
{
	private String className;
	private String classNameLowerCase;

	public CandidateClass(String className) {
		if (className == null)
			throw new IllegalArgumentException("className == null"); //$NON-NLS-1$

		this.className = className;
	}

	public String getClassName() {
		return className;
	}

	public String getClassNameLowerCase() {
		if (classNameLowerCase == null)
			classNameLowerCase = className.toLowerCase();

		return classNameLowerCase;
	}
}
