/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#isInstall <em>Install</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#isMenu <em>Menu</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#getRefid <em>Refid</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#isShortcut <em>Shortcut</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getPreferences()
 * @model
 * @generated
 */
public interface Preferences extends EObject {
	/**
	 * Returns the value of the '<em><b>Install</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Install</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Install</em>' attribute.
	 * @see #setInstall(boolean)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getPreferences_Install()
	 * @model default="false"
	 * @generated
	 */
	boolean isInstall();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#isInstall <em>Install</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Install</em>' attribute.
	 * @see #isInstall()
	 * @generated
	 */
	void setInstall(boolean value);

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' attribute.
	 * @see #setMenu(boolean)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getPreferences_Menu()
	 * @model default="false"
	 * @generated
	 */
	boolean isMenu();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#isMenu <em>Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' attribute.
	 * @see #isMenu()
	 * @generated
	 */
	void setMenu(boolean value);

	/**
	 * Returns the value of the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refid</em>' attribute.
	 * @see #setRefid(String)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getPreferences_Refid()
	 * @model
	 * @generated
	 */
	String getRefid();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#getRefid <em>Refid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refid</em>' attribute.
	 * @see #getRefid()
	 * @generated
	 */
	void setRefid(String value);

	/**
	 * Returns the value of the '<em><b>Shortcut</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shortcut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shortcut</em>' attribute.
	 * @see #setShortcut(boolean)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getPreferences_Shortcut()
	 * @model default="false"
	 * @generated
	 */
	boolean isShortcut();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#isShortcut <em>Shortcut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shortcut</em>' attribute.
	 * @see #isShortcut()
	 * @generated
	 */
	void setShortcut(boolean value);

} // Preferences
