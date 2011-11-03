package org.nightlabs.eclipse.jjqb.childvm.shared;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link ContextResolver} implementation telling JAXB all DTO classes that are required for
 * the communication channel between app-server and key-manager.
 *
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
@Provider
public final class JAXBContextResolver implements ContextResolver<JAXBContext>
{
	private static final Logger logger = LoggerFactory.getLogger(JAXBContextResolver.class);

	private final JAXBContext context;

	private static final Class<?>[] cTypes = {
		ConnectionProfileDTO.class,
		ConnectionProfileDTOList.class,
		ConnectionProfileDTOPutResult.class,
		JDOConnectionProfileDTO.class,
		JPAConnectionProfileDTO.class
	};

	private static final Set<Class<?>> types = Collections.unmodifiableSet(new HashSet<Class<?>>(Arrays.asList(cTypes)));

	/**
	 * Create a new instance of <code>JAXBContextResolver</code>. This is called by Jersey (the class is passed to it).
	 * @throws Exception in case creation of this resolver fails.
	 */
	public JAXBContextResolver() throws Exception {
		logger.debug("Instantiating JAXBContextResolver.");
		this.context = JAXBContext.newInstance(cTypes);
	}

	@Override
	public JAXBContext getContext(Class<?> objectType) {
		JAXBContext result = (types.contains(objectType)) ? context : null;
		logger.debug(
				"getContext: objectType={} matching={}",
				(objectType == null ? null : objectType.getName()),
				result != null
		);
		return result;
	}
}