package org.nightlabs.eclipse.jjqb.childvm.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConnectionProfileDTOList
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private List<ConnectionProfileDTO> elements = new ArrayList<ConnectionProfileDTO>();

	public List<ConnectionProfileDTO> getElements() {
		return elements;
	}
	public void setElements(List<ConnectionProfileDTO> elements) {
		this.elements = elements;
	}
}
