package org.nightlabs.eclipse.jjqb.ui.browser;

public interface QueryBrowser
{
	ExecuteQueryCallback getExecuteQueryCallback();

	void loadNextActionTriggered(LoadNextActionEvent loadNextActionEvent);
}
