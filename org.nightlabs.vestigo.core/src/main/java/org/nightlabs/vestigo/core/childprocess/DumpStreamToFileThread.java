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
package org.nightlabs.vestigo.core.childprocess;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class DumpStreamToFileThread extends Thread
{
	private final Logger logger = LoggerFactory.getLogger(DumpStreamToFileThread.class);
	private InputStream inputStream;
	private File outputFile;
	private OutputStream outputStream;
	private volatile boolean ignoreErrors = false;
	private volatile boolean forceInterrupt = false;
	private LogDumpedStreamThread logDumpedStreamThread;

	public void setIgnoreErrors(boolean ignoreErrors) {
		this.ignoreErrors = ignoreErrors;
	}

	@Override
	public void interrupt() {
		forceInterrupt = true;
		super.interrupt();
	}

	@Override
	public boolean isInterrupted() {
		return forceInterrupt || super.isInterrupted();
	}

	public DumpStreamToFileThread(InputStream inputStream, File outputFile, String childProcessLoggerName) throws IOException
	{
		if (inputStream == null)
			throw new IllegalArgumentException("inputStream == null"); //$NON-NLS-1$
		if (outputFile == null)
			throw new IllegalArgumentException("outputFile == null"); //$NON-NLS-1$

		this.inputStream = inputStream;
		this.outputFile = outputFile;
		this.outputStream = new FileOutputStream(this.outputFile);
		this.logDumpedStreamThread = new LogDumpedStreamThread(childProcessLoggerName);
	}

	@Override
	public synchronized void start() {
		logDumpedStreamThread.start();
		super.start();
	}

	@Override
	public void run() {
		try {
			final byte[] buffer = new byte[10240];
			while (!isInterrupted()) {
				try {
					int bytesRead = inputStream.read(buffer);
					if (bytesRead > 0) {
						outputStream.write(buffer, 0, bytesRead);
						logDumpedStreamThread.write(buffer, bytesRead);
					}
				} catch (Throwable e) {
					if (!ignoreErrors)
						logger.error("run: " + e, e); //$NON-NLS-1$
					else
						logger.info("run: " + e); //$NON-NLS-1$

					return;
				}
			}
		} finally {
			logDumpedStreamThread.interrupt();
			try {
				outputStream.close();
			} catch (IOException e) {
				logger.warn("run: outputStream.close() failed: " + e, e); //$NON-NLS-1$
			}
		}
	}

	public void setOutputStringBuffer(StringBuffer outputStringBuffer) {
		logDumpedStreamThread.setOutputStringBuffer(outputStringBuffer);
	}
	public StringBuffer getOutputStringBuffer() {
		return logDumpedStreamThread.getOutputStringBuffer();
	}
	public void setOutputStringBufferMaxLength(int outputStringBufferMaxLength) {
		logDumpedStreamThread.setOutputStringBufferMaxLength(outputStringBufferMaxLength);
	}
	public int getOutputStringBufferMaxLength() {
		return logDumpedStreamThread.getOutputStringBufferMaxLength();
	}
	public void flushBuffer() {
		logDumpedStreamThread.flushBuffer();
	}
}