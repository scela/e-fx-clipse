/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslFactory
 * @model kind="package"
 * @generated
 */
public interface CssExtDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cssExtDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/efxclipse/tooling/css/cssext/CssExtDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cssExtDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CssExtDslPackage eINSTANCE = at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtensionImpl <em>Css Extension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtensionImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCssExtension()
   * @generated
   */
  int CSS_EXTENSION = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_EXTENSION__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Package Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_EXTENSION__PACKAGE_DEF = 1;

  /**
   * The number of structural features of the '<em>Css Extension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_EXTENSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ImportImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PackageDeclarationImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__RULE = 1;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleSetImpl <em>CSS Rule Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleSetImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleSet()
   * @generated
   */
  int CSS_RULE_SET = 3;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_SET__RULES = 0;

  /**
   * The number of structural features of the '<em>CSS Rule Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_SET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleIdImpl <em>CSS Rule Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleIdImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleId()
   * @generated
   */
  int CSS_RULE_ID = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_ID__NAME = 0;

  /**
   * The number of structural features of the '<em>CSS Rule Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRulePrimaryExpressionImpl <em>CSS Rule Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRulePrimaryExpressionImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRulePrimaryExpression()
   * @generated
   */
  int CSS_RULE_PRIMARY_EXPRESSION = 12;

  /**
   * The number of structural features of the '<em>CSS Rule Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_PRIMARY_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleRefImpl <em>CSS Rule Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleRefImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleRef()
   * @generated
   */
  int CSS_RULE_REF = 5;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_REF__REF = CSS_RULE_PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CSS Rule Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_REF_FEATURE_COUNT = CSS_RULE_PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleAssignmentImpl <em>CSS Rule Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleAssignmentImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleAssignment()
   * @generated
   */
  int CSS_RULE_ASSIGNMENT = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_ASSIGNMENT__ID = 0;

  /**
   * The feature id for the '<em><b>R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_ASSIGNMENT__R = 1;

  /**
   * The number of structural features of the '<em>CSS Rule Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleBracketExpressionImpl <em>CSS Rule Bracket Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleBracketExpressionImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleBracketExpression()
   * @generated
   */
  int CSS_RULE_BRACKET_EXPRESSION = 9;

  /**
   * The number of structural features of the '<em>CSS Rule Bracket Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_BRACKET_EXPRESSION_FEATURE_COUNT = CSS_RULE_PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleExpressionImpl <em>CSS Rule Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleExpressionImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleExpression()
   * @generated
   */
  int CSS_RULE_EXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Ors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_EXPRESSION__ORS = CSS_RULE_BRACKET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CSS Rule Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_EXPRESSION_FEATURE_COUNT = CSS_RULE_BRACKET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleXorExpressionImpl <em>CSS Rule Xor Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleXorExpressionImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleXorExpression()
   * @generated
   */
  int CSS_RULE_XOR_EXPRESSION = 8;

  /**
   * The feature id for the '<em><b>Xors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_XOR_EXPRESSION__XORS = 0;

  /**
   * The number of structural features of the '<em>CSS Rule Xor Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_XOR_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRulePostfixExpressionImpl <em>CSS Rule Postfix Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRulePostfixExpressionImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRulePostfixExpression()
   * @generated
   */
  int CSS_RULE_POSTFIX_EXPRESSION = 10;

  /**
   * The number of structural features of the '<em>CSS Rule Postfix Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_POSTFIX_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleConcatImpl <em>CSS Rule Concat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleConcatImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleConcat()
   * @generated
   */
  int CSS_RULE_CONCAT = 11;

  /**
   * The feature id for the '<em><b>C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_CONCAT__C = CSS_RULE_POSTFIX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conc</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_CONCAT__CONC = CSS_RULE_POSTFIX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>CSS Rule Concat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_RULE_CONCAT_FEATURE_COUNT = CSS_RULE_POSTFIX_EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension <em>Css Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Css Extension</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension
   * @generated
   */
  EClass getCssExtension();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension#getImports()
   * @see #getCssExtension()
   * @generated
   */
  EReference getCssExtension_Imports();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension#getPackageDef <em>Package Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package Def</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension#getPackageDef()
   * @see #getCssExtension()
   * @generated
   */
  EReference getCssExtension_PackageDef();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDeclaration#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDeclaration#getRule()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Rule();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSet <em>CSS Rule Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Set</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSet
   * @generated
   */
  EClass getCSSRuleSet();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSet#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSet#getRules()
   * @see #getCSSRuleSet()
   * @generated
   */
  EReference getCSSRuleSet_Rules();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId <em>CSS Rule Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Id</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId
   * @generated
   */
  EClass getCSSRuleId();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId#getName()
   * @see #getCSSRuleId()
   * @generated
   */
  EAttribute getCSSRuleId_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef <em>CSS Rule Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Ref</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef
   * @generated
   */
  EClass getCSSRuleRef();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef#getRef()
   * @see #getCSSRuleRef()
   * @generated
   */
  EReference getCSSRuleRef_Ref();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleAssignment <em>CSS Rule Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Assignment</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleAssignment
   * @generated
   */
  EClass getCSSRuleAssignment();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleAssignment#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleAssignment#getId()
   * @see #getCSSRuleAssignment()
   * @generated
   */
  EReference getCSSRuleAssignment_Id();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleAssignment#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>R</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleAssignment#getR()
   * @see #getCSSRuleAssignment()
   * @generated
   */
  EReference getCSSRuleAssignment_R();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleExpression <em>CSS Rule Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Expression</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleExpression
   * @generated
   */
  EClass getCSSRuleExpression();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleExpression#getOrs <em>Ors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ors</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleExpression#getOrs()
   * @see #getCSSRuleExpression()
   * @generated
   */
  EReference getCSSRuleExpression_Ors();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXorExpression <em>CSS Rule Xor Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Xor Expression</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXorExpression
   * @generated
   */
  EClass getCSSRuleXorExpression();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXorExpression#getXors <em>Xors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Xors</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXorExpression#getXors()
   * @see #getCSSRuleXorExpression()
   * @generated
   */
  EReference getCSSRuleXorExpression_Xors();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracketExpression <em>CSS Rule Bracket Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Bracket Expression</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracketExpression
   * @generated
   */
  EClass getCSSRuleBracketExpression();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfixExpression <em>CSS Rule Postfix Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Postfix Expression</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfixExpression
   * @generated
   */
  EClass getCSSRulePostfixExpression();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat <em>CSS Rule Concat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Concat</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat
   * @generated
   */
  EClass getCSSRuleConcat();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>C</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat#getC()
   * @see #getCSSRuleConcat()
   * @generated
   */
  EAttribute getCSSRuleConcat_C();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat#getConc <em>Conc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conc</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat#getConc()
   * @see #getCSSRuleConcat()
   * @generated
   */
  EReference getCSSRuleConcat_Conc();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePrimaryExpression <em>CSS Rule Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS Rule Primary Expression</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePrimaryExpression
   * @generated
   */
  EClass getCSSRulePrimaryExpression();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CssExtDslFactory getCssExtDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtensionImpl <em>Css Extension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtensionImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCssExtension()
     * @generated
     */
    EClass CSS_EXTENSION = eINSTANCE.getCssExtension();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_EXTENSION__IMPORTS = eINSTANCE.getCssExtension_Imports();

    /**
     * The meta object literal for the '<em><b>Package Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_EXTENSION__PACKAGE_DEF = eINSTANCE.getCssExtension_PackageDef();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.ImportImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.PackageDeclarationImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__RULE = eINSTANCE.getPackageDeclaration_Rule();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleSetImpl <em>CSS Rule Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleSetImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleSet()
     * @generated
     */
    EClass CSS_RULE_SET = eINSTANCE.getCSSRuleSet();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_SET__RULES = eINSTANCE.getCSSRuleSet_Rules();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleIdImpl <em>CSS Rule Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleIdImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleId()
     * @generated
     */
    EClass CSS_RULE_ID = eINSTANCE.getCSSRuleId();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_RULE_ID__NAME = eINSTANCE.getCSSRuleId_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleRefImpl <em>CSS Rule Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleRefImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleRef()
     * @generated
     */
    EClass CSS_RULE_REF = eINSTANCE.getCSSRuleRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_REF__REF = eINSTANCE.getCSSRuleRef_Ref();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleAssignmentImpl <em>CSS Rule Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleAssignmentImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleAssignment()
     * @generated
     */
    EClass CSS_RULE_ASSIGNMENT = eINSTANCE.getCSSRuleAssignment();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_ASSIGNMENT__ID = eINSTANCE.getCSSRuleAssignment_Id();

    /**
     * The meta object literal for the '<em><b>R</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_ASSIGNMENT__R = eINSTANCE.getCSSRuleAssignment_R();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleExpressionImpl <em>CSS Rule Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleExpressionImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleExpression()
     * @generated
     */
    EClass CSS_RULE_EXPRESSION = eINSTANCE.getCSSRuleExpression();

    /**
     * The meta object literal for the '<em><b>Ors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_EXPRESSION__ORS = eINSTANCE.getCSSRuleExpression_Ors();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleXorExpressionImpl <em>CSS Rule Xor Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleXorExpressionImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleXorExpression()
     * @generated
     */
    EClass CSS_RULE_XOR_EXPRESSION = eINSTANCE.getCSSRuleXorExpression();

    /**
     * The meta object literal for the '<em><b>Xors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_XOR_EXPRESSION__XORS = eINSTANCE.getCSSRuleXorExpression_Xors();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleBracketExpressionImpl <em>CSS Rule Bracket Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleBracketExpressionImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleBracketExpression()
     * @generated
     */
    EClass CSS_RULE_BRACKET_EXPRESSION = eINSTANCE.getCSSRuleBracketExpression();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRulePostfixExpressionImpl <em>CSS Rule Postfix Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRulePostfixExpressionImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRulePostfixExpression()
     * @generated
     */
    EClass CSS_RULE_POSTFIX_EXPRESSION = eINSTANCE.getCSSRulePostfixExpression();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleConcatImpl <em>CSS Rule Concat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRuleConcatImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRuleConcat()
     * @generated
     */
    EClass CSS_RULE_CONCAT = eINSTANCE.getCSSRuleConcat();

    /**
     * The meta object literal for the '<em><b>C</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_RULE_CONCAT__C = eINSTANCE.getCSSRuleConcat_C();

    /**
     * The meta object literal for the '<em><b>Conc</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_RULE_CONCAT__CONC = eINSTANCE.getCSSRuleConcat_Conc();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRulePrimaryExpressionImpl <em>CSS Rule Primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CSSRulePrimaryExpressionImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl.CssExtDslPackageImpl#getCSSRulePrimaryExpression()
     * @generated
     */
    EClass CSS_RULE_PRIMARY_EXPRESSION = eINSTANCE.getCSSRulePrimaryExpression();

  }

} //CssExtDslPackage
