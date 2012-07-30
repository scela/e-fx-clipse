/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CssExtDslFactoryImpl extends EFactoryImpl implements CssExtDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CssExtDslFactory init()
  {
    try
    {
      CssExtDslFactory theCssExtDslFactory = (CssExtDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bestsolution.at/efxclipse/tooling/css/cssext/CssExtDsl"); 
      if (theCssExtDslFactory != null)
      {
        return theCssExtDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CssExtDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssExtDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CssExtDslPackage.CSS_EXTENSION: return createCssExtension();
      case CssExtDslPackage.IMPORT: return createImport();
      case CssExtDslPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case CssExtDslPackage.CSS_RULE_SET: return createCSSRuleSet();
      case CssExtDslPackage.CSS_RULE_ID: return createCSSRuleId();
      case CssExtDslPackage.CSS_RULE_REF: return createCSSRuleRef();
      case CssExtDslPackage.CSS_RULE_ASSIGNMENT: return createCSSRuleAssignment();
      case CssExtDslPackage.CSS_RULE_EXPRESSION: return createCSSRuleExpression();
      case CssExtDslPackage.CSS_RULE_XOR_EXPRESSION: return createCSSRuleXorExpression();
      case CssExtDslPackage.CSS_RULE_BRACKET_EXPRESSION: return createCSSRuleBracketExpression();
      case CssExtDslPackage.CSS_RULE_POSTFIX_EXPRESSION: return createCSSRulePostfixExpression();
      case CssExtDslPackage.CSS_RULE_CONCAT: return createCSSRuleConcat();
      case CssExtDslPackage.CSS_RULE_PRIMARY_EXPRESSION: return createCSSRulePrimaryExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssExtension createCssExtension()
  {
    CssExtensionImpl cssExtension = new CssExtensionImpl();
    return cssExtension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleSet createCSSRuleSet()
  {
    CSSRuleSetImpl cssRuleSet = new CSSRuleSetImpl();
    return cssRuleSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleId createCSSRuleId()
  {
    CSSRuleIdImpl cssRuleId = new CSSRuleIdImpl();
    return cssRuleId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleRef createCSSRuleRef()
  {
    CSSRuleRefImpl cssRuleRef = new CSSRuleRefImpl();
    return cssRuleRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleAssignment createCSSRuleAssignment()
  {
    CSSRuleAssignmentImpl cssRuleAssignment = new CSSRuleAssignmentImpl();
    return cssRuleAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleExpression createCSSRuleExpression()
  {
    CSSRuleExpressionImpl cssRuleExpression = new CSSRuleExpressionImpl();
    return cssRuleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleXorExpression createCSSRuleXorExpression()
  {
    CSSRuleXorExpressionImpl cssRuleXorExpression = new CSSRuleXorExpressionImpl();
    return cssRuleXorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleBracketExpression createCSSRuleBracketExpression()
  {
    CSSRuleBracketExpressionImpl cssRuleBracketExpression = new CSSRuleBracketExpressionImpl();
    return cssRuleBracketExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRulePostfixExpression createCSSRulePostfixExpression()
  {
    CSSRulePostfixExpressionImpl cssRulePostfixExpression = new CSSRulePostfixExpressionImpl();
    return cssRulePostfixExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleConcat createCSSRuleConcat()
  {
    CSSRuleConcatImpl cssRuleConcat = new CSSRuleConcatImpl();
    return cssRuleConcat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRulePrimaryExpression createCSSRulePrimaryExpression()
  {
    CSSRulePrimaryExpressionImpl cssRulePrimaryExpression = new CSSRulePrimaryExpressionImpl();
    return cssRulePrimaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssExtDslPackage getCssExtDslPackage()
  {
    return (CssExtDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CssExtDslPackage getPackage()
  {
    return CssExtDslPackage.eINSTANCE;
  }

} //CssExtDslFactoryImpl
