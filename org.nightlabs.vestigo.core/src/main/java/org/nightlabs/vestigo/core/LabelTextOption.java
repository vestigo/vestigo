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
package org.nightlabs.vestigo.core;

/**
 * Option controlling how various <code>getLabelText(Set&lt;LabelTextOption&gt;)</code> methods behave.
 *
 * @see ObjectReference#getLabelText(java.util.Set)
 * @see ObjectReferenceChild#getLabelText(java.util.Set)
 *
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public enum LabelTextOption
{
	/**
	 * Display the package name whenever a java type name is shown. In other words: If this option is given,
	 * fully qualified class names are displayed. If this option is not given, the type's simple name is shown instead.
	 */
	showPackageName,

	/**
	 * Display persistent identifiers. If this option is not given, they are hidden.
	 */
	showPersistentID,

	/**
	 * Display transient identifiers. If this option is not given, they are hidden.
	 */
	showTransientID,

	/**
	 * Show the field's declared type before the field's name whenever a field is displayed.
	 * If this option is not given, the type is hidden. If the type is shown, it depends on
	 * {@link #showPackageName}, whether the simple name or the fully qualified name is displayed.
	 * @see #showInstanceType
	 */
	showFieldType,

	/**
	 * Show the instance's type (which might be a subclass of the {@link #showFieldType field's declared type}).
	 */
	showInstanceType,

	/**
	 * Determine whether the {@link ObjectReference#getObjectToString()} result shall be displayed.
	 * Simple objects (that are not referenced via an {@link ObjectReference} but instead transferred
	 * from the child-VM to the main-VM) are not affected by this option.
	 */
	showObjectToString
}
