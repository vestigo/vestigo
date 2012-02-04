package org.nightlabs.jjqb.ui.detailtree;

public interface ChildrenLoadedListener {

	/**
	 * Callback method triggered on the SWT UI thread, after the children of a certain
	 * {@link ChildrenLoadedEvent#getParentNode() parentNode} were loaded.
	 * @param event the event's details.
	 */
	void childrenLoaded(ChildrenLoadedEvent event);

}
