package org.nightlabs.jjqb.core.oda;

import org.eclipse.datatools.connectivity.oda.IResultSet;
import org.eclipse.datatools.connectivity.oda.IResultSetMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.childvm.shared.ResultCellDTO;
import org.nightlabs.jjqb.childvm.shared.ResultCellNullDTO;
import org.nightlabs.jjqb.childvm.shared.ResultCellSimpleDTO;
import org.nightlabs.jjqb.childvm.shared.ResultSetID;
import org.nightlabs.jjqb.core.ObjectReference;

public interface ResultSet extends IResultSet
{
	Query getQuery();

	ResultSetID getResultSetID();

	void setResultSetID(ResultSetID resultSetID);

	/**
	 * {@inheritDoc}
	 * <p>
	 * Important: This is a potentially long-running operation which should be executed asynchronously (in a job).
	 * </p>
	 */
	@Override
	IResultSetMetaData getMetaData() throws OdaException;

	/**
	 * {@inheritDoc}
	 * <p>
	 * Important: This is a potentially long-running operation which should be executed asynchronously (in a job).
	 * </p>
	 */
	@Override
	void close() throws OdaException;

	/**
	 * <p>
	 * Get the object represented by the given <code>resultCellDTO</code>.
	 * </p><p>
	 * This might be <code>null</code> (in case of a {@link ResultCellNullDTO}), a simple java object
	 * (everything that is serializable and that the backend implementation decides to send to us)
	 * (in case of a {@link ResultCellSimpleDTO}) or an {@link ObjectReference}, if the real object
	 * cannot or should not be transferred to the parent-VM.
	 * </p>
	 * @param resultCellDTO an instance of a subclass of <code>ResultCellDTO</code>. Never <code>null</code>.
	 * @return the object represented by the given <code>resultCellDTO</code>.
	 */
	Object unmaskResultCellDTO(ResultCellDTO resultCellDTO);
}
