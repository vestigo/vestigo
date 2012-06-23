package org.nightlabs.vestigo.xtext.jpql.ui.contentassist;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.nightlabs.vestigo.ui.contentassist.ContentProposalProviderHelper;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromClass;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromEntry;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SelectStatement;
import org.nightlabs.vestigo.xtext.jpql.jPQL.VariableDeclaration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JPQLProposalProviderHelper extends ContentProposalProviderHelper<JPQLProposalProvider>
{
	private static final Logger logger = LoggerFactory.getLogger(JPQLProposalProviderHelper.class);

	public JPQLProposalProviderHelper(JPQLProposalProvider contentProposalProvider) {
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
		if (rootASTElement instanceof SelectStatement) {
			SelectStatement selectStatement = (SelectStatement) rootASTElement;
			FromClause fromClause = selectStatement.getFromClause();
			if (fromClause == null)
				return result;

			for (FromEntry fromEntry : fromClause.getFromEntries()) {
				if (fromEntry instanceof FromClass) {
					FromClass fromClass = (FromClass) fromEntry;
					String type = fromClass.getType();
					VariableDeclaration variable = fromClass.getVariable();
					if (variable == null) {
						logger.warn("getAlias2EntityNameMap: variable == null! type={}", type);
						continue;
					}
					String variableName = variable.getName();
					if (type == null) {
						logger.warn("getAlias2EntityNameMap: type == null! variableName={} variable={}", variableName, variable);
						continue;
					}
					if (variableName == null) {
						logger.warn("getAlias2EntityNameMap: variableName == null! type={} variable={}", type, variable);
						continue;
					}
					result.put(variableName, type);
				}
			}
		}

		return result;
	}

	@Override
	protected String getDefaultEntityName(ContentAssistContext context)
	{
		XtextResource contextResource = context.getResource();
		if (contextResource == null)
			return null;

		IParseResult parseResult = contextResource.getParseResult();
		if (parseResult == null)
			return null;

		EObject rootASTElement = parseResult.getRootASTElement();
		if (rootASTElement instanceof SelectStatement) {
			SelectStatement selectStatement = (SelectStatement) rootASTElement;
			FromClause fromClause = selectStatement.getFromClause();
			if (fromClause == null)
				return null;

			for (FromEntry fromEntry : fromClause.getFromEntries()) {
				if (fromEntry instanceof FromClass) {
					FromClass fromClass = (FromClass) fromEntry;
					String type = fromClass.getType();
					if (type != null)
						return type;
				}
			}
		}

		return null;
	}
}
