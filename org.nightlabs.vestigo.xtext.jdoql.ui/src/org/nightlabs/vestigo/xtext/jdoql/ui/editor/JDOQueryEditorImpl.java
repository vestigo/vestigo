package org.nightlabs.vestigo.xtext.jdoql.ui.editor;

import org.nightlabs.vestigo.ui.editor.AbstractQueryEditor;
import org.nightlabs.vestigo.ui.editor.JDOQueryEditor;
import org.nightlabs.vestigo.ui.editor.JDOQueryEditorManager;
import org.nightlabs.vestigo.ui.editor.QueryEditorManager;

import com.google.inject.Injector;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JDOQueryEditorImpl
extends AbstractQueryEditor
implements JDOQueryEditor
{
	@Override
	protected QueryEditorManager createQueryEditorManager() {
		return new JDOQueryEditorManager(this);
	}

	@Override
	protected Injector getInjector() {
		return org.nightlabs.vestigo.xtext.jdoql.ui.internal.JDOQLActivator.getInstance().getInjector("org.nightlabs.vestigo.xtext.jdoql.JDOQL");
	}
}
