package at.bestsolution.efxclipse.tooling.css.cssext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bestsolution.efxclipse.tooling.css.cssext.services.CssExtDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCssExtDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_JDOC", "RULE_PSEUDO", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.'", "'*'", "'package'", "'{'", "'}'", "'INT'", "'DOUBLE'", "'UDOUBLE'", "'default:'", "';'", "'<'", "'>'", "'='", "'|'", "'||'", "'+'", "'?'", "'['", "']'", "','"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=11;
    public static final int RULE_JDOC=5;
    public static final int RULE_PSEUDO=6;

    // delegates
    // delegators


        public InternalCssExtDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCssExtDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCssExtDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g"; }



     	private CssExtDslGrammarAccess grammarAccess;
     	
        public InternalCssExtDslParser(TokenStream input, CssExtDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CssExtension";	
       	}
       	
       	@Override
       	protected CssExtDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCssExtension"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:67:1: entryRuleCssExtension returns [EObject current=null] : iv_ruleCssExtension= ruleCssExtension EOF ;
    public final EObject entryRuleCssExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssExtension = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:68:2: (iv_ruleCssExtension= ruleCssExtension EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:69:2: iv_ruleCssExtension= ruleCssExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCssExtensionRule()); 
            }
            pushFollow(FOLLOW_ruleCssExtension_in_entryRuleCssExtension75);
            iv_ruleCssExtension=ruleCssExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCssExtension; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCssExtension85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCssExtension"


    // $ANTLR start "ruleCssExtension"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:76:1: ruleCssExtension returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_packageDef_1_0= rulePackageDefinition ) )? ) ;
    public final EObject ruleCssExtension() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_packageDef_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_packageDef_1_0= rulePackageDefinition ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_packageDef_1_0= rulePackageDefinition ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_packageDef_1_0= rulePackageDefinition ) )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_packageDef_1_0= rulePackageDefinition ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCssExtensionAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleCssExtension131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCssExtensionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:98:3: ( (lv_packageDef_1_0= rulePackageDefinition ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:99:1: (lv_packageDef_1_0= rulePackageDefinition )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:99:1: (lv_packageDef_1_0= rulePackageDefinition )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:100:3: lv_packageDef_1_0= rulePackageDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCssExtensionAccess().getPackageDefPackageDefinitionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackageDefinition_in_ruleCssExtension153);
                    lv_packageDef_1_0=rulePackageDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCssExtensionRule());
                      	        }
                             		set(
                             			current, 
                             			"packageDef",
                              		lv_packageDef_1_0, 
                              		"PackageDefinition");
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
    // $ANTLR end "ruleCssExtension"


    // $ANTLR start "entryRuleImport"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:126:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport190);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport200); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport258);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildCard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleValidID"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:167:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:168:2: (iv_ruleValidID= ruleValidID EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:169:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID295);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID306); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:176:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:179:28: (this_ID_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:180:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:195:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:196:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:197:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName390);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName401); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:204:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:207:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:208:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:208:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:209:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName448);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==RULE_ID) && (synpred1_InternalCssExtDsl())) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName476); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName499);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:246:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:247:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:248:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard547);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard558); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:255:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:258:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:259:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:259:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:260:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard605);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:270:1: (kw= '.' kw= '*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:271:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildCard624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildCard637); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
                          
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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRulePackageDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:290:1: entryRulePackageDefinition returns [EObject current=null] : iv_rulePackageDefinition= rulePackageDefinition EOF ;
    public final EObject entryRulePackageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:291:2: (iv_rulePackageDefinition= rulePackageDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:292:2: iv_rulePackageDefinition= rulePackageDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePackageDefinition_in_entryRulePackageDefinition679);
            iv_rulePackageDefinition=rulePackageDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDefinition689); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDefinition"


    // $ANTLR start "rulePackageDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:299:1: rulePackageDefinition returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDeclartion ) ) )* otherlv_6= '}' ) ;
    public final EObject rulePackageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_rules_3_0 = null;

        EObject lv_subpackages_4_0 = null;

        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:302:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDeclartion ) ) )* otherlv_6= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:303:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDeclartion ) ) )* otherlv_6= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:303:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDeclartion ) ) )* otherlv_6= '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:303:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDeclartion ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePackageDefinition726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:307:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:308:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:308:1: (lv_name_1_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:309:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDefinition747);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePackageDefinition759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:329:1: ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDeclartion ) ) )*
            loop5:
            do {
                int alt5=4;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:329:2: ( (lv_rules_3_0= ruleCSSRuleDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:329:2: ( (lv_rules_3_0= ruleCSSRuleDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:330:1: (lv_rules_3_0= ruleCSSRuleDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:330:1: (lv_rules_3_0= ruleCSSRuleDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:331:3: lv_rules_3_0= ruleCSSRuleDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDefinitionAccess().getRulesCSSRuleDefinitionParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCSSRuleDefinition_in_rulePackageDefinition781);
            	    lv_rules_3_0=ruleCSSRuleDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"rules",
            	              		lv_rules_3_0, 
            	              		"CSSRuleDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:348:6: ( (lv_subpackages_4_0= rulePackageDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:348:6: ( (lv_subpackages_4_0= rulePackageDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:349:1: (lv_subpackages_4_0= rulePackageDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:349:1: (lv_subpackages_4_0= rulePackageDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:350:3: lv_subpackages_4_0= rulePackageDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDefinitionAccess().getSubpackagesPackageDefinitionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePackageDefinition_in_rulePackageDefinition808);
            	    lv_subpackages_4_0=rulePackageDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"subpackages",
            	              		lv_subpackages_4_0, 
            	              		"PackageDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:367:6: ( (lv_elements_5_0= ruleElementDeclartion ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:367:6: ( (lv_elements_5_0= ruleElementDeclartion ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:368:1: (lv_elements_5_0= ruleElementDeclartion )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:368:1: (lv_elements_5_0= ruleElementDeclartion )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:369:3: lv_elements_5_0= ruleElementDeclartion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDefinitionAccess().getElementsElementDeclartionParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElementDeclartion_in_rulePackageDefinition835);
            	    lv_elements_5_0=ruleElementDeclartion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_5_0, 
            	              		"ElementDeclartion");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_rulePackageDefinition849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "rulePackageDefinition"


    // $ANTLR start "entryRuleDoku"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:397:1: entryRuleDoku returns [EObject current=null] : iv_ruleDoku= ruleDoku EOF ;
    public final EObject entryRuleDoku() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoku = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:398:2: (iv_ruleDoku= ruleDoku EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:399:2: iv_ruleDoku= ruleDoku EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDokuRule()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_entryRuleDoku885);
            iv_ruleDoku=ruleDoku();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoku; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoku895); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoku"


    // $ANTLR start "ruleDoku"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:406:1: ruleDoku returns [EObject current=null] : ( (lv_content_0_0= RULE_JDOC ) ) ;
    public final EObject ruleDoku() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:409:28: ( ( (lv_content_0_0= RULE_JDOC ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:410:1: ( (lv_content_0_0= RULE_JDOC ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:410:1: ( (lv_content_0_0= RULE_JDOC ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:411:1: (lv_content_0_0= RULE_JDOC )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:411:1: (lv_content_0_0= RULE_JDOC )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:412:3: lv_content_0_0= RULE_JDOC
            {
            lv_content_0_0=(Token)match(input,RULE_JDOC,FOLLOW_RULE_JDOC_in_ruleDoku936); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_content_0_0, grammarAccess.getDokuAccess().getContentJDOCTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDokuRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"content",
                      		lv_content_0_0, 
                      		"JDOC");
              	    
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
    // $ANTLR end "ruleDoku"


    // $ANTLR start "entryRuleCSSBaseType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:436:1: entryRuleCSSBaseType returns [EObject current=null] : iv_ruleCSSBaseType= ruleCSSBaseType EOF ;
    public final EObject entryRuleCSSBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSBaseType = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:437:2: (iv_ruleCSSBaseType= ruleCSSBaseType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:438:2: iv_ruleCSSBaseType= ruleCSSBaseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSBaseTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCSSBaseType_in_entryRuleCSSBaseType976);
            iv_ruleCSSBaseType=ruleCSSBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSBaseType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSBaseType986); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSBaseType"


    // $ANTLR start "ruleCSSBaseType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:445:1: ruleCSSBaseType returns [EObject current=null] : (otherlv_0= 'INT' | otherlv_1= 'DOUBLE' | otherlv_2= 'UDOUBLE' ) ;
    public final EObject ruleCSSBaseType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:448:28: ( (otherlv_0= 'INT' | otherlv_1= 'DOUBLE' | otherlv_2= 'UDOUBLE' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:449:1: (otherlv_0= 'INT' | otherlv_1= 'DOUBLE' | otherlv_2= 'UDOUBLE' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:449:1: (otherlv_0= 'INT' | otherlv_1= 'DOUBLE' | otherlv_2= 'UDOUBLE' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:449:3: otherlv_0= 'INT'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleCSSBaseType1023); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCSSBaseTypeAccess().getINTKeyword_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:454:7: otherlv_1= 'DOUBLE'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCSSBaseType1041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCSSBaseTypeAccess().getDOUBLEKeyword_1());
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:459:7: otherlv_2= 'UDOUBLE'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleCSSBaseType1059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCSSBaseTypeAccess().getUDOUBLEKeyword_2());
                          
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
    // $ANTLR end "ruleCSSBaseType"


    // $ANTLR start "entryRuleElementDeclartion"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:471:1: entryRuleElementDeclartion returns [EObject current=null] : iv_ruleElementDeclartion= ruleElementDeclartion EOF ;
    public final EObject entryRuleElementDeclartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDeclartion = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:472:2: (iv_ruleElementDeclartion= ruleElementDeclartion EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:473:2: iv_ruleElementDeclartion= ruleElementDeclartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementDeclartionRule()); 
            }
            pushFollow(FOLLOW_ruleElementDeclartion_in_entryRuleElementDeclartion1095);
            iv_ruleElementDeclartion=ruleElementDeclartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementDeclartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDeclartion1105); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementDeclartion"


    // $ANTLR start "ruleElementDeclartion"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:480:1: ruleElementDeclartion returns [EObject current=null] : ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_properties_3_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_4_0= rulePseudoClassDefinition ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleElementDeclartion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_doku_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_properties_3_0 = null;

        EObject lv_pseudoClasses_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:483:28: ( ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_properties_3_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_4_0= rulePseudoClassDefinition ) ) )* otherlv_5= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:484:1: ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_properties_3_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_4_0= rulePseudoClassDefinition ) ) )* otherlv_5= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:484:1: ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_properties_3_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_4_0= rulePseudoClassDefinition ) ) )* otherlv_5= '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:484:2: ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_properties_3_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_4_0= rulePseudoClassDefinition ) ) )* otherlv_5= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:484:2: ( (lv_doku_0_0= ruleDoku ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_JDOC) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:485:1: (lv_doku_0_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:485:1: (lv_doku_0_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:486:3: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementDeclartionAccess().getDokuDokuParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleElementDeclartion1151);
                    lv_doku_0_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElementDeclartionRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_0_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:502:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:503:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:503:1: (lv_name_1_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:504:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementDeclartionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleElementDeclartion1173);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElementDeclartionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleElementDeclartion1185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getElementDeclartionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:524:1: ( ( (lv_properties_3_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_4_0= rulePseudoClassDefinition ) ) )*
            loop8:
            do {
                int alt8=3;
                switch ( input.LA(1) ) {
                case RULE_JDOC:
                    {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==RULE_PSEUDO) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==RULE_ID) ) {
                        alt8=1;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    alt8=1;
                    }
                    break;
                case RULE_PSEUDO:
                    {
                    alt8=2;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:524:2: ( (lv_properties_3_0= rulePropertyDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:524:2: ( (lv_properties_3_0= rulePropertyDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:525:1: (lv_properties_3_0= rulePropertyDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:525:1: (lv_properties_3_0= rulePropertyDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:526:3: lv_properties_3_0= rulePropertyDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementDeclartionAccess().getPropertiesPropertyDefinitionParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleElementDeclartion1207);
            	    lv_properties_3_0=rulePropertyDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElementDeclartionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_3_0, 
            	              		"PropertyDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:543:6: ( (lv_pseudoClasses_4_0= rulePseudoClassDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:543:6: ( (lv_pseudoClasses_4_0= rulePseudoClassDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:544:1: (lv_pseudoClasses_4_0= rulePseudoClassDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:544:1: (lv_pseudoClasses_4_0= rulePseudoClassDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:545:3: lv_pseudoClasses_4_0= rulePseudoClassDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementDeclartionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePseudoClassDefinition_in_ruleElementDeclartion1234);
            	    lv_pseudoClasses_4_0=rulePseudoClassDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElementDeclartionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pseudoClasses",
            	              		lv_pseudoClasses_4_0, 
            	              		"PseudoClassDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleElementDeclartion1248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getElementDeclartionAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleElementDeclartion"


    // $ANTLR start "entryRulePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:573:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:574:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:575:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1284);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition1294); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:582:1: rulePropertyDefinition returns [EObject current=null] : ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleCSSRuleOr ) ) (otherlv_3= 'default:' ( (lv_default_4_0= ruleCSSDefaultValue ) ) )? otherlv_5= ';' ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_doku_0_0 = null;

        EObject lv_rule_2_0 = null;

        EObject lv_default_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:585:28: ( ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleCSSRuleOr ) ) (otherlv_3= 'default:' ( (lv_default_4_0= ruleCSSDefaultValue ) ) )? otherlv_5= ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:586:1: ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleCSSRuleOr ) ) (otherlv_3= 'default:' ( (lv_default_4_0= ruleCSSDefaultValue ) ) )? otherlv_5= ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:586:1: ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleCSSRuleOr ) ) (otherlv_3= 'default:' ( (lv_default_4_0= ruleCSSDefaultValue ) ) )? otherlv_5= ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:586:2: ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleCSSRuleOr ) ) (otherlv_3= 'default:' ( (lv_default_4_0= ruleCSSDefaultValue ) ) )? otherlv_5= ';'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:586:2: ( (lv_doku_0_0= ruleDoku ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_JDOC) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:587:1: (lv_doku_0_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:587:1: (lv_doku_0_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:588:3: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_rulePropertyDefinition1340);
                    lv_doku_0_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_0_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:604:3: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:605:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:605:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:606:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyDefinition1358); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:622:2: ( (lv_rule_2_0= ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:623:1: (lv_rule_2_0= ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:623:1: (lv_rule_2_0= ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:624:3: lv_rule_2_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rulePropertyDefinition1384);
            lv_rule_2_0=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"rule",
                      		lv_rule_2_0, 
                      		"CSSRuleOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:640:2: (otherlv_3= 'default:' ( (lv_default_4_0= ruleCSSDefaultValue ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:640:4: otherlv_3= 'default:' ( (lv_default_4_0= ruleCSSDefaultValue ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_rulePropertyDefinition1397); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:644:1: ( (lv_default_4_0= ruleCSSDefaultValue ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:645:1: (lv_default_4_0= ruleCSSDefaultValue )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:645:1: (lv_default_4_0= ruleCSSDefaultValue )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:646:3: lv_default_4_0= ruleCSSDefaultValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCSSDefaultValue_in_rulePropertyDefinition1418);
                    lv_default_4_0=ruleCSSDefaultValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_4_0, 
                              		"CSSDefaultValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_rulePropertyDefinition1432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_4());
                  
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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRulePseudoClassDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:674:1: entryRulePseudoClassDefinition returns [EObject current=null] : iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF ;
    public final EObject entryRulePseudoClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:675:2: (iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:676:2: iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassDefinition_in_entryRulePseudoClassDefinition1468);
            iv_rulePseudoClassDefinition=rulePseudoClassDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassDefinition1478); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoClassDefinition"


    // $ANTLR start "rulePseudoClassDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:683:1: rulePseudoClassDefinition returns [EObject current=null] : ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= RULE_PSEUDO ) ) ) ;
    public final EObject rulePseudoClassDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_doku_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:686:28: ( ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= RULE_PSEUDO ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:687:1: ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= RULE_PSEUDO ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:687:1: ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= RULE_PSEUDO ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:687:2: ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= RULE_PSEUDO ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:687:2: ( (lv_doku_0_0= ruleDoku ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_JDOC) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:688:1: (lv_doku_0_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:688:1: (lv_doku_0_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:689:3: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_rulePseudoClassDefinition1524);
                    lv_doku_0_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPseudoClassDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_0_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:705:3: ( (lv_name_1_0= RULE_PSEUDO ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:706:1: (lv_name_1_0= RULE_PSEUDO )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:706:1: (lv_name_1_0= RULE_PSEUDO )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:707:3: lv_name_1_0= RULE_PSEUDO
            {
            lv_name_1_0=(Token)match(input,RULE_PSEUDO,FOLLOW_RULE_PSEUDO_in_rulePseudoClassDefinition1542); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPseudoClassDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"PSEUDO");
              	    
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
    // $ANTLR end "rulePseudoClassDefinition"


    // $ANTLR start "entryRuleCSSRuleId"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:731:1: entryRuleCSSRuleId returns [EObject current=null] : iv_ruleCSSRuleId= ruleCSSRuleId EOF ;
    public final EObject entryRuleCSSRuleId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleId = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:732:2: (iv_ruleCSSRuleId= ruleCSSRuleId EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:733:2: iv_ruleCSSRuleId= ruleCSSRuleId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleIdRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleId_in_entryRuleCSSRuleId1583);
            iv_ruleCSSRuleId=ruleCSSRuleId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleId; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleId1593); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleId"


    // $ANTLR start "ruleCSSRuleId"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:740:1: ruleCSSRuleId returns [EObject current=null] : ( (lv_name_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleCSSRuleId() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:743:28: ( ( (lv_name_0_0= ruleQualifiedName ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:744:1: ( (lv_name_0_0= ruleQualifiedName ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:744:1: ( (lv_name_0_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:745:1: (lv_name_0_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:745:1: (lv_name_0_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:746:3: lv_name_0_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleIdAccess().getNameQualifiedNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCSSRuleId1638);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSSRuleIdRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleCSSRuleId"


    // $ANTLR start "entryRuleCSSRuleRef"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:770:1: entryRuleCSSRuleRef returns [EObject current=null] : iv_ruleCSSRuleRef= ruleCSSRuleRef EOF ;
    public final EObject entryRuleCSSRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleRef = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:771:2: (iv_ruleCSSRuleRef= ruleCSSRuleRef EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:772:2: iv_ruleCSSRuleRef= ruleCSSRuleRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleRefRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef1673);
            iv_ruleCSSRuleRef=ruleCSSRuleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleRef1683); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleRef"


    // $ANTLR start "ruleCSSRuleRef"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:779:1: ruleCSSRuleRef returns [EObject current=null] : (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' ) ;
    public final EObject ruleCSSRuleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:782:28: ( (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:783:1: (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:783:1: (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:783:3: otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleCSSRuleRef1720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:787:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:788:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:788:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:789:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCSSRuleRefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCSSRuleRef1743);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleCSSRuleRef1755); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCSSRuleRefAccess().getGreaterThanSignKeyword_2());
                  
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
    // $ANTLR end "ruleCSSRuleRef"


    // $ANTLR start "entryRuleCSSRuleDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:814:1: entryRuleCSSRuleDefinition returns [EObject current=null] : iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF ;
    public final EObject entryRuleCSSRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:815:2: (iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:816:2: iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleDefinition_in_entryRuleCSSRuleDefinition1791);
            iv_ruleCSSRuleDefinition=ruleCSSRuleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleDefinition1801); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleDefinition"


    // $ANTLR start "ruleCSSRuleDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:823:1: ruleCSSRuleDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleCSSRuleId ) ) otherlv_3= '=' ( (lv_r_4_0= ruleCSSRuleOr ) ) otherlv_5= ';' ) ;
    public final EObject ruleCSSRuleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_doku_1_0 = null;

        EObject lv_name_2_0 = null;

        EObject lv_r_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:826:28: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleCSSRuleId ) ) otherlv_3= '=' ( (lv_r_4_0= ruleCSSRuleOr ) ) otherlv_5= ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:827:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleCSSRuleId ) ) otherlv_3= '=' ( (lv_r_4_0= ruleCSSRuleOr ) ) otherlv_5= ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:827:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleCSSRuleId ) ) otherlv_3= '=' ( (lv_r_4_0= ruleCSSRuleOr ) ) otherlv_5= ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:827:2: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleCSSRuleId ) ) otherlv_3= '=' ( (lv_r_4_0= ruleCSSRuleOr ) ) otherlv_5= ';'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:827:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:828:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleDefinitionAccess().getCSSRuleDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:833:2: ( (lv_doku_1_0= ruleDoku ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_JDOC) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:834:1: (lv_doku_1_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:834:1: (lv_doku_1_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:835:3: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleCSSRuleDefinition1856);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_1_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:851:3: ( (lv_name_2_0= ruleCSSRuleId ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:852:1: (lv_name_2_0= ruleCSSRuleId )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:852:1: (lv_name_2_0= ruleCSSRuleId )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:853:3: lv_name_2_0= ruleCSSRuleId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getNameCSSRuleIdParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCSSRuleId_in_ruleCSSRuleDefinition1878);
            lv_name_2_0=ruleCSSRuleId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"CSSRuleId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleCSSRuleDefinition1890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:873:1: ( (lv_r_4_0= ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:874:1: (lv_r_4_0= ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:874:1: (lv_r_4_0= ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:875:3: lv_r_4_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getRCSSRuleOrParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleDefinition1911);
            lv_r_4_0=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"r",
                      		lv_r_4_0, 
                      		"CSSRuleOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleCSSRuleDefinition1923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "ruleCSSRuleDefinition"


    // $ANTLR start "entryRuleCSSRuleOr"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:903:1: entryRuleCSSRuleOr returns [EObject current=null] : iv_ruleCSSRuleOr= ruleCSSRuleOr EOF ;
    public final EObject entryRuleCSSRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleOr = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:904:2: (iv_ruleCSSRuleOr= ruleCSSRuleOr EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:905:2: iv_ruleCSSRuleOr= ruleCSSRuleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleOrRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr1959);
            iv_ruleCSSRuleOr=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleOr1969); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleOr"


    // $ANTLR start "ruleCSSRuleOr"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:912:1: ruleCSSRuleOr returns [EObject current=null] : (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? ) ;
    public final EObject ruleCSSRuleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CSSRuleXor_0 = null;

        EObject lv_ors_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:915:28: ( (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:916:1: (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:916:1: (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:917:5: this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRuleOrAccess().getCSSRuleXorParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr2016);
            this_CSSRuleXor_0=ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRuleXor_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:925:1: ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:925:2: () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:925:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:926:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCSSRuleOrAccess().getCSSRuleOrOrsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:931:2: (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==27) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:931:4: otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) )
                    	    {
                    	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleCSSRuleOr2038); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getCSSRuleOrAccess().getVerticalLineKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:935:1: ( (lv_ors_3_0= ruleCSSRuleXor ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:936:1: (lv_ors_3_0= ruleCSSRuleXor )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:936:1: (lv_ors_3_0= ruleCSSRuleXor )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:937:3: lv_ors_3_0= ruleCSSRuleXor
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCSSRuleOrAccess().getOrsCSSRuleXorParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr2059);
                    	    lv_ors_3_0=ruleCSSRuleXor();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCSSRuleOrRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ors",
                    	              		lv_ors_3_0, 
                    	              		"CSSRuleXor");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


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
    // $ANTLR end "ruleCSSRuleOr"


    // $ANTLR start "entryRuleCSSRuleXor"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:961:1: entryRuleCSSRuleXor returns [EObject current=null] : iv_ruleCSSRuleXor= ruleCSSRuleXor EOF ;
    public final EObject entryRuleCSSRuleXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleXor = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:962:2: (iv_ruleCSSRuleXor= ruleCSSRuleXor EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:963:2: iv_ruleCSSRuleXor= ruleCSSRuleXor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleXorRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor2099);
            iv_ruleCSSRuleXor=ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleXor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleXor2109); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleXor"


    // $ANTLR start "ruleCSSRuleXor"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:970:1: ruleCSSRuleXor returns [EObject current=null] : (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? ) ;
    public final EObject ruleCSSRuleXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CSSRuleConcat_0 = null;

        EObject lv_xors_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:973:28: ( (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:974:1: (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:974:1: (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:975:5: this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRuleXorAccess().getCSSRuleConcatParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor2156);
            this_CSSRuleConcat_0=ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRuleConcat_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:983:1: ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:983:2: () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:983:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:984:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCSSRuleXorAccess().getCSSRuleXorXorsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:989:2: (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==28) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:989:4: otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) )
                    	    {
                    	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleCSSRuleXor2178); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getCSSRuleXorAccess().getVerticalLineVerticalLineKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:993:1: ( (lv_xors_3_0= ruleCSSRuleConcat ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:994:1: (lv_xors_3_0= ruleCSSRuleConcat )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:994:1: (lv_xors_3_0= ruleCSSRuleConcat )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:995:3: lv_xors_3_0= ruleCSSRuleConcat
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCSSRuleXorAccess().getXorsCSSRuleConcatParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor2199);
                    	    lv_xors_3_0=ruleCSSRuleConcat();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCSSRuleXorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"xors",
                    	              		lv_xors_3_0, 
                    	              		"CSSRuleConcat");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


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
    // $ANTLR end "ruleCSSRuleXor"


    // $ANTLR start "entryRuleCSSRuleConcat"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1019:1: entryRuleCSSRuleConcat returns [EObject current=null] : iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF ;
    public final EObject entryRuleCSSRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleConcat = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1020:2: (iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1021:2: iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleConcatRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat2239);
            iv_ruleCSSRuleConcat=ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleConcat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleConcat2249); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleConcat"


    // $ANTLR start "ruleCSSRuleConcat"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1028:1: ruleCSSRuleConcat returns [EObject current=null] : (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () ( (lv_conc_2_0= ruleCSSRulePostfix ) )+ )? ) ;
    public final EObject ruleCSSRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject this_CSSRulePostfix_0 = null;

        EObject lv_conc_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1031:28: ( (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () ( (lv_conc_2_0= ruleCSSRulePostfix ) )+ )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1032:1: (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () ( (lv_conc_2_0= ruleCSSRulePostfix ) )+ )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1032:1: (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () ( (lv_conc_2_0= ruleCSSRulePostfix ) )+ )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1033:5: this_CSSRulePostfix_0= ruleCSSRulePostfix ( () ( (lv_conc_2_0= ruleCSSRulePostfix ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRuleConcatAccess().getCSSRulePostfixParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcat2296);
            this_CSSRulePostfix_0=ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRulePostfix_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1041:1: ( () ( (lv_conc_2_0= ruleCSSRulePostfix ) )+ )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=19 && LA18_0<=21)||LA18_0==24||LA18_0==31||LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1041:2: () ( (lv_conc_2_0= ruleCSSRulePostfix ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1041:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1042:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatConcAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1047:2: ( (lv_conc_2_0= ruleCSSRulePostfix ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID||(LA17_0>=19 && LA17_0<=21)||LA17_0==24||LA17_0==31||LA17_0==33) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1048:1: (lv_conc_2_0= ruleCSSRulePostfix )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1048:1: (lv_conc_2_0= ruleCSSRulePostfix )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1049:3: lv_conc_2_0= ruleCSSRulePostfix
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCSSRuleConcatAccess().getConcCSSRulePostfixParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcat2326);
                    	    lv_conc_2_0=ruleCSSRulePostfix();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCSSRuleConcatRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"conc",
                    	              		lv_conc_2_0, 
                    	              		"CSSRulePostfix");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


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
    // $ANTLR end "ruleCSSRuleConcat"


    // $ANTLR start "entryRuleCSSRulePostfix"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1073:1: entryRuleCSSRulePostfix returns [EObject current=null] : iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF ;
    public final EObject entryRuleCSSRulePostfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRulePostfix = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1074:2: (iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1075:2: iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRulePostfixRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix2365);
            iv_ruleCSSRulePostfix=ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRulePostfix; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePostfix2375); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRulePostfix"


    // $ANTLR start "ruleCSSRulePostfix"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1082:1: ruleCSSRulePostfix returns [EObject current=null] : (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? ) ;
    public final EObject ruleCSSRulePostfix() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;
        EObject this_CSSRulePrimary_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1085:28: ( (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1086:1: (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1086:1: (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1087:5: this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRulePostfixAccess().getCSSRulePrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_ruleCSSRulePostfix2422);
            this_CSSRulePrimary_0=ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRulePrimary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1095:1: ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15||(LA20_0>=29 && LA20_0<=30)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1095:2: () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1095:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1096:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCSSRulePostfixAccess().getCSSRulePostfixRuleAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1101:2: ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1102:1: ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1102:1: ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1103:1: (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1103:1: (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' )
                    int alt19=3;
                    switch ( input.LA(1) ) {
                    case 15:
                        {
                        alt19=1;
                        }
                        break;
                    case 29:
                        {
                        alt19=2;
                        }
                        break;
                    case 30:
                        {
                        alt19=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }

                    switch (alt19) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1104:3: lv_cardinality_2_1= '*'
                            {
                            lv_cardinality_2_1=(Token)match(input,15,FOLLOW_15_in_ruleCSSRulePostfix2451); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_cardinality_2_1, grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSRulePostfixRule());
                              	        }
                                     		setWithLastConsumed(current, "cardinality", lv_cardinality_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1116:8: lv_cardinality_2_2= '+'
                            {
                            lv_cardinality_2_2=(Token)match(input,29,FOLLOW_29_in_ruleCSSRulePostfix2480); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_cardinality_2_2, grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSRulePostfixRule());
                              	        }
                                     		setWithLastConsumed(current, "cardinality", lv_cardinality_2_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1128:8: lv_cardinality_2_3= '?'
                            {
                            lv_cardinality_2_3=(Token)match(input,30,FOLLOW_30_in_ruleCSSRulePostfix2509); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_cardinality_2_3, grammarAccess.getCSSRulePostfixAccess().getCardinalityQuestionMarkKeyword_1_1_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSRulePostfixRule());
                              	        }
                                     		setWithLastConsumed(current, "cardinality", lv_cardinality_2_3, null);
                              	    
                            }

                            }
                            break;

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
    // $ANTLR end "ruleCSSRulePostfix"


    // $ANTLR start "entryRuleCSSRuleBracket"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1151:1: entryRuleCSSRuleBracket returns [EObject current=null] : iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF ;
    public final EObject entryRuleCSSRuleBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleBracket = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1152:2: (iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1153:2: iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleBracketRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket2563);
            iv_ruleCSSRuleBracket=ruleCSSRuleBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleBracket; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleBracket2573); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleBracket"


    // $ANTLR start "ruleCSSRuleBracket"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1160:1: ruleCSSRuleBracket returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' ) ;
    public final EObject ruleCSSRuleBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inner_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1163:28: ( ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1164:1: ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1164:1: ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1164:2: () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1164:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1165:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleBracketAccess().getCSSRuleBracketAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleCSSRuleBracket2619); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCSSRuleBracketAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1174:1: ( (lv_inner_2_0= ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1175:1: (lv_inner_2_0= ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1175:1: (lv_inner_2_0= ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1176:3: lv_inner_2_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleBracketAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleBracket2640);
            lv_inner_2_0=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSSRuleBracketRule());
              	        }
                     		set(
                     			current, 
                     			"inner",
                      		lv_inner_2_0, 
                      		"CSSRuleOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleCSSRuleBracket2652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCSSRuleBracketAccess().getRightSquareBracketKeyword_3());
                  
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
    // $ANTLR end "ruleCSSRuleBracket"


    // $ANTLR start "entryRuleCSSRulePrimary"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1204:1: entryRuleCSSRulePrimary returns [EObject current=null] : iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF ;
    public final EObject entryRuleCSSRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRulePrimary = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1205:2: (iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1206:2: iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRulePrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary2688);
            iv_ruleCSSRulePrimary=ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRulePrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePrimary2698); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRulePrimary"


    // $ANTLR start "ruleCSSRulePrimary"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1213:1: ruleCSSRulePrimary returns [EObject current=null] : (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSBaseType_3= ruleCSSBaseType ) ;
    public final EObject ruleCSSRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_CSSRuleRef_0 = null;

        EObject this_CSSRuleBracket_1 = null;

        EObject this_CSSRuleLiteral_2 = null;

        EObject this_CSSBaseType_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1216:28: ( (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSBaseType_3= ruleCSSBaseType ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1217:1: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSBaseType_3= ruleCSSBaseType )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1217:1: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSBaseType_3= ruleCSSBaseType )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt21=1;
                }
                break;
            case 31:
                {
                alt21=2;
                }
                break;
            case RULE_ID:
            case 33:
                {
                alt21=3;
                }
                break;
            case 19:
            case 20:
            case 21:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1218:5: this_CSSRuleRef_0= ruleCSSRuleRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleRef_in_ruleCSSRulePrimary2745);
                    this_CSSRuleRef_0=ruleCSSRuleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleRef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1228:5: this_CSSRuleBracket_1= ruleCSSRuleBracket
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleBracketParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleBracket_in_ruleCSSRulePrimary2772);
                    this_CSSRuleBracket_1=ruleCSSRuleBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleBracket_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1238:5: this_CSSRuleLiteral_2= ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleLiteral_in_ruleCSSRulePrimary2799);
                    this_CSSRuleLiteral_2=ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1248:5: this_CSSBaseType_3= ruleCSSBaseType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSBaseType_in_ruleCSSRulePrimary2826);
                    this_CSSBaseType_3=ruleCSSBaseType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSBaseType_3; 
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
    // $ANTLR end "ruleCSSRulePrimary"


    // $ANTLR start "entryRuleCSSRuleLiteral"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1264:1: entryRuleCSSRuleLiteral returns [EObject current=null] : iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF ;
    public final EObject entryRuleCSSRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1265:2: (iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1266:2: iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral2861);
            iv_ruleCSSRuleLiteral=ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleLiteral2871); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleLiteral"


    // $ANTLR start "ruleCSSRuleLiteral"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1273:1: ruleCSSRuleLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( (lv_value_2_0= ',' ) ) ) ;
    public final EObject ruleCSSRuleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1276:28: ( ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( (lv_value_2_0= ',' ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1277:1: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( (lv_value_2_0= ',' ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1277:1: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( (lv_value_2_0= ',' ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==33) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1277:2: ( () ( (lv_value_1_0= RULE_ID ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1277:2: ( () ( (lv_value_1_0= RULE_ID ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1277:3: () ( (lv_value_1_0= RULE_ID ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1277:3: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1278:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1283:2: ( (lv_value_1_0= RULE_ID ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1284:1: (lv_value_1_0= RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1284:1: (lv_value_1_0= RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1285:3: lv_value_1_0= RULE_ID
                    {
                    lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCSSRuleLiteral2923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_1_0, grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSRuleLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1302:6: ( (lv_value_2_0= ',' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1302:6: ( (lv_value_2_0= ',' ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1303:1: (lv_value_2_0= ',' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1303:1: (lv_value_2_0= ',' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1304:3: lv_value_2_0= ','
                    {
                    lv_value_2_0=(Token)match(input,33,FOLLOW_33_in_ruleCSSRuleLiteral2953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_2_0, grammarAccess.getCSSRuleLiteralAccess().getValueCommaKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSRuleLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_2_0, ",");
                      	    
                    }

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
    // $ANTLR end "ruleCSSRuleLiteral"


    // $ANTLR start "entryRuleCSSDefaultValue"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1325:1: entryRuleCSSDefaultValue returns [EObject current=null] : iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF ;
    public final EObject entryRuleCSSDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSDefaultValue = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1326:2: (iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1327:2: iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue3002);
            iv_ruleCSSDefaultValue=ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSDefaultValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSDefaultValue3012); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSDefaultValue"


    // $ANTLR start "ruleCSSDefaultValue"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1334:1: ruleCSSDefaultValue returns [EObject current=null] : (this_CSSRuleLiteral_0= ruleCSSRuleLiteral | this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )* otherlv_3= '.' (this_INT_4= RULE_INT )+ ) | this_STRING_5= RULE_STRING ) ;
    public final EObject ruleCSSDefaultValue() throws RecognitionException {
        EObject current = null;

        Token this_INT_1=null;
        Token this_INT_2=null;
        Token otherlv_3=null;
        Token this_INT_4=null;
        Token this_STRING_5=null;
        EObject this_CSSRuleLiteral_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1337:28: ( (this_CSSRuleLiteral_0= ruleCSSRuleLiteral | this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )* otherlv_3= '.' (this_INT_4= RULE_INT )+ ) | this_STRING_5= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1338:1: (this_CSSRuleLiteral_0= ruleCSSRuleLiteral | this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )* otherlv_3= '.' (this_INT_4= RULE_INT )+ ) | this_STRING_5= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1338:1: (this_CSSRuleLiteral_0= ruleCSSRuleLiteral | this_INT_1= RULE_INT | ( (this_INT_2= RULE_INT )* otherlv_3= '.' (this_INT_4= RULE_INT )+ ) | this_STRING_5= RULE_STRING )
            int alt25=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 33:
                {
                alt25=1;
                }
                break;
            case RULE_INT:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==EOF||LA25_2==23) ) {
                    alt25=2;
                }
                else if ( (LA25_2==RULE_INT||LA25_2==14) ) {
                    alt25=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                alt25=3;
                }
                break;
            case RULE_STRING:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1339:5: this_CSSRuleLiteral_0= ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSDefaultValueAccess().getCSSRuleLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleLiteral_in_ruleCSSDefaultValue3059);
                    this_CSSRuleLiteral_0=ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1348:6: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCSSDefaultValue3075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getCSSDefaultValueAccess().getINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1353:6: ( (this_INT_2= RULE_INT )* otherlv_3= '.' (this_INT_4= RULE_INT )+ )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1353:6: ( (this_INT_2= RULE_INT )* otherlv_3= '.' (this_INT_4= RULE_INT )+ )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1353:7: (this_INT_2= RULE_INT )* otherlv_3= '.' (this_INT_4= RULE_INT )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1353:7: (this_INT_2= RULE_INT )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_INT) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1353:8: this_INT_2= RULE_INT
                    	    {
                    	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCSSDefaultValue3093); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_INT_2, grammarAccess.getCSSDefaultValueAccess().getINTTerminalRuleCall_2_0()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleCSSDefaultValue3106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCSSDefaultValueAccess().getFullStopKeyword_2_1());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1361:1: (this_INT_4= RULE_INT )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_INT) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1361:2: this_INT_4= RULE_INT
                    	    {
                    	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCSSDefaultValue3118); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_INT_4, grammarAccess.getCSSDefaultValueAccess().getINTTerminalRuleCall_2_2()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1366:6: this_STRING_5= RULE_STRING
                    {
                    this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCSSDefaultValue3137); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_5, grammarAccess.getCSSDefaultValueAccess().getSTRINGTerminalRuleCall_3()); 
                          
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
    // $ANTLR end "ruleCSSDefaultValue"

    // $ANTLR start synpred1_InternalCssExtDsl
    public final void synpred1_InternalCssExtDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:3: ( '.' )
        // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:220:2: '.'
        {
        match(input,14,FOLLOW_14_in_synpred1_InternalCssExtDsl467); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalCssExtDsl

    // Delegated rules

    public final boolean synpred1_InternalCssExtDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCssExtDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\11\uffff";
    static final String DFA5_eofS =
        "\11\uffff";
    static final String DFA5_minS =
        "\1\4\1\uffff\1\4\1\16\1\uffff\1\4\2\uffff\1\16";
    static final String DFA5_maxS =
        "\1\22\1\uffff\1\4\1\32\1\uffff\1\4\2\uffff\1\32";
    static final String DFA5_acceptS =
        "\1\uffff\1\4\2\uffff\1\2\1\uffff\1\3\1\1\1\uffff";
    static final String DFA5_specialS =
        "\11\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\3\1\2\12\uffff\1\4\1\uffff\1\1",
            "",
            "\1\3",
            "\1\5\2\uffff\1\6\10\uffff\1\7",
            "",
            "\1\10",
            "",
            "",
            "\1\5\2\uffff\1\6\10\uffff\1\7"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()* loopback of 329:1: ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDeclartion ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleCssExtension_in_entryRuleCssExtension75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCssExtension85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleCssExtension131 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_ruleCssExtension153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName448 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName499 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard605 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildCard624 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildCard637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_entryRulePackageDefinition679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDefinition689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePackageDefinition726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDefinition747 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePackageDefinition759 = new BitSet(new long[]{0x0000000000050030L});
    public static final BitSet FOLLOW_ruleCSSRuleDefinition_in_rulePackageDefinition781 = new BitSet(new long[]{0x0000000000050030L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_rulePackageDefinition808 = new BitSet(new long[]{0x0000000000050030L});
    public static final BitSet FOLLOW_ruleElementDeclartion_in_rulePackageDefinition835 = new BitSet(new long[]{0x0000000000050030L});
    public static final BitSet FOLLOW_18_in_rulePackageDefinition849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_entryRuleDoku885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoku895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JDOC_in_ruleDoku936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSBaseType_in_entryRuleCSSBaseType976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSBaseType986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCSSBaseType1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCSSBaseType1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCSSBaseType1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDeclartion_in_entryRuleElementDeclartion1095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDeclartion1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleElementDeclartion1151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleElementDeclartion1173 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleElementDeclartion1185 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleElementDeclartion1207 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_rulePseudoClassDefinition_in_ruleElementDeclartion1234 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_18_in_ruleElementDeclartion1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rulePropertyDefinition1340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyDefinition1358 = new BitSet(new long[]{0x0000000281380010L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rulePropertyDefinition1384 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_rulePropertyDefinition1397 = new BitSet(new long[]{0x0000000200004190L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_rulePropertyDefinition1418 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePropertyDefinition1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassDefinition_in_entryRulePseudoClassDefinition1468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassDefinition1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rulePseudoClassDefinition1524 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_PSEUDO_in_rulePseudoClassDefinition1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleId_in_entryRuleCSSRuleId1583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleId1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCSSRuleId1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef1673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleRef1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCSSRuleRef1720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCSSRuleRef1743 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCSSRuleRef1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleDefinition_in_entryRuleCSSRuleDefinition1791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleDefinition1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleCSSRuleDefinition1856 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleCSSRuleId_in_ruleCSSRuleDefinition1878 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCSSRuleDefinition1890 = new BitSet(new long[]{0x0000000281380010L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleDefinition1911 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCSSRuleDefinition1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr1959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleOr1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr2016 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleCSSRuleOr2038 = new BitSet(new long[]{0x0000000281380010L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr2059 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor2099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleXor2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor2156 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleCSSRuleXor2178 = new BitSet(new long[]{0x0000000281380010L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor2199 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat2239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleConcat2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcat2296 = new BitSet(new long[]{0x0000000281380012L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcat2326 = new BitSet(new long[]{0x0000000281380012L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix2365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePostfix2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_ruleCSSRulePostfix2422 = new BitSet(new long[]{0x0000000060008002L});
    public static final BitSet FOLLOW_15_in_ruleCSSRulePostfix2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCSSRulePostfix2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCSSRulePostfix2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket2563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleBracket2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCSSRuleBracket2619 = new BitSet(new long[]{0x0000000281380010L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleBracket2640 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCSSRuleBracket2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary2688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePrimary2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_ruleCSSRulePrimary2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_ruleCSSRulePrimary2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_ruleCSSRulePrimary2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSBaseType_in_ruleCSSRulePrimary2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral2861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleLiteral2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCSSRuleLiteral2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCSSRuleLiteral2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue3002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSDefaultValue3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_ruleCSSDefaultValue3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCSSDefaultValue3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCSSDefaultValue3093 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_14_in_ruleCSSDefaultValue3106 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCSSDefaultValue3118 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCSSDefaultValue3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred1_InternalCssExtDsl467 = new BitSet(new long[]{0x0000000000000002L});

}