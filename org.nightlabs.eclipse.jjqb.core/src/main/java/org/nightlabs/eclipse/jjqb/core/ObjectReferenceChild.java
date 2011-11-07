package org.nightlabs.eclipse.jjqb.core;

public interface ObjectReferenceChild
{
	ObjectReference getOwner();
	String getFieldDeclaringClassName();
	String getFieldName();
	Object getValue();
}
