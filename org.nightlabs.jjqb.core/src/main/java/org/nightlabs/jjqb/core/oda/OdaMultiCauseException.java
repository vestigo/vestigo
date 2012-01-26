package org.nightlabs.jjqb.core.oda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.datatools.connectivity.oda.OdaException;

public class OdaMultiCauseException extends OdaException
{
	private List<Throwable> causes;

	private static final long serialVersionUID = 1L;

	public OdaMultiCauseException(List<Throwable> causes) {
		super(causes == null ? null : (causes.isEmpty() ? null : causes.get(0)));
		this.causes = Collections.unmodifiableList(causes == null ? new ArrayList<Throwable>(0) : new ArrayList<Throwable>(causes));
	}

	/**
	 * Get the list of causes. If there is no cause, an empty list will be returned.
	 * @return the list of causes. Never <code>null</code>. This list is read-only.
	 */
	public List<Throwable> getCauses() {
		return causes;
	}
}
