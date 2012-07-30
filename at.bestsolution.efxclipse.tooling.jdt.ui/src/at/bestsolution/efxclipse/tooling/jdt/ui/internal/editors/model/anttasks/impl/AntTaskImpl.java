/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.CssToBin;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ant Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl#getCssToBin <em>Css To Bin</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl#getDeploy <em>Deploy</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl#getJar <em>Jar</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl#getSignjar <em>Signjar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AntTaskImpl extends EObjectImpl implements AntTask {
	/**
	 * The cached value of the '{@link #getCssToBin() <em>Css To Bin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCssToBin()
	 * @generated
	 * @ordered
	 */
	protected CssToBin cssToBin;

	/**
	 * The cached value of the '{@link #getDeploy() <em>Deploy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploy()
	 * @generated
	 * @ordered
	 */
	protected Deploy deploy;

	/**
	 * The cached value of the '{@link #getJar() <em>Jar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJar()
	 * @generated
	 * @ordered
	 */
	protected Jar jar;

	/**
	 * The cached value of the '{@link #getSignjar() <em>Signjar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignjar()
	 * @generated
	 * @ordered
	 */
	protected SignJar signjar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AntTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntTasksPackage.Literals.ANT_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CssToBin getCssToBin() {
		if (cssToBin != null && cssToBin.eIsProxy()) {
			InternalEObject oldCssToBin = (InternalEObject)cssToBin;
			cssToBin = (CssToBin)eResolveProxy(oldCssToBin);
			if (cssToBin != oldCssToBin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AntTasksPackage.ANT_TASK__CSS_TO_BIN, oldCssToBin, cssToBin));
			}
		}
		return cssToBin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CssToBin basicGetCssToBin() {
		return cssToBin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCssToBin(CssToBin newCssToBin) {
		CssToBin oldCssToBin = cssToBin;
		cssToBin = newCssToBin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.ANT_TASK__CSS_TO_BIN, oldCssToBin, cssToBin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deploy getDeploy() {
		if (deploy != null && deploy.eIsProxy()) {
			InternalEObject oldDeploy = (InternalEObject)deploy;
			deploy = (Deploy)eResolveProxy(oldDeploy);
			if (deploy != oldDeploy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AntTasksPackage.ANT_TASK__DEPLOY, oldDeploy, deploy));
			}
		}
		return deploy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deploy basicGetDeploy() {
		return deploy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploy(Deploy newDeploy) {
		Deploy oldDeploy = deploy;
		deploy = newDeploy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.ANT_TASK__DEPLOY, oldDeploy, deploy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jar getJar() {
		if (jar != null && jar.eIsProxy()) {
			InternalEObject oldJar = (InternalEObject)jar;
			jar = (Jar)eResolveProxy(oldJar);
			if (jar != oldJar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AntTasksPackage.ANT_TASK__JAR, oldJar, jar));
			}
		}
		return jar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jar basicGetJar() {
		return jar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJar(Jar newJar) {
		Jar oldJar = jar;
		jar = newJar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.ANT_TASK__JAR, oldJar, jar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignJar getSignjar() {
		if (signjar != null && signjar.eIsProxy()) {
			InternalEObject oldSignjar = (InternalEObject)signjar;
			signjar = (SignJar)eResolveProxy(oldSignjar);
			if (signjar != oldSignjar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AntTasksPackage.ANT_TASK__SIGNJAR, oldSignjar, signjar));
			}
		}
		return signjar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignJar basicGetSignjar() {
		return signjar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignjar(SignJar newSignjar) {
		SignJar oldSignjar = signjar;
		signjar = newSignjar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.ANT_TASK__SIGNJAR, oldSignjar, signjar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AntTasksPackage.ANT_TASK__CSS_TO_BIN:
				if (resolve) return getCssToBin();
				return basicGetCssToBin();
			case AntTasksPackage.ANT_TASK__DEPLOY:
				if (resolve) return getDeploy();
				return basicGetDeploy();
			case AntTasksPackage.ANT_TASK__JAR:
				if (resolve) return getJar();
				return basicGetJar();
			case AntTasksPackage.ANT_TASK__SIGNJAR:
				if (resolve) return getSignjar();
				return basicGetSignjar();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AntTasksPackage.ANT_TASK__CSS_TO_BIN:
				setCssToBin((CssToBin)newValue);
				return;
			case AntTasksPackage.ANT_TASK__DEPLOY:
				setDeploy((Deploy)newValue);
				return;
			case AntTasksPackage.ANT_TASK__JAR:
				setJar((Jar)newValue);
				return;
			case AntTasksPackage.ANT_TASK__SIGNJAR:
				setSignjar((SignJar)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case AntTasksPackage.ANT_TASK__CSS_TO_BIN:
				setCssToBin((CssToBin)null);
				return;
			case AntTasksPackage.ANT_TASK__DEPLOY:
				setDeploy((Deploy)null);
				return;
			case AntTasksPackage.ANT_TASK__JAR:
				setJar((Jar)null);
				return;
			case AntTasksPackage.ANT_TASK__SIGNJAR:
				setSignjar((SignJar)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AntTasksPackage.ANT_TASK__CSS_TO_BIN:
				return cssToBin != null;
			case AntTasksPackage.ANT_TASK__DEPLOY:
				return deploy != null;
			case AntTasksPackage.ANT_TASK__JAR:
				return jar != null;
			case AntTasksPackage.ANT_TASK__SIGNJAR:
				return signjar != null;
		}
		return super.eIsSet(featureID);
	}

} //AntTaskImpl
