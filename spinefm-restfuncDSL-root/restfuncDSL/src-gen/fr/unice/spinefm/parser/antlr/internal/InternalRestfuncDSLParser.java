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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestfuncDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BEGIN_RULE", "RULE_ID", "RULE_POINTS", "RULE_IMPLY", "RULE_END_RULE", "RULE_SOURCEKEY", "RULE_EQUAL", "RULE_TARGETKEY", "RULE_COMMA", "RULE_DOT", "RULE_VARBEGIN", "RULE_STAR", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SELECTED'", "'DESELECTED'", "'SELECT'", "'DESELECT'"
    };
    public static final int RULE_BEGIN_RULE=4;
    public static final int RULE_ID=5;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_VARBEGIN=14;
    public static final int RULE_IMPLY=7;
    public static final int RULE_COMMA=12;
    public static final int RULE_EQUAL=10;
    public static final int RULE_TARGETKEY=11;
    public static final int RULE_SL_COMMENT=19;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_STRING=17;
    public static final int RULE_END_RULE=8;
    public static final int RULE_DOT=13;
    public static final int RULE_STAR=15;
    public static final int RULE_POINTS=6;
    public static final int RULE_SOURCEKEY=9;
    public static final int RULE_INT=16;
    public static final int RULE_WS=20;

    // delegates
    // delegators


        public InternalRestfuncDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRestfuncDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRestfuncDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g"; }



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



    // $ANTLR start "entryRuleRestFunc"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:67:1: entryRuleRestFunc returns [EObject current=null] : iv_ruleRestFunc= ruleRestFunc EOF ;
    public final EObject entryRuleRestFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestFunc = null;


        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:68:2: (iv_ruleRestFunc= ruleRestFunc EOF )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:69:2: iv_ruleRestFunc= ruleRestFunc EOF
            {
             newCompositeNode(grammarAccess.getRestFuncRule()); 
            pushFollow(FOLLOW_ruleRestFunc_in_entryRuleRestFunc75);
            iv_ruleRestFunc=ruleRestFunc();

            state._fsp--;

             current =iv_ruleRestFunc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestFunc85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestFunc"


    // $ANTLR start "ruleRestFunc"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:76:1: ruleRestFunc returns [EObject current=null] : ( ( (lv_init_0_0= ruleSourceAndTarget ) ) ( (lv_rules_1_0= ruleRuleString ) )+ ) ;
    public final EObject ruleRestFunc() throws RecognitionException {
        EObject current = null;

        EObject lv_init_0_0 = null;

        EObject lv_rules_1_0 = null;


         enterRule(); 
            
        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:79:28: ( ( ( (lv_init_0_0= ruleSourceAndTarget ) ) ( (lv_rules_1_0= ruleRuleString ) )+ ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:80:1: ( ( (lv_init_0_0= ruleSourceAndTarget ) ) ( (lv_rules_1_0= ruleRuleString ) )+ )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:80:1: ( ( (lv_init_0_0= ruleSourceAndTarget ) ) ( (lv_rules_1_0= ruleRuleString ) )+ )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:80:2: ( (lv_init_0_0= ruleSourceAndTarget ) ) ( (lv_rules_1_0= ruleRuleString ) )+
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:80:2: ( (lv_init_0_0= ruleSourceAndTarget ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:81:1: (lv_init_0_0= ruleSourceAndTarget )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:81:1: (lv_init_0_0= ruleSourceAndTarget )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:82:3: lv_init_0_0= ruleSourceAndTarget
            {
             
            	        newCompositeNode(grammarAccess.getRestFuncAccess().getInitSourceAndTargetParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSourceAndTarget_in_ruleRestFunc131);
            lv_init_0_0=ruleSourceAndTarget();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestFuncRule());
            	        }
                   		set(
                   			current, 
                   			"init",
                    		lv_init_0_0, 
                    		"SourceAndTarget");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:98:2: ( (lv_rules_1_0= ruleRuleString ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_BEGIN_RULE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:99:1: (lv_rules_1_0= ruleRuleString )
            	    {
            	    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:99:1: (lv_rules_1_0= ruleRuleString )
            	    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:100:3: lv_rules_1_0= ruleRuleString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestFuncAccess().getRulesRuleStringParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRuleString_in_ruleRestFunc152);
            	    lv_rules_1_0=ruleRuleString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestFuncRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_1_0, 
            	            		"RuleString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestFunc"


    // $ANTLR start "entryRuleRuleString"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:124:1: entryRuleRuleString returns [EObject current=null] : iv_ruleRuleString= ruleRuleString EOF ;
    public final EObject entryRuleRuleString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleString = null;


        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:125:2: (iv_ruleRuleString= ruleRuleString EOF )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:126:2: iv_ruleRuleString= ruleRuleString EOF
            {
             newCompositeNode(grammarAccess.getRuleStringRule()); 
            pushFollow(FOLLOW_ruleRuleString_in_entryRuleRuleString189);
            iv_ruleRuleString=ruleRuleString();

            state._fsp--;

             current =iv_ruleRuleString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleString199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleString"


    // $ANTLR start "ruleRuleString"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:133:1: ruleRuleString returns [EObject current=null] : (this_BEGIN_RULE_0= RULE_BEGIN_RULE ( (lv_id_1_0= RULE_ID ) )? this_POINTS_2= RULE_POINTS ( (lv_left_3_0= ruleLeftPart ) ) this_IMPLY_4= RULE_IMPLY ( (lv_right_5_0= ruleRightPart ) ) this_END_RULE_6= RULE_END_RULE ) ;
    public final EObject ruleRuleString() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_RULE_0=null;
        Token lv_id_1_0=null;
        Token this_POINTS_2=null;
        Token this_IMPLY_4=null;
        Token this_END_RULE_6=null;
        EObject lv_left_3_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:136:28: ( (this_BEGIN_RULE_0= RULE_BEGIN_RULE ( (lv_id_1_0= RULE_ID ) )? this_POINTS_2= RULE_POINTS ( (lv_left_3_0= ruleLeftPart ) ) this_IMPLY_4= RULE_IMPLY ( (lv_right_5_0= ruleRightPart ) ) this_END_RULE_6= RULE_END_RULE ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:137:1: (this_BEGIN_RULE_0= RULE_BEGIN_RULE ( (lv_id_1_0= RULE_ID ) )? this_POINTS_2= RULE_POINTS ( (lv_left_3_0= ruleLeftPart ) ) this_IMPLY_4= RULE_IMPLY ( (lv_right_5_0= ruleRightPart ) ) this_END_RULE_6= RULE_END_RULE )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:137:1: (this_BEGIN_RULE_0= RULE_BEGIN_RULE ( (lv_id_1_0= RULE_ID ) )? this_POINTS_2= RULE_POINTS ( (lv_left_3_0= ruleLeftPart ) ) this_IMPLY_4= RULE_IMPLY ( (lv_right_5_0= ruleRightPart ) ) this_END_RULE_6= RULE_END_RULE )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:137:2: this_BEGIN_RULE_0= RULE_BEGIN_RULE ( (lv_id_1_0= RULE_ID ) )? this_POINTS_2= RULE_POINTS ( (lv_left_3_0= ruleLeftPart ) ) this_IMPLY_4= RULE_IMPLY ( (lv_right_5_0= ruleRightPart ) ) this_END_RULE_6= RULE_END_RULE
            {
            this_BEGIN_RULE_0=(Token)match(input,RULE_BEGIN_RULE,FOLLOW_RULE_BEGIN_RULE_in_ruleRuleString235); 
             
                newLeafNode(this_BEGIN_RULE_0, grammarAccess.getRuleStringAccess().getBEGIN_RULETerminalRuleCall_0()); 
                
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:141:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:142:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:142:1: (lv_id_1_0= RULE_ID )
                    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:143:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleString251); 

                    			newLeafNode(lv_id_1_0, grammarAccess.getRuleStringAccess().getIdIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRuleStringRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            this_POINTS_2=(Token)match(input,RULE_POINTS,FOLLOW_RULE_POINTS_in_ruleRuleString268); 
             
                newLeafNode(this_POINTS_2, grammarAccess.getRuleStringAccess().getPOINTSTerminalRuleCall_2()); 
                
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:163:1: ( (lv_left_3_0= ruleLeftPart ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:164:1: (lv_left_3_0= ruleLeftPart )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:164:1: (lv_left_3_0= ruleLeftPart )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:165:3: lv_left_3_0= ruleLeftPart
            {
             
            	        newCompositeNode(grammarAccess.getRuleStringAccess().getLeftLeftPartParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLeftPart_in_ruleRuleString288);
            lv_left_3_0=ruleLeftPart();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleStringRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_3_0, 
                    		"LeftPart");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_IMPLY_4=(Token)match(input,RULE_IMPLY,FOLLOW_RULE_IMPLY_in_ruleRuleString299); 
             
                newLeafNode(this_IMPLY_4, grammarAccess.getRuleStringAccess().getIMPLYTerminalRuleCall_4()); 
                
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:185:1: ( (lv_right_5_0= ruleRightPart ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:186:1: (lv_right_5_0= ruleRightPart )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:186:1: (lv_right_5_0= ruleRightPart )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:187:3: lv_right_5_0= ruleRightPart
            {
             
            	        newCompositeNode(grammarAccess.getRuleStringAccess().getRightRightPartParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleRightPart_in_ruleRuleString319);
            lv_right_5_0=ruleRightPart();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleStringRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_5_0, 
                    		"RightPart");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_END_RULE_6=(Token)match(input,RULE_END_RULE,FOLLOW_RULE_END_RULE_in_ruleRuleString330); 
             
                newLeafNode(this_END_RULE_6, grammarAccess.getRuleStringAccess().getEND_RULETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleString"


    // $ANTLR start "entryRuleSourceAndTarget"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:215:1: entryRuleSourceAndTarget returns [EObject current=null] : iv_ruleSourceAndTarget= ruleSourceAndTarget EOF ;
    public final EObject entryRuleSourceAndTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceAndTarget = null;


        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:216:2: (iv_ruleSourceAndTarget= ruleSourceAndTarget EOF )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:217:2: iv_ruleSourceAndTarget= ruleSourceAndTarget EOF
            {
             newCompositeNode(grammarAccess.getSourceAndTargetRule()); 
            pushFollow(FOLLOW_ruleSourceAndTarget_in_entryRuleSourceAndTarget365);
            iv_ruleSourceAndTarget=ruleSourceAndTarget();

            state._fsp--;

             current =iv_ruleSourceAndTarget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceAndTarget375); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceAndTarget"


    // $ANTLR start "ruleSourceAndTarget"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:224:1: ruleSourceAndTarget returns [EObject current=null] : ( ( (lv_source_0_0= ruleSource ) ) ( (lv_target_1_0= ruleTarget ) ) ) ;
    public final EObject ruleSourceAndTarget() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_target_1_0 = null;


         enterRule(); 
            
        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:227:28: ( ( ( (lv_source_0_0= ruleSource ) ) ( (lv_target_1_0= ruleTarget ) ) ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:228:1: ( ( (lv_source_0_0= ruleSource ) ) ( (lv_target_1_0= ruleTarget ) ) )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:228:1: ( ( (lv_source_0_0= ruleSource ) ) ( (lv_target_1_0= ruleTarget ) ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:228:2: ( (lv_source_0_0= ruleSource ) ) ( (lv_target_1_0= ruleTarget ) )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:228:2: ( (lv_source_0_0= ruleSource ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:229:1: (lv_source_0_0= ruleSource )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:229:1: (lv_source_0_0= ruleSource )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:230:3: lv_source_0_0= ruleSource
            {
             
            	        newCompositeNode(grammarAccess.getSourceAndTargetAccess().getSourceSourceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSource_in_ruleSourceAndTarget421);
            lv_source_0_0=ruleSource();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSourceAndTargetRule());
            	        }
                   		set(
                   			current, 
                   			"source",
                    		lv_source_0_0, 
                    		"Source");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:246:2: ( (lv_target_1_0= ruleTarget ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:247:1: (lv_target_1_0= ruleTarget )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:247:1: (lv_target_1_0= ruleTarget )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:248:3: lv_target_1_0= ruleTarget
            {
             
            	        newCompositeNode(grammarAccess.getSourceAndTargetAccess().getTargetTargetParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTarget_in_ruleSourceAndTarget442);
            lv_target_1_0=ruleTarget();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSourceAndTargetRule());
            	        }
                   		set(
                   			current, 
                   			"target",
                    		lv_target_1_0, 
                    		"Target");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceAndTarget"


    // $ANTLR start "entryRuleSource"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:272:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:273:2: (iv_ruleSource= ruleSource EOF )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:274:2: iv_ruleSource= ruleSource EOF
            {
             newCompositeNode(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_ruleSource_in_entryRuleSource478);
            iv_ruleSource=ruleSource();

            state._fsp--;

             current =iv_ruleSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSource488); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:281:1: ruleSource returns [EObject current=null] : (this_SOURCEKEY_0= RULE_SOURCEKEY this_EQUAL_1= RULE_EQUAL ( (lv_deSrc_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Token this_SOURCEKEY_0=null;
        Token this_EQUAL_1=null;
        Token lv_deSrc_2_0=null;

         enterRule(); 
            
        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:284:28: ( (this_SOURCEKEY_0= RULE_SOURCEKEY this_EQUAL_1= RULE_EQUAL ( (lv_deSrc_2_0= RULE_ID ) ) ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:285:1: (this_SOURCEKEY_0= RULE_SOURCEKEY this_EQUAL_1= RULE_EQUAL ( (lv_deSrc_2_0= RULE_ID ) ) )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:285:1: (this_SOURCEKEY_0= RULE_SOURCEKEY this_EQUAL_1= RULE_EQUAL ( (lv_deSrc_2_0= RULE_ID ) ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:285:2: this_SOURCEKEY_0= RULE_SOURCEKEY this_EQUAL_1= RULE_EQUAL ( (lv_deSrc_2_0= RULE_ID ) )
            {
            this_SOURCEKEY_0=(Token)match(input,RULE_SOURCEKEY,FOLLOW_RULE_SOURCEKEY_in_ruleSource524); 
             
                newLeafNode(this_SOURCEKEY_0, grammarAccess.getSourceAccess().getSOURCEKEYTerminalRuleCall_0()); 
                
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleSource534); 
             
                newLeafNode(this_EQUAL_1, grammarAccess.getSourceAccess().getEQUALTerminalRuleCall_1()); 
                
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:293:1: ( (lv_deSrc_2_0= RULE_ID ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:294:1: (lv_deSrc_2_0= RULE_ID )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:294:1: (lv_deSrc_2_0= RULE_ID )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:295:3: lv_deSrc_2_0= RULE_ID
            {
            lv_deSrc_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSource550); 

            			newLeafNode(lv_deSrc_2_0, grammarAccess.getSourceAccess().getDeSrcIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"deSrc",
                    		lv_deSrc_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleTarget"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:319:1: entryRuleTarget returns [EObject current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final EObject entryRuleTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget = null;


        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:320:2: (iv_ruleTarget= ruleTarget EOF )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:321:2: iv_ruleTarget= ruleTarget EOF
            {
             newCompositeNode(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_ruleTarget_in_entryRuleTarget591);
            iv_ruleTarget=ruleTarget();

            state._fsp--;

             current =iv_ruleTarget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTarget601); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:328:1: ruleTarget returns [EObject current=null] : (this_TARGETKEY_0= RULE_TARGETKEY this_EQUAL_1= RULE_EQUAL ( (lv_deTarget_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTarget() throws RecognitionException {
        EObject current = null;

        Token this_TARGETKEY_0=null;
        Token this_EQUAL_1=null;
        Token lv_deTarget_2_0=null;

         enterRule(); 
            
        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:331:28: ( (this_TARGETKEY_0= RULE_TARGETKEY this_EQUAL_1= RULE_EQUAL ( (lv_deTarget_2_0= RULE_ID ) ) ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:332:1: (this_TARGETKEY_0= RULE_TARGETKEY this_EQUAL_1= RULE_EQUAL ( (lv_deTarget_2_0= RULE_ID ) ) )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:332:1: (this_TARGETKEY_0= RULE_TARGETKEY this_EQUAL_1= RULE_EQUAL ( (lv_deTarget_2_0= RULE_ID ) ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:332:2: this_TARGETKEY_0= RULE_TARGETKEY this_EQUAL_1= RULE_EQUAL ( (lv_deTarget_2_0= RULE_ID ) )
            {
            this_TARGETKEY_0=(Token)match(input,RULE_TARGETKEY,FOLLOW_RULE_TARGETKEY_in_ruleTarget637); 
             
                newLeafNode(this_TARGETKEY_0, grammarAccess.getTargetAccess().getTARGETKEYTerminalRuleCall_0()); 
                
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleTarget647); 
             
                newLeafNode(this_EQUAL_1, grammarAccess.getTargetAccess().getEQUALTerminalRuleCall_1()); 
                
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:340:1: ( (lv_deTarget_2_0= RULE_ID ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:341:1: (lv_deTarget_2_0= RULE_ID )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:341:1: (lv_deTarget_2_0= RULE_ID )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:342:3: lv_deTarget_2_0= RULE_ID
            {
            lv_deTarget_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTarget663); 

            			newLeafNode(lv_deTarget_2_0, grammarAccess.getTargetAccess().getDeTargetIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTargetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"deTarget",
                    		lv_deTarget_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleLeftPart"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:366:1: entryRuleLeftPart returns [EObject current=null] : iv_ruleLeftPart= ruleLeftPart EOF ;
    public final EObject entryRuleLeftPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftPart = null;


        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:367:2: (iv_ruleLeftPart= ruleLeftPart EOF )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:368:2: iv_ruleLeftPart= ruleLeftPart EOF
            {
             newCompositeNode(grammarAccess.getLeftPartRule()); 
            pushFollow(FOLLOW_ruleLeftPart_in_entryRuleLeftPart704);
            iv_ruleLeftPart=ruleLeftPart();

            state._fsp--;

             current =iv_ruleLeftPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftPart714); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftPart"


    // $ANTLR start "ruleLeftPart"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:375:1: ruleLeftPart returns [EObject current=null] : ( (lv_features_0_0= ruleGroupFeature ) )+ ;
    public final EObject ruleLeftPart() throws RecognitionException {
        EObject current = null;

        EObject lv_features_0_0 = null;


         enterRule(); 
            
        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:378:28: ( ( (lv_features_0_0= ruleGroupFeature ) )+ )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:379:1: ( (lv_features_0_0= ruleGroupFeature ) )+
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:379:1: ( (lv_features_0_0= ruleGroupFeature ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=22 && LA3_0<=23)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:380:1: (lv_features_0_0= ruleGroupFeature )
            	    {
            	    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:380:1: (lv_features_0_0= ruleGroupFeature )
            	    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:381:3: lv_features_0_0= ruleGroupFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLeftPartAccess().getFeaturesGroupFeatureParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroupFeature_in_ruleLeftPart759);
            	    lv_features_0_0=ruleGroupFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLeftPartRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_0_0, 
            	            		"GroupFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeftPart"


    // $ANTLR start "entryRuleGroupFeature"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:405:1: entryRuleGroupFeature returns [EObject current=null] : iv_ruleGroupFeature= ruleGroupFeature EOF ;
    public final EObject entryRuleGroupFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupFeature = null;


        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:406:2: (iv_ruleGroupFeature= ruleGroupFeature EOF )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:407:2: iv_ruleGroupFeature= ruleGroupFeature EOF
            {
             newCompositeNode(grammarAccess.getGroupFeatureRule()); 
            pushFollow(FOLLOW_ruleGroupFeature_in_entryRuleGroupFeature795);
            iv_ruleGroupFeature=ruleGroupFeature();

            state._fsp--;

             current =iv_ruleGroupFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupFeature805); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupFeature"


    // $ANTLR start "ruleGroupFeature"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:414:1: ruleGroupFeature returns [EObject current=null] : ( ( (lv_state_0_0= ruleFM_STATE ) ) ( (lv_feature_1_0= ruleFeatureNamed ) ) (this_COMMA_2= RULE_COMMA ( (lv_feature_3_0= ruleFeatureNamed ) ) )* ) ;
    public final EObject ruleGroupFeature() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_2=null;
        AntlrDatatypeRuleToken lv_state_0_0 = null;

        EObject lv_feature_1_0 = null;

        EObject lv_feature_3_0 = null;


         enterRule(); 
            
        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:417:28: ( ( ( (lv_state_0_0= ruleFM_STATE ) ) ( (lv_feature_1_0= ruleFeatureNamed ) ) (this_COMMA_2= RULE_COMMA ( (lv_feature_3_0= ruleFeatureNamed ) ) )* ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:418:1: ( ( (lv_state_0_0= ruleFM_STATE ) ) ( (lv_feature_1_0= ruleFeatureNamed ) ) (this_COMMA_2= RULE_COMMA ( (lv_feature_3_0= ruleFeatureNamed ) ) )* )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:418:1: ( ( (lv_state_0_0= ruleFM_STATE ) ) ( (lv_feature_1_0= ruleFeatureNamed ) ) (this_COMMA_2= RULE_COMMA ( (lv_feature_3_0= ruleFeatureNamed ) ) )* )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:418:2: ( (lv_state_0_0= ruleFM_STATE ) ) ( (lv_feature_1_0= ruleFeatureNamed ) ) (this_COMMA_2= RULE_COMMA ( (lv_feature_3_0= ruleFeatureNamed ) ) )*
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:418:2: ( (lv_state_0_0= ruleFM_STATE ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:419:1: (lv_state_0_0= ruleFM_STATE )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:419:1: (lv_state_0_0= ruleFM_STATE )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:420:3: lv_state_0_0= ruleFM_STATE
            {
             
            	        newCompositeNode(grammarAccess.getGroupFeatureAccess().getStateFM_STATEParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFM_STATE_in_ruleGroupFeature851);
            lv_state_0_0=ruleFM_STATE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"state",
                    		lv_state_0_0, 
                    		"FM_STATE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:436:2: ( (lv_feature_1_0= ruleFeatureNamed ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:437:1: (lv_feature_1_0= ruleFeatureNamed )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:437:1: (lv_feature_1_0= ruleFeatureNamed )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:438:3: lv_feature_1_0= ruleFeatureNamed
            {
             
            	        newCompositeNode(grammarAccess.getGroupFeatureAccess().getFeatureFeatureNamedParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFeatureNamed_in_ruleGroupFeature872);
            lv_feature_1_0=ruleFeatureNamed();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupFeatureRule());
            	        }
                   		add(
                   			current, 
                   			"feature",
                    		lv_feature_1_0, 
                    		"FeatureNamed");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:454:2: (this_COMMA_2= RULE_COMMA ( (lv_feature_3_0= ruleFeatureNamed ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:454:3: this_COMMA_2= RULE_COMMA ( (lv_feature_3_0= ruleFeatureNamed ) )
            	    {
            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleGroupFeature884); 
            	     
            	        newLeafNode(this_COMMA_2, grammarAccess.getGroupFeatureAccess().getCOMMATerminalRuleCall_2_0()); 
            	        
            	    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:458:1: ( (lv_feature_3_0= ruleFeatureNamed ) )
            	    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:459:1: (lv_feature_3_0= ruleFeatureNamed )
            	    {
            	    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:459:1: (lv_feature_3_0= ruleFeatureNamed )
            	    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:460:3: lv_feature_3_0= ruleFeatureNamed
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupFeatureAccess().getFeatureFeatureNamedParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeatureNamed_in_ruleGroupFeature904);
            	    lv_feature_3_0=ruleFeatureNamed();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"feature",
            	            		lv_feature_3_0, 
            	            		"FeatureNamed");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupFeature"


    // $ANTLR start "entryRuleFeatureNamed"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:484:1: entryRuleFeatureNamed returns [EObject current=null] : iv_ruleFeatureNamed= ruleFeatureNamed EOF ;
    public final EObject entryRuleFeatureNamed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureNamed = null;


        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:485:2: (iv_ruleFeatureNamed= ruleFeatureNamed EOF )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:486:2: iv_ruleFeatureNamed= ruleFeatureNamed EOF
            {
             newCompositeNode(grammarAccess.getFeatureNamedRule()); 
            pushFollow(FOLLOW_ruleFeatureNamed_in_entryRuleFeatureNamed942);
            iv_ruleFeatureNamed=ruleFeatureNamed();

            state._fsp--;

             current =iv_ruleFeatureNamed; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureNamed952); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureNamed"


    // $ANTLR start "ruleFeatureNamed"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:493:1: ruleFeatureNamed returns [EObject current=null] : (this_SingleFeature_0= ruleSingleFeature | this_VariableFeature_1= ruleVariableFeature | this_StarFeature_2= ruleStarFeature ) ;
    public final EObject ruleFeatureNamed() throws RecognitionException {
        EObject current = null;

        EObject this_SingleFeature_0 = null;

        EObject this_VariableFeature_1 = null;

        EObject this_StarFeature_2 = null;


         enterRule(); 
            
        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:496:28: ( (this_SingleFeature_0= ruleSingleFeature | this_VariableFeature_1= ruleVariableFeature | this_StarFeature_2= ruleStarFeature ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:497:1: (this_SingleFeature_0= ruleSingleFeature | this_VariableFeature_1= ruleVariableFeature | this_StarFeature_2= ruleStarFeature )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:497:1: (this_SingleFeature_0= ruleSingleFeature | this_VariableFeature_1= ruleVariableFeature | this_StarFeature_2= ruleStarFeature )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_DOT) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==RULE_STAR) ) {
                        alt5=3;
                    }
                    else if ( (LA5_2==RULE_VARBEGIN) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==EOF||(LA5_1>=RULE_IMPLY && LA5_1<=RULE_END_RULE)||LA5_1==RULE_COMMA||(LA5_1>=22 && LA5_1<=23)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:498:5: this_SingleFeature_0= ruleSingleFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureNamedAccess().getSingleFeatureParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSingleFeature_in_ruleFeatureNamed999);
                    this_SingleFeature_0=ruleSingleFeature();

                    state._fsp--;

                     
                            current = this_SingleFeature_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:508:5: this_VariableFeature_1= ruleVariableFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureNamedAccess().getVariableFeatureParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableFeature_in_ruleFeatureNamed1026);
                    this_VariableFeature_1=ruleVariableFeature();

                    state._fsp--;

                     
                            current = this_VariableFeature_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:518:5: this_StarFeature_2= ruleStarFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureNamedAccess().getStarFeatureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStarFeature_in_ruleFeatureNamed1053);
                    this_StarFeature_2=ruleStarFeature();

                    state._fsp--;

                     
                            current = this_StarFeature_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureNamed"


    // $ANTLR start "entryRuleSingleFeature"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:534:1: entryRuleSingleFeature returns [EObject current=null] : iv_ruleSingleFeature= ruleSingleFeature EOF ;
    public final EObject entryRuleSingleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleFeature = null;


        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:535:2: (iv_ruleSingleFeature= ruleSingleFeature EOF )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:536:2: iv_ruleSingleFeature= ruleSingleFeature EOF
            {
             newCompositeNode(grammarAccess.getSingleFeatureRule()); 
            pushFollow(FOLLOW_ruleSingleFeature_in_entryRuleSingleFeature1088);
            iv_ruleSingleFeature=ruleSingleFeature();

            state._fsp--;

             current =iv_ruleSingleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleFeature1098); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleFeature"


    // $ANTLR start "ruleSingleFeature"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:543:1: ruleSingleFeature returns [EObject current=null] : ( (lv_featureName_0_0= RULE_ID ) ) ;
    public final EObject ruleSingleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_featureName_0_0=null;

         enterRule(); 
            
        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:546:28: ( ( (lv_featureName_0_0= RULE_ID ) ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:547:1: ( (lv_featureName_0_0= RULE_ID ) )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:547:1: ( (lv_featureName_0_0= RULE_ID ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:548:1: (lv_featureName_0_0= RULE_ID )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:548:1: (lv_featureName_0_0= RULE_ID )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:549:3: lv_featureName_0_0= RULE_ID
            {
            lv_featureName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleFeature1139); 

            			newLeafNode(lv_featureName_0_0, grammarAccess.getSingleFeatureAccess().getFeatureNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"featureName",
                    		lv_featureName_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleFeature"


    // $ANTLR start "entryRuleVariableFeature"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:573:1: entryRuleVariableFeature returns [EObject current=null] : iv_ruleVariableFeature= ruleVariableFeature EOF ;
    public final EObject entryRuleVariableFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableFeature = null;


        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:574:2: (iv_ruleVariableFeature= ruleVariableFeature EOF )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:575:2: iv_ruleVariableFeature= ruleVariableFeature EOF
            {
             newCompositeNode(grammarAccess.getVariableFeatureRule()); 
            pushFollow(FOLLOW_ruleVariableFeature_in_entryRuleVariableFeature1179);
            iv_ruleVariableFeature=ruleVariableFeature();

            state._fsp--;

             current =iv_ruleVariableFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableFeature1189); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableFeature"


    // $ANTLR start "ruleVariableFeature"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:582:1: ruleVariableFeature returns [EObject current=null] : ( ( (lv_featureName_0_0= RULE_ID ) ) this_DOT_1= RULE_DOT ( (lv_variable_2_0= ruleVariable ) ) ) ;
    public final EObject ruleVariableFeature() throws RecognitionException {
        EObject current = null;

        Token lv_featureName_0_0=null;
        Token this_DOT_1=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:585:28: ( ( ( (lv_featureName_0_0= RULE_ID ) ) this_DOT_1= RULE_DOT ( (lv_variable_2_0= ruleVariable ) ) ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:586:1: ( ( (lv_featureName_0_0= RULE_ID ) ) this_DOT_1= RULE_DOT ( (lv_variable_2_0= ruleVariable ) ) )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:586:1: ( ( (lv_featureName_0_0= RULE_ID ) ) this_DOT_1= RULE_DOT ( (lv_variable_2_0= ruleVariable ) ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:586:2: ( (lv_featureName_0_0= RULE_ID ) ) this_DOT_1= RULE_DOT ( (lv_variable_2_0= ruleVariable ) )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:586:2: ( (lv_featureName_0_0= RULE_ID ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:587:1: (lv_featureName_0_0= RULE_ID )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:587:1: (lv_featureName_0_0= RULE_ID )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:588:3: lv_featureName_0_0= RULE_ID
            {
            lv_featureName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableFeature1231); 

            			newLeafNode(lv_featureName_0_0, grammarAccess.getVariableFeatureAccess().getFeatureNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"featureName",
                    		lv_featureName_0_0, 
                    		"ID");
            	    

            }


            }

            this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariableFeature1247); 
             
                newLeafNode(this_DOT_1, grammarAccess.getVariableFeatureAccess().getDOTTerminalRuleCall_1()); 
                
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:608:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:609:1: (lv_variable_2_0= ruleVariable )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:609:1: (lv_variable_2_0= ruleVariable )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:610:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getVariableFeatureAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleVariableFeature1267);
            lv_variable_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableFeature"


    // $ANTLR start "entryRuleVariable"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:634:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:635:2: (iv_ruleVariable= ruleVariable EOF )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:636:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1303);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1313); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:643:1: ruleVariable returns [EObject current=null] : (this_VARBEGIN_0= RULE_VARBEGIN ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token this_VARBEGIN_0=null;
        Token lv_id_1_0=null;

         enterRule(); 
            
        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:646:28: ( (this_VARBEGIN_0= RULE_VARBEGIN ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:647:1: (this_VARBEGIN_0= RULE_VARBEGIN ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:647:1: (this_VARBEGIN_0= RULE_VARBEGIN ( (lv_id_1_0= RULE_ID ) ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:647:2: this_VARBEGIN_0= RULE_VARBEGIN ( (lv_id_1_0= RULE_ID ) )
            {
            this_VARBEGIN_0=(Token)match(input,RULE_VARBEGIN,FOLLOW_RULE_VARBEGIN_in_ruleVariable1349); 
             
                newLeafNode(this_VARBEGIN_0, grammarAccess.getVariableAccess().getVARBEGINTerminalRuleCall_0()); 
                
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:651:1: ( (lv_id_1_0= RULE_ID ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:652:1: (lv_id_1_0= RULE_ID )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:652:1: (lv_id_1_0= RULE_ID )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:653:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1365); 

            			newLeafNode(lv_id_1_0, grammarAccess.getVariableAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleStarFeature"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:677:1: entryRuleStarFeature returns [EObject current=null] : iv_ruleStarFeature= ruleStarFeature EOF ;
    public final EObject entryRuleStarFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStarFeature = null;


        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:678:2: (iv_ruleStarFeature= ruleStarFeature EOF )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:679:2: iv_ruleStarFeature= ruleStarFeature EOF
            {
             newCompositeNode(grammarAccess.getStarFeatureRule()); 
            pushFollow(FOLLOW_ruleStarFeature_in_entryRuleStarFeature1406);
            iv_ruleStarFeature=ruleStarFeature();

            state._fsp--;

             current =iv_ruleStarFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStarFeature1416); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStarFeature"


    // $ANTLR start "ruleStarFeature"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:686:1: ruleStarFeature returns [EObject current=null] : ( ( (lv_featureName_0_0= RULE_ID ) ) this_DOT_1= RULE_DOT this_STAR_2= RULE_STAR ) ;
    public final EObject ruleStarFeature() throws RecognitionException {
        EObject current = null;

        Token lv_featureName_0_0=null;
        Token this_DOT_1=null;
        Token this_STAR_2=null;

         enterRule(); 
            
        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:689:28: ( ( ( (lv_featureName_0_0= RULE_ID ) ) this_DOT_1= RULE_DOT this_STAR_2= RULE_STAR ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:690:1: ( ( (lv_featureName_0_0= RULE_ID ) ) this_DOT_1= RULE_DOT this_STAR_2= RULE_STAR )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:690:1: ( ( (lv_featureName_0_0= RULE_ID ) ) this_DOT_1= RULE_DOT this_STAR_2= RULE_STAR )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:690:2: ( (lv_featureName_0_0= RULE_ID ) ) this_DOT_1= RULE_DOT this_STAR_2= RULE_STAR
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:690:2: ( (lv_featureName_0_0= RULE_ID ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:691:1: (lv_featureName_0_0= RULE_ID )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:691:1: (lv_featureName_0_0= RULE_ID )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:692:3: lv_featureName_0_0= RULE_ID
            {
            lv_featureName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStarFeature1458); 

            			newLeafNode(lv_featureName_0_0, grammarAccess.getStarFeatureAccess().getFeatureNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStarFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"featureName",
                    		lv_featureName_0_0, 
                    		"ID");
            	    

            }


            }

            this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleStarFeature1474); 
             
                newLeafNode(this_DOT_1, grammarAccess.getStarFeatureAccess().getDOTTerminalRuleCall_1()); 
                
            this_STAR_2=(Token)match(input,RULE_STAR,FOLLOW_RULE_STAR_in_ruleStarFeature1484); 
             
                newLeafNode(this_STAR_2, grammarAccess.getStarFeatureAccess().getSTARTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStarFeature"


    // $ANTLR start "entryRuleRightPart"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:724:1: entryRuleRightPart returns [EObject current=null] : iv_ruleRightPart= ruleRightPart EOF ;
    public final EObject entryRuleRightPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightPart = null;


        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:725:2: (iv_ruleRightPart= ruleRightPart EOF )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:726:2: iv_ruleRightPart= ruleRightPart EOF
            {
             newCompositeNode(grammarAccess.getRightPartRule()); 
            pushFollow(FOLLOW_ruleRightPart_in_entryRuleRightPart1519);
            iv_ruleRightPart=ruleRightPart();

            state._fsp--;

             current =iv_ruleRightPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightPart1529); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightPart"


    // $ANTLR start "ruleRightPart"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:733:1: ruleRightPart returns [EObject current=null] : ( ( (lv_action_0_0= ruleACTIONFEATURE ) ) ( (lv_feature_1_0= ruleFeatureNamed ) ) ) ;
    public final EObject ruleRightPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_action_0_0 = null;

        EObject lv_feature_1_0 = null;


         enterRule(); 
            
        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:736:28: ( ( ( (lv_action_0_0= ruleACTIONFEATURE ) ) ( (lv_feature_1_0= ruleFeatureNamed ) ) ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:737:1: ( ( (lv_action_0_0= ruleACTIONFEATURE ) ) ( (lv_feature_1_0= ruleFeatureNamed ) ) )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:737:1: ( ( (lv_action_0_0= ruleACTIONFEATURE ) ) ( (lv_feature_1_0= ruleFeatureNamed ) ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:737:2: ( (lv_action_0_0= ruleACTIONFEATURE ) ) ( (lv_feature_1_0= ruleFeatureNamed ) )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:737:2: ( (lv_action_0_0= ruleACTIONFEATURE ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:738:1: (lv_action_0_0= ruleACTIONFEATURE )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:738:1: (lv_action_0_0= ruleACTIONFEATURE )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:739:3: lv_action_0_0= ruleACTIONFEATURE
            {
             
            	        newCompositeNode(grammarAccess.getRightPartAccess().getActionACTIONFEATUREParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleACTIONFEATURE_in_ruleRightPart1575);
            lv_action_0_0=ruleACTIONFEATURE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRightPartRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_0_0, 
                    		"ACTIONFEATURE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:755:2: ( (lv_feature_1_0= ruleFeatureNamed ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:756:1: (lv_feature_1_0= ruleFeatureNamed )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:756:1: (lv_feature_1_0= ruleFeatureNamed )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:757:3: lv_feature_1_0= ruleFeatureNamed
            {
             
            	        newCompositeNode(grammarAccess.getRightPartAccess().getFeatureFeatureNamedParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFeatureNamed_in_ruleRightPart1596);
            lv_feature_1_0=ruleFeatureNamed();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRightPartRule());
            	        }
                   		set(
                   			current, 
                   			"feature",
                    		lv_feature_1_0, 
                    		"FeatureNamed");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRightPart"


    // $ANTLR start "entryRuleFM_STATE"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:781:1: entryRuleFM_STATE returns [String current=null] : iv_ruleFM_STATE= ruleFM_STATE EOF ;
    public final String entryRuleFM_STATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFM_STATE = null;


        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:782:2: (iv_ruleFM_STATE= ruleFM_STATE EOF )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:783:2: iv_ruleFM_STATE= ruleFM_STATE EOF
            {
             newCompositeNode(grammarAccess.getFM_STATERule()); 
            pushFollow(FOLLOW_ruleFM_STATE_in_entryRuleFM_STATE1633);
            iv_ruleFM_STATE=ruleFM_STATE();

            state._fsp--;

             current =iv_ruleFM_STATE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFM_STATE1644); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFM_STATE"


    // $ANTLR start "ruleFM_STATE"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:790:1: ruleFM_STATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'SELECTED' | kw= 'DESELECTED' ) ;
    public final AntlrDatatypeRuleToken ruleFM_STATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:793:28: ( (kw= 'SELECTED' | kw= 'DESELECTED' ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:794:1: (kw= 'SELECTED' | kw= 'DESELECTED' )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:794:1: (kw= 'SELECTED' | kw= 'DESELECTED' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:795:2: kw= 'SELECTED'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleFM_STATE1682); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFM_STATEAccess().getSELECTEDKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:802:2: kw= 'DESELECTED'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleFM_STATE1701); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFM_STATEAccess().getDESELECTEDKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFM_STATE"


    // $ANTLR start "entryRuleACTIONFEATURE"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:815:1: entryRuleACTIONFEATURE returns [String current=null] : iv_ruleACTIONFEATURE= ruleACTIONFEATURE EOF ;
    public final String entryRuleACTIONFEATURE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleACTIONFEATURE = null;


        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:816:2: (iv_ruleACTIONFEATURE= ruleACTIONFEATURE EOF )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:817:2: iv_ruleACTIONFEATURE= ruleACTIONFEATURE EOF
            {
             newCompositeNode(grammarAccess.getACTIONFEATURERule()); 
            pushFollow(FOLLOW_ruleACTIONFEATURE_in_entryRuleACTIONFEATURE1742);
            iv_ruleACTIONFEATURE=ruleACTIONFEATURE();

            state._fsp--;

             current =iv_ruleACTIONFEATURE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleACTIONFEATURE1753); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleACTIONFEATURE"


    // $ANTLR start "ruleACTIONFEATURE"
    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:824:1: ruleACTIONFEATURE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'SELECT' | kw= 'DESELECT' ) ;
    public final AntlrDatatypeRuleToken ruleACTIONFEATURE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:827:28: ( (kw= 'SELECT' | kw= 'DESELECT' ) )
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:828:1: (kw= 'SELECT' | kw= 'DESELECT' )
            {
            // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:828:1: (kw= 'SELECT' | kw= 'DESELECT' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:829:2: kw= 'SELECT'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleACTIONFEATURE1791); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getACTIONFEATUREAccess().getSELECTKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../restfuncDSL/src-gen/fr/unice/spinefm/parser/antlr/internal/InternalRestfuncDSL.g:836:2: kw= 'DESELECT'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleACTIONFEATURE1810); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getACTIONFEATUREAccess().getDESELECTKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleACTIONFEATURE"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRestFunc_in_entryRuleRestFunc75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestFunc85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceAndTarget_in_ruleRestFunc131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleString_in_ruleRestFunc152 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleRuleString_in_entryRuleRuleString189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleString199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_RULE_in_ruleRuleString235 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleString251 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_POINTS_in_ruleRuleString268 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleLeftPart_in_ruleRuleString288 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_IMPLY_in_ruleRuleString299 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ruleRightPart_in_ruleRuleString319 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_END_RULE_in_ruleRuleString330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceAndTarget_in_entryRuleSourceAndTarget365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceAndTarget375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_ruleSourceAndTarget421 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleTarget_in_ruleSourceAndTarget442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_entryRuleSource478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSource488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SOURCEKEY_in_ruleSource524 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleSource534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSource550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTarget_in_entryRuleTarget591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTarget601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TARGETKEY_in_ruleTarget637 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleTarget647 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTarget663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftPart_in_entryRuleLeftPart704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftPart714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupFeature_in_ruleLeftPart759 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleGroupFeature_in_entryRuleGroupFeature795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupFeature805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFM_STATE_in_ruleGroupFeature851 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFeatureNamed_in_ruleGroupFeature872 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleGroupFeature884 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFeatureNamed_in_ruleGroupFeature904 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleFeatureNamed_in_entryRuleFeatureNamed942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureNamed952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleFeature_in_ruleFeatureNamed999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableFeature_in_ruleFeatureNamed1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStarFeature_in_ruleFeatureNamed1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleFeature_in_entryRuleSingleFeature1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleFeature1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleFeature1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableFeature_in_entryRuleVariableFeature1179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableFeature1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableFeature1231 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariableFeature1247 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariableFeature1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARBEGIN_in_ruleVariable1349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStarFeature_in_entryRuleStarFeature1406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStarFeature1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStarFeature1458 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleStarFeature1474 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_STAR_in_ruleStarFeature1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightPart_in_entryRuleRightPart1519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightPart1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACTIONFEATURE_in_ruleRightPart1575 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFeatureNamed_in_ruleRightPart1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFM_STATE_in_entryRuleFM_STATE1633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFM_STATE1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFM_STATE1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFM_STATE1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACTIONFEATURE_in_entryRuleACTIONFEATURE1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleACTIONFEATURE1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleACTIONFEATURE1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleACTIONFEATURE1810 = new BitSet(new long[]{0x0000000000000002L});

}