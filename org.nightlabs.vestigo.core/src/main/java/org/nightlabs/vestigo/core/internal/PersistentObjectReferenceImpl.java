package org.nightlabs.vestigo.core.internal;

import org.nightlabs.vestigo.childvm.shared.dto.ResultCellObjectRefDTO;
import org.nightlabs.vestigo.core.PersistentObjectReference;
import org.nightlabs.vestigo.core.oda.ResultSet;

public class PersistentObjectReferenceImpl extends ObjectReferenceImpl implements PersistentObjectReference {

	public PersistentObjectReferenceImpl(ResultSet resultSet, ResultCellObjectRefDTO resultCellObjectRefDTO)
	{
		super(resultSet, resultCellObjectRefDTO);
	}

}
