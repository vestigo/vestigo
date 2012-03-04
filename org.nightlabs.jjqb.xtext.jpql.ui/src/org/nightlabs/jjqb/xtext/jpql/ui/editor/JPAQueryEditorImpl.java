package org.nightlabs.jjqb.xtext.jpql.ui.editor;

import org.nightlabs.jjqb.ui.editor.AbstractQueryEditor;
import org.nightlabs.jjqb.ui.editor.JPAQueryEditor;
import org.nightlabs.jjqb.ui.editor.JPAQueryEditorManager;
import org.nightlabs.jjqb.ui.editor.QueryEditorManager;

import com.google.inject.Injector;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class JPAQueryEditorImpl
extends AbstractQueryEditor
implements JPAQueryEditor
{
	@Override
	protected QueryEditorManager createQueryEditorManager() {
		return new JPAQueryEditorManager(this);
	}

	@Override
	protected Injector getInjector() {
		return org.nightlabs.jjqb.xtext.jpql.ui.internal.JPQLActivator.getInstance().getInjector("org.nightlabs.jjqb.xtext.jpql.JPQL");
	}
}
