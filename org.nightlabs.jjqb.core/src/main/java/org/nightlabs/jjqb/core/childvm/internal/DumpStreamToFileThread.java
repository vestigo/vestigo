package org.nightlabs.jjqb.core.childvm.internal;

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
final class DumpStreamToFileThread extends Thread
{
	private final Logger logger = LoggerFactory.getLogger(DumpStreamToFileThread.class);
	private InputStream inputStream;
	private File outputFile;
	private OutputStream outputStream;
	private volatile boolean ignoreErrors = false;
	private volatile boolean forceInterrupt = false;

	private LogDumpedStreamThread logDumpedStreamThread = new LogDumpedStreamThread();

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

	public DumpStreamToFileThread(InputStream inputStream, File outputFile) throws IOException
	{
		if (inputStream == null)
			throw new IllegalArgumentException("inputStream == null");
		if (outputFile == null)
			throw new IllegalArgumentException("outputFile == null");

		this.inputStream = inputStream;
		this.outputFile = outputFile;
		this.outputStream = new FileOutputStream(this.outputFile);
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
						logger.error("run: " + e, e);
					else
						logger.info("run: " + e);

					return;
				}
			}
		} finally {
			logDumpedStreamThread.interrupt();
		}
	}
}