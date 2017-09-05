/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.PositiveInt;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimResponseError;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseErrorImpl#getSequenceLinkId <em>Sequence Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseErrorImpl#getDetailSequenceLinkId <em>Detail Sequence Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseErrorImpl#getSubdetailSequenceLinkId <em>Subdetail Sequence Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseErrorImpl#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimResponseErrorImpl extends BackboneElementImpl implements ClaimResponseError {
	/**
	 * The cached value of the '{@link #getSequenceLinkId() <em>Sequence Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceLinkId()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequenceLinkId;

	/**
	 * The cached value of the '{@link #getDetailSequenceLinkId() <em>Detail Sequence Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailSequenceLinkId()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt detailSequenceLinkId;

	/**
	 * The cached value of the '{@link #getSubdetailSequenceLinkId() <em>Subdetail Sequence Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdetailSequenceLinkId()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt subdetailSequenceLinkId;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClaimResponseError();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequenceLinkId() {
		if (sequenceLinkId != null && sequenceLinkId.eIsProxy()) {
			InternalEObject oldSequenceLinkId = (InternalEObject)sequenceLinkId;
			sequenceLinkId = (PositiveInt)eResolveProxy(oldSequenceLinkId);
			if (sequenceLinkId != oldSequenceLinkId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE_ERROR__SEQUENCE_LINK_ID, oldSequenceLinkId, sequenceLinkId));
			}
		}
		return sequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetSequenceLinkId() {
		return sequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceLinkId(PositiveInt newSequenceLinkId) {
		PositiveInt oldSequenceLinkId = sequenceLinkId;
		sequenceLinkId = newSequenceLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ERROR__SEQUENCE_LINK_ID, oldSequenceLinkId, sequenceLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getDetailSequenceLinkId() {
		if (detailSequenceLinkId != null && detailSequenceLinkId.eIsProxy()) {
			InternalEObject oldDetailSequenceLinkId = (InternalEObject)detailSequenceLinkId;
			detailSequenceLinkId = (PositiveInt)eResolveProxy(oldDetailSequenceLinkId);
			if (detailSequenceLinkId != oldDetailSequenceLinkId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE_LINK_ID, oldDetailSequenceLinkId, detailSequenceLinkId));
			}
		}
		return detailSequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetDetailSequenceLinkId() {
		return detailSequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailSequenceLinkId(PositiveInt newDetailSequenceLinkId) {
		PositiveInt oldDetailSequenceLinkId = detailSequenceLinkId;
		detailSequenceLinkId = newDetailSequenceLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE_LINK_ID, oldDetailSequenceLinkId, detailSequenceLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSubdetailSequenceLinkId() {
		if (subdetailSequenceLinkId != null && subdetailSequenceLinkId.eIsProxy()) {
			InternalEObject oldSubdetailSequenceLinkId = (InternalEObject)subdetailSequenceLinkId;
			subdetailSequenceLinkId = (PositiveInt)eResolveProxy(oldSubdetailSequenceLinkId);
			if (subdetailSequenceLinkId != oldSubdetailSequenceLinkId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE_ERROR__SUBDETAIL_SEQUENCE_LINK_ID, oldSubdetailSequenceLinkId, subdetailSequenceLinkId));
			}
		}
		return subdetailSequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetSubdetailSequenceLinkId() {
		return subdetailSequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubdetailSequenceLinkId(PositiveInt newSubdetailSequenceLinkId) {
		PositiveInt oldSubdetailSequenceLinkId = subdetailSequenceLinkId;
		subdetailSequenceLinkId = newSubdetailSequenceLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ERROR__SUBDETAIL_SEQUENCE_LINK_ID, oldSubdetailSequenceLinkId, subdetailSequenceLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (CodeableConcept)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE_ERROR__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ERROR__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__SEQUENCE_LINK_ID:
				if (resolve) return getSequenceLinkId();
				return basicGetSequenceLinkId();
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE_LINK_ID:
				if (resolve) return getDetailSequenceLinkId();
				return basicGetDetailSequenceLinkId();
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__SUBDETAIL_SEQUENCE_LINK_ID:
				if (resolve) return getSubdetailSequenceLinkId();
				return basicGetSubdetailSequenceLinkId();
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__CODE:
				if (resolve) return getCode();
				return basicGetCode();
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
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__SEQUENCE_LINK_ID:
				setSequenceLinkId((PositiveInt)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE_LINK_ID:
				setDetailSequenceLinkId((PositiveInt)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__SUBDETAIL_SEQUENCE_LINK_ID:
				setSubdetailSequenceLinkId((PositiveInt)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__CODE:
				setCode((CodeableConcept)newValue);
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
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__SEQUENCE_LINK_ID:
				setSequenceLinkId((PositiveInt)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE_LINK_ID:
				setDetailSequenceLinkId((PositiveInt)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__SUBDETAIL_SEQUENCE_LINK_ID:
				setSubdetailSequenceLinkId((PositiveInt)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__CODE:
				setCode((CodeableConcept)null);
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
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__SEQUENCE_LINK_ID:
				return sequenceLinkId != null;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE_LINK_ID:
				return detailSequenceLinkId != null;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__SUBDETAIL_SEQUENCE_LINK_ID:
				return subdetailSequenceLinkId != null;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__CODE:
				return code != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseErrorImpl
