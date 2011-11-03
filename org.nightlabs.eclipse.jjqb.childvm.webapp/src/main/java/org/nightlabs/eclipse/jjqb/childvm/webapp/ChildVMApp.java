package org.nightlabs.eclipse.jjqb.childvm.webapp;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.nightlabs.eclipse.jjqb.childvm.shared.JAXBContextResolver;

@ApplicationPath("ChildVMApp")
public class ChildVMApp
extends Application
{
	private static final Class<?>[] serviceClassesArray = {
		JAXBContextResolver.class, // not a service, but registered the same way.
		ConnectionProfileDTOService.class,
		IsOnlineService.class
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
