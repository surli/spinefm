package fr.unice.spinefm.serializer;

import com.google.inject.Inject;
import fr.unice.spinefm.services.RestfuncDSLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class RestfuncDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RestfuncDSLGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RestfuncDSLGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBEGIN_RULERule())
			return getBEGIN_RULEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDOTRule())
			return getDOTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEND_RULERule())
			return getEND_RULEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEQUALRule())
			return getEQUALToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIMPLYRule())
			return getIMPLYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPOINTSRule())
			return getPOINTSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSOURCEKEYRule())
			return getSOURCEKEYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTARRule())
			return getSTARToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTARGETKEYRule())
			return getTARGETKEYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVARBEGINRule())
			return getVARBEGINToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal BEGIN_RULE: 'rule';
	 */
	protected String getBEGIN_RULEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "rule";
	}
	
	/**
	 * terminal COMMA: ',';
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal DOT: '.';
	 */
	protected String getDOTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal END_RULE: ';';
	 */
	protected String getEND_RULEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * terminal EQUAL: '=';
	 */
	protected String getEQUALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal IMPLY: '=>';
	 */
	protected String getIMPLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=>";
	}
	
	/**
	 * terminal POINTS: ':';
	 */
	protected String getPOINTSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal SOURCEKEY: 'source';
	 */
	protected String getSOURCEKEYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "source";
	}
	
	/**
	 * terminal STAR: '*';
	 */
	protected String getSTARToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*";
	}
	
	/**
	 * terminal TARGETKEY: 'target';
	 */
	protected String getTARGETKEYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "target";
	}
	
	/**
	 * terminal VARBEGIN: '$';
	 */
	protected String getVARBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "$";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
