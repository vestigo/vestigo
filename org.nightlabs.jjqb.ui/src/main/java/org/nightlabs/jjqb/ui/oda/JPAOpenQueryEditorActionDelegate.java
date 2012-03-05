package org.nightlabs.jjqb.ui.oda;

import org.nightlabs.jjqb.ui.editor.JPAQueryEditor;

public class JPAOpenQueryEditorActionDelegate extends AbstractOpenQueryEditorActionDelegate {

	@Override
	protected String getEditorID() {
		return JPAQueryEditor.EDITOR_ID;
	}

	@Override
	protected String getFileExtension() {
		return "jpql";
	}

}
