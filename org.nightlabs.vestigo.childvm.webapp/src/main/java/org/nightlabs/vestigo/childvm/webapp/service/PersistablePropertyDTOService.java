package org.nightlabs.vestigo.childvm.webapp.service;

import java.io.IOException;
import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.nightlabs.vestigo.childvm.shared.dto.PersistablePropertyDTO;
import org.nightlabs.vestigo.childvm.shared.dto.PersistablePropertyDTOList;
import org.nightlabs.vestigo.childvm.webapp.clazz.ArrayClassDescriptor;
import org.nightlabs.vestigo.childvm.webapp.clazz.ClassUtil;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfile;
import org.nightlabs.vestigo.childvm.webapp.model.ConnectionProfileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("PersistablePropertyDTO")
public class PersistablePropertyDTOService extends AbstractService {
	private static final Logger logger = LoggerFactory.getLogger(PersistablePropertyDTOService.class);

	@GET
	@Path("{profileID}/{persistableClass}")
	public PersistablePropertyDTOList getPersistablePropertyDTOs(
			@PathParam("profileID") String profileID,
			@PathParam("persistableClass") String persistableClass
	) throws IOException, ClassNotFoundException
	{
		logger.debug(
				"isClassAssignableFrom: entered: profileID={} persistableClass={}",
				profileID, persistableClass
		);

		if (profileID == null)
			throw new IllegalArgumentException("profileID == null");

		if (persistableClass == null)
			throw new IllegalArgumentException("persistableClass == null");

		if (persistableClass.isEmpty())
			throw new IllegalArgumentException("persistableClass is empty String!");

		ConnectionProfile connectionProfile = ConnectionProfileManager.sharedInstance().getConnectionProfile(profileID, true);
		ClassLoader peClassLoader = connectionProfile.getClassLoaderManager().getPersistenceEngineClassLoader(null);

		ArrayClassDescriptor arrayClassDescriptor = ClassUtil.getArrayClassDescriptor(persistableClass);
		Class<?> clazz = arrayClassDescriptor.getClass(peClassLoader);

		Collection<PersistablePropertyDTO> persistablePropertyDTOs = connectionProfile.getPersistablePropertyDTOs(clazz);
		PersistablePropertyDTOList persistablePropertyDTOList = new PersistablePropertyDTOList();
		persistablePropertyDTOList.getElements().addAll(persistablePropertyDTOs);
		return persistablePropertyDTOList;
	}
}
