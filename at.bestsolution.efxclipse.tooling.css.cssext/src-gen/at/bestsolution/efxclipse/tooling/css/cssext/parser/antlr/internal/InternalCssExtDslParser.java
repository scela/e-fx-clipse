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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_JDOC", "RULE_WS", "RULE_INT", "RULE_DOUBLE", "RULE_PSEUDO", "RULE_REGEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'import'", "'.'", "'*'", "'package'", "'{'", "'}'", "'int'", "'('", "'->'", "')'", "'double'", "'extends'", "','", "'default:'", "';'", "'<'", "'>'", "'='", "'|'", "'||'", "'+'", "'?'", "'['", "']'"
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
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_DOUBLE=8;
    public static final int RULE_REGEX=10;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=11;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_INT=7;
    public static final int RULE_WS=6;
    public static final int RULE_JDOC=5;
    public static final int RULE_PSEUDO=9;

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

                if ( (LA1_0==15) ) {
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

            if ( (LA2_0==18) ) {
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
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport237); if (state.failed) return current;
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

                if ( (LA3_0==16) ) {
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
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName476); if (state.failed) return current;
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

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:271:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildCard624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedNameWithWildCard637); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:299:1: rulePackageDefinition returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDefinition ) ) )* otherlv_6= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:302:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDefinition ) ) )* otherlv_6= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:303:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDefinition ) ) )* otherlv_6= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:303:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDefinition ) ) )* otherlv_6= '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:303:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDefinition ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulePackageDefinition726); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_rulePackageDefinition759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:329:1: ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDefinition ) ) )*
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
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:367:6: ( (lv_elements_5_0= ruleElementDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:367:6: ( (lv_elements_5_0= ruleElementDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:368:1: (lv_elements_5_0= ruleElementDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:368:1: (lv_elements_5_0= ruleElementDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:369:3: lv_elements_5_0= ruleElementDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDefinitionAccess().getElementsElementDefinitionParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElementDefinition_in_rulePackageDefinition835);
            	    lv_elements_5_0=ruleElementDefinition();

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
            	              		"ElementDefinition");
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

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_rulePackageDefinition849); if (state.failed) return current;
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


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:440:2: (iv_ruleCSSBaseType= ruleCSSBaseType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:441:2: iv_ruleCSSBaseType= ruleCSSBaseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSBaseTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCSSBaseType_in_entryRuleCSSBaseType982);
            iv_ruleCSSBaseType=ruleCSSBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSBaseType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSBaseType992); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSBaseType"


    // $ANTLR start "ruleCSSBaseType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:451:1: ruleCSSBaseType returns [EObject current=null] : this_CSSType_0= ruleCSSType ;
    public final EObject ruleCSSBaseType() throws RecognitionException {
        EObject current = null;

        EObject this_CSSType_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:455:28: (this_CSSType_0= ruleCSSType )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:457:5: this_CSSType_0= ruleCSSType
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSBaseTypeAccess().getCSSTypeParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSType_in_ruleCSSBaseType1042);
            this_CSSType_0=ruleCSSType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSType_0; 
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSBaseType"


    // $ANTLR start "entryRuleCSSType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:476:1: entryRuleCSSType returns [EObject current=null] : iv_ruleCSSType= ruleCSSType EOF ;
    public final EObject entryRuleCSSType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:480:2: (iv_ruleCSSType= ruleCSSType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:481:2: iv_ruleCSSType= ruleCSSType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCSSType_in_entryRuleCSSType1086);
            iv_ruleCSSType=ruleCSSType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSType1096); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSType"


    // $ANTLR start "ruleCSSType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:491:1: ruleCSSType returns [EObject current=null] : ( ( () ( (lv_type_1_0= 'int' ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_from_4_0= RULE_INT ) ) (this_WS_5= RULE_WS )* otherlv_6= '->' (this_WS_7= RULE_WS )* ( (lv_to_8_0= RULE_INT ) ) (this_WS_9= RULE_WS )* otherlv_10= ')' ) | ( () ( (lv_type_12_0= 'double' ) ) otherlv_13= '(' (this_WS_14= RULE_WS )* ( (lv_from_15_0= RULE_DOUBLE ) ) (this_WS_16= RULE_WS )* otherlv_17= '->' (this_WS_18= RULE_WS )* ( (lv_to_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= ')' ) | ( (lv_type_22_0= 'int' ) ) | ( (lv_type_23_0= 'double' ) ) ) ;
    public final EObject ruleCSSType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token this_WS_3=null;
        Token lv_from_4_0=null;
        Token this_WS_5=null;
        Token otherlv_6=null;
        Token this_WS_7=null;
        Token lv_to_8_0=null;
        Token this_WS_9=null;
        Token otherlv_10=null;
        Token lv_type_12_0=null;
        Token otherlv_13=null;
        Token this_WS_14=null;
        Token lv_from_15_0=null;
        Token this_WS_16=null;
        Token otherlv_17=null;
        Token this_WS_18=null;
        Token lv_to_19_0=null;
        Token this_WS_20=null;
        Token otherlv_21=null;
        Token lv_type_22_0=null;
        Token lv_type_23_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:495:28: ( ( ( () ( (lv_type_1_0= 'int' ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_from_4_0= RULE_INT ) ) (this_WS_5= RULE_WS )* otherlv_6= '->' (this_WS_7= RULE_WS )* ( (lv_to_8_0= RULE_INT ) ) (this_WS_9= RULE_WS )* otherlv_10= ')' ) | ( () ( (lv_type_12_0= 'double' ) ) otherlv_13= '(' (this_WS_14= RULE_WS )* ( (lv_from_15_0= RULE_DOUBLE ) ) (this_WS_16= RULE_WS )* otherlv_17= '->' (this_WS_18= RULE_WS )* ( (lv_to_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= ')' ) | ( (lv_type_22_0= 'int' ) ) | ( (lv_type_23_0= 'double' ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:496:1: ( ( () ( (lv_type_1_0= 'int' ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_from_4_0= RULE_INT ) ) (this_WS_5= RULE_WS )* otherlv_6= '->' (this_WS_7= RULE_WS )* ( (lv_to_8_0= RULE_INT ) ) (this_WS_9= RULE_WS )* otherlv_10= ')' ) | ( () ( (lv_type_12_0= 'double' ) ) otherlv_13= '(' (this_WS_14= RULE_WS )* ( (lv_from_15_0= RULE_DOUBLE ) ) (this_WS_16= RULE_WS )* otherlv_17= '->' (this_WS_18= RULE_WS )* ( (lv_to_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= ')' ) | ( (lv_type_22_0= 'int' ) ) | ( (lv_type_23_0= 'double' ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:496:1: ( ( () ( (lv_type_1_0= 'int' ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_from_4_0= RULE_INT ) ) (this_WS_5= RULE_WS )* otherlv_6= '->' (this_WS_7= RULE_WS )* ( (lv_to_8_0= RULE_INT ) ) (this_WS_9= RULE_WS )* otherlv_10= ')' ) | ( () ( (lv_type_12_0= 'double' ) ) otherlv_13= '(' (this_WS_14= RULE_WS )* ( (lv_from_15_0= RULE_DOUBLE ) ) (this_WS_16= RULE_WS )* otherlv_17= '->' (this_WS_18= RULE_WS )* ( (lv_to_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= ')' ) | ( (lv_type_22_0= 'int' ) ) | ( (lv_type_23_0= 'double' ) ) )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EOF||LA14_1==RULE_ID||LA14_1==RULE_INT||LA14_1==RULE_REGEX||LA14_1==17||LA14_1==21||(LA14_1>=24 && LA14_1<=25)||(LA14_1>=27 && LA14_1<=30)||(LA14_1>=33 && LA14_1<=38)) ) {
                    alt14=3;
                }
                else if ( (LA14_1==22) ) {
                    alt14=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==25) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==EOF||LA14_2==RULE_ID||LA14_2==RULE_INT||LA14_2==RULE_REGEX||LA14_2==17||LA14_2==21||(LA14_2>=24 && LA14_2<=25)||(LA14_2>=27 && LA14_2<=30)||(LA14_2>=33 && LA14_2<=38)) ) {
                    alt14=4;
                }
                else if ( (LA14_2==22) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:496:2: ( () ( (lv_type_1_0= 'int' ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_from_4_0= RULE_INT ) ) (this_WS_5= RULE_WS )* otherlv_6= '->' (this_WS_7= RULE_WS )* ( (lv_to_8_0= RULE_INT ) ) (this_WS_9= RULE_WS )* otherlv_10= ')' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:496:2: ( () ( (lv_type_1_0= 'int' ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_from_4_0= RULE_INT ) ) (this_WS_5= RULE_WS )* otherlv_6= '->' (this_WS_7= RULE_WS )* ( (lv_to_8_0= RULE_INT ) ) (this_WS_9= RULE_WS )* otherlv_10= ')' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:496:3: () ( (lv_type_1_0= 'int' ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_from_4_0= RULE_INT ) ) (this_WS_5= RULE_WS )* otherlv_6= '->' (this_WS_7= RULE_WS )* ( (lv_to_8_0= RULE_INT ) ) (this_WS_9= RULE_WS )* otherlv_10= ')'
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:496:3: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:497:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCSSTypeAccess().getCSSRangedIntTypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:502:2: ( (lv_type_1_0= 'int' ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:503:1: (lv_type_1_0= 'int' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:503:1: (lv_type_1_0= 'int' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:504:3: lv_type_1_0= 'int'
                    {
                    lv_type_1_0=(Token)match(input,21,FOLLOW_21_in_ruleCSSType1153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_1_0, grammarAccess.getCSSTypeAccess().getTypeIntKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_1_0, "int");
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleCSSType1178); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:521:1: (this_WS_3= RULE_WS )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_WS) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:521:2: this_WS_3= RULE_WS
                    	    {
                    	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1190); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_3, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_3()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:525:3: ( (lv_from_4_0= RULE_INT ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:526:1: (lv_from_4_0= RULE_INT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:526:1: (lv_from_4_0= RULE_INT )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:527:3: lv_from_4_0= RULE_INT
                    {
                    lv_from_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCSSType1208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_from_4_0, grammarAccess.getCSSTypeAccess().getFromINTTerminalRuleCall_0_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"from",
                              		lv_from_4_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:543:2: (this_WS_5= RULE_WS )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_WS) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:543:3: this_WS_5= RULE_WS
                    	    {
                    	    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1225); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_5, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_5()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleCSSType1238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_0_6());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:551:1: (this_WS_7= RULE_WS )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_WS) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:551:2: this_WS_7= RULE_WS
                    	    {
                    	    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1250); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_7, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_7()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:555:3: ( (lv_to_8_0= RULE_INT ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:556:1: (lv_to_8_0= RULE_INT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:556:1: (lv_to_8_0= RULE_INT )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:557:3: lv_to_8_0= RULE_INT
                    {
                    lv_to_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCSSType1268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_to_8_0, grammarAccess.getCSSTypeAccess().getToINTTerminalRuleCall_0_8_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"to",
                              		lv_to_8_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:573:2: (this_WS_9= RULE_WS )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_WS) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:573:3: this_WS_9= RULE_WS
                    	    {
                    	    this_WS_9=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1285); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_9, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_9()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleCSSType1298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_0_10());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:582:6: ( () ( (lv_type_12_0= 'double' ) ) otherlv_13= '(' (this_WS_14= RULE_WS )* ( (lv_from_15_0= RULE_DOUBLE ) ) (this_WS_16= RULE_WS )* otherlv_17= '->' (this_WS_18= RULE_WS )* ( (lv_to_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= ')' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:582:6: ( () ( (lv_type_12_0= 'double' ) ) otherlv_13= '(' (this_WS_14= RULE_WS )* ( (lv_from_15_0= RULE_DOUBLE ) ) (this_WS_16= RULE_WS )* otherlv_17= '->' (this_WS_18= RULE_WS )* ( (lv_to_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= ')' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:582:7: () ( (lv_type_12_0= 'double' ) ) otherlv_13= '(' (this_WS_14= RULE_WS )* ( (lv_from_15_0= RULE_DOUBLE ) ) (this_WS_16= RULE_WS )* otherlv_17= '->' (this_WS_18= RULE_WS )* ( (lv_to_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= ')'
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:582:7: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:583:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCSSTypeAccess().getCSSRangedDoubleTypeAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:588:2: ( (lv_type_12_0= 'double' ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:589:1: (lv_type_12_0= 'double' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:589:1: (lv_type_12_0= 'double' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:590:3: lv_type_12_0= 'double'
                    {
                    lv_type_12_0=(Token)match(input,25,FOLLOW_25_in_ruleCSSType1333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_12_0, grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_12_0, "double");
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleCSSType1358); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_1_2());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:607:1: (this_WS_14= RULE_WS )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_WS) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:607:2: this_WS_14= RULE_WS
                    	    {
                    	    this_WS_14=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1370); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_14, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_3()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:611:3: ( (lv_from_15_0= RULE_DOUBLE ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:612:1: (lv_from_15_0= RULE_DOUBLE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:612:1: (lv_from_15_0= RULE_DOUBLE )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:613:3: lv_from_15_0= RULE_DOUBLE
                    {
                    lv_from_15_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleCSSType1388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_from_15_0, grammarAccess.getCSSTypeAccess().getFromDOUBLETerminalRuleCall_1_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"from",
                              		lv_from_15_0, 
                              		"DOUBLE");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:629:2: (this_WS_16= RULE_WS )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_WS) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:629:3: this_WS_16= RULE_WS
                    	    {
                    	    this_WS_16=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1405); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_16, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_5()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,23,FOLLOW_23_in_ruleCSSType1418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_6());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:637:1: (this_WS_18= RULE_WS )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_WS) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:637:2: this_WS_18= RULE_WS
                    	    {
                    	    this_WS_18=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1430); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_18, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_7()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:641:3: ( (lv_to_19_0= RULE_DOUBLE ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:642:1: (lv_to_19_0= RULE_DOUBLE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:642:1: (lv_to_19_0= RULE_DOUBLE )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:643:3: lv_to_19_0= RULE_DOUBLE
                    {
                    lv_to_19_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleCSSType1448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_to_19_0, grammarAccess.getCSSTypeAccess().getToDOUBLETerminalRuleCall_1_8_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"to",
                              		lv_to_19_0, 
                              		"DOUBLE");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:659:2: (this_WS_20= RULE_WS )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_WS) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:659:3: this_WS_20= RULE_WS
                    	    {
                    	    this_WS_20=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1465); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_20, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_9()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,24,FOLLOW_24_in_ruleCSSType1478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_1_10());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:668:6: ( (lv_type_22_0= 'int' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:668:6: ( (lv_type_22_0= 'int' ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:669:1: (lv_type_22_0= 'int' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:669:1: (lv_type_22_0= 'int' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:670:3: lv_type_22_0= 'int'
                    {
                    lv_type_22_0=(Token)match(input,21,FOLLOW_21_in_ruleCSSType1503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_22_0, grammarAccess.getCSSTypeAccess().getTypeIntKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_22_0, "int");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:684:6: ( (lv_type_23_0= 'double' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:684:6: ( (lv_type_23_0= 'double' ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:685:1: (lv_type_23_0= 'double' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:685:1: (lv_type_23_0= 'double' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:686:3: lv_type_23_0= 'double'
                    {
                    lv_type_23_0=(Token)match(input,25,FOLLOW_25_in_ruleCSSType1540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_23_0, grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_23_0, "double");
                      	    
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSType"


    // $ANTLR start "entryRuleElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:710:1: entryRuleElementDefinition returns [EObject current=null] : iv_ruleElementDefinition= ruleElementDefinition EOF ;
    public final EObject entryRuleElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:711:2: (iv_ruleElementDefinition= ruleElementDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:712:2: iv_ruleElementDefinition= ruleElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_entryRuleElementDefinition1593);
            iv_ruleElementDefinition=ruleElementDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDefinition1603); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementDefinition"


    // $ANTLR start "ruleElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:719:1: ruleElementDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( ( (lv_properties_8_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_9_0= rulePseudoClassDefinition ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleElementDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_doku_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_pseudoClasses_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:722:28: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( ( (lv_properties_8_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_9_0= rulePseudoClassDefinition ) ) )* otherlv_10= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:723:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( ( (lv_properties_8_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_9_0= rulePseudoClassDefinition ) ) )* otherlv_10= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:723:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( ( (lv_properties_8_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_9_0= rulePseudoClassDefinition ) ) )* otherlv_10= '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:723:2: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( ( (lv_properties_8_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_9_0= rulePseudoClassDefinition ) ) )* otherlv_10= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:723:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:724:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementDefinitionAccess().getElementDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:729:2: ( (lv_doku_1_0= ruleDoku ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_JDOC) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:730:1: (lv_doku_1_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:730:1: (lv_doku_1_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:731:3: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleElementDefinition1658);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
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

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:747:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:748:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:748:1: (lv_name_2_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:749:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleElementDefinition1680);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:765:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:765:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleElementDefinition1693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getElementDefinitionAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:769:1: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:770:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:770:1: ( ruleQualifiedName )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:771:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getElementDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleElementDefinition1716);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:784:2: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==27) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:784:4: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleElementDefinition1729); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getElementDefinitionAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:788:1: ( ( ruleQualifiedName ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:789:1: ( ruleQualifiedName )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:789:1: ( ruleQualifiedName )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:790:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getElementDefinitionRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleElementDefinition1752);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleElementDefinition1768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getElementDefinitionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:807:1: ( ( (lv_properties_8_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_9_0= rulePseudoClassDefinition ) ) )*
            loop18:
            do {
                int alt18=3;
                switch ( input.LA(1) ) {
                case RULE_JDOC:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==RULE_ID) ) {
                        alt18=1;
                    }
                    else if ( (LA18_2==RULE_PSEUDO) ) {
                        alt18=2;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    alt18=1;
                    }
                    break;
                case RULE_PSEUDO:
                    {
                    alt18=2;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:807:2: ( (lv_properties_8_0= rulePropertyDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:807:2: ( (lv_properties_8_0= rulePropertyDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:808:1: (lv_properties_8_0= rulePropertyDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:808:1: (lv_properties_8_0= rulePropertyDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:809:3: lv_properties_8_0= rulePropertyDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getPropertiesPropertyDefinitionParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleElementDefinition1790);
            	    lv_properties_8_0=rulePropertyDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_8_0, 
            	              		"PropertyDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:826:6: ( (lv_pseudoClasses_9_0= rulePseudoClassDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:826:6: ( (lv_pseudoClasses_9_0= rulePseudoClassDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:827:1: (lv_pseudoClasses_9_0= rulePseudoClassDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:827:1: (lv_pseudoClasses_9_0= rulePseudoClassDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:828:3: lv_pseudoClasses_9_0= rulePseudoClassDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePseudoClassDefinition_in_ruleElementDefinition1817);
            	    lv_pseudoClasses_9_0=rulePseudoClassDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pseudoClasses",
            	              		lv_pseudoClasses_9_0, 
            	              		"PseudoClassDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleElementDefinition1831); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getElementDefinitionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleElementDefinition"


    // $ANTLR start "entryRulePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:856:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:857:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:858:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1867);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition1877); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:865:1: rulePropertyDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_doku_1_0 = null;

        EObject lv_rule_3_0 = null;

        EObject lv_default_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:868:28: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:869:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:869:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:869:2: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:869:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:870:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:875:2: ( (lv_doku_1_0= ruleDoku ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_JDOC) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:876:1: (lv_doku_1_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:876:1: (lv_doku_1_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:877:3: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_rulePropertyDefinition1932);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
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

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:893:3: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:894:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:894:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:895:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyDefinition1950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:911:2: ( (lv_rule_3_0= ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:912:1: (lv_rule_3_0= ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:912:1: (lv_rule_3_0= ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:913:3: lv_rule_3_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rulePropertyDefinition1976);
            lv_rule_3_0=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"rule",
                      		lv_rule_3_0, 
                      		"CSSRuleOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:929:2: (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:929:4: otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_rulePropertyDefinition1989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_4_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:933:1: ( (lv_default_5_0= ruleCSSDefaultValue ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:934:1: (lv_default_5_0= ruleCSSDefaultValue )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:934:1: (lv_default_5_0= ruleCSSDefaultValue )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:935:3: lv_default_5_0= ruleCSSDefaultValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCSSDefaultValue_in_rulePropertyDefinition2010);
                    lv_default_5_0=ruleCSSDefaultValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_5_0, 
                              		"CSSDefaultValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_rulePropertyDefinition2024); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5());
                  
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:963:1: entryRulePseudoClassDefinition returns [EObject current=null] : iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF ;
    public final EObject entryRulePseudoClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:964:2: (iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:965:2: iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassDefinition_in_entryRulePseudoClassDefinition2060);
            iv_rulePseudoClassDefinition=rulePseudoClassDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassDefinition2070); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:972:1: rulePseudoClassDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) ) ;
    public final EObject rulePseudoClassDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_doku_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:975:28: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:976:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:976:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:976:2: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:976:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:977:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPseudoClassDefinitionAccess().getPseudoClassDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:982:2: ( (lv_doku_1_0= ruleDoku ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_JDOC) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:983:1: (lv_doku_1_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:983:1: (lv_doku_1_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:984:3: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_rulePseudoClassDefinition2125);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPseudoClassDefinitionRule());
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

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1000:3: ( (lv_name_2_0= RULE_PSEUDO ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1001:1: (lv_name_2_0= RULE_PSEUDO )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1001:1: (lv_name_2_0= RULE_PSEUDO )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1002:3: lv_name_2_0= RULE_PSEUDO
            {
            lv_name_2_0=(Token)match(input,RULE_PSEUDO,FOLLOW_RULE_PSEUDO_in_rulePseudoClassDefinition2143); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPseudoClassDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1026:1: entryRuleCSSRuleId returns [EObject current=null] : iv_ruleCSSRuleId= ruleCSSRuleId EOF ;
    public final EObject entryRuleCSSRuleId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleId = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1027:2: (iv_ruleCSSRuleId= ruleCSSRuleId EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1028:2: iv_ruleCSSRuleId= ruleCSSRuleId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleIdRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleId_in_entryRuleCSSRuleId2184);
            iv_ruleCSSRuleId=ruleCSSRuleId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleId; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleId2194); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1035:1: ruleCSSRuleId returns [EObject current=null] : ( (lv_name_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleCSSRuleId() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1038:28: ( ( (lv_name_0_0= ruleQualifiedName ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1039:1: ( (lv_name_0_0= ruleQualifiedName ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1039:1: ( (lv_name_0_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1040:1: (lv_name_0_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1040:1: (lv_name_0_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1041:3: lv_name_0_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleIdAccess().getNameQualifiedNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCSSRuleId2239);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1065:1: entryRuleCSSRuleRef returns [EObject current=null] : iv_ruleCSSRuleRef= ruleCSSRuleRef EOF ;
    public final EObject entryRuleCSSRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleRef = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1069:2: (iv_ruleCSSRuleRef= ruleCSSRuleRef EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1070:2: iv_ruleCSSRuleRef= ruleCSSRuleRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleRefRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef2280);
            iv_ruleCSSRuleRef=ruleCSSRuleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleRef2290); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleRef"


    // $ANTLR start "ruleCSSRuleRef"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1080:1: ruleCSSRuleRef returns [EObject current=null] : (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' ) ;
    public final EObject ruleCSSRuleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1084:28: ( (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1085:1: (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1085:1: (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1085:3: otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleCSSRuleRef2331); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1089:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1090:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1090:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1091:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCSSRuleRefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCSSRuleRef2354);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleCSSRuleRef2366); if (state.failed) return current;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleRef"


    // $ANTLR start "entryRuleCSSRuleDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1119:1: entryRuleCSSRuleDefinition returns [EObject current=null] : iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF ;
    public final EObject entryRuleCSSRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleDefinition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1123:2: (iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1124:2: iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleDefinition_in_entryRuleCSSRuleDefinition2412);
            iv_ruleCSSRuleDefinition=ruleCSSRuleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleDefinition2422); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleDefinition"


    // $ANTLR start "ruleCSSRuleDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1134:1: ruleCSSRuleDefinition returns [EObject current=null] : ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= ruleCSSRuleId ) ) otherlv_2= '=' ( ( (lv_rule_3_0= ruleCSSRuleOr ) ) | ( (lv_func_4_0= ruleCSSRuleFunc ) ) ) otherlv_5= ';' ) ;
    public final EObject ruleCSSRuleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_doku_0_0 = null;

        EObject lv_name_1_0 = null;

        EObject lv_rule_3_0 = null;

        EObject lv_func_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1138:28: ( ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= ruleCSSRuleId ) ) otherlv_2= '=' ( ( (lv_rule_3_0= ruleCSSRuleOr ) ) | ( (lv_func_4_0= ruleCSSRuleFunc ) ) ) otherlv_5= ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1139:1: ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= ruleCSSRuleId ) ) otherlv_2= '=' ( ( (lv_rule_3_0= ruleCSSRuleOr ) ) | ( (lv_func_4_0= ruleCSSRuleFunc ) ) ) otherlv_5= ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1139:1: ( ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= ruleCSSRuleId ) ) otherlv_2= '=' ( ( (lv_rule_3_0= ruleCSSRuleOr ) ) | ( (lv_func_4_0= ruleCSSRuleFunc ) ) ) otherlv_5= ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1139:2: ( (lv_doku_0_0= ruleDoku ) )? ( (lv_name_1_0= ruleCSSRuleId ) ) otherlv_2= '=' ( ( (lv_rule_3_0= ruleCSSRuleOr ) ) | ( (lv_func_4_0= ruleCSSRuleFunc ) ) ) otherlv_5= ';'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1139:2: ( (lv_doku_0_0= ruleDoku ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_JDOC) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1140:1: (lv_doku_0_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1140:1: (lv_doku_0_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1141:3: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleCSSRuleDefinition2472);
                    lv_doku_0_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
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

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1157:3: ( (lv_name_1_0= ruleCSSRuleId ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1158:1: (lv_name_1_0= ruleCSSRuleId )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1158:1: (lv_name_1_0= ruleCSSRuleId )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1159:3: lv_name_1_0= ruleCSSRuleId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getNameCSSRuleIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCSSRuleId_in_ruleCSSRuleDefinition2494);
            lv_name_1_0=ruleCSSRuleId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"CSSRuleId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleCSSRuleDefinition2506); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1179:1: ( ( (lv_rule_3_0= ruleCSSRuleOr ) ) | ( (lv_func_4_0= ruleCSSRuleFunc ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT||LA23_0==RULE_REGEX||LA23_0==21||LA23_0==25||LA23_0==27||LA23_0==30||LA23_0==37) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==22) ) {
                    alt23=2;
                }
                else if ( (LA23_2==RULE_ID||LA23_2==RULE_INT||LA23_2==RULE_REGEX||LA23_2==17||LA23_2==21||LA23_2==25||LA23_2==27||(LA23_2>=29 && LA23_2<=30)||(LA23_2>=33 && LA23_2<=37)) ) {
                    alt23=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1179:2: ( (lv_rule_3_0= ruleCSSRuleOr ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1179:2: ( (lv_rule_3_0= ruleCSSRuleOr ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1180:1: (lv_rule_3_0= ruleCSSRuleOr )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1180:1: (lv_rule_3_0= ruleCSSRuleOr )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1181:3: lv_rule_3_0= ruleCSSRuleOr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleDefinition2528);
                    lv_rule_3_0=ruleCSSRuleOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"rule",
                              		lv_rule_3_0, 
                              		"CSSRuleOr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1198:6: ( (lv_func_4_0= ruleCSSRuleFunc ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1198:6: ( (lv_func_4_0= ruleCSSRuleFunc ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1199:1: (lv_func_4_0= ruleCSSRuleFunc )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1199:1: (lv_func_4_0= ruleCSSRuleFunc )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1200:3: lv_func_4_0= ruleCSSRuleFunc
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getFuncCSSRuleFuncParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCSSRuleFunc_in_ruleCSSRuleDefinition2555);
                    lv_func_4_0=ruleCSSRuleFunc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"func",
                              		lv_func_4_0, 
                              		"CSSRuleFunc");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleCSSRuleDefinition2568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_4());
                  
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleDefinition"


    // $ANTLR start "entryRuleCSSRuleFunc"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1231:1: entryRuleCSSRuleFunc returns [EObject current=null] : iv_ruleCSSRuleFunc= ruleCSSRuleFunc EOF ;
    public final EObject entryRuleCSSRuleFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleFunc = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1235:2: (iv_ruleCSSRuleFunc= ruleCSSRuleFunc EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1236:2: iv_ruleCSSRuleFunc= ruleCSSRuleFunc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleFuncRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleFunc_in_entryRuleCSSRuleFunc2614);
            iv_ruleCSSRuleFunc=ruleCSSRuleFunc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleFunc; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleFunc2624); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleFunc"


    // $ANTLR start "ruleCSSRuleFunc"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1246:1: ruleCSSRuleFunc returns [EObject current=null] : ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' ) ;
    public final EObject ruleCSSRuleFunc() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_WS_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1250:28: ( ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1251:1: ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1251:1: ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1251:2: () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1251:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1252:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleFuncAccess().getCSSRuleFuncAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1257:2: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1258:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1258:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1259:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleFuncAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleCSSRuleFunc2683);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSSRuleFuncRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleCSSRuleFunc2695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCSSRuleFuncAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1279:1: (this_WS_3= RULE_WS )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_WS) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1279:2: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSRuleFunc2707); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_3, grammarAccess.getCSSRuleFuncAccess().getWSTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1283:3: ( (lv_params_4_0= ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1284:1: (lv_params_4_0= ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1284:1: (lv_params_4_0= ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1285:3: lv_params_4_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleFuncAccess().getParamsCSSRuleOrParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleFunc2729);
            lv_params_4_0=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSSRuleFuncRule());
              	        }
                     		set(
                     			current, 
                     			"params",
                      		lv_params_4_0, 
                      		"CSSRuleOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleCSSRuleFunc2741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCSSRuleFuncAccess().getRightParenthesisKeyword_5());
                  
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleFunc"


    // $ANTLR start "entryRuleCSSRuleOr"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1316:1: entryRuleCSSRuleOr returns [EObject current=null] : iv_ruleCSSRuleOr= ruleCSSRuleOr EOF ;
    public final EObject entryRuleCSSRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleOr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1320:2: (iv_ruleCSSRuleOr= ruleCSSRuleOr EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1321:2: iv_ruleCSSRuleOr= ruleCSSRuleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleOrRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr2787);
            iv_ruleCSSRuleOr=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleOr2797); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleOr"


    // $ANTLR start "ruleCSSRuleOr"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1331:1: ruleCSSRuleOr returns [EObject current=null] : (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? ) ;
    public final EObject ruleCSSRuleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CSSRuleXor_0 = null;

        EObject lv_ors_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1335:28: ( (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1336:1: (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1336:1: (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1337:5: this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRuleOrAccess().getCSSRuleXorParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr2848);
            this_CSSRuleXor_0=ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRuleXor_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1345:1: ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1345:2: () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1345:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1346:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCSSRuleOrAccess().getCSSRuleOrOrsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1351:2: (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==33) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1351:4: otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) )
                    	    {
                    	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleCSSRuleOr2870); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getCSSRuleOrAccess().getVerticalLineKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1355:1: ( (lv_ors_3_0= ruleCSSRuleXor ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1356:1: (lv_ors_3_0= ruleCSSRuleXor )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1356:1: (lv_ors_3_0= ruleCSSRuleXor )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1357:3: lv_ors_3_0= ruleCSSRuleXor
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCSSRuleOrAccess().getOrsCSSRuleXorParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr2891);
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
                    	    if ( cnt25 >= 1 ) break loop25;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleOr"


    // $ANTLR start "entryRuleCSSRuleXor"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1384:1: entryRuleCSSRuleXor returns [EObject current=null] : iv_ruleCSSRuleXor= ruleCSSRuleXor EOF ;
    public final EObject entryRuleCSSRuleXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleXor = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1388:2: (iv_ruleCSSRuleXor= ruleCSSRuleXor EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1389:2: iv_ruleCSSRuleXor= ruleCSSRuleXor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleXorRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor2941);
            iv_ruleCSSRuleXor=ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleXor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleXor2951); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleXor"


    // $ANTLR start "ruleCSSRuleXor"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1399:1: ruleCSSRuleXor returns [EObject current=null] : (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? ) ;
    public final EObject ruleCSSRuleXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CSSRuleConcat_0 = null;

        EObject lv_xors_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1403:28: ( (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1404:1: (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1404:1: (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1405:5: this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRuleXorAccess().getCSSRuleConcatParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor3002);
            this_CSSRuleConcat_0=ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRuleConcat_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1413:1: ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1413:2: () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1413:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1414:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCSSRuleXorAccess().getCSSRuleXorXorsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1419:2: (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==34) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1419:4: otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) )
                    	    {
                    	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleCSSRuleXor3024); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getCSSRuleXorAccess().getVerticalLineVerticalLineKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1423:1: ( (lv_xors_3_0= ruleCSSRuleConcat ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1424:1: (lv_xors_3_0= ruleCSSRuleConcat )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1424:1: (lv_xors_3_0= ruleCSSRuleConcat )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1425:3: lv_xors_3_0= ruleCSSRuleConcat
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCSSRuleXorAccess().getXorsCSSRuleConcatParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor3045);
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
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleXor"


    // $ANTLR start "entryRuleCSSRuleConcat"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1452:1: entryRuleCSSRuleConcat returns [EObject current=null] : iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF ;
    public final EObject entryRuleCSSRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleConcat = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1456:2: (iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1457:2: iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleConcatRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat3095);
            iv_ruleCSSRuleConcat=ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleConcat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleConcat3105); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleConcat"


    // $ANTLR start "ruleCSSRuleConcat"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1467:1: ruleCSSRuleConcat returns [EObject current=null] : (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () ( (lv_conc_2_0= ruleCSSRulePostfix ) )+ )? ) ;
    public final EObject ruleCSSRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject this_CSSRulePostfix_0 = null;

        EObject lv_conc_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1471:28: ( (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () ( (lv_conc_2_0= ruleCSSRulePostfix ) )+ )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1472:1: (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () ( (lv_conc_2_0= ruleCSSRulePostfix ) )+ )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1472:1: (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () ( (lv_conc_2_0= ruleCSSRulePostfix ) )+ )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1473:5: this_CSSRulePostfix_0= ruleCSSRulePostfix ( () ( (lv_conc_2_0= ruleCSSRulePostfix ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRuleConcatAccess().getCSSRulePostfixParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcat3156);
            this_CSSRulePostfix_0=ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRulePostfix_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1481:1: ( () ( (lv_conc_2_0= ruleCSSRulePostfix ) )+ )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||LA30_0==RULE_INT||LA30_0==RULE_REGEX||LA30_0==21||LA30_0==25||LA30_0==27||LA30_0==30||LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1481:2: () ( (lv_conc_2_0= ruleCSSRulePostfix ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1481:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1482:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatConcAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1487:2: ( (lv_conc_2_0= ruleCSSRulePostfix ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID||LA29_0==RULE_INT||LA29_0==RULE_REGEX||LA29_0==21||LA29_0==25||LA29_0==27||LA29_0==30||LA29_0==37) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1488:1: (lv_conc_2_0= ruleCSSRulePostfix )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1488:1: (lv_conc_2_0= ruleCSSRulePostfix )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1489:3: lv_conc_2_0= ruleCSSRulePostfix
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCSSRuleConcatAccess().getConcCSSRulePostfixParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcat3186);
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
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleConcat"


    // $ANTLR start "entryRuleCSSRulePostfix"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1516:1: entryRuleCSSRulePostfix returns [EObject current=null] : iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF ;
    public final EObject entryRuleCSSRulePostfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRulePostfix = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1520:2: (iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1521:2: iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRulePostfixRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix3235);
            iv_ruleCSSRulePostfix=ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRulePostfix; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePostfix3245); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRulePostfix"


    // $ANTLR start "ruleCSSRulePostfix"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1531:1: ruleCSSRulePostfix returns [EObject current=null] : (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? ) ;
    public final EObject ruleCSSRulePostfix() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;
        EObject this_CSSRulePrimary_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1535:28: ( (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1536:1: (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1536:1: (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1537:5: this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRulePostfixAccess().getCSSRulePrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_ruleCSSRulePostfix3296);
            this_CSSRulePrimary_0=ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRulePrimary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1545:1: ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==17||(LA32_0>=35 && LA32_0<=36)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1545:2: () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1545:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1546:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCSSRulePostfixAccess().getCSSRulePostfixRuleAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1551:2: ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1552:1: ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1552:1: ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1553:1: (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1553:1: (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' )
                    int alt31=3;
                    switch ( input.LA(1) ) {
                    case 17:
                        {
                        alt31=1;
                        }
                        break;
                    case 35:
                        {
                        alt31=2;
                        }
                        break;
                    case 36:
                        {
                        alt31=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1554:3: lv_cardinality_2_1= '*'
                            {
                            lv_cardinality_2_1=(Token)match(input,17,FOLLOW_17_in_ruleCSSRulePostfix3325); if (state.failed) return current;
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
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1566:8: lv_cardinality_2_2= '+'
                            {
                            lv_cardinality_2_2=(Token)match(input,35,FOLLOW_35_in_ruleCSSRulePostfix3354); if (state.failed) return current;
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
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1578:8: lv_cardinality_2_3= '?'
                            {
                            lv_cardinality_2_3=(Token)match(input,36,FOLLOW_36_in_ruleCSSRulePostfix3383); if (state.failed) return current;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRulePostfix"


    // $ANTLR start "entryRuleCSSRuleBracket"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1604:1: entryRuleCSSRuleBracket returns [EObject current=null] : iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF ;
    public final EObject entryRuleCSSRuleBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleBracket = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1608:2: (iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1609:2: iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleBracketRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket3447);
            iv_ruleCSSRuleBracket=ruleCSSRuleBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleBracket; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleBracket3457); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleBracket"


    // $ANTLR start "ruleCSSRuleBracket"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1619:1: ruleCSSRuleBracket returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' ) ;
    public final EObject ruleCSSRuleBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inner_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1623:28: ( ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1624:1: ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1624:1: ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1624:2: () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1624:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1625:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleBracketAccess().getCSSRuleBracketAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleCSSRuleBracket3507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCSSRuleBracketAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1634:1: ( (lv_inner_2_0= ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1635:1: (lv_inner_2_0= ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1635:1: (lv_inner_2_0= ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1636:3: lv_inner_2_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleBracketAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleBracket3528);
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

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleCSSRuleBracket3540); if (state.failed) return current;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleBracket"


    // $ANTLR start "entryRuleCSSRulePrimary"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1667:1: entryRuleCSSRulePrimary returns [EObject current=null] : iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF ;
    public final EObject entryRuleCSSRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRulePrimary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1671:2: (iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1672:2: iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRulePrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary3586);
            iv_ruleCSSRulePrimary=ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRulePrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePrimary3596); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRulePrimary"


    // $ANTLR start "ruleCSSRulePrimary"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1682:1: ruleCSSRulePrimary returns [EObject current=null] : (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) ;
    public final EObject ruleCSSRulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_7_0=null;
        EObject this_CSSRuleRef_0 = null;

        EObject this_CSSRuleBracket_1 = null;

        EObject this_CSSRuleLiteral_2 = null;

        EObject this_CSSRuleSymbol_3 = null;

        EObject this_CSSBaseType_4 = null;

        EObject this_CSSRuleRegex_5 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1686:28: ( (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1687:1: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1687:1: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            int alt33=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt33=1;
                }
                break;
            case 37:
                {
                alt33=2;
                }
                break;
            case RULE_ID:
                {
                alt33=3;
                }
                break;
            case 27:
                {
                alt33=4;
                }
                break;
            case 21:
            case 25:
                {
                alt33=5;
                }
                break;
            case RULE_REGEX:
                {
                alt33=6;
                }
                break;
            case RULE_INT:
                {
                alt33=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1688:5: this_CSSRuleRef_0= ruleCSSRuleRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleRef_in_ruleCSSRulePrimary3647);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1698:5: this_CSSRuleBracket_1= ruleCSSRuleBracket
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleBracketParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleBracket_in_ruleCSSRulePrimary3674);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1708:5: this_CSSRuleLiteral_2= ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleLiteral_in_ruleCSSRulePrimary3701);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1718:5: this_CSSRuleSymbol_3= ruleCSSRuleSymbol
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleSymbolParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleSymbol_in_ruleCSSRulePrimary3728);
                    this_CSSRuleSymbol_3=ruleCSSRuleSymbol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleSymbol_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1728:5: this_CSSBaseType_4= ruleCSSBaseType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSBaseType_in_ruleCSSRulePrimary3755);
                    this_CSSBaseType_4=ruleCSSBaseType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSBaseType_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1738:5: this_CSSRuleRegex_5= ruleCSSRuleRegex
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRegexParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleRegex_in_ruleCSSRulePrimary3782);
                    this_CSSRuleRegex_5=ruleCSSRuleRegex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleRegex_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1747:6: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1747:6: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1747:7: () ( (lv_value_7_0= RULE_INT ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1747:7: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1748:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCSSRulePrimaryAccess().getNumLiteralAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1753:2: ( (lv_value_7_0= RULE_INT ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1754:1: (lv_value_7_0= RULE_INT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1754:1: (lv_value_7_0= RULE_INT )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1755:3: lv_value_7_0= RULE_INT
                    {
                    lv_value_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCSSRulePrimary3814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_7_0, grammarAccess.getCSSRulePrimaryAccess().getValueINTTerminalRuleCall_6_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSRulePrimaryRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_7_0, 
                              		"INT");
                      	    
                    }

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRulePrimary"


    // $ANTLR start "entryRuleCSSRuleRegex"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1782:1: entryRuleCSSRuleRegex returns [EObject current=null] : iv_ruleCSSRuleRegex= ruleCSSRuleRegex EOF ;
    public final EObject entryRuleCSSRuleRegex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleRegex = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1786:2: (iv_ruleCSSRuleRegex= ruleCSSRuleRegex EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1787:2: iv_ruleCSSRuleRegex= ruleCSSRuleRegex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleRegexRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleRegex_in_entryRuleCSSRuleRegex3866);
            iv_ruleCSSRuleRegex=ruleCSSRuleRegex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleRegex; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleRegex3876); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleRegex"


    // $ANTLR start "ruleCSSRuleRegex"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1797:1: ruleCSSRuleRegex returns [EObject current=null] : ( () ( (lv_regex_1_0= RULE_REGEX ) ) ) ;
    public final EObject ruleCSSRuleRegex() throws RecognitionException {
        EObject current = null;

        Token lv_regex_1_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1801:28: ( ( () ( (lv_regex_1_0= RULE_REGEX ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1802:1: ( () ( (lv_regex_1_0= RULE_REGEX ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1802:1: ( () ( (lv_regex_1_0= RULE_REGEX ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1802:2: () ( (lv_regex_1_0= RULE_REGEX ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1802:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1803:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleRegexAccess().getCSSRuleRegexAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1808:2: ( (lv_regex_1_0= RULE_REGEX ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1809:1: (lv_regex_1_0= RULE_REGEX )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1809:1: (lv_regex_1_0= RULE_REGEX )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1810:3: lv_regex_1_0= RULE_REGEX
            {
            lv_regex_1_0=(Token)match(input,RULE_REGEX,FOLLOW_RULE_REGEX_in_ruleCSSRuleRegex3931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_regex_1_0, grammarAccess.getCSSRuleRegexAccess().getRegexREGEXTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCSSRuleRegexRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"regex",
                      		lv_regex_1_0, 
                      		"REGEX");
              	    
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleRegex"


    // $ANTLR start "entryRuleCSSRuleLiteral"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1837:1: entryRuleCSSRuleLiteral returns [EObject current=null] : iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF ;
    public final EObject entryRuleCSSRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1838:2: (iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1839:2: iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral3976);
            iv_ruleCSSRuleLiteral=ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleLiteral3986); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1846:1: ruleCSSRuleLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCSSRuleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1849:28: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1850:1: ( () ( (lv_value_1_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1850:1: ( () ( (lv_value_1_0= RULE_ID ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1850:2: () ( (lv_value_1_0= RULE_ID ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1850:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1851:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1856:2: ( (lv_value_1_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1857:1: (lv_value_1_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1857:1: (lv_value_1_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1858:3: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCSSRuleLiteral4037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_1_0()); 
              		
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


    // $ANTLR start "entryRuleCSSRuleSymbol"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1882:1: entryRuleCSSRuleSymbol returns [EObject current=null] : iv_ruleCSSRuleSymbol= ruleCSSRuleSymbol EOF ;
    public final EObject entryRuleCSSRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleSymbol = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1883:2: (iv_ruleCSSRuleSymbol= ruleCSSRuleSymbol EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1884:2: iv_ruleCSSRuleSymbol= ruleCSSRuleSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleSymbolRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleSymbol_in_entryRuleCSSRuleSymbol4078);
            iv_ruleCSSRuleSymbol=ruleCSSRuleSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleSymbol; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleSymbol4088); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleSymbol"


    // $ANTLR start "ruleCSSRuleSymbol"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1891:1: ruleCSSRuleSymbol returns [EObject current=null] : ( () ( (lv_symbol_1_0= ',' ) ) ) ;
    public final EObject ruleCSSRuleSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1894:28: ( ( () ( (lv_symbol_1_0= ',' ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1895:1: ( () ( (lv_symbol_1_0= ',' ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1895:1: ( () ( (lv_symbol_1_0= ',' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1895:2: () ( (lv_symbol_1_0= ',' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1895:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1896:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleSymbolAccess().getCSSRuleSymbolAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1901:2: ( (lv_symbol_1_0= ',' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1902:1: (lv_symbol_1_0= ',' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1902:1: (lv_symbol_1_0= ',' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1903:3: lv_symbol_1_0= ','
            {
            lv_symbol_1_0=(Token)match(input,27,FOLLOW_27_in_ruleCSSRuleSymbol4140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_symbol_1_0, grammarAccess.getCSSRuleSymbolAccess().getSymbolCommaKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCSSRuleSymbolRule());
              	        }
                     		setWithLastConsumed(current, "symbol", lv_symbol_1_0, ",");
              	    
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
    // $ANTLR end "ruleCSSRuleSymbol"


    // $ANTLR start "entryRuleCSSDefaultValue"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1924:1: entryRuleCSSDefaultValue returns [EObject current=null] : iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF ;
    public final EObject entryRuleCSSDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSDefaultValue = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1925:2: (iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1926:2: iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue4189);
            iv_ruleCSSDefaultValue=ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSDefaultValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSDefaultValue4199); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1933:1: ruleCSSDefaultValue returns [EObject current=null] : ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleCSSDefaultValue() throws RecognitionException {
        EObject current = null;

        Token lv_ival_2_0=null;
        Token lv_dval_3_0=null;
        Token lv_sval_4_0=null;
        EObject lv_val_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1936:28: ( ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1937:1: ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1937:1: ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt34=1;
                }
                break;
            case RULE_INT:
                {
                alt34=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt34=3;
                }
                break;
            case RULE_STRING:
                {
                alt34=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1937:2: ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1937:2: ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1937:3: () ( (lv_val_1_0= ruleCSSRuleLiteral ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1937:3: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1938:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCSSDefaultValueAccess().getCSSDefaultValueAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1943:2: ( (lv_val_1_0= ruleCSSRuleLiteral ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1944:1: (lv_val_1_0= ruleCSSRuleLiteral )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1944:1: (lv_val_1_0= ruleCSSRuleLiteral )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1945:3: lv_val_1_0= ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSDefaultValueAccess().getValCSSRuleLiteralParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCSSRuleLiteral_in_ruleCSSDefaultValue4255);
                    lv_val_1_0=ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSDefaultValueRule());
                      	        }
                             		set(
                             			current, 
                             			"val",
                              		lv_val_1_0, 
                              		"CSSRuleLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1962:6: ( (lv_ival_2_0= RULE_INT ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1962:6: ( (lv_ival_2_0= RULE_INT ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1963:1: (lv_ival_2_0= RULE_INT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1963:1: (lv_ival_2_0= RULE_INT )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1964:3: lv_ival_2_0= RULE_INT
                    {
                    lv_ival_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCSSDefaultValue4279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_ival_2_0, grammarAccess.getCSSDefaultValueAccess().getIvalINTTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSDefaultValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"ival",
                              		lv_ival_2_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1981:6: ( (lv_dval_3_0= RULE_DOUBLE ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1981:6: ( (lv_dval_3_0= RULE_DOUBLE ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1982:1: (lv_dval_3_0= RULE_DOUBLE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1982:1: (lv_dval_3_0= RULE_DOUBLE )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1983:3: lv_dval_3_0= RULE_DOUBLE
                    {
                    lv_dval_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleCSSDefaultValue4307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_dval_3_0, grammarAccess.getCSSDefaultValueAccess().getDvalDOUBLETerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSDefaultValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"dval",
                              		lv_dval_3_0, 
                              		"DOUBLE");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2000:6: ( (lv_sval_4_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2000:6: ( (lv_sval_4_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2001:1: (lv_sval_4_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2001:1: (lv_sval_4_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2002:3: lv_sval_4_0= RULE_STRING
                    {
                    lv_sval_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCSSDefaultValue4335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sval_4_0, grammarAccess.getCSSDefaultValueAccess().getSvalSTRINGTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSDefaultValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sval",
                              		lv_sval_4_0, 
                              		"STRING");
                      	    
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
    // $ANTLR end "ruleCSSDefaultValue"

    // $ANTLR start synpred1_InternalCssExtDsl
    public final void synpred1_InternalCssExtDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:3: ( '.' )
        // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:220:2: '.'
        {
        match(input,16,FOLLOW_16_in_synpred1_InternalCssExtDsl467); if (state.failed) return ;

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
        "\1\4\1\uffff\1\4\1\20\1\uffff\1\4\2\uffff\1\20";
    static final String DFA5_maxS =
        "\1\24\1\uffff\1\4\1\40\1\uffff\1\4\2\uffff\1\40";
    static final String DFA5_acceptS =
        "\1\uffff\1\4\2\uffff\1\2\1\uffff\1\1\1\3\1\uffff";
    static final String DFA5_specialS =
        "\11\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\3\1\2\14\uffff\1\4\1\uffff\1\1",
            "",
            "\1\3",
            "\1\5\2\uffff\1\7\6\uffff\1\7\5\uffff\1\6",
            "",
            "\1\10",
            "",
            "",
            "\1\5\2\uffff\1\7\6\uffff\1\7\5\uffff\1\6"
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
            return "()* loopback of 329:1: ( ( (lv_rules_3_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_4_0= rulePackageDefinition ) ) | ( (lv_elements_5_0= ruleElementDefinition ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleCssExtension_in_entryRuleCssExtension75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCssExtension85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleCssExtension131 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_ruleCssExtension153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName448 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName499 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard605 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildCard624 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedNameWithWildCard637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_entryRulePackageDefinition679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDefinition689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePackageDefinition726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDefinition747 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePackageDefinition759 = new BitSet(new long[]{0x0000000000140030L});
    public static final BitSet FOLLOW_ruleCSSRuleDefinition_in_rulePackageDefinition781 = new BitSet(new long[]{0x0000000000140030L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_rulePackageDefinition808 = new BitSet(new long[]{0x0000000000140030L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_rulePackageDefinition835 = new BitSet(new long[]{0x0000000000140030L});
    public static final BitSet FOLLOW_20_in_rulePackageDefinition849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_entryRuleDoku885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoku895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JDOC_in_ruleDoku936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSBaseType_in_entryRuleCSSBaseType982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSBaseType992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSType_in_ruleCSSBaseType1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSType_in_entryRuleCSSType1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSType1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCSSType1153 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCSSType1178 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1190 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCSSType1208 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1225 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_23_in_ruleCSSType1238 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1250 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCSSType1268 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1285 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_24_in_ruleCSSType1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCSSType1333 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCSSType1358 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1370 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleCSSType1388 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1405 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_23_in_ruleCSSType1418 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1430 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleCSSType1448 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1465 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_24_in_ruleCSSType1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCSSType1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCSSType1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_entryRuleElementDefinition1593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDefinition1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleElementDefinition1658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleElementDefinition1680 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_26_in_ruleElementDefinition1693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleElementDefinition1716 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_27_in_ruleElementDefinition1729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleElementDefinition1752 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_19_in_ruleElementDefinition1768 = new BitSet(new long[]{0x0000000000100230L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleElementDefinition1790 = new BitSet(new long[]{0x0000000000100230L});
    public static final BitSet FOLLOW_rulePseudoClassDefinition_in_ruleElementDefinition1817 = new BitSet(new long[]{0x0000000000100230L});
    public static final BitSet FOLLOW_20_in_ruleElementDefinition1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rulePropertyDefinition1932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyDefinition1950 = new BitSet(new long[]{0x000000204A200490L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rulePropertyDefinition1976 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_rulePropertyDefinition1989 = new BitSet(new long[]{0x0000000000000990L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_rulePropertyDefinition2010 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePropertyDefinition2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassDefinition_in_entryRulePseudoClassDefinition2060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassDefinition2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rulePseudoClassDefinition2125 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_PSEUDO_in_rulePseudoClassDefinition2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleId_in_entryRuleCSSRuleId2184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleId2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCSSRuleId2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef2280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleRef2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCSSRuleRef2331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCSSRuleRef2354 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCSSRuleRef2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleDefinition_in_entryRuleCSSRuleDefinition2412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleDefinition2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleCSSRuleDefinition2472 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleCSSRuleId_in_ruleCSSRuleDefinition2494 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCSSRuleDefinition2506 = new BitSet(new long[]{0x000000204A200490L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleDefinition2528 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleCSSRuleFunc_in_ruleCSSRuleDefinition2555 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCSSRuleDefinition2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleFunc_in_entryRuleCSSRuleFunc2614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleFunc2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleCSSRuleFunc2683 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCSSRuleFunc2695 = new BitSet(new long[]{0x000000204A2004D0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSRuleFunc2707 = new BitSet(new long[]{0x000000204A2004D0L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleFunc2729 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCSSRuleFunc2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr2787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleOr2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr2848 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleCSSRuleOr2870 = new BitSet(new long[]{0x000000204A200490L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr2891 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor2941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleXor2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor3002 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleCSSRuleXor3024 = new BitSet(new long[]{0x000000204A200490L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor3045 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat3095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleConcat3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcat3156 = new BitSet(new long[]{0x000000204A200492L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcat3186 = new BitSet(new long[]{0x000000204A200492L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix3235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePostfix3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_ruleCSSRulePostfix3296 = new BitSet(new long[]{0x0000001800020002L});
    public static final BitSet FOLLOW_17_in_ruleCSSRulePostfix3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCSSRulePostfix3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCSSRulePostfix3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket3447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleBracket3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCSSRuleBracket3507 = new BitSet(new long[]{0x000000204A200490L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleBracket3528 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCSSRuleBracket3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary3586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePrimary3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_ruleCSSRulePrimary3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_ruleCSSRulePrimary3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_ruleCSSRulePrimary3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleSymbol_in_ruleCSSRulePrimary3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSBaseType_in_ruleCSSRulePrimary3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRegex_in_ruleCSSRulePrimary3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCSSRulePrimary3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRegex_in_entryRuleCSSRuleRegex3866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleRegex3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REGEX_in_ruleCSSRuleRegex3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral3976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleLiteral3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCSSRuleLiteral4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleSymbol_in_entryRuleCSSRuleSymbol4078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleSymbol4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCSSRuleSymbol4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue4189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSDefaultValue4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_ruleCSSDefaultValue4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCSSDefaultValue4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleCSSDefaultValue4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCSSDefaultValue4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred1_InternalCssExtDsl467 = new BitSet(new long[]{0x0000000000000002L});

}