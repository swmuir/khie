/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.Contract;
import org.eclipse.mdht.uml.fhir.core.resources.Coverage;
import org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponseInsurance;
import org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponseInsuranceBenefits;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eligibility Response Insurance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseInsuranceImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseInsuranceImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseInsuranceImpl#getBenefitBalances <em>Benefit Balance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EligibilityResponseInsuranceImpl extends BackboneElementImpl implements EligibilityResponseInsurance {
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
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected Contract contract;

	/**
	 * The cached value of the '{@link #getBenefitBalances() <em>Benefit Balance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitBalances()
	 * @generated
	 * @ordered
	 */
	protected EList<EligibilityResponseInsuranceBenefits> benefitBalances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EligibilityResponseInsuranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEligibilityResponseInsurance();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE, oldCoverage, coverage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE, oldCoverage, coverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract getContract() {
		if (contract != null && contract.eIsProxy()) {
			InternalEObject oldContract = (InternalEObject)contract;
			contract = (Contract)eResolveProxy(oldContract);
			if (contract != oldContract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__CONTRACT, oldContract, contract));
			}
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract basicGetContract() {
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(Contract newContract) {
		Contract oldContract = contract;
		contract = newContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__CONTRACT, oldContract, contract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EligibilityResponseInsuranceBenefits> getBenefitBalances() {
		if (benefitBalances == null) {
			benefitBalances = new EObjectContainmentEList<EligibilityResponseInsuranceBenefits>(EligibilityResponseInsuranceBenefits.class, this, ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_BALANCE);
		}
		return benefitBalances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_BALANCE:
				return ((InternalEList<?>)getBenefitBalances()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE:
				if (resolve) return getCoverage();
				return basicGetCoverage();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__CONTRACT:
				if (resolve) return getContract();
				return basicGetContract();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_BALANCE:
				return getBenefitBalances();
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
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE:
				setCoverage((Coverage)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__CONTRACT:
				setContract((Contract)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_BALANCE:
				getBenefitBalances().clear();
				getBenefitBalances().addAll((Collection<? extends EligibilityResponseInsuranceBenefits>)newValue);
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
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE:
				setCoverage((Coverage)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__CONTRACT:
				setContract((Contract)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_BALANCE:
				getBenefitBalances().clear();
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
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE:
				return coverage != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__CONTRACT:
				return contract != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_BALANCE:
				return benefitBalances != null && !benefitBalances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EligibilityResponseInsuranceImpl
