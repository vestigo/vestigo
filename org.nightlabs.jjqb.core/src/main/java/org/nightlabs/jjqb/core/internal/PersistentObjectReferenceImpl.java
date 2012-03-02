package org.nightlabs.jjqb.core.internal;

import org.nightlabs.jjqb.childvm.shared.dto.ResultCellObjectRefDTO;
import org.nightlabs.jjqb.core.PersistentObjectReference;
import org.nightlabs.jjqb.core.oda.ResultSet;

public class PersistentObjectReferenceImpl extends ObjectReferenceImpl implements PersistentObjectReference {

	public PersistentObjectReferenceImpl(ResultSet resultSet, ResultCellObjectRefDTO resultCellObjectRefDTO)
	{
		super(resultSet, resultCellObjectRefDTO);
	}

}
