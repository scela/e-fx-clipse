/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ant Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getCssToBin <em>Css To Bin</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getDeploy <em>Deploy</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getJar <em>Jar</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getSignjar <em>Signjar</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask()
 * @model
 * @generated
 */
public interface AntTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Css To Bin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Css To Bin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Css To Bin</em>' reference.
	 * @see #setCssToBin(CssToBin)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_CssToBin()
	 * @model
	 * @generated
	 */
	CssToBin getCssToBin();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getCssToBin <em>Css To Bin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Css To Bin</em>' reference.
	 * @see #getCssToBin()
	 * @generated
	 */
	void setCssToBin(CssToBin value);

	/**
	 * Returns the value of the '<em><b>Deploy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy</em>' reference.
	 * @see #setDeploy(Deploy)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_Deploy()
	 * @model
	 * @generated
	 */
	Deploy getDeploy();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getDeploy <em>Deploy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy</em>' reference.
	 * @see #getDeploy()
	 * @generated
	 */
	void setDeploy(Deploy value);

	/**
	 * Returns the value of the '<em><b>Jar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jar</em>' reference.
	 * @see #setJar(Jar)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_Jar()
	 * @model
	 * @generated
	 */
	Jar getJar();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getJar <em>Jar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jar</em>' reference.
	 * @see #getJar()
	 * @generated
	 */
	void setJar(Jar value);

	/**
	 * Returns the value of the '<em><b>Signjar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signjar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signjar</em>' reference.
	 * @see #setSignjar(SignJar)
	 * @see at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_Signjar()
	 * @model
	 * @generated
	 */
	SignJar getSignjar();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask#getSignjar <em>Signjar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signjar</em>' reference.
	 * @see #getSignjar()
	 * @generated
	 */
	void setSignjar(SignJar value);

} // AntTask
