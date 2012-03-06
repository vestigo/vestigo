package org.nightlabs.jjqb.ui.editor;

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
