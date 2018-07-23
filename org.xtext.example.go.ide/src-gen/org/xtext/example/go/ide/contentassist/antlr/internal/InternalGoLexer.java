package org.xtext.example.go.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoLexer extends Lexer {
    public static final int RULE_OP_SUM=11;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_OP_MULT=12;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int RULE_TYPE=7;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_OP_REL=9;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_BOOL=4;
    public static final int RULE_OP_UNARY=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalGoLexer() {;} 
    public InternalGoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGo.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:11:7: ( '.' )
            // InternalGo.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:12:7: ( ':=' )
            // InternalGo.g:12:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:13:7: ( '=' )
            // InternalGo.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:14:7: ( 'var' )
            // InternalGo.g:14:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:15:7: ( 'const' )
            // InternalGo.g:15:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:16:7: ( '++' )
            // InternalGo.g:16:9: '++'
            {
            match("++"); 


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
            // InternalGo.g:17:7: ( '--' )
            // InternalGo.g:17:9: '--'
            {
            match("--"); 


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
            // InternalGo.g:18:7: ( '+=' )
            // InternalGo.g:18:9: '+='
            {
            match("+="); 


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
            // InternalGo.g:19:7: ( '-=' )
            // InternalGo.g:19:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:20:7: ( '*=' )
            // InternalGo.g:20:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:21:7: ( '/=' )
            // InternalGo.g:21:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:22:7: ( '&&' )
            // InternalGo.g:22:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:23:7: ( '||' )
            // InternalGo.g:23:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:24:7: ( ';' )
            // InternalGo.g:24:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:25:7: ( 'import' )
            // InternalGo.g:25:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:26:7: ( '(' )
            // InternalGo.g:26:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:27:7: ( ')' )
            // InternalGo.g:27:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:28:7: ( 'package' )
            // InternalGo.g:28:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:29:7: ( 'for' )
            // InternalGo.g:29:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:30:7: ( 'range' )
            // InternalGo.g:30:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:31:7: ( 'func' )
            // InternalGo.g:31:9: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:32:7: ( ',' )
            // InternalGo.g:32:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:33:7: ( '...' )
            // InternalGo.g:33:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:34:7: ( 'switch' )
            // InternalGo.g:34:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:35:7: ( '{' )
            // InternalGo.g:35:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:36:7: ( '}' )
            // InternalGo.g:36:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:37:7: ( 'case' )
            // InternalGo.g:37:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:38:7: ( 'default' )
            // InternalGo.g:38:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:39:7: ( ':' )
            // InternalGo.g:39:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:40:7: ( 'if' )
            // InternalGo.g:40:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:41:7: ( 'else' )
            // InternalGo.g:41:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:42:7: ( 'return' )
            // InternalGo.g:42:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:43:7: ( '!' )
            // InternalGo.g:43:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "RULE_TYPE"
    public final void mRULE_TYPE() throws RecognitionException {
        try {
            int _type = RULE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:5630:11: ( ( 'string' | 'int' | 'bool' ) )
            // InternalGo.g:5630:13: ( 'string' | 'int' | 'bool' )
            {
            // InternalGo.g:5630:13: ( 'string' | 'int' | 'bool' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt1=1;
                }
                break;
            case 'i':
                {
                alt1=2;
                }
                break;
            case 'b':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGo.g:5630:14: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:5630:23: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:5630:29: 'bool'
                    {
                    match("bool"); 


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
    // $ANTLR end "RULE_TYPE"

    // $ANTLR start "RULE_OP_SUM"
    public final void mRULE_OP_SUM() throws RecognitionException {
        try {
            int _type = RULE_OP_SUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:5632:13: ( ( '+' | '-' ) )
            // InternalGo.g:5632:15: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_SUM"

    // $ANTLR start "RULE_OP_MULT"
    public final void mRULE_OP_MULT() throws RecognitionException {
        try {
            int _type = RULE_OP_MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:5634:14: ( ( '*' | '/' ) )
            // InternalGo.g:5634:16: ( '*' | '/' )
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_MULT"

    // $ANTLR start "RULE_OP_REL"
    public final void mRULE_OP_REL() throws RecognitionException {
        try {
            int _type = RULE_OP_REL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:5636:13: ( ( '<=' | '>=' | '<' | '>' ) )
            // InternalGo.g:5636:15: ( '<=' | '>=' | '<' | '>' )
            {
            // InternalGo.g:5636:15: ( '<=' | '>=' | '<' | '>' )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='<') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='=') ) {
                    alt2=1;
                }
                else {
                    alt2=3;}
            }
            else if ( (LA2_0=='>') ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='=') ) {
                    alt2=2;
                }
                else {
                    alt2=4;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGo.g:5636:16: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:5636:21: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 3 :
                    // InternalGo.g:5636:26: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalGo.g:5636:30: '>'
                    {
                    match('>'); 

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
    // $ANTLR end "RULE_OP_REL"

    // $ANTLR start "RULE_OP_UNARY"
    public final void mRULE_OP_UNARY() throws RecognitionException {
        try {
            int _type = RULE_OP_UNARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:5638:15: ( ( '==' | '!=' ) )
            // InternalGo.g:5638:17: ( '==' | '!=' )
            {
            // InternalGo.g:5638:17: ( '==' | '!=' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='=') ) {
                alt3=1;
            }
            else if ( (LA3_0=='!') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGo.g:5638:18: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:5638:23: '!='
                    {
                    match("!="); 


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
    // $ANTLR end "RULE_OP_UNARY"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:5640:11: ( ( 'true' | 'false' ) )
            // InternalGo.g:5640:13: ( 'true' | 'false' )
            {
            // InternalGo.g:5640:13: ( 'true' | 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='t') ) {
                alt4=1;
            }
            else if ( (LA4_0=='f') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGo.g:5640:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalGo.g:5640:21: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:5642:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:5642:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:5642:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGo.g:5642:11: '^'
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

            // InternalGo.g:5642:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGo.g:
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
            	    break loop6;
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
            // InternalGo.g:5644:10: ( ( '0' .. '9' )+ )
            // InternalGo.g:5644:12: ( '0' .. '9' )+
            {
            // InternalGo.g:5644:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGo.g:5644:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalGo.g:5646:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:5646:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:5646:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGo.g:5646:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:5646:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGo.g:5646:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:5646:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:5646:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:5646:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGo.g:5646:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:5646:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalGo.g:5648:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:5648:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:5648:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGo.g:5648:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalGo.g:5650:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:5650:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:5650:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGo.g:5650:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalGo.g:5650:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGo.g:5650:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:5650:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalGo.g:5650:41: '\\r'
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
            // InternalGo.g:5652:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:5652:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:5652:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGo.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalGo.g:5654:16: ( . )
            // InternalGo.g:5654:18: .
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
        // InternalGo.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_TYPE | RULE_OP_SUM | RULE_OP_MULT | RULE_OP_REL | RULE_OP_UNARY | RULE_BOOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=46;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalGo.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:208: RULE_TYPE
                {
                mRULE_TYPE(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:218: RULE_OP_SUM
                {
                mRULE_OP_SUM(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:230: RULE_OP_MULT
                {
                mRULE_OP_MULT(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:243: RULE_OP_REL
                {
                mRULE_OP_REL(); 

                }
                break;
            case 38 :
                // InternalGo.g:1:255: RULE_OP_UNARY
                {
                mRULE_OP_UNARY(); 

                }
                break;
            case 39 :
                // InternalGo.g:1:269: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 40 :
                // InternalGo.g:1:279: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 41 :
                // InternalGo.g:1:287: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 42 :
                // InternalGo.g:1:296: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // InternalGo.g:1:308: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 44 :
                // InternalGo.g:1:324: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 45 :
                // InternalGo.g:1:340: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 46 :
                // InternalGo.g:1:348: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\46\1\50\1\52\2\54\2\61\2\65\2\44\1\uffff\1\54\2\uffff\3\54\1\uffff\1\54\2\uffff\2\54\1\116\1\54\2\uffff\1\54\1\44\2\uffff\2\44\10\uffff\1\54\1\uffff\2\54\15\uffff\1\54\1\131\1\54\2\uffff\6\54\1\uffff\2\54\2\uffff\2\54\1\uffff\1\54\1\uffff\1\54\3\uffff\1\147\3\54\1\uffff\1\153\1\54\1\155\12\54\1\uffff\1\54\1\171\1\54\1\uffff\1\54\1\uffff\1\174\6\54\1\u0083\1\153\1\u0084\1\u0085\1\uffff\2\54\1\uffff\1\u0084\1\u0088\4\54\3\uffff\1\u008d\1\54\1\uffff\1\u008f\1\u0090\1\153\1\54\1\uffff\1\u0092\2\uffff\1\u0093\2\uffff";
    static final String DFA16_eofS =
        "\u0094\uffff";
    static final String DFA16_minS =
        "\1\0\1\56\2\75\2\141\1\53\1\55\1\75\1\52\1\46\1\174\1\uffff\1\146\2\uffff\3\141\1\uffff\1\164\2\uffff\1\145\1\154\1\75\1\157\2\uffff\1\162\1\101\2\uffff\2\0\10\uffff\1\162\1\uffff\1\156\1\163\15\uffff\1\160\1\60\1\164\2\uffff\1\143\1\162\1\156\1\154\1\156\1\164\1\uffff\1\151\1\162\2\uffff\1\146\1\163\1\uffff\1\157\1\uffff\1\165\3\uffff\1\60\1\163\1\145\1\157\1\uffff\1\60\1\153\1\60\1\143\1\163\1\147\1\165\1\164\1\151\1\141\1\145\1\154\1\145\1\uffff\1\164\1\60\1\162\1\uffff\1\141\1\uffff\1\60\2\145\1\162\1\143\1\156\1\165\4\60\1\uffff\1\164\1\147\1\uffff\2\60\1\156\1\150\1\147\1\154\3\uffff\1\60\1\145\1\uffff\3\60\1\164\1\uffff\1\60\2\uffff\1\60\2\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\56\2\75\1\141\1\157\4\75\1\46\1\174\1\uffff\1\156\2\uffff\1\141\1\165\1\145\1\uffff\1\167\2\uffff\1\145\1\154\1\75\1\157\2\uffff\1\162\1\172\2\uffff\2\uffff\10\uffff\1\162\1\uffff\1\156\1\163\15\uffff\1\160\1\172\1\164\2\uffff\1\143\1\162\1\156\1\154\1\156\1\164\1\uffff\1\151\1\162\2\uffff\1\146\1\163\1\uffff\1\157\1\uffff\1\165\3\uffff\1\172\1\163\1\145\1\157\1\uffff\1\172\1\153\1\172\1\143\1\163\1\147\1\165\1\164\1\151\1\141\1\145\1\154\1\145\1\uffff\1\164\1\172\1\162\1\uffff\1\141\1\uffff\1\172\2\145\1\162\1\143\1\156\1\165\4\172\1\uffff\1\164\1\147\1\uffff\2\172\1\156\1\150\1\147\1\154\3\uffff\1\172\1\145\1\uffff\3\172\1\164\1\uffff\1\172\2\uffff\1\172\2\uffff";
    static final String DFA16_acceptS =
        "\14\uffff\1\16\1\uffff\1\20\1\21\3\uffff\1\26\1\uffff\1\31\1\32\4\uffff\2\45\2\uffff\1\50\1\51\2\uffff\1\55\1\56\1\27\1\1\1\2\1\35\1\46\1\3\1\uffff\1\50\2\uffff\1\6\1\10\1\43\1\7\1\11\1\12\1\44\1\13\1\53\1\54\1\14\1\15\1\16\3\uffff\1\20\1\21\6\uffff\1\26\2\uffff\1\31\1\32\2\uffff\1\41\1\uffff\1\45\1\uffff\1\51\1\52\1\55\4\uffff\1\36\15\uffff\1\4\3\uffff\1\42\1\uffff\1\23\13\uffff\1\33\2\uffff\1\25\6\uffff\1\37\1\47\1\5\2\uffff\1\24\4\uffff\1\17\1\uffff\1\40\1\30\1\uffff\1\22\1\34";
    static final String DFA16_specialS =
        "\1\0\40\uffff\1\2\1\1\161\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\31\1\41\3\44\1\12\1\42\1\16\1\17\1\10\1\6\1\23\1\7\1\1\1\11\12\40\1\2\1\14\1\33\1\3\1\34\2\44\32\37\3\44\1\36\1\37\1\44\1\37\1\32\1\5\1\27\1\30\1\21\2\37\1\15\6\37\1\20\1\37\1\22\1\24\1\35\1\37\1\4\4\37\1\25\1\13\1\26\uff82\44",
            "\1\45",
            "\1\47",
            "\1\51",
            "\1\53",
            "\1\56\15\uffff\1\55",
            "\1\57\21\uffff\1\60",
            "\1\62\17\uffff\1\63",
            "\1\64",
            "\1\67\4\uffff\1\70\15\uffff\1\66",
            "\1\71",
            "\1\72",
            "",
            "\1\75\6\uffff\1\74\1\76",
            "",
            "",
            "\1\101",
            "\1\104\15\uffff\1\102\5\uffff\1\103",
            "\1\105\3\uffff\1\106",
            "",
            "\1\111\2\uffff\1\110",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\51",
            "\1\117",
            "",
            "",
            "\1\121",
            "\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\0\123",
            "\0\123",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\125",
            "",
            "\1\126",
            "\1\127",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\130",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\132",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "",
            "",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "",
            "\1\146",
            "",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\154",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\1\170",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\172",
            "",
            "\1\173",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u0086",
            "\1\u0087",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u008e",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0091",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_TYPE | RULE_OP_SUM | RULE_OP_MULT | RULE_OP_REL | RULE_OP_UNARY | RULE_BOOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='.') ) {s = 1;}

                        else if ( (LA16_0==':') ) {s = 2;}

                        else if ( (LA16_0=='=') ) {s = 3;}

                        else if ( (LA16_0=='v') ) {s = 4;}

                        else if ( (LA16_0=='c') ) {s = 5;}

                        else if ( (LA16_0=='+') ) {s = 6;}

                        else if ( (LA16_0=='-') ) {s = 7;}

                        else if ( (LA16_0=='*') ) {s = 8;}

                        else if ( (LA16_0=='/') ) {s = 9;}

                        else if ( (LA16_0=='&') ) {s = 10;}

                        else if ( (LA16_0=='|') ) {s = 11;}

                        else if ( (LA16_0==';') ) {s = 12;}

                        else if ( (LA16_0=='i') ) {s = 13;}

                        else if ( (LA16_0=='(') ) {s = 14;}

                        else if ( (LA16_0==')') ) {s = 15;}

                        else if ( (LA16_0=='p') ) {s = 16;}

                        else if ( (LA16_0=='f') ) {s = 17;}

                        else if ( (LA16_0=='r') ) {s = 18;}

                        else if ( (LA16_0==',') ) {s = 19;}

                        else if ( (LA16_0=='s') ) {s = 20;}

                        else if ( (LA16_0=='{') ) {s = 21;}

                        else if ( (LA16_0=='}') ) {s = 22;}

                        else if ( (LA16_0=='d') ) {s = 23;}

                        else if ( (LA16_0=='e') ) {s = 24;}

                        else if ( (LA16_0=='!') ) {s = 25;}

                        else if ( (LA16_0=='b') ) {s = 26;}

                        else if ( (LA16_0=='<') ) {s = 27;}

                        else if ( (LA16_0=='>') ) {s = 28;}

                        else if ( (LA16_0=='t') ) {s = 29;}

                        else if ( (LA16_0=='^') ) {s = 30;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||LA16_0=='a'||(LA16_0>='g' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='o')||LA16_0=='q'||LA16_0=='u'||(LA16_0>='w' && LA16_0<='z')) ) {s = 31;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 32;}

                        else if ( (LA16_0=='\"') ) {s = 33;}

                        else if ( (LA16_0=='\'') ) {s = 34;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 35;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='%')||(LA16_0>='?' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_34 = input.LA(1);

                        s = -1;
                        if ( ((LA16_34>='\u0000' && LA16_34<='\uFFFF')) ) {s = 83;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_33 = input.LA(1);

                        s = -1;
                        if ( ((LA16_33>='\u0000' && LA16_33<='\uFFFF')) ) {s = 83;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}