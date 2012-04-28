/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
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
