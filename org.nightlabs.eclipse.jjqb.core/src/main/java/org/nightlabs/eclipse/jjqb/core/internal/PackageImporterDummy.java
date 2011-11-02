package org.nightlabs.eclipse.jjqb.core.internal;


public class PackageImporterDummy
{
	// BEGIN javax.jdo.* - should contain all sub-packages!
	javax.jdo.annotations.Cacheable cacheable;
	javax.jdo.datastore.JDOConnection jdoConnection;
	javax.jdo.identity.IntIdentity intIdentity;
	javax.jdo.listener.AttachCallback attachCallback;
	javax.jdo.metadata.ArrayMetadata arrayMetadata;
	javax.jdo.spi.JDOPermission permission;
	// END javax.jdo.* - should contain all sub-packages!

	// BEGIN org.osgi.* - some sub-packages
	org.osgi.framework.Bundle bundle;
	// END org.osgi.* - some sub-packages

// Jersey stuff is not necessary here - the problem was that the jersey bundles where not started (they need an explicit start).
//	// BEGIN com.sun.jersey.* - should contain all sub-packages!
//	com.sun.jersey.core.header.AcceptableLanguageTag jersey_AcceptableLanguageTag;
//	com.sun.jersey.core.header.reader.HttpHeaderReader jersey_HttpHeaderReader;
//	com.sun.jersey.core.impl.provider.entity.StringProvider jersey_StringProvider;
//	com.sun.jersey.core.impl.provider.header.LocaleProvider jersey_LocaleProvider;
//	com.sun.jersey.core.impl.provider.xml.SAXParserContextProvider jersey_SAXParserContextProvider;
//	com.sun.jersey.core.osgi.Activator jersey_Activator;
//	com.sun.jersey.core.provider.AbstractMessageReaderWriterProvider<?> jersey_AbstractMessageReaderWriterProvider;
//	com.sun.jersey.core.provider.jaxb.AbstractJAXBElementProvider jersey_AbstractJAXBElementProvider;
//	com.sun.jersey.core.reflection.AnnotatedMethod jersey_AnnotatedMethod;
//	com.sun.jersey.core.spi.component.AnnotatedContext jersey_AnnotatedContext;
//	com.sun.jersey.core.spi.component.ioc.IoCComponentProcessor jersey_IoCComponentProcessor;
//	com.sun.jersey.core.spi.factory.AbstractRuntimeDelegate jersey_AbstractRuntimeDelegate;
//	com.sun.jersey.core.spi.scanning.FilesScanner jersey_FilesScanner;
//	com.sun.jersey.core.spi.scanning.uri.BundleSchemeScanner jersey_BundleSchemeScanner;
//	com.sun.jersey.core.util.Base64 jersey_Base64;
//	// END com.sun.jersey.* - should contain all sub-packages!
}
