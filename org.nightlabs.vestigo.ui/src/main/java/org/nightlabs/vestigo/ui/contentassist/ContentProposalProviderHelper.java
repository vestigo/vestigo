package org.nightlabs.vestigo.ui.contentassist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.IContentProposalProvider;
import org.nightlabs.vestigo.core.oda.ConnectionProfile;
import org.nightlabs.vestigo.core.oda.PersistableClass;
import org.nightlabs.vestigo.core.oda.PersistableProperty;
import org.nightlabs.vestigo.ui.editor.DocumentContextManager;
import org.nightlabs.vestigo.ui.editor.QueryEditorManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ContentProposalProviderHelper<P extends IContentProposalProvider> {
	private static final Logger logger = LoggerFactory.getLogger(ContentProposalProviderHelper.class);

	private P contentProposalProvider;

	public ContentProposalProviderHelper(P contentProposalProvider) {
		if (contentProposalProvider == null)
			throw new IllegalArgumentException("contentProposalProvider == null");

		this.contentProposalProvider = contentProposalProvider;
	}

	public P getContentProposalProvider() {
		return contentProposalProvider;
	}

	public List<String> getCurrentAliasAttributeProposals(ContentAssistContext context) {
		List<String> aliasAttributeTokens = getCurrentAliasAttributeTokens(context);
		List<String> result = getAvailableAttributes(context, aliasAttributeTokens);
		return result;
	}

	/**
	 * Get the tokens for which we currently want field-content-assist in left-to-right order.
	 * If the query was "SELECT entity.field00.field01.| FROM my.package.Entity entity" and
	 * the cursor was at the position represented by "|" when Ctrl+Space was pressed, then
	 * the result is ["entity", ".", "field00", ".", "field01", "."].
	 *
	 * @return tokens for which we currently want field-content-assist in left-to-right order.
	 */
	protected List<String> getCurrentAliasAttributeTokens(ContentAssistContext context) {
		ArrayList<String> result = new ArrayList<String>();

		INode lastCompleteNode = context.getLastCompleteNode();
		if (lastCompleteNode == null) {
			logger.warn("getCurrentAliasAttributeTokens: lastCompleteNode == null");
			return result;
		}

		INode previousSibling = lastCompleteNode;
		int previousSiblingIndex = -1;
		do {
			++previousSiblingIndex;
			if (previousSibling != null) {
				String text = previousSibling.getText();
				if (text == null)
					logger.warn("getCurrentAliasAttributeTokens: previousSibling[{}].getText() == null :: result={}", previousSiblingIndex, result);
				// BEGIN JDO-specific
				else if (",".equals(text.trim()))
					break; // we're in JDO in the next - still empty - token and get the last one (comma-separated).
				else if ("select".equals(text.trim().toLowerCase(Locale.ENGLISH))) // ENGLISH because of 'SELECT' being an English word.
					break; // we're in JDO in the next - still empty - token and get the last one (comma-separated).
				// END JDO-specific
				else if (!text.trim().isEmpty()) {
					for (String t : splitReverse(text))
						result.add(t);
				}
			}
			previousSibling = previousSibling.getPreviousSibling();
		} while (previousSibling != null);

		if (result.isEmpty())
			logger.info("getCurrentAliasAttributeTokens: result is empty!");

		Collections.reverse(result);
		return result;
	}

	protected List<String> splitReverse(String text) {
		List<String> result = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(text, ".", true);
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			result.add(token);
		}
		Collections.reverse(result);
		return result;
	}

	protected abstract Map<String, String> getAlias2EntityNameMap(ContentAssistContext context);

	protected abstract String getDefaultEntityName(ContentAssistContext context);

	protected List<String> getAvailableAttributes(ContentAssistContext context, List<String> aliasAttributeTokens)
	{
		if (context == null)
			throw new IllegalArgumentException("context == null");

		if (aliasAttributeTokens == null)
			throw new IllegalArgumentException("aliasAttributeTokens == null");

		ArrayList<String> result = new ArrayList<String>();

		Map<String, String> alias2EntityNameMap = getAlias2EntityNameMap(context);
		String firstAliasAttributeToken = aliasAttributeTokens.isEmpty() ? null : aliasAttributeTokens.get(0).trim();
		String entityName = alias2EntityNameMap.get(firstAliasAttributeToken);
		boolean isDefaultEntityName = false;
		if (entityName == null) {
			logger.debug("getAvailableAttributes: alias2EntityNameMap.get(firstAliasAttributeToken) returned null. firstAliasAttributeToken={}", firstAliasAttributeToken);
			entityName = getDefaultEntityName(context);
			isDefaultEntityName = true;
			if (entityName == null)
				return result;
		}
		List<String> attributePathWithoutEntityName = new ArrayList<String>(Math.max(0, aliasAttributeTokens.size() - 1));
		boolean first = true;
		for (String aliasAttributeToken : aliasAttributeTokens) {
			if (first) {
				first = false;
				if (!isDefaultEntityName)
					continue; // skip first = entityName
			}
			aliasAttributeToken = aliasAttributeToken.trim();

			if (".".equals(aliasAttributeToken) || aliasAttributeToken.isEmpty())
				continue;

			attributePathWithoutEntityName.add(aliasAttributeToken);
		}

		PersistableClass entityClass = getPersistableClass(context, entityName); // TODO in JPA, entities can have annotated or simple names - in JDO, there might be imports and non-qualified class-names
		if (entityClass == null) {
			logger.warn("getAvailableAttributes: entityName='{}' does not reference a PersistableClass.", firstAliasAttributeToken);
			return result;
		}

		PersistableClass persistableClass = entityClass;
		for (String attributePathElement : attributePathWithoutEntityName) {
			PersistableProperty persistableProperty = persistableClass.getPersistablePropertyMap().get(attributePathElement);
			if (persistableProperty == null) {
				logger.warn(
						"getAvailableAttributes: attributePathElement='{}' does not reference a PersistableProperty. entityName={} attributePathWithoutEntityName={}",
						new Object[] { attributePathElement, entityName, attributePathWithoutEntityName }
				);
				return result;
			}
			persistableClass = getPersistableClass(context, persistableProperty.getType());
			if (persistableClass == null)
				return result; // TODO try to handle this class differently? maybe later...
		}

		for (PersistableProperty persistableProperty : persistableClass.getPersistableProperties()) {
			result.add(persistableProperty.getName());
		}

		return result;
	}

	/**
	 * Get the {@link PersistableClass} for the given fully qualified <code>className</code>.
	 * @param context the context. Must not be <code>null</code>.
	 * @param className fully qualified class name. Might be <code>null</code> (which will cause a <code>null</code> result).
	 * @return the {@link PersistableClass} or <code>null</code>, if there is none for the given class name.
	 */
	protected PersistableClass getPersistableClass(ContentAssistContext context, String className) {
		QueryEditorManager queryEditorManager = DocumentContextManager.sharedInstance().getQueryEditorManager(context.getDocument(), true);
		ConnectionProfile vestigoConnectionProfile = queryEditorManager.getVestigoConnectionProfileAskingUserIfNecessary();
		return vestigoConnectionProfile.getQueryableCandidateClassMap().get(className);
	}
}
