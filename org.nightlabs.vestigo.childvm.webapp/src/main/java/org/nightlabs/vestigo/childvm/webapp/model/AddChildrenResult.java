package org.nightlabs.vestigo.childvm.webapp.model;

import java.util.List;

public class AddChildrenResult {
	public Object oldOwner;
	/**
	 * Usually the same as {@link #oldOwner}, but it may be different, if the owner is an array
	 * since an array must be replaced in order to remove an element from it.
	 */
	public Object newOwner;

	public List<?> newChildren;
}
