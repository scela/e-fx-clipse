/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.util;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage
 * @generated
 */
public class CssExtDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CssExtDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssExtDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CssExtDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CssExtDslPackage.CSS_EXTENSION:
      {
        CssExtension cssExtension = (CssExtension)theEObject;
        T result = caseCssExtension(cssExtension);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.PACKAGE_DECLARATION:
      {
        PackageDeclaration packageDeclaration = (PackageDeclaration)theEObject;
        T result = casePackageDeclaration(packageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_SET:
      {
        CSSRuleSet cssRuleSet = (CSSRuleSet)theEObject;
        T result = caseCSSRuleSet(cssRuleSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_ID:
      {
        CSSRuleId cssRuleId = (CSSRuleId)theEObject;
        T result = caseCSSRuleId(cssRuleId);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_REF:
      {
        CSSRuleRef cssRuleRef = (CSSRuleRef)theEObject;
        T result = caseCSSRuleRef(cssRuleRef);
        if (result == null) result = caseCSSRulePrimaryExpression(cssRuleRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_ASSIGNMENT:
      {
        CSSRuleAssignment cssRuleAssignment = (CSSRuleAssignment)theEObject;
        T result = caseCSSRuleAssignment(cssRuleAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_EXPRESSION:
      {
        CSSRuleExpression cssRuleExpression = (CSSRuleExpression)theEObject;
        T result = caseCSSRuleExpression(cssRuleExpression);
        if (result == null) result = caseCSSRuleBracketExpression(cssRuleExpression);
        if (result == null) result = caseCSSRulePrimaryExpression(cssRuleExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_XOR_EXPRESSION:
      {
        CSSRuleXorExpression cssRuleXorExpression = (CSSRuleXorExpression)theEObject;
        T result = caseCSSRuleXorExpression(cssRuleXorExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_BRACKET_EXPRESSION:
      {
        CSSRuleBracketExpression cssRuleBracketExpression = (CSSRuleBracketExpression)theEObject;
        T result = caseCSSRuleBracketExpression(cssRuleBracketExpression);
        if (result == null) result = caseCSSRulePrimaryExpression(cssRuleBracketExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_POSTFIX_EXPRESSION:
      {
        CSSRulePostfixExpression cssRulePostfixExpression = (CSSRulePostfixExpression)theEObject;
        T result = caseCSSRulePostfixExpression(cssRulePostfixExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_CONCAT:
      {
        CSSRuleConcat cssRuleConcat = (CSSRuleConcat)theEObject;
        T result = caseCSSRuleConcat(cssRuleConcat);
        if (result == null) result = caseCSSRulePostfixExpression(cssRuleConcat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssExtDslPackage.CSS_RULE_PRIMARY_EXPRESSION:
      {
        CSSRulePrimaryExpression cssRulePrimaryExpression = (CSSRulePrimaryExpression)theEObject;
        T result = caseCSSRulePrimaryExpression(cssRulePrimaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Css Extension</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Css Extension</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCssExtension(CssExtension object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDeclaration(PackageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleSet(CSSRuleSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleId(CSSRuleId object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleRef(CSSRuleRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleAssignment(CSSRuleAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleExpression(CSSRuleExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Xor Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Xor Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleXorExpression(CSSRuleXorExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Bracket Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Bracket Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleBracketExpression(CSSRuleBracketExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Postfix Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Postfix Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRulePostfixExpression(CSSRulePostfixExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Concat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Concat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRuleConcat(CSSRuleConcat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS Rule Primary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS Rule Primary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSSRulePrimaryExpression(CSSRulePrimaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CssExtDslSwitch
