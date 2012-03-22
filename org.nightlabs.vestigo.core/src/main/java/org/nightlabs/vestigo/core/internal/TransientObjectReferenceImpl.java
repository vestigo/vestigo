package org.nightlabs.vestigo.core.internal;

import org.nightlabs.vestigo.childvm.shared.dto.ResultCellObjectRefDTO;
import org.nightlabs.vestigo.core.TransientObjectReference;
import org.nightlabs.vestigo.core.oda.ResultSet;

public class TransientObjectReferenceImpl extends ObjectReferenceImpl implements TransientObjectReference {

	public TransientObjectReferenceImpl(ResultSet resultSet, ResultCellObjectRefDTO resultCellObjectRefDTO)
	{
		super(resultSet, resultCellObjectRefDTO);
	}

}
