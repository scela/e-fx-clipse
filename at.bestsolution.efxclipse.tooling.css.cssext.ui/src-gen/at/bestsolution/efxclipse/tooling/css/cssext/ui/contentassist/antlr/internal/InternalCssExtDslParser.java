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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'+'", "'?'", "'import'", "'.'", "'package'", "'{'", "'}'", "'<'", "'>'", "'='", "';'", "'|'", "'||'", "'['", "']'"
    };
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

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


    // $ANTLR start "entryRulePackageDeclaration"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:201:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:202:1: ( rulePackageDeclaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:203:1: rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration366);
            rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration373); if (state.failed) return ;

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:210:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:214:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:215:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:215:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:216:1: ( rule__PackageDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:217:1: ( rule__PackageDeclaration__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:217:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration399);
            rule__PackageDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getGroup()); 
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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleCSSRuleSet"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:229:1: entryRuleCSSRuleSet : ruleCSSRuleSet EOF ;
    public final void entryRuleCSSRuleSet() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:230:1: ( ruleCSSRuleSet EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:231:1: ruleCSSRuleSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSetRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleSet_in_entryRuleCSSRuleSet426);
            ruleCSSRuleSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSetRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleSet433); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleSet"


    // $ANTLR start "ruleCSSRuleSet"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:238:1: ruleCSSRuleSet : ( ( ( rule__CSSRuleSet__RulesAssignment ) ) ( ( rule__CSSRuleSet__RulesAssignment )* ) ) ;
    public final void ruleCSSRuleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:242:2: ( ( ( ( rule__CSSRuleSet__RulesAssignment ) ) ( ( rule__CSSRuleSet__RulesAssignment )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:243:1: ( ( ( rule__CSSRuleSet__RulesAssignment ) ) ( ( rule__CSSRuleSet__RulesAssignment )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:243:1: ( ( ( rule__CSSRuleSet__RulesAssignment ) ) ( ( rule__CSSRuleSet__RulesAssignment )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:244:1: ( ( rule__CSSRuleSet__RulesAssignment ) ) ( ( rule__CSSRuleSet__RulesAssignment )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:244:1: ( ( rule__CSSRuleSet__RulesAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:245:1: ( rule__CSSRuleSet__RulesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSetAccess().getRulesAssignment()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:246:1: ( rule__CSSRuleSet__RulesAssignment )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:246:2: rule__CSSRuleSet__RulesAssignment
            {
            pushFollow(FOLLOW_rule__CSSRuleSet__RulesAssignment_in_ruleCSSRuleSet461);
            rule__CSSRuleSet__RulesAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSetAccess().getRulesAssignment()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:249:1: ( ( rule__CSSRuleSet__RulesAssignment )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:250:1: ( rule__CSSRuleSet__RulesAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSetAccess().getRulesAssignment()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:251:1: ( rule__CSSRuleSet__RulesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:251:2: rule__CSSRuleSet__RulesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__CSSRuleSet__RulesAssignment_in_ruleCSSRuleSet473);
            	    rule__CSSRuleSet__RulesAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSetAccess().getRulesAssignment()); 
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
    // $ANTLR end "ruleCSSRuleSet"


    // $ANTLR start "entryRuleCSSRuleId"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:264:1: entryRuleCSSRuleId : ruleCSSRuleId EOF ;
    public final void entryRuleCSSRuleId() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:265:1: ( ruleCSSRuleId EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:266:1: ruleCSSRuleId EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleIdRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleId_in_entryRuleCSSRuleId503);
            ruleCSSRuleId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleIdRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleId510); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:273:1: ruleCSSRuleId : ( ( rule__CSSRuleId__NameAssignment ) ) ;
    public final void ruleCSSRuleId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:277:2: ( ( ( rule__CSSRuleId__NameAssignment ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:278:1: ( ( rule__CSSRuleId__NameAssignment ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:278:1: ( ( rule__CSSRuleId__NameAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:279:1: ( rule__CSSRuleId__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleIdAccess().getNameAssignment()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:280:1: ( rule__CSSRuleId__NameAssignment )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:280:2: rule__CSSRuleId__NameAssignment
            {
            pushFollow(FOLLOW_rule__CSSRuleId__NameAssignment_in_ruleCSSRuleId536);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:292:1: entryRuleCSSRuleRef : ruleCSSRuleRef EOF ;
    public final void entryRuleCSSRuleRef() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:293:1: ( ruleCSSRuleRef EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:294:1: ruleCSSRuleRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef563);
            ruleCSSRuleRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleRef570); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleRef"


    // $ANTLR start "ruleCSSRuleRef"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:301:1: ruleCSSRuleRef : ( ( rule__CSSRuleRef__Group__0 ) ) ;
    public final void ruleCSSRuleRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:305:2: ( ( ( rule__CSSRuleRef__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:306:1: ( ( rule__CSSRuleRef__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:306:1: ( ( rule__CSSRuleRef__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:307:1: ( rule__CSSRuleRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:308:1: ( rule__CSSRuleRef__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:308:2: rule__CSSRuleRef__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__0_in_ruleCSSRuleRef596);
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

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleRef"


    // $ANTLR start "entryRuleCSSRuleAssignment"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:320:1: entryRuleCSSRuleAssignment : ruleCSSRuleAssignment EOF ;
    public final void entryRuleCSSRuleAssignment() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:321:1: ( ruleCSSRuleAssignment EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:322:1: ruleCSSRuleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleAssignment_in_entryRuleCSSRuleAssignment623);
            ruleCSSRuleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleAssignment630); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleAssignment"


    // $ANTLR start "ruleCSSRuleAssignment"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:329:1: ruleCSSRuleAssignment : ( ( rule__CSSRuleAssignment__Group__0 ) ) ;
    public final void ruleCSSRuleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:333:2: ( ( ( rule__CSSRuleAssignment__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:334:1: ( ( rule__CSSRuleAssignment__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:334:1: ( ( rule__CSSRuleAssignment__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:335:1: ( rule__CSSRuleAssignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleAssignmentAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:336:1: ( rule__CSSRuleAssignment__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:336:2: rule__CSSRuleAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleAssignment__Group__0_in_ruleCSSRuleAssignment656);
            rule__CSSRuleAssignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleAssignmentAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRuleAssignment"


    // $ANTLR start "entryRuleCSSRuleOrExpression"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:348:1: entryRuleCSSRuleOrExpression : ruleCSSRuleOrExpression EOF ;
    public final void entryRuleCSSRuleOrExpression() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:349:1: ( ruleCSSRuleOrExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:350:1: ruleCSSRuleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOrExpression_in_entryRuleCSSRuleOrExpression683);
            ruleCSSRuleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleOrExpression690); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleOrExpression"


    // $ANTLR start "ruleCSSRuleOrExpression"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:357:1: ruleCSSRuleOrExpression : ( ( rule__CSSRuleOrExpression__Group__0 ) ) ;
    public final void ruleCSSRuleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:361:2: ( ( ( rule__CSSRuleOrExpression__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:362:1: ( ( rule__CSSRuleOrExpression__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:362:1: ( ( rule__CSSRuleOrExpression__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:363:1: ( rule__CSSRuleOrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrExpressionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:364:1: ( rule__CSSRuleOrExpression__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:364:2: rule__CSSRuleOrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleOrExpression__Group__0_in_ruleCSSRuleOrExpression716);
            rule__CSSRuleOrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRuleOrExpression"


    // $ANTLR start "entryRuleCSSRuleXorExpression"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:376:1: entryRuleCSSRuleXorExpression : ruleCSSRuleXorExpression EOF ;
    public final void entryRuleCSSRuleXorExpression() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:377:1: ( ruleCSSRuleXorExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:378:1: ruleCSSRuleXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXorExpression_in_entryRuleCSSRuleXorExpression743);
            ruleCSSRuleXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleXorExpression750); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleXorExpression"


    // $ANTLR start "ruleCSSRuleXorExpression"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:385:1: ruleCSSRuleXorExpression : ( ( rule__CSSRuleXorExpression__Group__0 ) ) ;
    public final void ruleCSSRuleXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:389:2: ( ( ( rule__CSSRuleXorExpression__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:390:1: ( ( rule__CSSRuleXorExpression__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:390:1: ( ( rule__CSSRuleXorExpression__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:391:1: ( rule__CSSRuleXorExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorExpressionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:392:1: ( rule__CSSRuleXorExpression__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:392:2: rule__CSSRuleXorExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleXorExpression__Group__0_in_ruleCSSRuleXorExpression776);
            rule__CSSRuleXorExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRuleXorExpression"


    // $ANTLR start "entryRuleCSSRuleBracketExpression"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:404:1: entryRuleCSSRuleBracketExpression : ruleCSSRuleBracketExpression EOF ;
    public final void entryRuleCSSRuleBracketExpression() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:405:1: ( ruleCSSRuleBracketExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:406:1: ruleCSSRuleBracketExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleBracketExpression_in_entryRuleCSSRuleBracketExpression803);
            ruleCSSRuleBracketExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleBracketExpression810); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleBracketExpression"


    // $ANTLR start "ruleCSSRuleBracketExpression"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:413:1: ruleCSSRuleBracketExpression : ( ( rule__CSSRuleBracketExpression__Group__0 ) ) ;
    public final void ruleCSSRuleBracketExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:417:2: ( ( ( rule__CSSRuleBracketExpression__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:418:1: ( ( rule__CSSRuleBracketExpression__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:418:1: ( ( rule__CSSRuleBracketExpression__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:419:1: ( rule__CSSRuleBracketExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketExpressionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:420:1: ( rule__CSSRuleBracketExpression__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:420:2: rule__CSSRuleBracketExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleBracketExpression__Group__0_in_ruleCSSRuleBracketExpression836);
            rule__CSSRuleBracketExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRuleBracketExpression"


    // $ANTLR start "entryRuleCSSRulePostfixExpression"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:432:1: entryRuleCSSRulePostfixExpression : ruleCSSRulePostfixExpression EOF ;
    public final void entryRuleCSSRulePostfixExpression() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:433:1: ( ruleCSSRulePostfixExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:434:1: ruleCSSRulePostfixExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfixExpression_in_entryRuleCSSRulePostfixExpression863);
            ruleCSSRulePostfixExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePostfixExpression870); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRulePostfixExpression"


    // $ANTLR start "ruleCSSRulePostfixExpression"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:441:1: ruleCSSRulePostfixExpression : ( ( rule__CSSRulePostfixExpression__Group__0 ) ) ;
    public final void ruleCSSRulePostfixExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:445:2: ( ( ( rule__CSSRulePostfixExpression__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:446:1: ( ( rule__CSSRulePostfixExpression__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:446:1: ( ( rule__CSSRulePostfixExpression__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:447:1: ( rule__CSSRulePostfixExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixExpressionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:448:1: ( rule__CSSRulePostfixExpression__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:448:2: rule__CSSRulePostfixExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRulePostfixExpression__Group__0_in_ruleCSSRulePostfixExpression896);
            rule__CSSRulePostfixExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleCSSRulePostfixExpression"


    // $ANTLR start "entryRuleCSSRuleConcat"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:460:1: entryRuleCSSRuleConcat : ruleCSSRuleConcat EOF ;
    public final void entryRuleCSSRuleConcat() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:461:1: ( ruleCSSRuleConcat EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:462:1: ruleCSSRuleConcat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat923);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleConcat930); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleConcat"


    // $ANTLR start "ruleCSSRuleConcat"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:469:1: ruleCSSRuleConcat : ( ( rule__CSSRuleConcat__Group__0 ) ) ;
    public final void ruleCSSRuleConcat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:473:2: ( ( ( rule__CSSRuleConcat__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:474:1: ( ( rule__CSSRuleConcat__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:474:1: ( ( rule__CSSRuleConcat__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:475:1: ( rule__CSSRuleConcat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:476:1: ( rule__CSSRuleConcat__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:476:2: rule__CSSRuleConcat__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__0_in_ruleCSSRuleConcat956);
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

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleConcat"


    // $ANTLR start "entryRuleCSSRuleLiteral"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:488:1: entryRuleCSSRuleLiteral : ruleCSSRuleLiteral EOF ;
    public final void entryRuleCSSRuleLiteral() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:489:1: ( ruleCSSRuleLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:490:1: ruleCSSRuleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral983);
            ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleLiteral990); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:497:1: ruleCSSRuleLiteral : ( RULE_ID ) ;
    public final void ruleCSSRuleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:501:2: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:502:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:502:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:503:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCSSRuleLiteral1016); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getIDTerminalRuleCall()); 
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


    // $ANTLR start "entryRuleCSSRulePrimaryExpression"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:516:1: entryRuleCSSRulePrimaryExpression : ruleCSSRulePrimaryExpression EOF ;
    public final void entryRuleCSSRulePrimaryExpression() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:517:1: ( ruleCSSRulePrimaryExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:518:1: ruleCSSRulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePrimaryExpression_in_entryRuleCSSRulePrimaryExpression1042);
            ruleCSSRulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePrimaryExpression1049); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRulePrimaryExpression"


    // $ANTLR start "ruleCSSRulePrimaryExpression"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:525:1: ruleCSSRulePrimaryExpression : ( ( rule__CSSRulePrimaryExpression__Alternatives ) ) ;
    public final void ruleCSSRulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:529:2: ( ( ( rule__CSSRulePrimaryExpression__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:530:1: ( ( rule__CSSRulePrimaryExpression__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:530:1: ( ( rule__CSSRulePrimaryExpression__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:531:1: ( rule__CSSRulePrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryExpressionAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:532:1: ( rule__CSSRulePrimaryExpression__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:532:2: rule__CSSRulePrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__CSSRulePrimaryExpression__Alternatives_in_ruleCSSRulePrimaryExpression1075);
            rule__CSSRulePrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCSSRulePrimaryExpression"


    // $ANTLR start "rule__CSSRulePostfixExpression__CAlternatives_1_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:544:1: rule__CSSRulePostfixExpression__CAlternatives_1_0 : ( ( '*' ) | ( '+' ) | ( '?' ) );
    public final void rule__CSSRulePostfixExpression__CAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:548:1: ( ( '*' ) | ( '+' ) | ( '?' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:549:1: ( '*' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:549:1: ( '*' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:550:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixExpressionAccess().getCAsteriskKeyword_1_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__CSSRulePostfixExpression__CAlternatives_1_01112); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixExpressionAccess().getCAsteriskKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:557:6: ( '+' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:557:6: ( '+' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:558:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixExpressionAccess().getCPlusSignKeyword_1_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__CSSRulePostfixExpression__CAlternatives_1_01132); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixExpressionAccess().getCPlusSignKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:565:6: ( '?' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:565:6: ( '?' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:566:1: '?'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixExpressionAccess().getCQuestionMarkKeyword_1_0_2()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__CSSRulePostfixExpression__CAlternatives_1_01152); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixExpressionAccess().getCQuestionMarkKeyword_1_0_2()); 
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
    // $ANTLR end "rule__CSSRulePostfixExpression__CAlternatives_1_0"


    // $ANTLR start "rule__CSSRulePrimaryExpression__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:578:1: rule__CSSRulePrimaryExpression__Alternatives : ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracketExpression ) | ( ruleCSSRuleLiteral ) );
    public final void rule__CSSRulePrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:582:1: ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracketExpression ) | ( ruleCSSRuleLiteral ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:583:1: ( ruleCSSRuleRef )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:583:1: ( ruleCSSRuleRef )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:584:1: ruleCSSRuleRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryExpressionAccess().getCSSRuleRefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleRef_in_rule__CSSRulePrimaryExpression__Alternatives1186);
                    ruleCSSRuleRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryExpressionAccess().getCSSRuleRefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:589:6: ( ruleCSSRuleBracketExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:589:6: ( ruleCSSRuleBracketExpression )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:590:1: ruleCSSRuleBracketExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryExpressionAccess().getCSSRuleBracketExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleBracketExpression_in_rule__CSSRulePrimaryExpression__Alternatives1203);
                    ruleCSSRuleBracketExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryExpressionAccess().getCSSRuleBracketExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:595:6: ( ruleCSSRuleLiteral )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:595:6: ( ruleCSSRuleLiteral )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:596:1: ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryExpressionAccess().getCSSRuleLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleLiteral_in_rule__CSSRulePrimaryExpression__Alternatives1220);
                    ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryExpressionAccess().getCSSRuleLiteralParserRuleCall_2()); 
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
    // $ANTLR end "rule__CSSRulePrimaryExpression__Alternatives"


    // $ANTLR start "rule__CssExtension__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:608:1: rule__CssExtension__Group__0 : rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1 ;
    public final void rule__CssExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:612:1: ( rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:613:2: rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1
            {
            pushFollow(FOLLOW_rule__CssExtension__Group__0__Impl_in_rule__CssExtension__Group__01250);
            rule__CssExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CssExtension__Group__1_in_rule__CssExtension__Group__01253);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:620:1: rule__CssExtension__Group__0__Impl : ( ( rule__CssExtension__ImportsAssignment_0 )* ) ;
    public final void rule__CssExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:624:1: ( ( ( rule__CssExtension__ImportsAssignment_0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:625:1: ( ( rule__CssExtension__ImportsAssignment_0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:625:1: ( ( rule__CssExtension__ImportsAssignment_0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:626:1: ( rule__CssExtension__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getImportsAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:627:1: ( rule__CssExtension__ImportsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:627:2: rule__CssExtension__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__CssExtension__ImportsAssignment_0_in_rule__CssExtension__Group__0__Impl1280);
            	    rule__CssExtension__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:637:1: rule__CssExtension__Group__1 : rule__CssExtension__Group__1__Impl ;
    public final void rule__CssExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:641:1: ( rule__CssExtension__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:642:2: rule__CssExtension__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CssExtension__Group__1__Impl_in_rule__CssExtension__Group__11311);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:648:1: rule__CssExtension__Group__1__Impl : ( ( rule__CssExtension__PackageDefAssignment_1 )? ) ;
    public final void rule__CssExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:652:1: ( ( ( rule__CssExtension__PackageDefAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:653:1: ( ( rule__CssExtension__PackageDefAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:653:1: ( ( rule__CssExtension__PackageDefAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:654:1: ( rule__CssExtension__PackageDefAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getPackageDefAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:655:1: ( rule__CssExtension__PackageDefAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:655:2: rule__CssExtension__PackageDefAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CssExtension__PackageDefAssignment_1_in_rule__CssExtension__Group__1__Impl1338);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:669:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:673:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:674:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01373);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01376);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:681:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:685:1: ( ( 'import' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:686:1: ( 'import' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:686:1: ( 'import' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:687:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Import__Group__0__Impl1404); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:700:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:704:1: ( rule__Import__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:705:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11435);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:711:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:715:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:716:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:716:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:717:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:718:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:718:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1462);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:732:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:736:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:737:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01496);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01499);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:744:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:748:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:749:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:749:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:750:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl1526);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:761:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:765:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:766:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11555);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:772:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:776:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:777:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:777:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:778:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:779:1: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_ID) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:779:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1582);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:793:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:797:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:798:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01617);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01620);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:805:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:809:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:810:1: ( ( '.' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:810:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:811:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:812:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:813:2: '.'
            {
            match(input,15,FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl1649); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:824:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:828:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:829:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11681);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:835:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:839:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:840:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:840:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:841:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl1708);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:856:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:860:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:861:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__01741);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__01744);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:868:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:872:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:873:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:873:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:874:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl1771);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:885:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:889:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:890:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__11800);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:896:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:900:1: ( ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:901:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:901:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:902:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:903:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:903:2: rule__QualifiedNameWithWildCard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl1827);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:917:1: rule__QualifiedNameWithWildCard__Group_1__0 : rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:921:1: ( rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:922:2: rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__01862);
            rule__QualifiedNameWithWildCard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__01865);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:929:1: rule__QualifiedNameWithWildCard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:933:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:934:1: ( '.' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:934:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:935:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl1893); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:948:1: rule__QualifiedNameWithWildCard__Group_1__1 : rule__QualifiedNameWithWildCard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:952:1: ( rule__QualifiedNameWithWildCard__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:953:2: rule__QualifiedNameWithWildCard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__11924);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:959:1: rule__QualifiedNameWithWildCard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:963:1: ( ( '*' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:964:1: ( '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:964:1: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:965:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl1952); if (state.failed) return ;
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


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:982:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:986:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:987:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01987);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01990);
            rule__PackageDeclaration__Group__1();

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
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:994:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:998:1: ( ( 'package' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:999:1: ( 'package' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:999:1: ( 'package' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1000:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__PackageDeclaration__Group__0__Impl2018); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
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
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1013:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1017:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1018:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12049);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12052);
            rule__PackageDeclaration__Group__2();

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
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1025:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1029:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1030:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1030:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1031:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1032:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1032:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2079);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1042:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1046:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1047:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22109);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__22112);
            rule__PackageDeclaration__Group__3();

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
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1054:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1058:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1059:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1059:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1060:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__PackageDeclaration__Group__2__Impl2140); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1073:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1077:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1078:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__32171);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__32174);
            rule__PackageDeclaration__Group__4();

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
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1085:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__RuleAssignment_3 )? ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1089:1: ( ( ( rule__PackageDeclaration__RuleAssignment_3 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1090:1: ( ( rule__PackageDeclaration__RuleAssignment_3 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1090:1: ( ( rule__PackageDeclaration__RuleAssignment_3 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1091:1: ( rule__PackageDeclaration__RuleAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getRuleAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1092:1: ( rule__PackageDeclaration__RuleAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1092:2: rule__PackageDeclaration__RuleAssignment_3
                    {
                    pushFollow(FOLLOW_rule__PackageDeclaration__RuleAssignment_3_in_rule__PackageDeclaration__Group__3__Impl2201);
                    rule__PackageDeclaration__RuleAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getRuleAssignment_3()); 
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
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1102:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1106:1: ( rule__PackageDeclaration__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1107:2: rule__PackageDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42232);
            rule__PackageDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1113:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1117:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1118:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1118:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1119:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__PackageDeclaration__Group__4__Impl2260); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1142:1: rule__CSSRuleRef__Group__0 : rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1 ;
    public final void rule__CSSRuleRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1146:1: ( rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1147:2: rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__0__Impl_in_rule__CSSRuleRef__Group__02301);
            rule__CSSRuleRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__1_in_rule__CSSRuleRef__Group__02304);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1154:1: rule__CSSRuleRef__Group__0__Impl : ( '<' ) ;
    public final void rule__CSSRuleRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1158:1: ( ( '<' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1159:1: ( '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1159:1: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1160:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__CSSRuleRef__Group__0__Impl2332); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1173:1: rule__CSSRuleRef__Group__1 : rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2 ;
    public final void rule__CSSRuleRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1177:1: ( rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1178:2: rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__1__Impl_in_rule__CSSRuleRef__Group__12363);
            rule__CSSRuleRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__2_in_rule__CSSRuleRef__Group__12366);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1185:1: rule__CSSRuleRef__Group__1__Impl : ( ( rule__CSSRuleRef__RefAssignment_1 ) ) ;
    public final void rule__CSSRuleRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1189:1: ( ( ( rule__CSSRuleRef__RefAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1190:1: ( ( rule__CSSRuleRef__RefAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1190:1: ( ( rule__CSSRuleRef__RefAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1191:1: ( rule__CSSRuleRef__RefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1192:1: ( rule__CSSRuleRef__RefAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1192:2: rule__CSSRuleRef__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__RefAssignment_1_in_rule__CSSRuleRef__Group__1__Impl2393);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1202:1: rule__CSSRuleRef__Group__2 : rule__CSSRuleRef__Group__2__Impl ;
    public final void rule__CSSRuleRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1206:1: ( rule__CSSRuleRef__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1207:2: rule__CSSRuleRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__2__Impl_in_rule__CSSRuleRef__Group__22423);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1213:1: rule__CSSRuleRef__Group__2__Impl : ( '>' ) ;
    public final void rule__CSSRuleRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1217:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1218:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1218:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1219:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getGreaterThanSignKeyword_2()); 
            }
            match(input,20,FOLLOW_20_in_rule__CSSRuleRef__Group__2__Impl2451); if (state.failed) return ;
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


    // $ANTLR start "rule__CSSRuleAssignment__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1238:1: rule__CSSRuleAssignment__Group__0 : rule__CSSRuleAssignment__Group__0__Impl rule__CSSRuleAssignment__Group__1 ;
    public final void rule__CSSRuleAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1242:1: ( rule__CSSRuleAssignment__Group__0__Impl rule__CSSRuleAssignment__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1243:2: rule__CSSRuleAssignment__Group__0__Impl rule__CSSRuleAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleAssignment__Group__0__Impl_in_rule__CSSRuleAssignment__Group__02488);
            rule__CSSRuleAssignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleAssignment__Group__1_in_rule__CSSRuleAssignment__Group__02491);
            rule__CSSRuleAssignment__Group__1();

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
    // $ANTLR end "rule__CSSRuleAssignment__Group__0"


    // $ANTLR start "rule__CSSRuleAssignment__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1250:1: rule__CSSRuleAssignment__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1254:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1255:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1255:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1256:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleAssignmentAccess().getCSSRuleAssignmentAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1257:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1259:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleAssignmentAccess().getCSSRuleAssignmentAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleAssignment__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleAssignment__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1269:1: rule__CSSRuleAssignment__Group__1 : rule__CSSRuleAssignment__Group__1__Impl rule__CSSRuleAssignment__Group__2 ;
    public final void rule__CSSRuleAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1273:1: ( rule__CSSRuleAssignment__Group__1__Impl rule__CSSRuleAssignment__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1274:2: rule__CSSRuleAssignment__Group__1__Impl rule__CSSRuleAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleAssignment__Group__1__Impl_in_rule__CSSRuleAssignment__Group__12549);
            rule__CSSRuleAssignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleAssignment__Group__2_in_rule__CSSRuleAssignment__Group__12552);
            rule__CSSRuleAssignment__Group__2();

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
    // $ANTLR end "rule__CSSRuleAssignment__Group__1"


    // $ANTLR start "rule__CSSRuleAssignment__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1281:1: rule__CSSRuleAssignment__Group__1__Impl : ( ( rule__CSSRuleAssignment__IdAssignment_1 ) ) ;
    public final void rule__CSSRuleAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1285:1: ( ( ( rule__CSSRuleAssignment__IdAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1286:1: ( ( rule__CSSRuleAssignment__IdAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1286:1: ( ( rule__CSSRuleAssignment__IdAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1287:1: ( rule__CSSRuleAssignment__IdAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleAssignmentAccess().getIdAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1288:1: ( rule__CSSRuleAssignment__IdAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1288:2: rule__CSSRuleAssignment__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleAssignment__IdAssignment_1_in_rule__CSSRuleAssignment__Group__1__Impl2579);
            rule__CSSRuleAssignment__IdAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleAssignmentAccess().getIdAssignment_1()); 
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
    // $ANTLR end "rule__CSSRuleAssignment__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleAssignment__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1298:1: rule__CSSRuleAssignment__Group__2 : rule__CSSRuleAssignment__Group__2__Impl rule__CSSRuleAssignment__Group__3 ;
    public final void rule__CSSRuleAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1302:1: ( rule__CSSRuleAssignment__Group__2__Impl rule__CSSRuleAssignment__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1303:2: rule__CSSRuleAssignment__Group__2__Impl rule__CSSRuleAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__CSSRuleAssignment__Group__2__Impl_in_rule__CSSRuleAssignment__Group__22609);
            rule__CSSRuleAssignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleAssignment__Group__3_in_rule__CSSRuleAssignment__Group__22612);
            rule__CSSRuleAssignment__Group__3();

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
    // $ANTLR end "rule__CSSRuleAssignment__Group__2"


    // $ANTLR start "rule__CSSRuleAssignment__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1310:1: rule__CSSRuleAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__CSSRuleAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1314:1: ( ( '=' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1315:1: ( '=' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1315:1: ( '=' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1316:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleAssignmentAccess().getEqualsSignKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__CSSRuleAssignment__Group__2__Impl2640); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleAssignmentAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__CSSRuleAssignment__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleAssignment__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1329:1: rule__CSSRuleAssignment__Group__3 : rule__CSSRuleAssignment__Group__3__Impl rule__CSSRuleAssignment__Group__4 ;
    public final void rule__CSSRuleAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1333:1: ( rule__CSSRuleAssignment__Group__3__Impl rule__CSSRuleAssignment__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1334:2: rule__CSSRuleAssignment__Group__3__Impl rule__CSSRuleAssignment__Group__4
            {
            pushFollow(FOLLOW_rule__CSSRuleAssignment__Group__3__Impl_in_rule__CSSRuleAssignment__Group__32671);
            rule__CSSRuleAssignment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleAssignment__Group__4_in_rule__CSSRuleAssignment__Group__32674);
            rule__CSSRuleAssignment__Group__4();

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
    // $ANTLR end "rule__CSSRuleAssignment__Group__3"


    // $ANTLR start "rule__CSSRuleAssignment__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1341:1: rule__CSSRuleAssignment__Group__3__Impl : ( ( rule__CSSRuleAssignment__RAssignment_3 ) ) ;
    public final void rule__CSSRuleAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1345:1: ( ( ( rule__CSSRuleAssignment__RAssignment_3 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1346:1: ( ( rule__CSSRuleAssignment__RAssignment_3 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1346:1: ( ( rule__CSSRuleAssignment__RAssignment_3 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1347:1: ( rule__CSSRuleAssignment__RAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleAssignmentAccess().getRAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1348:1: ( rule__CSSRuleAssignment__RAssignment_3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1348:2: rule__CSSRuleAssignment__RAssignment_3
            {
            pushFollow(FOLLOW_rule__CSSRuleAssignment__RAssignment_3_in_rule__CSSRuleAssignment__Group__3__Impl2701);
            rule__CSSRuleAssignment__RAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleAssignmentAccess().getRAssignment_3()); 
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
    // $ANTLR end "rule__CSSRuleAssignment__Group__3__Impl"


    // $ANTLR start "rule__CSSRuleAssignment__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1358:1: rule__CSSRuleAssignment__Group__4 : rule__CSSRuleAssignment__Group__4__Impl ;
    public final void rule__CSSRuleAssignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1362:1: ( rule__CSSRuleAssignment__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1363:2: rule__CSSRuleAssignment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleAssignment__Group__4__Impl_in_rule__CSSRuleAssignment__Group__42731);
            rule__CSSRuleAssignment__Group__4__Impl();

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
    // $ANTLR end "rule__CSSRuleAssignment__Group__4"


    // $ANTLR start "rule__CSSRuleAssignment__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1369:1: rule__CSSRuleAssignment__Group__4__Impl : ( ';' ) ;
    public final void rule__CSSRuleAssignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1373:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1374:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1374:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1375:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleAssignmentAccess().getSemicolonKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__CSSRuleAssignment__Group__4__Impl2759); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleAssignmentAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__CSSRuleAssignment__Group__4__Impl"


    // $ANTLR start "rule__CSSRuleOrExpression__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1398:1: rule__CSSRuleOrExpression__Group__0 : rule__CSSRuleOrExpression__Group__0__Impl rule__CSSRuleOrExpression__Group__1 ;
    public final void rule__CSSRuleOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1402:1: ( rule__CSSRuleOrExpression__Group__0__Impl rule__CSSRuleOrExpression__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1403:2: rule__CSSRuleOrExpression__Group__0__Impl rule__CSSRuleOrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleOrExpression__Group__0__Impl_in_rule__CSSRuleOrExpression__Group__02800);
            rule__CSSRuleOrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleOrExpression__Group__1_in_rule__CSSRuleOrExpression__Group__02803);
            rule__CSSRuleOrExpression__Group__1();

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
    // $ANTLR end "rule__CSSRuleOrExpression__Group__0"


    // $ANTLR start "rule__CSSRuleOrExpression__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1410:1: rule__CSSRuleOrExpression__Group__0__Impl : ( ( rule__CSSRuleOrExpression__OrsAssignment_0 ) ) ;
    public final void rule__CSSRuleOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1414:1: ( ( ( rule__CSSRuleOrExpression__OrsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1415:1: ( ( rule__CSSRuleOrExpression__OrsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1415:1: ( ( rule__CSSRuleOrExpression__OrsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1416:1: ( rule__CSSRuleOrExpression__OrsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrExpressionAccess().getOrsAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1417:1: ( rule__CSSRuleOrExpression__OrsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1417:2: rule__CSSRuleOrExpression__OrsAssignment_0
            {
            pushFollow(FOLLOW_rule__CSSRuleOrExpression__OrsAssignment_0_in_rule__CSSRuleOrExpression__Group__0__Impl2830);
            rule__CSSRuleOrExpression__OrsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrExpressionAccess().getOrsAssignment_0()); 
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
    // $ANTLR end "rule__CSSRuleOrExpression__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleOrExpression__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1427:1: rule__CSSRuleOrExpression__Group__1 : rule__CSSRuleOrExpression__Group__1__Impl ;
    public final void rule__CSSRuleOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1431:1: ( rule__CSSRuleOrExpression__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1432:2: rule__CSSRuleOrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleOrExpression__Group__1__Impl_in_rule__CSSRuleOrExpression__Group__12860);
            rule__CSSRuleOrExpression__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRuleOrExpression__Group__1"


    // $ANTLR start "rule__CSSRuleOrExpression__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1438:1: rule__CSSRuleOrExpression__Group__1__Impl : ( ( rule__CSSRuleOrExpression__Group_1__0 )* ) ;
    public final void rule__CSSRuleOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1442:1: ( ( ( rule__CSSRuleOrExpression__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1443:1: ( ( rule__CSSRuleOrExpression__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1443:1: ( ( rule__CSSRuleOrExpression__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1444:1: ( rule__CSSRuleOrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrExpressionAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1445:1: ( rule__CSSRuleOrExpression__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1445:2: rule__CSSRuleOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CSSRuleOrExpression__Group_1__0_in_rule__CSSRuleOrExpression__Group__1__Impl2887);
            	    rule__CSSRuleOrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CSSRuleOrExpression__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleOrExpression__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1459:1: rule__CSSRuleOrExpression__Group_1__0 : rule__CSSRuleOrExpression__Group_1__0__Impl rule__CSSRuleOrExpression__Group_1__1 ;
    public final void rule__CSSRuleOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1463:1: ( rule__CSSRuleOrExpression__Group_1__0__Impl rule__CSSRuleOrExpression__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1464:2: rule__CSSRuleOrExpression__Group_1__0__Impl rule__CSSRuleOrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleOrExpression__Group_1__0__Impl_in_rule__CSSRuleOrExpression__Group_1__02922);
            rule__CSSRuleOrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleOrExpression__Group_1__1_in_rule__CSSRuleOrExpression__Group_1__02925);
            rule__CSSRuleOrExpression__Group_1__1();

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
    // $ANTLR end "rule__CSSRuleOrExpression__Group_1__0"


    // $ANTLR start "rule__CSSRuleOrExpression__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1471:1: rule__CSSRuleOrExpression__Group_1__0__Impl : ( '|' ) ;
    public final void rule__CSSRuleOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1475:1: ( ( '|' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1476:1: ( '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1476:1: ( '|' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1477:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrExpressionAccess().getVerticalLineKeyword_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__CSSRuleOrExpression__Group_1__0__Impl2953); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrExpressionAccess().getVerticalLineKeyword_1_0()); 
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
    // $ANTLR end "rule__CSSRuleOrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleOrExpression__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1490:1: rule__CSSRuleOrExpression__Group_1__1 : rule__CSSRuleOrExpression__Group_1__1__Impl ;
    public final void rule__CSSRuleOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1494:1: ( rule__CSSRuleOrExpression__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1495:2: rule__CSSRuleOrExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleOrExpression__Group_1__1__Impl_in_rule__CSSRuleOrExpression__Group_1__12984);
            rule__CSSRuleOrExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleOrExpression__Group_1__1"


    // $ANTLR start "rule__CSSRuleOrExpression__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1501:1: rule__CSSRuleOrExpression__Group_1__1__Impl : ( ( rule__CSSRuleOrExpression__OrsAssignment_1_1 ) ) ;
    public final void rule__CSSRuleOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1505:1: ( ( ( rule__CSSRuleOrExpression__OrsAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1506:1: ( ( rule__CSSRuleOrExpression__OrsAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1506:1: ( ( rule__CSSRuleOrExpression__OrsAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1507:1: ( rule__CSSRuleOrExpression__OrsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrExpressionAccess().getOrsAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1508:1: ( rule__CSSRuleOrExpression__OrsAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1508:2: rule__CSSRuleOrExpression__OrsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CSSRuleOrExpression__OrsAssignment_1_1_in_rule__CSSRuleOrExpression__Group_1__1__Impl3011);
            rule__CSSRuleOrExpression__OrsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrExpressionAccess().getOrsAssignment_1_1()); 
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
    // $ANTLR end "rule__CSSRuleOrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleXorExpression__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1522:1: rule__CSSRuleXorExpression__Group__0 : rule__CSSRuleXorExpression__Group__0__Impl rule__CSSRuleXorExpression__Group__1 ;
    public final void rule__CSSRuleXorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1526:1: ( rule__CSSRuleXorExpression__Group__0__Impl rule__CSSRuleXorExpression__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1527:2: rule__CSSRuleXorExpression__Group__0__Impl rule__CSSRuleXorExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleXorExpression__Group__0__Impl_in_rule__CSSRuleXorExpression__Group__03045);
            rule__CSSRuleXorExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleXorExpression__Group__1_in_rule__CSSRuleXorExpression__Group__03048);
            rule__CSSRuleXorExpression__Group__1();

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
    // $ANTLR end "rule__CSSRuleXorExpression__Group__0"


    // $ANTLR start "rule__CSSRuleXorExpression__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1534:1: rule__CSSRuleXorExpression__Group__0__Impl : ( ( rule__CSSRuleXorExpression__XorsAssignment_0 ) ) ;
    public final void rule__CSSRuleXorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1538:1: ( ( ( rule__CSSRuleXorExpression__XorsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1539:1: ( ( rule__CSSRuleXorExpression__XorsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1539:1: ( ( rule__CSSRuleXorExpression__XorsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1540:1: ( rule__CSSRuleXorExpression__XorsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorExpressionAccess().getXorsAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1541:1: ( rule__CSSRuleXorExpression__XorsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1541:2: rule__CSSRuleXorExpression__XorsAssignment_0
            {
            pushFollow(FOLLOW_rule__CSSRuleXorExpression__XorsAssignment_0_in_rule__CSSRuleXorExpression__Group__0__Impl3075);
            rule__CSSRuleXorExpression__XorsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorExpressionAccess().getXorsAssignment_0()); 
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
    // $ANTLR end "rule__CSSRuleXorExpression__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleXorExpression__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1551:1: rule__CSSRuleXorExpression__Group__1 : rule__CSSRuleXorExpression__Group__1__Impl ;
    public final void rule__CSSRuleXorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1555:1: ( rule__CSSRuleXorExpression__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1556:2: rule__CSSRuleXorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleXorExpression__Group__1__Impl_in_rule__CSSRuleXorExpression__Group__13105);
            rule__CSSRuleXorExpression__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRuleXorExpression__Group__1"


    // $ANTLR start "rule__CSSRuleXorExpression__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1562:1: rule__CSSRuleXorExpression__Group__1__Impl : ( ( rule__CSSRuleXorExpression__Group_1__0 )* ) ;
    public final void rule__CSSRuleXorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1566:1: ( ( ( rule__CSSRuleXorExpression__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1567:1: ( ( rule__CSSRuleXorExpression__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1567:1: ( ( rule__CSSRuleXorExpression__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1568:1: ( rule__CSSRuleXorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorExpressionAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1569:1: ( rule__CSSRuleXorExpression__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1569:2: rule__CSSRuleXorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CSSRuleXorExpression__Group_1__0_in_rule__CSSRuleXorExpression__Group__1__Impl3132);
            	    rule__CSSRuleXorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CSSRuleXorExpression__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleXorExpression__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1583:1: rule__CSSRuleXorExpression__Group_1__0 : rule__CSSRuleXorExpression__Group_1__0__Impl rule__CSSRuleXorExpression__Group_1__1 ;
    public final void rule__CSSRuleXorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1587:1: ( rule__CSSRuleXorExpression__Group_1__0__Impl rule__CSSRuleXorExpression__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1588:2: rule__CSSRuleXorExpression__Group_1__0__Impl rule__CSSRuleXorExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleXorExpression__Group_1__0__Impl_in_rule__CSSRuleXorExpression__Group_1__03167);
            rule__CSSRuleXorExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleXorExpression__Group_1__1_in_rule__CSSRuleXorExpression__Group_1__03170);
            rule__CSSRuleXorExpression__Group_1__1();

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
    // $ANTLR end "rule__CSSRuleXorExpression__Group_1__0"


    // $ANTLR start "rule__CSSRuleXorExpression__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1595:1: rule__CSSRuleXorExpression__Group_1__0__Impl : ( '||' ) ;
    public final void rule__CSSRuleXorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1599:1: ( ( '||' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1600:1: ( '||' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1600:1: ( '||' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1601:1: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorExpressionAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__CSSRuleXorExpression__Group_1__0__Impl3198); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorExpressionAccess().getVerticalLineVerticalLineKeyword_1_0()); 
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
    // $ANTLR end "rule__CSSRuleXorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleXorExpression__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1614:1: rule__CSSRuleXorExpression__Group_1__1 : rule__CSSRuleXorExpression__Group_1__1__Impl ;
    public final void rule__CSSRuleXorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1618:1: ( rule__CSSRuleXorExpression__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1619:2: rule__CSSRuleXorExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleXorExpression__Group_1__1__Impl_in_rule__CSSRuleXorExpression__Group_1__13229);
            rule__CSSRuleXorExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleXorExpression__Group_1__1"


    // $ANTLR start "rule__CSSRuleXorExpression__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1625:1: rule__CSSRuleXorExpression__Group_1__1__Impl : ( ( rule__CSSRuleXorExpression__XorsAssignment_1_1 ) ) ;
    public final void rule__CSSRuleXorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1629:1: ( ( ( rule__CSSRuleXorExpression__XorsAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1630:1: ( ( rule__CSSRuleXorExpression__XorsAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1630:1: ( ( rule__CSSRuleXorExpression__XorsAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1631:1: ( rule__CSSRuleXorExpression__XorsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorExpressionAccess().getXorsAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1632:1: ( rule__CSSRuleXorExpression__XorsAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1632:2: rule__CSSRuleXorExpression__XorsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CSSRuleXorExpression__XorsAssignment_1_1_in_rule__CSSRuleXorExpression__Group_1__1__Impl3256);
            rule__CSSRuleXorExpression__XorsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorExpressionAccess().getXorsAssignment_1_1()); 
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
    // $ANTLR end "rule__CSSRuleXorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleBracketExpression__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1646:1: rule__CSSRuleBracketExpression__Group__0 : rule__CSSRuleBracketExpression__Group__0__Impl rule__CSSRuleBracketExpression__Group__1 ;
    public final void rule__CSSRuleBracketExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1650:1: ( rule__CSSRuleBracketExpression__Group__0__Impl rule__CSSRuleBracketExpression__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1651:2: rule__CSSRuleBracketExpression__Group__0__Impl rule__CSSRuleBracketExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleBracketExpression__Group__0__Impl_in_rule__CSSRuleBracketExpression__Group__03290);
            rule__CSSRuleBracketExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleBracketExpression__Group__1_in_rule__CSSRuleBracketExpression__Group__03293);
            rule__CSSRuleBracketExpression__Group__1();

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
    // $ANTLR end "rule__CSSRuleBracketExpression__Group__0"


    // $ANTLR start "rule__CSSRuleBracketExpression__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1658:1: rule__CSSRuleBracketExpression__Group__0__Impl : ( '[' ) ;
    public final void rule__CSSRuleBracketExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1662:1: ( ( '[' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1663:1: ( '[' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1663:1: ( '[' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1664:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketExpressionAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__CSSRuleBracketExpression__Group__0__Impl3321); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketExpressionAccess().getLeftSquareBracketKeyword_0()); 
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
    // $ANTLR end "rule__CSSRuleBracketExpression__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleBracketExpression__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1677:1: rule__CSSRuleBracketExpression__Group__1 : rule__CSSRuleBracketExpression__Group__1__Impl rule__CSSRuleBracketExpression__Group__2 ;
    public final void rule__CSSRuleBracketExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1681:1: ( rule__CSSRuleBracketExpression__Group__1__Impl rule__CSSRuleBracketExpression__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1682:2: rule__CSSRuleBracketExpression__Group__1__Impl rule__CSSRuleBracketExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleBracketExpression__Group__1__Impl_in_rule__CSSRuleBracketExpression__Group__13352);
            rule__CSSRuleBracketExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleBracketExpression__Group__2_in_rule__CSSRuleBracketExpression__Group__13355);
            rule__CSSRuleBracketExpression__Group__2();

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
    // $ANTLR end "rule__CSSRuleBracketExpression__Group__1"


    // $ANTLR start "rule__CSSRuleBracketExpression__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1689:1: rule__CSSRuleBracketExpression__Group__1__Impl : ( ruleCSSRuleOrExpression ) ;
    public final void rule__CSSRuleBracketExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1693:1: ( ( ruleCSSRuleOrExpression ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1694:1: ( ruleCSSRuleOrExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1694:1: ( ruleCSSRuleOrExpression )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1695:1: ruleCSSRuleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketExpressionAccess().getCSSRuleOrExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOrExpression_in_rule__CSSRuleBracketExpression__Group__1__Impl3382);
            ruleCSSRuleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketExpressionAccess().getCSSRuleOrExpressionParserRuleCall_1()); 
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
    // $ANTLR end "rule__CSSRuleBracketExpression__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleBracketExpression__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1706:1: rule__CSSRuleBracketExpression__Group__2 : rule__CSSRuleBracketExpression__Group__2__Impl ;
    public final void rule__CSSRuleBracketExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1710:1: ( rule__CSSRuleBracketExpression__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1711:2: rule__CSSRuleBracketExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleBracketExpression__Group__2__Impl_in_rule__CSSRuleBracketExpression__Group__23411);
            rule__CSSRuleBracketExpression__Group__2__Impl();

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
    // $ANTLR end "rule__CSSRuleBracketExpression__Group__2"


    // $ANTLR start "rule__CSSRuleBracketExpression__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1717:1: rule__CSSRuleBracketExpression__Group__2__Impl : ( ']' ) ;
    public final void rule__CSSRuleBracketExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1721:1: ( ( ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1722:1: ( ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1722:1: ( ']' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1723:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketExpressionAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__CSSRuleBracketExpression__Group__2__Impl3439); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketExpressionAccess().getRightSquareBracketKeyword_2()); 
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
    // $ANTLR end "rule__CSSRuleBracketExpression__Group__2__Impl"


    // $ANTLR start "rule__CSSRulePostfixExpression__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1742:1: rule__CSSRulePostfixExpression__Group__0 : rule__CSSRulePostfixExpression__Group__0__Impl rule__CSSRulePostfixExpression__Group__1 ;
    public final void rule__CSSRulePostfixExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1746:1: ( rule__CSSRulePostfixExpression__Group__0__Impl rule__CSSRulePostfixExpression__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1747:2: rule__CSSRulePostfixExpression__Group__0__Impl rule__CSSRulePostfixExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRulePostfixExpression__Group__0__Impl_in_rule__CSSRulePostfixExpression__Group__03476);
            rule__CSSRulePostfixExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRulePostfixExpression__Group__1_in_rule__CSSRulePostfixExpression__Group__03479);
            rule__CSSRulePostfixExpression__Group__1();

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
    // $ANTLR end "rule__CSSRulePostfixExpression__Group__0"


    // $ANTLR start "rule__CSSRulePostfixExpression__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1754:1: rule__CSSRulePostfixExpression__Group__0__Impl : ( ruleCSSRuleConcat ) ;
    public final void rule__CSSRulePostfixExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1758:1: ( ( ruleCSSRuleConcat ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1759:1: ( ruleCSSRuleConcat )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1759:1: ( ruleCSSRuleConcat )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1760:1: ruleCSSRuleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixExpressionAccess().getCSSRuleConcatParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_rule__CSSRulePostfixExpression__Group__0__Impl3506);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixExpressionAccess().getCSSRuleConcatParserRuleCall_0()); 
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
    // $ANTLR end "rule__CSSRulePostfixExpression__Group__0__Impl"


    // $ANTLR start "rule__CSSRulePostfixExpression__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1771:1: rule__CSSRulePostfixExpression__Group__1 : rule__CSSRulePostfixExpression__Group__1__Impl ;
    public final void rule__CSSRulePostfixExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1775:1: ( rule__CSSRulePostfixExpression__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1776:2: rule__CSSRulePostfixExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRulePostfixExpression__Group__1__Impl_in_rule__CSSRulePostfixExpression__Group__13535);
            rule__CSSRulePostfixExpression__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRulePostfixExpression__Group__1"


    // $ANTLR start "rule__CSSRulePostfixExpression__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1782:1: rule__CSSRulePostfixExpression__Group__1__Impl : ( ( rule__CSSRulePostfixExpression__CAssignment_1 )? ) ;
    public final void rule__CSSRulePostfixExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1786:1: ( ( ( rule__CSSRulePostfixExpression__CAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1787:1: ( ( rule__CSSRulePostfixExpression__CAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1787:1: ( ( rule__CSSRulePostfixExpression__CAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1788:1: ( rule__CSSRulePostfixExpression__CAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixExpressionAccess().getCAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1789:1: ( rule__CSSRulePostfixExpression__CAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=13)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1789:2: rule__CSSRulePostfixExpression__CAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CSSRulePostfixExpression__CAssignment_1_in_rule__CSSRulePostfixExpression__Group__1__Impl3562);
                    rule__CSSRulePostfixExpression__CAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixExpressionAccess().getCAssignment_1()); 
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
    // $ANTLR end "rule__CSSRulePostfixExpression__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1803:1: rule__CSSRuleConcat__Group__0 : rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1 ;
    public final void rule__CSSRuleConcat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1807:1: ( rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1808:2: rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__0__Impl_in_rule__CSSRuleConcat__Group__03597);
            rule__CSSRuleConcat__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__1_in_rule__CSSRuleConcat__Group__03600);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1815:1: rule__CSSRuleConcat__Group__0__Impl : ( ( rule__CSSRuleConcat__ConcAssignment_0 ) ) ;
    public final void rule__CSSRuleConcat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1819:1: ( ( ( rule__CSSRuleConcat__ConcAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1820:1: ( ( rule__CSSRuleConcat__ConcAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1820:1: ( ( rule__CSSRuleConcat__ConcAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1821:1: ( rule__CSSRuleConcat__ConcAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1822:1: ( rule__CSSRuleConcat__ConcAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1822:2: rule__CSSRuleConcat__ConcAssignment_0
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__ConcAssignment_0_in_rule__CSSRuleConcat__Group__0__Impl3627);
            rule__CSSRuleConcat__ConcAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_0()); 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1832:1: rule__CSSRuleConcat__Group__1 : rule__CSSRuleConcat__Group__1__Impl ;
    public final void rule__CSSRuleConcat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1836:1: ( rule__CSSRuleConcat__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1837:2: rule__CSSRuleConcat__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__1__Impl_in_rule__CSSRuleConcat__Group__13657);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1843:1: rule__CSSRuleConcat__Group__1__Impl : ( ( rule__CSSRuleConcat__ConcAssignment_1 )? ) ;
    public final void rule__CSSRuleConcat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1847:1: ( ( ( rule__CSSRuleConcat__ConcAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1848:1: ( ( rule__CSSRuleConcat__ConcAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1848:1: ( ( rule__CSSRuleConcat__ConcAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1849:1: ( rule__CSSRuleConcat__ConcAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1850:1: ( rule__CSSRuleConcat__ConcAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==19||LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1850:2: rule__CSSRuleConcat__ConcAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_in_rule__CSSRuleConcat__Group__1__Impl3684);
                    rule__CSSRuleConcat__ConcAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1()); 
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


    // $ANTLR start "rule__CssExtension__ImportsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1865:1: rule__CssExtension__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__CssExtension__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1869:1: ( ( ruleImport ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1870:1: ( ruleImport )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1870:1: ( ruleImport )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1871:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__CssExtension__ImportsAssignment_03724);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1880:1: rule__CssExtension__PackageDefAssignment_1 : ( rulePackageDeclaration ) ;
    public final void rule__CssExtension__PackageDefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1884:1: ( ( rulePackageDeclaration ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1885:1: ( rulePackageDeclaration )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1885:1: ( rulePackageDeclaration )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1886:1: rulePackageDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getPackageDefPackageDeclarationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_rule__CssExtension__PackageDefAssignment_13755);
            rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getPackageDefPackageDeclarationParserRuleCall_1_0()); 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1895:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1899:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1900:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1900:1: ( ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1901:1: ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_13786);
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


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1910:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1914:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1915:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1915:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1916:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_13817);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__RuleAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1925:1: rule__PackageDeclaration__RuleAssignment_3 : ( ruleCSSRuleSet ) ;
    public final void rule__PackageDeclaration__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1929:1: ( ( ruleCSSRuleSet ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1930:1: ( ruleCSSRuleSet )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1930:1: ( ruleCSSRuleSet )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1931:1: ruleCSSRuleSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getRuleCSSRuleSetParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleSet_in_rule__PackageDeclaration__RuleAssignment_33848);
            ruleCSSRuleSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getRuleCSSRuleSetParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__PackageDeclaration__RuleAssignment_3"


    // $ANTLR start "rule__CSSRuleSet__RulesAssignment"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1940:1: rule__CSSRuleSet__RulesAssignment : ( ruleCSSRuleAssignment ) ;
    public final void rule__CSSRuleSet__RulesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1944:1: ( ( ruleCSSRuleAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1945:1: ( ruleCSSRuleAssignment )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1945:1: ( ruleCSSRuleAssignment )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1946:1: ruleCSSRuleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSetAccess().getRulesCSSRuleAssignmentParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleAssignment_in_rule__CSSRuleSet__RulesAssignment3879);
            ruleCSSRuleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSetAccess().getRulesCSSRuleAssignmentParserRuleCall_0()); 
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
    // $ANTLR end "rule__CSSRuleSet__RulesAssignment"


    // $ANTLR start "rule__CSSRuleId__NameAssignment"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1955:1: rule__CSSRuleId__NameAssignment : ( RULE_ID ) ;
    public final void rule__CSSRuleId__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1959:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1960:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1960:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1961:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleIdAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CSSRuleId__NameAssignment3910); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleIdAccess().getNameIDTerminalRuleCall_0()); 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1970:1: rule__CSSRuleRef__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CSSRuleRef__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1974:1: ( ( ( RULE_ID ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1975:1: ( ( RULE_ID ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1975:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1976:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdCrossReference_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1977:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1978:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CSSRuleRef__RefAssignment_13945); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdIDTerminalRuleCall_1_0_1()); 
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


    // $ANTLR start "rule__CSSRuleAssignment__IdAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1989:1: rule__CSSRuleAssignment__IdAssignment_1 : ( ruleCSSRuleId ) ;
    public final void rule__CSSRuleAssignment__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1993:1: ( ( ruleCSSRuleId ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1994:1: ( ruleCSSRuleId )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1994:1: ( ruleCSSRuleId )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1995:1: ruleCSSRuleId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleAssignmentAccess().getIdCSSRuleIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleId_in_rule__CSSRuleAssignment__IdAssignment_13980);
            ruleCSSRuleId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleAssignmentAccess().getIdCSSRuleIdParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__CSSRuleAssignment__IdAssignment_1"


    // $ANTLR start "rule__CSSRuleAssignment__RAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2004:1: rule__CSSRuleAssignment__RAssignment_3 : ( ruleCSSRuleOrExpression ) ;
    public final void rule__CSSRuleAssignment__RAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2008:1: ( ( ruleCSSRuleOrExpression ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2009:1: ( ruleCSSRuleOrExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2009:1: ( ruleCSSRuleOrExpression )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2010:1: ruleCSSRuleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleAssignmentAccess().getRCSSRuleOrExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOrExpression_in_rule__CSSRuleAssignment__RAssignment_34011);
            ruleCSSRuleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleAssignmentAccess().getRCSSRuleOrExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__CSSRuleAssignment__RAssignment_3"


    // $ANTLR start "rule__CSSRuleOrExpression__OrsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2019:1: rule__CSSRuleOrExpression__OrsAssignment_0 : ( ruleCSSRuleXorExpression ) ;
    public final void rule__CSSRuleOrExpression__OrsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2023:1: ( ( ruleCSSRuleXorExpression ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2024:1: ( ruleCSSRuleXorExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2024:1: ( ruleCSSRuleXorExpression )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2025:1: ruleCSSRuleXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrExpressionAccess().getOrsCSSRuleXorExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXorExpression_in_rule__CSSRuleOrExpression__OrsAssignment_04042);
            ruleCSSRuleXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrExpressionAccess().getOrsCSSRuleXorExpressionParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__CSSRuleOrExpression__OrsAssignment_0"


    // $ANTLR start "rule__CSSRuleOrExpression__OrsAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2034:1: rule__CSSRuleOrExpression__OrsAssignment_1_1 : ( ruleCSSRuleXorExpression ) ;
    public final void rule__CSSRuleOrExpression__OrsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2038:1: ( ( ruleCSSRuleXorExpression ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2039:1: ( ruleCSSRuleXorExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2039:1: ( ruleCSSRuleXorExpression )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2040:1: ruleCSSRuleXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrExpressionAccess().getOrsCSSRuleXorExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXorExpression_in_rule__CSSRuleOrExpression__OrsAssignment_1_14073);
            ruleCSSRuleXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrExpressionAccess().getOrsCSSRuleXorExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__CSSRuleOrExpression__OrsAssignment_1_1"


    // $ANTLR start "rule__CSSRuleXorExpression__XorsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2049:1: rule__CSSRuleXorExpression__XorsAssignment_0 : ( ruleCSSRulePostfixExpression ) ;
    public final void rule__CSSRuleXorExpression__XorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2053:1: ( ( ruleCSSRulePostfixExpression ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2054:1: ( ruleCSSRulePostfixExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2054:1: ( ruleCSSRulePostfixExpression )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2055:1: ruleCSSRulePostfixExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorExpressionAccess().getXorsCSSRulePostfixExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfixExpression_in_rule__CSSRuleXorExpression__XorsAssignment_04104);
            ruleCSSRulePostfixExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorExpressionAccess().getXorsCSSRulePostfixExpressionParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__CSSRuleXorExpression__XorsAssignment_0"


    // $ANTLR start "rule__CSSRuleXorExpression__XorsAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2064:1: rule__CSSRuleXorExpression__XorsAssignment_1_1 : ( ruleCSSRulePostfixExpression ) ;
    public final void rule__CSSRuleXorExpression__XorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2068:1: ( ( ruleCSSRulePostfixExpression ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2069:1: ( ruleCSSRulePostfixExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2069:1: ( ruleCSSRulePostfixExpression )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2070:1: ruleCSSRulePostfixExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorExpressionAccess().getXorsCSSRulePostfixExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfixExpression_in_rule__CSSRuleXorExpression__XorsAssignment_1_14135);
            ruleCSSRulePostfixExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorExpressionAccess().getXorsCSSRulePostfixExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__CSSRuleXorExpression__XorsAssignment_1_1"


    // $ANTLR start "rule__CSSRulePostfixExpression__CAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2079:1: rule__CSSRulePostfixExpression__CAssignment_1 : ( ( rule__CSSRulePostfixExpression__CAlternatives_1_0 ) ) ;
    public final void rule__CSSRulePostfixExpression__CAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2083:1: ( ( ( rule__CSSRulePostfixExpression__CAlternatives_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2084:1: ( ( rule__CSSRulePostfixExpression__CAlternatives_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2084:1: ( ( rule__CSSRulePostfixExpression__CAlternatives_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2085:1: ( rule__CSSRulePostfixExpression__CAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixExpressionAccess().getCAlternatives_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2086:1: ( rule__CSSRulePostfixExpression__CAlternatives_1_0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2086:2: rule__CSSRulePostfixExpression__CAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__CSSRulePostfixExpression__CAlternatives_1_0_in_rule__CSSRulePostfixExpression__CAssignment_14166);
            rule__CSSRulePostfixExpression__CAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixExpressionAccess().getCAlternatives_1_0()); 
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
    // $ANTLR end "rule__CSSRulePostfixExpression__CAssignment_1"


    // $ANTLR start "rule__CSSRuleConcat__ConcAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2095:1: rule__CSSRuleConcat__ConcAssignment_0 : ( ruleCSSRulePrimaryExpression ) ;
    public final void rule__CSSRuleConcat__ConcAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2099:1: ( ( ruleCSSRulePrimaryExpression ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2100:1: ( ruleCSSRulePrimaryExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2100:1: ( ruleCSSRulePrimaryExpression )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2101:1: ruleCSSRulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcCSSRulePrimaryExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePrimaryExpression_in_rule__CSSRuleConcat__ConcAssignment_04199);
            ruleCSSRulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcCSSRulePrimaryExpressionParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__CSSRuleConcat__ConcAssignment_0"


    // $ANTLR start "rule__CSSRuleConcat__ConcAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2110:1: rule__CSSRuleConcat__ConcAssignment_1 : ( ruleCSSRulePrimaryExpression ) ;
    public final void rule__CSSRuleConcat__ConcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2114:1: ( ( ruleCSSRulePrimaryExpression ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2115:1: ( ruleCSSRulePrimaryExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2115:1: ( ruleCSSRulePrimaryExpression )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2116:1: ruleCSSRulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcCSSRulePrimaryExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePrimaryExpression_in_rule__CSSRuleConcat__ConcAssignment_14230);
            ruleCSSRulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcCSSRulePrimaryExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__CSSRuleConcat__ConcAssignment_1"

    // Delegated rules


 

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
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleSet_in_entryRuleCSSRuleSet426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleSet433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleSet__RulesAssignment_in_ruleCSSRuleSet461 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__CSSRuleSet__RulesAssignment_in_ruleCSSRuleSet473 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleCSSRuleId_in_entryRuleCSSRuleId503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleId510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleId__NameAssignment_in_ruleCSSRuleId536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleRef570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__0_in_ruleCSSRuleRef596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleAssignment_in_entryRuleCSSRuleAssignment623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleAssignment630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleAssignment__Group__0_in_ruleCSSRuleAssignment656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOrExpression_in_entryRuleCSSRuleOrExpression683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleOrExpression690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOrExpression__Group__0_in_ruleCSSRuleOrExpression716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXorExpression_in_entryRuleCSSRuleXorExpression743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleXorExpression750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXorExpression__Group__0_in_ruleCSSRuleXorExpression776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracketExpression_in_entryRuleCSSRuleBracketExpression803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleBracketExpression810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracketExpression__Group__0_in_ruleCSSRuleBracketExpression836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfixExpression_in_entryRuleCSSRulePostfixExpression863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePostfixExpression870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfixExpression__Group__0_in_ruleCSSRulePostfixExpression896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleConcat930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__0_in_ruleCSSRuleConcat956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleLiteral990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCSSRuleLiteral1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimaryExpression_in_entryRuleCSSRulePrimaryExpression1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePrimaryExpression1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimaryExpression__Alternatives_in_ruleCSSRulePrimaryExpression1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CSSRulePostfixExpression__CAlternatives_1_01112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CSSRulePostfixExpression__CAlternatives_1_01132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CSSRulePostfixExpression__CAlternatives_1_01152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_rule__CSSRulePrimaryExpression__Alternatives1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracketExpression_in_rule__CSSRulePrimaryExpression__Alternatives1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_rule__CSSRulePrimaryExpression__Alternatives1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__0__Impl_in_rule__CssExtension__Group__01250 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__1_in_rule__CssExtension__Group__01253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__ImportsAssignment_0_in_rule__CssExtension__Group__0__Impl1280 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__1__Impl_in_rule__CssExtension__Group__11311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__PackageDefAssignment_1_in_rule__CssExtension__Group__1__Impl1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Import__Group__0__Impl1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01496 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1582 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__01741 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__01744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__11800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__01862 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__01865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__11924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PackageDeclaration__Group__0__Impl2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12049 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22109 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__22112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PackageDeclaration__Group__2__Impl2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__32171 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__32174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__RuleAssignment_3_in_rule__PackageDeclaration__Group__3__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PackageDeclaration__Group__4__Impl2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__0__Impl_in_rule__CSSRuleRef__Group__02301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__1_in_rule__CSSRuleRef__Group__02304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CSSRuleRef__Group__0__Impl2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__1__Impl_in_rule__CSSRuleRef__Group__12363 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__2_in_rule__CSSRuleRef__Group__12366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__RefAssignment_1_in_rule__CSSRuleRef__Group__1__Impl2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__2__Impl_in_rule__CSSRuleRef__Group__22423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CSSRuleRef__Group__2__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleAssignment__Group__0__Impl_in_rule__CSSRuleAssignment__Group__02488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSSRuleAssignment__Group__1_in_rule__CSSRuleAssignment__Group__02491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleAssignment__Group__1__Impl_in_rule__CSSRuleAssignment__Group__12549 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CSSRuleAssignment__Group__2_in_rule__CSSRuleAssignment__Group__12552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleAssignment__IdAssignment_1_in_rule__CSSRuleAssignment__Group__1__Impl2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleAssignment__Group__2__Impl_in_rule__CSSRuleAssignment__Group__22609 = new BitSet(new long[]{0x0000000002080010L});
    public static final BitSet FOLLOW_rule__CSSRuleAssignment__Group__3_in_rule__CSSRuleAssignment__Group__22612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CSSRuleAssignment__Group__2__Impl2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleAssignment__Group__3__Impl_in_rule__CSSRuleAssignment__Group__32671 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__CSSRuleAssignment__Group__4_in_rule__CSSRuleAssignment__Group__32674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleAssignment__RAssignment_3_in_rule__CSSRuleAssignment__Group__3__Impl2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleAssignment__Group__4__Impl_in_rule__CSSRuleAssignment__Group__42731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CSSRuleAssignment__Group__4__Impl2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOrExpression__Group__0__Impl_in_rule__CSSRuleOrExpression__Group__02800 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CSSRuleOrExpression__Group__1_in_rule__CSSRuleOrExpression__Group__02803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOrExpression__OrsAssignment_0_in_rule__CSSRuleOrExpression__Group__0__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOrExpression__Group__1__Impl_in_rule__CSSRuleOrExpression__Group__12860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOrExpression__Group_1__0_in_rule__CSSRuleOrExpression__Group__1__Impl2887 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__CSSRuleOrExpression__Group_1__0__Impl_in_rule__CSSRuleOrExpression__Group_1__02922 = new BitSet(new long[]{0x0000000002080010L});
    public static final BitSet FOLLOW_rule__CSSRuleOrExpression__Group_1__1_in_rule__CSSRuleOrExpression__Group_1__02925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CSSRuleOrExpression__Group_1__0__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOrExpression__Group_1__1__Impl_in_rule__CSSRuleOrExpression__Group_1__12984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOrExpression__OrsAssignment_1_1_in_rule__CSSRuleOrExpression__Group_1__1__Impl3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXorExpression__Group__0__Impl_in_rule__CSSRuleXorExpression__Group__03045 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CSSRuleXorExpression__Group__1_in_rule__CSSRuleXorExpression__Group__03048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXorExpression__XorsAssignment_0_in_rule__CSSRuleXorExpression__Group__0__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXorExpression__Group__1__Impl_in_rule__CSSRuleXorExpression__Group__13105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXorExpression__Group_1__0_in_rule__CSSRuleXorExpression__Group__1__Impl3132 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXorExpression__Group_1__0__Impl_in_rule__CSSRuleXorExpression__Group_1__03167 = new BitSet(new long[]{0x0000000002080010L});
    public static final BitSet FOLLOW_rule__CSSRuleXorExpression__Group_1__1_in_rule__CSSRuleXorExpression__Group_1__03170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CSSRuleXorExpression__Group_1__0__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXorExpression__Group_1__1__Impl_in_rule__CSSRuleXorExpression__Group_1__13229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXorExpression__XorsAssignment_1_1_in_rule__CSSRuleXorExpression__Group_1__1__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracketExpression__Group__0__Impl_in_rule__CSSRuleBracketExpression__Group__03290 = new BitSet(new long[]{0x0000000002080010L});
    public static final BitSet FOLLOW_rule__CSSRuleBracketExpression__Group__1_in_rule__CSSRuleBracketExpression__Group__03293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CSSRuleBracketExpression__Group__0__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracketExpression__Group__1__Impl_in_rule__CSSRuleBracketExpression__Group__13352 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CSSRuleBracketExpression__Group__2_in_rule__CSSRuleBracketExpression__Group__13355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOrExpression_in_rule__CSSRuleBracketExpression__Group__1__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracketExpression__Group__2__Impl_in_rule__CSSRuleBracketExpression__Group__23411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CSSRuleBracketExpression__Group__2__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfixExpression__Group__0__Impl_in_rule__CSSRulePostfixExpression__Group__03476 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__CSSRulePostfixExpression__Group__1_in_rule__CSSRulePostfixExpression__Group__03479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_rule__CSSRulePostfixExpression__Group__0__Impl3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfixExpression__Group__1__Impl_in_rule__CSSRulePostfixExpression__Group__13535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfixExpression__CAssignment_1_in_rule__CSSRulePostfixExpression__Group__1__Impl3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__0__Impl_in_rule__CSSRuleConcat__Group__03597 = new BitSet(new long[]{0x0000000002080010L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__1_in_rule__CSSRuleConcat__Group__03600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__ConcAssignment_0_in_rule__CSSRuleConcat__Group__0__Impl3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__1__Impl_in_rule__CSSRuleConcat__Group__13657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_in_rule__CSSRuleConcat__Group__1__Impl3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__CssExtension__ImportsAssignment_03724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__CssExtension__PackageDefAssignment_13755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_13786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_13817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleSet_in_rule__PackageDeclaration__RuleAssignment_33848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleAssignment_in_rule__CSSRuleSet__RulesAssignment3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CSSRuleId__NameAssignment3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CSSRuleRef__RefAssignment_13945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleId_in_rule__CSSRuleAssignment__IdAssignment_13980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOrExpression_in_rule__CSSRuleAssignment__RAssignment_34011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXorExpression_in_rule__CSSRuleOrExpression__OrsAssignment_04042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXorExpression_in_rule__CSSRuleOrExpression__OrsAssignment_1_14073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfixExpression_in_rule__CSSRuleXorExpression__XorsAssignment_04104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfixExpression_in_rule__CSSRuleXorExpression__XorsAssignment_1_14135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfixExpression__CAlternatives_1_0_in_rule__CSSRulePostfixExpression__CAssignment_14166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimaryExpression_in_rule__CSSRuleConcat__ConcAssignment_04199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimaryExpression_in_rule__CSSRuleConcat__ConcAssignment_14230 = new BitSet(new long[]{0x0000000000000002L});

}