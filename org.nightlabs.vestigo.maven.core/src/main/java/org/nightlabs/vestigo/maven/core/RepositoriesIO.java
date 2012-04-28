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
package org.nightlabs.vestigo.maven.core;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class RepositoriesIO
{
	private JAXBContext context;

	private JAXBContext getContext() throws JAXBException
	{
		JAXBContext context = this.context;
		if (context == null) {
			context = JAXBContext.newInstance(Repositories.class);
			this.context = context;
		}
		return context;
	}

	public String writeToString(Repositories repositories) throws JAXBException
	{
		if (repositories == null)
			throw new IllegalArgumentException("repositories == null");

		JAXBContext context = getContext();
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
		StringWriter writer = new StringWriter();
		marshaller.marshal(repositories, writer);
		return writer.toString();
	}

	public Repositories readFromString(String xml) throws JAXBException
	{
		if (xml == null)
			throw new IllegalArgumentException("xml == null");

		JAXBContext context = getContext();
		Unmarshaller unmarshaller = context.createUnmarshaller();
		return (Repositories) unmarshaller.unmarshal(new StringReader(xml));
	}
}
