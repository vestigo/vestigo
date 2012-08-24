package org.nightlabs.vestigo.cumulus4j.childvm.webapp.model;

import java.util.SortedSet;
import java.util.TreeSet;

import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfile;

public class Cumulus4jConnectionProfileHelper {

	private ConnectionProfile connectionProfile;

	public Cumulus4jConnectionProfileHelper(ConnectionProfile connectionProfile)
	{
		if (connectionProfile == null)
			throw new IllegalArgumentException("connectionProfile == null");

		this.connectionProfile = connectionProfile;
	}

	public ConnectionProfile getConnectionProfile() {
		return connectionProfile;
	}

	public SortedSet<String> filterQueryableCandidateClasses(SortedSet<String> queryableCandidateClasses) {
		if (queryableCandidateClasses == null)
			throw new IllegalArgumentException("queryableCandidateClasses == null");

		SortedSet<String> result = new TreeSet<String>(queryableCandidateClasses.comparator());
		for (String className : queryableCandidateClasses) {
			if (!className.startsWith("org.cumulus4j."))
				result.add(className);
		}
		return result;
	}
}
