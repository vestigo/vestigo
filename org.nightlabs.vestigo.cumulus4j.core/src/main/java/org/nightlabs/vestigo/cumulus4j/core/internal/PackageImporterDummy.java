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
package org.nightlabs.vestigo.cumulus4j.core.internal;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class PackageImporterDummy
{
	// BEGIN javax.jdo.* - should contain all sub-packages!
	// Though we use a ChildVM, we need to be able to load at least some javax.jdo.* classes here, too,
	// in order to deserialize e.g. javax.jdo.identity.LongIdentity and other identifiers.
	javax.jdo.annotations.Cacheable jdo_Cacheable;
	javax.jdo.datastore.JDOConnection jdo_JDOConnection;
	javax.jdo.identity.IntIdentity jdo_IntIdentity;
	javax.jdo.listener.AttachCallback jdo_AttachCallback;
	javax.jdo.metadata.ArrayMetadata jdo_ArrayMetadata;
	javax.jdo.spi.JDOPermission jdo_JDOPermission;
	// END javax.jdo.* - should contain all sub-packages!

	// BEGIN javax.persistence.* - should contain all sub-packages!
	javax.persistence.EntityManager jpa_EntityManager;
	javax.persistence.criteria.AbstractQuery<Object> jpa_AbstractQuery;
	javax.persistence.metamodel.Attribute<Object, Object> jpa_Attribute;
	javax.persistence.spi.ClassTransformer jpa_ClassTransformer;
	// END javax.persistence.* - should contain all sub-packages!

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
