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
import org.nightlabs.vestigo.childvm.webapp.service.PersistablePropertyDTOService;
import org.nightlabs.vestigo.childvm.webapp.service.QueryExecutionStatisticSetDTOService;
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
		PersistablePropertyDTOService.class,
		QueryableCandidateClassesService.class,
		QueryExecutionStatisticSetDTOService.class,
		ResultCellDTOService.class,
		ResultRowDTOService.class,
		ResultSetDTOService.class,
		// END services

		// BEGIN providers
		// providers are not services (they are infrastructure), but they are registered the same way.
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
