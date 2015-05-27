/*
* generated by Xtext
*/
grammar InternalRestfuncDSL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package fr.unice.spinefm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.unice.spinefm.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.unice.spinefm.services.RestfuncDSLGrammarAccess;

}

@parser::members {

 	private RestfuncDSLGrammarAccess grammarAccess;
 	
    public InternalRestfuncDSLParser(TokenStream input, RestfuncDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "RestFunc";	
   	}
   	
   	@Override
   	protected RestfuncDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleRestFunc
entryRuleRestFunc returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRestFuncRule()); }
	 iv_ruleRestFunc=ruleRestFunc 
	 { $current=$iv_ruleRestFunc.current; } 
	 EOF 
;

// Rule RestFunc
ruleRestFunc returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getRestFuncAccess().getInitSourceAndTargetParserRuleCall_0_0()); 
	    }
		lv_init_0_0=ruleSourceAndTarget		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRestFuncRule());
	        }
       		set(
       			$current, 
       			"init",
        		lv_init_0_0, 
        		"SourceAndTarget");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRestFuncAccess().getRulesRuleStringParserRuleCall_1_0()); 
	    }
		lv_rules_1_0=ruleRuleString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRestFuncRule());
	        }
       		add(
       			$current, 
       			"rules",
        		lv_rules_1_0, 
        		"RuleString");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
;





// Entry rule entryRuleRuleString
entryRuleRuleString returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleStringRule()); }
	 iv_ruleRuleString=ruleRuleString 
	 { $current=$iv_ruleRuleString.current; } 
	 EOF 
;

// Rule RuleString
ruleRuleString returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_BEGIN_RULE_0=RULE_BEGIN_RULE
    { 
    newLeafNode(this_BEGIN_RULE_0, grammarAccess.getRuleStringAccess().getBEGIN_RULETerminalRuleCall_0()); 
    }
(
(
		lv_id_1_0=RULE_ID
		{
			newLeafNode(lv_id_1_0, grammarAccess.getRuleStringAccess().getIdIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRuleStringRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_1_0, 
        		"ID");
	    }

)
)?this_POINTS_2=RULE_POINTS
    { 
    newLeafNode(this_POINTS_2, grammarAccess.getRuleStringAccess().getPOINTSTerminalRuleCall_2()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleStringAccess().getLeftLeftPartParserRuleCall_3_0()); 
	    }
		lv_left_3_0=ruleLeftPart		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleStringRule());
	        }
       		set(
       			$current, 
       			"left",
        		lv_left_3_0, 
        		"LeftPart");
	        afterParserOrEnumRuleCall();
	    }

)
)this_IMPLY_4=RULE_IMPLY
    { 
    newLeafNode(this_IMPLY_4, grammarAccess.getRuleStringAccess().getIMPLYTerminalRuleCall_4()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleStringAccess().getRightRightPartParserRuleCall_5_0()); 
	    }
		lv_right_5_0=ruleRightPart		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleStringRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_5_0, 
        		"RightPart");
	        afterParserOrEnumRuleCall();
	    }

)
)this_END_RULE_6=RULE_END_RULE
    { 
    newLeafNode(this_END_RULE_6, grammarAccess.getRuleStringAccess().getEND_RULETerminalRuleCall_6()); 
    }
)
;





// Entry rule entryRuleSourceAndTarget
entryRuleSourceAndTarget returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSourceAndTargetRule()); }
	 iv_ruleSourceAndTarget=ruleSourceAndTarget 
	 { $current=$iv_ruleSourceAndTarget.current; } 
	 EOF 
;

// Rule SourceAndTarget
ruleSourceAndTarget returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getSourceAndTargetAccess().getSourceSourceParserRuleCall_0_0()); 
	    }
		lv_source_0_0=ruleSource		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSourceAndTargetRule());
	        }
       		set(
       			$current, 
       			"source",
        		lv_source_0_0, 
        		"Source");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSourceAndTargetAccess().getTargetTargetParserRuleCall_1_0()); 
	    }
		lv_target_1_0=ruleTarget		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSourceAndTargetRule());
	        }
       		set(
       			$current, 
       			"target",
        		lv_target_1_0, 
        		"Target");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleSource
entryRuleSource returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSourceRule()); }
	 iv_ruleSource=ruleSource 
	 { $current=$iv_ruleSource.current; } 
	 EOF 
;

// Rule Source
ruleSource returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_SOURCEKEY_0=RULE_SOURCEKEY
    { 
    newLeafNode(this_SOURCEKEY_0, grammarAccess.getSourceAccess().getSOURCEKEYTerminalRuleCall_0()); 
    }
this_EQUAL_1=RULE_EQUAL
    { 
    newLeafNode(this_EQUAL_1, grammarAccess.getSourceAccess().getEQUALTerminalRuleCall_1()); 
    }
(
(
		lv_deSrc_2_0=RULE_ID
		{
			newLeafNode(lv_deSrc_2_0, grammarAccess.getSourceAccess().getDeSrcIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSourceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"deSrc",
        		lv_deSrc_2_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleTarget
entryRuleTarget returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTargetRule()); }
	 iv_ruleTarget=ruleTarget 
	 { $current=$iv_ruleTarget.current; } 
	 EOF 
;

// Rule Target
ruleTarget returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_TARGETKEY_0=RULE_TARGETKEY
    { 
    newLeafNode(this_TARGETKEY_0, grammarAccess.getTargetAccess().getTARGETKEYTerminalRuleCall_0()); 
    }
this_EQUAL_1=RULE_EQUAL
    { 
    newLeafNode(this_EQUAL_1, grammarAccess.getTargetAccess().getEQUALTerminalRuleCall_1()); 
    }
(
(
		lv_deTarget_2_0=RULE_ID
		{
			newLeafNode(lv_deTarget_2_0, grammarAccess.getTargetAccess().getDeTargetIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTargetRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"deTarget",
        		lv_deTarget_2_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleLeftPart
entryRuleLeftPart returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLeftPartRule()); }
	 iv_ruleLeftPart=ruleLeftPart 
	 { $current=$iv_ruleLeftPart.current; } 
	 EOF 
;

// Rule LeftPart
ruleLeftPart returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getLeftPartAccess().getFeaturesGroupFeatureParserRuleCall_0()); 
	    }
		lv_features_0_0=ruleGroupFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLeftPartRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_0_0, 
        		"GroupFeature");
	        afterParserOrEnumRuleCall();
	    }

)
)+
;





// Entry rule entryRuleGroupFeature
entryRuleGroupFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGroupFeatureRule()); }
	 iv_ruleGroupFeature=ruleGroupFeature 
	 { $current=$iv_ruleGroupFeature.current; } 
	 EOF 
;

// Rule GroupFeature
ruleGroupFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getGroupFeatureAccess().getStateFM_STATEParserRuleCall_0_0()); 
	    }
		lv_state_0_0=ruleFM_STATE		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupFeatureRule());
	        }
       		set(
       			$current, 
       			"state",
        		lv_state_0_0, 
        		"FM_STATE");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getGroupFeatureAccess().getFeatureFeatureNamedParserRuleCall_1_0()); 
	    }
		lv_feature_1_0=ruleFeatureNamed		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupFeatureRule());
	        }
       		add(
       			$current, 
       			"feature",
        		lv_feature_1_0, 
        		"FeatureNamed");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_COMMA_2=RULE_COMMA
    { 
    newLeafNode(this_COMMA_2, grammarAccess.getGroupFeatureAccess().getCOMMATerminalRuleCall_2_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGroupFeatureAccess().getFeatureFeatureNamedParserRuleCall_2_1_0()); 
	    }
		lv_feature_3_0=ruleFeatureNamed		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupFeatureRule());
	        }
       		add(
       			$current, 
       			"feature",
        		lv_feature_3_0, 
        		"FeatureNamed");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleFeatureNamed
entryRuleFeatureNamed returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFeatureNamedRule()); }
	 iv_ruleFeatureNamed=ruleFeatureNamed 
	 { $current=$iv_ruleFeatureNamed.current; } 
	 EOF 
;

// Rule FeatureNamed
ruleFeatureNamed returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getFeatureNamedAccess().getSingleFeatureParserRuleCall_0()); 
    }
    this_SingleFeature_0=ruleSingleFeature
    { 
        $current = $this_SingleFeature_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getFeatureNamedAccess().getVariableFeatureParserRuleCall_1()); 
    }
    this_VariableFeature_1=ruleVariableFeature
    { 
        $current = $this_VariableFeature_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getFeatureNamedAccess().getStarFeatureParserRuleCall_2()); 
    }
    this_StarFeature_2=ruleStarFeature
    { 
        $current = $this_StarFeature_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleSingleFeature
entryRuleSingleFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSingleFeatureRule()); }
	 iv_ruleSingleFeature=ruleSingleFeature 
	 { $current=$iv_ruleSingleFeature.current; } 
	 EOF 
;

// Rule SingleFeature
ruleSingleFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_featureName_0_0=RULE_ID
		{
			newLeafNode(lv_featureName_0_0, grammarAccess.getSingleFeatureAccess().getFeatureNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSingleFeatureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"featureName",
        		lv_featureName_0_0, 
        		"ID");
	    }

)
)
;





// Entry rule entryRuleVariableFeature
entryRuleVariableFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableFeatureRule()); }
	 iv_ruleVariableFeature=ruleVariableFeature 
	 { $current=$iv_ruleVariableFeature.current; } 
	 EOF 
;

// Rule VariableFeature
ruleVariableFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_featureName_0_0=RULE_ID
		{
			newLeafNode(lv_featureName_0_0, grammarAccess.getVariableFeatureAccess().getFeatureNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVariableFeatureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"featureName",
        		lv_featureName_0_0, 
        		"ID");
	    }

)
)this_DOT_1=RULE_DOT
    { 
    newLeafNode(this_DOT_1, grammarAccess.getVariableFeatureAccess().getDOTTerminalRuleCall_1()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVariableFeatureAccess().getVariableVariableParserRuleCall_2_0()); 
	    }
		lv_variable_2_0=ruleVariable		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableFeatureRule());
	        }
       		set(
       			$current, 
       			"variable",
        		lv_variable_2_0, 
        		"Variable");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	 iv_ruleVariable=ruleVariable 
	 { $current=$iv_ruleVariable.current; } 
	 EOF 
;

// Rule Variable
ruleVariable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_VARBEGIN_0=RULE_VARBEGIN
    { 
    newLeafNode(this_VARBEGIN_0, grammarAccess.getVariableAccess().getVARBEGINTerminalRuleCall_0()); 
    }
(
(
		lv_id_1_0=RULE_ID
		{
			newLeafNode(lv_id_1_0, grammarAccess.getVariableAccess().getIdIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVariableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleStarFeature
entryRuleStarFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStarFeatureRule()); }
	 iv_ruleStarFeature=ruleStarFeature 
	 { $current=$iv_ruleStarFeature.current; } 
	 EOF 
;

// Rule StarFeature
ruleStarFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_featureName_0_0=RULE_ID
		{
			newLeafNode(lv_featureName_0_0, grammarAccess.getStarFeatureAccess().getFeatureNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStarFeatureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"featureName",
        		lv_featureName_0_0, 
        		"ID");
	    }

)
)this_DOT_1=RULE_DOT
    { 
    newLeafNode(this_DOT_1, grammarAccess.getStarFeatureAccess().getDOTTerminalRuleCall_1()); 
    }
this_STAR_2=RULE_STAR
    { 
    newLeafNode(this_STAR_2, grammarAccess.getStarFeatureAccess().getSTARTerminalRuleCall_2()); 
    }
)
;





// Entry rule entryRuleRightPart
entryRuleRightPart returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRightPartRule()); }
	 iv_ruleRightPart=ruleRightPart 
	 { $current=$iv_ruleRightPart.current; } 
	 EOF 
;

// Rule RightPart
ruleRightPart returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getRightPartAccess().getActionACTIONFEATUREParserRuleCall_0_0()); 
	    }
		lv_action_0_0=ruleACTIONFEATURE		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRightPartRule());
	        }
       		set(
       			$current, 
       			"action",
        		lv_action_0_0, 
        		"ACTIONFEATURE");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRightPartAccess().getFeatureFeatureNamedParserRuleCall_1_0()); 
	    }
		lv_feature_1_0=ruleFeatureNamed		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRightPartRule());
	        }
       		set(
       			$current, 
       			"feature",
        		lv_feature_1_0, 
        		"FeatureNamed");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleFM_STATE
entryRuleFM_STATE returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getFM_STATERule()); } 
	 iv_ruleFM_STATE=ruleFM_STATE 
	 { $current=$iv_ruleFM_STATE.current.getText(); }  
	 EOF 
;

// Rule FM_STATE
ruleFM_STATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='SELECTED' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFM_STATEAccess().getSELECTEDKeyword_0()); 
    }

    |
	kw='DESELECTED' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFM_STATEAccess().getDESELECTEDKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleACTIONFEATURE
entryRuleACTIONFEATURE returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getACTIONFEATURERule()); } 
	 iv_ruleACTIONFEATURE=ruleACTIONFEATURE 
	 { $current=$iv_ruleACTIONFEATURE.current.getText(); }  
	 EOF 
;

// Rule ACTIONFEATURE
ruleACTIONFEATURE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='SELECT' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getACTIONFEATUREAccess().getSELECTKeyword_0()); 
    }

    |
	kw='DESELECT' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getACTIONFEATUREAccess().getDESELECTKeyword_1()); 
    }
)
    ;





RULE_IMPLY : '=>';

RULE_BEGIN_RULE : 'rule';

RULE_STAR : '*';

RULE_POINTS : ':';

RULE_END_RULE : ';';

RULE_COMMA : ',';

RULE_DOT : '.';

RULE_VARBEGIN : '$';

RULE_SOURCEKEY : 'source';

RULE_TARGETKEY : 'target';

RULE_EQUAL : '=';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


