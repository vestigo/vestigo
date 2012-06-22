package org.nightlabs.vestigo.core.oda;

import org.nightlabs.vestigo.childvm.shared.api.ChildVM;


public interface PersistableProperty
extends Comparable<PersistableProperty>
{
	PersistableClass getPersistableClass();

	String getName();

	String getType();

	ChildVM getChildVM();
}
