package org.nightlabs.vestigo.childvm.shared.dto;

import java.io.Serializable;

public class RemoveChildFromOwnerResultDTO
implements Serializable
{
	private static final long serialVersionUID = 1L;

	private ResultCellDTO newOwnerResultCellDTO;

	/**
	 * Get the {@link ResultCellDTO} of the new owner. This is <code>null</code>, if the
	 * owner was not replaced. Replacing an owner is only necessary for arrays (because
	 * removing an element requires recreating a shorter array).
	 * @return the {@link ResultCellDTO} of the new owner or <code>null</code>.
	 */
	public ResultCellDTO getNewOwnerResultCellDTO() {
		return newOwnerResultCellDTO;
	}

	public void setNewOwnerResultCellDTO(ResultCellDTO newOwnerResultCellDTO) {
		this.newOwnerResultCellDTO = newOwnerResultCellDTO;
	}
}
