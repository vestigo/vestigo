package org.nightlabs.jjqb.ui.oda.property;

import org.eclipse.jface.preference.IPreferencePageContainer;
import org.eclipse.jface.resource.ImageDescriptor;

public interface IDataSourceEditorPageContainer extends IPreferencePageContainer
{
	void setImageDescriptor(ImageDescriptor imageDescriptor);
//	void setTitle(String title);
//	void setDescription(String description);
//	void setMessage(String newMessage, int newType);
//	void setErrorMessage(String newMessage);

	void testConnection();
}
