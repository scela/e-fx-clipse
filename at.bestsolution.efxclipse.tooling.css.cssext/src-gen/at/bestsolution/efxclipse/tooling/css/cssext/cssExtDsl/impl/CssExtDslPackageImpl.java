/**
 */
package at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslFactory;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Doku;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDeclartion;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Import;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PseudoClassDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CssExtDslPackageImpl extends EPackageImpl implements CssExtDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssExtensionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dokuEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementDeclartionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pseudoClassDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssDefaultValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleOrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleXorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleConcatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRulePostfixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleBracketEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleLiteralEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CssExtDslPackageImpl()
  {
    super(eNS_URI, CssExtDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CssExtDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CssExtDslPackage init()
  {
    if (isInited) return (CssExtDslPackage)EPackage.Registry.INSTANCE.getEPackage(CssExtDslPackage.eNS_URI);

    // Obtain or create and register package
    CssExtDslPackageImpl theCssExtDslPackage = (CssExtDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CssExtDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CssExtDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCssExtDslPackage.createPackageContents();

    // Initialize created meta-data
    theCssExtDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCssExtDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CssExtDslPackage.eNS_URI, theCssExtDslPackage);
    return theCssExtDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCssExtension()
  {
    return cssExtensionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCssExtension_Imports()
  {
    return (EReference)cssExtensionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCssExtension_PackageDef()
  {
    return (EReference)cssExtensionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDefinition()
  {
    return packageDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDefinition_Name()
  {
    return (EAttribute)packageDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDefinition_Rules()
  {
    return (EReference)packageDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDefinition_Subpackages()
  {
    return (EReference)packageDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDefinition_Elements()
  {
    return (EReference)packageDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoku()
  {
    return dokuEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoku_Content()
  {
    return (EAttribute)dokuEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRule()
  {
    return cssRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSRule_Value()
  {
    return (EAttribute)cssRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementDeclartion()
  {
    return elementDeclartionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementDeclartion_Doku()
  {
    return (EReference)elementDeclartionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementDeclartion_Name()
  {
    return (EAttribute)elementDeclartionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementDeclartion_Properties()
  {
    return (EReference)elementDeclartionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementDeclartion_PseudoClasses()
  {
    return (EReference)elementDeclartionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyDefinition()
  {
    return propertyDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyDefinition_Doku()
  {
    return (EReference)propertyDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_Name()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyDefinition_Rule()
  {
    return (EReference)propertyDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyDefinition_Default()
  {
    return (EReference)propertyDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPseudoClassDefinition()
  {
    return pseudoClassDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPseudoClassDefinition_Doku()
  {
    return (EReference)pseudoClassDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPseudoClassDefinition_Name()
  {
    return (EAttribute)pseudoClassDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleId()
  {
    return cssRuleIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSRuleId_Name()
  {
    return (EAttribute)cssRuleIdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleRef()
  {
    return cssRuleRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleRef_Ref()
  {
    return (EReference)cssRuleRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleDefinition()
  {
    return cssRuleDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleDefinition_Doku()
  {
    return (EReference)cssRuleDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleDefinition_Name()
  {
    return (EReference)cssRuleDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleDefinition_R()
  {
    return (EReference)cssRuleDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSDefaultValue()
  {
    return cssDefaultValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleOr()
  {
    return cssRuleOrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleOr_Ors()
  {
    return (EReference)cssRuleOrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleXor()
  {
    return cssRuleXorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleXor_Xors()
  {
    return (EReference)cssRuleXorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleConcat()
  {
    return cssRuleConcatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleConcat_Conc()
  {
    return (EReference)cssRuleConcatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRulePostfix()
  {
    return cssRulePostfixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRulePostfix_Rule()
  {
    return (EReference)cssRulePostfixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSRulePostfix_Cardinality()
  {
    return (EAttribute)cssRulePostfixEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleBracket()
  {
    return cssRuleBracketEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleBracket_Inner()
  {
    return (EReference)cssRuleBracketEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleLiteral()
  {
    return cssRuleLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssExtDslFactory getCssExtDslFactory()
  {
    return (CssExtDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    cssExtensionEClass = createEClass(CSS_EXTENSION);
    createEReference(cssExtensionEClass, CSS_EXTENSION__IMPORTS);
    createEReference(cssExtensionEClass, CSS_EXTENSION__PACKAGE_DEF);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    packageDefinitionEClass = createEClass(PACKAGE_DEFINITION);
    createEAttribute(packageDefinitionEClass, PACKAGE_DEFINITION__NAME);
    createEReference(packageDefinitionEClass, PACKAGE_DEFINITION__RULES);
    createEReference(packageDefinitionEClass, PACKAGE_DEFINITION__SUBPACKAGES);
    createEReference(packageDefinitionEClass, PACKAGE_DEFINITION__ELEMENTS);

    dokuEClass = createEClass(DOKU);
    createEAttribute(dokuEClass, DOKU__CONTENT);

    cssRuleEClass = createEClass(CSS_RULE);
    createEAttribute(cssRuleEClass, CSS_RULE__VALUE);

    elementDeclartionEClass = createEClass(ELEMENT_DECLARTION);
    createEReference(elementDeclartionEClass, ELEMENT_DECLARTION__DOKU);
    createEAttribute(elementDeclartionEClass, ELEMENT_DECLARTION__NAME);
    createEReference(elementDeclartionEClass, ELEMENT_DECLARTION__PROPERTIES);
    createEReference(elementDeclartionEClass, ELEMENT_DECLARTION__PSEUDO_CLASSES);

    propertyDefinitionEClass = createEClass(PROPERTY_DEFINITION);
    createEReference(propertyDefinitionEClass, PROPERTY_DEFINITION__DOKU);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__NAME);
    createEReference(propertyDefinitionEClass, PROPERTY_DEFINITION__RULE);
    createEReference(propertyDefinitionEClass, PROPERTY_DEFINITION__DEFAULT);

    pseudoClassDefinitionEClass = createEClass(PSEUDO_CLASS_DEFINITION);
    createEReference(pseudoClassDefinitionEClass, PSEUDO_CLASS_DEFINITION__DOKU);
    createEAttribute(pseudoClassDefinitionEClass, PSEUDO_CLASS_DEFINITION__NAME);

    cssRuleIdEClass = createEClass(CSS_RULE_ID);
    createEAttribute(cssRuleIdEClass, CSS_RULE_ID__NAME);

    cssRuleRefEClass = createEClass(CSS_RULE_REF);
    createEReference(cssRuleRefEClass, CSS_RULE_REF__REF);

    cssRuleDefinitionEClass = createEClass(CSS_RULE_DEFINITION);
    createEReference(cssRuleDefinitionEClass, CSS_RULE_DEFINITION__DOKU);
    createEReference(cssRuleDefinitionEClass, CSS_RULE_DEFINITION__NAME);
    createEReference(cssRuleDefinitionEClass, CSS_RULE_DEFINITION__R);

    cssDefaultValueEClass = createEClass(CSS_DEFAULT_VALUE);

    cssRuleOrEClass = createEClass(CSS_RULE_OR);
    createEReference(cssRuleOrEClass, CSS_RULE_OR__ORS);

    cssRuleXorEClass = createEClass(CSS_RULE_XOR);
    createEReference(cssRuleXorEClass, CSS_RULE_XOR__XORS);

    cssRuleConcatEClass = createEClass(CSS_RULE_CONCAT);
    createEReference(cssRuleConcatEClass, CSS_RULE_CONCAT__CONC);

    cssRulePostfixEClass = createEClass(CSS_RULE_POSTFIX);
    createEReference(cssRulePostfixEClass, CSS_RULE_POSTFIX__RULE);
    createEAttribute(cssRulePostfixEClass, CSS_RULE_POSTFIX__CARDINALITY);

    cssRuleBracketEClass = createEClass(CSS_RULE_BRACKET);
    createEReference(cssRuleBracketEClass, CSS_RULE_BRACKET__INNER);

    cssRuleLiteralEClass = createEClass(CSS_RULE_LITERAL);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    cssRuleEClass.getESuperTypes().add(this.getCSSDefaultValue());
    cssRuleRefEClass.getESuperTypes().add(this.getCSSRule());
    cssRuleOrEClass.getESuperTypes().add(this.getCSSRule());
    cssRuleXorEClass.getESuperTypes().add(this.getCSSRule());
    cssRuleConcatEClass.getESuperTypes().add(this.getCSSRule());
    cssRulePostfixEClass.getESuperTypes().add(this.getCSSRule());
    cssRuleBracketEClass.getESuperTypes().add(this.getCSSRule());
    cssRuleLiteralEClass.getESuperTypes().add(this.getCSSRule());

    // Initialize classes and features; add operations and parameters
    initEClass(cssExtensionEClass, CssExtension.class, "CssExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCssExtension_Imports(), this.getImport(), null, "imports", null, 0, -1, CssExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCssExtension_PackageDef(), this.getPackageDefinition(), null, "packageDef", null, 0, 1, CssExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDefinitionEClass, PackageDefinition.class, "PackageDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDefinition_Rules(), this.getCSSRuleDefinition(), null, "rules", null, 0, -1, PackageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDefinition_Subpackages(), this.getPackageDefinition(), null, "subpackages", null, 0, -1, PackageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDefinition_Elements(), this.getElementDeclartion(), null, "elements", null, 0, -1, PackageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dokuEClass, Doku.class, "Doku", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoku_Content(), ecorePackage.getEString(), "content", null, 0, 1, Doku.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleEClass, CSSRule.class, "CSSRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCSSRule_Value(), ecorePackage.getEString(), "value", null, 0, 1, CSSRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementDeclartionEClass, ElementDeclartion.class, "ElementDeclartion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementDeclartion_Doku(), this.getDoku(), null, "doku", null, 0, 1, ElementDeclartion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementDeclartion_Name(), ecorePackage.getEString(), "name", null, 0, 1, ElementDeclartion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementDeclartion_Properties(), this.getPropertyDefinition(), null, "properties", null, 0, -1, ElementDeclartion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementDeclartion_PseudoClasses(), this.getPseudoClassDefinition(), null, "pseudoClasses", null, 0, -1, ElementDeclartion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyDefinitionEClass, PropertyDefinition.class, "PropertyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyDefinition_Doku(), this.getDoku(), null, "doku", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyDefinition_Rule(), this.getCSSRule(), null, "rule", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyDefinition_Default(), this.getCSSDefaultValue(), null, "default", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pseudoClassDefinitionEClass, PseudoClassDefinition.class, "PseudoClassDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPseudoClassDefinition_Doku(), this.getDoku(), null, "doku", null, 0, 1, PseudoClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPseudoClassDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, PseudoClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleIdEClass, CSSRuleId.class, "CSSRuleId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCSSRuleId_Name(), ecorePackage.getEString(), "name", null, 0, 1, CSSRuleId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleRefEClass, CSSRuleRef.class, "CSSRuleRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRuleRef_Ref(), this.getCSSRuleId(), null, "ref", null, 0, 1, CSSRuleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleDefinitionEClass, CSSRuleDefinition.class, "CSSRuleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRuleDefinition_Doku(), this.getDoku(), null, "doku", null, 0, 1, CSSRuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCSSRuleDefinition_Name(), this.getCSSRuleId(), null, "name", null, 0, 1, CSSRuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCSSRuleDefinition_R(), this.getCSSRule(), null, "r", null, 0, 1, CSSRuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssDefaultValueEClass, CSSDefaultValue.class, "CSSDefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cssRuleOrEClass, CSSRuleOr.class, "CSSRuleOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRuleOr_Ors(), this.getCSSRule(), null, "ors", null, 0, -1, CSSRuleOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleXorEClass, CSSRuleXor.class, "CSSRuleXor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRuleXor_Xors(), this.getCSSRule(), null, "xors", null, 0, -1, CSSRuleXor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleConcatEClass, CSSRuleConcat.class, "CSSRuleConcat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRuleConcat_Conc(), this.getCSSRule(), null, "conc", null, 0, -1, CSSRuleConcat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRulePostfixEClass, CSSRulePostfix.class, "CSSRulePostfix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRulePostfix_Rule(), this.getCSSRule(), null, "rule", null, 0, 1, CSSRulePostfix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCSSRulePostfix_Cardinality(), ecorePackage.getEString(), "cardinality", null, 0, 1, CSSRulePostfix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleBracketEClass, CSSRuleBracket.class, "CSSRuleBracket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRuleBracket_Inner(), this.getCSSRule(), null, "inner", null, 0, 1, CSSRuleBracket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleLiteralEClass, CSSRuleLiteral.class, "CSSRuleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //CssExtDslPackageImpl
