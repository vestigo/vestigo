package org.nightlabs.vestigo.childvm.shared.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AddChildrenResultDTO
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private ResultCellDTO newOwnerResultCellDTO;

	private List<ResultCellDTO> newChildrenResultCellDTOs = new ArrayList<ResultCellDTO>();

	/**
	 * Get the {@link ResultCellDTO} of the new owner. This is <code>null</code>, if the
	 * owner was not replaced. Replacing an owner is only necessary for arrays (because
	 * adding an element requires recreating a longer array).
	 * @return the {@link ResultCellDTO} of the new owner or <code>null</code>.
	 */
	public ResultCellDTO getNewOwnerResultCellDTO() {
		return newOwnerResultCellDTO;
	}

	public void setNewOwnerResultCellDTO(ResultCellDTO newOwnerResultCellDTO) {
		this.newOwnerResultCellDTO = newOwnerResultCellDTO;
	}

	public List<ResultCellDTO> getNewChildrenResultCellDTOs() {
		return newChildrenResultCellDTOs;
	}

	public void setNewChildrenResultCellDTOs(List<ResultCellDTO> newChildrenResultCellDTOs) {
		this.newChildrenResultCellDTOs = newChildrenResultCellDTOs;
	}
}
