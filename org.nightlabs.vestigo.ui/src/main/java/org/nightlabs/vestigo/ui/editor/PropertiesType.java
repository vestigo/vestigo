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
package org.nightlabs.vestigo.ui.editor;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public enum PropertiesType
{
	/**
	 * Properties for all editors no matter what editor-type (stored in the preference-store).
	 */
	global,

	/**
	 * Properties for all editors of one type stored in the preference-store.
	 * <p>
	 * Uses the qualified class-name of the <code>QueryEditorManager</code>-implementation as part of the properties-scope and is thus
	 * global for all editors of the same type (i.e. all JDO editors share one set of properties and
	 * all JPA editors share another set of properties).
	 */
	editorType,

	/**
	 * Properties for one specific editor stored inside the edited file.
	 * <p>
	 * If the edited file is copied to another workspace or even another computer, these properties
	 * are still present.
	 */
	editor_file,

	/**
	 * Properties for one specific editor stored in the preference-store.
	 */
	editor_preferenceStore
}
