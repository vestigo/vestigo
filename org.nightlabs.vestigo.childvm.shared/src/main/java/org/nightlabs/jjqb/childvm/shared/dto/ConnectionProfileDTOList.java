package org.nightlabs.jjqb.childvm.shared.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
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
