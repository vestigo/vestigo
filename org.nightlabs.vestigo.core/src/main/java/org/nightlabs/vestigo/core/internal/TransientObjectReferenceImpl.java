package org.nightlabs.jjqb.core.internal;

import org.nightlabs.jjqb.childvm.shared.dto.ResultCellObjectRefDTO;
import org.nightlabs.jjqb.core.TransientObjectReference;
import org.nightlabs.jjqb.core.oda.ResultSet;

public class TransientObjectReferenceImpl extends ObjectReferenceImpl implements TransientObjectReference {

	public TransientObjectReferenceImpl(ResultSet resultSet, ResultCellObjectRefDTO resultCellObjectRefDTO)
	{
		super(resultSet, resultCellObjectRefDTO);
	}

}
