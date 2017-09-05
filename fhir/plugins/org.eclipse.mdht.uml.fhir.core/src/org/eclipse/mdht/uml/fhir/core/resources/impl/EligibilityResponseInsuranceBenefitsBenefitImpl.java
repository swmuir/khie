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
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponseInsuranceBenefitsBenefit;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eligibility Response Insurance Benefits Benefit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseInsuranceBenefitsBenefitImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseInsuranceBenefitsBenefitImpl#getBenefitx <em>Benefitx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseInsuranceBenefitsBenefitImpl#getBenefitUsedx <em>Benefit Usedx</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EligibilityResponseInsuranceBenefitsBenefitImpl extends BackboneElementImpl implements EligibilityResponseInsuranceBenefitsBenefit {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getBenefitx() <em>Benefitx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitx()
	 * @generated
	 * @ordered
	 */
	protected DataType benefitx;

	/**
	 * The cached value of the '{@link #getBenefitUsedx() <em>Benefit Usedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitUsedx()
	 * @generated
	 * @ordered
	 */
	protected DataType benefitUsedx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EligibilityResponseInsuranceBenefitsBenefitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEligibilityResponseInsuranceBenefitsBenefit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CodeableConcept)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getBenefitx() {
		if (benefitx != null && benefitx.eIsProxy()) {
			InternalEObject oldBenefitx = (InternalEObject)benefitx;
			benefitx = (DataType)eResolveProxy(oldBenefitx);
			if (benefitx != oldBenefitx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__BENEFITX, oldBenefitx, benefitx));
			}
		}
		return benefitx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetBenefitx() {
		return benefitx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitx(DataType newBenefitx) {
		DataType oldBenefitx = benefitx;
		benefitx = newBenefitx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__BENEFITX, oldBenefitx, benefitx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getBenefitUsedx() {
		if (benefitUsedx != null && benefitUsedx.eIsProxy()) {
			InternalEObject oldBenefitUsedx = (InternalEObject)benefitUsedx;
			benefitUsedx = (DataType)eResolveProxy(oldBenefitUsedx);
			if (benefitUsedx != oldBenefitUsedx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__BENEFIT_USEDX, oldBenefitUsedx, benefitUsedx));
			}
		}
		return benefitUsedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetBenefitUsedx() {
		return benefitUsedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitUsedx(DataType newBenefitUsedx) {
		DataType oldBenefitUsedx = benefitUsedx;
		benefitUsedx = newBenefitUsedx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__BENEFIT_USEDX, oldBenefitUsedx, benefitUsedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__BENEFITX:
				if (resolve) return getBenefitx();
				return basicGetBenefitx();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__BENEFIT_USEDX:
				if (resolve) return getBenefitUsedx();
				return basicGetBenefitUsedx();
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
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__BENEFITX:
				setBenefitx((DataType)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__BENEFIT_USEDX:
				setBenefitUsedx((DataType)newValue);
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
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__BENEFITX:
				setBenefitx((DataType)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__BENEFIT_USEDX:
				setBenefitUsedx((DataType)null);
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
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__TYPE:
				return type != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__BENEFITX:
				return benefitx != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT__BENEFIT_USEDX:
				return benefitUsedx != null;
		}
		return super.eIsSet(featureID);
	}

} //EligibilityResponseInsuranceBenefitsBenefitImpl
