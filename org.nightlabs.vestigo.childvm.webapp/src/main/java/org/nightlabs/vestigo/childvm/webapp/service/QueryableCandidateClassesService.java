package org.nightlabs.vestigo.childvm.webapp.service;

import java.io.IOException;
import java.util.SortedSet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.nightlabs.vestigo.childvm.shared.dto.StringSortedSetDTO;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfile;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("QueryableCandidateClasses")
public class QueryableCandidateClassesService extends AbstractService
{
	private static final Logger logger = LoggerFactory.getLogger(QueryableCandidateClassesService.class);

	@GET
	@Path("{profileID}")
	public StringSortedSetDTO getQueryableCandidateClasses(
			@PathParam("profileID") String profileID
	) throws IOException, ClassNotFoundException
	{
		logger.debug(
				"getQueryableCandidateClasses: entered: profileID={} targetClass={} candidateClass={}",
				new Object[] { profileID }
		);

		if (profileID == null)
			throw new IllegalArgumentException("profileID == null");

		ConnectionProfile connectionProfile = ConnectionProfileManager.sharedInstance().getConnectionProfile(profileID);
		if (connectionProfile == null)
			throw new IllegalArgumentException("There is no ConnectionProfile with profileID=" + profileID);

//		Collection<Class<?>> classes = connectionProfile.getQueryableCandidateClasses();
//		SortedSet<String> result = new TreeSet<String>();
//		for (Class<?> c : classes)
//			result.add(c.getName());

		SortedSet<String> result = connectionProfile.getQueryableCandidateClasses();
		return new StringSortedSetDTO(result);
	}
}
