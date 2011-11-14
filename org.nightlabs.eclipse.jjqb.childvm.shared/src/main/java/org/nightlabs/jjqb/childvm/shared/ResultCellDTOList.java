package org.nightlabs.jjqb.childvm.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResultCellDTOList
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private List<ResultCellDTO> elements = new ArrayList<ResultCellDTO>();

	public List<ResultCellDTO> getElements() {
		return elements;
	}
	public void setElements(List<ResultCellDTO> elements) {
		this.elements = elements;
	}
}
