package org.nightlabs.vestigo.childvm.webapp;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.nightlabs.vestigo.childvm.shared.provider.JavaNativeMessageBodyReader;
import org.nightlabs.vestigo.childvm.shared.provider.JavaNativeMessageBodyWriter;
import org.nightlabs.vestigo.childvm.webapp.service.ConnectionDTOService;
import org.nightlabs.vestigo.childvm.webapp.service.ConnectionProfileDTOService;
import org.nightlabs.vestigo.childvm.webapp.service.IsClassAssignableFromService;
import org.nightlabs.vestigo.childvm.webapp.service.IsOnlineService;
import org.nightlabs.vestigo.childvm.webapp.service.QueryableCandidateClassesService;
import org.nightlabs.vestigo.childvm.webapp.service.ResultCellDTOService;
import org.nightlabs.vestigo.childvm.webapp.service.ResultRowDTOService;
import org.nightlabs.vestigo.childvm.webapp.service.ResultSetDTOService;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
@ApplicationPath("ChildVMApp")
public class ChildVMApp
extends Application
{
	static {
		// Start the surveillance of the ParentVM: Only need to instantiate the shared instance.
		ParentVMHeartBeat.sharedInstance();
	}

	private static final Class<?>[] serviceClassesArray = {
		// BEGIN services
		ConnectionDTOService.class,
		ConnectionProfileDTOService.class,
		IsClassAssignableFromService.class,
		IsOnlineService.class,
		QueryableCandidateClassesService.class,
		ResultCellDTOService.class,
		ResultRowDTOService.class,
		ResultSetDTOService.class,
		// END services

		// BEGIN providers
		// providers are not services (they are infrastructure), but they are registered the same way.
//		JAXBContextResolver.class, // not used anymore - we use only java native serialisation.
		JavaNativeMessageBodyReader.class,
		JavaNativeMessageBodyWriter.class,
		DefaultExceptionMapper.class
		// END providers
	};

	private static final Set<Class<?>> serviceClassesSet;
	static {
		Set<Class<?>> s = new HashSet<Class<?>>(serviceClassesArray.length);
		for (Class<?> c : serviceClassesArray)
			s.add(c);

		serviceClassesSet = Collections.unmodifiableSet(s);
	}

	@Override
	public Set<Class<?>> getClasses() {
		return serviceClassesSet;
	}

	private Set<Object> singletons;

	@Override
	public Set<Object> getSingletons()
	{
		if (singletons == null) {
			Set<Object> s = new HashSet<Object>();
//			s.add(new SomeSingletonProvider(someSingleton));
//			s.add(new AnotherSingletonProvider(anotherSingleton));
			singletons = Collections.unmodifiableSet(s);
		}

		return singletons;
	}
}
