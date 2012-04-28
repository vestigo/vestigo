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
package org.nightlabs.vestigo.childvm.webapp.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class StringUtil
{
	protected StringUtil() { }

	public static final String toJavaSourceCode(String original)
	{
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new StringReader(escapeForJavaSourceCode(original)));
		String line;
		try {
			while (null != (line = br.readLine())) {
				if (result.length() > 0)
					result.append(" +\n");

				result.append('"').append(line).append('"');
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return result.toString();
	}

	public static final String escapeForJavaSourceCode(String original)
	{
		String result = original.replaceAll("\r", "\\\\r");
		result = result.replaceAll("\n", "\\\\n\n");
		result = result.replaceAll("\"", "\\\\\"");
		result = result.replaceAll("\t", "\\\\t");
		return result;
	}

	public static final String removeCommentsAndConvertEOLsToUnixEOLs(String queryText)
	{
		StringBuilder result = new StringBuilder();

		// Two of the lineCommentChars directly following each other are the beginning of a line comment.
		final char lineCommentChar = '/';

		StreamTokenizer st = new StreamTokenizer(new StringReader(queryText));
		st.resetSyntax();
		st.wordChars(0, Character.MAX_VALUE);
		st.ordinaryChar(lineCommentChar);
		st.ordinaryChar('\n');
		st.ordinaryChar('\r');
		st.ordinaryChar('"');
		st.ordinaryChar('\'');
		st.ordinaryChar(' ');
		st.ordinaryChar('\t');

		try {
			boolean isInStringSingleQuote = false;
			boolean isInStringDoubleQuote = false;
			boolean isInLineComment = false;
			Character deferred = null;
			while (st.nextToken() != StreamTokenizer.TT_EOF) {
				if (deferred != null) {
					if (deferred.charValue() == lineCommentChar) {
						if (st.ttype == lineCommentChar)
							isInLineComment = true;
						else
							result.append(deferred);

						deferred = null;
					}
					else if (deferred.charValue() == '\r') {
						// convert "\r" to "\n" (*NOT* "\r" to "") and "\r\n" to "\n" (*NOT* "\r\n" to "\n\n")
						if (st.ttype != '\n')
							result.append('\n');

						deferred = null;
					}
				}

				boolean defer = false;
				if (st.ttype == '"' && !isInLineComment)
					isInStringDoubleQuote = !isInStringDoubleQuote;
				else if (st.ttype == '\'' && !isInLineComment)
					isInStringSingleQuote = !isInStringSingleQuote;
				else if (st.ttype == lineCommentChar && !isInLineComment && !isInStringDoubleQuote && !isInStringSingleQuote)
					defer = true;
				else if (st.ttype == '\r') {
					defer = true;
					isInLineComment = false;
				}
				else if (st.ttype == '\n')
					isInLineComment = false;

				if (!isInLineComment) {
					if (
							st.ttype != StreamTokenizer.TT_EOF &&
//							st.ttype != StreamTokenizer.TT_EOL &&
							st.ttype != StreamTokenizer.TT_NUMBER &&
							st.ttype != StreamTokenizer.TT_WORD
					)
					{
						if (defer) {
							if (deferred != null)
								throw new IllegalStateException("deferred != null");

							deferred = (char)st.ttype;
						}
						else
							result.append((char)st.ttype);
					}
					else if (st.sval != null)
						result.append(st.sval);
				}
			}

			if (deferred != null && !isInLineComment) {
				if (deferred.charValue() == '\r')
					result.append('\n');
				else
					result.append(deferred.charValue());
			}

		} catch (IOException x) {
			throw new RuntimeException(x);
		}

		return result.toString();
	}
}
