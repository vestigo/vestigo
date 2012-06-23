package org.nightlabs.vestigo.xtext.jdoql.ui.contentassist;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.nightlabs.vestigo.ui.contentassist.ContentProposalProviderHelper;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.SingleStringJDOQL;

public class JDOQLProposalProviderHelper extends ContentProposalProviderHelper<JDOQLProposalProvider> {

	public JDOQLProposalProviderHelper(JDOQLProposalProvider contentProposalProvider) {
		super(contentProposalProvider);
	}

	@Override
	protected Map<String, String> getAlias2EntityNameMap(ContentAssistContext context)
	{
		if (context == null)
			throw new IllegalArgumentException("context == null");

		Map<String, String> result = new HashMap<String, String>();
		XtextResource contextResource = context.getResource();
		if (contextResource == null)
			return result;

		IParseResult parseResult = contextResource.getParseResult();
		if (parseResult == null)
			return result;

		EObject rootASTElement = parseResult.getRootASTElement();
		if (rootASTElement instanceof SingleStringJDOQL) {
			SingleStringJDOQL singleStringJDOQL = (SingleStringJDOQL) rootASTElement;
			if (singleStringJDOQL.getFromClause() != null) {
				String candidateClassName = singleStringJDOQL.getFromClause().getCandidateClassName();
				if (candidateClassName != null)
					result.put("this", candidateClassName);
			}
		}

		return result;
	}

	@Override
	protected String getDefaultEntityName(ContentAssistContext context) {
		XtextResource contextResource = context.getResource();
		if (contextResource == null)
			return null;

		IParseResult parseResult = contextResource.getParseResult();
		if (parseResult == null)
			return null;

		EObject rootASTElement = parseResult.getRootASTElement();
		if (rootASTElement instanceof SingleStringJDOQL) {
			SingleStringJDOQL singleStringJDOQL = (SingleStringJDOQL) rootASTElement;
			if (singleStringJDOQL.getFromClause() != null) {
				String candidateClassName = singleStringJDOQL.getFromClause().getCandidateClassName();
				if (candidateClassName != null)
					return candidateClassName;
			}
		}
		return null;
	}

}
