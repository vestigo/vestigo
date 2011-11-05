package org.nightlabs.eclipse.jjqb.childvm.webapp.model;

import java.util.Collection;

import javax.jdo.JDOHelper;
import javax.jdo.identity.SingleFieldIdentity;

import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellPersistentObjectRefDTO;
import org.nightlabs.eclipse.jjqb.childvm.shared.ResultCellSimpleDTO;

public class JDOResultSet extends ResultSet {

	public JDOResultSet(Connection connection, Collection<?> rows) {
		super(connection, rows);
	}

	@Override
	protected ResultCellDTO nullOrNewImplementationSpecificResultCellDTO(Object object)
	{
		// SingleFieldIdentity instances can be loaded in the Eclipse-plugin and displayed directly in the editor.
		if (object instanceof SingleFieldIdentity)
			return new ResultCellSimpleDTO(object);

		// Check, if it's a JDO object, and if so, return a reference to it.
		Object objectID = JDOHelper.getObjectId(object);
		if (objectID != null)
			return new ResultCellPersistentObjectRefDTO(object.getClass(), objectID.toString());

		// Nothing JDO-specific => don't handle it => return null.
		return null;
	}
}
