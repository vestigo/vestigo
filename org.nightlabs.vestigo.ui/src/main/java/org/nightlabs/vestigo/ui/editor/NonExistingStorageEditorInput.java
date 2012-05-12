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
/**
 *
 */
package org.nightlabs.vestigo.ui.editor;

import java.io.InputStream;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.IFileSystem;
import org.eclipse.core.internal.filesystem.NullFileStore;
import org.eclipse.core.resources.IEncodedStorage;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.internal.editors.text.NonExistingFileEditorInput;
import org.nightlabs.util.IOUtil;

/**
 * @author Alexander Bieber <!-- bieber [at] nightlabs [DOT] de -->
 */
public class NonExistingStorageEditorInput
extends NonExistingFileEditorInput
implements IStorageEditorInput
{
	public class NonExistingStorage extends PlatformObject implements IEncodedStorage {

		@Override
		public boolean isReadOnly() {
			return false;
		}

		@Override
		public String getName() {
			return NonExistingStorageEditorInput.this.getName();
		}

		@Override
		public IPath getFullPath() {
			return NonExistingStorageEditorInput.this.getPath(NonExistingStorageEditorInput.this);
		}

		@Override
		public InputStream getContents() throws CoreException {
			return fileStore.openInputStream(EFS.NONE, new NullProgressMonitor());
		}

		@Override
		public String getCharset() throws CoreException {
			return IOUtil.CHARSET_NAME_UTF_8;
		}
	}

	private IFileStore fileStore;
	private NonExistingStorage storage;
	private String fileExtension;

	protected NonExistingStorageEditorInput(IFileStore fileStore, String namePrefix, String fileExtension) {
		super(fileStore, namePrefix);
		this.fileStore = fileStore;
		this.fileExtension = fileExtension;
		this.storage = new NonExistingStorage();
	}

	/**
	 * @param namePrefix
	 */
	public NonExistingStorageEditorInput(String namePrefix, String extension) {
		this(createFileStore(), namePrefix, extension);
	}

	private static NullFileStore createFileStore() {
		return new NullFileStore(new Path("")) { //$NON-NLS-1$
			@Override
			public IFileSystem getFileSystem() {
				return EFS.getLocalFileSystem();
			}
		};
	}

	@Override
	public String getName() {
		return super.getName() + "." + fileExtension; //$NON-NLS-1$
	}

	@Override
	public IStorage getStorage() throws CoreException {
		return storage;
	}

	@Override
	public boolean equals(Object o) {
		return this == o;
	}
}
