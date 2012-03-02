package org.nightlabs.jjqb.childvm.webapp.service;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.nightlabs.jjqb.childvm.webapp.model.ConnectionProfile;
import org.nightlabs.jjqb.childvm.webapp.model.ConnectionProfileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("IsClassAssignableFrom")
public class IsClassAssignableFromService extends AbstractService
{
	private static final Logger logger = LoggerFactory.getLogger(IsClassAssignableFromService.class);

	@GET
	@Path("{profileID}/{targetClass}/{candidateClass}")
	public boolean isClassAssignableFrom(
			@PathParam("profileID") String profileID,
			@PathParam("targetClass") String targetClass,
			@PathParam("candidateClass") String candidateClass
	) throws IOException, ClassNotFoundException
	{
		logger.debug(
				"isClassAssignableFrom: entered: profileID={} targetClass={} candidateClass={}",
				new Object[] { profileID, targetClass, candidateClass }
		);

		if (profileID == null)
			throw new IllegalArgumentException("profileID == null");

		if (targetClass == null)
			throw new IllegalArgumentException("targetClass == null");

		if (candidateClass == null)
			throw new IllegalArgumentException("candidateClass == null");

		ConnectionProfile connectionProfile = ConnectionProfileManager.sharedInstance().getConnectionProfile(profileID, true);
		ClassLoader peClassLoader = connectionProfile.getClassLoaderManager().getPersistenceEngineClassLoader();
		Class<?> tClass = peClassLoader.loadClass(targetClass);
		Class<?> cClass = peClassLoader.loadClass(candidateClass);
		return tClass.isAssignableFrom(cClass);
	}
}
