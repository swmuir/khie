/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base64Binary;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Instant;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SignatureImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SignatureImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SignatureImpl#getWhox <em>Whox</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SignatureImpl#getOnBehalfOfx <em>On Behalf Ofx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SignatureImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SignatureImpl#getBlob <em>Blob</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignatureImpl extends DataTypeImpl implements Signature {
	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> types;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected Instant when;

	/**
	 * The cached value of the '{@link #getWhox() <em>Whox</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhox()
	 * @generated
	 * @ordered
	 */
	protected Base whox;

	/**
	 * The cached value of the '{@link #getOnBehalfOfx() <em>On Behalf Ofx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBehalfOfx()
	 * @generated
	 * @ordered
	 */
	protected Base onBehalfOfx;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected Code contentType;

	/**
	 * The cached value of the '{@link #getBlob() <em>Blob</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlob()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary blob;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<Coding>(Coding.class, this, DataTypesPackage.SIGNATURE__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getWhen() {
		if (when != null && when.eIsProxy()) {
			InternalEObject oldWhen = (InternalEObject)when;
			when = (Instant)eResolveProxy(oldWhen);
			if (when != oldWhen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.SIGNATURE__WHEN, oldWhen, when));
			}
		}
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(Instant newWhen) {
		Instant oldWhen = when;
		when = newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SIGNATURE__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getWhox() {
		if (whox != null && whox.eIsProxy()) {
			InternalEObject oldWhox = (InternalEObject)whox;
			whox = (Base)eResolveProxy(oldWhox);
			if (whox != oldWhox) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.SIGNATURE__WHOX, oldWhox, whox));
			}
		}
		return whox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetWhox() {
		return whox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhox(Base newWhox) {
		Base oldWhox = whox;
		whox = newWhox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SIGNATURE__WHOX, oldWhox, whox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getOnBehalfOfx() {
		if (onBehalfOfx != null && onBehalfOfx.eIsProxy()) {
			InternalEObject oldOnBehalfOfx = (InternalEObject)onBehalfOfx;
			onBehalfOfx = (Base)eResolveProxy(oldOnBehalfOfx);
			if (onBehalfOfx != oldOnBehalfOfx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.SIGNATURE__ON_BEHALF_OFX, oldOnBehalfOfx, onBehalfOfx));
			}
		}
		return onBehalfOfx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetOnBehalfOfx() {
		return onBehalfOfx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnBehalfOfx(Base newOnBehalfOfx) {
		Base oldOnBehalfOfx = onBehalfOfx;
		onBehalfOfx = newOnBehalfOfx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SIGNATURE__ON_BEHALF_OFX, oldOnBehalfOfx, onBehalfOfx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getContentType() {
		if (contentType != null && contentType.eIsProxy()) {
			InternalEObject oldContentType = (InternalEObject)contentType;
			contentType = (Code)eResolveProxy(oldContentType);
			if (contentType != oldContentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.SIGNATURE__CONTENT_TYPE, oldContentType, contentType));
			}
		}
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(Code newContentType) {
		Code oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SIGNATURE__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getBlob() {
		if (blob != null && blob.eIsProxy()) {
			InternalEObject oldBlob = (InternalEObject)blob;
			blob = (Base64Binary)eResolveProxy(oldBlob);
			if (blob != oldBlob) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.SIGNATURE__BLOB, oldBlob, blob));
			}
		}
		return blob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary basicGetBlob() {
		return blob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlob(Base64Binary newBlob) {
		Base64Binary oldBlob = blob;
		blob = newBlob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SIGNATURE__BLOB, oldBlob, blob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.SIGNATURE__TYPE:
				return getTypes();
			case DataTypesPackage.SIGNATURE__WHEN:
				if (resolve) return getWhen();
				return basicGetWhen();
			case DataTypesPackage.SIGNATURE__WHOX:
				if (resolve) return getWhox();
				return basicGetWhox();
			case DataTypesPackage.SIGNATURE__ON_BEHALF_OFX:
				if (resolve) return getOnBehalfOfx();
				return basicGetOnBehalfOfx();
			case DataTypesPackage.SIGNATURE__CONTENT_TYPE:
				if (resolve) return getContentType();
				return basicGetContentType();
			case DataTypesPackage.SIGNATURE__BLOB:
				if (resolve) return getBlob();
				return basicGetBlob();
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
			case DataTypesPackage.SIGNATURE__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Coding>)newValue);
				return;
			case DataTypesPackage.SIGNATURE__WHEN:
				setWhen((Instant)newValue);
				return;
			case DataTypesPackage.SIGNATURE__WHOX:
				setWhox((Base)newValue);
				return;
			case DataTypesPackage.SIGNATURE__ON_BEHALF_OFX:
				setOnBehalfOfx((Base)newValue);
				return;
			case DataTypesPackage.SIGNATURE__CONTENT_TYPE:
				setContentType((Code)newValue);
				return;
			case DataTypesPackage.SIGNATURE__BLOB:
				setBlob((Base64Binary)newValue);
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
			case DataTypesPackage.SIGNATURE__TYPE:
				getTypes().clear();
				return;
			case DataTypesPackage.SIGNATURE__WHEN:
				setWhen((Instant)null);
				return;
			case DataTypesPackage.SIGNATURE__WHOX:
				setWhox((Base)null);
				return;
			case DataTypesPackage.SIGNATURE__ON_BEHALF_OFX:
				setOnBehalfOfx((Base)null);
				return;
			case DataTypesPackage.SIGNATURE__CONTENT_TYPE:
				setContentType((Code)null);
				return;
			case DataTypesPackage.SIGNATURE__BLOB:
				setBlob((Base64Binary)null);
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
			case DataTypesPackage.SIGNATURE__TYPE:
				return types != null && !types.isEmpty();
			case DataTypesPackage.SIGNATURE__WHEN:
				return when != null;
			case DataTypesPackage.SIGNATURE__WHOX:
				return whox != null;
			case DataTypesPackage.SIGNATURE__ON_BEHALF_OFX:
				return onBehalfOfx != null;
			case DataTypesPackage.SIGNATURE__CONTENT_TYPE:
				return contentType != null;
			case DataTypesPackage.SIGNATURE__BLOB:
				return blob != null;
		}
		return super.eIsSet(featureID);
	}

} //SignatureImpl
