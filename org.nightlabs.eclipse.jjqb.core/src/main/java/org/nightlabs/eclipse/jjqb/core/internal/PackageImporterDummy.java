package org.nightlabs.eclipse.jjqb.core.internal;

import javax.jdo.annotations.Cacheable;
import javax.jdo.datastore.JDOConnection;
import javax.jdo.identity.IntIdentity;
import javax.jdo.listener.AttachCallback;
import javax.jdo.metadata.ArrayMetadata;
import javax.jdo.spi.JDOPermission;

public class PackageImporterDummy
{
	Cacheable cacheable;
	JDOConnection jdoConnection;
	IntIdentity intIdentity;
	AttachCallback attachCallback;
	ArrayMetadata arrayMetadata;
	JDOPermission permission;
}
