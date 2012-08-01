/**
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSS Rule Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition#getDoku <em>Doku</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition#getR <em>R</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleDefinition()
 * @model
 * @generated
 */
public interface CSSRuleDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Doku</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doku</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doku</em>' containment reference.
   * @see #setDoku(Doku)
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleDefinition_Doku()
   * @model containment="true"
   * @generated
   */
  Doku getDoku();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition#getDoku <em>Doku</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doku</em>' containment reference.
   * @see #getDoku()
   * @generated
   */
  void setDoku(Doku value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(CSSRuleId)
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleDefinition_Name()
   * @model containment="true"
   * @generated
   */
  CSSRuleId getName();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(CSSRuleId value);

  /**
   * Returns the value of the '<em><b>R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>R</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>R</em>' containment reference.
   * @see #setR(CSSRule)
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleDefinition_R()
   * @model containment="true"
   * @generated
   */
  CSSRule getR();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition#getR <em>R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>R</em>' containment reference.
   * @see #getR()
   * @generated
   */
  void setR(CSSRule value);

} // CSSRuleDefinition
