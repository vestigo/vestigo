package org.nightlabs.eclipse.jjqb.core.internal;

import java.util.ArrayList;
import java.util.List;

import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellObjectRefDTO;
import org.nightlabs.eclipse.jjqb.core.ObjectReference;
import org.nightlabs.eclipse.jjqb.core.ObjectReferenceChild;
import org.nightlabs.eclipse.jjqb.core.ResultSet;
import org.nightlabs.eclipse.jjqb.core.childvm.ChildVM;
import org.nightlabs.util.Util;

public class ObjectReferenceImpl implements ObjectReference
{
	private ResultSet resultSet;
	private ResultCellObjectRefDTO resultCellObjectRefDTO;

	private ObjectReferenceChild associatedObjectReferenceChild;

	private List<ObjectReferenceChild> children;

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

	protected ChildVM getChildVM()
	{
		return resultSet.getQuery().getConnection().getConnectionProfile().getChildVM();
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
		return this.getClass().getSimpleName() + '[' + resultSet.getResultSetID() + ',' + getObjectClassName() + ',' + getObjectID() + ']';
	}

	@Override
	public String getObjectClassName() {
		return resultCellObjectRefDTO.getObjectClassName();
	}

	@Override
	public String getObjectID() {
		return resultCellObjectRefDTO.getObjectID();
	}

	@Override
	public String getObjectToString() {
		return resultCellObjectRefDTO.getObjectToString();
	}

	@Override
	public synchronized List<ObjectReferenceChild> getChildren()
	{
		List<ObjectReferenceChild> children = this.children;
		if (children == null) {
			List<ResultCellDTO> childDTOs = getChildVM().getChildren(this);
			children = new ArrayList<ObjectReferenceChild>(childDTOs.size());
			for (ResultCellDTO childDTO : childDTOs) {
				Object childRawObject = AbstractResultSet.unmaskResultCellDTO(resultSet, childDTO);

				ObjectReferenceChild childObjectReferenceChild = new ObjectReferenceChildImpl(this, childDTO, childRawObject);

				if (childRawObject instanceof ObjectReference) {
					ObjectReference childObjectReference = (ObjectReference) childRawObject;
					childObjectReference.setAssociatedObjectReferenceChild(childObjectReferenceChild);
				}

				children.add(childObjectReferenceChild);
			}
			this.children = children;
		}
		return children;
	}

	@Override
	public ObjectReferenceChild getAssociatedObjectReferenceChild() {
		return associatedObjectReferenceChild;
	}
	@Override
	public void setAssociatedObjectReferenceChild(ObjectReferenceChild associatedObjectReferenceChild)
	{
		if (this.associatedObjectReferenceChild == associatedObjectReferenceChild)
			return;

		if (this.associatedObjectReferenceChild != null)
			throw new IllegalStateException("this.associatedObjectReferenceChild already assigned! Cannot replace!");

		this.associatedObjectReferenceChild = associatedObjectReferenceChild;
	}
}
