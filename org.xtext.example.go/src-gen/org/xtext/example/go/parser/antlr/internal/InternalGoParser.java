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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_TYPE", "RULE_OP_REL", "RULE_OP_UNARY", "RULE_OP_SUM", "RULE_OP_MULT", "RULE_BOOL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'import'", "'('", "')'", "'.'", "'package'", "'for'", "':='", "'='", "'range'", "'func'", "','", "'...'", "'switch'", "'{'", "'case'", "'default'", "'}'", "':'", "'if'", "'else'", "'return'", "'var'", "'const'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'!'", "'&&'", "'||'"
    };
    public static final int RULE_OP_SUM=9;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_OP_MULT=10;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int RULE_TYPE=6;
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

                if ( (LA6_0==27||(LA6_0>=39 && LA6_0<=40)) ) {
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
    // InternalGo.g:214:1: ruleTopLevelDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Decl_0= ruleDecl | this_FuncDecl_1= ruleFuncDecl ) ;
    public final AntlrDatatypeRuleToken ruleTopLevelDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Decl_0 = null;

        AntlrDatatypeRuleToken this_FuncDecl_1 = null;



        	enterRule();

        try {
            // InternalGo.g:220:2: ( (this_Decl_0= ruleDecl | this_FuncDecl_1= ruleFuncDecl ) )
            // InternalGo.g:221:2: (this_Decl_0= ruleDecl | this_FuncDecl_1= ruleFuncDecl )
            {
            // InternalGo.g:221:2: (this_Decl_0= ruleDecl | this_FuncDecl_1= ruleFuncDecl )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=39 && LA7_0<=40)) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
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
    // InternalGo.g:247:1: entryRuleImportDecl returns [String current=null] : iv_ruleImportDecl= ruleImportDecl EOF ;
    public final String entryRuleImportDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportDecl = null;


        try {
            // InternalGo.g:247:50: (iv_ruleImportDecl= ruleImportDecl EOF )
            // InternalGo.g:248:2: iv_ruleImportDecl= ruleImportDecl EOF
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
    // InternalGo.g:254:1: ruleImportDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleImportDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ImportSpec_1 = null;

        AntlrDatatypeRuleToken this_ImportSpec_3 = null;



        	enterRule();

        try {
            // InternalGo.g:260:2: ( (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) ) ) )
            // InternalGo.g:261:2: (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) ) )
            {
            // InternalGo.g:261:2: (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) ) )
            // InternalGo.g:262:3: kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) )
            {
            kw=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getImportDeclAccess().getImportKeyword_0());
              		
            }
            // InternalGo.g:267:3: (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) )
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
                    // InternalGo.g:268:4: this_ImportSpec_1= ruleImportSpec
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
                    // InternalGo.g:279:4: (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' )
                    {
                    // InternalGo.g:279:4: (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' )
                    // InternalGo.g:280:5: kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')'
                    {
                    kw=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getImportDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalGo.g:285:5: (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGo.g:286:6: this_ImportSpec_3= ruleImportSpec (kw= ';' )?
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
                    	    // InternalGo.g:296:6: (kw= ';' )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==17) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // InternalGo.g:297:7: kw= ';'
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
    // InternalGo.g:315:1: entryRuleImportSpec returns [String current=null] : iv_ruleImportSpec= ruleImportSpec EOF ;
    public final String entryRuleImportSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportSpec = null;


        try {
            // InternalGo.g:315:50: (iv_ruleImportSpec= ruleImportSpec EOF )
            // InternalGo.g:316:2: iv_ruleImportSpec= ruleImportSpec EOF
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
    // InternalGo.g:322:1: ruleImportSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' | this_ID_1= RULE_ID )? this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleImportSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalGo.g:328:2: ( ( (kw= '.' | this_ID_1= RULE_ID )? this_STRING_2= RULE_STRING ) )
            // InternalGo.g:329:2: ( (kw= '.' | this_ID_1= RULE_ID )? this_STRING_2= RULE_STRING )
            {
            // InternalGo.g:329:2: ( (kw= '.' | this_ID_1= RULE_ID )? this_STRING_2= RULE_STRING )
            // InternalGo.g:330:3: (kw= '.' | this_ID_1= RULE_ID )? this_STRING_2= RULE_STRING
            {
            // InternalGo.g:330:3: (kw= '.' | this_ID_1= RULE_ID )?
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
                    // InternalGo.g:331:4: kw= '.'
                    {
                    kw=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getImportSpecAccess().getFullStopKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:337:4: this_ID_1= RULE_ID
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
    // InternalGo.g:356:1: entryRulePackage returns [String current=null] : iv_rulePackage= rulePackage EOF ;
    public final String entryRulePackage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage = null;


        try {
            // InternalGo.g:356:47: (iv_rulePackage= rulePackage EOF )
            // InternalGo.g:357:2: iv_rulePackage= rulePackage EOF
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
    // InternalGo.g:363:1: rulePackage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken rulePackage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGo.g:369:2: ( (kw= 'package' this_ID_1= RULE_ID ) )
            // InternalGo.g:370:2: (kw= 'package' this_ID_1= RULE_ID )
            {
            // InternalGo.g:370:2: (kw= 'package' this_ID_1= RULE_ID )
            // InternalGo.g:371:3: kw= 'package' this_ID_1= RULE_ID
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
    // InternalGo.g:387:1: entryRuleForStmt returns [String current=null] : iv_ruleForStmt= ruleForStmt EOF ;
    public final String entryRuleForStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForStmt = null;


        try {
            // InternalGo.g:387:47: (iv_ruleForStmt= ruleForStmt EOF )
            // InternalGo.g:388:2: iv_ruleForStmt= ruleForStmt EOF
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
    // InternalGo.g:394:1: ruleForStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'for' ( (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? ) | this_ForClause_3= ruleForClause ) this_Block_4= ruleBlock ) ;
    public final AntlrDatatypeRuleToken ruleForStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_1 = null;

        AntlrDatatypeRuleToken this_RangeClause_2 = null;

        AntlrDatatypeRuleToken this_ForClause_3 = null;

        AntlrDatatypeRuleToken this_Block_4 = null;



        	enterRule();

        try {
            // InternalGo.g:400:2: ( (kw= 'for' ( (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? ) | this_ForClause_3= ruleForClause ) this_Block_4= ruleBlock ) )
            // InternalGo.g:401:2: (kw= 'for' ( (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? ) | this_ForClause_3= ruleForClause ) this_Block_4= ruleBlock )
            {
            // InternalGo.g:401:2: (kw= 'for' ( (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? ) | this_ForClause_3= ruleForClause ) this_Block_4= ruleBlock )
            // InternalGo.g:402:3: kw= 'for' ( (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? ) | this_ForClause_3= ruleForClause ) this_Block_4= ruleBlock
            {
            kw=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getForStmtAccess().getForKeyword_0());
              		
            }
            // InternalGo.g:407:3: ( (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? ) | this_ForClause_3= ruleForClause )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)||LA13_0==RULE_OP_SUM||(LA13_0>=RULE_BOOL && LA13_0<=RULE_INT)||LA13_0==47) ) {
                alt13=1;
            }
            else if ( (LA13_0==17||(LA13_0>=39 && LA13_0<=40)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGo.g:408:4: (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? )
                    {
                    // InternalGo.g:408:4: (this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )? )
                    // InternalGo.g:409:5: this_Exp_1= ruleExp (this_RangeClause_2= ruleRangeClause )?
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
                    // InternalGo.g:419:5: (this_RangeClause_2= ruleRangeClause )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=24 && LA12_0<=26)||LA12_0==28) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGo.g:420:6: this_RangeClause_2= ruleRangeClause
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
                    // InternalGo.g:433:4: this_ForClause_3= ruleForClause
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
    // InternalGo.g:458:1: entryRuleForClause returns [String current=null] : iv_ruleForClause= ruleForClause EOF ;
    public final String entryRuleForClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForClause = null;


        try {
            // InternalGo.g:458:49: (iv_ruleForClause= ruleForClause EOF )
            // InternalGo.g:459:2: iv_ruleForClause= ruleForClause EOF
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
    // InternalGo.g:465:1: ruleForClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Decl_0= ruleDecl )? kw= ';' (this_Exp_2= ruleExp )? kw= ';' (this_SimpleStmt_4= ruleSimpleStmt )? ) ;
    public final AntlrDatatypeRuleToken ruleForClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Decl_0 = null;

        AntlrDatatypeRuleToken this_Exp_2 = null;

        AntlrDatatypeRuleToken this_SimpleStmt_4 = null;



        	enterRule();

        try {
            // InternalGo.g:471:2: ( ( (this_Decl_0= ruleDecl )? kw= ';' (this_Exp_2= ruleExp )? kw= ';' (this_SimpleStmt_4= ruleSimpleStmt )? ) )
            // InternalGo.g:472:2: ( (this_Decl_0= ruleDecl )? kw= ';' (this_Exp_2= ruleExp )? kw= ';' (this_SimpleStmt_4= ruleSimpleStmt )? )
            {
            // InternalGo.g:472:2: ( (this_Decl_0= ruleDecl )? kw= ';' (this_Exp_2= ruleExp )? kw= ';' (this_SimpleStmt_4= ruleSimpleStmt )? )
            // InternalGo.g:473:3: (this_Decl_0= ruleDecl )? kw= ';' (this_Exp_2= ruleExp )? kw= ';' (this_SimpleStmt_4= ruleSimpleStmt )?
            {
            // InternalGo.g:473:3: (this_Decl_0= ruleDecl )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=39 && LA14_0<=40)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGo.g:474:4: this_Decl_0= ruleDecl
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
            // InternalGo.g:490:3: (this_Exp_2= ruleExp )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||LA15_0==RULE_OP_SUM||(LA15_0>=RULE_BOOL && LA15_0<=RULE_INT)||LA15_0==47) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGo.g:491:4: this_Exp_2= ruleExp
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
            // InternalGo.g:507:3: (this_SimpleStmt_4= ruleSimpleStmt )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==RULE_OP_SUM||(LA16_0>=RULE_BOOL && LA16_0<=RULE_INT)||(LA16_0>=39 && LA16_0<=40)||LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGo.g:508:4: this_SimpleStmt_4= ruleSimpleStmt
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
    // InternalGo.g:523:1: entryRuleRangeClause returns [String current=null] : iv_ruleRangeClause= ruleRangeClause EOF ;
    public final String entryRuleRangeClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRangeClause = null;


        try {
            // InternalGo.g:523:51: (iv_ruleRangeClause= ruleRangeClause EOF )
            // InternalGo.g:524:2: iv_ruleRangeClause= ruleRangeClause EOF
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
    // InternalGo.g:530:1: ruleRangeClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )? kw= 'range' this_Exp_4= ruleExp ) ;
    public final AntlrDatatypeRuleToken ruleRangeClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpList_0 = null;

        AntlrDatatypeRuleToken this_Exp_4 = null;



        	enterRule();

        try {
            // InternalGo.g:536:2: ( ( (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )? kw= 'range' this_Exp_4= ruleExp ) )
            // InternalGo.g:537:2: ( (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )? kw= 'range' this_Exp_4= ruleExp )
            {
            // InternalGo.g:537:2: ( (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )? kw= 'range' this_Exp_4= ruleExp )
            // InternalGo.g:538:3: (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )? kw= 'range' this_Exp_4= ruleExp
            {
            // InternalGo.g:538:3: (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==EOF||(LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||LA18_0==RULE_OP_SUM||(LA18_0>=RULE_BOOL && LA18_0<=RULE_INT)||LA18_0==17||LA18_0==20||(LA18_0>=22 && LA18_0<=25)||(LA18_0>=27 && LA18_0<=28)||(LA18_0>=30 && LA18_0<=36)||(LA18_0>=38 && LA18_0<=40)||LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGo.g:539:4: this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' )
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
                    // InternalGo.g:549:4: (kw= ':=' | kw= '=' )
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
                            // InternalGo.g:550:5: kw= ':='
                            {
                            kw=(Token)match(input,24,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRangeClauseAccess().getColonEqualsSignKeyword_0_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:556:5: kw= '='
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
    // InternalGo.g:582:1: entryRuleFuncDecl returns [String current=null] : iv_ruleFuncDecl= ruleFuncDecl EOF ;
    public final String entryRuleFuncDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFuncDecl = null;


        try {
            // InternalGo.g:582:48: (iv_ruleFuncDecl= ruleFuncDecl EOF )
            // InternalGo.g:583:2: iv_ruleFuncDecl= ruleFuncDecl EOF
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
    // InternalGo.g:589:1: ruleFuncDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'func' this_ID_1= RULE_ID this_Signature_2= ruleSignature (this_Block_3= ruleBlock )? ) ;
    public final AntlrDatatypeRuleToken ruleFuncDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_Signature_2 = null;

        AntlrDatatypeRuleToken this_Block_3 = null;



        	enterRule();

        try {
            // InternalGo.g:595:2: ( (kw= 'func' this_ID_1= RULE_ID this_Signature_2= ruleSignature (this_Block_3= ruleBlock )? ) )
            // InternalGo.g:596:2: (kw= 'func' this_ID_1= RULE_ID this_Signature_2= ruleSignature (this_Block_3= ruleBlock )? )
            {
            // InternalGo.g:596:2: (kw= 'func' this_ID_1= RULE_ID this_Signature_2= ruleSignature (this_Block_3= ruleBlock )? )
            // InternalGo.g:597:3: kw= 'func' this_ID_1= RULE_ID this_Signature_2= ruleSignature (this_Block_3= ruleBlock )?
            {
            kw=(Token)match(input,27,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFuncDeclAccess().getFuncKeyword_0());
              		
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_1, grammarAccess.getFuncDeclAccess().getIDTerminalRuleCall_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFuncDeclAccess().getSignatureParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_22);
            this_Signature_2=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Signature_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:619:3: (this_Block_3= ruleBlock )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGo.g:620:4: this_Block_3= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFuncDeclAccess().getBlockParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Block_3=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Block_3);
                      			
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


    // $ANTLR start "entryRuleSignature"
    // InternalGo.g:635:1: entryRuleSignature returns [String current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final String entryRuleSignature() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignature = null;


        try {
            // InternalGo.g:635:49: (iv_ruleSignature= ruleSignature EOF )
            // InternalGo.g:636:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalGo.g:642:1: ruleSignature returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Parameters_0= ruleParameters (this_Result_1= ruleResult )? ) ;
    public final AntlrDatatypeRuleToken ruleSignature() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;

        AntlrDatatypeRuleToken this_Result_1 = null;



        	enterRule();

        try {
            // InternalGo.g:648:2: ( (this_Parameters_0= ruleParameters (this_Result_1= ruleResult )? ) )
            // InternalGo.g:649:2: (this_Parameters_0= ruleParameters (this_Result_1= ruleResult )? )
            {
            // InternalGo.g:649:2: (this_Parameters_0= ruleParameters (this_Result_1= ruleResult )? )
            // InternalGo.g:650:3: this_Parameters_0= ruleParameters (this_Result_1= ruleResult )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSignatureAccess().getParametersParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            this_Parameters_0=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Parameters_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:660:3: (this_Result_1= ruleResult )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_TYPE||LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGo.g:661:4: this_Result_1= ruleResult
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
    // InternalGo.g:676:1: entryRuleResult returns [String current=null] : iv_ruleResult= ruleResult EOF ;
    public final String entryRuleResult() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResult = null;


        try {
            // InternalGo.g:676:46: (iv_ruleResult= ruleResult EOF )
            // InternalGo.g:677:2: iv_ruleResult= ruleResult EOF
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
    // InternalGo.g:683:1: ruleResult returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Parameters_0= ruleParameters | this_TYPE_1= RULE_TYPE ) ;
    public final AntlrDatatypeRuleToken ruleResult() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TYPE_1=null;
        AntlrDatatypeRuleToken this_Parameters_0 = null;



        	enterRule();

        try {
            // InternalGo.g:689:2: ( (this_Parameters_0= ruleParameters | this_TYPE_1= RULE_TYPE ) )
            // InternalGo.g:690:2: (this_Parameters_0= ruleParameters | this_TYPE_1= RULE_TYPE )
            {
            // InternalGo.g:690:2: (this_Parameters_0= ruleParameters | this_TYPE_1= RULE_TYPE )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_TYPE) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:691:3: this_Parameters_0= ruleParameters
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
                    // InternalGo.g:702:3: this_TYPE_1= RULE_TYPE
                    {
                    this_TYPE_1=(Token)match(input,RULE_TYPE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TYPE_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TYPE_1, grammarAccess.getResultAccess().getTYPETerminalRuleCall_1());
                      		
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
    // InternalGo.g:713:1: entryRuleParameters returns [String current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final String entryRuleParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameters = null;


        try {
            // InternalGo.g:713:50: (iv_ruleParameters= ruleParameters EOF )
            // InternalGo.g:714:2: iv_ruleParameters= ruleParameters EOF
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
    // InternalGo.g:720:1: ruleParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterList_1 = null;



        	enterRule();

        try {
            // InternalGo.g:726:2: ( (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' ) )
            // InternalGo.g:727:2: (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' )
            {
            // InternalGo.g:727:2: (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' )
            // InternalGo.g:728:3: kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')'
            {
            kw=(Token)match(input,19,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getParametersAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGo.g:733:3: (this_ParameterList_1= ruleParameterList (kw= ',' )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==RULE_TYPE||LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGo.g:734:4: this_ParameterList_1= ruleParameterList (kw= ',' )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParametersAccess().getParameterListParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_25);
                    this_ParameterList_1=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ParameterList_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:744:4: (kw= ',' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==28) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalGo.g:745:5: kw= ','
                            {
                            kw=(Token)match(input,28,FOLLOW_26); if (state.failed) return current;
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
    // InternalGo.g:761:1: entryRuleParameterList returns [String current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final String entryRuleParameterList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterList = null;


        try {
            // InternalGo.g:761:53: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalGo.g:762:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalGo.g:768:1: ruleParameterList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* ) ;
    public final AntlrDatatypeRuleToken ruleParameterList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDecl_0 = null;

        AntlrDatatypeRuleToken this_ParameterDecl_2 = null;



        	enterRule();

        try {
            // InternalGo.g:774:2: ( (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* ) )
            // InternalGo.g:775:2: (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* )
            {
            // InternalGo.g:775:2: (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* )
            // InternalGo.g:776:3: this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameterListAccess().getParameterDeclParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_ParameterDecl_0=ruleParameterDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ParameterDecl_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:786:3: (kw= ',' this_ParameterDecl_2= ruleParameterDecl )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==28) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==RULE_ID||LA24_1==RULE_TYPE||LA24_1==29) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // InternalGo.g:787:4: kw= ',' this_ParameterDecl_2= ruleParameterDecl
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getParameterListAccess().getParameterDeclParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_27);
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
            	    break loop24;
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
    // InternalGo.g:807:1: entryRuleParameterDecl returns [String current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final String entryRuleParameterDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDecl = null;


        try {
            // InternalGo.g:807:53: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // InternalGo.g:808:2: iv_ruleParameterDecl= ruleParameterDecl EOF
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
    // InternalGo.g:814:1: ruleParameterDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID this_IdList_1= ruleIdList )? (kw= '...' )? this_TYPE_3= RULE_TYPE ) ;
    public final AntlrDatatypeRuleToken ruleParameterDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_TYPE_3=null;
        AntlrDatatypeRuleToken this_IdList_1 = null;



        	enterRule();

        try {
            // InternalGo.g:820:2: ( ( (this_ID_0= RULE_ID this_IdList_1= ruleIdList )? (kw= '...' )? this_TYPE_3= RULE_TYPE ) )
            // InternalGo.g:821:2: ( (this_ID_0= RULE_ID this_IdList_1= ruleIdList )? (kw= '...' )? this_TYPE_3= RULE_TYPE )
            {
            // InternalGo.g:821:2: ( (this_ID_0= RULE_ID this_IdList_1= ruleIdList )? (kw= '...' )? this_TYPE_3= RULE_TYPE )
            // InternalGo.g:822:3: (this_ID_0= RULE_ID this_IdList_1= ruleIdList )? (kw= '...' )? this_TYPE_3= RULE_TYPE
            {
            // InternalGo.g:822:3: (this_ID_0= RULE_ID this_IdList_1= ruleIdList )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGo.g:823:4: this_ID_0= RULE_ID this_IdList_1= ruleIdList
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_0, grammarAccess.getParameterDeclAccess().getIDTerminalRuleCall_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParameterDeclAccess().getIdListParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_30);
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

            // InternalGo.g:841:3: (kw= '...' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGo.g:842:4: kw= '...'
                    {
                    kw=(Token)match(input,29,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getParameterDeclAccess().getFullStopFullStopFullStopKeyword_1());
                      			
                    }

                    }
                    break;

            }

            this_TYPE_3=(Token)match(input,RULE_TYPE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TYPE_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TYPE_3, grammarAccess.getParameterDeclAccess().getTYPETerminalRuleCall_2());
              		
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
    // InternalGo.g:859:1: entryRuleSwitchStmt returns [String current=null] : iv_ruleSwitchStmt= ruleSwitchStmt EOF ;
    public final String entryRuleSwitchStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSwitchStmt = null;


        try {
            // InternalGo.g:859:50: (iv_ruleSwitchStmt= ruleSwitchStmt EOF )
            // InternalGo.g:860:2: iv_ruleSwitchStmt= ruleSwitchStmt EOF
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
    // InternalGo.g:866:1: ruleSwitchStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'switch' this_Anderson_1= ruleAnderson (this_ID_2= RULE_ID )? kw= '{' ( (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )* (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )? ) kw= '}' ) ;
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
            // InternalGo.g:872:2: ( (kw= 'switch' this_Anderson_1= ruleAnderson (this_ID_2= RULE_ID )? kw= '{' ( (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )* (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )? ) kw= '}' ) )
            // InternalGo.g:873:2: (kw= 'switch' this_Anderson_1= ruleAnderson (this_ID_2= RULE_ID )? kw= '{' ( (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )* (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )? ) kw= '}' )
            {
            // InternalGo.g:873:2: (kw= 'switch' this_Anderson_1= ruleAnderson (this_ID_2= RULE_ID )? kw= '{' ( (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )* (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )? ) kw= '}' )
            // InternalGo.g:874:3: kw= 'switch' this_Anderson_1= ruleAnderson (this_ID_2= RULE_ID )? kw= '{' ( (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )* (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )? ) kw= '}'
            {
            kw=(Token)match(input,30,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSwitchStmtAccess().getSwitchKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSwitchStmtAccess().getAndersonParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_33);
            this_Anderson_1=ruleAnderson();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Anderson_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:889:3: (this_ID_2= RULE_ID )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGo.g:890:4: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getSwitchStmtAccess().getIDTerminalRuleCall_2());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSwitchStmtAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalGo.g:903:3: ( (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )* (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )? )
            // InternalGo.g:904:4: (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )* (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )?
            {
            // InternalGo.g:904:4: (kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==32) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGo.g:905:5: kw= 'case' this_Exp_5= ruleExp this_SwitchCase_6= ruleSwitchCase
            	    {
            	    kw=(Token)match(input,32,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getSwitchStmtAccess().getCaseKeyword_4_0_0());
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchStmtAccess().getExpParserRuleCall_4_0_1());
            	      				
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    pushFollow(FOLLOW_35);
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
            	    break loop28;
                }
            } while (true);

            // InternalGo.g:931:4: (kw= 'default' (this_SwitchCase_8= ruleSwitchCase )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGo.g:932:5: kw= 'default' (this_SwitchCase_8= ruleSwitchCase )*
                    {
                    kw=(Token)match(input,33,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getSwitchStmtAccess().getDefaultKeyword_4_1_0());
                      				
                    }
                    // InternalGo.g:937:5: (this_SwitchCase_8= ruleSwitchCase )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==35) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalGo.g:938:6: this_SwitchCase_8= ruleSwitchCase
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSwitchStmtAccess().getSwitchCaseParserRuleCall_4_1_1());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_37);
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
                    	    break loop29;
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
    // InternalGo.g:960:1: entryRuleSwitchCase returns [String current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final String entryRuleSwitchCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSwitchCase = null;


        try {
            // InternalGo.g:960:50: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // InternalGo.g:961:2: iv_ruleSwitchCase= ruleSwitchCase EOF
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
    // InternalGo.g:967:1: ruleSwitchCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' (this_Statement_1= ruleStatement (kw= ';' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleSwitchCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Statement_1 = null;



        	enterRule();

        try {
            // InternalGo.g:973:2: ( (kw= ':' (this_Statement_1= ruleStatement (kw= ';' )? )* ) )
            // InternalGo.g:974:2: (kw= ':' (this_Statement_1= ruleStatement (kw= ';' )? )* )
            {
            // InternalGo.g:974:2: (kw= ':' (this_Statement_1= ruleStatement (kw= ';' )? )* )
            // InternalGo.g:975:3: kw= ':' (this_Statement_1= ruleStatement (kw= ';' )? )*
            {
            kw=(Token)match(input,35,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSwitchCaseAccess().getColonKeyword_0());
              		
            }
            // InternalGo.g:980:3: (this_Statement_1= ruleStatement (kw= ';' )? )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_STRING)||LA32_0==RULE_OP_SUM||(LA32_0>=RULE_BOOL && LA32_0<=RULE_INT)||LA32_0==23||LA32_0==30||LA32_0==36||(LA32_0>=38 && LA32_0<=40)||LA32_0==47) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGo.g:981:4: this_Statement_1= ruleStatement (kw= ';' )?
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSwitchCaseAccess().getStatementParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_39);
            	    this_Statement_1=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Statement_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalGo.g:991:4: (kw= ';' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==17) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalGo.g:992:5: kw= ';'
            	            {
            	            kw=(Token)match(input,17,FOLLOW_38); if (state.failed) return current;
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
            	    break loop32;
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
    // InternalGo.g:1003:1: entryRuleIfStmt returns [String current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final String entryRuleIfStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIfStmt = null;


        try {
            // InternalGo.g:1003:46: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalGo.g:1004:2: iv_ruleIfStmt= ruleIfStmt EOF
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
    // InternalGo.g:1010:1: ruleIfStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'if' this_Anderson_1= ruleAnderson this_Exp_2= ruleExp this_Block_3= ruleBlock (kw= 'else' (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )? ) ;
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
            // InternalGo.g:1016:2: ( (kw= 'if' this_Anderson_1= ruleAnderson this_Exp_2= ruleExp this_Block_3= ruleBlock (kw= 'else' (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )? ) )
            // InternalGo.g:1017:2: (kw= 'if' this_Anderson_1= ruleAnderson this_Exp_2= ruleExp this_Block_3= ruleBlock (kw= 'else' (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )? )
            {
            // InternalGo.g:1017:2: (kw= 'if' this_Anderson_1= ruleAnderson this_Exp_2= ruleExp this_Block_3= ruleBlock (kw= 'else' (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )? )
            // InternalGo.g:1018:3: kw= 'if' this_Anderson_1= ruleAnderson this_Exp_2= ruleExp this_Block_3= ruleBlock (kw= 'else' (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )?
            {
            kw=(Token)match(input,36,FOLLOW_40); if (state.failed) return current;
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
            pushFollow(FOLLOW_41);
            this_Block_3=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Block_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1053:3: (kw= 'else' (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGo.g:1054:4: kw= 'else' (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock )
                    {
                    kw=(Token)match(input,37,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIfStmtAccess().getElseKeyword_4_0());
                      			
                    }
                    // InternalGo.g:1059:4: (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==36) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==31) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalGo.g:1060:5: this_IfStmt_5= ruleIfStmt
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
                            // InternalGo.g:1071:5: this_Block_6= ruleBlock
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
    // InternalGo.g:1087:1: entryRuleAnderson returns [String current=null] : iv_ruleAnderson= ruleAnderson EOF ;
    public final String entryRuleAnderson() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnderson = null;


        try {
            // InternalGo.g:1087:48: (iv_ruleAnderson= ruleAnderson EOF )
            // InternalGo.g:1088:2: iv_ruleAnderson= ruleAnderson EOF
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
    // InternalGo.g:1094:1: ruleAnderson returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Assig_0= ruleAssig | this_Decl_1= ruleDecl | this_Exp_2= ruleExp ) kw= ';' )? ;
    public final AntlrDatatypeRuleToken ruleAnderson() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Assig_0 = null;

        AntlrDatatypeRuleToken this_Decl_1 = null;

        AntlrDatatypeRuleToken this_Exp_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1100:2: ( ( (this_Assig_0= ruleAssig | this_Decl_1= ruleDecl | this_Exp_2= ruleExp ) kw= ';' )? )
            // InternalGo.g:1101:2: ( (this_Assig_0= ruleAssig | this_Decl_1= ruleDecl | this_Exp_2= ruleExp ) kw= ';' )?
            {
            // InternalGo.g:1101:2: ( (this_Assig_0= ruleAssig | this_Decl_1= ruleDecl | this_Exp_2= ruleExp ) kw= ';' )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalGo.g:1102:3: (this_Assig_0= ruleAssig | this_Decl_1= ruleDecl | this_Exp_2= ruleExp ) kw= ';'
                    {
                    // InternalGo.g:1102:3: (this_Assig_0= ruleAssig | this_Decl_1= ruleDecl | this_Exp_2= ruleExp )
                    int alt35=3;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        int LA35_1 = input.LA(2);

                        if ( (LA35_1==25||LA35_1==28||(LA35_1>=41 && LA35_1<=46)) ) {
                            alt35=1;
                        }
                        else if ( ((LA35_1>=RULE_OP_REL && LA35_1<=RULE_OP_MULT)||LA35_1==17||(LA35_1>=48 && LA35_1<=49)) ) {
                            alt35=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 35, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 39:
                    case 40:
                        {
                        alt35=2;
                        }
                        break;
                    case RULE_STRING:
                    case RULE_OP_SUM:
                    case RULE_BOOL:
                    case RULE_INT:
                    case 47:
                        {
                        alt35=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }

                    switch (alt35) {
                        case 1 :
                            // InternalGo.g:1103:4: this_Assig_0= ruleAssig
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getAndersonAccess().getAssigParserRuleCall_0_0());
                              			
                            }
                            pushFollow(FOLLOW_15);
                            this_Assig_0=ruleAssig();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(this_Assig_0);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:1114:4: this_Decl_1= ruleDecl
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getAndersonAccess().getDeclParserRuleCall_0_1());
                              			
                            }
                            pushFollow(FOLLOW_15);
                            this_Decl_1=ruleDecl();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(this_Decl_1);
                              			
                            }
                            if ( state.backtracking==0 ) {

                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 3 :
                            // InternalGo.g:1125:4: this_Exp_2= ruleExp
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
    // InternalGo.g:1145:1: entryRuleBlock returns [String current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final String entryRuleBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlock = null;


        try {
            // InternalGo.g:1145:45: (iv_ruleBlock= ruleBlock EOF )
            // InternalGo.g:1146:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalGo.g:1152:1: ruleBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' (this_Statement_1= ruleStatement (kw= ';' )? )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Statement_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1158:2: ( (kw= '{' (this_Statement_1= ruleStatement (kw= ';' )? )* kw= '}' ) )
            // InternalGo.g:1159:2: (kw= '{' (this_Statement_1= ruleStatement (kw= ';' )? )* kw= '}' )
            {
            // InternalGo.g:1159:2: (kw= '{' (this_Statement_1= ruleStatement (kw= ';' )? )* kw= '}' )
            // InternalGo.g:1160:3: kw= '{' (this_Statement_1= ruleStatement (kw= ';' )? )* kw= '}'
            {
            kw=(Token)match(input,31,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalGo.g:1165:3: (this_Statement_1= ruleStatement (kw= ';' )? )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_STRING)||LA38_0==RULE_OP_SUM||(LA38_0>=RULE_BOOL && LA38_0<=RULE_INT)||LA38_0==23||LA38_0==30||LA38_0==36||(LA38_0>=38 && LA38_0<=40)||LA38_0==47) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGo.g:1166:4: this_Statement_1= ruleStatement (kw= ';' )?
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getBlockAccess().getStatementParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_44);
            	    this_Statement_1=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Statement_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalGo.g:1176:4: (kw= ';' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==17) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalGo.g:1177:5: kw= ';'
            	            {
            	            kw=(Token)match(input,17,FOLLOW_43); if (state.failed) return current;
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
            	    break loop38;
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


    // $ANTLR start "entryRuleCall"
    // InternalGo.g:1193:1: entryRuleCall returns [String current=null] : iv_ruleCall= ruleCall EOF ;
    public final String entryRuleCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCall = null;


        try {
            // InternalGo.g:1193:44: (iv_ruleCall= ruleCall EOF )
            // InternalGo.g:1194:2: iv_ruleCall= ruleCall EOF
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
    // InternalGo.g:1200:1: ruleCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* kw= '(' (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_Exp_4 = null;

        AntlrDatatypeRuleToken this_ExpList_5 = null;



        	enterRule();

        try {
            // InternalGo.g:1206:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* kw= '(' (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )? kw= ')' ) )
            // InternalGo.g:1207:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* kw= '(' (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )? kw= ')' )
            {
            // InternalGo.g:1207:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* kw= '(' (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )? kw= ')' )
            // InternalGo.g:1208:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* kw= '(' (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )? kw= ')'
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getCallAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGo.g:1215:3: (kw= '.' this_ID_2= RULE_ID )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==21) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGo.g:1216:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getCallAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getCallAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            kw=(Token)match(input,19,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalGo.g:1234:3: (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_STRING)||LA40_0==RULE_OP_SUM||(LA40_0>=RULE_BOOL && LA40_0<=RULE_INT)||LA40_0==47) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGo.g:1235:4: this_Exp_4= ruleExp this_ExpList_5= ruleExpList
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallAccess().getExpParserRuleCall_3_0());
                      			
                    }
                    pushFollow(FOLLOW_25);
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
                    pushFollow(FOLLOW_26);
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


    // $ANTLR start "entryRuleSimpleStmt"
    // InternalGo.g:1265:1: entryRuleSimpleStmt returns [String current=null] : iv_ruleSimpleStmt= ruleSimpleStmt EOF ;
    public final String entryRuleSimpleStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleStmt = null;


        try {
            // InternalGo.g:1265:50: (iv_ruleSimpleStmt= ruleSimpleStmt EOF )
            // InternalGo.g:1266:2: iv_ruleSimpleStmt= ruleSimpleStmt EOF
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
    // InternalGo.g:1272:1: ruleSimpleStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp | this_Call_3= ruleCall ) ;
    public final AntlrDatatypeRuleToken ruleSimpleStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Decl_0 = null;

        AntlrDatatypeRuleToken this_Assig_1 = null;

        AntlrDatatypeRuleToken this_Exp_2 = null;

        AntlrDatatypeRuleToken this_Call_3 = null;



        	enterRule();

        try {
            // InternalGo.g:1278:2: ( (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp | this_Call_3= ruleCall ) )
            // InternalGo.g:1279:2: (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp | this_Call_3= ruleCall )
            {
            // InternalGo.g:1279:2: (this_Decl_0= ruleDecl | this_Assig_1= ruleAssig | this_Exp_2= ruleExp | this_Call_3= ruleCall )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
                {
                alt41=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case RULE_OP_REL:
                case RULE_OP_UNARY:
                case RULE_OP_SUM:
                case RULE_OP_MULT:
                case RULE_BOOL:
                case RULE_INT:
                case 17:
                case 23:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 38:
                case 39:
                case 40:
                case 47:
                case 48:
                case 49:
                    {
                    alt41=3;
                    }
                    break;
                case 19:
                case 21:
                    {
                    alt41=4;
                    }
                    break;
                case 25:
                case 28:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                    {
                    alt41=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
            case RULE_OP_SUM:
            case RULE_BOOL:
            case RULE_INT:
            case 47:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalGo.g:1280:3: this_Decl_0= ruleDecl
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
                    // InternalGo.g:1291:3: this_Assig_1= ruleAssig
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
                    // InternalGo.g:1302:3: this_Exp_2= ruleExp
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
                case 4 :
                    // InternalGo.g:1313:3: this_Call_3= ruleCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleStmtAccess().getCallParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Call_3=ruleCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Call_3);
                      		
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


    // $ANTLR start "entryRuleStatement"
    // InternalGo.g:1327:1: entryRuleStatement returns [String current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final String entryRuleStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement = null;


        try {
            // InternalGo.g:1327:49: (iv_ruleStatement= ruleStatement EOF )
            // InternalGo.g:1328:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalGo.g:1334:1: ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleStmt_0= ruleSimpleStmt | this_IfStmt_1= ruleIfStmt | this_SwitchStmt_2= ruleSwitchStmt | this_ReturnStmt_3= ruleReturnStmt | this_ForStmt_4= ruleForStmt ) ;
    public final AntlrDatatypeRuleToken ruleStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SimpleStmt_0 = null;

        AntlrDatatypeRuleToken this_IfStmt_1 = null;

        AntlrDatatypeRuleToken this_SwitchStmt_2 = null;

        AntlrDatatypeRuleToken this_ReturnStmt_3 = null;

        AntlrDatatypeRuleToken this_ForStmt_4 = null;



        	enterRule();

        try {
            // InternalGo.g:1340:2: ( (this_SimpleStmt_0= ruleSimpleStmt | this_IfStmt_1= ruleIfStmt | this_SwitchStmt_2= ruleSwitchStmt | this_ReturnStmt_3= ruleReturnStmt | this_ForStmt_4= ruleForStmt ) )
            // InternalGo.g:1341:2: (this_SimpleStmt_0= ruleSimpleStmt | this_IfStmt_1= ruleIfStmt | this_SwitchStmt_2= ruleSwitchStmt | this_ReturnStmt_3= ruleReturnStmt | this_ForStmt_4= ruleForStmt )
            {
            // InternalGo.g:1341:2: (this_SimpleStmt_0= ruleSimpleStmt | this_IfStmt_1= ruleIfStmt | this_SwitchStmt_2= ruleSwitchStmt | this_ReturnStmt_3= ruleReturnStmt | this_ForStmt_4= ruleForStmt )
            int alt42=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_OP_SUM:
            case RULE_BOOL:
            case RULE_INT:
            case 39:
            case 40:
            case 47:
                {
                alt42=1;
                }
                break;
            case 36:
                {
                alt42=2;
                }
                break;
            case 30:
                {
                alt42=3;
                }
                break;
            case 38:
                {
                alt42=4;
                }
                break;
            case 23:
                {
                alt42=5;
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
                    // InternalGo.g:1342:3: this_SimpleStmt_0= ruleSimpleStmt
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
                    // InternalGo.g:1353:3: this_IfStmt_1= ruleIfStmt
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
                    // InternalGo.g:1364:3: this_SwitchStmt_2= ruleSwitchStmt
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
                    // InternalGo.g:1375:3: this_ReturnStmt_3= ruleReturnStmt
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
                    // InternalGo.g:1386:3: this_ForStmt_4= ruleForStmt
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
    // InternalGo.g:1400:1: entryRuleReturnStmt returns [String current=null] : iv_ruleReturnStmt= ruleReturnStmt EOF ;
    public final String entryRuleReturnStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReturnStmt = null;


        try {
            // InternalGo.g:1400:50: (iv_ruleReturnStmt= ruleReturnStmt EOF )
            // InternalGo.g:1401:2: iv_ruleReturnStmt= ruleReturnStmt EOF
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
    // InternalGo.g:1407:1: ruleReturnStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'return' (this_Exp_1= ruleExp )? ) ;
    public final AntlrDatatypeRuleToken ruleReturnStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1413:2: ( (kw= 'return' (this_Exp_1= ruleExp )? ) )
            // InternalGo.g:1414:2: (kw= 'return' (this_Exp_1= ruleExp )? )
            {
            // InternalGo.g:1414:2: (kw= 'return' (this_Exp_1= ruleExp )? )
            // InternalGo.g:1415:3: kw= 'return' (this_Exp_1= ruleExp )?
            {
            kw=(Token)match(input,38,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getReturnStmtAccess().getReturnKeyword_0());
              		
            }
            // InternalGo.g:1420:3: (this_Exp_1= ruleExp )?
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // InternalGo.g:1421:4: this_Exp_1= ruleExp
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


    // $ANTLR start "entryRuleDecl"
    // InternalGo.g:1436:1: entryRuleDecl returns [String current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final String entryRuleDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecl = null;


        try {
            // InternalGo.g:1436:44: (iv_ruleDecl= ruleDecl EOF )
            // InternalGo.g:1437:2: iv_ruleDecl= ruleDecl EOF
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
    // InternalGo.g:1443:1: ruleDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'var' | kw= 'const' ) this_ID_2= RULE_ID this_IdList_3= ruleIdList this_TYPE_4= RULE_TYPE (kw= '=' this_Exp_6= ruleExp this_ExpList_7= ruleExpList )? ) ;
    public final AntlrDatatypeRuleToken ruleDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_TYPE_4=null;
        AntlrDatatypeRuleToken this_IdList_3 = null;

        AntlrDatatypeRuleToken this_Exp_6 = null;

        AntlrDatatypeRuleToken this_ExpList_7 = null;



        	enterRule();

        try {
            // InternalGo.g:1449:2: ( ( (kw= 'var' | kw= 'const' ) this_ID_2= RULE_ID this_IdList_3= ruleIdList this_TYPE_4= RULE_TYPE (kw= '=' this_Exp_6= ruleExp this_ExpList_7= ruleExpList )? ) )
            // InternalGo.g:1450:2: ( (kw= 'var' | kw= 'const' ) this_ID_2= RULE_ID this_IdList_3= ruleIdList this_TYPE_4= RULE_TYPE (kw= '=' this_Exp_6= ruleExp this_ExpList_7= ruleExpList )? )
            {
            // InternalGo.g:1450:2: ( (kw= 'var' | kw= 'const' ) this_ID_2= RULE_ID this_IdList_3= ruleIdList this_TYPE_4= RULE_TYPE (kw= '=' this_Exp_6= ruleExp this_ExpList_7= ruleExpList )? )
            // InternalGo.g:1451:3: (kw= 'var' | kw= 'const' ) this_ID_2= RULE_ID this_IdList_3= ruleIdList this_TYPE_4= RULE_TYPE (kw= '=' this_Exp_6= ruleExp this_ExpList_7= ruleExpList )?
            {
            // InternalGo.g:1451:3: (kw= 'var' | kw= 'const' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            else if ( (LA44_0==40) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalGo.g:1452:4: kw= 'var'
                    {
                    kw=(Token)match(input,39,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDeclAccess().getVarKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1458:4: kw= 'const'
                    {
                    kw=(Token)match(input,40,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDeclAccess().getConstKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getDeclAccess().getIDTerminalRuleCall_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDeclAccess().getIdListParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_31);
            this_IdList_3=ruleIdList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IdList_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_TYPE_4=(Token)match(input,RULE_TYPE,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TYPE_4);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TYPE_4, grammarAccess.getDeclAccess().getTYPETerminalRuleCall_3());
              		
            }
            // InternalGo.g:1488:3: (kw= '=' this_Exp_6= ruleExp this_ExpList_7= ruleExpList )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==25) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGo.g:1489:4: kw= '=' this_Exp_6= ruleExp this_ExpList_7= ruleExpList
                    {
                    kw=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDeclAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDeclAccess().getExpParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_50);
                    this_Exp_6=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Exp_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDeclAccess().getExpListParserRuleCall_4_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpList_7=ruleExpList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExpList_7);
                      			
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
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleAssig"
    // InternalGo.g:1519:1: entryRuleAssig returns [String current=null] : iv_ruleAssig= ruleAssig EOF ;
    public final String entryRuleAssig() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssig = null;


        try {
            // InternalGo.g:1519:45: (iv_ruleAssig= ruleAssig EOF )
            // InternalGo.g:1520:2: iv_ruleAssig= ruleAssig EOF
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
    // InternalGo.g:1526:1: ruleAssig returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList ) | (kw= '++' | kw= '--' ) | ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp ) ) ) ;
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
            // InternalGo.g:1532:2: ( (this_ID_0= RULE_ID ( (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList ) | (kw= '++' | kw= '--' ) | ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp ) ) ) )
            // InternalGo.g:1533:2: (this_ID_0= RULE_ID ( (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList ) | (kw= '++' | kw= '--' ) | ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp ) ) )
            {
            // InternalGo.g:1533:2: (this_ID_0= RULE_ID ( (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList ) | (kw= '++' | kw= '--' ) | ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp ) ) )
            // InternalGo.g:1534:3: this_ID_0= RULE_ID ( (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList ) | (kw= '++' | kw= '--' ) | ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp ) )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getAssigAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGo.g:1541:3: ( (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList ) | (kw= '++' | kw= '--' ) | ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_TYPE:
            case 25:
            case 28:
            case 29:
                {
                alt48=1;
                }
                break;
            case 41:
            case 42:
                {
                alt48=2;
                }
                break;
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalGo.g:1542:4: (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList )
                    {
                    // InternalGo.g:1542:4: (this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList )
                    // InternalGo.g:1543:5: this_IdList_1= ruleIdList kw= '=' this_Exp_3= ruleExp this_ExpList_4= ruleExpList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAssigAccess().getIdListParserRuleCall_1_0_0());
                      				
                    }
                    pushFollow(FOLLOW_52);
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
                    pushFollow(FOLLOW_50);
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
                    // InternalGo.g:1580:4: (kw= '++' | kw= '--' )
                    {
                    // InternalGo.g:1580:4: (kw= '++' | kw= '--' )
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
                            // InternalGo.g:1581:5: kw= '++'
                            {
                            kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getAssigAccess().getPlusSignPlusSignKeyword_1_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:1587:5: kw= '--'
                            {
                            kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
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
                    // InternalGo.g:1594:4: ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp )
                    {
                    // InternalGo.g:1594:4: ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp )
                    // InternalGo.g:1595:5: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' ) this_Exp_11= ruleExp
                    {
                    // InternalGo.g:1595:5: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' )
                    int alt47=4;
                    switch ( input.LA(1) ) {
                    case 43:
                        {
                        alt47=1;
                        }
                        break;
                    case 44:
                        {
                        alt47=2;
                        }
                        break;
                    case 45:
                        {
                        alt47=3;
                        }
                        break;
                    case 46:
                        {
                        alt47=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }

                    switch (alt47) {
                        case 1 :
                            // InternalGo.g:1596:6: kw= '+='
                            {
                            kw=(Token)match(input,43,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getAssigAccess().getPlusSignEqualsSignKeyword_1_2_0_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:1602:6: kw= '-='
                            {
                            kw=(Token)match(input,44,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getAssigAccess().getHyphenMinusEqualsSignKeyword_1_2_0_1());
                              					
                            }

                            }
                            break;
                        case 3 :
                            // InternalGo.g:1608:6: kw= '*='
                            {
                            kw=(Token)match(input,45,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getAssigAccess().getAsteriskEqualsSignKeyword_1_2_0_2());
                              					
                            }

                            }
                            break;
                        case 4 :
                            // InternalGo.g:1614:6: kw= '/='
                            {
                            kw=(Token)match(input,46,FOLLOW_20); if (state.failed) return current;
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
    // InternalGo.g:1636:1: entryRuleIdList returns [String current=null] : iv_ruleIdList= ruleIdList EOF ;
    public final String entryRuleIdList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdList = null;


        try {
            // InternalGo.g:1636:46: (iv_ruleIdList= ruleIdList EOF )
            // InternalGo.g:1637:2: iv_ruleIdList= ruleIdList EOF
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
    // InternalGo.g:1643:1: ruleIdList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken ruleIdList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGo.g:1649:2: ( (kw= ',' this_ID_1= RULE_ID )* )
            // InternalGo.g:1650:2: (kw= ',' this_ID_1= RULE_ID )*
            {
            // InternalGo.g:1650:2: (kw= ',' this_ID_1= RULE_ID )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==28) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalGo.g:1651:3: kw= ',' this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getIdListAccess().getCommaKeyword_0());
            	      		
            	    }
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_ID_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_ID_1, grammarAccess.getIdListAccess().getIDTerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalGo.g:1667:1: entryRuleExpList returns [String current=null] : iv_ruleExpList= ruleExpList EOF ;
    public final String entryRuleExpList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpList = null;


        try {
            // InternalGo.g:1667:47: (iv_ruleExpList= ruleExpList EOF )
            // InternalGo.g:1668:2: iv_ruleExpList= ruleExpList EOF
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
    // InternalGo.g:1674:1: ruleExpList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' this_Exp_1= ruleExp )* ;
    public final AntlrDatatypeRuleToken ruleExpList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1680:2: ( (kw= ',' this_Exp_1= ruleExp )* )
            // InternalGo.g:1681:2: (kw= ',' this_Exp_1= ruleExp )*
            {
            // InternalGo.g:1681:2: (kw= ',' this_Exp_1= ruleExp )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==28) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalGo.g:1682:3: kw= ',' this_Exp_1= ruleExp
            	    {
            	    kw=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getExpListAccess().getCommaKeyword_0());
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getExpListAccess().getExpParserRuleCall_1());
            	      		
            	    }
            	    pushFollow(FOLLOW_27);
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
            	    break loop50;
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
    // InternalGo.g:1701:1: entryRuleExp returns [String current=null] : iv_ruleExp= ruleExp EOF ;
    public final String entryRuleExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExp = null;


        try {
            // InternalGo.g:1701:43: (iv_ruleExp= ruleExp EOF )
            // InternalGo.g:1702:2: iv_ruleExp= ruleExp EOF
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
    // InternalGo.g:1708:1: ruleExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExpAux_0= ruleExpAux | (this_BooleanExp_1= ruleBooleanExp (this_ExpJoin_2= ruleExpJoin )? ) | (this_AritExp_3= ruleAritExp (this_ExpJoin_4= ruleExpJoin )? ) | this_STRING_5= RULE_STRING | this_RelExp_6= ruleRelExp | (this_ID_7= RULE_ID (this_ExpJoin_8= ruleExpJoin )? ) ) ;
    public final AntlrDatatypeRuleToken ruleExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_5=null;
        Token this_ID_7=null;
        AntlrDatatypeRuleToken this_ExpAux_0 = null;

        AntlrDatatypeRuleToken this_BooleanExp_1 = null;

        AntlrDatatypeRuleToken this_ExpJoin_2 = null;

        AntlrDatatypeRuleToken this_AritExp_3 = null;

        AntlrDatatypeRuleToken this_ExpJoin_4 = null;

        AntlrDatatypeRuleToken this_RelExp_6 = null;

        AntlrDatatypeRuleToken this_ExpJoin_8 = null;



        	enterRule();

        try {
            // InternalGo.g:1714:2: ( (this_ExpAux_0= ruleExpAux | (this_BooleanExp_1= ruleBooleanExp (this_ExpJoin_2= ruleExpJoin )? ) | (this_AritExp_3= ruleAritExp (this_ExpJoin_4= ruleExpJoin )? ) | this_STRING_5= RULE_STRING | this_RelExp_6= ruleRelExp | (this_ID_7= RULE_ID (this_ExpJoin_8= ruleExpJoin )? ) ) )
            // InternalGo.g:1715:2: (this_ExpAux_0= ruleExpAux | (this_BooleanExp_1= ruleBooleanExp (this_ExpJoin_2= ruleExpJoin )? ) | (this_AritExp_3= ruleAritExp (this_ExpJoin_4= ruleExpJoin )? ) | this_STRING_5= RULE_STRING | this_RelExp_6= ruleRelExp | (this_ID_7= RULE_ID (this_ExpJoin_8= ruleExpJoin )? ) )
            {
            // InternalGo.g:1715:2: (this_ExpAux_0= ruleExpAux | (this_BooleanExp_1= ruleBooleanExp (this_ExpJoin_2= ruleExpJoin )? ) | (this_AritExp_3= ruleAritExp (this_ExpJoin_4= ruleExpJoin )? ) | this_STRING_5= RULE_STRING | this_RelExp_6= ruleRelExp | (this_ID_7= RULE_ID (this_ExpJoin_8= ruleExpJoin )? ) )
            int alt54=6;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // InternalGo.g:1716:3: this_ExpAux_0= ruleExpAux
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpAccess().getExpAuxParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpAux_0=ruleExpAux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ExpAux_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1727:3: (this_BooleanExp_1= ruleBooleanExp (this_ExpJoin_2= ruleExpJoin )? )
                    {
                    // InternalGo.g:1727:3: (this_BooleanExp_1= ruleBooleanExp (this_ExpJoin_2= ruleExpJoin )? )
                    // InternalGo.g:1728:4: this_BooleanExp_1= ruleBooleanExp (this_ExpJoin_2= ruleExpJoin )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpAccess().getBooleanExpParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_53);
                    this_BooleanExp_1=ruleBooleanExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_BooleanExp_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:1738:4: (this_ExpJoin_2= ruleExpJoin )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( ((LA51_0>=RULE_OP_REL && LA51_0<=RULE_OP_UNARY)||LA51_0==RULE_OP_MULT||(LA51_0>=48 && LA51_0<=49)) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==RULE_OP_SUM) ) {
                        int LA51_2 = input.LA(2);

                        if ( (LA51_2==RULE_INT) ) {
                            int LA51_4 = input.LA(3);

                            if ( (synpred62_InternalGo()) ) {
                                alt51=1;
                            }
                        }
                        else if ( ((LA51_2>=RULE_ID && LA51_2<=RULE_STRING)||LA51_2==RULE_OP_SUM||LA51_2==RULE_BOOL||LA51_2==47) ) {
                            alt51=1;
                        }
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalGo.g:1739:5: this_ExpJoin_2= ruleExpJoin
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getExpAccess().getExpJoinParserRuleCall_1_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_ExpJoin_2=ruleExpJoin();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_ExpJoin_2);
                              				
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
                case 3 :
                    // InternalGo.g:1752:3: (this_AritExp_3= ruleAritExp (this_ExpJoin_4= ruleExpJoin )? )
                    {
                    // InternalGo.g:1752:3: (this_AritExp_3= ruleAritExp (this_ExpJoin_4= ruleExpJoin )? )
                    // InternalGo.g:1753:4: this_AritExp_3= ruleAritExp (this_ExpJoin_4= ruleExpJoin )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpAccess().getAritExpParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_53);
                    this_AritExp_3=ruleAritExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_AritExp_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:1763:4: (this_ExpJoin_4= ruleExpJoin )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0>=RULE_OP_REL && LA52_0<=RULE_OP_UNARY)||LA52_0==RULE_OP_MULT||(LA52_0>=48 && LA52_0<=49)) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==RULE_OP_SUM) ) {
                        int LA52_2 = input.LA(2);

                        if ( (LA52_2==RULE_INT) ) {
                            int LA52_4 = input.LA(3);

                            if ( (synpred64_InternalGo()) ) {
                                alt52=1;
                            }
                        }
                        else if ( ((LA52_2>=RULE_ID && LA52_2<=RULE_STRING)||LA52_2==RULE_OP_SUM||LA52_2==RULE_BOOL||LA52_2==47) ) {
                            alt52=1;
                        }
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalGo.g:1764:5: this_ExpJoin_4= ruleExpJoin
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getExpAccess().getExpJoinParserRuleCall_2_1());
                              				
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
                    break;
                case 4 :
                    // InternalGo.g:1777:3: this_STRING_5= RULE_STRING
                    {
                    this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_5, grammarAccess.getExpAccess().getSTRINGTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:1785:3: this_RelExp_6= ruleRelExp
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpAccess().getRelExpParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelExp_6=ruleRelExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_RelExp_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:1796:3: (this_ID_7= RULE_ID (this_ExpJoin_8= ruleExpJoin )? )
                    {
                    // InternalGo.g:1796:3: (this_ID_7= RULE_ID (this_ExpJoin_8= ruleExpJoin )? )
                    // InternalGo.g:1797:4: this_ID_7= RULE_ID (this_ExpJoin_8= ruleExpJoin )?
                    {
                    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_7, grammarAccess.getExpAccess().getIDTerminalRuleCall_5_0());
                      			
                    }
                    // InternalGo.g:1804:4: (this_ExpJoin_8= ruleExpJoin )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( ((LA53_0>=RULE_OP_REL && LA53_0<=RULE_OP_UNARY)||LA53_0==RULE_OP_MULT||(LA53_0>=48 && LA53_0<=49)) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==RULE_OP_SUM) ) {
                        int LA53_2 = input.LA(2);

                        if ( (LA53_2==RULE_INT) ) {
                            int LA53_4 = input.LA(3);

                            if ( (synpred68_InternalGo()) ) {
                                alt53=1;
                            }
                        }
                        else if ( ((LA53_2>=RULE_ID && LA53_2<=RULE_STRING)||LA53_2==RULE_OP_SUM||LA53_2==RULE_BOOL||LA53_2==47) ) {
                            alt53=1;
                        }
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalGo.g:1805:5: this_ExpJoin_8= ruleExpJoin
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getExpAccess().getExpJoinParserRuleCall_5_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_ExpJoin_8=ruleExpJoin();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_ExpJoin_8);
                              				
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


    // $ANTLR start "entryRuleExpAux"
    // InternalGo.g:1821:1: entryRuleExpAux returns [String current=null] : iv_ruleExpAux= ruleExpAux EOF ;
    public final String entryRuleExpAux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpAux = null;


        try {
            // InternalGo.g:1821:46: (iv_ruleExpAux= ruleExpAux EOF )
            // InternalGo.g:1822:2: iv_ruleExpAux= ruleExpAux EOF
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
    // InternalGo.g:1828:1: ruleExpAux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' kw= '(' this_Exp_2= ruleExp kw= ')' (this_ExpJoin_4= ruleExpJoin )? ) ;
    public final AntlrDatatypeRuleToken ruleExpAux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_2 = null;

        AntlrDatatypeRuleToken this_ExpJoin_4 = null;



        	enterRule();

        try {
            // InternalGo.g:1834:2: ( (kw= '!' kw= '(' this_Exp_2= ruleExp kw= ')' (this_ExpJoin_4= ruleExpJoin )? ) )
            // InternalGo.g:1835:2: (kw= '!' kw= '(' this_Exp_2= ruleExp kw= ')' (this_ExpJoin_4= ruleExpJoin )? )
            {
            // InternalGo.g:1835:2: (kw= '!' kw= '(' this_Exp_2= ruleExp kw= ')' (this_ExpJoin_4= ruleExpJoin )? )
            // InternalGo.g:1836:3: kw= '!' kw= '(' this_Exp_2= ruleExp kw= ')' (this_ExpJoin_4= ruleExpJoin )?
            {
            kw=(Token)match(input,47,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getExpAuxAccess().getExclamationMarkKeyword_0());
              		
            }
            kw=(Token)match(input,19,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getExpAuxAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpAuxAccess().getExpParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_26);
            this_Exp_2=ruleExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Exp_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,20,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getExpAuxAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalGo.g:1861:3: (this_ExpJoin_4= ruleExpJoin )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_OP_REL && LA55_0<=RULE_OP_UNARY)||LA55_0==RULE_OP_MULT||(LA55_0>=48 && LA55_0<=49)) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_OP_SUM) ) {
                int LA55_2 = input.LA(2);

                if ( ((LA55_2>=RULE_ID && LA55_2<=RULE_STRING)||LA55_2==RULE_OP_SUM||LA55_2==RULE_BOOL||LA55_2==47) ) {
                    alt55=1;
                }
                else if ( (LA55_2==RULE_INT) ) {
                    int LA55_4 = input.LA(3);

                    if ( (synpred69_InternalGo()) ) {
                        alt55=1;
                    }
                }
            }
            switch (alt55) {
                case 1 :
                    // InternalGo.g:1862:4: this_ExpJoin_4= ruleExpJoin
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


    // $ANTLR start "entryRuleExpJoin"
    // InternalGo.g:1877:1: entryRuleExpJoin returns [String current=null] : iv_ruleExpJoin= ruleExpJoin EOF ;
    public final String entryRuleExpJoin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpJoin = null;


        try {
            // InternalGo.g:1877:47: (iv_ruleExpJoin= ruleExpJoin EOF )
            // InternalGo.g:1878:2: iv_ruleExpJoin= ruleExpJoin EOF
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
    // InternalGo.g:1884:1: ruleExpJoin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_OP_REL_0= RULE_OP_REL | this_OP_UNARY_1= RULE_OP_UNARY | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' ) this_Exp_6= ruleExp ) ;
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
            // InternalGo.g:1890:2: ( ( (this_OP_REL_0= RULE_OP_REL | this_OP_UNARY_1= RULE_OP_UNARY | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' ) this_Exp_6= ruleExp ) )
            // InternalGo.g:1891:2: ( (this_OP_REL_0= RULE_OP_REL | this_OP_UNARY_1= RULE_OP_UNARY | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' ) this_Exp_6= ruleExp )
            {
            // InternalGo.g:1891:2: ( (this_OP_REL_0= RULE_OP_REL | this_OP_UNARY_1= RULE_OP_UNARY | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' ) this_Exp_6= ruleExp )
            // InternalGo.g:1892:3: (this_OP_REL_0= RULE_OP_REL | this_OP_UNARY_1= RULE_OP_UNARY | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' ) this_Exp_6= ruleExp
            {
            // InternalGo.g:1892:3: (this_OP_REL_0= RULE_OP_REL | this_OP_UNARY_1= RULE_OP_UNARY | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' )
            int alt56=6;
            switch ( input.LA(1) ) {
            case RULE_OP_REL:
                {
                alt56=1;
                }
                break;
            case RULE_OP_UNARY:
                {
                alt56=2;
                }
                break;
            case RULE_OP_SUM:
                {
                alt56=3;
                }
                break;
            case RULE_OP_MULT:
                {
                alt56=4;
                }
                break;
            case 48:
                {
                alt56=5;
                }
                break;
            case 49:
                {
                alt56=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalGo.g:1893:4: this_OP_REL_0= RULE_OP_REL
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
                    // InternalGo.g:1901:4: this_OP_UNARY_1= RULE_OP_UNARY
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
                    // InternalGo.g:1909:4: this_OP_SUM_2= RULE_OP_SUM
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
                    // InternalGo.g:1917:4: this_OP_MULT_3= RULE_OP_MULT
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
                    // InternalGo.g:1925:4: kw= '&&'
                    {
                    kw=(Token)match(input,48,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpJoinAccess().getAmpersandAmpersandKeyword_0_4());
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:1931:4: kw= '||'
                    {
                    kw=(Token)match(input,49,FOLLOW_20); if (state.failed) return current;
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
    // InternalGo.g:1951:1: entryRuleRelExp returns [String current=null] : iv_ruleRelExp= ruleRelExp EOF ;
    public final String entryRuleRelExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelExp = null;


        try {
            // InternalGo.g:1951:46: (iv_ruleRelExp= ruleRelExp EOF )
            // InternalGo.g:1952:2: iv_ruleRelExp= ruleRelExp EOF
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
    // InternalGo.g:1958:1: ruleRelExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral ) | (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral ) ) ;
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
            // InternalGo.g:1964:2: ( ( (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral ) | (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral ) ) )
            // InternalGo.g:1965:2: ( (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral ) | (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral ) )
            {
            // InternalGo.g:1965:2: ( (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral ) | (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_INT) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_BOOL) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalGo.g:1966:3: (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral )
                    {
                    // InternalGo.g:1966:3: (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral )
                    // InternalGo.g:1967:4: this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRelExpAccess().getNumberLiteralParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_54);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_NumberLiteral_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:1977:4: (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_OP_REL) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==RULE_OP_UNARY) ) {
                        alt57=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalGo.g:1978:5: this_OP_REL_1= RULE_OP_REL
                            {
                            this_OP_REL_1=(Token)match(input,RULE_OP_REL,FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_OP_REL_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_OP_REL_1, grammarAccess.getRelExpAccess().getOP_RELTerminalRuleCall_0_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:1986:5: this_OP_UNARY_2= RULE_OP_UNARY
                            {
                            this_OP_UNARY_2=(Token)match(input,RULE_OP_UNARY,FOLLOW_55); if (state.failed) return current;
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
                    // InternalGo.g:2006:3: (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral )
                    {
                    // InternalGo.g:2006:3: (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral )
                    // InternalGo.g:2007:4: this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRelExpAccess().getBooleanLiteralParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_56);
                    this_BooleanLiteral_4=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_BooleanLiteral_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_OP_UNARY_5=(Token)match(input,RULE_OP_UNARY,FOLLOW_57); if (state.failed) return current;
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
    // InternalGo.g:2039:1: entryRuleBooleanExp returns [String current=null] : iv_ruleBooleanExp= ruleBooleanExp EOF ;
    public final String entryRuleBooleanExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanExp = null;


        try {
            // InternalGo.g:2039:50: (iv_ruleBooleanExp= ruleBooleanExp EOF )
            // InternalGo.g:2040:2: iv_ruleBooleanExp= ruleBooleanExp EOF
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
    // InternalGo.g:2046:1: ruleBooleanExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Or_0= ruleOr ;
    public final AntlrDatatypeRuleToken ruleBooleanExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Or_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2052:2: (this_Or_0= ruleOr )
            // InternalGo.g:2053:2: this_Or_0= ruleOr
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
    // InternalGo.g:2066:1: entryRuleOr returns [String current=null] : iv_ruleOr= ruleOr EOF ;
    public final String entryRuleOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOr = null;


        try {
            // InternalGo.g:2066:42: (iv_ruleOr= ruleOr EOF )
            // InternalGo.g:2067:2: iv_ruleOr= ruleOr EOF
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
    // InternalGo.g:2073:1: ruleOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '!' )? this_And_1= ruleAnd (kw= '||' this_And_3= ruleAnd )* ) ;
    public final AntlrDatatypeRuleToken ruleOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_And_1 = null;

        AntlrDatatypeRuleToken this_And_3 = null;



        	enterRule();

        try {
            // InternalGo.g:2079:2: ( ( (kw= '!' )? this_And_1= ruleAnd (kw= '||' this_And_3= ruleAnd )* ) )
            // InternalGo.g:2080:2: ( (kw= '!' )? this_And_1= ruleAnd (kw= '||' this_And_3= ruleAnd )* )
            {
            // InternalGo.g:2080:2: ( (kw= '!' )? this_And_1= ruleAnd (kw= '||' this_And_3= ruleAnd )* )
            // InternalGo.g:2081:3: (kw= '!' )? this_And_1= ruleAnd (kw= '||' this_And_3= ruleAnd )*
            {
            // InternalGo.g:2081:3: (kw= '!' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==47) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalGo.g:2082:4: kw= '!'
                    {
                    kw=(Token)match(input,47,FOLLOW_57); if (state.failed) return current;
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
            pushFollow(FOLLOW_58);
            this_And_1=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_And_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2098:3: (kw= '||' this_And_3= ruleAnd )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==49) ) {
                    int LA60_2 = input.LA(2);

                    if ( (LA60_2==RULE_BOOL) ) {
                        int LA60_3 = input.LA(3);

                        if ( (synpred78_InternalGo()) ) {
                            alt60=1;
                        }


                    }


                }


                switch (alt60) {
            	case 1 :
            	    // InternalGo.g:2099:4: kw= '||' this_And_3= ruleAnd
            	    {
            	    kw=(Token)match(input,49,FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_2_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_58);
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
            	    break loop60;
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
    // InternalGo.g:2119:1: entryRuleAnd returns [String current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final String entryRuleAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnd = null;


        try {
            // InternalGo.g:2119:43: (iv_ruleAnd= ruleAnd EOF )
            // InternalGo.g:2120:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalGo.g:2126:1: ruleAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BooleanLiteral_0= ruleBooleanLiteral (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )* ) ;
    public final AntlrDatatypeRuleToken ruleAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BooleanLiteral_0 = null;

        AntlrDatatypeRuleToken this_BooleanLiteral_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2132:2: ( (this_BooleanLiteral_0= ruleBooleanLiteral (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )* ) )
            // InternalGo.g:2133:2: (this_BooleanLiteral_0= ruleBooleanLiteral (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )* )
            {
            // InternalGo.g:2133:2: (this_BooleanLiteral_0= ruleBooleanLiteral (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )* )
            // InternalGo.g:2134:3: this_BooleanLiteral_0= ruleBooleanLiteral (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getBooleanLiteralParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_BooleanLiteral_0=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_BooleanLiteral_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2144:3: (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==48) ) {
                    int LA61_2 = input.LA(2);

                    if ( (LA61_2==RULE_BOOL) ) {
                        int LA61_3 = input.LA(3);

                        if ( (synpred79_InternalGo()) ) {
                            alt61=1;
                        }


                    }


                }


                switch (alt61) {
            	case 1 :
            	    // InternalGo.g:2145:4: kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral
            	    {
            	    kw=(Token)match(input,48,FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getAndAccess().getBooleanLiteralParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_59);
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
            	    break loop61;
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
    // InternalGo.g:2165:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // InternalGo.g:2165:54: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalGo.g:2166:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalGo.g:2172:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOL_0= RULE_BOOL ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOL_0=null;


        	enterRule();

        try {
            // InternalGo.g:2178:2: (this_BOOL_0= RULE_BOOL )
            // InternalGo.g:2179:2: this_BOOL_0= RULE_BOOL
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
    // InternalGo.g:2189:1: entryRuleAritExp returns [String current=null] : iv_ruleAritExp= ruleAritExp EOF ;
    public final String entryRuleAritExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAritExp = null;


        try {
            // InternalGo.g:2189:47: (iv_ruleAritExp= ruleAritExp EOF )
            // InternalGo.g:2190:2: iv_ruleAritExp= ruleAritExp EOF
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
    // InternalGo.g:2196:1: ruleAritExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Addition_0= ruleAddition ;
    public final AntlrDatatypeRuleToken ruleAritExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Addition_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2202:2: (this_Addition_0= ruleAddition )
            // InternalGo.g:2203:2: this_Addition_0= ruleAddition
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
    // InternalGo.g:2216:1: entryRuleAddition returns [String current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final String entryRuleAddition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddition = null;


        try {
            // InternalGo.g:2216:48: (iv_ruleAddition= ruleAddition EOF )
            // InternalGo.g:2217:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalGo.g:2223:1: ruleAddition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication )+ ;
    public final AntlrDatatypeRuleToken ruleAddition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_SUM_0=null;
        AntlrDatatypeRuleToken this_Multiplication_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2229:2: ( ( (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication )+ )
            // InternalGo.g:2230:2: ( (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication )+
            {
            // InternalGo.g:2230:2: ( (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_OP_SUM) ) {
                    int LA63_2 = input.LA(2);

                    if ( (synpred81_InternalGo()) ) {
                        alt63=1;
                    }


                }
                else if ( (LA63_0==RULE_INT) ) {
                    int LA63_3 = input.LA(2);

                    if ( (synpred81_InternalGo()) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // InternalGo.g:2231:3: (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication
            	    {
            	    // InternalGo.g:2231:3: (this_OP_SUM_0= RULE_OP_SUM )?
            	    int alt62=2;
            	    int LA62_0 = input.LA(1);

            	    if ( (LA62_0==RULE_OP_SUM) ) {
            	        alt62=1;
            	    }
            	    switch (alt62) {
            	        case 1 :
            	            // InternalGo.g:2232:4: this_OP_SUM_0= RULE_OP_SUM
            	            {
            	            this_OP_SUM_0=(Token)match(input,RULE_OP_SUM,FOLLOW_55); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_60);
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
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
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
    // InternalGo.g:2254:1: entryRuleMultiplication returns [String current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final String entryRuleMultiplication() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplication = null;


        try {
            // InternalGo.g:2254:54: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalGo.g:2255:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalGo.g:2261:1: ruleMultiplication returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NumberLiteral_0= ruleNumberLiteral ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )* ) ;
    public final AntlrDatatypeRuleToken ruleMultiplication() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_MULT_1=null;
        AntlrDatatypeRuleToken this_NumberLiteral_0 = null;

        AntlrDatatypeRuleToken this_NumberLiteral_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2267:2: ( (this_NumberLiteral_0= ruleNumberLiteral ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )* ) )
            // InternalGo.g:2268:2: (this_NumberLiteral_0= ruleNumberLiteral ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )* )
            {
            // InternalGo.g:2268:2: (this_NumberLiteral_0= ruleNumberLiteral ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )* )
            // InternalGo.g:2269:3: this_NumberLiteral_0= ruleNumberLiteral ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicationAccess().getNumberLiteralParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_61);
            this_NumberLiteral_0=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NumberLiteral_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2279:3: ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_OP_MULT) ) {
                    int LA65_2 = input.LA(2);

                    if ( (LA65_2==RULE_INT) ) {
                        int LA65_4 = input.LA(3);

                        if ( (synpred83_InternalGo()) ) {
                            alt65=1;
                        }


                    }


                }
                else if ( (LA65_0==RULE_INT) ) {
                    int LA65_3 = input.LA(2);

                    if ( (synpred83_InternalGo()) ) {
                        alt65=1;
                    }


                }


                switch (alt65) {
            	case 1 :
            	    // InternalGo.g:2280:4: (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral
            	    {
            	    // InternalGo.g:2280:4: (this_OP_MULT_1= RULE_OP_MULT )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==RULE_OP_MULT) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalGo.g:2281:5: this_OP_MULT_1= RULE_OP_MULT
            	            {
            	            this_OP_MULT_1=(Token)match(input,RULE_OP_MULT,FOLLOW_55); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_61);
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
            	    break loop65;
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
    // InternalGo.g:2304:1: entryRuleNumberLiteral returns [String current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final String entryRuleNumberLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberLiteral = null;


        try {
            // InternalGo.g:2304:53: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalGo.g:2305:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalGo.g:2311:1: ruleNumberLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumberLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGo.g:2317:2: (this_INT_0= RULE_INT )
            // InternalGo.g:2318:2: this_INT_0= RULE_INT
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

    // $ANTLR start synpred38_InternalGo
    public final void synpred38_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_Assig_0 = null;

        AntlrDatatypeRuleToken this_Decl_1 = null;

        AntlrDatatypeRuleToken this_Exp_2 = null;


        // InternalGo.g:1102:3: ( (this_Assig_0= ruleAssig | this_Decl_1= ruleDecl | this_Exp_2= ruleExp ) kw= ';' )
        // InternalGo.g:1102:3: (this_Assig_0= ruleAssig | this_Decl_1= ruleDecl | this_Exp_2= ruleExp ) kw= ';'
        {
        // InternalGo.g:1102:3: (this_Assig_0= ruleAssig | this_Decl_1= ruleDecl | this_Exp_2= ruleExp )
        int alt75=3;
        switch ( input.LA(1) ) {
        case RULE_ID:
            {
            int LA75_1 = input.LA(2);

            if ( ((LA75_1>=RULE_OP_REL && LA75_1<=RULE_OP_MULT)||LA75_1==17||(LA75_1>=48 && LA75_1<=49)) ) {
                alt75=3;
            }
            else if ( (LA75_1==25||LA75_1==28||(LA75_1>=41 && LA75_1<=46)) ) {
                alt75=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 1, input);

                throw nvae;
            }
            }
            break;
        case 39:
        case 40:
            {
            alt75=2;
            }
            break;
        case RULE_STRING:
        case RULE_OP_SUM:
        case RULE_BOOL:
        case RULE_INT:
        case 47:
            {
            alt75=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 75, 0, input);

            throw nvae;
        }

        switch (alt75) {
            case 1 :
                // InternalGo.g:1103:4: this_Assig_0= ruleAssig
                {
                pushFollow(FOLLOW_15);
                this_Assig_0=ruleAssig();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalGo.g:1114:4: this_Decl_1= ruleDecl
                {
                pushFollow(FOLLOW_15);
                this_Decl_1=ruleDecl();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalGo.g:1125:4: this_Exp_2= ruleExp
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
    // $ANTLR end synpred38_InternalGo

    // $ANTLR start synpred50_InternalGo
    public final void synpred50_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_Exp_1 = null;


        // InternalGo.g:1421:4: (this_Exp_1= ruleExp )
        // InternalGo.g:1421:4: this_Exp_1= ruleExp
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
    // $ANTLR end synpred50_InternalGo

    // $ANTLR start synpred61_InternalGo
    public final void synpred61_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExpAux_0 = null;


        // InternalGo.g:1716:3: (this_ExpAux_0= ruleExpAux )
        // InternalGo.g:1716:3: this_ExpAux_0= ruleExpAux
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getExpAccess().getExpAuxParserRuleCall_0());
          		
        }
        pushFollow(FOLLOW_2);
        this_ExpAux_0=ruleExpAux();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalGo

    // $ANTLR start synpred62_InternalGo
    public final void synpred62_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExpJoin_2 = null;


        // InternalGo.g:1739:5: (this_ExpJoin_2= ruleExpJoin )
        // InternalGo.g:1739:5: this_ExpJoin_2= ruleExpJoin
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getExpAccess().getExpJoinParserRuleCall_1_1());
          				
        }
        pushFollow(FOLLOW_2);
        this_ExpJoin_2=ruleExpJoin();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalGo

    // $ANTLR start synpred63_InternalGo
    public final void synpred63_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_BooleanExp_1 = null;

        AntlrDatatypeRuleToken this_ExpJoin_2 = null;


        // InternalGo.g:1727:3: ( (this_BooleanExp_1= ruleBooleanExp (this_ExpJoin_2= ruleExpJoin )? ) )
        // InternalGo.g:1727:3: (this_BooleanExp_1= ruleBooleanExp (this_ExpJoin_2= ruleExpJoin )? )
        {
        // InternalGo.g:1727:3: (this_BooleanExp_1= ruleBooleanExp (this_ExpJoin_2= ruleExpJoin )? )
        // InternalGo.g:1728:4: this_BooleanExp_1= ruleBooleanExp (this_ExpJoin_2= ruleExpJoin )?
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getExpAccess().getBooleanExpParserRuleCall_1_0());
          			
        }
        pushFollow(FOLLOW_53);
        this_BooleanExp_1=ruleBooleanExp();

        state._fsp--;
        if (state.failed) return ;
        // InternalGo.g:1738:4: (this_ExpJoin_2= ruleExpJoin )?
        int alt78=2;
        int LA78_0 = input.LA(1);

        if ( ((LA78_0>=RULE_OP_REL && LA78_0<=RULE_OP_MULT)||(LA78_0>=48 && LA78_0<=49)) ) {
            alt78=1;
        }
        switch (alt78) {
            case 1 :
                // InternalGo.g:1739:5: this_ExpJoin_2= ruleExpJoin
                {
                pushFollow(FOLLOW_2);
                this_ExpJoin_2=ruleExpJoin();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred63_InternalGo

    // $ANTLR start synpred64_InternalGo
    public final void synpred64_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExpJoin_4 = null;


        // InternalGo.g:1764:5: (this_ExpJoin_4= ruleExpJoin )
        // InternalGo.g:1764:5: this_ExpJoin_4= ruleExpJoin
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getExpAccess().getExpJoinParserRuleCall_2_1());
          				
        }
        pushFollow(FOLLOW_2);
        this_ExpJoin_4=ruleExpJoin();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalGo

    // $ANTLR start synpred65_InternalGo
    public final void synpred65_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_AritExp_3 = null;

        AntlrDatatypeRuleToken this_ExpJoin_4 = null;


        // InternalGo.g:1752:3: ( (this_AritExp_3= ruleAritExp (this_ExpJoin_4= ruleExpJoin )? ) )
        // InternalGo.g:1752:3: (this_AritExp_3= ruleAritExp (this_ExpJoin_4= ruleExpJoin )? )
        {
        // InternalGo.g:1752:3: (this_AritExp_3= ruleAritExp (this_ExpJoin_4= ruleExpJoin )? )
        // InternalGo.g:1753:4: this_AritExp_3= ruleAritExp (this_ExpJoin_4= ruleExpJoin )?
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getExpAccess().getAritExpParserRuleCall_2_0());
          			
        }
        pushFollow(FOLLOW_53);
        this_AritExp_3=ruleAritExp();

        state._fsp--;
        if (state.failed) return ;
        // InternalGo.g:1763:4: (this_ExpJoin_4= ruleExpJoin )?
        int alt79=2;
        int LA79_0 = input.LA(1);

        if ( ((LA79_0>=RULE_OP_REL && LA79_0<=RULE_OP_MULT)||(LA79_0>=48 && LA79_0<=49)) ) {
            alt79=1;
        }
        switch (alt79) {
            case 1 :
                // InternalGo.g:1764:5: this_ExpJoin_4= ruleExpJoin
                {
                pushFollow(FOLLOW_2);
                this_ExpJoin_4=ruleExpJoin();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred65_InternalGo

    // $ANTLR start synpred67_InternalGo
    public final void synpred67_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_RelExp_6 = null;


        // InternalGo.g:1785:3: (this_RelExp_6= ruleRelExp )
        // InternalGo.g:1785:3: this_RelExp_6= ruleRelExp
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getExpAccess().getRelExpParserRuleCall_4());
          		
        }
        pushFollow(FOLLOW_2);
        this_RelExp_6=ruleRelExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalGo

    // $ANTLR start synpred68_InternalGo
    public final void synpred68_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExpJoin_8 = null;


        // InternalGo.g:1805:5: (this_ExpJoin_8= ruleExpJoin )
        // InternalGo.g:1805:5: this_ExpJoin_8= ruleExpJoin
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getExpAccess().getExpJoinParserRuleCall_5_1());
          				
        }
        pushFollow(FOLLOW_2);
        this_ExpJoin_8=ruleExpJoin();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalGo

    // $ANTLR start synpred69_InternalGo
    public final void synpred69_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExpJoin_4 = null;


        // InternalGo.g:1862:4: (this_ExpJoin_4= ruleExpJoin )
        // InternalGo.g:1862:4: this_ExpJoin_4= ruleExpJoin
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
    // $ANTLR end synpred69_InternalGo

    // $ANTLR start synpred78_InternalGo
    public final void synpred78_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_And_3 = null;


        // InternalGo.g:2099:4: (kw= '||' this_And_3= ruleAnd )
        // InternalGo.g:2099:4: kw= '||' this_And_3= ruleAnd
        {
        kw=(Token)match(input,49,FOLLOW_57); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_And_3=ruleAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred78_InternalGo

    // $ANTLR start synpred79_InternalGo
    public final void synpred79_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_BooleanLiteral_2 = null;


        // InternalGo.g:2145:4: (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )
        // InternalGo.g:2145:4: kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral
        {
        kw=(Token)match(input,48,FOLLOW_57); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_BooleanLiteral_2=ruleBooleanLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred79_InternalGo

    // $ANTLR start synpred81_InternalGo
    public final void synpred81_InternalGo_fragment() throws RecognitionException {   
        Token this_OP_SUM_0=null;
        AntlrDatatypeRuleToken this_Multiplication_1 = null;


        // InternalGo.g:2231:3: ( (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication )
        // InternalGo.g:2231:3: (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication
        {
        // InternalGo.g:2231:3: (this_OP_SUM_0= RULE_OP_SUM )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==RULE_OP_SUM) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // InternalGo.g:2232:4: this_OP_SUM_0= RULE_OP_SUM
                {
                this_OP_SUM_0=(Token)match(input,RULE_OP_SUM,FOLLOW_55); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_2);
        this_Multiplication_1=ruleMultiplication();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred81_InternalGo

    // $ANTLR start synpred83_InternalGo
    public final void synpred83_InternalGo_fragment() throws RecognitionException {   
        Token this_OP_MULT_1=null;
        AntlrDatatypeRuleToken this_NumberLiteral_2 = null;


        // InternalGo.g:2280:4: ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )
        // InternalGo.g:2280:4: (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral
        {
        // InternalGo.g:2280:4: (this_OP_MULT_1= RULE_OP_MULT )?
        int alt82=2;
        int LA82_0 = input.LA(1);

        if ( (LA82_0==RULE_OP_MULT) ) {
            alt82=1;
        }
        switch (alt82) {
            case 1 :
                // InternalGo.g:2281:5: this_OP_MULT_1= RULE_OP_MULT
                {
                this_OP_MULT_1=(Token)match(input,RULE_OP_MULT,FOLLOW_55); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_2);
        this_NumberLiteral_2=ruleNumberLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred83_InternalGo

    // Delegated rules

    public final boolean synpred61_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalGo_fragment(); // can never throw exception
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
    public final boolean synpred81_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_InternalGo_fragment(); // can never throw exception
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
    public final boolean synpred50_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalGo_fragment(); // can never throw exception
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
    public final boolean synpred63_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA36 dfa36 = new DFA36(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA54 dfa54 = new DFA54(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\11\12\uffff";
    static final String dfa_3s = "\1\4\1\0\2\uffff\5\0\2\uffff";
    static final String dfa_4s = "\1\57\1\0\2\uffff\5\0\2\uffff";
    static final String dfa_5s = "\2\uffff\1\1\6\uffff\1\2\1\uffff";
    static final String dfa_6s = "\1\uffff\1\0\2\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\10\3\uffff\1\6\1\uffff\1\5\1\7\22\uffff\1\11\7\uffff\2\2\6\uffff\1\4",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1101:2: ( (this_Assig_0= ruleAssig | this_Decl_1= ruleDecl | this_Exp_2= ruleExp ) kw= ';' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_4 = input.LA(1);

                         
                        int index36_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index36_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_5 = input.LA(1);

                         
                        int index36_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index36_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA36_6 = input.LA(1);

                         
                        int index36_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index36_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA36_7 = input.LA(1);

                         
                        int index36_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index36_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA36_8 = input.LA(1);

                         
                        int index36_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index36_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\24\uffff";
    static final String dfa_9s = "\1\7\23\uffff";
    static final String dfa_10s = "\1\4\6\0\15\uffff";
    static final String dfa_11s = "\1\57\6\0\15\uffff";
    static final String dfa_12s = "\7\uffff\1\2\13\uffff\1\1";
    static final String dfa_13s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\15\uffff}>";
    static final String[] dfa_14s = {
            "\1\6\1\5\3\uffff\1\3\1\uffff\1\2\1\4\4\uffff\1\7\5\uffff\1\7\6\uffff\1\7\1\uffff\5\7\1\uffff\3\7\6\uffff\1\1",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1420:3: (this_Exp_1= ruleExp )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_1 = input.LA(1);

                         
                        int index43_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalGo()) ) {s = 19;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index43_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_2 = input.LA(1);

                         
                        int index43_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalGo()) ) {s = 19;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index43_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_3 = input.LA(1);

                         
                        int index43_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalGo()) ) {s = 19;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index43_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA43_4 = input.LA(1);

                         
                        int index43_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalGo()) ) {s = 19;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index43_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA43_5 = input.LA(1);

                         
                        int index43_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalGo()) ) {s = 19;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index43_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA43_6 = input.LA(1);

                         
                        int index43_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalGo()) ) {s = 19;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index43_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\12\uffff";
    static final String dfa_16s = "\1\4\2\0\1\uffff\1\0\5\uffff";
    static final String dfa_17s = "\1\57\2\0\1\uffff\1\0\5\uffff";
    static final String dfa_18s = "\3\uffff\1\3\1\uffff\1\4\1\6\1\1\1\2\1\5";
    static final String dfa_19s = "\1\uffff\1\0\1\1\1\uffff\1\2\5\uffff}>";
    static final String[] dfa_20s = {
            "\1\6\1\5\3\uffff\1\3\1\uffff\1\2\1\4\42\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "1715:2: (this_ExpAux_0= ruleExpAux | (this_BooleanExp_1= ruleBooleanExp (this_ExpJoin_2= ruleExpJoin )? ) | (this_AritExp_3= ruleAritExp (this_ExpJoin_4= ruleExpJoin )? ) | this_STRING_5= RULE_STRING | this_RelExp_6= ruleRelExp | (this_ID_7= RULE_ID (this_ExpJoin_8= ruleExpJoin )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalGo()) ) {s = 7;}

                        else if ( (synpred63_InternalGo()) ) {s = 8;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalGo()) ) {s = 8;}

                        else if ( (synpred67_InternalGo()) ) {s = 9;}

                         
                        input.seek(index54_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_4 = input.LA(1);

                         
                        int index54_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalGo()) ) {s = 3;}

                        else if ( (synpred67_InternalGo()) ) {s = 9;}

                         
                        input.seek(index54_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000018008060002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000018008040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000018008020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000018008000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000280030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000320030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000818000021A30L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000097000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000021A30L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000818000001A32L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000001A30L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000097000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020100050L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000050L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000030000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000818080001A30L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000081D040801A32L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000081D040821A32L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000818000001A30L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001097000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000081D440801A30L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000081D440821A30L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000101A30L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000001A32L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00007E0012000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0003000000000782L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000800000000800L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000001602L});

}