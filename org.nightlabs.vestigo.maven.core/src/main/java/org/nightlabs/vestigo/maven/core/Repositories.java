package org.nightlabs.vestigo.maven.core;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Repositories
{
	private List<Repository> repository = new ArrayList<Repository>();

	public List<Repository> getRepository() {
		return repository;
	}
	public void setRepository(List<Repository> repositories) {
		this.repository = repositories;
	}
}
