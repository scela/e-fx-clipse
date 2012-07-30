/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage
 * @generated
 */
public interface CssExtDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CssExtDslFactory eINSTANCE = at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Css Extension</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Css Extension</em>'.
   * @generated
   */
  CssExtension createCssExtension();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Declaration</em>'.
   * @generated
   */
  PackageDeclaration createPackageDeclaration();

  /**
   * Returns a new object of class '<em>CSS Rule Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSS Rule Set</em>'.
   * @generated
   */
  CSSRuleSet createCSSRuleSet();

  /**
   * Returns a new object of class '<em>CSS Rule Id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSS Rule Id</em>'.
   * @generated
   */
  CSSRuleId createCSSRuleId();

  /**
   * Returns a new object of class '<em>CSS Rule Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSS Rule Ref</em>'.
   * @generated
   */
  CSSRuleRef createCSSRuleRef();

  /**
   * Returns a new object of class '<em>CSS Rule Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSS Rule Assignment</em>'.
   * @generated
   */
  CSSRuleAssignment createCSSRuleAssignment();

  /**
   * Returns a new object of class '<em>CSS Rule Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSS Rule Expression</em>'.
   * @generated
   */
  CSSRuleExpression createCSSRuleExpression();

  /**
   * Returns a new object of class '<em>CSS Rule Xor Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSS Rule Xor Expression</em>'.
   * @generated
   */
  CSSRuleXorExpression createCSSRuleXorExpression();

  /**
   * Returns a new object of class '<em>CSS Rule Bracket Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSS Rule Bracket Expression</em>'.
   * @generated
   */
  CSSRuleBracketExpression createCSSRuleBracketExpression();

  /**
   * Returns a new object of class '<em>CSS Rule Postfix Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSS Rule Postfix Expression</em>'.
   * @generated
   */
  CSSRulePostfixExpression createCSSRulePostfixExpression();

  /**
   * Returns a new object of class '<em>CSS Rule Concat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSS Rule Concat</em>'.
   * @generated
   */
  CSSRuleConcat createCSSRuleConcat();

  /**
   * Returns a new object of class '<em>CSS Rule Primary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSS Rule Primary Expression</em>'.
   * @generated
   */
  CSSRulePrimaryExpression createCSSRulePrimaryExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CssExtDslPackage getCssExtDslPackage();

} //CssExtDslFactory
