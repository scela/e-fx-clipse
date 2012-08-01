/**
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Doku;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSS Rule Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleDefinitionImpl#getDoku <em>Doku</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleDefinitionImpl#getR <em>R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSSRuleDefinitionImpl extends MinimalEObjectImpl.Container implements CSSRuleDefinition
{
  /**
   * The cached value of the '{@link #getDoku() <em>Doku</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoku()
   * @generated
   * @ordered
   */
  protected Doku doku;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected CSSRuleId name;

  /**
   * The cached value of the '{@link #getR() <em>R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected CSSRule r;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CSSRuleDefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CssExtDslPackage.Literals.CSS_RULE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Doku getDoku()
  {
    return doku;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDoku(Doku newDoku, NotificationChain msgs)
  {
    Doku oldDoku = doku;
    doku = newDoku;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_RULE_DEFINITION__DOKU, oldDoku, newDoku);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoku(Doku newDoku)
  {
    if (newDoku != doku)
    {
      NotificationChain msgs = null;
      if (doku != null)
        msgs = ((InternalEObject)doku).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_RULE_DEFINITION__DOKU, null, msgs);
      if (newDoku != null)
        msgs = ((InternalEObject)newDoku).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_RULE_DEFINITION__DOKU, null, msgs);
      msgs = basicSetDoku(newDoku, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_RULE_DEFINITION__DOKU, newDoku, newDoku));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleId getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(CSSRuleId newName, NotificationChain msgs)
  {
    CSSRuleId oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_RULE_DEFINITION__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(CSSRuleId newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_RULE_DEFINITION__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_RULE_DEFINITION__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_RULE_DEFINITION__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRule getR()
  {
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetR(CSSRule newR, NotificationChain msgs)
  {
    CSSRule oldR = r;
    r = newR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_RULE_DEFINITION__R, oldR, newR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR(CSSRule newR)
  {
    if (newR != r)
    {
      NotificationChain msgs = null;
      if (r != null)
        msgs = ((InternalEObject)r).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_RULE_DEFINITION__R, null, msgs);
      if (newR != null)
        msgs = ((InternalEObject)newR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_RULE_DEFINITION__R, null, msgs);
      msgs = basicSetR(newR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_RULE_DEFINITION__R, newR, newR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CssExtDslPackage.CSS_RULE_DEFINITION__DOKU:
        return basicSetDoku(null, msgs);
      case CssExtDslPackage.CSS_RULE_DEFINITION__NAME:
        return basicSetName(null, msgs);
      case CssExtDslPackage.CSS_RULE_DEFINITION__R:
        return basicSetR(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CssExtDslPackage.CSS_RULE_DEFINITION__DOKU:
        return getDoku();
      case CssExtDslPackage.CSS_RULE_DEFINITION__NAME:
        return getName();
      case CssExtDslPackage.CSS_RULE_DEFINITION__R:
        return getR();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CssExtDslPackage.CSS_RULE_DEFINITION__DOKU:
        setDoku((Doku)newValue);
        return;
      case CssExtDslPackage.CSS_RULE_DEFINITION__NAME:
        setName((CSSRuleId)newValue);
        return;
      case CssExtDslPackage.CSS_RULE_DEFINITION__R:
        setR((CSSRule)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CssExtDslPackage.CSS_RULE_DEFINITION__DOKU:
        setDoku((Doku)null);
        return;
      case CssExtDslPackage.CSS_RULE_DEFINITION__NAME:
        setName((CSSRuleId)null);
        return;
      case CssExtDslPackage.CSS_RULE_DEFINITION__R:
        setR((CSSRule)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CssExtDslPackage.CSS_RULE_DEFINITION__DOKU:
        return doku != null;
      case CssExtDslPackage.CSS_RULE_DEFINITION__NAME:
        return name != null;
      case CssExtDslPackage.CSS_RULE_DEFINITION__R:
        return r != null;
    }
    return super.eIsSet(featureID);
  }

} //CSSRuleDefinitionImpl
