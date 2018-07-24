package org.xtext.example.go.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.go.services.GoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BASIC_TYPES", "RULE_OP_REL", "RULE_OP_UNARY", "RULE_OP_SUM", "RULE_OP_MULT", "RULE_BOOL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'import'", "'('", "')'", "'.'", "'package'", "'for'", "':='", "'='", "'range'", "'func'", "','", "'...'", "'switch'", "'{'", "'case'", "'default'", "'}'", "':'", "'if'", "'else'", "'return'", "'type'", "'struct'", "'var'", "'const'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'!'", "'&&'", "'||'"
    };
    public static final int T__50=50;
    public static final int RULE_OP_SUM=9;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__51=51;
    public static final int RULE_OP_MULT=10;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_OP_REL=7;
    public static final int RULE_STRING=5;
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
    public static final int RULE_BOOL=11;
    public static final int RULE_OP_UNARY=8;
    public static final int T__48=48;
    public static final int RULE_BASIC_TYPES=6;
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


        public InternalGoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGo.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private GoGrammarAccess grammarAccess;

        public InternalGoParser(TokenStream input, GoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGo.g:70:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGo.g:70:46: (iv_ruleModel= ruleModel EOF )
            // InternalGo.g:71:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGo.g:77:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:83:2: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // InternalGo.g:84:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // InternalGo.g:84:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:85:3: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // InternalGo.g:85:3: (lv_greetings_0_0= ruleGreeting )
            	    // InternalGo.g:86:4: lv_greetings_0_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"greetings",
            	      					lv_greetings_0_0,
            	      					"org.xtext.example.go.Go.Greeting");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalGo.g:106:1: entryRuleGreeting returns [String current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final String entryRuleGreeting() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGreeting = null;


        try {
            // InternalGo.g:106:48: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalGo.g:107:2: iv_ruleGreeting= ruleGreeting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreetingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreeting.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalGo.g:113:1: ruleGreeting returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SourceFile_0= ruleSourceFile ;
    public final AntlrDatatypeRuleToken ruleGreeting() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SourceFile_0 = null;



        	enterRule();

        try {
            // InternalGo.g:119:2: (this_SourceFile_0= ruleSourceFile )
            // InternalGo.g:120:2: this_SourceFile_0= ruleSourceFile
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getGreetingAccess().getSourceFileParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_SourceFile_0=ruleSourceFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SourceFile_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleSourceFile"
    // InternalGo.g:133:1: entryRuleSourceFile returns [String current=null] : iv_ruleSourceFile= ruleSourceFile EOF ;
    public final String entryRuleSourceFile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSourceFile = null;


        try {
            // InternalGo.g:133:50: (iv_ruleSourceFile= ruleSourceFile EOF )
            // InternalGo.g:134:2: iv_ruleSourceFile= ruleSourceFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceFileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSourceFile=ruleSourceFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSourceFile.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSourceFile"


    // $ANTLR start "ruleSourceFile"
    // InternalGo.g:140:1: ruleSourceFile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Package_0= rulePackage (kw= ';' )? (this_ImportDecl_2= ruleImportDecl (kw= ';' )? )* (this_TopLevelDecl_4= ruleTopLevelDecl (kw= ';' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleSourceFile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Package_0 = null;

        AntlrDatatypeRuleToken this_ImportDecl_2 = null;

        AntlrDatatypeRuleToken this_TopLevelDecl_4 = null;



        	enterRule();

        try {
            // InternalGo.g:146:2: ( (this_Package_0= rulePackage (kw= ';' )? (this_ImportDecl_2= ruleImportDecl (kw= ';' )? )* (this_TopLevelDecl_4= ruleTopLevelDecl (kw= ';' )? )* ) )
            // InternalGo.g:147:2: (this_Package_0= rulePackage (kw= ';' )? (this_ImportDecl_2= ruleImportDecl (kw= ';' )? )* (this_TopLevelDecl_4= ruleTopLevelDecl (kw= ';' )? )* )
            {
            // InternalGo.g:147:2: (this_Package_0= rulePackage (kw= ';' )? (this_ImportDecl_2= ruleImportDecl (kw= ';' )? )* (this_TopLevelDecl_4= ruleTopLevelDecl (kw= ';' )? )* )
            // InternalGo.g:148:3: this_Package_0= rulePackage (kw= ';' )? (this_ImportDecl_2= ruleImportDecl (kw= ';' )? )* (this_TopLevelDecl_4= ruleTopLevelDecl (kw= ';' )? )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSourceFileAccess().getPackageParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_4);
            this_Package_0=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Package_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:158:3: (kw= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGo.g:159:4: kw= ';'
                    {
                    kw=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSourceFileAccess().getSemicolonKeyword_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:165:3: (this_ImportDecl_2= ruleImportDecl (kw= ';' )? )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGo.g:166:4: this_ImportDecl_2= ruleImportDecl (kw= ';' )?
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSourceFileAccess().getImportDeclParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_4);
            	    this_ImportDecl_2=ruleImportDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ImportDecl_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalGo.g:176:4: (kw= ';' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==17) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalGo.g:177:5: kw= ';'
            	            {
            	            kw=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getSourceFileAccess().getSemicolonKeyword_2_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalGo.g:184:3: (this_TopLevelDecl_4= ruleTopLevelDecl (kw= ';' )? )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==27||LA6_0==39||(LA6_0>=41 && LA6_0<=42)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGo.g:185:4: this_TopLevelDecl_4= ruleTopLevelDecl (kw= ';' )?
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSourceFileAccess().getTopLevelDeclParserRuleCall_3_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_6);
            	    this_TopLevelDecl_4=ruleTopLevelDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_TopLevelDecl_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalGo.g:195:4: (kw= ';' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==17) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalGo.g:196:5: kw= ';'
            	            {
            	            kw=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getSourceFileAccess().getSemicolonKeyword_3_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSourceFile"


    // $ANTLR start "entryRuleTopLevelDecl"
    // InternalGo.g:207:1: entryRuleTopLevelDecl returns [String current=null] : iv_ruleTopLevelDecl= ruleTopLevelDecl EOF ;
    public final String entryRuleTopLevelDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTopLevelDecl = null;


        try {
            // InternalGo.g:207:52: (iv_ruleTopLevelDecl= ruleTopLevelDecl EOF )
            // InternalGo.g:208:2: iv_ruleTopLevelDecl= ruleTopLevelDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopLevelDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTopLevelDecl=ruleTopLevelDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTopLevelDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTopLevelDecl"


    // $ANTLR start "ruleTopLevelDecl"
    // InternalGo.g:214:1: ruleTopLevelDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Decl_0= ruleDecl | this_FuncDecl_1= ruleFuncDecl | this_TypeDef_2= ruleTypeDef ) ;
    public final AntlrDatatypeRuleToken ruleTopLevelDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Decl_0 = null;

        AntlrDatatypeRuleToken this_FuncDecl_1 = null;

        AntlrDatatypeRuleToken this_TypeDef_2 = null;



        	enterRule();

        try {
            // InternalGo.g:220:2: ( (this_Decl_0= ruleDecl | this_FuncDecl_1= ruleFuncDecl | this_TypeDef_2= ruleTypeDef ) )
            // InternalGo.g:221:2: (this_Decl_0= ruleDecl | this_FuncDecl_1= ruleFuncDecl | this_TypeDef_2= ruleTypeDef )
            {
            // InternalGo.g:221:2: (this_Decl_0= ruleDecl | this_FuncDecl_1= ruleFuncDecl | this_TypeDef_2= ruleTypeDef )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 41:
            case 42:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 39:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGo.g:222:3: this_Decl_0= ruleDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclAccess().getDeclParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Decl_0=ruleDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Decl_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:233:3: this_FuncDecl_1= ruleFuncDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclAccess().getFuncDeclParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FuncDecl_1=ruleFuncDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FuncDecl_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:244:3: this_TypeDef_2= ruleTypeDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclAccess().getTypeDefParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeDef_2=ruleTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TypeDef_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTopLevelDecl"


    // $ANTLR start "entryRuleImportDecl"
    // InternalGo.g:258:1: entryRuleImportDecl returns [String current=null] : iv_ruleImportDecl= ruleImportDecl EOF ;
    public final String entryRuleImportDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportDecl = null;


        try {
            // InternalGo.g:258:50: (iv_ruleImportDecl= ruleImportDecl EOF )
            // InternalGo.g:259:2: iv_ruleImportDecl= ruleImportDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportDecl=ruleImportDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportDecl"


    // $ANTLR start "ruleImportDecl"
    // InternalGo.g:265:1: ruleImportDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleImportDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ImportSpec_1 = null;

        AntlrDatatypeRuleToken this_ImportSpec_3 = null;



        	enterRule();

        try {
            // InternalGo.g:271:2: ( (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) ) ) )
            // InternalGo.g:272:2: (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) ) )
            {
            // InternalGo.g:272:2: (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) ) )
            // InternalGo.g:273:3: kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) )
            {
            kw=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getImportDeclAccess().getImportKeyword_0());
              		
            }
            // InternalGo.g:278:3: (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGo.g:279:4: this_ImportSpec_1= ruleImportSpec
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getImportDeclAccess().getImportSpecParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ImportSpec_1=ruleImportSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ImportSpec_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:290:4: (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' )
                    {
                    // InternalGo.g:290:4: (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' )
                    // InternalGo.g:291:5: kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')'
                    {
                    kw=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getImportDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalGo.g:296:5: (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGo.g:297:6: this_ImportSpec_3= ruleImportSpec (kw= ';' )?
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getImportDeclAccess().getImportSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    this_ImportSpec_3=ruleImportSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_ImportSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    // InternalGo.g:307:6: (kw= ';' )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==17) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // InternalGo.g:308:7: kw= ';'
                    	            {
                    	            kw=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							current.merge(kw);
                    	              							newLeafNode(kw, grammarAccess.getImportDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	              						
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getImportDeclAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleImportDecl"


    // $ANTLR start "entryRuleImportSpec"
    // InternalGo.g:326:1: entryRuleImportSpec returns [String current=null] : iv_ruleImportSpec= ruleImportSpec EOF ;
    public final String entryRuleImportSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportSpec = null;


        try {
            // InternalGo.g:326:50: (iv_ruleImportSpec= ruleImportSpec EOF )
            // InternalGo.g:327:2: iv_ruleImportSpec= ruleImportSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportSpec=ruleImportSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportSpec.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportSpec"


    // $ANTLR start "ruleImportSpec"
    // InternalGo.g:333:1: ruleImportSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' | this_ID_1= RULE_ID )? this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleImportSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalGo.g:339:2: ( ( (kw= '.' | this_ID_1= RULE_ID )? this_STRING_2= RULE_STRING ) )
            // InternalGo.g:340:2: ( (kw= '.' | this_ID_1= RULE_ID )? this_STRING_2= RULE_STRING )
            {
            // InternalGo.g:340:2: ( (kw= '.' | this_ID_1= RULE_ID )? this_STRING_2= RULE_STRING )
            // InternalGo.g:341:3: (kw= '.' | this_ID_1= RULE_ID )? this_STRING_2= RULE_STRING
            {
            // InternalGo.g:341:3: (kw= '.' | this_ID_1= RULE_ID )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // InternalGo.g:342:4: kw= '.'
                    {
                    kw=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getImportSpecAccess().getFullStopKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:348:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_1, grammarAccess.getImportSpecAccess().getIDTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_STRING_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_STRING_2, grammarAccess.getImportSpecAccess().getSTRINGTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleImportSpec"


    // $ANTLR start "entryRulePackage"
    // InternalGo.g:367:1: entryRulePackage returns [String current=null] : iv_rulePackage= rulePackage EOF ;
    public final String entryRulePackage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage = null;


        try {
            // InternalGo.g:367:47: (iv_rulePackage= rulePackage EOF )
            // InternalGo.g:368:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalGo.g:374:1: rulePackage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken rulePackage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGo.g:380:2: ( (kw= 'package' this_ID_1= RULE_ID ) )
            // InternalGo.g:381:2: (kw= 'package' this_ID_1= RULE_ID )
            {
            // InternalGo.g:381:2: (kw= 'package' this_ID_1= RULE_ID )
            // InternalGo.g:382:3: kw= 'package' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getPackageAccess().getPackageKeyword_0());
              		
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_1, grammarAccess.getPackageAccess().getIDTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleForStmt"
    // InternalGo.g:398:1: entryRuleForStmt returns [String current=null] : iv_ruleForStmt= ruleForStmt EOF ;
    public final String entryRuleForStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForStmt = null;


        try {
            // InternalGo.g:398:47: (iv_ruleForStmt= ruleForStmt EOF )
            // InternalGo.g:399:2: iv_ruleForStmt= ruleForStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForStmt=ruleForStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForStmt"


    // $ANTLR start "ruleForStmt"
    // InternalGo.g:405:1: ruleForStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'for' ( (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? ) | this_ForClause_3= ruleForClause ) this_Block_4= ruleBlock ) ;
    public final AntlrDatatypeRuleToken ruleForStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_1 = null;

        AntlrDatatypeRuleToken this_RangeClause_2 = null;

        AntlrDatatypeRuleToken this_ForClause_3 = null;

        AntlrDatatypeRuleToken this_Block_4 = null;



        	enterRule();

        try {
            // InternalGo.g:411:2: ( (kw= 'for' ( (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? ) | this_ForClause_3= ruleForClause ) this_Block_4= ruleBlock ) )
            // InternalGo.g:412:2: (kw= 'for' ( (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? ) | this_ForClause_3= ruleForClause ) this_Block_4= ruleBlock )
            {
            // InternalGo.g:412:2: (kw= 'for' ( (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? ) | this_ForClause_3= ruleForClause ) this_Block_4= ruleBlock )
            // InternalGo.g:413:3: kw= 'for' ( (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? ) | this_ForClause_3= ruleForClause ) this_Block_4= ruleBlock
            {
            kw=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getForStmtAccess().getForKeyword_0());
              		
            }
            // InternalGo.g:418:3: ( (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? ) | this_ForClause_3= ruleForClause )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalGo.g:419:4: (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? )
                    {
                    // InternalGo.g:419:4: (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? )
                    // InternalGo.g:420:5: this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )?
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStmtAccess().getExpParserRuleCall_1_0_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    this_Exp_1=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Exp_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalGo.g:430:5: (this_RangeClause_2= ruleRangeClause )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=24 && LA12_0<=26)||LA12_0==28) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGo.g:431:6: this_RangeClause_2= ruleRangeClause
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getForStmtAccess().getRangeClauseParserRuleCall_1_0_1());
                              					
                            }
                            pushFollow(FOLLOW_14);
                            this_RangeClause_2=ruleRangeClause();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_RangeClause_2);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:444:4: this_ForClause_3= ruleForClause
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtAccess().getForClauseParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_ForClause_3=ruleForClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ForClause_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForStmtAccess().getBlockParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_Block_4=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Block_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleForStmt"


    // $ANTLR start "entryRuleForClause"
    // InternalGo.g:469:1: entryRuleForClause returns [String current=null] : iv_ruleForClause= ruleForClause EOF ;
    public final String entryRuleForClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForClause = null;


        try {
            // InternalGo.g:469:49: (iv_ruleForClause= ruleForClause EOF )
            // InternalGo.g:470:2: iv_ruleForClause= ruleForClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForClause=ruleForClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForClause.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForClause"


    // $ANTLR start "ruleForClause"
    // InternalGo.g:476:1: ruleForClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Decl_0= ruleDecl )? kw= ';' (this_Exp_2= ruleExp )? kw= ';' (this_SimpleStmt_4= ruleSimpleStmt )? ) ;
    public final AntlrDatatypeRuleToken ruleForClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Decl_0 = null;

        AntlrDatatypeRuleToken this_Exp_2 = null;

        AntlrDatatypeRuleToken this_SimpleStmt_4 = null;



        	enterRule();

        try {
            // InternalGo.g:482:2: ( ( (this_Decl_0= ruleDecl )? kw= ';' (this_Exp_2= ruleExp )? kw= ';' (this_SimpleStmt_4= ruleSimpleStmt )? ) )
            // InternalGo.g:483:2: ( (this_Decl_0= ruleDecl )? kw= ';' (this_Exp_2= ruleExp )? kw= ';' (this_SimpleStmt_4= ruleSimpleStmt )? )
            {
            // InternalGo.g:483:2: ( (this_Decl_0= ruleDecl )? kw= ';' (this_Exp_2= ruleExp )? kw= ';' (this_SimpleStmt_4= ruleSimpleStmt )? )
            // InternalGo.g:484:3: (this_Decl_0= ruleDecl )? kw= ';' (this_Exp_2= ruleExp )? kw= ';' (this_SimpleStmt_4= ruleSimpleStmt )?
            {
            // InternalGo.g:484:3: (this_Decl_0= ruleDecl )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||(LA14_0>=41 && LA14_0<=42)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGo.g:485:4: this_Decl_0= ruleDecl
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForClauseAccess().getDeclParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_Decl_0=ruleDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Decl_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,17,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getForClauseAccess().getSemicolonKeyword_1());
              		
            }
            // InternalGo.g:501:3: (this_Exp_2= ruleExp )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||LA15_0==RULE_OP_SUM||(LA15_0>=RULE_BOOL && LA15_0<=RULE_INT)||LA15_0==19||LA15_0==49) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGo.g:502:4: this_Exp_2= ruleExp
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForClauseAccess().getExpParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_Exp_2=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Exp_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,17,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getForClauseAccess().getSemicolonKeyword_3());
              		
            }
            // InternalGo.g:518:3: (this_SimpleStmt_4= ruleSimpleStmt )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==RULE_OP_SUM||(LA16_0>=RULE_BOOL && LA16_0<=RULE_INT)||LA16_0==19||(LA16_0>=41 && LA16_0<=42)||LA16_0==49) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGo.g:519:4: this_SimpleStmt_4= ruleSimpleStmt
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForClauseAccess().getSimpleStmtParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_SimpleStmt_4=ruleSimpleStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SimpleStmt_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleForClause"


    // $ANTLR start "entryRuleRangeClause"
    // InternalGo.g:534:1: entryRuleRangeClause returns [String current=null] : iv_ruleRangeClause= ruleRangeClause EOF ;
    public final String entryRuleRangeClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRangeClause = null;


        try {
            // InternalGo.g:534:51: (iv_ruleRangeClause= ruleRangeClause EOF )
            // InternalGo.g:535:2: iv_ruleRangeClause= ruleRangeClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRangeClause=ruleRangeClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRangeClause.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRangeClause"


    // $ANTLR start "ruleRangeClause"
    // InternalGo.g:541:1: ruleRangeClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )? kw= 'range' this_Exp_4= ruleExp ) ;
    public final AntlrDatatypeRuleToken ruleRangeClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpList_0 = null;

        AntlrDatatypeRuleToken this_Exp_4 = null;



        	enterRule();

        try {
            // InternalGo.g:547:2: ( ( (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )? kw= 'range' this_Exp_4= ruleExp ) )
            // InternalGo.g:548:2: ( (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )? kw= 'range' this_Exp_4= ruleExp )
            {
            // InternalGo.g:548:2: ( (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )? kw= 'range' this_Exp_4= ruleExp )
            // InternalGo.g:549:3: (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )? kw= 'range' this_Exp_4= ruleExp
            {
            // InternalGo.g:549:3: (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==EOF||(LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||LA18_0==RULE_OP_SUM||(LA18_0>=RULE_BOOL && LA18_0<=RULE_INT)||LA18_0==17||(LA18_0>=19 && LA18_0<=20)||(LA18_0>=22 && LA18_0<=25)||(LA18_0>=27 && LA18_0<=28)||(LA18_0>=30 && LA18_0<=36)||(LA18_0>=38 && LA18_0<=39)||(LA18_0>=41 && LA18_0<=42)||LA18_0==49) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGo.g:550:4: this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRangeClauseAccess().getExpListParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_ExpList_0=ruleExpList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExpList_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:560:4: (kw= ':=' | kw= '=' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==24) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==25) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalGo.g:561:5: kw= ':='
                            {
                            kw=(Token)match(input,24,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRangeClauseAccess().getColonEqualsSignKeyword_0_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:567:5: kw= '='
                            {
                            kw=(Token)match(input,25,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRangeClauseAccess().getEqualsSignKeyword_0_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,26,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRangeClauseAccess().getRangeKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRangeClauseAccess().getExpParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_Exp_4=ruleExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Exp_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRangeClause"


    // $ANTLR start "entryRuleFuncDecl"
    // InternalGo.g:593:1: entryRuleFuncDecl returns [String current=null] : iv_ruleFuncDecl= ruleFuncDecl EOF ;
    public final String entryRuleFuncDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFuncDecl = null;


        try {
            // InternalGo.g:593:48: (iv_ruleFuncDecl= ruleFuncDecl EOF )
            // InternalGo.g:594:2: iv_ruleFuncDecl= ruleFuncDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFuncDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFuncDecl=ruleFuncDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFuncDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFuncDecl"


    // $ANTLR start "ruleFuncDecl"
    // InternalGo.g:600:1: ruleFuncDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'func' (this_Receiver_1= ruleReceiver )? this_ID_2= RULE_ID this_Signature_3= ruleSignature (this_Block_4= ruleBlock )? ) ;
    public final AntlrDatatypeRuleToken ruleFuncDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_Receiver_1 = null;

        AntlrDatatypeRuleToken this_Signature_3 = null;

        AntlrDatatypeRuleToken this_Block_4 = null;



        	enterRule();

        try {
            // InternalGo.g:606:2: ( (kw= 'func' (this_Receiver_1= ruleReceiver )? this_ID_2= RULE_ID this_Signature_3= ruleSignature (this_Block_4= ruleBlock )? ) )
            // InternalGo.g:607:2: (kw= 'func' (this_Receiver_1= ruleReceiver )? this_ID_2= RULE_ID this_Signature_3= ruleSignature (this_Block_4= ruleBlock )? )
            {
            // InternalGo.g:607:2: (kw= 'func' (this_Receiver_1= ruleReceiver )? this_ID_2= RULE_ID this_Signature_3= ruleSignature (this_Block_4= ruleBlock )? )
            // InternalGo.g:608:3: kw= 'func' (this_Receiver_1= ruleReceiver )? this_ID_2= RULE_ID this_Signature_3= ruleSignature (this_Block_4= ruleBlock )?
            {
            kw=(Token)match(input,27,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFuncDeclAccess().getFuncKeyword_0());
              		
            }
            // InternalGo.g:613:3: (this_Receiver_1= ruleReceiver )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGo.g:614:4: this_Receiver_1= ruleReceiver
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFuncDeclAccess().getReceiverParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_12);
                    this_Receiver_1=ruleReceiver();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Receiver_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getFuncDeclAccess().getIDTerminalRuleCall_2());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFuncDeclAccess().getSignatureParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_23);
            this_Signature_3=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Signature_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:642:3: (this_Block_4= ruleBlock )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGo.g:643:4: this_Block_4= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFuncDeclAccess().getBlockParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Block_4=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Block_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFuncDecl"


    // $ANTLR start "entryRuleReceiver"
    // InternalGo.g:658:1: entryRuleReceiver returns [String current=null] : iv_ruleReceiver= ruleReceiver EOF ;
    public final String entryRuleReceiver() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReceiver = null;


        try {
            // InternalGo.g:658:48: (iv_ruleReceiver= ruleReceiver EOF )
            // InternalGo.g:659:2: iv_ruleReceiver= ruleReceiver EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReceiverRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReceiver=ruleReceiver();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReceiver.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReceiver"


    // $ANTLR start "ruleReceiver"
    // InternalGo.g:665:1: ruleReceiver returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Parameters_0= ruleParameters ;
    public final AntlrDatatypeRuleToken ruleReceiver() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;



        	enterRule();

        try {
            // InternalGo.g:671:2: (this_Parameters_0= ruleParameters )
            // InternalGo.g:672:2: this_Parameters_0= ruleParameters
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getReceiverAccess().getParametersParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Parameters_0=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Parameters_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReceiver"


    // $ANTLR start "entryRuleSignature"
    // InternalGo.g:685:1: entryRuleSignature returns [String current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final String entryRuleSignature() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignature = null;


        try {
            // InternalGo.g:685:49: (iv_ruleSignature= ruleSignature EOF )
            // InternalGo.g:686:2: iv_ruleSignature= ruleSignature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignature.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalGo.g:692:1: ruleSignature returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Parameters_0= ruleParameters (this_Result_1= ruleResult )? ) ;
    public final AntlrDatatypeRuleToken ruleSignature() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;

        AntlrDatatypeRuleToken this_Result_1 = null;



        	enterRule();

        try {
            // InternalGo.g:698:2: ( (this_Parameters_0= ruleParameters (this_Result_1= ruleResult )? ) )
            // InternalGo.g:699:2: (this_Parameters_0= ruleParameters (this_Result_1= ruleResult )? )
            {
            // InternalGo.g:699:2: (this_Parameters_0= ruleParameters (this_Result_1= ruleResult )? )
            // InternalGo.g:700:3: this_Parameters_0= ruleParameters (this_Result_1= ruleResult )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSignatureAccess().getParametersParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_Parameters_0=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Parameters_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:710:3: (this_Result_1= ruleResult )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_BASIC_TYPES||LA21_0==19) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:711:4: this_Result_1= ruleResult
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSignatureAccess().getResultParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Result_1=ruleResult();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Result_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleResult"
    // InternalGo.g:726:1: entryRuleResult returns [String current=null] : iv_ruleResult= ruleResult EOF ;
    public final String entryRuleResult() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResult = null;


        try {
            // InternalGo.g:726:46: (iv_ruleResult= ruleResult EOF )
            // InternalGo.g:727:2: iv_ruleResult= ruleResult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleResult=ruleResult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResult.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalGo.g:733:1: ruleResult returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Parameters_0= ruleParameters | this_BASIC_TYPES_1= RULE_BASIC_TYPES ) ;
    public final AntlrDatatypeRuleToken ruleResult() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BASIC_TYPES_1=null;
        AntlrDatatypeRuleToken this_Parameters_0 = null;



        	enterRule();

        try {
            // InternalGo.g:739:2: ( (this_Parameters_0= ruleParameters | this_BASIC_TYPES_1= RULE_BASIC_TYPES ) )
            // InternalGo.g:740:2: (this_Parameters_0= ruleParameters | this_BASIC_TYPES_1= RULE_BASIC_TYPES )
            {
            // InternalGo.g:740:2: (this_Parameters_0= ruleParameters | this_BASIC_TYPES_1= RULE_BASIC_TYPES )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_BASIC_TYPES) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalGo.g:741:3: this_Parameters_0= ruleParameters
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getResultAccess().getParametersParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Parameters_0=ruleParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Parameters_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:752:3: this_BASIC_TYPES_1= RULE_BASIC_TYPES
                    {
                    this_BASIC_TYPES_1=(Token)match(input,RULE_BASIC_TYPES,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BASIC_TYPES_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_BASIC_TYPES_1, grammarAccess.getResultAccess().getBASIC_TYPESTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleParameters"
    // InternalGo.g:763:1: entryRuleParameters returns [String current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final String entryRuleParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameters = null;


        try {
            // InternalGo.g:763:50: (iv_ruleParameters= ruleParameters EOF )
            // InternalGo.g:764:2: iv_ruleParameters= ruleParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameters.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalGo.g:770:1: ruleParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterList_1 = null;



        	enterRule();

        try {
            // InternalGo.g:776:2: ( (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' ) )
            // InternalGo.g:777:2: (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' )
            {
            // InternalGo.g:777:2: (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' )
            // InternalGo.g:778:3: kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')'
            {
            kw=(Token)match(input,19,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getParametersAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGo.g:783:3: (this_ParameterList_1= ruleParameterList (kw= ',' )? )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||LA24_0==RULE_BASIC_TYPES||LA24_0==29||LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGo.g:784:4: this_ParameterList_1= ruleParameterList (kw= ',' )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParametersAccess().getParameterListParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_ParameterList_1=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ParameterList_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:794:4: (kw= ',' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==28) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalGo.g:795:5: kw= ','
                            {
                            kw=(Token)match(input,28,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getParametersAccess().getCommaKeyword_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getParametersAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleParameterList"
    // InternalGo.g:811:1: entryRuleParameterList returns [String current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final String entryRuleParameterList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterList = null;


        try {
            // InternalGo.g:811:53: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalGo.g:812:2: iv_ruleParameterList= ruleParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalGo.g:818:1: ruleParameterList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* ) ;
    public final AntlrDatatypeRuleToken ruleParameterList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDecl_0 = null;

        AntlrDatatypeRuleToken this_ParameterDecl_2 = null;



        	enterRule();

        try {
            // InternalGo.g:824:2: ( (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* ) )
            // InternalGo.g:825:2: (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* )
            {
            // InternalGo.g:825:2: (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* )
            // InternalGo.g:826:3: this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameterListAccess().getParameterDeclParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_ParameterDecl_0=ruleParameterDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ParameterDecl_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:836:3: (kw= ',' this_ParameterDecl_2= ruleParameterDecl )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==28) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_ID||LA25_1==RULE_BASIC_TYPES||LA25_1==29||LA25_1==40) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalGo.g:837:4: kw= ',' this_ParameterDecl_2= ruleParameterDecl
            	    {
            	    kw=(Token)match(input,28,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getParameterListAccess().getParameterDeclParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_28);
            	    this_ParameterDecl_2=ruleParameterDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ParameterDecl_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameterDecl"
    // InternalGo.g:857:1: entryRuleParameterDecl returns [String current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final String entryRuleParameterDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDecl = null;


        try {
            // InternalGo.g:857:53: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // InternalGo.g:858:2: iv_ruleParameterDecl= ruleParameterDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterDecl=ruleParameterDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameterDecl"


    // $ANTLR start "ruleParameterDecl"
    // InternalGo.g:864:1: ruleParameterDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID this_IdList_1= ruleIdList )? (kw= '...' )? this_TypeName_3= ruleTypeName ) ;
    public final AntlrDatatypeRuleToken ruleParameterDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_IdList_1 = null;

        AntlrDatatypeRuleToken this_TypeName_3 = null;



        	enterRule();

        try {
            // InternalGo.g:870:2: ( ( (this_ID_0= RULE_ID this_IdList_1= ruleIdList )? (kw= '...' )? this_TypeName_3= ruleTypeName ) )
            // InternalGo.g:871:2: ( (this_ID_0= RULE_ID this_IdList_1= ruleIdList )? (kw= '...' )? this_TypeName_3= ruleTypeName )
            {
            // InternalGo.g:871:2: ( (this_ID_0= RULE_ID this_IdList_1= ruleIdList )? (kw= '...' )? this_TypeName_3= ruleTypeName )
            // InternalGo.g:872:3: (this_ID_0= RULE_ID this_IdList_1= ruleIdList )? (kw= '...' )? this_TypeName_3= ruleTypeName
            {
            // InternalGo.g:872:3: (this_ID_0= RULE_ID this_IdList_1= ruleIdList )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==28) ) {
                    int LA26_3 = input.LA(3);

                    if ( (LA26_3==RULE_ID) ) {
                        int LA26_5 = input.LA(4);

                        if ( (synpred28_InternalGo()) ) {
                            alt26=1;
                        }
                    }
                }
                else if ( (LA26_1==RULE_ID||LA26_1==RULE_BASIC_TYPES||LA26_1==29||LA26_1==40) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalGo.g:873:4: this_ID_0= RULE_ID this_IdList_1= ruleIdList
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_0, grammarAccess.getParameterDeclAccess().getIDTerminalRuleCall_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParameterDeclAccess().getIdListParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_29);
                    this_IdList_1=ruleIdList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IdList_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:891:3: (kw= '...' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGo.g:892:4: kw= '...'
                    {
                    kw=(Token)match(input,29,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getParameterDeclAccess().getFullStopFullStopFullStopKeyword_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameterDeclAccess().getTypeNameParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_TypeName_3=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TypeName_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameterDecl"


    // $ANTLR start "entryRuleSwitchStmt"
    // InternalGo.g:912:1: entryRuleSwitchStmt returns [String current=null] : iv_ruleSwitchStmt= ruleSwitchStmt EOF ;
    public final String entryRuleSwitchStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSwitchStmt = null;


        try {
            // InternalGo.g:912:50: (iv_ruleSwitchStmt= ruleSwitchStmt EOF )
            // InternalGo.g:913:2: iv_ruleSwitchStmt= ruleSwitchStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchStmt=ruleSwitchStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitchStmt"


    // $ANTLR start "ruleSwitchStmt"
    // InternalGo.g:919:1: ruleSwitchStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'switch' this_Anderson_1= ruleAnderson (this_ID_2= RULE_ID )? kw= '{' ( (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )* (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )? ) kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleSwitchStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_Anderson_1 = null;

        AntlrDatatypeRuleToken this_Exp_5 = null;

        AntlrDatatypeRuleToken this_SwitchCase_6 = null;

        AntlrDatatypeRuleToken this_SwitchCase_8 = null;



        	enterRule();

        try {
            // InternalGo.g:925:2: ( (kw= 'switch' this_Anderson_1= ruleAnderson (this_ID_2= RULE_ID )? kw= '{' ( (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )* (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )? ) kw= '}' ) )
            // InternalGo.g:926:2: (kw= 'switch' this_Anderson_1= ruleAnderson (this_ID_2= RULE_ID )? kw= '{' ( (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )* (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )? ) kw= '}' )
            {
            // InternalGo.g:926:2: (kw= 'switch' this_Anderson_1= ruleAnderson (this_ID_2= RULE_ID )? kw= '{' ( (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )* (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )? ) kw= '}' )
            // InternalGo.g:927:3: kw= 'switch' this_Anderson_1= ruleAnderson (this_ID_2= RULE_ID )? kw= '{' ( (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )* (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )? ) kw= '}'
            {
            kw=(Token)match(input,30,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSwitchStmtAccess().getSwitchKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSwitchStmtAccess().getAndersonParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_32);
            this_Anderson_1=ruleAnderson();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Anderson_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:942:3: (this_ID_2= RULE_ID )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGo.g:943:4: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getSwitchStmtAccess().getIDTerminalRuleCall_2());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSwitchStmtAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalGo.g:956:3: ( (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )* (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )? )
            // InternalGo.g:957:4: (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )* (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )?
            {
            // InternalGo.g:957:4: (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==32) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGo.g:958:5: kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase
            	    {
            	    kw=(Token)match(input,32,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getSwitchStmtAccess().getCaseKeyword_4_0_0());
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchStmtAccess().getExpParserRuleCall_4_0_1());
            	      				
            	    }
            	    pushFollow(FOLLOW_35);
            	    this_Exp_5=ruleExp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(this_Exp_5);
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					afterParserOrEnumRuleCall();
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchStmtAccess().getSwitchCaseParserRuleCall_4_0_2());
            	      				
            	    }
            	    pushFollow(FOLLOW_34);
            	    this_SwitchCase_6=ruleSwitchCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(this_SwitchCase_6);
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalGo.g:984:4: (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGo.g:985:5: kw= 'default' (this_SwitchCase_8= ruleSwitchCase )*
                    {
                    kw=(Token)match(input,33,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getSwitchStmtAccess().getDefaultKeyword_4_1_0());
                      				
                    }
                    // InternalGo.g:990:5: (this_SwitchCase_8= ruleSwitchCase )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==35) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalGo.g:991:6: this_SwitchCase_8= ruleSwitchCase
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSwitchStmtAccess().getSwitchCaseParserRuleCall_4_1_1());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    this_SwitchCase_8=ruleSwitchCase();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_SwitchCase_8);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSwitchStmtAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSwitchStmt"


    // $ANTLR start "entryRuleSwitchCase"
    // InternalGo.g:1013:1: entryRuleSwitchCase returns [String current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final String entryRuleSwitchCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSwitchCase = null;


        try {
            // InternalGo.g:1013:50: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // InternalGo.g:1014:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchCase.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitchCase"


    // $ANTLR start "ruleSwitchCase"
    // InternalGo.g:1020:1: ruleSwitchCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' (this_Statement_1= ruleStatement (kw= ';' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleSwitchCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Statement_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1026:2: ( (kw= ':' (this_Statement_1= ruleStatement (kw= ';' )? )* ) )
            // InternalGo.g:1027:2: (kw= ':' (this_Statement_1= ruleStatement (kw= ';' )? )* )
            {
            // InternalGo.g:1027:2: (kw= ':' (this_Statement_1= ruleStatement (kw= ';' )? )* )
            // InternalGo.g:1028:3: kw= ':' (this_Statement_1= ruleStatement (kw= ';' )? )*
            {
            kw=(Token)match(input,35,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSwitchCaseAccess().getColonKeyword_0());
              		
            }
            // InternalGo.g:1033:3: (this_Statement_1= ruleStatement (kw= ';' )? )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_STRING)||LA33_0==RULE_OP_SUM||(LA33_0>=RULE_BOOL && LA33_0<=RULE_INT)||LA33_0==19||LA33_0==23||LA33_0==30||LA33_0==36||LA33_0==38||(LA33_0>=41 && LA33_0<=42)||LA33_0==49) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGo.g:1034:4: this_Statement_1= ruleStatement (kw= ';' )?
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSwitchCaseAccess().getStatementParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_38);
            	    this_Statement_1=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Statement_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalGo.g:1044:4: (kw= ';' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==17) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalGo.g:1045:5: kw= ';'
            	            {
            	            kw=(Token)match(input,17,FOLLOW_37); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getSwitchCaseAccess().getSemicolonKeyword_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSwitchCase"


    // $ANTLR start "entryRuleIfStmt"
    // InternalGo.g:1056:1: entryRuleIfStmt returns [String current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final String entryRuleIfStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIfStmt = null;


        try {
            // InternalGo.g:1056:46: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalGo.g:1057:2: iv_ruleIfStmt= ruleIfStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStmt=ruleIfStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // InternalGo.g:1063:1: ruleIfStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'if' this_Anderson_1= ruleAnderson this_Exp_2= ruleExp this_Block_3= ruleBlock (kw= 'else' (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )? ) ;
    public final AntlrDatatypeRuleToken ruleIfStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Anderson_1 = null;

        AntlrDatatypeRuleToken this_Exp_2 = null;

        AntlrDatatypeRuleToken this_Block_3 = null;

        AntlrDatatypeRuleToken this_IfStmt_5 = null;

        AntlrDatatypeRuleToken this_Block_6 = null;



        	enterRule();

        try {
            // InternalGo.g:1069:2: ( (kw= 'if' this_Anderson_1= ruleAnderson this_Exp_2= ruleExp this_Block_3= ruleBlock (kw= 'else' (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )? ) )
            // InternalGo.g:1070:2: (kw= 'if' this_Anderson_1= ruleAnderson this_Exp_2= ruleExp this_Block_3= ruleBlock (kw= 'else' (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )? )
            {
            // InternalGo.g:1070:2: (kw= 'if' this_Anderson_1= ruleAnderson this_Exp_2= ruleExp this_Block_3= ruleBlock (kw= 'else' (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )? )
            // InternalGo.g:1071:3: kw= 'if' this_Anderson_1= ruleAnderson this_Exp_2= ruleExp this_Block_3= ruleBlock (kw= 'else' (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )?
            {
            kw=(Token)match(input,36,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getIfStmtAccess().getIfKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfStmtAccess().getAndersonParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_20);
            this_Anderson_1=ruleAnderson();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Anderson_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfStmtAccess().getExpParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_14);
            this_Exp_2=ruleExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Exp_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfStmtAccess().getBlockParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_40);
            this_Block_3=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Block_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1106:3: (kw= 'else' (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGo.g:1107:4: kw= 'else' (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock )
                    {
                    kw=(Token)match(input,37,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIfStmtAccess().getElseKeyword_4_0());
                      			
                    }
                    // InternalGo.g:1112:4: (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==36) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==31) ) {
                        alt34=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalGo.g:1113:5: this_IfStmt_5= ruleIfStmt
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getIfStmtAccess().getIfStmtParserRuleCall_4_1_0());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_IfStmt_5=ruleIfStmt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_IfStmt_5);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:1124:5: this_Block_6= ruleBlock
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getIfStmtAccess().getBlockParserRuleCall_4_1_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_Block_6=ruleBlock();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_Block_6);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleAnderson"
    // InternalGo.g:1140:1: entryRuleAnderson returns [String current=null] : iv_ruleAnderson= ruleAnderson EOF ;
    public final String entryRuleAnderson() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnderson = null;


        try {
            // InternalGo.g:1140:48: (iv_ruleAnderson= ruleAnderson EOF )
            // InternalGo.g:1141:2: iv_ruleAnderson= ruleAnderson EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndersonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnderson=ruleAnderson();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnderson.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnderson"


    // $ANTLR start "ruleAnderson"
    // InternalGo.g:1147:1: ruleAnderson returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp ) kw= ';' )? ;
    public final AntlrDatatypeRuleToken ruleAnderson() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Decl_0 = null;

        AntlrDatatypeRuleToken this_Assig_1 = null;

        AntlrDatatypeRuleToken this_Exp_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1153:2: ( ( (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp ) kw= ';' )? )
            // InternalGo.g:1154:2: ( (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp ) kw= ';' )?
            {
            // InternalGo.g:1154:2: ( (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp ) kw= ';' )?
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalGo.g:1155:3: (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp ) kw= ';'
                    {
                    // InternalGo.g:1155:3: (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp )
                    int alt36=3;
                    alt36 = dfa36.predict(input);
                    switch (alt36) {
                        case 1 :
                            // InternalGo.g:1156:4: this_Decl_0= ruleDecl
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getAndersonAccess().getDeclParserRuleCall_0_0());
                              			
                            }
                            pushFollow(FOLLOW_15);
                            this_Decl_0=ruleDecl();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(this_Decl_0);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:1167:4: this_Assig_1= ruleAssig
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getAndersonAccess().getAssigParserRuleCall_0_1());
                              			
                            }
                            pushFollow(FOLLOW_15);
                            this_Assig_1=ruleAssig();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(this_Assig_1);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 3 :
                            // InternalGo.g:1178:4: this_Exp_2= ruleExp
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getAndersonAccess().getExpParserRuleCall_0_2());
                              			
                            }
                            pushFollow(FOLLOW_15);
                            this_Exp_2=ruleExp();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(this_Exp_2);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAndersonAccess().getSemicolonKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAnderson"


    // $ANTLR start "entryRuleBlock"
    // InternalGo.g:1198:1: entryRuleBlock returns [String current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final String entryRuleBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlock = null;


        try {
            // InternalGo.g:1198:45: (iv_ruleBlock= ruleBlock EOF )
            // InternalGo.g:1199:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalGo.g:1205:1: ruleBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' (this_Statement_1= ruleStatement (kw= ';' )? )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Statement_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1211:2: ( (kw= '{' (this_Statement_1= ruleStatement (kw= ';' )? )* kw= '}' ) )
            // InternalGo.g:1212:2: (kw= '{' (this_Statement_1= ruleStatement (kw= ';' )? )* kw= '}' )
            {
            // InternalGo.g:1212:2: (kw= '{' (this_Statement_1= ruleStatement (kw= ';' )? )* kw= '}' )
            // InternalGo.g:1213:3: kw= '{' (this_Statement_1= ruleStatement (kw= ';' )? )* kw= '}'
            {
            kw=(Token)match(input,31,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalGo.g:1218:3: (this_Statement_1= ruleStatement (kw= ';' )? )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_STRING)||LA39_0==RULE_OP_SUM||(LA39_0>=RULE_BOOL && LA39_0<=RULE_INT)||LA39_0==19||LA39_0==23||LA39_0==30||LA39_0==36||LA39_0==38||(LA39_0>=41 && LA39_0<=42)||LA39_0==49) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGo.g:1219:4: this_Statement_1= ruleStatement (kw= ';' )?
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getBlockAccess().getStatementParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_43);
            	    this_Statement_1=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Statement_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalGo.g:1229:4: (kw= ';' )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==17) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalGo.g:1230:5: kw= ';'
            	            {
            	            kw=(Token)match(input,17,FOLLOW_42); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getBlockAccess().getSemicolonKeyword_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStatement"
    // InternalGo.g:1246:1: entryRuleStatement returns [String current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final String entryRuleStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement = null;


        try {
            // InternalGo.g:1246:49: (iv_ruleStatement= ruleStatement EOF )
            // InternalGo.g:1247:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalGo.g:1253:1: ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleStmt_0= ruleSimpleStmt | this_IfStmt_1= ruleIfStmt | this_SwitchStmt_2= ruleSwitchStmt | this_ReturnStmt_3= ruleReturnStmt | this_ForStmt_4= ruleForStmt ) ;
    public final AntlrDatatypeRuleToken ruleStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SimpleStmt_0 = null;

        AntlrDatatypeRuleToken this_IfStmt_1 = null;

        AntlrDatatypeRuleToken this_SwitchStmt_2 = null;

        AntlrDatatypeRuleToken this_ReturnStmt_3 = null;

        AntlrDatatypeRuleToken this_ForStmt_4 = null;



        	enterRule();

        try {
            // InternalGo.g:1259:2: ( (this_SimpleStmt_0= ruleSimpleStmt | this_IfStmt_1= ruleIfStmt | this_SwitchStmt_2= ruleSwitchStmt | this_ReturnStmt_3= ruleReturnStmt | this_ForStmt_4= ruleForStmt ) )
            // InternalGo.g:1260:2: (this_SimpleStmt_0= ruleSimpleStmt | this_IfStmt_1= ruleIfStmt | this_SwitchStmt_2= ruleSwitchStmt | this_ReturnStmt_3= ruleReturnStmt | this_ForStmt_4= ruleForStmt )
            {
            // InternalGo.g:1260:2: (this_SimpleStmt_0= ruleSimpleStmt | this_IfStmt_1= ruleIfStmt | this_SwitchStmt_2= ruleSwitchStmt | this_ReturnStmt_3= ruleReturnStmt | this_ForStmt_4= ruleForStmt )
            int alt40=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_OP_SUM:
            case RULE_BOOL:
            case RULE_INT:
            case 19:
            case 41:
            case 42:
            case 49:
                {
                alt40=1;
                }
                break;
            case 36:
                {
                alt40=2;
                }
                break;
            case 30:
                {
                alt40=3;
                }
                break;
            case 38:
                {
                alt40=4;
                }
                break;
            case 23:
                {
                alt40=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalGo.g:1261:3: this_SimpleStmt_0= ruleSimpleStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSimpleStmtParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SimpleStmt_0=ruleSimpleStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SimpleStmt_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1272:3: this_IfStmt_1= ruleIfStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfStmtParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStmt_1=ruleIfStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IfStmt_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:1283:3: this_SwitchStmt_2= ruleSwitchStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSwitchStmtParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SwitchStmt_2=ruleSwitchStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SwitchStmt_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:1294:3: this_ReturnStmt_3= ruleReturnStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getReturnStmtParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReturnStmt_3=ruleReturnStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ReturnStmt_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:1305:3: this_ForStmt_4= ruleForStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getForStmtParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForStmt_4=ruleForStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ForStmt_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleReturnStmt"
    // InternalGo.g:1319:1: entryRuleReturnStmt returns [String current=null] : iv_ruleReturnStmt= ruleReturnStmt EOF ;
    public final String entryRuleReturnStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReturnStmt = null;


        try {
            // InternalGo.g:1319:50: (iv_ruleReturnStmt= ruleReturnStmt EOF )
            // InternalGo.g:1320:2: iv_ruleReturnStmt= ruleReturnStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnStmt=ruleReturnStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReturnStmt"


    // $ANTLR start "ruleReturnStmt"
    // InternalGo.g:1326:1: ruleReturnStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'return' (this_Exp_1= ruleExp )? ) ;
    public final AntlrDatatypeRuleToken ruleReturnStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1332:2: ( (kw= 'return' (this_Exp_1= ruleExp )? ) )
            // InternalGo.g:1333:2: (kw= 'return' (this_Exp_1= ruleExp )? )
            {
            // InternalGo.g:1333:2: (kw= 'return' (this_Exp_1= ruleExp )? )
            // InternalGo.g:1334:3: kw= 'return' (this_Exp_1= ruleExp )?
            {
            kw=(Token)match(input,38,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getReturnStmtAccess().getReturnKeyword_0());
              		
            }
            // InternalGo.g:1339:3: (this_Exp_1= ruleExp )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalGo.g:1340:4: this_Exp_1= ruleExp
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getReturnStmtAccess().getExpParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Exp_1=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Exp_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReturnStmt"


    // $ANTLR start "entryRuleTypeDef"
    // InternalGo.g:1355:1: entryRuleTypeDef returns [String current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final String entryRuleTypeDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeDef = null;


        try {
            // InternalGo.g:1355:47: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalGo.g:1356:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalGo.g:1362:1: ruleTypeDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'type' this_ID_1= RULE_ID (this_BASIC_TYPES_2= RULE_BASIC_TYPES | this_ID_3= RULE_ID | this_Struct_4= ruleStruct ) ) ;
    public final AntlrDatatypeRuleToken ruleTypeDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_BASIC_TYPES_2=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_Struct_4 = null;



        	enterRule();

        try {
            // InternalGo.g:1368:2: ( (kw= 'type' this_ID_1= RULE_ID (this_BASIC_TYPES_2= RULE_BASIC_TYPES | this_ID_3= RULE_ID | this_Struct_4= ruleStruct ) ) )
            // InternalGo.g:1369:2: (kw= 'type' this_ID_1= RULE_ID (this_BASIC_TYPES_2= RULE_BASIC_TYPES | this_ID_3= RULE_ID | this_Struct_4= ruleStruct ) )
            {
            // InternalGo.g:1369:2: (kw= 'type' this_ID_1= RULE_ID (this_BASIC_TYPES_2= RULE_BASIC_TYPES | this_ID_3= RULE_ID | this_Struct_4= ruleStruct ) )
            // InternalGo.g:1370:3: kw= 'type' this_ID_1= RULE_ID (this_BASIC_TYPES_2= RULE_BASIC_TYPES | this_ID_3= RULE_ID | this_Struct_4= ruleStruct )
            {
            kw=(Token)match(input,39,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeDefAccess().getTypeKeyword_0());
              		
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_1, grammarAccess.getTypeDefAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalGo.g:1382:3: (this_BASIC_TYPES_2= RULE_BASIC_TYPES | this_ID_3= RULE_ID | this_Struct_4= ruleStruct )
            int alt42=3;
            switch ( input.LA(1) ) {
            case RULE_BASIC_TYPES:
                {
                alt42=1;
                }
                break;
            case RULE_ID:
                {
                alt42=2;
                }
                break;
            case 40:
                {
                alt42=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalGo.g:1383:4: this_BASIC_TYPES_2= RULE_BASIC_TYPES
                    {
                    this_BASIC_TYPES_2=(Token)match(input,RULE_BASIC_TYPES,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_BASIC_TYPES_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BASIC_TYPES_2, grammarAccess.getTypeDefAccess().getBASIC_TYPESTerminalRuleCall_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1391:4: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_3, grammarAccess.getTypeDefAccess().getIDTerminalRuleCall_2_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:1399:4: this_Struct_4= ruleStruct
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeDefAccess().getStructParserRuleCall_2_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Struct_4=ruleStruct();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Struct_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleStruct"
    // InternalGo.g:1414:1: entryRuleStruct returns [String current=null] : iv_ruleStruct= ruleStruct EOF ;
    public final String entryRuleStruct() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStruct = null;


        try {
            // InternalGo.g:1414:46: (iv_ruleStruct= ruleStruct EOF )
            // InternalGo.g:1415:2: iv_ruleStruct= ruleStruct EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStruct=ruleStruct();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStruct.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStruct"


    // $ANTLR start "ruleStruct"
    // InternalGo.g:1421:1: ruleStruct returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' kw= '{' (this_FieldDecl_2= ruleFieldDecl (kw= ';' )? )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleStruct() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FieldDecl_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1427:2: ( (kw= 'struct' kw= '{' (this_FieldDecl_2= ruleFieldDecl (kw= ';' )? )* kw= '}' ) )
            // InternalGo.g:1428:2: (kw= 'struct' kw= '{' (this_FieldDecl_2= ruleFieldDecl (kw= ';' )? )* kw= '}' )
            {
            // InternalGo.g:1428:2: (kw= 'struct' kw= '{' (this_FieldDecl_2= ruleFieldDecl (kw= ';' )? )* kw= '}' )
            // InternalGo.g:1429:3: kw= 'struct' kw= '{' (this_FieldDecl_2= ruleFieldDecl (kw= ';' )? )* kw= '}'
            {
            kw=(Token)match(input,40,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStructAccess().getStructKeyword_0());
              		
            }
            kw=(Token)match(input,31,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGo.g:1439:3: (this_FieldDecl_2= ruleFieldDecl (kw= ';' )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==EOF||LA44_0==RULE_ID||LA44_0==RULE_BASIC_TYPES||(LA44_0>=24 && LA44_0<=25)||(LA44_0>=28 && LA44_0<=29)||LA44_0==40) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalGo.g:1440:4: this_FieldDecl_2= ruleFieldDecl (kw= ';' )?
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStructAccess().getFieldDeclParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_46);
            	    this_FieldDecl_2=ruleFieldDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_FieldDecl_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalGo.g:1450:4: (kw= ';' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==17) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalGo.g:1451:5: kw= ';'
            	            {
            	            kw=(Token)match(input,17,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getStructAccess().getSemicolonKeyword_2_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStructAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStruct"


    // $ANTLR start "entryRuleFieldDecl"
    // InternalGo.g:1467:1: entryRuleFieldDecl returns [String current=null] : iv_ruleFieldDecl= ruleFieldDecl EOF ;
    public final String entryRuleFieldDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldDecl = null;


        try {
            // InternalGo.g:1467:49: (iv_ruleFieldDecl= ruleFieldDecl EOF )
            // InternalGo.g:1468:2: iv_ruleFieldDecl= ruleFieldDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldDecl=ruleFieldDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFieldDecl"


    // $ANTLR start "ruleFieldDecl"
    // InternalGo.g:1474:1: ruleFieldDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IdList_0= ruleIdList (this_BASIC_TYPES_1= RULE_BASIC_TYPES | this_ID_2= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleFieldDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BASIC_TYPES_1=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_IdList_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1480:2: ( (this_IdList_0= ruleIdList (this_BASIC_TYPES_1= RULE_BASIC_TYPES | this_ID_2= RULE_ID ) ) )
            // InternalGo.g:1481:2: (this_IdList_0= ruleIdList (this_BASIC_TYPES_1= RULE_BASIC_TYPES | this_ID_2= RULE_ID ) )
            {
            // InternalGo.g:1481:2: (this_IdList_0= ruleIdList (this_BASIC_TYPES_1= RULE_BASIC_TYPES | this_ID_2= RULE_ID ) )
            // InternalGo.g:1482:3: this_IdList_0= ruleIdList (this_BASIC_TYPES_1= RULE_BASIC_TYPES | this_ID_2= RULE_ID )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFieldDeclAccess().getIdListParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_47);
            this_IdList_0=ruleIdList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IdList_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1492:3: (this_BASIC_TYPES_1= RULE_BASIC_TYPES | this_ID_2= RULE_ID )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_BASIC_TYPES) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_ID) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalGo.g:1493:4: this_BASIC_TYPES_1= RULE_BASIC_TYPES
                    {
                    this_BASIC_TYPES_1=(Token)match(input,RULE_BASIC_TYPES,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_BASIC_TYPES_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BASIC_TYPES_1, grammarAccess.getFieldDeclAccess().getBASIC_TYPESTerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1501:4: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getFieldDeclAccess().getIDTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFieldDecl"


    // $ANTLR start "entryRuleDecl"
    // InternalGo.g:1513:1: entryRuleDecl returns [String current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final String entryRuleDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecl = null;


        try {
            // InternalGo.g:1513:44: (iv_ruleDecl= ruleDecl EOF )
            // InternalGo.g:1514:2: iv_ruleDecl= ruleDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDecl=ruleDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // InternalGo.g:1520:1: ruleDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ShortVarDecl_0= ruleShortVarDecl | ( (kw= 'var' | kw= 'const' ) this_ID_3= RULE_ID this_IdList_4= ruleIdList this_BASIC_TYPES_5= RULE_BASIC_TYPES (kw= '=' this_Exp_7= ruleExp this_ExpList_8= ruleExpList )? ) ) ;
    public final AntlrDatatypeRuleToken ruleDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_BASIC_TYPES_5=null;
        AntlrDatatypeRuleToken this_ShortVarDecl_0 = null;

        AntlrDatatypeRuleToken this_IdList_4 = null;

        AntlrDatatypeRuleToken this_Exp_7 = null;

        AntlrDatatypeRuleToken this_ExpList_8 = null;



        	enterRule();

        try {
            // InternalGo.g:1526:2: ( (this_ShortVarDecl_0= ruleShortVarDecl | ( (kw= 'var' | kw= 'const' ) this_ID_3= RULE_ID this_IdList_4= ruleIdList this_BASIC_TYPES_5= RULE_BASIC_TYPES (kw= '=' this_Exp_7= ruleExp this_ExpList_8= ruleExpList )? ) ) )
            // InternalGo.g:1527:2: (this_ShortVarDecl_0= ruleShortVarDecl | ( (kw= 'var' | kw= 'const' ) this_ID_3= RULE_ID this_IdList_4= ruleIdList this_BASIC_TYPES_5= RULE_BASIC_TYPES (kw= '=' this_Exp_7= ruleExp this_ExpList_8= ruleExpList )? ) )
            {
            // InternalGo.g:1527:2: (this_ShortVarDecl_0= ruleShortVarDecl | ( (kw= 'var' | kw= 'const' ) this_ID_3= RULE_ID this_IdList_4= ruleIdList this_BASIC_TYPES_5= RULE_BASIC_TYPES (kw= '=' this_Exp_7= ruleExp this_ExpList_8= ruleExpList )? ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=41 && LA48_0<=42)) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalGo.g:1528:3: this_ShortVarDecl_0= ruleShortVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclAccess().getShortVarDeclParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShortVarDecl_0=ruleShortVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ShortVarDecl_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1539:3: ( (kw= 'var' | kw= 'const' ) this_ID_3= RULE_ID this_IdList_4= ruleIdList this_BASIC_TYPES_5= RULE_BASIC_TYPES (kw= '=' this_Exp_7= ruleExp this_ExpList_8= ruleExpList )? )
                    {
                    // InternalGo.g:1539:3: ( (kw= 'var' | kw= 'const' ) this_ID_3= RULE_ID this_IdList_4= ruleIdList this_BASIC_TYPES_5= RULE_BASIC_TYPES (kw= '=' this_Exp_7= ruleExp this_ExpList_8= ruleExpList )? )
                    // InternalGo.g:1540:4: (kw= 'var' | kw= 'const' ) this_ID_3= RULE_ID this_IdList_4= ruleIdList this_BASIC_TYPES_5= RULE_BASIC_TYPES (kw= '=' this_Exp_7= ruleExp this_ExpList_8= ruleExpList )?
                    {
                    // InternalGo.g:1540:4: (kw= 'var' | kw= 'const' )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==41) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==42) ) {
                        alt46=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalGo.g:1541:5: kw= 'var'
                            {
                            kw=(Token)match(input,41,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDeclAccess().getVarKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:1547:5: kw= 'const'
                            {
                            kw=(Token)match(input,42,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDeclAccess().getConstKeyword_1_0_1());
                              				
                            }

                            }
                            break;

                    }

                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_3, grammarAccess.getDeclAccess().getIDTerminalRuleCall_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDeclAccess().getIdListParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_49);
                    this_IdList_4=ruleIdList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IdList_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_BASIC_TYPES_5=(Token)match(input,RULE_BASIC_TYPES,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_BASIC_TYPES_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BASIC_TYPES_5, grammarAccess.getDeclAccess().getBASIC_TYPESTerminalRuleCall_1_3());
                      			
                    }
                    // InternalGo.g:1577:4: (kw= '=' this_Exp_7= ruleExp this_ExpList_8= ruleExpList )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==25) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalGo.g:1578:5: kw= '=' this_Exp_7= ruleExp this_ExpList_8= ruleExpList
                            {
                            kw=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDeclAccess().getEqualsSignKeyword_1_4_0());
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getDeclAccess().getExpParserRuleCall_1_4_1());
                              				
                            }
                            pushFollow(FOLLOW_51);
                            this_Exp_7=ruleExp();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_Exp_7);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getDeclAccess().getExpListParserRuleCall_1_4_2());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_ExpList_8=ruleExpList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_ExpList_8);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleShortVarDecl"
    // InternalGo.g:1609:1: entryRuleShortVarDecl returns [String current=null] : iv_ruleShortVarDecl= ruleShortVarDecl EOF ;
    public final String entryRuleShortVarDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleShortVarDecl = null;


        try {
            // InternalGo.g:1609:52: (iv_ruleShortVarDecl= ruleShortVarDecl EOF )
            // InternalGo.g:1610:2: iv_ruleShortVarDecl= ruleShortVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShortVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShortVarDecl=ruleShortVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShortVarDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShortVarDecl"


    // $ANTLR start "ruleShortVarDecl"
    // InternalGo.g:1616:1: ruleShortVarDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID this_IdList_1= ruleIdList kw= ':=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList ) ;
    public final AntlrDatatypeRuleToken ruleShortVarDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_IdList_1 = null;

        AntlrDatatypeRuleToken this_Exp_3 = null;

        AntlrDatatypeRuleToken this_ExpList_4 = null;



        	enterRule();

        try {
            // InternalGo.g:1622:2: ( (this_ID_0= RULE_ID this_IdList_1= ruleIdList kw= ':=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList ) )
            // InternalGo.g:1623:2: (this_ID_0= RULE_ID this_IdList_1= ruleIdList kw= ':=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList )
            {
            // InternalGo.g:1623:2: (this_ID_0= RULE_ID this_IdList_1= ruleIdList kw= ':=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList )
            // InternalGo.g:1624:3: this_ID_0= RULE_ID this_IdList_1= ruleIdList kw= ':=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getShortVarDeclAccess().getIDTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShortVarDeclAccess().getIdListParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_53);
            this_IdList_1=ruleIdList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IdList_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,24,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getShortVarDeclAccess().getColonEqualsSignKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShortVarDeclAccess().getExpParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_51);
            this_Exp_3=ruleExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Exp_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShortVarDeclAccess().getExpListParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_2);
            this_ExpList_4=ruleExpList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ExpList_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShortVarDecl"


    // $ANTLR start "entryRuleAssig"
    // InternalGo.g:1670:1: entryRuleAssig returns [String current=null] : iv_ruleAssig= ruleAssig EOF ;
    public final String entryRuleAssig() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssig = null;


        try {
            // InternalGo.g:1670:45: (iv_ruleAssig= ruleAssig EOF )
            // InternalGo.g:1671:2: iv_ruleAssig= ruleAssig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssigRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssig=ruleAssig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssig.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssig"


    // $ANTLR start "ruleAssig"
    // InternalGo.g:1677:1: ruleAssig returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList ) | (kw= '++' | kw= '--' ) | ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp ) ) ) ;
    public final AntlrDatatypeRuleToken ruleAssig() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_IdList_1 = null;

        AntlrDatatypeRuleToken this_Exp_3 = null;

        AntlrDatatypeRuleToken this_ExpList_4 = null;

        AntlrDatatypeRuleToken this_Exp_11 = null;



        	enterRule();

        try {
            // InternalGo.g:1683:2: ( (this_ID_0= RULE_ID ( (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList ) | (kw= '++' | kw= '--' ) | ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp ) ) ) )
            // InternalGo.g:1684:2: (this_ID_0= RULE_ID ( (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList ) | (kw= '++' | kw= '--' ) | ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp ) ) )
            {
            // InternalGo.g:1684:2: (this_ID_0= RULE_ID ( (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList ) | (kw= '++' | kw= '--' ) | ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp ) ) )
            // InternalGo.g:1685:3: this_ID_0= RULE_ID ( (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList ) | (kw= '++' | kw= '--' ) | ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp ) )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getAssigAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGo.g:1692:3: ( (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList ) | (kw= '++' | kw= '--' ) | ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_ID:
            case RULE_BASIC_TYPES:
            case 24:
            case 25:
            case 28:
            case 29:
            case 40:
                {
                alt51=1;
                }
                break;
            case 43:
            case 44:
                {
                alt51=2;
                }
                break;
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt51=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalGo.g:1693:4: (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList )
                    {
                    // InternalGo.g:1693:4: (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList )
                    // InternalGo.g:1694:5: this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAssigAccess().getIdListParserRuleCall_1_0_0());
                      				
                    }
                    pushFollow(FOLLOW_55);
                    this_IdList_1=ruleIdList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_IdList_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    kw=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getAssigAccess().getEqualsSignKeyword_1_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAssigAccess().getExpParserRuleCall_1_0_2());
                      				
                    }
                    pushFollow(FOLLOW_51);
                    this_Exp_3=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Exp_3);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAssigAccess().getExpListParserRuleCall_1_0_3());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpList_4=ruleExpList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_ExpList_4);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1731:4: (kw= '++' | kw= '--' )
                    {
                    // InternalGo.g:1731:4: (kw= '++' | kw= '--' )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==43) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==44) ) {
                        alt49=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalGo.g:1732:5: kw= '++'
                            {
                            kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getAssigAccess().getPlusSignPlusSignKeyword_1_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:1738:5: kw= '--'
                            {
                            kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getAssigAccess().getHyphenMinusHyphenMinusKeyword_1_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1745:4: ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp )
                    {
                    // InternalGo.g:1745:4: ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp )
                    // InternalGo.g:1746:5: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp
                    {
                    // InternalGo.g:1746:5: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' )
                    int alt50=4;
                    switch ( input.LA(1) ) {
                    case 45:
                        {
                        alt50=1;
                        }
                        break;
                    case 46:
                        {
                        alt50=2;
                        }
                        break;
                    case 47:
                        {
                        alt50=3;
                        }
                        break;
                    case 48:
                        {
                        alt50=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }

                    switch (alt50) {
                        case 1 :
                            // InternalGo.g:1747:6: kw= '+='
                            {
                            kw=(Token)match(input,45,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getAssigAccess().getPlusSignEqualsSignKeyword_1_2_0_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:1753:6: kw= '-='
                            {
                            kw=(Token)match(input,46,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getAssigAccess().getHyphenMinusEqualsSignKeyword_1_2_0_1());
                              					
                            }

                            }
                            break;
                        case 3 :
                            // InternalGo.g:1759:6: kw= '*='
                            {
                            kw=(Token)match(input,47,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getAssigAccess().getAsteriskEqualsSignKeyword_1_2_0_2());
                              					
                            }

                            }
                            break;
                        case 4 :
                            // InternalGo.g:1765:6: kw= '/='
                            {
                            kw=(Token)match(input,48,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getAssigAccess().getSolidusEqualsSignKeyword_1_2_0_3());
                              					
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAssigAccess().getExpParserRuleCall_1_2_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    this_Exp_11=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Exp_11);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAssig"


    // $ANTLR start "entryRuleIdList"
    // InternalGo.g:1787:1: entryRuleIdList returns [String current=null] : iv_ruleIdList= ruleIdList EOF ;
    public final String entryRuleIdList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdList = null;


        try {
            // InternalGo.g:1787:46: (iv_ruleIdList= ruleIdList EOF )
            // InternalGo.g:1788:2: iv_ruleIdList= ruleIdList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdList=ruleIdList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdList"


    // $ANTLR start "ruleIdList"
    // InternalGo.g:1794:1: ruleIdList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken ruleIdList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGo.g:1800:2: ( (kw= ',' this_ID_1= RULE_ID )* )
            // InternalGo.g:1801:2: (kw= ',' this_ID_1= RULE_ID )*
            {
            // InternalGo.g:1801:2: (kw= ',' this_ID_1= RULE_ID )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==28) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalGo.g:1802:3: kw= ',' this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getIdListAccess().getCommaKeyword_0());
            	      		
            	    }
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_ID_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_ID_1, grammarAccess.getIdListAccess().getIDTerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIdList"


    // $ANTLR start "entryRuleExpList"
    // InternalGo.g:1818:1: entryRuleExpList returns [String current=null] : iv_ruleExpList= ruleExpList EOF ;
    public final String entryRuleExpList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpList = null;


        try {
            // InternalGo.g:1818:47: (iv_ruleExpList= ruleExpList EOF )
            // InternalGo.g:1819:2: iv_ruleExpList= ruleExpList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpList=ruleExpList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpList"


    // $ANTLR start "ruleExpList"
    // InternalGo.g:1825:1: ruleExpList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' this_Exp_1= ruleExp )* ;
    public final AntlrDatatypeRuleToken ruleExpList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1831:2: ( (kw= ',' this_Exp_1= ruleExp )* )
            // InternalGo.g:1832:2: (kw= ',' this_Exp_1= ruleExp )*
            {
            // InternalGo.g:1832:2: (kw= ',' this_Exp_1= ruleExp )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==28) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalGo.g:1833:3: kw= ',' this_Exp_1= ruleExp
            	    {
            	    kw=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getExpListAccess().getCommaKeyword_0());
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getExpListAccess().getExpParserRuleCall_1());
            	      		
            	    }
            	    pushFollow(FOLLOW_28);
            	    this_Exp_1=ruleExp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_Exp_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpList"


    // $ANTLR start "entryRuleExp"
    // InternalGo.g:1852:1: entryRuleExp returns [String current=null] : iv_ruleExp= ruleExp EOF ;
    public final String entryRuleExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExp = null;


        try {
            // InternalGo.g:1852:43: (iv_ruleExp= ruleExp EOF )
            // InternalGo.g:1853:2: iv_ruleExp= ruleExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalGo.g:1859:1: ruleExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Call_0= ruleCall | this_ExpAux_1= ruleExpAux | (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? ) | (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? ) | this_STRING_6= RULE_STRING | this_RelExp_7= ruleRelExp | (this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )? ) ) ;
    public final AntlrDatatypeRuleToken ruleExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_6=null;
        Token this_ID_8=null;
        AntlrDatatypeRuleToken this_Call_0 = null;

        AntlrDatatypeRuleToken this_ExpAux_1 = null;

        AntlrDatatypeRuleToken this_BooleanExp_2 = null;

        AntlrDatatypeRuleToken this_ExpJoin_3 = null;

        AntlrDatatypeRuleToken this_AritExp_4 = null;

        AntlrDatatypeRuleToken this_ExpJoin_5 = null;

        AntlrDatatypeRuleToken this_RelExp_7 = null;

        AntlrDatatypeRuleToken this_ExpJoin_9 = null;



        	enterRule();

        try {
            // InternalGo.g:1865:2: ( (this_Call_0= ruleCall | this_ExpAux_1= ruleExpAux | (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? ) | (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? ) | this_STRING_6= RULE_STRING | this_RelExp_7= ruleRelExp | (this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )? ) ) )
            // InternalGo.g:1866:2: (this_Call_0= ruleCall | this_ExpAux_1= ruleExpAux | (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? ) | (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? ) | this_STRING_6= RULE_STRING | this_RelExp_7= ruleRelExp | (this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )? ) )
            {
            // InternalGo.g:1866:2: (this_Call_0= ruleCall | this_ExpAux_1= ruleExpAux | (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? ) | (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? ) | this_STRING_6= RULE_STRING | this_RelExp_7= ruleRelExp | (this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )? ) )
            int alt57=7;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // InternalGo.g:1867:3: this_Call_0= ruleCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpAccess().getCallParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Call_0=ruleCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Call_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1878:3: this_ExpAux_1= ruleExpAux
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpAccess().getExpAuxParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpAux_1=ruleExpAux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ExpAux_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:1889:3: (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? )
                    {
                    // InternalGo.g:1889:3: (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? )
                    // InternalGo.g:1890:4: this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpAccess().getBooleanExpParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_56);
                    this_BooleanExp_2=ruleBooleanExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_BooleanExp_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:1900:4: (this_ExpJoin_3= ruleExpJoin )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=RULE_OP_REL && LA54_0<=RULE_OP_UNARY)||LA54_0==RULE_OP_MULT||(LA54_0>=50 && LA54_0<=51)) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==RULE_OP_SUM) ) {
                        int LA54_2 = input.LA(2);

                        if ( ((LA54_2>=RULE_ID && LA54_2<=RULE_STRING)||LA54_2==RULE_OP_SUM||LA54_2==RULE_BOOL||LA54_2==19||LA54_2==49) ) {
                            alt54=1;
                        }
                        else if ( (LA54_2==RULE_INT) ) {
                            int LA54_4 = input.LA(3);

                            if ( (synpred66_InternalGo()) ) {
                                alt54=1;
                            }
                        }
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalGo.g:1901:5: this_ExpJoin_3= ruleExpJoin
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getExpAccess().getExpJoinParserRuleCall_2_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_ExpJoin_3=ruleExpJoin();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_ExpJoin_3);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:1914:3: (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? )
                    {
                    // InternalGo.g:1914:3: (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? )
                    // InternalGo.g:1915:4: this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpAccess().getAritExpParserRuleCall_3_0());
                      			
                    }
                    pushFollow(FOLLOW_56);
                    this_AritExp_4=ruleAritExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_AritExp_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:1925:4: (this_ExpJoin_5= ruleExpJoin )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( ((LA55_0>=RULE_OP_REL && LA55_0<=RULE_OP_UNARY)||LA55_0==RULE_OP_MULT||(LA55_0>=50 && LA55_0<=51)) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==RULE_OP_SUM) ) {
                        int LA55_2 = input.LA(2);

                        if ( (LA55_2==RULE_INT) ) {
                            int LA55_4 = input.LA(3);

                            if ( (synpred68_InternalGo()) ) {
                                alt55=1;
                            }
                        }
                        else if ( ((LA55_2>=RULE_ID && LA55_2<=RULE_STRING)||LA55_2==RULE_OP_SUM||LA55_2==RULE_BOOL||LA55_2==19||LA55_2==49) ) {
                            alt55=1;
                        }
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalGo.g:1926:5: this_ExpJoin_5= ruleExpJoin
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getExpAccess().getExpJoinParserRuleCall_3_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_ExpJoin_5=ruleExpJoin();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_ExpJoin_5);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:1939:3: this_STRING_6= RULE_STRING
                    {
                    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_6, grammarAccess.getExpAccess().getSTRINGTerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:1947:3: this_RelExp_7= ruleRelExp
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpAccess().getRelExpParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelExp_7=ruleRelExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_RelExp_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:1958:3: (this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )? )
                    {
                    // InternalGo.g:1958:3: (this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )? )
                    // InternalGo.g:1959:4: this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )?
                    {
                    this_ID_8=(Token)match(input,RULE_ID,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_8, grammarAccess.getExpAccess().getIDTerminalRuleCall_6_0());
                      			
                    }
                    // InternalGo.g:1966:4: (this_ExpJoin_9= ruleExpJoin )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( ((LA56_0>=RULE_OP_REL && LA56_0<=RULE_OP_UNARY)||LA56_0==RULE_OP_MULT||(LA56_0>=50 && LA56_0<=51)) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==RULE_OP_SUM) ) {
                        int LA56_2 = input.LA(2);

                        if ( ((LA56_2>=RULE_ID && LA56_2<=RULE_STRING)||LA56_2==RULE_OP_SUM||LA56_2==RULE_BOOL||LA56_2==19||LA56_2==49) ) {
                            alt56=1;
                        }
                        else if ( (LA56_2==RULE_INT) ) {
                            int LA56_4 = input.LA(3);

                            if ( (synpred72_InternalGo()) ) {
                                alt56=1;
                            }
                        }
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalGo.g:1967:5: this_ExpJoin_9= ruleExpJoin
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getExpAccess().getExpJoinParserRuleCall_6_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_ExpJoin_9=ruleExpJoin();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_ExpJoin_9);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleSimpleStmt"
    // InternalGo.g:1983:1: entryRuleSimpleStmt returns [String current=null] : iv_ruleSimpleStmt= ruleSimpleStmt EOF ;
    public final String entryRuleSimpleStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleStmt = null;


        try {
            // InternalGo.g:1983:50: (iv_ruleSimpleStmt= ruleSimpleStmt EOF )
            // InternalGo.g:1984:2: iv_ruleSimpleStmt= ruleSimpleStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleStmt=ruleSimpleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleStmt"


    // $ANTLR start "ruleSimpleStmt"
    // InternalGo.g:1990:1: ruleSimpleStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp ) ;
    public final AntlrDatatypeRuleToken ruleSimpleStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Decl_0 = null;

        AntlrDatatypeRuleToken this_Assig_1 = null;

        AntlrDatatypeRuleToken this_Exp_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1996:2: ( (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp ) )
            // InternalGo.g:1997:2: (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp )
            {
            // InternalGo.g:1997:2: (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp )
            int alt58=3;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // InternalGo.g:1998:3: this_Decl_0= ruleDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleStmtAccess().getDeclParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Decl_0=ruleDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Decl_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2009:3: this_Assig_1= ruleAssig
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleStmtAccess().getAssigParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Assig_1=ruleAssig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Assig_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2020:3: this_Exp_2= ruleExp
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleStmtAccess().getExpParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Exp_2=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Exp_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleStmt"


    // $ANTLR start "entryRuleExpAux"
    // InternalGo.g:2034:1: entryRuleExpAux returns [String current=null] : iv_ruleExpAux= ruleExpAux EOF ;
    public final String entryRuleExpAux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpAux = null;


        try {
            // InternalGo.g:2034:46: (iv_ruleExpAux= ruleExpAux EOF )
            // InternalGo.g:2035:2: iv_ruleExpAux= ruleExpAux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpAuxRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpAux=ruleExpAux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpAux.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpAux"


    // $ANTLR start "ruleExpAux"
    // InternalGo.g:2041:1: ruleExpAux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '!' )? kw= '(' this_Exp_2= ruleExp kw= ')' (this_ExpJoin_4= ruleExpJoin )? ) ;
    public final AntlrDatatypeRuleToken ruleExpAux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_2 = null;

        AntlrDatatypeRuleToken this_ExpJoin_4 = null;



        	enterRule();

        try {
            // InternalGo.g:2047:2: ( ( (kw= '!' )? kw= '(' this_Exp_2= ruleExp kw= ')' (this_ExpJoin_4= ruleExpJoin )? ) )
            // InternalGo.g:2048:2: ( (kw= '!' )? kw= '(' this_Exp_2= ruleExp kw= ')' (this_ExpJoin_4= ruleExpJoin )? )
            {
            // InternalGo.g:2048:2: ( (kw= '!' )? kw= '(' this_Exp_2= ruleExp kw= ')' (this_ExpJoin_4= ruleExpJoin )? )
            // InternalGo.g:2049:3: (kw= '!' )? kw= '(' this_Exp_2= ruleExp kw= ')' (this_ExpJoin_4= ruleExpJoin )?
            {
            // InternalGo.g:2049:3: (kw= '!' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==49) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalGo.g:2050:4: kw= '!'
                    {
                    kw=(Token)match(input,49,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpAuxAccess().getExclamationMarkKeyword_0());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,19,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getExpAuxAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpAuxAccess().getExpParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_27);
            this_Exp_2=ruleExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Exp_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,20,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getExpAuxAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalGo.g:2076:3: (this_ExpJoin_4= ruleExpJoin )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_OP_REL && LA60_0<=RULE_OP_UNARY)||LA60_0==RULE_OP_MULT||(LA60_0>=50 && LA60_0<=51)) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_OP_SUM) ) {
                int LA60_2 = input.LA(2);

                if ( (LA60_2==RULE_INT) ) {
                    int LA60_4 = input.LA(3);

                    if ( (synpred76_InternalGo()) ) {
                        alt60=1;
                    }
                }
                else if ( ((LA60_2>=RULE_ID && LA60_2<=RULE_STRING)||LA60_2==RULE_OP_SUM||LA60_2==RULE_BOOL||LA60_2==19||LA60_2==49) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // InternalGo.g:2077:4: this_ExpJoin_4= ruleExpJoin
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpAuxAccess().getExpJoinParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpJoin_4=ruleExpJoin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExpJoin_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpAux"


    // $ANTLR start "entryRuleCall"
    // InternalGo.g:2092:1: entryRuleCall returns [String current=null] : iv_ruleCall= ruleCall EOF ;
    public final String entryRuleCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCall = null;


        try {
            // InternalGo.g:2092:44: (iv_ruleCall= ruleCall EOF )
            // InternalGo.g:2093:2: iv_ruleCall= ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCall=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCall.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalGo.g:2099:1: ruleCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* kw= '(' (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_Exp_4 = null;

        AntlrDatatypeRuleToken this_ExpList_5 = null;



        	enterRule();

        try {
            // InternalGo.g:2105:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* kw= '(' (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )? kw= ')' ) )
            // InternalGo.g:2106:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* kw= '(' (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )? kw= ')' )
            {
            // InternalGo.g:2106:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* kw= '(' (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )? kw= ')' )
            // InternalGo.g:2107:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* kw= '(' (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )? kw= ')'
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getCallAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGo.g:2114:3: (kw= '.' this_ID_2= RULE_ID )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==21) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalGo.g:2115:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getCallAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getCallAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            kw=(Token)match(input,19,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalGo.g:2133:3: (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_STRING)||LA62_0==RULE_OP_SUM||(LA62_0>=RULE_BOOL && LA62_0<=RULE_INT)||LA62_0==19||LA62_0==49) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalGo.g:2134:4: this_Exp_4= ruleExp this_ExpList_5= ruleExpList
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallAccess().getExpParserRuleCall_3_0());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_Exp_4=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Exp_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallAccess().getExpListParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_27);
                    this_ExpList_5=ruleExpList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExpList_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getCallAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleExpJoin"
    // InternalGo.g:2164:1: entryRuleExpJoin returns [String current=null] : iv_ruleExpJoin= ruleExpJoin EOF ;
    public final String entryRuleExpJoin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpJoin = null;


        try {
            // InternalGo.g:2164:47: (iv_ruleExpJoin= ruleExpJoin EOF )
            // InternalGo.g:2165:2: iv_ruleExpJoin= ruleExpJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpJoinRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpJoin=ruleExpJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpJoin.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpJoin"


    // $ANTLR start "ruleExpJoin"
    // InternalGo.g:2171:1: ruleExpJoin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_OP_REL_0= RULE_OP_REL | this_OP_UNARY_1= RULE_OP_UNARY | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' ) this_Exp_6= ruleExp ) ;
    public final AntlrDatatypeRuleToken ruleExpJoin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_REL_0=null;
        Token this_OP_UNARY_1=null;
        Token this_OP_SUM_2=null;
        Token this_OP_MULT_3=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_6 = null;



        	enterRule();

        try {
            // InternalGo.g:2177:2: ( ( (this_OP_REL_0= RULE_OP_REL | this_OP_UNARY_1= RULE_OP_UNARY | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' ) this_Exp_6= ruleExp ) )
            // InternalGo.g:2178:2: ( (this_OP_REL_0= RULE_OP_REL | this_OP_UNARY_1= RULE_OP_UNARY | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' ) this_Exp_6= ruleExp )
            {
            // InternalGo.g:2178:2: ( (this_OP_REL_0= RULE_OP_REL | this_OP_UNARY_1= RULE_OP_UNARY | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' ) this_Exp_6= ruleExp )
            // InternalGo.g:2179:3: (this_OP_REL_0= RULE_OP_REL | this_OP_UNARY_1= RULE_OP_UNARY | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' ) this_Exp_6= ruleExp
            {
            // InternalGo.g:2179:3: (this_OP_REL_0= RULE_OP_REL | this_OP_UNARY_1= RULE_OP_UNARY | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' )
            int alt63=6;
            switch ( input.LA(1) ) {
            case RULE_OP_REL:
                {
                alt63=1;
                }
                break;
            case RULE_OP_UNARY:
                {
                alt63=2;
                }
                break;
            case RULE_OP_SUM:
                {
                alt63=3;
                }
                break;
            case RULE_OP_MULT:
                {
                alt63=4;
                }
                break;
            case 50:
                {
                alt63=5;
                }
                break;
            case 51:
                {
                alt63=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalGo.g:2180:4: this_OP_REL_0= RULE_OP_REL
                    {
                    this_OP_REL_0=(Token)match(input,RULE_OP_REL,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_OP_REL_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP_REL_0, grammarAccess.getExpJoinAccess().getOP_RELTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2188:4: this_OP_UNARY_1= RULE_OP_UNARY
                    {
                    this_OP_UNARY_1=(Token)match(input,RULE_OP_UNARY,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_OP_UNARY_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP_UNARY_1, grammarAccess.getExpJoinAccess().getOP_UNARYTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2196:4: this_OP_SUM_2= RULE_OP_SUM
                    {
                    this_OP_SUM_2=(Token)match(input,RULE_OP_SUM,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_OP_SUM_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP_SUM_2, grammarAccess.getExpJoinAccess().getOP_SUMTerminalRuleCall_0_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:2204:4: this_OP_MULT_3= RULE_OP_MULT
                    {
                    this_OP_MULT_3=(Token)match(input,RULE_OP_MULT,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_OP_MULT_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP_MULT_3, grammarAccess.getExpJoinAccess().getOP_MULTTerminalRuleCall_0_3());
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:2212:4: kw= '&&'
                    {
                    kw=(Token)match(input,50,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpJoinAccess().getAmpersandAmpersandKeyword_0_4());
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:2218:4: kw= '||'
                    {
                    kw=(Token)match(input,51,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpJoinAccess().getVerticalLineVerticalLineKeyword_0_5());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpJoinAccess().getExpParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Exp_6=ruleExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Exp_6);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpJoin"


    // $ANTLR start "entryRuleRelExp"
    // InternalGo.g:2238:1: entryRuleRelExp returns [String current=null] : iv_ruleRelExp= ruleRelExp EOF ;
    public final String entryRuleRelExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelExp = null;


        try {
            // InternalGo.g:2238:46: (iv_ruleRelExp= ruleRelExp EOF )
            // InternalGo.g:2239:2: iv_ruleRelExp= ruleRelExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelExpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelExp=ruleRelExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelExp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelExp"


    // $ANTLR start "ruleRelExp"
    // InternalGo.g:2245:1: ruleRelExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral ) | (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral ) ) ;
    public final AntlrDatatypeRuleToken ruleRelExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_REL_1=null;
        Token this_OP_UNARY_2=null;
        Token this_OP_UNARY_5=null;
        AntlrDatatypeRuleToken this_NumberLiteral_0 = null;

        AntlrDatatypeRuleToken this_NumberLiteral_3 = null;

        AntlrDatatypeRuleToken this_BooleanLiteral_4 = null;

        AntlrDatatypeRuleToken this_BooleanLiteral_6 = null;



        	enterRule();

        try {
            // InternalGo.g:2251:2: ( ( (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral ) | (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral ) ) )
            // InternalGo.g:2252:2: ( (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral ) | (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral ) )
            {
            // InternalGo.g:2252:2: ( (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral ) | (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_INT) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_BOOL) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalGo.g:2253:3: (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral )
                    {
                    // InternalGo.g:2253:3: (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral )
                    // InternalGo.g:2254:4: this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRelExpAccess().getNumberLiteralParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_59);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_NumberLiteral_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:2264:4: (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_OP_REL) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==RULE_OP_UNARY) ) {
                        alt64=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalGo.g:2265:5: this_OP_REL_1= RULE_OP_REL
                            {
                            this_OP_REL_1=(Token)match(input,RULE_OP_REL,FOLLOW_60); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_OP_REL_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_OP_REL_1, grammarAccess.getRelExpAccess().getOP_RELTerminalRuleCall_0_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:2273:5: this_OP_UNARY_2= RULE_OP_UNARY
                            {
                            this_OP_UNARY_2=(Token)match(input,RULE_OP_UNARY,FOLLOW_60); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_OP_UNARY_2);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_OP_UNARY_2, grammarAccess.getRelExpAccess().getOP_UNARYTerminalRuleCall_0_1_1());
                              				
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRelExpAccess().getNumberLiteralParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_3=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_NumberLiteral_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2293:3: (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral )
                    {
                    // InternalGo.g:2293:3: (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral )
                    // InternalGo.g:2294:4: this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRelExpAccess().getBooleanLiteralParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_61);
                    this_BooleanLiteral_4=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_BooleanLiteral_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_OP_UNARY_5=(Token)match(input,RULE_OP_UNARY,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_OP_UNARY_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP_UNARY_5, grammarAccess.getRelExpAccess().getOP_UNARYTerminalRuleCall_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRelExpAccess().getBooleanLiteralParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_6=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_BooleanLiteral_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelExp"


    // $ANTLR start "entryRuleBooleanExp"
    // InternalGo.g:2326:1: entryRuleBooleanExp returns [String current=null] : iv_ruleBooleanExp= ruleBooleanExp EOF ;
    public final String entryRuleBooleanExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanExp = null;


        try {
            // InternalGo.g:2326:50: (iv_ruleBooleanExp= ruleBooleanExp EOF )
            // InternalGo.g:2327:2: iv_ruleBooleanExp= ruleBooleanExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExp=ruleBooleanExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanExp"


    // $ANTLR start "ruleBooleanExp"
    // InternalGo.g:2333:1: ruleBooleanExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Or_0= ruleOr ;
    public final AntlrDatatypeRuleToken ruleBooleanExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Or_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2339:2: (this_Or_0= ruleOr )
            // InternalGo.g:2340:2: this_Or_0= ruleOr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getBooleanExpAccess().getOrParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Or_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanExp"


    // $ANTLR start "entryRuleOr"
    // InternalGo.g:2353:1: entryRuleOr returns [String current=null] : iv_ruleOr= ruleOr EOF ;
    public final String entryRuleOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOr = null;


        try {
            // InternalGo.g:2353:42: (iv_ruleOr= ruleOr EOF )
            // InternalGo.g:2354:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalGo.g:2360:1: ruleOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '!' )? this_And_1= ruleAnd (kw= '||' this_And_3= ruleAnd )* ) ;
    public final AntlrDatatypeRuleToken ruleOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_And_1 = null;

        AntlrDatatypeRuleToken this_And_3 = null;



        	enterRule();

        try {
            // InternalGo.g:2366:2: ( ( (kw= '!' )? this_And_1= ruleAnd (kw= '||' this_And_3= ruleAnd )* ) )
            // InternalGo.g:2367:2: ( (kw= '!' )? this_And_1= ruleAnd (kw= '||' this_And_3= ruleAnd )* )
            {
            // InternalGo.g:2367:2: ( (kw= '!' )? this_And_1= ruleAnd (kw= '||' this_And_3= ruleAnd )* )
            // InternalGo.g:2368:3: (kw= '!' )? this_And_1= ruleAnd (kw= '||' this_And_3= ruleAnd )*
            {
            // InternalGo.g:2368:3: (kw= '!' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==49) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalGo.g:2369:4: kw= '!'
                    {
                    kw=(Token)match(input,49,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOrAccess().getExclamationMarkKeyword_0());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_63);
            this_And_1=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_And_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2385:3: (kw= '||' this_And_3= ruleAnd )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==51) ) {
                    int LA67_2 = input.LA(2);

                    if ( (LA67_2==RULE_BOOL) ) {
                        int LA67_3 = input.LA(3);

                        if ( (synpred87_InternalGo()) ) {
                            alt67=1;
                        }


                    }


                }


                switch (alt67) {
            	case 1 :
            	    // InternalGo.g:2386:4: kw= '||' this_And_3= ruleAnd
            	    {
            	    kw=(Token)match(input,51,FOLLOW_62); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_2_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_63);
            	    this_And_3=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_And_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalGo.g:2406:1: entryRuleAnd returns [String current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final String entryRuleAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnd = null;


        try {
            // InternalGo.g:2406:43: (iv_ruleAnd= ruleAnd EOF )
            // InternalGo.g:2407:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalGo.g:2413:1: ruleAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BooleanLiteral_0= ruleBooleanLiteral (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )* ) ;
    public final AntlrDatatypeRuleToken ruleAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BooleanLiteral_0 = null;

        AntlrDatatypeRuleToken this_BooleanLiteral_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2419:2: ( (this_BooleanLiteral_0= ruleBooleanLiteral (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )* ) )
            // InternalGo.g:2420:2: (this_BooleanLiteral_0= ruleBooleanLiteral (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )* )
            {
            // InternalGo.g:2420:2: (this_BooleanLiteral_0= ruleBooleanLiteral (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )* )
            // InternalGo.g:2421:3: this_BooleanLiteral_0= ruleBooleanLiteral (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getBooleanLiteralParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_64);
            this_BooleanLiteral_0=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_BooleanLiteral_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2431:3: (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==50) ) {
                    int LA68_2 = input.LA(2);

                    if ( (LA68_2==RULE_BOOL) ) {
                        int LA68_3 = input.LA(3);

                        if ( (synpred88_InternalGo()) ) {
                            alt68=1;
                        }


                    }


                }


                switch (alt68) {
            	case 1 :
            	    // InternalGo.g:2432:4: kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral
            	    {
            	    kw=(Token)match(input,50,FOLLOW_62); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getAndAccess().getBooleanLiteralParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_64);
            	    this_BooleanLiteral_2=ruleBooleanLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_BooleanLiteral_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalGo.g:2452:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // InternalGo.g:2452:54: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalGo.g:2453:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalGo.g:2459:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOL_0= RULE_BOOL ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOL_0=null;


        	enterRule();

        try {
            // InternalGo.g:2465:2: (this_BOOL_0= RULE_BOOL )
            // InternalGo.g:2466:2: this_BOOL_0= RULE_BOOL
            {
            this_BOOL_0=(Token)match(input,RULE_BOOL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_BOOL_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_BOOL_0, grammarAccess.getBooleanLiteralAccess().getBOOLTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleAritExp"
    // InternalGo.g:2476:1: entryRuleAritExp returns [String current=null] : iv_ruleAritExp= ruleAritExp EOF ;
    public final String entryRuleAritExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAritExp = null;


        try {
            // InternalGo.g:2476:47: (iv_ruleAritExp= ruleAritExp EOF )
            // InternalGo.g:2477:2: iv_ruleAritExp= ruleAritExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAritExpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAritExp=ruleAritExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAritExp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAritExp"


    // $ANTLR start "ruleAritExp"
    // InternalGo.g:2483:1: ruleAritExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Addition_0= ruleAddition ;
    public final AntlrDatatypeRuleToken ruleAritExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Addition_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2489:2: (this_Addition_0= ruleAddition )
            // InternalGo.g:2490:2: this_Addition_0= ruleAddition
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getAritExpAccess().getAdditionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Addition_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAritExp"


    // $ANTLR start "entryRuleAddition"
    // InternalGo.g:2503:1: entryRuleAddition returns [String current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final String entryRuleAddition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddition = null;


        try {
            // InternalGo.g:2503:48: (iv_ruleAddition= ruleAddition EOF )
            // InternalGo.g:2504:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalGo.g:2510:1: ruleAddition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication )+ ;
    public final AntlrDatatypeRuleToken ruleAddition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_SUM_0=null;
        AntlrDatatypeRuleToken this_Multiplication_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2516:2: ( ( (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication )+ )
            // InternalGo.g:2517:2: ( (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication )+
            {
            // InternalGo.g:2517:2: ( (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication )+
            int cnt70=0;
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==RULE_OP_SUM) ) {
                    int LA70_2 = input.LA(2);

                    if ( (synpred90_InternalGo()) ) {
                        alt70=1;
                    }


                }
                else if ( (LA70_0==RULE_INT) ) {
                    int LA70_3 = input.LA(2);

                    if ( (synpred90_InternalGo()) ) {
                        alt70=1;
                    }


                }


                switch (alt70) {
            	case 1 :
            	    // InternalGo.g:2518:3: (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication
            	    {
            	    // InternalGo.g:2518:3: (this_OP_SUM_0= RULE_OP_SUM )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==RULE_OP_SUM) ) {
            	        alt69=1;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // InternalGo.g:2519:4: this_OP_SUM_0= RULE_OP_SUM
            	            {
            	            this_OP_SUM_0=(Token)match(input,RULE_OP_SUM,FOLLOW_60); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              				current.merge(this_OP_SUM_0);
            	              			
            	            }
            	            if ( state.backtracking==0 ) {

            	              				newLeafNode(this_OP_SUM_0, grammarAccess.getAdditionAccess().getOP_SUMTerminalRuleCall_0());
            	              			
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_1());
            	      		
            	    }
            	    pushFollow(FOLLOW_65);
            	    this_Multiplication_1=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_Multiplication_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt70 >= 1 ) break loop70;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(70, input);
                        throw eee;
                }
                cnt70++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalGo.g:2541:1: entryRuleMultiplication returns [String current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final String entryRuleMultiplication() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplication = null;


        try {
            // InternalGo.g:2541:54: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalGo.g:2542:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalGo.g:2548:1: ruleMultiplication returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NumberLiteral_0= ruleNumberLiteral ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )* ) ;
    public final AntlrDatatypeRuleToken ruleMultiplication() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_MULT_1=null;
        AntlrDatatypeRuleToken this_NumberLiteral_0 = null;

        AntlrDatatypeRuleToken this_NumberLiteral_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2554:2: ( (this_NumberLiteral_0= ruleNumberLiteral ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )* ) )
            // InternalGo.g:2555:2: (this_NumberLiteral_0= ruleNumberLiteral ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )* )
            {
            // InternalGo.g:2555:2: (this_NumberLiteral_0= ruleNumberLiteral ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )* )
            // InternalGo.g:2556:3: this_NumberLiteral_0= ruleNumberLiteral ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicationAccess().getNumberLiteralParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_66);
            this_NumberLiteral_0=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NumberLiteral_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2566:3: ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_OP_MULT) ) {
                    int LA72_2 = input.LA(2);

                    if ( (LA72_2==RULE_INT) ) {
                        int LA72_4 = input.LA(3);

                        if ( (synpred92_InternalGo()) ) {
                            alt72=1;
                        }


                    }


                }
                else if ( (LA72_0==RULE_INT) ) {
                    int LA72_3 = input.LA(2);

                    if ( (synpred92_InternalGo()) ) {
                        alt72=1;
                    }


                }


                switch (alt72) {
            	case 1 :
            	    // InternalGo.g:2567:4: (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral
            	    {
            	    // InternalGo.g:2567:4: (this_OP_MULT_1= RULE_OP_MULT )?
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==RULE_OP_MULT) ) {
            	        alt71=1;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // InternalGo.g:2568:5: this_OP_MULT_1= RULE_OP_MULT
            	            {
            	            this_OP_MULT_1=(Token)match(input,RULE_OP_MULT,FOLLOW_60); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_OP_MULT_1);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_OP_MULT_1, grammarAccess.getMultiplicationAccess().getOP_MULTTerminalRuleCall_1_0());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getMultiplicationAccess().getNumberLiteralParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_66);
            	    this_NumberLiteral_2=ruleNumberLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_NumberLiteral_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalGo.g:2591:1: entryRuleNumberLiteral returns [String current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final String entryRuleNumberLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberLiteral = null;


        try {
            // InternalGo.g:2591:53: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalGo.g:2592:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalGo.g:2598:1: ruleNumberLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumberLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGo.g:2604:2: (this_INT_0= RULE_INT )
            // InternalGo.g:2605:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getNumberLiteralAccess().getINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleTypeName"
    // InternalGo.g:2615:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // InternalGo.g:2615:48: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalGo.g:2616:2: iv_ruleTypeName= ruleTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // InternalGo.g:2622:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BASIC_TYPES_0= RULE_BASIC_TYPES | this_QualifiedIdent_1= ruleQualifiedIdent | this_ID_2= RULE_ID | this_Struct_3= ruleStruct ) ;
    public final AntlrDatatypeRuleToken ruleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BASIC_TYPES_0=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedIdent_1 = null;

        AntlrDatatypeRuleToken this_Struct_3 = null;



        	enterRule();

        try {
            // InternalGo.g:2628:2: ( (this_BASIC_TYPES_0= RULE_BASIC_TYPES | this_QualifiedIdent_1= ruleQualifiedIdent | this_ID_2= RULE_ID | this_Struct_3= ruleStruct ) )
            // InternalGo.g:2629:2: (this_BASIC_TYPES_0= RULE_BASIC_TYPES | this_QualifiedIdent_1= ruleQualifiedIdent | this_ID_2= RULE_ID | this_Struct_3= ruleStruct )
            {
            // InternalGo.g:2629:2: (this_BASIC_TYPES_0= RULE_BASIC_TYPES | this_QualifiedIdent_1= ruleQualifiedIdent | this_ID_2= RULE_ID | this_Struct_3= ruleStruct )
            int alt73=4;
            switch ( input.LA(1) ) {
            case RULE_BASIC_TYPES:
                {
                alt73=1;
                }
                break;
            case RULE_ID:
                {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==EOF||LA73_2==20||LA73_2==28) ) {
                    alt73=3;
                }
                else if ( (LA73_2==21) ) {
                    alt73=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt73=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalGo.g:2630:3: this_BASIC_TYPES_0= RULE_BASIC_TYPES
                    {
                    this_BASIC_TYPES_0=(Token)match(input,RULE_BASIC_TYPES,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BASIC_TYPES_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_BASIC_TYPES_0, grammarAccess.getTypeNameAccess().getBASIC_TYPESTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2638:3: this_QualifiedIdent_1= ruleQualifiedIdent
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeNameAccess().getQualifiedIdentParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_QualifiedIdent_1=ruleQualifiedIdent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_QualifiedIdent_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2649:3: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_2, grammarAccess.getTypeNameAccess().getIDTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:2657:3: this_Struct_3= ruleStruct
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeNameAccess().getStructParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Struct_3=ruleStruct();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Struct_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleQualifiedIdent"
    // InternalGo.g:2671:1: entryRuleQualifiedIdent returns [String current=null] : iv_ruleQualifiedIdent= ruleQualifiedIdent EOF ;
    public final String entryRuleQualifiedIdent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedIdent = null;


        try {
            // InternalGo.g:2671:54: (iv_ruleQualifiedIdent= ruleQualifiedIdent EOF )
            // InternalGo.g:2672:2: iv_ruleQualifiedIdent= ruleQualifiedIdent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedIdentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedIdent=ruleQualifiedIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedIdent.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedIdent"


    // $ANTLR start "ruleQualifiedIdent"
    // InternalGo.g:2678:1: ruleQualifiedIdent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedIdent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGo.g:2684:2: ( (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) )
            // InternalGo.g:2685:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            {
            // InternalGo.g:2685:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            // InternalGo.g:2686:3: this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedIdentAccess().getIDTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedIdentAccess().getFullStopKeyword_1());
              		
            }
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getQualifiedIdentAccess().getIDTerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedIdent"

    // $ANTLR start synpred28_InternalGo
    public final void synpred28_InternalGo_fragment() throws RecognitionException {   
        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_IdList_1 = null;


        // InternalGo.g:873:4: (this_ID_0= RULE_ID this_IdList_1= ruleIdList )
        // InternalGo.g:873:4: this_ID_0= RULE_ID this_IdList_1= ruleIdList
        {
        this_ID_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_IdList_1=ruleIdList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalGo

    // $ANTLR start synpred40_InternalGo
    public final void synpred40_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_Decl_0 = null;

        AntlrDatatypeRuleToken this_Assig_1 = null;

        AntlrDatatypeRuleToken this_Exp_2 = null;


        // InternalGo.g:1155:3: ( (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp ) kw= ';' )
        // InternalGo.g:1155:3: (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp ) kw= ';'
        {
        // InternalGo.g:1155:3: (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp )
        int alt83=3;
        alt83 = dfa83.predict(input);
        switch (alt83) {
            case 1 :
                // InternalGo.g:1156:4: this_Decl_0= ruleDecl
                {
                pushFollow(FOLLOW_15);
                this_Decl_0=ruleDecl();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalGo.g:1167:4: this_Assig_1= ruleAssig
                {
                pushFollow(FOLLOW_15);
                this_Assig_1=ruleAssig();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalGo.g:1178:4: this_Exp_2= ruleExp
                {
                if ( state.backtracking==0 ) {

                  				newCompositeNode(grammarAccess.getAndersonAccess().getExpParserRuleCall_0_2());
                  			
                }
                pushFollow(FOLLOW_15);
                this_Exp_2=ruleExp();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalGo

    // $ANTLR start synpred47_InternalGo
    public final void synpred47_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_Exp_1 = null;


        // InternalGo.g:1340:4: (this_Exp_1= ruleExp )
        // InternalGo.g:1340:4: this_Exp_1= ruleExp
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getReturnStmtAccess().getExpParserRuleCall_1());
          			
        }
        pushFollow(FOLLOW_2);
        this_Exp_1=ruleExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalGo

    // $ANTLR start synpred64_InternalGo
    public final void synpred64_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_Call_0 = null;


        // InternalGo.g:1867:3: (this_Call_0= ruleCall )
        // InternalGo.g:1867:3: this_Call_0= ruleCall
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getExpAccess().getCallParserRuleCall_0());
          		
        }
        pushFollow(FOLLOW_2);
        this_Call_0=ruleCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalGo

    // $ANTLR start synpred65_InternalGo
    public final void synpred65_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExpAux_1 = null;


        // InternalGo.g:1878:3: (this_ExpAux_1= ruleExpAux )
        // InternalGo.g:1878:3: this_ExpAux_1= ruleExpAux
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getExpAccess().getExpAuxParserRuleCall_1());
          		
        }
        pushFollow(FOLLOW_2);
        this_ExpAux_1=ruleExpAux();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalGo

    // $ANTLR start synpred66_InternalGo
    public final void synpred66_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExpJoin_3 = null;


        // InternalGo.g:1901:5: (this_ExpJoin_3= ruleExpJoin )
        // InternalGo.g:1901:5: this_ExpJoin_3= ruleExpJoin
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getExpAccess().getExpJoinParserRuleCall_2_1());
          				
        }
        pushFollow(FOLLOW_2);
        this_ExpJoin_3=ruleExpJoin();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_InternalGo

    // $ANTLR start synpred67_InternalGo
    public final void synpred67_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_BooleanExp_2 = null;

        AntlrDatatypeRuleToken this_ExpJoin_3 = null;


        // InternalGo.g:1889:3: ( (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? ) )
        // InternalGo.g:1889:3: (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? )
        {
        // InternalGo.g:1889:3: (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? )
        // InternalGo.g:1890:4: this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )?
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getExpAccess().getBooleanExpParserRuleCall_2_0());
          			
        }
        pushFollow(FOLLOW_56);
        this_BooleanExp_2=ruleBooleanExp();

        state._fsp--;
        if (state.failed) return ;
        // InternalGo.g:1900:4: (this_ExpJoin_3= ruleExpJoin )?
        int alt87=2;
        int LA87_0 = input.LA(1);

        if ( ((LA87_0>=RULE_OP_REL && LA87_0<=RULE_OP_MULT)||(LA87_0>=50 && LA87_0<=51)) ) {
            alt87=1;
        }
        switch (alt87) {
            case 1 :
                // InternalGo.g:1901:5: this_ExpJoin_3= ruleExpJoin
                {
                pushFollow(FOLLOW_2);
                this_ExpJoin_3=ruleExpJoin();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred67_InternalGo

    // $ANTLR start synpred68_InternalGo
    public final void synpred68_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExpJoin_5 = null;


        // InternalGo.g:1926:5: (this_ExpJoin_5= ruleExpJoin )
        // InternalGo.g:1926:5: this_ExpJoin_5= ruleExpJoin
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getExpAccess().getExpJoinParserRuleCall_3_1());
          				
        }
        pushFollow(FOLLOW_2);
        this_ExpJoin_5=ruleExpJoin();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalGo

    // $ANTLR start synpred69_InternalGo
    public final void synpred69_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_AritExp_4 = null;

        AntlrDatatypeRuleToken this_ExpJoin_5 = null;


        // InternalGo.g:1914:3: ( (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? ) )
        // InternalGo.g:1914:3: (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? )
        {
        // InternalGo.g:1914:3: (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? )
        // InternalGo.g:1915:4: this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )?
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getExpAccess().getAritExpParserRuleCall_3_0());
          			
        }
        pushFollow(FOLLOW_56);
        this_AritExp_4=ruleAritExp();

        state._fsp--;
        if (state.failed) return ;
        // InternalGo.g:1925:4: (this_ExpJoin_5= ruleExpJoin )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( ((LA88_0>=RULE_OP_REL && LA88_0<=RULE_OP_MULT)||(LA88_0>=50 && LA88_0<=51)) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // InternalGo.g:1926:5: this_ExpJoin_5= ruleExpJoin
                {
                pushFollow(FOLLOW_2);
                this_ExpJoin_5=ruleExpJoin();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred69_InternalGo

    // $ANTLR start synpred71_InternalGo
    public final void synpred71_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_RelExp_7 = null;


        // InternalGo.g:1947:3: (this_RelExp_7= ruleRelExp )
        // InternalGo.g:1947:3: this_RelExp_7= ruleRelExp
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getExpAccess().getRelExpParserRuleCall_5());
          		
        }
        pushFollow(FOLLOW_2);
        this_RelExp_7=ruleRelExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_InternalGo

    // $ANTLR start synpred72_InternalGo
    public final void synpred72_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExpJoin_9 = null;


        // InternalGo.g:1967:5: (this_ExpJoin_9= ruleExpJoin )
        // InternalGo.g:1967:5: this_ExpJoin_9= ruleExpJoin
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getExpAccess().getExpJoinParserRuleCall_6_1());
          				
        }
        pushFollow(FOLLOW_2);
        this_ExpJoin_9=ruleExpJoin();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_InternalGo

    // $ANTLR start synpred76_InternalGo
    public final void synpred76_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExpJoin_4 = null;


        // InternalGo.g:2077:4: (this_ExpJoin_4= ruleExpJoin )
        // InternalGo.g:2077:4: this_ExpJoin_4= ruleExpJoin
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getExpAuxAccess().getExpJoinParserRuleCall_4());
          			
        }
        pushFollow(FOLLOW_2);
        this_ExpJoin_4=ruleExpJoin();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_InternalGo

    // $ANTLR start synpred87_InternalGo
    public final void synpred87_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_And_3 = null;


        // InternalGo.g:2386:4: (kw= '||' this_And_3= ruleAnd )
        // InternalGo.g:2386:4: kw= '||' this_And_3= ruleAnd
        {
        kw=(Token)match(input,51,FOLLOW_62); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_And_3=ruleAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_InternalGo

    // $ANTLR start synpred88_InternalGo
    public final void synpred88_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_BooleanLiteral_2 = null;


        // InternalGo.g:2432:4: (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )
        // InternalGo.g:2432:4: kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral
        {
        kw=(Token)match(input,50,FOLLOW_62); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_BooleanLiteral_2=ruleBooleanLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred88_InternalGo

    // $ANTLR start synpred90_InternalGo
    public final void synpred90_InternalGo_fragment() throws RecognitionException {   
        Token this_OP_SUM_0=null;
        AntlrDatatypeRuleToken this_Multiplication_1 = null;


        // InternalGo.g:2518:3: ( (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication )
        // InternalGo.g:2518:3: (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication
        {
        // InternalGo.g:2518:3: (this_OP_SUM_0= RULE_OP_SUM )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_OP_SUM) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // InternalGo.g:2519:4: this_OP_SUM_0= RULE_OP_SUM
                {
                this_OP_SUM_0=(Token)match(input,RULE_OP_SUM,FOLLOW_60); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_2);
        this_Multiplication_1=ruleMultiplication();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred90_InternalGo

    // $ANTLR start synpred92_InternalGo
    public final void synpred92_InternalGo_fragment() throws RecognitionException {   
        Token this_OP_MULT_1=null;
        AntlrDatatypeRuleToken this_NumberLiteral_2 = null;


        // InternalGo.g:2567:4: ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )
        // InternalGo.g:2567:4: (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral
        {
        // InternalGo.g:2567:4: (this_OP_MULT_1= RULE_OP_MULT )?
        int alt91=2;
        int LA91_0 = input.LA(1);

        if ( (LA91_0==RULE_OP_MULT) ) {
            alt91=1;
        }
        switch (alt91) {
            case 1 :
                // InternalGo.g:2568:5: this_OP_MULT_1= RULE_OP_MULT
                {
                this_OP_MULT_1=(Token)match(input,RULE_OP_MULT,FOLLOW_60); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_2);
        this_NumberLiteral_2=ruleNumberLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred92_InternalGo

    // Delegated rules

    public final boolean synpred76_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred90_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA83 dfa83 = new DFA83(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\4\1\7\2\uffff\2\4\1\7";
    static final String dfa_3s = "\1\61\1\63\2\uffff\2\61\1\63";
    static final String dfa_4s = "\2\uffff\1\1\1\2\3\uffff";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\3\uffff\1\2\1\uffff\2\2\4\uffff\1\3\1\uffff\1\2\25\uffff\2\3\6\uffff\1\2",
            "\4\2\10\uffff\1\2\1\uffff\1\2\2\uffff\1\5\2\2\1\uffff\1\4\2\uffff\1\2\22\uffff\2\2",
            "",
            "",
            "\1\6\1\2\3\uffff\1\2\1\uffff\2\2\6\uffff\1\2\35\uffff\1\2",
            "\2\3\3\uffff\1\3\1\uffff\2\3\6\uffff\1\3\6\uffff\1\2\26\uffff\1\3",
            "\4\2\10\uffff\1\2\1\uffff\1\2\2\uffff\1\5\1\2\2\uffff\1\4\25\uffff\2\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "418:3: ( (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? ) | this_ForClause_3= ruleForClause )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\12\13\uffff";
    static final String dfa_9s = "\1\4\1\0\2\uffff\6\0\2\uffff";
    static final String dfa_10s = "\1\61\1\0\2\uffff\6\0\2\uffff";
    static final String dfa_11s = "\2\uffff\1\1\7\uffff\1\2\1\uffff";
    static final String dfa_12s = "\1\uffff\1\0\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\11\3\uffff\1\7\1\uffff\1\6\1\10\6\uffff\1\5\13\uffff\1\12\11\uffff\2\2\6\uffff\1\4",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1154:2: ( (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp ) kw= ';' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_4 = input.LA(1);

                         
                        int index37_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index37_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_5 = input.LA(1);

                         
                        int index37_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index37_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_6 = input.LA(1);

                         
                        int index37_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index37_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA37_7 = input.LA(1);

                         
                        int index37_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index37_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA37_8 = input.LA(1);

                         
                        int index37_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index37_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA37_9 = input.LA(1);

                         
                        int index37_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index37_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\1\4\1\7\2\uffff\1\4\1\uffff\1\30";
    static final String dfa_15s = "\1\61\1\63\2\uffff\1\4\1\uffff\1\34";
    static final String dfa_16s = "\2\uffff\1\1\1\3\1\uffff\1\2\1\uffff";
    static final String[] dfa_17s = {
            "\1\1\1\3\3\uffff\1\3\1\uffff\2\3\6\uffff\1\3\25\uffff\2\2\6\uffff\1\3",
            "\4\3\6\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\2\1\5\2\uffff\1\4\16\uffff\6\5\1\uffff\2\3",
            "",
            "",
            "\1\6",
            "",
            "\1\2\1\5\2\uffff\1\4"
    };
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_5;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "1155:3: (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp )";
        }
    }
    static final String dfa_18s = "\25\uffff";
    static final String dfa_19s = "\1\10\24\uffff";
    static final String dfa_20s = "\1\4\7\0\15\uffff";
    static final String dfa_21s = "\1\61\7\0\15\uffff";
    static final String dfa_22s = "\10\uffff\1\2\13\uffff\1\1";
    static final String dfa_23s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\15\uffff}>";
    static final String[] dfa_24s = {
            "\1\1\1\7\3\uffff\1\5\1\uffff\1\4\1\6\4\uffff\1\10\1\uffff\1\3\3\uffff\1\10\6\uffff\1\10\1\uffff\5\10\1\uffff\1\10\2\uffff\2\10\6\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_18;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1339:3: (this_Exp_1= ruleExp )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalGo()) ) {s = 20;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalGo()) ) {s = 20;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_3 = input.LA(1);

                         
                        int index41_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalGo()) ) {s = 20;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index41_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA41_4 = input.LA(1);

                         
                        int index41_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalGo()) ) {s = 20;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index41_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA41_5 = input.LA(1);

                         
                        int index41_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalGo()) ) {s = 20;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index41_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA41_6 = input.LA(1);

                         
                        int index41_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalGo()) ) {s = 20;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index41_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA41_7 = input.LA(1);

                         
                        int index41_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalGo()) ) {s = 20;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index41_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_25s = "\1\4\2\0\1\uffff\1\0\1\uffff\1\0\5\uffff";
    static final String dfa_26s = "\1\61\2\0\1\uffff\1\0\1\uffff\1\0\5\uffff";
    static final String dfa_27s = "\3\uffff\1\2\1\uffff\1\4\1\uffff\1\5\1\1\1\7\1\3\1\6";
    static final String dfa_28s = "\1\uffff\1\0\1\1\1\uffff\1\2\1\uffff\1\3\5\uffff}>";
    static final String[] dfa_29s = {
            "\1\1\1\7\3\uffff\1\5\1\uffff\1\4\1\6\6\uffff\1\3\35\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_27;
            this.special = dfa_28;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "1866:2: (this_Call_0= ruleCall | this_ExpAux_1= ruleExpAux | (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? ) | (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? ) | this_STRING_6= RULE_STRING | this_RelExp_7= ruleRelExp | (this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalGo()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_2 = input.LA(1);

                         
                        int index57_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 3;}

                        else if ( (synpred67_InternalGo()) ) {s = 10;}

                         
                        input.seek(index57_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA57_4 = input.LA(1);

                         
                        int index57_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalGo()) ) {s = 10;}

                        else if ( (synpred71_InternalGo()) ) {s = 11;}

                         
                        input.seek(index57_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA57_6 = input.LA(1);

                         
                        int index57_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalGo()) ) {s = 5;}

                        else if ( (synpred71_InternalGo()) ) {s = 11;}

                         
                        input.seek(index57_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_30s = "\1\uffff\1\3\5\uffff";
    static final String dfa_31s = "\2\4\2\uffff\1\4\1\uffff\1\30";
    static final String[] dfa_32s = {
            "\1\1\1\3\3\uffff\1\3\1\uffff\2\3\6\uffff\1\3\25\uffff\2\2\6\uffff\1\3",
            "\2\3\1\uffff\6\3\4\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\2\1\5\2\uffff\1\4\1\uffff\7\3\1\uffff\1\3\2\uffff\2\3\6\5\3\3",
            "",
            "",
            "\1\6",
            "",
            "\1\2\1\5\2\uffff\1\4"
    };
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_1;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_5;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "1997:2: (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp )";
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_5;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "1155:3: (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000068008060012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000068008040012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000068008020012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000068008000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000280030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000320030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00020600000A1A30L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000097000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00020000000A1A30L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0002060000081A32L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000000081A30L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000097000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010020100050L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010020000050L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010030000050L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002060080081A30L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002065040881A32L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00020650408A1A32L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002060000081A30L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001097000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002065440881A30L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00020654408A1A30L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000081A32L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000410000050L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000410020050L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0001F80012000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x000C000000000782L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0002000000181A30L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0002000000000800L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000001602L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000200000L});

}