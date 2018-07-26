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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_OP_UNARY", "RULE_OP_REL", "RULE_OP_SUM", "RULE_OP_MULT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'import'", "'('", "')'", "'.'", "'package'", "'for'", "':='", "'='", "'range'", "'func'", "','", "'...'", "'switch'", "'{'", "'case'", "'default'", "'}'", "':'", "'if'", "'else'", "'select'", "'<-'", "'break'", "'continue'", "'goto'", "'fallthrough'", "'defer'", "'return'", "'type'", "'struct'", "'var'", "'const'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'!'", "'&&'", "'||'", "'true'", "'false'", "'string'", "'int'", "'bool'"
    };
    public static final int T__50=50;
    public static final int RULE_OP_SUM=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_OP_MULT=9;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_OP_REL=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
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
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_OP_UNARY=6;
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
    // InternalGo.g:77:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleSourceFile ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:83:2: ( ( (lv_elements_0_0= ruleSourceFile ) )* )
            // InternalGo.g:84:2: ( (lv_elements_0_0= ruleSourceFile ) )*
            {
            // InternalGo.g:84:2: ( (lv_elements_0_0= ruleSourceFile ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:85:3: (lv_elements_0_0= ruleSourceFile )
            	    {
            	    // InternalGo.g:85:3: (lv_elements_0_0= ruleSourceFile )
            	    // InternalGo.g:86:4: lv_elements_0_0= ruleSourceFile
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getElementsSourceFileParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleSourceFile();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"elements",
            	      					lv_elements_0_0,
            	      					"org.xtext.example.go.Go.SourceFile");
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


    // $ANTLR start "entryRuleSourceFile"
    // InternalGo.g:106:1: entryRuleSourceFile returns [EObject current=null] : iv_ruleSourceFile= ruleSourceFile EOF ;
    public final EObject entryRuleSourceFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceFile = null;


        try {
            // InternalGo.g:106:51: (iv_ruleSourceFile= ruleSourceFile EOF )
            // InternalGo.g:107:2: iv_ruleSourceFile= ruleSourceFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceFileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSourceFile=ruleSourceFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSourceFile; 
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
    // InternalGo.g:113:1: ruleSourceFile returns [EObject current=null] : ( () rulePackage (otherlv_2= ';' )? ( ruleImportDecl (otherlv_4= ';' )? )* ( ( (lv_TopLevelDecl_5_0= ruleTopLevelDecl ) ) (otherlv_6= ';' )? )* ) ;
    public final EObject ruleSourceFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_TopLevelDecl_5_0 = null;



        	enterRule();

        try {
            // InternalGo.g:119:2: ( ( () rulePackage (otherlv_2= ';' )? ( ruleImportDecl (otherlv_4= ';' )? )* ( ( (lv_TopLevelDecl_5_0= ruleTopLevelDecl ) ) (otherlv_6= ';' )? )* ) )
            // InternalGo.g:120:2: ( () rulePackage (otherlv_2= ';' )? ( ruleImportDecl (otherlv_4= ';' )? )* ( ( (lv_TopLevelDecl_5_0= ruleTopLevelDecl ) ) (otherlv_6= ';' )? )* )
            {
            // InternalGo.g:120:2: ( () rulePackage (otherlv_2= ';' )? ( ruleImportDecl (otherlv_4= ';' )? )* ( ( (lv_TopLevelDecl_5_0= ruleTopLevelDecl ) ) (otherlv_6= ';' )? )* )
            // InternalGo.g:121:3: () rulePackage (otherlv_2= ';' )? ( ruleImportDecl (otherlv_4= ';' )? )* ( ( (lv_TopLevelDecl_5_0= ruleTopLevelDecl ) ) (otherlv_6= ';' )? )*
            {
            // InternalGo.g:121:3: ()
            // InternalGo.g:122:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSourceFileAccess().getSourceFileAction_0(),
              					current);
              			
            }

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSourceFileAccess().getPackageParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_4);
            rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:141:3: (otherlv_2= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGo.g:142:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSourceFileAccess().getSemicolonKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:147:3: ( ruleImportDecl (otherlv_4= ';' )? )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGo.g:148:4: ruleImportDecl (otherlv_4= ';' )?
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSourceFileAccess().getImportDeclParserRuleCall_3_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_4);
            	    ruleImportDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalGo.g:158:4: (otherlv_4= ';' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==15) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalGo.g:159:5: otherlv_4= ';'
            	            {
            	            otherlv_4=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_4, grammarAccess.getSourceFileAccess().getSemicolonKeyword_3_1());
            	              				
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

            // InternalGo.g:165:3: ( ( (lv_TopLevelDecl_5_0= ruleTopLevelDecl ) ) (otherlv_6= ';' )? )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==25||LA6_0==44||(LA6_0>=46 && LA6_0<=47)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGo.g:166:4: ( (lv_TopLevelDecl_5_0= ruleTopLevelDecl ) ) (otherlv_6= ';' )?
            	    {
            	    // InternalGo.g:166:4: ( (lv_TopLevelDecl_5_0= ruleTopLevelDecl ) )
            	    // InternalGo.g:167:5: (lv_TopLevelDecl_5_0= ruleTopLevelDecl )
            	    {
            	    // InternalGo.g:167:5: (lv_TopLevelDecl_5_0= ruleTopLevelDecl )
            	    // InternalGo.g:168:6: lv_TopLevelDecl_5_0= ruleTopLevelDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSourceFileAccess().getTopLevelDeclTopLevelDeclParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_TopLevelDecl_5_0=ruleTopLevelDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSourceFileRule());
            	      						}
            	      						add(
            	      							current,
            	      							"TopLevelDecl",
            	      							lv_TopLevelDecl_5_0,
            	      							"org.xtext.example.go.Go.TopLevelDecl");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalGo.g:185:4: (otherlv_6= ';' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==15) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalGo.g:186:5: otherlv_6= ';'
            	            {
            	            otherlv_6=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_6, grammarAccess.getSourceFileAccess().getSemicolonKeyword_4_1());
            	              				
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
    // InternalGo.g:196:1: entryRuleTopLevelDecl returns [EObject current=null] : iv_ruleTopLevelDecl= ruleTopLevelDecl EOF ;
    public final EObject entryRuleTopLevelDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelDecl = null;


        try {
            // InternalGo.g:196:53: (iv_ruleTopLevelDecl= ruleTopLevelDecl EOF )
            // InternalGo.g:197:2: iv_ruleTopLevelDecl= ruleTopLevelDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopLevelDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTopLevelDecl=ruleTopLevelDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTopLevelDecl; 
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
    // InternalGo.g:203:1: ruleTopLevelDecl returns [EObject current=null] : ( ( () ( (lv_decl_1_0= ruleDecl ) ) ) | ( (lv_func_2_0= ruleFuncDecl ) ) | ( () ruleTypeDef ) ) ;
    public final EObject ruleTopLevelDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_decl_1_0 = null;

        EObject lv_func_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:209:2: ( ( ( () ( (lv_decl_1_0= ruleDecl ) ) ) | ( (lv_func_2_0= ruleFuncDecl ) ) | ( () ruleTypeDef ) ) )
            // InternalGo.g:210:2: ( ( () ( (lv_decl_1_0= ruleDecl ) ) ) | ( (lv_func_2_0= ruleFuncDecl ) ) | ( () ruleTypeDef ) )
            {
            // InternalGo.g:210:2: ( ( () ( (lv_decl_1_0= ruleDecl ) ) ) | ( (lv_func_2_0= ruleFuncDecl ) ) | ( () ruleTypeDef ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 46:
            case 47:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 44:
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
                    // InternalGo.g:211:3: ( () ( (lv_decl_1_0= ruleDecl ) ) )
                    {
                    // InternalGo.g:211:3: ( () ( (lv_decl_1_0= ruleDecl ) ) )
                    // InternalGo.g:212:4: () ( (lv_decl_1_0= ruleDecl ) )
                    {
                    // InternalGo.g:212:4: ()
                    // InternalGo.g:213:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTopLevelDeclAccess().getTopLevelDeclAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:222:4: ( (lv_decl_1_0= ruleDecl ) )
                    // InternalGo.g:223:5: (lv_decl_1_0= ruleDecl )
                    {
                    // InternalGo.g:223:5: (lv_decl_1_0= ruleDecl )
                    // InternalGo.g:224:6: lv_decl_1_0= ruleDecl
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTopLevelDeclAccess().getDeclDeclParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_decl_1_0=ruleDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTopLevelDeclRule());
                      						}
                      						set(
                      							current,
                      							"decl",
                      							lv_decl_1_0,
                      							"org.xtext.example.go.Go.Decl");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:243:3: ( (lv_func_2_0= ruleFuncDecl ) )
                    {
                    // InternalGo.g:243:3: ( (lv_func_2_0= ruleFuncDecl ) )
                    // InternalGo.g:244:4: (lv_func_2_0= ruleFuncDecl )
                    {
                    // InternalGo.g:244:4: (lv_func_2_0= ruleFuncDecl )
                    // InternalGo.g:245:5: lv_func_2_0= ruleFuncDecl
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTopLevelDeclAccess().getFuncFuncDeclParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_func_2_0=ruleFuncDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTopLevelDeclRule());
                      					}
                      					set(
                      						current,
                      						"func",
                      						lv_func_2_0,
                      						"org.xtext.example.go.Go.FuncDecl");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:263:3: ( () ruleTypeDef )
                    {
                    // InternalGo.g:263:3: ( () ruleTypeDef )
                    // InternalGo.g:264:4: () ruleTypeDef
                    {
                    // InternalGo.g:264:4: ()
                    // InternalGo.g:265:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTopLevelDeclAccess().getTopLevelDeclAction_2_0(),
                      						current);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTopLevelDeclAccess().getTypeDefParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
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
    // $ANTLR end "ruleTopLevelDecl"


    // $ANTLR start "entryRuleImportDecl"
    // InternalGo.g:289:1: entryRuleImportDecl returns [String current=null] : iv_ruleImportDecl= ruleImportDecl EOF ;
    public final String entryRuleImportDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportDecl = null;


        try {
            // InternalGo.g:289:50: (iv_ruleImportDecl= ruleImportDecl EOF )
            // InternalGo.g:290:2: iv_ruleImportDecl= ruleImportDecl EOF
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
    // InternalGo.g:296:1: ruleImportDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleImportDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ImportSpec_1 = null;

        AntlrDatatypeRuleToken this_ImportSpec_3 = null;



        	enterRule();

        try {
            // InternalGo.g:302:2: ( (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) ) ) )
            // InternalGo.g:303:2: (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) ) )
            {
            // InternalGo.g:303:2: (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) ) )
            // InternalGo.g:304:3: kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) )
            {
            kw=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getImportDeclAccess().getImportKeyword_0());
              		
            }
            // InternalGo.g:309:3: (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
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
                    // InternalGo.g:310:4: this_ImportSpec_1= ruleImportSpec
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
                    // InternalGo.g:321:4: (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' )
                    {
                    // InternalGo.g:321:4: (kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')' )
                    // InternalGo.g:322:5: kw= '(' (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )* kw= ')'
                    {
                    kw=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getImportDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalGo.g:327:5: (this_ImportSpec_3= ruleImportSpec (kw= ';' )? )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||LA9_0==19) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGo.g:328:6: this_ImportSpec_3= ruleImportSpec (kw= ';' )?
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
                    	    // InternalGo.g:338:6: (kw= ';' )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==15) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // InternalGo.g:339:7: kw= ';'
                    	            {
                    	            kw=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
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

                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:357:1: entryRuleImportSpec returns [String current=null] : iv_ruleImportSpec= ruleImportSpec EOF ;
    public final String entryRuleImportSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportSpec = null;


        try {
            // InternalGo.g:357:50: (iv_ruleImportSpec= ruleImportSpec EOF )
            // InternalGo.g:358:2: iv_ruleImportSpec= ruleImportSpec EOF
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
    // InternalGo.g:364:1: ruleImportSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' | this_ID_1= RULE_ID )? this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleImportSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalGo.g:370:2: ( ( (kw= '.' | this_ID_1= RULE_ID )? this_STRING_2= RULE_STRING ) )
            // InternalGo.g:371:2: ( (kw= '.' | this_ID_1= RULE_ID )? this_STRING_2= RULE_STRING )
            {
            // InternalGo.g:371:2: ( (kw= '.' | this_ID_1= RULE_ID )? this_STRING_2= RULE_STRING )
            // InternalGo.g:372:3: (kw= '.' | this_ID_1= RULE_ID )? this_STRING_2= RULE_STRING
            {
            // InternalGo.g:372:3: (kw= '.' | this_ID_1= RULE_ID )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // InternalGo.g:373:4: kw= '.'
                    {
                    kw=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getImportSpecAccess().getFullStopKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:379:4: this_ID_1= RULE_ID
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
    // InternalGo.g:398:1: entryRulePackage returns [String current=null] : iv_rulePackage= rulePackage EOF ;
    public final String entryRulePackage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage = null;


        try {
            // InternalGo.g:398:47: (iv_rulePackage= rulePackage EOF )
            // InternalGo.g:399:2: iv_rulePackage= rulePackage EOF
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
    // InternalGo.g:405:1: rulePackage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken rulePackage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGo.g:411:2: ( (kw= 'package' this_ID_1= RULE_ID ) )
            // InternalGo.g:412:2: (kw= 'package' this_ID_1= RULE_ID )
            {
            // InternalGo.g:412:2: (kw= 'package' this_ID_1= RULE_ID )
            // InternalGo.g:413:3: kw= 'package' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
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
    // InternalGo.g:429:1: entryRuleForStmt returns [EObject current=null] : iv_ruleForStmt= ruleForStmt EOF ;
    public final EObject entryRuleForStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStmt = null;


        try {
            // InternalGo.g:429:48: (iv_ruleForStmt= ruleForStmt EOF )
            // InternalGo.g:430:2: iv_ruleForStmt= ruleForStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForStmt=ruleForStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStmt; 
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
    // InternalGo.g:436:1: ruleForStmt returns [EObject current=null] : (otherlv_0= 'for' ( ( ruleExp ( ruleRangeClause )? ) | (this_ForClause_3= ruleForClause )? ) ( (lv_Block_4_0= ruleBlock ) ) ) ;
    public final EObject ruleForStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ForClause_3 = null;

        EObject lv_Block_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:442:2: ( (otherlv_0= 'for' ( ( ruleExp ( ruleRangeClause )? ) | (this_ForClause_3= ruleForClause )? ) ( (lv_Block_4_0= ruleBlock ) ) ) )
            // InternalGo.g:443:2: (otherlv_0= 'for' ( ( ruleExp ( ruleRangeClause )? ) | (this_ForClause_3= ruleForClause )? ) ( (lv_Block_4_0= ruleBlock ) ) )
            {
            // InternalGo.g:443:2: (otherlv_0= 'for' ( ( ruleExp ( ruleRangeClause )? ) | (this_ForClause_3= ruleForClause )? ) ( (lv_Block_4_0= ruleBlock ) ) )
            // InternalGo.g:444:3: otherlv_0= 'for' ( ( ruleExp ( ruleRangeClause )? ) | (this_ForClause_3= ruleForClause )? ) ( (lv_Block_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStmtAccess().getForKeyword_0());
              		
            }
            // InternalGo.g:448:3: ( ( ruleExp ( ruleRangeClause )? ) | (this_ForClause_3= ruleForClause )? )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalGo.g:449:4: ( ruleExp ( ruleRangeClause )? )
                    {
                    // InternalGo.g:449:4: ( ruleExp ( ruleRangeClause )? )
                    // InternalGo.g:450:5: ruleExp ( ruleRangeClause )?
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStmtAccess().getExpParserRuleCall_1_0_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalGo.g:460:5: ( ruleRangeClause )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=22 && LA12_0<=24)||LA12_0==26) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGo.g:461:6: ruleRangeClause
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getForStmtAccess().getRangeClauseParserRuleCall_1_0_1());
                              					
                            }
                            pushFollow(FOLLOW_13);
                            ruleRangeClause();

                            state._fsp--;
                            if (state.failed) return current;
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
                    // InternalGo.g:474:4: (this_ForClause_3= ruleForClause )?
                    {
                    // InternalGo.g:474:4: (this_ForClause_3= ruleForClause )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID||LA13_0==15||(LA13_0>=46 && LA13_0<=47)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalGo.g:475:5: this_ForClause_3= ruleForClause
                            {
                            if ( state.backtracking==0 ) {

                              					/* */
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getForStmtAccess().getForClauseParserRuleCall_1_1());
                              				
                            }
                            pushFollow(FOLLOW_13);
                            this_ForClause_3=ruleForClause();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_ForClause_3;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalGo.g:488:3: ( (lv_Block_4_0= ruleBlock ) )
            // InternalGo.g:489:4: (lv_Block_4_0= ruleBlock )
            {
            // InternalGo.g:489:4: (lv_Block_4_0= ruleBlock )
            // InternalGo.g:490:5: lv_Block_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStmtAccess().getBlockBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_Block_4_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStmtRule());
              					}
              					set(
              						current,
              						"Block",
              						lv_Block_4_0,
              						"org.xtext.example.go.Go.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


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
    // InternalGo.g:511:1: entryRuleForClause returns [EObject current=null] : iv_ruleForClause= ruleForClause EOF ;
    public final EObject entryRuleForClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForClause = null;


        try {
            // InternalGo.g:511:50: (iv_ruleForClause= ruleForClause EOF )
            // InternalGo.g:512:2: iv_ruleForClause= ruleForClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForClause=ruleForClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForClause; 
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
    // InternalGo.g:518:1: ruleForClause returns [EObject current=null] : ( () ( (lv_decl_1_0= ruleDecl ) )? otherlv_2= ';' ( ruleExp )? otherlv_4= ';' (this_SimpleStmt_5= ruleSimpleStmt )? ) ;
    public final EObject ruleForClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_decl_1_0 = null;

        EObject this_SimpleStmt_5 = null;



        	enterRule();

        try {
            // InternalGo.g:524:2: ( ( () ( (lv_decl_1_0= ruleDecl ) )? otherlv_2= ';' ( ruleExp )? otherlv_4= ';' (this_SimpleStmt_5= ruleSimpleStmt )? ) )
            // InternalGo.g:525:2: ( () ( (lv_decl_1_0= ruleDecl ) )? otherlv_2= ';' ( ruleExp )? otherlv_4= ';' (this_SimpleStmt_5= ruleSimpleStmt )? )
            {
            // InternalGo.g:525:2: ( () ( (lv_decl_1_0= ruleDecl ) )? otherlv_2= ';' ( ruleExp )? otherlv_4= ';' (this_SimpleStmt_5= ruleSimpleStmt )? )
            // InternalGo.g:526:3: () ( (lv_decl_1_0= ruleDecl ) )? otherlv_2= ';' ( ruleExp )? otherlv_4= ';' (this_SimpleStmt_5= ruleSimpleStmt )?
            {
            // InternalGo.g:526:3: ()
            // InternalGo.g:527:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getForClauseAccess().getForClauseAction_0(),
              					current);
              			
            }

            }

            // InternalGo.g:536:3: ( (lv_decl_1_0= ruleDecl ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||(LA15_0>=46 && LA15_0<=47)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGo.g:537:4: (lv_decl_1_0= ruleDecl )
                    {
                    // InternalGo.g:537:4: (lv_decl_1_0= ruleDecl )
                    // InternalGo.g:538:5: lv_decl_1_0= ruleDecl
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForClauseAccess().getDeclDeclParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_15);
                    lv_decl_1_0=ruleDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getForClauseRule());
                      					}
                      					set(
                      						current,
                      						"decl",
                      						lv_decl_1_0,
                      						"org.xtext.example.go.Go.Decl");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForClauseAccess().getSemicolonKeyword_2());
              		
            }
            // InternalGo.g:559:3: ( ruleExp )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==RULE_OP_SUM||LA16_0==RULE_INT||LA16_0==17||LA16_0==54||(LA16_0>=57 && LA16_0<=58)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGo.g:560:4: ruleExp
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForClauseAccess().getExpParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForClauseAccess().getSemicolonKeyword_4());
              		
            }
            // InternalGo.g:575:3: (this_SimpleStmt_5= ruleSimpleStmt )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)||LA17_0==RULE_OP_SUM||LA17_0==RULE_INT||LA17_0==17||(LA17_0>=46 && LA17_0<=47)||LA17_0==54||(LA17_0>=57 && LA17_0<=58)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGo.g:576:4: this_SimpleStmt_5= ruleSimpleStmt
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForClauseAccess().getSimpleStmtParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_SimpleStmt_5=ruleSimpleStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SimpleStmt_5;
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
    // InternalGo.g:592:1: entryRuleRangeClause returns [String current=null] : iv_ruleRangeClause= ruleRangeClause EOF ;
    public final String entryRuleRangeClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRangeClause = null;


        try {
            // InternalGo.g:592:51: (iv_ruleRangeClause= ruleRangeClause EOF )
            // InternalGo.g:593:2: iv_ruleRangeClause= ruleRangeClause EOF
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
    // InternalGo.g:599:1: ruleRangeClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )? kw= 'range' this_Exp_4= ruleExp ) ;
    public final AntlrDatatypeRuleToken ruleRangeClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpList_0 = null;

        AntlrDatatypeRuleToken this_Exp_4 = null;



        	enterRule();

        try {
            // InternalGo.g:605:2: ( ( (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )? kw= 'range' this_Exp_4= ruleExp ) )
            // InternalGo.g:606:2: ( (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )? kw= 'range' this_Exp_4= ruleExp )
            {
            // InternalGo.g:606:2: ( (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )? kw= 'range' this_Exp_4= ruleExp )
            // InternalGo.g:607:3: (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )? kw= 'range' this_Exp_4= ruleExp
            {
            // InternalGo.g:607:3: (this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==EOF||(LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||LA19_0==RULE_OP_SUM||LA19_0==RULE_INT||LA19_0==15||(LA19_0>=17 && LA19_0<=18)||(LA19_0>=20 && LA19_0<=23)||(LA19_0>=25 && LA19_0<=26)||(LA19_0>=28 && LA19_0<=34)||LA19_0==36||(LA19_0>=38 && LA19_0<=44)||(LA19_0>=46 && LA19_0<=47)||LA19_0==54||(LA19_0>=57 && LA19_0<=58)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGo.g:608:4: this_ExpList_0= ruleExpList (kw= ':=' | kw= '=' )
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
                    // InternalGo.g:618:4: (kw= ':=' | kw= '=' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==22) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==23) ) {
                        alt18=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalGo.g:619:5: kw= ':='
                            {
                            kw=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRangeClauseAccess().getColonEqualsSignKeyword_0_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:625:5: kw= '='
                            {
                            kw=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
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

            kw=(Token)match(input,24,FOLLOW_20); if (state.failed) return current;
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
    // InternalGo.g:651:1: entryRuleFuncDecl returns [EObject current=null] : iv_ruleFuncDecl= ruleFuncDecl EOF ;
    public final EObject entryRuleFuncDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncDecl = null;


        try {
            // InternalGo.g:651:49: (iv_ruleFuncDecl= ruleFuncDecl EOF )
            // InternalGo.g:652:2: iv_ruleFuncDecl= ruleFuncDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFuncDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFuncDecl=ruleFuncDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFuncDecl; 
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
    // InternalGo.g:658:1: ruleFuncDecl returns [EObject current=null] : (otherlv_0= 'func' ( (lv_receiver_1_0= ruleReceiver ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_signature_3_0= ruleSignature ) ) ( (lv_block_4_0= ruleBlock ) )? ) ;
    public final EObject ruleFuncDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_receiver_1_0 = null;

        AntlrDatatypeRuleToken lv_signature_3_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:664:2: ( (otherlv_0= 'func' ( (lv_receiver_1_0= ruleReceiver ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_signature_3_0= ruleSignature ) ) ( (lv_block_4_0= ruleBlock ) )? ) )
            // InternalGo.g:665:2: (otherlv_0= 'func' ( (lv_receiver_1_0= ruleReceiver ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_signature_3_0= ruleSignature ) ) ( (lv_block_4_0= ruleBlock ) )? )
            {
            // InternalGo.g:665:2: (otherlv_0= 'func' ( (lv_receiver_1_0= ruleReceiver ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_signature_3_0= ruleSignature ) ) ( (lv_block_4_0= ruleBlock ) )? )
            // InternalGo.g:666:3: otherlv_0= 'func' ( (lv_receiver_1_0= ruleReceiver ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_signature_3_0= ruleSignature ) ) ( (lv_block_4_0= ruleBlock ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFuncDeclAccess().getFuncKeyword_0());
              		
            }
            // InternalGo.g:670:3: ( (lv_receiver_1_0= ruleReceiver ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGo.g:671:4: (lv_receiver_1_0= ruleReceiver )
                    {
                    // InternalGo.g:671:4: (lv_receiver_1_0= ruleReceiver )
                    // InternalGo.g:672:5: lv_receiver_1_0= ruleReceiver
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFuncDeclAccess().getReceiverReceiverParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_receiver_1_0=ruleReceiver();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFuncDeclRule());
                      					}
                      					set(
                      						current,
                      						"receiver",
                      						lv_receiver_1_0,
                      						"org.xtext.example.go.Go.Receiver");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGo.g:689:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGo.g:690:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGo.g:690:4: (lv_name_2_0= RULE_ID )
            // InternalGo.g:691:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getFuncDeclAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFuncDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalGo.g:707:3: ( (lv_signature_3_0= ruleSignature ) )
            // InternalGo.g:708:4: (lv_signature_3_0= ruleSignature )
            {
            // InternalGo.g:708:4: (lv_signature_3_0= ruleSignature )
            // InternalGo.g:709:5: lv_signature_3_0= ruleSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFuncDeclAccess().getSignatureSignatureParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_signature_3_0=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFuncDeclRule());
              					}
              					set(
              						current,
              						"signature",
              						lv_signature_3_0,
              						"org.xtext.example.go.Go.Signature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:726:3: ( (lv_block_4_0= ruleBlock ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:727:4: (lv_block_4_0= ruleBlock )
                    {
                    // InternalGo.g:727:4: (lv_block_4_0= ruleBlock )
                    // InternalGo.g:728:5: lv_block_4_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFuncDeclAccess().getBlockBlockParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_block_4_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFuncDeclRule());
                      					}
                      					set(
                      						current,
                      						"block",
                      						lv_block_4_0,
                      						"org.xtext.example.go.Go.Block");
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
    // $ANTLR end "ruleFuncDecl"


    // $ANTLR start "entryRuleReceiver"
    // InternalGo.g:749:1: entryRuleReceiver returns [String current=null] : iv_ruleReceiver= ruleReceiver EOF ;
    public final String entryRuleReceiver() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReceiver = null;


        try {
            // InternalGo.g:749:48: (iv_ruleReceiver= ruleReceiver EOF )
            // InternalGo.g:750:2: iv_ruleReceiver= ruleReceiver EOF
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
    // InternalGo.g:756:1: ruleReceiver returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Parameters_0= ruleParameters ;
    public final AntlrDatatypeRuleToken ruleReceiver() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;



        	enterRule();

        try {
            // InternalGo.g:762:2: (this_Parameters_0= ruleParameters )
            // InternalGo.g:763:2: this_Parameters_0= ruleParameters
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
    // InternalGo.g:776:1: entryRuleSignature returns [String current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final String entryRuleSignature() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignature = null;


        try {
            // InternalGo.g:776:49: (iv_ruleSignature= ruleSignature EOF )
            // InternalGo.g:777:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalGo.g:783:1: ruleSignature returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Parameters_0= ruleParameters (this_Result_1= ruleResult )? ) ;
    public final AntlrDatatypeRuleToken ruleSignature() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;

        AntlrDatatypeRuleToken this_Result_1 = null;



        	enterRule();

        try {
            // InternalGo.g:789:2: ( (this_Parameters_0= ruleParameters (this_Result_1= ruleResult )? ) )
            // InternalGo.g:790:2: (this_Parameters_0= ruleParameters (this_Result_1= ruleResult )? )
            {
            // InternalGo.g:790:2: (this_Parameters_0= ruleParameters (this_Result_1= ruleResult )? )
            // InternalGo.g:791:3: this_Parameters_0= ruleParameters (this_Result_1= ruleResult )?
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
            // InternalGo.g:801:3: (this_Result_1= ruleResult )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17||LA22_0==45||(LA22_0>=59 && LA22_0<=61)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==EOF||LA22_2==RULE_ID||LA22_2==15||(LA22_2>=19 && LA22_2<=20)||LA22_2==25||LA22_2==29||LA22_2==44||(LA22_2>=46 && LA22_2<=47)) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalGo.g:802:4: this_Result_1= ruleResult
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
    // InternalGo.g:817:1: entryRuleResult returns [String current=null] : iv_ruleResult= ruleResult EOF ;
    public final String entryRuleResult() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResult = null;


        try {
            // InternalGo.g:817:46: (iv_ruleResult= ruleResult EOF )
            // InternalGo.g:818:2: iv_ruleResult= ruleResult EOF
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
    // InternalGo.g:824:1: ruleResult returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Parameters_0= ruleParameters | this_TypeName_1= ruleTypeName ) ;
    public final AntlrDatatypeRuleToken ruleResult() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;

        AntlrDatatypeRuleToken this_TypeName_1 = null;



        	enterRule();

        try {
            // InternalGo.g:830:2: ( (this_Parameters_0= ruleParameters | this_TypeName_1= ruleTypeName ) )
            // InternalGo.g:831:2: (this_Parameters_0= ruleParameters | this_TypeName_1= ruleTypeName )
            {
            // InternalGo.g:831:2: (this_Parameters_0= ruleParameters | this_TypeName_1= ruleTypeName )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID||LA23_0==45||(LA23_0>=59 && LA23_0<=61)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalGo.g:832:3: this_Parameters_0= ruleParameters
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
                    // InternalGo.g:843:3: this_TypeName_1= ruleTypeName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getResultAccess().getTypeNameParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeName_1=ruleTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TypeName_1);
                      		
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
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleParameters"
    // InternalGo.g:857:1: entryRuleParameters returns [String current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final String entryRuleParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameters = null;


        try {
            // InternalGo.g:857:50: (iv_ruleParameters= ruleParameters EOF )
            // InternalGo.g:858:2: iv_ruleParameters= ruleParameters EOF
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
    // InternalGo.g:864:1: ruleParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterList_1 = null;



        	enterRule();

        try {
            // InternalGo.g:870:2: ( (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' ) )
            // InternalGo.g:871:2: (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' )
            {
            // InternalGo.g:871:2: (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' )
            // InternalGo.g:872:3: kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')'
            {
            kw=(Token)match(input,17,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getParametersAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGo.g:877:3: (this_ParameterList_1= ruleParameterList (kw= ',' )? )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||LA25_0==27||LA25_0==45||(LA25_0>=59 && LA25_0<=61)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGo.g:878:4: this_ParameterList_1= ruleParameterList (kw= ',' )?
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
                    // InternalGo.g:888:4: (kw= ',' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==26) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalGo.g:889:5: kw= ','
                            {
                            kw=(Token)match(input,26,FOLLOW_27); if (state.failed) return current;
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

            kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:905:1: entryRuleParameterList returns [String current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final String entryRuleParameterList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterList = null;


        try {
            // InternalGo.g:905:53: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalGo.g:906:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalGo.g:912:1: ruleParameterList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* ) ;
    public final AntlrDatatypeRuleToken ruleParameterList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDecl_0 = null;

        AntlrDatatypeRuleToken this_ParameterDecl_2 = null;



        	enterRule();

        try {
            // InternalGo.g:918:2: ( (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* ) )
            // InternalGo.g:919:2: (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* )
            {
            // InternalGo.g:919:2: (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* )
            // InternalGo.g:920:3: this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )*
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
            // InternalGo.g:930:3: (kw= ',' this_ParameterDecl_2= ruleParameterDecl )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_ID||LA26_1==27||LA26_1==45||(LA26_1>=59 && LA26_1<=61)) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalGo.g:931:4: kw= ',' this_ParameterDecl_2= ruleParameterDecl
            	    {
            	    kw=(Token)match(input,26,FOLLOW_29); if (state.failed) return current;
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
            	    break loop26;
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
    // InternalGo.g:951:1: entryRuleParameterDecl returns [String current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final String entryRuleParameterDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDecl = null;


        try {
            // InternalGo.g:951:53: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // InternalGo.g:952:2: iv_ruleParameterDecl= ruleParameterDecl EOF
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
    // InternalGo.g:958:1: ruleParameterDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID this_IdList_1= ruleIdList )? (kw= '...' )? this_TypeName_3= ruleTypeName ) ;
    public final AntlrDatatypeRuleToken ruleParameterDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_IdList_1 = null;

        AntlrDatatypeRuleToken this_TypeName_3 = null;



        	enterRule();

        try {
            // InternalGo.g:964:2: ( ( (this_ID_0= RULE_ID this_IdList_1= ruleIdList )? (kw= '...' )? this_TypeName_3= ruleTypeName ) )
            // InternalGo.g:965:2: ( (this_ID_0= RULE_ID this_IdList_1= ruleIdList )? (kw= '...' )? this_TypeName_3= ruleTypeName )
            {
            // InternalGo.g:965:2: ( (this_ID_0= RULE_ID this_IdList_1= ruleIdList )? (kw= '...' )? this_TypeName_3= ruleTypeName )
            // InternalGo.g:966:3: (this_ID_0= RULE_ID this_IdList_1= ruleIdList )? (kw= '...' )? this_TypeName_3= ruleTypeName
            {
            // InternalGo.g:966:3: (this_ID_0= RULE_ID this_IdList_1= ruleIdList )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==26) ) {
                    int LA27_3 = input.LA(3);

                    if ( (LA27_3==RULE_ID) ) {
                        int LA27_5 = input.LA(4);

                        if ( (synpred29_InternalGo()) ) {
                            alt27=1;
                        }
                    }
                }
                else if ( (LA27_1==RULE_ID||LA27_1==27||LA27_1==45||(LA27_1>=59 && LA27_1<=61)) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalGo.g:967:4: this_ID_0= RULE_ID this_IdList_1= ruleIdList
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

            // InternalGo.g:985:3: (kw= '...' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGo.g:986:4: kw= '...'
                    {
                    kw=(Token)match(input,27,FOLLOW_31); if (state.failed) return current;
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
    // InternalGo.g:1006:1: entryRuleSwitchStmt returns [EObject current=null] : iv_ruleSwitchStmt= ruleSwitchStmt EOF ;
    public final EObject entryRuleSwitchStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchStmt = null;


        try {
            // InternalGo.g:1006:51: (iv_ruleSwitchStmt= ruleSwitchStmt EOF )
            // InternalGo.g:1007:2: iv_ruleSwitchStmt= ruleSwitchStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchStmt=ruleSwitchStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStmt; 
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
    // InternalGo.g:1013:1: ruleSwitchStmt returns [EObject current=null] : (otherlv_0= 'switch' this_Anderson_1= ruleAnderson (this_ID_2= RULE_ID )? otherlv_3= '{' ( (otherlv_4= 'case' ruleExp ( (lv_SwitchCase_6_0= ruleSwitchCase ) ) )* (otherlv_7= 'default' ( (lv_SwitchCase_8_0= ruleSwitchCase ) )* )? ) otherlv_9= '}' ) ;
    public final EObject ruleSwitchStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_Anderson_1 = null;

        EObject lv_SwitchCase_6_0 = null;

        EObject lv_SwitchCase_8_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1019:2: ( (otherlv_0= 'switch' this_Anderson_1= ruleAnderson (this_ID_2= RULE_ID )? otherlv_3= '{' ( (otherlv_4= 'case' ruleExp ( (lv_SwitchCase_6_0= ruleSwitchCase ) ) )* (otherlv_7= 'default' ( (lv_SwitchCase_8_0= ruleSwitchCase ) )* )? ) otherlv_9= '}' ) )
            // InternalGo.g:1020:2: (otherlv_0= 'switch' this_Anderson_1= ruleAnderson (this_ID_2= RULE_ID )? otherlv_3= '{' ( (otherlv_4= 'case' ruleExp ( (lv_SwitchCase_6_0= ruleSwitchCase ) ) )* (otherlv_7= 'default' ( (lv_SwitchCase_8_0= ruleSwitchCase ) )* )? ) otherlv_9= '}' )
            {
            // InternalGo.g:1020:2: (otherlv_0= 'switch' this_Anderson_1= ruleAnderson (this_ID_2= RULE_ID )? otherlv_3= '{' ( (otherlv_4= 'case' ruleExp ( (lv_SwitchCase_6_0= ruleSwitchCase ) ) )* (otherlv_7= 'default' ( (lv_SwitchCase_8_0= ruleSwitchCase ) )* )? ) otherlv_9= '}' )
            // InternalGo.g:1021:3: otherlv_0= 'switch' this_Anderson_1= ruleAnderson (this_ID_2= RULE_ID )? otherlv_3= '{' ( (otherlv_4= 'case' ruleExp ( (lv_SwitchCase_6_0= ruleSwitchCase ) ) )* (otherlv_7= 'default' ( (lv_SwitchCase_8_0= ruleSwitchCase ) )* )? ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSwitchStmtAccess().getSwitchKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSwitchStmtAccess().getAndersonParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_33);
            this_Anderson_1=ruleAnderson();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Anderson_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1036:3: (this_ID_2= RULE_ID )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGo.g:1037:4: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getSwitchStmtAccess().getIDTerminalRuleCall_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSwitchStmtAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalGo.g:1046:3: ( (otherlv_4= 'case' ruleExp ( (lv_SwitchCase_6_0= ruleSwitchCase ) ) )* (otherlv_7= 'default' ( (lv_SwitchCase_8_0= ruleSwitchCase ) )* )? )
            // InternalGo.g:1047:4: (otherlv_4= 'case' ruleExp ( (lv_SwitchCase_6_0= ruleSwitchCase ) ) )* (otherlv_7= 'default' ( (lv_SwitchCase_8_0= ruleSwitchCase ) )* )?
            {
            // InternalGo.g:1047:4: (otherlv_4= 'case' ruleExp ( (lv_SwitchCase_6_0= ruleSwitchCase ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGo.g:1048:5: otherlv_4= 'case' ruleExp ( (lv_SwitchCase_6_0= ruleSwitchCase ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_4, grammarAccess.getSwitchStmtAccess().getCaseKeyword_4_0_0());
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchStmtAccess().getExpParserRuleCall_4_0_1());
            	      				
            	    }
            	    pushFollow(FOLLOW_36);
            	    ruleExp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					afterParserOrEnumRuleCall();
            	      				
            	    }
            	    // InternalGo.g:1062:5: ( (lv_SwitchCase_6_0= ruleSwitchCase ) )
            	    // InternalGo.g:1063:6: (lv_SwitchCase_6_0= ruleSwitchCase )
            	    {
            	    // InternalGo.g:1063:6: (lv_SwitchCase_6_0= ruleSwitchCase )
            	    // InternalGo.g:1064:7: lv_SwitchCase_6_0= ruleSwitchCase
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSwitchStmtAccess().getSwitchCaseSwitchCaseParserRuleCall_4_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_SwitchCase_6_0=ruleSwitchCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getSwitchStmtRule());
            	      							}
            	      							add(
            	      								current,
            	      								"SwitchCase",
            	      								lv_SwitchCase_6_0,
            	      								"org.xtext.example.go.Go.SwitchCase");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalGo.g:1082:4: (otherlv_7= 'default' ( (lv_SwitchCase_8_0= ruleSwitchCase ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGo.g:1083:5: otherlv_7= 'default' ( (lv_SwitchCase_8_0= ruleSwitchCase ) )*
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getSwitchStmtAccess().getDefaultKeyword_4_1_0());
                      				
                    }
                    // InternalGo.g:1087:5: ( (lv_SwitchCase_8_0= ruleSwitchCase ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==33) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalGo.g:1088:6: (lv_SwitchCase_8_0= ruleSwitchCase )
                    	    {
                    	    // InternalGo.g:1088:6: (lv_SwitchCase_8_0= ruleSwitchCase )
                    	    // InternalGo.g:1089:7: lv_SwitchCase_8_0= ruleSwitchCase
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSwitchStmtAccess().getSwitchCaseSwitchCaseParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_37);
                    	    lv_SwitchCase_8_0=ruleSwitchCase();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSwitchStmtRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"SwitchCase",
                    	      								lv_SwitchCase_8_0,
                    	      								"org.xtext.example.go.Go.SwitchCase");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            otherlv_9=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getSwitchStmtAccess().getRightCurlyBracketKeyword_5());
              		
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
    // InternalGo.g:1116:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // InternalGo.g:1116:51: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // InternalGo.g:1117:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchCase; 
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
    // InternalGo.g:1123:1: ruleSwitchCase returns [EObject current=null] : ( () otherlv_1= ':' ( ( (lv_Statement_2_0= ruleStatement ) ) (otherlv_3= ';' )? )* ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_Statement_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1129:2: ( ( () otherlv_1= ':' ( ( (lv_Statement_2_0= ruleStatement ) ) (otherlv_3= ';' )? )* ) )
            // InternalGo.g:1130:2: ( () otherlv_1= ':' ( ( (lv_Statement_2_0= ruleStatement ) ) (otherlv_3= ';' )? )* )
            {
            // InternalGo.g:1130:2: ( () otherlv_1= ':' ( ( (lv_Statement_2_0= ruleStatement ) ) (otherlv_3= ';' )? )* )
            // InternalGo.g:1131:3: () otherlv_1= ':' ( ( (lv_Statement_2_0= ruleStatement ) ) (otherlv_3= ';' )? )*
            {
            // InternalGo.g:1131:3: ()
            // InternalGo.g:1132:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSwitchCaseAccess().getSwitchCaseAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSwitchCaseAccess().getColonKeyword_1());
              		
            }
            // InternalGo.g:1145:3: ( ( (lv_Statement_2_0= ruleStatement ) ) (otherlv_3= ';' )? )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_STRING)||LA34_0==RULE_OP_SUM||LA34_0==RULE_INT||LA34_0==17||LA34_0==21||LA34_0==28||LA34_0==34||LA34_0==36||(LA34_0>=38 && LA34_0<=43)||(LA34_0>=46 && LA34_0<=47)||LA34_0==54||(LA34_0>=57 && LA34_0<=58)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGo.g:1146:4: ( (lv_Statement_2_0= ruleStatement ) ) (otherlv_3= ';' )?
            	    {
            	    // InternalGo.g:1146:4: ( (lv_Statement_2_0= ruleStatement ) )
            	    // InternalGo.g:1147:5: (lv_Statement_2_0= ruleStatement )
            	    {
            	    // InternalGo.g:1147:5: (lv_Statement_2_0= ruleStatement )
            	    // InternalGo.g:1148:6: lv_Statement_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSwitchCaseAccess().getStatementStatementParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_Statement_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
            	      						}
            	      						add(
            	      							current,
            	      							"Statement",
            	      							lv_Statement_2_0,
            	      							"org.xtext.example.go.Go.Statement");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalGo.g:1165:4: (otherlv_3= ';' )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==15) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalGo.g:1166:5: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,15,FOLLOW_38); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_3, grammarAccess.getSwitchCaseAccess().getSemicolonKeyword_2_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalGo.g:1176:1: entryRuleIfStmt returns [EObject current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final EObject entryRuleIfStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStmt = null;


        try {
            // InternalGo.g:1176:47: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalGo.g:1177:2: iv_ruleIfStmt= ruleIfStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStmt=ruleIfStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStmt; 
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
    // InternalGo.g:1183:1: ruleIfStmt returns [EObject current=null] : (otherlv_0= 'if' this_Anderson_1= ruleAnderson ruleExp ( (lv_Block_3_0= ruleBlock ) ) (otherlv_4= 'else' ( ( (lv_IfStmt_5_0= ruleIfStmt ) ) | ( (lv_Block_6_0= ruleBlock ) ) ) )? ) ;
    public final EObject ruleIfStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_Anderson_1 = null;

        EObject lv_Block_3_0 = null;

        EObject lv_IfStmt_5_0 = null;

        EObject lv_Block_6_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1189:2: ( (otherlv_0= 'if' this_Anderson_1= ruleAnderson ruleExp ( (lv_Block_3_0= ruleBlock ) ) (otherlv_4= 'else' ( ( (lv_IfStmt_5_0= ruleIfStmt ) ) | ( (lv_Block_6_0= ruleBlock ) ) ) )? ) )
            // InternalGo.g:1190:2: (otherlv_0= 'if' this_Anderson_1= ruleAnderson ruleExp ( (lv_Block_3_0= ruleBlock ) ) (otherlv_4= 'else' ( ( (lv_IfStmt_5_0= ruleIfStmt ) ) | ( (lv_Block_6_0= ruleBlock ) ) ) )? )
            {
            // InternalGo.g:1190:2: (otherlv_0= 'if' this_Anderson_1= ruleAnderson ruleExp ( (lv_Block_3_0= ruleBlock ) ) (otherlv_4= 'else' ( ( (lv_IfStmt_5_0= ruleIfStmt ) ) | ( (lv_Block_6_0= ruleBlock ) ) ) )? )
            // InternalGo.g:1191:3: otherlv_0= 'if' this_Anderson_1= ruleAnderson ruleExp ( (lv_Block_3_0= ruleBlock ) ) (otherlv_4= 'else' ( ( (lv_IfStmt_5_0= ruleIfStmt ) ) | ( (lv_Block_6_0= ruleBlock ) ) ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStmtAccess().getIfKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfStmtAccess().getAndersonParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_20);
            this_Anderson_1=ruleAnderson();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Anderson_1;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfStmtAccess().getExpParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_13);
            ruleExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1216:3: ( (lv_Block_3_0= ruleBlock ) )
            // InternalGo.g:1217:4: (lv_Block_3_0= ruleBlock )
            {
            // InternalGo.g:1217:4: (lv_Block_3_0= ruleBlock )
            // InternalGo.g:1218:5: lv_Block_3_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStmtAccess().getBlockBlockParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_41);
            lv_Block_3_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStmtRule());
              					}
              					add(
              						current,
              						"Block",
              						lv_Block_3_0,
              						"org.xtext.example.go.Go.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:1235:3: (otherlv_4= 'else' ( ( (lv_IfStmt_5_0= ruleIfStmt ) ) | ( (lv_Block_6_0= ruleBlock ) ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGo.g:1236:4: otherlv_4= 'else' ( ( (lv_IfStmt_5_0= ruleIfStmt ) ) | ( (lv_Block_6_0= ruleBlock ) ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getIfStmtAccess().getElseKeyword_4_0());
                      			
                    }
                    // InternalGo.g:1240:4: ( ( (lv_IfStmt_5_0= ruleIfStmt ) ) | ( (lv_Block_6_0= ruleBlock ) ) )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==34) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==29) ) {
                        alt35=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalGo.g:1241:5: ( (lv_IfStmt_5_0= ruleIfStmt ) )
                            {
                            // InternalGo.g:1241:5: ( (lv_IfStmt_5_0= ruleIfStmt ) )
                            // InternalGo.g:1242:6: (lv_IfStmt_5_0= ruleIfStmt )
                            {
                            // InternalGo.g:1242:6: (lv_IfStmt_5_0= ruleIfStmt )
                            // InternalGo.g:1243:7: lv_IfStmt_5_0= ruleIfStmt
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getIfStmtAccess().getIfStmtIfStmtParserRuleCall_4_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_IfStmt_5_0=ruleIfStmt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getIfStmtRule());
                              							}
                              							set(
                              								current,
                              								"IfStmt",
                              								lv_IfStmt_5_0,
                              								"org.xtext.example.go.Go.IfStmt");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGo.g:1261:5: ( (lv_Block_6_0= ruleBlock ) )
                            {
                            // InternalGo.g:1261:5: ( (lv_Block_6_0= ruleBlock ) )
                            // InternalGo.g:1262:6: (lv_Block_6_0= ruleBlock )
                            {
                            // InternalGo.g:1262:6: (lv_Block_6_0= ruleBlock )
                            // InternalGo.g:1263:7: lv_Block_6_0= ruleBlock
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getIfStmtAccess().getBlockBlockParserRuleCall_4_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_Block_6_0=ruleBlock();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getIfStmtRule());
                              							}
                              							add(
                              								current,
                              								"Block",
                              								lv_Block_6_0,
                              								"org.xtext.example.go.Go.Block");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


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
    // InternalGo.g:1286:1: entryRuleAnderson returns [EObject current=null] : iv_ruleAnderson= ruleAnderson EOF ;
    public final EObject entryRuleAnderson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnderson = null;


        try {
            // InternalGo.g:1286:49: (iv_ruleAnderson= ruleAnderson EOF )
            // InternalGo.g:1287:2: iv_ruleAnderson= ruleAnderson EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndersonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnderson=ruleAnderson();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnderson; 
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
    // InternalGo.g:1293:1: ruleAnderson returns [EObject current=null] : ( () ( ( ( (lv_decl_1_0= ruleDecl ) ) | ( (lv_Assig_2_0= ruleAssig ) ) | ruleExp ) otherlv_4= ';' )? ) ;
    public final EObject ruleAnderson() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_decl_1_0 = null;

        EObject lv_Assig_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1299:2: ( ( () ( ( ( (lv_decl_1_0= ruleDecl ) ) | ( (lv_Assig_2_0= ruleAssig ) ) | ruleExp ) otherlv_4= ';' )? ) )
            // InternalGo.g:1300:2: ( () ( ( ( (lv_decl_1_0= ruleDecl ) ) | ( (lv_Assig_2_0= ruleAssig ) ) | ruleExp ) otherlv_4= ';' )? )
            {
            // InternalGo.g:1300:2: ( () ( ( ( (lv_decl_1_0= ruleDecl ) ) | ( (lv_Assig_2_0= ruleAssig ) ) | ruleExp ) otherlv_4= ';' )? )
            // InternalGo.g:1301:3: () ( ( ( (lv_decl_1_0= ruleDecl ) ) | ( (lv_Assig_2_0= ruleAssig ) ) | ruleExp ) otherlv_4= ';' )?
            {
            // InternalGo.g:1301:3: ()
            // InternalGo.g:1302:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAndersonAccess().getAndersonAction_0(),
              					current);
              			
            }

            }

            // InternalGo.g:1311:3: ( ( ( (lv_decl_1_0= ruleDecl ) ) | ( (lv_Assig_2_0= ruleAssig ) ) | ruleExp ) otherlv_4= ';' )?
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalGo.g:1312:4: ( ( (lv_decl_1_0= ruleDecl ) ) | ( (lv_Assig_2_0= ruleAssig ) ) | ruleExp ) otherlv_4= ';'
                    {
                    // InternalGo.g:1312:4: ( ( (lv_decl_1_0= ruleDecl ) ) | ( (lv_Assig_2_0= ruleAssig ) ) | ruleExp )
                    int alt37=3;
                    alt37 = dfa37.predict(input);
                    switch (alt37) {
                        case 1 :
                            // InternalGo.g:1313:5: ( (lv_decl_1_0= ruleDecl ) )
                            {
                            // InternalGo.g:1313:5: ( (lv_decl_1_0= ruleDecl ) )
                            // InternalGo.g:1314:6: (lv_decl_1_0= ruleDecl )
                            {
                            // InternalGo.g:1314:6: (lv_decl_1_0= ruleDecl )
                            // InternalGo.g:1315:7: lv_decl_1_0= ruleDecl
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAndersonAccess().getDeclDeclParserRuleCall_1_0_0_0());
                              						
                            }
                            pushFollow(FOLLOW_15);
                            lv_decl_1_0=ruleDecl();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAndersonRule());
                              							}
                              							set(
                              								current,
                              								"decl",
                              								lv_decl_1_0,
                              								"org.xtext.example.go.Go.Decl");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGo.g:1333:5: ( (lv_Assig_2_0= ruleAssig ) )
                            {
                            // InternalGo.g:1333:5: ( (lv_Assig_2_0= ruleAssig ) )
                            // InternalGo.g:1334:6: (lv_Assig_2_0= ruleAssig )
                            {
                            // InternalGo.g:1334:6: (lv_Assig_2_0= ruleAssig )
                            // InternalGo.g:1335:7: lv_Assig_2_0= ruleAssig
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAndersonAccess().getAssigAssigParserRuleCall_1_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_15);
                            lv_Assig_2_0=ruleAssig();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAndersonRule());
                              							}
                              							set(
                              								current,
                              								"Assig",
                              								lv_Assig_2_0,
                              								"org.xtext.example.go.Go.Assig");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalGo.g:1353:5: ruleExp
                            {
                            if ( state.backtracking==0 ) {

                              					/* */
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getAndersonAccess().getExpParserRuleCall_1_0_2());
                              				
                            }
                            pushFollow(FOLLOW_15);
                            ruleExp();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAndersonAccess().getSemicolonKeyword_1_1());
                      			
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
    // $ANTLR end "ruleAnderson"


    // $ANTLR start "entryRuleBlock"
    // InternalGo.g:1373:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalGo.g:1373:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalGo.g:1374:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
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
    // InternalGo.g:1380:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_Statement_2_0= ruleStatement ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_Statement_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1386:2: ( ( () otherlv_1= '{' ( ( (lv_Statement_2_0= ruleStatement ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // InternalGo.g:1387:2: ( () otherlv_1= '{' ( ( (lv_Statement_2_0= ruleStatement ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // InternalGo.g:1387:2: ( () otherlv_1= '{' ( ( (lv_Statement_2_0= ruleStatement ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // InternalGo.g:1388:3: () otherlv_1= '{' ( ( (lv_Statement_2_0= ruleStatement ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // InternalGo.g:1388:3: ()
            // InternalGo.g:1389:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockAccess().getBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGo.g:1402:3: ( ( (lv_Statement_2_0= ruleStatement ) ) (otherlv_3= ';' )? )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_STRING)||LA40_0==RULE_OP_SUM||LA40_0==RULE_INT||LA40_0==17||LA40_0==21||LA40_0==28||LA40_0==34||LA40_0==36||(LA40_0>=38 && LA40_0<=43)||(LA40_0>=46 && LA40_0<=47)||LA40_0==54||(LA40_0>=57 && LA40_0<=58)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGo.g:1403:4: ( (lv_Statement_2_0= ruleStatement ) ) (otherlv_3= ';' )?
            	    {
            	    // InternalGo.g:1403:4: ( (lv_Statement_2_0= ruleStatement ) )
            	    // InternalGo.g:1404:5: (lv_Statement_2_0= ruleStatement )
            	    {
            	    // InternalGo.g:1404:5: (lv_Statement_2_0= ruleStatement )
            	    // InternalGo.g:1405:6: lv_Statement_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_Statement_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBlockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"Statement",
            	      							lv_Statement_2_0,
            	      							"org.xtext.example.go.Go.Statement");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalGo.g:1422:4: (otherlv_3= ';' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==15) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalGo.g:1423:5: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,15,FOLLOW_43); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getSemicolonKeyword_2_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
              		
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
    // InternalGo.g:1437:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalGo.g:1437:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalGo.g:1438:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
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
    // InternalGo.g:1444:1: ruleStatement returns [EObject current=null] : ( ( (lv_LabeledStmt_0_0= ruleLabeledStmt ) ) | ( (lv_SendStmt_1_0= ruleSendStmt ) ) | this_SimpleStmt_2= ruleSimpleStmt | this_IfStmt_3= ruleIfStmt | ( (lv_SwitchStmt_4_0= ruleSwitchStmt ) ) | ( (lv_ReturnStmt_5_0= ruleReturnStmt ) ) | this_ForStmt_6= ruleForStmt | ( (lv_BreakStmt_7_0= ruleBreakStmt ) ) | ( (lv_ContinueStmt_8_0= ruleContinueStmt ) ) | ( (lv_GotoStmt_9_0= ruleGotoStmt ) ) | ( (lv_FalltrhoughStmt_10_0= ruleFalltrhoughStmt ) ) | ( (lv_DeferStmt_11_0= ruleDeferStmt ) ) | this_SelectStmt_12= ruleSelectStmt ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_LabeledStmt_0_0 = null;

        AntlrDatatypeRuleToken lv_SendStmt_1_0 = null;

        EObject this_SimpleStmt_2 = null;

        EObject this_IfStmt_3 = null;

        EObject lv_SwitchStmt_4_0 = null;

        AntlrDatatypeRuleToken lv_ReturnStmt_5_0 = null;

        EObject this_ForStmt_6 = null;

        AntlrDatatypeRuleToken lv_BreakStmt_7_0 = null;

        AntlrDatatypeRuleToken lv_ContinueStmt_8_0 = null;

        AntlrDatatypeRuleToken lv_GotoStmt_9_0 = null;

        AntlrDatatypeRuleToken lv_FalltrhoughStmt_10_0 = null;

        AntlrDatatypeRuleToken lv_DeferStmt_11_0 = null;

        EObject this_SelectStmt_12 = null;



        	enterRule();

        try {
            // InternalGo.g:1450:2: ( ( ( (lv_LabeledStmt_0_0= ruleLabeledStmt ) ) | ( (lv_SendStmt_1_0= ruleSendStmt ) ) | this_SimpleStmt_2= ruleSimpleStmt | this_IfStmt_3= ruleIfStmt | ( (lv_SwitchStmt_4_0= ruleSwitchStmt ) ) | ( (lv_ReturnStmt_5_0= ruleReturnStmt ) ) | this_ForStmt_6= ruleForStmt | ( (lv_BreakStmt_7_0= ruleBreakStmt ) ) | ( (lv_ContinueStmt_8_0= ruleContinueStmt ) ) | ( (lv_GotoStmt_9_0= ruleGotoStmt ) ) | ( (lv_FalltrhoughStmt_10_0= ruleFalltrhoughStmt ) ) | ( (lv_DeferStmt_11_0= ruleDeferStmt ) ) | this_SelectStmt_12= ruleSelectStmt ) )
            // InternalGo.g:1451:2: ( ( (lv_LabeledStmt_0_0= ruleLabeledStmt ) ) | ( (lv_SendStmt_1_0= ruleSendStmt ) ) | this_SimpleStmt_2= ruleSimpleStmt | this_IfStmt_3= ruleIfStmt | ( (lv_SwitchStmt_4_0= ruleSwitchStmt ) ) | ( (lv_ReturnStmt_5_0= ruleReturnStmt ) ) | this_ForStmt_6= ruleForStmt | ( (lv_BreakStmt_7_0= ruleBreakStmt ) ) | ( (lv_ContinueStmt_8_0= ruleContinueStmt ) ) | ( (lv_GotoStmt_9_0= ruleGotoStmt ) ) | ( (lv_FalltrhoughStmt_10_0= ruleFalltrhoughStmt ) ) | ( (lv_DeferStmt_11_0= ruleDeferStmt ) ) | this_SelectStmt_12= ruleSelectStmt )
            {
            // InternalGo.g:1451:2: ( ( (lv_LabeledStmt_0_0= ruleLabeledStmt ) ) | ( (lv_SendStmt_1_0= ruleSendStmt ) ) | this_SimpleStmt_2= ruleSimpleStmt | this_IfStmt_3= ruleIfStmt | ( (lv_SwitchStmt_4_0= ruleSwitchStmt ) ) | ( (lv_ReturnStmt_5_0= ruleReturnStmt ) ) | this_ForStmt_6= ruleForStmt | ( (lv_BreakStmt_7_0= ruleBreakStmt ) ) | ( (lv_ContinueStmt_8_0= ruleContinueStmt ) ) | ( (lv_GotoStmt_9_0= ruleGotoStmt ) ) | ( (lv_FalltrhoughStmt_10_0= ruleFalltrhoughStmt ) ) | ( (lv_DeferStmt_11_0= ruleDeferStmt ) ) | this_SelectStmt_12= ruleSelectStmt )
            int alt41=13;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalGo.g:1452:3: ( (lv_LabeledStmt_0_0= ruleLabeledStmt ) )
                    {
                    // InternalGo.g:1452:3: ( (lv_LabeledStmt_0_0= ruleLabeledStmt ) )
                    // InternalGo.g:1453:4: (lv_LabeledStmt_0_0= ruleLabeledStmt )
                    {
                    // InternalGo.g:1453:4: (lv_LabeledStmt_0_0= ruleLabeledStmt )
                    // InternalGo.g:1454:5: lv_LabeledStmt_0_0= ruleLabeledStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStatementAccess().getLabeledStmtLabeledStmtParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_LabeledStmt_0_0=ruleLabeledStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStatementRule());
                      					}
                      					set(
                      						current,
                      						"LabeledStmt",
                      						lv_LabeledStmt_0_0,
                      						"org.xtext.example.go.Go.LabeledStmt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1472:3: ( (lv_SendStmt_1_0= ruleSendStmt ) )
                    {
                    // InternalGo.g:1472:3: ( (lv_SendStmt_1_0= ruleSendStmt ) )
                    // InternalGo.g:1473:4: (lv_SendStmt_1_0= ruleSendStmt )
                    {
                    // InternalGo.g:1473:4: (lv_SendStmt_1_0= ruleSendStmt )
                    // InternalGo.g:1474:5: lv_SendStmt_1_0= ruleSendStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStatementAccess().getSendStmtSendStmtParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_SendStmt_1_0=ruleSendStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStatementRule());
                      					}
                      					set(
                      						current,
                      						"SendStmt",
                      						lv_SendStmt_1_0,
                      						"org.xtext.example.go.Go.SendStmt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1492:3: this_SimpleStmt_2= ruleSimpleStmt
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSimpleStmtParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SimpleStmt_2=ruleSimpleStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SimpleStmt_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:1504:3: this_IfStmt_3= ruleIfStmt
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfStmtParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStmt_3=ruleIfStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfStmt_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:1516:3: ( (lv_SwitchStmt_4_0= ruleSwitchStmt ) )
                    {
                    // InternalGo.g:1516:3: ( (lv_SwitchStmt_4_0= ruleSwitchStmt ) )
                    // InternalGo.g:1517:4: (lv_SwitchStmt_4_0= ruleSwitchStmt )
                    {
                    // InternalGo.g:1517:4: (lv_SwitchStmt_4_0= ruleSwitchStmt )
                    // InternalGo.g:1518:5: lv_SwitchStmt_4_0= ruleSwitchStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStatementAccess().getSwitchStmtSwitchStmtParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_SwitchStmt_4_0=ruleSwitchStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStatementRule());
                      					}
                      					set(
                      						current,
                      						"SwitchStmt",
                      						lv_SwitchStmt_4_0,
                      						"org.xtext.example.go.Go.SwitchStmt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:1536:3: ( (lv_ReturnStmt_5_0= ruleReturnStmt ) )
                    {
                    // InternalGo.g:1536:3: ( (lv_ReturnStmt_5_0= ruleReturnStmt ) )
                    // InternalGo.g:1537:4: (lv_ReturnStmt_5_0= ruleReturnStmt )
                    {
                    // InternalGo.g:1537:4: (lv_ReturnStmt_5_0= ruleReturnStmt )
                    // InternalGo.g:1538:5: lv_ReturnStmt_5_0= ruleReturnStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStatementAccess().getReturnStmtReturnStmtParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ReturnStmt_5_0=ruleReturnStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStatementRule());
                      					}
                      					set(
                      						current,
                      						"ReturnStmt",
                      						lv_ReturnStmt_5_0,
                      						"org.xtext.example.go.Go.ReturnStmt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:1556:3: this_ForStmt_6= ruleForStmt
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getForStmtParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForStmt_6=ruleForStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForStmt_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGo.g:1568:3: ( (lv_BreakStmt_7_0= ruleBreakStmt ) )
                    {
                    // InternalGo.g:1568:3: ( (lv_BreakStmt_7_0= ruleBreakStmt ) )
                    // InternalGo.g:1569:4: (lv_BreakStmt_7_0= ruleBreakStmt )
                    {
                    // InternalGo.g:1569:4: (lv_BreakStmt_7_0= ruleBreakStmt )
                    // InternalGo.g:1570:5: lv_BreakStmt_7_0= ruleBreakStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStatementAccess().getBreakStmtBreakStmtParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_BreakStmt_7_0=ruleBreakStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStatementRule());
                      					}
                      					set(
                      						current,
                      						"BreakStmt",
                      						lv_BreakStmt_7_0,
                      						"org.xtext.example.go.Go.BreakStmt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalGo.g:1588:3: ( (lv_ContinueStmt_8_0= ruleContinueStmt ) )
                    {
                    // InternalGo.g:1588:3: ( (lv_ContinueStmt_8_0= ruleContinueStmt ) )
                    // InternalGo.g:1589:4: (lv_ContinueStmt_8_0= ruleContinueStmt )
                    {
                    // InternalGo.g:1589:4: (lv_ContinueStmt_8_0= ruleContinueStmt )
                    // InternalGo.g:1590:5: lv_ContinueStmt_8_0= ruleContinueStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStatementAccess().getContinueStmtContinueStmtParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ContinueStmt_8_0=ruleContinueStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStatementRule());
                      					}
                      					set(
                      						current,
                      						"ContinueStmt",
                      						lv_ContinueStmt_8_0,
                      						"org.xtext.example.go.Go.ContinueStmt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalGo.g:1608:3: ( (lv_GotoStmt_9_0= ruleGotoStmt ) )
                    {
                    // InternalGo.g:1608:3: ( (lv_GotoStmt_9_0= ruleGotoStmt ) )
                    // InternalGo.g:1609:4: (lv_GotoStmt_9_0= ruleGotoStmt )
                    {
                    // InternalGo.g:1609:4: (lv_GotoStmt_9_0= ruleGotoStmt )
                    // InternalGo.g:1610:5: lv_GotoStmt_9_0= ruleGotoStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStatementAccess().getGotoStmtGotoStmtParserRuleCall_9_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_GotoStmt_9_0=ruleGotoStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStatementRule());
                      					}
                      					set(
                      						current,
                      						"GotoStmt",
                      						lv_GotoStmt_9_0,
                      						"org.xtext.example.go.Go.GotoStmt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalGo.g:1628:3: ( (lv_FalltrhoughStmt_10_0= ruleFalltrhoughStmt ) )
                    {
                    // InternalGo.g:1628:3: ( (lv_FalltrhoughStmt_10_0= ruleFalltrhoughStmt ) )
                    // InternalGo.g:1629:4: (lv_FalltrhoughStmt_10_0= ruleFalltrhoughStmt )
                    {
                    // InternalGo.g:1629:4: (lv_FalltrhoughStmt_10_0= ruleFalltrhoughStmt )
                    // InternalGo.g:1630:5: lv_FalltrhoughStmt_10_0= ruleFalltrhoughStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStatementAccess().getFalltrhoughStmtFalltrhoughStmtParserRuleCall_10_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_FalltrhoughStmt_10_0=ruleFalltrhoughStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStatementRule());
                      					}
                      					set(
                      						current,
                      						"FalltrhoughStmt",
                      						lv_FalltrhoughStmt_10_0,
                      						"org.xtext.example.go.Go.FalltrhoughStmt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalGo.g:1648:3: ( (lv_DeferStmt_11_0= ruleDeferStmt ) )
                    {
                    // InternalGo.g:1648:3: ( (lv_DeferStmt_11_0= ruleDeferStmt ) )
                    // InternalGo.g:1649:4: (lv_DeferStmt_11_0= ruleDeferStmt )
                    {
                    // InternalGo.g:1649:4: (lv_DeferStmt_11_0= ruleDeferStmt )
                    // InternalGo.g:1650:5: lv_DeferStmt_11_0= ruleDeferStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStatementAccess().getDeferStmtDeferStmtParserRuleCall_11_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_DeferStmt_11_0=ruleDeferStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStatementRule());
                      					}
                      					set(
                      						current,
                      						"DeferStmt",
                      						lv_DeferStmt_11_0,
                      						"org.xtext.example.go.Go.DeferStmt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalGo.g:1668:3: this_SelectStmt_12= ruleSelectStmt
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSelectStmtParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SelectStmt_12=ruleSelectStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SelectStmt_12;
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


    // $ANTLR start "entryRuleSelectStmt"
    // InternalGo.g:1683:1: entryRuleSelectStmt returns [EObject current=null] : iv_ruleSelectStmt= ruleSelectStmt EOF ;
    public final EObject entryRuleSelectStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStmt = null;


        try {
            // InternalGo.g:1683:51: (iv_ruleSelectStmt= ruleSelectStmt EOF )
            // InternalGo.g:1684:2: iv_ruleSelectStmt= ruleSelectStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelectStmt=ruleSelectStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectStmt; 
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
    // $ANTLR end "entryRuleSelectStmt"


    // $ANTLR start "ruleSelectStmt"
    // InternalGo.g:1690:1: ruleSelectStmt returns [EObject current=null] : ( () otherlv_1= 'select' otherlv_2= '{' ( (lv_CommClause_3_0= ruleCommClause ) )* otherlv_4= '}' ) ;
    public final EObject ruleSelectStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_CommClause_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1696:2: ( ( () otherlv_1= 'select' otherlv_2= '{' ( (lv_CommClause_3_0= ruleCommClause ) )* otherlv_4= '}' ) )
            // InternalGo.g:1697:2: ( () otherlv_1= 'select' otherlv_2= '{' ( (lv_CommClause_3_0= ruleCommClause ) )* otherlv_4= '}' )
            {
            // InternalGo.g:1697:2: ( () otherlv_1= 'select' otherlv_2= '{' ( (lv_CommClause_3_0= ruleCommClause ) )* otherlv_4= '}' )
            // InternalGo.g:1698:3: () otherlv_1= 'select' otherlv_2= '{' ( (lv_CommClause_3_0= ruleCommClause ) )* otherlv_4= '}'
            {
            // InternalGo.g:1698:3: ()
            // InternalGo.g:1699:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSelectStmtAccess().getSelectStmtAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSelectStmtAccess().getSelectKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSelectStmtAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalGo.g:1716:3: ( (lv_CommClause_3_0= ruleCommClause ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=30 && LA42_0<=31)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGo.g:1717:4: (lv_CommClause_3_0= ruleCommClause )
            	    {
            	    // InternalGo.g:1717:4: (lv_CommClause_3_0= ruleCommClause )
            	    // InternalGo.g:1718:5: lv_CommClause_3_0= ruleCommClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSelectStmtAccess().getCommClauseCommClauseParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_CommClause_3_0=ruleCommClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSelectStmtRule());
            	      					}
            	      					add(
            	      						current,
            	      						"CommClause",
            	      						lv_CommClause_3_0,
            	      						"org.xtext.example.go.Go.CommClause");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSelectStmtAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleSelectStmt"


    // $ANTLR start "entryRuleCommClause"
    // InternalGo.g:1743:1: entryRuleCommClause returns [EObject current=null] : iv_ruleCommClause= ruleCommClause EOF ;
    public final EObject entryRuleCommClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommClause = null;


        try {
            // InternalGo.g:1743:51: (iv_ruleCommClause= ruleCommClause EOF )
            // InternalGo.g:1744:2: iv_ruleCommClause= ruleCommClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommClause=ruleCommClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommClause; 
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
    // $ANTLR end "entryRuleCommClause"


    // $ANTLR start "ruleCommClause"
    // InternalGo.g:1750:1: ruleCommClause returns [EObject current=null] : ( ruleCommCase otherlv_1= ':' this_StatementList_2= ruleStatementList ) ;
    public final EObject ruleCommClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_StatementList_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1756:2: ( ( ruleCommCase otherlv_1= ':' this_StatementList_2= ruleStatementList ) )
            // InternalGo.g:1757:2: ( ruleCommCase otherlv_1= ':' this_StatementList_2= ruleStatementList )
            {
            // InternalGo.g:1757:2: ( ruleCommCase otherlv_1= ':' this_StatementList_2= ruleStatementList )
            // InternalGo.g:1758:3: ruleCommCase otherlv_1= ':' this_StatementList_2= ruleStatementList
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCommClauseAccess().getCommCaseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            ruleCommCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCommClauseAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCommClauseAccess().getStatementListParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_StatementList_2=ruleStatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_StatementList_2;
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
    // $ANTLR end "ruleCommClause"


    // $ANTLR start "entryRuleStatementList"
    // InternalGo.g:1787:1: entryRuleStatementList returns [EObject current=null] : iv_ruleStatementList= ruleStatementList EOF ;
    public final EObject entryRuleStatementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementList = null;


        try {
            // InternalGo.g:1787:54: (iv_ruleStatementList= ruleStatementList EOF )
            // InternalGo.g:1788:2: iv_ruleStatementList= ruleStatementList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatementList=ruleStatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementList; 
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
    // $ANTLR end "entryRuleStatementList"


    // $ANTLR start "ruleStatementList"
    // InternalGo.g:1794:1: ruleStatementList returns [EObject current=null] : ( () ( ( (lv_Statement_1_0= ruleStatement ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleStatementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_Statement_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1800:2: ( ( () ( ( (lv_Statement_1_0= ruleStatement ) ) (otherlv_2= ';' )? )* ) )
            // InternalGo.g:1801:2: ( () ( ( (lv_Statement_1_0= ruleStatement ) ) (otherlv_2= ';' )? )* )
            {
            // InternalGo.g:1801:2: ( () ( ( (lv_Statement_1_0= ruleStatement ) ) (otherlv_2= ';' )? )* )
            // InternalGo.g:1802:3: () ( ( (lv_Statement_1_0= ruleStatement ) ) (otherlv_2= ';' )? )*
            {
            // InternalGo.g:1802:3: ()
            // InternalGo.g:1803:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStatementListAccess().getStatementListAction_0(),
              					current);
              			
            }

            }

            // InternalGo.g:1812:3: ( ( (lv_Statement_1_0= ruleStatement ) ) (otherlv_2= ';' )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_STRING)||LA44_0==RULE_OP_SUM||LA44_0==RULE_INT||LA44_0==17||LA44_0==21||LA44_0==28||LA44_0==34||LA44_0==36||(LA44_0>=38 && LA44_0<=43)||(LA44_0>=46 && LA44_0<=47)||LA44_0==54||(LA44_0>=57 && LA44_0<=58)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalGo.g:1813:4: ( (lv_Statement_1_0= ruleStatement ) ) (otherlv_2= ';' )?
            	    {
            	    // InternalGo.g:1813:4: ( (lv_Statement_1_0= ruleStatement ) )
            	    // InternalGo.g:1814:5: (lv_Statement_1_0= ruleStatement )
            	    {
            	    // InternalGo.g:1814:5: (lv_Statement_1_0= ruleStatement )
            	    // InternalGo.g:1815:6: lv_Statement_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStatementListAccess().getStatementStatementParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_Statement_1_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStatementListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"Statement",
            	      							lv_Statement_1_0,
            	      							"org.xtext.example.go.Go.Statement");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalGo.g:1832:4: (otherlv_2= ';' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==15) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalGo.g:1833:5: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,15,FOLLOW_38); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_2, grammarAccess.getStatementListAccess().getSemicolonKeyword_1_1());
            	              				
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
    // $ANTLR end "ruleStatementList"


    // $ANTLR start "entryRuleCommCase"
    // InternalGo.g:1843:1: entryRuleCommCase returns [String current=null] : iv_ruleCommCase= ruleCommCase EOF ;
    public final String entryRuleCommCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommCase = null;


        try {
            // InternalGo.g:1843:48: (iv_ruleCommCase= ruleCommCase EOF )
            // InternalGo.g:1844:2: iv_ruleCommCase= ruleCommCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommCase=ruleCommCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommCase.getText(); 
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
    // $ANTLR end "entryRuleCommCase"


    // $ANTLR start "ruleCommCase"
    // InternalGo.g:1850:1: ruleCommCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'case' (this_SendStmt_1= ruleSendStmt | this_RecvStmt_2= ruleRecvStmt ) ) | kw= 'default' ) ;
    public final AntlrDatatypeRuleToken ruleCommCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SendStmt_1 = null;

        AntlrDatatypeRuleToken this_RecvStmt_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1856:2: ( ( (kw= 'case' (this_SendStmt_1= ruleSendStmt | this_RecvStmt_2= ruleRecvStmt ) ) | kw= 'default' ) )
            // InternalGo.g:1857:2: ( (kw= 'case' (this_SendStmt_1= ruleSendStmt | this_RecvStmt_2= ruleRecvStmt ) ) | kw= 'default' )
            {
            // InternalGo.g:1857:2: ( (kw= 'case' (this_SendStmt_1= ruleSendStmt | this_RecvStmt_2= ruleRecvStmt ) ) | kw= 'default' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==30) ) {
                alt46=1;
            }
            else if ( (LA46_0==31) ) {
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
                    // InternalGo.g:1858:3: (kw= 'case' (this_SendStmt_1= ruleSendStmt | this_RecvStmt_2= ruleRecvStmt ) )
                    {
                    // InternalGo.g:1858:3: (kw= 'case' (this_SendStmt_1= ruleSendStmt | this_RecvStmt_2= ruleRecvStmt ) )
                    // InternalGo.g:1859:4: kw= 'case' (this_SendStmt_1= ruleSendStmt | this_RecvStmt_2= ruleRecvStmt )
                    {
                    kw=(Token)match(input,30,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCommCaseAccess().getCaseKeyword_0_0());
                      			
                    }
                    // InternalGo.g:1864:4: (this_SendStmt_1= ruleSendStmt | this_RecvStmt_2= ruleRecvStmt )
                    int alt45=2;
                    alt45 = dfa45.predict(input);
                    switch (alt45) {
                        case 1 :
                            // InternalGo.g:1865:5: this_SendStmt_1= ruleSendStmt
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getCommCaseAccess().getSendStmtParserRuleCall_0_1_0());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_SendStmt_1=ruleSendStmt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_SendStmt_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:1876:5: this_RecvStmt_2= ruleRecvStmt
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getCommCaseAccess().getRecvStmtParserRuleCall_0_1_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_RecvStmt_2=ruleRecvStmt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_RecvStmt_2);
                              				
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
                    // InternalGo.g:1889:3: kw= 'default'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCommCaseAccess().getDefaultKeyword_1());
                      		
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
    // $ANTLR end "ruleCommCase"


    // $ANTLR start "entryRuleRecvStmt"
    // InternalGo.g:1898:1: entryRuleRecvStmt returns [String current=null] : iv_ruleRecvStmt= ruleRecvStmt EOF ;
    public final String entryRuleRecvStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRecvStmt = null;


        try {
            // InternalGo.g:1898:48: (iv_ruleRecvStmt= ruleRecvStmt EOF )
            // InternalGo.g:1899:2: iv_ruleRecvStmt= ruleRecvStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecvStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRecvStmt=ruleRecvStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecvStmt.getText(); 
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
    // $ANTLR end "entryRuleRecvStmt"


    // $ANTLR start "ruleRecvStmt"
    // InternalGo.g:1905:1: ruleRecvStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_Exp_0= ruleExp this_ExpList_1= ruleExpList kw= '=' ) | (this_ID_3= RULE_ID this_IdList_4= ruleIdList kw= ':=' ) )? this_Exp_6= ruleExp ) ;
    public final AntlrDatatypeRuleToken ruleRecvStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_Exp_0 = null;

        AntlrDatatypeRuleToken this_ExpList_1 = null;

        AntlrDatatypeRuleToken this_IdList_4 = null;

        AntlrDatatypeRuleToken this_Exp_6 = null;



        	enterRule();

        try {
            // InternalGo.g:1911:2: ( ( ( (this_Exp_0= ruleExp this_ExpList_1= ruleExpList kw= '=' ) | (this_ID_3= RULE_ID this_IdList_4= ruleIdList kw= ':=' ) )? this_Exp_6= ruleExp ) )
            // InternalGo.g:1912:2: ( ( (this_Exp_0= ruleExp this_ExpList_1= ruleExpList kw= '=' ) | (this_ID_3= RULE_ID this_IdList_4= ruleIdList kw= ':=' ) )? this_Exp_6= ruleExp )
            {
            // InternalGo.g:1912:2: ( ( (this_Exp_0= ruleExp this_ExpList_1= ruleExpList kw= '=' ) | (this_ID_3= RULE_ID this_IdList_4= ruleIdList kw= ':=' ) )? this_Exp_6= ruleExp )
            // InternalGo.g:1913:3: ( (this_Exp_0= ruleExp this_ExpList_1= ruleExpList kw= '=' ) | (this_ID_3= RULE_ID this_IdList_4= ruleIdList kw= ':=' ) )? this_Exp_6= ruleExp
            {
            // InternalGo.g:1913:3: ( (this_Exp_0= ruleExp this_ExpList_1= ruleExpList kw= '=' ) | (this_ID_3= RULE_ID this_IdList_4= ruleIdList kw= ':=' ) )?
            int alt47=3;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // InternalGo.g:1914:4: (this_Exp_0= ruleExp this_ExpList_1= ruleExpList kw= '=' )
                    {
                    // InternalGo.g:1914:4: (this_Exp_0= ruleExp this_ExpList_1= ruleExpList kw= '=' )
                    // InternalGo.g:1915:5: this_Exp_0= ruleExp this_ExpList_1= ruleExpList kw= '='
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecvStmtAccess().getExpParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_46);
                    this_Exp_0=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Exp_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecvStmtAccess().getExpListParserRuleCall_0_0_1());
                      				
                    }
                    pushFollow(FOLLOW_47);
                    this_ExpList_1=ruleExpList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_ExpList_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    kw=(Token)match(input,23,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getRecvStmtAccess().getEqualsSignKeyword_0_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1942:4: (this_ID_3= RULE_ID this_IdList_4= ruleIdList kw= ':=' )
                    {
                    // InternalGo.g:1942:4: (this_ID_3= RULE_ID this_IdList_4= ruleIdList kw= ':=' )
                    // InternalGo.g:1943:5: this_ID_3= RULE_ID this_IdList_4= ruleIdList kw= ':='
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_ID_3);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ID_3, grammarAccess.getRecvStmtAccess().getIDTerminalRuleCall_0_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecvStmtAccess().getIdListParserRuleCall_0_1_1());
                      				
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
                    kw=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getRecvStmtAccess().getColonEqualsSignKeyword_0_1_2());
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRecvStmtAccess().getExpParserRuleCall_1());
              		
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
    // $ANTLR end "ruleRecvStmt"


    // $ANTLR start "entryRuleLabeledStmt"
    // InternalGo.g:1981:1: entryRuleLabeledStmt returns [EObject current=null] : iv_ruleLabeledStmt= ruleLabeledStmt EOF ;
    public final EObject entryRuleLabeledStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabeledStmt = null;


        try {
            // InternalGo.g:1981:52: (iv_ruleLabeledStmt= ruleLabeledStmt EOF )
            // InternalGo.g:1982:2: iv_ruleLabeledStmt= ruleLabeledStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabeledStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLabeledStmt=ruleLabeledStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabeledStmt; 
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
    // $ANTLR end "entryRuleLabeledStmt"


    // $ANTLR start "ruleLabeledStmt"
    // InternalGo.g:1988:1: ruleLabeledStmt returns [EObject current=null] : (this_ID_0= RULE_ID otherlv_1= ':' this_Statement_2= ruleStatement ) ;
    public final EObject ruleLabeledStmt() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token otherlv_1=null;
        EObject this_Statement_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1994:2: ( (this_ID_0= RULE_ID otherlv_1= ':' this_Statement_2= ruleStatement ) )
            // InternalGo.g:1995:2: (this_ID_0= RULE_ID otherlv_1= ':' this_Statement_2= ruleStatement )
            {
            // InternalGo.g:1995:2: (this_ID_0= RULE_ID otherlv_1= ':' this_Statement_2= ruleStatement )
            // InternalGo.g:1996:3: this_ID_0= RULE_ID otherlv_1= ':' this_Statement_2= ruleStatement
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getLabeledStmtAccess().getIDTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLabeledStmtAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLabeledStmtAccess().getStatementParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_Statement_2=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Statement_2;
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
    // $ANTLR end "ruleLabeledStmt"


    // $ANTLR start "entryRuleSendStmt"
    // InternalGo.g:2019:1: entryRuleSendStmt returns [String current=null] : iv_ruleSendStmt= ruleSendStmt EOF ;
    public final String entryRuleSendStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSendStmt = null;


        try {
            // InternalGo.g:2019:48: (iv_ruleSendStmt= ruleSendStmt EOF )
            // InternalGo.g:2020:2: iv_ruleSendStmt= ruleSendStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSendStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSendStmt=ruleSendStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSendStmt.getText(); 
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
    // $ANTLR end "entryRuleSendStmt"


    // $ANTLR start "ruleSendStmt"
    // InternalGo.g:2026:1: ruleSendStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Exp_0= ruleExp kw= '<-' this_Exp_2= ruleExp ) ;
    public final AntlrDatatypeRuleToken ruleSendStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_0 = null;

        AntlrDatatypeRuleToken this_Exp_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2032:2: ( (this_Exp_0= ruleExp kw= '<-' this_Exp_2= ruleExp ) )
            // InternalGo.g:2033:2: (this_Exp_0= ruleExp kw= '<-' this_Exp_2= ruleExp )
            {
            // InternalGo.g:2033:2: (this_Exp_0= ruleExp kw= '<-' this_Exp_2= ruleExp )
            // InternalGo.g:2034:3: this_Exp_0= ruleExp kw= '<-' this_Exp_2= ruleExp
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSendStmtAccess().getExpParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_50);
            this_Exp_0=ruleExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Exp_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,37,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSendStmtAccess().getLessThanSignHyphenMinusKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSendStmtAccess().getExpParserRuleCall_2());
              		
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
    // $ANTLR end "ruleSendStmt"


    // $ANTLR start "entryRuleBreakStmt"
    // InternalGo.g:2063:1: entryRuleBreakStmt returns [String current=null] : iv_ruleBreakStmt= ruleBreakStmt EOF ;
    public final String entryRuleBreakStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBreakStmt = null;


        try {
            // InternalGo.g:2063:49: (iv_ruleBreakStmt= ruleBreakStmt EOF )
            // InternalGo.g:2064:2: iv_ruleBreakStmt= ruleBreakStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBreakStmt=ruleBreakStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakStmt.getText(); 
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
    // $ANTLR end "entryRuleBreakStmt"


    // $ANTLR start "ruleBreakStmt"
    // InternalGo.g:2070:1: ruleBreakStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'break' (this_ID_1= RULE_ID )? (kw= ';' )? ) ;
    public final AntlrDatatypeRuleToken ruleBreakStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGo.g:2076:2: ( (kw= 'break' (this_ID_1= RULE_ID )? (kw= ';' )? ) )
            // InternalGo.g:2077:2: (kw= 'break' (this_ID_1= RULE_ID )? (kw= ';' )? )
            {
            // InternalGo.g:2077:2: (kw= 'break' (this_ID_1= RULE_ID )? (kw= ';' )? )
            // InternalGo.g:2078:3: kw= 'break' (this_ID_1= RULE_ID )? (kw= ';' )?
            {
            kw=(Token)match(input,38,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBreakStmtAccess().getBreakKeyword_0());
              		
            }
            // InternalGo.g:2083:3: (this_ID_1= RULE_ID )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred63_InternalGo()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalGo.g:2084:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_1, grammarAccess.getBreakStmtAccess().getIDTerminalRuleCall_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:2092:3: (kw= ';' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==15) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred64_InternalGo()) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // InternalGo.g:2093:4: kw= ';'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getBreakStmtAccess().getSemicolonKeyword_2());
                      			
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
    // $ANTLR end "ruleBreakStmt"


    // $ANTLR start "entryRuleContinueStmt"
    // InternalGo.g:2103:1: entryRuleContinueStmt returns [String current=null] : iv_ruleContinueStmt= ruleContinueStmt EOF ;
    public final String entryRuleContinueStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContinueStmt = null;


        try {
            // InternalGo.g:2103:52: (iv_ruleContinueStmt= ruleContinueStmt EOF )
            // InternalGo.g:2104:2: iv_ruleContinueStmt= ruleContinueStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContinueStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContinueStmt=ruleContinueStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContinueStmt.getText(); 
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
    // $ANTLR end "entryRuleContinueStmt"


    // $ANTLR start "ruleContinueStmt"
    // InternalGo.g:2110:1: ruleContinueStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'continue' (this_ID_1= RULE_ID )? (kw= ';' )? ) ;
    public final AntlrDatatypeRuleToken ruleContinueStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGo.g:2116:2: ( (kw= 'continue' (this_ID_1= RULE_ID )? (kw= ';' )? ) )
            // InternalGo.g:2117:2: (kw= 'continue' (this_ID_1= RULE_ID )? (kw= ';' )? )
            {
            // InternalGo.g:2117:2: (kw= 'continue' (this_ID_1= RULE_ID )? (kw= ';' )? )
            // InternalGo.g:2118:3: kw= 'continue' (this_ID_1= RULE_ID )? (kw= ';' )?
            {
            kw=(Token)match(input,39,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getContinueStmtAccess().getContinueKeyword_0());
              		
            }
            // InternalGo.g:2123:3: (this_ID_1= RULE_ID )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred65_InternalGo()) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // InternalGo.g:2124:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_1, grammarAccess.getContinueStmtAccess().getIDTerminalRuleCall_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:2132:3: (kw= ';' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==15) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred66_InternalGo()) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // InternalGo.g:2133:4: kw= ';'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getContinueStmtAccess().getSemicolonKeyword_2());
                      			
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
    // $ANTLR end "ruleContinueStmt"


    // $ANTLR start "entryRuleGotoStmt"
    // InternalGo.g:2143:1: entryRuleGotoStmt returns [String current=null] : iv_ruleGotoStmt= ruleGotoStmt EOF ;
    public final String entryRuleGotoStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGotoStmt = null;


        try {
            // InternalGo.g:2143:48: (iv_ruleGotoStmt= ruleGotoStmt EOF )
            // InternalGo.g:2144:2: iv_ruleGotoStmt= ruleGotoStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGotoStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGotoStmt=ruleGotoStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGotoStmt.getText(); 
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
    // $ANTLR end "entryRuleGotoStmt"


    // $ANTLR start "ruleGotoStmt"
    // InternalGo.g:2150:1: ruleGotoStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'goto' (this_ID_1= RULE_ID )? (kw= ';' )? ) ;
    public final AntlrDatatypeRuleToken ruleGotoStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGo.g:2156:2: ( (kw= 'goto' (this_ID_1= RULE_ID )? (kw= ';' )? ) )
            // InternalGo.g:2157:2: (kw= 'goto' (this_ID_1= RULE_ID )? (kw= ';' )? )
            {
            // InternalGo.g:2157:2: (kw= 'goto' (this_ID_1= RULE_ID )? (kw= ';' )? )
            // InternalGo.g:2158:3: kw= 'goto' (this_ID_1= RULE_ID )? (kw= ';' )?
            {
            kw=(Token)match(input,40,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getGotoStmtAccess().getGotoKeyword_0());
              		
            }
            // InternalGo.g:2163:3: (this_ID_1= RULE_ID )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred67_InternalGo()) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // InternalGo.g:2164:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_1, grammarAccess.getGotoStmtAccess().getIDTerminalRuleCall_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:2172:3: (kw= ';' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==15) ) {
                int LA53_1 = input.LA(2);

                if ( (synpred68_InternalGo()) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // InternalGo.g:2173:4: kw= ';'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getGotoStmtAccess().getSemicolonKeyword_2());
                      			
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
    // $ANTLR end "ruleGotoStmt"


    // $ANTLR start "entryRuleFalltrhoughStmt"
    // InternalGo.g:2183:1: entryRuleFalltrhoughStmt returns [String current=null] : iv_ruleFalltrhoughStmt= ruleFalltrhoughStmt EOF ;
    public final String entryRuleFalltrhoughStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFalltrhoughStmt = null;


        try {
            // InternalGo.g:2183:55: (iv_ruleFalltrhoughStmt= ruleFalltrhoughStmt EOF )
            // InternalGo.g:2184:2: iv_ruleFalltrhoughStmt= ruleFalltrhoughStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFalltrhoughStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFalltrhoughStmt=ruleFalltrhoughStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFalltrhoughStmt.getText(); 
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
    // $ANTLR end "entryRuleFalltrhoughStmt"


    // $ANTLR start "ruleFalltrhoughStmt"
    // InternalGo.g:2190:1: ruleFalltrhoughStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'fallthrough' (kw= ';' )? ) ;
    public final AntlrDatatypeRuleToken ruleFalltrhoughStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2196:2: ( (kw= 'fallthrough' (kw= ';' )? ) )
            // InternalGo.g:2197:2: (kw= 'fallthrough' (kw= ';' )? )
            {
            // InternalGo.g:2197:2: (kw= 'fallthrough' (kw= ';' )? )
            // InternalGo.g:2198:3: kw= 'fallthrough' (kw= ';' )?
            {
            kw=(Token)match(input,41,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFalltrhoughStmtAccess().getFallthroughKeyword_0());
              		
            }
            // InternalGo.g:2203:3: (kw= ';' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==15) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred69_InternalGo()) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // InternalGo.g:2204:4: kw= ';'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFalltrhoughStmtAccess().getSemicolonKeyword_1());
                      			
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
    // $ANTLR end "ruleFalltrhoughStmt"


    // $ANTLR start "entryRuleDeferStmt"
    // InternalGo.g:2214:1: entryRuleDeferStmt returns [String current=null] : iv_ruleDeferStmt= ruleDeferStmt EOF ;
    public final String entryRuleDeferStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeferStmt = null;


        try {
            // InternalGo.g:2214:49: (iv_ruleDeferStmt= ruleDeferStmt EOF )
            // InternalGo.g:2215:2: iv_ruleDeferStmt= ruleDeferStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeferStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeferStmt=ruleDeferStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeferStmt.getText(); 
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
    // $ANTLR end "entryRuleDeferStmt"


    // $ANTLR start "ruleDeferStmt"
    // InternalGo.g:2221:1: ruleDeferStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'defer' this_Exp_1= ruleExp (kw= ';' )? ) ;
    public final AntlrDatatypeRuleToken ruleDeferStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2227:2: ( (kw= 'defer' this_Exp_1= ruleExp (kw= ';' )? ) )
            // InternalGo.g:2228:2: (kw= 'defer' this_Exp_1= ruleExp (kw= ';' )? )
            {
            // InternalGo.g:2228:2: (kw= 'defer' this_Exp_1= ruleExp (kw= ';' )? )
            // InternalGo.g:2229:3: kw= 'defer' this_Exp_1= ruleExp (kw= ';' )?
            {
            kw=(Token)match(input,42,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDeferStmtAccess().getDeferKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDeferStmtAccess().getExpParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_52);
            this_Exp_1=ruleExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Exp_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2244:3: (kw= ';' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==15) ) {
                int LA55_1 = input.LA(2);

                if ( (synpred70_InternalGo()) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // InternalGo.g:2245:4: kw= ';'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDeferStmtAccess().getSemicolonKeyword_2());
                      			
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
    // $ANTLR end "ruleDeferStmt"


    // $ANTLR start "entryRuleReturnStmt"
    // InternalGo.g:2255:1: entryRuleReturnStmt returns [String current=null] : iv_ruleReturnStmt= ruleReturnStmt EOF ;
    public final String entryRuleReturnStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReturnStmt = null;


        try {
            // InternalGo.g:2255:50: (iv_ruleReturnStmt= ruleReturnStmt EOF )
            // InternalGo.g:2256:2: iv_ruleReturnStmt= ruleReturnStmt EOF
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
    // InternalGo.g:2262:1: ruleReturnStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'return' (this_Exp_1= ruleExp )? ) ;
    public final AntlrDatatypeRuleToken ruleReturnStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2268:2: ( (kw= 'return' (this_Exp_1= ruleExp )? ) )
            // InternalGo.g:2269:2: (kw= 'return' (this_Exp_1= ruleExp )? )
            {
            // InternalGo.g:2269:2: (kw= 'return' (this_Exp_1= ruleExp )? )
            // InternalGo.g:2270:3: kw= 'return' (this_Exp_1= ruleExp )?
            {
            kw=(Token)match(input,43,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getReturnStmtAccess().getReturnKeyword_0());
              		
            }
            // InternalGo.g:2275:3: (this_Exp_1= ruleExp )?
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalGo.g:2276:4: this_Exp_1= ruleExp
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
    // InternalGo.g:2291:1: entryRuleTypeDef returns [String current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final String entryRuleTypeDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeDef = null;


        try {
            // InternalGo.g:2291:47: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalGo.g:2292:2: iv_ruleTypeDef= ruleTypeDef EOF
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
    // InternalGo.g:2298:1: ruleTypeDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'type' this_ID_1= RULE_ID this_TypeName_2= ruleTypeName ) ;
    public final AntlrDatatypeRuleToken ruleTypeDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_TypeName_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2304:2: ( (kw= 'type' this_ID_1= RULE_ID this_TypeName_2= ruleTypeName ) )
            // InternalGo.g:2305:2: (kw= 'type' this_ID_1= RULE_ID this_TypeName_2= ruleTypeName )
            {
            // InternalGo.g:2305:2: (kw= 'type' this_ID_1= RULE_ID this_TypeName_2= ruleTypeName )
            // InternalGo.g:2306:3: kw= 'type' this_ID_1= RULE_ID this_TypeName_2= ruleTypeName
            {
            kw=(Token)match(input,44,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeDefAccess().getTypeKeyword_0());
              		
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_1, grammarAccess.getTypeDefAccess().getIDTerminalRuleCall_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeDefAccess().getTypeNameParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_TypeName_2=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TypeName_2);
              		
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
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleStruct"
    // InternalGo.g:2332:1: entryRuleStruct returns [String current=null] : iv_ruleStruct= ruleStruct EOF ;
    public final String entryRuleStruct() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStruct = null;


        try {
            // InternalGo.g:2332:46: (iv_ruleStruct= ruleStruct EOF )
            // InternalGo.g:2333:2: iv_ruleStruct= ruleStruct EOF
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
    // InternalGo.g:2339:1: ruleStruct returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' kw= '{' (this_FieldDecl_2= ruleFieldDecl (kw= ';' )? )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleStruct() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FieldDecl_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2345:2: ( (kw= 'struct' kw= '{' (this_FieldDecl_2= ruleFieldDecl (kw= ';' )? )* kw= '}' ) )
            // InternalGo.g:2346:2: (kw= 'struct' kw= '{' (this_FieldDecl_2= ruleFieldDecl (kw= ';' )? )* kw= '}' )
            {
            // InternalGo.g:2346:2: (kw= 'struct' kw= '{' (this_FieldDecl_2= ruleFieldDecl (kw= ';' )? )* kw= '}' )
            // InternalGo.g:2347:3: kw= 'struct' kw= '{' (this_FieldDecl_2= ruleFieldDecl (kw= ';' )? )* kw= '}'
            {
            kw=(Token)match(input,45,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStructAccess().getStructKeyword_0());
              		
            }
            kw=(Token)match(input,29,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGo.g:2357:3: (this_FieldDecl_2= ruleFieldDecl (kw= ';' )? )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==EOF||LA58_0==RULE_ID||(LA58_0>=22 && LA58_0<=23)||(LA58_0>=26 && LA58_0<=27)||LA58_0==45||(LA58_0>=59 && LA58_0<=61)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalGo.g:2358:4: this_FieldDecl_2= ruleFieldDecl (kw= ';' )?
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStructAccess().getFieldDeclParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_55);
            	    this_FieldDecl_2=ruleFieldDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_FieldDecl_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalGo.g:2368:4: (kw= ';' )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==15) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // InternalGo.g:2369:5: kw= ';'
            	            {
            	            kw=(Token)match(input,15,FOLLOW_54); if (state.failed) return current;
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
            	    break loop58;
                }
            } while (true);

            kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2385:1: entryRuleFieldDecl returns [String current=null] : iv_ruleFieldDecl= ruleFieldDecl EOF ;
    public final String entryRuleFieldDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldDecl = null;


        try {
            // InternalGo.g:2385:49: (iv_ruleFieldDecl= ruleFieldDecl EOF )
            // InternalGo.g:2386:2: iv_ruleFieldDecl= ruleFieldDecl EOF
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
    // InternalGo.g:2392:1: ruleFieldDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IdList_0= ruleIdList this_TypeName_1= ruleTypeName ) ;
    public final AntlrDatatypeRuleToken ruleFieldDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IdList_0 = null;

        AntlrDatatypeRuleToken this_TypeName_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2398:2: ( (this_IdList_0= ruleIdList this_TypeName_1= ruleTypeName ) )
            // InternalGo.g:2399:2: (this_IdList_0= ruleIdList this_TypeName_1= ruleTypeName )
            {
            // InternalGo.g:2399:2: (this_IdList_0= ruleIdList this_TypeName_1= ruleTypeName )
            // InternalGo.g:2400:3: this_IdList_0= ruleIdList this_TypeName_1= ruleTypeName
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFieldDeclAccess().getIdListParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_IdList_0=ruleIdList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IdList_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFieldDeclAccess().getTypeNameParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_TypeName_1=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TypeName_1);
              		
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
    // $ANTLR end "ruleFieldDecl"


    // $ANTLR start "entryRuleDecl"
    // InternalGo.g:2424:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // InternalGo.g:2424:45: (iv_ruleDecl= ruleDecl EOF )
            // InternalGo.g:2425:2: iv_ruleDecl= ruleDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDecl=ruleDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecl; 
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
    // InternalGo.g:2431:1: ruleDecl returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) ruleIdList otherlv_2= ':=' ruleExp ruleExpList ) | ( (otherlv_5= 'var' | otherlv_6= 'const' ) ( (lv_name_7_0= RULE_ID ) ) ( (lv_idList_8_0= ruleIdList ) ) ( (lv_type_9_0= ruleTypeName ) ) (otherlv_10= '=' ( (lv_exp_11_0= ruleExp ) ) ( (lv_explist_12_0= ruleExpList ) ) )? ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_idList_8_0 = null;

        AntlrDatatypeRuleToken lv_type_9_0 = null;

        AntlrDatatypeRuleToken lv_exp_11_0 = null;

        AntlrDatatypeRuleToken lv_explist_12_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2437:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) ruleIdList otherlv_2= ':=' ruleExp ruleExpList ) | ( (otherlv_5= 'var' | otherlv_6= 'const' ) ( (lv_name_7_0= RULE_ID ) ) ( (lv_idList_8_0= ruleIdList ) ) ( (lv_type_9_0= ruleTypeName ) ) (otherlv_10= '=' ( (lv_exp_11_0= ruleExp ) ) ( (lv_explist_12_0= ruleExpList ) ) )? ) ) )
            // InternalGo.g:2438:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ruleIdList otherlv_2= ':=' ruleExp ruleExpList ) | ( (otherlv_5= 'var' | otherlv_6= 'const' ) ( (lv_name_7_0= RULE_ID ) ) ( (lv_idList_8_0= ruleIdList ) ) ( (lv_type_9_0= ruleTypeName ) ) (otherlv_10= '=' ( (lv_exp_11_0= ruleExp ) ) ( (lv_explist_12_0= ruleExpList ) ) )? ) )
            {
            // InternalGo.g:2438:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ruleIdList otherlv_2= ':=' ruleExp ruleExpList ) | ( (otherlv_5= 'var' | otherlv_6= 'const' ) ( (lv_name_7_0= RULE_ID ) ) ( (lv_idList_8_0= ruleIdList ) ) ( (lv_type_9_0= ruleTypeName ) ) (otherlv_10= '=' ( (lv_exp_11_0= ruleExp ) ) ( (lv_explist_12_0= ruleExpList ) ) )? ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( ((LA61_0>=46 && LA61_0<=47)) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalGo.g:2439:3: ( ( (lv_name_0_0= RULE_ID ) ) ruleIdList otherlv_2= ':=' ruleExp ruleExpList )
                    {
                    // InternalGo.g:2439:3: ( ( (lv_name_0_0= RULE_ID ) ) ruleIdList otherlv_2= ':=' ruleExp ruleExpList )
                    // InternalGo.g:2440:4: ( (lv_name_0_0= RULE_ID ) ) ruleIdList otherlv_2= ':=' ruleExp ruleExpList
                    {
                    // InternalGo.g:2440:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalGo.g:2441:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalGo.g:2441:5: (lv_name_0_0= RULE_ID )
                    // InternalGo.g:2442:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_0, grammarAccess.getDeclAccess().getNameIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDeclRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_0_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDeclAccess().getIdListParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_49);
                    ruleIdList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDeclAccess().getColonEqualsSignKeyword_0_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDeclAccess().getExpParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_56);
                    ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDeclAccess().getExpListParserRuleCall_0_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2494:3: ( (otherlv_5= 'var' | otherlv_6= 'const' ) ( (lv_name_7_0= RULE_ID ) ) ( (lv_idList_8_0= ruleIdList ) ) ( (lv_type_9_0= ruleTypeName ) ) (otherlv_10= '=' ( (lv_exp_11_0= ruleExp ) ) ( (lv_explist_12_0= ruleExpList ) ) )? )
                    {
                    // InternalGo.g:2494:3: ( (otherlv_5= 'var' | otherlv_6= 'const' ) ( (lv_name_7_0= RULE_ID ) ) ( (lv_idList_8_0= ruleIdList ) ) ( (lv_type_9_0= ruleTypeName ) ) (otherlv_10= '=' ( (lv_exp_11_0= ruleExp ) ) ( (lv_explist_12_0= ruleExpList ) ) )? )
                    // InternalGo.g:2495:4: (otherlv_5= 'var' | otherlv_6= 'const' ) ( (lv_name_7_0= RULE_ID ) ) ( (lv_idList_8_0= ruleIdList ) ) ( (lv_type_9_0= ruleTypeName ) ) (otherlv_10= '=' ( (lv_exp_11_0= ruleExp ) ) ( (lv_explist_12_0= ruleExpList ) ) )?
                    {
                    // InternalGo.g:2495:4: (otherlv_5= 'var' | otherlv_6= 'const' )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==46) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==47) ) {
                        alt59=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalGo.g:2496:5: otherlv_5= 'var'
                            {
                            otherlv_5=(Token)match(input,46,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getDeclAccess().getVarKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:2501:5: otherlv_6= 'const'
                            {
                            otherlv_6=(Token)match(input,47,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getDeclAccess().getConstKeyword_1_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGo.g:2506:4: ( (lv_name_7_0= RULE_ID ) )
                    // InternalGo.g:2507:5: (lv_name_7_0= RULE_ID )
                    {
                    // InternalGo.g:2507:5: (lv_name_7_0= RULE_ID )
                    // InternalGo.g:2508:6: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_7_0, grammarAccess.getDeclAccess().getNameIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDeclRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_7_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalGo.g:2524:4: ( (lv_idList_8_0= ruleIdList ) )
                    // InternalGo.g:2525:5: (lv_idList_8_0= ruleIdList )
                    {
                    // InternalGo.g:2525:5: (lv_idList_8_0= ruleIdList )
                    // InternalGo.g:2526:6: lv_idList_8_0= ruleIdList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDeclAccess().getIdListIdListParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_idList_8_0=ruleIdList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDeclRule());
                      						}
                      						set(
                      							current,
                      							"idList",
                      							lv_idList_8_0,
                      							"org.xtext.example.go.Go.IdList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGo.g:2543:4: ( (lv_type_9_0= ruleTypeName ) )
                    // InternalGo.g:2544:5: (lv_type_9_0= ruleTypeName )
                    {
                    // InternalGo.g:2544:5: (lv_type_9_0= ruleTypeName )
                    // InternalGo.g:2545:6: lv_type_9_0= ruleTypeName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDeclAccess().getTypeTypeNameParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_type_9_0=ruleTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDeclRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_9_0,
                      							"org.xtext.example.go.Go.TypeName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGo.g:2562:4: (otherlv_10= '=' ( (lv_exp_11_0= ruleExp ) ) ( (lv_explist_12_0= ruleExpList ) ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==23) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalGo.g:2563:5: otherlv_10= '=' ( (lv_exp_11_0= ruleExp ) ) ( (lv_explist_12_0= ruleExpList ) )
                            {
                            otherlv_10=(Token)match(input,23,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getDeclAccess().getEqualsSignKeyword_1_4_0());
                              				
                            }
                            // InternalGo.g:2567:5: ( (lv_exp_11_0= ruleExp ) )
                            // InternalGo.g:2568:6: (lv_exp_11_0= ruleExp )
                            {
                            // InternalGo.g:2568:6: (lv_exp_11_0= ruleExp )
                            // InternalGo.g:2569:7: lv_exp_11_0= ruleExp
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDeclAccess().getExpExpParserRuleCall_1_4_1_0());
                              						
                            }
                            pushFollow(FOLLOW_56);
                            lv_exp_11_0=ruleExp();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDeclRule());
                              							}
                              							set(
                              								current,
                              								"exp",
                              								lv_exp_11_0,
                              								"org.xtext.example.go.Go.Exp");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalGo.g:2586:5: ( (lv_explist_12_0= ruleExpList ) )
                            // InternalGo.g:2587:6: (lv_explist_12_0= ruleExpList )
                            {
                            // InternalGo.g:2587:6: (lv_explist_12_0= ruleExpList )
                            // InternalGo.g:2588:7: lv_explist_12_0= ruleExpList
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDeclAccess().getExplistExpListParserRuleCall_1_4_2_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_explist_12_0=ruleExpList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDeclRule());
                              							}
                              							set(
                              								current,
                              								"explist",
                              								lv_explist_12_0,
                              								"org.xtext.example.go.Go.ExpList");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


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


    // $ANTLR start "entryRuleAssig"
    // InternalGo.g:2611:1: entryRuleAssig returns [EObject current=null] : iv_ruleAssig= ruleAssig EOF ;
    public final EObject entryRuleAssig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssig = null;


        try {
            // InternalGo.g:2611:46: (iv_ruleAssig= ruleAssig EOF )
            // InternalGo.g:2612:2: iv_ruleAssig= ruleAssig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssigRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssig=ruleAssig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssig; 
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
    // InternalGo.g:2618:1: ruleAssig returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) ( ( ( (lv_idl_1_0= ruleIdList ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ( (lv_expressionlist_4_0= ruleExpList ) ) ) | (otherlv_5= '++' | otherlv_6= '--' ) | ( (otherlv_7= '+=' | otherlv_8= '-=' | otherlv_9= '*=' | otherlv_10= '/=' ) ( (lv_expression_11_0= ruleExp ) ) ) ) ) ;
    public final EObject ruleAssig() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_idl_1_0 = null;

        AntlrDatatypeRuleToken lv_expression_3_0 = null;

        AntlrDatatypeRuleToken lv_expressionlist_4_0 = null;

        AntlrDatatypeRuleToken lv_expression_11_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2624:2: ( ( ( (lv_id_0_0= RULE_ID ) ) ( ( ( (lv_idl_1_0= ruleIdList ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ( (lv_expressionlist_4_0= ruleExpList ) ) ) | (otherlv_5= '++' | otherlv_6= '--' ) | ( (otherlv_7= '+=' | otherlv_8= '-=' | otherlv_9= '*=' | otherlv_10= '/=' ) ( (lv_expression_11_0= ruleExp ) ) ) ) ) )
            // InternalGo.g:2625:2: ( ( (lv_id_0_0= RULE_ID ) ) ( ( ( (lv_idl_1_0= ruleIdList ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ( (lv_expressionlist_4_0= ruleExpList ) ) ) | (otherlv_5= '++' | otherlv_6= '--' ) | ( (otherlv_7= '+=' | otherlv_8= '-=' | otherlv_9= '*=' | otherlv_10= '/=' ) ( (lv_expression_11_0= ruleExp ) ) ) ) )
            {
            // InternalGo.g:2625:2: ( ( (lv_id_0_0= RULE_ID ) ) ( ( ( (lv_idl_1_0= ruleIdList ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ( (lv_expressionlist_4_0= ruleExpList ) ) ) | (otherlv_5= '++' | otherlv_6= '--' ) | ( (otherlv_7= '+=' | otherlv_8= '-=' | otherlv_9= '*=' | otherlv_10= '/=' ) ( (lv_expression_11_0= ruleExp ) ) ) ) )
            // InternalGo.g:2626:3: ( (lv_id_0_0= RULE_ID ) ) ( ( ( (lv_idl_1_0= ruleIdList ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ( (lv_expressionlist_4_0= ruleExpList ) ) ) | (otherlv_5= '++' | otherlv_6= '--' ) | ( (otherlv_7= '+=' | otherlv_8= '-=' | otherlv_9= '*=' | otherlv_10= '/=' ) ( (lv_expression_11_0= ruleExp ) ) ) )
            {
            // InternalGo.g:2626:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalGo.g:2627:4: (lv_id_0_0= RULE_ID )
            {
            // InternalGo.g:2627:4: (lv_id_0_0= RULE_ID )
            // InternalGo.g:2628:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_0_0, grammarAccess.getAssigAccess().getIdIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAssigRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalGo.g:2644:3: ( ( ( (lv_idl_1_0= ruleIdList ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ( (lv_expressionlist_4_0= ruleExpList ) ) ) | (otherlv_5= '++' | otherlv_6= '--' ) | ( (otherlv_7= '+=' | otherlv_8= '-=' | otherlv_9= '*=' | otherlv_10= '/=' ) ( (lv_expression_11_0= ruleExp ) ) ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_ID:
            case 22:
            case 23:
            case 26:
            case 27:
            case 45:
            case 59:
            case 60:
            case 61:
                {
                alt64=1;
                }
                break;
            case 48:
            case 49:
                {
                alt64=2;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalGo.g:2645:4: ( ( (lv_idl_1_0= ruleIdList ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ( (lv_expressionlist_4_0= ruleExpList ) ) )
                    {
                    // InternalGo.g:2645:4: ( ( (lv_idl_1_0= ruleIdList ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ( (lv_expressionlist_4_0= ruleExpList ) ) )
                    // InternalGo.g:2646:5: ( (lv_idl_1_0= ruleIdList ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ( (lv_expressionlist_4_0= ruleExpList ) )
                    {
                    // InternalGo.g:2646:5: ( (lv_idl_1_0= ruleIdList ) )
                    // InternalGo.g:2647:6: (lv_idl_1_0= ruleIdList )
                    {
                    // InternalGo.g:2647:6: (lv_idl_1_0= ruleIdList )
                    // InternalGo.g:2648:7: lv_idl_1_0= ruleIdList
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAssigAccess().getIdlIdListParserRuleCall_1_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_47);
                    lv_idl_1_0=ruleIdList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAssigRule());
                      							}
                      							set(
                      								current,
                      								"idl",
                      								lv_idl_1_0,
                      								"org.xtext.example.go.Go.IdList");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,23,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getAssigAccess().getEqualsSignKeyword_1_0_1());
                      				
                    }
                    // InternalGo.g:2669:5: ( (lv_expression_3_0= ruleExp ) )
                    // InternalGo.g:2670:6: (lv_expression_3_0= ruleExp )
                    {
                    // InternalGo.g:2670:6: (lv_expression_3_0= ruleExp )
                    // InternalGo.g:2671:7: lv_expression_3_0= ruleExp
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAssigAccess().getExpressionExpParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_56);
                    lv_expression_3_0=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAssigRule());
                      							}
                      							set(
                      								current,
                      								"expression",
                      								lv_expression_3_0,
                      								"org.xtext.example.go.Go.Exp");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalGo.g:2688:5: ( (lv_expressionlist_4_0= ruleExpList ) )
                    // InternalGo.g:2689:6: (lv_expressionlist_4_0= ruleExpList )
                    {
                    // InternalGo.g:2689:6: (lv_expressionlist_4_0= ruleExpList )
                    // InternalGo.g:2690:7: lv_expressionlist_4_0= ruleExpList
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAssigAccess().getExpressionlistExpListParserRuleCall_1_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_expressionlist_4_0=ruleExpList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAssigRule());
                      							}
                      							set(
                      								current,
                      								"expressionlist",
                      								lv_expressionlist_4_0,
                      								"org.xtext.example.go.Go.ExpList");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2709:4: (otherlv_5= '++' | otherlv_6= '--' )
                    {
                    // InternalGo.g:2709:4: (otherlv_5= '++' | otherlv_6= '--' )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==48) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==49) ) {
                        alt62=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalGo.g:2710:5: otherlv_5= '++'
                            {
                            otherlv_5=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getAssigAccess().getPlusSignPlusSignKeyword_1_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:2715:5: otherlv_6= '--'
                            {
                            otherlv_6=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getAssigAccess().getHyphenMinusHyphenMinusKeyword_1_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:2721:4: ( (otherlv_7= '+=' | otherlv_8= '-=' | otherlv_9= '*=' | otherlv_10= '/=' ) ( (lv_expression_11_0= ruleExp ) ) )
                    {
                    // InternalGo.g:2721:4: ( (otherlv_7= '+=' | otherlv_8= '-=' | otherlv_9= '*=' | otherlv_10= '/=' ) ( (lv_expression_11_0= ruleExp ) ) )
                    // InternalGo.g:2722:5: (otherlv_7= '+=' | otherlv_8= '-=' | otherlv_9= '*=' | otherlv_10= '/=' ) ( (lv_expression_11_0= ruleExp ) )
                    {
                    // InternalGo.g:2722:5: (otherlv_7= '+=' | otherlv_8= '-=' | otherlv_9= '*=' | otherlv_10= '/=' )
                    int alt63=4;
                    switch ( input.LA(1) ) {
                    case 50:
                        {
                        alt63=1;
                        }
                        break;
                    case 51:
                        {
                        alt63=2;
                        }
                        break;
                    case 52:
                        {
                        alt63=3;
                        }
                        break;
                    case 53:
                        {
                        alt63=4;
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
                            // InternalGo.g:2723:6: otherlv_7= '+='
                            {
                            otherlv_7=(Token)match(input,50,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getAssigAccess().getPlusSignEqualsSignKeyword_1_2_0_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:2728:6: otherlv_8= '-='
                            {
                            otherlv_8=(Token)match(input,51,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getAssigAccess().getHyphenMinusEqualsSignKeyword_1_2_0_1());
                              					
                            }

                            }
                            break;
                        case 3 :
                            // InternalGo.g:2733:6: otherlv_9= '*='
                            {
                            otherlv_9=(Token)match(input,52,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_9, grammarAccess.getAssigAccess().getAsteriskEqualsSignKeyword_1_2_0_2());
                              					
                            }

                            }
                            break;
                        case 4 :
                            // InternalGo.g:2738:6: otherlv_10= '/='
                            {
                            otherlv_10=(Token)match(input,53,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getAssigAccess().getSolidusEqualsSignKeyword_1_2_0_3());
                              					
                            }

                            }
                            break;

                    }

                    // InternalGo.g:2743:5: ( (lv_expression_11_0= ruleExp ) )
                    // InternalGo.g:2744:6: (lv_expression_11_0= ruleExp )
                    {
                    // InternalGo.g:2744:6: (lv_expression_11_0= ruleExp )
                    // InternalGo.g:2745:7: lv_expression_11_0= ruleExp
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAssigAccess().getExpressionExpParserRuleCall_1_2_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_11_0=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAssigRule());
                      							}
                      							set(
                      								current,
                      								"expression",
                      								lv_expression_11_0,
                      								"org.xtext.example.go.Go.Exp");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


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
    // InternalGo.g:2768:1: entryRuleIdList returns [String current=null] : iv_ruleIdList= ruleIdList EOF ;
    public final String entryRuleIdList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdList = null;


        try {
            // InternalGo.g:2768:46: (iv_ruleIdList= ruleIdList EOF )
            // InternalGo.g:2769:2: iv_ruleIdList= ruleIdList EOF
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
    // InternalGo.g:2775:1: ruleIdList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken ruleIdList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGo.g:2781:2: ( (kw= ',' this_ID_1= RULE_ID )* )
            // InternalGo.g:2782:2: (kw= ',' this_ID_1= RULE_ID )*
            {
            // InternalGo.g:2782:2: (kw= ',' this_ID_1= RULE_ID )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==26) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalGo.g:2783:3: kw= ',' this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_12); if (state.failed) return current;
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
            	    break loop65;
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
    // InternalGo.g:2799:1: entryRuleExpList returns [String current=null] : iv_ruleExpList= ruleExpList EOF ;
    public final String entryRuleExpList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpList = null;


        try {
            // InternalGo.g:2799:47: (iv_ruleExpList= ruleExpList EOF )
            // InternalGo.g:2800:2: iv_ruleExpList= ruleExpList EOF
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
    // InternalGo.g:2806:1: ruleExpList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' this_Exp_1= ruleExp )* ;
    public final AntlrDatatypeRuleToken ruleExpList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2812:2: ( (kw= ',' this_Exp_1= ruleExp )* )
            // InternalGo.g:2813:2: (kw= ',' this_Exp_1= ruleExp )*
            {
            // InternalGo.g:2813:2: (kw= ',' this_Exp_1= ruleExp )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==26) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalGo.g:2814:3: kw= ',' this_Exp_1= ruleExp
            	    {
            	    kw=(Token)match(input,26,FOLLOW_20); if (state.failed) return current;
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
            	    break loop66;
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
    // InternalGo.g:2833:1: entryRuleExp returns [String current=null] : iv_ruleExp= ruleExp EOF ;
    public final String entryRuleExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExp = null;


        try {
            // InternalGo.g:2833:43: (iv_ruleExp= ruleExp EOF )
            // InternalGo.g:2834:2: iv_ruleExp= ruleExp EOF
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
    // InternalGo.g:2840:1: ruleExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Call_0= ruleCall | this_ExpAux_1= ruleExpAux | (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? ) | (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? ) | this_STRING_6= RULE_STRING | this_RelExp_7= ruleRelExp | (this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )? ) ) ;
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
            // InternalGo.g:2846:2: ( (this_Call_0= ruleCall | this_ExpAux_1= ruleExpAux | (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? ) | (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? ) | this_STRING_6= RULE_STRING | this_RelExp_7= ruleRelExp | (this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )? ) ) )
            // InternalGo.g:2847:2: (this_Call_0= ruleCall | this_ExpAux_1= ruleExpAux | (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? ) | (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? ) | this_STRING_6= RULE_STRING | this_RelExp_7= ruleRelExp | (this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )? ) )
            {
            // InternalGo.g:2847:2: (this_Call_0= ruleCall | this_ExpAux_1= ruleExpAux | (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? ) | (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? ) | this_STRING_6= RULE_STRING | this_RelExp_7= ruleRelExp | (this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )? ) )
            int alt70=7;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // InternalGo.g:2848:3: this_Call_0= ruleCall
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
                    // InternalGo.g:2859:3: this_ExpAux_1= ruleExpAux
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
                    // InternalGo.g:2870:3: (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? )
                    {
                    // InternalGo.g:2870:3: (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? )
                    // InternalGo.g:2871:4: this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpAccess().getBooleanExpParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_60);
                    this_BooleanExp_2=ruleBooleanExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_BooleanExp_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:2881:4: (this_ExpJoin_3= ruleExpJoin )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( ((LA67_0>=RULE_OP_UNARY && LA67_0<=RULE_OP_REL)||LA67_0==RULE_OP_MULT||(LA67_0>=55 && LA67_0<=56)) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==RULE_OP_SUM) ) {
                        int LA67_2 = input.LA(2);

                        if ( (LA67_2==RULE_INT) ) {
                            int LA67_4 = input.LA(3);

                            if ( (synpred87_InternalGo()) ) {
                                alt67=1;
                            }
                        }
                        else if ( ((LA67_2>=RULE_ID && LA67_2<=RULE_STRING)||LA67_2==RULE_OP_SUM||LA67_2==17||LA67_2==54||(LA67_2>=57 && LA67_2<=58)) ) {
                            alt67=1;
                        }
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalGo.g:2882:5: this_ExpJoin_3= ruleExpJoin
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
                    // InternalGo.g:2895:3: (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? )
                    {
                    // InternalGo.g:2895:3: (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? )
                    // InternalGo.g:2896:4: this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpAccess().getAritExpParserRuleCall_3_0());
                      			
                    }
                    pushFollow(FOLLOW_60);
                    this_AritExp_4=ruleAritExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_AritExp_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:2906:4: (this_ExpJoin_5= ruleExpJoin )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( ((LA68_0>=RULE_OP_UNARY && LA68_0<=RULE_OP_REL)||LA68_0==RULE_OP_MULT||(LA68_0>=55 && LA68_0<=56)) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==RULE_OP_SUM) ) {
                        int LA68_2 = input.LA(2);

                        if ( (LA68_2==RULE_INT) ) {
                            int LA68_4 = input.LA(3);

                            if ( (synpred89_InternalGo()) ) {
                                alt68=1;
                            }
                        }
                        else if ( ((LA68_2>=RULE_ID && LA68_2<=RULE_STRING)||LA68_2==RULE_OP_SUM||LA68_2==17||LA68_2==54||(LA68_2>=57 && LA68_2<=58)) ) {
                            alt68=1;
                        }
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalGo.g:2907:5: this_ExpJoin_5= ruleExpJoin
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
                    // InternalGo.g:2920:3: this_STRING_6= RULE_STRING
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
                    // InternalGo.g:2928:3: this_RelExp_7= ruleRelExp
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
                    // InternalGo.g:2939:3: (this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )? )
                    {
                    // InternalGo.g:2939:3: (this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )? )
                    // InternalGo.g:2940:4: this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )?
                    {
                    this_ID_8=(Token)match(input,RULE_ID,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_8, grammarAccess.getExpAccess().getIDTerminalRuleCall_6_0());
                      			
                    }
                    // InternalGo.g:2947:4: (this_ExpJoin_9= ruleExpJoin )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( ((LA69_0>=RULE_OP_UNARY && LA69_0<=RULE_OP_REL)||LA69_0==RULE_OP_MULT||(LA69_0>=55 && LA69_0<=56)) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==RULE_OP_SUM) ) {
                        int LA69_2 = input.LA(2);

                        if ( ((LA69_2>=RULE_ID && LA69_2<=RULE_STRING)||LA69_2==RULE_OP_SUM||LA69_2==17||LA69_2==54||(LA69_2>=57 && LA69_2<=58)) ) {
                            alt69=1;
                        }
                        else if ( (LA69_2==RULE_INT) ) {
                            int LA69_4 = input.LA(3);

                            if ( (synpred93_InternalGo()) ) {
                                alt69=1;
                            }
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalGo.g:2948:5: this_ExpJoin_9= ruleExpJoin
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
    // InternalGo.g:2964:1: entryRuleSimpleStmt returns [EObject current=null] : iv_ruleSimpleStmt= ruleSimpleStmt EOF ;
    public final EObject entryRuleSimpleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStmt = null;


        try {
            // InternalGo.g:2964:51: (iv_ruleSimpleStmt= ruleSimpleStmt EOF )
            // InternalGo.g:2965:2: iv_ruleSimpleStmt= ruleSimpleStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleStmt=ruleSimpleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleStmt; 
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
    // InternalGo.g:2971:1: ruleSimpleStmt returns [EObject current=null] : ( ( () ( (lv_decl_1_0= ruleDecl ) ) ) | this_Assig_2= ruleAssig | ( () ruleExp ) ) ;
    public final EObject ruleSimpleStmt() throws RecognitionException {
        EObject current = null;

        EObject lv_decl_1_0 = null;

        EObject this_Assig_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2977:2: ( ( ( () ( (lv_decl_1_0= ruleDecl ) ) ) | this_Assig_2= ruleAssig | ( () ruleExp ) ) )
            // InternalGo.g:2978:2: ( ( () ( (lv_decl_1_0= ruleDecl ) ) ) | this_Assig_2= ruleAssig | ( () ruleExp ) )
            {
            // InternalGo.g:2978:2: ( ( () ( (lv_decl_1_0= ruleDecl ) ) ) | this_Assig_2= ruleAssig | ( () ruleExp ) )
            int alt71=3;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // InternalGo.g:2979:3: ( () ( (lv_decl_1_0= ruleDecl ) ) )
                    {
                    // InternalGo.g:2979:3: ( () ( (lv_decl_1_0= ruleDecl ) ) )
                    // InternalGo.g:2980:4: () ( (lv_decl_1_0= ruleDecl ) )
                    {
                    // InternalGo.g:2980:4: ()
                    // InternalGo.g:2981:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSimpleStmtAccess().getSimpleStmtAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:2990:4: ( (lv_decl_1_0= ruleDecl ) )
                    // InternalGo.g:2991:5: (lv_decl_1_0= ruleDecl )
                    {
                    // InternalGo.g:2991:5: (lv_decl_1_0= ruleDecl )
                    // InternalGo.g:2992:6: lv_decl_1_0= ruleDecl
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSimpleStmtAccess().getDeclDeclParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_decl_1_0=ruleDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSimpleStmtRule());
                      						}
                      						set(
                      							current,
                      							"decl",
                      							lv_decl_1_0,
                      							"org.xtext.example.go.Go.Decl");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:3011:3: this_Assig_2= ruleAssig
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleStmtAccess().getAssigParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Assig_2=ruleAssig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Assig_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3023:3: ( () ruleExp )
                    {
                    // InternalGo.g:3023:3: ( () ruleExp )
                    // InternalGo.g:3024:4: () ruleExp
                    {
                    // InternalGo.g:3024:4: ()
                    // InternalGo.g:3025:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSimpleStmtAccess().getSimpleStmtAction_2_0(),
                      						current);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStmtAccess().getExpParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
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
    // $ANTLR end "ruleSimpleStmt"


    // $ANTLR start "entryRuleExpAux"
    // InternalGo.g:3049:1: entryRuleExpAux returns [String current=null] : iv_ruleExpAux= ruleExpAux EOF ;
    public final String entryRuleExpAux() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpAux = null;


        try {
            // InternalGo.g:3049:46: (iv_ruleExpAux= ruleExpAux EOF )
            // InternalGo.g:3050:2: iv_ruleExpAux= ruleExpAux EOF
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
    // InternalGo.g:3056:1: ruleExpAux returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '!' )? kw= '(' this_Exp_2= ruleExp kw= ')' (this_ExpJoin_4= ruleExpJoin )? ) ;
    public final AntlrDatatypeRuleToken ruleExpAux() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_2 = null;

        AntlrDatatypeRuleToken this_ExpJoin_4 = null;



        	enterRule();

        try {
            // InternalGo.g:3062:2: ( ( (kw= '!' )? kw= '(' this_Exp_2= ruleExp kw= ')' (this_ExpJoin_4= ruleExpJoin )? ) )
            // InternalGo.g:3063:2: ( (kw= '!' )? kw= '(' this_Exp_2= ruleExp kw= ')' (this_ExpJoin_4= ruleExpJoin )? )
            {
            // InternalGo.g:3063:2: ( (kw= '!' )? kw= '(' this_Exp_2= ruleExp kw= ')' (this_ExpJoin_4= ruleExpJoin )? )
            // InternalGo.g:3064:3: (kw= '!' )? kw= '(' this_Exp_2= ruleExp kw= ')' (this_ExpJoin_4= ruleExpJoin )?
            {
            // InternalGo.g:3064:3: (kw= '!' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==54) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalGo.g:3065:4: kw= '!'
                    {
                    kw=(Token)match(input,54,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpAuxAccess().getExclamationMarkKeyword_0());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,17,FOLLOW_20); if (state.failed) return current;
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
            kw=(Token)match(input,18,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getExpAuxAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalGo.g:3091:3: (this_ExpJoin_4= ruleExpJoin )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=RULE_OP_UNARY && LA73_0<=RULE_OP_REL)||LA73_0==RULE_OP_MULT||(LA73_0>=55 && LA73_0<=56)) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_OP_SUM) ) {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==RULE_INT) ) {
                    int LA73_4 = input.LA(3);

                    if ( (synpred97_InternalGo()) ) {
                        alt73=1;
                    }
                }
                else if ( ((LA73_2>=RULE_ID && LA73_2<=RULE_STRING)||LA73_2==RULE_OP_SUM||LA73_2==17||LA73_2==54||(LA73_2>=57 && LA73_2<=58)) ) {
                    alt73=1;
                }
            }
            switch (alt73) {
                case 1 :
                    // InternalGo.g:3092:4: this_ExpJoin_4= ruleExpJoin
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
    // InternalGo.g:3107:1: entryRuleCall returns [String current=null] : iv_ruleCall= ruleCall EOF ;
    public final String entryRuleCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCall = null;


        try {
            // InternalGo.g:3107:44: (iv_ruleCall= ruleCall EOF )
            // InternalGo.g:3108:2: iv_ruleCall= ruleCall EOF
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
    // InternalGo.g:3114:1: ruleCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* kw= '(' (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_Exp_4 = null;

        AntlrDatatypeRuleToken this_ExpList_5 = null;



        	enterRule();

        try {
            // InternalGo.g:3120:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* kw= '(' (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )? kw= ')' ) )
            // InternalGo.g:3121:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* kw= '(' (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )? kw= ')' )
            {
            // InternalGo.g:3121:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* kw= '(' (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )? kw= ')' )
            // InternalGo.g:3122:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* kw= '(' (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )? kw= ')'
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getCallAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalGo.g:3129:3: (kw= '.' this_ID_2= RULE_ID )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==19) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalGo.g:3130:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getCallAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getCallAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            kw=(Token)match(input,17,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalGo.g:3148:3: (this_Exp_4= ruleExp this_ExpList_5= ruleExpList )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_ID && LA75_0<=RULE_STRING)||LA75_0==RULE_OP_SUM||LA75_0==RULE_INT||LA75_0==17||LA75_0==54||(LA75_0>=57 && LA75_0<=58)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalGo.g:3149:4: this_Exp_4= ruleExp this_ExpList_5= ruleExpList
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

            kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:3179:1: entryRuleExpJoin returns [String current=null] : iv_ruleExpJoin= ruleExpJoin EOF ;
    public final String entryRuleExpJoin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpJoin = null;


        try {
            // InternalGo.g:3179:47: (iv_ruleExpJoin= ruleExpJoin EOF )
            // InternalGo.g:3180:2: iv_ruleExpJoin= ruleExpJoin EOF
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
    // InternalGo.g:3186:1: ruleExpJoin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_OP_UNARY_0= RULE_OP_UNARY | this_OP_REL_1= RULE_OP_REL | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' ) this_Exp_6= ruleExp ) ;
    public final AntlrDatatypeRuleToken ruleExpJoin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_UNARY_0=null;
        Token this_OP_REL_1=null;
        Token this_OP_SUM_2=null;
        Token this_OP_MULT_3=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_6 = null;



        	enterRule();

        try {
            // InternalGo.g:3192:2: ( ( (this_OP_UNARY_0= RULE_OP_UNARY | this_OP_REL_1= RULE_OP_REL | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' ) this_Exp_6= ruleExp ) )
            // InternalGo.g:3193:2: ( (this_OP_UNARY_0= RULE_OP_UNARY | this_OP_REL_1= RULE_OP_REL | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' ) this_Exp_6= ruleExp )
            {
            // InternalGo.g:3193:2: ( (this_OP_UNARY_0= RULE_OP_UNARY | this_OP_REL_1= RULE_OP_REL | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' ) this_Exp_6= ruleExp )
            // InternalGo.g:3194:3: (this_OP_UNARY_0= RULE_OP_UNARY | this_OP_REL_1= RULE_OP_REL | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' ) this_Exp_6= ruleExp
            {
            // InternalGo.g:3194:3: (this_OP_UNARY_0= RULE_OP_UNARY | this_OP_REL_1= RULE_OP_REL | this_OP_SUM_2= RULE_OP_SUM | this_OP_MULT_3= RULE_OP_MULT | kw= '&&' | kw= '||' )
            int alt76=6;
            switch ( input.LA(1) ) {
            case RULE_OP_UNARY:
                {
                alt76=1;
                }
                break;
            case RULE_OP_REL:
                {
                alt76=2;
                }
                break;
            case RULE_OP_SUM:
                {
                alt76=3;
                }
                break;
            case RULE_OP_MULT:
                {
                alt76=4;
                }
                break;
            case 55:
                {
                alt76=5;
                }
                break;
            case 56:
                {
                alt76=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalGo.g:3195:4: this_OP_UNARY_0= RULE_OP_UNARY
                    {
                    this_OP_UNARY_0=(Token)match(input,RULE_OP_UNARY,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_OP_UNARY_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP_UNARY_0, grammarAccess.getExpJoinAccess().getOP_UNARYTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3203:4: this_OP_REL_1= RULE_OP_REL
                    {
                    this_OP_REL_1=(Token)match(input,RULE_OP_REL,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_OP_REL_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP_REL_1, grammarAccess.getExpJoinAccess().getOP_RELTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3211:4: this_OP_SUM_2= RULE_OP_SUM
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
                    // InternalGo.g:3219:4: this_OP_MULT_3= RULE_OP_MULT
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
                    // InternalGo.g:3227:4: kw= '&&'
                    {
                    kw=(Token)match(input,55,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpJoinAccess().getAmpersandAmpersandKeyword_0_4());
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:3233:4: kw= '||'
                    {
                    kw=(Token)match(input,56,FOLLOW_20); if (state.failed) return current;
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
    // InternalGo.g:3253:1: entryRuleRelExp returns [String current=null] : iv_ruleRelExp= ruleRelExp EOF ;
    public final String entryRuleRelExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelExp = null;


        try {
            // InternalGo.g:3253:46: (iv_ruleRelExp= ruleRelExp EOF )
            // InternalGo.g:3254:2: iv_ruleRelExp= ruleRelExp EOF
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
    // InternalGo.g:3260:1: ruleRelExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral ) | (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral ) ) ;
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
            // InternalGo.g:3266:2: ( ( (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral ) | (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral ) ) )
            // InternalGo.g:3267:2: ( (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral ) | (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral ) )
            {
            // InternalGo.g:3267:2: ( (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral ) | (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_INT) ) {
                alt78=1;
            }
            else if ( ((LA78_0>=57 && LA78_0<=58)) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalGo.g:3268:3: (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral )
                    {
                    // InternalGo.g:3268:3: (this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral )
                    // InternalGo.g:3269:4: this_NumberLiteral_0= ruleNumberLiteral (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY ) this_NumberLiteral_3= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRelExpAccess().getNumberLiteralParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_63);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_NumberLiteral_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:3279:4: (this_OP_REL_1= RULE_OP_REL | this_OP_UNARY_2= RULE_OP_UNARY )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==RULE_OP_REL) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==RULE_OP_UNARY) ) {
                        alt77=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalGo.g:3280:5: this_OP_REL_1= RULE_OP_REL
                            {
                            this_OP_REL_1=(Token)match(input,RULE_OP_REL,FOLLOW_64); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_OP_REL_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_OP_REL_1, grammarAccess.getRelExpAccess().getOP_RELTerminalRuleCall_0_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:3288:5: this_OP_UNARY_2= RULE_OP_UNARY
                            {
                            this_OP_UNARY_2=(Token)match(input,RULE_OP_UNARY,FOLLOW_64); if (state.failed) return current;
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
                    // InternalGo.g:3308:3: (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral )
                    {
                    // InternalGo.g:3308:3: (this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral )
                    // InternalGo.g:3309:4: this_BooleanLiteral_4= ruleBooleanLiteral this_OP_UNARY_5= RULE_OP_UNARY this_BooleanLiteral_6= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRelExpAccess().getBooleanLiteralParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_65);
                    this_BooleanLiteral_4=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_BooleanLiteral_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_OP_UNARY_5=(Token)match(input,RULE_OP_UNARY,FOLLOW_66); if (state.failed) return current;
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
    // InternalGo.g:3341:1: entryRuleBooleanExp returns [String current=null] : iv_ruleBooleanExp= ruleBooleanExp EOF ;
    public final String entryRuleBooleanExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanExp = null;


        try {
            // InternalGo.g:3341:50: (iv_ruleBooleanExp= ruleBooleanExp EOF )
            // InternalGo.g:3342:2: iv_ruleBooleanExp= ruleBooleanExp EOF
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
    // InternalGo.g:3348:1: ruleBooleanExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Or_0= ruleOr ;
    public final AntlrDatatypeRuleToken ruleBooleanExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Or_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3354:2: (this_Or_0= ruleOr )
            // InternalGo.g:3355:2: this_Or_0= ruleOr
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
    // InternalGo.g:3368:1: entryRuleOr returns [String current=null] : iv_ruleOr= ruleOr EOF ;
    public final String entryRuleOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOr = null;


        try {
            // InternalGo.g:3368:42: (iv_ruleOr= ruleOr EOF )
            // InternalGo.g:3369:2: iv_ruleOr= ruleOr EOF
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
    // InternalGo.g:3375:1: ruleOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '!' )? this_And_1= ruleAnd (kw= '||' this_And_3= ruleAnd )* ) ;
    public final AntlrDatatypeRuleToken ruleOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_And_1 = null;

        AntlrDatatypeRuleToken this_And_3 = null;



        	enterRule();

        try {
            // InternalGo.g:3381:2: ( ( (kw= '!' )? this_And_1= ruleAnd (kw= '||' this_And_3= ruleAnd )* ) )
            // InternalGo.g:3382:2: ( (kw= '!' )? this_And_1= ruleAnd (kw= '||' this_And_3= ruleAnd )* )
            {
            // InternalGo.g:3382:2: ( (kw= '!' )? this_And_1= ruleAnd (kw= '||' this_And_3= ruleAnd )* )
            // InternalGo.g:3383:3: (kw= '!' )? this_And_1= ruleAnd (kw= '||' this_And_3= ruleAnd )*
            {
            // InternalGo.g:3383:3: (kw= '!' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==54) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalGo.g:3384:4: kw= '!'
                    {
                    kw=(Token)match(input,54,FOLLOW_66); if (state.failed) return current;
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
            pushFollow(FOLLOW_67);
            this_And_1=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_And_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:3400:3: (kw= '||' this_And_3= ruleAnd )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==56) ) {
                    int LA80_2 = input.LA(2);

                    if ( (LA80_2==57) ) {
                        int LA80_3 = input.LA(3);

                        if ( (synpred108_InternalGo()) ) {
                            alt80=1;
                        }


                    }
                    else if ( (LA80_2==58) ) {
                        int LA80_4 = input.LA(3);

                        if ( (synpred108_InternalGo()) ) {
                            alt80=1;
                        }


                    }


                }


                switch (alt80) {
            	case 1 :
            	    // InternalGo.g:3401:4: kw= '||' this_And_3= ruleAnd
            	    {
            	    kw=(Token)match(input,56,FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_2_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_67);
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
            	    break loop80;
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
    // InternalGo.g:3421:1: entryRuleAnd returns [String current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final String entryRuleAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnd = null;


        try {
            // InternalGo.g:3421:43: (iv_ruleAnd= ruleAnd EOF )
            // InternalGo.g:3422:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalGo.g:3428:1: ruleAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BooleanLiteral_0= ruleBooleanLiteral (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )* ) ;
    public final AntlrDatatypeRuleToken ruleAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BooleanLiteral_0 = null;

        AntlrDatatypeRuleToken this_BooleanLiteral_2 = null;



        	enterRule();

        try {
            // InternalGo.g:3434:2: ( (this_BooleanLiteral_0= ruleBooleanLiteral (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )* ) )
            // InternalGo.g:3435:2: (this_BooleanLiteral_0= ruleBooleanLiteral (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )* )
            {
            // InternalGo.g:3435:2: (this_BooleanLiteral_0= ruleBooleanLiteral (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )* )
            // InternalGo.g:3436:3: this_BooleanLiteral_0= ruleBooleanLiteral (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getBooleanLiteralParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_68);
            this_BooleanLiteral_0=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_BooleanLiteral_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:3446:3: (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==55) ) {
                    int LA81_2 = input.LA(2);

                    if ( (LA81_2==57) ) {
                        int LA81_3 = input.LA(3);

                        if ( (synpred109_InternalGo()) ) {
                            alt81=1;
                        }


                    }
                    else if ( (LA81_2==58) ) {
                        int LA81_4 = input.LA(3);

                        if ( (synpred109_InternalGo()) ) {
                            alt81=1;
                        }


                    }


                }


                switch (alt81) {
            	case 1 :
            	    // InternalGo.g:3447:4: kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral
            	    {
            	    kw=(Token)match(input,55,FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getAndAccess().getBooleanLiteralParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_68);
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
            	    break loop81;
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
    // InternalGo.g:3467:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // InternalGo.g:3467:54: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalGo.g:3468:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
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
    // InternalGo.g:3474:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Bool_0= ruleBool ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Bool_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3480:2: (this_Bool_0= ruleBool )
            // InternalGo.g:3481:2: this_Bool_0= ruleBool
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getBooleanLiteralAccess().getBoolParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Bool_0=ruleBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Bool_0);
              	
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleAritExp"
    // InternalGo.g:3494:1: entryRuleAritExp returns [String current=null] : iv_ruleAritExp= ruleAritExp EOF ;
    public final String entryRuleAritExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAritExp = null;


        try {
            // InternalGo.g:3494:47: (iv_ruleAritExp= ruleAritExp EOF )
            // InternalGo.g:3495:2: iv_ruleAritExp= ruleAritExp EOF
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
    // InternalGo.g:3501:1: ruleAritExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Addition_0= ruleAddition ;
    public final AntlrDatatypeRuleToken ruleAritExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Addition_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3507:2: (this_Addition_0= ruleAddition )
            // InternalGo.g:3508:2: this_Addition_0= ruleAddition
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
    // InternalGo.g:3521:1: entryRuleAddition returns [String current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final String entryRuleAddition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddition = null;


        try {
            // InternalGo.g:3521:48: (iv_ruleAddition= ruleAddition EOF )
            // InternalGo.g:3522:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalGo.g:3528:1: ruleAddition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication )+ ;
    public final AntlrDatatypeRuleToken ruleAddition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_SUM_0=null;
        AntlrDatatypeRuleToken this_Multiplication_1 = null;



        	enterRule();

        try {
            // InternalGo.g:3534:2: ( ( (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication )+ )
            // InternalGo.g:3535:2: ( (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication )+
            {
            // InternalGo.g:3535:2: ( (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication )+
            int cnt83=0;
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==RULE_OP_SUM) ) {
                    int LA83_2 = input.LA(2);

                    if ( (synpred111_InternalGo()) ) {
                        alt83=1;
                    }


                }
                else if ( (LA83_0==RULE_INT) ) {
                    int LA83_3 = input.LA(2);

                    if ( (synpred111_InternalGo()) ) {
                        alt83=1;
                    }


                }


                switch (alt83) {
            	case 1 :
            	    // InternalGo.g:3536:3: (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication
            	    {
            	    // InternalGo.g:3536:3: (this_OP_SUM_0= RULE_OP_SUM )?
            	    int alt82=2;
            	    int LA82_0 = input.LA(1);

            	    if ( (LA82_0==RULE_OP_SUM) ) {
            	        alt82=1;
            	    }
            	    switch (alt82) {
            	        case 1 :
            	            // InternalGo.g:3537:4: this_OP_SUM_0= RULE_OP_SUM
            	            {
            	            this_OP_SUM_0=(Token)match(input,RULE_OP_SUM,FOLLOW_64); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_69);
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
            	    if ( cnt83 >= 1 ) break loop83;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(83, input);
                        throw eee;
                }
                cnt83++;
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
    // InternalGo.g:3559:1: entryRuleMultiplication returns [String current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final String entryRuleMultiplication() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplication = null;


        try {
            // InternalGo.g:3559:54: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalGo.g:3560:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalGo.g:3566:1: ruleMultiplication returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NumberLiteral_0= ruleNumberLiteral ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )* ) ;
    public final AntlrDatatypeRuleToken ruleMultiplication() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OP_MULT_1=null;
        AntlrDatatypeRuleToken this_NumberLiteral_0 = null;

        AntlrDatatypeRuleToken this_NumberLiteral_2 = null;



        	enterRule();

        try {
            // InternalGo.g:3572:2: ( (this_NumberLiteral_0= ruleNumberLiteral ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )* ) )
            // InternalGo.g:3573:2: (this_NumberLiteral_0= ruleNumberLiteral ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )* )
            {
            // InternalGo.g:3573:2: (this_NumberLiteral_0= ruleNumberLiteral ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )* )
            // InternalGo.g:3574:3: this_NumberLiteral_0= ruleNumberLiteral ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicationAccess().getNumberLiteralParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_70);
            this_NumberLiteral_0=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NumberLiteral_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:3584:3: ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==RULE_OP_MULT) ) {
                    int LA85_2 = input.LA(2);

                    if ( (LA85_2==RULE_INT) ) {
                        int LA85_4 = input.LA(3);

                        if ( (synpred113_InternalGo()) ) {
                            alt85=1;
                        }


                    }


                }
                else if ( (LA85_0==RULE_INT) ) {
                    int LA85_3 = input.LA(2);

                    if ( (synpred113_InternalGo()) ) {
                        alt85=1;
                    }


                }


                switch (alt85) {
            	case 1 :
            	    // InternalGo.g:3585:4: (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral
            	    {
            	    // InternalGo.g:3585:4: (this_OP_MULT_1= RULE_OP_MULT )?
            	    int alt84=2;
            	    int LA84_0 = input.LA(1);

            	    if ( (LA84_0==RULE_OP_MULT) ) {
            	        alt84=1;
            	    }
            	    switch (alt84) {
            	        case 1 :
            	            // InternalGo.g:3586:5: this_OP_MULT_1= RULE_OP_MULT
            	            {
            	            this_OP_MULT_1=(Token)match(input,RULE_OP_MULT,FOLLOW_64); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_70);
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
            	    break loop85;
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
    // InternalGo.g:3609:1: entryRuleNumberLiteral returns [String current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final String entryRuleNumberLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberLiteral = null;


        try {
            // InternalGo.g:3609:53: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalGo.g:3610:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalGo.g:3616:1: ruleNumberLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumberLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGo.g:3622:2: (this_INT_0= RULE_INT )
            // InternalGo.g:3623:2: this_INT_0= RULE_INT
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
    // InternalGo.g:3633:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // InternalGo.g:3633:48: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalGo.g:3634:2: iv_ruleTypeName= ruleTypeName EOF
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
    // InternalGo.g:3640:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BasicTypes_0= ruleBasicTypes | this_QualifiedIdent_1= ruleQualifiedIdent | this_ID_2= RULE_ID | this_Struct_3= ruleStruct ) ;
    public final AntlrDatatypeRuleToken ruleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_BasicTypes_0 = null;

        AntlrDatatypeRuleToken this_QualifiedIdent_1 = null;

        AntlrDatatypeRuleToken this_Struct_3 = null;



        	enterRule();

        try {
            // InternalGo.g:3646:2: ( (this_BasicTypes_0= ruleBasicTypes | this_QualifiedIdent_1= ruleQualifiedIdent | this_ID_2= RULE_ID | this_Struct_3= ruleStruct ) )
            // InternalGo.g:3647:2: (this_BasicTypes_0= ruleBasicTypes | this_QualifiedIdent_1= ruleQualifiedIdent | this_ID_2= RULE_ID | this_Struct_3= ruleStruct )
            {
            // InternalGo.g:3647:2: (this_BasicTypes_0= ruleBasicTypes | this_QualifiedIdent_1= ruleQualifiedIdent | this_ID_2= RULE_ID | this_Struct_3= ruleStruct )
            int alt86=4;
            switch ( input.LA(1) ) {
            case 59:
            case 60:
            case 61:
                {
                alt86=1;
                }
                break;
            case RULE_ID:
                {
                int LA86_2 = input.LA(2);

                if ( (LA86_2==19) ) {
                    alt86=2;
                }
                else if ( (LA86_2==EOF||(LA86_2>=RULE_ID && LA86_2<=RULE_STRING)||LA86_2==RULE_OP_SUM||LA86_2==RULE_INT||LA86_2==15||(LA86_2>=17 && LA86_2<=18)||(LA86_2>=20 && LA86_2<=21)||LA86_2==23||(LA86_2>=25 && LA86_2<=26)||(LA86_2>=28 && LA86_2<=34)||LA86_2==36||(LA86_2>=38 && LA86_2<=47)||LA86_2==54||(LA86_2>=57 && LA86_2<=61)) ) {
                    alt86=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 2, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                alt86=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalGo.g:3648:3: this_BasicTypes_0= ruleBasicTypes
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeNameAccess().getBasicTypesParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BasicTypes_0=ruleBasicTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BasicTypes_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3659:3: this_QualifiedIdent_1= ruleQualifiedIdent
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
                    // InternalGo.g:3670:3: this_ID_2= RULE_ID
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
                    // InternalGo.g:3678:3: this_Struct_3= ruleStruct
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
    // InternalGo.g:3692:1: entryRuleQualifiedIdent returns [String current=null] : iv_ruleQualifiedIdent= ruleQualifiedIdent EOF ;
    public final String entryRuleQualifiedIdent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedIdent = null;


        try {
            // InternalGo.g:3692:54: (iv_ruleQualifiedIdent= ruleQualifiedIdent EOF )
            // InternalGo.g:3693:2: iv_ruleQualifiedIdent= ruleQualifiedIdent EOF
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
    // InternalGo.g:3699:1: ruleQualifiedIdent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedIdent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGo.g:3705:2: ( (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) )
            // InternalGo.g:3706:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            {
            // InternalGo.g:3706:2: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            // InternalGo.g:3707:3: this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedIdentAccess().getIDTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBool"
    // InternalGo.g:3730:1: entryRuleBool returns [String current=null] : iv_ruleBool= ruleBool EOF ;
    public final String entryRuleBool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBool = null;


        try {
            // InternalGo.g:3730:44: (iv_ruleBool= ruleBool EOF )
            // InternalGo.g:3731:2: iv_ruleBool= ruleBool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBool=ruleBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBool.getText(); 
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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalGo.g:3737:1: ruleBool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3743:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalGo.g:3744:2: (kw= 'true' | kw= 'false' )
            {
            // InternalGo.g:3744:2: (kw= 'true' | kw= 'false' )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==57) ) {
                alt87=1;
            }
            else if ( (LA87_0==58) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalGo.g:3745:3: kw= 'true'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBoolAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3751:3: kw= 'false'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBoolAccess().getFalseKeyword_1());
                      		
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
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleBasicTypes"
    // InternalGo.g:3760:1: entryRuleBasicTypes returns [String current=null] : iv_ruleBasicTypes= ruleBasicTypes EOF ;
    public final String entryRuleBasicTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicTypes = null;


        try {
            // InternalGo.g:3760:50: (iv_ruleBasicTypes= ruleBasicTypes EOF )
            // InternalGo.g:3761:2: iv_ruleBasicTypes= ruleBasicTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicTypes=ruleBasicTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicTypes.getText(); 
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
    // $ANTLR end "entryRuleBasicTypes"


    // $ANTLR start "ruleBasicTypes"
    // InternalGo.g:3767:1: ruleBasicTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'int' | kw= 'bool' ) ;
    public final AntlrDatatypeRuleToken ruleBasicTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3773:2: ( (kw= 'string' | kw= 'int' | kw= 'bool' ) )
            // InternalGo.g:3774:2: (kw= 'string' | kw= 'int' | kw= 'bool' )
            {
            // InternalGo.g:3774:2: (kw= 'string' | kw= 'int' | kw= 'bool' )
            int alt88=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt88=1;
                }
                break;
            case 60:
                {
                alt88=2;
                }
                break;
            case 61:
                {
                alt88=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalGo.g:3775:3: kw= 'string'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBasicTypesAccess().getStringKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3781:3: kw= 'int'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBasicTypesAccess().getIntKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3787:3: kw= 'bool'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBasicTypesAccess().getBoolKeyword_2());
                      		
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
    // $ANTLR end "ruleBasicTypes"

    // $ANTLR start synpred29_InternalGo
    public final void synpred29_InternalGo_fragment() throws RecognitionException {   
        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_IdList_1 = null;


        // InternalGo.g:967:4: (this_ID_0= RULE_ID this_IdList_1= ruleIdList )
        // InternalGo.g:967:4: this_ID_0= RULE_ID this_IdList_1= ruleIdList
        {
        this_ID_0=(Token)match(input,RULE_ID,FOLLOW_56); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_IdList_1=ruleIdList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalGo

    // $ANTLR start synpred41_InternalGo
    public final void synpred41_InternalGo_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_decl_1_0 = null;

        EObject lv_Assig_2_0 = null;


        // InternalGo.g:1312:4: ( ( ( (lv_decl_1_0= ruleDecl ) ) | ( (lv_Assig_2_0= ruleAssig ) ) | ruleExp ) otherlv_4= ';' )
        // InternalGo.g:1312:4: ( ( (lv_decl_1_0= ruleDecl ) ) | ( (lv_Assig_2_0= ruleAssig ) ) | ruleExp ) otherlv_4= ';'
        {
        // InternalGo.g:1312:4: ( ( (lv_decl_1_0= ruleDecl ) ) | ( (lv_Assig_2_0= ruleAssig ) ) | ruleExp )
        int alt98=3;
        alt98 = dfa98.predict(input);
        switch (alt98) {
            case 1 :
                // InternalGo.g:1313:5: ( (lv_decl_1_0= ruleDecl ) )
                {
                // InternalGo.g:1313:5: ( (lv_decl_1_0= ruleDecl ) )
                // InternalGo.g:1314:6: (lv_decl_1_0= ruleDecl )
                {
                // InternalGo.g:1314:6: (lv_decl_1_0= ruleDecl )
                // InternalGo.g:1315:7: lv_decl_1_0= ruleDecl
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getAndersonAccess().getDeclDeclParserRuleCall_1_0_0_0());
                  						
                }
                pushFollow(FOLLOW_15);
                lv_decl_1_0=ruleDecl();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalGo.g:1333:5: ( (lv_Assig_2_0= ruleAssig ) )
                {
                // InternalGo.g:1333:5: ( (lv_Assig_2_0= ruleAssig ) )
                // InternalGo.g:1334:6: (lv_Assig_2_0= ruleAssig )
                {
                // InternalGo.g:1334:6: (lv_Assig_2_0= ruleAssig )
                // InternalGo.g:1335:7: lv_Assig_2_0= ruleAssig
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getAndersonAccess().getAssigAssigParserRuleCall_1_0_1_0());
                  						
                }
                pushFollow(FOLLOW_15);
                lv_Assig_2_0=ruleAssig();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalGo.g:1353:5: ruleExp
                {
                if ( state.backtracking==0 ) {

                  					/* */
                  				
                }
                pushFollow(FOLLOW_15);
                ruleExp();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalGo

    // $ANTLR start synpred44_InternalGo
    public final void synpred44_InternalGo_fragment() throws RecognitionException {   
        EObject lv_LabeledStmt_0_0 = null;


        // InternalGo.g:1452:3: ( ( (lv_LabeledStmt_0_0= ruleLabeledStmt ) ) )
        // InternalGo.g:1452:3: ( (lv_LabeledStmt_0_0= ruleLabeledStmt ) )
        {
        // InternalGo.g:1452:3: ( (lv_LabeledStmt_0_0= ruleLabeledStmt ) )
        // InternalGo.g:1453:4: (lv_LabeledStmt_0_0= ruleLabeledStmt )
        {
        // InternalGo.g:1453:4: (lv_LabeledStmt_0_0= ruleLabeledStmt )
        // InternalGo.g:1454:5: lv_LabeledStmt_0_0= ruleLabeledStmt
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getStatementAccess().getLabeledStmtLabeledStmtParserRuleCall_0_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_LabeledStmt_0_0=ruleLabeledStmt();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred44_InternalGo

    // $ANTLR start synpred45_InternalGo
    public final void synpred45_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_SendStmt_1_0 = null;


        // InternalGo.g:1472:3: ( ( (lv_SendStmt_1_0= ruleSendStmt ) ) )
        // InternalGo.g:1472:3: ( (lv_SendStmt_1_0= ruleSendStmt ) )
        {
        // InternalGo.g:1472:3: ( (lv_SendStmt_1_0= ruleSendStmt ) )
        // InternalGo.g:1473:4: (lv_SendStmt_1_0= ruleSendStmt )
        {
        // InternalGo.g:1473:4: (lv_SendStmt_1_0= ruleSendStmt )
        // InternalGo.g:1474:5: lv_SendStmt_1_0= ruleSendStmt
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getStatementAccess().getSendStmtSendStmtParserRuleCall_1_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_SendStmt_1_0=ruleSendStmt();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred45_InternalGo

    // $ANTLR start synpred46_InternalGo
    public final void synpred46_InternalGo_fragment() throws RecognitionException {   
        EObject this_SimpleStmt_2 = null;


        // InternalGo.g:1492:3: (this_SimpleStmt_2= ruleSimpleStmt )
        // InternalGo.g:1492:3: this_SimpleStmt_2= ruleSimpleStmt
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_SimpleStmt_2=ruleSimpleStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalGo

    // $ANTLR start synpred59_InternalGo
    public final void synpred59_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_SendStmt_1 = null;


        // InternalGo.g:1865:5: (this_SendStmt_1= ruleSendStmt )
        // InternalGo.g:1865:5: this_SendStmt_1= ruleSendStmt
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getCommCaseAccess().getSendStmtParserRuleCall_0_1_0());
          				
        }
        pushFollow(FOLLOW_2);
        this_SendStmt_1=ruleSendStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalGo

    // $ANTLR start synpred61_InternalGo
    public final void synpred61_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_Exp_0 = null;

        AntlrDatatypeRuleToken this_ExpList_1 = null;


        // InternalGo.g:1914:4: ( (this_Exp_0= ruleExp this_ExpList_1= ruleExpList kw= '=' ) )
        // InternalGo.g:1914:4: (this_Exp_0= ruleExp this_ExpList_1= ruleExpList kw= '=' )
        {
        // InternalGo.g:1914:4: (this_Exp_0= ruleExp this_ExpList_1= ruleExpList kw= '=' )
        // InternalGo.g:1915:5: this_Exp_0= ruleExp this_ExpList_1= ruleExpList kw= '='
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getRecvStmtAccess().getExpParserRuleCall_0_0_0());
          				
        }
        pushFollow(FOLLOW_46);
        this_Exp_0=ruleExp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_47);
        this_ExpList_1=ruleExpList();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred61_InternalGo

    // $ANTLR start synpred62_InternalGo
    public final void synpred62_InternalGo_fragment() throws RecognitionException {   
        Token this_ID_3=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_IdList_4 = null;


        // InternalGo.g:1942:4: ( (this_ID_3= RULE_ID this_IdList_4= ruleIdList kw= ':=' ) )
        // InternalGo.g:1942:4: (this_ID_3= RULE_ID this_IdList_4= ruleIdList kw= ':=' )
        {
        // InternalGo.g:1942:4: (this_ID_3= RULE_ID this_IdList_4= ruleIdList kw= ':=' )
        // InternalGo.g:1943:5: this_ID_3= RULE_ID this_IdList_4= ruleIdList kw= ':='
        {
        this_ID_3=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return ;
        pushFollow(FOLLOW_49);
        this_IdList_4=ruleIdList();

        state._fsp--;
        if (state.failed) return ;
        kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred62_InternalGo

    // $ANTLR start synpred63_InternalGo
    public final void synpred63_InternalGo_fragment() throws RecognitionException {   
        Token this_ID_1=null;

        // InternalGo.g:2084:4: (this_ID_1= RULE_ID )
        // InternalGo.g:2084:4: this_ID_1= RULE_ID
        {
        this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalGo

    // $ANTLR start synpred64_InternalGo
    public final void synpred64_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;

        // InternalGo.g:2093:4: (kw= ';' )
        // InternalGo.g:2093:4: kw= ';'
        {
        kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalGo

    // $ANTLR start synpred65_InternalGo
    public final void synpred65_InternalGo_fragment() throws RecognitionException {   
        Token this_ID_1=null;

        // InternalGo.g:2124:4: (this_ID_1= RULE_ID )
        // InternalGo.g:2124:4: this_ID_1= RULE_ID
        {
        this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalGo

    // $ANTLR start synpred66_InternalGo
    public final void synpred66_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;

        // InternalGo.g:2133:4: (kw= ';' )
        // InternalGo.g:2133:4: kw= ';'
        {
        kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_InternalGo

    // $ANTLR start synpred67_InternalGo
    public final void synpred67_InternalGo_fragment() throws RecognitionException {   
        Token this_ID_1=null;

        // InternalGo.g:2164:4: (this_ID_1= RULE_ID )
        // InternalGo.g:2164:4: this_ID_1= RULE_ID
        {
        this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalGo

    // $ANTLR start synpred68_InternalGo
    public final void synpred68_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;

        // InternalGo.g:2173:4: (kw= ';' )
        // InternalGo.g:2173:4: kw= ';'
        {
        kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalGo

    // $ANTLR start synpred69_InternalGo
    public final void synpred69_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;

        // InternalGo.g:2204:4: (kw= ';' )
        // InternalGo.g:2204:4: kw= ';'
        {
        kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_InternalGo

    // $ANTLR start synpred70_InternalGo
    public final void synpred70_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;

        // InternalGo.g:2245:4: (kw= ';' )
        // InternalGo.g:2245:4: kw= ';'
        {
        kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_InternalGo

    // $ANTLR start synpred71_InternalGo
    public final void synpred71_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_Exp_1 = null;


        // InternalGo.g:2276:4: (this_Exp_1= ruleExp )
        // InternalGo.g:2276:4: this_Exp_1= ruleExp
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
    // $ANTLR end synpred71_InternalGo

    // $ANTLR start synpred85_InternalGo
    public final void synpred85_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_Call_0 = null;


        // InternalGo.g:2848:3: (this_Call_0= ruleCall )
        // InternalGo.g:2848:3: this_Call_0= ruleCall
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
    // $ANTLR end synpred85_InternalGo

    // $ANTLR start synpred86_InternalGo
    public final void synpred86_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExpAux_1 = null;


        // InternalGo.g:2859:3: (this_ExpAux_1= ruleExpAux )
        // InternalGo.g:2859:3: this_ExpAux_1= ruleExpAux
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
    // $ANTLR end synpred86_InternalGo

    // $ANTLR start synpred87_InternalGo
    public final void synpred87_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExpJoin_3 = null;


        // InternalGo.g:2882:5: (this_ExpJoin_3= ruleExpJoin )
        // InternalGo.g:2882:5: this_ExpJoin_3= ruleExpJoin
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
    // $ANTLR end synpred87_InternalGo

    // $ANTLR start synpred88_InternalGo
    public final void synpred88_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_BooleanExp_2 = null;

        AntlrDatatypeRuleToken this_ExpJoin_3 = null;


        // InternalGo.g:2870:3: ( (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? ) )
        // InternalGo.g:2870:3: (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? )
        {
        // InternalGo.g:2870:3: (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? )
        // InternalGo.g:2871:4: this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )?
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getExpAccess().getBooleanExpParserRuleCall_2_0());
          			
        }
        pushFollow(FOLLOW_60);
        this_BooleanExp_2=ruleBooleanExp();

        state._fsp--;
        if (state.failed) return ;
        // InternalGo.g:2881:4: (this_ExpJoin_3= ruleExpJoin )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( ((LA104_0>=RULE_OP_UNARY && LA104_0<=RULE_OP_MULT)||(LA104_0>=55 && LA104_0<=56)) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // InternalGo.g:2882:5: this_ExpJoin_3= ruleExpJoin
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
    // $ANTLR end synpred88_InternalGo

    // $ANTLR start synpred89_InternalGo
    public final void synpred89_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExpJoin_5 = null;


        // InternalGo.g:2907:5: (this_ExpJoin_5= ruleExpJoin )
        // InternalGo.g:2907:5: this_ExpJoin_5= ruleExpJoin
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
    // $ANTLR end synpred89_InternalGo

    // $ANTLR start synpred90_InternalGo
    public final void synpred90_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_AritExp_4 = null;

        AntlrDatatypeRuleToken this_ExpJoin_5 = null;


        // InternalGo.g:2895:3: ( (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? ) )
        // InternalGo.g:2895:3: (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? )
        {
        // InternalGo.g:2895:3: (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? )
        // InternalGo.g:2896:4: this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )?
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getExpAccess().getAritExpParserRuleCall_3_0());
          			
        }
        pushFollow(FOLLOW_60);
        this_AritExp_4=ruleAritExp();

        state._fsp--;
        if (state.failed) return ;
        // InternalGo.g:2906:4: (this_ExpJoin_5= ruleExpJoin )?
        int alt105=2;
        int LA105_0 = input.LA(1);

        if ( ((LA105_0>=RULE_OP_UNARY && LA105_0<=RULE_OP_MULT)||(LA105_0>=55 && LA105_0<=56)) ) {
            alt105=1;
        }
        switch (alt105) {
            case 1 :
                // InternalGo.g:2907:5: this_ExpJoin_5= ruleExpJoin
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
    // $ANTLR end synpred90_InternalGo

    // $ANTLR start synpred92_InternalGo
    public final void synpred92_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_RelExp_7 = null;


        // InternalGo.g:2928:3: (this_RelExp_7= ruleRelExp )
        // InternalGo.g:2928:3: this_RelExp_7= ruleRelExp
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
    // $ANTLR end synpred92_InternalGo

    // $ANTLR start synpred93_InternalGo
    public final void synpred93_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExpJoin_9 = null;


        // InternalGo.g:2948:5: (this_ExpJoin_9= ruleExpJoin )
        // InternalGo.g:2948:5: this_ExpJoin_9= ruleExpJoin
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
    // $ANTLR end synpred93_InternalGo

    // $ANTLR start synpred97_InternalGo
    public final void synpred97_InternalGo_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExpJoin_4 = null;


        // InternalGo.g:3092:4: (this_ExpJoin_4= ruleExpJoin )
        // InternalGo.g:3092:4: this_ExpJoin_4= ruleExpJoin
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
    // $ANTLR end synpred97_InternalGo

    // $ANTLR start synpred108_InternalGo
    public final void synpred108_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_And_3 = null;


        // InternalGo.g:3401:4: (kw= '||' this_And_3= ruleAnd )
        // InternalGo.g:3401:4: kw= '||' this_And_3= ruleAnd
        {
        kw=(Token)match(input,56,FOLLOW_66); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_And_3=ruleAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_InternalGo

    // $ANTLR start synpred109_InternalGo
    public final void synpred109_InternalGo_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_BooleanLiteral_2 = null;


        // InternalGo.g:3447:4: (kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral )
        // InternalGo.g:3447:4: kw= '&&' this_BooleanLiteral_2= ruleBooleanLiteral
        {
        kw=(Token)match(input,55,FOLLOW_66); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_BooleanLiteral_2=ruleBooleanLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred109_InternalGo

    // $ANTLR start synpred111_InternalGo
    public final void synpred111_InternalGo_fragment() throws RecognitionException {   
        Token this_OP_SUM_0=null;
        AntlrDatatypeRuleToken this_Multiplication_1 = null;


        // InternalGo.g:3536:3: ( (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication )
        // InternalGo.g:3536:3: (this_OP_SUM_0= RULE_OP_SUM )? this_Multiplication_1= ruleMultiplication
        {
        // InternalGo.g:3536:3: (this_OP_SUM_0= RULE_OP_SUM )?
        int alt107=2;
        int LA107_0 = input.LA(1);

        if ( (LA107_0==RULE_OP_SUM) ) {
            alt107=1;
        }
        switch (alt107) {
            case 1 :
                // InternalGo.g:3537:4: this_OP_SUM_0= RULE_OP_SUM
                {
                this_OP_SUM_0=(Token)match(input,RULE_OP_SUM,FOLLOW_64); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_2);
        this_Multiplication_1=ruleMultiplication();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred111_InternalGo

    // $ANTLR start synpred113_InternalGo
    public final void synpred113_InternalGo_fragment() throws RecognitionException {   
        Token this_OP_MULT_1=null;
        AntlrDatatypeRuleToken this_NumberLiteral_2 = null;


        // InternalGo.g:3585:4: ( (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral )
        // InternalGo.g:3585:4: (this_OP_MULT_1= RULE_OP_MULT )? this_NumberLiteral_2= ruleNumberLiteral
        {
        // InternalGo.g:3585:4: (this_OP_MULT_1= RULE_OP_MULT )?
        int alt108=2;
        int LA108_0 = input.LA(1);

        if ( (LA108_0==RULE_OP_MULT) ) {
            alt108=1;
        }
        switch (alt108) {
            case 1 :
                // InternalGo.g:3586:5: this_OP_MULT_1= RULE_OP_MULT
                {
                this_OP_MULT_1=(Token)match(input,RULE_OP_MULT,FOLLOW_64); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_2);
        this_NumberLiteral_2=ruleNumberLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred113_InternalGo

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
    public final boolean synpred41_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalGo_fragment(); // can never throw exception
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
    public final boolean synpred97_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalGo_fragment(); // can never throw exception
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
    public final boolean synpred113_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_InternalGo_fragment(); // can never throw exception
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
    public final boolean synpred86_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred109_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalGo_fragment(); // can never throw exception
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
    public final boolean synpred93_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalGo_fragment(); // can never throw exception
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
    public final boolean synpred29_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalGo_fragment(); // can never throw exception
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
    public final boolean synpred45_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalGo_fragment(); // can never throw exception
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
    public final boolean synpred111_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred111_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalGo_fragment(); // can never throw exception
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


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA98 dfa98 = new DFA98(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\4\1\6\2\uffff\2\4\1\6";
    static final String dfa_3s = "\1\72\1\70\2\uffff\2\72\1\70";
    static final String dfa_4s = "\2\uffff\1\1\1\2\3\uffff";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\2\uffff\1\2\1\uffff\1\2\4\uffff\1\3\1\uffff\1\2\13\uffff\1\3\20\uffff\2\3\6\uffff\1\2\2\uffff\2\2",
            "\4\2\7\uffff\1\2\1\uffff\1\2\2\uffff\1\5\2\2\1\uffff\1\4\2\uffff\1\2\31\uffff\2\2",
            "",
            "",
            "\1\6\1\2\2\uffff\1\2\1\uffff\1\2\6\uffff\1\2\44\uffff\1\2\2\uffff\2\2",
            "\2\3\2\uffff\1\3\1\uffff\1\3\6\uffff\1\3\6\uffff\1\2\35\uffff\1\3\2\uffff\2\3",
            "\4\2\7\uffff\1\2\1\uffff\1\2\2\uffff\1\5\1\2\2\uffff\1\4\34\uffff\2\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "448:3: ( ( ruleExp ( ruleRangeClause )? ) | (this_ForClause_3= ruleForClause )? )";
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\1\13\14\uffff";
    static final String dfa_9s = "\1\4\1\0\2\uffff\7\0\2\uffff";
    static final String dfa_10s = "\1\72\1\0\2\uffff\7\0\2\uffff";
    static final String dfa_11s = "\2\uffff\1\1\10\uffff\1\2\1\uffff";
    static final String dfa_12s = "\1\uffff\1\0\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\12\2\uffff\1\10\1\uffff\1\11\6\uffff\1\5\13\uffff\1\13\20\uffff\2\2\6\uffff\1\4\2\uffff\1\6\1\7",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
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

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1311:3: ( ( ( (lv_decl_1_0= ruleDecl ) ) | ( (lv_Assig_2_0= ruleAssig ) ) | ruleExp ) otherlv_4= ';' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_1 = input.LA(1);

                         
                        int index38_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_4 = input.LA(1);

                         
                        int index38_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_6 = input.LA(1);

                         
                        int index38_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_7 = input.LA(1);

                         
                        int index38_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_9 = input.LA(1);

                         
                        int index38_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA38_10 = input.LA(1);

                         
                        int index38_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalGo()) ) {s = 2;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index38_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\1\4\1\6\2\uffff\1\4\1\uffff\1\26";
    static final String dfa_15s = "\1\72\1\70\2\uffff\1\4\1\uffff\1\32";
    static final String dfa_16s = "\2\uffff\1\1\1\3\1\uffff\1\2\1\uffff";
    static final String[] dfa_17s = {
            "\1\1\1\3\2\uffff\1\3\1\uffff\1\3\6\uffff\1\3\34\uffff\2\2\6\uffff\1\3\2\uffff\2\3",
            "\4\3\5\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\2\1\5\2\uffff\1\4\25\uffff\6\5\1\uffff\2\3",
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

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_5;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "1312:4: ( ( (lv_decl_1_0= ruleDecl ) ) | ( (lv_Assig_2_0= ruleAssig ) ) | ruleExp )";
        }
    }
    static final String dfa_18s = "\27\uffff";
    static final String dfa_19s = "\1\4\10\0\16\uffff";
    static final String dfa_20s = "\1\72\10\0\16\uffff";
    static final String dfa_21s = "\11\uffff\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\1\1\2";
    static final String dfa_22s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\16\uffff}>";
    static final String[] dfa_23s = {
            "\1\1\1\10\2\uffff\1\6\1\uffff\1\7\6\uffff\1\3\3\uffff\1\16\6\uffff\1\14\5\uffff\1\13\1\uffff\1\24\1\uffff\1\17\1\20\1\21\1\22\1\23\1\15\2\uffff\2\11\6\uffff\1\2\2\uffff\1\4\1\5",
            "\1\uffff",
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
            "",
            ""
    };

    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_18;
            this.eof = dfa_18;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "1451:2: ( ( (lv_LabeledStmt_0_0= ruleLabeledStmt ) ) | ( (lv_SendStmt_1_0= ruleSendStmt ) ) | this_SimpleStmt_2= ruleSimpleStmt | this_IfStmt_3= ruleIfStmt | ( (lv_SwitchStmt_4_0= ruleSwitchStmt ) ) | ( (lv_ReturnStmt_5_0= ruleReturnStmt ) ) | this_ForStmt_6= ruleForStmt | ( (lv_BreakStmt_7_0= ruleBreakStmt ) ) | ( (lv_ContinueStmt_8_0= ruleContinueStmt ) ) | ( (lv_GotoStmt_9_0= ruleGotoStmt ) ) | ( (lv_FalltrhoughStmt_10_0= ruleFalltrhoughStmt ) ) | ( (lv_DeferStmt_11_0= ruleDeferStmt ) ) | this_SelectStmt_12= ruleSelectStmt )";
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
                        if ( (synpred44_InternalGo()) ) {s = 21;}

                        else if ( (synpred45_InternalGo()) ) {s = 22;}

                        else if ( (synpred46_InternalGo()) ) {s = 9;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalGo()) ) {s = 22;}

                        else if ( (synpred46_InternalGo()) ) {s = 9;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_3 = input.LA(1);

                         
                        int index41_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalGo()) ) {s = 22;}

                        else if ( (synpred46_InternalGo()) ) {s = 9;}

                         
                        input.seek(index41_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA41_4 = input.LA(1);

                         
                        int index41_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalGo()) ) {s = 22;}

                        else if ( (synpred46_InternalGo()) ) {s = 9;}

                         
                        input.seek(index41_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA41_5 = input.LA(1);

                         
                        int index41_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalGo()) ) {s = 22;}

                        else if ( (synpred46_InternalGo()) ) {s = 9;}

                         
                        input.seek(index41_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA41_6 = input.LA(1);

                         
                        int index41_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalGo()) ) {s = 22;}

                        else if ( (synpred46_InternalGo()) ) {s = 9;}

                         
                        input.seek(index41_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA41_7 = input.LA(1);

                         
                        int index41_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalGo()) ) {s = 22;}

                        else if ( (synpred46_InternalGo()) ) {s = 9;}

                         
                        input.seek(index41_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA41_8 = input.LA(1);

                         
                        int index41_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalGo()) ) {s = 22;}

                        else if ( (synpred46_InternalGo()) ) {s = 9;}

                         
                        input.seek(index41_8);
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
    static final String dfa_24s = "\13\uffff";
    static final String dfa_25s = "\1\4\10\0\2\uffff";
    static final String dfa_26s = "\1\72\10\0\2\uffff";
    static final String dfa_27s = "\11\uffff\1\1\1\2";
    static final String dfa_28s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff}>";
    static final String[] dfa_29s = {
            "\1\1\1\10\2\uffff\1\6\1\uffff\1\7\6\uffff\1\3\44\uffff\1\2\2\uffff\1\4\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_24;
            this.eof = dfa_24;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_27;
            this.special = dfa_28;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "1864:4: (this_SendStmt_1= ruleSendStmt | this_RecvStmt_2= ruleRecvStmt )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_1 = input.LA(1);

                         
                        int index45_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index45_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_2 = input.LA(1);

                         
                        int index45_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index45_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA45_3 = input.LA(1);

                         
                        int index45_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index45_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA45_4 = input.LA(1);

                         
                        int index45_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index45_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA45_5 = input.LA(1);

                         
                        int index45_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index45_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA45_6 = input.LA(1);

                         
                        int index45_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index45_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA45_7 = input.LA(1);

                         
                        int index45_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index45_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA45_8 = input.LA(1);

                         
                        int index45_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index45_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_30s = "\14\uffff";
    static final String dfa_31s = "\1\4\10\0\3\uffff";
    static final String dfa_32s = "\1\72\10\0\3\uffff";
    static final String dfa_33s = "\11\uffff\1\1\1\2\1\3";
    static final String dfa_34s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff}>";
    static final String[] dfa_35s = {
            "\1\1\1\10\2\uffff\1\6\1\uffff\1\7\6\uffff\1\3\44\uffff\1\2\2\uffff\1\4\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_30;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "1913:3: ( (this_Exp_0= ruleExp this_ExpList_1= ruleExpList kw= '=' ) | (this_ID_3= RULE_ID this_IdList_4= ruleIdList kw= ':=' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_1 = input.LA(1);

                         
                        int index47_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalGo()) ) {s = 9;}

                        else if ( (synpred62_InternalGo()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index47_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_2 = input.LA(1);

                         
                        int index47_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index47_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA47_3 = input.LA(1);

                         
                        int index47_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index47_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA47_4 = input.LA(1);

                         
                        int index47_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index47_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA47_5 = input.LA(1);

                         
                        int index47_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index47_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA47_6 = input.LA(1);

                         
                        int index47_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index47_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA47_7 = input.LA(1);

                         
                        int index47_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index47_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA47_8 = input.LA(1);

                         
                        int index47_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index47_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_36s = "\34\uffff";
    static final String dfa_37s = "\1\11\33\uffff";
    static final String dfa_38s = "\1\4\10\0\23\uffff";
    static final String dfa_39s = "\1\72\10\0\23\uffff";
    static final String dfa_40s = "\11\uffff\1\2\21\uffff\1\1";
    static final String dfa_41s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\23\uffff}>";
    static final String[] dfa_42s = {
            "\1\1\1\10\2\uffff\1\6\1\uffff\1\7\4\uffff\1\11\1\uffff\1\3\3\uffff\1\11\6\uffff\1\11\1\uffff\5\11\1\uffff\1\11\1\uffff\6\11\2\uffff\2\11\6\uffff\1\2\2\uffff\1\4\1\5",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[][] dfa_42 = unpackEncodedStringArray(dfa_42s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "2275:3: (this_Exp_1= ruleExp )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_3 = input.LA(1);

                         
                        int index56_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index56_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA56_4 = input.LA(1);

                         
                        int index56_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index56_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA56_5 = input.LA(1);

                         
                        int index56_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index56_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA56_6 = input.LA(1);

                         
                        int index56_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index56_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA56_7 = input.LA(1);

                         
                        int index56_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index56_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA56_8 = input.LA(1);

                         
                        int index56_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalGo()) ) {s = 27;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index56_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_43s = "\1\4\2\0\1\uffff\2\0\1\uffff\1\0\5\uffff";
    static final String dfa_44s = "\1\72\2\0\1\uffff\2\0\1\uffff\1\0\5\uffff";
    static final String dfa_45s = "\3\uffff\1\2\2\uffff\1\4\1\uffff\1\5\1\1\1\7\1\3\1\6";
    static final String dfa_46s = "\1\uffff\1\0\1\1\1\uffff\1\2\1\3\1\uffff\1\4\5\uffff}>";
    static final String[] dfa_47s = {
            "\1\1\1\10\2\uffff\1\6\1\uffff\1\7\6\uffff\1\3\44\uffff\1\2\2\uffff\1\4\1\5",
            "\1\uffff",
            "\1\uffff",
            "",
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
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[][] dfa_47 = unpackEncodedStringArray(dfa_47s);

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_46;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "2847:2: (this_Call_0= ruleCall | this_ExpAux_1= ruleExpAux | (this_BooleanExp_2= ruleBooleanExp (this_ExpJoin_3= ruleExpJoin )? ) | (this_AritExp_4= ruleAritExp (this_ExpJoin_5= ruleExpJoin )? ) | this_STRING_6= RULE_STRING | this_RelExp_7= ruleRelExp | (this_ID_8= RULE_ID (this_ExpJoin_9= ruleExpJoin )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalGo()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalGo()) ) {s = 3;}

                        else if ( (synpred88_InternalGo()) ) {s = 11;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_4 = input.LA(1);

                         
                        int index70_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalGo()) ) {s = 11;}

                        else if ( (synpred92_InternalGo()) ) {s = 12;}

                         
                        input.seek(index70_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA70_5 = input.LA(1);

                         
                        int index70_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalGo()) ) {s = 11;}

                        else if ( (synpred92_InternalGo()) ) {s = 12;}

                         
                        input.seek(index70_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA70_7 = input.LA(1);

                         
                        int index70_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalGo()) ) {s = 6;}

                        else if ( (synpred92_InternalGo()) ) {s = 12;}

                         
                        input.seek(index70_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_48s = "\1\uffff\1\3\5\uffff";
    static final String dfa_49s = "\2\4\2\uffff\1\4\1\uffff\1\26";
    static final String dfa_50s = "\2\72\2\uffff\1\4\1\uffff\1\32";
    static final String[] dfa_51s = {
            "\1\1\1\3\2\uffff\1\3\1\uffff\1\3\6\uffff\1\3\34\uffff\2\2\6\uffff\1\3\2\uffff\2\3",
            "\7\3\4\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\2\1\5\2\uffff\1\4\1\uffff\7\3\1\uffff\1\3\1\uffff\6\3\2\uffff\2\3\6\5\5\3",
            "",
            "",
            "\1\6",
            "",
            "\1\2\1\5\2\uffff\1\4"
    };
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final short[][] dfa_51 = unpackEncodedStringArray(dfa_51s);

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_1;
            this.eof = dfa_48;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_16;
            this.special = dfa_5;
            this.transition = dfa_51;
        }
        public String getDescription() {
            return "2978:2: ( ( () ( (lv_decl_1_0= ruleDecl ) ) ) | this_Assig_2= ruleAssig | ( () ruleExp ) )";
        }
    }

    class DFA98 extends DFA {

        public DFA98(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 98;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_5;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "1312:4: ( ( (lv_decl_1_0= ruleDecl ) ) | ( (lv_Assig_2_0= ruleAssig ) ) | ruleExp )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000D00002018012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000D00002010012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000D00002008012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000D00002000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000A0030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C8030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0640C00020028530L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0640C00025C28530L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0640000000028530L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0640C00000020532L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0640000000020530L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0640C00020028532L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x3800200000020012L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x3800200008060010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x3800200008020010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x380020000C020010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x3800200000020010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0640C00020020530L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0640CFD410220532L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0640CFD410228532L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0640C00000020530L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0640C00420028530L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0640CFD510220530L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0640CFD510228530L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0640CFD410220530L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0640000000020532L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x3800200104020010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x3800200104028010L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x3800200004020010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x003F000004800000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x01800000000003C2L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0640000000060530L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0640000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000080000L});

}