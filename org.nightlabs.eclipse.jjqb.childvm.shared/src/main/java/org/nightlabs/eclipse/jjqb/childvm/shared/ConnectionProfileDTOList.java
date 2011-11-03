package org.nightlabs.eclipse.jjqb.childvm.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConnectionProfileDTOList
{
	private List<ConnectionProfileDTO> elements = new ArrayList<ConnectionProfileDTO>();

	public List<ConnectionProfileDTO> getElements() {
		return elements;
	}
	public void setElements(List<ConnectionProfileDTO> elements) {
		this.elements = elements;
	}
}
