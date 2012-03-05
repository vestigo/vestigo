/*
* generated by Xtext
*/
package org.nightlabs.jjqb.xtext.jpql.ui.contentassist;

import java.util.SortedSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.nightlabs.jjqb.core.oda.ConnectionProfile;
import org.nightlabs.jjqb.ui.editor.DocumentContextManager;
import org.nightlabs.jjqb.ui.editor.QueryEditorManager;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class JPQLProposalProvider extends AbstractJPQLProposalProvider {

	@Override
	public void complete_FromClass(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {

		super.complete_FromClass(model, ruleCall, context, acceptor);

		QueryEditorManager queryEditorManager = DocumentContextManager.sharedInstance().getQueryEditorManager(context.getDocument(), true);
		ConnectionProfile jjqbConnectionProfile = queryEditorManager.getJJQBConnectionProfileAskingUserIfNecessary();
		if (jjqbConnectionProfile != null) {
			SortedSet<String> classes = jjqbConnectionProfile.getQueryableCandidateClasses();
			for (String className : classes)
				acceptor.accept(createCompletionProposal(className, context));
		}
	}

}
