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
package org.nightlabs.vestigo.childvm.webapp.asm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassAnnotationReader implements ClassVisitor
{
	private static final Logger logger = LoggerFactory.getLogger(ClassAnnotationReader.class);

	protected String className;
	protected Set<String> classAnnotations;

	public void read(File file) throws IOException
	{
		InputStream in = new FileInputStream(file);
		try {
			read(in);
		} finally {
			in.close();
		}
	}

	public void read(InputStream in) throws IOException
	{
		className = null;
		classAnnotations = new HashSet<String>();
		ClassReader r = new ClassReader(in);
    r.accept(this, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
	}

	@Override
	public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
		logger.debug("visit: name={}", name);
		this.className = rawNameToBinaryName(name);
	}

	@Override
	public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
		logger.debug("visitAnnotation: desc={}", desc);
		classAnnotations.add(descToBinaryName(desc));
//		return classAnnotationVisitor;
		return null;
	}

//	private AnnotationVisitor classAnnotationVisitor = new AnnotationVisitor() {
//
//		@Override
//		public void visitEnum(String name, String desc, String value) { }
//
//		@Override
//		public void visitEnd() { }
//
//		@Override
//		public AnnotationVisitor visitArray(String name) {
//			return null;
//		}
//
//		@Override
//		public AnnotationVisitor visitAnnotation(String name, String desc) {
//			// By default, we only read top-level-annotations, because the JDO+JPA annotations we are interested in must all be top-level.
//			// This way is more efficient, because we skip everything that we don't need to read.
//			// If a subclass of ConnectionProfile needs a different reader, it may override getClassAnnotationReader().
//			logger.debug("classAnnotationVisitor.visitAnnotation: name={} desc={}", name, desc);
//			classAnnotations.add(rawNameToBinaryName(name));
//			return null;
//		}
//
//		@Override
//		public void visit(String name, Object value) {
//			logger.debug("classAnnotationVisitor.visit: name={} value={}", name, value);
//		}
//	};

	private String descToBinaryName(String desc)
	{
		String origDesc = desc;

		if (desc.startsWith("L"))
			desc = desc.substring(1);
		else
			logger.warn("descToBinaryName: desc={} does not start with 'L'!", origDesc);

		if (desc.endsWith(";"))
			desc = desc.substring(0, desc.length() - 1);
		else
			logger.warn("descToBinaryName: desc={} does not end with ';'!", origDesc);

		return rawNameToBinaryName(desc);
	}

	private String rawNameToBinaryName(String rawName)
	{
		return rawName.replace('/', '.');
	}

	public String getClassName() {
		return className;
	}

	public Set<String> getClassAnnotations() {
		return classAnnotations;
	}

	@Override
	public void visitSource(String source, String debug) { }

	@Override
	public void visitOuterClass(String owner, String name, String desc) { }

	@Override
	public void visitAttribute(Attribute attr) { }

	@Override
	public void visitInnerClass(String name, String outerName, String innerName, int access) { }

	@Override
	public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
		return null;
	}

	@Override
	public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
		return null;
	}

	@Override
	public void visitEnd() { }
}
