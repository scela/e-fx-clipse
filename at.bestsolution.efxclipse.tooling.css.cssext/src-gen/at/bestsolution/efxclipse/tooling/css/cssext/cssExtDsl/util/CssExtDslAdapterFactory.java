/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.util;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage
 * @generated
 */
public class CssExtDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CssExtDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssExtDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CssExtDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CssExtDslSwitch<Adapter> modelSwitch =
    new CssExtDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseCssExtension(CssExtension object)
      {
        return createCssExtensionAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter casePackageDeclaration(PackageDeclaration object)
      {
        return createPackageDeclarationAdapter();
      }
      @Override
      public Adapter caseCSSRuleSet(CSSRuleSet object)
      {
        return createCSSRuleSetAdapter();
      }
      @Override
      public Adapter caseCSSRuleId(CSSRuleId object)
      {
        return createCSSRuleIdAdapter();
      }
      @Override
      public Adapter caseCSSRuleRef(CSSRuleRef object)
      {
        return createCSSRuleRefAdapter();
      }
      @Override
      public Adapter caseCSSRuleAssignment(CSSRuleAssignment object)
      {
        return createCSSRuleAssignmentAdapter();
      }
      @Override
      public Adapter caseCSSRuleExpression(CSSRuleExpression object)
      {
        return createCSSRuleExpressionAdapter();
      }
      @Override
      public Adapter caseCSSRuleXorExpression(CSSRuleXorExpression object)
      {
        return createCSSRuleXorExpressionAdapter();
      }
      @Override
      public Adapter caseCSSRuleBracketExpression(CSSRuleBracketExpression object)
      {
        return createCSSRuleBracketExpressionAdapter();
      }
      @Override
      public Adapter caseCSSRulePostfixExpression(CSSRulePostfixExpression object)
      {
        return createCSSRulePostfixExpressionAdapter();
      }
      @Override
      public Adapter caseCSSRuleConcat(CSSRuleConcat object)
      {
        return createCSSRuleConcatAdapter();
      }
      @Override
      public Adapter caseCSSRulePrimaryExpression(CSSRulePrimaryExpression object)
      {
        return createCSSRulePrimaryExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension <em>Css Extension</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension
   * @generated
   */
  public Adapter createCssExtensionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDeclaration
   * @generated
   */
  public Adapter createPackageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSet <em>CSS Rule Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSet
   * @generated
   */
  public Adapter createCSSRuleSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId <em>CSS Rule Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId
   * @generated
   */
  public Adapter createCSSRuleIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef <em>CSS Rule Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef
   * @generated
   */
  public Adapter createCSSRuleRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleAssignment <em>CSS Rule Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleAssignment
   * @generated
   */
  public Adapter createCSSRuleAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleExpression <em>CSS Rule Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleExpression
   * @generated
   */
  public Adapter createCSSRuleExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXorExpression <em>CSS Rule Xor Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXorExpression
   * @generated
   */
  public Adapter createCSSRuleXorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracketExpression <em>CSS Rule Bracket Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracketExpression
   * @generated
   */
  public Adapter createCSSRuleBracketExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfixExpression <em>CSS Rule Postfix Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfixExpression
   * @generated
   */
  public Adapter createCSSRulePostfixExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat <em>CSS Rule Concat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat
   * @generated
   */
  public Adapter createCSSRuleConcatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePrimaryExpression <em>CSS Rule Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePrimaryExpression
   * @generated
   */
  public Adapter createCSSRulePrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CssExtDslAdapterFactory
