/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.CssToBin;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.FileSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Css To Bin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.CssToBinImpl#getOutdir <em>Outdir</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.CssToBinImpl#getFileset <em>Fileset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CssToBinImpl extends EObjectImpl implements CssToBin {
	/**
	 * The default value of the '{@link #getOutdir() <em>Outdir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutdir()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTDIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutdir() <em>Outdir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutdir()
	 * @generated
	 * @ordered
	 */
	protected String outdir = OUTDIR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFileset() <em>Fileset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileset()
	 * @generated
	 * @ordered
	 */
	protected EList<FileSet> fileset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CssToBinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntTasksPackage.Literals.CSS_TO_BIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutdir() {
		return outdir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutdir(String newOutdir) {
		String oldOutdir = outdir;
		outdir = newOutdir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.CSS_TO_BIN__OUTDIR, oldOutdir, outdir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileSet> getFileset() {
		if (fileset == null) {
			fileset = new EObjectContainmentEList<FileSet>(FileSet.class, this, AntTasksPackage.CSS_TO_BIN__FILESET);
		}
		return fileset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AntTasksPackage.CSS_TO_BIN__FILESET:
				return ((InternalEList<?>)getFileset()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AntTasksPackage.CSS_TO_BIN__OUTDIR:
				return getOutdir();
			case AntTasksPackage.CSS_TO_BIN__FILESET:
				return getFileset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AntTasksPackage.CSS_TO_BIN__OUTDIR:
				setOutdir((String)newValue);
				return;
			case AntTasksPackage.CSS_TO_BIN__FILESET:
				getFileset().clear();
				getFileset().addAll((Collection<? extends FileSet>)newValue);
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
			case AntTasksPackage.CSS_TO_BIN__OUTDIR:
				setOutdir(OUTDIR_EDEFAULT);
				return;
			case AntTasksPackage.CSS_TO_BIN__FILESET:
				getFileset().clear();
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
			case AntTasksPackage.CSS_TO_BIN__OUTDIR:
				return OUTDIR_EDEFAULT == null ? outdir != null : !OUTDIR_EDEFAULT.equals(outdir);
			case AntTasksPackage.CSS_TO_BIN__FILESET:
				return fileset != null && !fileset.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (outdir: ");
		result.append(outdir);
		result.append(')');
		return result.toString();
	}

} //CssToBinImpl
