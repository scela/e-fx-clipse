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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_JDOC", "RULE_INT", "RULE_DOUBLE", "RULE_PSEUDO", "RULE_REGEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'*'", "'+'", "'?'", "'import'", "'.'", "'package'", "'{'", "'}'", "'('", "'->'", "')'", "'extends'", "','", "';'", "'default:'", "'<'", "'>'", "'='", "'|'", "'||'", "'['", "']'", "'int'", "'double'"
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
    public static final int RULE_JDOC=6;
    public static final int RULE_WS=5;
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


    // $ANTLR start "entryRuleElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:329:1: entryRuleElementDefinition : ruleElementDefinition EOF ;
    public final void entryRuleElementDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:330:1: ( ruleElementDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:331:1: ruleElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_entryRuleElementDefinition623);
            ruleElementDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDefinition630); if (state.failed) return ;

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
    // $ANTLR end "entryRuleElementDefinition"


    // $ANTLR start "ruleElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:338:1: ruleElementDefinition : ( ( rule__ElementDefinition__Group__0 ) ) ;
    public final void ruleElementDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:342:2: ( ( ( rule__ElementDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:343:1: ( ( rule__ElementDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:343:1: ( ( rule__ElementDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:344:1: ( rule__ElementDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:345:1: ( rule__ElementDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:345:2: rule__ElementDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__0_in_ruleElementDefinition656);
            rule__ElementDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementDefinition"


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


    // $ANTLR start "entryRuleCSSRuleFunc"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:513:1: entryRuleCSSRuleFunc : ruleCSSRuleFunc EOF ;
    public final void entryRuleCSSRuleFunc() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:517:1: ( ruleCSSRuleFunc EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:518:1: ruleCSSRuleFunc EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleFunc_in_entryRuleCSSRuleFunc1006);
            ruleCSSRuleFunc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleFunc1013); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleFunc"


    // $ANTLR start "ruleCSSRuleFunc"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:528:1: ruleCSSRuleFunc : ( ( rule__CSSRuleFunc__Group__0 ) ) ;
    public final void ruleCSSRuleFunc() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:533:2: ( ( ( rule__CSSRuleFunc__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:534:1: ( ( rule__CSSRuleFunc__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:534:1: ( ( rule__CSSRuleFunc__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:535:1: ( rule__CSSRuleFunc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:536:1: ( rule__CSSRuleFunc__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:536:2: rule__CSSRuleFunc__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__0_in_ruleCSSRuleFunc1043);
            rule__CSSRuleFunc__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCSSRuleFunc"


    // $ANTLR start "entryRuleCSSRuleOr"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:549:1: entryRuleCSSRuleOr : ruleCSSRuleOr EOF ;
    public final void entryRuleCSSRuleOr() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:553:1: ( ruleCSSRuleOr EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:554:1: ruleCSSRuleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr1075);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleOr1082); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:564:1: ruleCSSRuleOr : ( ( rule__CSSRuleOr__Group__0 ) ) ;
    public final void ruleCSSRuleOr() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:569:2: ( ( ( rule__CSSRuleOr__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:570:1: ( ( rule__CSSRuleOr__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:570:1: ( ( rule__CSSRuleOr__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:571:1: ( rule__CSSRuleOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:572:1: ( rule__CSSRuleOr__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:572:2: rule__CSSRuleOr__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__0_in_ruleCSSRuleOr1112);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:585:1: entryRuleCSSRuleXor : ruleCSSRuleXor EOF ;
    public final void entryRuleCSSRuleXor() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:589:1: ( ruleCSSRuleXor EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:590:1: ruleCSSRuleXor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor1144);
            ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleXor1151); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:600:1: ruleCSSRuleXor : ( ( rule__CSSRuleXor__Group__0 ) ) ;
    public final void ruleCSSRuleXor() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:605:2: ( ( ( rule__CSSRuleXor__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:606:1: ( ( rule__CSSRuleXor__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:606:1: ( ( rule__CSSRuleXor__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:607:1: ( rule__CSSRuleXor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:608:1: ( rule__CSSRuleXor__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:608:2: rule__CSSRuleXor__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__0_in_ruleCSSRuleXor1181);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:621:1: entryRuleCSSRuleConcat : ruleCSSRuleConcat EOF ;
    public final void entryRuleCSSRuleConcat() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:625:1: ( ruleCSSRuleConcat EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:626:1: ruleCSSRuleConcat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat1213);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleConcat1220); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:636:1: ruleCSSRuleConcat : ( ( rule__CSSRuleConcat__Group__0 ) ) ;
    public final void ruleCSSRuleConcat() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:641:2: ( ( ( rule__CSSRuleConcat__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:642:1: ( ( rule__CSSRuleConcat__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:642:1: ( ( rule__CSSRuleConcat__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:643:1: ( rule__CSSRuleConcat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:644:1: ( rule__CSSRuleConcat__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:644:2: rule__CSSRuleConcat__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__0_in_ruleCSSRuleConcat1250);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:657:1: entryRuleCSSRulePostfix : ruleCSSRulePostfix EOF ;
    public final void entryRuleCSSRulePostfix() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:661:1: ( ruleCSSRulePostfix EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:662:1: ruleCSSRulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix1282);
            ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePostfix1289); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:672:1: ruleCSSRulePostfix : ( ( rule__CSSRulePostfix__Group__0 ) ) ;
    public final void ruleCSSRulePostfix() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:677:2: ( ( ( rule__CSSRulePostfix__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:678:1: ( ( rule__CSSRulePostfix__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:678:1: ( ( rule__CSSRulePostfix__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:679:1: ( rule__CSSRulePostfix__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:680:1: ( rule__CSSRulePostfix__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:680:2: rule__CSSRulePostfix__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__0_in_ruleCSSRulePostfix1319);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:693:1: entryRuleCSSRuleBracket : ruleCSSRuleBracket EOF ;
    public final void entryRuleCSSRuleBracket() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:697:1: ( ruleCSSRuleBracket EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:698:1: ruleCSSRuleBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket1351);
            ruleCSSRuleBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleBracket1358); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:708:1: ruleCSSRuleBracket : ( ( rule__CSSRuleBracket__Group__0 ) ) ;
    public final void ruleCSSRuleBracket() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:713:2: ( ( ( rule__CSSRuleBracket__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:714:1: ( ( rule__CSSRuleBracket__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:714:1: ( ( rule__CSSRuleBracket__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:715:1: ( rule__CSSRuleBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:716:1: ( rule__CSSRuleBracket__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:716:2: rule__CSSRuleBracket__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__0_in_ruleCSSRuleBracket1388);
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


    // $ANTLR start "entryRuleCSSRulePrimary"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:729:1: entryRuleCSSRulePrimary : ruleCSSRulePrimary EOF ;
    public final void entryRuleCSSRulePrimary() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:733:1: ( ruleCSSRulePrimary EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:734:1: ruleCSSRulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary1420);
            ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePrimary1427); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:744:1: ruleCSSRulePrimary : ( ( rule__CSSRulePrimary__Alternatives ) ) ;
    public final void ruleCSSRulePrimary() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:749:2: ( ( ( rule__CSSRulePrimary__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:750:1: ( ( rule__CSSRulePrimary__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:750:1: ( ( rule__CSSRulePrimary__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:751:1: ( rule__CSSRulePrimary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:752:1: ( rule__CSSRulePrimary__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:752:2: rule__CSSRulePrimary__Alternatives
            {
            pushFollow(FOLLOW_rule__CSSRulePrimary__Alternatives_in_ruleCSSRulePrimary1457);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:765:1: entryRuleCSSRuleRegex : ruleCSSRuleRegex EOF ;
    public final void entryRuleCSSRuleRegex() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:769:1: ( ruleCSSRuleRegex EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:770:1: ruleCSSRuleRegex EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleRegex_in_entryRuleCSSRuleRegex1489);
            ruleCSSRuleRegex();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleRegex1496); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:780:1: ruleCSSRuleRegex : ( ( rule__CSSRuleRegex__Group__0 ) ) ;
    public final void ruleCSSRuleRegex() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:785:2: ( ( ( rule__CSSRuleRegex__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:786:1: ( ( rule__CSSRuleRegex__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:786:1: ( ( rule__CSSRuleRegex__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:787:1: ( rule__CSSRuleRegex__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:788:1: ( rule__CSSRuleRegex__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:788:2: rule__CSSRuleRegex__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleRegex__Group__0_in_ruleCSSRuleRegex1526);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:801:1: entryRuleCSSRuleLiteral : ruleCSSRuleLiteral EOF ;
    public final void entryRuleCSSRuleLiteral() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:802:1: ( ruleCSSRuleLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:803:1: ruleCSSRuleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral1553);
            ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleLiteral1560); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:810:1: ruleCSSRuleLiteral : ( ( rule__CSSRuleLiteral__Group__0 ) ) ;
    public final void ruleCSSRuleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:814:2: ( ( ( rule__CSSRuleLiteral__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:815:1: ( ( rule__CSSRuleLiteral__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:815:1: ( ( rule__CSSRuleLiteral__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:816:1: ( rule__CSSRuleLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:817:1: ( rule__CSSRuleLiteral__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:817:2: rule__CSSRuleLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Group__0_in_ruleCSSRuleLiteral1586);
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


    // $ANTLR start "entryRuleCSSRuleSymbol"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:829:1: entryRuleCSSRuleSymbol : ruleCSSRuleSymbol EOF ;
    public final void entryRuleCSSRuleSymbol() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:830:1: ( ruleCSSRuleSymbol EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:831:1: ruleCSSRuleSymbol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleSymbol_in_entryRuleCSSRuleSymbol1613);
            ruleCSSRuleSymbol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleSymbol1620); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCSSRuleSymbol"


    // $ANTLR start "ruleCSSRuleSymbol"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:838:1: ruleCSSRuleSymbol : ( ( rule__CSSRuleSymbol__Group__0 ) ) ;
    public final void ruleCSSRuleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:842:2: ( ( ( rule__CSSRuleSymbol__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:843:1: ( ( rule__CSSRuleSymbol__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:843:1: ( ( rule__CSSRuleSymbol__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:844:1: ( rule__CSSRuleSymbol__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:845:1: ( rule__CSSRuleSymbol__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:845:2: rule__CSSRuleSymbol__Group__0
            {
            pushFollow(FOLLOW_rule__CSSRuleSymbol__Group__0_in_ruleCSSRuleSymbol1646);
            rule__CSSRuleSymbol__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleSymbol"


    // $ANTLR start "entryRuleCSSDefaultValue"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:857:1: entryRuleCSSDefaultValue : ruleCSSDefaultValue EOF ;
    public final void entryRuleCSSDefaultValue() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:858:1: ( ruleCSSDefaultValue EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:859:1: ruleCSSDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue1673);
            ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSDefaultValue1680); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:866:1: ruleCSSDefaultValue : ( ( rule__CSSDefaultValue__Alternatives ) ) ;
    public final void ruleCSSDefaultValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:870:2: ( ( ( rule__CSSDefaultValue__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:871:1: ( ( rule__CSSDefaultValue__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:871:1: ( ( rule__CSSDefaultValue__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:872:1: ( rule__CSSDefaultValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:873:1: ( rule__CSSDefaultValue__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:873:2: rule__CSSDefaultValue__Alternatives
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__Alternatives_in_ruleCSSDefaultValue1706);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:885:1: rule__PackageDefinition__Alternatives_3 : ( ( ( rule__PackageDefinition__RulesAssignment_3_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) ) );
    public final void rule__PackageDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:889:1: ( ( ( rule__PackageDefinition__RulesAssignment_3_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:890:1: ( ( rule__PackageDefinition__RulesAssignment_3_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:890:1: ( ( rule__PackageDefinition__RulesAssignment_3_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:891:1: ( rule__PackageDefinition__RulesAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getRulesAssignment_3_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:892:1: ( rule__PackageDefinition__RulesAssignment_3_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:892:2: rule__PackageDefinition__RulesAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__PackageDefinition__RulesAssignment_3_0_in_rule__PackageDefinition__Alternatives_31742);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:896:6: ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:896:6: ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:897:1: ( rule__PackageDefinition__SubpackagesAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getSubpackagesAssignment_3_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:898:1: ( rule__PackageDefinition__SubpackagesAssignment_3_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:898:2: rule__PackageDefinition__SubpackagesAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__PackageDefinition__SubpackagesAssignment_3_1_in_rule__PackageDefinition__Alternatives_31760);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:902:6: ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:902:6: ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:903:1: ( rule__PackageDefinition__ElementsAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getElementsAssignment_3_2()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:904:1: ( rule__PackageDefinition__ElementsAssignment_3_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:904:2: rule__PackageDefinition__ElementsAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__PackageDefinition__ElementsAssignment_3_2_in_rule__PackageDefinition__Alternatives_31778);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:913:1: rule__CSSType__Alternatives : ( ( ( rule__CSSType__Group_0__0 ) ) | ( ( rule__CSSType__Group_1__0 ) ) | ( ( rule__CSSType__TypeAssignment_2 ) ) | ( ( rule__CSSType__TypeAssignment_3 ) ) );
    public final void rule__CSSType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:917:1: ( ( ( rule__CSSType__Group_0__0 ) ) | ( ( rule__CSSType__Group_1__0 ) ) | ( ( rule__CSSType__TypeAssignment_2 ) ) | ( ( rule__CSSType__TypeAssignment_3 ) ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==37) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==23) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||LA2_1==RULE_ID||LA2_1==RULE_INT||LA2_1==RULE_REGEX||(LA2_1>=15 && LA2_1<=17)||LA2_1==25||(LA2_1>=27 && LA2_1<=30)||(LA2_1>=33 && LA2_1<=38)) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==38) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==EOF||LA2_2==RULE_ID||LA2_2==RULE_INT||LA2_2==RULE_REGEX||(LA2_2>=15 && LA2_2<=17)||LA2_2==25||(LA2_2>=27 && LA2_2<=30)||(LA2_2>=33 && LA2_2<=38)) ) {
                    alt2=4;
                }
                else if ( (LA2_2==23) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:918:1: ( ( rule__CSSType__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:918:1: ( ( rule__CSSType__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:919:1: ( rule__CSSType__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:920:1: ( rule__CSSType__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:920:2: rule__CSSType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CSSType__Group_0__0_in_rule__CSSType__Alternatives1811);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:924:6: ( ( rule__CSSType__Group_1__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:924:6: ( ( rule__CSSType__Group_1__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:925:1: ( rule__CSSType__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:926:1: ( rule__CSSType__Group_1__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:926:2: rule__CSSType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSType__Group_1__0_in_rule__CSSType__Alternatives1829);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:930:6: ( ( rule__CSSType__TypeAssignment_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:930:6: ( ( rule__CSSType__TypeAssignment_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:931:1: ( rule__CSSType__TypeAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getTypeAssignment_2()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:932:1: ( rule__CSSType__TypeAssignment_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:932:2: rule__CSSType__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__CSSType__TypeAssignment_2_in_rule__CSSType__Alternatives1847);
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
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:936:6: ( ( rule__CSSType__TypeAssignment_3 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:936:6: ( ( rule__CSSType__TypeAssignment_3 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:937:1: ( rule__CSSType__TypeAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getTypeAssignment_3()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:938:1: ( rule__CSSType__TypeAssignment_3 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:938:2: rule__CSSType__TypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__CSSType__TypeAssignment_3_in_rule__CSSType__Alternatives1865);
                    rule__CSSType__TypeAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getTypeAssignment_3()); 
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


    // $ANTLR start "rule__ElementDefinition__Alternatives_5"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:947:1: rule__ElementDefinition__Alternatives_5 : ( ( ( rule__ElementDefinition__PropertiesAssignment_5_0 ) ) | ( ( rule__ElementDefinition__PseudoClassesAssignment_5_1 ) ) );
    public final void rule__ElementDefinition__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:951:1: ( ( ( rule__ElementDefinition__PropertiesAssignment_5_0 ) ) | ( ( rule__ElementDefinition__PseudoClassesAssignment_5_1 ) ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_JDOC:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else if ( (LA3_1==RULE_PSEUDO) ) {
                    alt3=2;
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:952:1: ( ( rule__ElementDefinition__PropertiesAssignment_5_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:952:1: ( ( rule__ElementDefinition__PropertiesAssignment_5_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:953:1: ( rule__ElementDefinition__PropertiesAssignment_5_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDefinitionAccess().getPropertiesAssignment_5_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:954:1: ( rule__ElementDefinition__PropertiesAssignment_5_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:954:2: rule__ElementDefinition__PropertiesAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__ElementDefinition__PropertiesAssignment_5_0_in_rule__ElementDefinition__Alternatives_51898);
                    rule__ElementDefinition__PropertiesAssignment_5_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementDefinitionAccess().getPropertiesAssignment_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:958:6: ( ( rule__ElementDefinition__PseudoClassesAssignment_5_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:958:6: ( ( rule__ElementDefinition__PseudoClassesAssignment_5_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:959:1: ( rule__ElementDefinition__PseudoClassesAssignment_5_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDefinitionAccess().getPseudoClassesAssignment_5_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:960:1: ( rule__ElementDefinition__PseudoClassesAssignment_5_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:960:2: rule__ElementDefinition__PseudoClassesAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__ElementDefinition__PseudoClassesAssignment_5_1_in_rule__ElementDefinition__Alternatives_51916);
                    rule__ElementDefinition__PseudoClassesAssignment_5_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementDefinitionAccess().getPseudoClassesAssignment_5_1()); 
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
    // $ANTLR end "rule__ElementDefinition__Alternatives_5"


    // $ANTLR start "rule__CSSRuleDefinition__Alternatives_3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:969:1: rule__CSSRuleDefinition__Alternatives_3 : ( ( ( rule__CSSRuleDefinition__RuleAssignment_3_0 ) ) | ( ( rule__CSSRuleDefinition__FuncAssignment_3_1 ) ) );
    public final void rule__CSSRuleDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:973:1: ( ( ( rule__CSSRuleDefinition__RuleAssignment_3_0 ) ) | ( ( rule__CSSRuleDefinition__FuncAssignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==RULE_REGEX||LA4_0==27||LA4_0==30||LA4_0==35||(LA4_0>=37 && LA4_0<=38)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==23) ) {
                    alt4=2;
                }
                else if ( (LA4_2==RULE_ID||LA4_2==RULE_INT||LA4_2==RULE_REGEX||(LA4_2>=15 && LA4_2<=17)||(LA4_2>=27 && LA4_2<=28)||LA4_2==30||(LA4_2>=33 && LA4_2<=35)||(LA4_2>=37 && LA4_2<=38)) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:974:1: ( ( rule__CSSRuleDefinition__RuleAssignment_3_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:974:1: ( ( rule__CSSRuleDefinition__RuleAssignment_3_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:975:1: ( rule__CSSRuleDefinition__RuleAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleDefinitionAccess().getRuleAssignment_3_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:976:1: ( rule__CSSRuleDefinition__RuleAssignment_3_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:976:2: rule__CSSRuleDefinition__RuleAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleDefinition__RuleAssignment_3_0_in_rule__CSSRuleDefinition__Alternatives_31949);
                    rule__CSSRuleDefinition__RuleAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleDefinitionAccess().getRuleAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:980:6: ( ( rule__CSSRuleDefinition__FuncAssignment_3_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:980:6: ( ( rule__CSSRuleDefinition__FuncAssignment_3_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:981:1: ( rule__CSSRuleDefinition__FuncAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleDefinitionAccess().getFuncAssignment_3_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:982:1: ( rule__CSSRuleDefinition__FuncAssignment_3_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:982:2: rule__CSSRuleDefinition__FuncAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__CSSRuleDefinition__FuncAssignment_3_1_in_rule__CSSRuleDefinition__Alternatives_31967);
                    rule__CSSRuleDefinition__FuncAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleDefinitionAccess().getFuncAssignment_3_1()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__Alternatives_3"


    // $ANTLR start "rule__CSSRulePostfix__CardinalityAlternatives_1_1_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:991:1: rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 : ( ( '*' ) | ( '+' ) | ( '?' ) );
    public final void rule__CSSRulePostfix__CardinalityAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:995:1: ( ( '*' ) | ( '+' ) | ( '?' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:996:1: ( '*' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:996:1: ( '*' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:997:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_02001); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1004:6: ( '+' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1004:6: ( '+' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1005:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_02021); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1012:6: ( '?' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1012:6: ( '?' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1013:1: '?'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityQuestionMarkKeyword_1_1_0_2()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_02041); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1025:1: rule__CSSRulePrimary__Alternatives : ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracket ) | ( ruleCSSRuleLiteral ) | ( ruleCSSRuleSymbol ) | ( ruleCSSBaseType ) | ( ruleCSSRuleRegex ) | ( ( rule__CSSRulePrimary__Group_6__0 ) ) );
    public final void rule__CSSRulePrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1029:1: ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracket ) | ( ruleCSSRuleLiteral ) | ( ruleCSSRuleSymbol ) | ( ruleCSSBaseType ) | ( ruleCSSRuleRegex ) | ( ( rule__CSSRulePrimary__Group_6__0 ) ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 37:
            case 38:
                {
                alt6=5;
                }
                break;
            case RULE_REGEX:
                {
                alt6=6;
                }
                break;
            case RULE_INT:
                {
                alt6=7;
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1030:1: ( ruleCSSRuleRef )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1030:1: ( ruleCSSRuleRef )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1031:1: ruleCSSRuleRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleRef_in_rule__CSSRulePrimary__Alternatives2075);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1036:6: ( ruleCSSRuleBracket )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1036:6: ( ruleCSSRuleBracket )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1037:1: ruleCSSRuleBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleBracketParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleBracket_in_rule__CSSRulePrimary__Alternatives2092);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1042:6: ( ruleCSSRuleLiteral )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1042:6: ( ruleCSSRuleLiteral )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1043:1: ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleLiteral_in_rule__CSSRulePrimary__Alternatives2109);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1048:6: ( ruleCSSRuleSymbol )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1048:6: ( ruleCSSRuleSymbol )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1049:1: ruleCSSRuleSymbol
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleSymbolParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleSymbol_in_rule__CSSRulePrimary__Alternatives2126);
                    ruleCSSRuleSymbol();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleSymbolParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1054:6: ( ruleCSSBaseType )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1054:6: ( ruleCSSBaseType )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1055:1: ruleCSSBaseType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleCSSBaseType_in_rule__CSSRulePrimary__Alternatives2143);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1060:6: ( ruleCSSRuleRegex )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1060:6: ( ruleCSSRuleRegex )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1061:1: ruleCSSRuleRegex
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRegexParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleCSSRuleRegex_in_rule__CSSRulePrimary__Alternatives2160);
                    ruleCSSRuleRegex();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRegexParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1066:6: ( ( rule__CSSRulePrimary__Group_6__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1066:6: ( ( rule__CSSRulePrimary__Group_6__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1067:1: ( rule__CSSRulePrimary__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getGroup_6()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1068:1: ( rule__CSSRulePrimary__Group_6__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1068:2: rule__CSSRulePrimary__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__CSSRulePrimary__Group_6__0_in_rule__CSSRulePrimary__Alternatives2177);
                    rule__CSSRulePrimary__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getGroup_6()); 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1077:1: rule__CSSDefaultValue__Alternatives : ( ( ( rule__CSSDefaultValue__Group_0__0 ) ) | ( ( rule__CSSDefaultValue__IvalAssignment_1 ) ) | ( ( rule__CSSDefaultValue__DvalAssignment_2 ) ) | ( ( rule__CSSDefaultValue__SvalAssignment_3 ) ) );
    public final void rule__CSSDefaultValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1081:1: ( ( ( rule__CSSDefaultValue__Group_0__0 ) ) | ( ( rule__CSSDefaultValue__IvalAssignment_1 ) ) | ( ( rule__CSSDefaultValue__DvalAssignment_2 ) ) | ( ( rule__CSSDefaultValue__SvalAssignment_3 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case RULE_DOUBLE:
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1082:1: ( ( rule__CSSDefaultValue__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1082:1: ( ( rule__CSSDefaultValue__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1083:1: ( rule__CSSDefaultValue__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getGroup_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1084:1: ( rule__CSSDefaultValue__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1084:2: rule__CSSDefaultValue__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CSSDefaultValue__Group_0__0_in_rule__CSSDefaultValue__Alternatives2210);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1088:6: ( ( rule__CSSDefaultValue__IvalAssignment_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1088:6: ( ( rule__CSSDefaultValue__IvalAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1089:1: ( rule__CSSDefaultValue__IvalAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getIvalAssignment_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1090:1: ( rule__CSSDefaultValue__IvalAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1090:2: rule__CSSDefaultValue__IvalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CSSDefaultValue__IvalAssignment_1_in_rule__CSSDefaultValue__Alternatives2228);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1094:6: ( ( rule__CSSDefaultValue__DvalAssignment_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1094:6: ( ( rule__CSSDefaultValue__DvalAssignment_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1095:1: ( rule__CSSDefaultValue__DvalAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getDvalAssignment_2()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1096:1: ( rule__CSSDefaultValue__DvalAssignment_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1096:2: rule__CSSDefaultValue__DvalAssignment_2
                    {
                    pushFollow(FOLLOW_rule__CSSDefaultValue__DvalAssignment_2_in_rule__CSSDefaultValue__Alternatives2246);
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
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1100:6: ( ( rule__CSSDefaultValue__SvalAssignment_3 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1100:6: ( ( rule__CSSDefaultValue__SvalAssignment_3 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1101:1: ( rule__CSSDefaultValue__SvalAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getSvalAssignment_3()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1102:1: ( rule__CSSDefaultValue__SvalAssignment_3 )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1102:2: rule__CSSDefaultValue__SvalAssignment_3
                    {
                    pushFollow(FOLLOW_rule__CSSDefaultValue__SvalAssignment_3_in_rule__CSSDefaultValue__Alternatives2264);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1113:1: rule__CssExtension__Group__0 : rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1 ;
    public final void rule__CssExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1117:1: ( rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1118:2: rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1
            {
            pushFollow(FOLLOW_rule__CssExtension__Group__0__Impl_in_rule__CssExtension__Group__02295);
            rule__CssExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CssExtension__Group__1_in_rule__CssExtension__Group__02298);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1125:1: rule__CssExtension__Group__0__Impl : ( ( rule__CssExtension__ImportsAssignment_0 )* ) ;
    public final void rule__CssExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1129:1: ( ( ( rule__CssExtension__ImportsAssignment_0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1130:1: ( ( rule__CssExtension__ImportsAssignment_0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1130:1: ( ( rule__CssExtension__ImportsAssignment_0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1131:1: ( rule__CssExtension__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getImportsAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1132:1: ( rule__CssExtension__ImportsAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1132:2: rule__CssExtension__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__CssExtension__ImportsAssignment_0_in_rule__CssExtension__Group__0__Impl2325);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1142:1: rule__CssExtension__Group__1 : rule__CssExtension__Group__1__Impl ;
    public final void rule__CssExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1146:1: ( rule__CssExtension__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1147:2: rule__CssExtension__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CssExtension__Group__1__Impl_in_rule__CssExtension__Group__12356);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1153:1: rule__CssExtension__Group__1__Impl : ( ( rule__CssExtension__PackageDefAssignment_1 )? ) ;
    public final void rule__CssExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1157:1: ( ( ( rule__CssExtension__PackageDefAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1158:1: ( ( rule__CssExtension__PackageDefAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1158:1: ( ( rule__CssExtension__PackageDefAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1159:1: ( rule__CssExtension__PackageDefAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getPackageDefAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1160:1: ( rule__CssExtension__PackageDefAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1160:2: rule__CssExtension__PackageDefAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CssExtension__PackageDefAssignment_1_in_rule__CssExtension__Group__1__Impl2383);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1174:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1178:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1179:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02418);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02421);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1186:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1190:1: ( ( 'import' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1191:1: ( 'import' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1191:1: ( 'import' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1192:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Import__Group__0__Impl2449); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1205:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1209:1: ( rule__Import__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1210:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12480);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1216:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1220:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1221:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1221:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1222:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1223:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1223:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2507);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1237:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1241:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1242:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02541);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02544);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1249:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1253:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1254:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1254:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1255:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl2571);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1266:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1270:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1271:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12600);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1277:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1281:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1282:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1282:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1283:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1284:1: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==RULE_ID) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1284:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2627);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1298:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1302:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1303:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02662);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02665);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1310:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1314:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1315:1: ( ( '.' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1315:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1316:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1317:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1318:2: '.'
            {
            match(input,19,FOLLOW_19_in_rule__QualifiedName__Group_1__0__Impl2694); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1329:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1333:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1334:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12726);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1340:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1344:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1345:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1345:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1346:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl2753);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1361:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1365:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1366:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__02786);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__02789);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1373:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1377:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1378:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1378:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1379:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl2816);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1390:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1394:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1395:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__12845);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1401:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1405:1: ( ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1406:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1406:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1407:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1408:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1408:2: rule__QualifiedNameWithWildCard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl2872);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1422:1: rule__QualifiedNameWithWildCard__Group_1__0 : rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1426:1: ( rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1427:2: rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__02907);
            rule__QualifiedNameWithWildCard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__02910);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1434:1: rule__QualifiedNameWithWildCard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1438:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1439:1: ( '.' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1439:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1440:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl2938); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1453:1: rule__QualifiedNameWithWildCard__Group_1__1 : rule__QualifiedNameWithWildCard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1457:1: ( rule__QualifiedNameWithWildCard__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1458:2: rule__QualifiedNameWithWildCard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__12969);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1464:1: rule__QualifiedNameWithWildCard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1468:1: ( ( '*' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1469:1: ( '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1469:1: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1470:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl2997); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1487:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1491:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1492:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__0__Impl_in_rule__PackageDefinition__Group__03032);
            rule__PackageDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__1_in_rule__PackageDefinition__Group__03035);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1499:1: rule__PackageDefinition__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1503:1: ( ( 'package' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1504:1: ( 'package' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1504:1: ( 'package' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1505:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__PackageDefinition__Group__0__Impl3063); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1518:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1522:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1523:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__1__Impl_in_rule__PackageDefinition__Group__13094);
            rule__PackageDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__2_in_rule__PackageDefinition__Group__13097);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1530:1: rule__PackageDefinition__Group__1__Impl : ( ( rule__PackageDefinition__NameAssignment_1 ) ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1534:1: ( ( ( rule__PackageDefinition__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1535:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1535:1: ( ( rule__PackageDefinition__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1536:1: ( rule__PackageDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1537:1: ( rule__PackageDefinition__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1537:2: rule__PackageDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDefinition__NameAssignment_1_in_rule__PackageDefinition__Group__1__Impl3124);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1547:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1551:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1552:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__2__Impl_in_rule__PackageDefinition__Group__23154);
            rule__PackageDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__3_in_rule__PackageDefinition__Group__23157);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1559:1: rule__PackageDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1563:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1564:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1564:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1565:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__PackageDefinition__Group__2__Impl3185); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1578:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1582:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1583:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__3__Impl_in_rule__PackageDefinition__Group__33216);
            rule__PackageDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDefinition__Group__4_in_rule__PackageDefinition__Group__33219);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1590:1: rule__PackageDefinition__Group__3__Impl : ( ( rule__PackageDefinition__Alternatives_3 )* ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1594:1: ( ( ( rule__PackageDefinition__Alternatives_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1595:1: ( ( rule__PackageDefinition__Alternatives_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1595:1: ( ( rule__PackageDefinition__Alternatives_3 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1596:1: ( rule__PackageDefinition__Alternatives_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1597:1: ( rule__PackageDefinition__Alternatives_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==RULE_JDOC||LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1597:2: rule__PackageDefinition__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__PackageDefinition__Alternatives_3_in_rule__PackageDefinition__Group__3__Impl3246);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1607:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1611:1: ( rule__PackageDefinition__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1612:2: rule__PackageDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PackageDefinition__Group__4__Impl_in_rule__PackageDefinition__Group__43277);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1618:1: rule__PackageDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1622:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1623:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1623:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1624:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__PackageDefinition__Group__4__Impl3305); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1647:1: rule__CSSType__Group_0__0 : rule__CSSType__Group_0__0__Impl rule__CSSType__Group_0__1 ;
    public final void rule__CSSType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1651:1: ( rule__CSSType__Group_0__0__Impl rule__CSSType__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1652:2: rule__CSSType__Group_0__0__Impl rule__CSSType__Group_0__1
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__0__Impl_in_rule__CSSType__Group_0__03346);
            rule__CSSType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__1_in_rule__CSSType__Group_0__03349);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1659:1: rule__CSSType__Group_0__0__Impl : ( () ) ;
    public final void rule__CSSType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1663:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1664:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1664:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1665:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getCSSRangedIntTypeAction_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1666:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1668:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1678:1: rule__CSSType__Group_0__1 : rule__CSSType__Group_0__1__Impl rule__CSSType__Group_0__2 ;
    public final void rule__CSSType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1682:1: ( rule__CSSType__Group_0__1__Impl rule__CSSType__Group_0__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1683:2: rule__CSSType__Group_0__1__Impl rule__CSSType__Group_0__2
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__1__Impl_in_rule__CSSType__Group_0__13407);
            rule__CSSType__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__2_in_rule__CSSType__Group_0__13410);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1690:1: rule__CSSType__Group_0__1__Impl : ( ( rule__CSSType__TypeAssignment_0_1 ) ) ;
    public final void rule__CSSType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1694:1: ( ( ( rule__CSSType__TypeAssignment_0_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1695:1: ( ( rule__CSSType__TypeAssignment_0_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1695:1: ( ( rule__CSSType__TypeAssignment_0_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1696:1: ( rule__CSSType__TypeAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_0_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1697:1: ( rule__CSSType__TypeAssignment_0_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1697:2: rule__CSSType__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__CSSType__TypeAssignment_0_1_in_rule__CSSType__Group_0__1__Impl3437);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1707:1: rule__CSSType__Group_0__2 : rule__CSSType__Group_0__2__Impl rule__CSSType__Group_0__3 ;
    public final void rule__CSSType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1711:1: ( rule__CSSType__Group_0__2__Impl rule__CSSType__Group_0__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1712:2: rule__CSSType__Group_0__2__Impl rule__CSSType__Group_0__3
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__2__Impl_in_rule__CSSType__Group_0__23467);
            rule__CSSType__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__3_in_rule__CSSType__Group_0__23470);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1719:1: rule__CSSType__Group_0__2__Impl : ( '(' ) ;
    public final void rule__CSSType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1723:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1724:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1724:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1725:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__CSSType__Group_0__2__Impl3498); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1738:1: rule__CSSType__Group_0__3 : rule__CSSType__Group_0__3__Impl rule__CSSType__Group_0__4 ;
    public final void rule__CSSType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1742:1: ( rule__CSSType__Group_0__3__Impl rule__CSSType__Group_0__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1743:2: rule__CSSType__Group_0__3__Impl rule__CSSType__Group_0__4
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__3__Impl_in_rule__CSSType__Group_0__33529);
            rule__CSSType__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__4_in_rule__CSSType__Group_0__33532);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1750:1: rule__CSSType__Group_0__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1754:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1755:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1755:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1756:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1757:1: ( RULE_WS )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_WS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1757:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_0__3__Impl3560); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_3()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1767:1: rule__CSSType__Group_0__4 : rule__CSSType__Group_0__4__Impl rule__CSSType__Group_0__5 ;
    public final void rule__CSSType__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1771:1: ( rule__CSSType__Group_0__4__Impl rule__CSSType__Group_0__5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1772:2: rule__CSSType__Group_0__4__Impl rule__CSSType__Group_0__5
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__4__Impl_in_rule__CSSType__Group_0__43591);
            rule__CSSType__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__5_in_rule__CSSType__Group_0__43594);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1779:1: rule__CSSType__Group_0__4__Impl : ( ( rule__CSSType__FromAssignment_0_4 ) ) ;
    public final void rule__CSSType__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1783:1: ( ( ( rule__CSSType__FromAssignment_0_4 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1784:1: ( ( rule__CSSType__FromAssignment_0_4 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1784:1: ( ( rule__CSSType__FromAssignment_0_4 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1785:1: ( rule__CSSType__FromAssignment_0_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromAssignment_0_4()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1786:1: ( rule__CSSType__FromAssignment_0_4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1786:2: rule__CSSType__FromAssignment_0_4
            {
            pushFollow(FOLLOW_rule__CSSType__FromAssignment_0_4_in_rule__CSSType__Group_0__4__Impl3621);
            rule__CSSType__FromAssignment_0_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromAssignment_0_4()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1796:1: rule__CSSType__Group_0__5 : rule__CSSType__Group_0__5__Impl rule__CSSType__Group_0__6 ;
    public final void rule__CSSType__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1800:1: ( rule__CSSType__Group_0__5__Impl rule__CSSType__Group_0__6 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1801:2: rule__CSSType__Group_0__5__Impl rule__CSSType__Group_0__6
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__5__Impl_in_rule__CSSType__Group_0__53651);
            rule__CSSType__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__6_in_rule__CSSType__Group_0__53654);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1808:1: rule__CSSType__Group_0__5__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1812:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1813:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1813:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1814:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1815:1: ( RULE_WS )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_WS) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1815:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_0__5__Impl3682); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_5()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1825:1: rule__CSSType__Group_0__6 : rule__CSSType__Group_0__6__Impl rule__CSSType__Group_0__7 ;
    public final void rule__CSSType__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1829:1: ( rule__CSSType__Group_0__6__Impl rule__CSSType__Group_0__7 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1830:2: rule__CSSType__Group_0__6__Impl rule__CSSType__Group_0__7
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__6__Impl_in_rule__CSSType__Group_0__63713);
            rule__CSSType__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__7_in_rule__CSSType__Group_0__63716);
            rule__CSSType__Group_0__7();

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1837:1: rule__CSSType__Group_0__6__Impl : ( '->' ) ;
    public final void rule__CSSType__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1841:1: ( ( '->' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1842:1: ( '->' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1842:1: ( '->' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1843:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_0_6()); 
            }
            match(input,24,FOLLOW_24_in_rule__CSSType__Group_0__6__Impl3744); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_0_6()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__CSSType__Group_0__7"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1856:1: rule__CSSType__Group_0__7 : rule__CSSType__Group_0__7__Impl rule__CSSType__Group_0__8 ;
    public final void rule__CSSType__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1860:1: ( rule__CSSType__Group_0__7__Impl rule__CSSType__Group_0__8 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1861:2: rule__CSSType__Group_0__7__Impl rule__CSSType__Group_0__8
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__7__Impl_in_rule__CSSType__Group_0__73775);
            rule__CSSType__Group_0__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__8_in_rule__CSSType__Group_0__73778);
            rule__CSSType__Group_0__8();

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
    // $ANTLR end "rule__CSSType__Group_0__7"


    // $ANTLR start "rule__CSSType__Group_0__7__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1868:1: rule__CSSType__Group_0__7__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1872:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1873:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1873:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1874:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_7()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1875:1: ( RULE_WS )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_WS) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1875:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_0__7__Impl3806); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__7__Impl"


    // $ANTLR start "rule__CSSType__Group_0__8"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1885:1: rule__CSSType__Group_0__8 : rule__CSSType__Group_0__8__Impl rule__CSSType__Group_0__9 ;
    public final void rule__CSSType__Group_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1889:1: ( rule__CSSType__Group_0__8__Impl rule__CSSType__Group_0__9 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1890:2: rule__CSSType__Group_0__8__Impl rule__CSSType__Group_0__9
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__8__Impl_in_rule__CSSType__Group_0__83837);
            rule__CSSType__Group_0__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__9_in_rule__CSSType__Group_0__83840);
            rule__CSSType__Group_0__9();

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
    // $ANTLR end "rule__CSSType__Group_0__8"


    // $ANTLR start "rule__CSSType__Group_0__8__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1897:1: rule__CSSType__Group_0__8__Impl : ( ( rule__CSSType__ToAssignment_0_8 ) ) ;
    public final void rule__CSSType__Group_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1901:1: ( ( ( rule__CSSType__ToAssignment_0_8 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1902:1: ( ( rule__CSSType__ToAssignment_0_8 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1902:1: ( ( rule__CSSType__ToAssignment_0_8 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1903:1: ( rule__CSSType__ToAssignment_0_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToAssignment_0_8()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1904:1: ( rule__CSSType__ToAssignment_0_8 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1904:2: rule__CSSType__ToAssignment_0_8
            {
            pushFollow(FOLLOW_rule__CSSType__ToAssignment_0_8_in_rule__CSSType__Group_0__8__Impl3867);
            rule__CSSType__ToAssignment_0_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToAssignment_0_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__8__Impl"


    // $ANTLR start "rule__CSSType__Group_0__9"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1914:1: rule__CSSType__Group_0__9 : rule__CSSType__Group_0__9__Impl rule__CSSType__Group_0__10 ;
    public final void rule__CSSType__Group_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1918:1: ( rule__CSSType__Group_0__9__Impl rule__CSSType__Group_0__10 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1919:2: rule__CSSType__Group_0__9__Impl rule__CSSType__Group_0__10
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__9__Impl_in_rule__CSSType__Group_0__93897);
            rule__CSSType__Group_0__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_0__10_in_rule__CSSType__Group_0__93900);
            rule__CSSType__Group_0__10();

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
    // $ANTLR end "rule__CSSType__Group_0__9"


    // $ANTLR start "rule__CSSType__Group_0__9__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1926:1: rule__CSSType__Group_0__9__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1930:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1931:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1931:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1932:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_9()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1933:1: ( RULE_WS )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_WS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1933:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_0__9__Impl3928); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__9__Impl"


    // $ANTLR start "rule__CSSType__Group_0__10"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1943:1: rule__CSSType__Group_0__10 : rule__CSSType__Group_0__10__Impl ;
    public final void rule__CSSType__Group_0__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1947:1: ( rule__CSSType__Group_0__10__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1948:2: rule__CSSType__Group_0__10__Impl
            {
            pushFollow(FOLLOW_rule__CSSType__Group_0__10__Impl_in_rule__CSSType__Group_0__103959);
            rule__CSSType__Group_0__10__Impl();

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
    // $ANTLR end "rule__CSSType__Group_0__10"


    // $ANTLR start "rule__CSSType__Group_0__10__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1954:1: rule__CSSType__Group_0__10__Impl : ( ')' ) ;
    public final void rule__CSSType__Group_0__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1958:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1959:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1959:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1960:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_0_10()); 
            }
            match(input,25,FOLLOW_25_in_rule__CSSType__Group_0__10__Impl3987); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_0_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__10__Impl"


    // $ANTLR start "rule__CSSType__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1995:1: rule__CSSType__Group_1__0 : rule__CSSType__Group_1__0__Impl rule__CSSType__Group_1__1 ;
    public final void rule__CSSType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:1999:1: ( rule__CSSType__Group_1__0__Impl rule__CSSType__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2000:2: rule__CSSType__Group_1__0__Impl rule__CSSType__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__0__Impl_in_rule__CSSType__Group_1__04040);
            rule__CSSType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__1_in_rule__CSSType__Group_1__04043);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2007:1: rule__CSSType__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2011:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2012:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2012:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2013:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getCSSRangedDoubleTypeAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2014:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2016:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2026:1: rule__CSSType__Group_1__1 : rule__CSSType__Group_1__1__Impl rule__CSSType__Group_1__2 ;
    public final void rule__CSSType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2030:1: ( rule__CSSType__Group_1__1__Impl rule__CSSType__Group_1__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2031:2: rule__CSSType__Group_1__1__Impl rule__CSSType__Group_1__2
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__1__Impl_in_rule__CSSType__Group_1__14101);
            rule__CSSType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__2_in_rule__CSSType__Group_1__14104);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2038:1: rule__CSSType__Group_1__1__Impl : ( ( rule__CSSType__TypeAssignment_1_1 ) ) ;
    public final void rule__CSSType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2042:1: ( ( ( rule__CSSType__TypeAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2043:1: ( ( rule__CSSType__TypeAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2043:1: ( ( rule__CSSType__TypeAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2044:1: ( rule__CSSType__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2045:1: ( rule__CSSType__TypeAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2045:2: rule__CSSType__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CSSType__TypeAssignment_1_1_in_rule__CSSType__Group_1__1__Impl4131);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2055:1: rule__CSSType__Group_1__2 : rule__CSSType__Group_1__2__Impl rule__CSSType__Group_1__3 ;
    public final void rule__CSSType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2059:1: ( rule__CSSType__Group_1__2__Impl rule__CSSType__Group_1__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2060:2: rule__CSSType__Group_1__2__Impl rule__CSSType__Group_1__3
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__2__Impl_in_rule__CSSType__Group_1__24161);
            rule__CSSType__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__3_in_rule__CSSType__Group_1__24164);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2067:1: rule__CSSType__Group_1__2__Impl : ( '(' ) ;
    public final void rule__CSSType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2071:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2072:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2072:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2073:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_1_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__CSSType__Group_1__2__Impl4192); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2086:1: rule__CSSType__Group_1__3 : rule__CSSType__Group_1__3__Impl rule__CSSType__Group_1__4 ;
    public final void rule__CSSType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2090:1: ( rule__CSSType__Group_1__3__Impl rule__CSSType__Group_1__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2091:2: rule__CSSType__Group_1__3__Impl rule__CSSType__Group_1__4
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__3__Impl_in_rule__CSSType__Group_1__34223);
            rule__CSSType__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__4_in_rule__CSSType__Group_1__34226);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2098:1: rule__CSSType__Group_1__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2102:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2103:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2103:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2104:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2105:1: ( RULE_WS )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_WS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2105:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_1__3__Impl4254); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_3()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2115:1: rule__CSSType__Group_1__4 : rule__CSSType__Group_1__4__Impl rule__CSSType__Group_1__5 ;
    public final void rule__CSSType__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2119:1: ( rule__CSSType__Group_1__4__Impl rule__CSSType__Group_1__5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2120:2: rule__CSSType__Group_1__4__Impl rule__CSSType__Group_1__5
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__4__Impl_in_rule__CSSType__Group_1__44285);
            rule__CSSType__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__5_in_rule__CSSType__Group_1__44288);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2127:1: rule__CSSType__Group_1__4__Impl : ( ( rule__CSSType__FromAssignment_1_4 ) ) ;
    public final void rule__CSSType__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2131:1: ( ( ( rule__CSSType__FromAssignment_1_4 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2132:1: ( ( rule__CSSType__FromAssignment_1_4 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2132:1: ( ( rule__CSSType__FromAssignment_1_4 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2133:1: ( rule__CSSType__FromAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromAssignment_1_4()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2134:1: ( rule__CSSType__FromAssignment_1_4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2134:2: rule__CSSType__FromAssignment_1_4
            {
            pushFollow(FOLLOW_rule__CSSType__FromAssignment_1_4_in_rule__CSSType__Group_1__4__Impl4315);
            rule__CSSType__FromAssignment_1_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromAssignment_1_4()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2144:1: rule__CSSType__Group_1__5 : rule__CSSType__Group_1__5__Impl rule__CSSType__Group_1__6 ;
    public final void rule__CSSType__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2148:1: ( rule__CSSType__Group_1__5__Impl rule__CSSType__Group_1__6 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2149:2: rule__CSSType__Group_1__5__Impl rule__CSSType__Group_1__6
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__5__Impl_in_rule__CSSType__Group_1__54345);
            rule__CSSType__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__6_in_rule__CSSType__Group_1__54348);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2156:1: rule__CSSType__Group_1__5__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2160:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2161:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2161:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2162:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2163:1: ( RULE_WS )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2163:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_1__5__Impl4376); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_5()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2173:1: rule__CSSType__Group_1__6 : rule__CSSType__Group_1__6__Impl rule__CSSType__Group_1__7 ;
    public final void rule__CSSType__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2177:1: ( rule__CSSType__Group_1__6__Impl rule__CSSType__Group_1__7 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2178:2: rule__CSSType__Group_1__6__Impl rule__CSSType__Group_1__7
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__6__Impl_in_rule__CSSType__Group_1__64407);
            rule__CSSType__Group_1__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__7_in_rule__CSSType__Group_1__64410);
            rule__CSSType__Group_1__7();

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2185:1: rule__CSSType__Group_1__6__Impl : ( '->' ) ;
    public final void rule__CSSType__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2189:1: ( ( '->' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2190:1: ( '->' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2190:1: ( '->' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2191:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_6()); 
            }
            match(input,24,FOLLOW_24_in_rule__CSSType__Group_1__6__Impl4438); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_6()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__CSSType__Group_1__7"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2204:1: rule__CSSType__Group_1__7 : rule__CSSType__Group_1__7__Impl rule__CSSType__Group_1__8 ;
    public final void rule__CSSType__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2208:1: ( rule__CSSType__Group_1__7__Impl rule__CSSType__Group_1__8 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2209:2: rule__CSSType__Group_1__7__Impl rule__CSSType__Group_1__8
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__7__Impl_in_rule__CSSType__Group_1__74469);
            rule__CSSType__Group_1__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__8_in_rule__CSSType__Group_1__74472);
            rule__CSSType__Group_1__8();

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
    // $ANTLR end "rule__CSSType__Group_1__7"


    // $ANTLR start "rule__CSSType__Group_1__7__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2216:1: rule__CSSType__Group_1__7__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2220:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2221:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2221:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2222:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_7()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2223:1: ( RULE_WS )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_WS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2223:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_1__7__Impl4500); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__7__Impl"


    // $ANTLR start "rule__CSSType__Group_1__8"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2233:1: rule__CSSType__Group_1__8 : rule__CSSType__Group_1__8__Impl rule__CSSType__Group_1__9 ;
    public final void rule__CSSType__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2237:1: ( rule__CSSType__Group_1__8__Impl rule__CSSType__Group_1__9 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2238:2: rule__CSSType__Group_1__8__Impl rule__CSSType__Group_1__9
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__8__Impl_in_rule__CSSType__Group_1__84531);
            rule__CSSType__Group_1__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__9_in_rule__CSSType__Group_1__84534);
            rule__CSSType__Group_1__9();

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
    // $ANTLR end "rule__CSSType__Group_1__8"


    // $ANTLR start "rule__CSSType__Group_1__8__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2245:1: rule__CSSType__Group_1__8__Impl : ( ( rule__CSSType__ToAssignment_1_8 ) ) ;
    public final void rule__CSSType__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2249:1: ( ( ( rule__CSSType__ToAssignment_1_8 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2250:1: ( ( rule__CSSType__ToAssignment_1_8 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2250:1: ( ( rule__CSSType__ToAssignment_1_8 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2251:1: ( rule__CSSType__ToAssignment_1_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToAssignment_1_8()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2252:1: ( rule__CSSType__ToAssignment_1_8 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2252:2: rule__CSSType__ToAssignment_1_8
            {
            pushFollow(FOLLOW_rule__CSSType__ToAssignment_1_8_in_rule__CSSType__Group_1__8__Impl4561);
            rule__CSSType__ToAssignment_1_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToAssignment_1_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__8__Impl"


    // $ANTLR start "rule__CSSType__Group_1__9"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2262:1: rule__CSSType__Group_1__9 : rule__CSSType__Group_1__9__Impl rule__CSSType__Group_1__10 ;
    public final void rule__CSSType__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2266:1: ( rule__CSSType__Group_1__9__Impl rule__CSSType__Group_1__10 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2267:2: rule__CSSType__Group_1__9__Impl rule__CSSType__Group_1__10
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__9__Impl_in_rule__CSSType__Group_1__94591);
            rule__CSSType__Group_1__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSType__Group_1__10_in_rule__CSSType__Group_1__94594);
            rule__CSSType__Group_1__10();

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
    // $ANTLR end "rule__CSSType__Group_1__9"


    // $ANTLR start "rule__CSSType__Group_1__9__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2274:1: rule__CSSType__Group_1__9__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2278:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2279:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2279:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2280:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_9()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2281:1: ( RULE_WS )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2281:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSType__Group_1__9__Impl4622); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__9__Impl"


    // $ANTLR start "rule__CSSType__Group_1__10"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2291:1: rule__CSSType__Group_1__10 : rule__CSSType__Group_1__10__Impl ;
    public final void rule__CSSType__Group_1__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2295:1: ( rule__CSSType__Group_1__10__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2296:2: rule__CSSType__Group_1__10__Impl
            {
            pushFollow(FOLLOW_rule__CSSType__Group_1__10__Impl_in_rule__CSSType__Group_1__104653);
            rule__CSSType__Group_1__10__Impl();

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
    // $ANTLR end "rule__CSSType__Group_1__10"


    // $ANTLR start "rule__CSSType__Group_1__10__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2302:1: rule__CSSType__Group_1__10__Impl : ( ')' ) ;
    public final void rule__CSSType__Group_1__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2306:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2307:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2307:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2308:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_1_10()); 
            }
            match(input,25,FOLLOW_25_in_rule__CSSType__Group_1__10__Impl4681); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_1_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__10__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2343:1: rule__ElementDefinition__Group__0 : rule__ElementDefinition__Group__0__Impl rule__ElementDefinition__Group__1 ;
    public final void rule__ElementDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2347:1: ( rule__ElementDefinition__Group__0__Impl rule__ElementDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2348:2: rule__ElementDefinition__Group__0__Impl rule__ElementDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__0__Impl_in_rule__ElementDefinition__Group__04734);
            rule__ElementDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group__1_in_rule__ElementDefinition__Group__04737);
            rule__ElementDefinition__Group__1();

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
    // $ANTLR end "rule__ElementDefinition__Group__0"


    // $ANTLR start "rule__ElementDefinition__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2355:1: rule__ElementDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ElementDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2359:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2360:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2360:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2361:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getElementDefinitionAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2362:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2364:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getElementDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__0__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2374:1: rule__ElementDefinition__Group__1 : rule__ElementDefinition__Group__1__Impl rule__ElementDefinition__Group__2 ;
    public final void rule__ElementDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2378:1: ( rule__ElementDefinition__Group__1__Impl rule__ElementDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2379:2: rule__ElementDefinition__Group__1__Impl rule__ElementDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__1__Impl_in_rule__ElementDefinition__Group__14795);
            rule__ElementDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group__2_in_rule__ElementDefinition__Group__14798);
            rule__ElementDefinition__Group__2();

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
    // $ANTLR end "rule__ElementDefinition__Group__1"


    // $ANTLR start "rule__ElementDefinition__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2386:1: rule__ElementDefinition__Group__1__Impl : ( ( rule__ElementDefinition__DokuAssignment_1 )? ) ;
    public final void rule__ElementDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2390:1: ( ( ( rule__ElementDefinition__DokuAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2391:1: ( ( rule__ElementDefinition__DokuAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2391:1: ( ( rule__ElementDefinition__DokuAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2392:1: ( rule__ElementDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getDokuAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2393:1: ( rule__ElementDefinition__DokuAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_JDOC) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2393:2: rule__ElementDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ElementDefinition__DokuAssignment_1_in_rule__ElementDefinition__Group__1__Impl4825);
                    rule__ElementDefinition__DokuAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getDokuAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__1__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2403:1: rule__ElementDefinition__Group__2 : rule__ElementDefinition__Group__2__Impl rule__ElementDefinition__Group__3 ;
    public final void rule__ElementDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2407:1: ( rule__ElementDefinition__Group__2__Impl rule__ElementDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2408:2: rule__ElementDefinition__Group__2__Impl rule__ElementDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__2__Impl_in_rule__ElementDefinition__Group__24856);
            rule__ElementDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group__3_in_rule__ElementDefinition__Group__24859);
            rule__ElementDefinition__Group__3();

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
    // $ANTLR end "rule__ElementDefinition__Group__2"


    // $ANTLR start "rule__ElementDefinition__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2415:1: rule__ElementDefinition__Group__2__Impl : ( ( rule__ElementDefinition__NameAssignment_2 ) ) ;
    public final void rule__ElementDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2419:1: ( ( ( rule__ElementDefinition__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2420:1: ( ( rule__ElementDefinition__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2420:1: ( ( rule__ElementDefinition__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2421:1: ( rule__ElementDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2422:1: ( rule__ElementDefinition__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2422:2: rule__ElementDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ElementDefinition__NameAssignment_2_in_rule__ElementDefinition__Group__2__Impl4886);
            rule__ElementDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__2__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2432:1: rule__ElementDefinition__Group__3 : rule__ElementDefinition__Group__3__Impl rule__ElementDefinition__Group__4 ;
    public final void rule__ElementDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2436:1: ( rule__ElementDefinition__Group__3__Impl rule__ElementDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2437:2: rule__ElementDefinition__Group__3__Impl rule__ElementDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__3__Impl_in_rule__ElementDefinition__Group__34916);
            rule__ElementDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group__4_in_rule__ElementDefinition__Group__34919);
            rule__ElementDefinition__Group__4();

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
    // $ANTLR end "rule__ElementDefinition__Group__3"


    // $ANTLR start "rule__ElementDefinition__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2444:1: rule__ElementDefinition__Group__3__Impl : ( ( rule__ElementDefinition__Group_3__0 )? ) ;
    public final void rule__ElementDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2448:1: ( ( ( rule__ElementDefinition__Group_3__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2449:1: ( ( rule__ElementDefinition__Group_3__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2449:1: ( ( rule__ElementDefinition__Group_3__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2450:1: ( rule__ElementDefinition__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getGroup_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2451:1: ( rule__ElementDefinition__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2451:2: rule__ElementDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ElementDefinition__Group_3__0_in_rule__ElementDefinition__Group__3__Impl4946);
                    rule__ElementDefinition__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__3__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2461:1: rule__ElementDefinition__Group__4 : rule__ElementDefinition__Group__4__Impl rule__ElementDefinition__Group__5 ;
    public final void rule__ElementDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2465:1: ( rule__ElementDefinition__Group__4__Impl rule__ElementDefinition__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2466:2: rule__ElementDefinition__Group__4__Impl rule__ElementDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__4__Impl_in_rule__ElementDefinition__Group__44977);
            rule__ElementDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group__5_in_rule__ElementDefinition__Group__44980);
            rule__ElementDefinition__Group__5();

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
    // $ANTLR end "rule__ElementDefinition__Group__4"


    // $ANTLR start "rule__ElementDefinition__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2473:1: rule__ElementDefinition__Group__4__Impl : ( '{' ) ;
    public final void rule__ElementDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2477:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2478:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2478:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2479:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,21,FOLLOW_21_in_rule__ElementDefinition__Group__4__Impl5008); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__4__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__5"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2492:1: rule__ElementDefinition__Group__5 : rule__ElementDefinition__Group__5__Impl rule__ElementDefinition__Group__6 ;
    public final void rule__ElementDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2496:1: ( rule__ElementDefinition__Group__5__Impl rule__ElementDefinition__Group__6 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2497:2: rule__ElementDefinition__Group__5__Impl rule__ElementDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__5__Impl_in_rule__ElementDefinition__Group__55039);
            rule__ElementDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group__6_in_rule__ElementDefinition__Group__55042);
            rule__ElementDefinition__Group__6();

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
    // $ANTLR end "rule__ElementDefinition__Group__5"


    // $ANTLR start "rule__ElementDefinition__Group__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2504:1: rule__ElementDefinition__Group__5__Impl : ( ( rule__ElementDefinition__Alternatives_5 )* ) ;
    public final void rule__ElementDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2508:1: ( ( ( rule__ElementDefinition__Alternatives_5 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2509:1: ( ( rule__ElementDefinition__Alternatives_5 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2509:1: ( ( rule__ElementDefinition__Alternatives_5 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2510:1: ( rule__ElementDefinition__Alternatives_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getAlternatives_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2511:1: ( rule__ElementDefinition__Alternatives_5 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==RULE_JDOC||LA23_0==RULE_PSEUDO) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2511:2: rule__ElementDefinition__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__ElementDefinition__Alternatives_5_in_rule__ElementDefinition__Group__5__Impl5069);
            	    rule__ElementDefinition__Alternatives_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getAlternatives_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__5__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__6"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2521:1: rule__ElementDefinition__Group__6 : rule__ElementDefinition__Group__6__Impl ;
    public final void rule__ElementDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2525:1: ( rule__ElementDefinition__Group__6__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2526:2: rule__ElementDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group__6__Impl_in_rule__ElementDefinition__Group__65100);
            rule__ElementDefinition__Group__6__Impl();

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
    // $ANTLR end "rule__ElementDefinition__Group__6"


    // $ANTLR start "rule__ElementDefinition__Group__6__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2532:1: rule__ElementDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__ElementDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2536:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2537:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2537:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2538:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,22,FOLLOW_22_in_rule__ElementDefinition__Group__6__Impl5128); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__6__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2565:1: rule__ElementDefinition__Group_3__0 : rule__ElementDefinition__Group_3__0__Impl rule__ElementDefinition__Group_3__1 ;
    public final void rule__ElementDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2569:1: ( rule__ElementDefinition__Group_3__0__Impl rule__ElementDefinition__Group_3__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2570:2: rule__ElementDefinition__Group_3__0__Impl rule__ElementDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3__0__Impl_in_rule__ElementDefinition__Group_3__05173);
            rule__ElementDefinition__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3__1_in_rule__ElementDefinition__Group_3__05176);
            rule__ElementDefinition__Group_3__1();

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
    // $ANTLR end "rule__ElementDefinition__Group_3__0"


    // $ANTLR start "rule__ElementDefinition__Group_3__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2577:1: rule__ElementDefinition__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__ElementDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2581:1: ( ( 'extends' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2582:1: ( 'extends' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2582:1: ( 'extends' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2583:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getExtendsKeyword_3_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__ElementDefinition__Group_3__0__Impl5204); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getExtendsKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2596:1: rule__ElementDefinition__Group_3__1 : rule__ElementDefinition__Group_3__1__Impl rule__ElementDefinition__Group_3__2 ;
    public final void rule__ElementDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2600:1: ( rule__ElementDefinition__Group_3__1__Impl rule__ElementDefinition__Group_3__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2601:2: rule__ElementDefinition__Group_3__1__Impl rule__ElementDefinition__Group_3__2
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3__1__Impl_in_rule__ElementDefinition__Group_3__15235);
            rule__ElementDefinition__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3__2_in_rule__ElementDefinition__Group_3__15238);
            rule__ElementDefinition__Group_3__2();

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
    // $ANTLR end "rule__ElementDefinition__Group_3__1"


    // $ANTLR start "rule__ElementDefinition__Group_3__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2608:1: rule__ElementDefinition__Group_3__1__Impl : ( ( rule__ElementDefinition__SuperAssignment_3_1 ) ) ;
    public final void rule__ElementDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2612:1: ( ( ( rule__ElementDefinition__SuperAssignment_3_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2613:1: ( ( rule__ElementDefinition__SuperAssignment_3_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2613:1: ( ( rule__ElementDefinition__SuperAssignment_3_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2614:1: ( rule__ElementDefinition__SuperAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2615:1: ( rule__ElementDefinition__SuperAssignment_3_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2615:2: rule__ElementDefinition__SuperAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ElementDefinition__SuperAssignment_3_1_in_rule__ElementDefinition__Group_3__1__Impl5265);
            rule__ElementDefinition__SuperAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2625:1: rule__ElementDefinition__Group_3__2 : rule__ElementDefinition__Group_3__2__Impl ;
    public final void rule__ElementDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2629:1: ( rule__ElementDefinition__Group_3__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2630:2: rule__ElementDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3__2__Impl_in_rule__ElementDefinition__Group_3__25295);
            rule__ElementDefinition__Group_3__2__Impl();

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
    // $ANTLR end "rule__ElementDefinition__Group_3__2"


    // $ANTLR start "rule__ElementDefinition__Group_3__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2636:1: rule__ElementDefinition__Group_3__2__Impl : ( ( rule__ElementDefinition__Group_3_2__0 )* ) ;
    public final void rule__ElementDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2640:1: ( ( ( rule__ElementDefinition__Group_3_2__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2641:1: ( ( rule__ElementDefinition__Group_3_2__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2641:1: ( ( rule__ElementDefinition__Group_3_2__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2642:1: ( rule__ElementDefinition__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getGroup_3_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2643:1: ( rule__ElementDefinition__Group_3_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2643:2: rule__ElementDefinition__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ElementDefinition__Group_3_2__0_in_rule__ElementDefinition__Group_3__2__Impl5322);
            	    rule__ElementDefinition__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2659:1: rule__ElementDefinition__Group_3_2__0 : rule__ElementDefinition__Group_3_2__0__Impl rule__ElementDefinition__Group_3_2__1 ;
    public final void rule__ElementDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2663:1: ( rule__ElementDefinition__Group_3_2__0__Impl rule__ElementDefinition__Group_3_2__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2664:2: rule__ElementDefinition__Group_3_2__0__Impl rule__ElementDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3_2__0__Impl_in_rule__ElementDefinition__Group_3_2__05359);
            rule__ElementDefinition__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3_2__1_in_rule__ElementDefinition__Group_3_2__05362);
            rule__ElementDefinition__Group_3_2__1();

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
    // $ANTLR end "rule__ElementDefinition__Group_3_2__0"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2671:1: rule__ElementDefinition__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ElementDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2675:1: ( ( ',' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2676:1: ( ',' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2676:1: ( ',' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2677:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__ElementDefinition__Group_3_2__0__Impl5390); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_3_2__0__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2690:1: rule__ElementDefinition__Group_3_2__1 : rule__ElementDefinition__Group_3_2__1__Impl ;
    public final void rule__ElementDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2694:1: ( rule__ElementDefinition__Group_3_2__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2695:2: rule__ElementDefinition__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Group_3_2__1__Impl_in_rule__ElementDefinition__Group_3_2__15421);
            rule__ElementDefinition__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__ElementDefinition__Group_3_2__1"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2701:1: rule__ElementDefinition__Group_3_2__1__Impl : ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) ) ;
    public final void rule__ElementDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2705:1: ( ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2706:1: ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2706:1: ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2707:1: ( rule__ElementDefinition__SuperAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_2_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2708:1: ( rule__ElementDefinition__SuperAssignment_3_2_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2708:2: rule__ElementDefinition__SuperAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__ElementDefinition__SuperAssignment_3_2_1_in_rule__ElementDefinition__Group_3_2__1__Impl5448);
            rule__ElementDefinition__SuperAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_3_2__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2722:1: rule__PropertyDefinition__Group__0 : rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 ;
    public final void rule__PropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2726:1: ( rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2727:2: rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__05482);
            rule__PropertyDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__05485);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2734:1: rule__PropertyDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2738:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2739:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2739:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2740:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2741:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2743:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2753:1: rule__PropertyDefinition__Group__1 : rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 ;
    public final void rule__PropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2757:1: ( rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2758:2: rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__15543);
            rule__PropertyDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__15546);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2765:1: rule__PropertyDefinition__Group__1__Impl : ( ( rule__PropertyDefinition__DokuAssignment_1 )? ) ;
    public final void rule__PropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2769:1: ( ( ( rule__PropertyDefinition__DokuAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2770:1: ( ( rule__PropertyDefinition__DokuAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2770:1: ( ( rule__PropertyDefinition__DokuAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2771:1: ( rule__PropertyDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDokuAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2772:1: ( rule__PropertyDefinition__DokuAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_JDOC) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2772:2: rule__PropertyDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__DokuAssignment_1_in_rule__PropertyDefinition__Group__1__Impl5573);
                    rule__PropertyDefinition__DokuAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDokuAssignment_1()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2782:1: rule__PropertyDefinition__Group__2 : rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 ;
    public final void rule__PropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2786:1: ( rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2787:2: rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__25604);
            rule__PropertyDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__25607);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2794:1: rule__PropertyDefinition__Group__2__Impl : ( ( rule__PropertyDefinition__NameAssignment_2 ) ) ;
    public final void rule__PropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2798:1: ( ( ( rule__PropertyDefinition__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2799:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2799:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2800:1: ( rule__PropertyDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2801:1: ( rule__PropertyDefinition__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2801:2: rule__PropertyDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__NameAssignment_2_in_rule__PropertyDefinition__Group__2__Impl5634);
            rule__PropertyDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2811:1: rule__PropertyDefinition__Group__3 : rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 ;
    public final void rule__PropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2815:1: ( rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2816:2: rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__35664);
            rule__PropertyDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__35667);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2823:1: rule__PropertyDefinition__Group__3__Impl : ( ( rule__PropertyDefinition__RuleAssignment_3 ) ) ;
    public final void rule__PropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2827:1: ( ( ( rule__PropertyDefinition__RuleAssignment_3 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2828:1: ( ( rule__PropertyDefinition__RuleAssignment_3 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2828:1: ( ( rule__PropertyDefinition__RuleAssignment_3 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2829:1: ( rule__PropertyDefinition__RuleAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getRuleAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2830:1: ( rule__PropertyDefinition__RuleAssignment_3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2830:2: rule__PropertyDefinition__RuleAssignment_3
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__RuleAssignment_3_in_rule__PropertyDefinition__Group__3__Impl5694);
            rule__PropertyDefinition__RuleAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getRuleAssignment_3()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2840:1: rule__PropertyDefinition__Group__4 : rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 ;
    public final void rule__PropertyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2844:1: ( rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2845:2: rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__45724);
            rule__PropertyDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__45727);
            rule__PropertyDefinition__Group__5();

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2852:1: rule__PropertyDefinition__Group__4__Impl : ( ( rule__PropertyDefinition__Group_4__0 )? ) ;
    public final void rule__PropertyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2856:1: ( ( ( rule__PropertyDefinition__Group_4__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2857:1: ( ( rule__PropertyDefinition__Group_4__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2857:1: ( ( rule__PropertyDefinition__Group_4__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2858:1: ( rule__PropertyDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getGroup_4()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2859:1: ( rule__PropertyDefinition__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2859:2: rule__PropertyDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__0_in_rule__PropertyDefinition__Group__4__Impl5754);
                    rule__PropertyDefinition__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getGroup_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__PropertyDefinition__Group__5"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2869:1: rule__PropertyDefinition__Group__5 : rule__PropertyDefinition__Group__5__Impl ;
    public final void rule__PropertyDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2873:1: ( rule__PropertyDefinition__Group__5__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2874:2: rule__PropertyDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__55785);
            rule__PropertyDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group__5"


    // $ANTLR start "rule__PropertyDefinition__Group__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2880:1: rule__PropertyDefinition__Group__5__Impl : ( ';' ) ;
    public final void rule__PropertyDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2884:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2885:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2885:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2886:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FOLLOW_28_in_rule__PropertyDefinition__Group__5__Impl5813); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__5__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2911:1: rule__PropertyDefinition__Group_4__0 : rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1 ;
    public final void rule__PropertyDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2915:1: ( rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2916:2: rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__0__Impl_in_rule__PropertyDefinition__Group_4__05856);
            rule__PropertyDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__1_in_rule__PropertyDefinition__Group_4__05859);
            rule__PropertyDefinition__Group_4__1();

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
    // $ANTLR end "rule__PropertyDefinition__Group_4__0"


    // $ANTLR start "rule__PropertyDefinition__Group_4__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2923:1: rule__PropertyDefinition__Group_4__0__Impl : ( 'default:' ) ;
    public final void rule__PropertyDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2927:1: ( ( 'default:' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2928:1: ( 'default:' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2928:1: ( 'default:' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2929:1: 'default:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_4_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__PropertyDefinition__Group_4__0__Impl5887); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2942:1: rule__PropertyDefinition__Group_4__1 : rule__PropertyDefinition__Group_4__1__Impl ;
    public final void rule__PropertyDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2946:1: ( rule__PropertyDefinition__Group_4__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2947:2: rule__PropertyDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__1__Impl_in_rule__PropertyDefinition__Group_4__15918);
            rule__PropertyDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group_4__1"


    // $ANTLR start "rule__PropertyDefinition__Group_4__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2953:1: rule__PropertyDefinition__Group_4__1__Impl : ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) ) ;
    public final void rule__PropertyDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2957:1: ( ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2958:1: ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2958:1: ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2959:1: ( rule__PropertyDefinition__DefaultAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultAssignment_4_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2960:1: ( rule__PropertyDefinition__DefaultAssignment_4_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2960:2: rule__PropertyDefinition__DefaultAssignment_4_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__DefaultAssignment_4_1_in_rule__PropertyDefinition__Group_4__1__Impl5945);
            rule__PropertyDefinition__DefaultAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDefaultAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__PseudoClassDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2974:1: rule__PseudoClassDefinition__Group__0 : rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1 ;
    public final void rule__PseudoClassDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2978:1: ( rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2979:2: rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__0__Impl_in_rule__PseudoClassDefinition__Group__05979);
            rule__PseudoClassDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__1_in_rule__PseudoClassDefinition__Group__05982);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2986:1: rule__PseudoClassDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PseudoClassDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2990:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2991:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2991:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2992:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getPseudoClassDefinitionAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2993:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:2995:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getPseudoClassDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassDefinition__Group__0__Impl"


    // $ANTLR start "rule__PseudoClassDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3005:1: rule__PseudoClassDefinition__Group__1 : rule__PseudoClassDefinition__Group__1__Impl rule__PseudoClassDefinition__Group__2 ;
    public final void rule__PseudoClassDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3009:1: ( rule__PseudoClassDefinition__Group__1__Impl rule__PseudoClassDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3010:2: rule__PseudoClassDefinition__Group__1__Impl rule__PseudoClassDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__1__Impl_in_rule__PseudoClassDefinition__Group__16040);
            rule__PseudoClassDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__2_in_rule__PseudoClassDefinition__Group__16043);
            rule__PseudoClassDefinition__Group__2();

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3017:1: rule__PseudoClassDefinition__Group__1__Impl : ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? ) ;
    public final void rule__PseudoClassDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3021:1: ( ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3022:1: ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3022:1: ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3023:1: ( rule__PseudoClassDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getDokuAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3024:1: ( rule__PseudoClassDefinition__DokuAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_JDOC) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3024:2: rule__PseudoClassDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PseudoClassDefinition__DokuAssignment_1_in_rule__PseudoClassDefinition__Group__1__Impl6070);
                    rule__PseudoClassDefinition__DokuAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getDokuAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__PseudoClassDefinition__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3034:1: rule__PseudoClassDefinition__Group__2 : rule__PseudoClassDefinition__Group__2__Impl ;
    public final void rule__PseudoClassDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3038:1: ( rule__PseudoClassDefinition__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3039:2: rule__PseudoClassDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__Group__2__Impl_in_rule__PseudoClassDefinition__Group__26101);
            rule__PseudoClassDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__PseudoClassDefinition__Group__2"


    // $ANTLR start "rule__PseudoClassDefinition__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3045:1: rule__PseudoClassDefinition__Group__2__Impl : ( ( rule__PseudoClassDefinition__NameAssignment_2 ) ) ;
    public final void rule__PseudoClassDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3049:1: ( ( ( rule__PseudoClassDefinition__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3050:1: ( ( rule__PseudoClassDefinition__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3050:1: ( ( rule__PseudoClassDefinition__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3051:1: ( rule__PseudoClassDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3052:1: ( rule__PseudoClassDefinition__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3052:2: rule__PseudoClassDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PseudoClassDefinition__NameAssignment_2_in_rule__PseudoClassDefinition__Group__2__Impl6128);
            rule__PseudoClassDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassDefinition__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3068:1: rule__CSSRuleRef__Group__0 : rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1 ;
    public final void rule__CSSRuleRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3072:1: ( rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3073:2: rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__0__Impl_in_rule__CSSRuleRef__Group__06164);
            rule__CSSRuleRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__1_in_rule__CSSRuleRef__Group__06167);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3080:1: rule__CSSRuleRef__Group__0__Impl : ( '<' ) ;
    public final void rule__CSSRuleRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3084:1: ( ( '<' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3085:1: ( '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3085:1: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3086:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__CSSRuleRef__Group__0__Impl6195); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3099:1: rule__CSSRuleRef__Group__1 : rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2 ;
    public final void rule__CSSRuleRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3103:1: ( rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3104:2: rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__1__Impl_in_rule__CSSRuleRef__Group__16226);
            rule__CSSRuleRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__2_in_rule__CSSRuleRef__Group__16229);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3111:1: rule__CSSRuleRef__Group__1__Impl : ( ( rule__CSSRuleRef__RefAssignment_1 ) ) ;
    public final void rule__CSSRuleRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3115:1: ( ( ( rule__CSSRuleRef__RefAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3116:1: ( ( rule__CSSRuleRef__RefAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3116:1: ( ( rule__CSSRuleRef__RefAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3117:1: ( rule__CSSRuleRef__RefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3118:1: ( rule__CSSRuleRef__RefAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3118:2: rule__CSSRuleRef__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__RefAssignment_1_in_rule__CSSRuleRef__Group__1__Impl6256);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3128:1: rule__CSSRuleRef__Group__2 : rule__CSSRuleRef__Group__2__Impl ;
    public final void rule__CSSRuleRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3132:1: ( rule__CSSRuleRef__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3133:2: rule__CSSRuleRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleRef__Group__2__Impl_in_rule__CSSRuleRef__Group__26286);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3139:1: rule__CSSRuleRef__Group__2__Impl : ( '>' ) ;
    public final void rule__CSSRuleRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3143:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3144:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3144:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3145:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getGreaterThanSignKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__CSSRuleRef__Group__2__Impl6314); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3164:1: rule__CSSRuleDefinition__Group__0 : rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1 ;
    public final void rule__CSSRuleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3168:1: ( rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3169:2: rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__0__Impl_in_rule__CSSRuleDefinition__Group__06351);
            rule__CSSRuleDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__1_in_rule__CSSRuleDefinition__Group__06354);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3176:1: rule__CSSRuleDefinition__Group__0__Impl : ( ( rule__CSSRuleDefinition__DokuAssignment_0 )? ) ;
    public final void rule__CSSRuleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3180:1: ( ( ( rule__CSSRuleDefinition__DokuAssignment_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3181:1: ( ( rule__CSSRuleDefinition__DokuAssignment_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3181:1: ( ( rule__CSSRuleDefinition__DokuAssignment_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3182:1: ( rule__CSSRuleDefinition__DokuAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getDokuAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3183:1: ( rule__CSSRuleDefinition__DokuAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_JDOC) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3183:2: rule__CSSRuleDefinition__DokuAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleDefinition__DokuAssignment_0_in_rule__CSSRuleDefinition__Group__0__Impl6381);
                    rule__CSSRuleDefinition__DokuAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getDokuAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3193:1: rule__CSSRuleDefinition__Group__1 : rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2 ;
    public final void rule__CSSRuleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3197:1: ( rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3198:2: rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__1__Impl_in_rule__CSSRuleDefinition__Group__16412);
            rule__CSSRuleDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__2_in_rule__CSSRuleDefinition__Group__16415);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3205:1: rule__CSSRuleDefinition__Group__1__Impl : ( ( rule__CSSRuleDefinition__NameAssignment_1 ) ) ;
    public final void rule__CSSRuleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3209:1: ( ( ( rule__CSSRuleDefinition__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3210:1: ( ( rule__CSSRuleDefinition__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3210:1: ( ( rule__CSSRuleDefinition__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3211:1: ( rule__CSSRuleDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3212:1: ( rule__CSSRuleDefinition__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3212:2: rule__CSSRuleDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__NameAssignment_1_in_rule__CSSRuleDefinition__Group__1__Impl6442);
            rule__CSSRuleDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3222:1: rule__CSSRuleDefinition__Group__2 : rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3 ;
    public final void rule__CSSRuleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3226:1: ( rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3227:2: rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__2__Impl_in_rule__CSSRuleDefinition__Group__26472);
            rule__CSSRuleDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__3_in_rule__CSSRuleDefinition__Group__26475);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3234:1: rule__CSSRuleDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__CSSRuleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3238:1: ( ( '=' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3239:1: ( '=' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3239:1: ( '=' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3240:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__CSSRuleDefinition__Group__2__Impl6503); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3253:1: rule__CSSRuleDefinition__Group__3 : rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4 ;
    public final void rule__CSSRuleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3257:1: ( rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3258:2: rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__3__Impl_in_rule__CSSRuleDefinition__Group__36534);
            rule__CSSRuleDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__4_in_rule__CSSRuleDefinition__Group__36537);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3265:1: rule__CSSRuleDefinition__Group__3__Impl : ( ( rule__CSSRuleDefinition__Alternatives_3 ) ) ;
    public final void rule__CSSRuleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3269:1: ( ( ( rule__CSSRuleDefinition__Alternatives_3 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3270:1: ( ( rule__CSSRuleDefinition__Alternatives_3 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3270:1: ( ( rule__CSSRuleDefinition__Alternatives_3 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3271:1: ( rule__CSSRuleDefinition__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getAlternatives_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3272:1: ( rule__CSSRuleDefinition__Alternatives_3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3272:2: rule__CSSRuleDefinition__Alternatives_3
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Alternatives_3_in_rule__CSSRuleDefinition__Group__3__Impl6564);
            rule__CSSRuleDefinition__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getAlternatives_3()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3282:1: rule__CSSRuleDefinition__Group__4 : rule__CSSRuleDefinition__Group__4__Impl ;
    public final void rule__CSSRuleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3286:1: ( rule__CSSRuleDefinition__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3287:2: rule__CSSRuleDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleDefinition__Group__4__Impl_in_rule__CSSRuleDefinition__Group__46594);
            rule__CSSRuleDefinition__Group__4__Impl();

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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3293:1: rule__CSSRuleDefinition__Group__4__Impl : ( ';' ) ;
    public final void rule__CSSRuleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3297:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3298:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3298:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3299:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__CSSRuleDefinition__Group__4__Impl6622); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__CSSRuleFunc__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3322:1: rule__CSSRuleFunc__Group__0 : rule__CSSRuleFunc__Group__0__Impl rule__CSSRuleFunc__Group__1 ;
    public final void rule__CSSRuleFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3326:1: ( rule__CSSRuleFunc__Group__0__Impl rule__CSSRuleFunc__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3327:2: rule__CSSRuleFunc__Group__0__Impl rule__CSSRuleFunc__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__0__Impl_in_rule__CSSRuleFunc__Group__06663);
            rule__CSSRuleFunc__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__1_in_rule__CSSRuleFunc__Group__06666);
            rule__CSSRuleFunc__Group__1();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__0"


    // $ANTLR start "rule__CSSRuleFunc__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3334:1: rule__CSSRuleFunc__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3338:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3339:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3339:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3340:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getCSSRuleFuncAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3341:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3343:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getCSSRuleFuncAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3353:1: rule__CSSRuleFunc__Group__1 : rule__CSSRuleFunc__Group__1__Impl rule__CSSRuleFunc__Group__2 ;
    public final void rule__CSSRuleFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3357:1: ( rule__CSSRuleFunc__Group__1__Impl rule__CSSRuleFunc__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3358:2: rule__CSSRuleFunc__Group__1__Impl rule__CSSRuleFunc__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__1__Impl_in_rule__CSSRuleFunc__Group__16724);
            rule__CSSRuleFunc__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__2_in_rule__CSSRuleFunc__Group__16727);
            rule__CSSRuleFunc__Group__2();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__1"


    // $ANTLR start "rule__CSSRuleFunc__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3365:1: rule__CSSRuleFunc__Group__1__Impl : ( ( rule__CSSRuleFunc__NameAssignment_1 ) ) ;
    public final void rule__CSSRuleFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3369:1: ( ( ( rule__CSSRuleFunc__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3370:1: ( ( rule__CSSRuleFunc__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3370:1: ( ( rule__CSSRuleFunc__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3371:1: ( rule__CSSRuleFunc__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3372:1: ( rule__CSSRuleFunc__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3372:2: rule__CSSRuleFunc__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__NameAssignment_1_in_rule__CSSRuleFunc__Group__1__Impl6754);
            rule__CSSRuleFunc__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3382:1: rule__CSSRuleFunc__Group__2 : rule__CSSRuleFunc__Group__2__Impl rule__CSSRuleFunc__Group__3 ;
    public final void rule__CSSRuleFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3386:1: ( rule__CSSRuleFunc__Group__2__Impl rule__CSSRuleFunc__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3387:2: rule__CSSRuleFunc__Group__2__Impl rule__CSSRuleFunc__Group__3
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__2__Impl_in_rule__CSSRuleFunc__Group__26784);
            rule__CSSRuleFunc__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__3_in_rule__CSSRuleFunc__Group__26787);
            rule__CSSRuleFunc__Group__3();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__2"


    // $ANTLR start "rule__CSSRuleFunc__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3394:1: rule__CSSRuleFunc__Group__2__Impl : ( '(' ) ;
    public final void rule__CSSRuleFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3398:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3399:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3399:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3400:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__CSSRuleFunc__Group__2__Impl6815); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3413:1: rule__CSSRuleFunc__Group__3 : rule__CSSRuleFunc__Group__3__Impl rule__CSSRuleFunc__Group__4 ;
    public final void rule__CSSRuleFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3417:1: ( rule__CSSRuleFunc__Group__3__Impl rule__CSSRuleFunc__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3418:2: rule__CSSRuleFunc__Group__3__Impl rule__CSSRuleFunc__Group__4
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__3__Impl_in_rule__CSSRuleFunc__Group__36846);
            rule__CSSRuleFunc__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__4_in_rule__CSSRuleFunc__Group__36849);
            rule__CSSRuleFunc__Group__4();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__3"


    // $ANTLR start "rule__CSSRuleFunc__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3425:1: rule__CSSRuleFunc__Group__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSRuleFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3429:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3430:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3430:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3431:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getWSTerminalRuleCall_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3432:1: ( RULE_WS )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_WS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3432:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CSSRuleFunc__Group__3__Impl6877); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getWSTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__3__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3442:1: rule__CSSRuleFunc__Group__4 : rule__CSSRuleFunc__Group__4__Impl rule__CSSRuleFunc__Group__5 ;
    public final void rule__CSSRuleFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3446:1: ( rule__CSSRuleFunc__Group__4__Impl rule__CSSRuleFunc__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3447:2: rule__CSSRuleFunc__Group__4__Impl rule__CSSRuleFunc__Group__5
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__4__Impl_in_rule__CSSRuleFunc__Group__46908);
            rule__CSSRuleFunc__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__5_in_rule__CSSRuleFunc__Group__46911);
            rule__CSSRuleFunc__Group__5();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__4"


    // $ANTLR start "rule__CSSRuleFunc__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3454:1: rule__CSSRuleFunc__Group__4__Impl : ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) ) ;
    public final void rule__CSSRuleFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3458:1: ( ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3459:1: ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3459:1: ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3460:1: ( rule__CSSRuleFunc__ParamsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getParamsAssignment_4()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3461:1: ( rule__CSSRuleFunc__ParamsAssignment_4 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3461:2: rule__CSSRuleFunc__ParamsAssignment_4
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__ParamsAssignment_4_in_rule__CSSRuleFunc__Group__4__Impl6938);
            rule__CSSRuleFunc__ParamsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getParamsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__4__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__5"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3471:1: rule__CSSRuleFunc__Group__5 : rule__CSSRuleFunc__Group__5__Impl ;
    public final void rule__CSSRuleFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3475:1: ( rule__CSSRuleFunc__Group__5__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3476:2: rule__CSSRuleFunc__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleFunc__Group__5__Impl_in_rule__CSSRuleFunc__Group__56968);
            rule__CSSRuleFunc__Group__5__Impl();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__5"


    // $ANTLR start "rule__CSSRuleFunc__Group__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3482:1: rule__CSSRuleFunc__Group__5__Impl : ( ')' ) ;
    public final void rule__CSSRuleFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3486:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3487:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3487:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3488:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,25,FOLLOW_25_in_rule__CSSRuleFunc__Group__5__Impl6996); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__5__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3513:1: rule__CSSRuleOr__Group__0 : rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1 ;
    public final void rule__CSSRuleOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3517:1: ( rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3518:2: rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__0__Impl_in_rule__CSSRuleOr__Group__07039);
            rule__CSSRuleOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__1_in_rule__CSSRuleOr__Group__07042);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3525:1: rule__CSSRuleOr__Group__0__Impl : ( ruleCSSRuleXor ) ;
    public final void rule__CSSRuleOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3529:1: ( ( ruleCSSRuleXor ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3530:1: ( ruleCSSRuleXor )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3530:1: ( ruleCSSRuleXor )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3531:1: ruleCSSRuleXor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getCSSRuleXorParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__Group__0__Impl7069);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3542:1: rule__CSSRuleOr__Group__1 : rule__CSSRuleOr__Group__1__Impl ;
    public final void rule__CSSRuleOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3546:1: ( rule__CSSRuleOr__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3547:2: rule__CSSRuleOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group__1__Impl_in_rule__CSSRuleOr__Group__17098);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3553:1: rule__CSSRuleOr__Group__1__Impl : ( ( rule__CSSRuleOr__Group_1__0 )? ) ;
    public final void rule__CSSRuleOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3557:1: ( ( ( rule__CSSRuleOr__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3558:1: ( ( rule__CSSRuleOr__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3558:1: ( ( rule__CSSRuleOr__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3559:1: ( rule__CSSRuleOr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3560:1: ( rule__CSSRuleOr__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3560:2: rule__CSSRuleOr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__0_in_rule__CSSRuleOr__Group__1__Impl7125);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3574:1: rule__CSSRuleOr__Group_1__0 : rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1 ;
    public final void rule__CSSRuleOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3578:1: ( rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3579:2: rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__0__Impl_in_rule__CSSRuleOr__Group_1__07160);
            rule__CSSRuleOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__1_in_rule__CSSRuleOr__Group_1__07163);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3586:1: rule__CSSRuleOr__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3590:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3591:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3591:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3592:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getCSSRuleOrOrsAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3593:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3595:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3605:1: rule__CSSRuleOr__Group_1__1 : rule__CSSRuleOr__Group_1__1__Impl ;
    public final void rule__CSSRuleOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3609:1: ( rule__CSSRuleOr__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3610:2: rule__CSSRuleOr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1__1__Impl_in_rule__CSSRuleOr__Group_1__17221);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3616:1: rule__CSSRuleOr__Group_1__1__Impl : ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) ) ;
    public final void rule__CSSRuleOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3620:1: ( ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3621:1: ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3621:1: ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3622:1: ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3622:1: ( ( rule__CSSRuleOr__Group_1_1__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3623:1: ( rule__CSSRuleOr__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3624:1: ( rule__CSSRuleOr__Group_1_1__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3624:2: rule__CSSRuleOr__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl7250);
            rule__CSSRuleOr__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3627:1: ( ( rule__CSSRuleOr__Group_1_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3628:1: ( rule__CSSRuleOr__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3629:1: ( rule__CSSRuleOr__Group_1_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==33) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3629:2: rule__CSSRuleOr__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl7262);
            	    rule__CSSRuleOr__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3644:1: rule__CSSRuleOr__Group_1_1__0 : rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1 ;
    public final void rule__CSSRuleOr__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3648:1: ( rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3649:2: rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__0__Impl_in_rule__CSSRuleOr__Group_1_1__07299);
            rule__CSSRuleOr__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__1_in_rule__CSSRuleOr__Group_1_1__07302);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3656:1: rule__CSSRuleOr__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__CSSRuleOr__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3660:1: ( ( '|' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3661:1: ( '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3661:1: ( '|' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3662:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getVerticalLineKeyword_1_1_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__CSSRuleOr__Group_1_1__0__Impl7330); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3675:1: rule__CSSRuleOr__Group_1_1__1 : rule__CSSRuleOr__Group_1_1__1__Impl ;
    public final void rule__CSSRuleOr__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3679:1: ( rule__CSSRuleOr__Group_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3680:2: rule__CSSRuleOr__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__Group_1_1__1__Impl_in_rule__CSSRuleOr__Group_1_1__17361);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3686:1: rule__CSSRuleOr__Group_1_1__1__Impl : ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) ) ;
    public final void rule__CSSRuleOr__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3690:1: ( ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3691:1: ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3691:1: ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3692:1: ( rule__CSSRuleOr__OrsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getOrsAssignment_1_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3693:1: ( rule__CSSRuleOr__OrsAssignment_1_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3693:2: rule__CSSRuleOr__OrsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__CSSRuleOr__OrsAssignment_1_1_1_in_rule__CSSRuleOr__Group_1_1__1__Impl7388);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3707:1: rule__CSSRuleXor__Group__0 : rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1 ;
    public final void rule__CSSRuleXor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3711:1: ( rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3712:2: rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__0__Impl_in_rule__CSSRuleXor__Group__07422);
            rule__CSSRuleXor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__1_in_rule__CSSRuleXor__Group__07425);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3719:1: rule__CSSRuleXor__Group__0__Impl : ( ruleCSSRuleConcat ) ;
    public final void rule__CSSRuleXor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3723:1: ( ( ruleCSSRuleConcat ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3724:1: ( ruleCSSRuleConcat )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3724:1: ( ruleCSSRuleConcat )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3725:1: ruleCSSRuleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getCSSRuleConcatParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__Group__0__Impl7452);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3736:1: rule__CSSRuleXor__Group__1 : rule__CSSRuleXor__Group__1__Impl ;
    public final void rule__CSSRuleXor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3740:1: ( rule__CSSRuleXor__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3741:2: rule__CSSRuleXor__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group__1__Impl_in_rule__CSSRuleXor__Group__17481);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3747:1: rule__CSSRuleXor__Group__1__Impl : ( ( rule__CSSRuleXor__Group_1__0 )? ) ;
    public final void rule__CSSRuleXor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3751:1: ( ( ( rule__CSSRuleXor__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3752:1: ( ( rule__CSSRuleXor__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3752:1: ( ( rule__CSSRuleXor__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3753:1: ( rule__CSSRuleXor__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3754:1: ( rule__CSSRuleXor__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3754:2: rule__CSSRuleXor__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__0_in_rule__CSSRuleXor__Group__1__Impl7508);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3768:1: rule__CSSRuleXor__Group_1__0 : rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1 ;
    public final void rule__CSSRuleXor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3772:1: ( rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3773:2: rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__0__Impl_in_rule__CSSRuleXor__Group_1__07543);
            rule__CSSRuleXor__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__1_in_rule__CSSRuleXor__Group_1__07546);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3780:1: rule__CSSRuleXor__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleXor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3784:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3785:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3785:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3786:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getCSSRuleXorXorsAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3787:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3789:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3799:1: rule__CSSRuleXor__Group_1__1 : rule__CSSRuleXor__Group_1__1__Impl ;
    public final void rule__CSSRuleXor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3803:1: ( rule__CSSRuleXor__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3804:2: rule__CSSRuleXor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1__1__Impl_in_rule__CSSRuleXor__Group_1__17604);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3810:1: rule__CSSRuleXor__Group_1__1__Impl : ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) ) ;
    public final void rule__CSSRuleXor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3814:1: ( ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3815:1: ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3815:1: ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3816:1: ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3816:1: ( ( rule__CSSRuleXor__Group_1_1__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3817:1: ( rule__CSSRuleXor__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3818:1: ( rule__CSSRuleXor__Group_1_1__0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3818:2: rule__CSSRuleXor__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl7633);
            rule__CSSRuleXor__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3821:1: ( ( rule__CSSRuleXor__Group_1_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3822:1: ( rule__CSSRuleXor__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3823:1: ( rule__CSSRuleXor__Group_1_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==34) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3823:2: rule__CSSRuleXor__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl7645);
            	    rule__CSSRuleXor__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3838:1: rule__CSSRuleXor__Group_1_1__0 : rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1 ;
    public final void rule__CSSRuleXor__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3842:1: ( rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3843:2: rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__0__Impl_in_rule__CSSRuleXor__Group_1_1__07682);
            rule__CSSRuleXor__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__1_in_rule__CSSRuleXor__Group_1_1__07685);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3850:1: rule__CSSRuleXor__Group_1_1__0__Impl : ( '||' ) ;
    public final void rule__CSSRuleXor__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3854:1: ( ( '||' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3855:1: ( '||' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3855:1: ( '||' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3856:1: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__CSSRuleXor__Group_1_1__0__Impl7713); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3869:1: rule__CSSRuleXor__Group_1_1__1 : rule__CSSRuleXor__Group_1_1__1__Impl ;
    public final void rule__CSSRuleXor__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3873:1: ( rule__CSSRuleXor__Group_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3874:2: rule__CSSRuleXor__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__Group_1_1__1__Impl_in_rule__CSSRuleXor__Group_1_1__17744);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3880:1: rule__CSSRuleXor__Group_1_1__1__Impl : ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) ) ;
    public final void rule__CSSRuleXor__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3884:1: ( ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3885:1: ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3885:1: ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3886:1: ( rule__CSSRuleXor__XorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getXorsAssignment_1_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3887:1: ( rule__CSSRuleXor__XorsAssignment_1_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3887:2: rule__CSSRuleXor__XorsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__CSSRuleXor__XorsAssignment_1_1_1_in_rule__CSSRuleXor__Group_1_1__1__Impl7771);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3901:1: rule__CSSRuleConcat__Group__0 : rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1 ;
    public final void rule__CSSRuleConcat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3905:1: ( rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3906:2: rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__0__Impl_in_rule__CSSRuleConcat__Group__07805);
            rule__CSSRuleConcat__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__1_in_rule__CSSRuleConcat__Group__07808);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3913:1: rule__CSSRuleConcat__Group__0__Impl : ( ruleCSSRulePostfix ) ;
    public final void rule__CSSRuleConcat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3917:1: ( ( ruleCSSRulePostfix ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3918:1: ( ruleCSSRulePostfix )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3918:1: ( ruleCSSRulePostfix )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3919:1: ruleCSSRulePostfix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getCSSRulePostfixParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__Group__0__Impl7835);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3930:1: rule__CSSRuleConcat__Group__1 : rule__CSSRuleConcat__Group__1__Impl ;
    public final void rule__CSSRuleConcat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3934:1: ( rule__CSSRuleConcat__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3935:2: rule__CSSRuleConcat__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group__1__Impl_in_rule__CSSRuleConcat__Group__17864);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3941:1: rule__CSSRuleConcat__Group__1__Impl : ( ( rule__CSSRuleConcat__Group_1__0 )? ) ;
    public final void rule__CSSRuleConcat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3945:1: ( ( ( rule__CSSRuleConcat__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3946:1: ( ( rule__CSSRuleConcat__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3946:1: ( ( rule__CSSRuleConcat__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3947:1: ( rule__CSSRuleConcat__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3948:1: ( rule__CSSRuleConcat__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==RULE_INT||LA34_0==RULE_REGEX||LA34_0==27||LA34_0==30||LA34_0==35||(LA34_0>=37 && LA34_0<=38)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3948:2: rule__CSSRuleConcat__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__0_in_rule__CSSRuleConcat__Group__1__Impl7891);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3962:1: rule__CSSRuleConcat__Group_1__0 : rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1 ;
    public final void rule__CSSRuleConcat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3966:1: ( rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3967:2: rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__0__Impl_in_rule__CSSRuleConcat__Group_1__07926);
            rule__CSSRuleConcat__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__1_in_rule__CSSRuleConcat__Group_1__07929);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3974:1: rule__CSSRuleConcat__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleConcat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3978:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3979:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3979:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3980:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatConcAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3981:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3983:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3993:1: rule__CSSRuleConcat__Group_1__1 : rule__CSSRuleConcat__Group_1__1__Impl ;
    public final void rule__CSSRuleConcat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3997:1: ( rule__CSSRuleConcat__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:3998:2: rule__CSSRuleConcat__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__Group_1__1__Impl_in_rule__CSSRuleConcat__Group_1__17987);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4004:1: rule__CSSRuleConcat__Group_1__1__Impl : ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) ) ;
    public final void rule__CSSRuleConcat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4008:1: ( ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4009:1: ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4009:1: ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4010:1: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4010:1: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4011:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4012:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4012:2: rule__CSSRuleConcat__ConcAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl8016);
            rule__CSSRuleConcat__ConcAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4015:1: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4016:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4017:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||LA35_0==RULE_INT||LA35_0==RULE_REGEX||LA35_0==27||LA35_0==30||LA35_0==35||(LA35_0>=37 && LA35_0<=38)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4017:2: rule__CSSRuleConcat__ConcAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl8028);
            	    rule__CSSRuleConcat__ConcAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4032:1: rule__CSSRulePostfix__Group__0 : rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1 ;
    public final void rule__CSSRulePostfix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4036:1: ( rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4037:2: rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__0__Impl_in_rule__CSSRulePostfix__Group__08065);
            rule__CSSRulePostfix__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__1_in_rule__CSSRulePostfix__Group__08068);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4044:1: rule__CSSRulePostfix__Group__0__Impl : ( ruleCSSRulePrimary ) ;
    public final void rule__CSSRulePostfix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4048:1: ( ( ruleCSSRulePrimary ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4049:1: ( ruleCSSRulePrimary )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4049:1: ( ruleCSSRulePrimary )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4050:1: ruleCSSRulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCSSRulePrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_rule__CSSRulePostfix__Group__0__Impl8095);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4061:1: rule__CSSRulePostfix__Group__1 : rule__CSSRulePostfix__Group__1__Impl ;
    public final void rule__CSSRulePostfix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4065:1: ( rule__CSSRulePostfix__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4066:2: rule__CSSRulePostfix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group__1__Impl_in_rule__CSSRulePostfix__Group__18124);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4072:1: rule__CSSRulePostfix__Group__1__Impl : ( ( rule__CSSRulePostfix__Group_1__0 )? ) ;
    public final void rule__CSSRulePostfix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4076:1: ( ( ( rule__CSSRulePostfix__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4077:1: ( ( rule__CSSRulePostfix__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4077:1: ( ( rule__CSSRulePostfix__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4078:1: ( rule__CSSRulePostfix__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4079:1: ( rule__CSSRulePostfix__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=15 && LA36_0<=17)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4079:2: rule__CSSRulePostfix__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__0_in_rule__CSSRulePostfix__Group__1__Impl8151);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4093:1: rule__CSSRulePostfix__Group_1__0 : rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1 ;
    public final void rule__CSSRulePostfix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4097:1: ( rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4098:2: rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__0__Impl_in_rule__CSSRulePostfix__Group_1__08186);
            rule__CSSRulePostfix__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__1_in_rule__CSSRulePostfix__Group_1__08189);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4105:1: rule__CSSRulePostfix__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRulePostfix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4109:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4110:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4110:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4111:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCSSRulePostfixRuleAction_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4112:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4114:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4124:1: rule__CSSRulePostfix__Group_1__1 : rule__CSSRulePostfix__Group_1__1__Impl ;
    public final void rule__CSSRulePostfix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4128:1: ( rule__CSSRulePostfix__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4129:2: rule__CSSRulePostfix__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__Group_1__1__Impl_in_rule__CSSRulePostfix__Group_1__18247);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4135:1: rule__CSSRulePostfix__Group_1__1__Impl : ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) ) ;
    public final void rule__CSSRulePostfix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4139:1: ( ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4140:1: ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4140:1: ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4141:1: ( rule__CSSRulePostfix__CardinalityAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAssignment_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4142:1: ( rule__CSSRulePostfix__CardinalityAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4142:2: rule__CSSRulePostfix__CardinalityAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__CardinalityAssignment_1_1_in_rule__CSSRulePostfix__Group_1__1__Impl8274);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4156:1: rule__CSSRuleBracket__Group__0 : rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1 ;
    public final void rule__CSSRuleBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4160:1: ( rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4161:2: rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__0__Impl_in_rule__CSSRuleBracket__Group__08308);
            rule__CSSRuleBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__1_in_rule__CSSRuleBracket__Group__08311);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4168:1: rule__CSSRuleBracket__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4172:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4173:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4173:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4174:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getCSSRuleBracketAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4175:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4177:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4187:1: rule__CSSRuleBracket__Group__1 : rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2 ;
    public final void rule__CSSRuleBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4191:1: ( rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4192:2: rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__1__Impl_in_rule__CSSRuleBracket__Group__18369);
            rule__CSSRuleBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__2_in_rule__CSSRuleBracket__Group__18372);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4199:1: rule__CSSRuleBracket__Group__1__Impl : ( '[' ) ;
    public final void rule__CSSRuleBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4203:1: ( ( '[' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4204:1: ( '[' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4204:1: ( '[' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4205:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__CSSRuleBracket__Group__1__Impl8400); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4218:1: rule__CSSRuleBracket__Group__2 : rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3 ;
    public final void rule__CSSRuleBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4222:1: ( rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4223:2: rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__2__Impl_in_rule__CSSRuleBracket__Group__28431);
            rule__CSSRuleBracket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__3_in_rule__CSSRuleBracket__Group__28434);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4230:1: rule__CSSRuleBracket__Group__2__Impl : ( ( rule__CSSRuleBracket__InnerAssignment_2 ) ) ;
    public final void rule__CSSRuleBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4234:1: ( ( ( rule__CSSRuleBracket__InnerAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4235:1: ( ( rule__CSSRuleBracket__InnerAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4235:1: ( ( rule__CSSRuleBracket__InnerAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4236:1: ( rule__CSSRuleBracket__InnerAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getInnerAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4237:1: ( rule__CSSRuleBracket__InnerAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4237:2: rule__CSSRuleBracket__InnerAssignment_2
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__InnerAssignment_2_in_rule__CSSRuleBracket__Group__2__Impl8461);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4247:1: rule__CSSRuleBracket__Group__3 : rule__CSSRuleBracket__Group__3__Impl ;
    public final void rule__CSSRuleBracket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4251:1: ( rule__CSSRuleBracket__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4252:2: rule__CSSRuleBracket__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleBracket__Group__3__Impl_in_rule__CSSRuleBracket__Group__38491);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4258:1: rule__CSSRuleBracket__Group__3__Impl : ( ']' ) ;
    public final void rule__CSSRuleBracket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4262:1: ( ( ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4263:1: ( ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4263:1: ( ']' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4264:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,36,FOLLOW_36_in_rule__CSSRuleBracket__Group__3__Impl8519); if (state.failed) return ;
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


    // $ANTLR start "rule__CSSRulePrimary__Group_6__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4285:1: rule__CSSRulePrimary__Group_6__0 : rule__CSSRulePrimary__Group_6__0__Impl rule__CSSRulePrimary__Group_6__1 ;
    public final void rule__CSSRulePrimary__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4289:1: ( rule__CSSRulePrimary__Group_6__0__Impl rule__CSSRulePrimary__Group_6__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4290:2: rule__CSSRulePrimary__Group_6__0__Impl rule__CSSRulePrimary__Group_6__1
            {
            pushFollow(FOLLOW_rule__CSSRulePrimary__Group_6__0__Impl_in_rule__CSSRulePrimary__Group_6__08558);
            rule__CSSRulePrimary__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRulePrimary__Group_6__1_in_rule__CSSRulePrimary__Group_6__08561);
            rule__CSSRulePrimary__Group_6__1();

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
    // $ANTLR end "rule__CSSRulePrimary__Group_6__0"


    // $ANTLR start "rule__CSSRulePrimary__Group_6__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4297:1: rule__CSSRulePrimary__Group_6__0__Impl : ( () ) ;
    public final void rule__CSSRulePrimary__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4301:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4302:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4302:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4303:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getNumLiteralAction_6_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4304:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4306:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getNumLiteralAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePrimary__Group_6__0__Impl"


    // $ANTLR start "rule__CSSRulePrimary__Group_6__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4316:1: rule__CSSRulePrimary__Group_6__1 : rule__CSSRulePrimary__Group_6__1__Impl ;
    public final void rule__CSSRulePrimary__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4320:1: ( rule__CSSRulePrimary__Group_6__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4321:2: rule__CSSRulePrimary__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRulePrimary__Group_6__1__Impl_in_rule__CSSRulePrimary__Group_6__18619);
            rule__CSSRulePrimary__Group_6__1__Impl();

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
    // $ANTLR end "rule__CSSRulePrimary__Group_6__1"


    // $ANTLR start "rule__CSSRulePrimary__Group_6__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4327:1: rule__CSSRulePrimary__Group_6__1__Impl : ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) ) ;
    public final void rule__CSSRulePrimary__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4331:1: ( ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4332:1: ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4332:1: ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4333:1: ( rule__CSSRulePrimary__ValueAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getValueAssignment_6_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4334:1: ( rule__CSSRulePrimary__ValueAssignment_6_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4334:2: rule__CSSRulePrimary__ValueAssignment_6_1
            {
            pushFollow(FOLLOW_rule__CSSRulePrimary__ValueAssignment_6_1_in_rule__CSSRulePrimary__Group_6__1__Impl8646);
            rule__CSSRulePrimary__ValueAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getValueAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePrimary__Group_6__1__Impl"


    // $ANTLR start "rule__CSSRuleRegex__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4348:1: rule__CSSRuleRegex__Group__0 : rule__CSSRuleRegex__Group__0__Impl rule__CSSRuleRegex__Group__1 ;
    public final void rule__CSSRuleRegex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4352:1: ( rule__CSSRuleRegex__Group__0__Impl rule__CSSRuleRegex__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4353:2: rule__CSSRuleRegex__Group__0__Impl rule__CSSRuleRegex__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleRegex__Group__0__Impl_in_rule__CSSRuleRegex__Group__08680);
            rule__CSSRuleRegex__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleRegex__Group__1_in_rule__CSSRuleRegex__Group__08683);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4360:1: rule__CSSRuleRegex__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleRegex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4364:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4365:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4365:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4366:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getCSSRuleRegexAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4367:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4369:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4379:1: rule__CSSRuleRegex__Group__1 : rule__CSSRuleRegex__Group__1__Impl ;
    public final void rule__CSSRuleRegex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4383:1: ( rule__CSSRuleRegex__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4384:2: rule__CSSRuleRegex__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleRegex__Group__1__Impl_in_rule__CSSRuleRegex__Group__18741);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4390:1: rule__CSSRuleRegex__Group__1__Impl : ( ( rule__CSSRuleRegex__RegexAssignment_1 ) ) ;
    public final void rule__CSSRuleRegex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4394:1: ( ( ( rule__CSSRuleRegex__RegexAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4395:1: ( ( rule__CSSRuleRegex__RegexAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4395:1: ( ( rule__CSSRuleRegex__RegexAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4396:1: ( rule__CSSRuleRegex__RegexAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getRegexAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4397:1: ( rule__CSSRuleRegex__RegexAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4397:2: rule__CSSRuleRegex__RegexAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleRegex__RegexAssignment_1_in_rule__CSSRuleRegex__Group__1__Impl8768);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4411:1: rule__CSSRuleLiteral__Group__0 : rule__CSSRuleLiteral__Group__0__Impl rule__CSSRuleLiteral__Group__1 ;
    public final void rule__CSSRuleLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4415:1: ( rule__CSSRuleLiteral__Group__0__Impl rule__CSSRuleLiteral__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4416:2: rule__CSSRuleLiteral__Group__0__Impl rule__CSSRuleLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Group__0__Impl_in_rule__CSSRuleLiteral__Group__08802);
            rule__CSSRuleLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Group__1_in_rule__CSSRuleLiteral__Group__08805);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4423:1: rule__CSSRuleLiteral__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4427:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4428:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4428:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4429:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4430:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4432:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4442:1: rule__CSSRuleLiteral__Group__1 : rule__CSSRuleLiteral__Group__1__Impl ;
    public final void rule__CSSRuleLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4446:1: ( rule__CSSRuleLiteral__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4447:2: rule__CSSRuleLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__Group__1__Impl_in_rule__CSSRuleLiteral__Group__18863);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4453:1: rule__CSSRuleLiteral__Group__1__Impl : ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) ) ;
    public final void rule__CSSRuleLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4457:1: ( ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4458:1: ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4458:1: ( ( rule__CSSRuleLiteral__ValueAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4459:1: ( rule__CSSRuleLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getValueAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4460:1: ( rule__CSSRuleLiteral__ValueAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4460:2: rule__CSSRuleLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleLiteral__ValueAssignment_1_in_rule__CSSRuleLiteral__Group__1__Impl8890);
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


    // $ANTLR start "rule__CSSRuleSymbol__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4474:1: rule__CSSRuleSymbol__Group__0 : rule__CSSRuleSymbol__Group__0__Impl rule__CSSRuleSymbol__Group__1 ;
    public final void rule__CSSRuleSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4478:1: ( rule__CSSRuleSymbol__Group__0__Impl rule__CSSRuleSymbol__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4479:2: rule__CSSRuleSymbol__Group__0__Impl rule__CSSRuleSymbol__Group__1
            {
            pushFollow(FOLLOW_rule__CSSRuleSymbol__Group__0__Impl_in_rule__CSSRuleSymbol__Group__08924);
            rule__CSSRuleSymbol__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSRuleSymbol__Group__1_in_rule__CSSRuleSymbol__Group__08927);
            rule__CSSRuleSymbol__Group__1();

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
    // $ANTLR end "rule__CSSRuleSymbol__Group__0"


    // $ANTLR start "rule__CSSRuleSymbol__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4486:1: rule__CSSRuleSymbol__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4490:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4491:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4491:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4492:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getCSSRuleSymbolAction_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4493:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4495:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getCSSRuleSymbolAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleSymbol__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4505:1: rule__CSSRuleSymbol__Group__1 : rule__CSSRuleSymbol__Group__1__Impl ;
    public final void rule__CSSRuleSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4509:1: ( rule__CSSRuleSymbol__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4510:2: rule__CSSRuleSymbol__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSRuleSymbol__Group__1__Impl_in_rule__CSSRuleSymbol__Group__18985);
            rule__CSSRuleSymbol__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRuleSymbol__Group__1"


    // $ANTLR start "rule__CSSRuleSymbol__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4516:1: rule__CSSRuleSymbol__Group__1__Impl : ( ( rule__CSSRuleSymbol__SymbolAssignment_1 ) ) ;
    public final void rule__CSSRuleSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4520:1: ( ( ( rule__CSSRuleSymbol__SymbolAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4521:1: ( ( rule__CSSRuleSymbol__SymbolAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4521:1: ( ( rule__CSSRuleSymbol__SymbolAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4522:1: ( rule__CSSRuleSymbol__SymbolAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getSymbolAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4523:1: ( rule__CSSRuleSymbol__SymbolAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4523:2: rule__CSSRuleSymbol__SymbolAssignment_1
            {
            pushFollow(FOLLOW_rule__CSSRuleSymbol__SymbolAssignment_1_in_rule__CSSRuleSymbol__Group__1__Impl9012);
            rule__CSSRuleSymbol__SymbolAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getSymbolAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__Group__1__Impl"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4537:1: rule__CSSDefaultValue__Group_0__0 : rule__CSSDefaultValue__Group_0__0__Impl rule__CSSDefaultValue__Group_0__1 ;
    public final void rule__CSSDefaultValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4541:1: ( rule__CSSDefaultValue__Group_0__0__Impl rule__CSSDefaultValue__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4542:2: rule__CSSDefaultValue__Group_0__0__Impl rule__CSSDefaultValue__Group_0__1
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__Group_0__0__Impl_in_rule__CSSDefaultValue__Group_0__09046);
            rule__CSSDefaultValue__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CSSDefaultValue__Group_0__1_in_rule__CSSDefaultValue__Group_0__09049);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4549:1: rule__CSSDefaultValue__Group_0__0__Impl : ( () ) ;
    public final void rule__CSSDefaultValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4553:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4554:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4554:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4555:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getCSSDefaultValueAction_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4556:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4558:1: 
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4568:1: rule__CSSDefaultValue__Group_0__1 : rule__CSSDefaultValue__Group_0__1__Impl ;
    public final void rule__CSSDefaultValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4572:1: ( rule__CSSDefaultValue__Group_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4573:2: rule__CSSDefaultValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__Group_0__1__Impl_in_rule__CSSDefaultValue__Group_0__19107);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4579:1: rule__CSSDefaultValue__Group_0__1__Impl : ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) ) ;
    public final void rule__CSSDefaultValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4583:1: ( ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4584:1: ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4584:1: ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4585:1: ( rule__CSSDefaultValue__ValAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getValAssignment_0_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4586:1: ( rule__CSSDefaultValue__ValAssignment_0_1 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4586:2: rule__CSSDefaultValue__ValAssignment_0_1
            {
            pushFollow(FOLLOW_rule__CSSDefaultValue__ValAssignment_0_1_in_rule__CSSDefaultValue__Group_0__1__Impl9134);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4601:1: rule__CssExtension__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__CssExtension__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4605:1: ( ( ruleImport ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4606:1: ( ruleImport )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4606:1: ( ruleImport )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4607:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__CssExtension__ImportsAssignment_09173);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4616:1: rule__CssExtension__PackageDefAssignment_1 : ( rulePackageDefinition ) ;
    public final void rule__CssExtension__PackageDefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4620:1: ( ( rulePackageDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4621:1: ( rulePackageDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4621:1: ( rulePackageDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4622:1: rulePackageDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getPackageDefPackageDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePackageDefinition_in_rule__CssExtension__PackageDefAssignment_19204);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4631:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4635:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4636:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4636:1: ( ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4637:1: ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_19235);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4646:1: rule__PackageDefinition__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4650:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4651:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4651:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4652:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDefinition__NameAssignment_19266);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4661:1: rule__PackageDefinition__RulesAssignment_3_0 : ( ruleCSSRuleDefinition ) ;
    public final void rule__PackageDefinition__RulesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4665:1: ( ( ruleCSSRuleDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4666:1: ( ruleCSSRuleDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4666:1: ( ruleCSSRuleDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4667:1: ruleCSSRuleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getRulesCSSRuleDefinitionParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleDefinition_in_rule__PackageDefinition__RulesAssignment_3_09297);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4676:1: rule__PackageDefinition__SubpackagesAssignment_3_1 : ( rulePackageDefinition ) ;
    public final void rule__PackageDefinition__SubpackagesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4680:1: ( ( rulePackageDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4681:1: ( rulePackageDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4681:1: ( rulePackageDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4682:1: rulePackageDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getSubpackagesPackageDefinitionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_rulePackageDefinition_in_rule__PackageDefinition__SubpackagesAssignment_3_19328);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4691:1: rule__PackageDefinition__ElementsAssignment_3_2 : ( ruleElementDefinition ) ;
    public final void rule__PackageDefinition__ElementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4695:1: ( ( ruleElementDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4696:1: ( ruleElementDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4696:1: ( ruleElementDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4697:1: ruleElementDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getElementsElementDefinitionParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_rule__PackageDefinition__ElementsAssignment_3_29359);
            ruleElementDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getElementsElementDefinitionParserRuleCall_3_2_0()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4706:1: rule__Doku__ContentAssignment : ( RULE_JDOC ) ;
    public final void rule__Doku__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4710:1: ( ( RULE_JDOC ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4711:1: ( RULE_JDOC )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4711:1: ( RULE_JDOC )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4712:1: RULE_JDOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDokuAccess().getContentJDOCTerminalRuleCall_0()); 
            }
            match(input,RULE_JDOC,FOLLOW_RULE_JDOC_in_rule__Doku__ContentAssignment9390); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4721:1: rule__CSSType__TypeAssignment_0_1 : ( ( 'int' ) ) ;
    public final void rule__CSSType__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4725:1: ( ( ( 'int' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4726:1: ( ( 'int' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4726:1: ( ( 'int' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4727:1: ( 'int' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_0_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4728:1: ( 'int' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4729:1: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_0_1_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__CSSType__TypeAssignment_0_19426); if (state.failed) return ;
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


    // $ANTLR start "rule__CSSType__FromAssignment_0_4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4744:1: rule__CSSType__FromAssignment_0_4 : ( RULE_INT ) ;
    public final void rule__CSSType__FromAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4748:1: ( ( RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4749:1: ( RULE_INT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4749:1: ( RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4750:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromINTTerminalRuleCall_0_4_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CSSType__FromAssignment_0_49465); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromINTTerminalRuleCall_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__FromAssignment_0_4"


    // $ANTLR start "rule__CSSType__ToAssignment_0_8"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4759:1: rule__CSSType__ToAssignment_0_8 : ( RULE_INT ) ;
    public final void rule__CSSType__ToAssignment_0_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4763:1: ( ( RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4764:1: ( RULE_INT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4764:1: ( RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4765:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToINTTerminalRuleCall_0_8_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CSSType__ToAssignment_0_89496); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToINTTerminalRuleCall_0_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__ToAssignment_0_8"


    // $ANTLR start "rule__CSSType__TypeAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4774:1: rule__CSSType__TypeAssignment_1_1 : ( ( 'double' ) ) ;
    public final void rule__CSSType__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4778:1: ( ( ( 'double' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4779:1: ( ( 'double' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4779:1: ( ( 'double' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4780:1: ( 'double' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_1_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4781:1: ( 'double' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4782:1: 'double'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_1_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__CSSType__TypeAssignment_1_19532); if (state.failed) return ;
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


    // $ANTLR start "rule__CSSType__FromAssignment_1_4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4797:1: rule__CSSType__FromAssignment_1_4 : ( RULE_DOUBLE ) ;
    public final void rule__CSSType__FromAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4801:1: ( ( RULE_DOUBLE ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4802:1: ( RULE_DOUBLE )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4802:1: ( RULE_DOUBLE )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4803:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromDOUBLETerminalRuleCall_1_4_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__CSSType__FromAssignment_1_49571); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromDOUBLETerminalRuleCall_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__FromAssignment_1_4"


    // $ANTLR start "rule__CSSType__ToAssignment_1_8"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4812:1: rule__CSSType__ToAssignment_1_8 : ( RULE_DOUBLE ) ;
    public final void rule__CSSType__ToAssignment_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4816:1: ( ( RULE_DOUBLE ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4817:1: ( RULE_DOUBLE )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4817:1: ( RULE_DOUBLE )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4818:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToDOUBLETerminalRuleCall_1_8_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__CSSType__ToAssignment_1_89602); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToDOUBLETerminalRuleCall_1_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__ToAssignment_1_8"


    // $ANTLR start "rule__CSSType__TypeAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4827:1: rule__CSSType__TypeAssignment_2 : ( ( 'int' ) ) ;
    public final void rule__CSSType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4831:1: ( ( ( 'int' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4832:1: ( ( 'int' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4832:1: ( ( 'int' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4833:1: ( 'int' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_2_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4834:1: ( 'int' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4835:1: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeIntKeyword_2_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__CSSType__TypeAssignment_29638); if (state.failed) return ;
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


    // $ANTLR start "rule__CSSType__TypeAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4850:1: rule__CSSType__TypeAssignment_3 : ( ( 'double' ) ) ;
    public final void rule__CSSType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4854:1: ( ( ( 'double' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4855:1: ( ( 'double' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4855:1: ( ( 'double' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4856:1: ( 'double' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_3_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4857:1: ( 'double' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4858:1: 'double'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_3_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__CSSType__TypeAssignment_39682); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeDoubleKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__TypeAssignment_3"


    // $ANTLR start "rule__ElementDefinition__DokuAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4873:1: rule__ElementDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__ElementDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4877:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4878:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4878:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4879:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__ElementDefinition__DokuAssignment_19721);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__DokuAssignment_1"


    // $ANTLR start "rule__ElementDefinition__NameAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4888:1: rule__ElementDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__ElementDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4892:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4893:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4893:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4894:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ElementDefinition__NameAssignment_29752);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__NameAssignment_2"


    // $ANTLR start "rule__ElementDefinition__SuperAssignment_3_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4903:1: rule__ElementDefinition__SuperAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementDefinition__SuperAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4907:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4908:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4908:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4909:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4910:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4911:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ElementDefinition__SuperAssignment_3_19787);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__SuperAssignment_3_1"


    // $ANTLR start "rule__ElementDefinition__SuperAssignment_3_2_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4922:1: rule__ElementDefinition__SuperAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementDefinition__SuperAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4926:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4927:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4927:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4928:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_2_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4929:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4930:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ElementDefinition__SuperAssignment_3_2_19826);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__SuperAssignment_3_2_1"


    // $ANTLR start "rule__ElementDefinition__PropertiesAssignment_5_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4941:1: rule__ElementDefinition__PropertiesAssignment_5_0 : ( rulePropertyDefinition ) ;
    public final void rule__ElementDefinition__PropertiesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4945:1: ( ( rulePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4946:1: ( rulePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4946:1: ( rulePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4947:1: rulePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getPropertiesPropertyDefinitionParserRuleCall_5_0_0()); 
            }
            pushFollow(FOLLOW_rulePropertyDefinition_in_rule__ElementDefinition__PropertiesAssignment_5_09861);
            rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getPropertiesPropertyDefinitionParserRuleCall_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__PropertiesAssignment_5_0"


    // $ANTLR start "rule__ElementDefinition__PseudoClassesAssignment_5_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4956:1: rule__ElementDefinition__PseudoClassesAssignment_5_1 : ( rulePseudoClassDefinition ) ;
    public final void rule__ElementDefinition__PseudoClassesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4960:1: ( ( rulePseudoClassDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4961:1: ( rulePseudoClassDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4961:1: ( rulePseudoClassDefinition )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4962:1: rulePseudoClassDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_rulePseudoClassDefinition_in_rule__ElementDefinition__PseudoClassesAssignment_5_19892);
            rulePseudoClassDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__PseudoClassesAssignment_5_1"


    // $ANTLR start "rule__PropertyDefinition__DokuAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4971:1: rule__PropertyDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__PropertyDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4975:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4976:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4976:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4977:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__PropertyDefinition__DokuAssignment_19923);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__DokuAssignment_1"


    // $ANTLR start "rule__PropertyDefinition__NameAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4986:1: rule__PropertyDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PropertyDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4990:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4991:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4991:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:4992:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyDefinition__NameAssignment_29954); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__NameAssignment_2"


    // $ANTLR start "rule__PropertyDefinition__RuleAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5001:1: rule__PropertyDefinition__RuleAssignment_3 : ( ruleCSSRuleOr ) ;
    public final void rule__PropertyDefinition__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5005:1: ( ( ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5006:1: ( ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5006:1: ( ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5007:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rule__PropertyDefinition__RuleAssignment_39985);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__RuleAssignment_3"


    // $ANTLR start "rule__PropertyDefinition__DefaultAssignment_4_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5016:1: rule__PropertyDefinition__DefaultAssignment_4_1 : ( ruleCSSDefaultValue ) ;
    public final void rule__PropertyDefinition__DefaultAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5020:1: ( ( ruleCSSDefaultValue ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5021:1: ( ruleCSSDefaultValue )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5021:1: ( ruleCSSDefaultValue )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5022:1: ruleCSSDefaultValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSDefaultValue_in_rule__PropertyDefinition__DefaultAssignment_4_110016);
            ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__DefaultAssignment_4_1"


    // $ANTLR start "rule__PseudoClassDefinition__DokuAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5031:1: rule__PseudoClassDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__PseudoClassDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5035:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5036:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5036:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5037:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__PseudoClassDefinition__DokuAssignment_110047);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassDefinition__DokuAssignment_1"


    // $ANTLR start "rule__PseudoClassDefinition__NameAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5046:1: rule__PseudoClassDefinition__NameAssignment_2 : ( RULE_PSEUDO ) ;
    public final void rule__PseudoClassDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5050:1: ( ( RULE_PSEUDO ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5051:1: ( RULE_PSEUDO )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5051:1: ( RULE_PSEUDO )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5052:1: RULE_PSEUDO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_2_0()); 
            }
            match(input,RULE_PSEUDO,FOLLOW_RULE_PSEUDO_in_rule__PseudoClassDefinition__NameAssignment_210078); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassDefinition__NameAssignment_2"


    // $ANTLR start "rule__CSSRuleId__NameAssignment"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5061:1: rule__CSSRuleId__NameAssignment : ( ruleQualifiedName ) ;
    public final void rule__CSSRuleId__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5065:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5066:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5066:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5067:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleIdAccess().getNameQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CSSRuleId__NameAssignment10109);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5076:1: rule__CSSRuleRef__RefAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CSSRuleRef__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5080:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5081:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5081:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5082:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdCrossReference_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5083:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5084:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefCSSRuleIdQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CSSRuleRef__RefAssignment_110144);
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


    // $ANTLR start "rule__CSSRuleDefinition__DokuAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5095:1: rule__CSSRuleDefinition__DokuAssignment_0 : ( ruleDoku ) ;
    public final void rule__CSSRuleDefinition__DokuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5099:1: ( ( ruleDoku ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5100:1: ( ruleDoku )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5100:1: ( ruleDoku )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5101:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_rule__CSSRuleDefinition__DokuAssignment_010179);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__DokuAssignment_0"


    // $ANTLR start "rule__CSSRuleDefinition__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5110:1: rule__CSSRuleDefinition__NameAssignment_1 : ( ruleCSSRuleId ) ;
    public final void rule__CSSRuleDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5114:1: ( ( ruleCSSRuleId ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5115:1: ( ruleCSSRuleId )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5115:1: ( ruleCSSRuleId )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5116:1: ruleCSSRuleId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getNameCSSRuleIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleId_in_rule__CSSRuleDefinition__NameAssignment_110210);
            ruleCSSRuleId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getNameCSSRuleIdParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__NameAssignment_1"


    // $ANTLR start "rule__CSSRuleDefinition__RuleAssignment_3_0"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5125:1: rule__CSSRuleDefinition__RuleAssignment_3_0 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleDefinition__RuleAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5129:1: ( ( ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5130:1: ( ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5130:1: ( ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5131:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleDefinition__RuleAssignment_3_010241);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__RuleAssignment_3_0"


    // $ANTLR start "rule__CSSRuleDefinition__FuncAssignment_3_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5140:1: rule__CSSRuleDefinition__FuncAssignment_3_1 : ( ruleCSSRuleFunc ) ;
    public final void rule__CSSRuleDefinition__FuncAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5144:1: ( ( ruleCSSRuleFunc ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5145:1: ( ruleCSSRuleFunc )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5145:1: ( ruleCSSRuleFunc )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5146:1: ruleCSSRuleFunc
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getFuncCSSRuleFuncParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleFunc_in_rule__CSSRuleDefinition__FuncAssignment_3_110272);
            ruleCSSRuleFunc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getFuncCSSRuleFuncParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__FuncAssignment_3_1"


    // $ANTLR start "rule__CSSRuleFunc__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5155:1: rule__CSSRuleFunc__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__CSSRuleFunc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5159:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5160:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5160:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5161:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__CSSRuleFunc__NameAssignment_110303);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getNameValidIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__NameAssignment_1"


    // $ANTLR start "rule__CSSRuleFunc__ParamsAssignment_4"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5170:1: rule__CSSRuleFunc__ParamsAssignment_4 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleFunc__ParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5174:1: ( ( ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5175:1: ( ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5175:1: ( ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5176:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getParamsCSSRuleOrParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleFunc__ParamsAssignment_410334);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getParamsCSSRuleOrParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__ParamsAssignment_4"


    // $ANTLR start "rule__CSSRuleOr__OrsAssignment_1_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5185:1: rule__CSSRuleOr__OrsAssignment_1_1_1 : ( ruleCSSRuleXor ) ;
    public final void rule__CSSRuleOr__OrsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5189:1: ( ( ruleCSSRuleXor ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5190:1: ( ruleCSSRuleXor )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5190:1: ( ruleCSSRuleXor )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5191:1: ruleCSSRuleXor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getOrsCSSRuleXorParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__OrsAssignment_1_1_110365);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5200:1: rule__CSSRuleXor__XorsAssignment_1_1_1 : ( ruleCSSRuleConcat ) ;
    public final void rule__CSSRuleXor__XorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5204:1: ( ( ruleCSSRuleConcat ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5205:1: ( ruleCSSRuleConcat )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5205:1: ( ruleCSSRuleConcat )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5206:1: ruleCSSRuleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getXorsCSSRuleConcatParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__XorsAssignment_1_1_110396);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5215:1: rule__CSSRuleConcat__ConcAssignment_1_1 : ( ruleCSSRulePostfix ) ;
    public final void rule__CSSRuleConcat__ConcAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5219:1: ( ( ruleCSSRulePostfix ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5220:1: ( ruleCSSRulePostfix )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5220:1: ( ruleCSSRulePostfix )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5221:1: ruleCSSRulePostfix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcCSSRulePostfixParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__ConcAssignment_1_110427);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5230:1: rule__CSSRulePostfix__CardinalityAssignment_1_1 : ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) ) ;
    public final void rule__CSSRulePostfix__CardinalityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5234:1: ( ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5235:1: ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5235:1: ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5236:1: ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAlternatives_1_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5237:1: ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5237:2: rule__CSSRulePostfix__CardinalityAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__CSSRulePostfix__CardinalityAlternatives_1_1_0_in_rule__CSSRulePostfix__CardinalityAssignment_1_110458);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5246:1: rule__CSSRuleBracket__InnerAssignment_2 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleBracket__InnerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5250:1: ( ( ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5251:1: ( ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5251:1: ( ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5252:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleBracket__InnerAssignment_210491);
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


    // $ANTLR start "rule__CSSRulePrimary__ValueAssignment_6_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5261:1: rule__CSSRulePrimary__ValueAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__CSSRulePrimary__ValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5265:1: ( ( RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5266:1: ( RULE_INT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5266:1: ( RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5267:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getValueINTTerminalRuleCall_6_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CSSRulePrimary__ValueAssignment_6_110522); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getValueINTTerminalRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePrimary__ValueAssignment_6_1"


    // $ANTLR start "rule__CSSRuleRegex__RegexAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5276:1: rule__CSSRuleRegex__RegexAssignment_1 : ( RULE_REGEX ) ;
    public final void rule__CSSRuleRegex__RegexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5280:1: ( ( RULE_REGEX ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5281:1: ( RULE_REGEX )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5281:1: ( RULE_REGEX )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5282:1: RULE_REGEX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getRegexREGEXTerminalRuleCall_1_0()); 
            }
            match(input,RULE_REGEX,FOLLOW_RULE_REGEX_in_rule__CSSRuleRegex__RegexAssignment_110553); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5291:1: rule__CSSRuleLiteral__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__CSSRuleLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5295:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5296:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5296:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5297:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CSSRuleLiteral__ValueAssignment_110584); if (state.failed) return ;
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


    // $ANTLR start "rule__CSSRuleSymbol__SymbolAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5306:1: rule__CSSRuleSymbol__SymbolAssignment_1 : ( ( ',' ) ) ;
    public final void rule__CSSRuleSymbol__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5310:1: ( ( ( ',' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5311:1: ( ( ',' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5311:1: ( ( ',' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5312:1: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getSymbolCommaKeyword_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5313:1: ( ',' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5314:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getSymbolCommaKeyword_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__CSSRuleSymbol__SymbolAssignment_110620); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getSymbolCommaKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getSymbolCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__SymbolAssignment_1"


    // $ANTLR start "rule__CSSDefaultValue__ValAssignment_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5329:1: rule__CSSDefaultValue__ValAssignment_0_1 : ( ruleCSSRuleLiteral ) ;
    public final void rule__CSSDefaultValue__ValAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5333:1: ( ( ruleCSSRuleLiteral ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5334:1: ( ruleCSSRuleLiteral )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5334:1: ( ruleCSSRuleLiteral )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5335:1: ruleCSSRuleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getValCSSRuleLiteralParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleLiteral_in_rule__CSSDefaultValue__ValAssignment_0_110659);
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5344:1: rule__CSSDefaultValue__IvalAssignment_1 : ( RULE_INT ) ;
    public final void rule__CSSDefaultValue__IvalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5348:1: ( ( RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5349:1: ( RULE_INT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5349:1: ( RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5350:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getIvalINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CSSDefaultValue__IvalAssignment_110690); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5359:1: rule__CSSDefaultValue__DvalAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__CSSDefaultValue__DvalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5363:1: ( ( RULE_DOUBLE ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5364:1: ( RULE_DOUBLE )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5364:1: ( RULE_DOUBLE )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5365:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getDvalDOUBLETerminalRuleCall_2_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__CSSDefaultValue__DvalAssignment_210721); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5374:1: rule__CSSDefaultValue__SvalAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CSSDefaultValue__SvalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5378:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5379:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5379:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.cssext.ui/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/ui/contentassist/antlr/internal/InternalCssExtDsl.g:5380:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getSvalSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CSSDefaultValue__SvalAssignment_310752); if (state.failed) return ;
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
        "\1\24\1\4\1\40\1\uffff\1\4\2\uffff\1\40";
    static final String DFA1_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\1\3\1\uffff";
    static final String DFA1_specialS =
        "\10\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\uffff\1\1\15\uffff\1\3",
            "\1\2",
            "\1\4\1\uffff\1\6\4\uffff\1\6\5\uffff\1\5",
            "",
            "\1\7",
            "",
            "",
            "\1\4\1\uffff\1\6\4\uffff\1\6\5\uffff\1\5"
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
            return "885:1: rule__PackageDefinition__Alternatives_3 : ( ( ( rule__PackageDefinition__RulesAssignment_3_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_3_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_3_2 ) ) );";
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
    public static final BitSet FOLLOW_ruleElementDefinition_in_entryRuleElementDefinition623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDefinition630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__0_in_ruleElementDefinition656 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleCSSRuleFunc_in_entryRuleCSSRuleFunc1006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleFunc1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__0_in_ruleCSSRuleFunc1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr1075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleOr1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__0_in_ruleCSSRuleOr1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor1144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleXor1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__0_in_ruleCSSRuleXor1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat1213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleConcat1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__0_in_ruleCSSRuleConcat1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix1282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePostfix1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__0_in_ruleCSSRulePostfix1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket1351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleBracket1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__0_in_ruleCSSRuleBracket1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary1420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePrimary1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Alternatives_in_ruleCSSRulePrimary1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRegex_in_entryRuleCSSRuleRegex1489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleRegex1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRegex__Group__0_in_ruleCSSRuleRegex1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral1553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleLiteral1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group__0_in_ruleCSSRuleLiteral1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleSymbol_in_entryRuleCSSRuleSymbol1613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleSymbol1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleSymbol__Group__0_in_ruleCSSRuleSymbol1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue1673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSDefaultValue1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Alternatives_in_ruleCSSDefaultValue1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__RulesAssignment_3_0_in_rule__PackageDefinition__Alternatives_31742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__SubpackagesAssignment_3_1_in_rule__PackageDefinition__Alternatives_31760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__ElementsAssignment_3_2_in_rule__PackageDefinition__Alternatives_31778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__0_in_rule__CSSType__Alternatives1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__0_in_rule__CSSType__Alternatives1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__TypeAssignment_2_in_rule__CSSType__Alternatives1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__TypeAssignment_3_in_rule__CSSType__Alternatives1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__PropertiesAssignment_5_0_in_rule__ElementDefinition__Alternatives_51898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__PseudoClassesAssignment_5_1_in_rule__ElementDefinition__Alternatives_51916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__RuleAssignment_3_0_in_rule__CSSRuleDefinition__Alternatives_31949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__FuncAssignment_3_1_in_rule__CSSRuleDefinition__Alternatives_31967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_02001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_02021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CSSRulePostfix__CardinalityAlternatives_1_1_02041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_rule__CSSRulePrimary__Alternatives2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_rule__CSSRulePrimary__Alternatives2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_rule__CSSRulePrimary__Alternatives2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleSymbol_in_rule__CSSRulePrimary__Alternatives2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSBaseType_in_rule__CSSRulePrimary__Alternatives2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRegex_in_rule__CSSRulePrimary__Alternatives2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Group_6__0_in_rule__CSSRulePrimary__Alternatives2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_0__0_in_rule__CSSDefaultValue__Alternatives2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__IvalAssignment_1_in_rule__CSSDefaultValue__Alternatives2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__DvalAssignment_2_in_rule__CSSDefaultValue__Alternatives2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__SvalAssignment_3_in_rule__CSSDefaultValue__Alternatives2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__0__Impl_in_rule__CssExtension__Group__02295 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__1_in_rule__CssExtension__Group__02298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__ImportsAssignment_0_in_rule__CssExtension__Group__0__Impl2325 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__CssExtension__Group__1__Impl_in_rule__CssExtension__Group__12356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CssExtension__PackageDefAssignment_1_in_rule__CssExtension__Group__1__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Import__Group__0__Impl2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02541 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2627 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifiedName__Group_1__0__Impl2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__02786 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__02789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__12845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__02907 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__02910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__12969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__0__Impl_in_rule__PackageDefinition__Group__03032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__1_in_rule__PackageDefinition__Group__03035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PackageDefinition__Group__0__Impl3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__1__Impl_in_rule__PackageDefinition__Group__13094 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__2_in_rule__PackageDefinition__Group__13097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__NameAssignment_1_in_rule__PackageDefinition__Group__1__Impl3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__2__Impl_in_rule__PackageDefinition__Group__23154 = new BitSet(new long[]{0x0000000000500050L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__3_in_rule__PackageDefinition__Group__23157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PackageDefinition__Group__2__Impl3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__3__Impl_in_rule__PackageDefinition__Group__33216 = new BitSet(new long[]{0x0000000000500050L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__4_in_rule__PackageDefinition__Group__33219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Alternatives_3_in_rule__PackageDefinition__Group__3__Impl3246 = new BitSet(new long[]{0x0000000000100052L});
    public static final BitSet FOLLOW_rule__PackageDefinition__Group__4__Impl_in_rule__PackageDefinition__Group__43277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PackageDefinition__Group__4__Impl3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__0__Impl_in_rule__CSSType__Group_0__03346 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__1_in_rule__CSSType__Group_0__03349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__1__Impl_in_rule__CSSType__Group_0__13407 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__2_in_rule__CSSType__Group_0__13410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__TypeAssignment_0_1_in_rule__CSSType__Group_0__1__Impl3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__2__Impl_in_rule__CSSType__Group_0__23467 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__3_in_rule__CSSType__Group_0__23470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CSSType__Group_0__2__Impl3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__3__Impl_in_rule__CSSType__Group_0__33529 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__4_in_rule__CSSType__Group_0__33532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_0__3__Impl3560 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__4__Impl_in_rule__CSSType__Group_0__43591 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__5_in_rule__CSSType__Group_0__43594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__FromAssignment_0_4_in_rule__CSSType__Group_0__4__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__5__Impl_in_rule__CSSType__Group_0__53651 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__6_in_rule__CSSType__Group_0__53654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_0__5__Impl3682 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__6__Impl_in_rule__CSSType__Group_0__63713 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__7_in_rule__CSSType__Group_0__63716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CSSType__Group_0__6__Impl3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__7__Impl_in_rule__CSSType__Group_0__73775 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__8_in_rule__CSSType__Group_0__73778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_0__7__Impl3806 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__8__Impl_in_rule__CSSType__Group_0__83837 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__9_in_rule__CSSType__Group_0__83840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__ToAssignment_0_8_in_rule__CSSType__Group_0__8__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__9__Impl_in_rule__CSSType__Group_0__93897 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__10_in_rule__CSSType__Group_0__93900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_0__9__Impl3928 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_0__10__Impl_in_rule__CSSType__Group_0__103959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CSSType__Group_0__10__Impl3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__0__Impl_in_rule__CSSType__Group_1__04040 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__1_in_rule__CSSType__Group_1__04043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__1__Impl_in_rule__CSSType__Group_1__14101 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__2_in_rule__CSSType__Group_1__14104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__TypeAssignment_1_1_in_rule__CSSType__Group_1__1__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__2__Impl_in_rule__CSSType__Group_1__24161 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__3_in_rule__CSSType__Group_1__24164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CSSType__Group_1__2__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__3__Impl_in_rule__CSSType__Group_1__34223 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__4_in_rule__CSSType__Group_1__34226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_1__3__Impl4254 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__4__Impl_in_rule__CSSType__Group_1__44285 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__5_in_rule__CSSType__Group_1__44288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__FromAssignment_1_4_in_rule__CSSType__Group_1__4__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__5__Impl_in_rule__CSSType__Group_1__54345 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__6_in_rule__CSSType__Group_1__54348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_1__5__Impl4376 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__6__Impl_in_rule__CSSType__Group_1__64407 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__7_in_rule__CSSType__Group_1__64410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CSSType__Group_1__6__Impl4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__7__Impl_in_rule__CSSType__Group_1__74469 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__8_in_rule__CSSType__Group_1__74472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_1__7__Impl4500 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__8__Impl_in_rule__CSSType__Group_1__84531 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__9_in_rule__CSSType__Group_1__84534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__ToAssignment_1_8_in_rule__CSSType__Group_1__8__Impl4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__9__Impl_in_rule__CSSType__Group_1__94591 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__10_in_rule__CSSType__Group_1__94594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSType__Group_1__9__Impl4622 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSType__Group_1__10__Impl_in_rule__CSSType__Group_1__104653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CSSType__Group_1__10__Impl4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__0__Impl_in_rule__ElementDefinition__Group__04734 = new BitSet(new long[]{0x0000000000100050L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__1_in_rule__ElementDefinition__Group__04737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__1__Impl_in_rule__ElementDefinition__Group__14795 = new BitSet(new long[]{0x0000000000100050L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__2_in_rule__ElementDefinition__Group__14798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__DokuAssignment_1_in_rule__ElementDefinition__Group__1__Impl4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__2__Impl_in_rule__ElementDefinition__Group__24856 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__3_in_rule__ElementDefinition__Group__24859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__NameAssignment_2_in_rule__ElementDefinition__Group__2__Impl4886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__3__Impl_in_rule__ElementDefinition__Group__34916 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__4_in_rule__ElementDefinition__Group__34919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3__0_in_rule__ElementDefinition__Group__3__Impl4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__4__Impl_in_rule__ElementDefinition__Group__44977 = new BitSet(new long[]{0x0000000000400250L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__5_in_rule__ElementDefinition__Group__44980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ElementDefinition__Group__4__Impl5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__5__Impl_in_rule__ElementDefinition__Group__55039 = new BitSet(new long[]{0x0000000000400250L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__6_in_rule__ElementDefinition__Group__55042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Alternatives_5_in_rule__ElementDefinition__Group__5__Impl5069 = new BitSet(new long[]{0x0000000000000252L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group__6__Impl_in_rule__ElementDefinition__Group__65100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ElementDefinition__Group__6__Impl5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3__0__Impl_in_rule__ElementDefinition__Group_3__05173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3__1_in_rule__ElementDefinition__Group_3__05176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ElementDefinition__Group_3__0__Impl5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3__1__Impl_in_rule__ElementDefinition__Group_3__15235 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3__2_in_rule__ElementDefinition__Group_3__15238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__SuperAssignment_3_1_in_rule__ElementDefinition__Group_3__1__Impl5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3__2__Impl_in_rule__ElementDefinition__Group_3__25295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3_2__0_in_rule__ElementDefinition__Group_3__2__Impl5322 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3_2__0__Impl_in_rule__ElementDefinition__Group_3_2__05359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3_2__1_in_rule__ElementDefinition__Group_3_2__05362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ElementDefinition__Group_3_2__0__Impl5390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Group_3_2__1__Impl_in_rule__ElementDefinition__Group_3_2__15421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__SuperAssignment_3_2_1_in_rule__ElementDefinition__Group_3_2__1__Impl5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__05482 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__05485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__15543 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__15546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DokuAssignment_1_in_rule__PropertyDefinition__Group__1__Impl5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__25604 = new BitSet(new long[]{0x0000006848000490L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__25607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NameAssignment_2_in_rule__PropertyDefinition__Group__2__Impl5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__35664 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__35667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__RuleAssignment_3_in_rule__PropertyDefinition__Group__3__Impl5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__45724 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__45727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__0_in_rule__PropertyDefinition__Group__4__Impl5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__55785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PropertyDefinition__Group__5__Impl5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__0__Impl_in_rule__PropertyDefinition__Group_4__05856 = new BitSet(new long[]{0x0000000000000990L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__1_in_rule__PropertyDefinition__Group_4__05859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PropertyDefinition__Group_4__0__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__1__Impl_in_rule__PropertyDefinition__Group_4__15918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DefaultAssignment_4_1_in_rule__PropertyDefinition__Group_4__1__Impl5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__0__Impl_in_rule__PseudoClassDefinition__Group__05979 = new BitSet(new long[]{0x0000000000000250L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__1_in_rule__PseudoClassDefinition__Group__05982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__1__Impl_in_rule__PseudoClassDefinition__Group__16040 = new BitSet(new long[]{0x0000000000000250L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__2_in_rule__PseudoClassDefinition__Group__16043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__DokuAssignment_1_in_rule__PseudoClassDefinition__Group__1__Impl6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__Group__2__Impl_in_rule__PseudoClassDefinition__Group__26101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PseudoClassDefinition__NameAssignment_2_in_rule__PseudoClassDefinition__Group__2__Impl6128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__0__Impl_in_rule__CSSRuleRef__Group__06164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__1_in_rule__CSSRuleRef__Group__06167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CSSRuleRef__Group__0__Impl6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__1__Impl_in_rule__CSSRuleRef__Group__16226 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__2_in_rule__CSSRuleRef__Group__16229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__RefAssignment_1_in_rule__CSSRuleRef__Group__1__Impl6256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRef__Group__2__Impl_in_rule__CSSRuleRef__Group__26286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CSSRuleRef__Group__2__Impl6314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__0__Impl_in_rule__CSSRuleDefinition__Group__06351 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__1_in_rule__CSSRuleDefinition__Group__06354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__DokuAssignment_0_in_rule__CSSRuleDefinition__Group__0__Impl6381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__1__Impl_in_rule__CSSRuleDefinition__Group__16412 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__2_in_rule__CSSRuleDefinition__Group__16415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__NameAssignment_1_in_rule__CSSRuleDefinition__Group__1__Impl6442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__2__Impl_in_rule__CSSRuleDefinition__Group__26472 = new BitSet(new long[]{0x0000006848000490L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__3_in_rule__CSSRuleDefinition__Group__26475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CSSRuleDefinition__Group__2__Impl6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__3__Impl_in_rule__CSSRuleDefinition__Group__36534 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__4_in_rule__CSSRuleDefinition__Group__36537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Alternatives_3_in_rule__CSSRuleDefinition__Group__3__Impl6564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleDefinition__Group__4__Impl_in_rule__CSSRuleDefinition__Group__46594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CSSRuleDefinition__Group__4__Impl6622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__0__Impl_in_rule__CSSRuleFunc__Group__06663 = new BitSet(new long[]{0x0000006848000490L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__1_in_rule__CSSRuleFunc__Group__06666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__1__Impl_in_rule__CSSRuleFunc__Group__16724 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__2_in_rule__CSSRuleFunc__Group__16727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__NameAssignment_1_in_rule__CSSRuleFunc__Group__1__Impl6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__2__Impl_in_rule__CSSRuleFunc__Group__26784 = new BitSet(new long[]{0x00000068480004B0L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__3_in_rule__CSSRuleFunc__Group__26787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CSSRuleFunc__Group__2__Impl6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__3__Impl_in_rule__CSSRuleFunc__Group__36846 = new BitSet(new long[]{0x00000068480004B0L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__4_in_rule__CSSRuleFunc__Group__36849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CSSRuleFunc__Group__3__Impl6877 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__4__Impl_in_rule__CSSRuleFunc__Group__46908 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__5_in_rule__CSSRuleFunc__Group__46911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__ParamsAssignment_4_in_rule__CSSRuleFunc__Group__4__Impl6938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleFunc__Group__5__Impl_in_rule__CSSRuleFunc__Group__56968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CSSRuleFunc__Group__5__Impl6996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__0__Impl_in_rule__CSSRuleOr__Group__07039 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__1_in_rule__CSSRuleOr__Group__07042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__Group__0__Impl7069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group__1__Impl_in_rule__CSSRuleOr__Group__17098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__0_in_rule__CSSRuleOr__Group__1__Impl7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__0__Impl_in_rule__CSSRuleOr__Group_1__07160 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__1_in_rule__CSSRuleOr__Group_1__07163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1__1__Impl_in_rule__CSSRuleOr__Group_1__17221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl7250 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__0_in_rule__CSSRuleOr__Group_1__1__Impl7262 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__0__Impl_in_rule__CSSRuleOr__Group_1_1__07299 = new BitSet(new long[]{0x0000006848000490L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__1_in_rule__CSSRuleOr__Group_1_1__07302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CSSRuleOr__Group_1_1__0__Impl7330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__Group_1_1__1__Impl_in_rule__CSSRuleOr__Group_1_1__17361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleOr__OrsAssignment_1_1_1_in_rule__CSSRuleOr__Group_1_1__1__Impl7388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__0__Impl_in_rule__CSSRuleXor__Group__07422 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__1_in_rule__CSSRuleXor__Group__07425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__Group__0__Impl7452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group__1__Impl_in_rule__CSSRuleXor__Group__17481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__0_in_rule__CSSRuleXor__Group__1__Impl7508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__0__Impl_in_rule__CSSRuleXor__Group_1__07543 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__1_in_rule__CSSRuleXor__Group_1__07546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1__1__Impl_in_rule__CSSRuleXor__Group_1__17604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl7633 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__0_in_rule__CSSRuleXor__Group_1__1__Impl7645 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__0__Impl_in_rule__CSSRuleXor__Group_1_1__07682 = new BitSet(new long[]{0x0000006848000490L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__1_in_rule__CSSRuleXor__Group_1_1__07685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CSSRuleXor__Group_1_1__0__Impl7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__Group_1_1__1__Impl_in_rule__CSSRuleXor__Group_1_1__17744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleXor__XorsAssignment_1_1_1_in_rule__CSSRuleXor__Group_1_1__1__Impl7771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__0__Impl_in_rule__CSSRuleConcat__Group__07805 = new BitSet(new long[]{0x0000006848000490L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__1_in_rule__CSSRuleConcat__Group__07808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__Group__0__Impl7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group__1__Impl_in_rule__CSSRuleConcat__Group__17864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__0_in_rule__CSSRuleConcat__Group__1__Impl7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__0__Impl_in_rule__CSSRuleConcat__Group_1__07926 = new BitSet(new long[]{0x0000006848000490L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__1_in_rule__CSSRuleConcat__Group_1__07929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__Group_1__1__Impl_in_rule__CSSRuleConcat__Group_1__17987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl8016 = new BitSet(new long[]{0x0000006848000492L});
    public static final BitSet FOLLOW_rule__CSSRuleConcat__ConcAssignment_1_1_in_rule__CSSRuleConcat__Group_1__1__Impl8028 = new BitSet(new long[]{0x0000006848000492L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__0__Impl_in_rule__CSSRulePostfix__Group__08065 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__1_in_rule__CSSRulePostfix__Group__08068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_rule__CSSRulePostfix__Group__0__Impl8095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group__1__Impl_in_rule__CSSRulePostfix__Group__18124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__0_in_rule__CSSRulePostfix__Group__1__Impl8151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__0__Impl_in_rule__CSSRulePostfix__Group_1__08186 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__1_in_rule__CSSRulePostfix__Group_1__08189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__Group_1__1__Impl_in_rule__CSSRulePostfix__Group_1__18247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__CardinalityAssignment_1_1_in_rule__CSSRulePostfix__Group_1__1__Impl8274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__0__Impl_in_rule__CSSRuleBracket__Group__08308 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__1_in_rule__CSSRuleBracket__Group__08311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__1__Impl_in_rule__CSSRuleBracket__Group__18369 = new BitSet(new long[]{0x0000006848000490L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__2_in_rule__CSSRuleBracket__Group__18372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CSSRuleBracket__Group__1__Impl8400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__2__Impl_in_rule__CSSRuleBracket__Group__28431 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__3_in_rule__CSSRuleBracket__Group__28434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__InnerAssignment_2_in_rule__CSSRuleBracket__Group__2__Impl8461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleBracket__Group__3__Impl_in_rule__CSSRuleBracket__Group__38491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__CSSRuleBracket__Group__3__Impl8519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Group_6__0__Impl_in_rule__CSSRulePrimary__Group_6__08558 = new BitSet(new long[]{0x0000006848000490L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Group_6__1_in_rule__CSSRulePrimary__Group_6__08561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__Group_6__1__Impl_in_rule__CSSRulePrimary__Group_6__18619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePrimary__ValueAssignment_6_1_in_rule__CSSRulePrimary__Group_6__1__Impl8646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRegex__Group__0__Impl_in_rule__CSSRuleRegex__Group__08680 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__CSSRuleRegex__Group__1_in_rule__CSSRuleRegex__Group__08683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRegex__Group__1__Impl_in_rule__CSSRuleRegex__Group__18741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleRegex__RegexAssignment_1_in_rule__CSSRuleRegex__Group__1__Impl8768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group__0__Impl_in_rule__CSSRuleLiteral__Group__08802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group__1_in_rule__CSSRuleLiteral__Group__08805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__Group__1__Impl_in_rule__CSSRuleLiteral__Group__18863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleLiteral__ValueAssignment_1_in_rule__CSSRuleLiteral__Group__1__Impl8890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleSymbol__Group__0__Impl_in_rule__CSSRuleSymbol__Group__08924 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CSSRuleSymbol__Group__1_in_rule__CSSRuleSymbol__Group__08927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleSymbol__Group__1__Impl_in_rule__CSSRuleSymbol__Group__18985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRuleSymbol__SymbolAssignment_1_in_rule__CSSRuleSymbol__Group__1__Impl9012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_0__0__Impl_in_rule__CSSDefaultValue__Group_0__09046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_0__1_in_rule__CSSDefaultValue__Group_0__09049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__Group_0__1__Impl_in_rule__CSSDefaultValue__Group_0__19107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSDefaultValue__ValAssignment_0_1_in_rule__CSSDefaultValue__Group_0__1__Impl9134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__CssExtension__ImportsAssignment_09173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_rule__CssExtension__PackageDefAssignment_19204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_19235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDefinition__NameAssignment_19266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleDefinition_in_rule__PackageDefinition__RulesAssignment_3_09297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_rule__PackageDefinition__SubpackagesAssignment_3_19328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_rule__PackageDefinition__ElementsAssignment_3_29359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JDOC_in_rule__Doku__ContentAssignment9390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__CSSType__TypeAssignment_0_19426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CSSType__FromAssignment_0_49465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CSSType__ToAssignment_0_89496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__CSSType__TypeAssignment_1_19532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__CSSType__FromAssignment_1_49571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__CSSType__ToAssignment_1_89602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__CSSType__TypeAssignment_29638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__CSSType__TypeAssignment_39682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__ElementDefinition__DokuAssignment_19721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ElementDefinition__NameAssignment_29752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ElementDefinition__SuperAssignment_3_19787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ElementDefinition__SuperAssignment_3_2_19826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_rule__ElementDefinition__PropertiesAssignment_5_09861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassDefinition_in_rule__ElementDefinition__PseudoClassesAssignment_5_19892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__PropertyDefinition__DokuAssignment_19923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyDefinition__NameAssignment_29954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rule__PropertyDefinition__RuleAssignment_39985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_rule__PropertyDefinition__DefaultAssignment_4_110016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__PseudoClassDefinition__DokuAssignment_110047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PSEUDO_in_rule__PseudoClassDefinition__NameAssignment_210078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CSSRuleId__NameAssignment10109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CSSRuleRef__RefAssignment_110144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rule__CSSRuleDefinition__DokuAssignment_010179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleId_in_rule__CSSRuleDefinition__NameAssignment_110210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleDefinition__RuleAssignment_3_010241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleFunc_in_rule__CSSRuleDefinition__FuncAssignment_3_110272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__CSSRuleFunc__NameAssignment_110303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleFunc__ParamsAssignment_410334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_rule__CSSRuleOr__OrsAssignment_1_1_110365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_rule__CSSRuleXor__XorsAssignment_1_1_110396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_rule__CSSRuleConcat__ConcAssignment_1_110427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSSRulePostfix__CardinalityAlternatives_1_1_0_in_rule__CSSRulePostfix__CardinalityAssignment_1_110458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rule__CSSRuleBracket__InnerAssignment_210491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CSSRulePrimary__ValueAssignment_6_110522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REGEX_in_rule__CSSRuleRegex__RegexAssignment_110553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CSSRuleLiteral__ValueAssignment_110584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CSSRuleSymbol__SymbolAssignment_110620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_rule__CSSDefaultValue__ValAssignment_0_110659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CSSDefaultValue__IvalAssignment_110690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__CSSDefaultValue__DvalAssignment_210721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CSSDefaultValue__SvalAssignment_310752 = new BitSet(new long[]{0x0000000000000002L});

}