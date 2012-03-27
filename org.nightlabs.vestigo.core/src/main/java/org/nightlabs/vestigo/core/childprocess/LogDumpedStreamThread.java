package org.nightlabs.vestigo.core.childprocess;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;

import org.nightlabs.util.IOUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDumpedStreamThread extends Thread
{
	private static final Logger logger = LoggerFactory.getLogger(LogDumpedStreamThread.class);

	/**
	 * If the first data which arrived here via {@link #write(byte[], int)} have not yet been written
	 * after this time (i.e. their age exceeds this time) in milliseconds, it is logged.
	 */
	private static final long logMaxAge = 5000L;

	/**
	 * If there was no write after this many milliseconds, the current buffer is logged.
	 */
	private static final long logAfterNoWritePeriod = 500L;

	/**
	 * If the buffer grows bigger than this size in bytes, it is logged - no matter when the last
	 * write occured.
	 */
	private static final int logWhenBufferExceedsSize = 50 * 1024; // 50 KB

	private ByteArrayOutputStream bufferOutputStream = new ByteArrayOutputStream();
	private volatile boolean forceInterrupt = false;
	private Long firstNonLoggedWriteTimestamp = null;
	private long lastWriteTimestamp = 0;

	private volatile StringBuffer outputStringBuffer;
	private volatile int outputStringBufferMaxLength = 1024 * 1024;

	public void write(byte[] data, int length)
	{
		if (data == null)
			throw new IllegalArgumentException("data == null");

		synchronized (bufferOutputStream) {
			bufferOutputStream.write(data, 0, length);
			lastWriteTimestamp = System.currentTimeMillis();
			if (firstNonLoggedWriteTimestamp == null)
				firstNonLoggedWriteTimestamp = lastWriteTimestamp;
		}
	}

	public void setOutputStringBuffer(StringBuffer outputStringBuffer) {
		this.outputStringBuffer = outputStringBuffer;
	}
	public StringBuffer getOutputStringBuffer() {
		return outputStringBuffer;
	}
	public void setOutputStringBufferMaxLength(int outputStringBufferMaxLength) {
		this.outputStringBufferMaxLength = outputStringBufferMaxLength;
	}
	public int getOutputStringBufferMaxLength() {
		return outputStringBufferMaxLength;
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

	@Override
	public void run() {
		while (!isInterrupted()) {
			try {
				synchronized (bufferOutputStream) {
					try {
						bufferOutputStream.wait(500L);
					} catch (InterruptedException x) {
						doNothing();
					}

					processBuffer(false);
				}
			} catch (Throwable e) {
				logger.error("run: " + e, e);
			}
		}
		processBuffer(true);
	}

	protected void processBuffer(boolean force)
	{
		synchronized (bufferOutputStream) {
			if (bufferOutputStream.size() > 0) {
				long firstNonLoggedWriteAge = firstNonLoggedWriteTimestamp == null ? 0 : System.currentTimeMillis() - firstNonLoggedWriteTimestamp;
				long noWritePeriod = System.currentTimeMillis() - lastWriteTimestamp;
				if (force || firstNonLoggedWriteAge > logMaxAge || noWritePeriod > logAfterNoWritePeriod || bufferOutputStream.size() > logWhenBufferExceedsSize) {
					String currentBufferString;
					try {
						currentBufferString = bufferOutputStream.toString(IOUtil.CHARSET_NAME_UTF_8);
					} catch (UnsupportedEncodingException e) {
						throw new RuntimeException(e);
					}

					StringBuffer outputStringBuffer = getOutputStringBuffer();
					if (outputStringBuffer != null) {
						int newOutputStringBufferLength = outputStringBuffer.length() + currentBufferString.length();
						if (newOutputStringBufferLength > outputStringBufferMaxLength) {
							int lastCharPositionToDelete = newOutputStringBufferLength - outputStringBufferMaxLength;
							// search for first line-break
							while (outputStringBuffer.length() > lastCharPositionToDelete && outputStringBuffer.charAt(lastCharPositionToDelete) != '\n')
								++lastCharPositionToDelete;

							lastCharPositionToDelete = Math.min(lastCharPositionToDelete, outputStringBuffer.length() - 1);
							outputStringBuffer.delete(0, lastCharPositionToDelete + 1);
						}

						outputStringBuffer.append(currentBufferString);
					}

					logger.info(
							'\n' + prefixEveryLine(currentBufferString)
							);

					bufferOutputStream.reset();
				}
			}
		}
	}

	private static final void doNothing() { }

	private String prefixEveryLine(String s)
	{
		try {
			StringBuilder result = new StringBuilder();
			final String prefix = "  >>> ";
			BufferedReader r = new BufferedReader(new StringReader(s));
			String line;
			while (null != (line = r.readLine()))
				result.append(prefix).append(line).append('\n');

			return result.toString();
		} catch (IOException x) {
			throw new RuntimeException(x);
		}
	}
}
