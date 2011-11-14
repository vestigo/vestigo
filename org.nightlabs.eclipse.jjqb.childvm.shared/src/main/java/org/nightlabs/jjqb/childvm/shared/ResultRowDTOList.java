package org.nightlabs.jjqb.childvm.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResultRowDTOList
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private List<ResultRowDTO> elements = new ArrayList<ResultRowDTO>();

	public List<ResultRowDTO> getElements() {
		return elements;
	}
	public void setElements(List<ResultRowDTO> elements) {
		this.elements = elements;
	}
}
