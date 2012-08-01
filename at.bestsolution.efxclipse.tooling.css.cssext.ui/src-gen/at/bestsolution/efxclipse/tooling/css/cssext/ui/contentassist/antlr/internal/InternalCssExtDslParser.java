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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_JDOC", "RULE_PSEUDO", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INT'", "'DOUBLE'", "'UDOUBLE'", "'*'", "'+'", "'?'", "'import'", "'.'", "'package'", "'{'", "'}'", "';'", "'default:'", "'<'", "'>'", "'='", "'|'", "'||'", "'['", "']'", "','"
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
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=11;
    public static final int RULE_JDOC=7;
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
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:258:1: ( ruleCSSBaseType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:259:1: ruleCSSBaseType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSBaseTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCSSBaseType_in_entryRuleCSSBaseType486);
            ruleCSSBaseType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSBaseTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSBaseType493); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSBaseType"


    // $ANTLR start "ruleCSSBaseType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:266:1: ruleCSSBaseType : ( ( rule__CSSBaseType__Alternatives ) ) ;
    public final void ruleCSSBaseType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:270:2: ( ( ( rule__CSSBaseType__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:271:1: ( ( rule__CSSBaseType__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:271:1: ( ( rule__CSSBaseType__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:272:1: ( rule__CSSBaseType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSBaseTypeAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:273:1: ( rule__CSSBaseType__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:273:2: rule__CSSBaseType__Alternatives
            {
            pushFollow(FOLLOW_rule__CSSBaseType__Alternatives_in_ruleCSSBaseType519);
            rule__CSSBaseType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSBaseTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCSSBaseType"


    // $ANTLR start "entryRuleElementDeclartion"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:285:1: entryRuleElementDeclartion : ruleElementDeclartion EOF ;
    public final void entryRuleElementDeclartion() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:286:1: ( ruleElementDeclartion EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:287:1: ruleElementDeclartion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionRule()); 
            }
            pushFollow(FOLLOW_ruleElementDeclartion_in_entryRuleElementDeclartion546);
            ruleElementDeclartion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDeclartionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDeclartion553); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:294:1: ruleElementDeclartion : ( ( rule__ElementDeclartion__Group__0 ) ) ;
    public final void ruleElementDeclartion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:298:2: ( ( ( rule__ElementDeclartion__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:299:1: ( ( rule__ElementDeclartion__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:299:1: ( ( rule__ElementDeclartion__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:300:1: ( rule__ElementDeclartion__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:301:1: ( rule__ElementDeclartion__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:301:2: rule__ElementDeclartion__Group__0
            {
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__0_in_ruleElementDeclartion579);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:313:1: entryRulePropertyDefinition : rulePropertyDefinition EOF ;
    public final void entryRulePropertyDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:314:1: ( rulePropertyDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:315:1: rulePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition606);
            rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition613); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:322:1: rulePropertyDefinition : ( ( rule__PropertyDefinition__Group__0 ) ) ;
    public final void rulePropertyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:326:2: ( ( ( rule__PropertyDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:327:1: ( ( rule__PropertyDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:327:1: ( ( rule__PropertyDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:328:1: ( rule__PropertyDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:329:1: ( rule__PropertyDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:329:2: rule__PropertyDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition639);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:341:1: entryRulePseudoClassDefinition : rulePseudoClassDefinition EOF ;
    public final void entryRulePseudoClassDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:342:1: ( rulePseudoClassDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:343:1: rulePseudoClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassDefinition_in_entryRulePseudoClassDefinition666);
            rulePseudoClassDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassDefinition673); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:350:1: rulePseudoClassDefinition : ( ( rule__PseudoClassDefinition__Group__0 ) ) ;
    public final void rulePseudoClassDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:354:2: ( ( ( rule__PseudoClassDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:355:1: ( ( rule__PseudoClassDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:355:1: ( ( rule__PseudoClassDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:356:1: ( rule__PseudoClassDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:357:1: ( rule__PseudoClassDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:357:2: rule__PseudoClassDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__0_in_rulePseudoClassDefinition699);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:369:1: entryRuleCSSRuleId : ruleCSSRuleId EOF ;
    public final void entryRuleCSSRuleId() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:370:1: ( ruleCSSRuleId EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:371:1: ruleCSSRuleId EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleIdRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleId_in_entryRuleCSSRuleId726);
            ruleCSSRuleId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleIdRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleId733); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:378:1: ruleCSSRuleId : ( ( rule__CSSRuleId__NameAssignment ) ) ;
    public final void ruleCSSRuleId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:382:2: ( ( ( rule__CSSRuleId__NameAssignment ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:383:1: ( ( rule__CSSRuleId__NameAssignment ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:383:1: ( ( rule__CSSRuleId__NameAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:384:1: ( rule__CSSRuleId__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleIdAccess().getNameAssignment()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:385:1: ( rule__CSSRuleId__NameAssignment )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:385:2: rule__CSSRuleId__NameAssignment
            {
            pushFollow(FOLLOW_rule__CSSRuleId__NameAssignment_in_ruleCSSRuleId759);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:397:1: entryRuleCSSRuleRef : ruleCSSRuleRef EOF ;
    public final void entryRuleCSSRuleRef() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:398:1: ( ruleCSSRuleRef EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:399:1: ruleCSSRuleRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef786);
            ruleCSSRuleRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleRef793); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:406:1: ruleCSSRuleRef : ( ( rule__CSSRuleRef__Group__0 ) ) ;
    public final void ruleCSSRuleRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:410:2: ( ( ( rule__CSSRuleRef__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:411:1: ( ( rule__CSSRuleRef__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:411:1: ( ( rule__CSSRuleRef__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:412:1: ( rule__CSSRuleRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:413:1: ( rule__CSSRuleRef__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:413:2: rule__CSSRuleRef__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__0_in_ruleCSSRuleRef819);
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


    // $ANTLR start "entryRuleCSSRuleDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:425:1: entryRuleCSSRuleDefinition : ruleCSSRuleDefinition EOF ;
    public final void entryRuleCSSRuleDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:426:1: ( ruleCSSRuleDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:427:1: ruleCSSRuleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleDefinition_in_entryRuleCSSRuleDefinition846);
            ruleCSSRuleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleDefinition853); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleDefinition"


    // $ANTLR start "ruleCSSRuleDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:434:1: ruleCSSRuleDefinition : ( ( rule__CSSRuleDefinition__Group__0 ) ) ;
    public final void ruleCSSRuleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:438:2: ( ( ( rule__CSSRuleDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:439:1: ( ( rule__CSSRuleDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:439:1: ( ( rule__CSSRuleDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:440:1: ( rule__CSSRuleDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:441:1: ( rule__CSSRuleDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:441:2: rule__CSSRuleDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__0_in_ruleCSSRuleDefinition879);
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

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleDefinition"


    // $ANTLR start "entryRuleCSSRuleOr"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:453:1: entryRuleCSSRuleOr : ruleCSSRuleOr EOF ;
    public final void entryRuleCSSRuleOr() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:454:1: ( ruleCSSRuleOr EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:455:1: ruleCSSRuleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr906);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleOr913); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleOr"


    // $ANTLR start "ruleCSSRuleOr"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:462:1: ruleCSSRuleOr : ( ( rule__CSSRuleOr__Group__0 ) ) ;
    public final void ruleCSSRuleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:466:2: ( ( ( rule__CSSRuleOr__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:467:1: ( ( rule__CSSRuleOr__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:467:1: ( ( rule__CSSRuleOr__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:468:1: ( rule__CSSRuleOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:469:1: ( rule__CSSRuleOr__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:469:2: rule__CSSRuleOr__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__0_in_ruleCSSRuleOr939);
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

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleOr"


    // $ANTLR start "entryRuleCSSRuleXor"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:481:1: entryRuleCSSRuleXor : ruleCSSRuleXor EOF ;
    public final void entryRuleCSSRuleXor() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:482:1: ( ruleCSSRuleXor EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:483:1: ruleCSSRuleXor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor966);
            ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleXor973); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleXor"


    // $ANTLR start "ruleCSSRuleXor"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:490:1: ruleCSSRuleXor : ( ( rule__CSSRuleXor__Group__0 ) ) ;
    public final void ruleCSSRuleXor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:494:2: ( ( ( rule__CSSRuleXor__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:495:1: ( ( rule__CSSRuleXor__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:495:1: ( ( rule__CSSRuleXor__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:496:1: ( rule__CSSRuleXor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:497:1: ( rule__CSSRuleXor__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:497:2: rule__CSSRuleXor__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__0_in_ruleCSSRuleXor999);
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

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleXor"


    // $ANTLR start "entryRuleCSSRuleConcat"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:509:1: entryRuleCSSRuleConcat : ruleCSSRuleConcat EOF ;
    public final void entryRuleCSSRuleConcat() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:510:1: ( ruleCSSRuleConcat EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:511:1: ruleCSSRuleConcat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat1026);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleConcat1033); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:518:1: ruleCSSRuleConcat : ( ( rule__CSSRuleConcat__Group__0 ) ) ;
    public final void ruleCSSRuleConcat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:522:2: ( ( ( rule__CSSRuleConcat__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:523:1: ( ( rule__CSSRuleConcat__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:523:1: ( ( rule__CSSRuleConcat__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:524:1: ( rule__CSSRuleConcat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:525:1: ( rule__CSSRuleConcat__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:525:2: rule__CSSRuleConcat__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__0_in_ruleCSSRuleConcat1059);
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


    // $ANTLR start "entryRuleCSSRulePostfix"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:537:1: entryRuleCSSRulePostfix : ruleCSSRulePostfix EOF ;
    public final void entryRuleCSSRulePostfix() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:538:1: ( ruleCSSRulePostfix EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:539:1: ruleCSSRulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix1086);
            ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePostfix1093); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRulePostfix"


    // $ANTLR start "ruleCSSRulePostfix"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:546:1: ruleCSSRulePostfix : ( ( rule__CSSRulePostfix__Group__0 ) ) ;
    public final void ruleCSSRulePostfix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:550:2: ( ( ( rule__CSSRulePostfix__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:551:1: ( ( rule__CSSRulePostfix__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:551:1: ( ( rule__CSSRulePostfix__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:552:1: ( rule__CSSRulePostfix__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:553:1: ( rule__CSSRulePostfix__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:553:2: rule__CSSRulePostfix__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__0_in_ruleCSSRulePostfix1119);
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

        }
        return ;
    }
    // $ANTLR end "ruleCSSRulePostfix"


    // $ANTLR start "entryRuleCSSRuleBracket"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:565:1: entryRuleCSSRuleBracket : ruleCSSRuleBracket EOF ;
    public final void entryRuleCSSRuleBracket() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:566:1: ( ruleCSSRuleBracket EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:567:1: ruleCSSRuleBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket1146);
            ruleCSSRuleBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleBracket1153); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleBracket"


    // $ANTLR start "ruleCSSRuleBracket"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:574:1: ruleCSSRuleBracket : ( ( rule__CSSRuleBracket__Group__0 ) ) ;
    public final void ruleCSSRuleBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:578:2: ( ( ( rule__CSSRuleBracket__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:579:1: ( ( rule__CSSRuleBracket__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:579:1: ( ( rule__CSSRuleBracket__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:580:1: ( rule__CSSRuleBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:581:1: ( rule__CSSRuleBracket__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:581:2: rule__CSSRuleBracket__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__0_in_ruleCSSRuleBracket1179);
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

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleBracket"


    // $ANTLR start "entryRuleCSSRulePrimary"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:593:1: entryRuleCSSRulePrimary : ruleCSSRulePrimary EOF ;
    public final void entryRuleCSSRulePrimary() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:594:1: ( ruleCSSRulePrimary EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:595:1: ruleCSSRulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary1206);
            ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePrimary1213); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRulePrimary"


    // $ANTLR start "ruleCSSRulePrimary"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:602:1: ruleCSSRulePrimary : ( ( rule__CSSRulePrimary__Alternatives ) ) ;
    public final void ruleCSSRulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:606:2: ( ( ( rule__CSSRulePrimary__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:607:1: ( ( rule__CSSRulePrimary__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:607:1: ( ( rule__CSSRulePrimary__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:608:1: ( rule__CSSRulePrimary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:609:1: ( rule__CSSRulePrimary__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:609:2: rule__CSSRulePrimary__Alternatives
            {
            pushFollow(FOLLOW_rule__CSSRulePrimary__Alternatives_in_ruleCSSRulePrimary1239);
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

        }
        return ;
    }
    // $ANTLR end "ruleCSSRulePrimary"


    // $ANTLR start "entryRuleCSSRuleLiteral"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:621:1: entryRuleCSSRuleLiteral : ruleCSSRuleLiteral EOF ;
    public final void entryRuleCSSRuleLiteral() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:622:1: ( ruleCSSRuleLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:623:1: ruleCSSRuleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral1266);
            ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleLiteral1273); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:630:1: ruleCSSRuleLiteral : ( ( rule__CSSRuleLiteral__Alternatives ) ) ;
    public final void ruleCSSRuleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:634:2: ( ( ( rule__CSSRuleLiteral__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:635:1: ( ( rule__CSSRuleLiteral__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:635:1: ( ( rule__CSSRuleLiteral__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:636:1: ( rule__CSSRuleLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:637:1: ( rule__CSSRuleLiteral__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:637:2: rule__CSSRuleLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Alternatives_in_ruleCSSRuleLiteral1299);
            rule__CSSRuleLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getAlternatives()); 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:649:1: entryRuleCSSDefaultValue : ruleCSSDefaultValue EOF ;
    public final void entryRuleCSSDefaultValue() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:650:1: ( ruleCSSDefaultValue EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:651:1: ruleCSSDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue1326);
            ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSDefaultValue1333); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:658:1: ruleCSSDefaultValue : ( ( rule__CSSDefaultValue__Alternatives ) ) ;
    public final void ruleCSSDefaultValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:662:2: ( ( ( rule__CSSDefaultValue__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:663:1: ( ( rule__CSSDefaultValue__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:663:1: ( ( rule__CSSDefaultValue__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:664:1: ( rule__CSSDefaultValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:665:1: ( rule__CSSDefaultValue__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:665:2: rule__CSSDefaultValue__Alternatives
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__Alternatives_in_ruleCSSDefaultValue1359);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:677:1: rule__PackageDefinition__Alternatives_3 : ( ( ( rule__PackageDefinition__RulesAssignment_3_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) ) );
    public final void rule__PackageDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:681:1: ( ( ( rule__PackageDefinition__RulesAssignment_3_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:682:1: ( ( rule__PackageDefinition__RulesAssignment_3_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:682:1: ( ( rule__PackageDefinition__RulesAssignment_3_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:683:1: ( rule__PackageDefinition__RulesAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getRulesAssignment_3_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:684:1: ( rule__PackageDefinition__RulesAssignment_3_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:684:2: rule__PackageDefinition__RulesAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__PackageDefinition__RulesAssignment_3_0_in_rule__PackageDefinition__Alternatives_31395);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:688:6: ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:688:6: ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:689:1: ( rule__PackageDefinition__SubpackagesAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getSubpackagesAssignment_3_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:690:1: ( rule__PackageDefinition__SubpackagesAssignment_3_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:690:2: rule__PackageDefinition__SubpackagesAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__PackageDefinition__SubpackagesAssignment_3_1_in_rule__PackageDefinition__Alternatives_31413);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:694:6: ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:694:6: ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:695:1: ( rule__PackageDefinition__ElementsAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getElementsAssignment_3_2()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:696:1: ( rule__PackageDefinition__ElementsAssignment_3_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:696:2: rule__PackageDefinition__ElementsAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__PackageDefinition__ElementsAssignment_3_2_in_rule__PackageDefinition__Alternatives_31431);
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


    // $ANTLR start "rule__CSSBaseType__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:705:1: rule__CSSBaseType__Alternatives : ( ( 'INT' ) | ( 'DOUBLE' ) | ( 'UDOUBLE' ) );
    public final void rule__CSSBaseType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:709:1: ( ( 'INT' ) | ( 'DOUBLE' ) | ( 'UDOUBLE' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:710:1: ( 'INT' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:710:1: ( 'INT' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:711:1: 'INT'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSBaseTypeAccess().getINTKeyword_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__CSSBaseType__Alternatives1465); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSBaseTypeAccess().getINTKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:718:6: ( 'DOUBLE' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:718:6: ( 'DOUBLE' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:719:1: 'DOUBLE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSBaseTypeAccess().getDOUBLEKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__CSSBaseType__Alternatives1485); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSBaseTypeAccess().getDOUBLEKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:726:6: ( 'UDOUBLE' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:726:6: ( 'UDOUBLE' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:727:1: 'UDOUBLE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSBaseTypeAccess().getUDOUBLEKeyword_2()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__CSSBaseType__Alternatives1505); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSBaseTypeAccess().getUDOUBLEKeyword_2()); 
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
    // $ANTLR end "rule__CSSBaseType__Alternatives"


    // $ANTLR start "rule__ElementDeclartion__Alternatives_3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:739:1: rule__ElementDeclartion__Alternatives_3 : ( ( ( rule__ElementDeclartion__PropertiesAssignment_3_0 ) ) | ( ( rule__ElementDeclartion__PseudoClassesAssignment_3_1 ) ) );
    public final void rule__ElementDeclartion__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:743:1: ( ( ( rule__ElementDeclartion__PropertiesAssignment_3_0 ) ) | ( ( rule__ElementDeclartion__PseudoClassesAssignment_3_1 ) ) )
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:744:1: ( ( rule__ElementDeclartion__PropertiesAssignment_3_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:744:1: ( ( rule__ElementDeclartion__PropertiesAssignment_3_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:745:1: ( rule__ElementDeclartion__PropertiesAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDeclartionAccess().getPropertiesAssignment_3_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:746:1: ( rule__ElementDeclartion__PropertiesAssignment_3_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:746:2: rule__ElementDeclartion__PropertiesAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__ElementDeclartion__PropertiesAssignment_3_0_in_rule__ElementDeclartion__Alternatives_31539);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:750:6: ( ( rule__ElementDeclartion__PseudoClassesAssignment_3_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:750:6: ( ( rule__ElementDeclartion__PseudoClassesAssignment_3_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:751:1: ( rule__ElementDeclartion__PseudoClassesAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDeclartionAccess().getPseudoClassesAssignment_3_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:752:1: ( rule__ElementDeclartion__PseudoClassesAssignment_3_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:752:2: rule__ElementDeclartion__PseudoClassesAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ElementDeclartion__PseudoClassesAssignment_3_1_in_rule__ElementDeclartion__Alternatives_31557);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:761:1: rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 : ( ( '*' ) | ( '+' ) | ( '?' ) );
    public final void rule__CSSRulePostfix__CardinalityAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:765:1: ( ( '*' ) | ( '+' ) | ( '?' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:766:1: ( '*' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:766:1: ( '*' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:767:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_01591); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:774:6: ( '+' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:774:6: ( '+' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:775:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_01611); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:782:6: ( '?' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:782:6: ( '?' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:783:1: '?'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityQuestionMarkKeyword_1_1_0_2()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_01631); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:795:1: rule__CSSRulePrimary__Alternatives : ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracket ) | ( ruleCSSRuleLiteral ) | ( ruleCSSBaseType ) );
    public final void rule__CSSRulePrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:799:1: ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracket ) | ( ruleCSSRuleLiteral ) | ( ruleCSSBaseType ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
            case 33:
                {
                alt5=3;
                }
                break;
            case 13:
            case 14:
            case 15:
                {
                alt5=4;
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:800:1: ( ruleCSSRuleRef )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:800:1: ( ruleCSSRuleRef )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:801:1: ruleCSSRuleRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleRef_in_rule__CSSRulePrimary__Alternatives1665);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:806:6: ( ruleCSSRuleBracket )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:806:6: ( ruleCSSRuleBracket )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:807:1: ruleCSSRuleBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleBracketParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleBracket_in_rule__CSSRulePrimary__Alternatives1682);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:812:6: ( ruleCSSRuleLiteral )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:812:6: ( ruleCSSRuleLiteral )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:813:1: ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleLiteral_in_rule__CSSRulePrimary__Alternatives1699);
                    ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:818:6: ( ruleCSSBaseType )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:818:6: ( ruleCSSBaseType )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:819:1: ruleCSSBaseType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleCSSBaseType_in_rule__CSSRulePrimary__Alternatives1716);
                    ruleCSSBaseType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_3()); 
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


    // $ANTLR start "rule__CSSRuleLiteral__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:829:1: rule__CSSRuleLiteral__Alternatives : ( ( ( rule__CSSRuleLiteral__Group_0__0 ) ) | ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) ) );
    public final void rule__CSSRuleLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:833:1: ( ( ( rule__CSSRuleLiteral__Group_0__0 ) ) | ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==33) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:834:1: ( ( rule__CSSRuleLiteral__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:834:1: ( ( rule__CSSRuleLiteral__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:835:1: ( rule__CSSRuleLiteral__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleLiteralAccess().getGroup_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:836:1: ( rule__CSSRuleLiteral__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:836:2: rule__CSSRuleLiteral__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleLiteral__Group_0__0_in_rule__CSSRuleLiteral__Alternatives1748);
                    rule__CSSRuleLiteral__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleLiteralAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:840:6: ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:840:6: ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:841:1: ( rule__CSSRuleLiteral__ValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleLiteralAccess().getValueAssignment_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:842:1: ( rule__CSSRuleLiteral__ValueAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:842:2: rule__CSSRuleLiteral__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CSSRuleLiteral__ValueAssignment_1_in_rule__CSSRuleLiteral__Alternatives1766);
                    rule__CSSRuleLiteral__ValueAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleLiteralAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__CSSRuleLiteral__Alternatives"


    // $ANTLR start "rule__CSSDefaultValue__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:851:1: rule__CSSDefaultValue__Alternatives : ( ( ruleCSSRuleLiteral ) | ( RULE_INT ) | ( ( rule__CSSDefaultValue__Group_2__0 ) ) | ( RULE_STRING ) );
    public final void rule__CSSDefaultValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:855:1: ( ( ruleCSSRuleLiteral ) | ( RULE_INT ) | ( ( rule__CSSDefaultValue__Group_2__0 ) ) | ( RULE_STRING ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 33:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==EOF||LA7_2==24) ) {
                    alt7=2;
                }
                else if ( (LA7_2==RULE_INT||LA7_2==20) ) {
                    alt7=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case RULE_STRING:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:856:1: ( ruleCSSRuleLiteral )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:856:1: ( ruleCSSRuleLiteral )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:857:1: ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getCSSRuleLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleLiteral_in_rule__CSSDefaultValue__Alternatives1799);
                    ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getCSSRuleLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:862:6: ( RULE_INT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:862:6: ( RULE_INT )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:863:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getINTTerminalRuleCall_1()); 
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CSSDefaultValue__Alternatives1816); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getINTTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:868:6: ( ( rule__CSSDefaultValue__Group_2__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:868:6: ( ( rule__CSSDefaultValue__Group_2__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:869:1: ( rule__CSSDefaultValue__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getGroup_2()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:870:1: ( rule__CSSDefaultValue__Group_2__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:870:2: rule__CSSDefaultValue__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CSSDefaultValue__Group_2__0_in_rule__CSSDefaultValue__Alternatives1833);
                    rule__CSSDefaultValue__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:874:6: ( RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:874:6: ( RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:875:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getSTRINGTerminalRuleCall_3()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CSSDefaultValue__Alternatives1851); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getSTRINGTerminalRuleCall_3()); 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:887:1: rule__CssExtension__Group__0 : rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1 ;
    public final void rule__CssExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:891:1: ( rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:892:2: rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1
            {
            pushFollow(FOLLOW_rule__CssExtension__Group__0__Impl_in_rule__CssExtension__Group__01881);
            rule__CssExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CssExtension__Group__1_in_rule__CssExtension__Group__01884);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:899:1: rule__CssExtension__Group__0__Impl : ( ( rule__CssExtension__ImportsAssignment_0 )* ) ;
    public final void rule__CssExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:903:1: ( ( ( rule__CssExtension__ImportsAssignment_0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:904:1: ( ( rule__CssExtension__ImportsAssignment_0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:904:1: ( ( rule__CssExtension__ImportsAssignment_0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:905:1: ( rule__CssExtension__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getImportsAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:906:1: ( rule__CssExtension__ImportsAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:906:2: rule__CssExtension__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__CssExtension__ImportsAssignment_0_in_rule__CssExtension__Group__0__Impl1911);
            	    rule__CssExtension__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:916:1: rule__CssExtension__Group__1 : rule__CssExtension__Group__1__Impl ;
    public final void rule__CssExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:920:1: ( rule__CssExtension__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:921:2: rule__CssExtension__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CssExtension__Group__1__Impl_in_rule__CssExtension__Group__11942);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:927:1: rule__CssExtension__Group__1__Impl : ( ( rule__CssExtension__PackageDefAssignment_1 )? ) ;
    public final void rule__CssExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:931:1: ( ( ( rule__CssExtension__PackageDefAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:932:1: ( ( rule__CssExtension__PackageDefAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:932:1: ( ( rule__CssExtension__PackageDefAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:933:1: ( rule__CssExtension__PackageDefAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getPackageDefAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:934:1: ( rule__CssExtension__PackageDefAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:934:2: rule__CssExtension__PackageDefAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CssExtension__PackageDefAssignment_1_in_rule__CssExtension__Group__1__Impl1969);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:948:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:952:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:953:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02004);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02007);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:960:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:964:1: ( ( 'import' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:965:1: ( 'import' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:965:1: ( 'import' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:966:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Import__Group__0__Impl2035); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:979:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:983:1: ( rule__Import__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:984:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12066);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:990:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:994:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:995:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:995:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:996:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:997:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:997:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2093);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1011:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1015:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1016:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02127);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02130);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1023:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1027:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1028:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1028:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1029:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl2157);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1040:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1044:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1045:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12186);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1051:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1055:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1056:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1056:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1057:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1058:1: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==RULE_ID) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1058:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2213);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1072:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1076:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1077:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02248);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02251);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1084:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1088:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1089:1: ( ( '.' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1089:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1090:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1091:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1092:2: '.'
            {
            match(input,20,FOLLOW_20_in_rule__QualifiedName__Group_1__0__Impl2280); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1103:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1107:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1108:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12312);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1114:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1118:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1119:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1119:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1120:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl2339);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1135:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1139:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1140:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__02372);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__02375);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1147:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1151:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1152:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1152:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1153:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl2402);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1164:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1168:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1169:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__12431);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1175:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1179:1: ( ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1180:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1180:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1181:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1182:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1182:2: rule__QualifiedNameWithWildCard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl2458);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1196:1: rule__QualifiedNameWithWildCard__Group_1__0 : rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1200:1: ( rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1201:2: rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__02493);
            rule__QualifiedNameWithWildCard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__02496);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1208:1: rule__QualifiedNameWithWildCard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1212:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1213:1: ( '.' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1213:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1214:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl2524); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1227:1: rule__QualifiedNameWithWildCard__Group_1__1 : rule__QualifiedNameWithWildCard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1231:1: ( rule__QualifiedNameWithWildCard__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1232:2: rule__QualifiedNameWithWildCard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__12555);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1238:1: rule__QualifiedNameWithWildCard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1242:1: ( ( '*' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1243:1: ( '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1243:1: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1244:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl2583); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1261:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1265:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1266:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__0__Impl_in_rule__PackageDefinition__Group__02618);
            rule__PackageDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__1_in_rule__PackageDefinition__Group__02621);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1273:1: rule__PackageDefinition__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1277:1: ( ( 'package' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1278:1: ( 'package' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1278:1: ( 'package' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1279:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__PackageDefinition__Group__0__Impl2649); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1292:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1296:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1297:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__1__Impl_in_rule__PackageDefinition__Group__12680);
            rule__PackageDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__2_in_rule__PackageDefinition__Group__12683);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1304:1: rule__PackageDefinition__Group__1__Impl : ( ( rule__PackageDefinition__NameAssignment_1 ) ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1308:1: ( ( ( rule__PackageDefinition__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1309:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1309:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1310:1: ( rule__PackageDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1311:1: ( rule__PackageDefinition__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1311:2: rule__PackageDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDefinition__NameAssignment_1_in_rule__PackageDefinition__Group__1__Impl2710);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1321:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1325:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1326:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__2__Impl_in_rule__PackageDefinition__Group__22740);
            rule__PackageDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__3_in_rule__PackageDefinition__Group__22743);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1333:1: rule__PackageDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1337:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1338:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1338:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1339:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__PackageDefinition__Group__2__Impl2771); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1352:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1356:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1357:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__3__Impl_in_rule__PackageDefinition__Group__32802);
            rule__PackageDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__4_in_rule__PackageDefinition__Group__32805);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1364:1: rule__PackageDefinition__Group__3__Impl : ( ( rule__PackageDefinition__Alternatives_3 )* ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1368:1: ( ( ( rule__PackageDefinition__Alternatives_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1369:1: ( ( rule__PackageDefinition__Alternatives_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1369:1: ( ( rule__PackageDefinition__Alternatives_3 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1370:1: ( rule__PackageDefinition__Alternatives_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1371:1: ( rule__PackageDefinition__Alternatives_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==RULE_JDOC||LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1371:2: rule__PackageDefinition__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__PackageDefinition__Alternatives_3_in_rule__PackageDefinition__Group__3__Impl2832);
            	    rule__PackageDefinition__Alternatives_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1381:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1385:1: ( rule__PackageDefinition__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1386:2: rule__PackageDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__4__Impl_in_rule__PackageDefinition__Group__42863);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1392:1: rule__PackageDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1396:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1397:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1397:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1398:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,23,FOLLOW_23_in_rule__PackageDefinition__Group__4__Impl2891); if (state.failed) return ;
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


    // $ANTLR start "rule__ElementDeclartion__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1421:1: rule__ElementDeclartion__Group__0 : rule__ElementDeclartion__Group__0__Impl rule__ElementDeclartion__Group__1 ;
    public final void rule__ElementDeclartion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1425:1: ( rule__ElementDeclartion__Group__0__Impl rule__ElementDeclartion__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1426:2: rule__ElementDeclartion__Group__0__Impl rule__ElementDeclartion__Group__1
            {
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__0__Impl_in_rule__ElementDeclartion__Group__02932);
            rule__ElementDeclartion__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__1_in_rule__ElementDeclartion__Group__02935);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1433:1: rule__ElementDeclartion__Group__0__Impl : ( ( rule__ElementDeclartion__DokuAssignment_0 )? ) ;
    public final void rule__ElementDeclartion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1437:1: ( ( ( rule__ElementDeclartion__DokuAssignment_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1438:1: ( ( rule__ElementDeclartion__DokuAssignment_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1438:1: ( ( rule__ElementDeclartion__DokuAssignment_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1439:1: ( rule__ElementDeclartion__DokuAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getDokuAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1440:1: ( rule__ElementDeclartion__DokuAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_JDOC) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1440:2: rule__ElementDeclartion__DokuAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ElementDeclartion__DokuAssignment_0_in_rule__ElementDeclartion__Group__0__Impl2962);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1450:1: rule__ElementDeclartion__Group__1 : rule__ElementDeclartion__Group__1__Impl rule__ElementDeclartion__Group__2 ;
    public final void rule__ElementDeclartion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1454:1: ( rule__ElementDeclartion__Group__1__Impl rule__ElementDeclartion__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1455:2: rule__ElementDeclartion__Group__1__Impl rule__ElementDeclartion__Group__2
            {
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__1__Impl_in_rule__ElementDeclartion__Group__12993);
            rule__ElementDeclartion__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__2_in_rule__ElementDeclartion__Group__12996);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1462:1: rule__ElementDeclartion__Group__1__Impl : ( ( rule__ElementDeclartion__NameAssignment_1 ) ) ;
    public final void rule__ElementDeclartion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1466:1: ( ( ( rule__ElementDeclartion__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1467:1: ( ( rule__ElementDeclartion__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1467:1: ( ( rule__ElementDeclartion__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1468:1: ( rule__ElementDeclartion__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1469:1: ( rule__ElementDeclartion__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1469:2: rule__ElementDeclartion__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ElementDeclartion__NameAssignment_1_in_rule__ElementDeclartion__Group__1__Impl3023);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1479:1: rule__ElementDeclartion__Group__2 : rule__ElementDeclartion__Group__2__Impl rule__ElementDeclartion__Group__3 ;
    public final void rule__ElementDeclartion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1483:1: ( rule__ElementDeclartion__Group__2__Impl rule__ElementDeclartion__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1484:2: rule__ElementDeclartion__Group__2__Impl rule__ElementDeclartion__Group__3
            {
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__2__Impl_in_rule__ElementDeclartion__Group__23053);
            rule__ElementDeclartion__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__3_in_rule__ElementDeclartion__Group__23056);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1491:1: rule__ElementDeclartion__Group__2__Impl : ( '{' ) ;
    public final void rule__ElementDeclartion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1495:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1496:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1496:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1497:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__ElementDeclartion__Group__2__Impl3084); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1510:1: rule__ElementDeclartion__Group__3 : rule__ElementDeclartion__Group__3__Impl rule__ElementDeclartion__Group__4 ;
    public final void rule__ElementDeclartion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1514:1: ( rule__ElementDeclartion__Group__3__Impl rule__ElementDeclartion__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1515:2: rule__ElementDeclartion__Group__3__Impl rule__ElementDeclartion__Group__4
            {
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__3__Impl_in_rule__ElementDeclartion__Group__33115);
            rule__ElementDeclartion__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__4_in_rule__ElementDeclartion__Group__33118);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1522:1: rule__ElementDeclartion__Group__3__Impl : ( ( rule__ElementDeclartion__Alternatives_3 )* ) ;
    public final void rule__ElementDeclartion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1526:1: ( ( ( rule__ElementDeclartion__Alternatives_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1527:1: ( ( rule__ElementDeclartion__Alternatives_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1527:1: ( ( rule__ElementDeclartion__Alternatives_3 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1528:1: ( rule__ElementDeclartion__Alternatives_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1529:1: ( rule__ElementDeclartion__Alternatives_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=RULE_JDOC && LA14_0<=RULE_PSEUDO)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1529:2: rule__ElementDeclartion__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__ElementDeclartion__Alternatives_3_in_rule__ElementDeclartion__Group__3__Impl3145);
            	    rule__ElementDeclartion__Alternatives_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1539:1: rule__ElementDeclartion__Group__4 : rule__ElementDeclartion__Group__4__Impl ;
    public final void rule__ElementDeclartion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1543:1: ( rule__ElementDeclartion__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1544:2: rule__ElementDeclartion__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ElementDeclartion__Group__4__Impl_in_rule__ElementDeclartion__Group__43176);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1550:1: rule__ElementDeclartion__Group__4__Impl : ( '}' ) ;
    public final void rule__ElementDeclartion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1554:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1555:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1555:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1556:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,23,FOLLOW_23_in_rule__ElementDeclartion__Group__4__Impl3204); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1579:1: rule__PropertyDefinition__Group__0 : rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 ;
    public final void rule__PropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1583:1: ( rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1584:2: rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__03245);
            rule__PropertyDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__03248);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1591:1: rule__PropertyDefinition__Group__0__Impl : ( ( rule__PropertyDefinition__DokuAssignment_0 )? ) ;
    public final void rule__PropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1595:1: ( ( ( rule__PropertyDefinition__DokuAssignment_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1596:1: ( ( rule__PropertyDefinition__DokuAssignment_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1596:1: ( ( rule__PropertyDefinition__DokuAssignment_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1597:1: ( rule__PropertyDefinition__DokuAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDokuAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1598:1: ( rule__PropertyDefinition__DokuAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_JDOC) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1598:2: rule__PropertyDefinition__DokuAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__DokuAssignment_0_in_rule__PropertyDefinition__Group__0__Impl3275);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1608:1: rule__PropertyDefinition__Group__1 : rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 ;
    public final void rule__PropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1612:1: ( rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1613:2: rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__13306);
            rule__PropertyDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__13309);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1620:1: rule__PropertyDefinition__Group__1__Impl : ( ( rule__PropertyDefinition__NameAssignment_1 ) ) ;
    public final void rule__PropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1624:1: ( ( ( rule__PropertyDefinition__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1625:1: ( ( rule__PropertyDefinition__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1625:1: ( ( rule__PropertyDefinition__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1626:1: ( rule__PropertyDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1627:1: ( rule__PropertyDefinition__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1627:2: rule__PropertyDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__NameAssignment_1_in_rule__PropertyDefinition__Group__1__Impl3336);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1637:1: rule__PropertyDefinition__Group__2 : rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 ;
    public final void rule__PropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1641:1: ( rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1642:2: rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__23366);
            rule__PropertyDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__23369);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1649:1: rule__PropertyDefinition__Group__2__Impl : ( ( rule__PropertyDefinition__RuleAssignment_2 ) ) ;
    public final void rule__PropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1653:1: ( ( ( rule__PropertyDefinition__RuleAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1654:1: ( ( rule__PropertyDefinition__RuleAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1654:1: ( ( rule__PropertyDefinition__RuleAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1655:1: ( rule__PropertyDefinition__RuleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getRuleAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1656:1: ( rule__PropertyDefinition__RuleAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1656:2: rule__PropertyDefinition__RuleAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__RuleAssignment_2_in_rule__PropertyDefinition__Group__2__Impl3396);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1666:1: rule__PropertyDefinition__Group__3 : rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 ;
    public final void rule__PropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1670:1: ( rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1671:2: rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__33426);
            rule__PropertyDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__33429);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1678:1: rule__PropertyDefinition__Group__3__Impl : ( ( rule__PropertyDefinition__Group_3__0 )? ) ;
    public final void rule__PropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1682:1: ( ( ( rule__PropertyDefinition__Group_3__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1683:1: ( ( rule__PropertyDefinition__Group_3__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1683:1: ( ( rule__PropertyDefinition__Group_3__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1684:1: ( rule__PropertyDefinition__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getGroup_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1685:1: ( rule__PropertyDefinition__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1685:2: rule__PropertyDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__0_in_rule__PropertyDefinition__Group__3__Impl3456);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1695:1: rule__PropertyDefinition__Group__4 : rule__PropertyDefinition__Group__4__Impl ;
    public final void rule__PropertyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1699:1: ( rule__PropertyDefinition__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1700:2: rule__PropertyDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__43487);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1706:1: rule__PropertyDefinition__Group__4__Impl : ( ';' ) ;
    public final void rule__PropertyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1710:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1711:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1711:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1712:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_4()); 
            }
            match(input,24,FOLLOW_24_in_rule__PropertyDefinition__Group__4__Impl3515); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1735:1: rule__PropertyDefinition__Group_3__0 : rule__PropertyDefinition__Group_3__0__Impl rule__PropertyDefinition__Group_3__1 ;
    public final void rule__PropertyDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1739:1: ( rule__PropertyDefinition__Group_3__0__Impl rule__PropertyDefinition__Group_3__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1740:2: rule__PropertyDefinition__Group_3__0__Impl rule__PropertyDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__0__Impl_in_rule__PropertyDefinition__Group_3__03556);
            rule__PropertyDefinition__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__1_in_rule__PropertyDefinition__Group_3__03559);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1747:1: rule__PropertyDefinition__Group_3__0__Impl : ( 'default:' ) ;
    public final void rule__PropertyDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1751:1: ( ( 'default:' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1752:1: ( 'default:' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1752:1: ( 'default:' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1753:1: 'default:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_3_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__PropertyDefinition__Group_3__0__Impl3587); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1766:1: rule__PropertyDefinition__Group_3__1 : rule__PropertyDefinition__Group_3__1__Impl ;
    public final void rule__PropertyDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1770:1: ( rule__PropertyDefinition__Group_3__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1771:2: rule__PropertyDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__1__Impl_in_rule__PropertyDefinition__Group_3__13618);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1777:1: rule__PropertyDefinition__Group_3__1__Impl : ( ( rule__PropertyDefinition__DefaultAssignment_3_1 ) ) ;
    public final void rule__PropertyDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1781:1: ( ( ( rule__PropertyDefinition__DefaultAssignment_3_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1782:1: ( ( rule__PropertyDefinition__DefaultAssignment_3_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1782:1: ( ( rule__PropertyDefinition__DefaultAssignment_3_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1783:1: ( rule__PropertyDefinition__DefaultAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultAssignment_3_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1784:1: ( rule__PropertyDefinition__DefaultAssignment_3_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1784:2: rule__PropertyDefinition__DefaultAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__DefaultAssignment_3_1_in_rule__PropertyDefinition__Group_3__1__Impl3645);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1798:1: rule__PseudoClassDefinition__Group__0 : rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1 ;
    public final void rule__PseudoClassDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1802:1: ( rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1803:2: rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__0__Impl_in_rule__PseudoClassDefinition__Group__03679);
            rule__PseudoClassDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__1_in_rule__PseudoClassDefinition__Group__03682);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1810:1: rule__PseudoClassDefinition__Group__0__Impl : ( ( rule__PseudoClassDefinition__DokuAssignment_0 )? ) ;
    public final void rule__PseudoClassDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1814:1: ( ( ( rule__PseudoClassDefinition__DokuAssignment_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1815:1: ( ( rule__PseudoClassDefinition__DokuAssignment_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1815:1: ( ( rule__PseudoClassDefinition__DokuAssignment_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1816:1: ( rule__PseudoClassDefinition__DokuAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getDokuAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1817:1: ( rule__PseudoClassDefinition__DokuAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_JDOC) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1817:2: rule__PseudoClassDefinition__DokuAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PseudoClassDefinition__DokuAssignment_0_in_rule__PseudoClassDefinition__Group__0__Impl3709);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1827:1: rule__PseudoClassDefinition__Group__1 : rule__PseudoClassDefinition__Group__1__Impl ;
    public final void rule__PseudoClassDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1831:1: ( rule__PseudoClassDefinition__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1832:2: rule__PseudoClassDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__1__Impl_in_rule__PseudoClassDefinition__Group__13740);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1838:1: rule__PseudoClassDefinition__Group__1__Impl : ( ( rule__PseudoClassDefinition__NameAssignment_1 ) ) ;
    public final void rule__PseudoClassDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1842:1: ( ( ( rule__PseudoClassDefinition__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1843:1: ( ( rule__PseudoClassDefinition__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1843:1: ( ( rule__PseudoClassDefinition__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1844:1: ( rule__PseudoClassDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1845:1: ( rule__PseudoClassDefinition__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1845:2: rule__PseudoClassDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__NameAssignment_1_in_rule__PseudoClassDefinition__Group__1__Impl3767);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1859:1: rule__CSSRuleRef__Group__0 : rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1 ;
    public final void rule__CSSRuleRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1863:1: ( rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1864:2: rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__0__Impl_in_rule__CSSRuleRef__Group__03801);
            rule__CSSRuleRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__1_in_rule__CSSRuleRef__Group__03804);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1871:1: rule__CSSRuleRef__Group__0__Impl : ( '<' ) ;
    public final void rule__CSSRuleRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1875:1: ( ( '<' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1876:1: ( '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1876:1: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1877:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__CSSRuleRef__Group__0__Impl3832); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1890:1: rule__CSSRuleRef__Group__1 : rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2 ;
    public final void rule__CSSRuleRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1894:1: ( rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1895:2: rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__1__Impl_in_rule__CSSRuleRef__Group__13863);
            rule__CSSRuleRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__2_in_rule__CSSRuleRef__Group__13866);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1902:1: rule__CSSRuleRef__Group__1__Impl : ( ( rule__CSSRuleRef__RefAssignment_1 ) ) ;
    public final void rule__CSSRuleRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1906:1: ( ( ( rule__CSSRuleRef__RefAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1907:1: ( ( rule__CSSRuleRef__RefAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1907:1: ( ( rule__CSSRuleRef__RefAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1908:1: ( rule__CSSRuleRef__RefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1909:1: ( rule__CSSRuleRef__RefAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1909:2: rule__CSSRuleRef__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__RefAssignment_1_in_rule__CSSRuleRef__Group__1__Impl3893);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1919:1: rule__CSSRuleRef__Group__2 : rule__CSSRuleRef__Group__2__Impl ;
    public final void rule__CSSRuleRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1923:1: ( rule__CSSRuleRef__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1924:2: rule__CSSRuleRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__2__Impl_in_rule__CSSRuleRef__Group__23923);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1930:1: rule__CSSRuleRef__Group__2__Impl : ( '>' ) ;
    public final void rule__CSSRuleRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1934:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1935:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1935:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1936:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getGreaterThanSignKeyword_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__CSSRuleRef__Group__2__Impl3951); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1955:1: rule__CSSRuleDefinition__Group__0 : rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1 ;
    public final void rule__CSSRuleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1959:1: ( rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1960:2: rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__0__Impl_in_rule__CSSRuleDefinition__Group__03988);
            rule__CSSRuleDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__1_in_rule__CSSRuleDefinition__Group__03991);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1967:1: rule__CSSRuleDefinition__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1971:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1972:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1972:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1973:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getCSSRuleDefinitionAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1974:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1976:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1986:1: rule__CSSRuleDefinition__Group__1 : rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2 ;
    public final void rule__CSSRuleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1990:1: ( rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1991:2: rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__1__Impl_in_rule__CSSRuleDefinition__Group__14049);
            rule__CSSRuleDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__2_in_rule__CSSRuleDefinition__Group__14052);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1998:1: rule__CSSRuleDefinition__Group__1__Impl : ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? ) ;
    public final void rule__CSSRuleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2002:1: ( ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2003:1: ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2003:1: ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2004:1: ( rule__CSSRuleDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getDokuAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2005:1: ( rule__CSSRuleDefinition__DokuAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_JDOC) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2005:2: rule__CSSRuleDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CSSRuleDefinition__DokuAssignment_1_in_rule__CSSRuleDefinition__Group__1__Impl4079);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2015:1: rule__CSSRuleDefinition__Group__2 : rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3 ;
    public final void rule__CSSRuleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2019:1: ( rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2020:2: rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__2__Impl_in_rule__CSSRuleDefinition__Group__24110);
            rule__CSSRuleDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__3_in_rule__CSSRuleDefinition__Group__24113);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2027:1: rule__CSSRuleDefinition__Group__2__Impl : ( ( rule__CSSRuleDefinition__NameAssignment_2 ) ) ;
    public final void rule__CSSRuleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2031:1: ( ( ( rule__CSSRuleDefinition__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2032:1: ( ( rule__CSSRuleDefinition__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2032:1: ( ( rule__CSSRuleDefinition__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2033:1: ( rule__CSSRuleDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2034:1: ( rule__CSSRuleDefinition__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2034:2: rule__CSSRuleDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__NameAssignment_2_in_rule__CSSRuleDefinition__Group__2__Impl4140);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2044:1: rule__CSSRuleDefinition__Group__3 : rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4 ;
    public final void rule__CSSRuleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2048:1: ( rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2049:2: rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__3__Impl_in_rule__CSSRuleDefinition__Group__34170);
            rule__CSSRuleDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__4_in_rule__CSSRuleDefinition__Group__34173);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2056:1: rule__CSSRuleDefinition__Group__3__Impl : ( '=' ) ;
    public final void rule__CSSRuleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2060:1: ( ( '=' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2061:1: ( '=' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2061:1: ( '=' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2062:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__CSSRuleDefinition__Group__3__Impl4201); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2075:1: rule__CSSRuleDefinition__Group__4 : rule__CSSRuleDefinition__Group__4__Impl rule__CSSRuleDefinition__Group__5 ;
    public final void rule__CSSRuleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2079:1: ( rule__CSSRuleDefinition__Group__4__Impl rule__CSSRuleDefinition__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2080:2: rule__CSSRuleDefinition__Group__4__Impl rule__CSSRuleDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__4__Impl_in_rule__CSSRuleDefinition__Group__44232);
            rule__CSSRuleDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__5_in_rule__CSSRuleDefinition__Group__44235);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2087:1: rule__CSSRuleDefinition__Group__4__Impl : ( ( rule__CSSRuleDefinition__RAssignment_4 ) ) ;
    public final void rule__CSSRuleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2091:1: ( ( ( rule__CSSRuleDefinition__RAssignment_4 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2092:1: ( ( rule__CSSRuleDefinition__RAssignment_4 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2092:1: ( ( rule__CSSRuleDefinition__RAssignment_4 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2093:1: ( rule__CSSRuleDefinition__RAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getRAssignment_4()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2094:1: ( rule__CSSRuleDefinition__RAssignment_4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2094:2: rule__CSSRuleDefinition__RAssignment_4
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__RAssignment_4_in_rule__CSSRuleDefinition__Group__4__Impl4262);
            rule__CSSRuleDefinition__RAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getRAssignment_4()); 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2104:1: rule__CSSRuleDefinition__Group__5 : rule__CSSRuleDefinition__Group__5__Impl ;
    public final void rule__CSSRuleDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2108:1: ( rule__CSSRuleDefinition__Group__5__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2109:2: rule__CSSRuleDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__5__Impl_in_rule__CSSRuleDefinition__Group__54292);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2115:1: rule__CSSRuleDefinition__Group__5__Impl : ( ';' ) ;
    public final void rule__CSSRuleDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2119:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2120:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2120:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2121:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_5()); 
            }
            match(input,24,FOLLOW_24_in_rule__CSSRuleDefinition__Group__5__Impl4320); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2146:1: rule__CSSRuleOr__Group__0 : rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1 ;
    public final void rule__CSSRuleOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2150:1: ( rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2151:2: rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__0__Impl_in_rule__CSSRuleOr__Group__04363);
            rule__CSSRuleOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__1_in_rule__CSSRuleOr__Group__04366);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2158:1: rule__CSSRuleOr__Group__0__Impl : ( ruleCSSRuleXor ) ;
    public final void rule__CSSRuleOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2162:1: ( ( ruleCSSRuleXor ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2163:1: ( ruleCSSRuleXor )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2163:1: ( ruleCSSRuleXor )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2164:1: ruleCSSRuleXor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getCSSRuleXorParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__Group__0__Impl4393);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2175:1: rule__CSSRuleOr__Group__1 : rule__CSSRuleOr__Group__1__Impl ;
    public final void rule__CSSRuleOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2179:1: ( rule__CSSRuleOr__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2180:2: rule__CSSRuleOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__1__Impl_in_rule__CSSRuleOr__Group__14422);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2186:1: rule__CSSRuleOr__Group__1__Impl : ( ( rule__CSSRuleOr__Group_1__0 )? ) ;
    public final void rule__CSSRuleOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2190:1: ( ( ( rule__CSSRuleOr__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2191:1: ( ( rule__CSSRuleOr__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2191:1: ( ( rule__CSSRuleOr__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2192:1: ( rule__CSSRuleOr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2193:1: ( rule__CSSRuleOr__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2193:2: rule__CSSRuleOr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__0_in_rule__CSSRuleOr__Group__1__Impl4449);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2207:1: rule__CSSRuleOr__Group_1__0 : rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1 ;
    public final void rule__CSSRuleOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2211:1: ( rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2212:2: rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__0__Impl_in_rule__CSSRuleOr__Group_1__04484);
            rule__CSSRuleOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__1_in_rule__CSSRuleOr__Group_1__04487);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2219:1: rule__CSSRuleOr__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2223:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2224:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2224:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2225:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getCSSRuleOrOrsAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2226:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2228:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2238:1: rule__CSSRuleOr__Group_1__1 : rule__CSSRuleOr__Group_1__1__Impl ;
    public final void rule__CSSRuleOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2242:1: ( rule__CSSRuleOr__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2243:2: rule__CSSRuleOr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__1__Impl_in_rule__CSSRuleOr__Group_1__14545);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2249:1: rule__CSSRuleOr__Group_1__1__Impl : ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) ) ;
    public final void rule__CSSRuleOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2253:1: ( ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2254:1: ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2254:1: ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2255:1: ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2255:1: ( ( rule__CSSRuleOr__Group_1_1__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2256:1: ( rule__CSSRuleOr__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2257:1: ( rule__CSSRuleOr__Group_1_1__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2257:2: rule__CSSRuleOr__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl4574);
            rule__CSSRuleOr__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2260:1: ( ( rule__CSSRuleOr__Group_1_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2261:1: ( rule__CSSRuleOr__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2262:1: ( rule__CSSRuleOr__Group_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2262:2: rule__CSSRuleOr__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl4586);
            	    rule__CSSRuleOr__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2277:1: rule__CSSRuleOr__Group_1_1__0 : rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1 ;
    public final void rule__CSSRuleOr__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2281:1: ( rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2282:2: rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__0__Impl_in_rule__CSSRuleOr__Group_1_1__04623);
            rule__CSSRuleOr__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__1_in_rule__CSSRuleOr__Group_1_1__04626);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2289:1: rule__CSSRuleOr__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__CSSRuleOr__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2293:1: ( ( '|' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2294:1: ( '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2294:1: ( '|' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2295:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getVerticalLineKeyword_1_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__CSSRuleOr__Group_1_1__0__Impl4654); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2308:1: rule__CSSRuleOr__Group_1_1__1 : rule__CSSRuleOr__Group_1_1__1__Impl ;
    public final void rule__CSSRuleOr__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2312:1: ( rule__CSSRuleOr__Group_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2313:2: rule__CSSRuleOr__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__1__Impl_in_rule__CSSRuleOr__Group_1_1__14685);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2319:1: rule__CSSRuleOr__Group_1_1__1__Impl : ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) ) ;
    public final void rule__CSSRuleOr__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2323:1: ( ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2324:1: ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2324:1: ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2325:1: ( rule__CSSRuleOr__OrsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getOrsAssignment_1_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2326:1: ( rule__CSSRuleOr__OrsAssignment_1_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2326:2: rule__CSSRuleOr__OrsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__OrsAssignment_1_1_1_in_rule__CSSRuleOr__Group_1_1__1__Impl4712);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2340:1: rule__CSSRuleXor__Group__0 : rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1 ;
    public final void rule__CSSRuleXor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2344:1: ( rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2345:2: rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__0__Impl_in_rule__CSSRuleXor__Group__04746);
            rule__CSSRuleXor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__1_in_rule__CSSRuleXor__Group__04749);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2352:1: rule__CSSRuleXor__Group__0__Impl : ( ruleCSSRuleConcat ) ;
    public final void rule__CSSRuleXor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2356:1: ( ( ruleCSSRuleConcat ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2357:1: ( ruleCSSRuleConcat )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2357:1: ( ruleCSSRuleConcat )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2358:1: ruleCSSRuleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getCSSRuleConcatParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__Group__0__Impl4776);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2369:1: rule__CSSRuleXor__Group__1 : rule__CSSRuleXor__Group__1__Impl ;
    public final void rule__CSSRuleXor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2373:1: ( rule__CSSRuleXor__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2374:2: rule__CSSRuleXor__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__1__Impl_in_rule__CSSRuleXor__Group__14805);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2380:1: rule__CSSRuleXor__Group__1__Impl : ( ( rule__CSSRuleXor__Group_1__0 )? ) ;
    public final void rule__CSSRuleXor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2384:1: ( ( ( rule__CSSRuleXor__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2385:1: ( ( rule__CSSRuleXor__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2385:1: ( ( rule__CSSRuleXor__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2386:1: ( rule__CSSRuleXor__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2387:1: ( rule__CSSRuleXor__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2387:2: rule__CSSRuleXor__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__0_in_rule__CSSRuleXor__Group__1__Impl4832);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2401:1: rule__CSSRuleXor__Group_1__0 : rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1 ;
    public final void rule__CSSRuleXor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2405:1: ( rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2406:2: rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__0__Impl_in_rule__CSSRuleXor__Group_1__04867);
            rule__CSSRuleXor__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__1_in_rule__CSSRuleXor__Group_1__04870);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2413:1: rule__CSSRuleXor__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleXor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2417:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2418:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2418:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2419:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getCSSRuleXorXorsAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2420:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2422:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2432:1: rule__CSSRuleXor__Group_1__1 : rule__CSSRuleXor__Group_1__1__Impl ;
    public final void rule__CSSRuleXor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2436:1: ( rule__CSSRuleXor__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2437:2: rule__CSSRuleXor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__1__Impl_in_rule__CSSRuleXor__Group_1__14928);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2443:1: rule__CSSRuleXor__Group_1__1__Impl : ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) ) ;
    public final void rule__CSSRuleXor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2447:1: ( ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2448:1: ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2448:1: ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2449:1: ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2449:1: ( ( rule__CSSRuleXor__Group_1_1__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2450:1: ( rule__CSSRuleXor__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2451:1: ( rule__CSSRuleXor__Group_1_1__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2451:2: rule__CSSRuleXor__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl4957);
            rule__CSSRuleXor__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2454:1: ( ( rule__CSSRuleXor__Group_1_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2455:1: ( rule__CSSRuleXor__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2456:1: ( rule__CSSRuleXor__Group_1_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2456:2: rule__CSSRuleXor__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl4969);
            	    rule__CSSRuleXor__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2471:1: rule__CSSRuleXor__Group_1_1__0 : rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1 ;
    public final void rule__CSSRuleXor__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2475:1: ( rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2476:2: rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__0__Impl_in_rule__CSSRuleXor__Group_1_1__05006);
            rule__CSSRuleXor__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__1_in_rule__CSSRuleXor__Group_1_1__05009);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2483:1: rule__CSSRuleXor__Group_1_1__0__Impl : ( '||' ) ;
    public final void rule__CSSRuleXor__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2487:1: ( ( '||' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2488:1: ( '||' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2488:1: ( '||' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2489:1: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__CSSRuleXor__Group_1_1__0__Impl5037); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2502:1: rule__CSSRuleXor__Group_1_1__1 : rule__CSSRuleXor__Group_1_1__1__Impl ;
    public final void rule__CSSRuleXor__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2506:1: ( rule__CSSRuleXor__Group_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2507:2: rule__CSSRuleXor__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__1__Impl_in_rule__CSSRuleXor__Group_1_1__15068);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2513:1: rule__CSSRuleXor__Group_1_1__1__Impl : ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) ) ;
    public final void rule__CSSRuleXor__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2517:1: ( ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2518:1: ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2518:1: ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2519:1: ( rule__CSSRuleXor__XorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getXorsAssignment_1_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2520:1: ( rule__CSSRuleXor__XorsAssignment_1_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2520:2: rule__CSSRuleXor__XorsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__XorsAssignment_1_1_1_in_rule__CSSRuleXor__Group_1_1__1__Impl5095);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2534:1: rule__CSSRuleConcat__Group__0 : rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1 ;
    public final void rule__CSSRuleConcat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2538:1: ( rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2539:2: rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__0__Impl_in_rule__CSSRuleConcat__Group__05129);
            rule__CSSRuleConcat__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__1_in_rule__CSSRuleConcat__Group__05132);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2546:1: rule__CSSRuleConcat__Group__0__Impl : ( ruleCSSRulePostfix ) ;
    public final void rule__CSSRuleConcat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2550:1: ( ( ruleCSSRulePostfix ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2551:1: ( ruleCSSRulePostfix )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2551:1: ( ruleCSSRulePostfix )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2552:1: ruleCSSRulePostfix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getCSSRulePostfixParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__Group__0__Impl5159);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2563:1: rule__CSSRuleConcat__Group__1 : rule__CSSRuleConcat__Group__1__Impl ;
    public final void rule__CSSRuleConcat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2567:1: ( rule__CSSRuleConcat__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2568:2: rule__CSSRuleConcat__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__1__Impl_in_rule__CSSRuleConcat__Group__15188);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2574:1: rule__CSSRuleConcat__Group__1__Impl : ( ( rule__CSSRuleConcat__Group_1__0 )? ) ;
    public final void rule__CSSRuleConcat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2578:1: ( ( ( rule__CSSRuleConcat__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2579:1: ( ( rule__CSSRuleConcat__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2579:1: ( ( rule__CSSRuleConcat__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2580:1: ( rule__CSSRuleConcat__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2581:1: ( rule__CSSRuleConcat__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||(LA23_0>=13 && LA23_0<=15)||LA23_0==26||LA23_0==31||LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2581:2: rule__CSSRuleConcat__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__0_in_rule__CSSRuleConcat__Group__1__Impl5215);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2595:1: rule__CSSRuleConcat__Group_1__0 : rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1 ;
    public final void rule__CSSRuleConcat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2599:1: ( rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2600:2: rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__0__Impl_in_rule__CSSRuleConcat__Group_1__05250);
            rule__CSSRuleConcat__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__1_in_rule__CSSRuleConcat__Group_1__05253);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2607:1: rule__CSSRuleConcat__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleConcat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2611:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2612:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2612:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2613:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatConcAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2614:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2616:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2626:1: rule__CSSRuleConcat__Group_1__1 : rule__CSSRuleConcat__Group_1__1__Impl ;
    public final void rule__CSSRuleConcat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2630:1: ( rule__CSSRuleConcat__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2631:2: rule__CSSRuleConcat__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__1__Impl_in_rule__CSSRuleConcat__Group_1__15311);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2637:1: rule__CSSRuleConcat__Group_1__1__Impl : ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) ) ;
    public final void rule__CSSRuleConcat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2641:1: ( ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2642:1: ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2642:1: ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2643:1: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2643:1: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2644:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2645:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2645:2: rule__CSSRuleConcat__ConcAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl5340);
            rule__CSSRuleConcat__ConcAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2648:1: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2649:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2650:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||(LA24_0>=13 && LA24_0<=15)||LA24_0==26||LA24_0==31||LA24_0==33) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2650:2: rule__CSSRuleConcat__ConcAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl5352);
            	    rule__CSSRuleConcat__ConcAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2665:1: rule__CSSRulePostfix__Group__0 : rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1 ;
    public final void rule__CSSRulePostfix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2669:1: ( rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2670:2: rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__0__Impl_in_rule__CSSRulePostfix__Group__05389);
            rule__CSSRulePostfix__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__1_in_rule__CSSRulePostfix__Group__05392);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2677:1: rule__CSSRulePostfix__Group__0__Impl : ( ruleCSSRulePrimary ) ;
    public final void rule__CSSRulePostfix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2681:1: ( ( ruleCSSRulePrimary ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2682:1: ( ruleCSSRulePrimary )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2682:1: ( ruleCSSRulePrimary )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2683:1: ruleCSSRulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCSSRulePrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_rule__CSSRulePostfix__Group__0__Impl5419);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2694:1: rule__CSSRulePostfix__Group__1 : rule__CSSRulePostfix__Group__1__Impl ;
    public final void rule__CSSRulePostfix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2698:1: ( rule__CSSRulePostfix__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2699:2: rule__CSSRulePostfix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__1__Impl_in_rule__CSSRulePostfix__Group__15448);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2705:1: rule__CSSRulePostfix__Group__1__Impl : ( ( rule__CSSRulePostfix__Group_1__0 )? ) ;
    public final void rule__CSSRulePostfix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2709:1: ( ( ( rule__CSSRulePostfix__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2710:1: ( ( rule__CSSRulePostfix__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2710:1: ( ( rule__CSSRulePostfix__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2711:1: ( rule__CSSRulePostfix__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2712:1: ( rule__CSSRulePostfix__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=16 && LA25_0<=18)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2712:2: rule__CSSRulePostfix__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__0_in_rule__CSSRulePostfix__Group__1__Impl5475);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2726:1: rule__CSSRulePostfix__Group_1__0 : rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1 ;
    public final void rule__CSSRulePostfix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2730:1: ( rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2731:2: rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__0__Impl_in_rule__CSSRulePostfix__Group_1__05510);
            rule__CSSRulePostfix__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__1_in_rule__CSSRulePostfix__Group_1__05513);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2738:1: rule__CSSRulePostfix__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRulePostfix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2742:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2743:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2743:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2744:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCSSRulePostfixRuleAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2745:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2747:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2757:1: rule__CSSRulePostfix__Group_1__1 : rule__CSSRulePostfix__Group_1__1__Impl ;
    public final void rule__CSSRulePostfix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2761:1: ( rule__CSSRulePostfix__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2762:2: rule__CSSRulePostfix__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__1__Impl_in_rule__CSSRulePostfix__Group_1__15571);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2768:1: rule__CSSRulePostfix__Group_1__1__Impl : ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) ) ;
    public final void rule__CSSRulePostfix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2772:1: ( ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2773:1: ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2773:1: ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2774:1: ( rule__CSSRulePostfix__CardinalityAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2775:1: ( rule__CSSRulePostfix__CardinalityAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2775:2: rule__CSSRulePostfix__CardinalityAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__CardinalityAssignment_1_1_in_rule__CSSRulePostfix__Group_1__1__Impl5598);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2789:1: rule__CSSRuleBracket__Group__0 : rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1 ;
    public final void rule__CSSRuleBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2793:1: ( rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2794:2: rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__0__Impl_in_rule__CSSRuleBracket__Group__05632);
            rule__CSSRuleBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__1_in_rule__CSSRuleBracket__Group__05635);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2801:1: rule__CSSRuleBracket__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2805:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2806:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2806:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2807:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getCSSRuleBracketAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2808:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2810:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2820:1: rule__CSSRuleBracket__Group__1 : rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2 ;
    public final void rule__CSSRuleBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2824:1: ( rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2825:2: rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__1__Impl_in_rule__CSSRuleBracket__Group__15693);
            rule__CSSRuleBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__2_in_rule__CSSRuleBracket__Group__15696);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2832:1: rule__CSSRuleBracket__Group__1__Impl : ( '[' ) ;
    public final void rule__CSSRuleBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2836:1: ( ( '[' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2837:1: ( '[' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2837:1: ( '[' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2838:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__CSSRuleBracket__Group__1__Impl5724); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2851:1: rule__CSSRuleBracket__Group__2 : rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3 ;
    public final void rule__CSSRuleBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2855:1: ( rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2856:2: rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__2__Impl_in_rule__CSSRuleBracket__Group__25755);
            rule__CSSRuleBracket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__3_in_rule__CSSRuleBracket__Group__25758);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2863:1: rule__CSSRuleBracket__Group__2__Impl : ( ( rule__CSSRuleBracket__InnerAssignment_2 ) ) ;
    public final void rule__CSSRuleBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2867:1: ( ( ( rule__CSSRuleBracket__InnerAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2868:1: ( ( rule__CSSRuleBracket__InnerAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2868:1: ( ( rule__CSSRuleBracket__InnerAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2869:1: ( rule__CSSRuleBracket__InnerAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getInnerAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2870:1: ( rule__CSSRuleBracket__InnerAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2870:2: rule__CSSRuleBracket__InnerAssignment_2
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__InnerAssignment_2_in_rule__CSSRuleBracket__Group__2__Impl5785);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2880:1: rule__CSSRuleBracket__Group__3 : rule__CSSRuleBracket__Group__3__Impl ;
    public final void rule__CSSRuleBracket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2884:1: ( rule__CSSRuleBracket__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2885:2: rule__CSSRuleBracket__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__3__Impl_in_rule__CSSRuleBracket__Group__35815);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2891:1: rule__CSSRuleBracket__Group__3__Impl : ( ']' ) ;
    public final void rule__CSSRuleBracket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2895:1: ( ( ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2896:1: ( ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2896:1: ( ']' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2897:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__CSSRuleBracket__Group__3__Impl5843); if (state.failed) return ;
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


    // $ANTLR start "rule__CSSRuleLiteral__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2918:1: rule__CSSRuleLiteral__Group_0__0 : rule__CSSRuleLiteral__Group_0__0__Impl rule__CSSRuleLiteral__Group_0__1 ;
    public final void rule__CSSRuleLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2922:1: ( rule__CSSRuleLiteral__Group_0__0__Impl rule__CSSRuleLiteral__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2923:2: rule__CSSRuleLiteral__Group_0__0__Impl rule__CSSRuleLiteral__Group_0__1
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Group_0__0__Impl_in_rule__CSSRuleLiteral__Group_0__05882);
            rule__CSSRuleLiteral__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Group_0__1_in_rule__CSSRuleLiteral__Group_0__05885);
            rule__CSSRuleLiteral__Group_0__1();

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
    // $ANTLR end "rule__CSSRuleLiteral__Group_0__0"


    // $ANTLR start "rule__CSSRuleLiteral__Group_0__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2930:1: rule__CSSRuleLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__CSSRuleLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2934:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2935:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2935:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2936:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2937:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2939:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__Group_0__0__Impl"


    // $ANTLR start "rule__CSSRuleLiteral__Group_0__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2949:1: rule__CSSRuleLiteral__Group_0__1 : rule__CSSRuleLiteral__Group_0__1__Impl ;
    public final void rule__CSSRuleLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2953:1: ( rule__CSSRuleLiteral__Group_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2954:2: rule__CSSRuleLiteral__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Group_0__1__Impl_in_rule__CSSRuleLiteral__Group_0__15943);
            rule__CSSRuleLiteral__Group_0__1__Impl();

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
    // $ANTLR end "rule__CSSRuleLiteral__Group_0__1"


    // $ANTLR start "rule__CSSRuleLiteral__Group_0__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2960:1: rule__CSSRuleLiteral__Group_0__1__Impl : ( ( rule__CSSRuleLiteral__ValueAssignment_0_1 ) ) ;
    public final void rule__CSSRuleLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2964:1: ( ( ( rule__CSSRuleLiteral__ValueAssignment_0_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2965:1: ( ( rule__CSSRuleLiteral__ValueAssignment_0_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2965:1: ( ( rule__CSSRuleLiteral__ValueAssignment_0_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2966:1: ( rule__CSSRuleLiteral__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getValueAssignment_0_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2967:1: ( rule__CSSRuleLiteral__ValueAssignment_0_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2967:2: rule__CSSRuleLiteral__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__ValueAssignment_0_1_in_rule__CSSRuleLiteral__Group_0__1__Impl5970);
            rule__CSSRuleLiteral__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getValueAssignment_0_1()); 
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
    // $ANTLR end "rule__CSSRuleLiteral__Group_0__1__Impl"


    // $ANTLR start "rule__CSSDefaultValue__Group_2__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2981:1: rule__CSSDefaultValue__Group_2__0 : rule__CSSDefaultValue__Group_2__0__Impl rule__CSSDefaultValue__Group_2__1 ;
    public final void rule__CSSDefaultValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2985:1: ( rule__CSSDefaultValue__Group_2__0__Impl rule__CSSDefaultValue__Group_2__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2986:2: rule__CSSDefaultValue__Group_2__0__Impl rule__CSSDefaultValue__Group_2__1
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__Group_2__0__Impl_in_rule__CSSDefaultValue__Group_2__06004);
            rule__CSSDefaultValue__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSDefaultValue__Group_2__1_in_rule__CSSDefaultValue__Group_2__06007);
            rule__CSSDefaultValue__Group_2__1();

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
    // $ANTLR end "rule__CSSDefaultValue__Group_2__0"


    // $ANTLR start "rule__CSSDefaultValue__Group_2__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2993:1: rule__CSSDefaultValue__Group_2__0__Impl : ( ( RULE_INT )* ) ;
    public final void rule__CSSDefaultValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2997:1: ( ( ( RULE_INT )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2998:1: ( ( RULE_INT )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2998:1: ( ( RULE_INT )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2999:1: ( RULE_INT )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getINTTerminalRuleCall_2_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3000:1: ( RULE_INT )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_INT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3000:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CSSDefaultValue__Group_2__0__Impl6035); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getINTTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__CSSDefaultValue__Group_2__0__Impl"


    // $ANTLR start "rule__CSSDefaultValue__Group_2__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3010:1: rule__CSSDefaultValue__Group_2__1 : rule__CSSDefaultValue__Group_2__1__Impl rule__CSSDefaultValue__Group_2__2 ;
    public final void rule__CSSDefaultValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3014:1: ( rule__CSSDefaultValue__Group_2__1__Impl rule__CSSDefaultValue__Group_2__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3015:2: rule__CSSDefaultValue__Group_2__1__Impl rule__CSSDefaultValue__Group_2__2
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__Group_2__1__Impl_in_rule__CSSDefaultValue__Group_2__16066);
            rule__CSSDefaultValue__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSDefaultValue__Group_2__2_in_rule__CSSDefaultValue__Group_2__16069);
            rule__CSSDefaultValue__Group_2__2();

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
    // $ANTLR end "rule__CSSDefaultValue__Group_2__1"


    // $ANTLR start "rule__CSSDefaultValue__Group_2__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3022:1: rule__CSSDefaultValue__Group_2__1__Impl : ( '.' ) ;
    public final void rule__CSSDefaultValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3026:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3027:1: ( '.' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3027:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3028:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getFullStopKeyword_2_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__CSSDefaultValue__Group_2__1__Impl6097); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getFullStopKeyword_2_1()); 
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
    // $ANTLR end "rule__CSSDefaultValue__Group_2__1__Impl"


    // $ANTLR start "rule__CSSDefaultValue__Group_2__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3041:1: rule__CSSDefaultValue__Group_2__2 : rule__CSSDefaultValue__Group_2__2__Impl ;
    public final void rule__CSSDefaultValue__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3045:1: ( rule__CSSDefaultValue__Group_2__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3046:2: rule__CSSDefaultValue__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__Group_2__2__Impl_in_rule__CSSDefaultValue__Group_2__26128);
            rule__CSSDefaultValue__Group_2__2__Impl();

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
    // $ANTLR end "rule__CSSDefaultValue__Group_2__2"


    // $ANTLR start "rule__CSSDefaultValue__Group_2__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3052:1: rule__CSSDefaultValue__Group_2__2__Impl : ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) ;
    public final void rule__CSSDefaultValue__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3056:1: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3057:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3057:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3058:1: ( ( RULE_INT ) ) ( ( RULE_INT )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3058:1: ( ( RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3059:1: ( RULE_INT )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getINTTerminalRuleCall_2_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3060:1: ( RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3060:3: RULE_INT
            {
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CSSDefaultValue__Group_2__2__Impl6158); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getINTTerminalRuleCall_2_2()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3063:1: ( ( RULE_INT )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3064:1: ( RULE_INT )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getINTTerminalRuleCall_2_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3065:1: ( RULE_INT )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_INT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3065:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CSSDefaultValue__Group_2__2__Impl6171); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getINTTerminalRuleCall_2_2()); 
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
    // $ANTLR end "rule__CSSDefaultValue__Group_2__2__Impl"


    // $ANTLR start "rule__CssExtension__ImportsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3083:1: rule__CssExtension__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__CssExtension__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3087:1: ( ( ruleImport ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3088:1: ( ruleImport )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3088:1: ( ruleImport )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3089:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__CssExtension__ImportsAssignment_06215);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3098:1: rule__CssExtension__PackageDefAssignment_1 : ( rulePackageDefinition ) ;
    public final void rule__CssExtension__PackageDefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3102:1: ( ( rulePackageDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3103:1: ( rulePackageDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3103:1: ( rulePackageDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3104:1: rulePackageDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getPackageDefPackageDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePackageDefinition_in_rule__CssExtension__PackageDefAssignment_16246);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3113:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3117:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3118:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3118:1: ( ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3119:1: ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_16277);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3128:1: rule__PackageDefinition__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3132:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3133:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3133:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3134:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDefinition__NameAssignment_16308);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3143:1: rule__PackageDefinition__RulesAssignment_3_0 : ( ruleCSSRuleDefinition ) ;
    public final void rule__PackageDefinition__RulesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3147:1: ( ( ruleCSSRuleDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3148:1: ( ruleCSSRuleDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3148:1: ( ruleCSSRuleDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3149:1: ruleCSSRuleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getRulesCSSRuleDefinitionParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleDefinition_in_rule__PackageDefinition__RulesAssignment_3_06339);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3158:1: rule__PackageDefinition__SubpackagesAssignment_3_1 : ( rulePackageDefinition ) ;
    public final void rule__PackageDefinition__SubpackagesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3162:1: ( ( rulePackageDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3163:1: ( rulePackageDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3163:1: ( rulePackageDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3164:1: rulePackageDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getSubpackagesPackageDefinitionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_rulePackageDefinition_in_rule__PackageDefinition__SubpackagesAssignment_3_16370);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3173:1: rule__PackageDefinition__ElementsAssignment_3_2 : ( ruleElementDeclartion ) ;
    public final void rule__PackageDefinition__ElementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3177:1: ( ( ruleElementDeclartion ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3178:1: ( ruleElementDeclartion )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3178:1: ( ruleElementDeclartion )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3179:1: ruleElementDeclartion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getElementsElementDeclartionParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleElementDeclartion_in_rule__PackageDefinition__ElementsAssignment_3_26401);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3188:1: rule__Doku__ContentAssignment : ( RULE_JDOC ) ;
    public final void rule__Doku__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3192:1: ( ( RULE_JDOC ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3193:1: ( RULE_JDOC )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3193:1: ( RULE_JDOC )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3194:1: RULE_JDOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDokuAccess().getContentJDOCTerminalRuleCall_0()); 
            }
            match(input,RULE_JDOC,FOLLOW_RULE_JDOC_in_rule__Doku__ContentAssignment6432); if (state.failed) return ;
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


    // $ANTLR start "rule__ElementDeclartion__DokuAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3203:1: rule__ElementDeclartion__DokuAssignment_0 : ( ruleDoku ) ;
    public final void rule__ElementDeclartion__DokuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3207:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3208:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3208:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3209:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getDokuDokuParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__ElementDeclartion__DokuAssignment_06463);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3218:1: rule__ElementDeclartion__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ElementDeclartion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3222:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3223:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3223:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3224:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ElementDeclartion__NameAssignment_16494);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3233:1: rule__ElementDeclartion__PropertiesAssignment_3_0 : ( rulePropertyDefinition ) ;
    public final void rule__ElementDeclartion__PropertiesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3237:1: ( ( rulePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3238:1: ( rulePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3238:1: ( rulePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3239:1: rulePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getPropertiesPropertyDefinitionParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_rulePropertyDefinition_in_rule__ElementDeclartion__PropertiesAssignment_3_06525);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3248:1: rule__ElementDeclartion__PseudoClassesAssignment_3_1 : ( rulePseudoClassDefinition ) ;
    public final void rule__ElementDeclartion__PseudoClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3252:1: ( ( rulePseudoClassDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3253:1: ( rulePseudoClassDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3253:1: ( rulePseudoClassDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3254:1: rulePseudoClassDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDeclartionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_rulePseudoClassDefinition_in_rule__ElementDeclartion__PseudoClassesAssignment_3_16556);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3263:1: rule__PropertyDefinition__DokuAssignment_0 : ( ruleDoku ) ;
    public final void rule__PropertyDefinition__DokuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3267:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3268:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3268:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3269:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__PropertyDefinition__DokuAssignment_06587);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3278:1: rule__PropertyDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PropertyDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3282:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3283:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3283:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3284:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyDefinition__NameAssignment_16618); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3293:1: rule__PropertyDefinition__RuleAssignment_2 : ( ruleCSSRuleOr ) ;
    public final void rule__PropertyDefinition__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3297:1: ( ( ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3298:1: ( ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3298:1: ( ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3299:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rule__PropertyDefinition__RuleAssignment_26649);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3308:1: rule__PropertyDefinition__DefaultAssignment_3_1 : ( ruleCSSDefaultValue ) ;
    public final void rule__PropertyDefinition__DefaultAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3312:1: ( ( ruleCSSDefaultValue ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3313:1: ( ruleCSSDefaultValue )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3313:1: ( ruleCSSDefaultValue )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3314:1: ruleCSSDefaultValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSDefaultValue_in_rule__PropertyDefinition__DefaultAssignment_3_16680);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3323:1: rule__PseudoClassDefinition__DokuAssignment_0 : ( ruleDoku ) ;
    public final void rule__PseudoClassDefinition__DokuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3327:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3328:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3328:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3329:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__PseudoClassDefinition__DokuAssignment_06711);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3338:1: rule__PseudoClassDefinition__NameAssignment_1 : ( RULE_PSEUDO ) ;
    public final void rule__PseudoClassDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3342:1: ( ( RULE_PSEUDO ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3343:1: ( RULE_PSEUDO )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3343:1: ( RULE_PSEUDO )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3344:1: RULE_PSEUDO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_1_0()); 
            }
            match(input,RULE_PSEUDO,FOLLOW_RULE_PSEUDO_in_rule__PseudoClassDefinition__NameAssignment_16742); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3353:1: rule__CSSRuleId__NameAssignment : ( ruleQualifiedName ) ;
    public final void rule__CSSRuleId__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3357:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3358:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3358:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3359:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleIdAccess().getNameQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CSSRuleId__NameAssignment6773);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3368:1: rule__CSSRuleRef__RefAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CSSRuleRef__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3372:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3373:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3373:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3374:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdCrossReference_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3375:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3376:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CSSRuleRef__RefAssignment_16808);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3387:1: rule__CSSRuleDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__CSSRuleDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3391:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3392:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3392:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3393:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__CSSRuleDefinition__DokuAssignment_16843);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3402:1: rule__CSSRuleDefinition__NameAssignment_2 : ( ruleCSSRuleId ) ;
    public final void rule__CSSRuleDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3406:1: ( ( ruleCSSRuleId ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3407:1: ( ruleCSSRuleId )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3407:1: ( ruleCSSRuleId )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3408:1: ruleCSSRuleId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getNameCSSRuleIdParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleId_in_rule__CSSRuleDefinition__NameAssignment_26874);
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


    // $ANTLR start "rule__CSSRuleDefinition__RAssignment_4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3417:1: rule__CSSRuleDefinition__RAssignment_4 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleDefinition__RAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3421:1: ( ( ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3422:1: ( ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3422:1: ( ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3423:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getRCSSRuleOrParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleDefinition__RAssignment_46905);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getRCSSRuleOrParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__RAssignment_4"


    // $ANTLR start "rule__CSSRuleOr__OrsAssignment_1_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3432:1: rule__CSSRuleOr__OrsAssignment_1_1_1 : ( ruleCSSRuleXor ) ;
    public final void rule__CSSRuleOr__OrsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3436:1: ( ( ruleCSSRuleXor ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3437:1: ( ruleCSSRuleXor )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3437:1: ( ruleCSSRuleXor )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3438:1: ruleCSSRuleXor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getOrsCSSRuleXorParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__OrsAssignment_1_1_16936);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3447:1: rule__CSSRuleXor__XorsAssignment_1_1_1 : ( ruleCSSRuleConcat ) ;
    public final void rule__CSSRuleXor__XorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3451:1: ( ( ruleCSSRuleConcat ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3452:1: ( ruleCSSRuleConcat )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3452:1: ( ruleCSSRuleConcat )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3453:1: ruleCSSRuleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getXorsCSSRuleConcatParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__XorsAssignment_1_1_16967);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3462:1: rule__CSSRuleConcat__ConcAssignment_1_1 : ( ruleCSSRulePostfix ) ;
    public final void rule__CSSRuleConcat__ConcAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3466:1: ( ( ruleCSSRulePostfix ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3467:1: ( ruleCSSRulePostfix )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3467:1: ( ruleCSSRulePostfix )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3468:1: ruleCSSRulePostfix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcCSSRulePostfixParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__ConcAssignment_1_16998);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3477:1: rule__CSSRulePostfix__CardinalityAssignment_1_1 : ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) ) ;
    public final void rule__CSSRulePostfix__CardinalityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3481:1: ( ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3482:1: ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3482:1: ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3483:1: ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAlternatives_1_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3484:1: ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3484:2: rule__CSSRulePostfix__CardinalityAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__CardinalityAlternatives_1_1_0_in_rule__CSSRulePostfix__CardinalityAssignment_1_17029);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3493:1: rule__CSSRuleBracket__InnerAssignment_2 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleBracket__InnerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3497:1: ( ( ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3498:1: ( ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3498:1: ( ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3499:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleBracket__InnerAssignment_27062);
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


    // $ANTLR start "rule__CSSRuleLiteral__ValueAssignment_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3508:1: rule__CSSRuleLiteral__ValueAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__CSSRuleLiteral__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3512:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3513:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3513:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3514:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CSSRuleLiteral__ValueAssignment_0_17093); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__CSSRuleLiteral__ValueAssignment_0_1"


    // $ANTLR start "rule__CSSRuleLiteral__ValueAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3523:1: rule__CSSRuleLiteral__ValueAssignment_1 : ( ( ',' ) ) ;
    public final void rule__CSSRuleLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3527:1: ( ( ( ',' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3528:1: ( ( ',' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3528:1: ( ( ',' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3529:1: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getValueCommaKeyword_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3530:1: ( ',' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3531:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getValueCommaKeyword_1_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__CSSRuleLiteral__ValueAssignment_17129); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getValueCommaKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getValueCommaKeyword_1_0()); 
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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\10\uffff";
    static final String DFA1_eofS =
        "\10\uffff";
    static final String DFA1_minS =
        "\2\4\1\24\1\uffff\1\4\2\uffff\1\24";
    static final String DFA1_maxS =
        "\1\25\1\4\1\34\1\uffff\1\4\2\uffff\1\34";
    static final String DFA1_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\1\3\1\uffff";
    static final String DFA1_specialS =
        "\10\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\2\uffff\1\1\15\uffff\1\3",
            "\1\2",
            "\1\4\1\uffff\1\6\5\uffff\1\5",
            "",
            "\1\7",
            "",
            "",
            "\1\4\1\uffff\1\6\5\uffff\1\5"
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
            return "677:1: rule__PackageDefinition__Alternatives_3 : ( ( ( rule__PackageDefinition__RulesAssignment_3_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) ) );";
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
    public static final BitSet FOLLOW_ruleCSSBaseType_in_entryRuleCSSBaseType486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSBaseType493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSBaseType__Alternatives_in_ruleCSSBaseType519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDeclartion_in_entryRuleElementDeclartion546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDeclartion553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__0_in_ruleElementDeclartion579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassDefinition_in_entryRulePseudoClassDefinition666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassDefinition673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__0_in_rulePseudoClassDefinition699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleId_in_entryRuleCSSRuleId726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleId733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleId__NameAssignment_in_ruleCSSRuleId759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleRef793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__0_in_ruleCSSRuleRef819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleDefinition_in_entryRuleCSSRuleDefinition846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleDefinition853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__0_in_ruleCSSRuleDefinition879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleOr913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__0_in_ruleCSSRuleOr939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleXor973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__0_in_ruleCSSRuleXor999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleConcat1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__0_in_ruleCSSRuleConcat1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePostfix1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__0_in_ruleCSSRulePostfix1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleBracket1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__0_in_ruleCSSRuleBracket1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePrimary1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Alternatives_in_ruleCSSRulePrimary1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleLiteral1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Alternatives_in_ruleCSSRuleLiteral1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue1326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSDefaultValue1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Alternatives_in_ruleCSSDefaultValue1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__RulesAssignment_3_0_in_rule__PackageDefinition__Alternatives_31395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__SubpackagesAssignment_3_1_in_rule__PackageDefinition__Alternatives_31413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__ElementsAssignment_3_2_in_rule__PackageDefinition__Alternatives_31431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CSSBaseType__Alternatives1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CSSBaseType__Alternatives1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CSSBaseType__Alternatives1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__PropertiesAssignment_3_0_in_rule__ElementDeclartion__Alternatives_31539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__PseudoClassesAssignment_3_1_in_rule__ElementDeclartion__Alternatives_31557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_01591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_01611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_01631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_rule__CSSRulePrimary__Alternatives1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_rule__CSSRulePrimary__Alternatives1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_rule__CSSRulePrimary__Alternatives1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSBaseType_in_rule__CSSRulePrimary__Alternatives1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group_0__0_in_rule__CSSRuleLiteral__Alternatives1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__ValueAssignment_1_in_rule__CSSRuleLiteral__Alternatives1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_rule__CSSDefaultValue__Alternatives1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CSSDefaultValue__Alternatives1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_2__0_in_rule__CSSDefaultValue__Alternatives1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CSSDefaultValue__Alternatives1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__0__Impl_in_rule__CssExtension__Group__01881 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__1_in_rule__CssExtension__Group__01884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__ImportsAssignment_0_in_rule__CssExtension__Group__0__Impl1911 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__1__Impl_in_rule__CssExtension__Group__11942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__PackageDefAssignment_1_in_rule__CssExtension__Group__1__Impl1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Import__Group__0__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02127 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2213 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QualifiedName__Group_1__0__Impl2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__02372 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__02375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__12431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__02493 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__02496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__12555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__0__Impl_in_rule__PackageDefinition__Group__02618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__1_in_rule__PackageDefinition__Group__02621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PackageDefinition__Group__0__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__1__Impl_in_rule__PackageDefinition__Group__12680 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__2_in_rule__PackageDefinition__Group__12683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__NameAssignment_1_in_rule__PackageDefinition__Group__1__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__2__Impl_in_rule__PackageDefinition__Group__22740 = new BitSet(new long[]{0x0000000000A00090L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__3_in_rule__PackageDefinition__Group__22743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PackageDefinition__Group__2__Impl2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__3__Impl_in_rule__PackageDefinition__Group__32802 = new BitSet(new long[]{0x0000000000A00090L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__4_in_rule__PackageDefinition__Group__32805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Alternatives_3_in_rule__PackageDefinition__Group__3__Impl2832 = new BitSet(new long[]{0x0000000000200092L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__4__Impl_in_rule__PackageDefinition__Group__42863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PackageDefinition__Group__4__Impl2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__0__Impl_in_rule__ElementDeclartion__Group__02932 = new BitSet(new long[]{0x0000000000200090L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__1_in_rule__ElementDeclartion__Group__02935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__DokuAssignment_0_in_rule__ElementDeclartion__Group__0__Impl2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__1__Impl_in_rule__ElementDeclartion__Group__12993 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__2_in_rule__ElementDeclartion__Group__12996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__NameAssignment_1_in_rule__ElementDeclartion__Group__1__Impl3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__2__Impl_in_rule__ElementDeclartion__Group__23053 = new BitSet(new long[]{0x0000000000800190L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__3_in_rule__ElementDeclartion__Group__23056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ElementDeclartion__Group__2__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__3__Impl_in_rule__ElementDeclartion__Group__33115 = new BitSet(new long[]{0x0000000000800190L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__4_in_rule__ElementDeclartion__Group__33118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Alternatives_3_in_rule__ElementDeclartion__Group__3__Impl3145 = new BitSet(new long[]{0x0000000000000192L});
    public static final BitSet FOLLOW_rule__ElementDeclartion__Group__4__Impl_in_rule__ElementDeclartion__Group__43176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ElementDeclartion__Group__4__Impl3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__03245 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__03248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DokuAssignment_0_in_rule__PropertyDefinition__Group__0__Impl3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__13306 = new BitSet(new long[]{0x000000028400E010L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__13309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NameAssignment_1_in_rule__PropertyDefinition__Group__1__Impl3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__23366 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__23369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__RuleAssignment_2_in_rule__PropertyDefinition__Group__2__Impl3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__33426 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__33429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__0_in_rule__PropertyDefinition__Group__3__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__43487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PropertyDefinition__Group__4__Impl3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__0__Impl_in_rule__PropertyDefinition__Group_3__03556 = new BitSet(new long[]{0x0000000200100070L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__1_in_rule__PropertyDefinition__Group_3__03559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PropertyDefinition__Group_3__0__Impl3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__1__Impl_in_rule__PropertyDefinition__Group_3__13618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DefaultAssignment_3_1_in_rule__PropertyDefinition__Group_3__1__Impl3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__0__Impl_in_rule__PseudoClassDefinition__Group__03679 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__1_in_rule__PseudoClassDefinition__Group__03682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__DokuAssignment_0_in_rule__PseudoClassDefinition__Group__0__Impl3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__1__Impl_in_rule__PseudoClassDefinition__Group__13740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__NameAssignment_1_in_rule__PseudoClassDefinition__Group__1__Impl3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__0__Impl_in_rule__CSSRuleRef__Group__03801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__1_in_rule__CSSRuleRef__Group__03804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CSSRuleRef__Group__0__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__1__Impl_in_rule__CSSRuleRef__Group__13863 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__2_in_rule__CSSRuleRef__Group__13866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__RefAssignment_1_in_rule__CSSRuleRef__Group__1__Impl3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__2__Impl_in_rule__CSSRuleRef__Group__23923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CSSRuleRef__Group__2__Impl3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__0__Impl_in_rule__CSSRuleDefinition__Group__03988 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__1_in_rule__CSSRuleDefinition__Group__03991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__1__Impl_in_rule__CSSRuleDefinition__Group__14049 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__2_in_rule__CSSRuleDefinition__Group__14052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__DokuAssignment_1_in_rule__CSSRuleDefinition__Group__1__Impl4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__2__Impl_in_rule__CSSRuleDefinition__Group__24110 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__3_in_rule__CSSRuleDefinition__Group__24113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__NameAssignment_2_in_rule__CSSRuleDefinition__Group__2__Impl4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__3__Impl_in_rule__CSSRuleDefinition__Group__34170 = new BitSet(new long[]{0x000000028400E010L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__4_in_rule__CSSRuleDefinition__Group__34173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CSSRuleDefinition__Group__3__Impl4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__4__Impl_in_rule__CSSRuleDefinition__Group__44232 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__5_in_rule__CSSRuleDefinition__Group__44235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__RAssignment_4_in_rule__CSSRuleDefinition__Group__4__Impl4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__5__Impl_in_rule__CSSRuleDefinition__Group__54292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CSSRuleDefinition__Group__5__Impl4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__0__Impl_in_rule__CSSRuleOr__Group__04363 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__1_in_rule__CSSRuleOr__Group__04366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__Group__0__Impl4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__1__Impl_in_rule__CSSRuleOr__Group__14422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__0_in_rule__CSSRuleOr__Group__1__Impl4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__0__Impl_in_rule__CSSRuleOr__Group_1__04484 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__1_in_rule__CSSRuleOr__Group_1__04487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__1__Impl_in_rule__CSSRuleOr__Group_1__14545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl4574 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl4586 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__0__Impl_in_rule__CSSRuleOr__Group_1_1__04623 = new BitSet(new long[]{0x000000028400E010L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__1_in_rule__CSSRuleOr__Group_1_1__04626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CSSRuleOr__Group_1_1__0__Impl4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__1__Impl_in_rule__CSSRuleOr__Group_1_1__14685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__OrsAssignment_1_1_1_in_rule__CSSRuleOr__Group_1_1__1__Impl4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__0__Impl_in_rule__CSSRuleXor__Group__04746 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__1_in_rule__CSSRuleXor__Group__04749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__Group__0__Impl4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__1__Impl_in_rule__CSSRuleXor__Group__14805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__0_in_rule__CSSRuleXor__Group__1__Impl4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__0__Impl_in_rule__CSSRuleXor__Group_1__04867 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__1_in_rule__CSSRuleXor__Group_1__04870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__1__Impl_in_rule__CSSRuleXor__Group_1__14928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl4957 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl4969 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__0__Impl_in_rule__CSSRuleXor__Group_1_1__05006 = new BitSet(new long[]{0x000000028400E010L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__1_in_rule__CSSRuleXor__Group_1_1__05009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CSSRuleXor__Group_1_1__0__Impl5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__1__Impl_in_rule__CSSRuleXor__Group_1_1__15068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__XorsAssignment_1_1_1_in_rule__CSSRuleXor__Group_1_1__1__Impl5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__0__Impl_in_rule__CSSRuleConcat__Group__05129 = new BitSet(new long[]{0x000000028400E010L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__1_in_rule__CSSRuleConcat__Group__05132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__Group__0__Impl5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__1__Impl_in_rule__CSSRuleConcat__Group__15188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__0_in_rule__CSSRuleConcat__Group__1__Impl5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__0__Impl_in_rule__CSSRuleConcat__Group_1__05250 = new BitSet(new long[]{0x000000028400E010L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__1_in_rule__CSSRuleConcat__Group_1__05253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__1__Impl_in_rule__CSSRuleConcat__Group_1__15311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl5340 = new BitSet(new long[]{0x000000028400E012L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl5352 = new BitSet(new long[]{0x000000028400E012L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__0__Impl_in_rule__CSSRulePostfix__Group__05389 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__1_in_rule__CSSRulePostfix__Group__05392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_rule__CSSRulePostfix__Group__0__Impl5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__1__Impl_in_rule__CSSRulePostfix__Group__15448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__0_in_rule__CSSRulePostfix__Group__1__Impl5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__0__Impl_in_rule__CSSRulePostfix__Group_1__05510 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__1_in_rule__CSSRulePostfix__Group_1__05513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__1__Impl_in_rule__CSSRulePostfix__Group_1__15571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__CardinalityAssignment_1_1_in_rule__CSSRulePostfix__Group_1__1__Impl5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__0__Impl_in_rule__CSSRuleBracket__Group__05632 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__1_in_rule__CSSRuleBracket__Group__05635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__1__Impl_in_rule__CSSRuleBracket__Group__15693 = new BitSet(new long[]{0x000000028400E010L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__2_in_rule__CSSRuleBracket__Group__15696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CSSRuleBracket__Group__1__Impl5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__2__Impl_in_rule__CSSRuleBracket__Group__25755 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__3_in_rule__CSSRuleBracket__Group__25758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__InnerAssignment_2_in_rule__CSSRuleBracket__Group__2__Impl5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__3__Impl_in_rule__CSSRuleBracket__Group__35815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CSSRuleBracket__Group__3__Impl5843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group_0__0__Impl_in_rule__CSSRuleLiteral__Group_0__05882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group_0__1_in_rule__CSSRuleLiteral__Group_0__05885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group_0__1__Impl_in_rule__CSSRuleLiteral__Group_0__15943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__ValueAssignment_0_1_in_rule__CSSRuleLiteral__Group_0__1__Impl5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_2__0__Impl_in_rule__CSSDefaultValue__Group_2__06004 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_2__1_in_rule__CSSDefaultValue__Group_2__06007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CSSDefaultValue__Group_2__0__Impl6035 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_2__1__Impl_in_rule__CSSDefaultValue__Group_2__16066 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_2__2_in_rule__CSSDefaultValue__Group_2__16069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CSSDefaultValue__Group_2__1__Impl6097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_2__2__Impl_in_rule__CSSDefaultValue__Group_2__26128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CSSDefaultValue__Group_2__2__Impl6158 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CSSDefaultValue__Group_2__2__Impl6171 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleImport_in_rule__CssExtension__ImportsAssignment_06215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_rule__CssExtension__PackageDefAssignment_16246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_16277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDefinition__NameAssignment_16308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleDefinition_in_rule__PackageDefinition__RulesAssignment_3_06339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_rule__PackageDefinition__SubpackagesAssignment_3_16370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDeclartion_in_rule__PackageDefinition__ElementsAssignment_3_26401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JDOC_in_rule__Doku__ContentAssignment6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__ElementDeclartion__DokuAssignment_06463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ElementDeclartion__NameAssignment_16494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_rule__ElementDeclartion__PropertiesAssignment_3_06525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassDefinition_in_rule__ElementDeclartion__PseudoClassesAssignment_3_16556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__PropertyDefinition__DokuAssignment_06587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyDefinition__NameAssignment_16618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rule__PropertyDefinition__RuleAssignment_26649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_rule__PropertyDefinition__DefaultAssignment_3_16680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__PseudoClassDefinition__DokuAssignment_06711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PSEUDO_in_rule__PseudoClassDefinition__NameAssignment_16742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CSSRuleId__NameAssignment6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CSSRuleRef__RefAssignment_16808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__CSSRuleDefinition__DokuAssignment_16843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleId_in_rule__CSSRuleDefinition__NameAssignment_26874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleDefinition__RAssignment_46905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__OrsAssignment_1_1_16936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__XorsAssignment_1_1_16967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__ConcAssignment_1_16998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__CardinalityAlternatives_1_1_0_in_rule__CSSRulePostfix__CardinalityAssignment_1_17029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleBracket__InnerAssignment_27062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CSSRuleLiteral__ValueAssignment_0_17093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CSSRuleLiteral__ValueAssignment_17129 = new BitSet(new long[]{0x0000000000000002L});

}