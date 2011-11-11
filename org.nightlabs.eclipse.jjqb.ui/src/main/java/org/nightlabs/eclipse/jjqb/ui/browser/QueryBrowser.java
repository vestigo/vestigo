package org.nightlabs.eclipse.jjqb.ui.browser;

import java.util.UUID;

public interface QueryBrowser
{
	String getQueryText();

	void setQueryText(String queryText);

	UUID getQueryID();

	ExecuteQueryCallback getExecuteQueryCallback();

	void loadNextActionTriggered(LoadNextActionEvent loadNextActionEvent);
}
