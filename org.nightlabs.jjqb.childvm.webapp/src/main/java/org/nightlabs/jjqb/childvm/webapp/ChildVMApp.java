package org.nightlabs.jjqb.childvm.webapp;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.nightlabs.jjqb.childvm.shared.provider.JavaNativeMessageBodyReader;
import org.nightlabs.jjqb.childvm.shared.provider.JavaNativeMessageBodyWriter;

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
		IsOnlineService.class,
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
