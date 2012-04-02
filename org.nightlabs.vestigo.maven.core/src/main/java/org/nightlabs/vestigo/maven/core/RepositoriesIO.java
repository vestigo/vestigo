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
