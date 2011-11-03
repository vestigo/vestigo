package org.nightlabs.eclipse.jjqb.childvm.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConnectionDTOList
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private List<ConnectionDTO> elements = new ArrayList<ConnectionDTO>();

	public List<ConnectionDTO> getElements() {
		return elements;
	}
	public void setElements(List<ConnectionDTO> elements) {
		this.elements = elements;
	}
}
