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
