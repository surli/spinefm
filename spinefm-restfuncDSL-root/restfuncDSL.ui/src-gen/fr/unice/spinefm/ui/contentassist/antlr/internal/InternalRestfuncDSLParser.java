package fr.unice.spinefm.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.unice.spinefm.services.RestfuncDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestfuncDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BEGIN_RULE", "RULE_POINTS", "RULE_IMPLY", "RULE_END_RULE", "RULE_SOURCEKEY", "RULE_EQUAL", "RULE_TARGETKEY", "RULE_COMMA", "RULE_DOT", "RULE_VARBEGIN", "RULE_STAR", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SELECTED'", "'DESELECTED'", "'SELECT'", "'DESELECT'"
    };
    public static final int RULE_ID=15;
    public static final int RULE_BEGIN_RULE=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_VARBEGIN=13;
    public static final int RULE_IMPLY=6;
    public static final int RULE_COMMA=11;
    public static final int RULE_EQUAL=9;
    public static final int RULE_TARGETKEY=10;
    public static final int RULE_SL_COMMENT=19;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_STRING=17;
    public static final int RULE_END_RULE=7;
    public static final int RULE_DOT=12;
    public static final int RULE_STAR=14;
    public static final int RULE_POINTS=5;
    public static final int RULE_SOURCEKEY=8;
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
    public String getGrammarFileName() { return "../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g"; }


     
     	private RestfuncDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RestfuncDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleRestFunc"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:60:1: entryRuleRestFunc : ruleRestFunc EOF ;
    public final void entryRuleRestFunc() throws RecognitionException {
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:61:1: ( ruleRestFunc EOF )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:62:1: ruleRestFunc EOF
            {
             before(grammarAccess.getRestFuncRule()); 
            pushFollow(FOLLOW_ruleRestFunc_in_entryRuleRestFunc61);
            ruleRestFunc();

            state._fsp--;

             after(grammarAccess.getRestFuncRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestFunc68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRestFunc"


    // $ANTLR start "ruleRestFunc"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:69:1: ruleRestFunc : ( ( rule__RestFunc__Group__0 ) ) ;
    public final void ruleRestFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:73:2: ( ( ( rule__RestFunc__Group__0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:74:1: ( ( rule__RestFunc__Group__0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:74:1: ( ( rule__RestFunc__Group__0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:75:1: ( rule__RestFunc__Group__0 )
            {
             before(grammarAccess.getRestFuncAccess().getGroup()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:76:1: ( rule__RestFunc__Group__0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:76:2: rule__RestFunc__Group__0
            {
            pushFollow(FOLLOW_rule__RestFunc__Group__0_in_ruleRestFunc94);
            rule__RestFunc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestFuncAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestFunc"


    // $ANTLR start "entryRuleRuleString"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:88:1: entryRuleRuleString : ruleRuleString EOF ;
    public final void entryRuleRuleString() throws RecognitionException {
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:89:1: ( ruleRuleString EOF )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:90:1: ruleRuleString EOF
            {
             before(grammarAccess.getRuleStringRule()); 
            pushFollow(FOLLOW_ruleRuleString_in_entryRuleRuleString121);
            ruleRuleString();

            state._fsp--;

             after(grammarAccess.getRuleStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleString128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleString"


    // $ANTLR start "ruleRuleString"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:97:1: ruleRuleString : ( ( rule__RuleString__Group__0 ) ) ;
    public final void ruleRuleString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:101:2: ( ( ( rule__RuleString__Group__0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:102:1: ( ( rule__RuleString__Group__0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:102:1: ( ( rule__RuleString__Group__0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:103:1: ( rule__RuleString__Group__0 )
            {
             before(grammarAccess.getRuleStringAccess().getGroup()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:104:1: ( rule__RuleString__Group__0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:104:2: rule__RuleString__Group__0
            {
            pushFollow(FOLLOW_rule__RuleString__Group__0_in_ruleRuleString154);
            rule__RuleString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleString"


    // $ANTLR start "entryRuleSourceAndTarget"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:116:1: entryRuleSourceAndTarget : ruleSourceAndTarget EOF ;
    public final void entryRuleSourceAndTarget() throws RecognitionException {
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:117:1: ( ruleSourceAndTarget EOF )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:118:1: ruleSourceAndTarget EOF
            {
             before(grammarAccess.getSourceAndTargetRule()); 
            pushFollow(FOLLOW_ruleSourceAndTarget_in_entryRuleSourceAndTarget181);
            ruleSourceAndTarget();

            state._fsp--;

             after(grammarAccess.getSourceAndTargetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceAndTarget188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceAndTarget"


    // $ANTLR start "ruleSourceAndTarget"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:125:1: ruleSourceAndTarget : ( ( rule__SourceAndTarget__Group__0 ) ) ;
    public final void ruleSourceAndTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:129:2: ( ( ( rule__SourceAndTarget__Group__0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:130:1: ( ( rule__SourceAndTarget__Group__0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:130:1: ( ( rule__SourceAndTarget__Group__0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:131:1: ( rule__SourceAndTarget__Group__0 )
            {
             before(grammarAccess.getSourceAndTargetAccess().getGroup()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:132:1: ( rule__SourceAndTarget__Group__0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:132:2: rule__SourceAndTarget__Group__0
            {
            pushFollow(FOLLOW_rule__SourceAndTarget__Group__0_in_ruleSourceAndTarget214);
            rule__SourceAndTarget__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAndTargetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceAndTarget"


    // $ANTLR start "entryRuleSource"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:144:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:145:1: ( ruleSource EOF )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:146:1: ruleSource EOF
            {
             before(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_ruleSource_in_entryRuleSource241);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getSourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSource248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:153:1: ruleSource : ( ( rule__Source__Group__0 ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:157:2: ( ( ( rule__Source__Group__0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:158:1: ( ( rule__Source__Group__0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:158:1: ( ( rule__Source__Group__0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:159:1: ( rule__Source__Group__0 )
            {
             before(grammarAccess.getSourceAccess().getGroup()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:160:1: ( rule__Source__Group__0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:160:2: rule__Source__Group__0
            {
            pushFollow(FOLLOW_rule__Source__Group__0_in_ruleSource274);
            rule__Source__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleTarget"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:172:1: entryRuleTarget : ruleTarget EOF ;
    public final void entryRuleTarget() throws RecognitionException {
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:173:1: ( ruleTarget EOF )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:174:1: ruleTarget EOF
            {
             before(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_ruleTarget_in_entryRuleTarget301);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getTargetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTarget308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:181:1: ruleTarget : ( ( rule__Target__Group__0 ) ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:185:2: ( ( ( rule__Target__Group__0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:186:1: ( ( rule__Target__Group__0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:186:1: ( ( rule__Target__Group__0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:187:1: ( rule__Target__Group__0 )
            {
             before(grammarAccess.getTargetAccess().getGroup()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:188:1: ( rule__Target__Group__0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:188:2: rule__Target__Group__0
            {
            pushFollow(FOLLOW_rule__Target__Group__0_in_ruleTarget334);
            rule__Target__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleLeftPart"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:200:1: entryRuleLeftPart : ruleLeftPart EOF ;
    public final void entryRuleLeftPart() throws RecognitionException {
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:201:1: ( ruleLeftPart EOF )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:202:1: ruleLeftPart EOF
            {
             before(grammarAccess.getLeftPartRule()); 
            pushFollow(FOLLOW_ruleLeftPart_in_entryRuleLeftPart361);
            ruleLeftPart();

            state._fsp--;

             after(grammarAccess.getLeftPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftPart368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeftPart"


    // $ANTLR start "ruleLeftPart"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:209:1: ruleLeftPart : ( ( ( rule__LeftPart__FeaturesAssignment ) ) ( ( rule__LeftPart__FeaturesAssignment )* ) ) ;
    public final void ruleLeftPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:213:2: ( ( ( ( rule__LeftPart__FeaturesAssignment ) ) ( ( rule__LeftPart__FeaturesAssignment )* ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:214:1: ( ( ( rule__LeftPart__FeaturesAssignment ) ) ( ( rule__LeftPart__FeaturesAssignment )* ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:214:1: ( ( ( rule__LeftPart__FeaturesAssignment ) ) ( ( rule__LeftPart__FeaturesAssignment )* ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:215:1: ( ( rule__LeftPart__FeaturesAssignment ) ) ( ( rule__LeftPart__FeaturesAssignment )* )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:215:1: ( ( rule__LeftPart__FeaturesAssignment ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:216:1: ( rule__LeftPart__FeaturesAssignment )
            {
             before(grammarAccess.getLeftPartAccess().getFeaturesAssignment()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:217:1: ( rule__LeftPart__FeaturesAssignment )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:217:2: rule__LeftPart__FeaturesAssignment
            {
            pushFollow(FOLLOW_rule__LeftPart__FeaturesAssignment_in_ruleLeftPart396);
            rule__LeftPart__FeaturesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLeftPartAccess().getFeaturesAssignment()); 

            }

            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:220:1: ( ( rule__LeftPart__FeaturesAssignment )* )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:221:1: ( rule__LeftPart__FeaturesAssignment )*
            {
             before(grammarAccess.getLeftPartAccess().getFeaturesAssignment()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:222:1: ( rule__LeftPart__FeaturesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=22 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:222:2: rule__LeftPart__FeaturesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__LeftPart__FeaturesAssignment_in_ruleLeftPart408);
            	    rule__LeftPart__FeaturesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLeftPartAccess().getFeaturesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeftPart"


    // $ANTLR start "entryRuleGroupFeature"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:235:1: entryRuleGroupFeature : ruleGroupFeature EOF ;
    public final void entryRuleGroupFeature() throws RecognitionException {
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:236:1: ( ruleGroupFeature EOF )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:237:1: ruleGroupFeature EOF
            {
             before(grammarAccess.getGroupFeatureRule()); 
            pushFollow(FOLLOW_ruleGroupFeature_in_entryRuleGroupFeature438);
            ruleGroupFeature();

            state._fsp--;

             after(grammarAccess.getGroupFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupFeature445); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupFeature"


    // $ANTLR start "ruleGroupFeature"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:244:1: ruleGroupFeature : ( ( rule__GroupFeature__Group__0 ) ) ;
    public final void ruleGroupFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:248:2: ( ( ( rule__GroupFeature__Group__0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:249:1: ( ( rule__GroupFeature__Group__0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:249:1: ( ( rule__GroupFeature__Group__0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:250:1: ( rule__GroupFeature__Group__0 )
            {
             before(grammarAccess.getGroupFeatureAccess().getGroup()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:251:1: ( rule__GroupFeature__Group__0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:251:2: rule__GroupFeature__Group__0
            {
            pushFollow(FOLLOW_rule__GroupFeature__Group__0_in_ruleGroupFeature471);
            rule__GroupFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupFeature"


    // $ANTLR start "entryRuleFeatureNamed"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:263:1: entryRuleFeatureNamed : ruleFeatureNamed EOF ;
    public final void entryRuleFeatureNamed() throws RecognitionException {
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:264:1: ( ruleFeatureNamed EOF )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:265:1: ruleFeatureNamed EOF
            {
             before(grammarAccess.getFeatureNamedRule()); 
            pushFollow(FOLLOW_ruleFeatureNamed_in_entryRuleFeatureNamed498);
            ruleFeatureNamed();

            state._fsp--;

             after(grammarAccess.getFeatureNamedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureNamed505); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureNamed"


    // $ANTLR start "ruleFeatureNamed"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:272:1: ruleFeatureNamed : ( ( rule__FeatureNamed__Alternatives ) ) ;
    public final void ruleFeatureNamed() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:276:2: ( ( ( rule__FeatureNamed__Alternatives ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:277:1: ( ( rule__FeatureNamed__Alternatives ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:277:1: ( ( rule__FeatureNamed__Alternatives ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:278:1: ( rule__FeatureNamed__Alternatives )
            {
             before(grammarAccess.getFeatureNamedAccess().getAlternatives()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:279:1: ( rule__FeatureNamed__Alternatives )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:279:2: rule__FeatureNamed__Alternatives
            {
            pushFollow(FOLLOW_rule__FeatureNamed__Alternatives_in_ruleFeatureNamed531);
            rule__FeatureNamed__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureNamedAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureNamed"


    // $ANTLR start "entryRuleSingleFeature"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:291:1: entryRuleSingleFeature : ruleSingleFeature EOF ;
    public final void entryRuleSingleFeature() throws RecognitionException {
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:292:1: ( ruleSingleFeature EOF )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:293:1: ruleSingleFeature EOF
            {
             before(grammarAccess.getSingleFeatureRule()); 
            pushFollow(FOLLOW_ruleSingleFeature_in_entryRuleSingleFeature558);
            ruleSingleFeature();

            state._fsp--;

             after(grammarAccess.getSingleFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleFeature565); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleFeature"


    // $ANTLR start "ruleSingleFeature"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:300:1: ruleSingleFeature : ( ( rule__SingleFeature__FeatureNameAssignment ) ) ;
    public final void ruleSingleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:304:2: ( ( ( rule__SingleFeature__FeatureNameAssignment ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:305:1: ( ( rule__SingleFeature__FeatureNameAssignment ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:305:1: ( ( rule__SingleFeature__FeatureNameAssignment ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:306:1: ( rule__SingleFeature__FeatureNameAssignment )
            {
             before(grammarAccess.getSingleFeatureAccess().getFeatureNameAssignment()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:307:1: ( rule__SingleFeature__FeatureNameAssignment )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:307:2: rule__SingleFeature__FeatureNameAssignment
            {
            pushFollow(FOLLOW_rule__SingleFeature__FeatureNameAssignment_in_ruleSingleFeature591);
            rule__SingleFeature__FeatureNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSingleFeatureAccess().getFeatureNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleFeature"


    // $ANTLR start "entryRuleVariableFeature"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:319:1: entryRuleVariableFeature : ruleVariableFeature EOF ;
    public final void entryRuleVariableFeature() throws RecognitionException {
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:320:1: ( ruleVariableFeature EOF )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:321:1: ruleVariableFeature EOF
            {
             before(grammarAccess.getVariableFeatureRule()); 
            pushFollow(FOLLOW_ruleVariableFeature_in_entryRuleVariableFeature618);
            ruleVariableFeature();

            state._fsp--;

             after(grammarAccess.getVariableFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableFeature625); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableFeature"


    // $ANTLR start "ruleVariableFeature"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:328:1: ruleVariableFeature : ( ( rule__VariableFeature__Group__0 ) ) ;
    public final void ruleVariableFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:332:2: ( ( ( rule__VariableFeature__Group__0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:333:1: ( ( rule__VariableFeature__Group__0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:333:1: ( ( rule__VariableFeature__Group__0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:334:1: ( rule__VariableFeature__Group__0 )
            {
             before(grammarAccess.getVariableFeatureAccess().getGroup()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:335:1: ( rule__VariableFeature__Group__0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:335:2: rule__VariableFeature__Group__0
            {
            pushFollow(FOLLOW_rule__VariableFeature__Group__0_in_ruleVariableFeature651);
            rule__VariableFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableFeature"


    // $ANTLR start "entryRuleVariable"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:347:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:348:1: ( ruleVariable EOF )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:349:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable678);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable685); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:356:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:360:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:361:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:361:1: ( ( rule__Variable__Group__0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:362:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:363:1: ( rule__Variable__Group__0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:363:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable711);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleStarFeature"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:375:1: entryRuleStarFeature : ruleStarFeature EOF ;
    public final void entryRuleStarFeature() throws RecognitionException {
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:376:1: ( ruleStarFeature EOF )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:377:1: ruleStarFeature EOF
            {
             before(grammarAccess.getStarFeatureRule()); 
            pushFollow(FOLLOW_ruleStarFeature_in_entryRuleStarFeature738);
            ruleStarFeature();

            state._fsp--;

             after(grammarAccess.getStarFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStarFeature745); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStarFeature"


    // $ANTLR start "ruleStarFeature"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:384:1: ruleStarFeature : ( ( rule__StarFeature__Group__0 ) ) ;
    public final void ruleStarFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:388:2: ( ( ( rule__StarFeature__Group__0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:389:1: ( ( rule__StarFeature__Group__0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:389:1: ( ( rule__StarFeature__Group__0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:390:1: ( rule__StarFeature__Group__0 )
            {
             before(grammarAccess.getStarFeatureAccess().getGroup()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:391:1: ( rule__StarFeature__Group__0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:391:2: rule__StarFeature__Group__0
            {
            pushFollow(FOLLOW_rule__StarFeature__Group__0_in_ruleStarFeature771);
            rule__StarFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStarFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStarFeature"


    // $ANTLR start "entryRuleRightPart"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:403:1: entryRuleRightPart : ruleRightPart EOF ;
    public final void entryRuleRightPart() throws RecognitionException {
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:404:1: ( ruleRightPart EOF )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:405:1: ruleRightPart EOF
            {
             before(grammarAccess.getRightPartRule()); 
            pushFollow(FOLLOW_ruleRightPart_in_entryRuleRightPart798);
            ruleRightPart();

            state._fsp--;

             after(grammarAccess.getRightPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightPart805); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRightPart"


    // $ANTLR start "ruleRightPart"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:412:1: ruleRightPart : ( ( rule__RightPart__Group__0 ) ) ;
    public final void ruleRightPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:416:2: ( ( ( rule__RightPart__Group__0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:417:1: ( ( rule__RightPart__Group__0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:417:1: ( ( rule__RightPart__Group__0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:418:1: ( rule__RightPart__Group__0 )
            {
             before(grammarAccess.getRightPartAccess().getGroup()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:419:1: ( rule__RightPart__Group__0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:419:2: rule__RightPart__Group__0
            {
            pushFollow(FOLLOW_rule__RightPart__Group__0_in_ruleRightPart831);
            rule__RightPart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightPartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightPart"


    // $ANTLR start "entryRuleFM_STATE"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:431:1: entryRuleFM_STATE : ruleFM_STATE EOF ;
    public final void entryRuleFM_STATE() throws RecognitionException {
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:432:1: ( ruleFM_STATE EOF )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:433:1: ruleFM_STATE EOF
            {
             before(grammarAccess.getFM_STATERule()); 
            pushFollow(FOLLOW_ruleFM_STATE_in_entryRuleFM_STATE858);
            ruleFM_STATE();

            state._fsp--;

             after(grammarAccess.getFM_STATERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFM_STATE865); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFM_STATE"


    // $ANTLR start "ruleFM_STATE"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:440:1: ruleFM_STATE : ( ( rule__FM_STATE__Alternatives ) ) ;
    public final void ruleFM_STATE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:444:2: ( ( ( rule__FM_STATE__Alternatives ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:445:1: ( ( rule__FM_STATE__Alternatives ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:445:1: ( ( rule__FM_STATE__Alternatives ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:446:1: ( rule__FM_STATE__Alternatives )
            {
             before(grammarAccess.getFM_STATEAccess().getAlternatives()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:447:1: ( rule__FM_STATE__Alternatives )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:447:2: rule__FM_STATE__Alternatives
            {
            pushFollow(FOLLOW_rule__FM_STATE__Alternatives_in_ruleFM_STATE891);
            rule__FM_STATE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFM_STATEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFM_STATE"


    // $ANTLR start "entryRuleACTIONFEATURE"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:459:1: entryRuleACTIONFEATURE : ruleACTIONFEATURE EOF ;
    public final void entryRuleACTIONFEATURE() throws RecognitionException {
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:460:1: ( ruleACTIONFEATURE EOF )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:461:1: ruleACTIONFEATURE EOF
            {
             before(grammarAccess.getACTIONFEATURERule()); 
            pushFollow(FOLLOW_ruleACTIONFEATURE_in_entryRuleACTIONFEATURE918);
            ruleACTIONFEATURE();

            state._fsp--;

             after(grammarAccess.getACTIONFEATURERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleACTIONFEATURE925); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleACTIONFEATURE"


    // $ANTLR start "ruleACTIONFEATURE"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:468:1: ruleACTIONFEATURE : ( ( rule__ACTIONFEATURE__Alternatives ) ) ;
    public final void ruleACTIONFEATURE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:472:2: ( ( ( rule__ACTIONFEATURE__Alternatives ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:473:1: ( ( rule__ACTIONFEATURE__Alternatives ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:473:1: ( ( rule__ACTIONFEATURE__Alternatives ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:474:1: ( rule__ACTIONFEATURE__Alternatives )
            {
             before(grammarAccess.getACTIONFEATUREAccess().getAlternatives()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:475:1: ( rule__ACTIONFEATURE__Alternatives )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:475:2: rule__ACTIONFEATURE__Alternatives
            {
            pushFollow(FOLLOW_rule__ACTIONFEATURE__Alternatives_in_ruleACTIONFEATURE951);
            rule__ACTIONFEATURE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getACTIONFEATUREAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleACTIONFEATURE"


    // $ANTLR start "rule__FeatureNamed__Alternatives"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:487:1: rule__FeatureNamed__Alternatives : ( ( ruleSingleFeature ) | ( ruleVariableFeature ) | ( ruleStarFeature ) );
    public final void rule__FeatureNamed__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:491:1: ( ( ruleSingleFeature ) | ( ruleVariableFeature ) | ( ruleStarFeature ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_DOT) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==RULE_VARBEGIN) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==RULE_STAR) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_1==EOF||(LA2_1>=RULE_IMPLY && LA2_1<=RULE_END_RULE)||LA2_1==RULE_COMMA||(LA2_1>=22 && LA2_1<=23)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:492:1: ( ruleSingleFeature )
                    {
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:492:1: ( ruleSingleFeature )
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:493:1: ruleSingleFeature
                    {
                     before(grammarAccess.getFeatureNamedAccess().getSingleFeatureParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSingleFeature_in_rule__FeatureNamed__Alternatives987);
                    ruleSingleFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureNamedAccess().getSingleFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:498:6: ( ruleVariableFeature )
                    {
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:498:6: ( ruleVariableFeature )
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:499:1: ruleVariableFeature
                    {
                     before(grammarAccess.getFeatureNamedAccess().getVariableFeatureParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVariableFeature_in_rule__FeatureNamed__Alternatives1004);
                    ruleVariableFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureNamedAccess().getVariableFeatureParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:504:6: ( ruleStarFeature )
                    {
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:504:6: ( ruleStarFeature )
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:505:1: ruleStarFeature
                    {
                     before(grammarAccess.getFeatureNamedAccess().getStarFeatureParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStarFeature_in_rule__FeatureNamed__Alternatives1021);
                    ruleStarFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureNamedAccess().getStarFeatureParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureNamed__Alternatives"


    // $ANTLR start "rule__FM_STATE__Alternatives"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:515:1: rule__FM_STATE__Alternatives : ( ( 'SELECTED' ) | ( 'DESELECTED' ) );
    public final void rule__FM_STATE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:519:1: ( ( 'SELECTED' ) | ( 'DESELECTED' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:520:1: ( 'SELECTED' )
                    {
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:520:1: ( 'SELECTED' )
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:521:1: 'SELECTED'
                    {
                     before(grammarAccess.getFM_STATEAccess().getSELECTEDKeyword_0()); 
                    match(input,22,FOLLOW_22_in_rule__FM_STATE__Alternatives1054); 
                     after(grammarAccess.getFM_STATEAccess().getSELECTEDKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:528:6: ( 'DESELECTED' )
                    {
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:528:6: ( 'DESELECTED' )
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:529:1: 'DESELECTED'
                    {
                     before(grammarAccess.getFM_STATEAccess().getDESELECTEDKeyword_1()); 
                    match(input,23,FOLLOW_23_in_rule__FM_STATE__Alternatives1074); 
                     after(grammarAccess.getFM_STATEAccess().getDESELECTEDKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FM_STATE__Alternatives"


    // $ANTLR start "rule__ACTIONFEATURE__Alternatives"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:541:1: rule__ACTIONFEATURE__Alternatives : ( ( 'SELECT' ) | ( 'DESELECT' ) );
    public final void rule__ACTIONFEATURE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:545:1: ( ( 'SELECT' ) | ( 'DESELECT' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:546:1: ( 'SELECT' )
                    {
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:546:1: ( 'SELECT' )
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:547:1: 'SELECT'
                    {
                     before(grammarAccess.getACTIONFEATUREAccess().getSELECTKeyword_0()); 
                    match(input,24,FOLLOW_24_in_rule__ACTIONFEATURE__Alternatives1109); 
                     after(grammarAccess.getACTIONFEATUREAccess().getSELECTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:554:6: ( 'DESELECT' )
                    {
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:554:6: ( 'DESELECT' )
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:555:1: 'DESELECT'
                    {
                     before(grammarAccess.getACTIONFEATUREAccess().getDESELECTKeyword_1()); 
                    match(input,25,FOLLOW_25_in_rule__ACTIONFEATURE__Alternatives1129); 
                     after(grammarAccess.getACTIONFEATUREAccess().getDESELECTKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTIONFEATURE__Alternatives"


    // $ANTLR start "rule__RestFunc__Group__0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:569:1: rule__RestFunc__Group__0 : rule__RestFunc__Group__0__Impl rule__RestFunc__Group__1 ;
    public final void rule__RestFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:573:1: ( rule__RestFunc__Group__0__Impl rule__RestFunc__Group__1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:574:2: rule__RestFunc__Group__0__Impl rule__RestFunc__Group__1
            {
            pushFollow(FOLLOW_rule__RestFunc__Group__0__Impl_in_rule__RestFunc__Group__01161);
            rule__RestFunc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestFunc__Group__1_in_rule__RestFunc__Group__01164);
            rule__RestFunc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestFunc__Group__0"


    // $ANTLR start "rule__RestFunc__Group__0__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:581:1: rule__RestFunc__Group__0__Impl : ( ( rule__RestFunc__InitAssignment_0 ) ) ;
    public final void rule__RestFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:585:1: ( ( ( rule__RestFunc__InitAssignment_0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:586:1: ( ( rule__RestFunc__InitAssignment_0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:586:1: ( ( rule__RestFunc__InitAssignment_0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:587:1: ( rule__RestFunc__InitAssignment_0 )
            {
             before(grammarAccess.getRestFuncAccess().getInitAssignment_0()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:588:1: ( rule__RestFunc__InitAssignment_0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:588:2: rule__RestFunc__InitAssignment_0
            {
            pushFollow(FOLLOW_rule__RestFunc__InitAssignment_0_in_rule__RestFunc__Group__0__Impl1191);
            rule__RestFunc__InitAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRestFuncAccess().getInitAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestFunc__Group__0__Impl"


    // $ANTLR start "rule__RestFunc__Group__1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:598:1: rule__RestFunc__Group__1 : rule__RestFunc__Group__1__Impl ;
    public final void rule__RestFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:602:1: ( rule__RestFunc__Group__1__Impl )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:603:2: rule__RestFunc__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RestFunc__Group__1__Impl_in_rule__RestFunc__Group__11221);
            rule__RestFunc__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestFunc__Group__1"


    // $ANTLR start "rule__RestFunc__Group__1__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:609:1: rule__RestFunc__Group__1__Impl : ( ( ( rule__RestFunc__RulesAssignment_1 ) ) ( ( rule__RestFunc__RulesAssignment_1 )* ) ) ;
    public final void rule__RestFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:613:1: ( ( ( ( rule__RestFunc__RulesAssignment_1 ) ) ( ( rule__RestFunc__RulesAssignment_1 )* ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:614:1: ( ( ( rule__RestFunc__RulesAssignment_1 ) ) ( ( rule__RestFunc__RulesAssignment_1 )* ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:614:1: ( ( ( rule__RestFunc__RulesAssignment_1 ) ) ( ( rule__RestFunc__RulesAssignment_1 )* ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:615:1: ( ( rule__RestFunc__RulesAssignment_1 ) ) ( ( rule__RestFunc__RulesAssignment_1 )* )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:615:1: ( ( rule__RestFunc__RulesAssignment_1 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:616:1: ( rule__RestFunc__RulesAssignment_1 )
            {
             before(grammarAccess.getRestFuncAccess().getRulesAssignment_1()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:617:1: ( rule__RestFunc__RulesAssignment_1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:617:2: rule__RestFunc__RulesAssignment_1
            {
            pushFollow(FOLLOW_rule__RestFunc__RulesAssignment_1_in_rule__RestFunc__Group__1__Impl1250);
            rule__RestFunc__RulesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRestFuncAccess().getRulesAssignment_1()); 

            }

            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:620:1: ( ( rule__RestFunc__RulesAssignment_1 )* )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:621:1: ( rule__RestFunc__RulesAssignment_1 )*
            {
             before(grammarAccess.getRestFuncAccess().getRulesAssignment_1()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:622:1: ( rule__RestFunc__RulesAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_BEGIN_RULE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:622:2: rule__RestFunc__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__RestFunc__RulesAssignment_1_in_rule__RestFunc__Group__1__Impl1262);
            	    rule__RestFunc__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRestFuncAccess().getRulesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestFunc__Group__1__Impl"


    // $ANTLR start "rule__RuleString__Group__0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:637:1: rule__RuleString__Group__0 : rule__RuleString__Group__0__Impl rule__RuleString__Group__1 ;
    public final void rule__RuleString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:641:1: ( rule__RuleString__Group__0__Impl rule__RuleString__Group__1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:642:2: rule__RuleString__Group__0__Impl rule__RuleString__Group__1
            {
            pushFollow(FOLLOW_rule__RuleString__Group__0__Impl_in_rule__RuleString__Group__01299);
            rule__RuleString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleString__Group__1_in_rule__RuleString__Group__01302);
            rule__RuleString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__Group__0"


    // $ANTLR start "rule__RuleString__Group__0__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:649:1: rule__RuleString__Group__0__Impl : ( RULE_BEGIN_RULE ) ;
    public final void rule__RuleString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:653:1: ( ( RULE_BEGIN_RULE ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:654:1: ( RULE_BEGIN_RULE )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:654:1: ( RULE_BEGIN_RULE )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:655:1: RULE_BEGIN_RULE
            {
             before(grammarAccess.getRuleStringAccess().getBEGIN_RULETerminalRuleCall_0()); 
            match(input,RULE_BEGIN_RULE,FOLLOW_RULE_BEGIN_RULE_in_rule__RuleString__Group__0__Impl1329); 
             after(grammarAccess.getRuleStringAccess().getBEGIN_RULETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__Group__0__Impl"


    // $ANTLR start "rule__RuleString__Group__1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:666:1: rule__RuleString__Group__1 : rule__RuleString__Group__1__Impl rule__RuleString__Group__2 ;
    public final void rule__RuleString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:670:1: ( rule__RuleString__Group__1__Impl rule__RuleString__Group__2 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:671:2: rule__RuleString__Group__1__Impl rule__RuleString__Group__2
            {
            pushFollow(FOLLOW_rule__RuleString__Group__1__Impl_in_rule__RuleString__Group__11358);
            rule__RuleString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleString__Group__2_in_rule__RuleString__Group__11361);
            rule__RuleString__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__Group__1"


    // $ANTLR start "rule__RuleString__Group__1__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:678:1: rule__RuleString__Group__1__Impl : ( ( rule__RuleString__IdAssignment_1 )? ) ;
    public final void rule__RuleString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:682:1: ( ( ( rule__RuleString__IdAssignment_1 )? ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:683:1: ( ( rule__RuleString__IdAssignment_1 )? )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:683:1: ( ( rule__RuleString__IdAssignment_1 )? )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:684:1: ( rule__RuleString__IdAssignment_1 )?
            {
             before(grammarAccess.getRuleStringAccess().getIdAssignment_1()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:685:1: ( rule__RuleString__IdAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:685:2: rule__RuleString__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__RuleString__IdAssignment_1_in_rule__RuleString__Group__1__Impl1388);
                    rule__RuleString__IdAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleStringAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__Group__1__Impl"


    // $ANTLR start "rule__RuleString__Group__2"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:695:1: rule__RuleString__Group__2 : rule__RuleString__Group__2__Impl rule__RuleString__Group__3 ;
    public final void rule__RuleString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:699:1: ( rule__RuleString__Group__2__Impl rule__RuleString__Group__3 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:700:2: rule__RuleString__Group__2__Impl rule__RuleString__Group__3
            {
            pushFollow(FOLLOW_rule__RuleString__Group__2__Impl_in_rule__RuleString__Group__21419);
            rule__RuleString__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleString__Group__3_in_rule__RuleString__Group__21422);
            rule__RuleString__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__Group__2"


    // $ANTLR start "rule__RuleString__Group__2__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:707:1: rule__RuleString__Group__2__Impl : ( RULE_POINTS ) ;
    public final void rule__RuleString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:711:1: ( ( RULE_POINTS ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:712:1: ( RULE_POINTS )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:712:1: ( RULE_POINTS )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:713:1: RULE_POINTS
            {
             before(grammarAccess.getRuleStringAccess().getPOINTSTerminalRuleCall_2()); 
            match(input,RULE_POINTS,FOLLOW_RULE_POINTS_in_rule__RuleString__Group__2__Impl1449); 
             after(grammarAccess.getRuleStringAccess().getPOINTSTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__Group__2__Impl"


    // $ANTLR start "rule__RuleString__Group__3"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:724:1: rule__RuleString__Group__3 : rule__RuleString__Group__3__Impl rule__RuleString__Group__4 ;
    public final void rule__RuleString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:728:1: ( rule__RuleString__Group__3__Impl rule__RuleString__Group__4 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:729:2: rule__RuleString__Group__3__Impl rule__RuleString__Group__4
            {
            pushFollow(FOLLOW_rule__RuleString__Group__3__Impl_in_rule__RuleString__Group__31478);
            rule__RuleString__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleString__Group__4_in_rule__RuleString__Group__31481);
            rule__RuleString__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__Group__3"


    // $ANTLR start "rule__RuleString__Group__3__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:736:1: rule__RuleString__Group__3__Impl : ( ( rule__RuleString__LeftAssignment_3 ) ) ;
    public final void rule__RuleString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:740:1: ( ( ( rule__RuleString__LeftAssignment_3 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:741:1: ( ( rule__RuleString__LeftAssignment_3 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:741:1: ( ( rule__RuleString__LeftAssignment_3 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:742:1: ( rule__RuleString__LeftAssignment_3 )
            {
             before(grammarAccess.getRuleStringAccess().getLeftAssignment_3()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:743:1: ( rule__RuleString__LeftAssignment_3 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:743:2: rule__RuleString__LeftAssignment_3
            {
            pushFollow(FOLLOW_rule__RuleString__LeftAssignment_3_in_rule__RuleString__Group__3__Impl1508);
            rule__RuleString__LeftAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleStringAccess().getLeftAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__Group__3__Impl"


    // $ANTLR start "rule__RuleString__Group__4"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:753:1: rule__RuleString__Group__4 : rule__RuleString__Group__4__Impl rule__RuleString__Group__5 ;
    public final void rule__RuleString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:757:1: ( rule__RuleString__Group__4__Impl rule__RuleString__Group__5 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:758:2: rule__RuleString__Group__4__Impl rule__RuleString__Group__5
            {
            pushFollow(FOLLOW_rule__RuleString__Group__4__Impl_in_rule__RuleString__Group__41538);
            rule__RuleString__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleString__Group__5_in_rule__RuleString__Group__41541);
            rule__RuleString__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__Group__4"


    // $ANTLR start "rule__RuleString__Group__4__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:765:1: rule__RuleString__Group__4__Impl : ( RULE_IMPLY ) ;
    public final void rule__RuleString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:769:1: ( ( RULE_IMPLY ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:770:1: ( RULE_IMPLY )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:770:1: ( RULE_IMPLY )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:771:1: RULE_IMPLY
            {
             before(grammarAccess.getRuleStringAccess().getIMPLYTerminalRuleCall_4()); 
            match(input,RULE_IMPLY,FOLLOW_RULE_IMPLY_in_rule__RuleString__Group__4__Impl1568); 
             after(grammarAccess.getRuleStringAccess().getIMPLYTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__Group__4__Impl"


    // $ANTLR start "rule__RuleString__Group__5"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:782:1: rule__RuleString__Group__5 : rule__RuleString__Group__5__Impl rule__RuleString__Group__6 ;
    public final void rule__RuleString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:786:1: ( rule__RuleString__Group__5__Impl rule__RuleString__Group__6 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:787:2: rule__RuleString__Group__5__Impl rule__RuleString__Group__6
            {
            pushFollow(FOLLOW_rule__RuleString__Group__5__Impl_in_rule__RuleString__Group__51597);
            rule__RuleString__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleString__Group__6_in_rule__RuleString__Group__51600);
            rule__RuleString__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__Group__5"


    // $ANTLR start "rule__RuleString__Group__5__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:794:1: rule__RuleString__Group__5__Impl : ( ( rule__RuleString__RightAssignment_5 ) ) ;
    public final void rule__RuleString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:798:1: ( ( ( rule__RuleString__RightAssignment_5 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:799:1: ( ( rule__RuleString__RightAssignment_5 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:799:1: ( ( rule__RuleString__RightAssignment_5 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:800:1: ( rule__RuleString__RightAssignment_5 )
            {
             before(grammarAccess.getRuleStringAccess().getRightAssignment_5()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:801:1: ( rule__RuleString__RightAssignment_5 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:801:2: rule__RuleString__RightAssignment_5
            {
            pushFollow(FOLLOW_rule__RuleString__RightAssignment_5_in_rule__RuleString__Group__5__Impl1627);
            rule__RuleString__RightAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleStringAccess().getRightAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__Group__5__Impl"


    // $ANTLR start "rule__RuleString__Group__6"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:811:1: rule__RuleString__Group__6 : rule__RuleString__Group__6__Impl ;
    public final void rule__RuleString__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:815:1: ( rule__RuleString__Group__6__Impl )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:816:2: rule__RuleString__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__RuleString__Group__6__Impl_in_rule__RuleString__Group__61657);
            rule__RuleString__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__Group__6"


    // $ANTLR start "rule__RuleString__Group__6__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:822:1: rule__RuleString__Group__6__Impl : ( RULE_END_RULE ) ;
    public final void rule__RuleString__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:826:1: ( ( RULE_END_RULE ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:827:1: ( RULE_END_RULE )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:827:1: ( RULE_END_RULE )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:828:1: RULE_END_RULE
            {
             before(grammarAccess.getRuleStringAccess().getEND_RULETerminalRuleCall_6()); 
            match(input,RULE_END_RULE,FOLLOW_RULE_END_RULE_in_rule__RuleString__Group__6__Impl1684); 
             after(grammarAccess.getRuleStringAccess().getEND_RULETerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__Group__6__Impl"


    // $ANTLR start "rule__SourceAndTarget__Group__0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:853:1: rule__SourceAndTarget__Group__0 : rule__SourceAndTarget__Group__0__Impl rule__SourceAndTarget__Group__1 ;
    public final void rule__SourceAndTarget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:857:1: ( rule__SourceAndTarget__Group__0__Impl rule__SourceAndTarget__Group__1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:858:2: rule__SourceAndTarget__Group__0__Impl rule__SourceAndTarget__Group__1
            {
            pushFollow(FOLLOW_rule__SourceAndTarget__Group__0__Impl_in_rule__SourceAndTarget__Group__01727);
            rule__SourceAndTarget__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SourceAndTarget__Group__1_in_rule__SourceAndTarget__Group__01730);
            rule__SourceAndTarget__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceAndTarget__Group__0"


    // $ANTLR start "rule__SourceAndTarget__Group__0__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:865:1: rule__SourceAndTarget__Group__0__Impl : ( ( rule__SourceAndTarget__SourceAssignment_0 ) ) ;
    public final void rule__SourceAndTarget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:869:1: ( ( ( rule__SourceAndTarget__SourceAssignment_0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:870:1: ( ( rule__SourceAndTarget__SourceAssignment_0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:870:1: ( ( rule__SourceAndTarget__SourceAssignment_0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:871:1: ( rule__SourceAndTarget__SourceAssignment_0 )
            {
             before(grammarAccess.getSourceAndTargetAccess().getSourceAssignment_0()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:872:1: ( rule__SourceAndTarget__SourceAssignment_0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:872:2: rule__SourceAndTarget__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__SourceAndTarget__SourceAssignment_0_in_rule__SourceAndTarget__Group__0__Impl1757);
            rule__SourceAndTarget__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAndTargetAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceAndTarget__Group__0__Impl"


    // $ANTLR start "rule__SourceAndTarget__Group__1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:882:1: rule__SourceAndTarget__Group__1 : rule__SourceAndTarget__Group__1__Impl ;
    public final void rule__SourceAndTarget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:886:1: ( rule__SourceAndTarget__Group__1__Impl )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:887:2: rule__SourceAndTarget__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SourceAndTarget__Group__1__Impl_in_rule__SourceAndTarget__Group__11787);
            rule__SourceAndTarget__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceAndTarget__Group__1"


    // $ANTLR start "rule__SourceAndTarget__Group__1__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:893:1: rule__SourceAndTarget__Group__1__Impl : ( ( rule__SourceAndTarget__TargetAssignment_1 ) ) ;
    public final void rule__SourceAndTarget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:897:1: ( ( ( rule__SourceAndTarget__TargetAssignment_1 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:898:1: ( ( rule__SourceAndTarget__TargetAssignment_1 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:898:1: ( ( rule__SourceAndTarget__TargetAssignment_1 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:899:1: ( rule__SourceAndTarget__TargetAssignment_1 )
            {
             before(grammarAccess.getSourceAndTargetAccess().getTargetAssignment_1()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:900:1: ( rule__SourceAndTarget__TargetAssignment_1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:900:2: rule__SourceAndTarget__TargetAssignment_1
            {
            pushFollow(FOLLOW_rule__SourceAndTarget__TargetAssignment_1_in_rule__SourceAndTarget__Group__1__Impl1814);
            rule__SourceAndTarget__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAndTargetAccess().getTargetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceAndTarget__Group__1__Impl"


    // $ANTLR start "rule__Source__Group__0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:914:1: rule__Source__Group__0 : rule__Source__Group__0__Impl rule__Source__Group__1 ;
    public final void rule__Source__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:918:1: ( rule__Source__Group__0__Impl rule__Source__Group__1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:919:2: rule__Source__Group__0__Impl rule__Source__Group__1
            {
            pushFollow(FOLLOW_rule__Source__Group__0__Impl_in_rule__Source__Group__01848);
            rule__Source__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Source__Group__1_in_rule__Source__Group__01851);
            rule__Source__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__0"


    // $ANTLR start "rule__Source__Group__0__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:926:1: rule__Source__Group__0__Impl : ( RULE_SOURCEKEY ) ;
    public final void rule__Source__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:930:1: ( ( RULE_SOURCEKEY ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:931:1: ( RULE_SOURCEKEY )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:931:1: ( RULE_SOURCEKEY )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:932:1: RULE_SOURCEKEY
            {
             before(grammarAccess.getSourceAccess().getSOURCEKEYTerminalRuleCall_0()); 
            match(input,RULE_SOURCEKEY,FOLLOW_RULE_SOURCEKEY_in_rule__Source__Group__0__Impl1878); 
             after(grammarAccess.getSourceAccess().getSOURCEKEYTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__0__Impl"


    // $ANTLR start "rule__Source__Group__1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:943:1: rule__Source__Group__1 : rule__Source__Group__1__Impl rule__Source__Group__2 ;
    public final void rule__Source__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:947:1: ( rule__Source__Group__1__Impl rule__Source__Group__2 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:948:2: rule__Source__Group__1__Impl rule__Source__Group__2
            {
            pushFollow(FOLLOW_rule__Source__Group__1__Impl_in_rule__Source__Group__11907);
            rule__Source__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Source__Group__2_in_rule__Source__Group__11910);
            rule__Source__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__1"


    // $ANTLR start "rule__Source__Group__1__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:955:1: rule__Source__Group__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__Source__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:959:1: ( ( RULE_EQUAL ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:960:1: ( RULE_EQUAL )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:960:1: ( RULE_EQUAL )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:961:1: RULE_EQUAL
            {
             before(grammarAccess.getSourceAccess().getEQUALTerminalRuleCall_1()); 
            match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_rule__Source__Group__1__Impl1937); 
             after(grammarAccess.getSourceAccess().getEQUALTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__1__Impl"


    // $ANTLR start "rule__Source__Group__2"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:972:1: rule__Source__Group__2 : rule__Source__Group__2__Impl ;
    public final void rule__Source__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:976:1: ( rule__Source__Group__2__Impl )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:977:2: rule__Source__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Source__Group__2__Impl_in_rule__Source__Group__21966);
            rule__Source__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__2"


    // $ANTLR start "rule__Source__Group__2__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:983:1: rule__Source__Group__2__Impl : ( ( rule__Source__DeSrcAssignment_2 ) ) ;
    public final void rule__Source__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:987:1: ( ( ( rule__Source__DeSrcAssignment_2 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:988:1: ( ( rule__Source__DeSrcAssignment_2 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:988:1: ( ( rule__Source__DeSrcAssignment_2 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:989:1: ( rule__Source__DeSrcAssignment_2 )
            {
             before(grammarAccess.getSourceAccess().getDeSrcAssignment_2()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:990:1: ( rule__Source__DeSrcAssignment_2 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:990:2: rule__Source__DeSrcAssignment_2
            {
            pushFollow(FOLLOW_rule__Source__DeSrcAssignment_2_in_rule__Source__Group__2__Impl1993);
            rule__Source__DeSrcAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getDeSrcAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__2__Impl"


    // $ANTLR start "rule__Target__Group__0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1006:1: rule__Target__Group__0 : rule__Target__Group__0__Impl rule__Target__Group__1 ;
    public final void rule__Target__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1010:1: ( rule__Target__Group__0__Impl rule__Target__Group__1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1011:2: rule__Target__Group__0__Impl rule__Target__Group__1
            {
            pushFollow(FOLLOW_rule__Target__Group__0__Impl_in_rule__Target__Group__02029);
            rule__Target__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Target__Group__1_in_rule__Target__Group__02032);
            rule__Target__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__0"


    // $ANTLR start "rule__Target__Group__0__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1018:1: rule__Target__Group__0__Impl : ( RULE_TARGETKEY ) ;
    public final void rule__Target__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1022:1: ( ( RULE_TARGETKEY ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1023:1: ( RULE_TARGETKEY )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1023:1: ( RULE_TARGETKEY )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1024:1: RULE_TARGETKEY
            {
             before(grammarAccess.getTargetAccess().getTARGETKEYTerminalRuleCall_0()); 
            match(input,RULE_TARGETKEY,FOLLOW_RULE_TARGETKEY_in_rule__Target__Group__0__Impl2059); 
             after(grammarAccess.getTargetAccess().getTARGETKEYTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__0__Impl"


    // $ANTLR start "rule__Target__Group__1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1035:1: rule__Target__Group__1 : rule__Target__Group__1__Impl rule__Target__Group__2 ;
    public final void rule__Target__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1039:1: ( rule__Target__Group__1__Impl rule__Target__Group__2 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1040:2: rule__Target__Group__1__Impl rule__Target__Group__2
            {
            pushFollow(FOLLOW_rule__Target__Group__1__Impl_in_rule__Target__Group__12088);
            rule__Target__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Target__Group__2_in_rule__Target__Group__12091);
            rule__Target__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__1"


    // $ANTLR start "rule__Target__Group__1__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1047:1: rule__Target__Group__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__Target__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1051:1: ( ( RULE_EQUAL ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1052:1: ( RULE_EQUAL )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1052:1: ( RULE_EQUAL )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1053:1: RULE_EQUAL
            {
             before(grammarAccess.getTargetAccess().getEQUALTerminalRuleCall_1()); 
            match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_rule__Target__Group__1__Impl2118); 
             after(grammarAccess.getTargetAccess().getEQUALTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__1__Impl"


    // $ANTLR start "rule__Target__Group__2"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1064:1: rule__Target__Group__2 : rule__Target__Group__2__Impl ;
    public final void rule__Target__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1068:1: ( rule__Target__Group__2__Impl )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1069:2: rule__Target__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Target__Group__2__Impl_in_rule__Target__Group__22147);
            rule__Target__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__2"


    // $ANTLR start "rule__Target__Group__2__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1075:1: rule__Target__Group__2__Impl : ( ( rule__Target__DeTargetAssignment_2 ) ) ;
    public final void rule__Target__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1079:1: ( ( ( rule__Target__DeTargetAssignment_2 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1080:1: ( ( rule__Target__DeTargetAssignment_2 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1080:1: ( ( rule__Target__DeTargetAssignment_2 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1081:1: ( rule__Target__DeTargetAssignment_2 )
            {
             before(grammarAccess.getTargetAccess().getDeTargetAssignment_2()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1082:1: ( rule__Target__DeTargetAssignment_2 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1082:2: rule__Target__DeTargetAssignment_2
            {
            pushFollow(FOLLOW_rule__Target__DeTargetAssignment_2_in_rule__Target__Group__2__Impl2174);
            rule__Target__DeTargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getDeTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__2__Impl"


    // $ANTLR start "rule__GroupFeature__Group__0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1098:1: rule__GroupFeature__Group__0 : rule__GroupFeature__Group__0__Impl rule__GroupFeature__Group__1 ;
    public final void rule__GroupFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1102:1: ( rule__GroupFeature__Group__0__Impl rule__GroupFeature__Group__1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1103:2: rule__GroupFeature__Group__0__Impl rule__GroupFeature__Group__1
            {
            pushFollow(FOLLOW_rule__GroupFeature__Group__0__Impl_in_rule__GroupFeature__Group__02210);
            rule__GroupFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupFeature__Group__1_in_rule__GroupFeature__Group__02213);
            rule__GroupFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupFeature__Group__0"


    // $ANTLR start "rule__GroupFeature__Group__0__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1110:1: rule__GroupFeature__Group__0__Impl : ( ( rule__GroupFeature__StateAssignment_0 ) ) ;
    public final void rule__GroupFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1114:1: ( ( ( rule__GroupFeature__StateAssignment_0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1115:1: ( ( rule__GroupFeature__StateAssignment_0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1115:1: ( ( rule__GroupFeature__StateAssignment_0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1116:1: ( rule__GroupFeature__StateAssignment_0 )
            {
             before(grammarAccess.getGroupFeatureAccess().getStateAssignment_0()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1117:1: ( rule__GroupFeature__StateAssignment_0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1117:2: rule__GroupFeature__StateAssignment_0
            {
            pushFollow(FOLLOW_rule__GroupFeature__StateAssignment_0_in_rule__GroupFeature__Group__0__Impl2240);
            rule__GroupFeature__StateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupFeatureAccess().getStateAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupFeature__Group__0__Impl"


    // $ANTLR start "rule__GroupFeature__Group__1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1127:1: rule__GroupFeature__Group__1 : rule__GroupFeature__Group__1__Impl rule__GroupFeature__Group__2 ;
    public final void rule__GroupFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1131:1: ( rule__GroupFeature__Group__1__Impl rule__GroupFeature__Group__2 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1132:2: rule__GroupFeature__Group__1__Impl rule__GroupFeature__Group__2
            {
            pushFollow(FOLLOW_rule__GroupFeature__Group__1__Impl_in_rule__GroupFeature__Group__12270);
            rule__GroupFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupFeature__Group__2_in_rule__GroupFeature__Group__12273);
            rule__GroupFeature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupFeature__Group__1"


    // $ANTLR start "rule__GroupFeature__Group__1__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1139:1: rule__GroupFeature__Group__1__Impl : ( ( rule__GroupFeature__FeatureAssignment_1 ) ) ;
    public final void rule__GroupFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1143:1: ( ( ( rule__GroupFeature__FeatureAssignment_1 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1144:1: ( ( rule__GroupFeature__FeatureAssignment_1 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1144:1: ( ( rule__GroupFeature__FeatureAssignment_1 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1145:1: ( rule__GroupFeature__FeatureAssignment_1 )
            {
             before(grammarAccess.getGroupFeatureAccess().getFeatureAssignment_1()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1146:1: ( rule__GroupFeature__FeatureAssignment_1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1146:2: rule__GroupFeature__FeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__GroupFeature__FeatureAssignment_1_in_rule__GroupFeature__Group__1__Impl2300);
            rule__GroupFeature__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupFeatureAccess().getFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupFeature__Group__1__Impl"


    // $ANTLR start "rule__GroupFeature__Group__2"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1156:1: rule__GroupFeature__Group__2 : rule__GroupFeature__Group__2__Impl ;
    public final void rule__GroupFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1160:1: ( rule__GroupFeature__Group__2__Impl )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1161:2: rule__GroupFeature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GroupFeature__Group__2__Impl_in_rule__GroupFeature__Group__22330);
            rule__GroupFeature__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupFeature__Group__2"


    // $ANTLR start "rule__GroupFeature__Group__2__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1167:1: rule__GroupFeature__Group__2__Impl : ( ( rule__GroupFeature__Group_2__0 )* ) ;
    public final void rule__GroupFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1171:1: ( ( ( rule__GroupFeature__Group_2__0 )* ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1172:1: ( ( rule__GroupFeature__Group_2__0 )* )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1172:1: ( ( rule__GroupFeature__Group_2__0 )* )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1173:1: ( rule__GroupFeature__Group_2__0 )*
            {
             before(grammarAccess.getGroupFeatureAccess().getGroup_2()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1174:1: ( rule__GroupFeature__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1174:2: rule__GroupFeature__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__GroupFeature__Group_2__0_in_rule__GroupFeature__Group__2__Impl2357);
            	    rule__GroupFeature__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getGroupFeatureAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupFeature__Group__2__Impl"


    // $ANTLR start "rule__GroupFeature__Group_2__0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1190:1: rule__GroupFeature__Group_2__0 : rule__GroupFeature__Group_2__0__Impl rule__GroupFeature__Group_2__1 ;
    public final void rule__GroupFeature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1194:1: ( rule__GroupFeature__Group_2__0__Impl rule__GroupFeature__Group_2__1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1195:2: rule__GroupFeature__Group_2__0__Impl rule__GroupFeature__Group_2__1
            {
            pushFollow(FOLLOW_rule__GroupFeature__Group_2__0__Impl_in_rule__GroupFeature__Group_2__02394);
            rule__GroupFeature__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupFeature__Group_2__1_in_rule__GroupFeature__Group_2__02397);
            rule__GroupFeature__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupFeature__Group_2__0"


    // $ANTLR start "rule__GroupFeature__Group_2__0__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1202:1: rule__GroupFeature__Group_2__0__Impl : ( RULE_COMMA ) ;
    public final void rule__GroupFeature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1206:1: ( ( RULE_COMMA ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1207:1: ( RULE_COMMA )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1207:1: ( RULE_COMMA )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1208:1: RULE_COMMA
            {
             before(grammarAccess.getGroupFeatureAccess().getCOMMATerminalRuleCall_2_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__GroupFeature__Group_2__0__Impl2424); 
             after(grammarAccess.getGroupFeatureAccess().getCOMMATerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupFeature__Group_2__0__Impl"


    // $ANTLR start "rule__GroupFeature__Group_2__1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1219:1: rule__GroupFeature__Group_2__1 : rule__GroupFeature__Group_2__1__Impl ;
    public final void rule__GroupFeature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1223:1: ( rule__GroupFeature__Group_2__1__Impl )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1224:2: rule__GroupFeature__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GroupFeature__Group_2__1__Impl_in_rule__GroupFeature__Group_2__12453);
            rule__GroupFeature__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupFeature__Group_2__1"


    // $ANTLR start "rule__GroupFeature__Group_2__1__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1230:1: rule__GroupFeature__Group_2__1__Impl : ( ( rule__GroupFeature__FeatureAssignment_2_1 ) ) ;
    public final void rule__GroupFeature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1234:1: ( ( ( rule__GroupFeature__FeatureAssignment_2_1 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1235:1: ( ( rule__GroupFeature__FeatureAssignment_2_1 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1235:1: ( ( rule__GroupFeature__FeatureAssignment_2_1 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1236:1: ( rule__GroupFeature__FeatureAssignment_2_1 )
            {
             before(grammarAccess.getGroupFeatureAccess().getFeatureAssignment_2_1()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1237:1: ( rule__GroupFeature__FeatureAssignment_2_1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1237:2: rule__GroupFeature__FeatureAssignment_2_1
            {
            pushFollow(FOLLOW_rule__GroupFeature__FeatureAssignment_2_1_in_rule__GroupFeature__Group_2__1__Impl2480);
            rule__GroupFeature__FeatureAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupFeatureAccess().getFeatureAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupFeature__Group_2__1__Impl"


    // $ANTLR start "rule__VariableFeature__Group__0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1251:1: rule__VariableFeature__Group__0 : rule__VariableFeature__Group__0__Impl rule__VariableFeature__Group__1 ;
    public final void rule__VariableFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1255:1: ( rule__VariableFeature__Group__0__Impl rule__VariableFeature__Group__1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1256:2: rule__VariableFeature__Group__0__Impl rule__VariableFeature__Group__1
            {
            pushFollow(FOLLOW_rule__VariableFeature__Group__0__Impl_in_rule__VariableFeature__Group__02514);
            rule__VariableFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableFeature__Group__1_in_rule__VariableFeature__Group__02517);
            rule__VariableFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableFeature__Group__0"


    // $ANTLR start "rule__VariableFeature__Group__0__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1263:1: rule__VariableFeature__Group__0__Impl : ( ( rule__VariableFeature__FeatureNameAssignment_0 ) ) ;
    public final void rule__VariableFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1267:1: ( ( ( rule__VariableFeature__FeatureNameAssignment_0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1268:1: ( ( rule__VariableFeature__FeatureNameAssignment_0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1268:1: ( ( rule__VariableFeature__FeatureNameAssignment_0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1269:1: ( rule__VariableFeature__FeatureNameAssignment_0 )
            {
             before(grammarAccess.getVariableFeatureAccess().getFeatureNameAssignment_0()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1270:1: ( rule__VariableFeature__FeatureNameAssignment_0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1270:2: rule__VariableFeature__FeatureNameAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableFeature__FeatureNameAssignment_0_in_rule__VariableFeature__Group__0__Impl2544);
            rule__VariableFeature__FeatureNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableFeatureAccess().getFeatureNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableFeature__Group__0__Impl"


    // $ANTLR start "rule__VariableFeature__Group__1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1280:1: rule__VariableFeature__Group__1 : rule__VariableFeature__Group__1__Impl rule__VariableFeature__Group__2 ;
    public final void rule__VariableFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1284:1: ( rule__VariableFeature__Group__1__Impl rule__VariableFeature__Group__2 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1285:2: rule__VariableFeature__Group__1__Impl rule__VariableFeature__Group__2
            {
            pushFollow(FOLLOW_rule__VariableFeature__Group__1__Impl_in_rule__VariableFeature__Group__12574);
            rule__VariableFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableFeature__Group__2_in_rule__VariableFeature__Group__12577);
            rule__VariableFeature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableFeature__Group__1"


    // $ANTLR start "rule__VariableFeature__Group__1__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1292:1: rule__VariableFeature__Group__1__Impl : ( RULE_DOT ) ;
    public final void rule__VariableFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1296:1: ( ( RULE_DOT ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1297:1: ( RULE_DOT )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1297:1: ( RULE_DOT )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1298:1: RULE_DOT
            {
             before(grammarAccess.getVariableFeatureAccess().getDOTTerminalRuleCall_1()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__VariableFeature__Group__1__Impl2604); 
             after(grammarAccess.getVariableFeatureAccess().getDOTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableFeature__Group__1__Impl"


    // $ANTLR start "rule__VariableFeature__Group__2"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1309:1: rule__VariableFeature__Group__2 : rule__VariableFeature__Group__2__Impl ;
    public final void rule__VariableFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1313:1: ( rule__VariableFeature__Group__2__Impl )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1314:2: rule__VariableFeature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableFeature__Group__2__Impl_in_rule__VariableFeature__Group__22633);
            rule__VariableFeature__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableFeature__Group__2"


    // $ANTLR start "rule__VariableFeature__Group__2__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1320:1: rule__VariableFeature__Group__2__Impl : ( ( rule__VariableFeature__VariableAssignment_2 ) ) ;
    public final void rule__VariableFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1324:1: ( ( ( rule__VariableFeature__VariableAssignment_2 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1325:1: ( ( rule__VariableFeature__VariableAssignment_2 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1325:1: ( ( rule__VariableFeature__VariableAssignment_2 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1326:1: ( rule__VariableFeature__VariableAssignment_2 )
            {
             before(grammarAccess.getVariableFeatureAccess().getVariableAssignment_2()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1327:1: ( rule__VariableFeature__VariableAssignment_2 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1327:2: rule__VariableFeature__VariableAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableFeature__VariableAssignment_2_in_rule__VariableFeature__Group__2__Impl2660);
            rule__VariableFeature__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableFeatureAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableFeature__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1343:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1347:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1348:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02696);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02699);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1355:1: rule__Variable__Group__0__Impl : ( RULE_VARBEGIN ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1359:1: ( ( RULE_VARBEGIN ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1360:1: ( RULE_VARBEGIN )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1360:1: ( RULE_VARBEGIN )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1361:1: RULE_VARBEGIN
            {
             before(grammarAccess.getVariableAccess().getVARBEGINTerminalRuleCall_0()); 
            match(input,RULE_VARBEGIN,FOLLOW_RULE_VARBEGIN_in_rule__Variable__Group__0__Impl2726); 
             after(grammarAccess.getVariableAccess().getVARBEGINTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1372:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1376:1: ( rule__Variable__Group__1__Impl )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1377:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12755);
            rule__Variable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1383:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__IdAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1387:1: ( ( ( rule__Variable__IdAssignment_1 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1388:1: ( ( rule__Variable__IdAssignment_1 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1388:1: ( ( rule__Variable__IdAssignment_1 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1389:1: ( rule__Variable__IdAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getIdAssignment_1()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1390:1: ( rule__Variable__IdAssignment_1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1390:2: rule__Variable__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable__IdAssignment_1_in_rule__Variable__Group__1__Impl2782);
            rule__Variable__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__StarFeature__Group__0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1404:1: rule__StarFeature__Group__0 : rule__StarFeature__Group__0__Impl rule__StarFeature__Group__1 ;
    public final void rule__StarFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1408:1: ( rule__StarFeature__Group__0__Impl rule__StarFeature__Group__1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1409:2: rule__StarFeature__Group__0__Impl rule__StarFeature__Group__1
            {
            pushFollow(FOLLOW_rule__StarFeature__Group__0__Impl_in_rule__StarFeature__Group__02816);
            rule__StarFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StarFeature__Group__1_in_rule__StarFeature__Group__02819);
            rule__StarFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StarFeature__Group__0"


    // $ANTLR start "rule__StarFeature__Group__0__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1416:1: rule__StarFeature__Group__0__Impl : ( ( rule__StarFeature__FeatureNameAssignment_0 ) ) ;
    public final void rule__StarFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1420:1: ( ( ( rule__StarFeature__FeatureNameAssignment_0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1421:1: ( ( rule__StarFeature__FeatureNameAssignment_0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1421:1: ( ( rule__StarFeature__FeatureNameAssignment_0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1422:1: ( rule__StarFeature__FeatureNameAssignment_0 )
            {
             before(grammarAccess.getStarFeatureAccess().getFeatureNameAssignment_0()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1423:1: ( rule__StarFeature__FeatureNameAssignment_0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1423:2: rule__StarFeature__FeatureNameAssignment_0
            {
            pushFollow(FOLLOW_rule__StarFeature__FeatureNameAssignment_0_in_rule__StarFeature__Group__0__Impl2846);
            rule__StarFeature__FeatureNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStarFeatureAccess().getFeatureNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StarFeature__Group__0__Impl"


    // $ANTLR start "rule__StarFeature__Group__1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1433:1: rule__StarFeature__Group__1 : rule__StarFeature__Group__1__Impl rule__StarFeature__Group__2 ;
    public final void rule__StarFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1437:1: ( rule__StarFeature__Group__1__Impl rule__StarFeature__Group__2 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1438:2: rule__StarFeature__Group__1__Impl rule__StarFeature__Group__2
            {
            pushFollow(FOLLOW_rule__StarFeature__Group__1__Impl_in_rule__StarFeature__Group__12876);
            rule__StarFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StarFeature__Group__2_in_rule__StarFeature__Group__12879);
            rule__StarFeature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StarFeature__Group__1"


    // $ANTLR start "rule__StarFeature__Group__1__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1445:1: rule__StarFeature__Group__1__Impl : ( RULE_DOT ) ;
    public final void rule__StarFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1449:1: ( ( RULE_DOT ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1450:1: ( RULE_DOT )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1450:1: ( RULE_DOT )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1451:1: RULE_DOT
            {
             before(grammarAccess.getStarFeatureAccess().getDOTTerminalRuleCall_1()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__StarFeature__Group__1__Impl2906); 
             after(grammarAccess.getStarFeatureAccess().getDOTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StarFeature__Group__1__Impl"


    // $ANTLR start "rule__StarFeature__Group__2"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1462:1: rule__StarFeature__Group__2 : rule__StarFeature__Group__2__Impl ;
    public final void rule__StarFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1466:1: ( rule__StarFeature__Group__2__Impl )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1467:2: rule__StarFeature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StarFeature__Group__2__Impl_in_rule__StarFeature__Group__22935);
            rule__StarFeature__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StarFeature__Group__2"


    // $ANTLR start "rule__StarFeature__Group__2__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1473:1: rule__StarFeature__Group__2__Impl : ( RULE_STAR ) ;
    public final void rule__StarFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1477:1: ( ( RULE_STAR ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1478:1: ( RULE_STAR )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1478:1: ( RULE_STAR )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1479:1: RULE_STAR
            {
             before(grammarAccess.getStarFeatureAccess().getSTARTerminalRuleCall_2()); 
            match(input,RULE_STAR,FOLLOW_RULE_STAR_in_rule__StarFeature__Group__2__Impl2962); 
             after(grammarAccess.getStarFeatureAccess().getSTARTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StarFeature__Group__2__Impl"


    // $ANTLR start "rule__RightPart__Group__0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1496:1: rule__RightPart__Group__0 : rule__RightPart__Group__0__Impl rule__RightPart__Group__1 ;
    public final void rule__RightPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1500:1: ( rule__RightPart__Group__0__Impl rule__RightPart__Group__1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1501:2: rule__RightPart__Group__0__Impl rule__RightPart__Group__1
            {
            pushFollow(FOLLOW_rule__RightPart__Group__0__Impl_in_rule__RightPart__Group__02997);
            rule__RightPart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RightPart__Group__1_in_rule__RightPart__Group__03000);
            rule__RightPart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightPart__Group__0"


    // $ANTLR start "rule__RightPart__Group__0__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1508:1: rule__RightPart__Group__0__Impl : ( ( rule__RightPart__ActionAssignment_0 ) ) ;
    public final void rule__RightPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1512:1: ( ( ( rule__RightPart__ActionAssignment_0 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1513:1: ( ( rule__RightPart__ActionAssignment_0 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1513:1: ( ( rule__RightPart__ActionAssignment_0 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1514:1: ( rule__RightPart__ActionAssignment_0 )
            {
             before(grammarAccess.getRightPartAccess().getActionAssignment_0()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1515:1: ( rule__RightPart__ActionAssignment_0 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1515:2: rule__RightPart__ActionAssignment_0
            {
            pushFollow(FOLLOW_rule__RightPart__ActionAssignment_0_in_rule__RightPart__Group__0__Impl3027);
            rule__RightPart__ActionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRightPartAccess().getActionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightPart__Group__0__Impl"


    // $ANTLR start "rule__RightPart__Group__1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1525:1: rule__RightPart__Group__1 : rule__RightPart__Group__1__Impl ;
    public final void rule__RightPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1529:1: ( rule__RightPart__Group__1__Impl )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1530:2: rule__RightPart__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RightPart__Group__1__Impl_in_rule__RightPart__Group__13057);
            rule__RightPart__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightPart__Group__1"


    // $ANTLR start "rule__RightPart__Group__1__Impl"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1536:1: rule__RightPart__Group__1__Impl : ( ( rule__RightPart__FeatureAssignment_1 ) ) ;
    public final void rule__RightPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1540:1: ( ( ( rule__RightPart__FeatureAssignment_1 ) ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1541:1: ( ( rule__RightPart__FeatureAssignment_1 ) )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1541:1: ( ( rule__RightPart__FeatureAssignment_1 ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1542:1: ( rule__RightPart__FeatureAssignment_1 )
            {
             before(grammarAccess.getRightPartAccess().getFeatureAssignment_1()); 
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1543:1: ( rule__RightPart__FeatureAssignment_1 )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1543:2: rule__RightPart__FeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__RightPart__FeatureAssignment_1_in_rule__RightPart__Group__1__Impl3084);
            rule__RightPart__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRightPartAccess().getFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightPart__Group__1__Impl"


    // $ANTLR start "rule__RestFunc__InitAssignment_0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1558:1: rule__RestFunc__InitAssignment_0 : ( ruleSourceAndTarget ) ;
    public final void rule__RestFunc__InitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1562:1: ( ( ruleSourceAndTarget ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1563:1: ( ruleSourceAndTarget )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1563:1: ( ruleSourceAndTarget )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1564:1: ruleSourceAndTarget
            {
             before(grammarAccess.getRestFuncAccess().getInitSourceAndTargetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSourceAndTarget_in_rule__RestFunc__InitAssignment_03123);
            ruleSourceAndTarget();

            state._fsp--;

             after(grammarAccess.getRestFuncAccess().getInitSourceAndTargetParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestFunc__InitAssignment_0"


    // $ANTLR start "rule__RestFunc__RulesAssignment_1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1573:1: rule__RestFunc__RulesAssignment_1 : ( ruleRuleString ) ;
    public final void rule__RestFunc__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1577:1: ( ( ruleRuleString ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1578:1: ( ruleRuleString )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1578:1: ( ruleRuleString )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1579:1: ruleRuleString
            {
             before(grammarAccess.getRestFuncAccess().getRulesRuleStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRuleString_in_rule__RestFunc__RulesAssignment_13154);
            ruleRuleString();

            state._fsp--;

             after(grammarAccess.getRestFuncAccess().getRulesRuleStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestFunc__RulesAssignment_1"


    // $ANTLR start "rule__RuleString__IdAssignment_1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1588:1: rule__RuleString__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleString__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1592:1: ( ( RULE_ID ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1593:1: ( RULE_ID )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1593:1: ( RULE_ID )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1594:1: RULE_ID
            {
             before(grammarAccess.getRuleStringAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuleString__IdAssignment_13185); 
             after(grammarAccess.getRuleStringAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__IdAssignment_1"


    // $ANTLR start "rule__RuleString__LeftAssignment_3"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1603:1: rule__RuleString__LeftAssignment_3 : ( ruleLeftPart ) ;
    public final void rule__RuleString__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1607:1: ( ( ruleLeftPart ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1608:1: ( ruleLeftPart )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1608:1: ( ruleLeftPart )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1609:1: ruleLeftPart
            {
             before(grammarAccess.getRuleStringAccess().getLeftLeftPartParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLeftPart_in_rule__RuleString__LeftAssignment_33216);
            ruleLeftPart();

            state._fsp--;

             after(grammarAccess.getRuleStringAccess().getLeftLeftPartParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__LeftAssignment_3"


    // $ANTLR start "rule__RuleString__RightAssignment_5"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1618:1: rule__RuleString__RightAssignment_5 : ( ruleRightPart ) ;
    public final void rule__RuleString__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1622:1: ( ( ruleRightPart ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1623:1: ( ruleRightPart )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1623:1: ( ruleRightPart )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1624:1: ruleRightPart
            {
             before(grammarAccess.getRuleStringAccess().getRightRightPartParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleRightPart_in_rule__RuleString__RightAssignment_53247);
            ruleRightPart();

            state._fsp--;

             after(grammarAccess.getRuleStringAccess().getRightRightPartParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleString__RightAssignment_5"


    // $ANTLR start "rule__SourceAndTarget__SourceAssignment_0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1633:1: rule__SourceAndTarget__SourceAssignment_0 : ( ruleSource ) ;
    public final void rule__SourceAndTarget__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1637:1: ( ( ruleSource ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1638:1: ( ruleSource )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1638:1: ( ruleSource )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1639:1: ruleSource
            {
             before(grammarAccess.getSourceAndTargetAccess().getSourceSourceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSource_in_rule__SourceAndTarget__SourceAssignment_03278);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getSourceAndTargetAccess().getSourceSourceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceAndTarget__SourceAssignment_0"


    // $ANTLR start "rule__SourceAndTarget__TargetAssignment_1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1648:1: rule__SourceAndTarget__TargetAssignment_1 : ( ruleTarget ) ;
    public final void rule__SourceAndTarget__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1652:1: ( ( ruleTarget ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1653:1: ( ruleTarget )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1653:1: ( ruleTarget )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1654:1: ruleTarget
            {
             before(grammarAccess.getSourceAndTargetAccess().getTargetTargetParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTarget_in_rule__SourceAndTarget__TargetAssignment_13309);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getSourceAndTargetAccess().getTargetTargetParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceAndTarget__TargetAssignment_1"


    // $ANTLR start "rule__Source__DeSrcAssignment_2"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1663:1: rule__Source__DeSrcAssignment_2 : ( RULE_ID ) ;
    public final void rule__Source__DeSrcAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1667:1: ( ( RULE_ID ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1668:1: ( RULE_ID )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1668:1: ( RULE_ID )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1669:1: RULE_ID
            {
             before(grammarAccess.getSourceAccess().getDeSrcIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Source__DeSrcAssignment_23340); 
             after(grammarAccess.getSourceAccess().getDeSrcIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__DeSrcAssignment_2"


    // $ANTLR start "rule__Target__DeTargetAssignment_2"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1678:1: rule__Target__DeTargetAssignment_2 : ( RULE_ID ) ;
    public final void rule__Target__DeTargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1682:1: ( ( RULE_ID ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1683:1: ( RULE_ID )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1683:1: ( RULE_ID )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1684:1: RULE_ID
            {
             before(grammarAccess.getTargetAccess().getDeTargetIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Target__DeTargetAssignment_23371); 
             after(grammarAccess.getTargetAccess().getDeTargetIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__DeTargetAssignment_2"


    // $ANTLR start "rule__LeftPart__FeaturesAssignment"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1693:1: rule__LeftPart__FeaturesAssignment : ( ruleGroupFeature ) ;
    public final void rule__LeftPart__FeaturesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1697:1: ( ( ruleGroupFeature ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1698:1: ( ruleGroupFeature )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1698:1: ( ruleGroupFeature )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1699:1: ruleGroupFeature
            {
             before(grammarAccess.getLeftPartAccess().getFeaturesGroupFeatureParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleGroupFeature_in_rule__LeftPart__FeaturesAssignment3402);
            ruleGroupFeature();

            state._fsp--;

             after(grammarAccess.getLeftPartAccess().getFeaturesGroupFeatureParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftPart__FeaturesAssignment"


    // $ANTLR start "rule__GroupFeature__StateAssignment_0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1708:1: rule__GroupFeature__StateAssignment_0 : ( ruleFM_STATE ) ;
    public final void rule__GroupFeature__StateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1712:1: ( ( ruleFM_STATE ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1713:1: ( ruleFM_STATE )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1713:1: ( ruleFM_STATE )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1714:1: ruleFM_STATE
            {
             before(grammarAccess.getGroupFeatureAccess().getStateFM_STATEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFM_STATE_in_rule__GroupFeature__StateAssignment_03433);
            ruleFM_STATE();

            state._fsp--;

             after(grammarAccess.getGroupFeatureAccess().getStateFM_STATEParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupFeature__StateAssignment_0"


    // $ANTLR start "rule__GroupFeature__FeatureAssignment_1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1723:1: rule__GroupFeature__FeatureAssignment_1 : ( ruleFeatureNamed ) ;
    public final void rule__GroupFeature__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1727:1: ( ( ruleFeatureNamed ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1728:1: ( ruleFeatureNamed )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1728:1: ( ruleFeatureNamed )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1729:1: ruleFeatureNamed
            {
             before(grammarAccess.getGroupFeatureAccess().getFeatureFeatureNamedParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFeatureNamed_in_rule__GroupFeature__FeatureAssignment_13464);
            ruleFeatureNamed();

            state._fsp--;

             after(grammarAccess.getGroupFeatureAccess().getFeatureFeatureNamedParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupFeature__FeatureAssignment_1"


    // $ANTLR start "rule__GroupFeature__FeatureAssignment_2_1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1738:1: rule__GroupFeature__FeatureAssignment_2_1 : ( ruleFeatureNamed ) ;
    public final void rule__GroupFeature__FeatureAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1742:1: ( ( ruleFeatureNamed ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1743:1: ( ruleFeatureNamed )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1743:1: ( ruleFeatureNamed )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1744:1: ruleFeatureNamed
            {
             before(grammarAccess.getGroupFeatureAccess().getFeatureFeatureNamedParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleFeatureNamed_in_rule__GroupFeature__FeatureAssignment_2_13495);
            ruleFeatureNamed();

            state._fsp--;

             after(grammarAccess.getGroupFeatureAccess().getFeatureFeatureNamedParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupFeature__FeatureAssignment_2_1"


    // $ANTLR start "rule__SingleFeature__FeatureNameAssignment"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1753:1: rule__SingleFeature__FeatureNameAssignment : ( RULE_ID ) ;
    public final void rule__SingleFeature__FeatureNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1757:1: ( ( RULE_ID ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1758:1: ( RULE_ID )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1758:1: ( RULE_ID )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1759:1: RULE_ID
            {
             before(grammarAccess.getSingleFeatureAccess().getFeatureNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SingleFeature__FeatureNameAssignment3526); 
             after(grammarAccess.getSingleFeatureAccess().getFeatureNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleFeature__FeatureNameAssignment"


    // $ANTLR start "rule__VariableFeature__FeatureNameAssignment_0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1768:1: rule__VariableFeature__FeatureNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableFeature__FeatureNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1772:1: ( ( RULE_ID ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1773:1: ( RULE_ID )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1773:1: ( RULE_ID )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1774:1: RULE_ID
            {
             before(grammarAccess.getVariableFeatureAccess().getFeatureNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableFeature__FeatureNameAssignment_03557); 
             after(grammarAccess.getVariableFeatureAccess().getFeatureNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableFeature__FeatureNameAssignment_0"


    // $ANTLR start "rule__VariableFeature__VariableAssignment_2"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1783:1: rule__VariableFeature__VariableAssignment_2 : ( ruleVariable ) ;
    public final void rule__VariableFeature__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1787:1: ( ( ruleVariable ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1788:1: ( ruleVariable )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1788:1: ( ruleVariable )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1789:1: ruleVariable
            {
             before(grammarAccess.getVariableFeatureAccess().getVariableVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__VariableFeature__VariableAssignment_23588);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableFeatureAccess().getVariableVariableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableFeature__VariableAssignment_2"


    // $ANTLR start "rule__Variable__IdAssignment_1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1798:1: rule__Variable__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1802:1: ( ( RULE_ID ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1803:1: ( RULE_ID )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1803:1: ( RULE_ID )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1804:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__IdAssignment_13619); 
             after(grammarAccess.getVariableAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__IdAssignment_1"


    // $ANTLR start "rule__StarFeature__FeatureNameAssignment_0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1813:1: rule__StarFeature__FeatureNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__StarFeature__FeatureNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1817:1: ( ( RULE_ID ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1818:1: ( RULE_ID )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1818:1: ( RULE_ID )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1819:1: RULE_ID
            {
             before(grammarAccess.getStarFeatureAccess().getFeatureNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StarFeature__FeatureNameAssignment_03650); 
             after(grammarAccess.getStarFeatureAccess().getFeatureNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StarFeature__FeatureNameAssignment_0"


    // $ANTLR start "rule__RightPart__ActionAssignment_0"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1828:1: rule__RightPart__ActionAssignment_0 : ( ruleACTIONFEATURE ) ;
    public final void rule__RightPart__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1832:1: ( ( ruleACTIONFEATURE ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1833:1: ( ruleACTIONFEATURE )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1833:1: ( ruleACTIONFEATURE )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1834:1: ruleACTIONFEATURE
            {
             before(grammarAccess.getRightPartAccess().getActionACTIONFEATUREParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleACTIONFEATURE_in_rule__RightPart__ActionAssignment_03681);
            ruleACTIONFEATURE();

            state._fsp--;

             after(grammarAccess.getRightPartAccess().getActionACTIONFEATUREParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightPart__ActionAssignment_0"


    // $ANTLR start "rule__RightPart__FeatureAssignment_1"
    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1843:1: rule__RightPart__FeatureAssignment_1 : ( ruleFeatureNamed ) ;
    public final void rule__RightPart__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1847:1: ( ( ruleFeatureNamed ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1848:1: ( ruleFeatureNamed )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1848:1: ( ruleFeatureNamed )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1849:1: ruleFeatureNamed
            {
             before(grammarAccess.getRightPartAccess().getFeatureFeatureNamedParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFeatureNamed_in_rule__RightPart__FeatureAssignment_13712);
            ruleFeatureNamed();

            state._fsp--;

             after(grammarAccess.getRightPartAccess().getFeatureFeatureNamedParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightPart__FeatureAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRestFunc_in_entryRuleRestFunc61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestFunc68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestFunc__Group__0_in_ruleRestFunc94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleString_in_entryRuleRuleString121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleString128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleString__Group__0_in_ruleRuleString154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceAndTarget_in_entryRuleSourceAndTarget181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceAndTarget188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceAndTarget__Group__0_in_ruleSourceAndTarget214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_entryRuleSource241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSource248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__Group__0_in_ruleSource274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTarget_in_entryRuleTarget301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTarget308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Target__Group__0_in_ruleTarget334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftPart_in_entryRuleLeftPart361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftPart368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LeftPart__FeaturesAssignment_in_ruleLeftPart396 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_rule__LeftPart__FeaturesAssignment_in_ruleLeftPart408 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleGroupFeature_in_entryRuleGroupFeature438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupFeature445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupFeature__Group__0_in_ruleGroupFeature471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureNamed_in_entryRuleFeatureNamed498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureNamed505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureNamed__Alternatives_in_ruleFeatureNamed531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleFeature_in_entryRuleSingleFeature558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleFeature565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleFeature__FeatureNameAssignment_in_ruleSingleFeature591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableFeature_in_entryRuleVariableFeature618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableFeature625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableFeature__Group__0_in_ruleVariableFeature651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStarFeature_in_entryRuleStarFeature738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStarFeature745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StarFeature__Group__0_in_ruleStarFeature771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightPart_in_entryRuleRightPart798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightPart805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RightPart__Group__0_in_ruleRightPart831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFM_STATE_in_entryRuleFM_STATE858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFM_STATE865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FM_STATE__Alternatives_in_ruleFM_STATE891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACTIONFEATURE_in_entryRuleACTIONFEATURE918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleACTIONFEATURE925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACTIONFEATURE__Alternatives_in_ruleACTIONFEATURE951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleFeature_in_rule__FeatureNamed__Alternatives987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableFeature_in_rule__FeatureNamed__Alternatives1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStarFeature_in_rule__FeatureNamed__Alternatives1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FM_STATE__Alternatives1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FM_STATE__Alternatives1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ACTIONFEATURE__Alternatives1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ACTIONFEATURE__Alternatives1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestFunc__Group__0__Impl_in_rule__RestFunc__Group__01161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RestFunc__Group__1_in_rule__RestFunc__Group__01164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestFunc__InitAssignment_0_in_rule__RestFunc__Group__0__Impl1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestFunc__Group__1__Impl_in_rule__RestFunc__Group__11221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestFunc__RulesAssignment_1_in_rule__RestFunc__Group__1__Impl1250 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__RestFunc__RulesAssignment_1_in_rule__RestFunc__Group__1__Impl1262 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__RuleString__Group__0__Impl_in_rule__RuleString__Group__01299 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_rule__RuleString__Group__1_in_rule__RuleString__Group__01302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_RULE_in_rule__RuleString__Group__0__Impl1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleString__Group__1__Impl_in_rule__RuleString__Group__11358 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_rule__RuleString__Group__2_in_rule__RuleString__Group__11361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleString__IdAssignment_1_in_rule__RuleString__Group__1__Impl1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleString__Group__2__Impl_in_rule__RuleString__Group__21419 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__RuleString__Group__3_in_rule__RuleString__Group__21422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POINTS_in_rule__RuleString__Group__2__Impl1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleString__Group__3__Impl_in_rule__RuleString__Group__31478 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RuleString__Group__4_in_rule__RuleString__Group__31481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleString__LeftAssignment_3_in_rule__RuleString__Group__3__Impl1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleString__Group__4__Impl_in_rule__RuleString__Group__41538 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__RuleString__Group__5_in_rule__RuleString__Group__41541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IMPLY_in_rule__RuleString__Group__4__Impl1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleString__Group__5__Impl_in_rule__RuleString__Group__51597 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__RuleString__Group__6_in_rule__RuleString__Group__51600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleString__RightAssignment_5_in_rule__RuleString__Group__5__Impl1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleString__Group__6__Impl_in_rule__RuleString__Group__61657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_RULE_in_rule__RuleString__Group__6__Impl1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceAndTarget__Group__0__Impl_in_rule__SourceAndTarget__Group__01727 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__SourceAndTarget__Group__1_in_rule__SourceAndTarget__Group__01730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceAndTarget__SourceAssignment_0_in_rule__SourceAndTarget__Group__0__Impl1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceAndTarget__Group__1__Impl_in_rule__SourceAndTarget__Group__11787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceAndTarget__TargetAssignment_1_in_rule__SourceAndTarget__Group__1__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__Group__0__Impl_in_rule__Source__Group__01848 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Source__Group__1_in_rule__Source__Group__01851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SOURCEKEY_in_rule__Source__Group__0__Impl1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__Group__1__Impl_in_rule__Source__Group__11907 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Source__Group__2_in_rule__Source__Group__11910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_rule__Source__Group__1__Impl1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__Group__2__Impl_in_rule__Source__Group__21966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__DeSrcAssignment_2_in_rule__Source__Group__2__Impl1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Target__Group__0__Impl_in_rule__Target__Group__02029 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Target__Group__1_in_rule__Target__Group__02032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TARGETKEY_in_rule__Target__Group__0__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Target__Group__1__Impl_in_rule__Target__Group__12088 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Target__Group__2_in_rule__Target__Group__12091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_rule__Target__Group__1__Impl2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Target__Group__2__Impl_in_rule__Target__Group__22147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Target__DeTargetAssignment_2_in_rule__Target__Group__2__Impl2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupFeature__Group__0__Impl_in_rule__GroupFeature__Group__02210 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__GroupFeature__Group__1_in_rule__GroupFeature__Group__02213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupFeature__StateAssignment_0_in_rule__GroupFeature__Group__0__Impl2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupFeature__Group__1__Impl_in_rule__GroupFeature__Group__12270 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__GroupFeature__Group__2_in_rule__GroupFeature__Group__12273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupFeature__FeatureAssignment_1_in_rule__GroupFeature__Group__1__Impl2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupFeature__Group__2__Impl_in_rule__GroupFeature__Group__22330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupFeature__Group_2__0_in_rule__GroupFeature__Group__2__Impl2357 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__GroupFeature__Group_2__0__Impl_in_rule__GroupFeature__Group_2__02394 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__GroupFeature__Group_2__1_in_rule__GroupFeature__Group_2__02397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__GroupFeature__Group_2__0__Impl2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupFeature__Group_2__1__Impl_in_rule__GroupFeature__Group_2__12453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupFeature__FeatureAssignment_2_1_in_rule__GroupFeature__Group_2__1__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableFeature__Group__0__Impl_in_rule__VariableFeature__Group__02514 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__VariableFeature__Group__1_in_rule__VariableFeature__Group__02517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableFeature__FeatureNameAssignment_0_in_rule__VariableFeature__Group__0__Impl2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableFeature__Group__1__Impl_in_rule__VariableFeature__Group__12574 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__VariableFeature__Group__2_in_rule__VariableFeature__Group__12577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__VariableFeature__Group__1__Impl2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableFeature__Group__2__Impl_in_rule__VariableFeature__Group__22633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableFeature__VariableAssignment_2_in_rule__VariableFeature__Group__2__Impl2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02696 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARBEGIN_in_rule__Variable__Group__0__Impl2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__IdAssignment_1_in_rule__Variable__Group__1__Impl2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StarFeature__Group__0__Impl_in_rule__StarFeature__Group__02816 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__StarFeature__Group__1_in_rule__StarFeature__Group__02819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StarFeature__FeatureNameAssignment_0_in_rule__StarFeature__Group__0__Impl2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StarFeature__Group__1__Impl_in_rule__StarFeature__Group__12876 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__StarFeature__Group__2_in_rule__StarFeature__Group__12879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__StarFeature__Group__1__Impl2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StarFeature__Group__2__Impl_in_rule__StarFeature__Group__22935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STAR_in_rule__StarFeature__Group__2__Impl2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RightPart__Group__0__Impl_in_rule__RightPart__Group__02997 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__RightPart__Group__1_in_rule__RightPart__Group__03000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RightPart__ActionAssignment_0_in_rule__RightPart__Group__0__Impl3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RightPart__Group__1__Impl_in_rule__RightPart__Group__13057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RightPart__FeatureAssignment_1_in_rule__RightPart__Group__1__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceAndTarget_in_rule__RestFunc__InitAssignment_03123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleString_in_rule__RestFunc__RulesAssignment_13154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuleString__IdAssignment_13185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftPart_in_rule__RuleString__LeftAssignment_33216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightPart_in_rule__RuleString__RightAssignment_53247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_rule__SourceAndTarget__SourceAssignment_03278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTarget_in_rule__SourceAndTarget__TargetAssignment_13309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Source__DeSrcAssignment_23340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Target__DeTargetAssignment_23371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupFeature_in_rule__LeftPart__FeaturesAssignment3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFM_STATE_in_rule__GroupFeature__StateAssignment_03433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureNamed_in_rule__GroupFeature__FeatureAssignment_13464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureNamed_in_rule__GroupFeature__FeatureAssignment_2_13495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SingleFeature__FeatureNameAssignment3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableFeature__FeatureNameAssignment_03557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__VariableFeature__VariableAssignment_23588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__IdAssignment_13619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StarFeature__FeatureNameAssignment_03650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACTIONFEATURE_in_rule__RightPart__ActionAssignment_03681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureNamed_in_rule__RightPart__FeatureAssignment_13712 = new BitSet(new long[]{0x0000000000000002L});

}