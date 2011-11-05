package org.nightlabs.eclipse.jjqb.childvm.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResultRowDTO
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int rowIndex;
	private List<ResultCellDTO> cells = new ArrayList<ResultCellDTO>();

	public ResultRowDTO() { }

	public int getRowIndex() {
		return rowIndex;
	}
	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	public List<ResultCellDTO> getCells() {
		return cells;
	}
	public void setCells(List<ResultCellDTO> cells) {
		this.cells = cells;
	}
}
