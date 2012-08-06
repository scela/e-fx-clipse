package at.bestsolution.efxclipse.tooling.css.cssext.ui.contentassist.antlr.internal; 

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
import at.bestsolution.efxclipse.tooling.css.cssext.services.CssExtDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCssExtDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_JDOC", "RULE_INT", "RULE_DOUBLE", "RULE_PSEUDO", "RULE_REGEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'+'", "'?'", "'import'", "'.'", "'package'", "'{'", "'}'", "'('", "'->'", "')'", "';'", "'default:'", "'<'", "'>'", "'='", "'|'", "'||'", "'['", "']'", "'int'", "'double'"
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
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_DOUBLE=7;
    public static final int RULE_REGEX=9;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=10;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int RULE_WS=13;
    public static final int RULE_JDOC=5;
    public static final int RULE_PSEUDO=8;

    // delegates
    // delegators


        public InternalCssExtDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCssExtDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCssExtDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g"; }


     
     	private CssExtDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CssExtDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleCssExtension"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:61:1: entryRuleCssExtension : ruleCssExtension EOF ;
    public final void entryRuleCssExtension() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:62:1: ( ruleCssExtension EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:63:1: ruleCssExtension EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionRule()); 
            }
            pushFollow(FOLLOW_ruleCssExtension_in_entryRuleCssExtension67);
            ruleCssExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCssExtension74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCssExtension"


    // $ANTLR start "ruleCssExtension"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:70:1: ruleCssExtension : ( ( rule__CssExtension__Group__0 ) ) ;
    public final void ruleCssExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:74:2: ( ( ( rule__CssExtension__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:75:1: ( ( rule__CssExtension__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:75:1: ( ( rule__CssExtension__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:76:1: ( rule__CssExtension__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:77:1: ( rule__CssExtension__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:77:2: rule__CssExtension__Group__0
            {
            pushFollow(FOLLOW_rule__CssExtension__Group__0_in_ruleCssExtension100);
            rule__CssExtension__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getGroup()); 
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
    // $ANTLR end "ruleCssExtension"


    // $ANTLR start "entryRuleImport"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:90:1: ( ruleImport EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:91:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport127);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:105:1: ( rule__Import__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:105:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport160);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleValidID"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:117:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:118:1: ( ruleValidID EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:119:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID187);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:126:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:130:2: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:131:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:131:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:132:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID220); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:145:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:146:1: ( ruleQualifiedName EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:147:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName246);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName253); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:154:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:158:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:160:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:161:1: ( rule__QualifiedName__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:161:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName279);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:173:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:174:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:175:1: ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard306);
            ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard313); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:182:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:186:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:187:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:187:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:188:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:189:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:189:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard339);
            rule__QualifiedNameWithWildCard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRulePackageDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:201:1: entryRulePackageDefinition : rulePackageDefinition EOF ;
    public final void entryRulePackageDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:202:1: ( rulePackageDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:203:1: rulePackageDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePackageDefinition_in_entryRulePackageDefinition366);
            rulePackageDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDefinition373); if (state.failed) return ;

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
    // $ANTLR end "entryRulePackageDefinition"


    // $ANTLR start "rulePackageDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:210:1: rulePackageDefinition : ( ( rule__PackageDefinition__Group__0 ) ) ;
    public final void rulePackageDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:214:2: ( ( ( rule__PackageDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:215:1: ( ( rule__PackageDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:215:1: ( ( rule__PackageDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:216:1: ( rule__PackageDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:217:1: ( rule__PackageDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:217:2: rule__PackageDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__0_in_rulePackageDefinition399);
            rule__PackageDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getGroup()); 
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
    // $ANTLR end "rulePackageDefinition"


    // $ANTLR start "entryRuleDoku"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:229:1: entryRuleDoku : ruleDoku EOF ;
    public final void entryRuleDoku() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:230:1: ( ruleDoku EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:231:1: ruleDoku EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDokuRule()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_entryRuleDoku426);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDokuRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoku433); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDoku"


    // $ANTLR start "ruleDoku"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:238:1: ruleDoku : ( ( rule__Doku__ContentAssignment ) ) ;
    public final void ruleDoku() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:242:2: ( ( ( rule__Doku__ContentAssignment ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:243:1: ( ( rule__Doku__ContentAssignment ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:243:1: ( ( rule__Doku__ContentAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:244:1: ( rule__Doku__ContentAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDokuAccess().getContentAssignment()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:245:1: ( rule__Doku__ContentAssignment )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:245:2: rule__Doku__ContentAssignment
            {
            pushFollow(FOLLOW_rule__Doku__ContentAssignment_in_ruleDoku459);
            rule__Doku__ContentAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDokuAccess().getContentAssignment()); 
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
    // $ANTLR end "ruleDoku"


    // $ANTLR start "entryRuleCSSBaseType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:257:1: entryRuleCSSBaseType : ruleCSSBaseType EOF ;
    public final void entryRuleCSSBaseType() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:261:1: ( ruleCSSBaseType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:262:1: ruleCSSBaseType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSBaseTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCSSBaseType_in_entryRuleCSSBaseType491);
            ruleCSSBaseType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSBaseTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSBaseType498); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSBaseType"


    // $ANTLR start "ruleCSSBaseType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:272:1: ruleCSSBaseType : ( ruleCSSType ) ;
    public final void ruleCSSBaseType() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:277:2: ( ( ruleCSSType ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:278:1: ( ruleCSSType )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:278:1: ( ruleCSSType )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:279:1: ruleCSSType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSBaseTypeAccess().getCSSTypeParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleCSSType_in_ruleCSSBaseType528);
            ruleCSSType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSBaseTypeAccess().getCSSTypeParserRuleCall()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSBaseType"


    // $ANTLR start "entryRuleCSSType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:293:1: entryRuleCSSType : ruleCSSType EOF ;
    public final void entryRuleCSSType() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:297:1: ( ruleCSSType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:298:1: ruleCSSType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCSSType_in_entryRuleCSSType559);
            ruleCSSType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSType566); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSType"


    // $ANTLR start "ruleCSSType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:308:1: ruleCSSType : ( ( rule__CSSType__Alternatives ) ) ;
    public final void ruleCSSType() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:313:2: ( ( ( rule__CSSType__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:314:1: ( ( rule__CSSType__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:314:1: ( ( rule__CSSType__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:315:1: ( rule__CSSType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:316:1: ( rule__CSSType__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:316:2: rule__CSSType__Alternatives
            {
            pushFollow(FOLLOW_rule__CSSType__Alternatives_in_ruleCSSType596);
            rule__CSSType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getAlternatives()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSType"


    // $ANTLR start "entryRuleElementDeclartion"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:329:1: entryRuleElementDeclartion : ruleElementDeclartion EOF ;
    public final void entryRuleElementDeclartion() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:330:1: ( ruleElementDeclartion EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:331:1: ruleElementDeclartion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionRule()); 
            }
            pushFollow(FOLLOW_ruleElementDeclartion_in_entryRuleElementDeclartion623);
            ruleElementDeclartion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDeclartionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDeclartion630); if (state.failed) return ;

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
    // $ANTLR end "entryRuleElementDeclartion"


    // $ANTLR start "ruleElementDeclartion"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:338:1: ruleElementDeclartion : ( ( rule__ElementDeclartion__Group__0 ) ) ;
    public final void ruleElementDeclartion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:342:2: ( ( ( rule__ElementDeclartion__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:343:1: ( ( rule__ElementDeclartion__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:343:1: ( ( rule__ElementDeclartion__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:344:1: ( rule__ElementDeclartion__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:345:1: ( rule__ElementDeclartion__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:345:2: rule__ElementDeclartion__Group__0
            {
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__0_in_ruleElementDeclartion656);
            rule__ElementDeclartion__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDeclartionAccess().getGroup()); 
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
    // $ANTLR end "ruleElementDeclartion"


    // $ANTLR start "entryRulePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:357:1: entryRulePropertyDefinition : rulePropertyDefinition EOF ;
    public final void entryRulePropertyDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:358:1: ( rulePropertyDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:359:1: rulePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition683);
            rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition690); if (state.failed) return ;

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
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:366:1: rulePropertyDefinition : ( ( rule__PropertyDefinition__Group__0 ) ) ;
    public final void rulePropertyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:370:2: ( ( ( rule__PropertyDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:371:1: ( ( rule__PropertyDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:371:1: ( ( rule__PropertyDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:372:1: ( rule__PropertyDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:373:1: ( rule__PropertyDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:373:2: rule__PropertyDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition716);
            rule__PropertyDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getGroup()); 
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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRulePseudoClassDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:385:1: entryRulePseudoClassDefinition : rulePseudoClassDefinition EOF ;
    public final void entryRulePseudoClassDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:386:1: ( rulePseudoClassDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:387:1: rulePseudoClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassDefinition_in_entryRulePseudoClassDefinition743);
            rulePseudoClassDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassDefinition750); if (state.failed) return ;

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
    // $ANTLR end "entryRulePseudoClassDefinition"


    // $ANTLR start "rulePseudoClassDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:394:1: rulePseudoClassDefinition : ( ( rule__PseudoClassDefinition__Group__0 ) ) ;
    public final void rulePseudoClassDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:398:2: ( ( ( rule__PseudoClassDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:399:1: ( ( rule__PseudoClassDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:399:1: ( ( rule__PseudoClassDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:400:1: ( rule__PseudoClassDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:401:1: ( rule__PseudoClassDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:401:2: rule__PseudoClassDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__0_in_rulePseudoClassDefinition776);
            rule__PseudoClassDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getGroup()); 
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
    // $ANTLR end "rulePseudoClassDefinition"


    // $ANTLR start "entryRuleCSSRuleId"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:413:1: entryRuleCSSRuleId : ruleCSSRuleId EOF ;
    public final void entryRuleCSSRuleId() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:414:1: ( ruleCSSRuleId EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:415:1: ruleCSSRuleId EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleIdRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleId_in_entryRuleCSSRuleId803);
            ruleCSSRuleId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleIdRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleId810); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleId"


    // $ANTLR start "ruleCSSRuleId"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:422:1: ruleCSSRuleId : ( ( rule__CSSRuleId__NameAssignment ) ) ;
    public final void ruleCSSRuleId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:426:2: ( ( ( rule__CSSRuleId__NameAssignment ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:427:1: ( ( rule__CSSRuleId__NameAssignment ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:427:1: ( ( rule__CSSRuleId__NameAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:428:1: ( rule__CSSRuleId__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleIdAccess().getNameAssignment()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:429:1: ( rule__CSSRuleId__NameAssignment )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:429:2: rule__CSSRuleId__NameAssignment
            {
            pushFollow(FOLLOW_rule__CSSRuleId__NameAssignment_in_ruleCSSRuleId836);
            rule__CSSRuleId__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleIdAccess().getNameAssignment()); 
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
    // $ANTLR end "ruleCSSRuleId"


    // $ANTLR start "entryRuleCSSRuleRef"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:441:1: entryRuleCSSRuleRef : ruleCSSRuleRef EOF ;
    public final void entryRuleCSSRuleRef() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:445:1: ( ruleCSSRuleRef EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:446:1: ruleCSSRuleRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef868);
            ruleCSSRuleRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleRef875); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleRef"


    // $ANTLR start "ruleCSSRuleRef"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:456:1: ruleCSSRuleRef : ( ( rule__CSSRuleRef__Group__0 ) ) ;
    public final void ruleCSSRuleRef() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:461:2: ( ( ( rule__CSSRuleRef__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:462:1: ( ( rule__CSSRuleRef__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:462:1: ( ( rule__CSSRuleRef__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:463:1: ( rule__CSSRuleRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:464:1: ( rule__CSSRuleRef__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:464:2: rule__CSSRuleRef__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__0_in_ruleCSSRuleRef905);
            rule__CSSRuleRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleRef"


    // $ANTLR start "entryRuleCSSRuleDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:477:1: entryRuleCSSRuleDefinition : ruleCSSRuleDefinition EOF ;
    public final void entryRuleCSSRuleDefinition() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:481:1: ( ruleCSSRuleDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:482:1: ruleCSSRuleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleDefinition_in_entryRuleCSSRuleDefinition937);
            ruleCSSRuleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleDefinition944); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleDefinition"


    // $ANTLR start "ruleCSSRuleDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:492:1: ruleCSSRuleDefinition : ( ( rule__CSSRuleDefinition__Group__0 ) ) ;
    public final void ruleCSSRuleDefinition() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:497:2: ( ( ( rule__CSSRuleDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:498:1: ( ( rule__CSSRuleDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:498:1: ( ( rule__CSSRuleDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:499:1: ( rule__CSSRuleDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:500:1: ( rule__CSSRuleDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:500:2: rule__CSSRuleDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__0_in_ruleCSSRuleDefinition974);
            rule__CSSRuleDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleDefinition"


    // $ANTLR start "entryRuleCSSRuleOr"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:515:1: entryRuleCSSRuleOr : ruleCSSRuleOr EOF ;
    public final void entryRuleCSSRuleOr() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:519:1: ( ruleCSSRuleOr EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:520:1: ruleCSSRuleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr1008);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleOr1015); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleOr"


    // $ANTLR start "ruleCSSRuleOr"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:530:1: ruleCSSRuleOr : ( ( rule__CSSRuleOr__Group__0 ) ) ;
    public final void ruleCSSRuleOr() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:535:2: ( ( ( rule__CSSRuleOr__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:536:1: ( ( rule__CSSRuleOr__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:536:1: ( ( rule__CSSRuleOr__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:537:1: ( rule__CSSRuleOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:538:1: ( rule__CSSRuleOr__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:538:2: rule__CSSRuleOr__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__0_in_ruleCSSRuleOr1045);
            rule__CSSRuleOr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleOr"


    // $ANTLR start "entryRuleCSSRuleXor"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:551:1: entryRuleCSSRuleXor : ruleCSSRuleXor EOF ;
    public final void entryRuleCSSRuleXor() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:555:1: ( ruleCSSRuleXor EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:556:1: ruleCSSRuleXor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor1077);
            ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleXor1084); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleXor"


    // $ANTLR start "ruleCSSRuleXor"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:566:1: ruleCSSRuleXor : ( ( rule__CSSRuleXor__Group__0 ) ) ;
    public final void ruleCSSRuleXor() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:571:2: ( ( ( rule__CSSRuleXor__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:572:1: ( ( rule__CSSRuleXor__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:572:1: ( ( rule__CSSRuleXor__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:573:1: ( rule__CSSRuleXor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:574:1: ( rule__CSSRuleXor__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:574:2: rule__CSSRuleXor__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__0_in_ruleCSSRuleXor1114);
            rule__CSSRuleXor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleXor"


    // $ANTLR start "entryRuleCSSRuleConcat"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:587:1: entryRuleCSSRuleConcat : ruleCSSRuleConcat EOF ;
    public final void entryRuleCSSRuleConcat() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:591:1: ( ruleCSSRuleConcat EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:592:1: ruleCSSRuleConcat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat1146);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleConcat1153); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleConcat"


    // $ANTLR start "ruleCSSRuleConcat"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:602:1: ruleCSSRuleConcat : ( ( rule__CSSRuleConcat__Group__0 ) ) ;
    public final void ruleCSSRuleConcat() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:607:2: ( ( ( rule__CSSRuleConcat__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:608:1: ( ( rule__CSSRuleConcat__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:608:1: ( ( rule__CSSRuleConcat__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:609:1: ( rule__CSSRuleConcat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:610:1: ( rule__CSSRuleConcat__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:610:2: rule__CSSRuleConcat__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__0_in_ruleCSSRuleConcat1183);
            rule__CSSRuleConcat__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleConcat"


    // $ANTLR start "entryRuleCSSRulePostfix"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:623:1: entryRuleCSSRulePostfix : ruleCSSRulePostfix EOF ;
    public final void entryRuleCSSRulePostfix() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:627:1: ( ruleCSSRulePostfix EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:628:1: ruleCSSRulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix1215);
            ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePostfix1222); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRulePostfix"


    // $ANTLR start "ruleCSSRulePostfix"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:638:1: ruleCSSRulePostfix : ( ( rule__CSSRulePostfix__Group__0 ) ) ;
    public final void ruleCSSRulePostfix() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:643:2: ( ( ( rule__CSSRulePostfix__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:644:1: ( ( rule__CSSRulePostfix__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:644:1: ( ( rule__CSSRulePostfix__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:645:1: ( rule__CSSRulePostfix__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:646:1: ( rule__CSSRulePostfix__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:646:2: rule__CSSRulePostfix__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__0_in_ruleCSSRulePostfix1252);
            rule__CSSRulePostfix__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRulePostfix"


    // $ANTLR start "entryRuleCSSRuleBracket"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:659:1: entryRuleCSSRuleBracket : ruleCSSRuleBracket EOF ;
    public final void entryRuleCSSRuleBracket() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:663:1: ( ruleCSSRuleBracket EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:664:1: ruleCSSRuleBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket1284);
            ruleCSSRuleBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleBracket1291); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleBracket"


    // $ANTLR start "ruleCSSRuleBracket"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:674:1: ruleCSSRuleBracket : ( ( rule__CSSRuleBracket__Group__0 ) ) ;
    public final void ruleCSSRuleBracket() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:679:2: ( ( ( rule__CSSRuleBracket__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:680:1: ( ( rule__CSSRuleBracket__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:680:1: ( ( rule__CSSRuleBracket__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:681:1: ( rule__CSSRuleBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:682:1: ( rule__CSSRuleBracket__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:682:2: rule__CSSRuleBracket__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__0_in_ruleCSSRuleBracket1321);
            rule__CSSRuleBracket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleBracket"


    // $ANTLR start "entryRuleCSSRuleParenthesis"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:695:1: entryRuleCSSRuleParenthesis : ruleCSSRuleParenthesis EOF ;
    public final void entryRuleCSSRuleParenthesis() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:699:1: ( ruleCSSRuleParenthesis EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:700:1: ruleCSSRuleParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleParenthesis_in_entryRuleCSSRuleParenthesis1353);
            ruleCSSRuleParenthesis();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleParenthesisRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleParenthesis1360); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleParenthesis"


    // $ANTLR start "ruleCSSRuleParenthesis"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:710:1: ruleCSSRuleParenthesis : ( ( rule__CSSRuleParenthesis__Group__0 ) ) ;
    public final void ruleCSSRuleParenthesis() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:715:2: ( ( ( rule__CSSRuleParenthesis__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:716:1: ( ( rule__CSSRuleParenthesis__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:716:1: ( ( rule__CSSRuleParenthesis__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:717:1: ( rule__CSSRuleParenthesis__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleParenthesisAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:718:1: ( rule__CSSRuleParenthesis__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:718:2: rule__CSSRuleParenthesis__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleParenthesis__Group__0_in_ruleCSSRuleParenthesis1390);
            rule__CSSRuleParenthesis__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleParenthesisAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleParenthesis"


    // $ANTLR start "entryRuleCSSRulePrimary"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:731:1: entryRuleCSSRulePrimary : ruleCSSRulePrimary EOF ;
    public final void entryRuleCSSRulePrimary() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:735:1: ( ruleCSSRulePrimary EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:736:1: ruleCSSRulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary1422);
            ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePrimary1429); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRulePrimary"


    // $ANTLR start "ruleCSSRulePrimary"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:746:1: ruleCSSRulePrimary : ( ( rule__CSSRulePrimary__Alternatives ) ) ;
    public final void ruleCSSRulePrimary() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:751:2: ( ( ( rule__CSSRulePrimary__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:752:1: ( ( rule__CSSRulePrimary__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:752:1: ( ( rule__CSSRulePrimary__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:753:1: ( rule__CSSRulePrimary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:754:1: ( rule__CSSRulePrimary__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:754:2: rule__CSSRulePrimary__Alternatives
            {
            pushFollow(FOLLOW_rule__CSSRulePrimary__Alternatives_in_ruleCSSRulePrimary1459);
            rule__CSSRulePrimary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getAlternatives()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRulePrimary"


    // $ANTLR start "entryRuleCSSRuleRegex"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:767:1: entryRuleCSSRuleRegex : ruleCSSRuleRegex EOF ;
    public final void entryRuleCSSRuleRegex() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:771:1: ( ruleCSSRuleRegex EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:772:1: ruleCSSRuleRegex EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleRegex_in_entryRuleCSSRuleRegex1491);
            ruleCSSRuleRegex();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleRegex1498); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleRegex"


    // $ANTLR start "ruleCSSRuleRegex"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:782:1: ruleCSSRuleRegex : ( ( rule__CSSRuleRegex__Group__0 ) ) ;
    public final void ruleCSSRuleRegex() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:787:2: ( ( ( rule__CSSRuleRegex__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:788:1: ( ( rule__CSSRuleRegex__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:788:1: ( ( rule__CSSRuleRegex__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:789:1: ( rule__CSSRuleRegex__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:790:1: ( rule__CSSRuleRegex__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:790:2: rule__CSSRuleRegex__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleRegex__Group__0_in_ruleCSSRuleRegex1528);
            rule__CSSRuleRegex__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleRegex"


    // $ANTLR start "entryRuleCSSRuleLiteral"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:803:1: entryRuleCSSRuleLiteral : ruleCSSRuleLiteral EOF ;
    public final void entryRuleCSSRuleLiteral() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:804:1: ( ruleCSSRuleLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:805:1: ruleCSSRuleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral1555);
            ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleLiteral1562); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleLiteral"


    // $ANTLR start "ruleCSSRuleLiteral"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:812:1: ruleCSSRuleLiteral : ( ( rule__CSSRuleLiteral__Group__0 ) ) ;
    public final void ruleCSSRuleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:816:2: ( ( ( rule__CSSRuleLiteral__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:817:1: ( ( rule__CSSRuleLiteral__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:817:1: ( ( rule__CSSRuleLiteral__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:818:1: ( rule__CSSRuleLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:819:1: ( rule__CSSRuleLiteral__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:819:2: rule__CSSRuleLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Group__0_in_ruleCSSRuleLiteral1588);
            rule__CSSRuleLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRuleLiteral"


    // $ANTLR start "entryRuleCSSDefaultValue"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:831:1: entryRuleCSSDefaultValue : ruleCSSDefaultValue EOF ;
    public final void entryRuleCSSDefaultValue() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:832:1: ( ruleCSSDefaultValue EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:833:1: ruleCSSDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue1615);
            ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSDefaultValue1622); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSDefaultValue"


    // $ANTLR start "ruleCSSDefaultValue"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:840:1: ruleCSSDefaultValue : ( ( rule__CSSDefaultValue__Alternatives ) ) ;
    public final void ruleCSSDefaultValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:844:2: ( ( ( rule__CSSDefaultValue__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:845:1: ( ( rule__CSSDefaultValue__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:845:1: ( ( rule__CSSDefaultValue__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:846:1: ( rule__CSSDefaultValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:847:1: ( rule__CSSDefaultValue__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:847:2: rule__CSSDefaultValue__Alternatives
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__Alternatives_in_ruleCSSDefaultValue1648);
            rule__CSSDefaultValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCSSDefaultValue"


    // $ANTLR start "rule__PackageDefinition__Alternatives_3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:859:1: rule__PackageDefinition__Alternatives_3 : ( ( ( rule__PackageDefinition__RulesAssignment_3_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) ) );
    public final void rule__PackageDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:863:1: ( ( ( rule__PackageDefinition__RulesAssignment_3_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:864:1: ( ( rule__PackageDefinition__RulesAssignment_3_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:864:1: ( ( rule__PackageDefinition__RulesAssignment_3_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:865:1: ( rule__PackageDefinition__RulesAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getRulesAssignment_3_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:866:1: ( rule__PackageDefinition__RulesAssignment_3_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:866:2: rule__PackageDefinition__RulesAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__PackageDefinition__RulesAssignment_3_0_in_rule__PackageDefinition__Alternatives_31684);
                    rule__PackageDefinition__RulesAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageDefinitionAccess().getRulesAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:870:6: ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:870:6: ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:871:1: ( rule__PackageDefinition__SubpackagesAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getSubpackagesAssignment_3_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:872:1: ( rule__PackageDefinition__SubpackagesAssignment_3_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:872:2: rule__PackageDefinition__SubpackagesAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__PackageDefinition__SubpackagesAssignment_3_1_in_rule__PackageDefinition__Alternatives_31702);
                    rule__PackageDefinition__SubpackagesAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageDefinitionAccess().getSubpackagesAssignment_3_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:876:6: ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:876:6: ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:877:1: ( rule__PackageDefinition__ElementsAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getElementsAssignment_3_2()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:878:1: ( rule__PackageDefinition__ElementsAssignment_3_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:878:2: rule__PackageDefinition__ElementsAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__PackageDefinition__ElementsAssignment_3_2_in_rule__PackageDefinition__Alternatives_31720);
                    rule__PackageDefinition__ElementsAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageDefinitionAccess().getElementsAssignment_3_2()); 
                    }

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
    // $ANTLR end "rule__PackageDefinition__Alternatives_3"


    // $ANTLR start "rule__CSSType__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:887:1: rule__CSSType__Alternatives : ( ( ( rule__CSSType__Group_0__0 ) ) | ( ( rule__CSSType__Group_1__0 ) ) | ( ( rule__CSSType__TypeAssignment_2 ) ) );
    public final void rule__CSSType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:891:1: ( ( ( rule__CSSType__Group_0__0 ) ) | ( ( rule__CSSType__Group_1__0 ) ) | ( ( rule__CSSType__TypeAssignment_2 ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==35) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==23) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==RULE_INT) ) {
                        alt2=1;
                    }
                    else if ( (LA2_3==RULE_ID||LA2_3==RULE_REGEX||LA2_3==23||LA2_3==28||LA2_3==33||(LA2_3>=35 && LA2_3<=36)) ) {
                        alt2=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_1==EOF||LA2_1==RULE_ID||LA2_1==RULE_REGEX||(LA2_1>=15 && LA2_1<=17)||(LA2_1>=25 && LA2_1<=28)||(LA2_1>=31 && LA2_1<=36)) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==36) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:892:1: ( ( rule__CSSType__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:892:1: ( ( rule__CSSType__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:893:1: ( rule__CSSType__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:894:1: ( rule__CSSType__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:894:2: rule__CSSType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CSSType__Group_0__0_in_rule__CSSType__Alternatives1753);
                    rule__CSSType__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:898:6: ( ( rule__CSSType__Group_1__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:898:6: ( ( rule__CSSType__Group_1__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:899:1: ( rule__CSSType__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:900:1: ( rule__CSSType__Group_1__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:900:2: rule__CSSType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSType__Group_1__0_in_rule__CSSType__Alternatives1771);
                    rule__CSSType__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:904:6: ( ( rule__CSSType__TypeAssignment_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:904:6: ( ( rule__CSSType__TypeAssignment_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:905:1: ( rule__CSSType__TypeAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getTypeAssignment_2()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:906:1: ( rule__CSSType__TypeAssignment_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:906:2: rule__CSSType__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__CSSType__TypeAssignment_2_in_rule__CSSType__Alternatives1789);
                    rule__CSSType__TypeAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getTypeAssignment_2()); 
                    }

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
    // $ANTLR end "rule__CSSType__Alternatives"


    // $ANTLR start "rule__ElementDeclartion__Alternatives_3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:915:1: rule__ElementDeclartion__Alternatives_3 : ( ( ( rule__ElementDeclartion__PropertiesAssignment_3_0 ) ) | ( ( rule__ElementDeclartion__PseudoClassesAssignment_3_1 ) ) );
    public final void rule__ElementDeclartion__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:919:1: ( ( ( rule__ElementDeclartion__PropertiesAssignment_3_0 ) ) | ( ( rule__ElementDeclartion__PseudoClassesAssignment_3_1 ) ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_JDOC:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_PSEUDO) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_PSEUDO:
                {
                alt3=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:920:1: ( ( rule__ElementDeclartion__PropertiesAssignment_3_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:920:1: ( ( rule__ElementDeclartion__PropertiesAssignment_3_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:921:1: ( rule__ElementDeclartion__PropertiesAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDeclartionAccess().getPropertiesAssignment_3_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:922:1: ( rule__ElementDeclartion__PropertiesAssignment_3_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:922:2: rule__ElementDeclartion__PropertiesAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__ElementDeclartion__PropertiesAssignment_3_0_in_rule__ElementDeclartion__Alternatives_31822);
                    rule__ElementDeclartion__PropertiesAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementDeclartionAccess().getPropertiesAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:926:6: ( ( rule__ElementDeclartion__PseudoClassesAssignment_3_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:926:6: ( ( rule__ElementDeclartion__PseudoClassesAssignment_3_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:927:1: ( rule__ElementDeclartion__PseudoClassesAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDeclartionAccess().getPseudoClassesAssignment_3_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:928:1: ( rule__ElementDeclartion__PseudoClassesAssignment_3_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:928:2: rule__ElementDeclartion__PseudoClassesAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ElementDeclartion__PseudoClassesAssignment_3_1_in_rule__ElementDeclartion__Alternatives_31840);
                    rule__ElementDeclartion__PseudoClassesAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementDeclartionAccess().getPseudoClassesAssignment_3_1()); 
                    }

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
    // $ANTLR end "rule__ElementDeclartion__Alternatives_3"


    // $ANTLR start "rule__CSSRulePostfix__CardinalityAlternatives_1_1_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:937:1: rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 : ( ( '*' ) | ( '+' ) | ( '?' ) );
    public final void rule__CSSRulePostfix__CardinalityAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:941:1: ( ( '*' ) | ( '+' ) | ( '?' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:942:1: ( '*' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:942:1: ( '*' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:943:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_01874); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:950:6: ( '+' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:950:6: ( '+' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:951:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_01894); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:958:6: ( '?' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:958:6: ( '?' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:959:1: '?'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityQuestionMarkKeyword_1_1_0_2()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_01914); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityQuestionMarkKeyword_1_1_0_2()); 
                    }

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
    // $ANTLR end "rule__CSSRulePostfix__CardinalityAlternatives_1_1_0"


    // $ANTLR start "rule__CSSRulePrimary__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:971:1: rule__CSSRulePrimary__Alternatives : ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracket ) | ( ruleCSSRuleParenthesis ) | ( ( rule__CSSRulePrimary__Group_3__0 ) ) | ( ruleCSSBaseType ) | ( ruleCSSRuleRegex ) );
    public final void rule__CSSRulePrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:975:1: ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracket ) | ( ruleCSSRuleParenthesis ) | ( ( rule__CSSRulePrimary__Group_3__0 ) ) | ( ruleCSSBaseType ) | ( ruleCSSRuleRegex ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
                {
                alt5=4;
                }
                break;
            case 35:
            case 36:
                {
                alt5=5;
                }
                break;
            case RULE_REGEX:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:976:1: ( ruleCSSRuleRef )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:976:1: ( ruleCSSRuleRef )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:977:1: ruleCSSRuleRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleRef_in_rule__CSSRulePrimary__Alternatives1948);
                    ruleCSSRuleRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:982:6: ( ruleCSSRuleBracket )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:982:6: ( ruleCSSRuleBracket )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:983:1: ruleCSSRuleBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleBracketParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleBracket_in_rule__CSSRulePrimary__Alternatives1965);
                    ruleCSSRuleBracket();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleBracketParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:988:6: ( ruleCSSRuleParenthesis )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:988:6: ( ruleCSSRuleParenthesis )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:989:1: ruleCSSRuleParenthesis
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleParenthesisParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleParenthesis_in_rule__CSSRulePrimary__Alternatives1982);
                    ruleCSSRuleParenthesis();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleParenthesisParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:994:6: ( ( rule__CSSRulePrimary__Group_3__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:994:6: ( ( rule__CSSRulePrimary__Group_3__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:995:1: ( rule__CSSRulePrimary__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getGroup_3()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:996:1: ( rule__CSSRulePrimary__Group_3__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:996:2: rule__CSSRulePrimary__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CSSRulePrimary__Group_3__0_in_rule__CSSRulePrimary__Alternatives1999);
                    rule__CSSRulePrimary__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1000:6: ( ruleCSSBaseType )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1000:6: ( ruleCSSBaseType )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1001:1: ruleCSSBaseType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleCSSBaseType_in_rule__CSSRulePrimary__Alternatives2017);
                    ruleCSSBaseType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1006:6: ( ruleCSSRuleRegex )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1006:6: ( ruleCSSRuleRegex )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1007:1: ruleCSSRuleRegex
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRegexParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleRegex_in_rule__CSSRulePrimary__Alternatives2034);
                    ruleCSSRuleRegex();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRegexParserRuleCall_5()); 
                    }

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
    // $ANTLR end "rule__CSSRulePrimary__Alternatives"


    // $ANTLR start "rule__CSSDefaultValue__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1017:1: rule__CSSDefaultValue__Alternatives : ( ( ( rule__CSSDefaultValue__Group_0__0 ) ) | ( ( rule__CSSDefaultValue__IvalAssignment_1 ) ) | ( ( rule__CSSDefaultValue__DvalAssignment_2 ) ) | ( ( rule__CSSDefaultValue__SvalAssignment_3 ) ) );
    public final void rule__CSSDefaultValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1021:1: ( ( ( rule__CSSDefaultValue__Group_0__0 ) ) | ( ( rule__CSSDefaultValue__IvalAssignment_1 ) ) | ( ( rule__CSSDefaultValue__DvalAssignment_2 ) ) | ( ( rule__CSSDefaultValue__SvalAssignment_3 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt6=3;
                }
                break;
            case RULE_STRING:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1022:1: ( ( rule__CSSDefaultValue__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1022:1: ( ( rule__CSSDefaultValue__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1023:1: ( rule__CSSDefaultValue__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getGroup_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1024:1: ( rule__CSSDefaultValue__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1024:2: rule__CSSDefaultValue__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CSSDefaultValue__Group_0__0_in_rule__CSSDefaultValue__Alternatives2066);
                    rule__CSSDefaultValue__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1028:6: ( ( rule__CSSDefaultValue__IvalAssignment_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1028:6: ( ( rule__CSSDefaultValue__IvalAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1029:1: ( rule__CSSDefaultValue__IvalAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getIvalAssignment_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1030:1: ( rule__CSSDefaultValue__IvalAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1030:2: rule__CSSDefaultValue__IvalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CSSDefaultValue__IvalAssignment_1_in_rule__CSSDefaultValue__Alternatives2084);
                    rule__CSSDefaultValue__IvalAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getIvalAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1034:6: ( ( rule__CSSDefaultValue__DvalAssignment_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1034:6: ( ( rule__CSSDefaultValue__DvalAssignment_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1035:1: ( rule__CSSDefaultValue__DvalAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getDvalAssignment_2()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1036:1: ( rule__CSSDefaultValue__DvalAssignment_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1036:2: rule__CSSDefaultValue__DvalAssignment_2
                    {
                    pushFollow(FOLLOW_rule__CSSDefaultValue__DvalAssignment_2_in_rule__CSSDefaultValue__Alternatives2102);
                    rule__CSSDefaultValue__DvalAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getDvalAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1040:6: ( ( rule__CSSDefaultValue__SvalAssignment_3 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1040:6: ( ( rule__CSSDefaultValue__SvalAssignment_3 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1041:1: ( rule__CSSDefaultValue__SvalAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getSvalAssignment_3()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1042:1: ( rule__CSSDefaultValue__SvalAssignment_3 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1042:2: rule__CSSDefaultValue__SvalAssignment_3
                    {
                    pushFollow(FOLLOW_rule__CSSDefaultValue__SvalAssignment_3_in_rule__CSSDefaultValue__Alternatives2120);
                    rule__CSSDefaultValue__SvalAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getSvalAssignment_3()); 
                    }

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
    // $ANTLR end "rule__CSSDefaultValue__Alternatives"


    // $ANTLR start "rule__CssExtension__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1053:1: rule__CssExtension__Group__0 : rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1 ;
    public final void rule__CssExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1057:1: ( rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1058:2: rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1
            {
            pushFollow(FOLLOW_rule__CssExtension__Group__0__Impl_in_rule__CssExtension__Group__02151);
            rule__CssExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CssExtension__Group__1_in_rule__CssExtension__Group__02154);
            rule__CssExtension__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CssExtension__Group__0"


    // $ANTLR start "rule__CssExtension__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1065:1: rule__CssExtension__Group__0__Impl : ( ( rule__CssExtension__ImportsAssignment_0 )* ) ;
    public final void rule__CssExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1069:1: ( ( ( rule__CssExtension__ImportsAssignment_0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1070:1: ( ( rule__CssExtension__ImportsAssignment_0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1070:1: ( ( rule__CssExtension__ImportsAssignment_0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1071:1: ( rule__CssExtension__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getImportsAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1072:1: ( rule__CssExtension__ImportsAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1072:2: rule__CssExtension__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__CssExtension__ImportsAssignment_0_in_rule__CssExtension__Group__0__Impl2181);
            	    rule__CssExtension__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getImportsAssignment_0()); 
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
    // $ANTLR end "rule__CssExtension__Group__0__Impl"


    // $ANTLR start "rule__CssExtension__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1082:1: rule__CssExtension__Group__1 : rule__CssExtension__Group__1__Impl ;
    public final void rule__CssExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1086:1: ( rule__CssExtension__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1087:2: rule__CssExtension__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CssExtension__Group__1__Impl_in_rule__CssExtension__Group__12212);
            rule__CssExtension__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CssExtension__Group__1"


    // $ANTLR start "rule__CssExtension__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1093:1: rule__CssExtension__Group__1__Impl : ( ( rule__CssExtension__PackageDefAssignment_1 )? ) ;
    public final void rule__CssExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1097:1: ( ( ( rule__CssExtension__PackageDefAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1098:1: ( ( rule__CssExtension__PackageDefAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1098:1: ( ( rule__CssExtension__PackageDefAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1099:1: ( rule__CssExtension__PackageDefAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getPackageDefAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1100:1: ( rule__CssExtension__PackageDefAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1100:2: rule__CssExtension__PackageDefAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CssExtension__PackageDefAssignment_1_in_rule__CssExtension__Group__1__Impl2239);
                    rule__CssExtension__PackageDefAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getPackageDefAssignment_1()); 
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
    // $ANTLR end "rule__CssExtension__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1114:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1118:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1119:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02274);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02277);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1126:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1130:1: ( ( 'import' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1131:1: ( 'import' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1131:1: ( 'import' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1132:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Import__Group__0__Impl2305); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1145:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1149:1: ( rule__Import__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1150:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12336);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1156:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1160:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1161:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1161:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1162:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1163:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1163:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2363);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1177:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1181:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1182:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02397);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02400);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1189:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1193:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1194:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1194:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1195:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl2427);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1206:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1210:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1211:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12456);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1217:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1221:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1222:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1222:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1223:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1224:1: ( rule__QualifiedName__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==RULE_ID) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1224:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2483);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1238:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1242:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1243:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02518);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02521);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1250:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1254:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1255:1: ( ( '.' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1255:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1256:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1257:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1258:2: '.'
            {
            match(input,19,FOLLOW_19_in_rule__QualifiedName__Group_1__0__Impl2550); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1269:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1273:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1274:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12582);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1280:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1284:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1285:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1285:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1286:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl2609);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1301:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1305:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1306:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__02642);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__02645);
            rule__QualifiedNameWithWildCard__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1313:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1317:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1318:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1318:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1319:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl2672);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1330:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1334:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1335:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__12701);
            rule__QualifiedNameWithWildCard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1341:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1345:1: ( ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1346:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1346:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1347:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1348:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1348:2: rule__QualifiedNameWithWildCard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl2728);
                    rule__QualifiedNameWithWildCard__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1362:1: rule__QualifiedNameWithWildCard__Group_1__0 : rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1366:1: ( rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1367:2: rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__02763);
            rule__QualifiedNameWithWildCard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__02766);
            rule__QualifiedNameWithWildCard__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__0"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1374:1: rule__QualifiedNameWithWildCard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1378:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1379:1: ( '.' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1379:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1380:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl2794); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1393:1: rule__QualifiedNameWithWildCard__Group_1__1 : rule__QualifiedNameWithWildCard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1397:1: ( rule__QualifiedNameWithWildCard__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1398:2: rule__QualifiedNameWithWildCard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__12825);
            rule__QualifiedNameWithWildCard__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__1"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1404:1: rule__QualifiedNameWithWildCard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1408:1: ( ( '*' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1409:1: ( '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1409:1: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1410:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl2853); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__1__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1427:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1431:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1432:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__0__Impl_in_rule__PackageDefinition__Group__02888);
            rule__PackageDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__1_in_rule__PackageDefinition__Group__02891);
            rule__PackageDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PackageDefinition__Group__0"


    // $ANTLR start "rule__PackageDefinition__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1439:1: rule__PackageDefinition__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1443:1: ( ( 'package' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1444:1: ( 'package' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1444:1: ( 'package' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1445:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__PackageDefinition__Group__0__Impl2919); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0()); 
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
    // $ANTLR end "rule__PackageDefinition__Group__0__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1458:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1462:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1463:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__1__Impl_in_rule__PackageDefinition__Group__12950);
            rule__PackageDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__2_in_rule__PackageDefinition__Group__12953);
            rule__PackageDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PackageDefinition__Group__1"


    // $ANTLR start "rule__PackageDefinition__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1470:1: rule__PackageDefinition__Group__1__Impl : ( ( rule__PackageDefinition__NameAssignment_1 ) ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1474:1: ( ( ( rule__PackageDefinition__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1475:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1475:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1476:1: ( rule__PackageDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1477:1: ( rule__PackageDefinition__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1477:2: rule__PackageDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDefinition__NameAssignment_1_in_rule__PackageDefinition__Group__1__Impl2980);
            rule__PackageDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__PackageDefinition__Group__1__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1487:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1491:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1492:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__2__Impl_in_rule__PackageDefinition__Group__23010);
            rule__PackageDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__3_in_rule__PackageDefinition__Group__23013);
            rule__PackageDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PackageDefinition__Group__2"


    // $ANTLR start "rule__PackageDefinition__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1499:1: rule__PackageDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1503:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1504:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1504:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1505:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__PackageDefinition__Group__2__Impl3041); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__PackageDefinition__Group__2__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1518:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1522:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1523:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__3__Impl_in_rule__PackageDefinition__Group__33072);
            rule__PackageDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__4_in_rule__PackageDefinition__Group__33075);
            rule__PackageDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PackageDefinition__Group__3"


    // $ANTLR start "rule__PackageDefinition__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1530:1: rule__PackageDefinition__Group__3__Impl : ( ( rule__PackageDefinition__Alternatives_3 )* ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1534:1: ( ( ( rule__PackageDefinition__Alternatives_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1535:1: ( ( rule__PackageDefinition__Alternatives_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1535:1: ( ( rule__PackageDefinition__Alternatives_3 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1536:1: ( rule__PackageDefinition__Alternatives_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1537:1: ( rule__PackageDefinition__Alternatives_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_JDOC)||LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1537:2: rule__PackageDefinition__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__PackageDefinition__Alternatives_3_in_rule__PackageDefinition__Group__3__Impl3102);
            	    rule__PackageDefinition__Alternatives_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__PackageDefinition__Group__3__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1547:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1551:1: ( rule__PackageDefinition__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1552:2: rule__PackageDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__4__Impl_in_rule__PackageDefinition__Group__43133);
            rule__PackageDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PackageDefinition__Group__4"


    // $ANTLR start "rule__PackageDefinition__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1558:1: rule__PackageDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1562:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1563:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1563:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1564:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__PackageDefinition__Group__4__Impl3161); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__PackageDefinition__Group__4__Impl"


    // $ANTLR start "rule__CSSType__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1587:1: rule__CSSType__Group_0__0 : rule__CSSType__Group_0__0__Impl rule__CSSType__Group_0__1 ;
    public final void rule__CSSType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1591:1: ( rule__CSSType__Group_0__0__Impl rule__CSSType__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1592:2: rule__CSSType__Group_0__0__Impl rule__CSSType__Group_0__1
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__0__Impl_in_rule__CSSType__Group_0__03202);
            rule__CSSType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__1_in_rule__CSSType__Group_0__03205);
            rule__CSSType__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSType__Group_0__0"


    // $ANTLR start "rule__CSSType__Group_0__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1599:1: rule__CSSType__Group_0__0__Impl : ( () ) ;
    public final void rule__CSSType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1603:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1604:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1604:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1605:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getCSSRangedIntTypeAction_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1606:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1608:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getCSSRangedIntTypeAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__0__Impl"


    // $ANTLR start "rule__CSSType__Group_0__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1618:1: rule__CSSType__Group_0__1 : rule__CSSType__Group_0__1__Impl rule__CSSType__Group_0__2 ;
    public final void rule__CSSType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1622:1: ( rule__CSSType__Group_0__1__Impl rule__CSSType__Group_0__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1623:2: rule__CSSType__Group_0__1__Impl rule__CSSType__Group_0__2
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__1__Impl_in_rule__CSSType__Group_0__13263);
            rule__CSSType__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__2_in_rule__CSSType__Group_0__13266);
            rule__CSSType__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSType__Group_0__1"


    // $ANTLR start "rule__CSSType__Group_0__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1630:1: rule__CSSType__Group_0__1__Impl : ( ( rule__CSSType__TypeAssignment_0_1 ) ) ;
    public final void rule__CSSType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1634:1: ( ( ( rule__CSSType__TypeAssignment_0_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1635:1: ( ( rule__CSSType__TypeAssignment_0_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1635:1: ( ( rule__CSSType__TypeAssignment_0_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1636:1: ( rule__CSSType__TypeAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_0_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1637:1: ( rule__CSSType__TypeAssignment_0_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1637:2: rule__CSSType__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__CSSType__TypeAssignment_0_1_in_rule__CSSType__Group_0__1__Impl3293);
            rule__CSSType__TypeAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_0_1()); 
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
    // $ANTLR end "rule__CSSType__Group_0__1__Impl"


    // $ANTLR start "rule__CSSType__Group_0__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1647:1: rule__CSSType__Group_0__2 : rule__CSSType__Group_0__2__Impl rule__CSSType__Group_0__3 ;
    public final void rule__CSSType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1651:1: ( rule__CSSType__Group_0__2__Impl rule__CSSType__Group_0__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1652:2: rule__CSSType__Group_0__2__Impl rule__CSSType__Group_0__3
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__2__Impl_in_rule__CSSType__Group_0__23323);
            rule__CSSType__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__3_in_rule__CSSType__Group_0__23326);
            rule__CSSType__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSType__Group_0__2"


    // $ANTLR start "rule__CSSType__Group_0__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1659:1: rule__CSSType__Group_0__2__Impl : ( '(' ) ;
    public final void rule__CSSType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1663:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1664:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1664:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1665:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__CSSType__Group_0__2__Impl3354); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_0_2()); 
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
    // $ANTLR end "rule__CSSType__Group_0__2__Impl"


    // $ANTLR start "rule__CSSType__Group_0__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1678:1: rule__CSSType__Group_0__3 : rule__CSSType__Group_0__3__Impl rule__CSSType__Group_0__4 ;
    public final void rule__CSSType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1682:1: ( rule__CSSType__Group_0__3__Impl rule__CSSType__Group_0__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1683:2: rule__CSSType__Group_0__3__Impl rule__CSSType__Group_0__4
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__3__Impl_in_rule__CSSType__Group_0__33385);
            rule__CSSType__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__4_in_rule__CSSType__Group_0__33388);
            rule__CSSType__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSType__Group_0__3"


    // $ANTLR start "rule__CSSType__Group_0__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1690:1: rule__CSSType__Group_0__3__Impl : ( ( rule__CSSType__FromAssignment_0_3 ) ) ;
    public final void rule__CSSType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1694:1: ( ( ( rule__CSSType__FromAssignment_0_3 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1695:1: ( ( rule__CSSType__FromAssignment_0_3 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1695:1: ( ( rule__CSSType__FromAssignment_0_3 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1696:1: ( rule__CSSType__FromAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromAssignment_0_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1697:1: ( rule__CSSType__FromAssignment_0_3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1697:2: rule__CSSType__FromAssignment_0_3
            {
            pushFollow(FOLLOW_rule__CSSType__FromAssignment_0_3_in_rule__CSSType__Group_0__3__Impl3415);
            rule__CSSType__FromAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromAssignment_0_3()); 
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
    // $ANTLR end "rule__CSSType__Group_0__3__Impl"


    // $ANTLR start "rule__CSSType__Group_0__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1707:1: rule__CSSType__Group_0__4 : rule__CSSType__Group_0__4__Impl rule__CSSType__Group_0__5 ;
    public final void rule__CSSType__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1711:1: ( rule__CSSType__Group_0__4__Impl rule__CSSType__Group_0__5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1712:2: rule__CSSType__Group_0__4__Impl rule__CSSType__Group_0__5
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__4__Impl_in_rule__CSSType__Group_0__43445);
            rule__CSSType__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__5_in_rule__CSSType__Group_0__43448);
            rule__CSSType__Group_0__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSType__Group_0__4"


    // $ANTLR start "rule__CSSType__Group_0__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1719:1: rule__CSSType__Group_0__4__Impl : ( '->' ) ;
    public final void rule__CSSType__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1723:1: ( ( '->' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1724:1: ( '->' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1724:1: ( '->' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1725:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_0_4()); 
            }
            match(input,24,FOLLOW_24_in_rule__CSSType__Group_0__4__Impl3476); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_0_4()); 
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
    // $ANTLR end "rule__CSSType__Group_0__4__Impl"


    // $ANTLR start "rule__CSSType__Group_0__5"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1738:1: rule__CSSType__Group_0__5 : rule__CSSType__Group_0__5__Impl rule__CSSType__Group_0__6 ;
    public final void rule__CSSType__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1742:1: ( rule__CSSType__Group_0__5__Impl rule__CSSType__Group_0__6 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1743:2: rule__CSSType__Group_0__5__Impl rule__CSSType__Group_0__6
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__5__Impl_in_rule__CSSType__Group_0__53507);
            rule__CSSType__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__6_in_rule__CSSType__Group_0__53510);
            rule__CSSType__Group_0__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSType__Group_0__5"


    // $ANTLR start "rule__CSSType__Group_0__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1750:1: rule__CSSType__Group_0__5__Impl : ( ( rule__CSSType__ToAssignment_0_5 ) ) ;
    public final void rule__CSSType__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1754:1: ( ( ( rule__CSSType__ToAssignment_0_5 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1755:1: ( ( rule__CSSType__ToAssignment_0_5 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1755:1: ( ( rule__CSSType__ToAssignment_0_5 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1756:1: ( rule__CSSType__ToAssignment_0_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToAssignment_0_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1757:1: ( rule__CSSType__ToAssignment_0_5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1757:2: rule__CSSType__ToAssignment_0_5
            {
            pushFollow(FOLLOW_rule__CSSType__ToAssignment_0_5_in_rule__CSSType__Group_0__5__Impl3537);
            rule__CSSType__ToAssignment_0_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToAssignment_0_5()); 
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
    // $ANTLR end "rule__CSSType__Group_0__5__Impl"


    // $ANTLR start "rule__CSSType__Group_0__6"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1767:1: rule__CSSType__Group_0__6 : rule__CSSType__Group_0__6__Impl ;
    public final void rule__CSSType__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1771:1: ( rule__CSSType__Group_0__6__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1772:2: rule__CSSType__Group_0__6__Impl
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__6__Impl_in_rule__CSSType__Group_0__63567);
            rule__CSSType__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSType__Group_0__6"


    // $ANTLR start "rule__CSSType__Group_0__6__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1778:1: rule__CSSType__Group_0__6__Impl : ( ')' ) ;
    public final void rule__CSSType__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1782:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1783:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1783:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1784:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_0_6()); 
            }
            match(input,25,FOLLOW_25_in_rule__CSSType__Group_0__6__Impl3595); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_0_6()); 
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
    // $ANTLR end "rule__CSSType__Group_0__6__Impl"


    // $ANTLR start "rule__CSSType__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1811:1: rule__CSSType__Group_1__0 : rule__CSSType__Group_1__0__Impl rule__CSSType__Group_1__1 ;
    public final void rule__CSSType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1815:1: ( rule__CSSType__Group_1__0__Impl rule__CSSType__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1816:2: rule__CSSType__Group_1__0__Impl rule__CSSType__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__0__Impl_in_rule__CSSType__Group_1__03640);
            rule__CSSType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__1_in_rule__CSSType__Group_1__03643);
            rule__CSSType__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSType__Group_1__0"


    // $ANTLR start "rule__CSSType__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1823:1: rule__CSSType__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1827:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1828:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1828:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1829:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getCSSRangedDoubleTypeAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1830:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1832:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getCSSRangedDoubleTypeAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__0__Impl"


    // $ANTLR start "rule__CSSType__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1842:1: rule__CSSType__Group_1__1 : rule__CSSType__Group_1__1__Impl rule__CSSType__Group_1__2 ;
    public final void rule__CSSType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1846:1: ( rule__CSSType__Group_1__1__Impl rule__CSSType__Group_1__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1847:2: rule__CSSType__Group_1__1__Impl rule__CSSType__Group_1__2
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__1__Impl_in_rule__CSSType__Group_1__13701);
            rule__CSSType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__2_in_rule__CSSType__Group_1__13704);
            rule__CSSType__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSType__Group_1__1"


    // $ANTLR start "rule__CSSType__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1854:1: rule__CSSType__Group_1__1__Impl : ( ( rule__CSSType__TypeAssignment_1_1 ) ) ;
    public final void rule__CSSType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1858:1: ( ( ( rule__CSSType__TypeAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1859:1: ( ( rule__CSSType__TypeAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1859:1: ( ( rule__CSSType__TypeAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1860:1: ( rule__CSSType__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1861:1: ( rule__CSSType__TypeAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1861:2: rule__CSSType__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CSSType__TypeAssignment_1_1_in_rule__CSSType__Group_1__1__Impl3731);
            rule__CSSType__TypeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_1_1()); 
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
    // $ANTLR end "rule__CSSType__Group_1__1__Impl"


    // $ANTLR start "rule__CSSType__Group_1__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1871:1: rule__CSSType__Group_1__2 : rule__CSSType__Group_1__2__Impl rule__CSSType__Group_1__3 ;
    public final void rule__CSSType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1875:1: ( rule__CSSType__Group_1__2__Impl rule__CSSType__Group_1__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1876:2: rule__CSSType__Group_1__2__Impl rule__CSSType__Group_1__3
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__2__Impl_in_rule__CSSType__Group_1__23761);
            rule__CSSType__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__3_in_rule__CSSType__Group_1__23764);
            rule__CSSType__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSType__Group_1__2"


    // $ANTLR start "rule__CSSType__Group_1__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1883:1: rule__CSSType__Group_1__2__Impl : ( '(' ) ;
    public final void rule__CSSType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1887:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1888:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1888:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1889:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_1_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__CSSType__Group_1__2__Impl3792); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_1_2()); 
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
    // $ANTLR end "rule__CSSType__Group_1__2__Impl"


    // $ANTLR start "rule__CSSType__Group_1__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1902:1: rule__CSSType__Group_1__3 : rule__CSSType__Group_1__3__Impl rule__CSSType__Group_1__4 ;
    public final void rule__CSSType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1906:1: ( rule__CSSType__Group_1__3__Impl rule__CSSType__Group_1__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1907:2: rule__CSSType__Group_1__3__Impl rule__CSSType__Group_1__4
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__3__Impl_in_rule__CSSType__Group_1__33823);
            rule__CSSType__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__4_in_rule__CSSType__Group_1__33826);
            rule__CSSType__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSType__Group_1__3"


    // $ANTLR start "rule__CSSType__Group_1__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1914:1: rule__CSSType__Group_1__3__Impl : ( ( rule__CSSType__FromAssignment_1_3 ) ) ;
    public final void rule__CSSType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1918:1: ( ( ( rule__CSSType__FromAssignment_1_3 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1919:1: ( ( rule__CSSType__FromAssignment_1_3 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1919:1: ( ( rule__CSSType__FromAssignment_1_3 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1920:1: ( rule__CSSType__FromAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromAssignment_1_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1921:1: ( rule__CSSType__FromAssignment_1_3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1921:2: rule__CSSType__FromAssignment_1_3
            {
            pushFollow(FOLLOW_rule__CSSType__FromAssignment_1_3_in_rule__CSSType__Group_1__3__Impl3853);
            rule__CSSType__FromAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromAssignment_1_3()); 
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
    // $ANTLR end "rule__CSSType__Group_1__3__Impl"


    // $ANTLR start "rule__CSSType__Group_1__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1931:1: rule__CSSType__Group_1__4 : rule__CSSType__Group_1__4__Impl rule__CSSType__Group_1__5 ;
    public final void rule__CSSType__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1935:1: ( rule__CSSType__Group_1__4__Impl rule__CSSType__Group_1__5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1936:2: rule__CSSType__Group_1__4__Impl rule__CSSType__Group_1__5
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__4__Impl_in_rule__CSSType__Group_1__43883);
            rule__CSSType__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__5_in_rule__CSSType__Group_1__43886);
            rule__CSSType__Group_1__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSType__Group_1__4"


    // $ANTLR start "rule__CSSType__Group_1__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1943:1: rule__CSSType__Group_1__4__Impl : ( '->' ) ;
    public final void rule__CSSType__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1947:1: ( ( '->' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1948:1: ( '->' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1948:1: ( '->' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1949:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_4()); 
            }
            match(input,24,FOLLOW_24_in_rule__CSSType__Group_1__4__Impl3914); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_4()); 
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
    // $ANTLR end "rule__CSSType__Group_1__4__Impl"


    // $ANTLR start "rule__CSSType__Group_1__5"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1962:1: rule__CSSType__Group_1__5 : rule__CSSType__Group_1__5__Impl rule__CSSType__Group_1__6 ;
    public final void rule__CSSType__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1966:1: ( rule__CSSType__Group_1__5__Impl rule__CSSType__Group_1__6 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1967:2: rule__CSSType__Group_1__5__Impl rule__CSSType__Group_1__6
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__5__Impl_in_rule__CSSType__Group_1__53945);
            rule__CSSType__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__6_in_rule__CSSType__Group_1__53948);
            rule__CSSType__Group_1__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSType__Group_1__5"


    // $ANTLR start "rule__CSSType__Group_1__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1974:1: rule__CSSType__Group_1__5__Impl : ( ( rule__CSSType__ToAssignment_1_5 ) ) ;
    public final void rule__CSSType__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1978:1: ( ( ( rule__CSSType__ToAssignment_1_5 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1979:1: ( ( rule__CSSType__ToAssignment_1_5 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1979:1: ( ( rule__CSSType__ToAssignment_1_5 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1980:1: ( rule__CSSType__ToAssignment_1_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToAssignment_1_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1981:1: ( rule__CSSType__ToAssignment_1_5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1981:2: rule__CSSType__ToAssignment_1_5
            {
            pushFollow(FOLLOW_rule__CSSType__ToAssignment_1_5_in_rule__CSSType__Group_1__5__Impl3975);
            rule__CSSType__ToAssignment_1_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToAssignment_1_5()); 
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
    // $ANTLR end "rule__CSSType__Group_1__5__Impl"


    // $ANTLR start "rule__CSSType__Group_1__6"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1991:1: rule__CSSType__Group_1__6 : rule__CSSType__Group_1__6__Impl ;
    public final void rule__CSSType__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1995:1: ( rule__CSSType__Group_1__6__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1996:2: rule__CSSType__Group_1__6__Impl
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__6__Impl_in_rule__CSSType__Group_1__64005);
            rule__CSSType__Group_1__6__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSType__Group_1__6"


    // $ANTLR start "rule__CSSType__Group_1__6__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2002:1: rule__CSSType__Group_1__6__Impl : ( ')' ) ;
    public final void rule__CSSType__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2006:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2007:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2007:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2008:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_1_6()); 
            }
            match(input,25,FOLLOW_25_in_rule__CSSType__Group_1__6__Impl4033); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_1_6()); 
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
    // $ANTLR end "rule__CSSType__Group_1__6__Impl"


    // $ANTLR start "rule__ElementDeclartion__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2035:1: rule__ElementDeclartion__Group__0 : rule__ElementDeclartion__Group__0__Impl rule__ElementDeclartion__Group__1 ;
    public final void rule__ElementDeclartion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2039:1: ( rule__ElementDeclartion__Group__0__Impl rule__ElementDeclartion__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2040:2: rule__ElementDeclartion__Group__0__Impl rule__ElementDeclartion__Group__1
            {
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__0__Impl_in_rule__ElementDeclartion__Group__04078);
            rule__ElementDeclartion__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__1_in_rule__ElementDeclartion__Group__04081);
            rule__ElementDeclartion__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ElementDeclartion__Group__0"


    // $ANTLR start "rule__ElementDeclartion__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2047:1: rule__ElementDeclartion__Group__0__Impl : ( ( rule__ElementDeclartion__DokuAssignment_0 )? ) ;
    public final void rule__ElementDeclartion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2051:1: ( ( ( rule__ElementDeclartion__DokuAssignment_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2052:1: ( ( rule__ElementDeclartion__DokuAssignment_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2052:1: ( ( rule__ElementDeclartion__DokuAssignment_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2053:1: ( rule__ElementDeclartion__DokuAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getDokuAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2054:1: ( rule__ElementDeclartion__DokuAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_JDOC) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2054:2: rule__ElementDeclartion__DokuAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ElementDeclartion__DokuAssignment_0_in_rule__ElementDeclartion__Group__0__Impl4108);
                    rule__ElementDeclartion__DokuAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDeclartionAccess().getDokuAssignment_0()); 
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
    // $ANTLR end "rule__ElementDeclartion__Group__0__Impl"


    // $ANTLR start "rule__ElementDeclartion__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2064:1: rule__ElementDeclartion__Group__1 : rule__ElementDeclartion__Group__1__Impl rule__ElementDeclartion__Group__2 ;
    public final void rule__ElementDeclartion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2068:1: ( rule__ElementDeclartion__Group__1__Impl rule__ElementDeclartion__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2069:2: rule__ElementDeclartion__Group__1__Impl rule__ElementDeclartion__Group__2
            {
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__1__Impl_in_rule__ElementDeclartion__Group__14139);
            rule__ElementDeclartion__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__2_in_rule__ElementDeclartion__Group__14142);
            rule__ElementDeclartion__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ElementDeclartion__Group__1"


    // $ANTLR start "rule__ElementDeclartion__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2076:1: rule__ElementDeclartion__Group__1__Impl : ( ( rule__ElementDeclartion__NameAssignment_1 ) ) ;
    public final void rule__ElementDeclartion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2080:1: ( ( ( rule__ElementDeclartion__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2081:1: ( ( rule__ElementDeclartion__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2081:1: ( ( rule__ElementDeclartion__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2082:1: ( rule__ElementDeclartion__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2083:1: ( rule__ElementDeclartion__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2083:2: rule__ElementDeclartion__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ElementDeclartion__NameAssignment_1_in_rule__ElementDeclartion__Group__1__Impl4169);
            rule__ElementDeclartion__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDeclartionAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ElementDeclartion__Group__1__Impl"


    // $ANTLR start "rule__ElementDeclartion__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2093:1: rule__ElementDeclartion__Group__2 : rule__ElementDeclartion__Group__2__Impl rule__ElementDeclartion__Group__3 ;
    public final void rule__ElementDeclartion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2097:1: ( rule__ElementDeclartion__Group__2__Impl rule__ElementDeclartion__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2098:2: rule__ElementDeclartion__Group__2__Impl rule__ElementDeclartion__Group__3
            {
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__2__Impl_in_rule__ElementDeclartion__Group__24199);
            rule__ElementDeclartion__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__3_in_rule__ElementDeclartion__Group__24202);
            rule__ElementDeclartion__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ElementDeclartion__Group__2"


    // $ANTLR start "rule__ElementDeclartion__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2105:1: rule__ElementDeclartion__Group__2__Impl : ( '{' ) ;
    public final void rule__ElementDeclartion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2109:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2110:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2110:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2111:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__ElementDeclartion__Group__2__Impl4230); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDeclartionAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__ElementDeclartion__Group__2__Impl"


    // $ANTLR start "rule__ElementDeclartion__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2124:1: rule__ElementDeclartion__Group__3 : rule__ElementDeclartion__Group__3__Impl rule__ElementDeclartion__Group__4 ;
    public final void rule__ElementDeclartion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2128:1: ( rule__ElementDeclartion__Group__3__Impl rule__ElementDeclartion__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2129:2: rule__ElementDeclartion__Group__3__Impl rule__ElementDeclartion__Group__4
            {
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__3__Impl_in_rule__ElementDeclartion__Group__34261);
            rule__ElementDeclartion__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__4_in_rule__ElementDeclartion__Group__34264);
            rule__ElementDeclartion__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ElementDeclartion__Group__3"


    // $ANTLR start "rule__ElementDeclartion__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2136:1: rule__ElementDeclartion__Group__3__Impl : ( ( rule__ElementDeclartion__Alternatives_3 )* ) ;
    public final void rule__ElementDeclartion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2140:1: ( ( ( rule__ElementDeclartion__Alternatives_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2141:1: ( ( rule__ElementDeclartion__Alternatives_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2141:1: ( ( rule__ElementDeclartion__Alternatives_3 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2142:1: ( rule__ElementDeclartion__Alternatives_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2143:1: ( rule__ElementDeclartion__Alternatives_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_JDOC)||LA13_0==RULE_PSEUDO) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2143:2: rule__ElementDeclartion__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__ElementDeclartion__Alternatives_3_in_rule__ElementDeclartion__Group__3__Impl4291);
            	    rule__ElementDeclartion__Alternatives_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDeclartionAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__ElementDeclartion__Group__3__Impl"


    // $ANTLR start "rule__ElementDeclartion__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2153:1: rule__ElementDeclartion__Group__4 : rule__ElementDeclartion__Group__4__Impl ;
    public final void rule__ElementDeclartion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2157:1: ( rule__ElementDeclartion__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2158:2: rule__ElementDeclartion__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__4__Impl_in_rule__ElementDeclartion__Group__44322);
            rule__ElementDeclartion__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ElementDeclartion__Group__4"


    // $ANTLR start "rule__ElementDeclartion__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2164:1: rule__ElementDeclartion__Group__4__Impl : ( '}' ) ;
    public final void rule__ElementDeclartion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2168:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2169:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2169:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2170:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__ElementDeclartion__Group__4__Impl4350); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDeclartionAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__ElementDeclartion__Group__4__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2193:1: rule__PropertyDefinition__Group__0 : rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 ;
    public final void rule__PropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2197:1: ( rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2198:2: rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__04391);
            rule__PropertyDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__04394);
            rule__PropertyDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertyDefinition__Group__0"


    // $ANTLR start "rule__PropertyDefinition__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2205:1: rule__PropertyDefinition__Group__0__Impl : ( ( rule__PropertyDefinition__DokuAssignment_0 )? ) ;
    public final void rule__PropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2209:1: ( ( ( rule__PropertyDefinition__DokuAssignment_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2210:1: ( ( rule__PropertyDefinition__DokuAssignment_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2210:1: ( ( rule__PropertyDefinition__DokuAssignment_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2211:1: ( rule__PropertyDefinition__DokuAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDokuAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2212:1: ( rule__PropertyDefinition__DokuAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_JDOC) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2212:2: rule__PropertyDefinition__DokuAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__DokuAssignment_0_in_rule__PropertyDefinition__Group__0__Impl4421);
                    rule__PropertyDefinition__DokuAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDokuAssignment_0()); 
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
    // $ANTLR end "rule__PropertyDefinition__Group__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2222:1: rule__PropertyDefinition__Group__1 : rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 ;
    public final void rule__PropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2226:1: ( rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2227:2: rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__14452);
            rule__PropertyDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__14455);
            rule__PropertyDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertyDefinition__Group__1"


    // $ANTLR start "rule__PropertyDefinition__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2234:1: rule__PropertyDefinition__Group__1__Impl : ( ( rule__PropertyDefinition__NameAssignment_1 ) ) ;
    public final void rule__PropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2238:1: ( ( ( rule__PropertyDefinition__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2239:1: ( ( rule__PropertyDefinition__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2239:1: ( ( rule__PropertyDefinition__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2240:1: ( rule__PropertyDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2241:1: ( rule__PropertyDefinition__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2241:2: rule__PropertyDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__NameAssignment_1_in_rule__PropertyDefinition__Group__1__Impl4482);
            rule__PropertyDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__PropertyDefinition__Group__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2251:1: rule__PropertyDefinition__Group__2 : rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 ;
    public final void rule__PropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2255:1: ( rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2256:2: rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__24512);
            rule__PropertyDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__24515);
            rule__PropertyDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertyDefinition__Group__2"


    // $ANTLR start "rule__PropertyDefinition__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2263:1: rule__PropertyDefinition__Group__2__Impl : ( ( rule__PropertyDefinition__RuleAssignment_2 ) ) ;
    public final void rule__PropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2267:1: ( ( ( rule__PropertyDefinition__RuleAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2268:1: ( ( rule__PropertyDefinition__RuleAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2268:1: ( ( rule__PropertyDefinition__RuleAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2269:1: ( rule__PropertyDefinition__RuleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getRuleAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2270:1: ( rule__PropertyDefinition__RuleAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2270:2: rule__PropertyDefinition__RuleAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__RuleAssignment_2_in_rule__PropertyDefinition__Group__2__Impl4542);
            rule__PropertyDefinition__RuleAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getRuleAssignment_2()); 
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
    // $ANTLR end "rule__PropertyDefinition__Group__2__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2280:1: rule__PropertyDefinition__Group__3 : rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 ;
    public final void rule__PropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2284:1: ( rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2285:2: rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__34572);
            rule__PropertyDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__34575);
            rule__PropertyDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertyDefinition__Group__3"


    // $ANTLR start "rule__PropertyDefinition__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2292:1: rule__PropertyDefinition__Group__3__Impl : ( ( rule__PropertyDefinition__Group_3__0 )? ) ;
    public final void rule__PropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2296:1: ( ( ( rule__PropertyDefinition__Group_3__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2297:1: ( ( rule__PropertyDefinition__Group_3__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2297:1: ( ( rule__PropertyDefinition__Group_3__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2298:1: ( rule__PropertyDefinition__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getGroup_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2299:1: ( rule__PropertyDefinition__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2299:2: rule__PropertyDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__0_in_rule__PropertyDefinition__Group__3__Impl4602);
                    rule__PropertyDefinition__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getGroup_3()); 
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
    // $ANTLR end "rule__PropertyDefinition__Group__3__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2309:1: rule__PropertyDefinition__Group__4 : rule__PropertyDefinition__Group__4__Impl ;
    public final void rule__PropertyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2313:1: ( rule__PropertyDefinition__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2314:2: rule__PropertyDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__44633);
            rule__PropertyDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertyDefinition__Group__4"


    // $ANTLR start "rule__PropertyDefinition__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2320:1: rule__PropertyDefinition__Group__4__Impl : ( ';' ) ;
    public final void rule__PropertyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2324:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2325:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2325:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2326:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_4()); 
            }
            match(input,26,FOLLOW_26_in_rule__PropertyDefinition__Group__4__Impl4661); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__PropertyDefinition__Group__4__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_3__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2349:1: rule__PropertyDefinition__Group_3__0 : rule__PropertyDefinition__Group_3__0__Impl rule__PropertyDefinition__Group_3__1 ;
    public final void rule__PropertyDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2353:1: ( rule__PropertyDefinition__Group_3__0__Impl rule__PropertyDefinition__Group_3__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2354:2: rule__PropertyDefinition__Group_3__0__Impl rule__PropertyDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__0__Impl_in_rule__PropertyDefinition__Group_3__04702);
            rule__PropertyDefinition__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__1_in_rule__PropertyDefinition__Group_3__04705);
            rule__PropertyDefinition__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertyDefinition__Group_3__0"


    // $ANTLR start "rule__PropertyDefinition__Group_3__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2361:1: rule__PropertyDefinition__Group_3__0__Impl : ( 'default:' ) ;
    public final void rule__PropertyDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2365:1: ( ( 'default:' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2366:1: ( 'default:' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2366:1: ( 'default:' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2367:1: 'default:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_3_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__PropertyDefinition__Group_3__0__Impl4733); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_3_0()); 
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
    // $ANTLR end "rule__PropertyDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_3__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2380:1: rule__PropertyDefinition__Group_3__1 : rule__PropertyDefinition__Group_3__1__Impl ;
    public final void rule__PropertyDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2384:1: ( rule__PropertyDefinition__Group_3__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2385:2: rule__PropertyDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__1__Impl_in_rule__PropertyDefinition__Group_3__14764);
            rule__PropertyDefinition__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PropertyDefinition__Group_3__1"


    // $ANTLR start "rule__PropertyDefinition__Group_3__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2391:1: rule__PropertyDefinition__Group_3__1__Impl : ( ( rule__PropertyDefinition__DefaultAssignment_3_1 ) ) ;
    public final void rule__PropertyDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2395:1: ( ( ( rule__PropertyDefinition__DefaultAssignment_3_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2396:1: ( ( rule__PropertyDefinition__DefaultAssignment_3_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2396:1: ( ( rule__PropertyDefinition__DefaultAssignment_3_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2397:1: ( rule__PropertyDefinition__DefaultAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultAssignment_3_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2398:1: ( rule__PropertyDefinition__DefaultAssignment_3_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2398:2: rule__PropertyDefinition__DefaultAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__DefaultAssignment_3_1_in_rule__PropertyDefinition__Group_3__1__Impl4791);
            rule__PropertyDefinition__DefaultAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDefaultAssignment_3_1()); 
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
    // $ANTLR end "rule__PropertyDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__PseudoClassDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2412:1: rule__PseudoClassDefinition__Group__0 : rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1 ;
    public final void rule__PseudoClassDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2416:1: ( rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2417:2: rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__0__Impl_in_rule__PseudoClassDefinition__Group__04825);
            rule__PseudoClassDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__1_in_rule__PseudoClassDefinition__Group__04828);
            rule__PseudoClassDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PseudoClassDefinition__Group__0"


    // $ANTLR start "rule__PseudoClassDefinition__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2424:1: rule__PseudoClassDefinition__Group__0__Impl : ( ( rule__PseudoClassDefinition__DokuAssignment_0 )? ) ;
    public final void rule__PseudoClassDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2428:1: ( ( ( rule__PseudoClassDefinition__DokuAssignment_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2429:1: ( ( rule__PseudoClassDefinition__DokuAssignment_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2429:1: ( ( rule__PseudoClassDefinition__DokuAssignment_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2430:1: ( rule__PseudoClassDefinition__DokuAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getDokuAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2431:1: ( rule__PseudoClassDefinition__DokuAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_JDOC) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2431:2: rule__PseudoClassDefinition__DokuAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PseudoClassDefinition__DokuAssignment_0_in_rule__PseudoClassDefinition__Group__0__Impl4855);
                    rule__PseudoClassDefinition__DokuAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getDokuAssignment_0()); 
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
    // $ANTLR end "rule__PseudoClassDefinition__Group__0__Impl"


    // $ANTLR start "rule__PseudoClassDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2441:1: rule__PseudoClassDefinition__Group__1 : rule__PseudoClassDefinition__Group__1__Impl ;
    public final void rule__PseudoClassDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2445:1: ( rule__PseudoClassDefinition__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2446:2: rule__PseudoClassDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__1__Impl_in_rule__PseudoClassDefinition__Group__14886);
            rule__PseudoClassDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PseudoClassDefinition__Group__1"


    // $ANTLR start "rule__PseudoClassDefinition__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2452:1: rule__PseudoClassDefinition__Group__1__Impl : ( ( rule__PseudoClassDefinition__NameAssignment_1 ) ) ;
    public final void rule__PseudoClassDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2456:1: ( ( ( rule__PseudoClassDefinition__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2457:1: ( ( rule__PseudoClassDefinition__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2457:1: ( ( rule__PseudoClassDefinition__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2458:1: ( rule__PseudoClassDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2459:1: ( rule__PseudoClassDefinition__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2459:2: rule__PseudoClassDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__NameAssignment_1_in_rule__PseudoClassDefinition__Group__1__Impl4913);
            rule__PseudoClassDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__PseudoClassDefinition__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2473:1: rule__CSSRuleRef__Group__0 : rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1 ;
    public final void rule__CSSRuleRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2477:1: ( rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2478:2: rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__0__Impl_in_rule__CSSRuleRef__Group__04947);
            rule__CSSRuleRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__1_in_rule__CSSRuleRef__Group__04950);
            rule__CSSRuleRef__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleRef__Group__0"


    // $ANTLR start "rule__CSSRuleRef__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2485:1: rule__CSSRuleRef__Group__0__Impl : ( '<' ) ;
    public final void rule__CSSRuleRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2489:1: ( ( '<' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2490:1: ( '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2490:1: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2491:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__CSSRuleRef__Group__0__Impl4978); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_0()); 
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
    // $ANTLR end "rule__CSSRuleRef__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2504:1: rule__CSSRuleRef__Group__1 : rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2 ;
    public final void rule__CSSRuleRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2508:1: ( rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2509:2: rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__1__Impl_in_rule__CSSRuleRef__Group__15009);
            rule__CSSRuleRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__2_in_rule__CSSRuleRef__Group__15012);
            rule__CSSRuleRef__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleRef__Group__1"


    // $ANTLR start "rule__CSSRuleRef__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2516:1: rule__CSSRuleRef__Group__1__Impl : ( ( rule__CSSRuleRef__RefAssignment_1 ) ) ;
    public final void rule__CSSRuleRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2520:1: ( ( ( rule__CSSRuleRef__RefAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2521:1: ( ( rule__CSSRuleRef__RefAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2521:1: ( ( rule__CSSRuleRef__RefAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2522:1: ( rule__CSSRuleRef__RefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2523:1: ( rule__CSSRuleRef__RefAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2523:2: rule__CSSRuleRef__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__RefAssignment_1_in_rule__CSSRuleRef__Group__1__Impl5039);
            rule__CSSRuleRef__RefAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getRefAssignment_1()); 
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
    // $ANTLR end "rule__CSSRuleRef__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2533:1: rule__CSSRuleRef__Group__2 : rule__CSSRuleRef__Group__2__Impl ;
    public final void rule__CSSRuleRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2537:1: ( rule__CSSRuleRef__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2538:2: rule__CSSRuleRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__2__Impl_in_rule__CSSRuleRef__Group__25069);
            rule__CSSRuleRef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleRef__Group__2"


    // $ANTLR start "rule__CSSRuleRef__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2544:1: rule__CSSRuleRef__Group__2__Impl : ( '>' ) ;
    public final void rule__CSSRuleRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2548:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2549:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2549:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2550:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getGreaterThanSignKeyword_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__CSSRuleRef__Group__2__Impl5097); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getGreaterThanSignKeyword_2()); 
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
    // $ANTLR end "rule__CSSRuleRef__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2569:1: rule__CSSRuleDefinition__Group__0 : rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1 ;
    public final void rule__CSSRuleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2573:1: ( rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2574:2: rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__0__Impl_in_rule__CSSRuleDefinition__Group__05134);
            rule__CSSRuleDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__1_in_rule__CSSRuleDefinition__Group__05137);
            rule__CSSRuleDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__0"


    // $ANTLR start "rule__CSSRuleDefinition__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2581:1: rule__CSSRuleDefinition__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2585:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2586:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2586:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2587:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getCSSRuleDefinitionAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2588:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2590:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getCSSRuleDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2600:1: rule__CSSRuleDefinition__Group__1 : rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2 ;
    public final void rule__CSSRuleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2604:1: ( rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2605:2: rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__1__Impl_in_rule__CSSRuleDefinition__Group__15195);
            rule__CSSRuleDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__2_in_rule__CSSRuleDefinition__Group__15198);
            rule__CSSRuleDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__1"


    // $ANTLR start "rule__CSSRuleDefinition__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2612:1: rule__CSSRuleDefinition__Group__1__Impl : ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? ) ;
    public final void rule__CSSRuleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2616:1: ( ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2617:1: ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2617:1: ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2618:1: ( rule__CSSRuleDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getDokuAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2619:1: ( rule__CSSRuleDefinition__DokuAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_JDOC) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2619:2: rule__CSSRuleDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CSSRuleDefinition__DokuAssignment_1_in_rule__CSSRuleDefinition__Group__1__Impl5225);
                    rule__CSSRuleDefinition__DokuAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getDokuAssignment_1()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2629:1: rule__CSSRuleDefinition__Group__2 : rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3 ;
    public final void rule__CSSRuleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2633:1: ( rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2634:2: rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__2__Impl_in_rule__CSSRuleDefinition__Group__25256);
            rule__CSSRuleDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__3_in_rule__CSSRuleDefinition__Group__25259);
            rule__CSSRuleDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__2"


    // $ANTLR start "rule__CSSRuleDefinition__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2641:1: rule__CSSRuleDefinition__Group__2__Impl : ( ( rule__CSSRuleDefinition__NameAssignment_2 ) ) ;
    public final void rule__CSSRuleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2645:1: ( ( ( rule__CSSRuleDefinition__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2646:1: ( ( rule__CSSRuleDefinition__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2646:1: ( ( rule__CSSRuleDefinition__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2647:1: ( rule__CSSRuleDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2648:1: ( rule__CSSRuleDefinition__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2648:2: rule__CSSRuleDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__NameAssignment_2_in_rule__CSSRuleDefinition__Group__2__Impl5286);
            rule__CSSRuleDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2658:1: rule__CSSRuleDefinition__Group__3 : rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4 ;
    public final void rule__CSSRuleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2662:1: ( rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2663:2: rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__3__Impl_in_rule__CSSRuleDefinition__Group__35316);
            rule__CSSRuleDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__4_in_rule__CSSRuleDefinition__Group__35319);
            rule__CSSRuleDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__3"


    // $ANTLR start "rule__CSSRuleDefinition__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2670:1: rule__CSSRuleDefinition__Group__3__Impl : ( '=' ) ;
    public final void rule__CSSRuleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2674:1: ( ( '=' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2675:1: ( '=' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2675:1: ( '=' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2676:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_3()); 
            }
            match(input,30,FOLLOW_30_in_rule__CSSRuleDefinition__Group__3__Impl5347); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__Group__3__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2689:1: rule__CSSRuleDefinition__Group__4 : rule__CSSRuleDefinition__Group__4__Impl rule__CSSRuleDefinition__Group__5 ;
    public final void rule__CSSRuleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2693:1: ( rule__CSSRuleDefinition__Group__4__Impl rule__CSSRuleDefinition__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2694:2: rule__CSSRuleDefinition__Group__4__Impl rule__CSSRuleDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__4__Impl_in_rule__CSSRuleDefinition__Group__45378);
            rule__CSSRuleDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__5_in_rule__CSSRuleDefinition__Group__45381);
            rule__CSSRuleDefinition__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__4"


    // $ANTLR start "rule__CSSRuleDefinition__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2701:1: rule__CSSRuleDefinition__Group__4__Impl : ( ( rule__CSSRuleDefinition__RuleAssignment_4 ) ) ;
    public final void rule__CSSRuleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2705:1: ( ( ( rule__CSSRuleDefinition__RuleAssignment_4 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2706:1: ( ( rule__CSSRuleDefinition__RuleAssignment_4 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2706:1: ( ( rule__CSSRuleDefinition__RuleAssignment_4 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2707:1: ( rule__CSSRuleDefinition__RuleAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getRuleAssignment_4()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2708:1: ( rule__CSSRuleDefinition__RuleAssignment_4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2708:2: rule__CSSRuleDefinition__RuleAssignment_4
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__RuleAssignment_4_in_rule__CSSRuleDefinition__Group__4__Impl5408);
            rule__CSSRuleDefinition__RuleAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getRuleAssignment_4()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__Group__4__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__5"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2718:1: rule__CSSRuleDefinition__Group__5 : rule__CSSRuleDefinition__Group__5__Impl ;
    public final void rule__CSSRuleDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2722:1: ( rule__CSSRuleDefinition__Group__5__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2723:2: rule__CSSRuleDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__5__Impl_in_rule__CSSRuleDefinition__Group__55438);
            rule__CSSRuleDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__5"


    // $ANTLR start "rule__CSSRuleDefinition__Group__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2729:1: rule__CSSRuleDefinition__Group__5__Impl : ( ';' ) ;
    public final void rule__CSSRuleDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2733:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2734:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2734:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2735:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_5()); 
            }
            match(input,26,FOLLOW_26_in_rule__CSSRuleDefinition__Group__5__Impl5466); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__Group__5__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2762:1: rule__CSSRuleOr__Group__0 : rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1 ;
    public final void rule__CSSRuleOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2766:1: ( rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2767:2: rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__0__Impl_in_rule__CSSRuleOr__Group__05511);
            rule__CSSRuleOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__1_in_rule__CSSRuleOr__Group__05514);
            rule__CSSRuleOr__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleOr__Group__0"


    // $ANTLR start "rule__CSSRuleOr__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2774:1: rule__CSSRuleOr__Group__0__Impl : ( ruleCSSRuleXor ) ;
    public final void rule__CSSRuleOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2778:1: ( ( ruleCSSRuleXor ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2779:1: ( ruleCSSRuleXor )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2779:1: ( ruleCSSRuleXor )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2780:1: ruleCSSRuleXor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getCSSRuleXorParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__Group__0__Impl5541);
            ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getCSSRuleXorParserRuleCall_0()); 
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
    // $ANTLR end "rule__CSSRuleOr__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2791:1: rule__CSSRuleOr__Group__1 : rule__CSSRuleOr__Group__1__Impl ;
    public final void rule__CSSRuleOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2795:1: ( rule__CSSRuleOr__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2796:2: rule__CSSRuleOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__1__Impl_in_rule__CSSRuleOr__Group__15570);
            rule__CSSRuleOr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleOr__Group__1"


    // $ANTLR start "rule__CSSRuleOr__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2802:1: rule__CSSRuleOr__Group__1__Impl : ( ( rule__CSSRuleOr__Group_1__0 )? ) ;
    public final void rule__CSSRuleOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2806:1: ( ( ( rule__CSSRuleOr__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2807:1: ( ( rule__CSSRuleOr__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2807:1: ( ( rule__CSSRuleOr__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2808:1: ( rule__CSSRuleOr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2809:1: ( rule__CSSRuleOr__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2809:2: rule__CSSRuleOr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__0_in_rule__CSSRuleOr__Group__1__Impl5597);
                    rule__CSSRuleOr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CSSRuleOr__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2823:1: rule__CSSRuleOr__Group_1__0 : rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1 ;
    public final void rule__CSSRuleOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2827:1: ( rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2828:2: rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__0__Impl_in_rule__CSSRuleOr__Group_1__05632);
            rule__CSSRuleOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__1_in_rule__CSSRuleOr__Group_1__05635);
            rule__CSSRuleOr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleOr__Group_1__0"


    // $ANTLR start "rule__CSSRuleOr__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2835:1: rule__CSSRuleOr__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2839:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2840:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2840:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2841:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getCSSRuleOrOrsAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2842:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2844:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getCSSRuleOrOrsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2854:1: rule__CSSRuleOr__Group_1__1 : rule__CSSRuleOr__Group_1__1__Impl ;
    public final void rule__CSSRuleOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2858:1: ( rule__CSSRuleOr__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2859:2: rule__CSSRuleOr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__1__Impl_in_rule__CSSRuleOr__Group_1__15693);
            rule__CSSRuleOr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleOr__Group_1__1"


    // $ANTLR start "rule__CSSRuleOr__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2865:1: rule__CSSRuleOr__Group_1__1__Impl : ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) ) ;
    public final void rule__CSSRuleOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2869:1: ( ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2870:1: ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2870:1: ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2871:1: ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2871:1: ( ( rule__CSSRuleOr__Group_1_1__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2872:1: ( rule__CSSRuleOr__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2873:1: ( rule__CSSRuleOr__Group_1_1__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2873:2: rule__CSSRuleOr__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl5722);
            rule__CSSRuleOr__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2876:1: ( ( rule__CSSRuleOr__Group_1_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2877:1: ( rule__CSSRuleOr__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2878:1: ( rule__CSSRuleOr__Group_1_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2878:2: rule__CSSRuleOr__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl5734);
            	    rule__CSSRuleOr__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleOr__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2893:1: rule__CSSRuleOr__Group_1_1__0 : rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1 ;
    public final void rule__CSSRuleOr__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2897:1: ( rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2898:2: rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__0__Impl_in_rule__CSSRuleOr__Group_1_1__05771);
            rule__CSSRuleOr__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__1_in_rule__CSSRuleOr__Group_1_1__05774);
            rule__CSSRuleOr__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__0"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2905:1: rule__CSSRuleOr__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__CSSRuleOr__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2909:1: ( ( '|' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2910:1: ( '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2910:1: ( '|' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2911:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getVerticalLineKeyword_1_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__CSSRuleOr__Group_1_1__0__Impl5802); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getVerticalLineKeyword_1_1_0()); 
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
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__0__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2924:1: rule__CSSRuleOr__Group_1_1__1 : rule__CSSRuleOr__Group_1_1__1__Impl ;
    public final void rule__CSSRuleOr__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2928:1: ( rule__CSSRuleOr__Group_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2929:2: rule__CSSRuleOr__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__1__Impl_in_rule__CSSRuleOr__Group_1_1__15833);
            rule__CSSRuleOr__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__1"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2935:1: rule__CSSRuleOr__Group_1_1__1__Impl : ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) ) ;
    public final void rule__CSSRuleOr__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2939:1: ( ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2940:1: ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2940:1: ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2941:1: ( rule__CSSRuleOr__OrsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getOrsAssignment_1_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2942:1: ( rule__CSSRuleOr__OrsAssignment_1_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2942:2: rule__CSSRuleOr__OrsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__OrsAssignment_1_1_1_in_rule__CSSRuleOr__Group_1_1__1__Impl5860);
            rule__CSSRuleOr__OrsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getOrsAssignment_1_1_1()); 
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
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__1__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2956:1: rule__CSSRuleXor__Group__0 : rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1 ;
    public final void rule__CSSRuleXor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2960:1: ( rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2961:2: rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__0__Impl_in_rule__CSSRuleXor__Group__05894);
            rule__CSSRuleXor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__1_in_rule__CSSRuleXor__Group__05897);
            rule__CSSRuleXor__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleXor__Group__0"


    // $ANTLR start "rule__CSSRuleXor__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2968:1: rule__CSSRuleXor__Group__0__Impl : ( ruleCSSRuleConcat ) ;
    public final void rule__CSSRuleXor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2972:1: ( ( ruleCSSRuleConcat ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2973:1: ( ruleCSSRuleConcat )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2973:1: ( ruleCSSRuleConcat )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2974:1: ruleCSSRuleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getCSSRuleConcatParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__Group__0__Impl5924);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getCSSRuleConcatParserRuleCall_0()); 
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
    // $ANTLR end "rule__CSSRuleXor__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2985:1: rule__CSSRuleXor__Group__1 : rule__CSSRuleXor__Group__1__Impl ;
    public final void rule__CSSRuleXor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2989:1: ( rule__CSSRuleXor__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2990:2: rule__CSSRuleXor__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__1__Impl_in_rule__CSSRuleXor__Group__15953);
            rule__CSSRuleXor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleXor__Group__1"


    // $ANTLR start "rule__CSSRuleXor__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2996:1: rule__CSSRuleXor__Group__1__Impl : ( ( rule__CSSRuleXor__Group_1__0 )? ) ;
    public final void rule__CSSRuleXor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3000:1: ( ( ( rule__CSSRuleXor__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3001:1: ( ( rule__CSSRuleXor__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3001:1: ( ( rule__CSSRuleXor__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3002:1: ( rule__CSSRuleXor__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3003:1: ( rule__CSSRuleXor__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3003:2: rule__CSSRuleXor__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__0_in_rule__CSSRuleXor__Group__1__Impl5980);
                    rule__CSSRuleXor__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CSSRuleXor__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3017:1: rule__CSSRuleXor__Group_1__0 : rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1 ;
    public final void rule__CSSRuleXor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3021:1: ( rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3022:2: rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__0__Impl_in_rule__CSSRuleXor__Group_1__06015);
            rule__CSSRuleXor__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__1_in_rule__CSSRuleXor__Group_1__06018);
            rule__CSSRuleXor__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleXor__Group_1__0"


    // $ANTLR start "rule__CSSRuleXor__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3029:1: rule__CSSRuleXor__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleXor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3033:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3034:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3034:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3035:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getCSSRuleXorXorsAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3036:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3038:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getCSSRuleXorXorsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3048:1: rule__CSSRuleXor__Group_1__1 : rule__CSSRuleXor__Group_1__1__Impl ;
    public final void rule__CSSRuleXor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3052:1: ( rule__CSSRuleXor__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3053:2: rule__CSSRuleXor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__1__Impl_in_rule__CSSRuleXor__Group_1__16076);
            rule__CSSRuleXor__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleXor__Group_1__1"


    // $ANTLR start "rule__CSSRuleXor__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3059:1: rule__CSSRuleXor__Group_1__1__Impl : ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) ) ;
    public final void rule__CSSRuleXor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3063:1: ( ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3064:1: ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3064:1: ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3065:1: ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3065:1: ( ( rule__CSSRuleXor__Group_1_1__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3066:1: ( rule__CSSRuleXor__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3067:1: ( rule__CSSRuleXor__Group_1_1__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3067:2: rule__CSSRuleXor__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl6105);
            rule__CSSRuleXor__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3070:1: ( ( rule__CSSRuleXor__Group_1_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3071:1: ( rule__CSSRuleXor__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3072:1: ( rule__CSSRuleXor__Group_1_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3072:2: rule__CSSRuleXor__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl6117);
            	    rule__CSSRuleXor__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleXor__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3087:1: rule__CSSRuleXor__Group_1_1__0 : rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1 ;
    public final void rule__CSSRuleXor__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3091:1: ( rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3092:2: rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__0__Impl_in_rule__CSSRuleXor__Group_1_1__06154);
            rule__CSSRuleXor__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__1_in_rule__CSSRuleXor__Group_1_1__06157);
            rule__CSSRuleXor__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__0"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3099:1: rule__CSSRuleXor__Group_1_1__0__Impl : ( '||' ) ;
    public final void rule__CSSRuleXor__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3103:1: ( ( '||' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3104:1: ( '||' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3104:1: ( '||' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3105:1: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__CSSRuleXor__Group_1_1__0__Impl6185); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getVerticalLineVerticalLineKeyword_1_1_0()); 
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
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__0__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3118:1: rule__CSSRuleXor__Group_1_1__1 : rule__CSSRuleXor__Group_1_1__1__Impl ;
    public final void rule__CSSRuleXor__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3122:1: ( rule__CSSRuleXor__Group_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3123:2: rule__CSSRuleXor__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__1__Impl_in_rule__CSSRuleXor__Group_1_1__16216);
            rule__CSSRuleXor__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__1"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3129:1: rule__CSSRuleXor__Group_1_1__1__Impl : ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) ) ;
    public final void rule__CSSRuleXor__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3133:1: ( ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3134:1: ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3134:1: ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3135:1: ( rule__CSSRuleXor__XorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getXorsAssignment_1_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3136:1: ( rule__CSSRuleXor__XorsAssignment_1_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3136:2: rule__CSSRuleXor__XorsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__XorsAssignment_1_1_1_in_rule__CSSRuleXor__Group_1_1__1__Impl6243);
            rule__CSSRuleXor__XorsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getXorsAssignment_1_1_1()); 
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
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__1__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3150:1: rule__CSSRuleConcat__Group__0 : rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1 ;
    public final void rule__CSSRuleConcat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3154:1: ( rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3155:2: rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__0__Impl_in_rule__CSSRuleConcat__Group__06277);
            rule__CSSRuleConcat__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__1_in_rule__CSSRuleConcat__Group__06280);
            rule__CSSRuleConcat__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleConcat__Group__0"


    // $ANTLR start "rule__CSSRuleConcat__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3162:1: rule__CSSRuleConcat__Group__0__Impl : ( ruleCSSRulePostfix ) ;
    public final void rule__CSSRuleConcat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3166:1: ( ( ruleCSSRulePostfix ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3167:1: ( ruleCSSRulePostfix )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3167:1: ( ruleCSSRulePostfix )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3168:1: ruleCSSRulePostfix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getCSSRulePostfixParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__Group__0__Impl6307);
            ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getCSSRulePostfixParserRuleCall_0()); 
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
    // $ANTLR end "rule__CSSRuleConcat__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3179:1: rule__CSSRuleConcat__Group__1 : rule__CSSRuleConcat__Group__1__Impl ;
    public final void rule__CSSRuleConcat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3183:1: ( rule__CSSRuleConcat__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3184:2: rule__CSSRuleConcat__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__1__Impl_in_rule__CSSRuleConcat__Group__16336);
            rule__CSSRuleConcat__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleConcat__Group__1"


    // $ANTLR start "rule__CSSRuleConcat__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3190:1: rule__CSSRuleConcat__Group__1__Impl : ( ( rule__CSSRuleConcat__Group_1__0 )? ) ;
    public final void rule__CSSRuleConcat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3194:1: ( ( ( rule__CSSRuleConcat__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3195:1: ( ( rule__CSSRuleConcat__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3195:1: ( ( rule__CSSRuleConcat__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3196:1: ( rule__CSSRuleConcat__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3197:1: ( rule__CSSRuleConcat__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==RULE_REGEX||LA22_0==23||LA22_0==28||LA22_0==33||(LA22_0>=35 && LA22_0<=36)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3197:2: rule__CSSRuleConcat__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__0_in_rule__CSSRuleConcat__Group__1__Impl6363);
                    rule__CSSRuleConcat__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CSSRuleConcat__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3211:1: rule__CSSRuleConcat__Group_1__0 : rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1 ;
    public final void rule__CSSRuleConcat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3215:1: ( rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3216:2: rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__0__Impl_in_rule__CSSRuleConcat__Group_1__06398);
            rule__CSSRuleConcat__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__1_in_rule__CSSRuleConcat__Group_1__06401);
            rule__CSSRuleConcat__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleConcat__Group_1__0"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3223:1: rule__CSSRuleConcat__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleConcat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3227:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3228:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3228:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3229:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatConcAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3230:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3232:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatConcAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcat__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3242:1: rule__CSSRuleConcat__Group_1__1 : rule__CSSRuleConcat__Group_1__1__Impl ;
    public final void rule__CSSRuleConcat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3246:1: ( rule__CSSRuleConcat__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3247:2: rule__CSSRuleConcat__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__1__Impl_in_rule__CSSRuleConcat__Group_1__16459);
            rule__CSSRuleConcat__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleConcat__Group_1__1"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3253:1: rule__CSSRuleConcat__Group_1__1__Impl : ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) ) ;
    public final void rule__CSSRuleConcat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3257:1: ( ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3258:1: ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3258:1: ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3259:1: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3259:1: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3260:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3261:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3261:2: rule__CSSRuleConcat__ConcAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl6488);
            rule__CSSRuleConcat__ConcAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3264:1: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3265:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3266:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==RULE_REGEX||LA23_0==23||LA23_0==28||LA23_0==33||(LA23_0>=35 && LA23_0<=36)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3266:2: rule__CSSRuleConcat__ConcAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl6500);
            	    rule__CSSRuleConcat__ConcAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleConcat__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3281:1: rule__CSSRulePostfix__Group__0 : rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1 ;
    public final void rule__CSSRulePostfix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3285:1: ( rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3286:2: rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__0__Impl_in_rule__CSSRulePostfix__Group__06537);
            rule__CSSRulePostfix__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__1_in_rule__CSSRulePostfix__Group__06540);
            rule__CSSRulePostfix__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRulePostfix__Group__0"


    // $ANTLR start "rule__CSSRulePostfix__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3293:1: rule__CSSRulePostfix__Group__0__Impl : ( ruleCSSRulePrimary ) ;
    public final void rule__CSSRulePostfix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3297:1: ( ( ruleCSSRulePrimary ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3298:1: ( ruleCSSRulePrimary )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3298:1: ( ruleCSSRulePrimary )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3299:1: ruleCSSRulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCSSRulePrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_rule__CSSRulePostfix__Group__0__Impl6567);
            ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCSSRulePrimaryParserRuleCall_0()); 
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
    // $ANTLR end "rule__CSSRulePostfix__Group__0__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3310:1: rule__CSSRulePostfix__Group__1 : rule__CSSRulePostfix__Group__1__Impl ;
    public final void rule__CSSRulePostfix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3314:1: ( rule__CSSRulePostfix__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3315:2: rule__CSSRulePostfix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__1__Impl_in_rule__CSSRulePostfix__Group__16596);
            rule__CSSRulePostfix__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRulePostfix__Group__1"


    // $ANTLR start "rule__CSSRulePostfix__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3321:1: rule__CSSRulePostfix__Group__1__Impl : ( ( rule__CSSRulePostfix__Group_1__0 )? ) ;
    public final void rule__CSSRulePostfix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3325:1: ( ( ( rule__CSSRulePostfix__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3326:1: ( ( rule__CSSRulePostfix__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3326:1: ( ( rule__CSSRulePostfix__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3327:1: ( rule__CSSRulePostfix__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3328:1: ( rule__CSSRulePostfix__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=15 && LA24_0<=17)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3328:2: rule__CSSRulePostfix__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__0_in_rule__CSSRulePostfix__Group__1__Impl6623);
                    rule__CSSRulePostfix__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CSSRulePostfix__Group__1__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3342:1: rule__CSSRulePostfix__Group_1__0 : rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1 ;
    public final void rule__CSSRulePostfix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3346:1: ( rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3347:2: rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__0__Impl_in_rule__CSSRulePostfix__Group_1__06658);
            rule__CSSRulePostfix__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__1_in_rule__CSSRulePostfix__Group_1__06661);
            rule__CSSRulePostfix__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRulePostfix__Group_1__0"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3354:1: rule__CSSRulePostfix__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRulePostfix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3358:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3359:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3359:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3360:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCSSRulePostfixRuleAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3361:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3363:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCSSRulePostfixRuleAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePostfix__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3373:1: rule__CSSRulePostfix__Group_1__1 : rule__CSSRulePostfix__Group_1__1__Impl ;
    public final void rule__CSSRulePostfix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3377:1: ( rule__CSSRulePostfix__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3378:2: rule__CSSRulePostfix__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__1__Impl_in_rule__CSSRulePostfix__Group_1__16719);
            rule__CSSRulePostfix__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRulePostfix__Group_1__1"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3384:1: rule__CSSRulePostfix__Group_1__1__Impl : ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) ) ;
    public final void rule__CSSRulePostfix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3388:1: ( ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3389:1: ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3389:1: ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3390:1: ( rule__CSSRulePostfix__CardinalityAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3391:1: ( rule__CSSRulePostfix__CardinalityAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3391:2: rule__CSSRulePostfix__CardinalityAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__CardinalityAssignment_1_1_in_rule__CSSRulePostfix__Group_1__1__Impl6746);
            rule__CSSRulePostfix__CardinalityAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCardinalityAssignment_1_1()); 
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
    // $ANTLR end "rule__CSSRulePostfix__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3405:1: rule__CSSRuleBracket__Group__0 : rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1 ;
    public final void rule__CSSRuleBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3409:1: ( rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3410:2: rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__0__Impl_in_rule__CSSRuleBracket__Group__06780);
            rule__CSSRuleBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__1_in_rule__CSSRuleBracket__Group__06783);
            rule__CSSRuleBracket__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleBracket__Group__0"


    // $ANTLR start "rule__CSSRuleBracket__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3417:1: rule__CSSRuleBracket__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3421:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3422:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3422:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3423:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getCSSRuleBracketAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3424:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3426:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getCSSRuleBracketAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleBracket__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3436:1: rule__CSSRuleBracket__Group__1 : rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2 ;
    public final void rule__CSSRuleBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3440:1: ( rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3441:2: rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__1__Impl_in_rule__CSSRuleBracket__Group__16841);
            rule__CSSRuleBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__2_in_rule__CSSRuleBracket__Group__16844);
            rule__CSSRuleBracket__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleBracket__Group__1"


    // $ANTLR start "rule__CSSRuleBracket__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3448:1: rule__CSSRuleBracket__Group__1__Impl : ( '[' ) ;
    public final void rule__CSSRuleBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3452:1: ( ( '[' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3453:1: ( '[' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3453:1: ( '[' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3454:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__CSSRuleBracket__Group__1__Impl6872); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getLeftSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__CSSRuleBracket__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3467:1: rule__CSSRuleBracket__Group__2 : rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3 ;
    public final void rule__CSSRuleBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3471:1: ( rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3472:2: rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__2__Impl_in_rule__CSSRuleBracket__Group__26903);
            rule__CSSRuleBracket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__3_in_rule__CSSRuleBracket__Group__26906);
            rule__CSSRuleBracket__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleBracket__Group__2"


    // $ANTLR start "rule__CSSRuleBracket__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3479:1: rule__CSSRuleBracket__Group__2__Impl : ( ( rule__CSSRuleBracket__InnerAssignment_2 ) ) ;
    public final void rule__CSSRuleBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3483:1: ( ( ( rule__CSSRuleBracket__InnerAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3484:1: ( ( rule__CSSRuleBracket__InnerAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3484:1: ( ( rule__CSSRuleBracket__InnerAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3485:1: ( rule__CSSRuleBracket__InnerAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getInnerAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3486:1: ( rule__CSSRuleBracket__InnerAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3486:2: rule__CSSRuleBracket__InnerAssignment_2
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__InnerAssignment_2_in_rule__CSSRuleBracket__Group__2__Impl6933);
            rule__CSSRuleBracket__InnerAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getInnerAssignment_2()); 
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
    // $ANTLR end "rule__CSSRuleBracket__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3496:1: rule__CSSRuleBracket__Group__3 : rule__CSSRuleBracket__Group__3__Impl ;
    public final void rule__CSSRuleBracket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3500:1: ( rule__CSSRuleBracket__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3501:2: rule__CSSRuleBracket__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__3__Impl_in_rule__CSSRuleBracket__Group__36963);
            rule__CSSRuleBracket__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleBracket__Group__3"


    // $ANTLR start "rule__CSSRuleBracket__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3507:1: rule__CSSRuleBracket__Group__3__Impl : ( ']' ) ;
    public final void rule__CSSRuleBracket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3511:1: ( ( ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3512:1: ( ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3512:1: ( ']' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3513:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__CSSRuleBracket__Group__3__Impl6991); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getRightSquareBracketKeyword_3()); 
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
    // $ANTLR end "rule__CSSRuleBracket__Group__3__Impl"


    // $ANTLR start "rule__CSSRuleParenthesis__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3534:1: rule__CSSRuleParenthesis__Group__0 : rule__CSSRuleParenthesis__Group__0__Impl rule__CSSRuleParenthesis__Group__1 ;
    public final void rule__CSSRuleParenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3538:1: ( rule__CSSRuleParenthesis__Group__0__Impl rule__CSSRuleParenthesis__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3539:2: rule__CSSRuleParenthesis__Group__0__Impl rule__CSSRuleParenthesis__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleParenthesis__Group__0__Impl_in_rule__CSSRuleParenthesis__Group__07030);
            rule__CSSRuleParenthesis__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleParenthesis__Group__1_in_rule__CSSRuleParenthesis__Group__07033);
            rule__CSSRuleParenthesis__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleParenthesis__Group__0"


    // $ANTLR start "rule__CSSRuleParenthesis__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3546:1: rule__CSSRuleParenthesis__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleParenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3550:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3551:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3551:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3552:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleParenthesisAccess().getCSSRuleParanthesisAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3553:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3555:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleParenthesisAccess().getCSSRuleParanthesisAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleParenthesis__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleParenthesis__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3565:1: rule__CSSRuleParenthesis__Group__1 : rule__CSSRuleParenthesis__Group__1__Impl rule__CSSRuleParenthesis__Group__2 ;
    public final void rule__CSSRuleParenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3569:1: ( rule__CSSRuleParenthesis__Group__1__Impl rule__CSSRuleParenthesis__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3570:2: rule__CSSRuleParenthesis__Group__1__Impl rule__CSSRuleParenthesis__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleParenthesis__Group__1__Impl_in_rule__CSSRuleParenthesis__Group__17091);
            rule__CSSRuleParenthesis__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleParenthesis__Group__2_in_rule__CSSRuleParenthesis__Group__17094);
            rule__CSSRuleParenthesis__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleParenthesis__Group__1"


    // $ANTLR start "rule__CSSRuleParenthesis__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3577:1: rule__CSSRuleParenthesis__Group__1__Impl : ( '(' ) ;
    public final void rule__CSSRuleParenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3581:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3582:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3582:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3583:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleParenthesisAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__CSSRuleParenthesis__Group__1__Impl7122); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleParenthesisAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__CSSRuleParenthesis__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleParenthesis__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3596:1: rule__CSSRuleParenthesis__Group__2 : rule__CSSRuleParenthesis__Group__2__Impl rule__CSSRuleParenthesis__Group__3 ;
    public final void rule__CSSRuleParenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3600:1: ( rule__CSSRuleParenthesis__Group__2__Impl rule__CSSRuleParenthesis__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3601:2: rule__CSSRuleParenthesis__Group__2__Impl rule__CSSRuleParenthesis__Group__3
            {
            pushFollow(FOLLOW_rule__CSSRuleParenthesis__Group__2__Impl_in_rule__CSSRuleParenthesis__Group__27153);
            rule__CSSRuleParenthesis__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleParenthesis__Group__3_in_rule__CSSRuleParenthesis__Group__27156);
            rule__CSSRuleParenthesis__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleParenthesis__Group__2"


    // $ANTLR start "rule__CSSRuleParenthesis__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3608:1: rule__CSSRuleParenthesis__Group__2__Impl : ( ( rule__CSSRuleParenthesis__InnerAssignment_2 ) ) ;
    public final void rule__CSSRuleParenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3612:1: ( ( ( rule__CSSRuleParenthesis__InnerAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3613:1: ( ( rule__CSSRuleParenthesis__InnerAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3613:1: ( ( rule__CSSRuleParenthesis__InnerAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3614:1: ( rule__CSSRuleParenthesis__InnerAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleParenthesisAccess().getInnerAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3615:1: ( rule__CSSRuleParenthesis__InnerAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3615:2: rule__CSSRuleParenthesis__InnerAssignment_2
            {
            pushFollow(FOLLOW_rule__CSSRuleParenthesis__InnerAssignment_2_in_rule__CSSRuleParenthesis__Group__2__Impl7183);
            rule__CSSRuleParenthesis__InnerAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleParenthesisAccess().getInnerAssignment_2()); 
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
    // $ANTLR end "rule__CSSRuleParenthesis__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleParenthesis__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3625:1: rule__CSSRuleParenthesis__Group__3 : rule__CSSRuleParenthesis__Group__3__Impl ;
    public final void rule__CSSRuleParenthesis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3629:1: ( rule__CSSRuleParenthesis__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3630:2: rule__CSSRuleParenthesis__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleParenthesis__Group__3__Impl_in_rule__CSSRuleParenthesis__Group__37213);
            rule__CSSRuleParenthesis__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleParenthesis__Group__3"


    // $ANTLR start "rule__CSSRuleParenthesis__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3636:1: rule__CSSRuleParenthesis__Group__3__Impl : ( ')' ) ;
    public final void rule__CSSRuleParenthesis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3640:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3641:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3641:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3642:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleParenthesisAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__CSSRuleParenthesis__Group__3__Impl7241); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleParenthesisAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__CSSRuleParenthesis__Group__3__Impl"


    // $ANTLR start "rule__CSSRulePrimary__Group_3__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3663:1: rule__CSSRulePrimary__Group_3__0 : rule__CSSRulePrimary__Group_3__0__Impl rule__CSSRulePrimary__Group_3__1 ;
    public final void rule__CSSRulePrimary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3667:1: ( rule__CSSRulePrimary__Group_3__0__Impl rule__CSSRulePrimary__Group_3__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3668:2: rule__CSSRulePrimary__Group_3__0__Impl rule__CSSRulePrimary__Group_3__1
            {
            pushFollow(FOLLOW_rule__CSSRulePrimary__Group_3__0__Impl_in_rule__CSSRulePrimary__Group_3__07280);
            rule__CSSRulePrimary__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRulePrimary__Group_3__1_in_rule__CSSRulePrimary__Group_3__07283);
            rule__CSSRulePrimary__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRulePrimary__Group_3__0"


    // $ANTLR start "rule__CSSRulePrimary__Group_3__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3675:1: rule__CSSRulePrimary__Group_3__0__Impl : ( () ) ;
    public final void rule__CSSRulePrimary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3679:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3680:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3680:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3681:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralAction_3_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3682:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3684:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePrimary__Group_3__0__Impl"


    // $ANTLR start "rule__CSSRulePrimary__Group_3__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3694:1: rule__CSSRulePrimary__Group_3__1 : rule__CSSRulePrimary__Group_3__1__Impl ;
    public final void rule__CSSRulePrimary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3698:1: ( rule__CSSRulePrimary__Group_3__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3699:2: rule__CSSRulePrimary__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRulePrimary__Group_3__1__Impl_in_rule__CSSRulePrimary__Group_3__17341);
            rule__CSSRulePrimary__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRulePrimary__Group_3__1"


    // $ANTLR start "rule__CSSRulePrimary__Group_3__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3705:1: rule__CSSRulePrimary__Group_3__1__Impl : ( ( rule__CSSRulePrimary__ValueAssignment_3_1 ) ) ;
    public final void rule__CSSRulePrimary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3709:1: ( ( ( rule__CSSRulePrimary__ValueAssignment_3_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3710:1: ( ( rule__CSSRulePrimary__ValueAssignment_3_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3710:1: ( ( rule__CSSRulePrimary__ValueAssignment_3_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3711:1: ( rule__CSSRulePrimary__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getValueAssignment_3_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3712:1: ( rule__CSSRulePrimary__ValueAssignment_3_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3712:2: rule__CSSRulePrimary__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__CSSRulePrimary__ValueAssignment_3_1_in_rule__CSSRulePrimary__Group_3__1__Impl7368);
            rule__CSSRulePrimary__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getValueAssignment_3_1()); 
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
    // $ANTLR end "rule__CSSRulePrimary__Group_3__1__Impl"


    // $ANTLR start "rule__CSSRuleRegex__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3726:1: rule__CSSRuleRegex__Group__0 : rule__CSSRuleRegex__Group__0__Impl rule__CSSRuleRegex__Group__1 ;
    public final void rule__CSSRuleRegex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3730:1: ( rule__CSSRuleRegex__Group__0__Impl rule__CSSRuleRegex__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3731:2: rule__CSSRuleRegex__Group__0__Impl rule__CSSRuleRegex__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleRegex__Group__0__Impl_in_rule__CSSRuleRegex__Group__07402);
            rule__CSSRuleRegex__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleRegex__Group__1_in_rule__CSSRuleRegex__Group__07405);
            rule__CSSRuleRegex__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleRegex__Group__0"


    // $ANTLR start "rule__CSSRuleRegex__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3738:1: rule__CSSRuleRegex__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleRegex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3742:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3743:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3743:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3744:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getCSSRuleRegexAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3745:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3747:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getCSSRuleRegexAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRegex__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleRegex__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3757:1: rule__CSSRuleRegex__Group__1 : rule__CSSRuleRegex__Group__1__Impl ;
    public final void rule__CSSRuleRegex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3761:1: ( rule__CSSRuleRegex__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3762:2: rule__CSSRuleRegex__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleRegex__Group__1__Impl_in_rule__CSSRuleRegex__Group__17463);
            rule__CSSRuleRegex__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleRegex__Group__1"


    // $ANTLR start "rule__CSSRuleRegex__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3768:1: rule__CSSRuleRegex__Group__1__Impl : ( ( rule__CSSRuleRegex__RegexAssignment_1 ) ) ;
    public final void rule__CSSRuleRegex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3772:1: ( ( ( rule__CSSRuleRegex__RegexAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3773:1: ( ( rule__CSSRuleRegex__RegexAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3773:1: ( ( rule__CSSRuleRegex__RegexAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3774:1: ( rule__CSSRuleRegex__RegexAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getRegexAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3775:1: ( rule__CSSRuleRegex__RegexAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3775:2: rule__CSSRuleRegex__RegexAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleRegex__RegexAssignment_1_in_rule__CSSRuleRegex__Group__1__Impl7490);
            rule__CSSRuleRegex__RegexAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getRegexAssignment_1()); 
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
    // $ANTLR end "rule__CSSRuleRegex__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleLiteral__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3789:1: rule__CSSRuleLiteral__Group__0 : rule__CSSRuleLiteral__Group__0__Impl rule__CSSRuleLiteral__Group__1 ;
    public final void rule__CSSRuleLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3793:1: ( rule__CSSRuleLiteral__Group__0__Impl rule__CSSRuleLiteral__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3794:2: rule__CSSRuleLiteral__Group__0__Impl rule__CSSRuleLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Group__0__Impl_in_rule__CSSRuleLiteral__Group__07524);
            rule__CSSRuleLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Group__1_in_rule__CSSRuleLiteral__Group__07527);
            rule__CSSRuleLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleLiteral__Group__0"


    // $ANTLR start "rule__CSSRuleLiteral__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3801:1: rule__CSSRuleLiteral__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3805:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3806:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3806:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3807:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3808:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3810:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleLiteral__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3820:1: rule__CSSRuleLiteral__Group__1 : rule__CSSRuleLiteral__Group__1__Impl ;
    public final void rule__CSSRuleLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3824:1: ( rule__CSSRuleLiteral__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3825:2: rule__CSSRuleLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Group__1__Impl_in_rule__CSSRuleLiteral__Group__17585);
            rule__CSSRuleLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSRuleLiteral__Group__1"


    // $ANTLR start "rule__CSSRuleLiteral__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3831:1: rule__CSSRuleLiteral__Group__1__Impl : ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) ) ;
    public final void rule__CSSRuleLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3835:1: ( ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3836:1: ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3836:1: ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3837:1: ( rule__CSSRuleLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getValueAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3838:1: ( rule__CSSRuleLiteral__ValueAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3838:2: rule__CSSRuleLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__ValueAssignment_1_in_rule__CSSRuleLiteral__Group__1__Impl7612);
            rule__CSSRuleLiteral__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__CSSRuleLiteral__Group__1__Impl"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3852:1: rule__CSSDefaultValue__Group_0__0 : rule__CSSDefaultValue__Group_0__0__Impl rule__CSSDefaultValue__Group_0__1 ;
    public final void rule__CSSDefaultValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3856:1: ( rule__CSSDefaultValue__Group_0__0__Impl rule__CSSDefaultValue__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3857:2: rule__CSSDefaultValue__Group_0__0__Impl rule__CSSDefaultValue__Group_0__1
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__Group_0__0__Impl_in_rule__CSSDefaultValue__Group_0__07646);
            rule__CSSDefaultValue__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSDefaultValue__Group_0__1_in_rule__CSSDefaultValue__Group_0__07649);
            rule__CSSDefaultValue__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSDefaultValue__Group_0__0"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3864:1: rule__CSSDefaultValue__Group_0__0__Impl : ( () ) ;
    public final void rule__CSSDefaultValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3868:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3869:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3869:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3870:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getCSSDefaultValueAction_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3871:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3873:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getCSSDefaultValueAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSDefaultValue__Group_0__0__Impl"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3883:1: rule__CSSDefaultValue__Group_0__1 : rule__CSSDefaultValue__Group_0__1__Impl ;
    public final void rule__CSSDefaultValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3887:1: ( rule__CSSDefaultValue__Group_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3888:2: rule__CSSDefaultValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__Group_0__1__Impl_in_rule__CSSDefaultValue__Group_0__17707);
            rule__CSSDefaultValue__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CSSDefaultValue__Group_0__1"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3894:1: rule__CSSDefaultValue__Group_0__1__Impl : ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) ) ;
    public final void rule__CSSDefaultValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3898:1: ( ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3899:1: ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3899:1: ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3900:1: ( rule__CSSDefaultValue__ValAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getValAssignment_0_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3901:1: ( rule__CSSDefaultValue__ValAssignment_0_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3901:2: rule__CSSDefaultValue__ValAssignment_0_1
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__ValAssignment_0_1_in_rule__CSSDefaultValue__Group_0__1__Impl7734);
            rule__CSSDefaultValue__ValAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getValAssignment_0_1()); 
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
    // $ANTLR end "rule__CSSDefaultValue__Group_0__1__Impl"


    // $ANTLR start "rule__CssExtension__ImportsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3916:1: rule__CssExtension__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__CssExtension__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3920:1: ( ( ruleImport ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3921:1: ( ruleImport )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3921:1: ( ruleImport )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3922:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__CssExtension__ImportsAssignment_07773);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getImportsImportParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__CssExtension__ImportsAssignment_0"


    // $ANTLR start "rule__CssExtension__PackageDefAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3931:1: rule__CssExtension__PackageDefAssignment_1 : ( rulePackageDefinition ) ;
    public final void rule__CssExtension__PackageDefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3935:1: ( ( rulePackageDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3936:1: ( rulePackageDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3936:1: ( rulePackageDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3937:1: rulePackageDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getPackageDefPackageDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePackageDefinition_in_rule__CssExtension__PackageDefAssignment_17804);
            rulePackageDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getPackageDefPackageDefinitionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__CssExtension__PackageDefAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3946:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3950:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3951:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3951:1: ( ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3952:1: ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_17835);
            ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__PackageDefinition__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3961:1: rule__PackageDefinition__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3965:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3966:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3966:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3967:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDefinition__NameAssignment_17866);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__PackageDefinition__NameAssignment_1"


    // $ANTLR start "rule__PackageDefinition__RulesAssignment_3_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3976:1: rule__PackageDefinition__RulesAssignment_3_0 : ( ruleCSSRuleDefinition ) ;
    public final void rule__PackageDefinition__RulesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3980:1: ( ( ruleCSSRuleDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3981:1: ( ruleCSSRuleDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3981:1: ( ruleCSSRuleDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3982:1: ruleCSSRuleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getRulesCSSRuleDefinitionParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleDefinition_in_rule__PackageDefinition__RulesAssignment_3_07897);
            ruleCSSRuleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getRulesCSSRuleDefinitionParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__PackageDefinition__RulesAssignment_3_0"


    // $ANTLR start "rule__PackageDefinition__SubpackagesAssignment_3_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3991:1: rule__PackageDefinition__SubpackagesAssignment_3_1 : ( rulePackageDefinition ) ;
    public final void rule__PackageDefinition__SubpackagesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3995:1: ( ( rulePackageDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3996:1: ( rulePackageDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3996:1: ( rulePackageDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3997:1: rulePackageDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getSubpackagesPackageDefinitionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_rulePackageDefinition_in_rule__PackageDefinition__SubpackagesAssignment_3_17928);
            rulePackageDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getSubpackagesPackageDefinitionParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__PackageDefinition__SubpackagesAssignment_3_1"


    // $ANTLR start "rule__PackageDefinition__ElementsAssignment_3_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4006:1: rule__PackageDefinition__ElementsAssignment_3_2 : ( ruleElementDeclartion ) ;
    public final void rule__PackageDefinition__ElementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4010:1: ( ( ruleElementDeclartion ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4011:1: ( ruleElementDeclartion )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4011:1: ( ruleElementDeclartion )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4012:1: ruleElementDeclartion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getElementsElementDeclartionParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleElementDeclartion_in_rule__PackageDefinition__ElementsAssignment_3_27959);
            ruleElementDeclartion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getElementsElementDeclartionParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__PackageDefinition__ElementsAssignment_3_2"


    // $ANTLR start "rule__Doku__ContentAssignment"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4021:1: rule__Doku__ContentAssignment : ( RULE_JDOC ) ;
    public final void rule__Doku__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4025:1: ( ( RULE_JDOC ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4026:1: ( RULE_JDOC )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4026:1: ( RULE_JDOC )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4027:1: RULE_JDOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDokuAccess().getContentJDOCTerminalRuleCall_0()); 
            }
            match(input,RULE_JDOC,FOLLOW_RULE_JDOC_in_rule__Doku__ContentAssignment7990); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDokuAccess().getContentJDOCTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Doku__ContentAssignment"


    // $ANTLR start "rule__CSSType__TypeAssignment_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4036:1: rule__CSSType__TypeAssignment_0_1 : ( ( 'int' ) ) ;
    public final void rule__CSSType__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4040:1: ( ( ( 'int' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4041:1: ( ( 'int' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4041:1: ( ( 'int' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4042:1: ( 'int' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_0_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4043:1: ( 'int' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4044:1: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_0_1_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__CSSType__TypeAssignment_0_18026); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_0_1_0()); 
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
    // $ANTLR end "rule__CSSType__TypeAssignment_0_1"


    // $ANTLR start "rule__CSSType__FromAssignment_0_3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4059:1: rule__CSSType__FromAssignment_0_3 : ( RULE_INT ) ;
    public final void rule__CSSType__FromAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4063:1: ( ( RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4064:1: ( RULE_INT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4064:1: ( RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4065:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromINTTerminalRuleCall_0_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CSSType__FromAssignment_0_38065); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromINTTerminalRuleCall_0_3_0()); 
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
    // $ANTLR end "rule__CSSType__FromAssignment_0_3"


    // $ANTLR start "rule__CSSType__ToAssignment_0_5"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4074:1: rule__CSSType__ToAssignment_0_5 : ( RULE_INT ) ;
    public final void rule__CSSType__ToAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4078:1: ( ( RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4079:1: ( RULE_INT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4079:1: ( RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4080:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToINTTerminalRuleCall_0_5_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CSSType__ToAssignment_0_58096); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToINTTerminalRuleCall_0_5_0()); 
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
    // $ANTLR end "rule__CSSType__ToAssignment_0_5"


    // $ANTLR start "rule__CSSType__TypeAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4089:1: rule__CSSType__TypeAssignment_1_1 : ( ( 'double' ) ) ;
    public final void rule__CSSType__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4093:1: ( ( ( 'double' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4094:1: ( ( 'double' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4094:1: ( ( 'double' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4095:1: ( 'double' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_1_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4096:1: ( 'double' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4097:1: 'double'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_1_1_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__CSSType__TypeAssignment_1_18132); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_1_1_0()); 
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
    // $ANTLR end "rule__CSSType__TypeAssignment_1_1"


    // $ANTLR start "rule__CSSType__FromAssignment_1_3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4112:1: rule__CSSType__FromAssignment_1_3 : ( RULE_DOUBLE ) ;
    public final void rule__CSSType__FromAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4116:1: ( ( RULE_DOUBLE ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4117:1: ( RULE_DOUBLE )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4117:1: ( RULE_DOUBLE )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4118:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromDOUBLETerminalRuleCall_1_3_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__CSSType__FromAssignment_1_38171); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromDOUBLETerminalRuleCall_1_3_0()); 
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
    // $ANTLR end "rule__CSSType__FromAssignment_1_3"


    // $ANTLR start "rule__CSSType__ToAssignment_1_5"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4127:1: rule__CSSType__ToAssignment_1_5 : ( RULE_DOUBLE ) ;
    public final void rule__CSSType__ToAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4131:1: ( ( RULE_DOUBLE ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4132:1: ( RULE_DOUBLE )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4132:1: ( RULE_DOUBLE )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4133:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToDOUBLETerminalRuleCall_1_5_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__CSSType__ToAssignment_1_58202); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToDOUBLETerminalRuleCall_1_5_0()); 
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
    // $ANTLR end "rule__CSSType__ToAssignment_1_5"


    // $ANTLR start "rule__CSSType__TypeAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4142:1: rule__CSSType__TypeAssignment_2 : ( ( 'int' ) ) ;
    public final void rule__CSSType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4146:1: ( ( ( 'int' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4147:1: ( ( 'int' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4147:1: ( ( 'int' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4148:1: ( 'int' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_2_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4149:1: ( 'int' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4150:1: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_2_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__CSSType__TypeAssignment_28238); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_2_0()); 
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
    // $ANTLR end "rule__CSSType__TypeAssignment_2"


    // $ANTLR start "rule__ElementDeclartion__DokuAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4165:1: rule__ElementDeclartion__DokuAssignment_0 : ( ruleDoku ) ;
    public final void rule__ElementDeclartion__DokuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4169:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4170:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4170:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4171:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getDokuDokuParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__ElementDeclartion__DokuAssignment_08277);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDeclartionAccess().getDokuDokuParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__ElementDeclartion__DokuAssignment_0"


    // $ANTLR start "rule__ElementDeclartion__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4180:1: rule__ElementDeclartion__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ElementDeclartion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4184:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4185:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4185:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4186:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ElementDeclartion__NameAssignment_18308);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDeclartionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ElementDeclartion__NameAssignment_1"


    // $ANTLR start "rule__ElementDeclartion__PropertiesAssignment_3_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4195:1: rule__ElementDeclartion__PropertiesAssignment_3_0 : ( rulePropertyDefinition ) ;
    public final void rule__ElementDeclartion__PropertiesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4199:1: ( ( rulePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4200:1: ( rulePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4200:1: ( rulePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4201:1: rulePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getPropertiesPropertyDefinitionParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_rulePropertyDefinition_in_rule__ElementDeclartion__PropertiesAssignment_3_08339);
            rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDeclartionAccess().getPropertiesPropertyDefinitionParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__ElementDeclartion__PropertiesAssignment_3_0"


    // $ANTLR start "rule__ElementDeclartion__PseudoClassesAssignment_3_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4210:1: rule__ElementDeclartion__PseudoClassesAssignment_3_1 : ( rulePseudoClassDefinition ) ;
    public final void rule__ElementDeclartion__PseudoClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4214:1: ( ( rulePseudoClassDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4215:1: ( rulePseudoClassDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4215:1: ( rulePseudoClassDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4216:1: rulePseudoClassDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_rulePseudoClassDefinition_in_rule__ElementDeclartion__PseudoClassesAssignment_3_18370);
            rulePseudoClassDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDeclartionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__ElementDeclartion__PseudoClassesAssignment_3_1"


    // $ANTLR start "rule__PropertyDefinition__DokuAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4225:1: rule__PropertyDefinition__DokuAssignment_0 : ( ruleDoku ) ;
    public final void rule__PropertyDefinition__DokuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4229:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4230:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4230:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4231:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__PropertyDefinition__DokuAssignment_08401);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__PropertyDefinition__DokuAssignment_0"


    // $ANTLR start "rule__PropertyDefinition__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4240:1: rule__PropertyDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PropertyDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4244:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4245:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4245:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4246:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyDefinition__NameAssignment_18432); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__PropertyDefinition__NameAssignment_1"


    // $ANTLR start "rule__PropertyDefinition__RuleAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4255:1: rule__PropertyDefinition__RuleAssignment_2 : ( ruleCSSRuleOr ) ;
    public final void rule__PropertyDefinition__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4259:1: ( ( ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4260:1: ( ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4260:1: ( ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4261:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rule__PropertyDefinition__RuleAssignment_28463);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__PropertyDefinition__RuleAssignment_2"


    // $ANTLR start "rule__PropertyDefinition__DefaultAssignment_3_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4270:1: rule__PropertyDefinition__DefaultAssignment_3_1 : ( ruleCSSDefaultValue ) ;
    public final void rule__PropertyDefinition__DefaultAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4274:1: ( ( ruleCSSDefaultValue ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4275:1: ( ruleCSSDefaultValue )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4275:1: ( ruleCSSDefaultValue )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4276:1: ruleCSSDefaultValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSDefaultValue_in_rule__PropertyDefinition__DefaultAssignment_3_18494);
            ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__PropertyDefinition__DefaultAssignment_3_1"


    // $ANTLR start "rule__PseudoClassDefinition__DokuAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4285:1: rule__PseudoClassDefinition__DokuAssignment_0 : ( ruleDoku ) ;
    public final void rule__PseudoClassDefinition__DokuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4289:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4290:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4290:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4291:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__PseudoClassDefinition__DokuAssignment_08525);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__PseudoClassDefinition__DokuAssignment_0"


    // $ANTLR start "rule__PseudoClassDefinition__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4300:1: rule__PseudoClassDefinition__NameAssignment_1 : ( RULE_PSEUDO ) ;
    public final void rule__PseudoClassDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4304:1: ( ( RULE_PSEUDO ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4305:1: ( RULE_PSEUDO )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4305:1: ( RULE_PSEUDO )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4306:1: RULE_PSEUDO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_1_0()); 
            }
            match(input,RULE_PSEUDO,FOLLOW_RULE_PSEUDO_in_rule__PseudoClassDefinition__NameAssignment_18556); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__PseudoClassDefinition__NameAssignment_1"


    // $ANTLR start "rule__CSSRuleId__NameAssignment"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4315:1: rule__CSSRuleId__NameAssignment : ( ruleQualifiedName ) ;
    public final void rule__CSSRuleId__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4319:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4320:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4320:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4321:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleIdAccess().getNameQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CSSRuleId__NameAssignment8587);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleIdAccess().getNameQualifiedNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__CSSRuleId__NameAssignment"


    // $ANTLR start "rule__CSSRuleRef__RefAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4330:1: rule__CSSRuleRef__RefAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CSSRuleRef__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4334:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4335:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4335:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4336:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdCrossReference_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4337:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4338:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CSSRuleRef__RefAssignment_18622);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdCrossReference_1_0()); 
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
    // $ANTLR end "rule__CSSRuleRef__RefAssignment_1"


    // $ANTLR start "rule__CSSRuleDefinition__DokuAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4349:1: rule__CSSRuleDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__CSSRuleDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4353:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4354:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4354:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4355:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__CSSRuleDefinition__DokuAssignment_18657);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__DokuAssignment_1"


    // $ANTLR start "rule__CSSRuleDefinition__NameAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4364:1: rule__CSSRuleDefinition__NameAssignment_2 : ( ruleCSSRuleId ) ;
    public final void rule__CSSRuleDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4368:1: ( ( ruleCSSRuleId ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4369:1: ( ruleCSSRuleId )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4369:1: ( ruleCSSRuleId )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4370:1: ruleCSSRuleId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getNameCSSRuleIdParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleId_in_rule__CSSRuleDefinition__NameAssignment_28688);
            ruleCSSRuleId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getNameCSSRuleIdParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__NameAssignment_2"


    // $ANTLR start "rule__CSSRuleDefinition__RuleAssignment_4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4379:1: rule__CSSRuleDefinition__RuleAssignment_4 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleDefinition__RuleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4383:1: ( ( ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4384:1: ( ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4384:1: ( ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4385:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getRuleCSSRuleOrParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleDefinition__RuleAssignment_48719);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getRuleCSSRuleOrParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__RuleAssignment_4"


    // $ANTLR start "rule__CSSRuleOr__OrsAssignment_1_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4397:1: rule__CSSRuleOr__OrsAssignment_1_1_1 : ( ruleCSSRuleXor ) ;
    public final void rule__CSSRuleOr__OrsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4401:1: ( ( ruleCSSRuleXor ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4402:1: ( ruleCSSRuleXor )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4402:1: ( ruleCSSRuleXor )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4403:1: ruleCSSRuleXor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getOrsCSSRuleXorParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__OrsAssignment_1_1_18753);
            ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getOrsCSSRuleXorParserRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__CSSRuleOr__OrsAssignment_1_1_1"


    // $ANTLR start "rule__CSSRuleXor__XorsAssignment_1_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4412:1: rule__CSSRuleXor__XorsAssignment_1_1_1 : ( ruleCSSRuleConcat ) ;
    public final void rule__CSSRuleXor__XorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4416:1: ( ( ruleCSSRuleConcat ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4417:1: ( ruleCSSRuleConcat )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4417:1: ( ruleCSSRuleConcat )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4418:1: ruleCSSRuleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getXorsCSSRuleConcatParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__XorsAssignment_1_1_18784);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getXorsCSSRuleConcatParserRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__CSSRuleXor__XorsAssignment_1_1_1"


    // $ANTLR start "rule__CSSRuleConcat__ConcAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4427:1: rule__CSSRuleConcat__ConcAssignment_1_1 : ( ruleCSSRulePostfix ) ;
    public final void rule__CSSRuleConcat__ConcAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4431:1: ( ( ruleCSSRulePostfix ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4432:1: ( ruleCSSRulePostfix )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4432:1: ( ruleCSSRulePostfix )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4433:1: ruleCSSRulePostfix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcCSSRulePostfixParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__ConcAssignment_1_18815);
            ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcCSSRulePostfixParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__CSSRuleConcat__ConcAssignment_1_1"


    // $ANTLR start "rule__CSSRulePostfix__CardinalityAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4442:1: rule__CSSRulePostfix__CardinalityAssignment_1_1 : ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) ) ;
    public final void rule__CSSRulePostfix__CardinalityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4446:1: ( ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4447:1: ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4447:1: ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4448:1: ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAlternatives_1_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4449:1: ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4449:2: rule__CSSRulePostfix__CardinalityAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__CardinalityAlternatives_1_1_0_in_rule__CSSRulePostfix__CardinalityAssignment_1_18846);
            rule__CSSRulePostfix__CardinalityAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCardinalityAlternatives_1_1_0()); 
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
    // $ANTLR end "rule__CSSRulePostfix__CardinalityAssignment_1_1"


    // $ANTLR start "rule__CSSRuleBracket__InnerAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4458:1: rule__CSSRuleBracket__InnerAssignment_2 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleBracket__InnerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4462:1: ( ( ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4463:1: ( ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4463:1: ( ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4464:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleBracket__InnerAssignment_28879);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__CSSRuleBracket__InnerAssignment_2"


    // $ANTLR start "rule__CSSRuleParenthesis__InnerAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4473:1: rule__CSSRuleParenthesis__InnerAssignment_2 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleParenthesis__InnerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4477:1: ( ( ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4478:1: ( ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4478:1: ( ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4479:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleParenthesisAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleParenthesis__InnerAssignment_28910);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleParenthesisAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__CSSRuleParenthesis__InnerAssignment_2"


    // $ANTLR start "rule__CSSRulePrimary__ValueAssignment_3_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4488:1: rule__CSSRulePrimary__ValueAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__CSSRulePrimary__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4492:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4493:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4493:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4494:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getValueIDTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CSSRulePrimary__ValueAssignment_3_18941); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getValueIDTerminalRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__CSSRulePrimary__ValueAssignment_3_1"


    // $ANTLR start "rule__CSSRuleRegex__RegexAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4503:1: rule__CSSRuleRegex__RegexAssignment_1 : ( RULE_REGEX ) ;
    public final void rule__CSSRuleRegex__RegexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4507:1: ( ( RULE_REGEX ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4508:1: ( RULE_REGEX )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4508:1: ( RULE_REGEX )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4509:1: RULE_REGEX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getRegexREGEXTerminalRuleCall_1_0()); 
            }
            match(input,RULE_REGEX,FOLLOW_RULE_REGEX_in_rule__CSSRuleRegex__RegexAssignment_18972); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getRegexREGEXTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__CSSRuleRegex__RegexAssignment_1"


    // $ANTLR start "rule__CSSRuleLiteral__ValueAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4518:1: rule__CSSRuleLiteral__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__CSSRuleLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4522:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4523:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4523:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4524:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CSSRuleLiteral__ValueAssignment_19003); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__CSSRuleLiteral__ValueAssignment_1"


    // $ANTLR start "rule__CSSDefaultValue__ValAssignment_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4533:1: rule__CSSDefaultValue__ValAssignment_0_1 : ( ruleCSSRuleLiteral ) ;
    public final void rule__CSSDefaultValue__ValAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4537:1: ( ( ruleCSSRuleLiteral ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4538:1: ( ruleCSSRuleLiteral )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4538:1: ( ruleCSSRuleLiteral )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4539:1: ruleCSSRuleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getValCSSRuleLiteralParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleLiteral_in_rule__CSSDefaultValue__ValAssignment_0_19034);
            ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getValCSSRuleLiteralParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__CSSDefaultValue__ValAssignment_0_1"


    // $ANTLR start "rule__CSSDefaultValue__IvalAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4548:1: rule__CSSDefaultValue__IvalAssignment_1 : ( RULE_INT ) ;
    public final void rule__CSSDefaultValue__IvalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4552:1: ( ( RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4553:1: ( RULE_INT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4553:1: ( RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4554:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getIvalINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CSSDefaultValue__IvalAssignment_19065); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getIvalINTTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__CSSDefaultValue__IvalAssignment_1"


    // $ANTLR start "rule__CSSDefaultValue__DvalAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4563:1: rule__CSSDefaultValue__DvalAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__CSSDefaultValue__DvalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4567:1: ( ( RULE_DOUBLE ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4568:1: ( RULE_DOUBLE )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4568:1: ( RULE_DOUBLE )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4569:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getDvalDOUBLETerminalRuleCall_2_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__CSSDefaultValue__DvalAssignment_29096); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getDvalDOUBLETerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__CSSDefaultValue__DvalAssignment_2"


    // $ANTLR start "rule__CSSDefaultValue__SvalAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4578:1: rule__CSSDefaultValue__SvalAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CSSDefaultValue__SvalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4582:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4583:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4583:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4584:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getSvalSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CSSDefaultValue__SvalAssignment_39127); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getSvalSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__CSSDefaultValue__SvalAssignment_3"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\10\uffff";
    static final String DFA1_eofS =
        "\10\uffff";
    static final String DFA1_minS =
        "\2\4\1\23\1\uffff\1\4\2\uffff\1\23";
    static final String DFA1_maxS =
        "\1\24\1\4\1\36\1\uffff\1\4\2\uffff\1\36";
    static final String DFA1_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\1\3\1\uffff";
    static final String DFA1_specialS =
        "\10\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\1\16\uffff\1\3",
            "\1\2",
            "\1\4\1\uffff\1\6\10\uffff\1\5",
            "",
            "\1\7",
            "",
            "",
            "\1\4\1\uffff\1\6\10\uffff\1\5"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "859:1: rule__PackageDefinition__Alternatives_3 : ( ( ( rule__PackageDefinition__RulesAssignment_3_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleCssExtension_in_entryRuleCssExtension67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCssExtension74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__0_in_ruleCssExtension100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_entryRulePackageDefinition366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDefinition373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__0_in_rulePackageDefinition399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_entryRuleDoku426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoku433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Doku__ContentAssignment_in_ruleDoku459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSBaseType_in_entryRuleCSSBaseType491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSBaseType498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSType_in_ruleCSSBaseType528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSType_in_entryRuleCSSType559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSType566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Alternatives_in_ruleCSSType596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDeclartion_in_entryRuleElementDeclartion623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDeclartion630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__0_in_ruleElementDeclartion656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassDefinition_in_entryRulePseudoClassDefinition743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassDefinition750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__0_in_rulePseudoClassDefinition776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleId_in_entryRuleCSSRuleId803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleId810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleId__NameAssignment_in_ruleCSSRuleId836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleRef875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__0_in_ruleCSSRuleRef905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleDefinition_in_entryRuleCSSRuleDefinition937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleDefinition944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__0_in_ruleCSSRuleDefinition974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr1008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleOr1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__0_in_ruleCSSRuleOr1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor1077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleXor1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__0_in_ruleCSSRuleXor1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleConcat1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__0_in_ruleCSSRuleConcat1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix1215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePostfix1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__0_in_ruleCSSRulePostfix1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket1284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleBracket1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__0_in_ruleCSSRuleBracket1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleParenthesis_in_entryRuleCSSRuleParenthesis1353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleParenthesis1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleParenthesis__Group__0_in_ruleCSSRuleParenthesis1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary1422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePrimary1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Alternatives_in_ruleCSSRulePrimary1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRegex_in_entryRuleCSSRuleRegex1491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleRegex1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRegex__Group__0_in_ruleCSSRuleRegex1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral1555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleLiteral1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group__0_in_ruleCSSRuleLiteral1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue1615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSDefaultValue1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Alternatives_in_ruleCSSDefaultValue1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__RulesAssignment_3_0_in_rule__PackageDefinition__Alternatives_31684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__SubpackagesAssignment_3_1_in_rule__PackageDefinition__Alternatives_31702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__ElementsAssignment_3_2_in_rule__PackageDefinition__Alternatives_31720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__0_in_rule__CSSType__Alternatives1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__0_in_rule__CSSType__Alternatives1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__TypeAssignment_2_in_rule__CSSType__Alternatives1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__PropertiesAssignment_3_0_in_rule__ElementDeclartion__Alternatives_31822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__PseudoClassesAssignment_3_1_in_rule__ElementDeclartion__Alternatives_31840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_01874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_01894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_01914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_rule__CSSRulePrimary__Alternatives1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_rule__CSSRulePrimary__Alternatives1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleParenthesis_in_rule__CSSRulePrimary__Alternatives1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Group_3__0_in_rule__CSSRulePrimary__Alternatives1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSBaseType_in_rule__CSSRulePrimary__Alternatives2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRegex_in_rule__CSSRulePrimary__Alternatives2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_0__0_in_rule__CSSDefaultValue__Alternatives2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__IvalAssignment_1_in_rule__CSSDefaultValue__Alternatives2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__DvalAssignment_2_in_rule__CSSDefaultValue__Alternatives2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__SvalAssignment_3_in_rule__CSSDefaultValue__Alternatives2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__0__Impl_in_rule__CssExtension__Group__02151 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__1_in_rule__CssExtension__Group__02154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__ImportsAssignment_0_in_rule__CssExtension__Group__0__Impl2181 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__1__Impl_in_rule__CssExtension__Group__12212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__PackageDefAssignment_1_in_rule__CssExtension__Group__1__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Import__Group__0__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02397 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2483 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifiedName__Group_1__0__Impl2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__02642 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__02645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__12701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__02763 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__02766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__12825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__0__Impl_in_rule__PackageDefinition__Group__02888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__1_in_rule__PackageDefinition__Group__02891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PackageDefinition__Group__0__Impl2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__1__Impl_in_rule__PackageDefinition__Group__12950 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__2_in_rule__PackageDefinition__Group__12953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__NameAssignment_1_in_rule__PackageDefinition__Group__1__Impl2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__2__Impl_in_rule__PackageDefinition__Group__23010 = new BitSet(new long[]{0x0000000000500030L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__3_in_rule__PackageDefinition__Group__23013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PackageDefinition__Group__2__Impl3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__3__Impl_in_rule__PackageDefinition__Group__33072 = new BitSet(new long[]{0x0000000000500030L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__4_in_rule__PackageDefinition__Group__33075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Alternatives_3_in_rule__PackageDefinition__Group__3__Impl3102 = new BitSet(new long[]{0x0000000000100032L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__4__Impl_in_rule__PackageDefinition__Group__43133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PackageDefinition__Group__4__Impl3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__0__Impl_in_rule__CSSType__Group_0__03202 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__1_in_rule__CSSType__Group_0__03205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__1__Impl_in_rule__CSSType__Group_0__13263 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__2_in_rule__CSSType__Group_0__13266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__TypeAssignment_0_1_in_rule__CSSType__Group_0__1__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__2__Impl_in_rule__CSSType__Group_0__23323 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__3_in_rule__CSSType__Group_0__23326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CSSType__Group_0__2__Impl3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__3__Impl_in_rule__CSSType__Group_0__33385 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__4_in_rule__CSSType__Group_0__33388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__FromAssignment_0_3_in_rule__CSSType__Group_0__3__Impl3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__4__Impl_in_rule__CSSType__Group_0__43445 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__5_in_rule__CSSType__Group_0__43448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CSSType__Group_0__4__Impl3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__5__Impl_in_rule__CSSType__Group_0__53507 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__6_in_rule__CSSType__Group_0__53510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__ToAssignment_0_5_in_rule__CSSType__Group_0__5__Impl3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__6__Impl_in_rule__CSSType__Group_0__63567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CSSType__Group_0__6__Impl3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__0__Impl_in_rule__CSSType__Group_1__03640 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__1_in_rule__CSSType__Group_1__03643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__1__Impl_in_rule__CSSType__Group_1__13701 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__2_in_rule__CSSType__Group_1__13704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__TypeAssignment_1_1_in_rule__CSSType__Group_1__1__Impl3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__2__Impl_in_rule__CSSType__Group_1__23761 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__3_in_rule__CSSType__Group_1__23764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CSSType__Group_1__2__Impl3792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__3__Impl_in_rule__CSSType__Group_1__33823 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__4_in_rule__CSSType__Group_1__33826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__FromAssignment_1_3_in_rule__CSSType__Group_1__3__Impl3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__4__Impl_in_rule__CSSType__Group_1__43883 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__5_in_rule__CSSType__Group_1__43886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CSSType__Group_1__4__Impl3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__5__Impl_in_rule__CSSType__Group_1__53945 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__6_in_rule__CSSType__Group_1__53948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__ToAssignment_1_5_in_rule__CSSType__Group_1__5__Impl3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__6__Impl_in_rule__CSSType__Group_1__64005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CSSType__Group_1__6__Impl4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__0__Impl_in_rule__ElementDeclartion__Group__04078 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__1_in_rule__ElementDeclartion__Group__04081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__DokuAssignment_0_in_rule__ElementDeclartion__Group__0__Impl4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__1__Impl_in_rule__ElementDeclartion__Group__14139 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__2_in_rule__ElementDeclartion__Group__14142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__NameAssignment_1_in_rule__ElementDeclartion__Group__1__Impl4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__2__Impl_in_rule__ElementDeclartion__Group__24199 = new BitSet(new long[]{0x0000000000400130L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__3_in_rule__ElementDeclartion__Group__24202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ElementDeclartion__Group__2__Impl4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__3__Impl_in_rule__ElementDeclartion__Group__34261 = new BitSet(new long[]{0x0000000000400130L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__4_in_rule__ElementDeclartion__Group__34264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Alternatives_3_in_rule__ElementDeclartion__Group__3__Impl4291 = new BitSet(new long[]{0x0000000000000132L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__4__Impl_in_rule__ElementDeclartion__Group__44322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ElementDeclartion__Group__4__Impl4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__04391 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__04394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DokuAssignment_0_in_rule__PropertyDefinition__Group__0__Impl4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__14452 = new BitSet(new long[]{0x0000001A10800210L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__14455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NameAssignment_1_in_rule__PropertyDefinition__Group__1__Impl4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__24512 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__24515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__RuleAssignment_2_in_rule__PropertyDefinition__Group__2__Impl4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__34572 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__34575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__0_in_rule__PropertyDefinition__Group__3__Impl4602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__44633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PropertyDefinition__Group__4__Impl4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__0__Impl_in_rule__PropertyDefinition__Group_3__04702 = new BitSet(new long[]{0x00000000000004D0L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__1_in_rule__PropertyDefinition__Group_3__04705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PropertyDefinition__Group_3__0__Impl4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__1__Impl_in_rule__PropertyDefinition__Group_3__14764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DefaultAssignment_3_1_in_rule__PropertyDefinition__Group_3__1__Impl4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__0__Impl_in_rule__PseudoClassDefinition__Group__04825 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__1_in_rule__PseudoClassDefinition__Group__04828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__DokuAssignment_0_in_rule__PseudoClassDefinition__Group__0__Impl4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__1__Impl_in_rule__PseudoClassDefinition__Group__14886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__NameAssignment_1_in_rule__PseudoClassDefinition__Group__1__Impl4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__0__Impl_in_rule__CSSRuleRef__Group__04947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__1_in_rule__CSSRuleRef__Group__04950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CSSRuleRef__Group__0__Impl4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__1__Impl_in_rule__CSSRuleRef__Group__15009 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__2_in_rule__CSSRuleRef__Group__15012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__RefAssignment_1_in_rule__CSSRuleRef__Group__1__Impl5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__2__Impl_in_rule__CSSRuleRef__Group__25069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CSSRuleRef__Group__2__Impl5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__0__Impl_in_rule__CSSRuleDefinition__Group__05134 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__1_in_rule__CSSRuleDefinition__Group__05137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__1__Impl_in_rule__CSSRuleDefinition__Group__15195 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__2_in_rule__CSSRuleDefinition__Group__15198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__DokuAssignment_1_in_rule__CSSRuleDefinition__Group__1__Impl5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__2__Impl_in_rule__CSSRuleDefinition__Group__25256 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__3_in_rule__CSSRuleDefinition__Group__25259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__NameAssignment_2_in_rule__CSSRuleDefinition__Group__2__Impl5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__3__Impl_in_rule__CSSRuleDefinition__Group__35316 = new BitSet(new long[]{0x0000001A10800210L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__4_in_rule__CSSRuleDefinition__Group__35319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CSSRuleDefinition__Group__3__Impl5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__4__Impl_in_rule__CSSRuleDefinition__Group__45378 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__5_in_rule__CSSRuleDefinition__Group__45381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__RuleAssignment_4_in_rule__CSSRuleDefinition__Group__4__Impl5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__5__Impl_in_rule__CSSRuleDefinition__Group__55438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CSSRuleDefinition__Group__5__Impl5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__0__Impl_in_rule__CSSRuleOr__Group__05511 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__1_in_rule__CSSRuleOr__Group__05514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__Group__0__Impl5541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__1__Impl_in_rule__CSSRuleOr__Group__15570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__0_in_rule__CSSRuleOr__Group__1__Impl5597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__0__Impl_in_rule__CSSRuleOr__Group_1__05632 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__1_in_rule__CSSRuleOr__Group_1__05635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__1__Impl_in_rule__CSSRuleOr__Group_1__15693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl5722 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl5734 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__0__Impl_in_rule__CSSRuleOr__Group_1_1__05771 = new BitSet(new long[]{0x0000001A10800210L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__1_in_rule__CSSRuleOr__Group_1_1__05774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CSSRuleOr__Group_1_1__0__Impl5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__1__Impl_in_rule__CSSRuleOr__Group_1_1__15833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__OrsAssignment_1_1_1_in_rule__CSSRuleOr__Group_1_1__1__Impl5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__0__Impl_in_rule__CSSRuleXor__Group__05894 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__1_in_rule__CSSRuleXor__Group__05897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__Group__0__Impl5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__1__Impl_in_rule__CSSRuleXor__Group__15953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__0_in_rule__CSSRuleXor__Group__1__Impl5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__0__Impl_in_rule__CSSRuleXor__Group_1__06015 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__1_in_rule__CSSRuleXor__Group_1__06018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__1__Impl_in_rule__CSSRuleXor__Group_1__16076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl6105 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl6117 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__0__Impl_in_rule__CSSRuleXor__Group_1_1__06154 = new BitSet(new long[]{0x0000001A10800210L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__1_in_rule__CSSRuleXor__Group_1_1__06157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CSSRuleXor__Group_1_1__0__Impl6185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__1__Impl_in_rule__CSSRuleXor__Group_1_1__16216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__XorsAssignment_1_1_1_in_rule__CSSRuleXor__Group_1_1__1__Impl6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__0__Impl_in_rule__CSSRuleConcat__Group__06277 = new BitSet(new long[]{0x0000001A10800210L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__1_in_rule__CSSRuleConcat__Group__06280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__Group__0__Impl6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__1__Impl_in_rule__CSSRuleConcat__Group__16336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__0_in_rule__CSSRuleConcat__Group__1__Impl6363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__0__Impl_in_rule__CSSRuleConcat__Group_1__06398 = new BitSet(new long[]{0x0000001A10800210L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__1_in_rule__CSSRuleConcat__Group_1__06401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__1__Impl_in_rule__CSSRuleConcat__Group_1__16459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl6488 = new BitSet(new long[]{0x0000001A10800212L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl6500 = new BitSet(new long[]{0x0000001A10800212L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__0__Impl_in_rule__CSSRulePostfix__Group__06537 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__1_in_rule__CSSRulePostfix__Group__06540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_rule__CSSRulePostfix__Group__0__Impl6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__1__Impl_in_rule__CSSRulePostfix__Group__16596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__0_in_rule__CSSRulePostfix__Group__1__Impl6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__0__Impl_in_rule__CSSRulePostfix__Group_1__06658 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__1_in_rule__CSSRulePostfix__Group_1__06661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__1__Impl_in_rule__CSSRulePostfix__Group_1__16719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__CardinalityAssignment_1_1_in_rule__CSSRulePostfix__Group_1__1__Impl6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__0__Impl_in_rule__CSSRuleBracket__Group__06780 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__1_in_rule__CSSRuleBracket__Group__06783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__1__Impl_in_rule__CSSRuleBracket__Group__16841 = new BitSet(new long[]{0x0000001A10800210L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__2_in_rule__CSSRuleBracket__Group__16844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CSSRuleBracket__Group__1__Impl6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__2__Impl_in_rule__CSSRuleBracket__Group__26903 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__3_in_rule__CSSRuleBracket__Group__26906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__InnerAssignment_2_in_rule__CSSRuleBracket__Group__2__Impl6933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__3__Impl_in_rule__CSSRuleBracket__Group__36963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CSSRuleBracket__Group__3__Impl6991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleParenthesis__Group__0__Impl_in_rule__CSSRuleParenthesis__Group__07030 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CSSRuleParenthesis__Group__1_in_rule__CSSRuleParenthesis__Group__07033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleParenthesis__Group__1__Impl_in_rule__CSSRuleParenthesis__Group__17091 = new BitSet(new long[]{0x0000001A10800210L});
    public static final BitSet FOLLOW_rule__CSSRuleParenthesis__Group__2_in_rule__CSSRuleParenthesis__Group__17094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CSSRuleParenthesis__Group__1__Impl7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleParenthesis__Group__2__Impl_in_rule__CSSRuleParenthesis__Group__27153 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CSSRuleParenthesis__Group__3_in_rule__CSSRuleParenthesis__Group__27156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleParenthesis__InnerAssignment_2_in_rule__CSSRuleParenthesis__Group__2__Impl7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleParenthesis__Group__3__Impl_in_rule__CSSRuleParenthesis__Group__37213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CSSRuleParenthesis__Group__3__Impl7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Group_3__0__Impl_in_rule__CSSRulePrimary__Group_3__07280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Group_3__1_in_rule__CSSRulePrimary__Group_3__07283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Group_3__1__Impl_in_rule__CSSRulePrimary__Group_3__17341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__ValueAssignment_3_1_in_rule__CSSRulePrimary__Group_3__1__Impl7368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRegex__Group__0__Impl_in_rule__CSSRuleRegex__Group__07402 = new BitSet(new long[]{0x0000001A10800210L});
    public static final BitSet FOLLOW_rule__CSSRuleRegex__Group__1_in_rule__CSSRuleRegex__Group__07405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRegex__Group__1__Impl_in_rule__CSSRuleRegex__Group__17463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRegex__RegexAssignment_1_in_rule__CSSRuleRegex__Group__1__Impl7490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group__0__Impl_in_rule__CSSRuleLiteral__Group__07524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group__1_in_rule__CSSRuleLiteral__Group__07527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group__1__Impl_in_rule__CSSRuleLiteral__Group__17585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__ValueAssignment_1_in_rule__CSSRuleLiteral__Group__1__Impl7612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_0__0__Impl_in_rule__CSSDefaultValue__Group_0__07646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_0__1_in_rule__CSSDefaultValue__Group_0__07649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_0__1__Impl_in_rule__CSSDefaultValue__Group_0__17707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__ValAssignment_0_1_in_rule__CSSDefaultValue__Group_0__1__Impl7734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__CssExtension__ImportsAssignment_07773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_rule__CssExtension__PackageDefAssignment_17804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_17835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDefinition__NameAssignment_17866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleDefinition_in_rule__PackageDefinition__RulesAssignment_3_07897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_rule__PackageDefinition__SubpackagesAssignment_3_17928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDeclartion_in_rule__PackageDefinition__ElementsAssignment_3_27959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JDOC_in_rule__Doku__ContentAssignment7990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CSSType__TypeAssignment_0_18026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CSSType__FromAssignment_0_38065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CSSType__ToAssignment_0_58096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__CSSType__TypeAssignment_1_18132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__CSSType__FromAssignment_1_38171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__CSSType__ToAssignment_1_58202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CSSType__TypeAssignment_28238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__ElementDeclartion__DokuAssignment_08277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ElementDeclartion__NameAssignment_18308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_rule__ElementDeclartion__PropertiesAssignment_3_08339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassDefinition_in_rule__ElementDeclartion__PseudoClassesAssignment_3_18370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__PropertyDefinition__DokuAssignment_08401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyDefinition__NameAssignment_18432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rule__PropertyDefinition__RuleAssignment_28463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_rule__PropertyDefinition__DefaultAssignment_3_18494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__PseudoClassDefinition__DokuAssignment_08525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PSEUDO_in_rule__PseudoClassDefinition__NameAssignment_18556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CSSRuleId__NameAssignment8587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CSSRuleRef__RefAssignment_18622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__CSSRuleDefinition__DokuAssignment_18657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleId_in_rule__CSSRuleDefinition__NameAssignment_28688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleDefinition__RuleAssignment_48719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__OrsAssignment_1_1_18753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__XorsAssignment_1_1_18784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__ConcAssignment_1_18815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__CardinalityAlternatives_1_1_0_in_rule__CSSRulePostfix__CardinalityAssignment_1_18846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleBracket__InnerAssignment_28879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleParenthesis__InnerAssignment_28910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CSSRulePrimary__ValueAssignment_3_18941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REGEX_in_rule__CSSRuleRegex__RegexAssignment_18972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CSSRuleLiteral__ValueAssignment_19003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_rule__CSSDefaultValue__ValAssignment_0_19034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CSSDefaultValue__IvalAssignment_19065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__CSSDefaultValue__DvalAssignment_29096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CSSDefaultValue__SvalAssignment_39127 = new BitSet(new long[]{0x0000000000000002L});

}