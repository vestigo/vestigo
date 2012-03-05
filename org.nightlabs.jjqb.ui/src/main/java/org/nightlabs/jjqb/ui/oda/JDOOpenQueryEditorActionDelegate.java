package org.nightlabs.jjqb.ui.oda;

import org.nightlabs.jjqb.ui.editor.JDOQueryEditor;

public class JDOOpenQueryEditorActionDelegate extends AbstractOpenQueryEditorActionDelegate {

	@Override
	protected String getEditorID() {
		return JDOQueryEditor.EDITOR_ID;
	}

	@Override
	protected String getFileExtension() {
		return "jdoql";
	}

}
