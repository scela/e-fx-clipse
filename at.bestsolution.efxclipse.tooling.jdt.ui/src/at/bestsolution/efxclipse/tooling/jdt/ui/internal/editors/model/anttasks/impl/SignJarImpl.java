/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.FileSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sign Jar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl#getDestdir <em>Destdir</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl#getKeypass <em>Keypass</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl#getKeystore <em>Keystore</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl#getSourcejar <em>Sourcejar</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl#getStorepass <em>Storepass</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl#getStoretype <em>Storetype</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl#getFileset <em>Fileset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignJarImpl extends EObjectImpl implements SignJar {
	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestdir() <em>Destdir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestdir()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTDIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestdir() <em>Destdir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestdir()
	 * @generated
	 * @ordered
	 */
	protected String destdir = DESTDIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeypass() <em>Keypass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeypass()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYPASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeypass() <em>Keypass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeypass()
	 * @generated
	 * @ordered
	 */
	protected String keypass = KEYPASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeystore() <em>Keystore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystore()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYSTORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeystore() <em>Keystore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystore()
	 * @generated
	 * @ordered
	 */
	protected String keystore = KEYSTORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourcejar() <em>Sourcejar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcejar()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCEJAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourcejar() <em>Sourcejar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcejar()
	 * @generated
	 * @ordered
	 */
	protected String sourcejar = SOURCEJAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorepass() <em>Storepass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorepass()
	 * @generated
	 * @ordered
	 */
	protected static final String STOREPASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorepass() <em>Storepass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorepass()
	 * @generated
	 * @ordered
	 */
	protected String storepass = STOREPASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoretype() <em>Storetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoretype()
	 * @generated
	 * @ordered
	 */
	protected static final String STORETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoretype() <em>Storetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoretype()
	 * @generated
	 * @ordered
	 */
	protected String storetype = STORETYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFileset() <em>Fileset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileset()
	 * @generated
	 * @ordered
	 */
	protected FileSet fileset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignJarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntTasksPackage.Literals.SIGN_JAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.SIGN_JAR__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestdir() {
		return destdir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestdir(String newDestdir) {
		String oldDestdir = destdir;
		destdir = newDestdir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.SIGN_JAR__DESTDIR, oldDestdir, destdir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeypass() {
		return keypass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeypass(String newKeypass) {
		String oldKeypass = keypass;
		keypass = newKeypass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.SIGN_JAR__KEYPASS, oldKeypass, keypass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeystore() {
		return keystore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeystore(String newKeystore) {
		String oldKeystore = keystore;
		keystore = newKeystore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.SIGN_JAR__KEYSTORE, oldKeystore, keystore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourcejar() {
		return sourcejar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcejar(String newSourcejar) {
		String oldSourcejar = sourcejar;
		sourcejar = newSourcejar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.SIGN_JAR__SOURCEJAR, oldSourcejar, sourcejar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStorepass() {
		return storepass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorepass(String newStorepass) {
		String oldStorepass = storepass;
		storepass = newStorepass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.SIGN_JAR__STOREPASS, oldStorepass, storepass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStoretype() {
		return storetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoretype(String newStoretype) {
		String oldStoretype = storetype;
		storetype = newStoretype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.SIGN_JAR__STORETYPE, oldStoretype, storetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSet getFileset() {
		return fileset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileset(FileSet newFileset, NotificationChain msgs) {
		FileSet oldFileset = fileset;
		fileset = newFileset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AntTasksPackage.SIGN_JAR__FILESET, oldFileset, newFileset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileset(FileSet newFileset) {
		if (newFileset != fileset) {
			NotificationChain msgs = null;
			if (fileset != null)
				msgs = ((InternalEObject)fileset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.SIGN_JAR__FILESET, null, msgs);
			if (newFileset != null)
				msgs = ((InternalEObject)newFileset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.SIGN_JAR__FILESET, null, msgs);
			msgs = basicSetFileset(newFileset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.SIGN_JAR__FILESET, newFileset, newFileset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AntTasksPackage.SIGN_JAR__FILESET:
				return basicSetFileset(null, msgs);
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
			case AntTasksPackage.SIGN_JAR__ALIAS:
				return getAlias();
			case AntTasksPackage.SIGN_JAR__DESTDIR:
				return getDestdir();
			case AntTasksPackage.SIGN_JAR__KEYPASS:
				return getKeypass();
			case AntTasksPackage.SIGN_JAR__KEYSTORE:
				return getKeystore();
			case AntTasksPackage.SIGN_JAR__SOURCEJAR:
				return getSourcejar();
			case AntTasksPackage.SIGN_JAR__STOREPASS:
				return getStorepass();
			case AntTasksPackage.SIGN_JAR__STORETYPE:
				return getStoretype();
			case AntTasksPackage.SIGN_JAR__FILESET:
				return getFileset();
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
			case AntTasksPackage.SIGN_JAR__ALIAS:
				setAlias((String)newValue);
				return;
			case AntTasksPackage.SIGN_JAR__DESTDIR:
				setDestdir((String)newValue);
				return;
			case AntTasksPackage.SIGN_JAR__KEYPASS:
				setKeypass((String)newValue);
				return;
			case AntTasksPackage.SIGN_JAR__KEYSTORE:
				setKeystore((String)newValue);
				return;
			case AntTasksPackage.SIGN_JAR__SOURCEJAR:
				setSourcejar((String)newValue);
				return;
			case AntTasksPackage.SIGN_JAR__STOREPASS:
				setStorepass((String)newValue);
				return;
			case AntTasksPackage.SIGN_JAR__STORETYPE:
				setStoretype((String)newValue);
				return;
			case AntTasksPackage.SIGN_JAR__FILESET:
				setFileset((FileSet)newValue);
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
			case AntTasksPackage.SIGN_JAR__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case AntTasksPackage.SIGN_JAR__DESTDIR:
				setDestdir(DESTDIR_EDEFAULT);
				return;
			case AntTasksPackage.SIGN_JAR__KEYPASS:
				setKeypass(KEYPASS_EDEFAULT);
				return;
			case AntTasksPackage.SIGN_JAR__KEYSTORE:
				setKeystore(KEYSTORE_EDEFAULT);
				return;
			case AntTasksPackage.SIGN_JAR__SOURCEJAR:
				setSourcejar(SOURCEJAR_EDEFAULT);
				return;
			case AntTasksPackage.SIGN_JAR__STOREPASS:
				setStorepass(STOREPASS_EDEFAULT);
				return;
			case AntTasksPackage.SIGN_JAR__STORETYPE:
				setStoretype(STORETYPE_EDEFAULT);
				return;
			case AntTasksPackage.SIGN_JAR__FILESET:
				setFileset((FileSet)null);
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
			case AntTasksPackage.SIGN_JAR__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case AntTasksPackage.SIGN_JAR__DESTDIR:
				return DESTDIR_EDEFAULT == null ? destdir != null : !DESTDIR_EDEFAULT.equals(destdir);
			case AntTasksPackage.SIGN_JAR__KEYPASS:
				return KEYPASS_EDEFAULT == null ? keypass != null : !KEYPASS_EDEFAULT.equals(keypass);
			case AntTasksPackage.SIGN_JAR__KEYSTORE:
				return KEYSTORE_EDEFAULT == null ? keystore != null : !KEYSTORE_EDEFAULT.equals(keystore);
			case AntTasksPackage.SIGN_JAR__SOURCEJAR:
				return SOURCEJAR_EDEFAULT == null ? sourcejar != null : !SOURCEJAR_EDEFAULT.equals(sourcejar);
			case AntTasksPackage.SIGN_JAR__STOREPASS:
				return STOREPASS_EDEFAULT == null ? storepass != null : !STOREPASS_EDEFAULT.equals(storepass);
			case AntTasksPackage.SIGN_JAR__STORETYPE:
				return STORETYPE_EDEFAULT == null ? storetype != null : !STORETYPE_EDEFAULT.equals(storetype);
			case AntTasksPackage.SIGN_JAR__FILESET:
				return fileset != null;
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
		result.append(" (alias: ");
		result.append(alias);
		result.append(", destdir: ");
		result.append(destdir);
		result.append(", keypass: ");
		result.append(keypass);
		result.append(", keystore: ");
		result.append(keystore);
		result.append(", sourcejar: ");
		result.append(sourcejar);
		result.append(", storepass: ");
		result.append(storepass);
		result.append(", storetype: ");
		result.append(storetype);
		result.append(')');
		return result.toString();
	}

} //SignJarImpl
