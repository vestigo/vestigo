package org.nightlabs.jjqb.childvm.shared.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
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
