package org.nightlabs.jjqb.childvm.webapp.model;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class StringUtil
{
	protected StringUtil() { }

	public static final String removeCommentsAndConvertEOLsToUnixEOLs(String queryText)
	{
		StringBuilder result = new StringBuilder();

		StreamTokenizer st = new StreamTokenizer(new StringReader(queryText));
		st.resetSyntax();
		st.wordChars(0, Character.MAX_VALUE);
		st.ordinaryChar('-');
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
					if (deferred.charValue() == '-') {
						if (st.ttype == '-')
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
				else if (st.ttype == '-' && !isInLineComment && !isInStringDoubleQuote && !isInStringSingleQuote)
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
