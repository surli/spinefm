/*
* generated by Xtext
*/
package fr.unice.spinefm.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class RestfuncDSLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class RestFuncElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RestFunc");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cInitAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cInitSourceAndTargetParserRuleCall_0_0 = (RuleCall)cInitAssignment_0.eContents().get(0);
		private final Assignment cRulesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRulesRuleStringParserRuleCall_1_0 = (RuleCall)cRulesAssignment_1.eContents().get(0);
		
		//RestFunc:
		//	init=SourceAndTarget rules+=RuleString+;
		public ParserRule getRule() { return rule; }

		//init=SourceAndTarget rules+=RuleString+
		public Group getGroup() { return cGroup; }

		//init=SourceAndTarget
		public Assignment getInitAssignment_0() { return cInitAssignment_0; }

		//SourceAndTarget
		public RuleCall getInitSourceAndTargetParserRuleCall_0_0() { return cInitSourceAndTargetParserRuleCall_0_0; }

		//rules+=RuleString+
		public Assignment getRulesAssignment_1() { return cRulesAssignment_1; }

		//RuleString
		public RuleCall getRulesRuleStringParserRuleCall_1_0() { return cRulesRuleStringParserRuleCall_1_0; }
	}

	public class RuleStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RuleString");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cBEGIN_RULETerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final RuleCall cPOINTSTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cLeftAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLeftLeftPartParserRuleCall_3_0 = (RuleCall)cLeftAssignment_3.eContents().get(0);
		private final RuleCall cIMPLYTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Assignment cRightAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRightRightPartParserRuleCall_5_0 = (RuleCall)cRightAssignment_5.eContents().get(0);
		private final RuleCall cEND_RULETerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//RuleString:
		//	BEGIN_RULE id=ID? POINTS left=LeftPart IMPLY right=RightPart END_RULE;
		public ParserRule getRule() { return rule; }

		//BEGIN_RULE id=ID? POINTS left=LeftPart IMPLY right=RightPart END_RULE
		public Group getGroup() { return cGroup; }

		//BEGIN_RULE
		public RuleCall getBEGIN_RULETerminalRuleCall_0() { return cBEGIN_RULETerminalRuleCall_0; }

		//id=ID?
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }

		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }

		//POINTS
		public RuleCall getPOINTSTerminalRuleCall_2() { return cPOINTSTerminalRuleCall_2; }

		//left=LeftPart
		public Assignment getLeftAssignment_3() { return cLeftAssignment_3; }

		//LeftPart
		public RuleCall getLeftLeftPartParserRuleCall_3_0() { return cLeftLeftPartParserRuleCall_3_0; }

		//IMPLY
		public RuleCall getIMPLYTerminalRuleCall_4() { return cIMPLYTerminalRuleCall_4; }

		//right=RightPart
		public Assignment getRightAssignment_5() { return cRightAssignment_5; }

		//RightPart
		public RuleCall getRightRightPartParserRuleCall_5_0() { return cRightRightPartParserRuleCall_5_0; }

		//END_RULE
		public RuleCall getEND_RULETerminalRuleCall_6() { return cEND_RULETerminalRuleCall_6; }
	}

	public class SourceAndTargetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SourceAndTarget");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSourceAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSourceSourceParserRuleCall_0_0 = (RuleCall)cSourceAssignment_0.eContents().get(0);
		private final Assignment cTargetAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTargetTargetParserRuleCall_1_0 = (RuleCall)cTargetAssignment_1.eContents().get(0);
		
		//SourceAndTarget:
		//	source=Source target=Target;
		public ParserRule getRule() { return rule; }

		//source=Source target=Target
		public Group getGroup() { return cGroup; }

		//source=Source
		public Assignment getSourceAssignment_0() { return cSourceAssignment_0; }

		//Source
		public RuleCall getSourceSourceParserRuleCall_0_0() { return cSourceSourceParserRuleCall_0_0; }

		//target=Target
		public Assignment getTargetAssignment_1() { return cTargetAssignment_1; }

		//Target
		public RuleCall getTargetTargetParserRuleCall_1_0() { return cTargetTargetParserRuleCall_1_0; }
	}

	public class SourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Source");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSOURCEKEYTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cDeSrcAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDeSrcIDTerminalRuleCall_2_0 = (RuleCall)cDeSrcAssignment_2.eContents().get(0);
		
		//Source:
		//	SOURCEKEY EQUAL deSrc=ID;
		public ParserRule getRule() { return rule; }

		//SOURCEKEY EQUAL deSrc=ID
		public Group getGroup() { return cGroup; }

		//SOURCEKEY
		public RuleCall getSOURCEKEYTerminalRuleCall_0() { return cSOURCEKEYTerminalRuleCall_0; }

		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }

		//deSrc=ID
		public Assignment getDeSrcAssignment_2() { return cDeSrcAssignment_2; }

		//ID
		public RuleCall getDeSrcIDTerminalRuleCall_2_0() { return cDeSrcIDTerminalRuleCall_2_0; }
	}

	public class TargetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Target");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTARGETKEYTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cDeTargetAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDeTargetIDTerminalRuleCall_2_0 = (RuleCall)cDeTargetAssignment_2.eContents().get(0);
		
		//Target:
		//	TARGETKEY EQUAL deTarget=ID;
		public ParserRule getRule() { return rule; }

		//TARGETKEY EQUAL deTarget=ID
		public Group getGroup() { return cGroup; }

		//TARGETKEY
		public RuleCall getTARGETKEYTerminalRuleCall_0() { return cTARGETKEYTerminalRuleCall_0; }

		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }

		//deTarget=ID
		public Assignment getDeTargetAssignment_2() { return cDeTargetAssignment_2; }

		//ID
		public RuleCall getDeTargetIDTerminalRuleCall_2_0() { return cDeTargetIDTerminalRuleCall_2_0; }
	}

	public class LeftPartElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LeftPart");
		private final Assignment cFeaturesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFeaturesGroupFeatureParserRuleCall_0 = (RuleCall)cFeaturesAssignment.eContents().get(0);
		
		//LeftPart:
		//	features+=GroupFeature+;
		public ParserRule getRule() { return rule; }

		//features+=GroupFeature+
		public Assignment getFeaturesAssignment() { return cFeaturesAssignment; }

		//GroupFeature
		public RuleCall getFeaturesGroupFeatureParserRuleCall_0() { return cFeaturesGroupFeatureParserRuleCall_0; }
	}

	public class GroupFeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GroupFeature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cStateFM_STATEParserRuleCall_0_0 = (RuleCall)cStateAssignment_0.eContents().get(0);
		private final Assignment cFeatureAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFeatureFeatureNamedParserRuleCall_1_0 = (RuleCall)cFeatureAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final RuleCall cCOMMATerminalRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final Assignment cFeatureAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cFeatureFeatureNamedParserRuleCall_2_1_0 = (RuleCall)cFeatureAssignment_2_1.eContents().get(0);
		
		//GroupFeature:
		//	state=FM_STATE feature+=FeatureNamed (COMMA feature+=FeatureNamed)*;
		public ParserRule getRule() { return rule; }

		//state=FM_STATE feature+=FeatureNamed (COMMA feature+=FeatureNamed)*
		public Group getGroup() { return cGroup; }

		//state=FM_STATE
		public Assignment getStateAssignment_0() { return cStateAssignment_0; }

		//FM_STATE
		public RuleCall getStateFM_STATEParserRuleCall_0_0() { return cStateFM_STATEParserRuleCall_0_0; }

		//feature+=FeatureNamed
		public Assignment getFeatureAssignment_1() { return cFeatureAssignment_1; }

		//FeatureNamed
		public RuleCall getFeatureFeatureNamedParserRuleCall_1_0() { return cFeatureFeatureNamedParserRuleCall_1_0; }

		//(COMMA feature+=FeatureNamed)*
		public Group getGroup_2() { return cGroup_2; }

		//COMMA
		public RuleCall getCOMMATerminalRuleCall_2_0() { return cCOMMATerminalRuleCall_2_0; }

		//feature+=FeatureNamed
		public Assignment getFeatureAssignment_2_1() { return cFeatureAssignment_2_1; }

		//FeatureNamed
		public RuleCall getFeatureFeatureNamedParserRuleCall_2_1_0() { return cFeatureFeatureNamedParserRuleCall_2_1_0; }
	}

	public class FeatureNamedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FeatureNamed");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSingleFeatureParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cVariableFeatureParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cStarFeatureParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//FeatureNamed:
		//	SingleFeature | VariableFeature | StarFeature;
		public ParserRule getRule() { return rule; }

		//SingleFeature | VariableFeature | StarFeature
		public Alternatives getAlternatives() { return cAlternatives; }

		//SingleFeature
		public RuleCall getSingleFeatureParserRuleCall_0() { return cSingleFeatureParserRuleCall_0; }

		//VariableFeature
		public RuleCall getVariableFeatureParserRuleCall_1() { return cVariableFeatureParserRuleCall_1; }

		//StarFeature
		public RuleCall getStarFeatureParserRuleCall_2() { return cStarFeatureParserRuleCall_2; }
	}

	public class SingleFeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SingleFeature");
		private final Assignment cFeatureNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFeatureNameIDTerminalRuleCall_0 = (RuleCall)cFeatureNameAssignment.eContents().get(0);
		
		//SingleFeature:
		//	featureName=ID;
		public ParserRule getRule() { return rule; }

		//featureName=ID
		public Assignment getFeatureNameAssignment() { return cFeatureNameAssignment; }

		//ID
		public RuleCall getFeatureNameIDTerminalRuleCall_0() { return cFeatureNameIDTerminalRuleCall_0; }
	}

	public class VariableFeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VariableFeature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFeatureNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFeatureNameIDTerminalRuleCall_0_0 = (RuleCall)cFeatureNameAssignment_0.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cVariableAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVariableVariableParserRuleCall_2_0 = (RuleCall)cVariableAssignment_2.eContents().get(0);
		
		//VariableFeature:
		//	featureName=ID DOT variable=Variable;
		public ParserRule getRule() { return rule; }

		//featureName=ID DOT variable=Variable
		public Group getGroup() { return cGroup; }

		//featureName=ID
		public Assignment getFeatureNameAssignment_0() { return cFeatureNameAssignment_0; }

		//ID
		public RuleCall getFeatureNameIDTerminalRuleCall_0_0() { return cFeatureNameIDTerminalRuleCall_0_0; }

		//DOT
		public RuleCall getDOTTerminalRuleCall_1() { return cDOTTerminalRuleCall_1; }

		//variable=Variable
		public Assignment getVariableAssignment_2() { return cVariableAssignment_2; }

		//Variable
		public RuleCall getVariableVariableParserRuleCall_2_0() { return cVariableVariableParserRuleCall_2_0; }
	}

	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cVARBEGINTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		
		//Variable:
		//	VARBEGIN id=ID;
		public ParserRule getRule() { return rule; }

		//VARBEGIN id=ID
		public Group getGroup() { return cGroup; }

		//VARBEGIN
		public RuleCall getVARBEGINTerminalRuleCall_0() { return cVARBEGINTerminalRuleCall_0; }

		//id=ID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }

		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }
	}

	public class StarFeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StarFeature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFeatureNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFeatureNameIDTerminalRuleCall_0_0 = (RuleCall)cFeatureNameAssignment_0.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cSTARTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//StarFeature:
		//	featureName=ID DOT STAR;
		public ParserRule getRule() { return rule; }

		//featureName=ID DOT STAR
		public Group getGroup() { return cGroup; }

		//featureName=ID
		public Assignment getFeatureNameAssignment_0() { return cFeatureNameAssignment_0; }

		//ID
		public RuleCall getFeatureNameIDTerminalRuleCall_0_0() { return cFeatureNameIDTerminalRuleCall_0_0; }

		//DOT
		public RuleCall getDOTTerminalRuleCall_1() { return cDOTTerminalRuleCall_1; }

		//STAR
		public RuleCall getSTARTerminalRuleCall_2() { return cSTARTerminalRuleCall_2; }
	}

	public class RightPartElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RightPart");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cActionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cActionACTIONFEATUREParserRuleCall_0_0 = (RuleCall)cActionAssignment_0.eContents().get(0);
		private final Assignment cFeatureAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFeatureFeatureNamedParserRuleCall_1_0 = (RuleCall)cFeatureAssignment_1.eContents().get(0);
		
		////RightPart: action=(ActionOnFeature | ActionOnFM);
		//RightPart:
		//	action=ACTIONFEATURE feature=FeatureNamed;
		public ParserRule getRule() { return rule; }

		//action=ACTIONFEATURE feature=FeatureNamed
		public Group getGroup() { return cGroup; }

		//action=ACTIONFEATURE
		public Assignment getActionAssignment_0() { return cActionAssignment_0; }

		//ACTIONFEATURE
		public RuleCall getActionACTIONFEATUREParserRuleCall_0_0() { return cActionACTIONFEATUREParserRuleCall_0_0; }

		//feature=FeatureNamed
		public Assignment getFeatureAssignment_1() { return cFeatureAssignment_1; }

		//FeatureNamed
		public RuleCall getFeatureFeatureNamedParserRuleCall_1_0() { return cFeatureFeatureNamedParserRuleCall_1_0; }
	}

	public class FM_STATEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FM_STATE");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cSELECTEDKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cDESELECTEDKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		////ActionOnFM: action=ACTIONFM featureTrue=FeatureNamed featureFalse=FeatureNamed;
		//FM_STATE:
		//	"SELECTED" | "DESELECTED";
		public ParserRule getRule() { return rule; }

		//"SELECTED" | "DESELECTED"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"SELECTED"
		public Keyword getSELECTEDKeyword_0() { return cSELECTEDKeyword_0; }

		//"DESELECTED"
		public Keyword getDESELECTEDKeyword_1() { return cDESELECTEDKeyword_1; }
	}

	public class ACTIONFEATUREElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ACTIONFEATURE");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cSELECTKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cDESELECTKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//ACTIONFEATURE:
		//	"SELECT" | "DESELECT";
		public ParserRule getRule() { return rule; }

		//"SELECT" | "DESELECT"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"SELECT"
		public Keyword getSELECTKeyword_0() { return cSELECTKeyword_0; }

		//"DESELECT"
		public Keyword getDESELECTKeyword_1() { return cDESELECTKeyword_1; }
	}
	
	
	private RestFuncElements pRestFunc;
	private RuleStringElements pRuleString;
	private SourceAndTargetElements pSourceAndTarget;
	private SourceElements pSource;
	private TargetElements pTarget;
	private LeftPartElements pLeftPart;
	private GroupFeatureElements pGroupFeature;
	private FeatureNamedElements pFeatureNamed;
	private SingleFeatureElements pSingleFeature;
	private VariableFeatureElements pVariableFeature;
	private VariableElements pVariable;
	private StarFeatureElements pStarFeature;
	private RightPartElements pRightPart;
	private FM_STATEElements pFM_STATE;
	private ACTIONFEATUREElements pACTIONFEATURE;
	private TerminalRule tIMPLY;
	private TerminalRule tBEGIN_RULE;
	private TerminalRule tSTAR;
	private TerminalRule tPOINTS;
	private TerminalRule tEND_RULE;
	private TerminalRule tCOMMA;
	private TerminalRule tDOT;
	private TerminalRule tVARBEGIN;
	private TerminalRule tSOURCEKEY;
	private TerminalRule tTARGETKEY;
	private TerminalRule tEQUAL;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public RestfuncDSLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.unice.spinefm.RestfuncDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//RestFunc:
	//	init=SourceAndTarget rules+=RuleString+;
	public RestFuncElements getRestFuncAccess() {
		return (pRestFunc != null) ? pRestFunc : (pRestFunc = new RestFuncElements());
	}
	
	public ParserRule getRestFuncRule() {
		return getRestFuncAccess().getRule();
	}

	//RuleString:
	//	BEGIN_RULE id=ID? POINTS left=LeftPart IMPLY right=RightPart END_RULE;
	public RuleStringElements getRuleStringAccess() {
		return (pRuleString != null) ? pRuleString : (pRuleString = new RuleStringElements());
	}
	
	public ParserRule getRuleStringRule() {
		return getRuleStringAccess().getRule();
	}

	//SourceAndTarget:
	//	source=Source target=Target;
	public SourceAndTargetElements getSourceAndTargetAccess() {
		return (pSourceAndTarget != null) ? pSourceAndTarget : (pSourceAndTarget = new SourceAndTargetElements());
	}
	
	public ParserRule getSourceAndTargetRule() {
		return getSourceAndTargetAccess().getRule();
	}

	//Source:
	//	SOURCEKEY EQUAL deSrc=ID;
	public SourceElements getSourceAccess() {
		return (pSource != null) ? pSource : (pSource = new SourceElements());
	}
	
	public ParserRule getSourceRule() {
		return getSourceAccess().getRule();
	}

	//Target:
	//	TARGETKEY EQUAL deTarget=ID;
	public TargetElements getTargetAccess() {
		return (pTarget != null) ? pTarget : (pTarget = new TargetElements());
	}
	
	public ParserRule getTargetRule() {
		return getTargetAccess().getRule();
	}

	//LeftPart:
	//	features+=GroupFeature+;
	public LeftPartElements getLeftPartAccess() {
		return (pLeftPart != null) ? pLeftPart : (pLeftPart = new LeftPartElements());
	}
	
	public ParserRule getLeftPartRule() {
		return getLeftPartAccess().getRule();
	}

	//GroupFeature:
	//	state=FM_STATE feature+=FeatureNamed (COMMA feature+=FeatureNamed)*;
	public GroupFeatureElements getGroupFeatureAccess() {
		return (pGroupFeature != null) ? pGroupFeature : (pGroupFeature = new GroupFeatureElements());
	}
	
	public ParserRule getGroupFeatureRule() {
		return getGroupFeatureAccess().getRule();
	}

	//FeatureNamed:
	//	SingleFeature | VariableFeature | StarFeature;
	public FeatureNamedElements getFeatureNamedAccess() {
		return (pFeatureNamed != null) ? pFeatureNamed : (pFeatureNamed = new FeatureNamedElements());
	}
	
	public ParserRule getFeatureNamedRule() {
		return getFeatureNamedAccess().getRule();
	}

	//SingleFeature:
	//	featureName=ID;
	public SingleFeatureElements getSingleFeatureAccess() {
		return (pSingleFeature != null) ? pSingleFeature : (pSingleFeature = new SingleFeatureElements());
	}
	
	public ParserRule getSingleFeatureRule() {
		return getSingleFeatureAccess().getRule();
	}

	//VariableFeature:
	//	featureName=ID DOT variable=Variable;
	public VariableFeatureElements getVariableFeatureAccess() {
		return (pVariableFeature != null) ? pVariableFeature : (pVariableFeature = new VariableFeatureElements());
	}
	
	public ParserRule getVariableFeatureRule() {
		return getVariableFeatureAccess().getRule();
	}

	//Variable:
	//	VARBEGIN id=ID;
	public VariableElements getVariableAccess() {
		return (pVariable != null) ? pVariable : (pVariable = new VariableElements());
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}

	//StarFeature:
	//	featureName=ID DOT STAR;
	public StarFeatureElements getStarFeatureAccess() {
		return (pStarFeature != null) ? pStarFeature : (pStarFeature = new StarFeatureElements());
	}
	
	public ParserRule getStarFeatureRule() {
		return getStarFeatureAccess().getRule();
	}

	////RightPart: action=(ActionOnFeature | ActionOnFM);
	//RightPart:
	//	action=ACTIONFEATURE feature=FeatureNamed;
	public RightPartElements getRightPartAccess() {
		return (pRightPart != null) ? pRightPart : (pRightPart = new RightPartElements());
	}
	
	public ParserRule getRightPartRule() {
		return getRightPartAccess().getRule();
	}

	////ActionOnFM: action=ACTIONFM featureTrue=FeatureNamed featureFalse=FeatureNamed;
	//FM_STATE:
	//	"SELECTED" | "DESELECTED";
	public FM_STATEElements getFM_STATEAccess() {
		return (pFM_STATE != null) ? pFM_STATE : (pFM_STATE = new FM_STATEElements());
	}
	
	public ParserRule getFM_STATERule() {
		return getFM_STATEAccess().getRule();
	}

	//ACTIONFEATURE:
	//	"SELECT" | "DESELECT";
	public ACTIONFEATUREElements getACTIONFEATUREAccess() {
		return (pACTIONFEATURE != null) ? pACTIONFEATURE : (pACTIONFEATURE = new ACTIONFEATUREElements());
	}
	
	public ParserRule getACTIONFEATURERule() {
		return getACTIONFEATUREAccess().getRule();
	}

	////ACTIONFM: 'ADDCONSTRAINT';
	//terminal IMPLY:
	//	"=>";
	public TerminalRule getIMPLYRule() {
		return (tIMPLY != null) ? tIMPLY : (tIMPLY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "IMPLY"));
	} 

	//terminal BEGIN_RULE:
	//	"rule";
	public TerminalRule getBEGIN_RULERule() {
		return (tBEGIN_RULE != null) ? tBEGIN_RULE : (tBEGIN_RULE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "BEGIN_RULE"));
	} 

	//terminal STAR:
	//	"*";
	public TerminalRule getSTARRule() {
		return (tSTAR != null) ? tSTAR : (tSTAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "STAR"));
	} 

	//terminal POINTS:
	//	":";
	public TerminalRule getPOINTSRule() {
		return (tPOINTS != null) ? tPOINTS : (tPOINTS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "POINTS"));
	} 

	//terminal END_RULE:
	//	";";
	public TerminalRule getEND_RULERule() {
		return (tEND_RULE != null) ? tEND_RULE : (tEND_RULE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "END_RULE"));
	} 

	//terminal COMMA:
	//	",";
	public TerminalRule getCOMMARule() {
		return (tCOMMA != null) ? tCOMMA : (tCOMMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "COMMA"));
	} 

	//terminal DOT:
	//	".";
	public TerminalRule getDOTRule() {
		return (tDOT != null) ? tDOT : (tDOT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DOT"));
	} 

	//terminal VARBEGIN:
	//	"$";
	public TerminalRule getVARBEGINRule() {
		return (tVARBEGIN != null) ? tVARBEGIN : (tVARBEGIN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "VARBEGIN"));
	} 

	//terminal SOURCEKEY:
	//	"source";
	public TerminalRule getSOURCEKEYRule() {
		return (tSOURCEKEY != null) ? tSOURCEKEY : (tSOURCEKEY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SOURCEKEY"));
	} 

	//terminal TARGETKEY:
	//	"target";
	public TerminalRule getTARGETKEYRule() {
		return (tTARGETKEY != null) ? tTARGETKEY : (tTARGETKEY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TARGETKEY"));
	} 

	//terminal EQUAL:
	//	"=";
	public TerminalRule getEQUALRule() {
		return (tEQUAL != null) ? tEQUAL : (tEQUAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "EQUAL"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
