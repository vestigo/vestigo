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
package org.nightlabs.vestigo.ui.editor;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.BadPositionCategoryException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.IDocumentPartitioningListener;
import org.eclipse.jface.text.IPositionUpdater;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Position;

public class PerformSaveDocument
implements IDocument
{
	private IDocument delegate;
	private String appendText;

	public PerformSaveDocument(IDocument delegate, String appendText) {
		this.delegate = delegate;
		this.appendText = appendText;
	}

	@Override
	public char getChar(int offset) throws BadLocationException {
		return delegate.getChar(offset);
	}

	@Override
	public int getLength() {
		return delegate.getLength() + appendText.length();
	}

	@Override
	public String get() {
		return delegate.get() + appendText;
	}

	@Override
	public String get(int offset, int length) throws BadLocationException {
		return delegate.get(offset, length);
	}

	@Override
	public void set(String text) {
		delegate.set(text);
	}

	@Override
	public void replace(int offset, int length, String text)
			throws BadLocationException {
		delegate.replace(offset, length, text);
	}

	@Override
	public void addDocumentListener(IDocumentListener listener) {
		delegate.addDocumentListener(listener);
	}

	@Override
	public void removeDocumentListener(IDocumentListener listener) {
		delegate.removeDocumentListener(listener);
	}

	@Override
	public void addPrenotifiedDocumentListener(IDocumentListener documentAdapter) {
		delegate.addPrenotifiedDocumentListener(documentAdapter);
	}

	@Override
	public void removePrenotifiedDocumentListener(
			IDocumentListener documentAdapter) {
		delegate.removePrenotifiedDocumentListener(documentAdapter);
	}

	@Override
	public void addPositionCategory(String category) {
		delegate.addPositionCategory(category);
	}

	@Override
	public void removePositionCategory(String category)
			throws BadPositionCategoryException {
		delegate.removePositionCategory(category);
	}

	@Override
	public String[] getPositionCategories() {
		return delegate.getPositionCategories();
	}

	@Override
	public boolean containsPositionCategory(String category) {
		return delegate.containsPositionCategory(category);
	}

	@Override
	public void addPosition(Position position) throws BadLocationException {
		delegate.addPosition(position);
	}

	@Override
	public void removePosition(Position position) {
		delegate.removePosition(position);
	}

	@Override
	public void addPosition(String category, Position position) throws BadLocationException, BadPositionCategoryException {
		delegate.addPosition(category, position);
	}

	@Override
	public void removePosition(String category, Position position) throws BadPositionCategoryException {
		delegate.removePosition(category, position);
	}

	@Override
	public Position[] getPositions(String category)
			throws BadPositionCategoryException {
		return delegate.getPositions(category);
	}

	@Override
	public boolean containsPosition(String category, int offset, int length) {
		return delegate.containsPosition(category, offset, length);
	}

	@Override
	public int computeIndexInCategory(String category, int offset)
			throws BadLocationException, BadPositionCategoryException {
		return delegate.computeIndexInCategory(category, offset);
	}

	@Override
	public void addPositionUpdater(IPositionUpdater updater) {
		delegate.addPositionUpdater(updater);
	}

	@Override
	public void removePositionUpdater(IPositionUpdater updater) {
		delegate.removePositionUpdater(updater);
	}

	@Override
	public void insertPositionUpdater(IPositionUpdater updater, int index) {
		delegate.insertPositionUpdater(updater, index);
	}

	@Override
	public IPositionUpdater[] getPositionUpdaters() {
		return delegate.getPositionUpdaters();
	}

	@Override
	public String[] getLegalContentTypes() {
		return delegate.getLegalContentTypes();
	}

	@Override
	public String getContentType(int offset) throws BadLocationException {
		return delegate.getContentType(offset);
	}

	@Override
	public ITypedRegion getPartition(int offset) throws BadLocationException {
		return delegate.getPartition(offset);
	}

	@Override
	public ITypedRegion[] computePartitioning(int offset, int length) throws BadLocationException {
		return delegate.computePartitioning(offset, length);
	}

	@Override
	public void addDocumentPartitioningListener(
			IDocumentPartitioningListener listener) {
		delegate.addDocumentPartitioningListener(listener);
	}

	@Override
	public void removeDocumentPartitioningListener(
			IDocumentPartitioningListener listener) {
		delegate.removeDocumentPartitioningListener(listener);
	}

	@Override
	public void setDocumentPartitioner(IDocumentPartitioner partitioner) {
		delegate.setDocumentPartitioner(partitioner);
	}

	@Override
	public IDocumentPartitioner getDocumentPartitioner() {
		return delegate.getDocumentPartitioner();
	}

	@Override
	public int getLineLength(int line) throws BadLocationException {
		return delegate.getLineLength(line);
	}

	@Override
	public int getLineOfOffset(int offset) throws BadLocationException {
		return delegate.getLineOfOffset(offset);
	}

	@Override
	public int getLineOffset(int line) throws BadLocationException {
		return delegate.getLineOffset(line);
	}

	@Override
	public IRegion getLineInformation(int line) throws BadLocationException {
		return delegate.getLineInformation(line);
	}

	@Override
	public IRegion getLineInformationOfOffset(int offset) throws BadLocationException {
		return delegate.getLineInformationOfOffset(offset);
	}

	@Override
	public int getNumberOfLines() {
		return delegate.getNumberOfLines();
	}

	@Override
	public int getNumberOfLines(int offset, int length) throws BadLocationException {
		return delegate.getNumberOfLines(offset, length);
	}

	@Override
	public int computeNumberOfLines(String text) {
		return delegate.computeNumberOfLines(text);
	}

	@Override
	public String[] getLegalLineDelimiters() {
		return delegate.getLegalLineDelimiters();
	}

	@Override
	public String getLineDelimiter(int line) throws BadLocationException {
		return delegate.getLineDelimiter(line);
	}

	@Override
	public int search(int startOffset, String findString, boolean forwardSearch, boolean caseSensitive, boolean wholeWord) throws BadLocationException {
		return delegate.search(startOffset, findString, forwardSearch,
				caseSensitive, wholeWord);
	}


}
