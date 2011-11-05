package org.nightlabs.eclipse.jjqb.core.internal;

import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellObjectRefDTO;
import org.nightlabs.eclipse.jjqb.core.ObjectReference;
import org.nightlabs.eclipse.jjqb.core.ResultSet;
import org.nightlabs.util.Util;

public class ObjectReferenceImpl implements ObjectReference
{
	private ResultSet resultSet;
	private ResultCellObjectRefDTO resultCellObjectRefDTO;

	public ObjectReferenceImpl(ResultSet resultSet, ResultCellObjectRefDTO resultCellObjectRefDTO)
	{
		if (resultSet == null)
			throw new IllegalArgumentException("resultSet == null");

		if (resultCellObjectRefDTO == null)
			throw new IllegalArgumentException("resultCellObjectRefDTO == null");

		this.resultSet = resultSet;
		this.resultCellObjectRefDTO = resultCellObjectRefDTO;
	}

	@Override
	public ResultSet getResultSet() {
		return resultSet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((resultSet == null) ? 0 : resultSet.hashCode());
		result = prime * result + ((resultCellObjectRefDTO == null) ? 0 : resultCellObjectRefDTO.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		ObjectReferenceImpl other = (ObjectReferenceImpl) obj;
		return (
				Util.equals(this.resultCellObjectRefDTO, other.resultCellObjectRefDTO) &&
				Util.equals(this.resultSet, other.resultSet)
		);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + '[' + resultSet.getResultSetID() + ',' + resultCellObjectRefDTO + ']';
	}

	@Override
	public String getObjectClassName() {
		return resultCellObjectRefDTO.getObjectClassName();
	}

	@Override
	public String getObjectID() {
		return resultCellObjectRefDTO.getObjectID();
	}
}
