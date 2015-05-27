package fr.unice.spinefm.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestfuncDSLLexer extends Lexer {
    public static final int RULE_BEGIN_RULE=4;
    public static final int RULE_ID=15;
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
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_STRING=17;
    public static final int RULE_END_RULE=7;
    public static final int RULE_DOT=12;
    public static final int RULE_STAR=14;
    public static final int RULE_SOURCEKEY=8;
    public static final int RULE_POINTS=5;
    public static final int RULE_INT=16;
    public static final int RULE_WS=20;

    // delegates
    // delegators

    public InternalRestfuncDSLLexer() {;} 
    public InternalRestfuncDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRestfuncDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g"; }

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:11:7: ( 'SELECTED' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:11:9: 'SELECTED'
            {
            match("SELECTED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:12:7: ( 'DESELECTED' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:12:9: 'DESELECTED'
            {
            match("DESELECTED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:13:7: ( 'SELECT' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:13:9: 'SELECT'
            {
            match("SELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:14:7: ( 'DESELECT' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:14:9: 'DESELECT'
            {
            match("DESELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_IMPLY"
    public final void mRULE_IMPLY() throws RecognitionException {
        try {
            int _type = RULE_IMPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1859:12: ( '=>' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1859:14: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMPLY"

    // $ANTLR start "RULE_BEGIN_RULE"
    public final void mRULE_BEGIN_RULE() throws RecognitionException {
        try {
            int _type = RULE_BEGIN_RULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1861:17: ( 'rule' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1861:19: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN_RULE"

    // $ANTLR start "RULE_STAR"
    public final void mRULE_STAR() throws RecognitionException {
        try {
            int _type = RULE_STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1863:11: ( '*' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1863:13: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STAR"

    // $ANTLR start "RULE_POINTS"
    public final void mRULE_POINTS() throws RecognitionException {
        try {
            int _type = RULE_POINTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1865:13: ( ':' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1865:15: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POINTS"

    // $ANTLR start "RULE_END_RULE"
    public final void mRULE_END_RULE() throws RecognitionException {
        try {
            int _type = RULE_END_RULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1867:15: ( ';' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1867:17: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_END_RULE"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1869:12: ( ',' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1869:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1871:10: ( '.' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1871:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_VARBEGIN"
    public final void mRULE_VARBEGIN() throws RecognitionException {
        try {
            int _type = RULE_VARBEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1873:15: ( '$' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1873:17: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARBEGIN"

    // $ANTLR start "RULE_SOURCEKEY"
    public final void mRULE_SOURCEKEY() throws RecognitionException {
        try {
            int _type = RULE_SOURCEKEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1875:16: ( 'source' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1875:18: 'source'
            {
            match("source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SOURCEKEY"

    // $ANTLR start "RULE_TARGETKEY"
    public final void mRULE_TARGETKEY() throws RecognitionException {
        try {
            int _type = RULE_TARGETKEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1877:16: ( 'target' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1877:18: 'target'
            {
            match("target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TARGETKEY"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1879:12: ( '=' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1879:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1881:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1881:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1881:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1881:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1881:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1883:10: ( ( '0' .. '9' )+ )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1883:12: ( '0' .. '9' )+
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1883:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1883:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1885:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1885:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1885:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1885:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1885:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1885:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1885:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1885:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1885:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1885:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1885:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1887:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1887:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1887:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1887:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1889:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1889:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1889:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1889:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1889:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1889:41: ( '\\r' )? '\\n'
                    {
                    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1889:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1889:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1891:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1891:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1891:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1893:16: ( . )
            // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1893:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:8: ( T__22 | T__23 | T__24 | T__25 | RULE_IMPLY | RULE_BEGIN_RULE | RULE_STAR | RULE_POINTS | RULE_END_RULE | RULE_COMMA | RULE_DOT | RULE_VARBEGIN | RULE_SOURCEKEY | RULE_TARGETKEY | RULE_EQUAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=22;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:10: T__22
                {
                mT__22(); 

                }
                break;
            case 2 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:16: T__23
                {
                mT__23(); 

                }
                break;
            case 3 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:22: T__24
                {
                mT__24(); 

                }
                break;
            case 4 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:28: T__25
                {
                mT__25(); 

                }
                break;
            case 5 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:34: RULE_IMPLY
                {
                mRULE_IMPLY(); 

                }
                break;
            case 6 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:45: RULE_BEGIN_RULE
                {
                mRULE_BEGIN_RULE(); 

                }
                break;
            case 7 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:61: RULE_STAR
                {
                mRULE_STAR(); 

                }
                break;
            case 8 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:71: RULE_POINTS
                {
                mRULE_POINTS(); 

                }
                break;
            case 9 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:83: RULE_END_RULE
                {
                mRULE_END_RULE(); 

                }
                break;
            case 10 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:97: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 11 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:108: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 12 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:117: RULE_VARBEGIN
                {
                mRULE_VARBEGIN(); 

                }
                break;
            case 13 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:131: RULE_SOURCEKEY
                {
                mRULE_SOURCEKEY(); 

                }
                break;
            case 14 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:146: RULE_TARGETKEY
                {
                mRULE_TARGETKEY(); 

                }
                break;
            case 15 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:161: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 16 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:172: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:180: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:189: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:201: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:217: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:233: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // ../restfuncDSL.ui/src-gen/fr/unice/spinefm/ui/contentassist/antlr/internal/InternalRestfuncDSL.g:1:241: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\2\26\1\31\1\26\6\uffff\2\26\1\24\2\uffff\3\24\2\uffff\1"+
        "\26\1\uffff\1\26\2\uffff\1\26\6\uffff\2\26\5\uffff\7\26\1\64\4\26"+
        "\1\uffff\2\26\1\74\1\26\1\76\1\77\1\26\1\uffff\1\26\2\uffff\1\102"+
        "\1\104\1\uffff\1\26\1\uffff\1\106\1\uffff";
    static final String DFA12_eofS =
        "\107\uffff";
    static final String DFA12_minS =
        "\1\0\2\105\1\76\1\165\6\uffff\1\157\1\141\1\101\2\uffff\2\0\1\52"+
        "\2\uffff\1\114\1\uffff\1\123\2\uffff\1\154\6\uffff\1\165\1\162\5"+
        "\uffff\2\105\1\145\1\162\1\147\1\103\1\114\1\60\1\143\1\145\1\124"+
        "\1\105\1\uffff\1\145\1\164\1\60\1\103\2\60\1\104\1\uffff\1\124\2"+
        "\uffff\2\60\1\uffff\1\104\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\2\105\1\76\1\165\6\uffff\1\157\1\141\1\172\2\uffff\2\uffff"+
        "\1\57\2\uffff\1\114\1\uffff\1\123\2\uffff\1\154\6\uffff\1\165\1"+
        "\162\5\uffff\2\105\1\145\1\162\1\147\1\103\1\114\1\172\1\143\1\145"+
        "\1\124\1\105\1\uffff\1\145\1\164\1\172\1\103\2\172\1\104\1\uffff"+
        "\1\124\2\uffff\2\172\1\uffff\1\104\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\5\uffff\1\7\1\10\1\11\1\12\1\13\1\14\3\uffff\1\20\1\21\3\uffff"+
        "\1\25\1\26\1\uffff\1\20\1\uffff\1\5\1\17\1\uffff\1\7\1\10\1\11\1"+
        "\12\1\13\1\14\2\uffff\1\21\1\22\1\23\1\24\1\25\14\uffff\1\6\7\uffff"+
        "\1\3\1\uffff\1\15\1\16\2\uffff\1\1\1\uffff\1\4\1\uffff\1\2";
    static final String DFA12_specialS =
        "\1\0\17\uffff\1\1\1\2\65\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\20\1\24\1\12\2\24\1"+
            "\21\2\24\1\5\1\24\1\10\1\24\1\11\1\22\12\17\1\6\1\7\1\24\1\3"+
            "\3\24\3\16\1\2\16\16\1\1\7\16\3\24\1\15\1\16\1\24\21\16\1\4"+
            "\1\13\1\14\6\16\uff85\24",
            "\1\25",
            "\1\27",
            "\1\30",
            "\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\41",
            "\1\42",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\0\44",
            "\0\44",
            "\1\45\4\uffff\1\46",
            "",
            "",
            "\1\50",
            "",
            "\1\51",
            "",
            "",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\1\71",
            "\1\72",
            "\12\26\7\uffff\4\26\1\73\25\26\4\uffff\1\26\1\uffff\32\26",
            "\1\75",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\100",
            "",
            "\1\101",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\4\26\1\103\25\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\105",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | RULE_IMPLY | RULE_BEGIN_RULE | RULE_STAR | RULE_POINTS | RULE_END_RULE | RULE_COMMA | RULE_DOT | RULE_VARBEGIN | RULE_SOURCEKEY | RULE_TARGETKEY | RULE_EQUAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='S') ) {s = 1;}

                        else if ( (LA12_0=='D') ) {s = 2;}

                        else if ( (LA12_0=='=') ) {s = 3;}

                        else if ( (LA12_0=='r') ) {s = 4;}

                        else if ( (LA12_0=='*') ) {s = 5;}

                        else if ( (LA12_0==':') ) {s = 6;}

                        else if ( (LA12_0==';') ) {s = 7;}

                        else if ( (LA12_0==',') ) {s = 8;}

                        else if ( (LA12_0=='.') ) {s = 9;}

                        else if ( (LA12_0=='$') ) {s = 10;}

                        else if ( (LA12_0=='s') ) {s = 11;}

                        else if ( (LA12_0=='t') ) {s = 12;}

                        else if ( (LA12_0=='^') ) {s = 13;}

                        else if ( ((LA12_0>='A' && LA12_0<='C')||(LA12_0>='E' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='q')||(LA12_0>='u' && LA12_0<='z')) ) {s = 14;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 15;}

                        else if ( (LA12_0=='\"') ) {s = 16;}

                        else if ( (LA12_0=='\'') ) {s = 17;}

                        else if ( (LA12_0=='/') ) {s = 18;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 19;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||LA12_0=='#'||(LA12_0>='%' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=')')||LA12_0=='+'||LA12_0=='-'||LA12_0=='<'||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_16 = input.LA(1);

                        s = -1;
                        if ( ((LA12_16>='\u0000' && LA12_16<='\uFFFF')) ) {s = 36;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( ((LA12_17>='\u0000' && LA12_17<='\uFFFF')) ) {s = 36;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}