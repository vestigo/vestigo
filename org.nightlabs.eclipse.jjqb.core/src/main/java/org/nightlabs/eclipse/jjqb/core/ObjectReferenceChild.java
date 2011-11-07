package org.nightlabs.eclipse.jjqb.core;

public interface ObjectReferenceChild
{
	ObjectReference getOwner();
	String getFieldName();
	Object getValue();
}
