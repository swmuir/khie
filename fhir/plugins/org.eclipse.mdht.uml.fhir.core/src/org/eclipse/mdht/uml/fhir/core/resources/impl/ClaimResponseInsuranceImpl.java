/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.PositiveInt;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimResponse;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimResponseInsurance;
import org.eclipse.mdht.uml.fhir.core.resources.Coverage;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Insurance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseInsuranceImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseInsuranceImpl#getFocal <em>Focal</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseInsuranceImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseInsuranceImpl#getBusinessArrangement <em>Business Arrangement</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseInsuranceImpl#getPreAuthRefs <em>Pre Auth Ref</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimResponseInsuranceImpl#getClaimResponse <em>Claim Response</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimResponseInsuranceImpl extends BackboneElementImpl implements ClaimResponseInsurance {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getFocal() <em>Focal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocal()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean focal;

	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected Coverage coverage;

	/**
	 * The cached value of the '{@link #getBusinessArrangement() <em>Business Arrangement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessArrangement()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String businessArrangement;

	/**
	 * The cached value of the '{@link #getPreAuthRefs() <em>Pre Auth Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> preAuthRefs;

	/**
	 * The cached value of the '{@link #getClaimResponse() <em>Claim Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimResponse()
	 * @generated
	 * @ordered
	 */
	protected ClaimResponse claimResponse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseInsuranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClaimResponseInsurance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequence() {
		if (sequence != null && sequence.eIsProxy()) {
			InternalEObject oldSequence = (InternalEObject)sequence;
			sequence = (PositiveInt)eResolveProxy(oldSequence);
			if (sequence != oldSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE_INSURANCE__SEQUENCE, oldSequence, sequence));
			}
		}
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_INSURANCE__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getFocal() {
		if (focal != null && focal.eIsProxy()) {
			InternalEObject oldFocal = (InternalEObject)focal;
			focal = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldFocal);
			if (focal != oldFocal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE_INSURANCE__FOCAL, oldFocal, focal));
			}
		}
		return focal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetFocal() {
		return focal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocal(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newFocal) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldFocal = focal;
		focal = newFocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_INSURANCE__FOCAL, oldFocal, focal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage getCoverage() {
		if (coverage != null && coverage.eIsProxy()) {
			InternalEObject oldCoverage = (InternalEObject)coverage;
			coverage = (Coverage)eResolveProxy(oldCoverage);
			if (coverage != oldCoverage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE_INSURANCE__COVERAGE, oldCoverage, coverage));
			}
		}
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage basicGetCoverage() {
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverage(Coverage newCoverage) {
		Coverage oldCoverage = coverage;
		coverage = newCoverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_INSURANCE__COVERAGE, oldCoverage, coverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getBusinessArrangement() {
		if (businessArrangement != null && businessArrangement.eIsProxy()) {
			InternalEObject oldBusinessArrangement = (InternalEObject)businessArrangement;
			businessArrangement = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldBusinessArrangement);
			if (businessArrangement != oldBusinessArrangement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE_INSURANCE__BUSINESS_ARRANGEMENT, oldBusinessArrangement, businessArrangement));
			}
		}
		return businessArrangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetBusinessArrangement() {
		return businessArrangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessArrangement(org.eclipse.mdht.uml.fhir.core.dataTypes.String newBusinessArrangement) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldBusinessArrangement = businessArrangement;
		businessArrangement = newBusinessArrangement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_INSURANCE__BUSINESS_ARRANGEMENT, oldBusinessArrangement, businessArrangement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> getPreAuthRefs() {
		if (preAuthRefs == null) {
			preAuthRefs = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.dataTypes.String>(org.eclipse.mdht.uml.fhir.core.dataTypes.String.class, this, ResourcesPackage.CLAIM_RESPONSE_INSURANCE__PRE_AUTH_REF);
		}
		return preAuthRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse getClaimResponse() {
		if (claimResponse != null && claimResponse.eIsProxy()) {
			InternalEObject oldClaimResponse = (InternalEObject)claimResponse;
			claimResponse = (ClaimResponse)eResolveProxy(oldClaimResponse);
			if (claimResponse != oldClaimResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_RESPONSE_INSURANCE__CLAIM_RESPONSE, oldClaimResponse, claimResponse));
			}
		}
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse basicGetClaimResponse() {
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimResponse(ClaimResponse newClaimResponse) {
		ClaimResponse oldClaimResponse = claimResponse;
		claimResponse = newClaimResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_INSURANCE__CLAIM_RESPONSE, oldClaimResponse, claimResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__SEQUENCE:
				if (resolve) return getSequence();
				return basicGetSequence();
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__FOCAL:
				if (resolve) return getFocal();
				return basicGetFocal();
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__COVERAGE:
				if (resolve) return getCoverage();
				return basicGetCoverage();
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__BUSINESS_ARRANGEMENT:
				if (resolve) return getBusinessArrangement();
				return basicGetBusinessArrangement();
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__PRE_AUTH_REF:
				return getPreAuthRefs();
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__CLAIM_RESPONSE:
				if (resolve) return getClaimResponse();
				return basicGetClaimResponse();
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
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__FOCAL:
				setFocal((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__COVERAGE:
				setCoverage((Coverage)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__BUSINESS_ARRANGEMENT:
				setBusinessArrangement((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__PRE_AUTH_REF:
				getPreAuthRefs().clear();
				getPreAuthRefs().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)newValue);
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
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__FOCAL:
				setFocal((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__COVERAGE:
				setCoverage((Coverage)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__BUSINESS_ARRANGEMENT:
				setBusinessArrangement((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__PRE_AUTH_REF:
				getPreAuthRefs().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)null);
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
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__SEQUENCE:
				return sequence != null;
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__FOCAL:
				return focal != null;
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__COVERAGE:
				return coverage != null;
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__BUSINESS_ARRANGEMENT:
				return businessArrangement != null;
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__PRE_AUTH_REF:
				return preAuthRefs != null && !preAuthRefs.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE__CLAIM_RESPONSE:
				return claimResponse != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseInsuranceImpl
