/*
* generated by Xtext
*/
package org.nightlabs.vestigo.xtext.jpql.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class JPQLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.tokens");
	}
}
