/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.core.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.nightlabs.util.Util;
import org.nightlabs.vestigo.childvm.shared.Formula;
import org.nightlabs.vestigo.childvm.shared.ResultSetID;
import org.nightlabs.vestigo.childvm.shared.api.ChildVM;
import org.nightlabs.vestigo.childvm.shared.dto.AddChildrenCommandDTO;
import org.nightlabs.vestigo.childvm.shared.dto.AddChildrenResultDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellObjectRefDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellPersistentObjectRefDTO;
import org.nightlabs.vestigo.childvm.shared.dto.ResultCellTransientObjectRefDTO;
import org.nightlabs.vestigo.core.LabelTextOption;
import org.nightlabs.vestigo.core.LabelTextUtil;
import org.nightlabs.vestigo.core.ObjectReference;
import org.nightlabs.vestigo.core.ObjectReferenceChild;
import org.nightlabs.vestigo.core.oda.ResultSet;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public abstract class ObjectReferenceImpl implements ObjectReference
{
	private ResultSet resultSet;
	private ResultCellObjectRefDTO resultCellObjectRefDTO;

	private List<ObjectReferenceChild> children;

	public ObjectReferenceImpl(ResultSet resultSet, ResultCellObjectRefDTO resultCellObjectRefDTO)
	{
		if (resultSet == null)
			throw new IllegalArgumentException("resultSet == null"); //$NON-NLS-1$

		if (resultCellObjectRefDTO == null)
			throw new IllegalArgumentException("resultCellObjectRefDTO == null"); //$NON-NLS-1$

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
	public String getLabelText(Set<LabelTextOption> labelTextOptions)
	{
		if (labelTextOptions == null)
			throw new IllegalArgumentException("labelTextOptions == null"); //$NON-NLS-1$

		StringBuilder sb = new StringBuilder();

		if (labelTextOptions.contains(LabelTextOption.showPackageName))
			sb.append(this.getObjectClassName());
		else
			sb.append(LabelTextUtil.getSimpleClassName(this.getObjectClassName()));

		if (
				(labelTextOptions.contains(LabelTextOption.showPersistentID) && (resultCellObjectRefDTO instanceof ResultCellPersistentObjectRefDTO)) ||
				(labelTextOptions.contains(LabelTextOption.showTransientID) && (resultCellObjectRefDTO instanceof ResultCellTransientObjectRefDTO))
		)
		{
			sb.append('[').append(this.getObjectID()).append(']');
		}

		if (labelTextOptions.contains(LabelTextOption.showObjectToString) && this.getObjectToString() != null)
			sb.append(": ").append(this.getObjectToString()); //$NON-NLS-1$

		return sb.toString();
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
	public String getObjectIDClassName() {
		return resultCellObjectRefDTO.getObjectIDClassName();
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
			List<ResultCellDTO> childDTOs = getChildVM().getChildren(getResultSet().getResultSetID(), resultCellObjectRefDTO);
			children = new ArrayList<ObjectReferenceChild>(childDTOs.size());
			for (ResultCellDTO childDTO : childDTOs) {
				ObjectReferenceChild childObjectReferenceChild = new ObjectReferenceChildImpl(this, children.size(), childDTO);
				children.add(childObjectReferenceChild);
			}
			this.children = children;
		}
		return children;
	}

	@Override
	public synchronized void onRemovedChild(ObjectReferenceChild child, ResultCellDTO newOwnerResultCellDTO) {
		if (child == null)
			throw new IllegalArgumentException("child == null");

		List<ObjectReferenceChild> children = this.children;
		if (children == null)
			throw new IllegalStateException("Children not yet loaded! How the hell can the child be removed, then?!???");

		final int index = child.getIndex();
		ObjectReferenceChild childAtIndex = children.get(index);
		if (childAtIndex != child)
			throw new IllegalStateException("children.get(index) returned another instance - not the child argument! index=" + index + " this=" + this + " child=" + child);

		children.remove(index);
		for (int i = index; i < children.size(); ++i)
			children.get(i).setIndex(i);

		if (newOwnerResultCellDTO != null) {
			this.resultCellObjectRefDTO = (ResultCellObjectRefDTO) newOwnerResultCellDTO;
		}
	}

	@Override
	public boolean isObjectInstanceOf(Class<?> targetClass)
	{
		return isObjectInstanceOf(targetClass.getName());
	}

	@Override
	public boolean isObjectInstanceOf(String targetClass)
	{
		return resultSet.getQuery().getConnection().getConnectionProfile().isClassAssignableFrom(targetClass, getObjectClassName());
	}

	@Override
	public synchronized List<ObjectReferenceChild> addChildren(Formula formula)
	{
		AddChildrenCommandDTO addChildrenCommandDTO = new AddChildrenCommandDTO(
				getObjectClassName(),
				getObjectID(),
				formula
		);

		ResultSetID resultSetID = getResultSet().getResultSetID();
		AddChildrenResultDTO resultDTO = getChildVM().addChildren(resultSetID, addChildrenCommandDTO);
		List<ObjectReferenceChild> resultList = null;
		List<ObjectReferenceChild> children = this.children;
		if (children != null) {
			resultList = new ArrayList<ObjectReferenceChild>(resultDTO.getNewChildrenResultCellDTOs().size());
			for (ResultCellDTO childDTO : resultDTO.getNewChildrenResultCellDTOs()) {
				ObjectReferenceChild childObjectReferenceChild = new ObjectReferenceChildImpl(this, children.size(), childDTO);
				children.add(childObjectReferenceChild);
				resultList.add(childObjectReferenceChild);
			}
		}

		if (resultDTO.getNewOwnerResultCellDTO() != null) {
			this.resultCellObjectRefDTO = (ResultCellObjectRefDTO) resultDTO.getNewOwnerResultCellDTO();
		}
		return resultList;
	}
}
